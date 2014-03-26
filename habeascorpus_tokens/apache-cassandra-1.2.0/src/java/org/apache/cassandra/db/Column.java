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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
MessageDigest	TokenNameIdentifier	 Message Digest
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
CFMetaData	TokenNameIdentifier	 CF Meta Data
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
marshal	TokenNameIdentifier	 marshal
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DataOutputBuffer	TokenNameIdentifier	 Data Output Buffer
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
Allocator	TokenNameIdentifier	 Allocator
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
HeapAllocator	TokenNameIdentifier	 Heap Allocator
;	TokenNameSEMICOLON	
/** * Column is immutable, which prevents all kinds of confusion in a multithreaded environment. * (TODO: look at making SuperColumn immutable too. This is trickier but is probably doable * with something like PCollections -- http://code.google.com */	TokenNameCOMMENT_JAVADOC	 Column is immutable, which prevents all kinds of confusion in a multithreaded environment. (TODO: look at making SuperColumn immutable too. This is trickier but is probably doable with something like PCollections -- http://code.google.com 
public	TokenNamepublic	
class	TokenNameclass	
Column	TokenNameIdentifier	 Column
implements	TokenNameimplements	
IColumn	TokenNameIdentifier	 I Column
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
onDiskSerializer	TokenNameIdentifier	 on Disk Serializer
=	TokenNameEQUAL	
new	TokenNamenew	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
(	TokenNameLPAREN	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
serializer	TokenNameIdentifier	 serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
onDiskSerializer	TokenNameIdentifier	 on Disk Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
onDiskSerializer	TokenNameIdentifier	 on Disk Serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
IColumn	TokenNameIdentifier	 I Column
.	TokenNameDOT	
MAX_NAME_LENGTH	TokenNameIdentifier	 MAX  NAME  LENGTH
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Column	TokenNameIdentifier	 Column
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This operation is unsupported on simple columns."	TokenNameStringLiteral	This operation is unsupported on simple columns.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
getSubColumns	TokenNameIdentifier	 get Sub Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This operation is unsupported on simple columns."	TokenNameStringLiteral	This operation is unsupported on simple columns.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
maxTimestamp	TokenNameIdentifier	 max Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
getLocalDeletionTime	TokenNameIdentifier	 get Local Deletion Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getMarkedForDeleteAt	TokenNameIdentifier	 get Marked For Delete At
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"column is not marked for delete"	TokenNameStringLiteral	column is not marked for delete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
mostRecentLiveChangeAt	TokenNameIdentifier	 most Recent Live Change At
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
mostRecentNonGCableChangeAt	TokenNameIdentifier	 most Recent Non G Cable Change At
(	TokenNameLPAREN	
int	TokenNameint	
gcbefore	TokenNameIdentifier	 gcbefore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
dataSize	TokenNameIdentifier	 data Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Size of a column is = * size of a name (short + length of the string) * + 1 byte to indicate if the column has been deleted * + 8 bytes for timestamp * + 4 bytes which basically indicates the size of the byte array * + entire byte array. */	TokenNameCOMMENT_BLOCK	 Size of a column is = size of a name (short + length of the string) + 1 byte to indicate if the column has been deleted + 8 bytes for timestamp + 4 bytes which basically indicates the size of the byte array + entire byte array. 
int	TokenNameint	
nameSize	TokenNameIdentifier	 name Size
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
valueSize	TokenNameIdentifier	 value Size
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
nameSize	TokenNameIdentifier	 name Size
)	TokenNameRPAREN	
+	TokenNamePLUS	
nameSize	TokenNameIdentifier	 name Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
+	TokenNamePLUS	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
valueSize	TokenNameIdentifier	 value Size
)	TokenNameRPAREN	
+	TokenNamePLUS	
valueSize	TokenNameIdentifier	 value Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSizeForSSTable	TokenNameIdentifier	 serialized Size For SS Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
serializationFlags	TokenNameIdentifier	 serialization Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This operation is not supported for simple columns."	TokenNameStringLiteral	This operation is not supported for simple columns.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
updateDigest	TokenNameIdentifier	 update Digest
(	TokenNameLPAREN	
MessageDigest	TokenNameIdentifier	 Message Digest
digest	TokenNameIdentifier	 digest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
digest	TokenNameIdentifier	 digest
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
digest	TokenNameIdentifier	 digest
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputBuffer	TokenNameIdentifier	 Data Output Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputBuffer	TokenNameIdentifier	 Data Output Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
serializationFlags	TokenNameIdentifier	 serialization Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
digest	TokenNameIdentifier	 digest
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLocalDeletionTime	TokenNameIdentifier	 get Local Deletion Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
reconcile	TokenNameIdentifier	 reconcile
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reconcile	TokenNameIdentifier	 reconcile
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
reconcile	TokenNameIdentifier	 reconcile
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// tombstones take precedence. (if both are tombstones, then it doesn't matter which one we use.) 	TokenNameCOMMENT_LINE	tombstones take precedence. (if both are tombstones, then it doesn't matter which one we use.) 
if	TokenNameif	
(	TokenNameLPAREN	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
column	TokenNameIdentifier	 column
:	TokenNameCOLON	
this	TokenNamethis	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
this	TokenNamethis	
:	TokenNameCOLON	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
// break ties by comparing values. 	TokenNameCOMMENT_LINE	break ties by comparing values. 
if	TokenNameif	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
column	TokenNameIdentifier	 column
:	TokenNameCOLON	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// neither is tombstoned and timestamps are different 	TokenNameCOMMENT_LINE	neither is tombstoned and timestamps are different 
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
column	TokenNameIdentifier	 column
:	TokenNameCOLON	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Column	TokenNameIdentifier	 Column
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Column	TokenNameIdentifier	 Column
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
!=	TokenNameNOT_EQUAL	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
^	TokenNameXOR	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
localCopy	TokenNameIdentifier	 local Copy
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localCopy	TokenNameIdentifier	 local Copy
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
localCopy	TokenNameIdentifier	 local Copy
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
internOrCopy	TokenNameIdentifier	 intern Or Copy
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
validateName	TokenNameIdentifier	 validate Name
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
nameValidator	TokenNameIdentifier	 name Validator
=	TokenNameEQUAL	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
cfType	TokenNameIdentifier	 cf Type
==	TokenNameEQUAL_EQUAL	
ColumnFamilyType	TokenNameIdentifier	 Column Family Type
.	TokenNameDOT	
Super	TokenNameIdentifier	 Super
?	TokenNameQUESTION	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
subcolumnComparator	TokenNameIdentifier	 subcolumn Comparator
:	TokenNameCOLON	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
nameValidator	TokenNameIdentifier	 name Validator
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateFields	TokenNameIdentifier	 validate Fields
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
validateName	TokenNameIdentifier	 validate Name
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
valueValidator	TokenNameIdentifier	 value Validator
=	TokenNameEQUAL	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getValueValidator	TokenNameIdentifier	 get Value Validator
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
valueValidator	TokenNameIdentifier	 value Validator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
valueValidator	TokenNameIdentifier	 value Validator
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasIrrelevantData	TokenNameIdentifier	 has Irrelevant Data
(	TokenNameLPAREN	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocalDeletionTime	TokenNameIdentifier	 get Local Deletion Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
gcBefore	TokenNameIdentifier	 gc Before
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Column	TokenNameIdentifier	 Column
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
decomposeName	TokenNameIdentifier	 decompose Name
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Column	TokenNameIdentifier	 Column
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
decomposeName	TokenNameIdentifier	 decompose Name
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Int32Type	TokenNameIdentifier	 Int32 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Column	TokenNameIdentifier	 Column
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
decomposeName	TokenNameIdentifier	 decompose Name
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanType	TokenNameIdentifier	 Boolean Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Column	TokenNameIdentifier	 Column
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
decomposeName	TokenNameIdentifier	 decompose Name
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DoubleType	TokenNameIdentifier	 Double Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Column	TokenNameIdentifier	 Column
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
decomposeName	TokenNameIdentifier	 decompose Name
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Column	TokenNameIdentifier	 Column
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
decomposeName	TokenNameIdentifier	 decompose Name
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddressType	TokenNameIdentifier	 Inet Address Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decomposeName	TokenNameIdentifier	 decompose Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// not super performant. at this time, only infrequently called schema code uses this. 	TokenNameCOMMENT_LINE	not super performant. at this time, only infrequently called schema code uses this. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
types	TokenNameIdentifier	 types
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
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
names	TokenNameIdentifier	 names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompositeType	TokenNameIdentifier	 Composite Type
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeType	TokenNameIdentifier	 Composite Type
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
