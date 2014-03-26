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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CharsetUtil	TokenNameIdentifier	 Charset Util
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
UUIDGen	TokenNameIdentifier	 UUID Gen
;	TokenNameSEMICOLON	
/** * ChannelBuffer utility methods. * Note that contrarily to ByteBufferUtil, these method do "read" the * ChannelBuffer advancing it's (read) position. They also write by * advancing the write position. Functions are also provided to create * ChannelBuffer while avoiding copies. */	TokenNameCOMMENT_JAVADOC	 ChannelBuffer utility methods. Note that contrarily to ByteBufferUtil, these method do "read" the ChannelBuffer advancing it's (read) position. They also write by advancing the write position. Functions are also provided to create ChannelBuffer while avoiding copies. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CBUtil	TokenNameIdentifier	 CB Util
{	TokenNameLBRACE	
private	TokenNameprivate	
CBUtil	TokenNameIdentifier	 CB Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
"Not enough bytes to read an UTF8 serialized string preceded by it's 2 bytes length"	TokenNameStringLiteral	Not enough bytes to read an UTF8 serialized string preceded by it's 2 bytes length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
readLongString	TokenNameIdentifier	 read Long String
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
"Not enough bytes to read an UTF8 serialized string preceded by it's 4 bytes length"	TokenNameStringLiteral	Not enough bytes to read an UTF8 serialized string preceded by it's 4 bytes length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
CharsetUtil	TokenNameIdentifier	 Charset Util
.	TokenNameDOT	
UTF_8	TokenNameIdentifier	 UTF 8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// That's the way netty encapsulate a CCE 	TokenNameCOMMENT_LINE	That's the way netty encapsulate a CCE 
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
"Cannot decode string as UTF8"	TokenNameStringLiteral	Cannot decode string as UTF8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
CharsetUtil	TokenNameIdentifier	 Charset Util
.	TokenNameDOT	
UTF_8	TokenNameIdentifier	 UTF 8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
shortToCB	TokenNameIdentifier	 short To CB
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
intToCB	TokenNameIdentifier	 int To CB
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
shortToCB	TokenNameIdentifier	 short To CB
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
bytesToCB	TokenNameIdentifier	 bytes To CB
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
shortToCB	TokenNameIdentifier	 short To CB
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
"Not enough bytes to read a byte array preceded by it's 2 bytes length"	TokenNameStringLiteral	Not enough bytes to read a byte array preceded by it's 2 bytes length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
consistencyLevelToCB	TokenNameIdentifier	 consistency Level To CB
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
consistency	TokenNameIdentifier	 consistency
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shortToCB	TokenNameIdentifier	 short To CB
(	TokenNameLPAREN	
consistency	TokenNameIdentifier	 consistency
.	TokenNameDOT	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
readConsistencyLevel	TokenNameIdentifier	 read Consistency Level
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
fromCode	TokenNameIdentifier	 from Code
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Enum	TokenNameIdentifier	 Enum
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
T	TokenNameIdentifier	 T
readEnumValue	TokenNameIdentifier	 read Enum Value
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
enumType	TokenNameIdentifier	 enum Type
,	TokenNameCOMMA	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
CBUtil	TokenNameIdentifier	 CB Util
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Enum	TokenNameIdentifier	 Enum
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
enumType	TokenNameIdentifier	 enum Type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Invalid value '%s' for %s"	TokenNameStringLiteral	Invalid value '%s' for %s
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
enumType	TokenNameIdentifier	 enum Type
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Enum	TokenNameIdentifier	 Enum
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
enumValueToCB	TokenNameIdentifier	 enum Value To CB
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
enumValue	TokenNameIdentifier	 enum Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
enumValue	TokenNameIdentifier	 enum Value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
uuidToCB	TokenNameIdentifier	 uuid To CB
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
UUID	TokenNameIdentifier	 UUID
readUuid	TokenNameIdentifier	 read Uuid
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getUUID	TokenNameIdentifier	 get UUID
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
longStringToCB	TokenNameIdentifier	 long String To CB
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
intToCB	TokenNameIdentifier	 int To CB
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
readStringList	TokenNameIdentifier	 read String List
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
writeStringList	TokenNameIdentifier	 write String List
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
:	TokenNameCOLON	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
readStringMap	TokenNameIdentifier	 read String Map
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
writeStringMap	TokenNameIdentifier	 write String Map
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
readStringToStringListMap	TokenNameIdentifier	 read String To String List Map
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
readStringList	TokenNameIdentifier	 read String List
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
writeStringToStringListMap	TokenNameIdentifier	 write String To String List Map
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
stringToCB	TokenNameIdentifier	 string To CB
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeStringList	TokenNameIdentifier	 write String List
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
readValue	TokenNameIdentifier	 read Value
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readSlice	TokenNameIdentifier	 read Slice
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
.	TokenNameDOT	
toByteBuffer	TokenNameIdentifier	 to Byte Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
readInet	TokenNameIdentifier	 read Inet
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
addrSize	TokenNameIdentifier	 addr Size
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
addrSize	TokenNameIdentifier	 addr Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByAddress	TokenNameIdentifier	 get By Address
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Invalid IP address (%d.%d.%d.%d) while deserializing inet address"	TokenNameStringLiteral	Invalid IP address (%d.%d.%d.%d) while deserializing inet address
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
inetToCB	TokenNameIdentifier	 inet To CB
(	TokenNameLPAREN	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
inet	TokenNameIdentifier	 inet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
inet	TokenNameIdentifier	 inet
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
inet	TokenNameIdentifier	 inet
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
BufferBuilder	TokenNameIdentifier	 Buffer Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffers	TokenNameIdentifier	 buffers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BufferBuilder	TokenNameIdentifier	 Buffer Builder
(	TokenNameLPAREN	
int	TokenNameint	
simpleBuffers	TokenNameIdentifier	 simple Buffers
,	TokenNameCOMMA	
int	TokenNameint	
stringBuffers	TokenNameIdentifier	 string Buffers
,	TokenNameCOMMA	
int	TokenNameint	
valueBuffers	TokenNameIdentifier	 value Buffers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
simpleBuffers	TokenNameIdentifier	 simple Buffers
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stringBuffers	TokenNameIdentifier	 string Buffers
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
valueBuffers	TokenNameIdentifier	 value Buffers
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
new	TokenNamenew	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BufferBuilder	TokenNameIdentifier	 Buffer Builder
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BufferBuilder	TokenNameIdentifier	 Buffer Builder
addString	TokenNameIdentifier	 add String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
shortToCB	TokenNameIdentifier	 short To CB
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BufferBuilder	TokenNameIdentifier	 Buffer Builder
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
intToCB	TokenNameIdentifier	 int To CB
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
EMPTY_BUFFER	TokenNameIdentifier	 EMPTY  BUFFER
:	TokenNameCOLON	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
