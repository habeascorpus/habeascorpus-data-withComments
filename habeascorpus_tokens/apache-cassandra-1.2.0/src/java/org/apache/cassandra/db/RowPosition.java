/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ISerializer	TokenNameIdentifier	 I Serializer
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
StorageService	TokenNameIdentifier	 Storage Service
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
abstract	TokenNameabstract	
class	TokenNameclass	
RowPosition	TokenNameIdentifier	 Row Position
implements	TokenNameimplements	
RingPosition	TokenNameIdentifier	 Ring Position
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Kind	TokenNameIdentifier	 Kind
{	TokenNameLBRACE	
// Only add new values to the end of the enum, the ordinal is used 	TokenNameCOMMENT_LINE	Only add new values to the end of the enum, the ordinal is used 
// during serialization 	TokenNameCOMMENT_LINE	during serialization 
ROW_KEY	TokenNameIdentifier	 ROW  KEY
,	TokenNameCOMMA	
MIN_BOUND	TokenNameIdentifier	 MIN  BOUND
,	TokenNameCOMMA	
MAX_BOUND	TokenNameIdentifier	 MAX  BOUND
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Kind	TokenNameIdentifier	 Kind
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
allKinds	TokenNameIdentifier	 all Kinds
=	TokenNameEQUAL	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Kind	TokenNameIdentifier	 Kind
fromOrdinal	TokenNameIdentifier	 from Ordinal
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
allKinds	TokenNameIdentifier	 all Kinds
[	TokenNameLBRACKET	
ordinal	TokenNameIdentifier	 ordinal
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RowPositionSerializer	TokenNameIdentifier	 Row Position Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
RowPositionSerializer	TokenNameIdentifier	 Row Position Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
RowPosition	TokenNameIdentifier	 Row Position
forKey	TokenNameIdentifier	 for Key
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
IPartitioner	TokenNameIdentifier	 I Partitioner
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getMinimumToken	TokenNameIdentifier	 get Minimum Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
minKeyBound	TokenNameIdentifier	 min Key Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
Token	TokenNameIdentifier	 Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
Kind	TokenNameIdentifier	 Kind
kind	TokenNameIdentifier	 kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isMinimum	TokenNameIdentifier	 is Minimum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isMinimum	TokenNameIdentifier	 is Minimum
(	TokenNameLPAREN	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
RowPositionSerializer	TokenNameIdentifier	 Row Position Serializer
implements	TokenNameimplements	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
{	TokenNameLBRACE	
/* * We need to be able to serialize both Token.KeyBound and * DecoratedKey. To make this compact, we first write a byte whose * meaning is: * - 0: DecoratedKey * - 1: a 'minimum' Token.KeyBound * - 2: a 'maximum' Token.KeyBound * In the case of the DecoratedKey, we then serialize the key (the * token is recreated on the other side). In the other cases, we then * serialize the token. */	TokenNameCOMMENT_BLOCK	 We need to be able to serialize both Token.KeyBound and DecoratedKey. To make this compact, we first write a byte whose meaning is: - 0: DecoratedKey - 1: a 'minimum' Token.KeyBound - 2: a 'maximum' Token.KeyBound In the case of the DecoratedKey, we then serialize the key (the token is recreated on the other side). In the other cases, we then serialize the token. 
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Kind	TokenNameIdentifier	 Kind
kind	TokenNameIdentifier	 kind
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
kind	TokenNameIdentifier	 kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
==	TokenNameEQUAL_EQUAL	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
ROW_KEY	TokenNameIdentifier	 ROW  KEY
)	TokenNameRPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
writeWithShortLength	TokenNameIdentifier	 write With Short Length
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RowPosition	TokenNameIdentifier	 Row Position
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Kind	TokenNameIdentifier	 Kind
kind	TokenNameIdentifier	 kind
=	TokenNameEQUAL	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
fromOrdinal	TokenNameIdentifier	 from Ordinal
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
==	TokenNameEQUAL_EQUAL	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
ROW_KEY	TokenNameIdentifier	 ROW  KEY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
kind	TokenNameIdentifier	 kind
==	TokenNameEQUAL_EQUAL	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
MIN_BOUND	TokenNameIdentifier	 MIN  BOUND
?	TokenNameQUESTION	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
minKeyBound	TokenNameIdentifier	 min Key Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
maxKeyBound	TokenNameIdentifier	 max Key Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Kind	TokenNameIdentifier	 Kind
kind	TokenNameIdentifier	 kind
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
kind	TokenNameIdentifier	 kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1 byte for enum 	TokenNameCOMMENT_LINE	1 byte for enum 
if	TokenNameif	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
==	TokenNameEQUAL_EQUAL	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
ROW_KEY	TokenNameIdentifier	 ROW  KEY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
keySize	TokenNameIdentifier	 key Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
keySize	TokenNameIdentifier	 key Size
)	TokenNameRPAREN	
+	TokenNamePLUS	
keySize	TokenNameIdentifier	 key Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
typeSizes	TokenNameIdentifier	 type Sizes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
