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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
SerialMergeScheduler	TokenNameIdentifier	 Serial Merge Scheduler
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TieredMergePolicy	TokenNameIdentifier	 Tiered Merge Policy
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
/** * Merge policy that tries to balance not doing large * segment merges with not accumulating too many segments in * the index, to provide for better performance in near * real-time setting. * * <p>This is based on code from zoie, described in more detail * at http://code.google.com/p/zoie/wiki/ZoieMergePolicy.</p> * * <p><b>WARNING</b>: there is a known bug in this merge policy * that causes it to run forever, merging the same single * segment over and over. If you use {@link * SerialMergeScheduler} this can cause an index thread to * hang forever merging. See <a * href="https://issues.apache.org/jira/browse/LUCENE-4269">LUCENE-4269</a> * for details.</p> * * @deprecated This class is removed in 4.0; use {@link * TieredMergePolicy} instead. */	TokenNameCOMMENT_JAVADOC	 Merge policy that tries to balance not doing large segment merges with not accumulating too many segments in the index, to provide for better performance in near real-time setting. * <p>This is based on code from zoie, described in more detail at http://code.google.com/p/zoie/wiki/ZoieMergePolicy.</p> * <p><b>WARNING</b>: there is a known bug in this merge policy that causes it to run forever, merging the same single segment over and over. If you use {@link SerialMergeScheduler} this can cause an index thread to hang forever merging. See <a href="https://issues.apache.org/jira/browse/LUCENE-4269">LUCENE-4269</a> for details.</p> * @deprecated This class is removed in 4.0; use {@link TieredMergePolicy} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
BalancedSegmentMergePolicy	TokenNameIdentifier	 Balanced Segment Merge Policy
extends	TokenNameextends	
LogByteSizeMergePolicy	TokenNameIdentifier	 Log Byte Size Merge Policy
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_NUM_LARGE_SEGMENTS	TokenNameIdentifier	 DEFAULT  NUM  LARGE  SEGMENTS
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_partialExpunge	TokenNameIdentifier	 partial Expunge
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
=	TokenNameEQUAL	
DEFAULT_NUM_LARGE_SEGMENTS	TokenNameIdentifier	 DEFAULT  NUM  LARGE  SEGMENTS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
.	TokenNameDOT	
DEFAULT_MERGE_FACTOR	TokenNameIdentifier	 DEFAULT  MERGE  FACTOR
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_maxSegments	TokenNameIdentifier	 max Segments
=	TokenNameEQUAL	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
+	TokenNamePLUS	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BalancedSegmentMergePolicy	TokenNameIdentifier	 Balanced Segment Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMergePolicyParams	TokenNameIdentifier	 set Merge Policy Params
(	TokenNameLPAREN	
MergePolicyParams	TokenNameIdentifier	 Merge Policy Params
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPartialExpunge	TokenNameIdentifier	 set Partial Expunge
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
_doPartialExpunge	TokenNameIdentifier	 do Partial Expunge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNumLargeSegments	TokenNameIdentifier	 set Num Large Segments
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMaxSmallSegments	TokenNameIdentifier	 set Max Small Segments
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPartialExpunge	TokenNameIdentifier	 set Partial Expunge
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
_doPartialExpunge	TokenNameIdentifier	 do Partial Expunge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMergeFactor	TokenNameIdentifier	 set Merge Factor
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
_mergeFactor	TokenNameIdentifier	 merge Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setUseCompoundFile	TokenNameIdentifier	 set Use Compound File
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
_useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
_maxMergeDocs	TokenNameIdentifier	 max Merge Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
long	TokenNamelong	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
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
float	TokenNamefloat	
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
float	TokenNamefloat	
)	TokenNameRPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getDelCount	TokenNameIdentifier	 get Del Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
byteSize	TokenNameIdentifier	 byte Size
:	TokenNameCOLON	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
delRatio	TokenNameIdentifier	 del Ratio
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
byteSize	TokenNameIdentifier	 byte Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPartialExpunge	TokenNameIdentifier	 set Partial Expunge
(	TokenNameLPAREN	
boolean	TokenNameboolean	
doPartialExpunge	TokenNameIdentifier	 do Partial Expunge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_partialExpunge	TokenNameIdentifier	 partial Expunge
=	TokenNameEQUAL	
doPartialExpunge	TokenNameIdentifier	 do Partial Expunge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getPartialExpunge	TokenNameIdentifier	 get Partial Expunge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_partialExpunge	TokenNameIdentifier	 partial Expunge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNumLargeSegments	TokenNameIdentifier	 set Num Large Segments
(	TokenNameLPAREN	
int	TokenNameint	
numLargeSegments	TokenNameIdentifier	 num Large Segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numLargeSegments	TokenNameIdentifier	 num Large Segments
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"numLargeSegments cannot be less than 2"	TokenNameStringLiteral	numLargeSegments cannot be less than 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
=	TokenNameEQUAL	
numLargeSegments	TokenNameIdentifier	 num Large Segments
;	TokenNameSEMICOLON	
_maxSegments	TokenNameIdentifier	 max Segments
=	TokenNameEQUAL	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
getMergeFactor	TokenNameIdentifier	 get Merge Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumLargeSegments	TokenNameIdentifier	 get Num Large Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxSmallSegments	TokenNameIdentifier	 set Max Small Segments
(	TokenNameLPAREN	
int	TokenNameint	
maxSmallSegments	TokenNameIdentifier	 max Small Segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxSmallSegments	TokenNameIdentifier	 max Small Segments
<	TokenNameLESS	
getMergeFactor	TokenNameIdentifier	 get Merge Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"maxSmallSegments cannot be less than mergeFactor"	TokenNameStringLiteral	maxSmallSegments cannot be less than mergeFactor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
=	TokenNameEQUAL	
maxSmallSegments	TokenNameIdentifier	 max Small Segments
;	TokenNameSEMICOLON	
_maxSegments	TokenNameIdentifier	 max Segments
=	TokenNameEQUAL	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
+	TokenNamePLUS	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxSmallSegments	TokenNameIdentifier	 get Max Small Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setMergeFactor	TokenNameIdentifier	 set Merge Factor
(	TokenNameLPAREN	
int	TokenNameint	
mergeFactor	TokenNameIdentifier	 merge Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setMergeFactor	TokenNameIdentifier	 set Merge Factor
(	TokenNameLPAREN	
mergeFactor	TokenNameIdentifier	 merge Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
<	TokenNameLESS	
getMergeFactor	TokenNameIdentifier	 get Merge Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
=	TokenNameEQUAL	
getMergeFactor	TokenNameIdentifier	 get Merge Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_maxSegments	TokenNameIdentifier	 max Segments
=	TokenNameEQUAL	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
+	TokenNamePLUS	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
maxNumSegments	TokenNameIdentifier	 max Num Segments
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
assert	TokenNameassert	
maxNumSegments	TokenNameIdentifier	 max Num Segments
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isMerged	TokenNameIdentifier	 is Merged
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
maxNumSegments	TokenNameIdentifier	 max Num Segments
,	TokenNameCOMMA	
segmentsToMerge	TokenNameIdentifier	 segments To Merge
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Find the newest (rightmost) segment that needs to 	TokenNameCOMMENT_LINE	Find the newest (rightmost) segment that needs to 
// be merged (other segments may have been flushed 	TokenNameCOMMENT_LINE	be merged (other segments may have been flushed 
// since the merge started): 	TokenNameCOMMENT_LINE	since the merge started): 
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segmentsToMerge	TokenNameIdentifier	 segments To Merge
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxNumSegments	TokenNameIdentifier	 max Num Segments
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since we must merge down to 1 segment, the 	TokenNameCOMMENT_LINE	Since we must merge down to 1 segment, the 
// choice is simple: 	TokenNameCOMMENT_LINE	choice is simple: 
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
isMerged	TokenNameIdentifier	 is Merged
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
>	TokenNameGREATER	
maxNumSegments	TokenNameIdentifier	 max Num Segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find most balanced merges 	TokenNameCOMMENT_LINE	find most balanced merges 
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
findBalancedMerges	TokenNameIdentifier	 find Balanced Merges
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
maxNumSegments	TokenNameIdentifier	 max Num Segments
,	TokenNameCOMMA	
_partialExpunge	TokenNameIdentifier	 partial Expunge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
MergeSpecification	TokenNameIdentifier	 Merge Specification
findBalancedMerges	TokenNameIdentifier	 find Balanced Merges
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
int	TokenNameint	
infoLen	TokenNameIdentifier	 info Len
,	TokenNameCOMMA	
int	TokenNameint	
maxNumSegments	TokenNameIdentifier	 max Num Segments
,	TokenNameCOMMA	
boolean	TokenNameboolean	
partialExpunge	TokenNameIdentifier	 partial Expunge
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoLen	TokenNameIdentifier	 info Len
<=	TokenNameLESS_EQUAL	
maxNumSegments	TokenNameIdentifier	 max Num Segments
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use Viterbi algorithm to find the best segmentation. 	TokenNameCOMMENT_LINE	use Viterbi algorithm to find the best segmentation. 
// we will try to minimize the size variance of resulting segments. 	TokenNameCOMMENT_LINE	we will try to minimize the size variance of resulting segments. 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
variance	TokenNameIdentifier	 variance
=	TokenNameEQUAL	
createVarianceTable	TokenNameIdentifier	 create Variance Table
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
infoLen	TokenNameIdentifier	 info Len
,	TokenNameCOMMA	
maxNumSegments	TokenNameIdentifier	 max Num Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
maxMergeSegments	TokenNameIdentifier	 max Merge Segments
=	TokenNameEQUAL	
infoLen	TokenNameIdentifier	 info Len
-	TokenNameMINUS	
maxNumSegments	TokenNameIdentifier	 max Num Segments
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sumVariance	TokenNameIdentifier	 sum Variance
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
maxMergeSegments	TokenNameIdentifier	 max Merge Segments
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
backLink	TokenNameIdentifier	 back Link
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
maxNumSegments	TokenNameIdentifier	 max Num Segments
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
maxMergeSegments	TokenNameIdentifier	 max Merge Segments
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
maxMergeSegments	TokenNameIdentifier	 max Merge Segments
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumVariance	TokenNameIdentifier	 sum Variance
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
variance	TokenNameIdentifier	 variance
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
backLink	TokenNameIdentifier	 back Link
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
maxNumSegments	TokenNameIdentifier	 max Num Segments
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
(	TokenNameLPAREN	
maxMergeSegments	TokenNameIdentifier	 max Merge Segments
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
minV	TokenNameIdentifier	 min V
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
int	TokenNameint	
minK	TokenNameIdentifier	 min K
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
sumVariance	TokenNameIdentifier	 sum Variance
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
+	TokenNamePLUS	
variance	TokenNameIdentifier	 variance
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
minV	TokenNameIdentifier	 min V
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minV	TokenNameIdentifier	 min V
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
minK	TokenNameIdentifier	 min K
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sumVariance	TokenNameIdentifier	 sum Variance
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
minV	TokenNameIdentifier	 min V
;	TokenNameSEMICOLON	
backLink	TokenNameIdentifier	 back Link
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
minK	TokenNameIdentifier	 min K
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now, trace back the back links to find all merges, 	TokenNameCOMMENT_LINE	now, trace back the back links to find all merges, 
// also find a candidate for partial expunge if requested 	TokenNameCOMMENT_LINE	also find a candidate for partial expunge if requested 
int	TokenNameint	
mergeEnd	TokenNameIdentifier	 merge End
=	TokenNameEQUAL	
infoLen	TokenNameIdentifier	 info Len
;	TokenNameSEMICOLON	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
maxMergeSegments	TokenNameIdentifier	 max Merge Segments
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
expungeCandidate	TokenNameIdentifier	 expunge Candidate
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxDelCount	TokenNameIdentifier	 max Del Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
maxNumSegments	TokenNameIdentifier	 max Num Segments
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
backLink	TokenNameIdentifier	 back Link
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
prev	TokenNameIdentifier	 prev
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
mergeStart	TokenNameIdentifier	 merge Start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
mergeEnd	TokenNameIdentifier	 merge End
-	TokenNameMINUS	
mergeStart	TokenNameIdentifier	 merge Start
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
mergeStart	TokenNameIdentifier	 merge Start
,	TokenNameCOMMA	
mergeEnd	TokenNameIdentifier	 merge End
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
partialExpunge	TokenNameIdentifier	 partial Expunge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
mergeStart	TokenNameIdentifier	 merge Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getDelCount	TokenNameIdentifier	 get Del Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delCount	TokenNameIdentifier	 del Count
>	TokenNameGREATER	
maxDelCount	TokenNameIdentifier	 max Del Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expungeCandidate	TokenNameIdentifier	 expunge Candidate
=	TokenNameEQUAL	
mergeStart	TokenNameIdentifier	 merge Start
;	TokenNameSEMICOLON	
maxDelCount	TokenNameIdentifier	 max Del Count
=	TokenNameEQUAL	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
mergeEnd	TokenNameIdentifier	 merge End
=	TokenNameEQUAL	
mergeStart	TokenNameIdentifier	 merge Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
partialExpunge	TokenNameIdentifier	 partial Expunge
&&	TokenNameAND_AND	
maxDelCount	TokenNameIdentifier	 max Del Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expunge deletes 	TokenNameCOMMENT_LINE	expunge deletes 
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
expungeCandidate	TokenNameIdentifier	 expunge Candidate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
createVarianceTable	TokenNameIdentifier	 create Variance Table
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
int	TokenNameint	
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
int	TokenNameint	
maxNumSegments	TokenNameIdentifier	 max Num Segments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
maxMergeSegments	TokenNameIdentifier	 max Merge Segments
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
-	TokenNameMINUS	
maxNumSegments	TokenNameIdentifier	 max Num Segments
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
variance	TokenNameIdentifier	 variance
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
last	TokenNameIdentifier	 last
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
maxMergeSegments	TokenNameIdentifier	 max Merge Segments
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// compute the optimal segment size 	TokenNameCOMMENT_LINE	compute the optimal segment size 
long	TokenNamelong	
optSize	TokenNameIdentifier	 opt Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sizeArr	TokenNameIdentifier	 size Arr
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
last	TokenNameIdentifier	 last
]	TokenNameRBRACKET	
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
sizeArr	TokenNameIdentifier	 size Arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sizeArr	TokenNameIdentifier	 size Arr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optSize	TokenNameIdentifier	 opt Size
+=	TokenNamePLUS_EQUAL	
sizeArr	TokenNameIdentifier	 size Arr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
optSize	TokenNameIdentifier	 opt Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
optSize	TokenNameIdentifier	 opt Size
/	TokenNameDIVIDE	
maxNumSegments	TokenNameIdentifier	 max Num Segments
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
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
maxMergeSegments	TokenNameIdentifier	 max Merge Segments
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
<	TokenNameLESS	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
sizeArr	TokenNameIdentifier	 size Arr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
residual	TokenNameIdentifier	 residual
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
optSize	TokenNameIdentifier	 opt Size
)	TokenNameRPAREN	
-	TokenNameMINUS	
1.0d	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
variance	TokenNameIdentifier	 variance
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
residual	TokenNameIdentifier	 residual
*	TokenNameMULTIPLY	
residual	TokenNameIdentifier	 residual
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
variance	TokenNameIdentifier	 variance
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
variance	TokenNameIdentifier	 variance
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
final	TokenNamefinal	
int	TokenNameint	
numSegs	TokenNameIdentifier	 num Segs
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numLargeSegs	TokenNameIdentifier	 num Large Segs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
numSegs	TokenNameIdentifier	 num Segs
<	TokenNameLESS	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
?	TokenNameQUESTION	
numSegs	TokenNameIdentifier	 num Segs
:	TokenNameCOLON	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numLargeSegs	TokenNameIdentifier	 num Large Segs
<	TokenNameLESS	
numSegs	TokenNameIdentifier	 num Segs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// hack to create a shallow sub-range as SegmentInfos instance, 	TokenNameCOMMENT_LINE	hack to create a shallow sub-range as SegmentInfos instance, 
// it does not clone all metadata, but LogMerge does not need it 	TokenNameCOMMENT_LINE	it does not clone all metadata, but LogMerge does not need it 
final	TokenNamefinal	
SegmentInfos	TokenNameIdentifier	 Segment Infos
smallSegments	TokenNameIdentifier	 small Segments
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
smallSegments	TokenNameIdentifier	 small Segments
.	TokenNameDOT	
rollbackSegmentInfos	TokenNameIdentifier	 rollback Segment Infos
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
numLargeSegs	TokenNameIdentifier	 num Large Segs
,	TokenNameCOMMA	
numSegs	TokenNameIdentifier	 num Segs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
findForcedDeletesMerges	TokenNameIdentifier	 find Forced Deletes Merges
(	TokenNameLPAREN	
smallSegments	TokenNameIdentifier	 small Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
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
numLargeSegs	TokenNameIdentifier	 num Large Segs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
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
final	TokenNamefinal	
int	TokenNameint	
numSegs	TokenNameIdentifier	 num Segs
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numLargeSegs	TokenNameIdentifier	 num Large Segs
=	TokenNameEQUAL	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSegs	TokenNameIdentifier	 num Segs
<=	TokenNameLESS_EQUAL	
numLargeSegs	TokenNameIdentifier	 num Large Segs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
totalLargeSegSize	TokenNameIdentifier	 total Large Seg Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
totalSmallSegSize	TokenNameIdentifier	 total Small Seg Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
// compute the total size of large segments 	TokenNameCOMMENT_LINE	compute the total size of large segments 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numLargeSegs	TokenNameIdentifier	 num Large Segs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalLargeSegSize	TokenNameIdentifier	 total Large Seg Size
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// compute the total size of small segments 	TokenNameCOMMENT_LINE	compute the total size of small segments 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
numLargeSegs	TokenNameIdentifier	 num Large Segs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numSegs	TokenNameIdentifier	 num Segs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalSmallSegSize	TokenNameIdentifier	 total Small Seg Size
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
targetSegSize	TokenNameIdentifier	 target Seg Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
totalLargeSegSize	TokenNameIdentifier	 total Large Seg Size
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
numLargeSegs	TokenNameIdentifier	 num Large Segs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetSegSize	TokenNameIdentifier	 target Seg Size
<=	TokenNameLESS_EQUAL	
totalSmallSegSize	TokenNameIdentifier	 total Small Seg Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the total size of small segments is big enough, 	TokenNameCOMMENT_LINE	the total size of small segments is big enough, 
// promote the small segments to a large segment and do balanced merge, 	TokenNameCOMMENT_LINE	promote the small segments to a large segment and do balanced merge, 
if	TokenNameif	
(	TokenNameLPAREN	
totalSmallSegSize	TokenNameIdentifier	 total Small Seg Size
<	TokenNameLESS	
targetSegSize	TokenNameIdentifier	 target Seg Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
findBalancedMerges	TokenNameIdentifier	 find Balanced Merges
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
numLargeSegs	TokenNameIdentifier	 num Large Segs
,	TokenNameCOMMA	
(	TokenNameLPAREN	
numLargeSegs	TokenNameIdentifier	 num Large Segs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_partialExpunge	TokenNameIdentifier	 partial Expunge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// should not happen 	TokenNameCOMMENT_LINE	should not happen 
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
numLargeSegs	TokenNameIdentifier	 num Large Segs
,	TokenNameCOMMA	
numSegs	TokenNameIdentifier	 num Segs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
findBalancedMerges	TokenNameIdentifier	 find Balanced Merges
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
numSegs	TokenNameIdentifier	 num Segs
,	TokenNameCOMMA	
numLargeSegs	TokenNameIdentifier	 num Large Segs
,	TokenNameCOMMA	
_partialExpunge	TokenNameIdentifier	 partial Expunge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_maxSegments	TokenNameIdentifier	 max Segments
<	TokenNameLESS	
numSegs	TokenNameIdentifier	 num Segs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have more than _maxSegments, merge small segments smaller than targetSegSize/4 	TokenNameCOMMENT_LINE	we have more than _maxSegments, merge small segments smaller than targetSegSize/4 
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startSeg	TokenNameIdentifier	 start Seg
=	TokenNameEQUAL	
numLargeSegs	TokenNameIdentifier	 num Large Segs
;	TokenNameSEMICOLON	
long	TokenNamelong	
sizeThreshold	TokenNameIdentifier	 size Threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
targetSegSize	TokenNameIdentifier	 target Seg Size
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
startSeg	TokenNameIdentifier	 start Seg
<	TokenNameLESS	
numSegs	TokenNameIdentifier	 num Segs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
startSeg	TokenNameIdentifier	 start Seg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
<	TokenNameLESS	
sizeThreshold	TokenNameIdentifier	 size Threshold
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
startSeg	TokenNameIdentifier	 start Seg
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
startSeg	TokenNameIdentifier	 start Seg
,	TokenNameCOMMA	
numSegs	TokenNameIdentifier	 num Segs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// hack to create a shallow sub-range as SegmentInfos instance, 	TokenNameCOMMENT_LINE	hack to create a shallow sub-range as SegmentInfos instance, 
// it does not clone all metadata, but LogMerge does not need it 	TokenNameCOMMENT_LINE	it does not clone all metadata, but LogMerge does not need it 
final	TokenNamefinal	
SegmentInfos	TokenNameIdentifier	 Segment Infos
smallSegments	TokenNameIdentifier	 small Segments
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
smallSegments	TokenNameIdentifier	 small Segments
.	TokenNameDOT	
rollbackSegmentInfos	TokenNameIdentifier	 rollback Segment Infos
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
numLargeSegs	TokenNameIdentifier	 num Large Segs
,	TokenNameCOMMA	
numSegs	TokenNameIdentifier	 num Segs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
findMerges	TokenNameIdentifier	 find Merges
(	TokenNameLPAREN	
smallSegments	TokenNameIdentifier	 small Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_partialExpunge	TokenNameIdentifier	 partial Expunge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OneMerge	TokenNameIdentifier	 One Merge
expunge	TokenNameIdentifier	 expunge
=	TokenNameEQUAL	
findOneSegmentToExpunge	TokenNameIdentifier	 find One Segment To Expunge
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
numLargeSegs	TokenNameIdentifier	 num Large Segs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expunge	TokenNameIdentifier	 expunge
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
expunge	TokenNameIdentifier	 expunge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
OneMerge	TokenNameIdentifier	 One Merge
findOneSegmentToExpunge	TokenNameIdentifier	 find One Segment To Expunge
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
int	TokenNameint	
maxNumSegments	TokenNameIdentifier	 max Num Segments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
expungeCandidate	TokenNameIdentifier	 expunge Candidate
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxDelCount	TokenNameIdentifier	 max Del Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
maxNumSegments	TokenNameIdentifier	 max Num Segments
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getDelCount	TokenNameIdentifier	 get Del Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delCount	TokenNameIdentifier	 del Count
>	TokenNameGREATER	
maxDelCount	TokenNameIdentifier	 max Del Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expungeCandidate	TokenNameIdentifier	 expunge Candidate
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
maxDelCount	TokenNameIdentifier	 max Del Count
=	TokenNameEQUAL	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxDelCount	TokenNameIdentifier	 max Del Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
expungeCandidate	TokenNameIdentifier	 expunge Candidate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specifies configuration parameters for BalancedSegmentMergePolicy. */	TokenNameCOMMENT_JAVADOC	 Specifies configuration parameters for BalancedSegmentMergePolicy. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MergePolicyParams	TokenNameIdentifier	 Merge Policy Params
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_doPartialExpunge	TokenNameIdentifier	 do Partial Expunge
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_mergeFactor	TokenNameIdentifier	 merge Factor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_useCompoundFile	TokenNameIdentifier	 use Compound File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_maxMergeDocs	TokenNameIdentifier	 max Merge Docs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MergePolicyParams	TokenNameIdentifier	 Merge Policy Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_useCompoundFile	TokenNameIdentifier	 use Compound File
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
_doPartialExpunge	TokenNameIdentifier	 do Partial Expunge
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
=	TokenNameEQUAL	
DEFAULT_NUM_LARGE_SEGMENTS	TokenNameIdentifier	 DEFAULT  NUM  LARGE  SEGMENTS
;	TokenNameSEMICOLON	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
.	TokenNameDOT	
DEFAULT_MERGE_FACTOR	TokenNameIdentifier	 DEFAULT  MERGE  FACTOR
;	TokenNameSEMICOLON	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
=	TokenNameEQUAL	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
+	TokenNamePLUS	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
;	TokenNameSEMICOLON	
_mergeFactor	TokenNameIdentifier	 merge Factor
=	TokenNameEQUAL	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
.	TokenNameDOT	
DEFAULT_MERGE_FACTOR	TokenNameIdentifier	 DEFAULT  MERGE  FACTOR
;	TokenNameSEMICOLON	
_maxMergeDocs	TokenNameIdentifier	 max Merge Docs
=	TokenNameEQUAL	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
.	TokenNameDOT	
DEFAULT_MAX_MERGE_DOCS	TokenNameIdentifier	 DEFAULT  MAX  MERGE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNumLargeSegments	TokenNameIdentifier	 set Num Large Segments
(	TokenNameLPAREN	
int	TokenNameint	
numLargeSegments	TokenNameIdentifier	 num Large Segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
=	TokenNameEQUAL	
numLargeSegments	TokenNameIdentifier	 num Large Segments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumLargeSegments	TokenNameIdentifier	 get Num Large Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_numLargeSegments	TokenNameIdentifier	 num Large Segments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxSmallSegments	TokenNameIdentifier	 set Max Small Segments
(	TokenNameLPAREN	
int	TokenNameint	
maxSmallSegments	TokenNameIdentifier	 max Small Segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
=	TokenNameEQUAL	
maxSmallSegments	TokenNameIdentifier	 max Small Segments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxSmallSegments	TokenNameIdentifier	 get Max Small Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_maxSmallSegments	TokenNameIdentifier	 max Small Segments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPartialExpunge	TokenNameIdentifier	 set Partial Expunge
(	TokenNameLPAREN	
boolean	TokenNameboolean	
doPartialExpunge	TokenNameIdentifier	 do Partial Expunge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_doPartialExpunge	TokenNameIdentifier	 do Partial Expunge
=	TokenNameEQUAL	
doPartialExpunge	TokenNameIdentifier	 do Partial Expunge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getPartialExpunge	TokenNameIdentifier	 get Partial Expunge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_doPartialExpunge	TokenNameIdentifier	 do Partial Expunge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMergeFactor	TokenNameIdentifier	 set Merge Factor
(	TokenNameLPAREN	
int	TokenNameint	
mergeFactor	TokenNameIdentifier	 merge Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_mergeFactor	TokenNameIdentifier	 merge Factor
=	TokenNameEQUAL	
mergeFactor	TokenNameIdentifier	 merge Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMergeFactor	TokenNameIdentifier	 get Merge Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_mergeFactor	TokenNameIdentifier	 merge Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
int	TokenNameint	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_maxMergeDocs	TokenNameIdentifier	 max Merge Docs
=	TokenNameEQUAL	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxMergeDocs	TokenNameIdentifier	 get Max Merge Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_maxMergeDocs	TokenNameIdentifier	 max Merge Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUseCompoundFile	TokenNameIdentifier	 set Use Compound File
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_useCompoundFile	TokenNameIdentifier	 use Compound File
=	TokenNameEQUAL	
useCompoundFile	TokenNameIdentifier	 use Compound File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isUseCompoundFile	TokenNameIdentifier	 is Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_useCompoundFile	TokenNameIdentifier	 use Compound File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
