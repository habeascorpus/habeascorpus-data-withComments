/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ServerSocket	TokenNameIdentifier	 Server Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Socket	TokenNameIdentifier	 Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
SocketException	TokenNameIdentifier	 Socket Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
CyclicBuffer	TokenNameIdentifier	 Cyclic Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** Sends {@link LoggingEvent} objects to a set of remote log servers, usually a {@link SocketNode SocketNodes}. <p>Acts just like {@link SocketAppender} except that instead of connecting to a given remote log server, <code>SocketHubAppender</code> accepts connections from the remote log servers as clients. It can accept more than one connection. When a log event is received, the event is sent to the set of currently connected remote log servers. Implemented this way it does not require any update to the configuration file to send data to another remote log server. The remote log server simply connects to the host and port the <code>SocketHubAppender</code> is running on. <p>The <code>SocketHubAppender</code> does not store events such that the remote side will events that arrived after the establishment of its connection. Once connected, events arrive in order as guaranteed by the TCP protocol. <p>This implementation borrows heavily from the {@link SocketAppender}. <p>The SocketHubAppender has the following characteristics: <ul> <p><li>If sent to a {@link SocketNode}, logging is non-intrusive as far as the log event is concerned. In other words, the event will be logged with the same time stamp, {@link org.apache.log4j.NDC}, location info as if it were logged locally. <p><li><code>SocketHubAppender</code> does not use a layout. It ships a serialized {@link LoggingEvent} object to the remote side. <p><li><code>SocketHubAppender</code> relies on the TCP protocol. Consequently, if the remote side is reachable, then log events will eventually arrive at remote client. <p><li>If no remote clients are attached, the logging requests are simply dropped. <p><li>Logging events are automatically <em>buffered</em> by the native TCP implementation. This means that if the link to remote client is slow but still faster than the rate of (log) event production, the application will not be affected by the slow network connection. However, if the network connection is slower then the rate of event production, then the local application can only progress at the network rate. In particular, if the network link to the the remote client is down, the application will be blocked. <p>On the other hand, if the network link is up, but the remote client is down, the client will not be blocked when making log requests but the log events will be lost due to client unavailability. <p>The single remote client case extends to multiple clients connections. The rate of logging will be determined by the slowest link. <p><li>If the JVM hosting the <code>SocketHubAppender</code> exits before the <code>SocketHubAppender</code> is closed either explicitly or subsequent to garbage collection, then there might be untransmitted data in the pipe which might be lost. This is a common problem on Windows based systems. <p>To avoid lost data, it is usually sufficient to {@link #close} the <code>SocketHubAppender</code> either explicitly or by calling the {@link org.apache.log4j.LogManager#shutdown} method before exiting the application. </ul> @author Mark Womack */	TokenNameCOMMENT_JAVADOC	 Sends {@link LoggingEvent} objects to a set of remote log servers, usually a {@link SocketNode SocketNodes}. <p>Acts just like {@link SocketAppender} except that instead of connecting to a given remote log server, <code>SocketHubAppender</code> accepts connections from the remote log servers as clients. It can accept more than one connection. When a log event is received, the event is sent to the set of currently connected remote log servers. Implemented this way it does not require any update to the configuration file to send data to another remote log server. The remote log server simply connects to the host and port the <code>SocketHubAppender</code> is running on. <p>The <code>SocketHubAppender</code> does not store events such that the remote side will events that arrived after the establishment of its connection. Once connected, events arrive in order as guaranteed by the TCP protocol. <p>This implementation borrows heavily from the {@link SocketAppender}. <p>The SocketHubAppender has the following characteristics: <ul> <p><li>If sent to a {@link SocketNode}, logging is non-intrusive as far as the log event is concerned. In other words, the event will be logged with the same time stamp, {@link org.apache.log4j.NDC}, location info as if it were logged locally. <p><li><code>SocketHubAppender</code> does not use a layout. It ships a serialized {@link LoggingEvent} object to the remote side. <p><li><code>SocketHubAppender</code> relies on the TCP protocol. Consequently, if the remote side is reachable, then log events will eventually arrive at remote client. <p><li>If no remote clients are attached, the logging requests are simply dropped. <p><li>Logging events are automatically <em>buffered</em> by the native TCP implementation. This means that if the link to remote client is slow but still faster than the rate of (log) event production, the application will not be affected by the slow network connection. However, if the network connection is slower then the rate of event production, then the local application can only progress at the network rate. In particular, if the network link to the the remote client is down, the application will be blocked. <p>On the other hand, if the network link is up, but the remote client is down, the client will not be blocked when making log requests but the log events will be lost due to client unavailability. <p>The single remote client case extends to multiple clients connections. The rate of logging will be determined by the slowest link. <p><li>If the JVM hosting the <code>SocketHubAppender</code> exits before the <code>SocketHubAppender</code> is closed either explicitly or subsequent to garbage collection, then there might be untransmitted data in the pipe which might be lost. This is a common problem on Windows based systems. <p>To avoid lost data, it is usually sufficient to {@link #close} the <code>SocketHubAppender</code> either explicitly or by calling the {@link org.apache.log4j.LogManager#shutdown} method before exiting the application. </ul> @author Mark Womack 
public	TokenNamepublic	
class	TokenNameclass	
SocketHubAppender	TokenNameIdentifier	 Socket Hub Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
/** The default port number of the ServerSocket will be created on. */	TokenNameCOMMENT_JAVADOC	 The default port number of the ServerSocket will be created on. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
=	TokenNameEQUAL	
4560	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
oosList	TokenNameIdentifier	 oos List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ServerMonitor	TokenNameIdentifier	 Server Monitor
serverMonitor	TokenNameIdentifier	 server Monitor
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CyclicBuffer	TokenNameIdentifier	 Cyclic Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
application	TokenNameIdentifier	 application
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
advertiseViaMulticastDNS	TokenNameIdentifier	 advertise Via Multicast DNS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ZeroConfSupport	TokenNameIdentifier	 Zero Conf Support
zeroConf	TokenNameIdentifier	 zero Conf
;	TokenNameSEMICOLON	
/** * The MulticastDNS zone advertised by a SocketHubAppender */	TokenNameCOMMENT_JAVADOC	 The MulticastDNS zone advertised by a SocketHubAppender 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ZONE	TokenNameIdentifier	 ZONE
=	TokenNameEQUAL	
"_log4j_obj_tcpaccept_appender.local."	TokenNameStringLiteral	_log4j_obj_tcpaccept_appender.local.
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ServerSocket	TokenNameIdentifier	 Server Socket
serverSocket	TokenNameIdentifier	 server Socket
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SocketHubAppender	TokenNameIdentifier	 Socket Hub Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Connects to remote server at <code>address</code> and <code>port</code>. */	TokenNameCOMMENT_JAVADOC	 Connects to remote server at <code>address</code> and <code>port</code>. 
public	TokenNamepublic	
SocketHubAppender	TokenNameIdentifier	 Socket Hub Appender
(	TokenNameLPAREN	
int	TokenNameint	
_port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
_port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
startServer	TokenNameIdentifier	 start Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set up the socket server on the specified port. */	TokenNameCOMMENT_JAVADOC	 Set up the socket server on the specified port. 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
advertiseViaMulticastDNS	TokenNameIdentifier	 advertise Via Multicast DNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zeroConf	TokenNameIdentifier	 zero Conf
=	TokenNameEQUAL	
new	TokenNamenew	
ZeroConfSupport	TokenNameIdentifier	 Zero Conf Support
(	TokenNameLPAREN	
ZONE	TokenNameIdentifier	 ZONE
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zeroConf	TokenNameIdentifier	 zero Conf
.	TokenNameDOT	
advertise	TokenNameIdentifier	 advertise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startServer	TokenNameIdentifier	 start Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Close this appender. <p>This will mark the appender as closed and call then {@link #cleanUp} method. */	TokenNameCOMMENT_JAVADOC	 Close this appender. <p>This will mark the appender as closed and call then {@link #cleanUp} method. 
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"closing SocketHubAppender "	TokenNameStringLiteral	closing SocketHubAppender 
+	TokenNamePLUS	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
advertiseViaMulticastDNS	TokenNameIdentifier	 advertise Via Multicast DNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zeroConf	TokenNameIdentifier	 zero Conf
.	TokenNameDOT	
unadvertise	TokenNameIdentifier	 unadvertise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"SocketHubAppender "	TokenNameStringLiteral	SocketHubAppender 
+	TokenNamePLUS	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" closed"	TokenNameStringLiteral	 closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Release the underlying ServerMonitor thread, and drop the connections to all connected remote servers. */	TokenNameCOMMENT_JAVADOC	 Release the underlying ServerMonitor thread, and drop the connections to all connected remote servers. 
public	TokenNamepublic	
void	TokenNamevoid	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// stop the monitor thread 	TokenNameCOMMENT_LINE	stop the monitor thread 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"stopping ServerSocket"	TokenNameStringLiteral	stopping ServerSocket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serverMonitor	TokenNameIdentifier	 server Monitor
.	TokenNameDOT	
stopMonitor	TokenNameIdentifier	 stop Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serverMonitor	TokenNameIdentifier	 server Monitor
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// close all of the connections 	TokenNameCOMMENT_LINE	close all of the connections 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"closing client connections"	TokenNameStringLiteral	closing client connections
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
oosList	TokenNameIdentifier	 oos List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
oos	TokenNameIdentifier	 oos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
)	TokenNameRPAREN	
oosList	TokenNameIdentifier	 oos List
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oos	TokenNameIdentifier	 oos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"could not close oos."	TokenNameStringLiteral	could not close oos.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"could not close oos."	TokenNameStringLiteral	could not close oos.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
oosList	TokenNameIdentifier	 oos List
.	TokenNameDOT	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Append an event to all of current connections. */	TokenNameCOMMENT_JAVADOC	 Append an event to all of current connections. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set up location info if requested 	TokenNameCOMMENT_LINE	set up location info if requested 
if	TokenNameif	
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
application	TokenNameIdentifier	 application
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"application"	TokenNameStringLiteral	application
,	TokenNameCOMMA	
application	TokenNameIdentifier	 application
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMDCCopy	TokenNameIdentifier	 get MDC Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if no event or no open connections, exit now 	TokenNameCOMMENT_LINE	if no event or no open connections, exit now 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
oosList	TokenNameIdentifier	 oos List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// loop through the current set of open connections, appending the event to each 	TokenNameCOMMENT_LINE	loop through the current set of open connections, appending the event to each 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
streamCount	TokenNameIdentifier	 stream Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
streamCount	TokenNameIdentifier	 stream Count
<	TokenNameLESS	
oosList	TokenNameIdentifier	 oos List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streamCount	TokenNameIdentifier	 stream Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
oos	TokenNameIdentifier	 oos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
oos	TokenNameIdentifier	 oos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
)	TokenNameRPAREN	
oosList	TokenNameIdentifier	 oos List
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
streamCount	TokenNameIdentifier	 stream Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// catch this, but just don't assign a value 	TokenNameCOMMENT_LINE	catch this, but just don't assign a value 
// this should not really occur as this method is 	TokenNameCOMMENT_LINE	this should not really occur as this method is 
// the only one that can remove oos's (besides cleanUp). 	TokenNameCOMMENT_LINE	the only one that can remove oos's (besides cleanUp). 
}	TokenNameRBRACE	
// list size changed unexpectedly? Just exit the append. 	TokenNameCOMMENT_LINE	list size changed unexpectedly? Just exit the append. 
if	TokenNameif	
(	TokenNameLPAREN	
oos	TokenNameIdentifier	 oos
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Failing to reset the object output stream every now and 	TokenNameCOMMENT_LINE	Failing to reset the object output stream every now and 
// then creates a serious memory leak. 	TokenNameCOMMENT_LINE	then creates a serious memory leak. 
// right now we always reset. TODO - set up frequency counter per oos? 	TokenNameCOMMENT_LINE	right now we always reset. TODO - set up frequency counter per oos? 
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// there was an io exception so just drop the connection 	TokenNameCOMMENT_LINE	there was an io exception so just drop the connection 
oosList	TokenNameIdentifier	 oos List
.	TokenNameDOT	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
streamCount	TokenNameIdentifier	 stream Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"dropped connection"	TokenNameStringLiteral	dropped connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// decrement to keep the counter in place (for loop always increments) 	TokenNameCOMMENT_LINE	decrement to keep the counter in place (for loop always increments) 
streamCount	TokenNameIdentifier	 stream Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The SocketHubAppender does not use a layout. Hence, this method returns <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 The SocketHubAppender does not use a layout. Hence, this method returns <code>false</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>Port</b> option takes a positive integer representing the port where the server is waiting for connections. */	TokenNameCOMMENT_JAVADOC	 The <b>Port</b> option takes a positive integer representing the port where the server is waiting for connections. 
public	TokenNamepublic	
void	TokenNamevoid	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
int	TokenNameint	
_port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
_port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <b>App</b> option takes a string value which should be the name of the application getting logged. If property was already set (via system * property), don't set here. */	TokenNameCOMMENT_JAVADOC	 The <b>App</b> option takes a string value which should be the name of the application getting logged. If property was already set (via system property), don't set here. 
public	TokenNamepublic	
void	TokenNamevoid	
setApplication	TokenNameIdentifier	 set Application
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lapp	TokenNameIdentifier	 lapp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
application	TokenNameIdentifier	 application
=	TokenNameEQUAL	
lapp	TokenNameIdentifier	 lapp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns value of the <b>Application</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>Application</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getApplication	TokenNameIdentifier	 get Application
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
application	TokenNameIdentifier	 application
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>Port</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>Port</b> option. 
public	TokenNamepublic	
int	TokenNameint	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <b>BufferSize</b> option takes a positive integer representing the number of events this appender will buffer and send to newly connected * clients. */	TokenNameCOMMENT_JAVADOC	 The <b>BufferSize</b> option takes a positive integer representing the number of events this appender will buffer and send to newly connected clients. 
public	TokenNamepublic	
void	TokenNamevoid	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
int	TokenNameint	
_bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
CyclicBuffer	TokenNameIdentifier	 Cyclic Buffer
(	TokenNameLPAREN	
_bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns value of the <b>bufferSize</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>bufferSize</b> option. 
public	TokenNamepublic	
int	TokenNameint	
getBufferSize	TokenNameIdentifier	 get Buffer Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getMaxSize	TokenNameIdentifier	 get Max Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The <b>LocationInfo</b> option takes a boolean value. If true, the information sent to the remote host will include location information. By default no location information is sent to the server. */	TokenNameCOMMENT_JAVADOC	 The <b>LocationInfo</b> option takes a boolean value. If true, the information sent to the remote host will include location information. By default no location information is sent to the server. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
boolean	TokenNameboolean	
_locationInfo	TokenNameIdentifier	 location Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
_locationInfo	TokenNameIdentifier	 location Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>LocationInfo</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>LocationInfo</b> option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getLocationInfo	TokenNameIdentifier	 get Location Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locationInfo	TokenNameIdentifier	 location Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAdvertiseViaMulticastDNS	TokenNameIdentifier	 set Advertise Via Multicast DNS
(	TokenNameLPAREN	
boolean	TokenNameboolean	
advertiseViaMulticastDNS	TokenNameIdentifier	 advertise Via Multicast DNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
advertiseViaMulticastDNS	TokenNameIdentifier	 advertise Via Multicast DNS
=	TokenNameEQUAL	
advertiseViaMulticastDNS	TokenNameIdentifier	 advertise Via Multicast DNS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAdvertiseViaMulticastDNS	TokenNameIdentifier	 is Advertise Via Multicast DNS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
advertiseViaMulticastDNS	TokenNameIdentifier	 advertise Via Multicast DNS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Start the ServerMonitor thread. */	TokenNameCOMMENT_JAVADOC	 Start the ServerMonitor thread. 
private	TokenNameprivate	
void	TokenNamevoid	
startServer	TokenNameIdentifier	 start Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
serverMonitor	TokenNameIdentifier	 server Monitor
=	TokenNameEQUAL	
new	TokenNamenew	
ServerMonitor	TokenNameIdentifier	 Server Monitor
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
oosList	TokenNameIdentifier	 oos List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a server socket to accept connections. * @param socketPort port on which the socket should listen, may be zero. * @return new socket. * @throws IOException IO error when opening the socket. */	TokenNameCOMMENT_JAVADOC	 Creates a server socket to accept connections. @param socketPort port on which the socket should listen, may be zero. @return new socket. @throws IOException IO error when opening the socket. 
protected	TokenNameprotected	
ServerSocket	TokenNameIdentifier	 Server Socket
createServerSocket	TokenNameIdentifier	 create Server Socket
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
socketPort	TokenNameIdentifier	 socket Port
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ServerSocket	TokenNameIdentifier	 Server Socket
(	TokenNameLPAREN	
socketPort	TokenNameIdentifier	 socket Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This class is used internally to monitor a ServerSocket and register new connections in a vector passed in the constructor. */	TokenNameCOMMENT_JAVADOC	 This class is used internally to monitor a ServerSocket and register new connections in a vector passed in the constructor. 
private	TokenNameprivate	
class	TokenNameclass	
ServerMonitor	TokenNameIdentifier	 Server Monitor
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
oosList	TokenNameIdentifier	 oos List
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
keepRunning	TokenNameIdentifier	 keep Running
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Thread	TokenNameIdentifier	 Thread
monitorThread	TokenNameIdentifier	 monitor Thread
;	TokenNameSEMICOLON	
/** Create a thread and start the monitor. */	TokenNameCOMMENT_JAVADOC	 Create a thread and start the monitor. 
public	TokenNamepublic	
ServerMonitor	TokenNameIdentifier	 Server Monitor
(	TokenNameLPAREN	
int	TokenNameint	
_port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
_oosList	TokenNameIdentifier	 oos List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
_port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
oosList	TokenNameIdentifier	 oos List
=	TokenNameEQUAL	
_oosList	TokenNameIdentifier	 oos List
;	TokenNameSEMICOLON	
keepRunning	TokenNameIdentifier	 keep Running
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
monitorThread	TokenNameIdentifier	 monitor Thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
monitorThread	TokenNameIdentifier	 monitor Thread
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
monitorThread	TokenNameIdentifier	 monitor Thread
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"SocketHubAppender-Monitor-"	TokenNameStringLiteral	SocketHubAppender-Monitor-
+	TokenNamePLUS	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
monitorThread	TokenNameIdentifier	 monitor Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Stops the monitor. This method will not return until the thread has finished executing. */	TokenNameCOMMENT_JAVADOC	 Stops the monitor. This method will not return until the thread has finished executing. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
stopMonitor	TokenNameIdentifier	 stop Monitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keepRunning	TokenNameIdentifier	 keep Running
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"server monitor thread shutting down"	TokenNameStringLiteral	server monitor thread shutting down
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keepRunning	TokenNameIdentifier	 keep Running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
serverSocket	TokenNameIdentifier	 server Socket
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serverSocket	TokenNameIdentifier	 server Socket
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
monitorThread	TokenNameIdentifier	 monitor Thread
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// do nothing? 	TokenNameCOMMENT_LINE	do nothing? 
}	TokenNameRBRACE	
// release the thread 	TokenNameCOMMENT_LINE	release the thread 
monitorThread	TokenNameIdentifier	 monitor Thread
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"server monitor thread shut down"	TokenNameStringLiteral	server monitor thread shut down
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendCachedEvents	TokenNameIdentifier	 send Cached Events
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Method that runs, monitoring the ServerSocket and adding connections as they connect to the socket. */	TokenNameCOMMENT_JAVADOC	 Method that runs, monitoring the ServerSocket and adding connections as they connect to the socket. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
serverSocket	TokenNameIdentifier	 server Socket
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
serverSocket	TokenNameIdentifier	 server Socket
=	TokenNameEQUAL	
createServerSocket	TokenNameIdentifier	 create Server Socket
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
setSoTimeout	TokenNameIdentifier	 set So Timeout
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
||	TokenNameOR_OR	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"exception setting timeout, shutting down server socket."	TokenNameStringLiteral	exception setting timeout, shutting down server socket.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keepRunning	TokenNameIdentifier	 keep Running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
setSoTimeout	TokenNameIdentifier	 set So Timeout
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"exception setting timeout, shutting down server socket."	TokenNameStringLiteral	exception setting timeout, shutting down server socket.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
keepRunning	TokenNameIdentifier	 keep Running
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// timeout occurred, so just loop 	TokenNameCOMMENT_LINE	timeout occurred, so just loop 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"exception accepting socket, shutting down server socket."	TokenNameStringLiteral	exception accepting socket, shutting down server socket.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keepRunning	TokenNameIdentifier	 keep Running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"exception accepting socket."	TokenNameStringLiteral	exception accepting socket.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if there was a socket accepted 	TokenNameCOMMENT_LINE	if there was a socket accepted 
if	TokenNameif	
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
remoteAddress	TokenNameIdentifier	 remote Address
=	TokenNameEQUAL	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInetAddress	TokenNameIdentifier	 get Inet Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"accepting connection from "	TokenNameStringLiteral	accepting connection from 
+	TokenNamePLUS	
remoteAddress	TokenNameIdentifier	 remote Address
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
remoteAddress	TokenNameIdentifier	 remote Address
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create an ObjectOutputStream 	TokenNameCOMMENT_LINE	create an ObjectOutputStream 
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
oos	TokenNameIdentifier	 oos
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sendCachedEvents	TokenNameIdentifier	 send Cached Events
(	TokenNameLPAREN	
oos	TokenNameIdentifier	 oos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add it to the oosList. OK since Vector is synchronized. 	TokenNameCOMMENT_LINE	add it to the oosList. OK since Vector is synchronized. 
oosList	TokenNameIdentifier	 oos List
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
oos	TokenNameIdentifier	 oos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"exception creating output stream on socket."	TokenNameStringLiteral	exception creating output stream on socket.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// close the socket 	TokenNameCOMMENT_LINE	close the socket 
try	TokenNametry	
{	TokenNameLBRACE	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing with it? 	TokenNameCOMMENT_LINE	do nothing with it? 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
