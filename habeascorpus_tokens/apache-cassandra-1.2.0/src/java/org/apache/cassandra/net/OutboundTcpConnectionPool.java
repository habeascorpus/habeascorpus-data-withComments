/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
SocketChannel	TokenNameIdentifier	 Socket Channel
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Stage	TokenNameIdentifier	 Stage
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
ConnectionMetrics	TokenNameIdentifier	 Connection Metrics
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
SSLFactory	TokenNameIdentifier	 SSL Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
OutboundTcpConnectionPool	TokenNameIdentifier	 Outbound Tcp Connection Pool
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
snitch	TokenNameIdentifier	 snitch
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getEndpointSnitch	TokenNameIdentifier	 get Endpoint Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pointer for the real Address. 	TokenNameCOMMENT_LINE	pointer for the real Address. 
private	TokenNameprivate	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
cmdCon	TokenNameIdentifier	 cmd Con
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
ackCon	TokenNameIdentifier	 ack Con
;	TokenNameSEMICOLON	
// pointer to the reseted Address. 	TokenNameCOMMENT_LINE	pointer to the reseted Address. 
private	TokenNameprivate	
InetAddress	TokenNameIdentifier	 Inet Address
resetedEndpoint	TokenNameIdentifier	 reseted Endpoint
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ConnectionMetrics	TokenNameIdentifier	 Connection Metrics
metrics	TokenNameIdentifier	 metrics
;	TokenNameSEMICOLON	
OutboundTcpConnectionPool	TokenNameIdentifier	 Outbound Tcp Connection Pool
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
remoteEp	TokenNameIdentifier	 remote Ep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
remoteEp	TokenNameIdentifier	 remote Ep
;	TokenNameSEMICOLON	
cmdCon	TokenNameIdentifier	 cmd Con
=	TokenNameEQUAL	
new	TokenNamenew	
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmdCon	TokenNameIdentifier	 cmd Con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ackCon	TokenNameIdentifier	 ack Con
=	TokenNameEQUAL	
new	TokenNamenew	
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ackCon	TokenNameIdentifier	 ack Con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metrics	TokenNameIdentifier	 metrics
=	TokenNameEQUAL	
new	TokenNamenew	
ConnectionMetrics	TokenNameIdentifier	 Connection Metrics
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns the appropriate connection based on message type. * returns null if a connection could not be established. */	TokenNameCOMMENT_JAVADOC	 returns the appropriate connection based on message type. returns null if a connection could not be established. 
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
MessageOut	TokenNameIdentifier	 Message Out
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stage	TokenNameIdentifier	 Stage
stage	TokenNameIdentifier	 stage
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
getStage	TokenNameIdentifier	 get Stage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stage	TokenNameIdentifier	 stage
==	TokenNameEQUAL_EQUAL	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
REQUEST_RESPONSE	TokenNameIdentifier	 REQUEST  RESPONSE
||	TokenNameOR_OR	
stage	TokenNameIdentifier	 stage
==	TokenNameEQUAL_EQUAL	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
INTERNAL_RESPONSE	TokenNameIdentifier	 INTERNAL  RESPONSE
||	TokenNameOR_OR	
stage	TokenNameIdentifier	 stage
==	TokenNameEQUAL_EQUAL	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
GOSSIP	TokenNameIdentifier	 GOSSIP
?	TokenNameQUESTION	
ackCon	TokenNameIdentifier	 ack Con
:	TokenNameCOLON	
cmdCon	TokenNameIdentifier	 cmd Con
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
conn	TokenNameIdentifier	 conn
:	TokenNameCOLON	
new	TokenNamenew	
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cmdCon	TokenNameIdentifier	 cmd Con
,	TokenNameCOMMA	
ackCon	TokenNameIdentifier	 ack Con
}	TokenNameRBRACE	
)	TokenNameRPAREN	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
closeSocket	TokenNameIdentifier	 close Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
resetToNewerVersion	TokenNameIdentifier	 reset To Newer Version
(	TokenNameLPAREN	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
conn	TokenNameIdentifier	 conn
:	TokenNameCOLON	
new	TokenNamenew	
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cmdCon	TokenNameIdentifier	 cmd Con
,	TokenNameCOMMA	
ackCon	TokenNameIdentifier	 ack Con
}	TokenNameRBRACE	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
>	TokenNameGREATER	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
getTargetVersion	TokenNameIdentifier	 get Target Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
softCloseSocket	TokenNameIdentifier	 soft Close Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * reconnect to @param remoteEP (after the current message backlog is exhausted). * Used by Ec2MultiRegionSnitch to force nodes in the same region to communicate over their private IPs. * @param remoteEP */	TokenNameCOMMENT_JAVADOC	 reconnect to @param remoteEP (after the current message backlog is exhausted). Used by Ec2MultiRegionSnitch to force nodes in the same region to communicate over their private IPs. @param remoteEP 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
remoteEP	TokenNameIdentifier	 remote EP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resetedEndpoint	TokenNameIdentifier	 reseted Endpoint
=	TokenNameEQUAL	
remoteEP	TokenNameIdentifier	 remote EP
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
conn	TokenNameIdentifier	 conn
:	TokenNameCOLON	
new	TokenNamenew	
OutboundTcpConnection	TokenNameIdentifier	 Outbound Tcp Connection
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cmdCon	TokenNameIdentifier	 cmd Con
,	TokenNameCOMMA	
ackCon	TokenNameIdentifier	 ack Con
}	TokenNameRBRACE	
)	TokenNameRPAREN	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
softCloseSocket	TokenNameIdentifier	 soft Close Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// release previous metrics and create new one with reset address 	TokenNameCOMMENT_LINE	release previous metrics and create new one with reset address 
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metrics	TokenNameIdentifier	 metrics
=	TokenNameEQUAL	
new	TokenNamenew	
ConnectionMetrics	TokenNameIdentifier	 Connection Metrics
(	TokenNameLPAREN	
resetedEndpoint	TokenNameIdentifier	 reseted Endpoint
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTimeouts	TokenNameIdentifier	 get Timeouts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
timeouts	TokenNameIdentifier	 timeouts
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getRecentTimeouts	TokenNameIdentifier	 get Recent Timeouts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
getRecentTimeout	TokenNameIdentifier	 get Recent Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
incrementTimeout	TokenNameIdentifier	 increment Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
timeouts	TokenNameIdentifier	 timeouts
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Socket	TokenNameIdentifier	 Socket
newSocket	TokenNameIdentifier	 new Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// zero means 'bind on any available port.' 	TokenNameCOMMENT_LINE	zero means 'bind on any available port.' 
if	TokenNameif	
(	TokenNameLPAREN	
isEncryptedChannel	TokenNameIdentifier	 is Encrypted Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
.	TokenNameDOT	
getOutboundBindAny	TokenNameIdentifier	 get Outbound Bind Any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
SSLFactory	TokenNameIdentifier	 SSL Factory
.	TokenNameDOT	
getSocket	TokenNameIdentifier	 get Socket
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getServerEncryptionOptions	TokenNameIdentifier	 get Server Encryption Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
endPoint	TokenNameIdentifier	 end Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getSSLStoragePort	TokenNameIdentifier	 get SSL Storage Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
SSLFactory	TokenNameIdentifier	 SSL Factory
.	TokenNameDOT	
getSocket	TokenNameIdentifier	 get Socket
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getServerEncryptionOptions	TokenNameIdentifier	 get Server Encryption Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
endPoint	TokenNameIdentifier	 end Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getSSLStoragePort	TokenNameIdentifier	 get SSL Storage Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getLocalAddress	TokenNameIdentifier	 get Local Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
SocketChannel	TokenNameIdentifier	 Socket Channel
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
endPoint	TokenNameIdentifier	 end Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getStoragePort	TokenNameIdentifier	 get Storage Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
socket	TokenNameIdentifier	 socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
.	TokenNameDOT	
getOutboundBindAny	TokenNameIdentifier	 get Outbound Bind Any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
isBound	TokenNameIdentifier	 is Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
bind	TokenNameIdentifier	 bind
(	TokenNameLPAREN	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getLocalAddress	TokenNameIdentifier	 get Local Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
endPoint	TokenNameIdentifier	 end Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resetedEndpoint	TokenNameIdentifier	 reseted Endpoint
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
id	TokenNameIdentifier	 id
:	TokenNameCOLON	
resetedEndpoint	TokenNameIdentifier	 reseted Endpoint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isEncryptedChannel	TokenNameIdentifier	 is Encrypted Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getServerEncryptionOptions	TokenNameIdentifier	 get Server Encryption Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
internode_encryption	TokenNameIdentifier	 internode encryption
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
none	TokenNameIdentifier	 none
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// if nothing needs to be encrypted then return immediately. 	TokenNameCOMMENT_LINE	if nothing needs to be encrypted then return immediately. 
case	TokenNamecase	
all	TokenNameIdentifier	 all
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
dc	TokenNameIdentifier	 dc
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
rack	TokenNameIdentifier	 rack
:	TokenNameCOLON	
// for rack then check if the DC's are the same. 	TokenNameCOMMENT_LINE	for rack then check if the DC's are the same. 
if	TokenNameif	
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// these null guards are simply for tests 	TokenNameCOMMENT_LINE	these null guards are simply for tests 
if	TokenNameif	
(	TokenNameLPAREN	
ackCon	TokenNameIdentifier	 ack Con
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ackCon	TokenNameIdentifier	 ack Con
.	TokenNameDOT	
closeSocket	TokenNameIdentifier	 close Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmdCon	TokenNameIdentifier	 cmd Con
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
cmdCon	TokenNameIdentifier	 cmd Con
.	TokenNameDOT	
closeSocket	TokenNameIdentifier	 close Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
