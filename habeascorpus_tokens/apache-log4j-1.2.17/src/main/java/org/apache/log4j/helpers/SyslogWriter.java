/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
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
DatagramPacket	TokenNameIdentifier	 Datagram Packet
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
/** SyslogWriter is a wrapper around the java.net.DatagramSocket class so that it behaves like a java.io.Writer. @since 0.7.3 */	TokenNameCOMMENT_JAVADOC	 SyslogWriter is a wrapper around the java.net.DatagramSocket class so that it behaves like a java.io.Writer. @since 0.7.3 
public	TokenNamepublic	
class	TokenNameclass	
SyslogWriter	TokenNameIdentifier	 Syslog Writer
extends	TokenNameextends	
Writer	TokenNameIdentifier	 Writer
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
SYSLOG_PORT	TokenNameIdentifier	 SYSLOG  PORT
=	TokenNameEQUAL	
514	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Host string from last constructed SyslogWriter. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Host string from last constructed SyslogWriter. @deprecated 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
syslogHost	TokenNameIdentifier	 syslog Host
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
ds	TokenNameIdentifier	 ds
;	TokenNameSEMICOLON	
/** * Constructs a new instance of SyslogWriter. * @param syslogHost host name, may not be null. A port * may be specified by following the name or IPv4 literal address with * a colon and a decimal port number. To specify a port with an IPv6 * address, enclose the IPv6 address in square brackets before appending * the colon and decimal port number. */	TokenNameCOMMENT_JAVADOC	 Constructs a new instance of SyslogWriter. @param syslogHost host name, may not be null. A port may be specified by following the name or IPv4 literal address with a colon and a decimal port number. To specify a port with an IPv6 address, enclose the IPv6 address in square brackets before appending the colon and decimal port number. 
public	TokenNamepublic	
SyslogWriter	TokenNameIdentifier	 Syslog Writer
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
syslogHost	TokenNameIdentifier	 syslog Host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyslogWriter	TokenNameIdentifier	 Syslog Writer
.	TokenNameDOT	
syslogHost	TokenNameIdentifier	 syslog Host
=	TokenNameEQUAL	
syslogHost	TokenNameIdentifier	 syslog Host
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
syslogHost	TokenNameIdentifier	 syslog Host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"syslogHost"	TokenNameStringLiteral	syslogHost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
syslogHost	TokenNameIdentifier	 syslog Host
;	TokenNameSEMICOLON	
int	TokenNameint	
urlPort	TokenNameIdentifier	 url Port
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// If not an unbracketed IPv6 address then 	TokenNameCOMMENT_LINE	If not an unbracketed IPv6 address then 
// parse as a URL 	TokenNameCOMMENT_LINE	parse as a URL 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
"http://"	TokenNameStringLiteral	http://
+	TokenNamePLUS	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if host is a IPv6 literal, strip off the brackets 	TokenNameCOMMENT_LINE	if host is a IPv6 literal, strip off the brackets 
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
urlPort	TokenNameIdentifier	 url Port
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Malformed URL: will attempt to interpret as InetAddress."	TokenNameStringLiteral	Malformed URL: will attempt to interpret as InetAddress.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
urlPort	TokenNameIdentifier	 url Port
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
urlPort	TokenNameIdentifier	 url Port
=	TokenNameEQUAL	
SYSLOG_PORT	TokenNameIdentifier	 SYSLOG  PORT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
urlPort	TokenNameIdentifier	 url Port
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
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
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not find "	TokenNameStringLiteral	Could not find 
+	TokenNamePLUS	
host	TokenNameIdentifier	 host
+	TokenNamePLUS	
". All logging will FAIL."	TokenNameStringLiteral	. All logging will FAIL.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SocketException	TokenNameIdentifier	 Socket Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not instantiate DatagramSocket to "	TokenNameStringLiteral	Could not instantiate DatagramSocket to 
+	TokenNamePLUS	
host	TokenNameIdentifier	 host
+	TokenNamePLUS	
". All logging will FAIL."	TokenNameStringLiteral	. All logging will FAIL.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ds	TokenNameIdentifier	 ds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
address	TokenNameIdentifier	 address
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// syslog packets must be less than 1024 bytes 	TokenNameCOMMENT_LINE	syslog packets must be less than 1024 bytes 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
bytesLength	TokenNameIdentifier	 bytes Length
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytesLength	TokenNameIdentifier	 bytes Length
>=	TokenNameGREATER_EQUAL	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesLength	TokenNameIdentifier	 bytes Length
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DatagramPacket	TokenNameIdentifier	 Datagram Packet
packet	TokenNameIdentifier	 packet
=	TokenNameEQUAL	
new	TokenNamenew	
DatagramPacket	TokenNameIdentifier	 Datagram Packet
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytesLength	TokenNameIdentifier	 bytes Length
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
