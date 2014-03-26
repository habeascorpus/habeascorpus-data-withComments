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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Array	TokenNameIdentifier	 Array
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EnumMap	TokenNameIdentifier	 Enum Map
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
OptionCodec	TokenNameIdentifier	 Option Codec
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Enum	TokenNameIdentifier	 Enum
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
&	TokenNameAND	
OptionCodec	TokenNameIdentifier	 Option Codec
.	TokenNameDOT	
Codecable	TokenNameIdentifier	 Codecable
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
public	TokenNamepublic	
interface	TokenNameinterface	
Codecable	TokenNameIdentifier	 Codecable
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Enum	TokenNameIdentifier	 Enum
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
readValue	TokenNameIdentifier	 read Value
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
writeValue	TokenNameIdentifier	 write Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
serializedValueSize	TokenNameIdentifier	 serialized Value Size
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
klass	TokenNameIdentifier	 klass
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ids	TokenNameIdentifier	 ids
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
OptionCodec	TokenNameIdentifier	 Option Codec
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
klass	TokenNameIdentifier	 klass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
klass	TokenNameIdentifier	 klass
=	TokenNameEQUAL	
klass	TokenNameIdentifier	 klass
;	TokenNameSEMICOLON	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
klass	TokenNameIdentifier	 klass
.	TokenNameDOT	
getEnumConstants	TokenNameIdentifier	 get Enum Constants
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxId	TokenNameIdentifier	 max Id
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
opt	TokenNameIdentifier	 opt
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
maxId	TokenNameIdentifier	 max Id
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxId	TokenNameIdentifier	 max Id
,	TokenNameCOMMA	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ids	TokenNameIdentifier	 ids
=	TokenNameEQUAL	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
Array	TokenNameIdentifier	 Array
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
klass	TokenNameIdentifier	 klass
,	TokenNameCOMMA	
maxId	TokenNameIdentifier	 max Id
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
opt	TokenNameIdentifier	 opt
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ids	TokenNameIdentifier	 ids
[	TokenNameLBRACKET	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Duplicate option id %d"	TokenNameStringLiteral	Duplicate option id %d
,	TokenNameCOMMA	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ids	TokenNameIdentifier	 ids
[	TokenNameLBRACKET	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
opt	TokenNameIdentifier	 opt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
T	TokenNameIdentifier	 T
fromId	TokenNameIdentifier	 from Id
(	TokenNameLPAREN	
int	TokenNameint	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
ids	TokenNameIdentifier	 ids
[	TokenNameLBRACKET	
id	TokenNameIdentifier	 id
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
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
"Unknown option id %d"	TokenNameStringLiteral	Unknown option id %d
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
opt	TokenNameIdentifier	 opt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EnumMap	TokenNameIdentifier	 Enum Map
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
new	TokenNamenew	
EnumMap	TokenNameIdentifier	 Enum Map
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
klass	TokenNameIdentifier	 klass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
fromId	TokenNameIdentifier	 from Id
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
readValue	TokenNameIdentifier	 read Value
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Duplicate option %s in message"	TokenNameStringLiteral	Duplicate option %s in message
,	TokenNameCOMMA	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
optLength	TokenNameIdentifier	 opt Length
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
optLength	TokenNameIdentifier	 opt Length
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
serializedValueSize	TokenNameIdentifier	 serialized Value Size
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
optLength	TokenNameIdentifier	 opt Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
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
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
writeValue	TokenNameIdentifier	 write Value
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
decodeOne	TokenNameIdentifier	 decode One
(	TokenNameLPAREN	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
fromId	TokenNameIdentifier	 from Id
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
readValue	TokenNameIdentifier	 read Value
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
encodeOne	TokenNameIdentifier	 encode One
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
option	TokenNameIdentifier	 option
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
ChannelBuffer	TokenNameIdentifier	 Channel Buffer
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
ChannelBuffers	TokenNameIdentifier	 Channel Buffers
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
oneSerializedSize	TokenNameIdentifier	 one Serialized Size
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
writeValue	TokenNameIdentifier	 write Value
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
oneSerializedSize	TokenNameIdentifier	 one Serialized Size
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
option	TokenNameIdentifier	 option
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
serializedValueSize	TokenNameIdentifier	 serialized Value Size
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
