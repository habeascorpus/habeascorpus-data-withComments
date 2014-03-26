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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
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
ArrayList	TokenNameIdentifier	 Array List
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
/** This {@link MergePolicy} is used for upgrading all existing segments of * an index when calling {@link IndexWriter#forceMerge(int)}. * All other methods delegate to the base {@code MergePolicy} given to the constructor. * This allows for an as-cheap-as possible upgrade of an older index by only upgrading segments that * are created by previous Lucene versions. forceMerge does no longer really merge; * it is just used to &quot;forceMerge&quot; older segment versions away. * <p>In general one would use {@link IndexUpgrader}, but for a fully customizeable upgrade, * you can use this like any other {@code MergePolicy} and call {@link IndexWriter#forceMerge(int)}: * <pre class="prettyprint lang-java"> * IndexWriterConfig iwc = new IndexWriterConfig(Version.LUCENE_XX, new KeywordAnalyzer()); * iwc.setMergePolicy(new UpgradeIndexMergePolicy(iwc.getMergePolicy())); * IndexWriter w = new IndexWriter(dir, iwc); * w.forceMerge(1); * w.close(); * </pre> * <p><b>Warning:</b> This merge policy may reorder documents if the index was partially * upgraded before calling forceMerge (e.g., documents were added). If your application relies * on &quot;monotonicity&quot; of doc IDs (which means that the order in which the documents * were added to the index is preserved), do a forceMerge(1) instead. Please note, the * delegate {@code MergePolicy} may also reorder documents. * @lucene.experimental * @see IndexUpgrader */	TokenNameCOMMENT_JAVADOC	 This {@link MergePolicy} is used for upgrading all existing segments of an index when calling {@link IndexWriter#forceMerge(int)}. All other methods delegate to the base {@code MergePolicy} given to the constructor. This allows for an as-cheap-as possible upgrade of an older index by only upgrading segments that are created by previous Lucene versions. forceMerge does no longer really merge; it is just used to &quot;forceMerge&quot; older segment versions away. <p>In general one would use {@link IndexUpgrader}, but for a fully customizeable upgrade, you can use this like any other {@code MergePolicy} and call {@link IndexWriter#forceMerge(int)}: <pre class="prettyprint lang-java"> IndexWriterConfig iwc = new IndexWriterConfig(Version.LUCENE_XX, new KeywordAnalyzer()); iwc.setMergePolicy(new UpgradeIndexMergePolicy(iwc.getMergePolicy())); IndexWriter w = new IndexWriter(dir, iwc); w.forceMerge(1); w.close(); </pre> <p><b>Warning:</b> This merge policy may reorder documents if the index was partially upgraded before calling forceMerge (e.g., documents were added). If your application relies on &quot;monotonicity&quot; of doc IDs (which means that the order in which the documents were added to the index is preserved), do a forceMerge(1) instead. Please note, the delegate {@code MergePolicy} may also reorder documents. @lucene.experimental @see IndexUpgrader 
public	TokenNamepublic	
class	TokenNameclass	
UpgradeIndexMergePolicy	TokenNameIdentifier	 Upgrade Index Merge Policy
extends	TokenNameextends	
MergePolicy	TokenNameIdentifier	 Merge Policy
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
MergePolicy	TokenNameIdentifier	 Merge Policy
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
/** Wrap the given {@link MergePolicy} and intercept forceMerge requests to * only upgrade segments written with previous Lucene versions. */	TokenNameCOMMENT_JAVADOC	 Wrap the given {@link MergePolicy} and intercept forceMerge requests to only upgrade segments written with previous Lucene versions. 
public	TokenNamepublic	
UpgradeIndexMergePolicy	TokenNameIdentifier	 Upgrade Index Merge Policy
(	TokenNameLPAREN	
MergePolicy	TokenNameIdentifier	 Merge Policy
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns if the given segment should be upgraded. The default implementation * will return {@code !Constants.LUCENE_MAIN_VERSION.equals(si.getVersion())}, * so all segments created with a different version number than this Lucene version will * get upgraded. */	TokenNameCOMMENT_JAVADOC	 Returns if the given segment should be upgraded. The default implementation will return {@code !Constants.LUCENE_MAIN_VERSION.equals(si.getVersion())}, so all segments created with a different version number than this Lucene version will get upgraded. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
shouldUpgradeSegment	TokenNameIdentifier	 should Upgrade Segment
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setIndexWriter	TokenNameIdentifier	 set Index Writer
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setIndexWriter	TokenNameIdentifier	 set Index Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
setIndexWriter	TokenNameIdentifier	 set Index Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
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
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
findMerges	TokenNameIdentifier	 find Merges
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
{	TokenNameLBRACE	
// first find all old segments 	TokenNameCOMMENT_LINE	first find all old segments 
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
oldSegments	TokenNameIdentifier	 old Segments
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
si	TokenNameIdentifier	 si
:	TokenNameCOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Boolean	TokenNameIdentifier	 Boolean
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
segmentsToMerge	TokenNameIdentifier	 segments To Merge
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
shouldUpgradeSegment	TokenNameIdentifier	 should Upgrade Segment
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldSegments	TokenNameIdentifier	 old Segments
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"findForcedMerges: segmentsToUpgrade="	TokenNameStringLiteral	findForcedMerges: segmentsToUpgrade=
+	TokenNamePLUS	
oldSegments	TokenNameIdentifier	 old Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldSegments	TokenNameIdentifier	 old Segments
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
findForcedMerges	TokenNameIdentifier	 find Forced Merges
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
,	TokenNameCOMMA	
maxSegmentCount	TokenNameIdentifier	 max Segment Count
,	TokenNameCOMMA	
oldSegments	TokenNameIdentifier	 old Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// remove all segments that are in merge specification from oldSegments, 	TokenNameCOMMENT_LINE	remove all segments that are in merge specification from oldSegments, 
// the resulting set contains all segments that are left over 	TokenNameCOMMENT_LINE	the resulting set contains all segments that are left over 
// and will be merged to one additional segment: 	TokenNameCOMMENT_LINE	and will be merged to one additional segment: 
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
OneMerge	TokenNameIdentifier	 One Merge
om	TokenNameIdentifier	 om
:	TokenNameCOLON	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
merges	TokenNameIdentifier	 merges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldSegments	TokenNameIdentifier	 old Segments
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
om	TokenNameIdentifier	 om
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
oldSegments	TokenNameIdentifier	 old Segments
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"findForcedMerges: "	TokenNameStringLiteral	findForcedMerges: 
+	TokenNamePLUS	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not want to merge all old segments, merge remaining ones into new segment: "	TokenNameStringLiteral	 does not want to merge all old segments, merge remaining ones into new segment: 
+	TokenNamePLUS	
oldSegments	TokenNameIdentifier	 old Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
newInfos	TokenNameIdentifier	 new Infos
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
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
si	TokenNameIdentifier	 si
:	TokenNameCOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldSegments	TokenNameIdentifier	 old Segments
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newInfos	TokenNameIdentifier	 new Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// add the final merge 	TokenNameCOMMENT_LINE	add the final merge 
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
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
newInfos	TokenNameIdentifier	 new Infos
)	TokenNameRPAREN	
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
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
findForcedDeletesMerges	TokenNameIdentifier	 find Forced Deletes Merges
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
useCompoundFile	TokenNameIdentifier	 use Compound File
(	TokenNameLPAREN	
segments	TokenNameIdentifier	 segments
,	TokenNameCOMMA	
newSegment	TokenNameIdentifier	 new Segment
)	TokenNameRPAREN	
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
base	TokenNameIdentifier	 base
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
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
"->"	TokenNameStringLiteral	->
+	TokenNamePLUS	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
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
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"UPGMP: "	TokenNameStringLiteral	UPGMP: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
