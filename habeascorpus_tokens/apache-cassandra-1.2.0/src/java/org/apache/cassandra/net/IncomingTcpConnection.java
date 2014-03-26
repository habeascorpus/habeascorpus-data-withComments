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
*	TokenNameMULTIPLY	
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
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
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
gms	TokenNameIdentifier	 gms
.	TokenNameDOT	
Gossiper	TokenNameIdentifier	 Gossiper
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FastByteArrayInputStream	TokenNameIdentifier	 Fast Byte Array Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
IncomingStreamReader	TokenNameIdentifier	 Incoming Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
StreamHeader	TokenNameIdentifier	 Stream Header
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xerial	TokenNameIdentifier	 xerial
.	TokenNameDOT	
snappy	TokenNameIdentifier	 snappy
.	TokenNameDOT	
SnappyInputStream	TokenNameIdentifier	 Snappy Input Stream
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
IncomingTcpConnection	TokenNameIdentifier	 Incoming Tcp Connection
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
IncomingTcpConnection	TokenNameIdentifier	 Incoming Tcp Connection
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InetAddress	TokenNameIdentifier	 Inet Address
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IncomingTcpConnection	TokenNameIdentifier	 Incoming Tcp Connection
(	TokenNameLPAREN	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
socket	TokenNameIdentifier	 socket
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A new connection will either stream or message for its entire lifetime: because streaming * bypasses the InputStream implementations to use sendFile, we cannot begin buffering until * we've determined the type of the connection. */	TokenNameCOMMENT_JAVADOC	 A new connection will either stream or message for its entire lifetime: because streaming bypasses the InputStream implementations to use sendFile, we cannot begin buffering until we've determined the type of the connection. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// determine the connection type to decide whether to buffer 	TokenNameCOMMENT_LINE	determine the connection type to decide whether to buffer 
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
validateMagic	TokenNameIdentifier	 validate Magic
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isStream	TokenNameIdentifier	 is Stream
=	TokenNameEQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
getBits	TokenNameIdentifier	 get Bits
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
getBits	TokenNameIdentifier	 get Bits
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Connection version {} from {}"	TokenNameStringLiteral	Connection version {} from {}
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInetAddress	TokenNameIdentifier	 get Inet Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isStream	TokenNameIdentifier	 is Stream
)	TokenNameRPAREN	
handleStream	TokenNameIdentifier	 handle Stream
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<	TokenNameLESS	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
)	TokenNameRPAREN	
handleLegacyVersion	TokenNameIdentifier	 handle Legacy Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
handleModernVersion	TokenNameIdentifier	 handle Modern Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
EOFException	TokenNameIdentifier	 EOF Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"eof reading from socket; closing"	TokenNameStringLiteral	eof reading from socket; closing
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// connection will be reset so no need to throw an exception. 	TokenNameCOMMENT_LINE	connection will be reset so no need to throw an exception. 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"IOException reading from socket; closing"	TokenNameStringLiteral	IOException reading from socket; closing
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
handleModernVersion	TokenNameIdentifier	 handle Modern Version
(	TokenNameLPAREN	
int	TokenNameint	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
int	TokenNameint	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxVersion	TokenNameIdentifier	 max Version
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
CompactEndpointSerializationHelper	TokenNameIdentifier	 Compact Endpoint Serialization Helper
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
compressed	TokenNameIdentifier	 compressed
=	TokenNameEQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
getBits	TokenNameIdentifier	 get Bits
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Upgrading incoming connection to be compressed"	TokenNameStringLiteral	Upgrading incoming connection to be compressed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
SnappyInputStream	TokenNameIdentifier	 Snappy Input Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4096	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Max version for {} is {}"	TokenNameStringLiteral	Max version for {} is {}
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
>	TokenNameGREATER	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// save the endpoint so gossip will reconnect to it 	TokenNameCOMMENT_LINE	save the endpoint so gossip will reconnect to it 
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addSavedEndpoint	TokenNameIdentifier	 add Saved Endpoint
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Received messages from newer protocol version {}. Ignoring"	TokenNameStringLiteral	Received messages from newer protocol version {}. Ignoring
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
,	TokenNameCOMMA	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"set version for {} to {}"	TokenNameStringLiteral	set version for {} to {}
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
,	TokenNameCOMMA	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// outbound side will reconnect if necessary to upgrade version 	TokenNameCOMMENT_LINE	outbound side will reconnect if necessary to upgrade version 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
validateMagic	TokenNameIdentifier	 validate Magic
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
receiveMessage	TokenNameIdentifier	 receive Message
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
handleLegacyVersion	TokenNameIdentifier	 handle Legacy Version
(	TokenNameLPAREN	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4096	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
receiveMessage	TokenNameIdentifier	 receive Message
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// why? see => CASSANDRA-4099 	TokenNameCOMMENT_LINE	why? see => CASSANDRA-4099 
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Version for {} is {}"	TokenNameStringLiteral	Version for {} is {}
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
>	TokenNameGREATER	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// save the endpoint so gossip will reconnect to it 	TokenNameCOMMENT_LINE	save the endpoint so gossip will reconnect to it 
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addSavedEndpoint	TokenNameIdentifier	 add Saved Endpoint
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Received messages from newer protocol version. Ignoring"	TokenNameStringLiteral	Received messages from newer protocol version. Ignoring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
lastVersion	TokenNameIdentifier	 last Version
=	TokenNameEQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"set version for {} to {}"	TokenNameStringLiteral	set version for {} to {}
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastVersion	TokenNameIdentifier	 last Version
<	TokenNameLESS	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"breaking outbound connections to force version upgrade"	TokenNameStringLiteral	breaking outbound connections to force version upgrade
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConnectionPool	TokenNameIdentifier	 get Connection Pool
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
.	TokenNameDOT	
resetToNewerVersion	TokenNameIdentifier	 reset To Newer Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
validateMagic	TokenNameIdentifier	 validate Magic
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// legacy protocol re-sends header for each message 	TokenNameCOMMENT_LINE	legacy protocol re-sends header for each message 
assert	TokenNameassert	
!	TokenNameNOT	
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
getBits	TokenNameIdentifier	 get Bits
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Non-stream connection cannot change to stream"	TokenNameStringLiteral	Non-stream connection cannot change to stream
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
getBits	TokenNameIdentifier	 get Bits
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Version is now {}"	TokenNameStringLiteral	Version is now {}
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
receiveMessage	TokenNameIdentifier	 receive Message
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
handleStream	TokenNameIdentifier	 handle Stream
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
headerBytes	TokenNameIdentifier	 header Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
headerBytes	TokenNameIdentifier	 header Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
(	TokenNameLPAREN	
StreamHeader	TokenNameIdentifier	 Stream Header
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FastByteArrayInputStream	TokenNameIdentifier	 Fast Byte Array Input Stream
(	TokenNameLPAREN	
headerBytes	TokenNameIdentifier	 header Bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// streaming connections are per-session and have a fixed version. we can't do anything with a wrong-version stream connection, so drop it. 	TokenNameCOMMENT_LINE	streaming connections are per-session and have a fixed version. we can't do anything with a wrong-version stream connection, so drop it. 
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Received stream using protocol version {} (my version {}). Terminating connection"	TokenNameStringLiteral	Received stream using protocol version {} (my version {}). Terminating connection
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
InetAddress	TokenNameIdentifier	 Inet Address
receiveMessage	TokenNameIdentifier	 receive Message
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<	TokenNameLESS	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// size of entire message. in 1.0+ this is just a placeholder 	TokenNameCOMMENT_LINE	size of entire message. in 1.0+ this is just a placeholder 
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
>=	TokenNameGREATER_EQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make sure to readInt, even if cross_node_to is not enabled 	TokenNameCOMMENT_LINE	make sure to readInt, even if cross_node_to is not enabled 
int	TokenNameint	
partial	TokenNameIdentifier	 partial
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
hasCrossNodeTimeout	TokenNameIdentifier	 has Cross Node Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
&	TokenNameAND	
0xFFFFFFFF00000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
partial	TokenNameIdentifier	 partial
&	TokenNameAND	
0xFFFFFFFFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MessageIn	TokenNameIdentifier	 Message In
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
MessageIn	TokenNameIdentifier	 Message In
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// callback expired; nothing to do 	TokenNameCOMMENT_LINE	callback expired; nothing to do 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<=	TokenNameLESS_EQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
receive	TokenNameIdentifier	 receive
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Received connection from newer protocol version {}. Ignoring message"	TokenNameStringLiteral	Received connection from newer protocol version {}. Ignoring message
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// reset version here, since we set when starting an incoming socket 	TokenNameCOMMENT_LINE	reset version here, since we set when starting an incoming socket 
if	TokenNameif	
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resetVersion	TokenNameIdentifier	 reset Version
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"error closing socket"	TokenNameStringLiteral	error closing socket
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
stream	TokenNameIdentifier	 stream
(	TokenNameLPAREN	
StreamHeader	TokenNameIdentifier	 Stream Header
streamHeader	TokenNameIdentifier	 stream Header
,	TokenNameCOMMA	
DataInputStream	TokenNameIdentifier	 Data Input Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
new	TokenNamenew	
IncomingStreamReader	TokenNameIdentifier	 Incoming Stream Reader
(	TokenNameLPAREN	
streamHeader	TokenNameIdentifier	 stream Header
,	TokenNameCOMMA	
socket	TokenNameIdentifier	 socket
)	TokenNameRPAREN	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
