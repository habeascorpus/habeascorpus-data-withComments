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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EnumSet	TokenNameIdentifier	 Enum Set
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
jboss	TokenNameIdentifier	 jboss
.	TokenNameDOT	
netty	TokenNameIdentifier	 netty
.	TokenNameDOT	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
frame	TokenNameIdentifier	 frame
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
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Frame	TokenNameIdentifier	 Frame
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Header	TokenNameIdentifier	 Header
header	TokenNameIdentifier	 header
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Connection	TokenNameIdentifier	 Connection
connection	TokenNameIdentifier	 connection
;	TokenNameSEMICOLON	
/** * On-wire frame. * Frames are defined as: * * 0 8 16 24 32 * +---------+---------+---------+---------+ * | version | flags | stream | opcode | * +---------+---------+---------+---------+ * | length | * +---------+---------+---------+---------+ */	TokenNameCOMMENT_JAVADOC	 On-wire frame. Frames are defined as: * 0 8 16 24 32 +---------+---------+---------+---------+ | version | flags | stream | opcode | +---------+---------+---------+---------+ | length | +---------+---------+---------+---------+ 
private	TokenNameprivate	
Frame	TokenNameIdentifier	 Frame
(	TokenNameLPAREN	
Header	TokenNameIdentifier	 Header
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
,	TokenNameCOMMA	
Connection	TokenNameIdentifier	 Connection
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
header	TokenNameIdentifier	 header
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
body	TokenNameIdentifier	 body
=	TokenNameEQUAL	
body	TokenNameIdentifier	 body
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
connection	TokenNameIdentifier	 connection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Frame	TokenNameIdentifier	 Frame
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
fullFrame	TokenNameIdentifier	 full Frame
,	TokenNameCOMMA	
Connection	TokenNameIdentifier	 Connection
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
fullFrame	TokenNameIdentifier	 full Frame
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
LENGTH	TokenNameIdentifier	 LENGTH
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Frame too short (%d bytes = %s)"	TokenNameStringLiteral	Frame too short (%d bytes = %s)
,	TokenNameCOMMA	
fullFrame	TokenNameIdentifier	 full Frame
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
fullFrame	TokenNameIdentifier	 full Frame
.	TokenNameDOT	
toByteBuffer	TokenNameIdentifier	 to Byte Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
fullFrame	TokenNameIdentifier	 full Frame
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
fullFrame	TokenNameIdentifier	 full Frame
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
streamId	TokenNameIdentifier	 stream Id
=	TokenNameEQUAL	
fullFrame	TokenNameIdentifier	 full Frame
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opcode	TokenNameIdentifier	 opcode
=	TokenNameEQUAL	
fullFrame	TokenNameIdentifier	 full Frame
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fullFrame	TokenNameIdentifier	 full Frame
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fullFrame	TokenNameIdentifier	 full Frame
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// version first byte is the "direction" of the frame (request or response) 	TokenNameCOMMENT_LINE	version first byte is the "direction" of the frame (request or response) 
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Direction	TokenNameIdentifier	 Direction
direction	TokenNameIdentifier	 direction
=	TokenNameEQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
extractFromVersion	TokenNameIdentifier	 extract From Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Header	TokenNameIdentifier	 Header
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
new	TokenNamenew	
Header	TokenNameIdentifier	 Header
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
streamId	TokenNameIdentifier	 stream Id
,	TokenNameCOMMA	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
fromOpcode	TokenNameIdentifier	 from Opcode
(	TokenNameLPAREN	
opcode	TokenNameIdentifier	 opcode
,	TokenNameCOMMA	
direction	TokenNameIdentifier	 direction
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Frame	TokenNameIdentifier	 Frame
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
fullFrame	TokenNameIdentifier	 full Frame
,	TokenNameCOMMA	
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Frame	TokenNameIdentifier	 Frame
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
streamId	TokenNameIdentifier	 stream Id
,	TokenNameCOMMA	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
>	TokenNameGREATER	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
,	TokenNameCOMMA	
Connection	TokenNameIdentifier	 Connection
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Header	TokenNameIdentifier	 Header
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
new	TokenNamenew	
Header	TokenNameIdentifier	 Header
(	TokenNameLPAREN	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
CURRENT_VERSION	TokenNameIdentifier	 CURRENT  VERSION
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
streamId	TokenNameIdentifier	 stream Id
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Frame	TokenNameIdentifier	 Frame
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
body	TokenNameIdentifier	 body
,	TokenNameCOMMA	
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Header	TokenNameIdentifier	 Header
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LENGTH	TokenNameIdentifier	 LENGTH
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CURRENT_VERSION	TokenNameIdentifier	 CURRENT  VERSION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Flag	TokenNameIdentifier	 Flag
>	TokenNameGREATER	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
streamId	TokenNameIdentifier	 stream Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Header	TokenNameIdentifier	 Header
(	TokenNameLPAREN	
int	TokenNameint	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
int	TokenNameint	
streamId	TokenNameIdentifier	 stream Id
,	TokenNameCOMMA	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
,	TokenNameCOMMA	
streamId	TokenNameIdentifier	 stream Id
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Header	TokenNameIdentifier	 Header
(	TokenNameLPAREN	
int	TokenNameint	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Flag	TokenNameIdentifier	 Flag
>	TokenNameGREATER	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
int	TokenNameint	
streamId	TokenNameIdentifier	 stream Id
,	TokenNameCOMMA	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
streamId	TokenNameIdentifier	 stream Id
=	TokenNameEQUAL	
streamId	TokenNameIdentifier	 stream Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Flag	TokenNameIdentifier	 Flag
{	TokenNameLBRACE	
// The order of that enum matters!! 	TokenNameCOMMENT_LINE	The order of that enum matters!! 
COMPRESSED	TokenNameIdentifier	 COMPRESSED
,	TokenNameCOMMA	
TRACING	TokenNameIdentifier	 TRACING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Flag	TokenNameIdentifier	 Flag
>	TokenNameGREATER	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Flag	TokenNameIdentifier	 Flag
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
noneOf	TokenNameIdentifier	 none Of
(	TokenNameLPAREN	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Flag	TokenNameIdentifier	 Flag
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
set	TokenNameIdentifier	 set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Flag	TokenNameIdentifier	 Flag
>	TokenNameGREATER	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Flag	TokenNameIdentifier	 Flag
flag	TokenNameIdentifier	 flag
:	TokenNameCOLON	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
flag	TokenNameIdentifier	 flag
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Frame	TokenNameIdentifier	 Frame
with	TokenNameIdentifier	 with
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
newBody	TokenNameIdentifier	 new Body
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Frame	TokenNameIdentifier	 Frame
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
newBody	TokenNameIdentifier	 new Body
,	TokenNameCOMMA	
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Decoder	TokenNameIdentifier	 Decoder
extends	TokenNameextends	
LengthFieldBasedFrameDecoder	TokenNameIdentifier	 Length Field Based Frame Decoder
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_FRAME_LENTH	TokenNameIdentifier	 MAX  FRAME  LENTH
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 256 MB 	TokenNameCOMMENT_LINE	256 MB 
private	TokenNameprivate	
final	TokenNamefinal	
Connection	TokenNameIdentifier	 Connection
connection	TokenNameIdentifier	 connection
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Decoder	TokenNameIdentifier	 Decoder
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
.	TokenNameDOT	
Tracker	TokenNameIdentifier	 Tracker
tracker	TokenNameIdentifier	 tracker
,	TokenNameCOMMA	
Connection	TokenNameIdentifier	 Connection
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
MAX_FRAME_LENTH	TokenNameIdentifier	 MAX  FRAME  LENTH
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newConnection	TokenNameIdentifier	 new Connection
(	TokenNameLPAREN	
tracker	TokenNameIdentifier	 tracker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
channelOpen	TokenNameIdentifier	 channel Open
(	TokenNameLPAREN	
ChannelHandlerContext	TokenNameIdentifier	 Channel Handler Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
ChannelStateEvent	TokenNameIdentifier	 Channel State Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
registerChannel	TokenNameIdentifier	 register Channel
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
ChannelHandlerContext	TokenNameIdentifier	 Channel Handler Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Channel	TokenNameIdentifier	 Channel
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// We must at least validate that the frame version is something we support/know and it doesn't hurt to 	TokenNameCOMMENT_LINE	We must at least validate that the frame version is something we support/know and it doesn't hurt to 
// check the opcode is not garbage. And we should do that indenpently of what is the the bytes corresponding 	TokenNameCOMMENT_LINE	check the opcode is not garbage. And we should do that indenpently of what is the the bytes corresponding 
// to the frame length are, i.e. we shouldn't wait for super.decode() to return non-null. 	TokenNameCOMMENT_LINE	to the frame length are, i.e. we shouldn't wait for super.decode() to return non-null. 
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstByte	TokenNameIdentifier	 first Byte
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getByte	TokenNameIdentifier	 get Byte
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Direction	TokenNameIdentifier	 Direction
direction	TokenNameIdentifier	 direction
=	TokenNameEQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Direction	TokenNameIdentifier	 Direction
.	TokenNameDOT	
extractFromVersion	TokenNameIdentifier	 extract From Version
(	TokenNameLPAREN	
firstByte	TokenNameIdentifier	 first Byte
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
firstByte	TokenNameIdentifier	 first Byte
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// We really only support the current version so far 	TokenNameCOMMENT_LINE	We really only support the current version so far 
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
CURRENT_VERSION	TokenNameIdentifier	 CURRENT  VERSION
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
"Invalid or unsupported protocol version: "	TokenNameStringLiteral	Invalid or unsupported protocol version: 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Validate the opcode 	TokenNameCOMMENT_LINE	Validate the opcode 
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
fromOpcode	TokenNameIdentifier	 from Opcode
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getByte	TokenNameIdentifier	 get Byte
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
direction	TokenNameIdentifier	 direction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
channel	TokenNameIdentifier	 channel
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Frame	TokenNameIdentifier	 Frame
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
,	TokenNameCOMMA	
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CorruptedFrameException	TokenNameIdentifier	 Corrupted Frame Exception
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
TooLongFrameException	TokenNameIdentifier	 Too Long Frame Exception
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Encoder	TokenNameIdentifier	 Encoder
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
Frame	TokenNameIdentifier	 Frame
.	TokenNameDOT	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
LENGTH	TokenNameIdentifier	 LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
direction	TokenNameIdentifier	 direction
.	TokenNameDOT	
addToVersion	TokenNameIdentifier	 add To Version
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
streamId	TokenNameIdentifier	 stream Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
opcode	TokenNameIdentifier	 opcode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readableBytes	TokenNameIdentifier	 readable Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
wrappedBuffer	TokenNameIdentifier	 wrapped Buffer
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Decompressor	TokenNameIdentifier	 Decompressor
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
COMPRESSED	TokenNameIdentifier	 COMPRESSED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
frame	TokenNameIdentifier	 frame
;	TokenNameSEMICOLON	
FrameCompressor	TokenNameIdentifier	 Frame Compressor
compressor	TokenNameIdentifier	 compressor
=	TokenNameEQUAL	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
getCompressor	TokenNameIdentifier	 get Compressor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compressor	TokenNameIdentifier	 compressor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
frame	TokenNameIdentifier	 frame
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compressor	TokenNameIdentifier	 compressor
.	TokenNameDOT	
decompress	TokenNameIdentifier	 decompress
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Compressor	TokenNameIdentifier	 Compressor
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
// Never compress STARTUP messages 	TokenNameCOMMENT_LINE	Never compress STARTUP messages 
if	TokenNameif	
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Message	TokenNameIdentifier	 Message
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STARTUP	TokenNameIdentifier	 STARTUP
||	TokenNameOR_OR	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
frame	TokenNameIdentifier	 frame
;	TokenNameSEMICOLON	
FrameCompressor	TokenNameIdentifier	 Frame Compressor
compressor	TokenNameIdentifier	 compressor
=	TokenNameEQUAL	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
getCompressor	TokenNameIdentifier	 get Compressor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compressor	TokenNameIdentifier	 compressor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
frame	TokenNameIdentifier	 frame
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Header	TokenNameIdentifier	 Header
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
COMPRESSED	TokenNameIdentifier	 COMPRESSED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compressor	TokenNameIdentifier	 compressor
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
