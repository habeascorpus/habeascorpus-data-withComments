/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
SocketException	TokenNameIdentifier	 Socket Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TNonblockingServerSocket	TokenNameIdentifier	 T Nonblocking Server Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TNonblockingSocket	TokenNameIdentifier	 T Nonblocking Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TTransportException	TokenNameIdentifier	 T Transport Exception
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
public	TokenNamepublic	
class	TokenNameclass	
TCustomNonblockingServerSocket	TokenNameIdentifier	 T Custom Nonblocking Server Socket
extends	TokenNameextends	
TNonblockingServerSocket	TokenNameIdentifier	 T Nonblocking Server Socket
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
TCustomNonblockingServerSocket	TokenNameIdentifier	 T Custom Nonblocking Server Socket
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
keepAlive	TokenNameIdentifier	 keep Alive
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
sendBufferSize	TokenNameIdentifier	 send Buffer Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
recvBufferSize	TokenNameIdentifier	 recv Buffer Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TCustomNonblockingServerSocket	TokenNameIdentifier	 T Custom Nonblocking Server Socket
(	TokenNameLPAREN	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
bindAddr	TokenNameIdentifier	 bind Addr
,	TokenNameCOMMA	
boolean	TokenNameboolean	
keepAlive	TokenNameIdentifier	 keep Alive
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
sendBufferSize	TokenNameIdentifier	 send Buffer Size
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
recvBufferSize	TokenNameIdentifier	 recv Buffer Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
TTransportException	TokenNameIdentifier	 T Transport Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
bindAddr	TokenNameIdentifier	 bind Addr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keepAlive	TokenNameIdentifier	 keep Alive
=	TokenNameEQUAL	
keepAlive	TokenNameIdentifier	 keep Alive
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sendBufferSize	TokenNameIdentifier	 send Buffer Size
=	TokenNameEQUAL	
sendBufferSize	TokenNameIdentifier	 send Buffer Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
recvBufferSize	TokenNameIdentifier	 recv Buffer Size
=	TokenNameEQUAL	
recvBufferSize	TokenNameIdentifier	 recv Buffer Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TNonblockingSocket	TokenNameIdentifier	 T Nonblocking Socket
acceptImpl	TokenNameIdentifier	 accept Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TTransportException	TokenNameIdentifier	 T Transport Exception
{	TokenNameLBRACE	
TNonblockingSocket	TokenNameIdentifier	 T Nonblocking Socket
tsocket	TokenNameIdentifier	 tsocket
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
acceptImpl	TokenNameIdentifier	 accept Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tsocket	TokenNameIdentifier	 tsocket
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
tsocket	TokenNameIdentifier	 tsocket
.	TokenNameDOT	
getSocketChannel	TokenNameIdentifier	 get Socket Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
tsocket	TokenNameIdentifier	 tsocket
;	TokenNameSEMICOLON	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
tsocket	TokenNameIdentifier	 tsocket
.	TokenNameDOT	
getSocketChannel	TokenNameIdentifier	 get Socket Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
socket	TokenNameIdentifier	 socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Any existing connection we had from this remote socket must be done now, so reset it 	TokenNameCOMMENT_LINE	Any existing connection we had from this remote socket must be done now, so reset it 
ThriftSessionManager	TokenNameIdentifier	 Thrift Session Manager
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
connectionComplete	TokenNameIdentifier	 connection Complete
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getRemoteSocketAddress	TokenNameIdentifier	 get Remote Socket Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setKeepAlive	TokenNameIdentifier	 set Keep Alive
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
keepAlive	TokenNameIdentifier	 keep Alive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Failed to set keep-alive on Thrift socket."	TokenNameStringLiteral	Failed to set keep-alive on Thrift socket.
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
sendBufferSize	TokenNameIdentifier	 send Buffer Size
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setSendBufferSize	TokenNameIdentifier	 set Send Buffer Size
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
sendBufferSize	TokenNameIdentifier	 send Buffer Size
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Failed to set send buffer size on Thrift socket."	TokenNameStringLiteral	Failed to set send buffer size on Thrift socket.
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
recvBufferSize	TokenNameIdentifier	 recv Buffer Size
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setReceiveBufferSize	TokenNameIdentifier	 set Receive Buffer Size
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
recvBufferSize	TokenNameIdentifier	 recv Buffer Size
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Failed to set receive buffer size on Thrift socket."	TokenNameStringLiteral	Failed to set receive buffer size on Thrift socket.
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
tsocket	TokenNameIdentifier	 tsocket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
