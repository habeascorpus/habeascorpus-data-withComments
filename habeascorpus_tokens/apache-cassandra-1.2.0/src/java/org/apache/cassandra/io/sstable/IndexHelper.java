/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
TypeSizes	TokenNameIdentifier	 Type Sizes
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileDataInput	TokenNameIdentifier	 File Data Input
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
FileMark	TokenNameIdentifier	 File Mark
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
FileUtils	TokenNameIdentifier	 File Utils
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Provides helper to serialize, deserialize and use column indexes. */	TokenNameCOMMENT_JAVADOC	 Provides helper to serialize, deserialize and use column indexes. 
public	TokenNamepublic	
class	TokenNameclass	
IndexHelper	TokenNameIdentifier	 Index Helper
{	TokenNameLBRACE	
/** * Skip the bloom filter * @param in the data input from which the bloom filter should be skipped * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Skip the bloom filter @param in the data input from which the bloom filter should be skipped @throws IOException 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
skipBloomFilter	TokenNameIdentifier	 skip Bloom Filter
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* size of the bloom filter */	TokenNameCOMMENT_BLOCK	 size of the bloom filter 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* skip the serialized bloom filter */	TokenNameCOMMENT_BLOCK	 skip the serialized bloom filter 
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
instanceof	TokenNameinstanceof	
FileDataInput	TokenNameIdentifier	 File Data Input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
skipBytesFully	TokenNameIdentifier	 skip Bytes Fully
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// skip bytes 	TokenNameCOMMENT_LINE	skip bytes 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Skip the index * @param in the data input from which the index should be skipped * @throws IOException if an I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Skip the index @param in the data input from which the index should be skipped @throws IOException if an I/O error occurs. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
skipIndex	TokenNameIdentifier	 skip Index
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* read only the column index list */	TokenNameCOMMENT_BLOCK	 read only the column index list 
int	TokenNameint	
columnIndexSize	TokenNameIdentifier	 column Index Size
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* skip the column index data */	TokenNameCOMMENT_BLOCK	 skip the column index data 
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
instanceof	TokenNameinstanceof	
FileDataInput	TokenNameIdentifier	 File Data Input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
skipBytesFully	TokenNameIdentifier	 skip Bytes Fully
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
columnIndexSize	TokenNameIdentifier	 column Index Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// skip bytes 	TokenNameCOMMENT_LINE	skip bytes 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
columnIndexSize	TokenNameIdentifier	 column Index Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Deserialize the index into a structure and return it * * @param in - input source * * @return ArrayList<IndexInfo> - list of de-serialized indexes * @throws IOException if an I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Deserialize the index into a structure and return it * @param in - input source * @return ArrayList<IndexInfo> - list of de-serialized indexes @throws IOException if an I/O error occurs. 
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
deserializeIndex	TokenNameIdentifier	 deserialize Index
(	TokenNameLPAREN	
FileDataInput	TokenNameIdentifier	 File Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
columnIndexSize	TokenNameIdentifier	 column Index Size
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
columnIndexSize	TokenNameIdentifier	 column Index Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
indexList	TokenNameIdentifier	 index List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileMark	TokenNameIdentifier	 File Mark
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
bytesPastMark	TokenNameIdentifier	 bytes Past Mark
(	TokenNameLPAREN	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
<	TokenNameLESS	
columnIndexSize	TokenNameIdentifier	 column Index Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexList	TokenNameIdentifier	 index List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexInfo	TokenNameIdentifier	 Index Info
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
bytesPastMark	TokenNameIdentifier	 bytes Past Mark
(	TokenNameLPAREN	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
columnIndexSize	TokenNameIdentifier	 column Index Size
;	TokenNameSEMICOLON	
return	TokenNamereturn	
indexList	TokenNameIdentifier	 index List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
IFilter	TokenNameIdentifier	 I Filter
defreezeBloomFilter	TokenNameIdentifier	 defreeze Bloom Filter
(	TokenNameLPAREN	
FileDataInput	TokenNameIdentifier	 File Data Input
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
defreezeBloomFilter	TokenNameIdentifier	 defreeze Bloom Filter
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * De-freeze the bloom filter. * * @param file - source file * @param maxSize - sanity check: if filter claimes to be larger than this it is bogus * @param type - Bloom Filter type. * * @return bloom filter summarizing the column information * @throws java.io.IOException if an I/O error occurs. * Guarantees that file's current position will be just after the bloom filter, even if * the filter cannot be deserialized, UNLESS EOFException is thrown. */	TokenNameCOMMENT_JAVADOC	 De-freeze the bloom filter. * @param file - source file @param maxSize - sanity check: if filter claimes to be larger than this it is bogus @param type - Bloom Filter type. * @return bloom filter summarizing the column information @throws java.io.IOException if an I/O error occurs. Guarantees that file's current position will be just after the bloom filter, even if the filter cannot be deserialized, UNLESS EOFException is thrown. 
public	TokenNamepublic	
static	TokenNamestatic	
IFilter	TokenNameIdentifier	 I Filter
defreezeBloomFilter	TokenNameIdentifier	 defreeze Bloom Filter
(	TokenNameLPAREN	
FileDataInput	TokenNameIdentifier	 File Data Input
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
long	TokenNamelong	
maxSize	TokenNameIdentifier	 max Size
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
maxSize	TokenNameIdentifier	 max Size
||	TokenNameOR_OR	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
"bloom filter claims to be "	TokenNameStringLiteral	bloom filter claims to be 
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
" bytes, longer than entire row size "	TokenNameStringLiteral	 bytes, longer than entire row size 
+	TokenNamePLUS	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
inputStream	TokenNameIdentifier	 input Stream
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The index of the IndexInfo in which a scan starting with @name should begin. * * @param name * name of the index * * @param indexList * list of the indexInfo objects * * @param comparator * comparator type * * @param reversed * is name reversed * * @return int index */	TokenNameCOMMENT_JAVADOC	 The index of the IndexInfo in which a scan starting with @name should begin. * @param name name of the index * @param indexList list of the indexInfo objects * @param comparator comparator type * @param reversed is name reversed * @return int index 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
indexList	TokenNameIdentifier	 index List
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
,	TokenNameCOMMA	
int	TokenNameint	
lastIndex	TokenNameIdentifier	 last Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
return	TokenNamereturn	
indexList	TokenNameIdentifier	 index List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastIndex	TokenNameIdentifier	 last Index
>=	TokenNameGREATER_EQUAL	
indexList	TokenNameIdentifier	 index List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
IndexInfo	TokenNameIdentifier	 Index Info
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
new	TokenNamenew	
IndexInfo	TokenNameIdentifier	 Index Info
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Take the example from the unit test, and say your index looks like this: [0..5][10..15][20..25] and you look for the slice [13..17]. When doing forward slice, we we doing a binary search comparing 13 (the start of the query) to the lastName part of the index slot. You'll end up with the "first" slot, going from left to right, that may contain the start. When doing a reverse slice, we do the same thing, only using as a start column the end of the query, i.e. 17 in this example, compared to the firstName part of the index slots. bsearch will give us the first slot where firstName > start ([20..25] here), so we subtract an extra one to get the slot just before. */	TokenNameCOMMENT_BLOCK	 Take the example from the unit test, and say your index looks like this: [0..5][10..15][20..25] and you look for the slice [13..17]. When doing forward slice, we we doing a binary search comparing 13 (the start of the query) to the lastName part of the index slot. You'll end up with the "first" slot, going from left to right, that may contain the start. When doing a reverse slice, we do the same thing, only using as a start column the end of the query, i.e. 17 in this example, compared to the firstName part of the index slots. bsearch will give us the first slot where firstName > start ([20..25] here), so we subtract an extra one to get the slot just before. 
int	TokenNameint	
startIdx	TokenNameIdentifier	 start Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
toSearch	TokenNameIdentifier	 to Search
=	TokenNameEQUAL	
indexList	TokenNameIdentifier	 index List
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastIndex	TokenNameIdentifier	 last Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startIdx	TokenNameIdentifier	 start Idx
=	TokenNameEQUAL	
lastIndex	TokenNameIdentifier	 last Index
;	TokenNameSEMICOLON	
toSearch	TokenNameIdentifier	 to Search
=	TokenNameEQUAL	
indexList	TokenNameIdentifier	 index List
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
lastIndex	TokenNameIdentifier	 last Index
,	TokenNameCOMMA	
indexList	TokenNameIdentifier	 index List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
toSearch	TokenNameIdentifier	 to Search
=	TokenNameEQUAL	
indexList	TokenNameIdentifier	 index List
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastIndex	TokenNameIdentifier	 last Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
toSearch	TokenNameIdentifier	 to Search
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
startIdx	TokenNameIdentifier	 start Idx
+	TokenNamePLUS	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
(	TokenNameLPAREN	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
final	TokenNamefinal	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
nameComparator	TokenNameIdentifier	 name Comparator
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
nameComparator	TokenNameIdentifier	 name Comparator
.	TokenNameDOT	
indexReverseComparator	TokenNameIdentifier	 index Reverse Comparator
:	TokenNameCOLON	
nameComparator	TokenNameIdentifier	 name Comparator
.	TokenNameDOT	
indexComparator	TokenNameIdentifier	 index Comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
IndexInfo	TokenNameIdentifier	 Index Info
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
lastName	TokenNameIdentifier	 last Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
firstName	TokenNameIdentifier	 first Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IndexInfo	TokenNameIdentifier	 Index Info
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
firstName	TokenNameIdentifier	 first Name
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
lastName	TokenNameIdentifier	 last Name
,	TokenNameCOMMA	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
long	TokenNamelong	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
firstName	TokenNameIdentifier	 first Name
=	TokenNameEQUAL	
firstName	TokenNameIdentifier	 first Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lastName	TokenNameIdentifier	 last Name
=	TokenNameEQUAL	
lastName	TokenNameIdentifier	 last Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
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
firstName	TokenNameIdentifier	 first Name
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
writeWithShortLength	TokenNameIdentifier	 write With Short Length
(	TokenNameLPAREN	
lastName	TokenNameIdentifier	 last Name
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
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
int	TokenNameint	
firstNameSize	TokenNameIdentifier	 first Name Size
=	TokenNameEQUAL	
firstName	TokenNameIdentifier	 first Name
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastNameSize	TokenNameIdentifier	 last Name Size
=	TokenNameEQUAL	
lastName	TokenNameIdentifier	 last Name
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
firstNameSize	TokenNameIdentifier	 first Name Size
)	TokenNameRPAREN	
+	TokenNamePLUS	
firstNameSize	TokenNameIdentifier	 first Name Size
+	TokenNamePLUS	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
lastNameSize	TokenNameIdentifier	 last Name Size
)	TokenNameRPAREN	
+	TokenNamePLUS	
lastNameSize	TokenNameIdentifier	 last Name Size
+	TokenNamePLUS	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
+	TokenNamePLUS	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
IndexInfo	TokenNameIdentifier	 Index Info
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
IndexInfo	TokenNameIdentifier	 Index Info
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
