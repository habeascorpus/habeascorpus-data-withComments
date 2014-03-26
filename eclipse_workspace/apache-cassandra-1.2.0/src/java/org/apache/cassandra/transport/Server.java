/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.cassandra.transport;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.EnumMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.*;
import org.jboss.netty.channel.group.ChannelGroup;
import org.jboss.netty.channel.group.DefaultChannelGroup;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.execution.ExecutionHandler;
import org.jboss.netty.logging.InternalLoggerFactory;
import org.jboss.netty.logging.Slf4JLoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.cassandra.service.CassandraDaemon;
import org.apache.cassandra.service.IMigrationListener;
import org.apache.cassandra.service.MigrationManager;
import org.apache.cassandra.service.IEndpointLifecycleSubscriber;
import org.apache.cassandra.service.StorageService;
import org.apache.cassandra.transport.messages.EventMessage;

public class Server implements CassandraDaemon.Server
{
    static
    {
        InternalLoggerFactory.setDefaultFactory(new Slf4JLoggerFactory());
    }

    private static final Logger logger = LoggerFactory.getLogger(Server.class);

    private final ConnectionTracker connectionTracker = new ConnectionTracker();

    public final InetSocketAddress socket;
    private final AtomicBoolean isRunning = new AtomicBoolean(false);

    private ChannelFactory factory;
    private ExecutionHandler executionHandler;

    public Server(InetSocketAddress socket)
    {
        this.socket = socket;
        EventNotifier notifier = new EventNotifier(this);
        StorageService.instance.register(notifier);
        MigrationManager.instance.register(notifier);
    }

    public Server(String hostname, int port)
    {
        this(new InetSocketAddress(hostname, port));
    }

    public Server(InetAddress host, int port)
    {
        this(new InetSocketAddress(host, port));
    }

    public Server(int port)
    {
        this(new InetSocketAddress(port));
    }

    public void start()
    {
        if (isRunning.compareAndSet(false, true))
            run();
    }

    public void stop()
    {
        if (isRunning.compareAndSet(true, false))
            close();
    }

    public boolean isRunning()
    {
        return isRunning.get();
    }

    public void run()
    {
        // Configure the server.
        executionHandler = new ExecutionHandler(new RequestThreadPoolExecutor());
        factory = new NioServerSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool());
        ServerBootstrap bootstrap = new ServerBootstrap(factory);

        bootstrap.setOption("child.tcpNoDelay", true);

        // Set up the event pipeline factory.
        bootstrap.setPipelineFactory(new PipelineFactory(this));

        // Bind and start to accept incoming connections.
        logger.info("Starting listening for CQL clients on " + socket + "...");
        Channel channel = bootstrap.bind(socket);
        connectionTracker.allChannels.add(channel);
    }

    public void close()
    {
        // Close opened connections
        connectionTracker.closeAll();
        factory.releaseExternalResources();
        factory = null;
        executionHandler.releaseExternalResources();
        executionHandler = null;
    }

    public static class ConnectionTracker implements Connection.Tracker
    {
        public final ChannelGroup allChannels = new DefaultChannelGroup();
        private final EnumMap<Event.Type, ChannelGroup> groups = new EnumMap<Event.Type, ChannelGroup>(Event.Type.class);

        public ConnectionTracker()
        {
            for (Event.Type type : Event.Type.values())
                groups.put(type, new DefaultChannelGroup(type.toString()));
        }

        public void addConnection(Channel ch, Connection connection)
        {
            allChannels.add(ch);
        }

        public void register(Event.Type type, Channel ch)
        {
            groups.get(type).add(ch);
        }

        public void unregister(Channel ch)
        {
            for (ChannelGroup group : groups.values())
                group.remove(ch);
        }

        public void send(Event event)
        {
            groups.get(event.type).write(new EventMessage(event));
        }

        public void closeAll()
        {
            allChannels.close().awaitUninterruptibly();
        }
    }

    private static class PipelineFactory implements ChannelPipelineFactory
    {
        // Stateless handlers
        private static final Message.ProtocolDecoder messageDecoder = new Message.ProtocolDecoder();
        private static final Message.ProtocolEncoder messageEncoder = new Message.ProtocolEncoder();
        private static final Frame.Decompressor frameDecompressor = new Frame.Decompressor();
        private static final Frame.Compressor frameCompressor = new Frame.Compressor();
        private static final Frame.Encoder frameEncoder = new Frame.Encoder();
        private static final Message.Dispatcher dispatcher = new Message.Dispatcher();

        private final Server server;

        public PipelineFactory(Server server)
        {
            this.server = server;
        }

        public ChannelPipeline getPipeline() throws Exception
        {
            ChannelPipeline pipeline = Channels.pipeline();

            //pipeline.addLast("debug", new LoggingHandler());

            pipeline.addLast("frameDecoder", new Frame.Decoder(server.connectionTracker, ServerConnection.FACTORY));
            pipeline.addLast("frameEncoder", frameEncoder);

            pipeline.addLast("frameDecompressor", frameDecompressor);
            pipeline.addLast("frameCompressor", frameCompressor);

            pipeline.addLast("messageDecoder", messageDecoder);
            pipeline.addLast("messageEncoder", messageEncoder);

            pipeline.addLast("executor", server.executionHandler);

            pipeline.addLast("dispatcher", dispatcher);

            return pipeline;
      }
    }

    private static class EventNotifier implements IEndpointLifecycleSubscriber, IMigrationListener
    {
        private final Server server;

        private EventNotifier(Server server)
        {
            this.server = server;
        }

        private InetAddress getRpcAddress(InetAddress endpoint)
        {
            try
            {
                return InetAddress.getByName(StorageService.instance.getRpcaddress(endpoint));
            }
            catch (UnknownHostException e)
            {
                // That should not happen, so log an error, but return the
                // endpoint address since there's a good change this is right
                logger.error("Problem retrieving RPC address for " + endpoint, e);
                return endpoint;
            }
        }

        public void onJoinCluster(InetAddress endpoint)
        {
            server.connectionTracker.send(Event.TopologyChange.newNode(getRpcAddress(endpoint), server.socket.getPort()));
        }

        public void onLeaveCluster(InetAddress endpoint)
        {
            server.connectionTracker.send(Event.TopologyChange.removedNode(getRpcAddress(endpoint), server.socket.getPort()));
        }

        public void onMove(InetAddress endpoint)
        {
            server.connectionTracker.send(Event.TopologyChange.movedNode(getRpcAddress(endpoint), server.socket.getPort()));
        }

        public void onUp(InetAddress endpoint)
        {
            server.connectionTracker.send(Event.StatusChange.nodeUp(getRpcAddress(endpoint), server.socket.getPort()));
        }

        public void onDown(InetAddress endpoint)
        {
            server.connectionTracker.send(Event.StatusChange.nodeDown(getRpcAddress(endpoint), server.socket.getPort()));
        }

        public void onCreateKeyspace(String ksName)
        {
            server.connectionTracker.send(new Event.SchemaChange(Event.SchemaChange.Change.CREATED, ksName));
        }

        public void onCreateColumnFamly(String ksName, String cfName)
        {
            server.connectionTracker.send(new Event.SchemaChange(Event.SchemaChange.Change.CREATED, ksName, cfName));
        }

        public void onUpdateKeyspace(String ksName)
        {
            server.connectionTracker.send(new Event.SchemaChange(Event.SchemaChange.Change.UPDATED, ksName));
        }

        public void onUpdateColumnFamly(String ksName, String cfName)
        {
            server.connectionTracker.send(new Event.SchemaChange(Event.SchemaChange.Change.UPDATED, ksName, cfName));
        }

        public void onDropKeyspace(String ksName)
        {
            server.connectionTracker.send(new Event.SchemaChange(Event.SchemaChange.Change.DROPPED, ksName));
        }

        public void onDropColumnFamly(String ksName, String cfName)
        {
            server.connectionTracker.send(new Event.SchemaChange(Event.SchemaChange.Change.DROPPED, ksName, cfName));
        }
    }
}
