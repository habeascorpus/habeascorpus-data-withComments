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
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
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
IndexHelper	TokenNameIdentifier	 Index Helper
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
AlwaysPresentFilter	TokenNameIdentifier	 Always Present Filter
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
IFilter	TokenNameIdentifier	 I Filter
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
FilterFactory	TokenNameIdentifier	 Filter Factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ColumnIndex	TokenNameIdentifier	 Column Index
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
columnsIndex	TokenNameIdentifier	 columns Index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
IFilter	TokenNameIdentifier	 I Filter
bloomFilter	TokenNameIdentifier	 bloom Filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ColumnIndex	TokenNameIdentifier	 Column Index
EMPTY	TokenNameIdentifier	 EMPTY
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnIndex	TokenNameIdentifier	 Column Index
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
AlwaysPresentFilter	TokenNameIdentifier	 Always Present Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ColumnIndex	TokenNameIdentifier	 Column Index
(	TokenNameLPAREN	
int	TokenNameint	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ColumnIndex	TokenNameIdentifier	 Column Index
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
columnsIndex	TokenNameIdentifier	 columns Index
,	TokenNameCOMMA	
IFilter	TokenNameIdentifier	 I Filter
bloomFilter	TokenNameIdentifier	 bloom Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
columnsIndex	TokenNameIdentifier	 columns Index
=	TokenNameEQUAL	
columnsIndex	TokenNameIdentifier	 columns Index
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bloomFilter	TokenNameIdentifier	 bloom Filter
=	TokenNameEQUAL	
bloomFilter	TokenNameIdentifier	 bloom Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Help to create an index for a column family based on size of columns, * and write said columns to disk. */	TokenNameCOMMENT_JAVADOC	 Help to create an index for a column family based on size of columns, and write said columns to disk. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Builder	TokenNameIdentifier	 Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ColumnIndex	TokenNameIdentifier	 Column Index
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
indexOffset	TokenNameIdentifier	 index Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
endPosition	TokenNameIdentifier	 end Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
firstColumn	TokenNameIdentifier	 first Column
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
lastColumn	TokenNameIdentifier	 last Column
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
lastBlockClosing	TokenNameIdentifier	 last Block Closing
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
DataOutput	TokenNameIdentifier	 Data Output
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
.	TokenNameDOT	
Tracker	TokenNameIdentifier	 Tracker
tombstoneTracker	TokenNameIdentifier	 tombstone Tracker
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
atomSerializer	TokenNameIdentifier	 atom Serializer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
atomCount	TokenNameIdentifier	 atom Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexOffset	TokenNameIdentifier	 index Offset
=	TokenNameEQUAL	
rowHeaderSize	TokenNameIdentifier	 row Header Size
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnIndex	TokenNameIdentifier	 Column Index
(	TokenNameLPAREN	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
atomSerializer	TokenNameIdentifier	 atom Serializer
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getOnDiskSerializer	TokenNameIdentifier	 get On Disk Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tombstoneTracker	TokenNameIdentifier	 tombstone Tracker
=	TokenNameEQUAL	
new	TokenNamenew	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
.	TokenNameDOT	
Tracker	TokenNameIdentifier	 Tracker
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of bytes between the beginning of the row and the * first serialized column. */	TokenNameCOMMENT_JAVADOC	 Returns the number of bytes between the beginning of the row and the first serialized column. 
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
rowHeaderSize	TokenNameIdentifier	 row Header Size
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
DeletionInfo	TokenNameIdentifier	 Deletion Info
delInfo	TokenNameIdentifier	 del Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
;	TokenNameSEMICOLON	
// TODO fix constantSize when changing the nativeconststs. 	TokenNameCOMMENT_LINE	TODO fix constantSize when changing the nativeconststs. 
int	TokenNameint	
keysize	TokenNameIdentifier	 keysize
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
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
keysize	TokenNameIdentifier	 keysize
)	TokenNameRPAREN	
+	TokenNamePLUS	
keysize	TokenNameIdentifier	 keysize
// Row key 	TokenNameCOMMENT_LINE	Row key 
+	TokenNamePLUS	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
// Row data size 	TokenNameCOMMENT_LINE	Row data size 
+	TokenNamePLUS	
DeletionTime	TokenNameIdentifier	 Deletion Time
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
delInfo	TokenNameIdentifier	 del Info
.	TokenNameDOT	
getTopLevelDeletion	TokenNameIdentifier	 get Top Level Deletion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
typeSizes	TokenNameIdentifier	 type Sizes
)	TokenNameRPAREN	
+	TokenNamePLUS	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Column count 	TokenNameCOMMENT_LINE	Column count 
}	TokenNameRBRACE	
public	TokenNamepublic	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
.	TokenNameDOT	
Tracker	TokenNameIdentifier	 Tracker
tombstoneTracker	TokenNameIdentifier	 tombstone Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tombstoneTracker	TokenNameIdentifier	 tombstone Tracker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
writtenAtomCount	TokenNameIdentifier	 written Atom Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
atomCount	TokenNameIdentifier	 atom Count
+	TokenNamePLUS	
tombstoneTracker	TokenNameIdentifier	 tombstone Tracker
.	TokenNameDOT	
writtenAtom	TokenNameIdentifier	 written Atom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serializes the index into in-memory structure with all required components * such as Bloom Filter, index block size, IndexInfo list * * @param cf Column family to create index for * * @return information about index - it's Bloom Filter, block size and IndexInfo list */	TokenNameCOMMENT_JAVADOC	 Serializes the index into in-memory structure with all required components such as Bloom Filter, index block size, IndexInfo list * @param cf Column family to create index for * @return information about index - it's Bloom Filter, block size and IndexInfo list 
public	TokenNamepublic	
ColumnIndex	TokenNameIdentifier	 Column Index
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
>	TokenNameGREATER	
rangeIter	TokenNameIdentifier	 range Iter
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
rangeIterator	TokenNameIdentifier	 range Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
tombstone	TokenNameIdentifier	 tombstone
=	TokenNameEQUAL	
rangeIter	TokenNameIdentifier	 range Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
rangeIter	TokenNameIdentifier	 range Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
tombstone	TokenNameIdentifier	 tombstone
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tombstone	TokenNameIdentifier	 tombstone
.	TokenNameDOT	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tombstone	TokenNameIdentifier	 tombstone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tombstone	TokenNameIdentifier	 tombstone
=	TokenNameEQUAL	
rangeIter	TokenNameIdentifier	 range Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
rangeIter	TokenNameIdentifier	 range Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
tombstone	TokenNameIdentifier	 tombstone
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tombstone	TokenNameIdentifier	 tombstone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tombstone	TokenNameIdentifier	 tombstone
=	TokenNameEQUAL	
rangeIter	TokenNameIdentifier	 range Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
rangeIter	TokenNameIdentifier	 range Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnIndex	TokenNameIdentifier	 Column Index
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
atomCount	TokenNameIdentifier	 atom Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
instanceof	TokenNameinstanceof	
IColumn	TokenNameIdentifier	 I Column
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
bloomFilter	TokenNameIdentifier	 bloom Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstColumn	TokenNameIdentifier	 first Column
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstColumn	TokenNameIdentifier	 first Column
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
endPosition	TokenNameIdentifier	 end Position
;	TokenNameSEMICOLON	
// TODO: have that use the firstColumn as min + make sure we 	TokenNameCOMMENT_LINE	TODO: have that use the firstColumn as min + make sure we 
// optimize that on read 	TokenNameCOMMENT_LINE	optimize that on read 
endPosition	TokenNameIdentifier	 end Position
+=	TokenNamePLUS_EQUAL	
tombstoneTracker	TokenNameIdentifier	 tombstone Tracker
.	TokenNameDOT	
writeOpenedMarker	TokenNameIdentifier	 write Opened Marker
(	TokenNameLPAREN	
firstColumn	TokenNameIdentifier	 first Column
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
atomSerializer	TokenNameIdentifier	 atom Serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// We don't count repeated tombstone marker in the block size, to avoid a situation 	TokenNameCOMMENT_LINE	We don't count repeated tombstone marker in the block size, to avoid a situation 
// where we wouldn't make any problem because a block is filled by said marker 	TokenNameCOMMENT_LINE	where we wouldn't make any problem because a block is filled by said marker 
}	TokenNameRBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
serializedSizeForSSTable	TokenNameIdentifier	 serialized Size For SS Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endPosition	TokenNameIdentifier	 end Position
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
blockSize	TokenNameIdentifier	 block Size
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
// if we hit the column index size that we have to index after, go ahead and index it. 	TokenNameCOMMENT_LINE	if we hit the column index size that we have to index after, go ahead and index it. 
if	TokenNameif	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
>=	TokenNameGREATER_EQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getColumnIndexSize	TokenNameIdentifier	 get Column Index Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
IndexInfo	TokenNameIdentifier	 Index Info
cIndexInfo	TokenNameIdentifier	 c Index Info
=	TokenNameEQUAL	
new	TokenNamenew	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
IndexInfo	TokenNameIdentifier	 Index Info
(	TokenNameLPAREN	
firstColumn	TokenNameIdentifier	 first Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexOffset	TokenNameIdentifier	 index Offset
+	TokenNamePLUS	
startPosition	TokenNameIdentifier	 start Position
,	TokenNameCOMMA	
endPosition	TokenNameIdentifier	 end Position
-	TokenNameMINUS	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
columnsIndex	TokenNameIdentifier	 columns Index
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cIndexInfo	TokenNameIdentifier	 c Index Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstColumn	TokenNameIdentifier	 first Column
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
lastBlockClosing	TokenNameIdentifier	 last Block Closing
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
atomSerializer	TokenNameIdentifier	 atom Serializer
.	TokenNameDOT	
serializeForSSTable	TokenNameIdentifier	 serialize For SS Table
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: Should deal with removing unneeded tombstones 	TokenNameCOMMENT_LINE	TODO: Should deal with removing unneeded tombstones 
tombstoneTracker	TokenNameIdentifier	 tombstone Tracker
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastColumn	TokenNameIdentifier	 last Column
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnIndex	TokenNameIdentifier	 Column Index
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// all columns were GC'd after all 	TokenNameCOMMENT_LINE	all columns were GC'd after all 
if	TokenNameif	
(	TokenNameLPAREN	
lastColumn	TokenNameIdentifier	 last Column
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ColumnIndex	TokenNameIdentifier	 Column Index
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
// the last column may have fallen on an index boundary already. if not, index it explicitly. 	TokenNameCOMMENT_LINE	the last column may have fallen on an index boundary already. if not, index it explicitly. 
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
columnsIndex	TokenNameIdentifier	 columns Index
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
lastBlockClosing	TokenNameIdentifier	 last Block Closing
!=	TokenNameNOT_EQUAL	
lastColumn	TokenNameIdentifier	 last Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
IndexInfo	TokenNameIdentifier	 Index Info
cIndexInfo	TokenNameIdentifier	 c Index Info
=	TokenNameEQUAL	
new	TokenNamenew	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
IndexInfo	TokenNameIdentifier	 Index Info
(	TokenNameLPAREN	
firstColumn	TokenNameIdentifier	 first Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lastColumn	TokenNameIdentifier	 last Column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexOffset	TokenNameIdentifier	 index Offset
+	TokenNamePLUS	
startPosition	TokenNameIdentifier	 start Position
,	TokenNameCOMMA	
endPosition	TokenNameIdentifier	 end Position
-	TokenNameMINUS	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
columnsIndex	TokenNameIdentifier	 columns Index
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cIndexInfo	TokenNameIdentifier	 c Index Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we should always have at least one computed index block, but we only write it out if there is more than that. 	TokenNameCOMMENT_LINE	we should always have at least one computed index block, but we only write it out if there is more than that. 
assert	TokenNameassert	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
columnsIndex	TokenNameIdentifier	 columns Index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
