package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * Merges segments of approximately equal size, subject to * an allowed number of segments per tier. This is similar * to {@link LogByteSizeMergePolicy}, except this merge * policy is able to merge non-adjacent segment, and * separates how many segments are merged at once ({@link * #setMaxMergeAtOnce}) from how many segments are allowed * per tier ({@link #setSegmentsPerTier}). This merge * policy also does not over-merge (i.e. cascade merges). * * <p>For normal merging, this policy first computes a * "budget" of how many segments are allowed by be in the * index. If the index is over-budget, then the policy * sorts segments by decreasing size (pro-rating by percent * deletes), and then finds the least-cost merge. Merge * cost is measured by a combination of the "skew" of the * merge (size of largest segment divided by smallest segment), * total merge size and percent deletes reclaimed, * so that merges with lower skew, smaller size * and those reclaiming more deletes, are * favored. * * <p>If a merge will produce a segment that's larger than * {@link #setMaxMergedSegmentMB}, then the policy will * merge fewer segments (down to 1 at once, if that one has * deletions) to keep the segment size under budget. * * <p<b>NOTE</b>: this policy freely merges non-adjacent * segments; if this is a problem, use {@link * LogMergePolicy}. * * <p><b>NOTE</b>: This policy always merges by byte size * of the segments, always pro-rates by percent deletes, * and does not apply any maximum segment size during * forceMerge (unlike {@link LogByteSizeMergePolicy}). * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Merges segments of approximately equal size, subject to an allowed number of segments per tier. This is similar to {@link LogByteSizeMergePolicy}, except this merge policy is able to merge non-adjacent segment, and separates how many segments are merged at once ({@link #setMaxMergeAtOnce}) from how many segments are allowed per tier ({@link #setSegmentsPerTier}). This merge policy also does not over-merge (i.e. cascade merges). * <p>For normal merging, this policy first computes a "budget" of how many segments are allowed by be in the index. If the index is over-budget, then the policy sorts segments by decreasing size (pro-rating by percent deletes), and then finds the least-cost merge. Merge cost is measured by a combination of the "skew" of the merge (size of largest segment divided by smallest segment), total merge size and percent deletes reclaimed, so that merges with lower skew, smaller size and those reclaiming more deletes, are favored. * <p>If a merge will produce a segment that's larger than {@link #setMaxMergedSegmentMB}, then the policy will merge fewer segments (down to 1 at once, if that one has deletions) to keep the segment size under budget. * <p<b>NOTE</b>: this policy freely merges non-adjacent segments; if this is a problem, use {@link LogMergePolicy}. * <p><b>NOTE</b>: This policy always merges by byte size of the segments, always pro-rates by percent deletes, and does not apply any maximum segment size during forceMerge (unlike {@link LogByteSizeMergePolicy}). * @lucene.experimental 
// TODO 	TokenNameCOMMENT_LINE	TODO 
// - we could try to take into account whether a large 	TokenNameCOMMENT_LINE	- we could try to take into account whether a large 
// merge is already running (under CMS) and then bias 	TokenNameCOMMENT_LINE	merge is already running (under CMS) and then bias 
// ourselves towards picking smaller merges if so (or, 	TokenNameCOMMENT_LINE	ourselves towards picking smaller merges if so (or, 
// maybe CMS should do so) 	TokenNameCOMMENT_LINE	maybe CMS should do so) 
public	TokenNamepublic	
class	TokenNameclass	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
extends	TokenNameextends	
MergePolicy	TokenNameIdentifier	 Merge Policy
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
maxMergeAtOnce	TokenNameIdentifier	 max Merge At Once
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
maxMergedSegmentBytes	TokenNameIdentifier	 max Merged Segment Bytes
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxMergeAtOnceExplicit	TokenNameIdentifier	 max Merge At Once Explicit
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
floorSegmentBytes	TokenNameIdentifier	 floor Segment Bytes
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
segsPerTier	TokenNameIdentifier	 segs Per Tier
=	TokenNameEQUAL	
10.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
forceMergeDeletesPctAllowed	TokenNameIdentifier	 force Merge Deletes Pct Allowed
=	TokenNameEQUAL	
10.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
reclaimDeletesWeight	TokenNameIdentifier	 reclaim Deletes Weight
=	TokenNameEQUAL	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** Maximum number of segments to be merged at a time * during "normal" merging. For explicit merging (eg, * forceMerge or forceMergeDeletes was called), see {@link * #setMaxMergeAtOnceExplicit}. Default is 10. */	TokenNameCOMMENT_JAVADOC	 Maximum number of segments to be merged at a time during "normal" merging. For explicit merging (eg, forceMerge or forceMergeDeletes was called), see {@link #setMaxMergeAtOnceExplicit}. Default is 10. 
public	TokenNamepublic	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
setMaxMergeAtOnce	TokenNameIdentifier	 set Max Merge At Once
(	TokenNameLPAREN	
int	TokenNameint	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"maxMergeAtOnce must be > 1 (got "	TokenNameStringLiteral	maxMergeAtOnce must be > 1 (got 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxMergeAtOnce	TokenNameIdentifier	 max Merge At Once
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setMaxMergeAtOnce */	TokenNameCOMMENT_JAVADOC	 @see #setMaxMergeAtOnce 
public	TokenNamepublic	
int	TokenNameint	
getMaxMergeAtOnce	TokenNameIdentifier	 get Max Merge At Once
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxMergeAtOnce	TokenNameIdentifier	 max Merge At Once
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: should addIndexes do explicit merging, too? And, 	TokenNameCOMMENT_LINE	TODO: should addIndexes do explicit merging, too? And, 
// if user calls IW.maybeMerge "explicitly" 	TokenNameCOMMENT_LINE	if user calls IW.maybeMerge "explicitly" 
/** Maximum number of segments to be merged at a time, * during forceMerge or forceMergeDeletes. Default is 30. */	TokenNameCOMMENT_JAVADOC	 Maximum number of segments to be merged at a time, during forceMerge or forceMergeDeletes. Default is 30. 
public	TokenNamepublic	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
setMaxMergeAtOnceExplicit	TokenNameIdentifier	 set Max Merge At Once Explicit
(	TokenNameLPAREN	
int	TokenNameint	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"maxMergeAtOnceExplicit must be > 1 (got "	TokenNameStringLiteral	maxMergeAtOnceExplicit must be > 1 (got 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxMergeAtOnceExplicit	TokenNameIdentifier	 max Merge At Once Explicit
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setMaxMergeAtOnceExplicit */	TokenNameCOMMENT_JAVADOC	 @see #setMaxMergeAtOnceExplicit 
public	TokenNamepublic	
int	TokenNameint	
getMaxMergeAtOnceExplicit	TokenNameIdentifier	 get Max Merge At Once Explicit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxMergeAtOnceExplicit	TokenNameIdentifier	 max Merge At Once Explicit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Maximum sized segment to produce during * normal merging. This setting is approximate: the * estimate of the merged segment size is made by summing * sizes of to-be-merged segments (compensating for * percent deleted docs). Default is 5 GB. */	TokenNameCOMMENT_JAVADOC	 Maximum sized segment to produce during normal merging. This setting is approximate: the estimate of the merged segment size is made by summing sizes of to-be-merged segments (compensating for percent deleted docs). Default is 5 GB. 
public	TokenNamepublic	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
setMaxMergedSegmentMB	TokenNameIdentifier	 set Max Merged Segment MB
(	TokenNameLPAREN	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxMergedSegmentBytes	TokenNameIdentifier	 max Merged Segment Bytes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #getMaxMergedSegmentMB */	TokenNameCOMMENT_JAVADOC	 @see #getMaxMergedSegmentMB 
public	TokenNamepublic	
double	TokenNamedouble	
getMaxMergedSegmentMB	TokenNameIdentifier	 get Max Merged Segment MB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxMergedSegmentBytes	TokenNameIdentifier	 max Merged Segment Bytes
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
1024.	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Controls how aggressively merges that reclaim more * deletions are favored. Higher values favor selecting * merges that reclaim deletions. A value of 0.0 means * deletions don't impact merge selection. */	TokenNameCOMMENT_JAVADOC	 Controls how aggressively merges that reclaim more deletions are favored. Higher values favor selecting merges that reclaim deletions. A value of 0.0 means deletions don't impact merge selection. 
public	TokenNamepublic	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
setReclaimDeletesWeight	TokenNameIdentifier	 set Reclaim Deletes Weight
(	TokenNameLPAREN	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"reclaimDeletesWeight must be >= 0.0 (got "	TokenNameStringLiteral	reclaimDeletesWeight must be >= 0.0 (got 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reclaimDeletesWeight	TokenNameIdentifier	 reclaim Deletes Weight
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** See {@link #setReclaimDeletesWeight}. */	TokenNameCOMMENT_JAVADOC	 See {@link #setReclaimDeletesWeight}. 
public	TokenNamepublic	
double	TokenNamedouble	
getReclaimDeletesWeight	TokenNameIdentifier	 get Reclaim Deletes Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reclaimDeletesWeight	TokenNameIdentifier	 reclaim Deletes Weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Segments smaller than this are "rounded up" to this * size, ie treated as equal (floor) size for merge * selection. This is to prevent frequent flushing of * tiny segments from allowing a long tail in the index. * Default is 2 MB. */	TokenNameCOMMENT_JAVADOC	 Segments smaller than this are "rounded up" to this size, ie treated as equal (floor) size for merge selection. This is to prevent frequent flushing of tiny segments from allowing a long tail in the index. Default is 2 MB. 
public	TokenNamepublic	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
setFloorSegmentMB	TokenNameIdentifier	 set Floor Segment MB
(	TokenNameLPAREN	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<=	TokenNameLESS_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"floorSegmentMB must be >= 0.0 (got "	TokenNameStringLiteral	floorSegmentMB must be >= 0.0 (got 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
floorSegmentBytes	TokenNameIdentifier	 floor Segment Bytes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setFloorSegmentMB */	TokenNameCOMMENT_JAVADOC	 @see #setFloorSegmentMB 
public	TokenNamepublic	
double	TokenNamedouble	
getFloorSegmentMB	TokenNameIdentifier	 get Floor Segment MB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
floorSegmentBytes	TokenNameIdentifier	 floor Segment Bytes
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** When forceMergeDeletes is called, we only merge away a * segment if its delete percentage is over this * threshold. Default is 10%. */	TokenNameCOMMENT_JAVADOC	 When forceMergeDeletes is called, we only merge away a segment if its delete percentage is over this threshold. Default is 10%. 
public	TokenNamepublic	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
setForceMergeDeletesPctAllowed	TokenNameIdentifier	 set Force Merge Deletes Pct Allowed
(	TokenNameLPAREN	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
0.0	TokenNameDoubleLiteral	
||	TokenNameOR_OR	
v	TokenNameIdentifier	 v
>	TokenNameGREATER	
100.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"forceMergeDeletesPctAllowed must be between 0.0 and 100.0 inclusive (got "	TokenNameStringLiteral	forceMergeDeletesPctAllowed must be between 0.0 and 100.0 inclusive (got 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
forceMergeDeletesPctAllowed	TokenNameIdentifier	 force Merge Deletes Pct Allowed
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setForceMergeDeletesPctAllowed */	TokenNameCOMMENT_JAVADOC	 @see #setForceMergeDeletesPctAllowed 
public	TokenNamepublic	
double	TokenNamedouble	
getForceMergeDeletesPctAllowed	TokenNameIdentifier	 get Force Merge Deletes Pct Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
forceMergeDeletesPctAllowed	TokenNameIdentifier	 force Merge Deletes Pct Allowed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the allowed number of segments per tier. Smaller * values mean more merging but fewer segments. * * <p><b>NOTE</b>: this value should be >= the {@link * #setMaxMergeAtOnce} otherwise you'll force too much * merging to occur.</p> * * <p>Default is 10.0.</p> */	TokenNameCOMMENT_JAVADOC	 Sets the allowed number of segments per tier. Smaller values mean more merging but fewer segments. * <p><b>NOTE</b>: this value should be >= the {@link #setMaxMergeAtOnce} otherwise you'll force too much merging to occur.</p> * <p>Default is 10.0.</p> 
public	TokenNamepublic	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
setSegmentsPerTier	TokenNameIdentifier	 set Segments Per Tier
(	TokenNameLPAREN	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"segmentsPerTier must be >= 2.0 (got "	TokenNameStringLiteral	segmentsPerTier must be >= 2.0 (got 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
segsPerTier	TokenNameIdentifier	 segs Per Tier
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setSegmentsPerTier */	TokenNameCOMMENT_JAVADOC	 @see #setSegmentsPerTier 
public	TokenNamepublic	
double	TokenNamedouble	
getSegmentsPerTier	TokenNameIdentifier	 get Segments Per Tier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segsPerTier	TokenNameIdentifier	 segs Per Tier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets whether compound file format should be used for * newly flushed and newly merged segments. Default * true. */	TokenNameCOMMENT_JAVADOC	 Sets whether compound file format should be used for newly flushed and newly merged segments. Default true. 
public	TokenNamepublic	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
setUseCompoundFile	TokenNameIdentifier	 set Use Compound File
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
useCompoundFile	TokenNameIdentifier	 use Compound File
=	TokenNameEQUAL	
useCompoundFile	TokenNameIdentifier	 use Compound File
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setUseCompoundFile */	TokenNameCOMMENT_JAVADOC	 @see #setUseCompoundFile 
public	TokenNamepublic	
boolean	TokenNameboolean	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
useCompoundFile	TokenNameIdentifier	 use Compound File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If a merged segment will be more than this percentage * of the total size of the index, leave the segment as * non-compound file even if compound file is enabled. * Set to 1.0 to always use CFS regardless of merge * size. Default is 0.1. */	TokenNameCOMMENT_JAVADOC	 If a merged segment will be more than this percentage of the total size of the index, leave the segment as non-compound file even if compound file is enabled. Set to 1.0 to always use CFS regardless of merge size. Default is 0.1. 
public	TokenNamepublic	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
setNoCFSRatio	TokenNameIdentifier	 set No CFS Ratio
(	TokenNameLPAREN	
double	TokenNamedouble	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
<	TokenNameLESS	
0.0	TokenNameDoubleLiteral	
||	TokenNameOR_OR	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
>	TokenNameGREATER	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"noCFSRatio must be 0.0 to 1.0 inclusive; got "	TokenNameStringLiteral	noCFSRatio must be 0.0 to 1.0 inclusive; got 
+	TokenNamePLUS	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
=	TokenNameEQUAL	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setNoCFSRatio */	TokenNameCOMMENT_JAVADOC	 @see #setNoCFSRatio 
public	TokenNamepublic	
double	TokenNamedouble	
getNoCFSRatio	TokenNameIdentifier	 get No CFS Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
SegmentByteSizeDescending	TokenNameIdentifier	 Segment Byte Size Descending
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
SegmentInfo	TokenNameIdentifier	 Segment Info
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
sz1	TokenNameIdentifier	 sz1
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
sz2	TokenNameIdentifier	 sz2
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sz1	TokenNameIdentifier	 sz1
>	TokenNameGREATER	
sz2	TokenNameIdentifier	 sz2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sz2	TokenNameIdentifier	 sz2
>	TokenNameGREATER	
sz1	TokenNameIdentifier	 sz1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
segmentByteSizeDescending	TokenNameIdentifier	 segment Byte Size Descending
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentByteSizeDescending	TokenNameIdentifier	 Segment Byte Size Descending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Holds score and explanation for a single candidate * merge. */	TokenNameCOMMENT_JAVADOC	 Holds score and explanation for a single candidate merge. 
protected	TokenNameprotected	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
MergeScore	TokenNameIdentifier	 Merge Score
{	TokenNameLBRACE	
abstract	TokenNameabstract	
double	TokenNamedouble	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
MergeSpecification	TokenNameIdentifier	 Merge Specification
findMerges	TokenNameIdentifier	 find Merges
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"findMerges: "	TokenNameStringLiteral	findMerges: 
+	TokenNamePLUS	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" segments"	TokenNameStringLiteral	 segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
merging	TokenNameIdentifier	 merging
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMergingSegments	TokenNameIdentifier	 get Merging Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
toBeMerged	TokenNameIdentifier	 to Be Merged
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
infosSorted	TokenNameIdentifier	 infos Sorted
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
infosSorted	TokenNameIdentifier	 infos Sorted
,	TokenNameCOMMA	
segmentByteSizeDescending	TokenNameIdentifier	 segment Byte Size Descending
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute total index bytes & print details about the index 	TokenNameCOMMENT_LINE	Compute total index bytes & print details about the index 
long	TokenNamelong	
totIndexBytes	TokenNameIdentifier	 tot Index Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
minSegmentBytes	TokenNameIdentifier	 min Segment Bytes
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
infosSorted	TokenNameIdentifier	 infos Sorted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
segBytes	TokenNameIdentifier	 seg Bytes
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
merging	TokenNameIdentifier	 merging
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
?	TokenNameQUESTION	
" [merging]"	TokenNameStringLiteral	 [merging]
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segBytes	TokenNameIdentifier	 seg Bytes
>=	TokenNameGREATER_EQUAL	
maxMergedSegmentBytes	TokenNameIdentifier	 max Merged Segment Bytes
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extra	TokenNameIdentifier	 extra
+=	TokenNamePLUS_EQUAL	
" [skip: too large]"	TokenNameStringLiteral	 [skip: too large]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
segBytes	TokenNameIdentifier	 seg Bytes
<	TokenNameLESS	
floorSegmentBytes	TokenNameIdentifier	 floor Segment Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extra	TokenNameIdentifier	 extra
+=	TokenNamePLUS_EQUAL	
" [floored]"	TokenNameStringLiteral	 [floored]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" seg="	TokenNameStringLiteral	 seg=
+	TokenNamePLUS	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
+	TokenNamePLUS	
" size="	TokenNameStringLiteral	 size=
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%.3f"	TokenNameStringLiteral	%.3f
,	TokenNameCOMMA	
segBytes	TokenNameIdentifier	 seg Bytes
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
1024.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" MB"	TokenNameStringLiteral	 MB
+	TokenNamePLUS	
extra	TokenNameIdentifier	 extra
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
minSegmentBytes	TokenNameIdentifier	 min Segment Bytes
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
segBytes	TokenNameIdentifier	 seg Bytes
,	TokenNameCOMMA	
minSegmentBytes	TokenNameIdentifier	 min Segment Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Accum total byte size 	TokenNameCOMMENT_LINE	Accum total byte size 
totIndexBytes	TokenNameIdentifier	 tot Index Bytes
+=	TokenNamePLUS_EQUAL	
segBytes	TokenNameIdentifier	 seg Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we have too-large segments, grace them out 	TokenNameCOMMENT_LINE	If we have too-large segments, grace them out 
// of the maxSegmentCount: 	TokenNameCOMMENT_LINE	of the maxSegmentCount: 
int	TokenNameint	
tooBigCount	TokenNameIdentifier	 too Big Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tooBigCount	TokenNameIdentifier	 too Big Count
<	TokenNameLESS	
infosSorted	TokenNameIdentifier	 infos Sorted
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
infosSorted	TokenNameIdentifier	 infos Sorted
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tooBigCount	TokenNameIdentifier	 too Big Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
maxMergedSegmentBytes	TokenNameIdentifier	 max Merged Segment Bytes
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totIndexBytes	TokenNameIdentifier	 tot Index Bytes
-=	TokenNameMINUS_EQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
infosSorted	TokenNameIdentifier	 infos Sorted
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tooBigCount	TokenNameIdentifier	 too Big Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tooBigCount	TokenNameIdentifier	 too Big Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
minSegmentBytes	TokenNameIdentifier	 min Segment Bytes
=	TokenNameEQUAL	
floorSize	TokenNameIdentifier	 floor Size
(	TokenNameLPAREN	
minSegmentBytes	TokenNameIdentifier	 min Segment Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute max allowed segs in the index 	TokenNameCOMMENT_LINE	Compute max allowed segs in the index 
long	TokenNamelong	
levelSize	TokenNameIdentifier	 level Size
=	TokenNameEQUAL	
minSegmentBytes	TokenNameIdentifier	 min Segment Bytes
;	TokenNameSEMICOLON	
long	TokenNamelong	
bytesLeft	TokenNameIdentifier	 bytes Left
=	TokenNameEQUAL	
totIndexBytes	TokenNameIdentifier	 tot Index Bytes
;	TokenNameSEMICOLON	
double	TokenNamedouble	
allowedSegCount	TokenNameIdentifier	 allowed Seg Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
segCountLevel	TokenNameIdentifier	 seg Count Level
=	TokenNameEQUAL	
bytesLeft	TokenNameIdentifier	 bytes Left
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
levelSize	TokenNameIdentifier	 level Size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segCountLevel	TokenNameIdentifier	 seg Count Level
<	TokenNameLESS	
segsPerTier	TokenNameIdentifier	 segs Per Tier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allowedSegCount	TokenNameIdentifier	 allowed Seg Count
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
segCountLevel	TokenNameIdentifier	 seg Count Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
allowedSegCount	TokenNameIdentifier	 allowed Seg Count
+=	TokenNamePLUS_EQUAL	
segsPerTier	TokenNameIdentifier	 segs Per Tier
;	TokenNameSEMICOLON	
bytesLeft	TokenNameIdentifier	 bytes Left
-=	TokenNameMINUS_EQUAL	
segsPerTier	TokenNameIdentifier	 segs Per Tier
*	TokenNameMULTIPLY	
levelSize	TokenNameIdentifier	 level Size
;	TokenNameSEMICOLON	
levelSize	TokenNameIdentifier	 level Size
*=	TokenNameMULTIPLY_EQUAL	
maxMergeAtOnce	TokenNameIdentifier	 max Merge At Once
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
allowedSegCountInt	TokenNameIdentifier	 allowed Seg Count Int
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
allowedSegCount	TokenNameIdentifier	 allowed Seg Count
;	TokenNameSEMICOLON	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Cycle to possibly select more than one merge: 	TokenNameCOMMENT_LINE	Cycle to possibly select more than one merge: 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
mergingBytes	TokenNameIdentifier	 merging Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Gather eligible segments for merging, ie segments 	TokenNameCOMMENT_LINE	Gather eligible segments for merging, ie segments 
// not already being merged and not already picked (by 	TokenNameCOMMENT_LINE	not already being merged and not already picked (by 
// prior iteration of this loop) for merging: 	TokenNameCOMMENT_LINE	prior iteration of this loop) for merging: 
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
eligible	TokenNameIdentifier	 eligible
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
tooBigCount	TokenNameIdentifier	 too Big Count
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
infosSorted	TokenNameIdentifier	 infos Sorted
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infosSorted	TokenNameIdentifier	 infos Sorted
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
merging	TokenNameIdentifier	 merging
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergingBytes	TokenNameIdentifier	 merging Bytes
+=	TokenNamePLUS_EQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
toBeMerged	TokenNameIdentifier	 to Be Merged
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
maxMergeIsRunning	TokenNameIdentifier	 max Merge Is Running
=	TokenNameEQUAL	
mergingBytes	TokenNameIdentifier	 merging Bytes
>=	TokenNameGREATER_EQUAL	
maxMergedSegmentBytes	TokenNameIdentifier	 max Merged Segment Bytes
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" allowedSegmentCount="	TokenNameStringLiteral	 allowedSegmentCount=
+	TokenNamePLUS	
allowedSegCountInt	TokenNameIdentifier	 allowed Seg Count Int
+	TokenNamePLUS	
" vs count="	TokenNameStringLiteral	 vs count=
+	TokenNamePLUS	
infosSorted	TokenNameIdentifier	 infos Sorted
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" (eligible count="	TokenNameStringLiteral	 (eligible count=
+	TokenNamePLUS	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") tooBigCount="	TokenNameStringLiteral	) tooBigCount=
+	TokenNamePLUS	
tooBigCount	TokenNameIdentifier	 too Big Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
allowedSegCountInt	TokenNameIdentifier	 allowed Seg Count Int
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// OK we are over budget -- find best merge! 	TokenNameCOMMENT_LINE	OK we are over budget -- find best merge! 
MergeScore	TokenNameIdentifier	 Merge Score
bestScore	TokenNameIdentifier	 best Score
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
best	TokenNameIdentifier	 best
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
bestTooLarge	TokenNameIdentifier	 best Too Large
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
long	TokenNamelong	
bestMergeBytes	TokenNameIdentifier	 best Merge Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Consider all merge starts: 	TokenNameCOMMENT_LINE	Consider all merge starts: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
startIdx	TokenNameIdentifier	 start Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
startIdx	TokenNameIdentifier	 start Idx
<=	TokenNameLESS_EQUAL	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
maxMergeAtOnce	TokenNameIdentifier	 max Merge At Once
;	TokenNameSEMICOLON	
startIdx	TokenNameIdentifier	 start Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
totAfterMergeBytes	TokenNameIdentifier	 tot After Merge Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
candidate	TokenNameIdentifier	 candidate
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hitTooLarge	TokenNameIdentifier	 hit Too Large
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
startIdx	TokenNameIdentifier	 start Idx
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
candidate	TokenNameIdentifier	 candidate
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
maxMergeAtOnce	TokenNameIdentifier	 max Merge At Once
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
segBytes	TokenNameIdentifier	 seg Bytes
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
totAfterMergeBytes	TokenNameIdentifier	 tot After Merge Bytes
+	TokenNamePLUS	
segBytes	TokenNameIdentifier	 seg Bytes
>	TokenNameGREATER	
maxMergedSegmentBytes	TokenNameIdentifier	 max Merged Segment Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hitTooLarge	TokenNameIdentifier	 hit Too Large
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// NOTE: we continue, so that we can try 	TokenNameCOMMENT_LINE	NOTE: we continue, so that we can try 
// "packing" smaller segments into this merge 	TokenNameCOMMENT_LINE	"packing" smaller segments into this merge 
// to see if we can get closer to the max 	TokenNameCOMMENT_LINE	to see if we can get closer to the max 
// size; this in general is not perfect since 	TokenNameCOMMENT_LINE	size; this in general is not perfect since 
// this is really "bin packing" and we'd have 	TokenNameCOMMENT_LINE	this is really "bin packing" and we'd have 
// to try different permutations. 	TokenNameCOMMENT_LINE	to try different permutations. 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
candidate	TokenNameIdentifier	 candidate
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totAfterMergeBytes	TokenNameIdentifier	 tot After Merge Bytes
+=	TokenNamePLUS_EQUAL	
segBytes	TokenNameIdentifier	 seg Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
MergeScore	TokenNameIdentifier	 Merge Score
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
,	TokenNameCOMMA	
hitTooLarge	TokenNameIdentifier	 hit Too Large
,	TokenNameCOMMA	
mergingBytes	TokenNameIdentifier	 merging Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" maybe="	TokenNameStringLiteral	 maybe=
+	TokenNamePLUS	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
+	TokenNamePLUS	
" score="	TokenNameStringLiteral	 score=
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
.	TokenNameDOT	
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" tooLarge="	TokenNameStringLiteral	 tooLarge=
+	TokenNamePLUS	
hitTooLarge	TokenNameIdentifier	 hit Too Large
+	TokenNamePLUS	
" size="	TokenNameStringLiteral	 size=
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%.3f MB"	TokenNameStringLiteral	%.3f MB
,	TokenNameCOMMA	
totAfterMergeBytes	TokenNameIdentifier	 tot After Merge Bytes
/	TokenNameDIVIDE	
1024.	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
1024.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we are already running a max sized merge 	TokenNameCOMMENT_LINE	If we are already running a max sized merge 
// (maxMergeIsRunning), don't allow another max 	TokenNameCOMMENT_LINE	(maxMergeIsRunning), don't allow another max 
// sized merge to kick off: 	TokenNameCOMMENT_LINE	sized merge to kick off: 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bestScore	TokenNameIdentifier	 best Score
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
score	TokenNameIdentifier	 score
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
bestScore	TokenNameIdentifier	 best Score
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
hitTooLarge	TokenNameIdentifier	 hit Too Large
||	TokenNameOR_OR	
!	TokenNameNOT	
maxMergeIsRunning	TokenNameIdentifier	 max Merge Is Running
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
best	TokenNameIdentifier	 best
=	TokenNameEQUAL	
candidate	TokenNameIdentifier	 candidate
;	TokenNameSEMICOLON	
bestScore	TokenNameIdentifier	 best Score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
bestTooLarge	TokenNameIdentifier	 best Too Large
=	TokenNameEQUAL	
hitTooLarge	TokenNameIdentifier	 hit Too Large
;	TokenNameSEMICOLON	
bestMergeBytes	TokenNameIdentifier	 best Merge Bytes
=	TokenNameEQUAL	
totAfterMergeBytes	TokenNameIdentifier	 tot After Merge Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
=	TokenNameEQUAL	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toBeMerged	TokenNameIdentifier	 to Be Merged
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" add merge="	TokenNameStringLiteral	 add merge=
+	TokenNamePLUS	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
+	TokenNamePLUS	
" size="	TokenNameStringLiteral	 size=
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%.3f MB"	TokenNameStringLiteral	%.3f MB
,	TokenNameCOMMA	
bestMergeBytes	TokenNameIdentifier	 best Merge Bytes
/	TokenNameDIVIDE	
1024.	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
1024.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" score="	TokenNameStringLiteral	 score=
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%.3f"	TokenNameStringLiteral	%.3f
,	TokenNameCOMMA	
bestScore	TokenNameIdentifier	 best Score
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
bestScore	TokenNameIdentifier	 best Score
.	TokenNameDOT	
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
bestTooLarge	TokenNameIdentifier	 best Too Large
?	TokenNameQUESTION	
" [max merge]"	TokenNameStringLiteral	 [max merge]
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Expert: scores one merge; subclasses can override. */	TokenNameCOMMENT_JAVADOC	 Expert: scores one merge; subclasses can override. 
protected	TokenNameprotected	
MergeScore	TokenNameIdentifier	 Merge Score
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
candidate	TokenNameIdentifier	 candidate
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hitTooLarge	TokenNameIdentifier	 hit Too Large
,	TokenNameCOMMA	
long	TokenNamelong	
mergingBytes	TokenNameIdentifier	 merging Bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
totBeforeMergeBytes	TokenNameIdentifier	 tot Before Merge Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
totAfterMergeBytes	TokenNameIdentifier	 tot After Merge Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
totAfterMergeBytesFloored	TokenNameIdentifier	 tot After Merge Bytes Floored
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
segBytes	TokenNameIdentifier	 seg Bytes
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totAfterMergeBytes	TokenNameIdentifier	 tot After Merge Bytes
+=	TokenNamePLUS_EQUAL	
segBytes	TokenNameIdentifier	 seg Bytes
;	TokenNameSEMICOLON	
totAfterMergeBytesFloored	TokenNameIdentifier	 tot After Merge Bytes Floored
+=	TokenNamePLUS_EQUAL	
floorSize	TokenNameIdentifier	 floor Size
(	TokenNameLPAREN	
segBytes	TokenNameIdentifier	 seg Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totBeforeMergeBytes	TokenNameIdentifier	 tot Before Merge Bytes
+=	TokenNamePLUS_EQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Measure "skew" of the merge, which can range 	TokenNameCOMMENT_LINE	Measure "skew" of the merge, which can range 
// from 1.0/numSegsBeingMerged (good) to 1.0 	TokenNameCOMMENT_LINE	from 1.0/numSegsBeingMerged (good) to 1.0 
// (poor): 	TokenNameCOMMENT_LINE	(poor): 
final	TokenNamefinal	
double	TokenNamedouble	
skew	TokenNameIdentifier	 skew
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hitTooLarge	TokenNameIdentifier	 hit Too Large
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Pretend the merge has perfect skew; skew doesn't 	TokenNameCOMMENT_LINE	Pretend the merge has perfect skew; skew doesn't 
// matter in this case because this merge will not 	TokenNameCOMMENT_LINE	matter in this case because this merge will not 
// "cascade" and so it cannot lead to N^2 merge cost 	TokenNameCOMMENT_LINE	"cascade" and so it cannot lead to N^2 merge cost 
// over time: 	TokenNameCOMMENT_LINE	over time: 
skew	TokenNameIdentifier	 skew
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
maxMergeAtOnce	TokenNameIdentifier	 max Merge At Once
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
skew	TokenNameIdentifier	 skew
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
floorSize	TokenNameIdentifier	 floor Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
totAfterMergeBytesFloored	TokenNameIdentifier	 tot After Merge Bytes Floored
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Strongly favor merges with less skew (smaller 	TokenNameCOMMENT_LINE	Strongly favor merges with less skew (smaller 
// mergeScore is better): 	TokenNameCOMMENT_LINE	mergeScore is better): 
double	TokenNamedouble	
mergeScore	TokenNameIdentifier	 merge Score
=	TokenNameEQUAL	
skew	TokenNameIdentifier	 skew
;	TokenNameSEMICOLON	
// Gently favor smaller merges over bigger ones. We 	TokenNameCOMMENT_LINE	Gently favor smaller merges over bigger ones. We 
// don't want to make this exponent too large else we 	TokenNameCOMMENT_LINE	don't want to make this exponent too large else we 
// can end up doing poor merges of small segments in 	TokenNameCOMMENT_LINE	can end up doing poor merges of small segments in 
// order to avoid the large merges: 	TokenNameCOMMENT_LINE	order to avoid the large merges: 
mergeScore	TokenNameIdentifier	 merge Score
*=	TokenNameMULTIPLY_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
totAfterMergeBytes	TokenNameIdentifier	 tot After Merge Bytes
,	TokenNameCOMMA	
0.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Strongly favor merges that reclaim deletes: 	TokenNameCOMMENT_LINE	Strongly favor merges that reclaim deletes: 
final	TokenNamefinal	
double	TokenNamedouble	
nonDelRatio	TokenNameIdentifier	 non Del Ratio
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
totAfterMergeBytes	TokenNameIdentifier	 tot After Merge Bytes
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
totBeforeMergeBytes	TokenNameIdentifier	 tot Before Merge Bytes
;	TokenNameSEMICOLON	
mergeScore	TokenNameIdentifier	 merge Score
*=	TokenNameMULTIPLY_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
nonDelRatio	TokenNameIdentifier	 non Del Ratio
,	TokenNameCOMMA	
reclaimDeletesWeight	TokenNameIdentifier	 reclaim Deletes Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
finalMergeScore	TokenNameIdentifier	 final Merge Score
=	TokenNameEQUAL	
mergeScore	TokenNameIdentifier	 merge Score
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
MergeScore	TokenNameIdentifier	 Merge Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
finalMergeScore	TokenNameIdentifier	 final Merge Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"skew="	TokenNameStringLiteral	skew=
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%.3f"	TokenNameStringLiteral	%.3f
,	TokenNameCOMMA	
skew	TokenNameIdentifier	 skew
)	TokenNameRPAREN	
+	TokenNamePLUS	
" nonDelRatio="	TokenNameStringLiteral	 nonDelRatio=
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%.3f"	TokenNameStringLiteral	%.3f
,	TokenNameCOMMA	
nonDelRatio	TokenNameIdentifier	 non Del Ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
MergeSpecification	TokenNameIdentifier	 Merge Specification
findForcedMerges	TokenNameIdentifier	 find Forced Merges
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
int	TokenNameint	
maxSegmentCount	TokenNameIdentifier	 max Segment Count
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
segmentsToMerge	TokenNameIdentifier	 segments To Merge
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"findForcedMerges maxSegmentCount="	TokenNameStringLiteral	findForcedMerges maxSegmentCount=
+	TokenNamePLUS	
maxSegmentCount	TokenNameIdentifier	 max Segment Count
+	TokenNamePLUS	
" infos="	TokenNameStringLiteral	 infos=
+	TokenNamePLUS	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
+	TokenNamePLUS	
" segmentsToMerge="	TokenNameStringLiteral	 segmentsToMerge=
+	TokenNamePLUS	
segmentsToMerge	TokenNameIdentifier	 segments To Merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
eligible	TokenNameIdentifier	 eligible
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
forceMergeRunning	TokenNameIdentifier	 force Merge Running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
merging	TokenNameIdentifier	 merging
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMergingSegments	TokenNameIdentifier	 get Merging Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
segmentIsOriginal	TokenNameIdentifier	 segment Is Original
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Boolean	TokenNameIdentifier	 Boolean
isOriginal	TokenNameIdentifier	 is Original
=	TokenNameEQUAL	
segmentsToMerge	TokenNameIdentifier	 segments To Merge
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isOriginal	TokenNameIdentifier	 is Original
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segmentIsOriginal	TokenNameIdentifier	 segment Is Original
=	TokenNameEQUAL	
isOriginal	TokenNameIdentifier	 is Original
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
merging	TokenNameIdentifier	 merging
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
forceMergeRunning	TokenNameIdentifier	 force Merge Running
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxSegmentCount	TokenNameIdentifier	 max Segment Count
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
maxSegmentCount	TokenNameIdentifier	 max Segment Count
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
maxSegmentCount	TokenNameIdentifier	 max Segment Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
segmentIsOriginal	TokenNameIdentifier	 segment Is Original
||	TokenNameOR_OR	
isMerged	TokenNameIdentifier	 is Merged
(	TokenNameLPAREN	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"already merged"	TokenNameStringLiteral	already merged
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
eligible	TokenNameIdentifier	 eligible
,	TokenNameCOMMA	
segmentByteSizeDescending	TokenNameIdentifier	 segment Byte Size Descending
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"eligible="	TokenNameStringLiteral	eligible=
+	TokenNamePLUS	
eligible	TokenNameIdentifier	 eligible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"forceMergeRunning="	TokenNameStringLiteral	forceMergeRunning=
+	TokenNamePLUS	
forceMergeRunning	TokenNameIdentifier	 force Merge Running
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Do full merges, first, backwards: 	TokenNameCOMMENT_LINE	Do full merges, first, backwards: 
while	TokenNamewhile	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
>=	TokenNameGREATER_EQUAL	
maxMergeAtOnceExplicit	TokenNameIdentifier	 max Merge At Once Explicit
+	TokenNamePLUS	
maxSegmentCount	TokenNameIdentifier	 max Segment Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
=	TokenNameEQUAL	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
maxMergeAtOnceExplicit	TokenNameIdentifier	 max Merge At Once Explicit
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"add merge="	TokenNameStringLiteral	add merge=
+	TokenNamePLUS	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
-=	TokenNameMINUS_EQUAL	
maxMergeAtOnceExplicit	TokenNameIdentifier	 max Merge At Once Explicit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
forceMergeRunning	TokenNameIdentifier	 force Merge Running
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do final merge 	TokenNameCOMMENT_LINE	Do final merge 
final	TokenNamefinal	
int	TokenNameint	
numToMerge	TokenNameIdentifier	 num To Merge
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
maxSegmentCount	TokenNameIdentifier	 max Segment Count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
=	TokenNameEQUAL	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
numToMerge	TokenNameIdentifier	 num To Merge
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"add final merge="	TokenNameStringLiteral	add final merge=
+	TokenNamePLUS	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
MergeSpecification	TokenNameIdentifier	 Merge Specification
findForcedDeletesMerges	TokenNameIdentifier	 find Forced Deletes Merges
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"findForcedDeletesMerges infos="	TokenNameStringLiteral	findForcedDeletesMerges infos=
+	TokenNamePLUS	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
+	TokenNamePLUS	
" forceMergeDeletesPctAllowed="	TokenNameStringLiteral	 forceMergeDeletesPctAllowed=
+	TokenNamePLUS	
forceMergeDeletesPctAllowed	TokenNameIdentifier	 force Merge Deletes Pct Allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
eligible	TokenNameIdentifier	 eligible
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
merging	TokenNameIdentifier	 merging
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMergingSegments	TokenNameIdentifier	 get Merging Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
pctDeletes	TokenNameIdentifier	 pct Deletes
=	TokenNameEQUAL	
100.	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numDeletedDocs	TokenNameIdentifier	 num Deleted Docs
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pctDeletes	TokenNameIdentifier	 pct Deletes
>	TokenNameGREATER	
forceMergeDeletesPctAllowed	TokenNameIdentifier	 force Merge Deletes Pct Allowed
&&	TokenNameAND_AND	
!	TokenNameNOT	
merging	TokenNameIdentifier	 merging
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
eligible	TokenNameIdentifier	 eligible
,	TokenNameCOMMA	
segmentByteSizeDescending	TokenNameIdentifier	 segment Byte Size Descending
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"eligible="	TokenNameStringLiteral	eligible=
+	TokenNamePLUS	
eligible	TokenNameIdentifier	 eligible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't enforce max merged size here: app is explicitly 	TokenNameCOMMENT_LINE	Don't enforce max merged size here: app is explicitly 
// calling forceMergeDeletes, and knows this may take a 	TokenNameCOMMENT_LINE	calling forceMergeDeletes, and knows this may take a 
// long time / produce big segments (like forceMerge): 	TokenNameCOMMENT_LINE	long time / produce big segments (like forceMerge): 
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
maxMergeAtOnceExplicit	TokenNameIdentifier	 max Merge At Once Explicit
,	TokenNameCOMMA	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
=	TokenNameEQUAL	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
eligible	TokenNameIdentifier	 eligible
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"add merge="	TokenNameStringLiteral	add merge=
+	TokenNamePLUS	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
SegmentInfo	TokenNameIdentifier	 Segment Info
mergedInfo	TokenNameIdentifier	 merged Info
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
doCFS	TokenNameIdentifier	 do CFS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doCFS	TokenNameIdentifier	 do CFS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
==	TokenNameEQUAL_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doCFS	TokenNameIdentifier	 do CFS
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
long	TokenNamelong	
totalSize	TokenNameIdentifier	 total Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
totalSize	TokenNameIdentifier	 total Size
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doCFS	TokenNameIdentifier	 do CFS
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
mergedInfo	TokenNameIdentifier	 merged Info
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
*	TokenNameMULTIPLY	
totalSize	TokenNameIdentifier	 total Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doCFS	TokenNameIdentifier	 do CFS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isMerged	TokenNameIdentifier	 is Merged
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexWriter	TokenNameIdentifier	 Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
w	TokenNameIdentifier	 w
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
numDeletedDocs	TokenNameIdentifier	 num Deleted Docs
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
hasDeletions	TokenNameIdentifier	 has Deletions
&&	TokenNameAND_AND	
!	TokenNameNOT	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
hasSeparateNorms	TokenNameIdentifier	 has Separate Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
==	TokenNameEQUAL_EQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
useCompoundFile	TokenNameIdentifier	 use Compound File
||	TokenNameOR_OR	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
<	TokenNameLESS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Segment size in bytes, pro-rated by % deleted 	TokenNameCOMMENT_LINE	Segment size in bytes, pro-rated by % deleted 
private	TokenNameprivate	
long	TokenNamelong	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
byteSize	TokenNameIdentifier	 byte Size
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numDeletedDocs	TokenNameIdentifier	 num Deleted Docs
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
delRatio	TokenNameIdentifier	 del Ratio
=	TokenNameEQUAL	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0.0f	TokenNameFloatingPointLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
delCount	TokenNameIdentifier	 del Count
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
delRatio	TokenNameIdentifier	 del Ratio
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
byteSize	TokenNameIdentifier	 byte Size
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
delRatio	TokenNameIdentifier	 del Ratio
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
floorSize	TokenNameIdentifier	 floor Size
(	TokenNameLPAREN	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
floorSegmentBytes	TokenNameIdentifier	 floor Segment Bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexWriter	TokenNameIdentifier	 Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"TMP: "	TokenNameStringLiteral	TMP: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"maxMergeAtOnce="	TokenNameStringLiteral	maxMergeAtOnce=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
maxMergeAtOnce	TokenNameIdentifier	 max Merge At Once
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"maxMergeAtOnceExplicit="	TokenNameStringLiteral	maxMergeAtOnceExplicit=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
maxMergeAtOnceExplicit	TokenNameIdentifier	 max Merge At Once Explicit
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"maxMergedSegmentMB="	TokenNameStringLiteral	maxMergedSegmentMB=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
maxMergedSegmentBytes	TokenNameIdentifier	 max Merged Segment Bytes
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
1024.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"floorSegmentMB="	TokenNameStringLiteral	floorSegmentMB=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
floorSegmentBytes	TokenNameIdentifier	 floor Segment Bytes
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
1024.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"forceMergeDeletesPctAllowed="	TokenNameStringLiteral	forceMergeDeletesPctAllowed=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
forceMergeDeletesPctAllowed	TokenNameIdentifier	 force Merge Deletes Pct Allowed
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"segmentsPerTier="	TokenNameStringLiteral	segmentsPerTier=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
segsPerTier	TokenNameIdentifier	 segs Per Tier
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"useCompoundFile="	TokenNameStringLiteral	useCompoundFile=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"noCFSRatio="	TokenNameStringLiteral	noCFSRatio=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
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
}	TokenNameRBRACE	
