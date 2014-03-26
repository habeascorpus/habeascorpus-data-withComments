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
*	TokenNameMULTIPLY	
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
AbstractType	TokenNameIdentifier	 Abstract Type
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
MarshalException	TokenNameIdentifier	 Marshal Exception
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
ISSTableSerializer	TokenNameIdentifier	 ISS Table Serializer
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
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
Descriptor	TokenNameIdentifier	 Descriptor
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
Interval	TokenNameIdentifier	 Interval
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
extends	TokenNameextends	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
DeletionTime	TokenNameIdentifier	 Deletion Time
>	TokenNameGREATER	
implements	TokenNameimplements	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
Serializer	TokenNameIdentifier	 Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
stop	TokenNameIdentifier	 stop
,	TokenNameCOMMA	
long	TokenNamelong	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
,	TokenNameCOMMA	
int	TokenNameint	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
,	TokenNameCOMMA	
new	TokenNamenew	
DeletionTime	TokenNameIdentifier	 Deletion Time
(	TokenNameLPAREN	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
,	TokenNameCOMMA	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
stop	TokenNameIdentifier	 stop
,	TokenNameCOMMA	
DeletionTime	TokenNameIdentifier	 Deletion Time
delTime	TokenNameIdentifier	 del Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
,	TokenNameCOMMA	
delTime	TokenNameIdentifier	 del Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLocalDeletionTime	TokenNameIdentifier	 get Local Deletion Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
maxTimestamp	TokenNameIdentifier	 max Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
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
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSizeForSSTable	TokenNameIdentifier	 serialized Size For SS Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
// serialization flag 	TokenNameCOMMENT_LINE	serialization flag 
+	TokenNamePLUS	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
DeletionTime	TokenNameIdentifier	 Deletion Time
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
typeSizes	TokenNameIdentifier	 type Sizes
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
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nameValidator	TokenNameIdentifier	 name Validator
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
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
min	TokenNameIdentifier	 min
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
max	TokenNameIdentifier	 max
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
data	TokenNameIdentifier	 data
.	TokenNameDOT	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
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
/** * This tombstone supersedes another one if it is more recent and cover a * bigger range than rt. */	TokenNameCOMMENT_JAVADOC	 This tombstone supersedes another one if it is more recent and cover a bigger range than rt. 
public	TokenNamepublic	
boolean	TokenNameboolean	
supersedes	TokenNameIdentifier	 supersedes
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
rt	TokenNameIdentifier	 rt
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rt	TokenNameIdentifier	 rt
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
markedForDeleteAt	TokenNameIdentifier	 marked For Delete At
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
rt	TokenNameIdentifier	 rt
.	TokenNameDOT	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
rt	TokenNameIdentifier	 rt
.	TokenNameDOT	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Tracker	TokenNameIdentifier	 Tracker
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Deque	TokenNameIdentifier	 Deque
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayDeque	TokenNameIdentifier	 Array Deque
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
maxOrderingSet	TokenNameIdentifier	 max Ordering Set
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
(	TokenNameLPAREN	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
atomCount	TokenNameIdentifier	 atom Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Tracker	TokenNameIdentifier	 Tracker
(	TokenNameLPAREN	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute RangeTombstone that are needed at the beginning of an index * block starting with {@code firstColumn}. * Returns the total serialized size of said tombstones and write them * to {@code out} it if isn't null. */	TokenNameCOMMENT_JAVADOC	 Compute RangeTombstone that are needed at the beginning of an index block starting with {@code firstColumn}. Returns the total serialized size of said tombstones and write them to {@code out} it if isn't null. 
public	TokenNamepublic	
long	TokenNamelong	
writeOpenedMarker	TokenNameIdentifier	 write Opened Marker
(	TokenNameLPAREN	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
firstColumn	TokenNameIdentifier	 first Column
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
atomSerializer	TokenNameIdentifier	 atom Serializer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
/* * Compute the marker that needs to be written at the beginning of * this block. We need to write one if it the more recent * (opened) tombstone for at least some part of its range. */	TokenNameCOMMENT_BLOCK	 Compute the marker that needs to be written at the beginning of this block. We need to write one if it the more recent (opened) tombstone for at least some part of its range. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
toWrite	TokenNameIdentifier	 to Write
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outer	TokenNameIdentifier	 outer
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
tombstone	TokenNameIdentifier	 tombstone
:	TokenNameCOLON	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If ever the first column is outside the range, skip it (in 	TokenNameCOMMENT_LINE	If ever the first column is outside the range, skip it (in 
// case update() hasn't been called yet) 	TokenNameCOMMENT_LINE	case update() hasn't been called yet) 
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
firstColumn	TokenNameIdentifier	 first Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tombstone	TokenNameIdentifier	 tombstone
.	TokenNameDOT	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
updated	TokenNameIdentifier	 updated
=	TokenNameEQUAL	
new	TokenNamenew	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
(	TokenNameLPAREN	
firstColumn	TokenNameIdentifier	 first Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tombstone	TokenNameIdentifier	 tombstone
.	TokenNameDOT	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
tombstone	TokenNameIdentifier	 tombstone
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
toWrite	TokenNameIdentifier	 to Write
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
supersedes	TokenNameIdentifier	 supersedes
(	TokenNameLPAREN	
updated	TokenNameIdentifier	 updated
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
outer	TokenNameIdentifier	 outer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
updated	TokenNameIdentifier	 updated
.	TokenNameDOT	
supersedes	TokenNameIdentifier	 supersedes
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
toWrite	TokenNameIdentifier	 to Write
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tombstone	TokenNameIdentifier	 tombstone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
tombstone	TokenNameIdentifier	 tombstone
:	TokenNameCOLON	
toWrite	TokenNameIdentifier	 to Write
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
tombstone	TokenNameIdentifier	 tombstone
.	TokenNameDOT	
serializedSizeForSSTable	TokenNameIdentifier	 serialized Size For SS Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
atomCount	TokenNameIdentifier	 atom Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
atomSerializer	TokenNameIdentifier	 atom Serializer
.	TokenNameDOT	
serializeForSSTable	TokenNameIdentifier	 serialize For SS Table
(	TokenNameLPAREN	
tombstone	TokenNameIdentifier	 tombstone
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
writtenAtom	TokenNameIdentifier	 written Atom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
atomCount	TokenNameIdentifier	 atom Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Update this tracker given an {@code atom}. * If column is a IColumn, check if any tracked range is useless and * can be removed. If it is a RangeTombstone, add it to this tracker. */	TokenNameCOMMENT_JAVADOC	 Update this tracker given an {@code atom}. If column is a IColumn, check if any tracked range is useless and can be removed. If it is a RangeTombstone, add it to this tracker. 
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
atom	TokenNameIdentifier	 atom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
atom	TokenNameIdentifier	 atom
instanceof	TokenNameinstanceof	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
)	TokenNameRPAREN	
atom	TokenNameIdentifier	 atom
;	TokenNameSEMICOLON	
// This could be a repeated marker already. If so, we already have a range in which it is 	TokenNameCOMMENT_LINE	This could be a repeated marker already. If so, we already have a range in which it is 
// fully included. While keeping both would be ok functionaly, we could end up with a lot of 	TokenNameCOMMENT_LINE	fully included. While keeping both would be ok functionaly, we could end up with a lot of 
// useless marker after a few compaction, so avoid this. 	TokenNameCOMMENT_LINE	useless marker after a few compaction, so avoid this. 
for	TokenNamefor	
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
tombstone	TokenNameIdentifier	 tombstone
:	TokenNameCOLON	
maxOrderingSet	TokenNameIdentifier	 max Ordering Set
.	TokenNameDOT	
tailSet	TokenNameIdentifier	 tail Set
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We only care about tombstone have the same max than t 	TokenNameCOMMENT_LINE	We only care about tombstone have the same max than t 
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
tombstone	TokenNameIdentifier	 tombstone
.	TokenNameDOT	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Since it is assume tombstones are passed to this method in growing min order, it's enough to 	TokenNameCOMMENT_LINE	Since it is assume tombstones are passed to this method in growing min order, it's enough to 
// check for the data to know is the current tombstone is included in a previous one 	TokenNameCOMMENT_LINE	check for the data to know is the current tombstone is included in a previous one 
if	TokenNameif	
(	TokenNameLPAREN	
tombstone	TokenNameIdentifier	 tombstone
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
addLast	TokenNameIdentifier	 add Last
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxOrderingSet	TokenNameIdentifier	 max Ordering Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
atom	TokenNameIdentifier	 atom
instanceof	TokenNameinstanceof	
IColumn	TokenNameIdentifier	 I Column
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
maxOrderingSet	TokenNameIdentifier	 max Ordering Set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
tombstone	TokenNameIdentifier	 tombstone
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
atom	TokenNameIdentifier	 atom
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tombstone	TokenNameIdentifier	 tombstone
.	TokenNameDOT	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// That tombstone is now useless 	TokenNameCOMMENT_LINE	That tombstone is now useless 
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
tombstone	TokenNameIdentifier	 tombstone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Since we're iterating by growing end bound, if the current range 	TokenNameCOMMENT_LINE	Since we're iterating by growing end bound, if the current range 
// includes the column, so does all the next ones 	TokenNameCOMMENT_LINE	includes the column, so does all the next ones 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
tombstone	TokenNameIdentifier	 tombstone
:	TokenNameCOLON	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tombstone	TokenNameIdentifier	 tombstone
.	TokenNameDOT	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
tombstone	TokenNameIdentifier	 tombstone
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Serializer	TokenNameIdentifier	 Serializer
implements	TokenNameimplements	
ISSTableSerializer	TokenNameIdentifier	 ISS Table Serializer
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serializeForSSTable	TokenNameIdentifier	 serialize For SS Table
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
writeWithShortLength	TokenNameIdentifier	 write With Short Length
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
.	TokenNameDOT	
RANGE_TOMBSTONE_MASK	TokenNameIdentifier	 RANGE  TOMBSTONE  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
writeWithShortLength	TokenNameIdentifier	 write With Short Length
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DeletionTime	TokenNameIdentifier	 Deletion Time
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
deserializeFromSSTable	TokenNameIdentifier	 deserialize From SS Table
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
.	TokenNameDOT	
CorruptColumnException	TokenNameIdentifier	 Corrupt Column Exception
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUnsignedByte	TokenNameIdentifier	 read Unsigned Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
.	TokenNameDOT	
RANGE_TOMBSTONE_MASK	TokenNameIdentifier	 RANGE  TOMBSTONE  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deserializeBody	TokenNameIdentifier	 deserialize Body
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
deserializeBody	TokenNameIdentifier	 deserialize Body
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
.	TokenNameDOT	
CorruptColumnException	TokenNameIdentifier	 Corrupt Column Exception
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DeletionTime	TokenNameIdentifier	 Deletion Time
dt	TokenNameIdentifier	 dt
=	TokenNameEQUAL	
DeletionTime	TokenNameIdentifier	 Deletion Time
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
dt	TokenNameIdentifier	 dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
