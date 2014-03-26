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
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
Range	TokenNameIdentifier	 Range
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
Token	TokenNameIdentifier	 Token
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
Component	TokenNameIdentifier	 Component
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
/** * Pluggable compaction strategy determines how SSTables get merged. * * There are two main goals: * - perform background compaction constantly as needed; this typically makes a tradeoff between * i/o done by compaction, and merging done at read time. * - perform a full (maximum possible) compaction if requested by the user */	TokenNameCOMMENT_JAVADOC	 Pluggable compaction strategy determines how SSTables get merged. * There are two main goals: - perform background compaction constantly as needed; this typically makes a tradeoff between i/o done by compaction, and merging done at read time. - perform a full (maximum possible) compaction if requested by the user 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
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
AbstractCompactionStrategy	TokenNameIdentifier	 Abstract Compaction Strategy
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
DEFAULT_TOMBSTONE_THRESHOLD	TokenNameIdentifier	 DEFAULT  TOMBSTONE  THRESHOLD
=	TokenNameEQUAL	
0.2f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// minimum interval needed to perform tombstone removal compaction in seconds, default 86400 or 1 day. 	TokenNameCOMMENT_LINE	minimum interval needed to perform tombstone removal compaction in seconds, default 86400 or 1 day. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
DEFAULT_TOMBSTONE_COMPACTION_INTERVAL	TokenNameIdentifier	 DEFAULT  TOMBSTONE  COMPACTION  INTERVAL
=	TokenNameEQUAL	
86400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOMBSTONE_THRESHOLD_OPTION	TokenNameIdentifier	 TOMBSTONE  THRESHOLD  OPTION
=	TokenNameEQUAL	
"tombstone_threshold"	TokenNameStringLiteral	tombstone_threshold
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOMBSTONE_COMPACTION_INTERVAL_OPTION	TokenNameIdentifier	 TOMBSTONE  COMPACTION  INTERVAL  OPTION
=	TokenNameEQUAL	
"tombstone_compaction_interval"	TokenNameStringLiteral	tombstone_compaction_interval
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
float	TokenNamefloat	
tombstoneThreshold	TokenNameIdentifier	 tombstone Threshold
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
tombstoneCompactionInterval	TokenNameIdentifier	 tombstone Compaction Interval
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AbstractCompactionStrategy	TokenNameIdentifier	 Abstract Compaction Strategy
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
assert	TokenNameassert	
cfs	TokenNameIdentifier	 cfs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
TOMBSTONE_THRESHOLD_OPTION	TokenNameIdentifier	 TOMBSTONE  THRESHOLD  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tombstoneThreshold	TokenNameIdentifier	 tombstone Threshold
=	TokenNameEQUAL	
optionValue	TokenNameIdentifier	 option Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DEFAULT_TOMBSTONE_THRESHOLD	TokenNameIdentifier	 DEFAULT  TOMBSTONE  THRESHOLD
:	TokenNameCOLON	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
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
TOMBSTONE_COMPACTION_INTERVAL_OPTION	TokenNameIdentifier	 TOMBSTONE  COMPACTION  INTERVAL  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tombstoneCompactionInterval	TokenNameIdentifier	 tombstone Compaction Interval
=	TokenNameEQUAL	
optionValue	TokenNameIdentifier	 option Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DEFAULT_TOMBSTONE_COMPACTION_INTERVAL	TokenNameIdentifier	 DEFAULT  TOMBSTONE  COMPACTION  INTERVAL
:	TokenNameCOLON	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tombstoneCompactionInterval	TokenNameIdentifier	 tombstone Compaction Interval
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"tombstone_compaction_interval should not be negative({}). Using default value of {}."	TokenNameStringLiteral	tombstone_compaction_interval should not be negative({}). Using default value of {}.
,	TokenNameCOMMA	
tombstoneCompactionInterval	TokenNameIdentifier	 tombstone Compaction Interval
,	TokenNameCOMMA	
DEFAULT_TOMBSTONE_COMPACTION_INTERVAL	TokenNameIdentifier	 DEFAULT  TOMBSTONE  COMPACTION  INTERVAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tombstoneCompactionInterval	TokenNameIdentifier	 tombstone Compaction Interval
=	TokenNameEQUAL	
DEFAULT_TOMBSTONE_COMPACTION_INTERVAL	TokenNameIdentifier	 DEFAULT  TOMBSTONE  COMPACTION  INTERVAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Releases any resources if this strategy is shutdown (when the CFS is reloaded after a schema change). * Default is to do nothing. */	TokenNameCOMMENT_JAVADOC	 Releases any resources if this strategy is shutdown (when the CFS is reloaded after a schema change). Default is to do nothing. 
public	TokenNamepublic	
void	TokenNamevoid	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @param gcBefore throw away tombstones older than this * @return the next background/minor compaction task to run; null if nothing to do. * Is responsible for marking its sstables as compaction-pending. */	TokenNameCOMMENT_JAVADOC	 @param gcBefore throw away tombstones older than this @return the next background/minor compaction task to run; null if nothing to do. Is responsible for marking its sstables as compaction-pending. 
public	TokenNamepublic	
abstract	TokenNameabstract	
AbstractCompactionTask	TokenNameIdentifier	 Abstract Compaction Task
getNextBackgroundTask	TokenNameIdentifier	 get Next Background Task
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param gcBefore throw away tombstones older than this * @return a compaction task that should be run to compact this columnfamilystore * as much as possible. Null if nothing to do. */	TokenNameCOMMENT_JAVADOC	 @param gcBefore throw away tombstones older than this @return a compaction task that should be run to compact this columnfamilystore as much as possible. Null if nothing to do. 
public	TokenNamepublic	
abstract	TokenNameabstract	
AbstractCompactionTask	TokenNameIdentifier	 Abstract Compaction Task
getMaximalTask	TokenNameIdentifier	 get Maximal Task
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param sstables SSTables to compact. Must be marked as compacting. * @param gcBefore throw away tombstones older than this * @return a compaction task corresponding to the requested sstables. * Will not be null. (Will throw if user requests an invalid compaction.) */	TokenNameCOMMENT_JAVADOC	 @param sstables SSTables to compact. Must be marked as compacting. @param gcBefore throw away tombstones older than this @return a compaction task corresponding to the requested sstables. Will not be null. (Will throw if user requests an invalid compaction.) 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** * @return the number of background tasks estimated to still be needed for this columnfamilystore */	TokenNameCOMMENT_JAVADOC	 @return the number of background tasks estimated to still be needed for this columnfamilystore 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getEstimatedRemainingTasks	TokenNameIdentifier	 get Estimated Remaining Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return size in bytes of the largest sstables for this strategy */	TokenNameCOMMENT_JAVADOC	 @return size in bytes of the largest sstables for this strategy 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
getMaxSSTableSize	TokenNameIdentifier	 get Max SS Table Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Filters SSTables that are to be blacklisted from the given collection * * @param originalCandidates The collection to check for blacklisted SSTables * @return list of the SSTables with blacklisted ones filtered out */	TokenNameCOMMENT_JAVADOC	 Filters SSTables that are to be blacklisted from the given collection * @param originalCandidates The collection to check for blacklisted SSTables @return list of the SSTables with blacklisted ones filtered out 
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
filterSuspectSSTables	TokenNameIdentifier	 filter Suspect SS Tables
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
originalCandidates	TokenNameIdentifier	 original Candidates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
filteredCandidates	TokenNameIdentifier	 filtered Candidates
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
candidate	TokenNameIdentifier	 candidate
:	TokenNameCOLON	
originalCandidates	TokenNameIdentifier	 original Candidates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
candidate	TokenNameIdentifier	 candidate
.	TokenNameDOT	
isMarkedSuspect	TokenNameIdentifier	 is Marked Suspect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
filteredCandidates	TokenNameIdentifier	 filtered Candidates
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
filteredCandidates	TokenNameIdentifier	 filtered Candidates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a list of KeyScanners given sstables and a range on which to scan. * The default implementation simply grab one SSTableScanner per-sstable, but overriding this method * allow for a more memory efficient solution if we know the sstable don't overlap (see * LeveledCompactionStrategy for instance). */	TokenNameCOMMENT_JAVADOC	 Returns a list of KeyScanners given sstables and a range on which to scan. The default implementation simply grab one SSTableScanner per-sstable, but overriding this method allow for a more memory efficient solution if we know the sstable don't overlap (see LeveledCompactionStrategy for instance). 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ICompactionScanner	TokenNameIdentifier	 I Compaction Scanner
>	TokenNameGREATER	
getScanners	TokenNameIdentifier	 get Scanners
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
sstables	TokenNameIdentifier	 sstables
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ICompactionScanner	TokenNameIdentifier	 I Compaction Scanner
>	TokenNameGREATER	
scanners	TokenNameIdentifier	 scanners
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ICompactionScanner	TokenNameIdentifier	 I Compaction Scanner
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
:	TokenNameCOLON	
sstables	TokenNameIdentifier	 sstables
)	TokenNameRPAREN	
scanners	TokenNameIdentifier	 scanners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getDirectScanner	TokenNameIdentifier	 get Direct Scanner
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
scanners	TokenNameIdentifier	 scanners
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ICompactionScanner	TokenNameIdentifier	 I Compaction Scanner
>	TokenNameGREATER	
getScanners	TokenNameIdentifier	 get Scanners
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
toCompact	TokenNameIdentifier	 to Compact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getScanners	TokenNameIdentifier	 get Scanners
(	TokenNameLPAREN	
toCompact	TokenNameIdentifier	 to Compact
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if given sstable is worth dropping tombstones at gcBefore. * Check is skipped if tombstone_compaction_interval time does not elapse since sstable creation and returns false. * * @param sstable SSTable to check * @param gcBefore time to drop tombstones * @return true if given sstable's tombstones are expected to be removed */	TokenNameCOMMENT_JAVADOC	 Check if given sstable is worth dropping tombstones at gcBefore. Check is skipped if tombstone_compaction_interval time does not elapse since sstable creation and returns false. * @param sstable SSTable to check @param gcBefore time to drop tombstones @return true if given sstable's tombstones are expected to be removed 
protected	TokenNameprotected	
boolean	TokenNameboolean	
worthDroppingTombstones	TokenNameIdentifier	 worth Dropping Tombstones
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// since we use estimations to calculate, there is a chance that compaction will not drop tombstones actually. 	TokenNameCOMMENT_LINE	since we use estimations to calculate, there is a chance that compaction will not drop tombstones actually. 
// if that happens we will end up in infinite compaction loop, so first we check enough if enough time has 	TokenNameCOMMENT_LINE	if that happens we will end up in infinite compaction loop, so first we check enough if enough time has 
// elapsed since SSTable created. 	TokenNameCOMMENT_LINE	elapsed since SSTable created. 
if	TokenNameif	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getCreationTimeFor	TokenNameIdentifier	 get Creation Time For
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
DATA	TokenNameIdentifier	 DATA
)	TokenNameRPAREN	
+	TokenNamePLUS	
tombstoneCompactionInterval	TokenNameIdentifier	 tombstone Compaction Interval
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
droppableRatio	TokenNameIdentifier	 droppable Ratio
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getEstimatedDroppableTombstoneRatio	TokenNameIdentifier	 get Estimated Droppable Tombstone Ratio
(	TokenNameLPAREN	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
droppableRatio	TokenNameIdentifier	 droppable Ratio
<=	TokenNameLESS_EQUAL	
tombstoneThreshold	TokenNameIdentifier	 tombstone Threshold
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
overlaps	TokenNameIdentifier	 overlaps
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getOverlappingSSTables	TokenNameIdentifier	 get Overlapping SS Tables
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
overlaps	TokenNameIdentifier	 overlaps
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// there is no overlap, tombstones are safely droppable 	TokenNameCOMMENT_LINE	there is no overlap, tombstones are safely droppable 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// what percentage of columns do we expect to compact outside of overlap? 	TokenNameCOMMENT_LINE	what percentage of columns do we expect to compact outside of overlap? 
if	TokenNameif	
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getKeySamples	TokenNameIdentifier	 get Key Samples
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have too few samples to estimate correct percentage 	TokenNameCOMMENT_LINE	we have too few samples to estimate correct percentage 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// first, calculate estimated keys that do not overlap 	TokenNameCOMMENT_LINE	first, calculate estimated keys that do not overlap 
long	TokenNamelong	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
estimatedKeys	TokenNameIdentifier	 estimated Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>>	TokenNameRIGHT_SHIFT	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
overlap	TokenNameIdentifier	 overlap
:	TokenNameCOLON	
overlaps	TokenNameIdentifier	 overlaps
)	TokenNameRPAREN	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
overlap	TokenNameIdentifier	 overlap
.	TokenNameDOT	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
overlap	TokenNameIdentifier	 overlap
.	TokenNameDOT	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
overlap	TokenNameIdentifier	 overlap
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
remainingKeys	TokenNameIdentifier	 remaining Keys
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
-	TokenNameMINUS	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
estimatedKeysForRanges	TokenNameIdentifier	 estimated Keys For Ranges
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// next, calculate what percentage of columns we have within those keys 	TokenNameCOMMENT_LINE	next, calculate what percentage of columns we have within those keys 
long	TokenNamelong	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getEstimatedColumnCount	TokenNameIdentifier	 get Estimated Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
mean	TokenNameIdentifier	 mean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
remainingKeys	TokenNameIdentifier	 remaining Keys
;	TokenNameSEMICOLON	
double	TokenNamedouble	
remainingColumnsRatio	TokenNameIdentifier	 remaining Columns Ratio
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getEstimatedColumnCount	TokenNameIdentifier	 get Estimated Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getEstimatedColumnCount	TokenNameIdentifier	 get Estimated Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
mean	TokenNameIdentifier	 mean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return if we still expect to have droppable tombstones in rest of columns 	TokenNameCOMMENT_LINE	return if we still expect to have droppable tombstones in rest of columns 
return	TokenNamereturn	
remainingColumnsRatio	TokenNameIdentifier	 remaining Columns Ratio
*	TokenNameMULTIPLY	
droppableRatio	TokenNameIdentifier	 droppable Ratio
>	TokenNameGREATER	
tombstoneThreshold	TokenNameIdentifier	 tombstone Threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
