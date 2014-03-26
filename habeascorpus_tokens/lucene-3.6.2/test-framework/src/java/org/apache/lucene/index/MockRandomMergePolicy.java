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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
/** * MergePolicy that makes random decisions for testing. */	TokenNameCOMMENT_JAVADOC	 MergePolicy that makes random decisions for testing. 
public	TokenNamepublic	
class	TokenNameclass	
MockRandomMergePolicy	TokenNameIdentifier	 Mock Random Merge Policy
extends	TokenNameextends	
MergePolicy	TokenNameIdentifier	 Merge Policy
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MockRandomMergePolicy	TokenNameIdentifier	 Mock Random Merge Policy
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fork a private random, since we are called 	TokenNameCOMMENT_LINE	fork a private random, since we are called 
// unpredictably from threads: 	TokenNameCOMMENT_LINE	unpredictably from threads: 
this	TokenNamethis	
.	TokenNameDOT	
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
{	TokenNameLBRACE	
MergeSpecification	TokenNameIdentifier	 Merge Specification
mergeSpec	TokenNameIdentifier	 merge Spec
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//System.out.println("MRMP: findMerges sis=" + segmentInfos); 	TokenNameCOMMENT_LINE	System.out.println("MRMP: findMerges sis=" + segmentInfos); 
if	TokenNameif	
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
segments	TokenNameIdentifier	 segments
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
shuffle	TokenNameIdentifier	 shuffle
(	TokenNameLPAREN	
segments	TokenNameIdentifier	 segments
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: sometimes make more than 1 merge? 	TokenNameCOMMENT_LINE	TODO: sometimes make more than 1 merge? 
mergeSpec	TokenNameIdentifier	 merge Spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
segsToMerge	TokenNameIdentifier	 segs To Merge
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeSpec	TokenNameIdentifier	 merge Spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
segsToMerge	TokenNameIdentifier	 segs To Merge
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
mergeSpec	TokenNameIdentifier	 merge Spec
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
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
eligibleSegments	TokenNameIdentifier	 eligible Segments
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
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
eligibleSegments	TokenNameIdentifier	 eligible Segments
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//System.out.println("MRMP: findMerges sis=" + segmentInfos + " eligible=" + eligibleSegments); 	TokenNameCOMMENT_LINE	System.out.println("MRMP: findMerges sis=" + segmentInfos + " eligible=" + eligibleSegments); 
MergeSpecification	TokenNameIdentifier	 Merge Specification
mergeSpec	TokenNameIdentifier	 merge Spec
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eligibleSegments	TokenNameIdentifier	 eligible Segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
eligibleSegments	TokenNameIdentifier	 eligible Segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
eligibleSegments	TokenNameIdentifier	 eligible Segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergeSpec	TokenNameIdentifier	 merge Spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Already shuffled having come out of a set but 	TokenNameCOMMENT_LINE	Already shuffled having come out of a set but 
// shuffle again for good measure: 	TokenNameCOMMENT_LINE	shuffle again for good measure: 
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
shuffle	TokenNameIdentifier	 shuffle
(	TokenNameLPAREN	
eligibleSegments	TokenNameIdentifier	 eligible Segments
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
eligibleSegments	TokenNameIdentifier	 eligible Segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
eligibleSegments	TokenNameIdentifier	 eligible Segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
<=	TokenNameLESS_EQUAL	
2	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
max	TokenNameIdentifier	 max
:	TokenNameCOLON	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeSpec	TokenNameIdentifier	 merge Spec
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
eligibleSegments	TokenNameIdentifier	 eligible Segments
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
inc	TokenNameIdentifier	 inc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mergeSpec	TokenNameIdentifier	 merge Spec
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
:	TokenNameCOLON	
mergeSpec	TokenNameIdentifier	 merge Spec
.	TokenNameDOT	
merges	TokenNameIdentifier	 merges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
assert	TokenNameassert	
segmentsToMerge	TokenNameIdentifier	 segments To Merge
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
mergeSpec	TokenNameIdentifier	 merge Spec
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
findMerges	TokenNameIdentifier	 find Merges
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
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
// 80% of the time we create CFS: 	TokenNameCOMMENT_LINE	80% of the time we create CFS: 
return	TokenNamereturn	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
