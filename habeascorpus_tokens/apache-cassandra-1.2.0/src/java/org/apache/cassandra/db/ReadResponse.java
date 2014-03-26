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
*	TokenNameMULTIPLY	
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
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
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
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
/* * The read response message is sent by the server when reading data * this encapsulates the tablename and the row that has been read. * The table name is needed so that we can use it to create repairs. */	TokenNameCOMMENT_BLOCK	 The read response message is sent by the server when reading data this encapsulates the tablename and the row that has been read. The table name is needed so that we can use it to create repairs. 
public	TokenNamepublic	
class	TokenNameclass	
ReadResponse	TokenNameIdentifier	 Read Response
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
ReadResponse	TokenNameIdentifier	 Read Response
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
ReadResponseSerializer	TokenNameIdentifier	 Read Response Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
digest	TokenNameIdentifier	 digest
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ReadResponse	TokenNameIdentifier	 Read Response
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
digest	TokenNameIdentifier	 digest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
digest	TokenNameIdentifier	 digest
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
=	TokenNameEQUAL	
digest	TokenNameIdentifier	 digest
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ReadResponse	TokenNameIdentifier	 Read Response
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
row	TokenNameIdentifier	 row
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
row	TokenNameIdentifier	 row
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
row	TokenNameIdentifier	 row
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
digest	TokenNameIdentifier	 digest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
digest	TokenNameIdentifier	 digest
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
ReadResponseSerializer	TokenNameIdentifier	 Read Response Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
ReadResponse	TokenNameIdentifier	 Read Response
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
ReadResponse	TokenNameIdentifier	 Read Response
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
;	TokenNameSEMICOLON	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeBoolean	TokenNameIdentifier	 write Boolean
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
Row	TokenNameIdentifier	 Row
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
row	TokenNameIdentifier	 row
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ReadResponse	TokenNameIdentifier	 Read Response
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
digest	TokenNameIdentifier	 digest
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
digestSize	TokenNameIdentifier	 digest Size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
digestSize	TokenNameIdentifier	 digest Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
digest	TokenNameIdentifier	 digest
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
digestSize	TokenNameIdentifier	 digest Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
digest	TokenNameIdentifier	 digest
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
digestSize	TokenNameIdentifier	 digest Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isDigest	TokenNameIdentifier	 is Digest
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readBoolean	TokenNameIdentifier	 read Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
isDigest	TokenNameIdentifier	 is Digest
==	TokenNameEQUAL_EQUAL	
digestSize	TokenNameIdentifier	 digest Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDigest	TokenNameIdentifier	 is Digest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is coming from a remote host 	TokenNameCOMMENT_LINE	This is coming from a remote host 
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
Row	TokenNameIdentifier	 Row
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
FROM_REMOTE	TokenNameIdentifier	 FROM  REMOTE
,	TokenNameCOMMA	
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isDigest	TokenNameIdentifier	 is Digest
?	TokenNameQUESTION	
new	TokenNamenew	
ReadResponse	TokenNameIdentifier	 Read Response
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
digest	TokenNameIdentifier	 digest
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
ReadResponse	TokenNameIdentifier	 Read Response
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
ReadResponse	TokenNameIdentifier	 Read Response
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
Row	TokenNameIdentifier	 Row
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
row	TokenNameIdentifier	 row
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
