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
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
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
TIOStreamTransport	TokenNameIdentifier	 TIO Stream Transport
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
/** * Socket implementation of the TTransport interface. * * Adds socket buffering * */	TokenNameCOMMENT_JAVADOC	 Socket implementation of the TTransport interface. * Adds socket buffering 
public	TokenNamepublic	
class	TokenNameclass	
TCustomSocket	TokenNameIdentifier	 T Custom Socket
extends	TokenNameextends	
TIOStreamTransport	TokenNameIdentifier	 TIO Stream Transport
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
LOGGER	TokenNameIdentifier	 LOGGER
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
TCustomSocket	TokenNameIdentifier	 T Custom Socket
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Wrapped Socket object */	TokenNameCOMMENT_JAVADOC	 Wrapped Socket object 
private	TokenNameprivate	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Remote host */	TokenNameCOMMENT_JAVADOC	 Remote host 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Remote port */	TokenNameCOMMENT_JAVADOC	 Remote port 
private	TokenNameprivate	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Socket timeout */	TokenNameCOMMENT_JAVADOC	 Socket timeout 
private	TokenNameprivate	
int	TokenNameint	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructor that takes an already created socket. * * @param socket Already created socket object * @throws TTransportException if there is an error setting up the streams */	TokenNameCOMMENT_JAVADOC	 Constructor that takes an already created socket. * @param socket Already created socket object @throws TTransportException if there is an error setting up the streams 
public	TokenNamepublic	
TCustomSocket	TokenNameIdentifier	 T Custom Socket
(	TokenNameLPAREN	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
)	TokenNameRPAREN	
throws	TokenNamethrows	
TTransportException	TokenNameIdentifier	 T Transport Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setSoLinger	TokenNameIdentifier	 set So Linger
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setTcpNoDelay	TokenNameIdentifier	 set Tcp No Delay
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOGGER	TokenNameIdentifier	 LOGGER
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not configure socket."	TokenNameStringLiteral	Could not configure socket.
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isOpen	TokenNameIdentifier	 is Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
inputStream_	TokenNameIdentifier	 input Stream
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputStream_	TokenNameIdentifier	 output Stream
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
iox	TokenNameIdentifier	 iox
)	TokenNameRPAREN	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TTransportException	TokenNameIdentifier	 T Transport Exception
(	TokenNameLPAREN	
TTransportException	TokenNameIdentifier	 T Transport Exception
.	TokenNameDOT	
NOT_OPEN	TokenNameIdentifier	 NOT  OPEN
,	TokenNameCOMMA	
iox	TokenNameIdentifier	 iox
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new unconnected socket that will connect to the given host * on the given port. * * @param host Remote host * @param port Remote port */	TokenNameCOMMENT_JAVADOC	 Creates a new unconnected socket that will connect to the given host on the given port. * @param host Remote host @param port Remote port 
public	TokenNamepublic	
TCustomSocket	TokenNameIdentifier	 T Custom Socket
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new unconnected socket that will connect to the given host * on the given port. * * @param host Remote host * @param port Remote port * @param timeout Socket timeout */	TokenNameCOMMENT_JAVADOC	 Creates a new unconnected socket that will connect to the given host on the given port. * @param host Remote host @param port Remote port @param timeout Socket timeout 
public	TokenNamepublic	
TCustomSocket	TokenNameIdentifier	 T Custom Socket
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
int	TokenNameint	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
timeout	TokenNameIdentifier	 timeout
;	TokenNameSEMICOLON	
initSocket	TokenNameIdentifier	 init Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the socket object */	TokenNameCOMMENT_JAVADOC	 Initializes the socket object 
private	TokenNameprivate	
void	TokenNamevoid	
initSocket	TokenNameIdentifier	 init Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
new	TokenNamenew	
Socket	TokenNameIdentifier	 Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setSoLinger	TokenNameIdentifier	 set So Linger
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setTcpNoDelay	TokenNameIdentifier	 set Tcp No Delay
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setSoTimeout	TokenNameIdentifier	 set So Timeout
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOGGER	TokenNameIdentifier	 LOGGER
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not configure socket."	TokenNameStringLiteral	Could not configure socket.
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the socket timeout * * @param timeout Milliseconds timeout */	TokenNameCOMMENT_JAVADOC	 Sets the socket timeout * @param timeout Milliseconds timeout 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
int	TokenNameint	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
timeout	TokenNameIdentifier	 timeout
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setSoTimeout	TokenNameIdentifier	 set So Timeout
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOGGER	TokenNameIdentifier	 LOGGER
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not set socket timeout."	TokenNameStringLiteral	Could not set socket timeout.
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a reference to the underlying socket. */	TokenNameCOMMENT_JAVADOC	 Returns a reference to the underlying socket. 
public	TokenNamepublic	
Socket	TokenNameIdentifier	 Socket
getSocket	TokenNameIdentifier	 get Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initSocket	TokenNameIdentifier	 init Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the socket is connected. */	TokenNameCOMMENT_JAVADOC	 Checks whether the socket is connected. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isOpen	TokenNameIdentifier	 is Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
isConnected	TokenNameIdentifier	 is Connected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Connects the socket, creating a new socket object if necessary. */	TokenNameCOMMENT_JAVADOC	 Connects the socket, creating a new socket object if necessary. 
public	TokenNamepublic	
void	TokenNamevoid	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TTransportException	TokenNameIdentifier	 T Transport Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isOpen	TokenNameIdentifier	 is Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TTransportException	TokenNameIdentifier	 T Transport Exception
(	TokenNameLPAREN	
TTransportException	TokenNameIdentifier	 T Transport Exception
.	TokenNameDOT	
ALREADY_OPEN	TokenNameIdentifier	 ALREADY  OPEN
,	TokenNameCOMMA	
"Socket already connected."	TokenNameStringLiteral	Socket already connected.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TTransportException	TokenNameIdentifier	 T Transport Exception
(	TokenNameLPAREN	
TTransportException	TokenNameIdentifier	 T Transport Exception
.	TokenNameDOT	
NOT_OPEN	TokenNameIdentifier	 NOT  OPEN
,	TokenNameCOMMA	
"Cannot open null host."	TokenNameStringLiteral	Cannot open null host.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TTransportException	TokenNameIdentifier	 T Transport Exception
(	TokenNameLPAREN	
TTransportException	TokenNameIdentifier	 T Transport Exception
.	TokenNameDOT	
NOT_OPEN	TokenNameIdentifier	 NOT  OPEN
,	TokenNameCOMMA	
"Cannot open without port."	TokenNameStringLiteral	Cannot open without port.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initSocket	TokenNameIdentifier	 init Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inputStream_	TokenNameIdentifier	 input Stream
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputStream_	TokenNameIdentifier	 output Stream
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
iox	TokenNameIdentifier	 iox
)	TokenNameRPAREN	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TTransportException	TokenNameIdentifier	 T Transport Exception
(	TokenNameLPAREN	
TTransportException	TokenNameIdentifier	 T Transport Exception
.	TokenNameDOT	
NOT_OPEN	TokenNameIdentifier	 NOT  OPEN
,	TokenNameCOMMA	
iox	TokenNameIdentifier	 iox
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Closes the socket. */	TokenNameCOMMENT_JAVADOC	 Closes the socket. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Close the underlying streams 	TokenNameCOMMENT_LINE	Close the underlying streams 
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Close the socket 	TokenNameCOMMENT_LINE	Close the socket 
if	TokenNameif	
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
iox	TokenNameIdentifier	 iox
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOGGER	TokenNameIdentifier	 LOGGER
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not close socket."	TokenNameStringLiteral	Could not close socket.
,	TokenNameCOMMA	
iox	TokenNameIdentifier	 iox
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
