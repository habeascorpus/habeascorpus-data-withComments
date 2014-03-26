/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
compaction	TokenNameIdentifier	 compaction
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Throwables	TokenNameIdentifier	 Throwables
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
db	TokenNameIdentifier	 db
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
sstable	TokenNameIdentifier	 sstable
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
FileUtils	TokenNameIdentifier	 File Utils
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
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
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
OutputHandler	TokenNameIdentifier	 Output Handler
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Scrubber	TokenNameIdentifier	 Scrubber
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
destination	TokenNameIdentifier	 destination
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CompactionController	TokenNameIdentifier	 Compaction Controller
controller	TokenNameIdentifier	 controller
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
isCommutative	TokenNameIdentifier	 is Commutative
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
expectedBloomFilterSize	TokenNameIdentifier	 expected Bloom Filter Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
dataFile	TokenNameIdentifier	 data File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
indexFile	TokenNameIdentifier	 index File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ScrubInfo	TokenNameIdentifier	 Scrub Info
scrubInfo	TokenNameIdentifier	 scrub Info
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
rowsRead	TokenNameIdentifier	 rows Read
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SSTableWriter	TokenNameIdentifier	 SS Table Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SSTableReader	TokenNameIdentifier	 SS Table Reader
newSstable	TokenNameIdentifier	 new Sstable
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SSTableReader	TokenNameIdentifier	 SS Table Reader
newInOrderSstable	TokenNameIdentifier	 new In Order Sstable
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
goodRows	TokenNameIdentifier	 good Rows
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
badRows	TokenNameIdentifier	 bad Rows
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
emptyRows	TokenNameIdentifier	 empty Rows
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OutputHandler	TokenNameIdentifier	 Output Handler
outputHandler	TokenNameIdentifier	 output Handler
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
>	TokenNameGREATER	
acrComparator	TokenNameIdentifier	 acr Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
>	TokenNameGREATER	
outOfOrderRows	TokenNameIdentifier	 out Of Order Rows
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
>	TokenNameGREATER	
(	TokenNameLPAREN	
acrComparator	TokenNameIdentifier	 acr Comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Scrubber	TokenNameIdentifier	 Scrubber
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
new	TokenNamenew	
OutputHandler	TokenNameIdentifier	 Output Handler
.	TokenNameDOT	
LogOutput	TokenNameIdentifier	 Log Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Scrubber	TokenNameIdentifier	 Scrubber
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
OutputHandler	TokenNameIdentifier	 Output Handler
outputHandler	TokenNameIdentifier	 output Handler
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isOffline	TokenNameIdentifier	 is Offline
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outputHandler	TokenNameIdentifier	 output Handler
=	TokenNameEQUAL	
outputHandler	TokenNameIdentifier	 output Handler
;	TokenNameSEMICOLON	
// Calculate the expected compacted filesize 	TokenNameCOMMENT_LINE	Calculate the expected compacted filesize 
this	TokenNamethis	
.	TokenNameDOT	
destination	TokenNameIdentifier	 destination
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
getDirectoryForNewSSTables	TokenNameIdentifier	 get Directory For New SS Tables
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
onDiskLength	TokenNameIdentifier	 on Disk Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
destination	TokenNameIdentifier	 destination
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"disk full"	TokenNameStringLiteral	disk full
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
toScrub	TokenNameIdentifier	 to Scrub
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we run scrub offline, we should never purge tombstone, as we cannot know if other sstable have data that the tombstone deletes. 	TokenNameCOMMENT_LINE	If we run scrub offline, we should never purge tombstone, as we cannot know if other sstable have data that the tombstone deletes. 
this	TokenNamethis	
.	TokenNameDOT	
controller	TokenNameIdentifier	 controller
=	TokenNameEQUAL	
isOffline	TokenNameIdentifier	 is Offline
?	TokenNameQUESTION	
new	TokenNamenew	
ScrubController	TokenNameIdentifier	 Scrub Controller
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
CompactionController	TokenNameIdentifier	 Compaction Controller
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
getDefaultGcBefore	TokenNameIdentifier	 get Default Gc Before
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isCommutative	TokenNameIdentifier	 is Commutative
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getDefaultValidator	TokenNameIdentifier	 get Default Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCommutative	TokenNameIdentifier	 is Commutative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
expectedBloomFilterSize	TokenNameIdentifier	 expected Bloom Filter Size
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getIndexInterval	TokenNameIdentifier	 get Index Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
getApproximateKeyCount	TokenNameIdentifier	 get Approximate Key Count
(	TokenNameLPAREN	
toScrub	TokenNameIdentifier	 to Scrub
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loop through each row, deserializing to check for damage. 	TokenNameCOMMENT_LINE	loop through each row, deserializing to check for damage. 
// we'll also loop through the index at the same time, using the position from the index to recover if the 	TokenNameCOMMENT_LINE	we'll also loop through the index at the same time, using the position from the index to recover if the 
// row header (key or data size) is corrupt. (This means our position in the index file will be one row 	TokenNameCOMMENT_LINE	row header (key or data size) is corrupt. (This means our position in the index file will be one row 
// "ahead" of the data file.) 	TokenNameCOMMENT_LINE	"ahead" of the data file.) 
this	TokenNamethis	
.	TokenNameDOT	
dataFile	TokenNameIdentifier	 data File
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
openDataReader	TokenNameIdentifier	 open Data Reader
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
indexFile	TokenNameIdentifier	 index File
=	TokenNameEQUAL	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
PRIMARY_INDEX	TokenNameIdentifier	 PRIMARY  INDEX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scrubInfo	TokenNameIdentifier	 scrub Info
=	TokenNameEQUAL	
new	TokenNamenew	
ScrubInfo	TokenNameIdentifier	 Scrub Info
(	TokenNameLPAREN	
dataFile	TokenNameIdentifier	 data File
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
scrub	TokenNameIdentifier	 scrub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
output	TokenNameIdentifier	 output
(	TokenNameLPAREN	
"Scrubbing "	TokenNameStringLiteral	Scrubbing 
+	TokenNamePLUS	
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
nextIndexKey	TokenNameIdentifier	 next Index Key
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
indexFile	TokenNameIdentifier	 index File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
// throw away variable so we don't have a side effect in the assert 	TokenNameCOMMENT_LINE	throw away variable so we don't have a side effect in the assert 
long	TokenNamelong	
firstRowPositionFromIndex	TokenNameIdentifier	 first Row Position From Index
=	TokenNameEQUAL	
RowIndexEntry	TokenNameIdentifier	 Row Index Entry
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
indexFile	TokenNameIdentifier	 index File
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
assert	TokenNameassert	
firstRowPositionFromIndex	TokenNameIdentifier	 first Row Position From Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
firstRowPositionFromIndex	TokenNameIdentifier	 first Row Position From Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO errors when creating the writer may leave empty temp files. 	TokenNameCOMMENT_LINE	TODO errors when creating the writer may leave empty temp files. 
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
maybeCreateWriter	TokenNameIdentifier	 maybe Create Writer
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
destination	TokenNameIdentifier	 destination
,	TokenNameCOMMA	
expectedBloomFilterSize	TokenNameIdentifier	 expected Bloom Filter Size
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
prevRow	TokenNameIdentifier	 prev Row
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
isEOF	TokenNameIdentifier	 is EOF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scrubInfo	TokenNameIdentifier	 scrub Info
.	TokenNameDOT	
isStopRequested	TokenNameIdentifier	 is Stop Requested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
CompactionInterruptedException	TokenNameIdentifier	 Compaction Interrupted Exception
(	TokenNameLPAREN	
scrubInfo	TokenNameIdentifier	 scrub Info
.	TokenNameDOT	
getCompactionInfo	TokenNameIdentifier	 get Compaction Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
rowStart	TokenNameIdentifier	 row Start
=	TokenNameEQUAL	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Reading row at "	TokenNameStringLiteral	Reading row at 
+	TokenNamePLUS	
rowStart	TokenNameIdentifier	 row Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
long	TokenNamelong	
dataSize	TokenNameIdentifier	 data Size
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
decodeKey	TokenNameIdentifier	 decode Key
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
dataFile	TokenNameIdentifier	 data File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataSize	TokenNameIdentifier	 data Size
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
hasIntRowSize	TokenNameIdentifier	 has Int Row Size
?	TokenNameQUESTION	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"row %s is %s bytes"	TokenNameStringLiteral	row %s is %s bytes
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dataSize	TokenNameIdentifier	 data Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwIfFatal	TokenNameIdentifier	 throw If Fatal
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for null key below 	TokenNameCOMMENT_LINE	check for null key below 
}	TokenNameRBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
currentIndexKey	TokenNameIdentifier	 current Index Key
=	TokenNameEQUAL	
nextIndexKey	TokenNameIdentifier	 next Index Key
;	TokenNameSEMICOLON	
long	TokenNamelong	
nextRowPositionFromIndex	TokenNameIdentifier	 next Row Position From Index
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
nextIndexKey	TokenNameIdentifier	 next Index Key
=	TokenNameEQUAL	
indexFile	TokenNameIdentifier	 index File
.	TokenNameDOT	
isEOF	TokenNameIdentifier	 is EOF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
indexFile	TokenNameIdentifier	 index File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextRowPositionFromIndex	TokenNameIdentifier	 next Row Position From Index
=	TokenNameEQUAL	
indexFile	TokenNameIdentifier	 index File
.	TokenNameDOT	
isEOF	TokenNameIdentifier	 is EOF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
RowIndexEntry	TokenNameIdentifier	 Row Index Entry
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
indexFile	TokenNameIdentifier	 index File
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Error reading index file"	TokenNameStringLiteral	Error reading index file
,	TokenNameCOMMA	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextIndexKey	TokenNameIdentifier	 next Index Key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
nextRowPositionFromIndex	TokenNameIdentifier	 next Row Position From Index
=	TokenNameEQUAL	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
dataStart	TokenNameIdentifier	 data Start
=	TokenNameEQUAL	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
dataStartFromIndex	TokenNameIdentifier	 data Start From Index
=	TokenNameEQUAL	
currentIndexKey	TokenNameIdentifier	 current Index Key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
rowStart	TokenNameIdentifier	 row Start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
currentIndexKey	TokenNameIdentifier	 current Index Key
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
hasIntRowSize	TokenNameIdentifier	 has Int Row Size
?	TokenNameQUESTION	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
dataSizeFromIndex	TokenNameIdentifier	 data Size From Index
=	TokenNameEQUAL	
nextRowPositionFromIndex	TokenNameIdentifier	 next Row Position From Index
-	TokenNameMINUS	
dataStartFromIndex	TokenNameIdentifier	 data Start From Index
;	TokenNameSEMICOLON	
assert	TokenNameassert	
currentIndexKey	TokenNameIdentifier	 current Index Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
indexFile	TokenNameIdentifier	 index File
.	TokenNameDOT	
isEOF	TokenNameIdentifier	 is EOF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentIndexKey	TokenNameIdentifier	 current Index Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Index doublecheck: row %s is %s bytes"	TokenNameStringLiteral	Index doublecheck: row %s is %s bytes
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
currentIndexKey	TokenNameIdentifier	 current Index Key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dataSizeFromIndex	TokenNameIdentifier	 data Size From Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOError	TokenNameIdentifier	 IO Error
(	TokenNameLPAREN	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Unable to read row key from data file"	TokenNameStringLiteral	Unable to read row key from data file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataSize	TokenNameIdentifier	 data Size
>	TokenNameGREATER	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOError	TokenNameIdentifier	 IO Error
(	TokenNameLPAREN	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Impossible row size "	TokenNameStringLiteral	Impossible row size 
+	TokenNamePLUS	
dataSize	TokenNameIdentifier	 data Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
new	TokenNamenew	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
dataFile	TokenNameIdentifier	 data File
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
dataStart	TokenNameIdentifier	 data Start
,	TokenNameCOMMA	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
compactedRow	TokenNameIdentifier	 compacted Row
=	TokenNameEQUAL	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
getCompactedRow	TokenNameIdentifier	 get Compacted Row
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compactedRow	TokenNameIdentifier	 compacted Row
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emptyRows	TokenNameIdentifier	 empty Rows
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prevRow	TokenNameIdentifier	 prev Row
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
acrComparator	TokenNameIdentifier	 acr Comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
prevRow	TokenNameIdentifier	 prev Row
,	TokenNameCOMMA	
compactedRow	TokenNameIdentifier	 compacted Row
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outOfOrderRows	TokenNameIdentifier	 out Of Order Rows
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
compactedRow	TokenNameIdentifier	 compacted Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Out of order row detected (%s found after %s)"	TokenNameStringLiteral	Out of order row detected (%s found after %s)
,	TokenNameCOMMA	
compactedRow	TokenNameIdentifier	 compacted Row
.	TokenNameDOT	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
prevRow	TokenNameIdentifier	 prev Row
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
compactedRow	TokenNameIdentifier	 compacted Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevRow	TokenNameIdentifier	 prev Row
=	TokenNameEQUAL	
compactedRow	TokenNameIdentifier	 compacted Row
;	TokenNameSEMICOLON	
goodRows	TokenNameIdentifier	 good Rows
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
currentIndexKey	TokenNameIdentifier	 current Index Key
)	TokenNameRPAREN	
||	TokenNameOR_OR	
dataStart	TokenNameIdentifier	 data Start
!=	TokenNameNOT_EQUAL	
dataStartFromIndex	TokenNameIdentifier	 data Start From Index
)	TokenNameRPAREN	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Index file contained a different key or row size; using key from data file"	TokenNameStringLiteral	Index file contained a different key or row size; using key from data file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwIfFatal	TokenNameIdentifier	 throw If Fatal
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Non-fatal error reading row (stacktrace follows)"	TokenNameStringLiteral	Non-fatal error reading row (stacktrace follows)
,	TokenNameCOMMA	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
resetAndTruncate	TokenNameIdentifier	 reset And Truncate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentIndexKey	TokenNameIdentifier	 current Index Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
currentIndexKey	TokenNameIdentifier	 current Index Key
)	TokenNameRPAREN	
||	TokenNameOR_OR	
dataStart	TokenNameIdentifier	 data Start
!=	TokenNameNOT_EQUAL	
dataStartFromIndex	TokenNameIdentifier	 data Start From Index
||	TokenNameOR_OR	
dataSize	TokenNameIdentifier	 data Size
!=	TokenNameNOT_EQUAL	
dataSizeFromIndex	TokenNameIdentifier	 data Size From Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
output	TokenNameIdentifier	 output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Retrying from row index; data is %s bytes starting at %s"	TokenNameStringLiteral	Retrying from row index; data is %s bytes starting at %s
,	TokenNameCOMMA	
dataSizeFromIndex	TokenNameIdentifier	 data Size From Index
,	TokenNameCOMMA	
dataStartFromIndex	TokenNameIdentifier	 data Start From Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
decodeKey	TokenNameIdentifier	 decode Key
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
,	TokenNameCOMMA	
currentIndexKey	TokenNameIdentifier	 current Index Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
new	TokenNamenew	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
dataFile	TokenNameIdentifier	 data File
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
dataStartFromIndex	TokenNameIdentifier	 data Start From Index
,	TokenNameCOMMA	
dataSizeFromIndex	TokenNameIdentifier	 data Size From Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
compactedRow	TokenNameIdentifier	 compacted Row
=	TokenNameEQUAL	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
getCompactedRow	TokenNameIdentifier	 get Compacted Row
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compactedRow	TokenNameIdentifier	 compacted Row
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emptyRows	TokenNameIdentifier	 empty Rows
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prevRow	TokenNameIdentifier	 prev Row
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
acrComparator	TokenNameIdentifier	 acr Comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
prevRow	TokenNameIdentifier	 prev Row
,	TokenNameCOMMA	
compactedRow	TokenNameIdentifier	 compacted Row
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outOfOrderRows	TokenNameIdentifier	 out Of Order Rows
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
compactedRow	TokenNameIdentifier	 compacted Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Out of order row detected (%s found after %s)"	TokenNameStringLiteral	Out of order row detected (%s found after %s)
,	TokenNameCOMMA	
compactedRow	TokenNameIdentifier	 compacted Row
.	TokenNameDOT	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
prevRow	TokenNameIdentifier	 prev Row
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
compactedRow	TokenNameIdentifier	 compacted Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevRow	TokenNameIdentifier	 prev Row
=	TokenNameEQUAL	
compactedRow	TokenNameIdentifier	 compacted Row
;	TokenNameSEMICOLON	
goodRows	TokenNameIdentifier	 good Rows
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
th2	TokenNameIdentifier	 th2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwIfFatal	TokenNameIdentifier	 throw If Fatal
(	TokenNameLPAREN	
th2	TokenNameIdentifier	 th2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skipping rows is dangerous for counters (see CASSANDRA-2759) 	TokenNameCOMMENT_LINE	Skipping rows is dangerous for counters (see CASSANDRA-2759) 
if	TokenNameif	
(	TokenNameLPAREN	
isCommutative	TokenNameIdentifier	 is Commutative
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOError	TokenNameIdentifier	 IO Error
(	TokenNameLPAREN	
th2	TokenNameIdentifier	 th2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Retry failed too. Skipping to next row (retry's stacktrace follows)"	TokenNameStringLiteral	Retry failed too. Skipping to next row (retry's stacktrace follows)
,	TokenNameCOMMA	
th2	TokenNameIdentifier	 th2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
resetAndTruncate	TokenNameIdentifier	 reset And Truncate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
nextRowPositionFromIndex	TokenNameIdentifier	 next Row Position From Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
badRows	TokenNameIdentifier	 bad Rows
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Skipping rows is dangerous for counters (see CASSANDRA-2759) 	TokenNameCOMMENT_LINE	Skipping rows is dangerous for counters (see CASSANDRA-2759) 
if	TokenNameif	
(	TokenNameLPAREN	
isCommutative	TokenNameIdentifier	 is Commutative
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOError	TokenNameIdentifier	 IO Error
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Row at "	TokenNameStringLiteral	Row at 
+	TokenNamePLUS	
dataStart	TokenNameIdentifier	 data Start
+	TokenNamePLUS	
" is unreadable; skipping to next"	TokenNameStringLiteral	 is unreadable; skipping to next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentIndexKey	TokenNameIdentifier	 current Index Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
nextRowPositionFromIndex	TokenNameIdentifier	 next Row Position From Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
badRows	TokenNameIdentifier	 bad Rows
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rowsRead	TokenNameIdentifier	 rows Read
++	TokenNamePLUS_PLUS	
%	TokenNameREMAINDER	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
mayThrottle	TokenNameIdentifier	 may Throttle
(	TokenNameLPAREN	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
newSstable	TokenNameIdentifier	 new Sstable
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
closeAndOpenReader	TokenNameIdentifier	 close And Open Reader
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
maxDataAge	TokenNameIdentifier	 max Data Age
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
Throwables	TokenNameIdentifier	 Throwables
.	TokenNameDOT	
propagate	TokenNameIdentifier	 propagate
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
outOfOrderRows	TokenNameIdentifier	 out Of Order Rows
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SSTableWriter	TokenNameIdentifier	 SS Table Writer
inOrderWriter	TokenNameIdentifier	 in Order Writer
=	TokenNameEQUAL	
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
maybeCreateWriter	TokenNameIdentifier	 maybe Create Writer
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
destination	TokenNameIdentifier	 destination
,	TokenNameCOMMA	
expectedBloomFilterSize	TokenNameIdentifier	 expected Bloom Filter Size
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
outOfOrderRows	TokenNameIdentifier	 out Of Order Rows
)	TokenNameRPAREN	
inOrderWriter	TokenNameIdentifier	 in Order Writer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newInOrderSstable	TokenNameIdentifier	 new In Order Sstable
=	TokenNameEQUAL	
inOrderWriter	TokenNameIdentifier	 in Order Writer
.	TokenNameDOT	
closeAndOpenReader	TokenNameIdentifier	 close And Open Reader
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
maxDataAge	TokenNameIdentifier	 max Data Age
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%d out of order rows found while scrubbing %s; Those have been written (in order) to a new sstable (%s)"	TokenNameStringLiteral	%d out of order rows found while scrubbing %s; Those have been written (in order) to a new sstable (%s)
,	TokenNameCOMMA	
outOfOrderRows	TokenNameIdentifier	 out Of Order Rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
newInOrderSstable	TokenNameIdentifier	 new In Order Sstable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newSstable	TokenNameIdentifier	 new Sstable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
badRows	TokenNameIdentifier	 bad Rows
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"No valid rows found while scrubbing "	TokenNameStringLiteral	No valid rows found while scrubbing 
+	TokenNamePLUS	
sstable	TokenNameIdentifier	 sstable
+	TokenNamePLUS	
"; it is marked for deletion now. If you want to attempt manual recovery, you can find a copy in the pre-scrub snapshot"	TokenNameStringLiteral	; it is marked for deletion now. If you want to attempt manual recovery, you can find a copy in the pre-scrub snapshot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
output	TokenNameIdentifier	 output
(	TokenNameLPAREN	
"Scrub of "	TokenNameStringLiteral	Scrub of 
+	TokenNamePLUS	
sstable	TokenNameIdentifier	 sstable
+	TokenNamePLUS	
" complete; looks like all "	TokenNameStringLiteral	 complete; looks like all 
+	TokenNamePLUS	
emptyRows	TokenNameIdentifier	 empty Rows
+	TokenNamePLUS	
" rows were tombstoned"	TokenNameStringLiteral	 rows were tombstoned
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
output	TokenNameIdentifier	 output
(	TokenNameLPAREN	
"Scrub of "	TokenNameStringLiteral	Scrub of 
+	TokenNamePLUS	
sstable	TokenNameIdentifier	 sstable
+	TokenNamePLUS	
" complete: "	TokenNameStringLiteral	 complete: 
+	TokenNamePLUS	
goodRows	TokenNameIdentifier	 good Rows
+	TokenNamePLUS	
" rows in new sstable and "	TokenNameStringLiteral	 rows in new sstable and 
+	TokenNamePLUS	
emptyRows	TokenNameIdentifier	 empty Rows
+	TokenNamePLUS	
" empty (tombstoned) rows dropped"	TokenNameStringLiteral	 empty (tombstoned) rows dropped
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
badRows	TokenNameIdentifier	 bad Rows
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
outputHandler	TokenNameIdentifier	 output Handler
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Unable to recover "	TokenNameStringLiteral	Unable to recover 
+	TokenNamePLUS	
badRows	TokenNameIdentifier	 bad Rows
+	TokenNamePLUS	
" rows that were skipped. You can attempt manual recovery from the pre-scrub snapshot. You can also run nodetool repair to transfer the data from a healthy replica, if any"	TokenNameStringLiteral	 rows that were skipped. You can attempt manual recovery from the pre-scrub snapshot. You can also run nodetool repair to transfer the data from a healthy replica, if any
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableReader	TokenNameIdentifier	 SS Table Reader
getNewSSTable	TokenNameIdentifier	 get New SS Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSstable	TokenNameIdentifier	 new Sstable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableReader	TokenNameIdentifier	 SS Table Reader
getNewInOrderSSTable	TokenNameIdentifier	 get New In Order SS Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newInOrderSstable	TokenNameIdentifier	 new In Order Sstable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
throwIfFatal	TokenNameIdentifier	 throw If Fatal
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
Error	TokenNameIdentifier	 Error
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
AssertionError	TokenNameIdentifier	 Assertion Error
||	TokenNameOR_OR	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
IOError	TokenNameIdentifier	 IO Error
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
dataFile	TokenNameIdentifier	 data File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
indexFile	TokenNameIdentifier	 index File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompactionInfo	TokenNameIdentifier	 Compaction Info
.	TokenNameDOT	
Holder	TokenNameIdentifier	 Holder
getScrubInfo	TokenNameIdentifier	 get Scrub Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scrubInfo	TokenNameIdentifier	 scrub Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ScrubInfo	TokenNameIdentifier	 Scrub Info
extends	TokenNameextends	
CompactionInfo	TokenNameIdentifier	 Compaction Info
.	TokenNameDOT	
Holder	TokenNameIdentifier	 Holder
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
dataFile	TokenNameIdentifier	 data File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ScrubInfo	TokenNameIdentifier	 Scrub Info
(	TokenNameLPAREN	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
dataFile	TokenNameIdentifier	 data File
,	TokenNameCOMMA	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dataFile	TokenNameIdentifier	 data File
=	TokenNameEQUAL	
dataFile	TokenNameIdentifier	 data File
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompactionInfo	TokenNameIdentifier	 Compaction Info
getCompactionInfo	TokenNameIdentifier	 get Compaction Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompactionInfo	TokenNameIdentifier	 Compaction Info
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
SCRUB	TokenNameIdentifier	 SCRUB
,	TokenNameCOMMA	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ScrubController	TokenNameIdentifier	 Scrub Controller
extends	TokenNameextends	
CompactionController	TokenNameIdentifier	 Compaction Controller
{	TokenNameLBRACE	
public	TokenNamepublic	
ScrubController	TokenNameIdentifier	 Scrub Controller
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldPurge	TokenNameIdentifier	 should Purge
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
