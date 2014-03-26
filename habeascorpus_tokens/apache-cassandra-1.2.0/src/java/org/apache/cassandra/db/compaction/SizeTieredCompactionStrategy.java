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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
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
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
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
SSTableReader	TokenNameIdentifier	 SS Table Reader
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
SizeTieredCompactionStrategy	TokenNameIdentifier	 Size Tiered Compaction Strategy
extends	TokenNameextends	
AbstractCompactionStrategy	TokenNameIdentifier	 Abstract Compaction Strategy
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SizeTieredCompactionStrategy	TokenNameIdentifier	 Size Tiered Compaction Strategy
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
DEFAULT_MIN_SSTABLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SSTABLE  SIZE
=	TokenNameEQUAL	
50L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
1024L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
1024L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEFAULT_BUCKET_LOW	TokenNameIdentifier	 DEFAULT  BUCKET  LOW
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEFAULT_BUCKET_HIGH	TokenNameIdentifier	 DEFAULT  BUCKET  HIGH
=	TokenNameEQUAL	
1.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MIN_SSTABLE_SIZE_KEY	TokenNameIdentifier	 MIN  SSTABLE  SIZE  KEY
=	TokenNameEQUAL	
"min_sstable_size"	TokenNameStringLiteral	min_sstable_size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUCKET_LOW_KEY	TokenNameIdentifier	 BUCKET  LOW  KEY
=	TokenNameEQUAL	
"bucket_low"	TokenNameStringLiteral	bucket_low
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUCKET_HIGH_KEY	TokenNameIdentifier	 BUCKET  HIGH  KEY
=	TokenNameEQUAL	
"bucket_high"	TokenNameStringLiteral	bucket_high
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
minSSTableSize	TokenNameIdentifier	 min SS Table Size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
bucketLow	TokenNameIdentifier	 bucket Low
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
bucketHigh	TokenNameIdentifier	 bucket High
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
volatile	TokenNamevolatile	
int	TokenNameint	
estimatedRemainingTasks	TokenNameIdentifier	 estimated Remaining Tasks
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SizeTieredCompactionStrategy	TokenNameIdentifier	 Size Tiered Compaction Strategy
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
estimatedRemainingTasks	TokenNameIdentifier	 estimated Remaining Tasks
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
MIN_SSTABLE_SIZE_KEY	TokenNameIdentifier	 MIN  SSTABLE  SIZE  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
minSSTableSize	TokenNameIdentifier	 min SS Table Size
=	TokenNameEQUAL	
optionValue	TokenNameIdentifier	 option Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DEFAULT_MIN_SSTABLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SSTABLE  SIZE
:	TokenNameCOLON	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionValue	TokenNameIdentifier	 option Value
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
BUCKET_LOW_KEY	TokenNameIdentifier	 BUCKET  LOW  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bucketLow	TokenNameIdentifier	 bucket Low
=	TokenNameEQUAL	
optionValue	TokenNameIdentifier	 option Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DEFAULT_BUCKET_LOW	TokenNameIdentifier	 DEFAULT  BUCKET  LOW
:	TokenNameCOLON	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionValue	TokenNameIdentifier	 option Value
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
BUCKET_HIGH_KEY	TokenNameIdentifier	 BUCKET  HIGH  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bucketHigh	TokenNameIdentifier	 bucket High
=	TokenNameEQUAL	
optionValue	TokenNameIdentifier	 option Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DEFAULT_BUCKET_HIGH	TokenNameIdentifier	 DEFAULT  BUCKET  HIGH
:	TokenNameCOLON	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bucketHigh	TokenNameIdentifier	 bucket High
<=	TokenNameLESS_EQUAL	
bucketLow	TokenNameIdentifier	 bucket Low
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Bucket low/high marks for {} incorrect, using defaults."	TokenNameStringLiteral	Bucket low/high marks for {} incorrect, using defaults.
,	TokenNameCOMMA	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getColumnFamilyName	TokenNameIdentifier	 get Column Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bucketLow	TokenNameIdentifier	 bucket Low
=	TokenNameEQUAL	
DEFAULT_BUCKET_LOW	TokenNameIdentifier	 DEFAULT  BUCKET  LOW
;	TokenNameSEMICOLON	
bucketHigh	TokenNameIdentifier	 bucket High
=	TokenNameEQUAL	
DEFAULT_BUCKET_HIGH	TokenNameIdentifier	 DEFAULT  BUCKET  HIGH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
setCompactionThresholds	TokenNameIdentifier	 set Compaction Thresholds
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getMinCompactionThreshold	TokenNameIdentifier	 get Min Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getMaxCompactionThreshold	TokenNameIdentifier	 get Max Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
AbstractCompactionTask	TokenNameIdentifier	 Abstract Compaction Task
getNextBackgroundTask	TokenNameIdentifier	 get Next Background Task
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
isCompactionDisabled	TokenNameIdentifier	 is Compaction Disabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Compaction is currently disabled."	TokenNameStringLiteral	Compaction is currently disabled.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
candidates	TokenNameIdentifier	 candidates
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getUncompactingSSTables	TokenNameIdentifier	 get Uncompacting SS Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>>	TokenNameRIGHT_SHIFT	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
createSSTableAndLengthPairs	TokenNameIdentifier	 create SS Table And Length Pairs
(	TokenNameLPAREN	
filterSuspectSSTables	TokenNameIdentifier	 filter Suspect SS Tables
(	TokenNameLPAREN	
candidates	TokenNameIdentifier	 candidates
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Compaction buckets are {}"	TokenNameStringLiteral	Compaction buckets are {}
,	TokenNameCOMMA	
buckets	TokenNameIdentifier	 buckets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateEstimatedCompactionsByTasks	TokenNameIdentifier	 update Estimated Compactions By Tasks
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>>	TokenNameRIGHT_SHIFT	
prunedBuckets	TokenNameIdentifier	 pruned Buckets
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
bucket	TokenNameIdentifier	 bucket
:	TokenNameCOLON	
buckets	TokenNameIdentifier	 buckets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getMinimumCompactionThreshold	TokenNameIdentifier	 get Minimum Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
SSTableReader	TokenNameIdentifier	 SS Table Reader
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
generation	TokenNameIdentifier	 generation
-	TokenNameMINUS	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
generation	TokenNameIdentifier	 generation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prunedBuckets	TokenNameIdentifier	 pruned Buckets
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getMaximumCompactionThreshold	TokenNameIdentifier	 get Maximum Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prunedBuckets	TokenNameIdentifier	 pruned Buckets
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if there is no sstable to compact in standard way, try compacting single sstable whose droppable tombstone 	TokenNameCOMMENT_LINE	if there is no sstable to compact in standard way, try compacting single sstable whose droppable tombstone 
// ratio is greater than threshold. 	TokenNameCOMMENT_LINE	ratio is greater than threshold. 
for	TokenNamefor	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
bucket	TokenNameIdentifier	 bucket
:	TokenNameCOLON	
buckets	TokenNameIdentifier	 buckets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
table	TokenNameIdentifier	 table
:	TokenNameCOLON	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
worthDroppingTombstones	TokenNameIdentifier	 worth Dropping Tombstones
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prunedBuckets	TokenNameIdentifier	 pruned Buckets
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prunedBuckets	TokenNameIdentifier	 pruned Buckets
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
smallestBucket	TokenNameIdentifier	 smallest Bucket
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
prunedBuckets	TokenNameIdentifier	 pruned Buckets
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
avgSize	TokenNameIdentifier	 avg Size
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
-	TokenNameMINUS	
avgSize	TokenNameIdentifier	 avg Size
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
avgSize	TokenNameIdentifier	 avg Size
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
sstables	TokenNameIdentifier	 sstables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
:	TokenNameCOLON	
sstables	TokenNameIdentifier	 sstables
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
bytesOnDisk	TokenNameIdentifier	 bytes On Disk
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
/	TokenNameDIVIDE	
sstables	TokenNameIdentifier	 sstables
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getDataTracker	TokenNameIdentifier	 get Data Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
markCompacting	TokenNameIdentifier	 mark Compacting
(	TokenNameLPAREN	
smallestBucket	TokenNameIdentifier	 smallest Bucket
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Unable to mark {} for compaction; probably a user-defined compaction got in the way"	TokenNameStringLiteral	Unable to mark {} for compaction; probably a user-defined compaction got in the way
,	TokenNameCOMMA	
smallestBucket	TokenNameIdentifier	 smallest Bucket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompactionTask	TokenNameIdentifier	 Compaction Task
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
smallestBucket	TokenNameIdentifier	 smallest Bucket
,	TokenNameCOMMA	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractCompactionTask	TokenNameIdentifier	 Abstract Compaction Task
getMaximalTask	TokenNameIdentifier	 get Maximal Task
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getSSTables	TokenNameIdentifier	 get SS Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
new	TokenNamenew	
CompactionTask	TokenNameIdentifier	 Compaction Task
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
filterSuspectSSTables	TokenNameIdentifier	 filter Suspect SS Tables
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getSSTables	TokenNameIdentifier	 get SS Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractCompactionTask	TokenNameIdentifier	 Abstract Compaction Task
getUserDefinedTask	TokenNameIdentifier	 get User Defined Task
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
sstables	TokenNameIdentifier	 sstables
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompactionTask	TokenNameIdentifier	 Compaction Task
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
sstables	TokenNameIdentifier	 sstables
,	TokenNameCOMMA	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserDefined	TokenNameIdentifier	 set User Defined
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getEstimatedRemainingTasks	TokenNameIdentifier	 get Estimated Remaining Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
estimatedRemainingTasks	TokenNameIdentifier	 estimated Remaining Tasks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
createSSTableAndLengthPairs	TokenNameIdentifier	 create SS Table And Length Pairs
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
collection	TokenNameIdentifier	 collection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
tableLengthPairs	TokenNameIdentifier	 table Length Pairs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
collection	TokenNameIdentifier	 collection
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
table	TokenNameIdentifier	 table
:	TokenNameCOLON	
collection	TokenNameIdentifier	 collection
)	TokenNameRPAREN	
tableLengthPairs	TokenNameIdentifier	 table Length Pairs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
onDiskLength	TokenNameIdentifier	 on Disk Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tableLengthPairs	TokenNameIdentifier	 table Length Pairs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Group files of similar size into buckets. */	TokenNameCOMMENT_BLOCK	 Group files of similar size into buckets. 
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Sort the list in order to get deterministic results during the grouping below 	TokenNameCOMMENT_LINE	Sort the list in order to get deterministic results during the grouping below 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
sortedFiles	TokenNameIdentifier	 sorted Files
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
sortedFiles	TokenNameIdentifier	 sorted Files
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outer	TokenNameIdentifier	 outer
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
pair	TokenNameIdentifier	 pair
:	TokenNameCOLON	
sortedFiles	TokenNameIdentifier	 sorted Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
pair	TokenNameIdentifier	 pair
.	TokenNameDOT	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
// look for a bucket containing similar-sized files: 	TokenNameCOMMENT_LINE	look for a bucket containing similar-sized files: 
// group in the same bucket if it's w/in 50% of the average for this bucket, 	TokenNameCOMMENT_LINE	group in the same bucket if it's w/in 50% of the average for this bucket, 
// or this file and the bucket are all considered "small" (less than `minSSTableSize`) 	TokenNameCOMMENT_LINE	or this file and the bucket are all considered "small" (less than `minSSTableSize`) 
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
oldAverageSize	TokenNameIdentifier	 old Average Size
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
(	TokenNameLPAREN	
oldAverageSize	TokenNameIdentifier	 old Average Size
*	TokenNameMULTIPLY	
bucketLow	TokenNameIdentifier	 bucket Low
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
(	TokenNameLPAREN	
oldAverageSize	TokenNameIdentifier	 old Average Size
*	TokenNameMULTIPLY	
bucketHigh	TokenNameIdentifier	 bucket High
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
minSSTableSize	TokenNameIdentifier	 min SS Table Size
&&	TokenNameAND_AND	
oldAverageSize	TokenNameIdentifier	 old Average Size
<	TokenNameLESS	
minSSTableSize	TokenNameIdentifier	 min SS Table Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// remove and re-add under new new average size 	TokenNameCOMMENT_LINE	remove and re-add under new new average size 
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
oldAverageSize	TokenNameIdentifier	 old Average Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
totalSize	TokenNameIdentifier	 total Size
=	TokenNameEQUAL	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
oldAverageSize	TokenNameIdentifier	 old Average Size
;	TokenNameSEMICOLON	
long	TokenNamelong	
newAverageSize	TokenNameIdentifier	 new Average Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
totalSize	TokenNameIdentifier	 total Size
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pair	TokenNameIdentifier	 pair
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
newAverageSize	TokenNameIdentifier	 new Average Size
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
outer	TokenNameIdentifier	 outer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// no similar bucket found; put it in a new one 	TokenNameCOMMENT_LINE	no similar bucket found; put it in a new one 
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pair	TokenNameIdentifier	 pair
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
updateEstimatedCompactionsByTasks	TokenNameIdentifier	 update Estimated Compactions By Tasks
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>>	TokenNameRIGHT_SHIFT	
tasks	TokenNameIdentifier	 tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
bucket	TokenNameIdentifier	 bucket
:	TokenNameCOLON	
tasks	TokenNameIdentifier	 tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getMinimumCompactionThreshold	TokenNameIdentifier	 get Minimum Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getMaximumCompactionThreshold	TokenNameIdentifier	 get Maximum Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
estimatedRemainingTasks	TokenNameIdentifier	 estimated Remaining Tasks
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getMaxSSTableSize	TokenNameIdentifier	 get Max SS Table Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"SizeTieredCompactionStrategy[%s/%s]"	TokenNameStringLiteral	SizeTieredCompactionStrategy[%s/%s]
,	TokenNameCOMMA	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getMinimumCompactionThreshold	TokenNameIdentifier	 get Minimum Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getMaximumCompactionThreshold	TokenNameIdentifier	 get Maximum Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
