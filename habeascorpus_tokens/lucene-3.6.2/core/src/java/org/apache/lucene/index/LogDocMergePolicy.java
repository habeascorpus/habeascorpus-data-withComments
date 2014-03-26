package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** This is a {@link LogMergePolicy} that measures size of a * segment as the number of documents (not taking deletions * into account). */	TokenNameCOMMENT_JAVADOC	 This is a {@link LogMergePolicy} that measures size of a segment as the number of documents (not taking deletions into account). 
public	TokenNamepublic	
class	TokenNameclass	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
extends	TokenNameextends	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
{	TokenNameLBRACE	
/** Default minimum segment size. @see setMinMergeDocs */	TokenNameCOMMENT_JAVADOC	 Default minimum segment size. @see setMinMergeDocs 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MIN_MERGE_DOCS	TokenNameIdentifier	 DEFAULT  MIN  MERGE  DOCS
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minMergeSize	TokenNameIdentifier	 min Merge Size
=	TokenNameEQUAL	
DEFAULT_MIN_MERGE_DOCS	TokenNameIdentifier	 DEFAULT  MIN  MERGE  DOCS
;	TokenNameSEMICOLON	
// maxMergeSize(ForForcedMerge) are never used by LogDocMergePolicy; set 	TokenNameCOMMENT_LINE	maxMergeSize(ForForcedMerge) are never used by LogDocMergePolicy; set 
// it to Long.MAX_VALUE to disable it 	TokenNameCOMMENT_LINE	it to Long.MAX_VALUE to disable it 
maxMergeSize	TokenNameIdentifier	 max Merge Size
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
maxMergeSizeForForcedMerge	TokenNameIdentifier	 max Merge Size For Forced Merge
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
sizeDocs	TokenNameIdentifier	 size Docs
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the minimum size for the lowest level segments. * Any segments below this size are considered to be on * the same level (even if they vary drastically in size) * and will be merged whenever there are mergeFactor of * them. This effectively truncates the "long tail" of * small segments that would otherwise be created into a * single level. If you set this too large, it could * greatly increase the merging cost during indexing (if * you flush many small segments). */	TokenNameCOMMENT_JAVADOC	 Sets the minimum size for the lowest level segments. Any segments below this size are considered to be on the same level (even if they vary drastically in size) and will be merged whenever there are mergeFactor of them. This effectively truncates the "long tail" of small segments that would otherwise be created into a single level. If you set this too large, it could greatly increase the merging cost during indexing (if you flush many small segments). 
public	TokenNamepublic	
void	TokenNamevoid	
setMinMergeDocs	TokenNameIdentifier	 set Min Merge Docs
(	TokenNameLPAREN	
int	TokenNameint	
minMergeDocs	TokenNameIdentifier	 min Merge Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minMergeSize	TokenNameIdentifier	 min Merge Size
=	TokenNameEQUAL	
minMergeDocs	TokenNameIdentifier	 min Merge Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the minimum size for a segment to remain * un-merged. * @see #setMinMergeDocs **/	TokenNameCOMMENT_JAVADOC	 Get the minimum size for a segment to remain un-merged. @see #setMinMergeDocs *
public	TokenNamepublic	
int	TokenNameint	
getMinMergeDocs	TokenNameIdentifier	 get Min Merge Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
minMergeSize	TokenNameIdentifier	 min Merge Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
