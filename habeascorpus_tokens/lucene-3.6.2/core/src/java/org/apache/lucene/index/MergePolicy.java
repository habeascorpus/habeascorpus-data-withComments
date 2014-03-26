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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SetOnce	TokenNameIdentifier	 Set Once
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SetOnce	TokenNameIdentifier	 Set Once
.	TokenNameDOT	
AlreadySetException	TokenNameIdentifier	 Already Set Exception
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * <p>Expert: a MergePolicy determines the sequence of * primitive merge operations.</p> * * <p>Whenever the segments in an index have been altered by * {@link IndexWriter}, either the addition of a newly * flushed segment, addition of many segments from * addIndexes* calls, or a previous merge that may now need * to cascade, {@link IndexWriter} invokes {@link * #findMerges} to give the MergePolicy a chance to pick * merges that are now required. This method returns a * {@link MergeSpecification} instance describing the set of * merges that should be done, or null if no merges are * necessary. When IndexWriter.forceMerge is called, it calls * {@link #findForcedMerges(SegmentInfos,int,Map)} and the MergePolicy should * then return the necessary merges.</p> * * <p>Note that the policy can return more than one merge at * a time. In this case, if the writer is using {@link * SerialMergeScheduler}, the merges will be run * sequentially but if it is using {@link * ConcurrentMergeScheduler} they will be run concurrently.</p> * * <p>The default MergePolicy is {@link * TieredMergePolicy}.</p> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 <p>Expert: a MergePolicy determines the sequence of primitive merge operations.</p> * <p>Whenever the segments in an index have been altered by {@link IndexWriter}, either the addition of a newly flushed segment, addition of many segments from addIndexes* calls, or a previous merge that may now need to cascade, {@link IndexWriter} invokes {@link #findMerges} to give the MergePolicy a chance to pick merges that are now required. This method returns a {@link MergeSpecification} instance describing the set of merges that should be done, or null if no merges are necessary. When IndexWriter.forceMerge is called, it calls {@link #findForcedMerges(SegmentInfos,int,Map)} and the MergePolicy should then return the necessary merges.</p> * <p>Note that the policy can return more than one merge at a time. In this case, if the writer is using {@link SerialMergeScheduler}, the merges will be run sequentially but if it is using {@link ConcurrentMergeScheduler} they will be run concurrently.</p> * <p>The default MergePolicy is {@link TieredMergePolicy}.</p> * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
MergePolicy	TokenNameIdentifier	 Merge Policy
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
/** OneMerge provides the information necessary to perform * an individual primitive merge operation, resulting in * a single new segment. The merge spec includes the * subset of segments to be merged as well as whether the * new segment should use the compound file format. */	TokenNameCOMMENT_JAVADOC	 OneMerge provides the information necessary to perform an individual primitive merge operation, resulting in a single new segment. The merge spec includes the subset of segments to be merged as well as whether the new segment should use the compound file format. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
OneMerge	TokenNameIdentifier	 One Merge
{	TokenNameLBRACE	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
// used by IndexWriter 	TokenNameCOMMENT_LINE	used by IndexWriter 
boolean	TokenNameboolean	
registerDone	TokenNameIdentifier	 register Done
;	TokenNameSEMICOLON	
// used by IndexWriter 	TokenNameCOMMENT_LINE	used by IndexWriter 
long	TokenNamelong	
mergeGen	TokenNameIdentifier	 merge Gen
;	TokenNameSEMICOLON	
// used by IndexWriter 	TokenNameCOMMENT_LINE	used by IndexWriter 
boolean	TokenNameboolean	
isExternal	TokenNameIdentifier	 is External
;	TokenNameSEMICOLON	
// used by IndexWriter 	TokenNameCOMMENT_LINE	used by IndexWriter 
int	TokenNameint	
maxNumSegments	TokenNameIdentifier	 max Num Segments
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// used by IndexWriter 	TokenNameCOMMENT_LINE	used by IndexWriter 
public	TokenNamepublic	
long	TokenNamelong	
estimatedMergeBytes	TokenNameIdentifier	 estimated Merge Bytes
;	TokenNameSEMICOLON	
// used by IndexWriter 	TokenNameCOMMENT_LINE	used by IndexWriter 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentReader	TokenNameIdentifier	 Segment Reader
>	TokenNameGREATER	
readers	TokenNameIdentifier	 readers
;	TokenNameSEMICOLON	
// used by IndexWriter 	TokenNameCOMMENT_LINE	used by IndexWriter 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentReader	TokenNameIdentifier	 Segment Reader
>	TokenNameGREATER	
readerClones	TokenNameIdentifier	 reader Clones
;	TokenNameSEMICOLON	
// used by IndexWriter 	TokenNameCOMMENT_LINE	used by IndexWriter 
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
segments	TokenNameIdentifier	 segments
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
totalDocCount	TokenNameIdentifier	 total Doc Count
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
aborted	TokenNameIdentifier	 aborted
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
paused	TokenNameIdentifier	 paused
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"segments must include at least one segment"	TokenNameStringLiteral	segments must include at least one segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clone the list, as the in list may be based off original SegmentInfos and may be modified 	TokenNameCOMMENT_LINE	clone the list, as the in list may be based off original SegmentInfos and may be modified 
this	TokenNamethis	
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
totalDocCount	TokenNameIdentifier	 total Doc Count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Record that an exception occurred while executing * this merge */	TokenNameCOMMENT_JAVADOC	 Record that an exception occurred while executing this merge 
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setException	TokenNameIdentifier	 set Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve previous exception set by {@link * #setException}. */	TokenNameCOMMENT_JAVADOC	 Retrieve previous exception set by {@link #setException}. 
synchronized	TokenNamesynchronized	
Throwable	TokenNameIdentifier	 Throwable
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Mark this merge as aborted. If this is called * before the merge is committed then the merge will * not be committed. */	TokenNameCOMMENT_JAVADOC	 Mark this merge as aborted. If this is called before the merge is committed then the merge will not be committed. 
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aborted	TokenNameIdentifier	 aborted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if this merge was aborted. */	TokenNameCOMMENT_JAVADOC	 Returns true if this merge was aborted. 
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isAborted	TokenNameIdentifier	 is Aborted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aborted	TokenNameIdentifier	 aborted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
checkAborted	TokenNameIdentifier	 check Aborted
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
aborted	TokenNameIdentifier	 aborted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
(	TokenNameLPAREN	
"merge is aborted: "	TokenNameStringLiteral	merge is aborted: 
+	TokenNamePLUS	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
paused	TokenNameIdentifier	 paused
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// In theory we could wait() indefinitely, but we 	TokenNameCOMMENT_LINE	In theory we could wait() indefinitely, but we 
// do 1000 msec, defensively 	TokenNameCOMMENT_LINE	do 1000 msec, defensively 
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
aborted	TokenNameIdentifier	 aborted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
(	TokenNameLPAREN	
"merge is aborted: "	TokenNameStringLiteral	merge is aborted: 
+	TokenNamePLUS	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
setPause	TokenNameIdentifier	 set Pause
(	TokenNameLPAREN	
boolean	TokenNameboolean	
paused	TokenNameIdentifier	 paused
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
paused	TokenNameIdentifier	 paused
=	TokenNameEQUAL	
paused	TokenNameIdentifier	 paused
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
paused	TokenNameIdentifier	 paused
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Wakeup merge thread, if it's waiting 	TokenNameCOMMENT_LINE	Wakeup merge thread, if it's waiting 
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
boolean	TokenNameboolean	
getPause	TokenNameIdentifier	 get Pause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
paused	TokenNameIdentifier	 paused
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numSegments	TokenNameIdentifier	 num Segments
=	TokenNameEQUAL	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
numSegments	TokenNameIdentifier	 num Segments
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" into "	TokenNameStringLiteral	 into 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxNumSegments	TokenNameIdentifier	 max Num Segments
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" [maxNumSegments="	TokenNameStringLiteral	 [maxNumSegments=
+	TokenNamePLUS	
maxNumSegments	TokenNameIdentifier	 max Num Segments
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aborted	TokenNameIdentifier	 aborted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" [ABORTED]"	TokenNameStringLiteral	 [ABORTED]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the total size in bytes of this merge. Note that this does not * indicate the size of the merged segment, but the input total size. * */	TokenNameCOMMENT_JAVADOC	 Returns the total size in bytes of this merge. Note that this does not indicate the size of the merged segment, but the input total size. 
public	TokenNamepublic	
long	TokenNamelong	
totalBytesSize	TokenNameIdentifier	 total Bytes Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the total number of documents that are included with this merge. * Note that this does not indicate the number of documents after the merge. * */	TokenNameCOMMENT_JAVADOC	 Returns the total number of documents that are included with this merge. Note that this does not indicate the number of documents after the merge. 
public	TokenNamepublic	
int	TokenNameint	
totalNumDocs	TokenNameIdentifier	 total Num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A MergeSpecification instance provides the information * necessary to perform multiple merges. It simply * contains a list of {@link OneMerge} instances. */	TokenNameCOMMENT_JAVADOC	 A MergeSpecification instance provides the information necessary to perform multiple merges. It simply contains a list of {@link OneMerge} instances. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MergeSpecification	TokenNameIdentifier	 Merge Specification
{	TokenNameLBRACE	
/** * The subset of segments to be included in the primitive merge. */	TokenNameCOMMENT_JAVADOC	 The subset of segments to be included in the primitive merge. 
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
OneMerge	TokenNameIdentifier	 One Merge
>	TokenNameGREATER	
merges	TokenNameIdentifier	 merges
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
OneMerge	TokenNameIdentifier	 One Merge
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"MergeSpec: "	TokenNameStringLiteral	MergeSpec: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
segString	TokenNameIdentifier	 seg String
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Exception thrown if there are any problems while * executing a merge. */	TokenNameCOMMENT_JAVADOC	 Exception thrown if there are any problems while executing a merge. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MergeException	TokenNameIdentifier	 Merge Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MergeException	TokenNameIdentifier	 Merge Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MergeException	TokenNameIdentifier	 Merge Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
exc	TokenNameIdentifier	 exc
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the {@link Directory} of the index that hit * the exception. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link Directory} of the index that hit the exception. 
public	TokenNamepublic	
Directory	TokenNameIdentifier	 Directory
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
extends	TokenNameextends	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"merge is aborted"	TokenNameStringLiteral	merge is aborted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
SetOnce	TokenNameIdentifier	 Set Once
<	TokenNameLESS	
IndexWriter	TokenNameIdentifier	 Index Writer
>	TokenNameGREATER	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
/** * Creates a new merge policy instance. Note that if you intend to use it * without passing it to {@link IndexWriter}, you should call * {@link #setIndexWriter(IndexWriter)}. */	TokenNameCOMMENT_JAVADOC	 Creates a new merge policy instance. Note that if you intend to use it without passing it to {@link IndexWriter}, you should call {@link #setIndexWriter(IndexWriter)}. 
public	TokenNamepublic	
MergePolicy	TokenNameIdentifier	 Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
SetOnce	TokenNameIdentifier	 Set Once
<	TokenNameLESS	
IndexWriter	TokenNameIdentifier	 Index Writer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the {@link IndexWriter} to use by this merge policy. This method is * allowed to be called only once, and is usually set by IndexWriter. If it is * called more than once, {@link AlreadySetException} is thrown. * * @see SetOnce */	TokenNameCOMMENT_JAVADOC	 Sets the {@link IndexWriter} to use by this merge policy. This method is allowed to be called only once, and is usually set by IndexWriter. If it is called more than once, {@link AlreadySetException} is thrown. * @see SetOnce 
public	TokenNamepublic	
void	TokenNamevoid	
setIndexWriter	TokenNameIdentifier	 set Index Writer
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine what set of merge operations are now necessary on the index. * {@link IndexWriter} calls this whenever there is a change to the segments. * This call is always synchronized on the {@link IndexWriter} instance so * only one thread at a time will call this method. * * @param segmentInfos * the total set of segments in the index */	TokenNameCOMMENT_JAVADOC	 Determine what set of merge operations are now necessary on the index. {@link IndexWriter} calls this whenever there is a change to the segments. This call is always synchronized on the {@link IndexWriter} instance so only one thread at a time will call this method. * @param segmentInfos the total set of segments in the index 
public	TokenNamepublic	
abstract	TokenNameabstract	
MergeSpecification	TokenNameIdentifier	 Merge Specification
findMerges	TokenNameIdentifier	 find Merges
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Determine what set of merge operations is necessary in * order to merge to <= the specified segment count. {@link IndexWriter} calls this when its * {@link IndexWriter#forceMerge} method is called. This call is always * synchronized on the {@link IndexWriter} instance so only one thread at a * time will call this method. * * @param segmentInfos * the total set of segments in the index * @param maxSegmentCount * requested maximum number of segments in the index (currently this * is always 1) * @param segmentsToMerge * contains the specific SegmentInfo instances that must be merged * away. This may be a subset of all * SegmentInfos. If the value is True for a * given SegmentInfo, that means this segment was * an original segment present in the * to-be-merged index; else, it was a segment * produced by a cascaded merge. */	TokenNameCOMMENT_JAVADOC	 Determine what set of merge operations is necessary in order to merge to <= the specified segment count. {@link IndexWriter} calls this when its {@link IndexWriter#forceMerge} method is called. This call is always synchronized on the {@link IndexWriter} instance so only one thread at a time will call this method. * @param segmentInfos the total set of segments in the index @param maxSegmentCount requested maximum number of segments in the index (currently this is always 1) @param segmentsToMerge contains the specific SegmentInfo instances that must be merged away. This may be a subset of all SegmentInfos. If the value is True for a given SegmentInfo, that means this segment was an original segment present in the to-be-merged index; else, it was a segment produced by a cascaded merge. 
public	TokenNamepublic	
abstract	TokenNameabstract	
MergeSpecification	TokenNameIdentifier	 Merge Specification
findForcedMerges	TokenNameIdentifier	 find Forced Merges
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segmentInfos	TokenNameIdentifier	 segment Infos
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
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Determine what set of merge operations is necessary in order to expunge all * deletes from the index. * * @param segmentInfos * the total set of segments in the index */	TokenNameCOMMENT_JAVADOC	 Determine what set of merge operations is necessary in order to expunge all deletes from the index. * @param segmentInfos the total set of segments in the index 
public	TokenNamepublic	
abstract	TokenNameabstract	
MergeSpecification	TokenNameIdentifier	 Merge Specification
findForcedDeletesMerges	TokenNameIdentifier	 find Forced Deletes Merges
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Release all resources for the policy. */	TokenNameCOMMENT_JAVADOC	 Release all resources for the policy. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns true if a new segment (regardless of its origin) should use the compound file format. */	TokenNameCOMMENT_JAVADOC	 Returns true if a new segment (regardless of its origin) should use the compound file format. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segments	TokenNameIdentifier	 segments
,	TokenNameCOMMA	
SegmentInfo	TokenNameIdentifier	 Segment Info
newSegment	TokenNameIdentifier	 new Segment
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
