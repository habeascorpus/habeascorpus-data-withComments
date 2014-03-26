/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
security	TokenNameIdentifier	 security
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
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
security	TokenNameIdentifier	 security
.	TokenNameDOT	
KeyStore	TokenNameIdentifier	 Key Store
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ssl	TokenNameIdentifier	 ssl
.	TokenNameDOT	
KeyManagerFactory	TokenNameIdentifier	 Key Manager Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ssl	TokenNameIdentifier	 ssl
.	TokenNameDOT	
SSLContext	TokenNameIdentifier	 SSL Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ssl	TokenNameIdentifier	 ssl
.	TokenNameDOT	
SSLServerSocket	TokenNameIdentifier	 SSL Server Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ssl	TokenNameIdentifier	 ssl
.	TokenNameDOT	
SSLSocket	TokenNameIdentifier	 SSL Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ssl	TokenNameIdentifier	 ssl
.	TokenNameDOT	
TrustManagerFactory	TokenNameIdentifier	 Trust Manager Factory
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
EncryptionOptions	TokenNameIdentifier	 Encryption Options
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
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Sets	TokenNameIdentifier	 Sets
;	TokenNameSEMICOLON	
/** * A Factory for providing and setting up Client and Server SSL wrapped * Socket and ServerSocket */	TokenNameCOMMENT_JAVADOC	 A Factory for providing and setting up Client and Server SSL wrapped Socket and ServerSocket 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SSLFactory	TokenNameIdentifier	 SSL Factory
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
SSLFactory	TokenNameIdentifier	 SSL Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
SSLServerSocket	TokenNameIdentifier	 SSL Server Socket
getServerSocket	TokenNameIdentifier	 get Server Socket
(	TokenNameLPAREN	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SSLContext	TokenNameIdentifier	 SSL Context
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
createSSLContext	TokenNameIdentifier	 create SSL Context
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSLServerSocket	TokenNameIdentifier	 SSL Server Socket
serverSocket	TokenNameIdentifier	 server Socket
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SSLServerSocket	TokenNameIdentifier	 SSL Server Socket
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getServerSocketFactory	TokenNameIdentifier	 get Server Socket Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createServerSocket	TokenNameIdentifier	 create Server Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
setReuseAddress	TokenNameIdentifier	 set Reuse Address
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
suits	TokenNameIdentifier	 suits
=	TokenNameEQUAL	
filterCipherSuites	TokenNameIdentifier	 filter Cipher Suites
(	TokenNameLPAREN	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
getSupportedCipherSuites	TokenNameIdentifier	 get Supported Cipher Suites
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
cipher_suites	TokenNameIdentifier	 cipher suites
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
setEnabledCipherSuites	TokenNameIdentifier	 set Enabled Cipher Suites
(	TokenNameLPAREN	
suits	TokenNameIdentifier	 suits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
bind	TokenNameIdentifier	 bind
(	TokenNameLPAREN	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
serverSocket	TokenNameIdentifier	 server Socket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a socket and connect */	TokenNameCOMMENT_JAVADOC	 Create a socket and connect 
public	TokenNamepublic	
static	TokenNamestatic	
SSLSocket	TokenNameIdentifier	 SSL Socket
getSocket	TokenNameIdentifier	 get Socket
(	TokenNameLPAREN	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
localAddress	TokenNameIdentifier	 local Address
,	TokenNameCOMMA	
int	TokenNameint	
localPort	TokenNameIdentifier	 local Port
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SSLContext	TokenNameIdentifier	 SSL Context
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
createSSLContext	TokenNameIdentifier	 create SSL Context
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSLSocket	TokenNameIdentifier	 SSL Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SSLSocket	TokenNameIdentifier	 SSL Socket
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getSocketFactory	TokenNameIdentifier	 get Socket Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createSocket	TokenNameIdentifier	 create Socket
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
localAddress	TokenNameIdentifier	 local Address
,	TokenNameCOMMA	
localPort	TokenNameIdentifier	 local Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
suits	TokenNameIdentifier	 suits
=	TokenNameEQUAL	
filterCipherSuites	TokenNameIdentifier	 filter Cipher Suites
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getSupportedCipherSuites	TokenNameIdentifier	 get Supported Cipher Suites
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
cipher_suites	TokenNameIdentifier	 cipher suites
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setEnabledCipherSuites	TokenNameIdentifier	 set Enabled Cipher Suites
(	TokenNameLPAREN	
suits	TokenNameIdentifier	 suits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a socket and connect, using any local address */	TokenNameCOMMENT_JAVADOC	 Create a socket and connect, using any local address 
public	TokenNamepublic	
static	TokenNamestatic	
SSLSocket	TokenNameIdentifier	 SSL Socket
getSocket	TokenNameIdentifier	 get Socket
(	TokenNameLPAREN	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SSLContext	TokenNameIdentifier	 SSL Context
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
createSSLContext	TokenNameIdentifier	 create SSL Context
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSLSocket	TokenNameIdentifier	 SSL Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SSLSocket	TokenNameIdentifier	 SSL Socket
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getSocketFactory	TokenNameIdentifier	 get Socket Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createSocket	TokenNameIdentifier	 create Socket
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
suits	TokenNameIdentifier	 suits
=	TokenNameEQUAL	
filterCipherSuites	TokenNameIdentifier	 filter Cipher Suites
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getSupportedCipherSuites	TokenNameIdentifier	 get Supported Cipher Suites
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
cipher_suites	TokenNameIdentifier	 cipher suites
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setEnabledCipherSuites	TokenNameIdentifier	 set Enabled Cipher Suites
(	TokenNameLPAREN	
suits	TokenNameIdentifier	 suits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Just create a socket */	TokenNameCOMMENT_JAVADOC	 Just create a socket 
public	TokenNamepublic	
static	TokenNamestatic	
SSLSocket	TokenNameIdentifier	 SSL Socket
getSocket	TokenNameIdentifier	 get Socket
(	TokenNameLPAREN	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SSLContext	TokenNameIdentifier	 SSL Context
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
createSSLContext	TokenNameIdentifier	 create SSL Context
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSLSocket	TokenNameIdentifier	 SSL Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SSLSocket	TokenNameIdentifier	 SSL Socket
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getSocketFactory	TokenNameIdentifier	 get Socket Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createSocket	TokenNameIdentifier	 create Socket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
suits	TokenNameIdentifier	 suits
=	TokenNameEQUAL	
filterCipherSuites	TokenNameIdentifier	 filter Cipher Suites
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getSupportedCipherSuites	TokenNameIdentifier	 get Supported Cipher Suites
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
cipher_suites	TokenNameIdentifier	 cipher suites
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
setEnabledCipherSuites	TokenNameIdentifier	 set Enabled Cipher Suites
(	TokenNameLPAREN	
suits	TokenNameIdentifier	 suits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
SSLContext	TokenNameIdentifier	 SSL Context
createSSLContext	TokenNameIdentifier	 create SSL Context
(	TokenNameLPAREN	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
tsf	TokenNameIdentifier	 tsf
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
truststore	TokenNameIdentifier	 truststore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
ksf	TokenNameIdentifier	 ksf
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
keystore	TokenNameIdentifier	 keystore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSLContext	TokenNameIdentifier	 SSL Context
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
SSLContext	TokenNameIdentifier	 SSL Context
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TrustManagerFactory	TokenNameIdentifier	 Trust Manager Factory
tmf	TokenNameIdentifier	 tmf
;	TokenNameSEMICOLON	
KeyManagerFactory	TokenNameIdentifier	 Key Manager Factory
kmf	TokenNameIdentifier	 kmf
;	TokenNameSEMICOLON	
tmf	TokenNameIdentifier	 tmf
=	TokenNameEQUAL	
TrustManagerFactory	TokenNameIdentifier	 Trust Manager Factory
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
KeyStore	TokenNameIdentifier	 Key Store
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
KeyStore	TokenNameIdentifier	 Key Store
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
store_type	TokenNameIdentifier	 store type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
tsf	TokenNameIdentifier	 tsf
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
truststore_password	TokenNameIdentifier	 truststore password
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmf	TokenNameIdentifier	 tmf
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kmf	TokenNameIdentifier	 kmf
=	TokenNameEQUAL	
KeyManagerFactory	TokenNameIdentifier	 Key Manager Factory
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
algorithm	TokenNameIdentifier	 algorithm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
KeyStore	TokenNameIdentifier	 Key Store
ks	TokenNameIdentifier	 ks
=	TokenNameEQUAL	
KeyStore	TokenNameIdentifier	 Key Store
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
store_type	TokenNameIdentifier	 store type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ks	TokenNameIdentifier	 ks
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
ksf	TokenNameIdentifier	 ksf
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
keystore_password	TokenNameIdentifier	 keystore password
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kmf	TokenNameIdentifier	 kmf
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
keystore_password	TokenNameIdentifier	 keystore password
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
kmf	TokenNameIdentifier	 kmf
.	TokenNameDOT	
getKeyManagers	TokenNameIdentifier	 get Key Managers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tmf	TokenNameIdentifier	 tmf
.	TokenNameDOT	
getTrustManagers	TokenNameIdentifier	 get Trust Managers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Error creating the initializing the SSL Context"	TokenNameStringLiteral	Error creating the initializing the SSL Context
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
tsf	TokenNameIdentifier	 tsf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
ksf	TokenNameIdentifier	 ksf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filterCipherSuites	TokenNameIdentifier	 filter Cipher Suites
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
supported	TokenNameIdentifier	 supported
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
desired	TokenNameIdentifier	 desired
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
des	TokenNameIdentifier	 des
=	TokenNameEQUAL	
Sets	TokenNameIdentifier	 Sets
.	TokenNameDOT	
newHashSet	TokenNameIdentifier	 new Hash Set
(	TokenNameLPAREN	
desired	TokenNameIdentifier	 desired
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
toReturn	TokenNameIdentifier	 to Return
=	TokenNameEQUAL	
Sets	TokenNameIdentifier	 Sets
.	TokenNameDOT	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
Sets	TokenNameIdentifier	 Sets
.	TokenNameDOT	
newHashSet	TokenNameIdentifier	 new Hash Set
(	TokenNameLPAREN	
supported	TokenNameIdentifier	 supported
)	TokenNameRPAREN	
,	TokenNameCOMMA	
des	TokenNameIdentifier	 des
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
des	TokenNameIdentifier	 des
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
toReturn	TokenNameIdentifier	 to Return
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Filtering out {} as it isnt supported by the socket"	TokenNameStringLiteral	Filtering out {} as it isnt supported by the socket
,	TokenNameCOMMA	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
Sets	TokenNameIdentifier	 Sets
.	TokenNameDOT	
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
des	TokenNameIdentifier	 des
,	TokenNameCOMMA	
toReturn	TokenNameIdentifier	 to Return
)	TokenNameRPAREN	
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toReturn	TokenNameIdentifier	 to Return
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
toReturn	TokenNameIdentifier	 to Return
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
