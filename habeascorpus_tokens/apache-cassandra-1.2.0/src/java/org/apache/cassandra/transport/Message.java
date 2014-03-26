/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EnumSet	TokenNameIdentifier	 Enum Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UUID	TokenNameIdentifier	 UUID
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
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
oneone	TokenNameIdentifier	 oneone
.	TokenNameDOT	
OneToOneDecoder	TokenNameIdentifier	 One To One Decoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
oneone	TokenNameIdentifier	 oneone
.	TokenNameDOT	
OneToOneEncoder	TokenNameIdentifier	 One To One Encoder
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
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
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
service	TokenNameIdentifier	 service
.	TokenNameDOT	
QueryState	TokenNameIdentifier	 Query State
;	TokenNameSEMICOLON	
/** * A message from the CQL binary protocol. */	TokenNameCOMMENT_JAVADOC	 A message from the CQL binary protocol. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Message	TokenNameIdentifier	 Message
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
M	TokenNameIdentifier	 M
extends	TokenNameextends	
Message	TokenNameIdentifier	 Message
>	TokenNameGREATER	
extends	TokenNameextends	
CBCodec	TokenNameIdentifier	 CB Codec
<	TokenNameLESS	
M	TokenNameIdentifier	 M
>	TokenNameGREATER	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
Direction	TokenNameIdentifier	 Direction
{	TokenNameLBRACE	
REQUEST	TokenNameIdentifier	 REQUEST
,	TokenNameCOMMA	
RESPONSE	TokenNameIdentifier	 RESPONSE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Direction	TokenNameIdentifier	 Direction
extractFromVersion	TokenNameIdentifier	 extract From Version
(	TokenNameLPAREN	
int	TokenNameint	
versionWithDirection	TokenNameIdentifier	 version With Direction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
versionWithDirection	TokenNameIdentifier	 version With Direction
&	TokenNameAND	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
REQUEST	TokenNameIdentifier	 REQUEST
:	TokenNameCOLON	
RESPONSE	TokenNameIdentifier	 RESPONSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
addToVersion	TokenNameIdentifier	 add To Version
(	TokenNameLPAREN	
int	TokenNameint	
rawVersion	TokenNameIdentifier	 raw Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
REQUEST	TokenNameIdentifier	 REQUEST
?	TokenNameQUESTION	
(	TokenNameLPAREN	
rawVersion	TokenNameIdentifier	 raw Version
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
rawVersion	TokenNameIdentifier	 raw Version
|	TokenNameOR	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
ERROR	TokenNameIdentifier	 ERROR
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
RESPONSE	TokenNameIdentifier	 RESPONSE
,	TokenNameCOMMA	
ErrorMessage	TokenNameIdentifier	 Error Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
STARTUP	TokenNameIdentifier	 STARTUP
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
REQUEST	TokenNameIdentifier	 REQUEST
,	TokenNameCOMMA	
StartupMessage	TokenNameIdentifier	 Startup Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
READY	TokenNameIdentifier	 READY
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
RESPONSE	TokenNameIdentifier	 RESPONSE
,	TokenNameCOMMA	
ReadyMessage	TokenNameIdentifier	 Ready Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
AUTHENTICATE	TokenNameIdentifier	 AUTHENTICATE
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
RESPONSE	TokenNameIdentifier	 RESPONSE
,	TokenNameCOMMA	
AuthenticateMessage	TokenNameIdentifier	 Authenticate Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CREDENTIALS	TokenNameIdentifier	 CREDENTIALS
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
REQUEST	TokenNameIdentifier	 REQUEST
,	TokenNameCOMMA	
CredentialsMessage	TokenNameIdentifier	 Credentials Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OPTIONS	TokenNameIdentifier	 OPTIONS
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
REQUEST	TokenNameIdentifier	 REQUEST
,	TokenNameCOMMA	
OptionsMessage	TokenNameIdentifier	 Options Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SUPPORTED	TokenNameIdentifier	 SUPPORTED
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
RESPONSE	TokenNameIdentifier	 RESPONSE
,	TokenNameCOMMA	
SupportedMessage	TokenNameIdentifier	 Supported Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
QUERY	TokenNameIdentifier	 QUERY
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
REQUEST	TokenNameIdentifier	 REQUEST
,	TokenNameCOMMA	
QueryMessage	TokenNameIdentifier	 Query Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RESULT	TokenNameIdentifier	 RESULT
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
RESPONSE	TokenNameIdentifier	 RESPONSE
,	TokenNameCOMMA	
ResultMessage	TokenNameIdentifier	 Result Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
PREPARE	TokenNameIdentifier	 PREPARE
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
REQUEST	TokenNameIdentifier	 REQUEST
,	TokenNameCOMMA	
PrepareMessage	TokenNameIdentifier	 Prepare Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
EXECUTE	TokenNameIdentifier	 EXECUTE
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
REQUEST	TokenNameIdentifier	 REQUEST
,	TokenNameCOMMA	
ExecuteMessage	TokenNameIdentifier	 Execute Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
REGISTER	TokenNameIdentifier	 REGISTER
(	TokenNameLPAREN	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
REQUEST	TokenNameIdentifier	 REQUEST
,	TokenNameCOMMA	
RegisterMessage	TokenNameIdentifier	 Register Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
,	TokenNameCOMMA	
EVENT	TokenNameIdentifier	 EVENT
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
RESPONSE	TokenNameIdentifier	 RESPONSE
,	TokenNameCOMMA	
EventMessage	TokenNameIdentifier	 Event Message
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
opcode	TokenNameIdentifier	 opcode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Direction	TokenNameIdentifier	 Direction
direction	TokenNameIdentifier	 direction
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
codec	TokenNameIdentifier	 codec
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
opcodeIdx	TokenNameIdentifier	 opcode Idx
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
int	TokenNameint	
maxOpcode	TokenNameIdentifier	 max Opcode
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
:	TokenNameCOLON	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
maxOpcode	TokenNameIdentifier	 max Opcode
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxOpcode	TokenNameIdentifier	 max Opcode
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
opcode	TokenNameIdentifier	 opcode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opcodeIdx	TokenNameIdentifier	 opcode Idx
=	TokenNameEQUAL	
new	TokenNamenew	
Type	TokenNameIdentifier	 Type
[	TokenNameLBRACKET	
maxOpcode	TokenNameIdentifier	 max Opcode
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
:	TokenNameCOLON	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
opcodeIdx	TokenNameIdentifier	 opcode Idx
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
opcode	TokenNameIdentifier	 opcode
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Duplicate opcode"	TokenNameStringLiteral	Duplicate opcode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opcodeIdx	TokenNameIdentifier	 opcode Idx
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
opcode	TokenNameIdentifier	 opcode
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
int	TokenNameint	
opcode	TokenNameIdentifier	 opcode
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
direction	TokenNameIdentifier	 direction
,	TokenNameCOMMA	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
opcode	TokenNameIdentifier	 opcode
=	TokenNameEQUAL	
opcode	TokenNameIdentifier	 opcode
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
direction	TokenNameIdentifier	 direction
=	TokenNameEQUAL	
direction	TokenNameIdentifier	 direction
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
=	TokenNameEQUAL	
codec	TokenNameIdentifier	 codec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Type	TokenNameIdentifier	 Type
fromOpcode	TokenNameIdentifier	 from Opcode
(	TokenNameLPAREN	
int	TokenNameint	
opcode	TokenNameIdentifier	 opcode
,	TokenNameCOMMA	
Direction	TokenNameIdentifier	 Direction
direction	TokenNameIdentifier	 direction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Type	TokenNameIdentifier	 Type
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
opcodeIdx	TokenNameIdentifier	 opcode Idx
[	TokenNameLBRACKET	
opcode	TokenNameIdentifier	 opcode
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Unknown opcode %d"	TokenNameStringLiteral	Unknown opcode %d
,	TokenNameCOMMA	
opcode	TokenNameIdentifier	 opcode
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
direction	TokenNameIdentifier	 direction
!=	TokenNameNOT_EQUAL	
direction	TokenNameIdentifier	 direction
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Wrong protocol direction (expected %s, got %s) for opcode %d (%s)"	TokenNameStringLiteral	Wrong protocol direction (expected %s, got %s) for opcode %d (%s)
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
direction	TokenNameIdentifier	 direction
,	TokenNameCOMMA	
direction	TokenNameIdentifier	 direction
,	TokenNameCOMMA	
opcode	TokenNameIdentifier	 opcode
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
volatile	TokenNamevolatile	
Connection	TokenNameIdentifier	 Connection
connection	TokenNameIdentifier	 connection
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
streamId	TokenNameIdentifier	 stream Id
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Message	TokenNameIdentifier	 Message
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
attach	TokenNameIdentifier	 attach
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
connection	TokenNameIdentifier	 connection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Connection	TokenNameIdentifier	 Connection
connection	TokenNameIdentifier	 connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
connection	TokenNameIdentifier	 connection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Message	TokenNameIdentifier	 Message
setStreamId	TokenNameIdentifier	 set Stream Id
(	TokenNameLPAREN	
int	TokenNameint	
streamId	TokenNameIdentifier	 stream Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
streamId	TokenNameIdentifier	 stream Id
=	TokenNameEQUAL	
streamId	TokenNameIdentifier	 stream Id
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getStreamId	TokenNameIdentifier	 get Stream Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
streamId	TokenNameIdentifier	 stream Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
Request	TokenNameIdentifier	 Request
extends	TokenNameextends	
Message	TokenNameIdentifier	 Message
{	TokenNameLBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
tracingRequested	TokenNameIdentifier	 tracing Requested
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Request	TokenNameIdentifier	 Request
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
direction	TokenNameIdentifier	 direction
!=	TokenNameNOT_EQUAL	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
REQUEST	TokenNameIdentifier	 REQUEST
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
Response	TokenNameIdentifier	 Response
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
QueryState	TokenNameIdentifier	 Query State
queryState	TokenNameIdentifier	 query State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setTracingRequested	TokenNameIdentifier	 set Tracing Requested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tracingRequested	TokenNameIdentifier	 tracing Requested
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isTracingRequested	TokenNameIdentifier	 is Tracing Requested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tracingRequested	TokenNameIdentifier	 tracing Requested
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
Response	TokenNameIdentifier	 Response
extends	TokenNameextends	
Message	TokenNameIdentifier	 Message
{	TokenNameLBRACE	
protected	TokenNameprotected	
UUID	TokenNameIdentifier	 UUID
tracingId	TokenNameIdentifier	 tracing Id
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Response	TokenNameIdentifier	 Response
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
direction	TokenNameIdentifier	 direction
!=	TokenNameNOT_EQUAL	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
RESPONSE	TokenNameIdentifier	 RESPONSE
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Message	TokenNameIdentifier	 Message
setTracingId	TokenNameIdentifier	 set Tracing Id
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
tracingId	TokenNameIdentifier	 tracing Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tracingId	TokenNameIdentifier	 tracing Id
=	TokenNameEQUAL	
tracingId	TokenNameIdentifier	 tracing Id
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
UUID	TokenNameIdentifier	 UUID
getTracingId	TokenNameIdentifier	 get Tracing Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tracingId	TokenNameIdentifier	 tracing Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ProtocolDecoder	TokenNameIdentifier	 Protocol Decoder
extends	TokenNameextends	
OneToOneDecoder	TokenNameIdentifier	 One To One Decoder
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
ChannelHandlerContext	TokenNameIdentifier	 Channel Handler Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Channel	TokenNameIdentifier	 Channel
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
msg	TokenNameIdentifier	 msg
instanceof	TokenNameinstanceof	
Frame	TokenNameIdentifier	 Frame
:	TokenNameCOLON	
"Expecting frame, got "	TokenNameStringLiteral	Expecting frame, got 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
Frame	TokenNameIdentifier	 Frame
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Frame	TokenNameIdentifier	 Frame
)	TokenNameRPAREN	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isRequest	TokenNameIdentifier	 is Request
=	TokenNameEQUAL	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
direction	TokenNameIdentifier	 direction
==	TokenNameEQUAL_EQUAL	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
REQUEST	TokenNameIdentifier	 REQUEST
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isTracing	TokenNameIdentifier	 is Tracing
=	TokenNameEQUAL	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Frame	TokenNameIdentifier	 Frame
.	TokenNameDOT	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
TRACING	TokenNameIdentifier	 TRACING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUID	TokenNameIdentifier	 UUID
tracingId	TokenNameIdentifier	 tracing Id
=	TokenNameEQUAL	
isRequest	TokenNameIdentifier	 is Request
||	TokenNameOR_OR	
!	TokenNameNOT	
isTracing	TokenNameIdentifier	 is Tracing
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readUuid	TokenNameIdentifier	 read Uuid
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Message	TokenNameIdentifier	 Message
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
setStreamId	TokenNameIdentifier	 set Stream Id
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
streamId	TokenNameIdentifier	 stream Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isRequest	TokenNameIdentifier	 is Request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
message	TokenNameIdentifier	 message
instanceof	TokenNameinstanceof	
Request	TokenNameIdentifier	 Request
;	TokenNameSEMICOLON	
Request	TokenNameIdentifier	 Request
req	TokenNameIdentifier	 req
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Request	TokenNameIdentifier	 Request
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
req	TokenNameIdentifier	 req
.	TokenNameDOT	
attach	TokenNameIdentifier	 attach
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isTracing	TokenNameIdentifier	 is Tracing
)	TokenNameRPAREN	
req	TokenNameIdentifier	 req
.	TokenNameDOT	
setTracingRequested	TokenNameIdentifier	 set Tracing Requested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
message	TokenNameIdentifier	 message
instanceof	TokenNameinstanceof	
Response	TokenNameIdentifier	 Response
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isTracing	TokenNameIdentifier	 is Tracing
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Response	TokenNameIdentifier	 Response
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
.	TokenNameDOT	
setTracingId	TokenNameIdentifier	 set Tracing Id
(	TokenNameLPAREN	
tracingId	TokenNameIdentifier	 tracing Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ProtocolEncoder	TokenNameIdentifier	 Protocol Encoder
extends	TokenNameextends	
OneToOneEncoder	TokenNameIdentifier	 One To One Encoder
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ChannelHandlerContext	TokenNameIdentifier	 Channel Handler Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Channel	TokenNameIdentifier	 Channel
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
msg	TokenNameIdentifier	 msg
instanceof	TokenNameinstanceof	
Message	TokenNameIdentifier	 Message
:	TokenNameCOLON	
"Expecting message, got "	TokenNameStringLiteral	Expecting message, got 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
Message	TokenNameIdentifier	 Message
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
)	TokenNameRPAREN	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Frame	TokenNameIdentifier	 Frame
.	TokenNameDOT	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
>	TokenNameGREATER	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
noneOf	TokenNameIdentifier	 none Of
(	TokenNameLPAREN	
Frame	TokenNameIdentifier	 Frame
.	TokenNameDOT	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
instanceof	TokenNameinstanceof	
Response	TokenNameIdentifier	 Response
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
tracingId	TokenNameIdentifier	 tracing Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Response	TokenNameIdentifier	 Response
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
.	TokenNameDOT	
getTracingId	TokenNameIdentifier	 get Tracing Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tracingId	TokenNameIdentifier	 tracing Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
body	TokenNameIdentifier	 body
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
uuidToCB	TokenNameIdentifier	 uuid To CB
(	TokenNameLPAREN	
tracingId	TokenNameIdentifier	 tracing Id
)	TokenNameRPAREN	
,	TokenNameCOMMA	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Frame	TokenNameIdentifier	 Frame
.	TokenNameDOT	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
TRACING	TokenNameIdentifier	 TRACING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
message	TokenNameIdentifier	 message
instanceof	TokenNameinstanceof	
Request	TokenNameIdentifier	 Request
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Request	TokenNameIdentifier	 Request
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
.	TokenNameDOT	
isTracingRequested	TokenNameIdentifier	 is Tracing Requested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Frame	TokenNameIdentifier	 Frame
.	TokenNameDOT	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
TRACING	TokenNameIdentifier	 TRACING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Frame	TokenNameIdentifier	 Frame
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
getStreamId	TokenNameIdentifier	 get Stream Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
body	TokenNameIdentifier	 body
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Dispatcher	TokenNameIdentifier	 Dispatcher
extends	TokenNameextends	
SimpleChannelUpstreamHandler	TokenNameIdentifier	 Simple Channel Upstream Handler
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
messageReceived	TokenNameIdentifier	 message Received
(	TokenNameLPAREN	
ChannelHandlerContext	TokenNameIdentifier	 Channel Handler Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
MessageEvent	TokenNameIdentifier	 Message Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Message	TokenNameIdentifier	 Message
:	TokenNameCOLON	
"Expecting message, got "	TokenNameStringLiteral	Expecting message, got 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Response	TokenNameIdentifier	 Response
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
"Invalid response message received, expecting requests"	TokenNameStringLiteral	Invalid response message received, expecting requests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Request	TokenNameIdentifier	 Request
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Request	TokenNameIdentifier	 Request
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assert	TokenNameassert	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
ServerConnection	TokenNameIdentifier	 Server Connection
;	TokenNameSEMICOLON	
ServerConnection	TokenNameIdentifier	 Server Connection
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ServerConnection	TokenNameIdentifier	 Server Connection
)	TokenNameRPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
validateNewMessage	TokenNameIdentifier	 validate New Message
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Received: "	TokenNameStringLiteral	Received: 
+	TokenNamePLUS	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Response	TokenNameIdentifier	 Response
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
getQueryState	TokenNameIdentifier	 get Query State
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getStreamId	TokenNameIdentifier	 get Stream Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
setStreamId	TokenNameIdentifier	 set Stream Id
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getStreamId	TokenNameIdentifier	 get Stream Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
attach	TokenNameIdentifier	 attach
(	TokenNameLPAREN	
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
applyStateTransition	TokenNameIdentifier	 apply State Transition
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Responding: "	TokenNameStringLiteral	Responding: 
+	TokenNamePLUS	
response	TokenNameIdentifier	 response
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't let the exception propagate to exceptionCaught() if we can help it so that we can assign the right streamID. 	TokenNameCOMMENT_LINE	Don't let the exception propagate to exceptionCaught() if we can help it so that we can assign the right streamID. 
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ErrorMessage	TokenNameIdentifier	 Error Message
.	TokenNameDOT	
fromException	TokenNameIdentifier	 from Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
.	TokenNameDOT	
setStreamId	TokenNameIdentifier	 set Stream Id
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getStreamId	TokenNameIdentifier	 get Stream Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
exceptionCaught	TokenNameIdentifier	 exception Caught
(	TokenNameLPAREN	
final	TokenNamefinal	
ChannelHandlerContext	TokenNameIdentifier	 Channel Handler Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
ExceptionEvent	TokenNameIdentifier	 Exception Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isOpen	TokenNameIdentifier	 is Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelFuture	TokenNameIdentifier	 Channel Future
future	TokenNameIdentifier	 future
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ErrorMessage	TokenNameIdentifier	 Error Message
.	TokenNameDOT	
fromException	TokenNameIdentifier	 from Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// On protocol exception, close the channel as soon as the message have been sent 	TokenNameCOMMENT_LINE	On protocol exception, close the channel as soon as the message have been sent 
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
ProtocolException	TokenNameIdentifier	 Protocol Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
future	TokenNameIdentifier	 future
.	TokenNameDOT	
addListener	TokenNameIdentifier	 add Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ChannelFutureListener	TokenNameIdentifier	 Channel Future Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
operationComplete	TokenNameIdentifier	 operation Complete
(	TokenNameLPAREN	
ChannelFuture	TokenNameIdentifier	 Channel Future
future	TokenNameIdentifier	 future
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
