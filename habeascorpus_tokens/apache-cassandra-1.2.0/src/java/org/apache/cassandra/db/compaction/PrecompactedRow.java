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
security	TokenNameIdentifier	 security
.	TokenNameDOT	
MessageDigest	TokenNameIdentifier	 Message Digest
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
Functions	TokenNameIdentifier	 Functions
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
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
ColumnStats	TokenNameIdentifier	 Column Stats
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
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
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
HeapAllocator	TokenNameIdentifier	 Heap Allocator
;	TokenNameSEMICOLON	
/** * PrecompactedRow merges its rows in its constructor in memory. */	TokenNameCOMMENT_JAVADOC	 PrecompactedRow merges its rows in its constructor in memory. 
public	TokenNamepublic	
class	TokenNameclass	
PrecompactedRow	TokenNameIdentifier	 Precompacted Row
extends	TokenNameextends	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ColumnFamily	TokenNameIdentifier	 Column Family
compactedCf	TokenNameIdentifier	 compacted Cf
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ColumnIndex	TokenNameIdentifier	 Column Index
columnIndex	TokenNameIdentifier	 column Index
;	TokenNameSEMICOLON	
/** it is caller's responsibility to call removeDeleted + removeOldShards from the cf before calling this constructor */	TokenNameCOMMENT_JAVADOC	 it is caller's responsibility to call removeDeleted + removeOldShards from the cf before calling this constructor 
public	TokenNamepublic	
PrecompactedRow	TokenNameIdentifier	 Precompacted Row
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compactedCf	TokenNameIdentifier	 compacted Cf
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ColumnFamily	TokenNameIdentifier	 Column Family
removeDeletedAndOldShards	TokenNameIdentifier	 remove Deleted And Old Shards
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
CompactionController	TokenNameIdentifier	 Compaction Controller
controller	TokenNameIdentifier	 controller
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
key	TokenNameIdentifier	 key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
controller	TokenNameIdentifier	 controller
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cf	TokenNameIdentifier	 cf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// avoid calling shouldPurge unless we actually need to: it can be very expensive if LCS 	TokenNameCOMMENT_LINE	avoid calling shouldPurge unless we actually need to: it can be very expensive if LCS 
// gets behind and has hundreds of overlapping L0 sstables. Essentially, this method is an 	TokenNameCOMMENT_LINE	gets behind and has hundreds of overlapping L0 sstables. Essentially, this method is an 
// ugly refactor of removeDeletedAndOldShards(controller.shouldPurge(key), controller, cf), 	TokenNameCOMMENT_LINE	ugly refactor of removeDeletedAndOldShards(controller.shouldPurge(key), controller, cf), 
// taking this into account. 	TokenNameCOMMENT_LINE	taking this into account. 
Boolean	TokenNameIdentifier	 Boolean
shouldPurge	TokenNameIdentifier	 should Purge
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
hasIrrelevantData	TokenNameIdentifier	 has Irrelevant Data
(	TokenNameLPAREN	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
)	TokenNameRPAREN	
shouldPurge	TokenNameIdentifier	 should Purge
=	TokenNameEQUAL	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
shouldPurge	TokenNameIdentifier	 should Purge
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We should only gc tombstone if shouldPurge == true. But otherwise, 	TokenNameCOMMENT_LINE	We should only gc tombstone if shouldPurge == true. But otherwise, 
// it is still ok to collect column that shadowed by their (deleted) 	TokenNameCOMMENT_LINE	it is still ok to collect column that shadowed by their (deleted) 
// container, which removeDeleted(cf, Integer.MAX_VALUE) will do 	TokenNameCOMMENT_LINE	container, which removeDeleted(cf, Integer.MAX_VALUE) will do 
ColumnFamily	TokenNameIdentifier	 Column Family
compacted	TokenNameIdentifier	 compacted
=	TokenNameEQUAL	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
.	TokenNameDOT	
removeDeleted	TokenNameIdentifier	 remove Deleted
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
shouldPurge	TokenNameIdentifier	 should Purge
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
shouldPurge	TokenNameIdentifier	 should Purge
?	TokenNameQUESTION	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
gcBefore	TokenNameIdentifier	 gc Before
:	TokenNameCOLON	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compacted	TokenNameIdentifier	 compacted
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
compacted	TokenNameIdentifier	 compacted
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDefaultValidator	TokenNameIdentifier	 get Default Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCommutative	TokenNameIdentifier	 is Commutative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shouldPurge	TokenNameIdentifier	 should Purge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
shouldPurge	TokenNameIdentifier	 should Purge
=	TokenNameEQUAL	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
shouldPurge	TokenNameIdentifier	 should Purge
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldPurge	TokenNameIdentifier	 should Purge
)	TokenNameRPAREN	
CounterColumn	TokenNameIdentifier	 Counter Column
.	TokenNameDOT	
mergeAndRemoveOldShards	TokenNameIdentifier	 merge And Remove Old Shards
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
compacted	TokenNameIdentifier	 compacted
,	TokenNameCOMMA	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
gcBefore	TokenNameIdentifier	 gc Before
,	TokenNameCOMMA	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
mergeShardBefore	TokenNameIdentifier	 merge Shard Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
compacted	TokenNameIdentifier	 compacted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ColumnFamily	TokenNameIdentifier	 Column Family
removeDeletedAndOldShards	TokenNameIdentifier	 remove Deleted And Old Shards
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldPurge	TokenNameIdentifier	 should Purge
,	TokenNameCOMMA	
CompactionController	TokenNameIdentifier	 Compaction Controller
controller	TokenNameIdentifier	 controller
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See comment in preceding method 	TokenNameCOMMENT_LINE	See comment in preceding method 
ColumnFamily	TokenNameIdentifier	 Column Family
compacted	TokenNameIdentifier	 compacted
=	TokenNameEQUAL	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
.	TokenNameDOT	
removeDeleted	TokenNameIdentifier	 remove Deleted
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
shouldPurge	TokenNameIdentifier	 should Purge
?	TokenNameQUESTION	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
gcBefore	TokenNameIdentifier	 gc Before
:	TokenNameCOLON	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
indexManager	TokenNameIdentifier	 index Manager
.	TokenNameDOT	
updaterFor	TokenNameIdentifier	 updater For
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldPurge	TokenNameIdentifier	 should Purge
&&	TokenNameAND_AND	
compacted	TokenNameIdentifier	 compacted
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
compacted	TokenNameIdentifier	 compacted
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDefaultValidator	TokenNameIdentifier	 get Default Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCommutative	TokenNameIdentifier	 is Commutative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
CounterColumn	TokenNameIdentifier	 Counter Column
.	TokenNameDOT	
mergeAndRemoveOldShards	TokenNameIdentifier	 merge And Remove Old Shards
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
compacted	TokenNameIdentifier	 compacted
,	TokenNameCOMMA	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
gcBefore	TokenNameIdentifier	 gc Before
,	TokenNameCOMMA	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
mergeShardBefore	TokenNameIdentifier	 merge Shard Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compacted	TokenNameIdentifier	 compacted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PrecompactedRow	TokenNameIdentifier	 Precompacted Row
(	TokenNameLPAREN	
CompactionController	TokenNameIdentifier	 Compaction Controller
controller	TokenNameIdentifier	 controller
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
removeDeletedAndOldShards	TokenNameIdentifier	 remove Deleted And Old Shards
(	TokenNameLPAREN	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
controller	TokenNameIdentifier	 controller
,	TokenNameCOMMA	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
rows	TokenNameIdentifier	 rows
,	TokenNameCOMMA	
controller	TokenNameIdentifier	 controller
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ColumnFamily	TokenNameIdentifier	 Column Family
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
,	TokenNameCOMMA	
CompactionController	TokenNameIdentifier	 Compaction Controller
controller	TokenNameIdentifier	 controller
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SecondaryIndexManager	TokenNameIdentifier	 Secondary Index Manager
.	TokenNameDOT	
Updater	TokenNameIdentifier	 Updater
indexer	TokenNameIdentifier	 indexer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
thisCF	TokenNameIdentifier	 this CF
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// use a map for the first once since that will be the one we merge into 	TokenNameCOMMENT_LINE	use a map for the first once since that will be the one we merge into 
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
TreeMapBackedSortedColumns	TokenNameIdentifier	 Tree Map Backed Sorted Columns
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
ArrayBackedSortedColumns	TokenNameIdentifier	 Array Backed Sorted Columns
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thisCF	TokenNameIdentifier	 this CF
=	TokenNameEQUAL	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
getColumnFamilyWithColumns	TokenNameIdentifier	 get Column Family With Columns
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
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
"Failed merge of rows on row with key: "	TokenNameStringLiteral	Failed merge of rows on row with key: 
+	TokenNamePLUS	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
thisCF	TokenNameIdentifier	 this CF
;	TokenNameSEMICOLON	
indexer	TokenNameIdentifier	 indexer
=	TokenNameEQUAL	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
indexManager	TokenNameIdentifier	 index Manager
.	TokenNameDOT	
updaterFor	TokenNameIdentifier	 updater For
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// only init indexer once 	TokenNameCOMMENT_LINE	only init indexer once 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// addAll is ok even if cf is an ArrayBackedSortedColumns 	TokenNameCOMMENT_LINE	addAll is ok even if cf is an ArrayBackedSortedColumns 
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addAllWithSizeDelta	TokenNameIdentifier	 add All With Size Delta
(	TokenNameLPAREN	
thisCF	TokenNameIdentifier	 this CF
,	TokenNameCOMMA	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
Functions	TokenNameIdentifier	 Functions
.	TokenNameDOT	
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
identity	TokenNameIdentifier	 identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexer	TokenNameIdentifier	 indexer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
cf	TokenNameIdentifier	 cf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
compactedCf	TokenNameIdentifier	 compacted Cf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
DataOutputBuffer	TokenNameIdentifier	 Data Output Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputBuffer	TokenNameIdentifier	 Data Output Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnIndex	TokenNameIdentifier	 Column Index
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnIndex	TokenNameIdentifier	 Column Index
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
compactedCf	TokenNameIdentifier	 compacted Cf
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
compactedCf	TokenNameIdentifier	 compacted Cf
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnIndex	TokenNameIdentifier	 column Index
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
compactedCf	TokenNameIdentifier	 compacted Cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
;	TokenNameSEMICOLON	
long	TokenNamelong	
delSize	TokenNameIdentifier	 del Size
=	TokenNameEQUAL	
DeletionTime	TokenNameIdentifier	 Deletion Time
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
compactedCf	TokenNameIdentifier	 compacted Cf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTopLevelDeletion	TokenNameIdentifier	 get Top Level Deletion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
typeSizes	TokenNameIdentifier	 type Sizes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
dataSize	TokenNameIdentifier	 data Size
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
delSize	TokenNameIdentifier	 del Size
+	TokenNamePLUS	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
dataSize	TokenNameIdentifier	 data Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DeletionInfo	TokenNameIdentifier	 Deletion Info
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
serializeForSSTable	TokenNameIdentifier	 serialize For SS Table
(	TokenNameLPAREN	
compactedCf	TokenNameIdentifier	 compacted Cf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
writtenAtomCount	TokenNameIdentifier	 written Atom Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
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
return	TokenNamereturn	
dataSize	TokenNameIdentifier	 data Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
MessageDigest	TokenNameIdentifier	 Message Digest
digest	TokenNameIdentifier	 digest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
compactedCf	TokenNameIdentifier	 compacted Cf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
DeletionInfo	TokenNameIdentifier	 Deletion Info
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
serializeForSSTable	TokenNameIdentifier	 serialize For SS Table
(	TokenNameLPAREN	
compactedCf	TokenNameIdentifier	 compacted Cf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
compactedCf	TokenNameIdentifier	 compacted Cf
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
compactedCf	TokenNameIdentifier	 compacted Cf
.	TokenNameDOT	
updateDigest	TokenNameIdentifier	 update Digest
(	TokenNameLPAREN	
digest	TokenNameIdentifier	 digest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compactedCf	TokenNameIdentifier	 compacted Cf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnStats	TokenNameIdentifier	 Column Stats
columnStats	TokenNameIdentifier	 column Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compactedCf	TokenNameIdentifier	 compacted Cf
.	TokenNameDOT	
getColumnStats	TokenNameIdentifier	 get Column Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the full column family represented by this compacted row. * * We do not provide this method for other AbstractCompactedRow, because this fits the whole row into * memory and don't make sense for those other implementations. */	TokenNameCOMMENT_JAVADOC	 @return the full column family represented by this compacted row. * We do not provide this method for other AbstractCompactedRow, because this fits the whole row into memory and don't make sense for those other implementations. 
public	TokenNamepublic	
ColumnFamily	TokenNameIdentifier	 Column Family
getFullColumnFamily	TokenNameIdentifier	 get Full Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compactedCf	TokenNameIdentifier	 compacted Cf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DeletionInfo	TokenNameIdentifier	 Deletion Info
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compactedCf	TokenNameIdentifier	 compacted Cf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the column index for this row. */	TokenNameCOMMENT_JAVADOC	 @return the column index for this row. 
public	TokenNamepublic	
ColumnIndex	TokenNameIdentifier	 Column Index
index	TokenNameIdentifier	 index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnIndex	TokenNameIdentifier	 column Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
