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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TServerTransport	TokenNameIdentifier	 T Server Transport
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
/** * Extends Thrift's TServerSocket to allow customization of various desirable TCP properties. */	TokenNameCOMMENT_JAVADOC	 Extends Thrift's TServerSocket to allow customization of various desirable TCP properties. 
public	TokenNamepublic	
class	TokenNameclass	
TCustomServerSocket	TokenNameIdentifier	 T Custom Server Socket
extends	TokenNameextends	
TServerTransport	TokenNameIdentifier	 T Server Transport
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
TCustomServerSocket	TokenNameIdentifier	 T Custom Server Socket
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Underlying serversocket object */	TokenNameCOMMENT_JAVADOC	 Underlying serversocket object 
private	TokenNameprivate	
ServerSocket	TokenNameIdentifier	 Server Socket
serverSocket	TokenNameIdentifier	 server Socket
=	TokenNameEQUAL	
null	TokenNamenull	
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
/** * Allows fine-tuning of the server socket including keep-alive, reuse of addresses, send and receive buffer sizes. * * @param bindAddr * @param keepAlive * @param sendBufferSize * @param recvBufferSize * @throws TTransportException */	TokenNameCOMMENT_JAVADOC	 Allows fine-tuning of the server socket including keep-alive, reuse of addresses, send and receive buffer sizes. * @param bindAddr @param keepAlive @param sendBufferSize @param recvBufferSize @throws TTransportException 
public	TokenNamepublic	
TCustomServerSocket	TokenNameIdentifier	 T Custom Server Socket
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
try	TokenNametry	
{	TokenNameLBRACE	
// Make server socket 	TokenNameCOMMENT_LINE	Make server socket 
serverSocket	TokenNameIdentifier	 server Socket
=	TokenNameEQUAL	
new	TokenNamenew	
ServerSocket	TokenNameIdentifier	 Server Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Prevent 2MSL delay problem on server restarts 	TokenNameCOMMENT_LINE	Prevent 2MSL delay problem on server restarts 
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
setReuseAddress	TokenNameIdentifier	 set Reuse Address
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Bind to listening port 	TokenNameCOMMENT_LINE	Bind to listening port 
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
bind	TokenNameIdentifier	 bind
(	TokenNameLPAREN	
bindAddr	TokenNameIdentifier	 bind Addr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
serverSocket	TokenNameIdentifier	 server Socket
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TTransportException	TokenNameIdentifier	 T Transport Exception
(	TokenNameLPAREN	
"Could not create ServerSocket on address "	TokenNameStringLiteral	Could not create ServerSocket on address 
+	TokenNamePLUS	
bindAddr	TokenNameIdentifier	 bind Addr
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
TCustomServerSocket	TokenNameIdentifier	 T Custom Server Socket
(	TokenNameLPAREN	
ServerSocket	TokenNameIdentifier	 Server Socket
socket	TokenNameIdentifier	 socket
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
this	TokenNamethis	
.	TokenNameDOT	
serverSocket	TokenNameIdentifier	 server Socket
=	TokenNameEQUAL	
socket	TokenNameIdentifier	 socket
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
TCustomSocket	TokenNameIdentifier	 T Custom Socket
acceptImpl	TokenNameIdentifier	 accept Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TTransportException	TokenNameIdentifier	 T Transport Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
serverSocket	TokenNameIdentifier	 server Socket
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TTransportException	TokenNameIdentifier	 T Transport Exception
(	TokenNameLPAREN	
TTransportException	TokenNameIdentifier	 T Transport Exception
.	TokenNameDOT	
NOT_OPEN	TokenNameIdentifier	 NOT  OPEN
,	TokenNameCOMMA	
"No underlying server socket."	TokenNameStringLiteral	No underlying server socket.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TCustomSocket	TokenNameIdentifier	 T Custom Socket
tsocket	TokenNameIdentifier	 tsocket
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
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
tsocket	TokenNameIdentifier	 tsocket
=	TokenNameEQUAL	
new	TokenNamenew	
TCustomSocket	TokenNameIdentifier	 T Custom Socket
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tsocket	TokenNameIdentifier	 tsocket
.	TokenNameDOT	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
iox	TokenNameIdentifier	 iox
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TTransportException	TokenNameIdentifier	 T Transport Exception
(	TokenNameLPAREN	
iox	TokenNameIdentifier	 iox
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
listen	TokenNameIdentifier	 listen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TTransportException	TokenNameIdentifier	 T Transport Exception
{	TokenNameLBRACE	
// Make sure not to block on accept 	TokenNameCOMMENT_LINE	Make sure not to block on accept 
if	TokenNameif	
(	TokenNameLPAREN	
serverSocket	TokenNameIdentifier	 server Socket
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
setSoTimeout	TokenNameIdentifier	 set So Timeout
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not set socket timeout."	TokenNameStringLiteral	Could not set socket timeout.
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
serverSocket	TokenNameIdentifier	 server Socket
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
IOException	TokenNameIdentifier	 IO Exception
iox	TokenNameIdentifier	 iox
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not close server socket."	TokenNameStringLiteral	Could not close server socket.
,	TokenNameCOMMA	
iox	TokenNameIdentifier	 iox
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
serverSocket	TokenNameIdentifier	 server Socket
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The thread-safeness of this is dubious, but Java documentation suggests 	TokenNameCOMMENT_LINE	The thread-safeness of this is dubious, but Java documentation suggests 
// that it is safe to do this from a different thread context 	TokenNameCOMMENT_LINE	that it is safe to do this from a different thread context 
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
