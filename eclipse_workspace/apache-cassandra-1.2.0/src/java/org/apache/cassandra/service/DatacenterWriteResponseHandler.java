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
package org.apache.cassandra.service;

import java.net.InetAddress;
import java.util.Collection;

import com.google.common.collect.Iterables;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.exceptions.UnavailableException;
import org.apache.cassandra.gms.FailureDetector;
import org.apache.cassandra.locator.IEndpointSnitch;
import org.apache.cassandra.net.MessageIn;
import org.apache.cassandra.db.ConsistencyLevel;
import org.apache.cassandra.db.WriteType;
import org.apache.cassandra.utils.FBUtilities;

/**
 * This class blocks for a quorum of responses _in the local datacenter only_ (CL.LOCAL_QUORUM).
 */
public class DatacenterWriteResponseHandler extends WriteResponseHandler
{
    private static final IEndpointSnitch snitch = DatabaseDescriptor.getEndpointSnitch();

    private static final String localdc;
    static
    {
        localdc = snitch.getDatacenter(FBUtilities.getBroadcastAddress());
    }

    public DatacenterWriteResponseHandler(Collection<InetAddress> naturalEndpoints,
                                          Collection<InetAddress> pendingEndpoints,
                                          ConsistencyLevel consistencyLevel,
                                          String table,
                                          Runnable callback,
                                          WriteType writeType)
    {
        super(naturalEndpoints, pendingEndpoints, consistencyLevel, table, callback, writeType);
        assert consistencyLevel == ConsistencyLevel.LOCAL_QUORUM;
    }

    @Override
    public void response(MessageIn message)
    {
        if (message == null || localdc.equals(snitch.getDatacenter(message.from)))
        {
            if (responses.decrementAndGet() == 0)
                signal();
        }
    }

    @Override
    public void assureSufficientLiveNodes() throws UnavailableException
    {
        int liveNodes = 0;
        for (InetAddress destination : Iterables.concat(naturalEndpoints, pendingEndpoints))
        {
            if (localdc.equals(snitch.getDatacenter(destination)) && FailureDetector.instance.isAlive(destination))
                liveNodes++;
        }

        if (liveNodes < responses.get())
        {
            throw new UnavailableException(consistencyLevel, responses.get(), liveNodes);
        }
    }

}
