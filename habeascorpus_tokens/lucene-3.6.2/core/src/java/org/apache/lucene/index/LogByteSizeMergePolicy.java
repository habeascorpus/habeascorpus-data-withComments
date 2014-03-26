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
/** This is a {@link LogMergePolicy} that measures size of a * segment as the total byte size of the segment's files. */	TokenNameCOMMENT_JAVADOC	 This is a {@link LogMergePolicy} that measures size of a segment as the total byte size of the segment's files. 
public	TokenNamepublic	
class	TokenNameclass	
LogByteSizeMergePolicy	TokenNameIdentifier	 Log Byte Size Merge Policy
extends	TokenNameextends	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
{	TokenNameLBRACE	
/** Default minimum segment size. @see setMinMergeMB */	TokenNameCOMMENT_JAVADOC	 Default minimum segment size. @see setMinMergeMB 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEFAULT_MIN_MERGE_MB	TokenNameIdentifier	 DEFAULT  MIN  MERGE  MB
=	TokenNameEQUAL	
1.6	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** Default maximum segment size. A segment of this size * or larger will never be merged. @see setMaxMergeMB */	TokenNameCOMMENT_JAVADOC	 Default maximum segment size. A segment of this size or larger will never be merged. @see setMaxMergeMB 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEFAULT_MAX_MERGE_MB	TokenNameIdentifier	 DEFAULT  MAX  MERGE  MB
=	TokenNameEQUAL	
2048	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Default maximum segment size. A segment of this size * or larger will never be merged during forceMerge. @see setMaxMergeMBForForceMerge */	TokenNameCOMMENT_JAVADOC	 Default maximum segment size. A segment of this size or larger will never be merged during forceMerge. @see setMaxMergeMBForForceMerge 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEFAULT_MAX_MERGE_MB_FOR_FORCED_MERGE	TokenNameIdentifier	 DEFAULT  MAX  MERGE  MB  FOR  FORCED  MERGE
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LogByteSizeMergePolicy	TokenNameIdentifier	 Log Byte Size Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minMergeSize	TokenNameIdentifier	 min Merge Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
DEFAULT_MIN_MERGE_MB	TokenNameIdentifier	 DEFAULT  MIN  MERGE  MB
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxMergeSize	TokenNameIdentifier	 max Merge Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
DEFAULT_MAX_MERGE_MB	TokenNameIdentifier	 DEFAULT  MAX  MERGE  MB
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxMergeSizeForForcedMerge	TokenNameIdentifier	 max Merge Size For Forced Merge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
DEFAULT_MAX_MERGE_MB_FOR_FORCED_MERGE	TokenNameIdentifier	 DEFAULT  MAX  MERGE  MB  FOR  FORCED  MERGE
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
sizeBytes	TokenNameIdentifier	 size Bytes
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <p>Determines the largest segment (measured by total * byte size of the segment's files, in MB) that may be * merged with other segments. Small values (e.g., less * than 50 MB) are best for interactive indexing, as this * limits the length of pauses while indexing to a few * seconds. Larger values are best for batched indexing * and speedier searches.</p> * * <p>Note that {@link #setMaxMergeDocs} is also * used to check whether a segment is too large for * merging (it's either or).</p>*/	TokenNameCOMMENT_JAVADOC	 <p>Determines the largest segment (measured by total byte size of the segment's files, in MB) that may be merged with other segments. Small values (e.g., less than 50 MB) are best for interactive indexing, as this limits the length of pauses while indexing to a few seconds. Larger values are best for batched indexing and speedier searches.</p> * <p>Note that {@link #setMaxMergeDocs} is also used to check whether a segment is too large for merging (it's either or).</p>
public	TokenNamepublic	
void	TokenNamevoid	
setMaxMergeMB	TokenNameIdentifier	 set Max Merge MB
(	TokenNameLPAREN	
double	TokenNamedouble	
mb	TokenNameIdentifier	 mb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxMergeSize	TokenNameIdentifier	 max Merge Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
mb	TokenNameIdentifier	 mb
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the largest segment (measured by total byte * size of the segment's files, in MB) that may be merged * with other segments. * @see #setMaxMergeMB */	TokenNameCOMMENT_JAVADOC	 Returns the largest segment (measured by total byte size of the segment's files, in MB) that may be merged with other segments. @see #setMaxMergeMB 
public	TokenNamepublic	
double	TokenNamedouble	
getMaxMergeMB	TokenNameIdentifier	 get Max Merge MB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
maxMergeSize	TokenNameIdentifier	 max Merge Size
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated Renamed to {@link * #setMaxMergeMBForForcedMerge} */	TokenNameCOMMENT_JAVADOC	 @deprecated Renamed to {@link #setMaxMergeMBForForcedMerge} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
setMaxMergeMBForOptimize	TokenNameIdentifier	 set Max Merge MB For Optimize
(	TokenNameLPAREN	
double	TokenNamedouble	
mb	TokenNameIdentifier	 mb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMaxMergeMBForForcedMerge	TokenNameIdentifier	 set Max Merge MB For Forced Merge
(	TokenNameLPAREN	
mb	TokenNameIdentifier	 mb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <p>Determines the largest segment (measured by total * byte size of the segment's files, in MB) that may be * merged with other segments during forceMerge. Setting * it low will leave the index with more than 1 segment, * even if {@link IndexWriter#forceMerge} is called.*/	TokenNameCOMMENT_JAVADOC	 <p>Determines the largest segment (measured by total byte size of the segment's files, in MB) that may be merged with other segments during forceMerge. Setting it low will leave the index with more than 1 segment, even if {@link IndexWriter#forceMerge} is called.
public	TokenNamepublic	
void	TokenNamevoid	
setMaxMergeMBForForcedMerge	TokenNameIdentifier	 set Max Merge MB For Forced Merge
(	TokenNameLPAREN	
double	TokenNamedouble	
mb	TokenNameIdentifier	 mb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxMergeSizeForForcedMerge	TokenNameIdentifier	 max Merge Size For Forced Merge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
mb	TokenNameIdentifier	 mb
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated Renamed to {@link * #getMaxMergeMBForForcedMerge} */	TokenNameCOMMENT_JAVADOC	 @deprecated Renamed to {@link #getMaxMergeMBForForcedMerge} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getMaxMergeMBForOptimize	TokenNameIdentifier	 get Max Merge MB For Optimize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getMaxMergeMBForForcedMerge	TokenNameIdentifier	 get Max Merge MB For Forced Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the largest segment (measured by total byte * size of the segment's files, in MB) that may be merged * with other segments during forceMerge. * @see #setMaxMergeMBForForcedMerge */	TokenNameCOMMENT_JAVADOC	 Returns the largest segment (measured by total byte size of the segment's files, in MB) that may be merged with other segments during forceMerge. @see #setMaxMergeMBForForcedMerge 
public	TokenNamepublic	
double	TokenNamedouble	
getMaxMergeMBForForcedMerge	TokenNameIdentifier	 get Max Merge MB For Forced Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
maxMergeSizeForForcedMerge	TokenNameIdentifier	 max Merge Size For Forced Merge
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the minimum size for the lowest level segments. * Any segments below this size are considered to be on * the same level (even if they vary drastically in size) * and will be merged whenever there are mergeFactor of * them. This effectively truncates the "long tail" of * small segments that would otherwise be created into a * single level. If you set this too large, it could * greatly increase the merging cost during indexing (if * you flush many small segments). */	TokenNameCOMMENT_JAVADOC	 Sets the minimum size for the lowest level segments. Any segments below this size are considered to be on the same level (even if they vary drastically in size) and will be merged whenever there are mergeFactor of them. This effectively truncates the "long tail" of small segments that would otherwise be created into a single level. If you set this too large, it could greatly increase the merging cost during indexing (if you flush many small segments). 
public	TokenNamepublic	
void	TokenNamevoid	
setMinMergeMB	TokenNameIdentifier	 set Min Merge MB
(	TokenNameLPAREN	
double	TokenNamedouble	
mb	TokenNameIdentifier	 mb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minMergeSize	TokenNameIdentifier	 min Merge Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
mb	TokenNameIdentifier	 mb
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the minimum size for a segment to remain * un-merged. * @see #setMinMergeMB **/	TokenNameCOMMENT_JAVADOC	 Get the minimum size for a segment to remain un-merged. @see #setMinMergeMB *
public	TokenNamepublic	
double	TokenNamedouble	
getMinMergeMB	TokenNameIdentifier	 get Min Merge MB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
minMergeSize	TokenNameIdentifier	 min Merge Size
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
