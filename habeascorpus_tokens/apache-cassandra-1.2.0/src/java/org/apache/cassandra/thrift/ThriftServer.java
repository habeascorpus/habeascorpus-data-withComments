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
service	TokenNameIdentifier	 service
.	TokenNameDOT	
CassandraDaemon	TokenNameIdentifier	 Cassandra Daemon
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
TFramedTransport	TokenNameIdentifier	 T Framed Transport
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ThriftServer	TokenNameIdentifier	 Thrift Server
implements	TokenNameimplements	
CassandraDaemon	TokenNameIdentifier	 Cassandra Daemon
.	TokenNameDOT	
Server	TokenNameIdentifier	 Server
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
ThriftServer	TokenNameIdentifier	 Thrift Server
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
SYNC	TokenNameIdentifier	 SYNC
=	TokenNameEQUAL	
"sync"	TokenNameStringLiteral	sync
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ASYNC	TokenNameIdentifier	 ASYNC
=	TokenNameEQUAL	
"async"	TokenNameStringLiteral	async
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
HSHA	TokenNameIdentifier	 HSHA
=	TokenNameEQUAL	
"hsha"	TokenNameStringLiteral	hsha
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
ThriftServerThread	TokenNameIdentifier	 Thrift Server Thread
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ThriftServer	TokenNameIdentifier	 Thrift Server
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
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
ThriftServerThread	TokenNameIdentifier	 Thrift Server Thread
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
stopServer	TokenNameIdentifier	 stop Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Interrupted while waiting thrift server to stop"	TokenNameStringLiteral	Interrupted while waiting thrift server to stop
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isRunning	TokenNameIdentifier	 is Running
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
server	TokenNameIdentifier	 server
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Simple class to run the thrift connection accepting code in separate * thread of control. */	TokenNameCOMMENT_JAVADOC	 Simple class to run the thrift connection accepting code in separate thread of control. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ThriftServerThread	TokenNameIdentifier	 Thrift Server Thread
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
TServer	TokenNameIdentifier	 T Server
serverEngine	TokenNameIdentifier	 server Engine
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ThriftServerThread	TokenNameIdentifier	 Thrift Server Thread
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
listenAddr	TokenNameIdentifier	 listen Addr
,	TokenNameCOMMA	
int	TokenNameint	
listenPort	TokenNameIdentifier	 listen Port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// now we start listening for clients 	TokenNameCOMMENT_LINE	now we start listening for clients 
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Binding thrift service to %s:%s"	TokenNameStringLiteral	Binding thrift service to %s:%s
,	TokenNameCOMMA	
listenAddr	TokenNameIdentifier	 listen Addr
,	TokenNameCOMMA	
listenPort	TokenNameIdentifier	 listen Port
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TServerFactory	TokenNameIdentifier	 T Server Factory
.	TokenNameDOT	
Args	TokenNameIdentifier	 Args
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
TServerFactory	TokenNameIdentifier	 T Server Factory
.	TokenNameDOT	
Args	TokenNameIdentifier	 Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
tProtocolFactory	TokenNameIdentifier	 t Protocol Factory
=	TokenNameEQUAL	
new	TokenNamenew	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getThriftMaxMessageLength	TokenNameIdentifier	 get Thrift Max Message Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
addr	TokenNameIdentifier	 addr
=	TokenNameEQUAL	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
listenAddr	TokenNameIdentifier	 listen Addr
,	TokenNameCOMMA	
listenPort	TokenNameIdentifier	 listen Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
cassandraServer	TokenNameIdentifier	 cassandra Server
=	TokenNameEQUAL	
new	TokenNamenew	
CassandraServer	TokenNameIdentifier	 Cassandra Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
=	TokenNameEQUAL	
new	TokenNamenew	
Cassandra	TokenNameIdentifier	 Cassandra
.	TokenNameDOT	
Processor	TokenNameIdentifier	 Processor
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
cassandraServer	TokenNameIdentifier	 cassandra Server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
keepAlive	TokenNameIdentifier	 keep Alive
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getRpcKeepAlive	TokenNameIdentifier	 get Rpc Keep Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
sendBufferSize	TokenNameIdentifier	 send Buffer Size
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getRpcSendBufferSize	TokenNameIdentifier	 get Rpc Send Buffer Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
recvBufferSize	TokenNameIdentifier	 recv Buffer Size
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getRpcRecvBufferSize	TokenNameIdentifier	 get Rpc Recv Buffer Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tFramedTransportSize	TokenNameIdentifier	 t Framed Transport Size
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getThriftFramedTransportSize	TokenNameIdentifier	 get Thrift Framed Transport Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Using TFramedTransport with a max frame size of {} bytes."	TokenNameStringLiteral	Using TFramedTransport with a max frame size of {} bytes.
,	TokenNameCOMMA	
tFramedTransportSize	TokenNameIdentifier	 t Framed Transport Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
inTransportFactory	TokenNameIdentifier	 in Transport Factory
=	TokenNameEQUAL	
new	TokenNamenew	
TFramedTransport	TokenNameIdentifier	 T Framed Transport
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
tFramedTransportSize	TokenNameIdentifier	 t Framed Transport Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
outTransportFactory	TokenNameIdentifier	 out Transport Factory
=	TokenNameEQUAL	
new	TokenNamenew	
TFramedTransport	TokenNameIdentifier	 T Framed Transport
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
tFramedTransportSize	TokenNameIdentifier	 t Framed Transport Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serverEngine	TokenNameIdentifier	 server Engine
=	TokenNameEQUAL	
new	TokenNamenew	
TServerCustomFactory	TokenNameIdentifier	 T Server Custom Factory
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getRpcServerType	TokenNameIdentifier	 get Rpc Server Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
buildTServer	TokenNameIdentifier	 build T Server
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Listening for thrift clients..."	TokenNameStringLiteral	Listening for thrift clients...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serverEngine	TokenNameIdentifier	 server Engine
.	TokenNameDOT	
serve	TokenNameIdentifier	 serve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
stopServer	TokenNameIdentifier	 stop Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Stop listening to thrift clients"	TokenNameStringLiteral	Stop listening to thrift clients
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serverEngine	TokenNameIdentifier	 server Engine
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
