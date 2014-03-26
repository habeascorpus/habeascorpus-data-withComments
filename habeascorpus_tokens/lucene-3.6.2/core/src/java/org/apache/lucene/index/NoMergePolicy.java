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
/** * A {@link MergePolicy} which never returns merges to execute (hence it's * name). It is also a singleton and can be accessed through * {@link NoMergePolicy#NO_COMPOUND_FILES} if you want to indicate the index * does not use compound files, or through {@link NoMergePolicy#COMPOUND_FILES} * otherwise. Use it if you want to prevent an {@link IndexWriter} from ever * executing merges, without going through the hassle of tweaking a merge * policy's settings to achieve that, such as changing its merge factor. */	TokenNameCOMMENT_JAVADOC	 A {@link MergePolicy} which never returns merges to execute (hence it's name). It is also a singleton and can be accessed through {@link NoMergePolicy#NO_COMPOUND_FILES} if you want to indicate the index does not use compound files, or through {@link NoMergePolicy#COMPOUND_FILES} otherwise. Use it if you want to prevent an {@link IndexWriter} from ever executing merges, without going through the hassle of tweaking a merge policy's settings to achieve that, such as changing its merge factor. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
extends	TokenNameextends	
MergePolicy	TokenNameIdentifier	 Merge Policy
{	TokenNameLBRACE	
/** * A singleton {@link NoMergePolicy} which indicates the index does not use * compound files. */	TokenNameCOMMENT_JAVADOC	 A singleton {@link NoMergePolicy} which indicates the index does not use compound files. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
MergePolicy	TokenNameIdentifier	 Merge Policy
NO_COMPOUND_FILES	TokenNameIdentifier	 NO  COMPOUND  FILES
=	TokenNameEQUAL	
new	TokenNamenew	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A singleton {@link NoMergePolicy} which indicates the index uses compound * files. */	TokenNameCOMMENT_JAVADOC	 A singleton {@link NoMergePolicy} which indicates the index uses compound files. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
MergePolicy	TokenNameIdentifier	 Merge Policy
COMPOUND_FILES	TokenNameIdentifier	 COMPOUND  FILES
=	TokenNameEQUAL	
new	TokenNamenew	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// prevent instantiation 	TokenNameCOMMENT_LINE	prevent instantiation 
this	TokenNamethis	
.	TokenNameDOT	
useCompoundFile	TokenNameIdentifier	 use Compound File
=	TokenNameEQUAL	
useCompoundFile	TokenNameIdentifier	 use Compound File
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
null	TokenNamenull	
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
return	TokenNamereturn	
null	TokenNamenull	
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
null	TokenNamenull	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
useCompoundFile	TokenNameIdentifier	 use Compound File
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
"NoMergePolicy"	TokenNameStringLiteral	NoMergePolicy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
