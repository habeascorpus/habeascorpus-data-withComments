/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contributors: Dan MacDonald <dan@redknee.com> 	TokenNameCOMMENT_LINE	Contributors: Dan MacDonald <dan@redknee.com> 
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
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Socket	TokenNameIdentifier	 Socket
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
ErrorCode	TokenNameIdentifier	 Error Code
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
/** Sends {@link LoggingEvent} objects to a remote a log server, usually a {@link SocketNode}. <p>The SocketAppender has the following properties: <ul> <p><li>If sent to a {@link SocketNode}, remote logging is non-intrusive as far as the log event is concerned. In other words, the event will be logged with the same time stamp, {@link org.apache.log4j.NDC}, location info as if it were logged locally by the client. <p><li>SocketAppenders do not use a layout. They ship a serialized {@link LoggingEvent} object to the server side. <p><li>Remote logging uses the TCP protocol. Consequently, if the server is reachable, then log events will eventually arrive at the server. <p><li>If the remote server is down, the logging requests are simply dropped. However, if and when the server comes back up, then event transmission is resumed transparently. This transparent reconneciton is performed by a <em>connector</em> thread which periodically attempts to connect to the server. <p><li>Logging events are automatically <em>buffered</em> by the native TCP implementation. This means that if the link to server is slow but still faster than the rate of (log) event production by the client, the client will not be affected by the slow network connection. However, if the network connection is slower then the rate of event production, then the client can only progress at the network rate. In particular, if the network link to the the server is down, the client will be blocked. <p>On the other hand, if the network link is up, but the server is down, the client will not be blocked when making log requests but the log events will be lost due to server unavailability. <p><li>Even if a <code>SocketAppender</code> is no longer attached to any category, it will not be garbage collected in the presence of a connector thread. A connector thread exists only if the connection to the server is down. To avoid this garbage collection problem, you should {@link #close} the the <code>SocketAppender</code> explicitly. See also next item. <p>Long lived applications which create/destroy many <code>SocketAppender</code> instances should be aware of this garbage collection problem. Most other applications can safely ignore it. <p><li>If the JVM hosting the <code>SocketAppender</code> exits before the <code>SocketAppender</code> is closed either explicitly or subsequent to garbage collection, then there might be untransmitted data in the pipe which might be lost. This is a common problem on Windows based systems. <p>To avoid lost data, it is usually sufficient to {@link #close} the <code>SocketAppender</code> either explicitly or by calling the {@link org.apache.log4j.LogManager#shutdown} method before exiting the application. </ul> @author Ceki G&uuml;lc&uuml; @since 0.8.4 */	TokenNameCOMMENT_JAVADOC	 Sends {@link LoggingEvent} objects to a remote a log server, usually a {@link SocketNode}. <p>The SocketAppender has the following properties: <ul> <p><li>If sent to a {@link SocketNode}, remote logging is non-intrusive as far as the log event is concerned. In other words, the event will be logged with the same time stamp, {@link org.apache.log4j.NDC}, location info as if it were logged locally by the client. <p><li>SocketAppenders do not use a layout. They ship a serialized {@link LoggingEvent} object to the server side. <p><li>Remote logging uses the TCP protocol. Consequently, if the server is reachable, then log events will eventually arrive at the server. <p><li>If the remote server is down, the logging requests are simply dropped. However, if and when the server comes back up, then event transmission is resumed transparently. This transparent reconneciton is performed by a <em>connector</em> thread which periodically attempts to connect to the server. <p><li>Logging events are automatically <em>buffered</em> by the native TCP implementation. This means that if the link to server is slow but still faster than the rate of (log) event production by the client, the client will not be affected by the slow network connection. However, if the network connection is slower then the rate of event production, then the client can only progress at the network rate. In particular, if the network link to the the server is down, the client will be blocked. <p>On the other hand, if the network link is up, but the server is down, the client will not be blocked when making log requests but the log events will be lost due to server unavailability. <p><li>Even if a <code>SocketAppender</code> is no longer attached to any category, it will not be garbage collected in the presence of a connector thread. A connector thread exists only if the connection to the server is down. To avoid this garbage collection problem, you should {@link #close} the the <code>SocketAppender</code> explicitly. See also next item. <p>Long lived applications which create/destroy many <code>SocketAppender</code> instances should be aware of this garbage collection problem. Most other applications can safely ignore it. <p><li>If the JVM hosting the <code>SocketAppender</code> exits before the <code>SocketAppender</code> is closed either explicitly or subsequent to garbage collection, then there might be untransmitted data in the pipe which might be lost. This is a common problem on Windows based systems. <p>To avoid lost data, it is usually sufficient to {@link #close} the <code>SocketAppender</code> either explicitly or by calling the {@link org.apache.log4j.LogManager#shutdown} method before exiting the application. </ul> @author Ceki G&uuml;lc&uuml; @since 0.8.4 
public	TokenNamepublic	
class	TokenNameclass	
SocketAppender	TokenNameIdentifier	 Socket Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
/** The default port number of remote logging server (4560). @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 The default port number of remote logging server (4560). @since 1.2.15 
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
=	TokenNameEQUAL	
4560	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The default reconnection delay (30000 milliseconds or 30 seconds). */	TokenNameCOMMENT_JAVADOC	 The default reconnection delay (30000 milliseconds or 30 seconds). 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_RECONNECTION_DELAY	TokenNameIdentifier	 DEFAULT  RECONNECTION  DELAY
=	TokenNameEQUAL	
30000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** We remember host name as String in addition to the resolved InetAddress so that it can be returned via getOption(). */	TokenNameCOMMENT_JAVADOC	 We remember host name as String in addition to the resolved InetAddress so that it can be returned via getOption(). 
String	TokenNameIdentifier	 String
remoteHost	TokenNameIdentifier	 remote Host
;	TokenNameSEMICOLON	
/** * The MulticastDNS zone advertised by a SocketAppender */	TokenNameCOMMENT_JAVADOC	 The MulticastDNS zone advertised by a SocketAppender 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ZONE	TokenNameIdentifier	 ZONE
=	TokenNameEQUAL	
"_log4j_obj_tcpconnect_appender.local."	TokenNameStringLiteral	_log4j_obj_tcpconnect_appender.local.
;	TokenNameSEMICOLON	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
;	TokenNameSEMICOLON	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
oos	TokenNameIdentifier	 oos
;	TokenNameSEMICOLON	
int	TokenNameint	
reconnectionDelay	TokenNameIdentifier	 reconnection Delay
=	TokenNameEQUAL	
DEFAULT_RECONNECTION_DELAY	TokenNameIdentifier	 DEFAULT  RECONNECTION  DELAY
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
application	TokenNameIdentifier	 application
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Connector	TokenNameIdentifier	 Connector
connector	TokenNameIdentifier	 connector
;	TokenNameSEMICOLON	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// reset the ObjectOutputStream every 70 calls 	TokenNameCOMMENT_LINE	reset the ObjectOutputStream every 70 calls 
//private static final int RESET_FREQUENCY = 70; 	TokenNameCOMMENT_LINE	private static final int RESET_FREQUENCY = 70; 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RESET_FREQUENCY	TokenNameIdentifier	 RESET  FREQUENCY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
advertiseViaMulticastDNS	TokenNameIdentifier	 advertise Via Multicast DNS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ZeroConfSupport	TokenNameIdentifier	 Zero Conf Support
zeroConf	TokenNameIdentifier	 zero Conf
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Connects to remote server at <code>address</code> and <code>port</code>. */	TokenNameCOMMENT_JAVADOC	 Connects to remote server at <code>address</code> and <code>port</code>. 
public	TokenNamepublic	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
remoteHost	TokenNameIdentifier	 remote Host
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Connects to remote server at <code>host</code> and <code>port</code>. */	TokenNameCOMMENT_JAVADOC	 Connects to remote server at <code>host</code> and <code>port</code>. 
public	TokenNamepublic	
SocketAppender	TokenNameIdentifier	 Socket Appender
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
getAddressByName	TokenNameIdentifier	 get Address By Name
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
remoteHost	TokenNameIdentifier	 remote Host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Connect to the specified <b>RemoteHost</b> and <b>Port</b>. */	TokenNameCOMMENT_JAVADOC	 Connect to the specified <b>RemoteHost</b> and <b>Port</b>. 
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
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close this appender. * * <p>This will mark the appender as closed and call then {@link * #cleanUp} method. * */	TokenNameCOMMENT_JAVADOC	 Close this appender. * <p>This will mark the appender as closed and call then {@link #cleanUp} method. 
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
}	TokenNameRBRACE	
/** * Drop the connection to the remote host and release the underlying * connector thread if it has been created * */	TokenNameCOMMENT_JAVADOC	 Drop the connection to the remote host and release the underlying connector thread if it has been created 
public	TokenNamepublic	
void	TokenNamevoid	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
"Could not close oos."	TokenNameStringLiteral	Could not close oos.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
oos	TokenNameIdentifier	 oos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
connector	TokenNameIdentifier	 connector
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//LogLog.debug("Interrupting the connector."); 	TokenNameCOMMENT_LINE	LogLog.debug("Interrupting the connector."); 
connector	TokenNameIdentifier	 connector
.	TokenNameDOT	
interrupted	TokenNameIdentifier	 interrupted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
connector	TokenNameIdentifier	 connector
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// allow gc 	TokenNameCOMMENT_LINE	allow gc 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
address	TokenNameIdentifier	 address
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// First, close the previous connection if any. 	TokenNameCOMMENT_LINE	First, close the previous connection if any. 
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oos	TokenNameIdentifier	 oos
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
Socket	TokenNameIdentifier	 Socket
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Could not connect to remote log4j server at ["	TokenNameStringLiteral	Could not connect to remote log4j server at [
+	TokenNamePLUS	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reconnectionDelay	TokenNameIdentifier	 reconnection Delay
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
" We will try again later."	TokenNameStringLiteral	 We will try again later.
;	TokenNameSEMICOLON	
fireConnector	TokenNameIdentifier	 fire Connector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fire the connector thread 	TokenNameCOMMENT_LINE	fire the connector thread 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
" We are not retrying."	TokenNameStringLiteral	 We are not retrying.
;	TokenNameSEMICOLON	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ErrorCode	TokenNameIdentifier	 Error Code
.	TokenNameDOT	
GENERIC_FAILURE	TokenNameIdentifier	 GENERIC  FAILURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"No remote host is set for SocketAppender named ""	TokenNameStringLiteral	No remote host is set for SocketAppender named "
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
""."	TokenNameStringLiteral	".
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oos	TokenNameIdentifier	 oos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
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
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("=========Flushing."); 	TokenNameCOMMENT_LINE	LogLog.debug("=========Flushing."); 
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
counter	TokenNameIdentifier	 counter
>=	TokenNameGREATER_EQUAL	
RESET_FREQUENCY	TokenNameIdentifier	 RESET  FREQUENCY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Failing to reset the object output stream every now and 	TokenNameCOMMENT_LINE	Failing to reset the object output stream every now and 
// then creates a serious memory leak. 	TokenNameCOMMENT_LINE	then creates a serious memory leak. 
//System.err.println("Doing oos.reset()"); 	TokenNameCOMMENT_LINE	System.err.println("Doing oos.reset()"); 
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
oos	TokenNameIdentifier	 oos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Detected problem with connection: "	TokenNameStringLiteral	Detected problem with connection: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reconnectionDelay	TokenNameIdentifier	 reconnection Delay
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireConnector	TokenNameIdentifier	 fire Connector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Detected problem with connection, not reconnecting."	TokenNameStringLiteral	Detected problem with connection, not reconnecting.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ErrorCode	TokenNameIdentifier	 Error Code
.	TokenNameDOT	
GENERIC_FAILURE	TokenNameIdentifier	 GENERIC  FAILURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
void	TokenNamevoid	
fireConnector	TokenNameIdentifier	 fire Connector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
connector	TokenNameIdentifier	 connector
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Starting a new connector thread."	TokenNameStringLiteral	Starting a new connector thread.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connector	TokenNameIdentifier	 connector
=	TokenNameEQUAL	
new	TokenNamenew	
Connector	TokenNameIdentifier	 Connector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connector	TokenNameIdentifier	 connector
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connector	TokenNameIdentifier	 connector
.	TokenNameDOT	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MIN_PRIORITY	TokenNameIdentifier	 MIN  PRIORITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connector	TokenNameIdentifier	 connector
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
InetAddress	TokenNameIdentifier	 Inet Address
getAddressByName	TokenNameIdentifier	 get Address By Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
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
"Could not find address of ["	TokenNameStringLiteral	Could not find address of [
+	TokenNamePLUS	
host	TokenNameIdentifier	 host
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The SocketAppender does not use a layout. Hence, this method * returns <code>false</code>. * */	TokenNameCOMMENT_JAVADOC	 The SocketAppender does not use a layout. Hence, this method returns <code>false</code>. 
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
/** * The <b>RemoteHost</b> option takes a string value which should be * the host name of the server where a {@link SocketNode} is * running. * */	TokenNameCOMMENT_JAVADOC	 The <b>RemoteHost</b> option takes a string value which should be the host name of the server where a {@link SocketNode} is running. 
public	TokenNamepublic	
void	TokenNamevoid	
setRemoteHost	TokenNameIdentifier	 set Remote Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
getAddressByName	TokenNameIdentifier	 get Address By Name
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
remoteHost	TokenNameIdentifier	 remote Host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>RemoteHost</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>RemoteHost</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRemoteHost	TokenNameIdentifier	 get Remote Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
remoteHost	TokenNameIdentifier	 remote Host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>Port</b> option takes a positive integer representing the port where the server is waiting for connections. */	TokenNameCOMMENT_JAVADOC	 The <b>Port</b> option takes a positive integer representing the port where the server is waiting for connections. 
public	TokenNamepublic	
void	TokenNamevoid	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
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
/** The <b>LocationInfo</b> option takes a boolean value. If true, the information sent to the remote host will include location information. By default no location information is sent to the server. */	TokenNameCOMMENT_JAVADOC	 The <b>LocationInfo</b> option takes a boolean value. If true, the information sent to the remote host will include location information. By default no location information is sent to the server. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
boolean	TokenNameboolean	
locationInfo	TokenNameIdentifier	 location Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
locationInfo	TokenNameIdentifier	 location Info
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
/** * The <b>App</b> option takes a string value which should be the name of the * application getting logged. * If property was already set (via system property), don't set here. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 The <b>App</b> option takes a string value which should be the name of the application getting logged. If property was already set (via system property), don't set here. @since 1.2.15 
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
/** * Returns value of the <b>Application</b> option. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>Application</b> option. @since 1.2.15 
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
/** The <b>ReconnectionDelay</b> option takes a positive integer representing the number of milliseconds to wait between each failed connection attempt to the server. The default value of this option is 30000 which corresponds to 30 seconds. <p>Setting this option to zero turns off reconnection capability. */	TokenNameCOMMENT_JAVADOC	 The <b>ReconnectionDelay</b> option takes a positive integer representing the number of milliseconds to wait between each failed connection attempt to the server. The default value of this option is 30000 which corresponds to 30 seconds. <p>Setting this option to zero turns off reconnection capability. 
public	TokenNamepublic	
void	TokenNamevoid	
setReconnectionDelay	TokenNameIdentifier	 set Reconnection Delay
(	TokenNameLPAREN	
int	TokenNameint	
delay	TokenNameIdentifier	 delay
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reconnectionDelay	TokenNameIdentifier	 reconnection Delay
=	TokenNameEQUAL	
delay	TokenNameIdentifier	 delay
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>ReconnectionDelay</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>ReconnectionDelay</b> option. 
public	TokenNamepublic	
int	TokenNameint	
getReconnectionDelay	TokenNameIdentifier	 get Reconnection Delay
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reconnectionDelay	TokenNameIdentifier	 reconnection Delay
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The Connector will reconnect when the server becomes available again. It does this by attempting to open a new connection every <code>reconnectionDelay</code> milliseconds. <p>It stops trying whenever a connection is established. It will restart to try reconnect to the server when previously open connection is droppped. @author Ceki G&uuml;lc&uuml; @since 0.8.4 */	TokenNameCOMMENT_JAVADOC	 The Connector will reconnect when the server becomes available again. It does this by attempting to open a new connection every <code>reconnectionDelay</code> milliseconds. <p>It stops trying whenever a connection is established. It will restart to try reconnect to the server when previously open connection is droppped. @author Ceki G&uuml;lc&uuml; @since 0.8.4 
class	TokenNameclass	
Connector	TokenNameIdentifier	 Connector
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
boolean	TokenNameboolean	
interrupted	TokenNameIdentifier	 interrupted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
interrupted	TokenNameIdentifier	 interrupted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
reconnectionDelay	TokenNameIdentifier	 reconnection Delay
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Attempting connection to "	TokenNameStringLiteral	Attempting connection to 
+	TokenNamePLUS	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
new	TokenNamenew	
Socket	TokenNameIdentifier	 Socket
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
connector	TokenNameIdentifier	 connector
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Connection established. Exiting connector thread."	TokenNameStringLiteral	Connection established. Exiting connector thread.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Connector interrupted. Leaving loop."	TokenNameStringLiteral	Connector interrupted. Leaving loop.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ConnectException	TokenNameIdentifier	 Connect Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Remote host "	TokenNameStringLiteral	Remote host 
+	TokenNamePLUS	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" refused connection."	TokenNameStringLiteral	 refused connection.
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
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Could not connect to "	TokenNameStringLiteral	Could not connect to 
+	TokenNamePLUS	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
". Exception is "	TokenNameStringLiteral	. Exception is 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//LogLog.debug("Exiting Connector.run() method."); 	TokenNameCOMMENT_LINE	LogLog.debug("Exiting Connector.run() method."); 
}	TokenNameRBRACE	
/** public void finalize() { LogLog.debug("Connector finalize() has been called."); } */	TokenNameCOMMENT_JAVADOC	 public void finalize() { LogLog.debug("Connector finalize() has been called."); } 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
