/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
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
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
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
ClientState	TokenNameIdentifier	 Client State
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
QueryState	TokenNameIdentifier	 Query State
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
SemanticVersion	TokenNameIdentifier	 Semantic Version
;	TokenNameSEMICOLON	
/** * The initial message of the protocol. * Sets up a number of connection options. */	TokenNameCOMMENT_JAVADOC	 The initial message of the protocol. Sets up a number of connection options. 
public	TokenNamepublic	
class	TokenNameclass	
StartupMessage	TokenNameIdentifier	 Startup Message
extends	TokenNameextends	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Request	TokenNameIdentifier	 Request
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CQL_VERSION	TokenNameIdentifier	 CQL  VERSION
=	TokenNameEQUAL	
"CQL_VERSION"	TokenNameStringLiteral	CQL_VERSION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPRESSION	TokenNameIdentifier	 COMPRESSION
=	TokenNameEQUAL	
"COMPRESSION"	TokenNameStringLiteral	COMPRESSION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
StartupMessage	TokenNameIdentifier	 Startup Message
>	TokenNameGREATER	
codec	TokenNameIdentifier	 codec
=	TokenNameEQUAL	
new	TokenNamenew	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
StartupMessage	TokenNameIdentifier	 Startup Message
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
StartupMessage	TokenNameIdentifier	 Startup Message
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StartupMessage	TokenNameIdentifier	 Startup Message
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readStringMap	TokenNameIdentifier	 read String Map
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
StartupMessage	TokenNameIdentifier	 Startup Message
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
dynamicBuffer	TokenNameIdentifier	 dynamic Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
writeStringMap	TokenNameIdentifier	 write String Map
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StartupMessage	TokenNameIdentifier	 Startup Message
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STARTUP	TokenNameIdentifier	 STARTUP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Response	TokenNameIdentifier	 Response
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
QueryState	TokenNameIdentifier	 Query State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClientState	TokenNameIdentifier	 Client State
cState	TokenNameIdentifier	 c State
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getClientState	TokenNameIdentifier	 get Client State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
cqlVersion	TokenNameIdentifier	 cql Version
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CQL_VERSION	TokenNameIdentifier	 CQL  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cqlVersion	TokenNameIdentifier	 cql Version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
"Missing value CQL_VERSION in STARTUP message"	TokenNameStringLiteral	Missing value CQL_VERSION in STARTUP message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
cState	TokenNameIdentifier	 c State
.	TokenNameDOT	
setCQLVersion	TokenNameIdentifier	 set CQL Version
(	TokenNameLPAREN	
cqlVersion	TokenNameIdentifier	 cql Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cState	TokenNameIdentifier	 c State
.	TokenNameDOT	
getCQLVersion	TokenNameIdentifier	 get CQL Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"2.99.0"	TokenNameStringLiteral	2.99.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"CQL version %s is not supported by the binary protocol (supported version are >= 3.0.0)"	TokenNameStringLiteral	CQL version %s is not supported by the binary protocol (supported version are >= 3.0.0)
,	TokenNameCOMMA	
cqlVersion	TokenNameIdentifier	 cql Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
COMPRESSION	TokenNameIdentifier	 COMPRESSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
compression	TokenNameIdentifier	 compression
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
COMPRESSION	TokenNameIdentifier	 COMPRESSION
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compression	TokenNameIdentifier	 compression
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"snappy"	TokenNameStringLiteral	snappy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
FrameCompressor	TokenNameIdentifier	 Frame Compressor
.	TokenNameDOT	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
"This instance does not support Snappy compression"	TokenNameStringLiteral	This instance does not support Snappy compression
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
setCompressor	TokenNameIdentifier	 set Compressor
(	TokenNameLPAREN	
FrameCompressor	TokenNameIdentifier	 Frame Compressor
.	TokenNameDOT	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Unknown compression algorithm: %s"	TokenNameStringLiteral	Unknown compression algorithm: %s
,	TokenNameCOMMA	
compression	TokenNameIdentifier	 compression
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthenticator	TokenNameIdentifier	 get Authenticator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
requireAuthentication	TokenNameIdentifier	 require Authentication
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
AuthenticateMessage	TokenNameIdentifier	 Authenticate Message
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getAuthenticator	TokenNameIdentifier	 get Authenticator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
ReadyMessage	TokenNameIdentifier	 Ready Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"STARTUP "	TokenNameStringLiteral	STARTUP 
+	TokenNamePLUS	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
