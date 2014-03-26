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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
WriteType	TokenNameIdentifier	 Write Type
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
*	TokenNameMULTIPLY	
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
CBUtil	TokenNameIdentifier	 CB Util
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
Message	TokenNameIdentifier	 Message
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
ProtocolException	TokenNameIdentifier	 Protocol Exception
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
ServerError	TokenNameIdentifier	 Server Error
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
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
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
MD5Digest	TokenNameIdentifier	 M D5 Digest
;	TokenNameSEMICOLON	
/** * Message to indicate an error to the client. */	TokenNameCOMMENT_JAVADOC	 Message to indicate an error to the client. 
public	TokenNamepublic	
class	TokenNameclass	
ErrorMessage	TokenNameIdentifier	 Error Message
extends	TokenNameextends	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Response	TokenNameIdentifier	 Response
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
ErrorMessage	TokenNameIdentifier	 Error Message
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
ErrorMessage	TokenNameIdentifier	 Error Message
>	TokenNameGREATER	
codec	TokenNameIdentifier	 codec
=	TokenNameEQUAL	
new	TokenNamenew	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Codec	TokenNameIdentifier	 Codec
<	TokenNameLESS	
ErrorMessage	TokenNameIdentifier	 Error Message
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
ErrorMessage	TokenNameIdentifier	 Error Message
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExceptionCode	TokenNameIdentifier	 Exception Code
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
ExceptionCode	TokenNameIdentifier	 Exception Code
.	TokenNameDOT	
fromValue	TokenNameIdentifier	 from Value
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransportException	TokenNameIdentifier	 Transport Exception
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SERVER_ERROR	TokenNameIdentifier	 SERVER  ERROR
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
ServerError	TokenNameIdentifier	 Server Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PROTOCOL_ERROR	TokenNameIdentifier	 PROTOCOL  ERROR
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
BAD_CREDENTIALS	TokenNameIdentifier	 BAD  CREDENTIALS
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
AuthenticationException	TokenNameIdentifier	 Authentication Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UNAVAILABLE	TokenNameIdentifier	 UNAVAILABLE
:	TokenNameCOLON	
{	TokenNameLBRACE	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readConsistencyLevel	TokenNameIdentifier	 read Consistency Level
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
required	TokenNameIdentifier	 required
=	TokenNameEQUAL	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
alive	TokenNameIdentifier	 alive
=	TokenNameEQUAL	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
required	TokenNameIdentifier	 required
,	TokenNameCOMMA	
alive	TokenNameIdentifier	 alive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
OVERLOADED	TokenNameIdentifier	 OVERLOADED
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
OverloadedException	TokenNameIdentifier	 Overloaded Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
IS_BOOTSTRAPPING	TokenNameIdentifier	 IS  BOOTSTRAPPING
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
IsBootstrappingException	TokenNameIdentifier	 Is Bootstrapping Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRUNCATE_ERROR	TokenNameIdentifier	 TRUNCATE  ERROR
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
TruncateException	TokenNameIdentifier	 Truncate Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WRITE_TIMEOUT	TokenNameIdentifier	 WRITE  TIMEOUT
:	TokenNameCOLON	
case	TokenNamecase	
READ_TIMEOUT	TokenNameIdentifier	 READ  TIMEOUT
:	TokenNameCOLON	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readConsistencyLevel	TokenNameIdentifier	 read Consistency Level
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
received	TokenNameIdentifier	 received
=	TokenNameEQUAL	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
blockFor	TokenNameIdentifier	 block For
=	TokenNameEQUAL	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
ExceptionCode	TokenNameIdentifier	 Exception Code
.	TokenNameDOT	
WRITE_TIMEOUT	TokenNameIdentifier	 WRITE  TIMEOUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WriteType	TokenNameIdentifier	 Write Type
writeType	TokenNameIdentifier	 write Type
=	TokenNameEQUAL	
Enum	TokenNameIdentifier	 Enum
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
WriteType	TokenNameIdentifier	 Write Type
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
WriteTimeoutException	TokenNameIdentifier	 Write Timeout Exception
(	TokenNameLPAREN	
writeType	TokenNameIdentifier	 write Type
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
received	TokenNameIdentifier	 received
,	TokenNameCOMMA	
blockFor	TokenNameIdentifier	 block For
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
byte	TokenNamebyte	
dataPresent	TokenNameIdentifier	 data Present
=	TokenNameEQUAL	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
ReadTimeoutException	TokenNameIdentifier	 Read Timeout Exception
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
received	TokenNameIdentifier	 received
,	TokenNameCOMMA	
blockFor	TokenNameIdentifier	 block For
,	TokenNameCOMMA	
dataPresent	TokenNameIdentifier	 data Present
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UNPREPARED	TokenNameIdentifier	 UNPREPARED
:	TokenNameCOLON	
{	TokenNameLBRACE	
MD5Digest	TokenNameIdentifier	 M D5 Digest
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
MD5Digest	TokenNameIdentifier	 M D5 Digest
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
PreparedQueryNotFoundException	TokenNameIdentifier	 Prepared Query Not Found Exception
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SYNTAX_ERROR	TokenNameIdentifier	 SYNTAX  ERROR
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
SyntaxException	TokenNameIdentifier	 Syntax Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UNAUTHORIZED	TokenNameIdentifier	 UNAUTHORIZED
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INVALID	TokenNameIdentifier	 INVALID
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONFIG_ERROR	TokenNameIdentifier	 CONFIG  ERROR
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ALREADY_EXISTS	TokenNameIdentifier	 ALREADY  EXISTS
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cfName	TokenNameIdentifier	 cf Name
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
AlreadyExistsException	TokenNameIdentifier	 Already Exists Exception
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
AlreadyExistsException	TokenNameIdentifier	 Already Exists Exception
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ErrorMessage	TokenNameIdentifier	 Error Message
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ErrorMessage	TokenNameIdentifier	 Error Message
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
ccb	TokenNameIdentifier	 ccb
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
intToCB	TokenNameIdentifier	 int To CB
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
code	TokenNameIdentifier	 code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
mcb	TokenNameIdentifier	 mcb
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
acb	TokenNameIdentifier	 acb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
EMPTY_BUFFER	TokenNameIdentifier	 EMPTY  BUFFER
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
code	TokenNameIdentifier	 code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
UNAVAILABLE	TokenNameIdentifier	 UNAVAILABLE
:	TokenNameCOLON	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
ue	TokenNameIdentifier	 ue
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
)	TokenNameRPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
ueCl	TokenNameIdentifier	 ue Cl
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
consistencyLevelToCB	TokenNameIdentifier	 consistency Level To CB
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
consistency	TokenNameIdentifier	 consistency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
ueCl	TokenNameIdentifier	 ue Cl
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
ueCl	TokenNameIdentifier	 ue Cl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
required	TokenNameIdentifier	 required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
alive	TokenNameIdentifier	 alive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WRITE_TIMEOUT	TokenNameIdentifier	 WRITE  TIMEOUT
:	TokenNameCOLON	
case	TokenNamecase	
READ_TIMEOUT	TokenNameIdentifier	 READ  TIMEOUT
:	TokenNameCOLON	
RequestTimeoutException	TokenNameIdentifier	 Request Timeout Exception
rte	TokenNameIdentifier	 rte
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RequestTimeoutException	TokenNameIdentifier	 Request Timeout Exception
)	TokenNameRPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isWrite	TokenNameIdentifier	 is Write
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
code	TokenNameIdentifier	 code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ExceptionCode	TokenNameIdentifier	 Exception Code
.	TokenNameDOT	
WRITE_TIMEOUT	TokenNameIdentifier	 WRITE  TIMEOUT
;	TokenNameSEMICOLON	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
rteCl	TokenNameIdentifier	 rte Cl
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
consistencyLevelToCB	TokenNameIdentifier	 consistency Level To CB
(	TokenNameLPAREN	
rte	TokenNameIdentifier	 rte
.	TokenNameDOT	
consistency	TokenNameIdentifier	 consistency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
writeType	TokenNameIdentifier	 write Type
=	TokenNameEQUAL	
isWrite	TokenNameIdentifier	 is Write
?	TokenNameQUESTION	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WriteTimeoutException	TokenNameIdentifier	 Write Timeout Exception
)	TokenNameRPAREN	
rte	TokenNameIdentifier	 rte
)	TokenNameRPAREN	
.	TokenNameDOT	
writeType	TokenNameIdentifier	 write Type
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
extraSize	TokenNameIdentifier	 extra Size
=	TokenNameEQUAL	
isWrite	TokenNameIdentifier	 is Write
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
writeType	TokenNameIdentifier	 write Type
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
rteCl	TokenNameIdentifier	 rte Cl
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
extraSize	TokenNameIdentifier	 extra Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
rteCl	TokenNameIdentifier	 rte Cl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
rte	TokenNameIdentifier	 rte
.	TokenNameDOT	
received	TokenNameIdentifier	 received
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
rte	TokenNameIdentifier	 rte
.	TokenNameDOT	
blockFor	TokenNameIdentifier	 block For
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isWrite	TokenNameIdentifier	 is Write
)	TokenNameRPAREN	
{	TokenNameLBRACE	
acb	TokenNameIdentifier	 acb
.	TokenNameDOT	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
writeType	TokenNameIdentifier	 write Type
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
writeType	TokenNameIdentifier	 write Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
acb	TokenNameIdentifier	 acb
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ReadTimeoutException	TokenNameIdentifier	 Read Timeout Exception
)	TokenNameRPAREN	
rte	TokenNameIdentifier	 rte
)	TokenNameRPAREN	
.	TokenNameDOT	
dataPresent	TokenNameIdentifier	 data Present
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UNPREPARED	TokenNameIdentifier	 UNPREPARED
:	TokenNameCOLON	
PreparedQueryNotFoundException	TokenNameIdentifier	 Prepared Query Not Found Exception
pqnfe	TokenNameIdentifier	 pqnfe
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PreparedQueryNotFoundException	TokenNameIdentifier	 Prepared Query Not Found Exception
)	TokenNameRPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
bytesToCB	TokenNameIdentifier	 bytes To CB
(	TokenNameLPAREN	
pqnfe	TokenNameIdentifier	 pqnfe
.	TokenNameDOT	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ALREADY_EXISTS	TokenNameIdentifier	 ALREADY  EXISTS
:	TokenNameCOLON	
AlreadyExistsException	TokenNameIdentifier	 Already Exists Exception
aee	TokenNameIdentifier	 aee
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AlreadyExistsException	TokenNameIdentifier	 Already Exists Exception
)	TokenNameRPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
acb	TokenNameIdentifier	 acb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
aee	TokenNameIdentifier	 aee
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
aee	TokenNameIdentifier	 aee
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
ccb	TokenNameIdentifier	 ccb
,	TokenNameCOMMA	
mcb	TokenNameIdentifier	 mcb
,	TokenNameCOMMA	
acb	TokenNameIdentifier	 acb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// We need to figure error codes out (#3979) 	TokenNameCOMMENT_LINE	We need to figure error codes out (#3979) 
public	TokenNamepublic	
final	TokenNamefinal	
TransportException	TokenNameIdentifier	 Transport Exception
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ErrorMessage	TokenNameIdentifier	 Error Message
(	TokenNameLPAREN	
TransportException	TokenNameIdentifier	 Transport Exception
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ErrorMessage	TokenNameIdentifier	 Error Message
fromException	TokenNameIdentifier	 from Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
TransportException	TokenNameIdentifier	 Transport Exception
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
ErrorMessage	TokenNameIdentifier	 Error Message
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransportException	TokenNameIdentifier	 Transport Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Unexpected exception 	TokenNameCOMMENT_LINE	Unexpected exception 
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Unexpected exception during request"	TokenNameStringLiteral	Unexpected exception during request
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ErrorMessage	TokenNameIdentifier	 Error Message
(	TokenNameLPAREN	
new	TokenNamenew	
ServerError	TokenNameIdentifier	 Server Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"ERROR "	TokenNameStringLiteral	ERROR 
+	TokenNamePLUS	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
code	TokenNameIdentifier	 code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
