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
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
TNonblockingServer	TokenNameIdentifier	 T Nonblocking Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
TServer	TokenNameIdentifier	 T Server
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
TNonblockingServerTransport	TokenNameIdentifier	 T Nonblocking Server Transport
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
public	TokenNamepublic	
class	TokenNameclass	
CustomTNonBlockingServer	TokenNameIdentifier	 Custom T Non Blocking Server
extends	TokenNameextends	
TNonblockingServer	TokenNameIdentifier	 T Nonblocking Server
{	TokenNameLBRACE	
public	TokenNamepublic	
CustomTNonBlockingServer	TokenNameIdentifier	 Custom T Non Blocking Server
(	TokenNameLPAREN	
Args	TokenNameIdentifier	 Args
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
requestInvoke	TokenNameIdentifier	 request Invoke
(	TokenNameLPAREN	
FrameBuffer	TokenNameIdentifier	 Frame Buffer
frameBuffer	TokenNameIdentifier	 frame Buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TNonblockingSocket	TokenNameIdentifier	 T Nonblocking Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TNonblockingSocket	TokenNameIdentifier	 T Nonblocking Socket
)	TokenNameRPAREN	
frameBuffer	TokenNameIdentifier	 frame Buffer
.	TokenNameDOT	
trans_	TokenNameIdentifier	 trans
;	TokenNameSEMICOLON	
ThriftSessionManager	TokenNameIdentifier	 Thrift Session Manager
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
setCurrentSocket	TokenNameIdentifier	 set Current Socket
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getSocketChannel	TokenNameIdentifier	 get Socket Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
socket	TokenNameIdentifier	 socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRemoteSocketAddress	TokenNameIdentifier	 get Remote Socket Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frameBuffer	TokenNameIdentifier	 frame Buffer
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Factory	TokenNameIdentifier	 Factory
implements	TokenNameimplements	
TServerFactory	TokenNameIdentifier	 T Server Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
TServer	TokenNameIdentifier	 T Server
buildTServer	TokenNameIdentifier	 build T Server
(	TokenNameLPAREN	
Args	TokenNameIdentifier	 Args
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getClientEncryptionOptions	TokenNameIdentifier	 get Client Encryption Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
enabled	TokenNameIdentifier	 enabled
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Client SSL is not supported for non-blocking sockets. Please remove client ssl from the configuration."	TokenNameStringLiteral	Client SSL is not supported for non-blocking sockets. Please remove client ssl from the configuration.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
addr	TokenNameIdentifier	 addr
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
addr	TokenNameIdentifier	 addr
;	TokenNameSEMICOLON	
TNonblockingServerTransport	TokenNameIdentifier	 T Nonblocking Server Transport
serverTransport	TokenNameIdentifier	 server Transport
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
serverTransport	TokenNameIdentifier	 server Transport
=	TokenNameEQUAL	
new	TokenNamenew	
TCustomNonblockingServerSocket	TokenNameIdentifier	 T Custom Nonblocking Server Socket
(	TokenNameLPAREN	
addr	TokenNameIdentifier	 addr
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
keepAlive	TokenNameIdentifier	 keep Alive
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
sendBufferSize	TokenNameIdentifier	 send Buffer Size
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
recvBufferSize	TokenNameIdentifier	 recv Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TTransportException	TokenNameIdentifier	 T Transport Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Unable to create thrift socket to %s:%s"	TokenNameStringLiteral	Unable to create thrift socket to %s:%s
,	TokenNameCOMMA	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This is single threaded hence the invocation will be all 	TokenNameCOMMENT_LINE	This is single threaded hence the invocation will be all 
// in one thread. 	TokenNameCOMMENT_LINE	in one thread. 
TNonblockingServer	TokenNameIdentifier	 T Nonblocking Server
.	TokenNameDOT	
Args	TokenNameIdentifier	 Args
serverArgs	TokenNameIdentifier	 server Args
=	TokenNameEQUAL	
new	TokenNamenew	
TNonblockingServer	TokenNameIdentifier	 T Nonblocking Server
.	TokenNameDOT	
Args	TokenNameIdentifier	 Args
(	TokenNameLPAREN	
serverTransport	TokenNameIdentifier	 server Transport
)	TokenNameRPAREN	
.	TokenNameDOT	
inputTransportFactory	TokenNameIdentifier	 input Transport Factory
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
inTransportFactory	TokenNameIdentifier	 in Transport Factory
)	TokenNameRPAREN	
.	TokenNameDOT	
outputTransportFactory	TokenNameIdentifier	 output Transport Factory
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
outTransportFactory	TokenNameIdentifier	 out Transport Factory
)	TokenNameRPAREN	
.	TokenNameDOT	
inputProtocolFactory	TokenNameIdentifier	 input Protocol Factory
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
tProtocolFactory	TokenNameIdentifier	 t Protocol Factory
)	TokenNameRPAREN	
.	TokenNameDOT	
outputProtocolFactory	TokenNameIdentifier	 output Protocol Factory
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
tProtocolFactory	TokenNameIdentifier	 t Protocol Factory
)	TokenNameRPAREN	
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CustomTNonBlockingServer	TokenNameIdentifier	 Custom T Non Blocking Server
(	TokenNameLPAREN	
serverArgs	TokenNameIdentifier	 server Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
