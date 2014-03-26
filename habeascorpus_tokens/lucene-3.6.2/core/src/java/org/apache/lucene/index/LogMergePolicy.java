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
Collection	TokenNameIdentifier	 Collection
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
/** <p>This class implements a {@link MergePolicy} that tries * to merge segments into levels of exponentially * increasing size, where each level has fewer segments than * the value of the merge factor. Whenever extra segments * (beyond the merge factor upper bound) are encountered, * all segments within the level are merged. You can get or * set the merge factor using {@link #getMergeFactor()} and * {@link #setMergeFactor(int)} respectively.</p> * * <p>This class is abstract and requires a subclass to * define the {@link #size} method which specifies how a * segment's size is determined. {@link LogDocMergePolicy} * is one subclass that measures size by document count in * the segment. {@link LogByteSizeMergePolicy} is another * subclass that measures size as the total byte size of the * file(s) for the segment.</p> */	TokenNameCOMMENT_JAVADOC	 <p>This class implements a {@link MergePolicy} that tries to merge segments into levels of exponentially increasing size, where each level has fewer segments than the value of the merge factor. Whenever extra segments (beyond the merge factor upper bound) are encountered, all segments within the level are merged. You can get or set the merge factor using {@link #getMergeFactor()} and {@link #setMergeFactor(int)} respectively.</p> * <p>This class is abstract and requires a subclass to define the {@link #size} method which specifies how a segment's size is determined. {@link LogDocMergePolicy} is one subclass that measures size by document count in the segment. {@link LogByteSizeMergePolicy} is another subclass that measures size as the total byte size of the file(s) for the segment.</p> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
extends	TokenNameextends	
MergePolicy	TokenNameIdentifier	 Merge Policy
{	TokenNameLBRACE	
/** Defines the allowed range of log(size) for each * level. A level is computed by taking the max segment * log size, minus LEVEL_LOG_SPAN, and finding all * segments falling within that range. */	TokenNameCOMMENT_JAVADOC	 Defines the allowed range of log(size) for each level. A level is computed by taking the max segment log size, minus LEVEL_LOG_SPAN, and finding all segments falling within that range. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
LEVEL_LOG_SPAN	TokenNameIdentifier	 LEVEL  LOG  SPAN
=	TokenNameEQUAL	
0.75	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** Default merge factor, which is how many segments are * merged at a time */	TokenNameCOMMENT_JAVADOC	 Default merge factor, which is how many segments are merged at a time 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MERGE_FACTOR	TokenNameIdentifier	 DEFAULT  MERGE  FACTOR
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Default maximum segment size. A segment of this size * or larger will never be merged. @see setMaxMergeDocs */	TokenNameCOMMENT_JAVADOC	 Default maximum segment size. A segment of this size or larger will never be merged. @see setMaxMergeDocs 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_MERGE_DOCS	TokenNameIdentifier	 DEFAULT  MAX  MERGE  DOCS
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
/** Default noCFSRatio. If a merge's size is >= 10% of * the index, then we disable compound file for it. * @see #setNoCFSRatio */	TokenNameCOMMENT_JAVADOC	 Default noCFSRatio. If a merge's size is >= 10% of the index, then we disable compound file for it. @see #setNoCFSRatio 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEFAULT_NO_CFS_RATIO	TokenNameIdentifier	 DEFAULT  NO  CFS  RATIO
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
mergeFactor	TokenNameIdentifier	 merge Factor
=	TokenNameEQUAL	
DEFAULT_MERGE_FACTOR	TokenNameIdentifier	 DEFAULT  MERGE  FACTOR
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
minMergeSize	TokenNameIdentifier	 min Merge Size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
maxMergeSize	TokenNameIdentifier	 max Merge Size
;	TokenNameSEMICOLON	
// Although the core MPs set it explicitly, we must default in case someone 	TokenNameCOMMENT_LINE	Although the core MPs set it explicitly, we must default in case someone 
// out there wrote his own LMP ... 	TokenNameCOMMENT_LINE	out there wrote his own LMP ... 
protected	TokenNameprotected	
long	TokenNamelong	
maxMergeSizeForForcedMerge	TokenNameIdentifier	 max Merge Size For Forced Merge
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
=	TokenNameEQUAL	
DEFAULT_MAX_MERGE_DOCS	TokenNameIdentifier	 DEFAULT  MAX  MERGE  DOCS
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
noCFSRatio	TokenNameIdentifier	 no CFS Ratio
=	TokenNameEQUAL	
DEFAULT_NO_CFS_RATIO	TokenNameIdentifier	 DEFAULT  NO  CFS  RATIO
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
calibrateSizeByDeletes	TokenNameIdentifier	 calibrate Size By Deletes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
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
/** If a merged segment will be more than this percentage * of the total size of the index, leave the segment as * non-compound file even if compound file is enabled. * Set to 1.0 to always use CFS regardless of merge * size. */	TokenNameCOMMENT_JAVADOC	 If a merged segment will be more than this percentage of the total size of the index, leave the segment as non-compound file even if compound file is enabled. Set to 1.0 to always use CFS regardless of merge size. 
public	TokenNamepublic	
void	TokenNamevoid	
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
}	TokenNameRBRACE	
protected	TokenNameprotected	
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
"LMP: "	TokenNameStringLiteral	LMP: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <p>Returns the number of segments that are merged at * once and also controls the total number of segments * allowed to accumulate in the index.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Returns the number of segments that are merged at once and also controls the total number of segments allowed to accumulate in the index.</p> 
public	TokenNamepublic	
int	TokenNameint	
getMergeFactor	TokenNameIdentifier	 get Merge Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mergeFactor	TokenNameIdentifier	 merge Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Determines how often segment indices are merged by * addDocument(). With smaller values, less RAM is used * while indexing, and searches are * faster, but indexing speed is slower. With larger * values, more RAM is used during indexing, and while * searches is slower, indexing is * faster. Thus larger values (> 10) are best for batch * index creation, and smaller values (< 10) for indices * that are interactively maintained. */	TokenNameCOMMENT_JAVADOC	 Determines how often segment indices are merged by addDocument(). With smaller values, less RAM is used while indexing, and searches are faster, but indexing speed is slower. With larger values, more RAM is used during indexing, and while searches is slower, indexing is faster. Thus larger values (> 10) are best for batch index creation, and smaller values (< 10) for indices that are interactively maintained. 
public	TokenNamepublic	
void	TokenNamevoid	
setMergeFactor	TokenNameIdentifier	 set Merge Factor
(	TokenNameLPAREN	
int	TokenNameint	
mergeFactor	TokenNameIdentifier	 merge Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mergeFactor	TokenNameIdentifier	 merge Factor
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"mergeFactor cannot be less than 2"	TokenNameStringLiteral	mergeFactor cannot be less than 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mergeFactor	TokenNameIdentifier	 merge Factor
=	TokenNameEQUAL	
mergeFactor	TokenNameIdentifier	 merge Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Javadoc inherited 	TokenNameCOMMENT_LINE	Javadoc inherited 
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
/** Sets whether compound file format should be used for * newly flushed and newly merged segments. */	TokenNameCOMMENT_JAVADOC	 Sets whether compound file format should be used for newly flushed and newly merged segments. 
public	TokenNamepublic	
void	TokenNamevoid	
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
}	TokenNameRBRACE	
/** Returns true if newly flushed and newly merge segments * are written in compound file format. @see * #setUseCompoundFile */	TokenNameCOMMENT_JAVADOC	 Returns true if newly flushed and newly merge segments are written in compound file format. @see #setUseCompoundFile 
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
/** Sets whether the segment size should be calibrated by * the number of deletes when choosing segments for merge. */	TokenNameCOMMENT_JAVADOC	 Sets whether the segment size should be calibrated by the number of deletes when choosing segments for merge. 
public	TokenNamepublic	
void	TokenNamevoid	
setCalibrateSizeByDeletes	TokenNameIdentifier	 set Calibrate Size By Deletes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
calibrateSizeByDeletes	TokenNameIdentifier	 calibrate Size By Deletes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
calibrateSizeByDeletes	TokenNameIdentifier	 calibrate Size By Deletes
=	TokenNameEQUAL	
calibrateSizeByDeletes	TokenNameIdentifier	 calibrate Size By Deletes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if the segment size should be calibrated * by the number of deletes when choosing segments for merge. */	TokenNameCOMMENT_JAVADOC	 Returns true if the segment size should be calibrated by the number of deletes when choosing segments for merge. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCalibrateSizeByDeletes	TokenNameIdentifier	 get Calibrate Size By Deletes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
calibrateSizeByDeletes	TokenNameIdentifier	 calibrate Size By Deletes
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
abstract	TokenNameabstract	
protected	TokenNameprotected	
long	TokenNamelong	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
sizeDocs	TokenNameIdentifier	 size Docs
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
calibrateSizeByDeletes	TokenNameIdentifier	 calibrate Size By Deletes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
assert	TokenNameassert	
delCount	TokenNameIdentifier	 del Count
<=	TokenNameLESS_EQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
-	TokenNameMINUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
delCount	TokenNameIdentifier	 del Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
long	TokenNamelong	
sizeBytes	TokenNameIdentifier	 size Bytes
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
if	TokenNameif	
(	TokenNameLPAREN	
calibrateSizeByDeletes	TokenNameIdentifier	 calibrate Size By Deletes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
float	TokenNamefloat	
)	TokenNameRPAREN	
delCount	TokenNameIdentifier	 del Count
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
assert	TokenNameassert	
delRatio	TokenNameIdentifier	 del Ratio
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
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
byteSize	TokenNameIdentifier	 byte Size
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
delRatio	TokenNameIdentifier	 del Ratio
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
byteSize	TokenNameIdentifier	 byte Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isMerged	TokenNameIdentifier	 is Merged
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
final	TokenNamefinal	
int	TokenNameint	
numSegments	TokenNameIdentifier	 num Segments
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numToMerge	TokenNameIdentifier	 num To Merge
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
SegmentInfo	TokenNameIdentifier	 Segment Info
mergeInfo	TokenNameIdentifier	 merge Info
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
segmentIsOriginal	TokenNameIdentifier	 segment Is Original
=	TokenNameEQUAL	
false	TokenNamefalse	
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
&&	TokenNameAND_AND	
numToMerge	TokenNameIdentifier	 num To Merge
<=	TokenNameLESS_EQUAL	
maxNumSegments	TokenNameIdentifier	 max Num Segments
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
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
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
numToMerge	TokenNameIdentifier	 num To Merge
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
mergeInfo	TokenNameIdentifier	 merge Info
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
numToMerge	TokenNameIdentifier	 num To Merge
<=	TokenNameLESS_EQUAL	
maxNumSegments	TokenNameIdentifier	 max Num Segments
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
numToMerge	TokenNameIdentifier	 num To Merge
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
segmentIsOriginal	TokenNameIdentifier	 segment Is Original
||	TokenNameOR_OR	
isMerged	TokenNameIdentifier	 is Merged
(	TokenNameLPAREN	
mergeInfo	TokenNameIdentifier	 merge Info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if this single info is already fully merged (has no * pending norms or deletes, is in the same dir as the * writer, and matches the current compound file setting */	TokenNameCOMMENT_JAVADOC	 Returns true if this single info is already fully merged (has no pending norms or deletes, is in the same dir as the writer, and matches the current compound file setting 
protected	TokenNameprotected	
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
/** * Returns the merges necessary to merge the index, taking the max merge * size or max merge docs into consideration. This method attempts to respect * the {@code maxNumSegments} parameter, however it might be, due to size * constraints, that more than that number of segments will remain in the * index. Also, this method does not guarantee that exactly {@code * maxNumSegments} will remain, but &lt;= that number. */	TokenNameCOMMENT_JAVADOC	 Returns the merges necessary to merge the index, taking the max merge size or max merge docs into consideration. This method attempts to respect the {@code maxNumSegments} parameter, however it might be, due to size constraints, that more than that number of segments will remain in the index. Also, this method does not guarantee that exactly {@code maxNumSegments} will remain, but &lt;= that number. 
private	TokenNameprivate	
MergeSpecification	TokenNameIdentifier	 Merge Specification
findForcedMergesSizeLimit	TokenNameIdentifier	 find Forced Merges Size Limit
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
int	TokenNameint	
maxNumSegments	TokenNameIdentifier	 max Num Segments
,	TokenNameCOMMA	
int	TokenNameint	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
segments	TokenNameIdentifier	 segments
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxMergeSizeForForcedMerge	TokenNameIdentifier	 max Merge Size For Forced Merge
||	TokenNameOR_OR	
sizeDocs	TokenNameIdentifier	 size Docs
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
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
"findForcedMergesSizeLimit: skip segment="	TokenNameStringLiteral	findForcedMergesSizeLimit: skip segment=
+	TokenNamePLUS	
info	TokenNameIdentifier	 info
+	TokenNamePLUS	
": size is > maxMergeSize ("	TokenNameStringLiteral	: size is > maxMergeSize (
+	TokenNamePLUS	
maxMergeSizeForForcedMerge	TokenNameIdentifier	 max Merge Size For Forced Merge
+	TokenNamePLUS	
") or sizeDocs is > maxMergeDocs ("	TokenNameStringLiteral	) or sizeDocs is > maxMergeDocs (
+	TokenNamePLUS	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// need to skip that segment + add a merge for the 'right' segments, 	TokenNameCOMMENT_LINE	need to skip that segment + add a merge for the 'right' segments, 
// unless there is only 1 which is merged. 	TokenNameCOMMENT_LINE	unless there is only 1 which is merged. 
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
last	TokenNameIdentifier	 last
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isMerged	TokenNameIdentifier	 is Merged
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// there is more than 1 segment to the right of 	TokenNameCOMMENT_LINE	there is more than 1 segment to the right of 
// this one, or a mergeable single segment. 	TokenNameCOMMENT_LINE	this one, or a mergeable single segment. 
spec	TokenNameIdentifier	 spec
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
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
mergeFactor	TokenNameIdentifier	 merge Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// mergeFactor eligible segments were found, add them as a merge. 	TokenNameCOMMENT_LINE	mergeFactor eligible segments were found, add them as a merge. 
spec	TokenNameIdentifier	 spec
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
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
--	TokenNameMINUS_MINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add any left-over segments, unless there is just 1 	TokenNameCOMMENT_LINE	Add any left-over segments, unless there is just 1 
// already fully merged 	TokenNameCOMMENT_LINE	already fully merged 
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
last	TokenNameIdentifier	 last
||	TokenNameOR_OR	
!	TokenNameNOT	
isMerged	TokenNameIdentifier	 is Merged
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the merges necessary to forceMerge the index. This method constraints * the returned merges only by the {@code maxNumSegments} parameter, and * guaranteed that exactly that number of segments will remain in the index. */	TokenNameCOMMENT_JAVADOC	 Returns the merges necessary to forceMerge the index. This method constraints the returned merges only by the {@code maxNumSegments} parameter, and guaranteed that exactly that number of segments will remain in the index. 
private	TokenNameprivate	
MergeSpecification	TokenNameIdentifier	 Merge Specification
findForcedMergesMaxNumSegments	TokenNameIdentifier	 find Forced Merges Max Num Segments
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
int	TokenNameint	
maxNumSegments	TokenNameIdentifier	 max Num Segments
,	TokenNameCOMMA	
int	TokenNameint	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
segments	TokenNameIdentifier	 segments
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// First, enroll all "full" merges (size 	TokenNameCOMMENT_LINE	First, enroll all "full" merges (size 
// mergeFactor) to potentially be run concurrently: 	TokenNameCOMMENT_LINE	mergeFactor) to potentially be run concurrently: 
while	TokenNamewhile	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
-	TokenNameMINUS	
maxNumSegments	TokenNameIdentifier	 max Num Segments
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
mergeFactor	TokenNameIdentifier	 merge Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spec	TokenNameIdentifier	 spec
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
last	TokenNameIdentifier	 last
-	TokenNameMINUS	
mergeFactor	TokenNameIdentifier	 merge Factor
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
-=	TokenNameMINUS_EQUAL	
mergeFactor	TokenNameIdentifier	 merge Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Only if there are no full merges pending do we 	TokenNameCOMMENT_LINE	Only if there are no full merges pending do we 
// add a final partial (< mergeFactor segments) merge: 	TokenNameCOMMENT_LINE	add a final partial (< mergeFactor segments) merge: 
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// Take care to pick a partial merge that is 	TokenNameCOMMENT_LINE	Take care to pick a partial merge that is 
// least cost, but does not make the index too 	TokenNameCOMMENT_LINE	least cost, but does not make the index too 
// lopsided. If we always just picked the 	TokenNameCOMMENT_LINE	lopsided. If we always just picked the 
// partial tail then we could produce a highly 	TokenNameCOMMENT_LINE	partial tail then we could produce a highly 
// lopsided index over time: 	TokenNameCOMMENT_LINE	lopsided index over time: 
// We must merge this many segments to leave 	TokenNameCOMMENT_LINE	We must merge this many segments to leave 
// maxNumSegments in the index (from when 	TokenNameCOMMENT_LINE	maxNumSegments in the index (from when 
// forceMerge was first kicked off): 	TokenNameCOMMENT_LINE	forceMerge was first kicked off): 
final	TokenNamefinal	
int	TokenNameint	
finalMergeSize	TokenNameIdentifier	 final Merge Size
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
-	TokenNameMINUS	
maxNumSegments	TokenNameIdentifier	 max Num Segments
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Consider all possible starting points: 	TokenNameCOMMENT_LINE	Consider all possible starting points: 
long	TokenNamelong	
bestSize	TokenNameIdentifier	 best Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bestStart	TokenNameIdentifier	 best Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
-	TokenNameMINUS	
finalMergeSize	TokenNameIdentifier	 final Merge Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
sumSize	TokenNameIdentifier	 sum Size
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
finalMergeSize	TokenNameIdentifier	 final Merge Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
sumSize	TokenNameIdentifier	 sum Size
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
sumSize	TokenNameIdentifier	 sum Size
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
sumSize	TokenNameIdentifier	 sum Size
<	TokenNameLESS	
bestSize	TokenNameIdentifier	 best Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestStart	TokenNameIdentifier	 best Start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
bestSize	TokenNameIdentifier	 best Size
=	TokenNameEQUAL	
sumSize	TokenNameIdentifier	 sum Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
spec	TokenNameIdentifier	 spec
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
bestStart	TokenNameIdentifier	 best Start
,	TokenNameCOMMA	
bestStart	TokenNameIdentifier	 best Start
+	TokenNamePLUS	
finalMergeSize	TokenNameIdentifier	 final Merge Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the merges necessary to merge the index down * to a specified number of segments. * This respects the {@link #maxMergeSizeForForcedMerge} setting. * By default, and assuming {@code maxNumSegments=1}, only * one segment will be left in the index, where that segment * has no deletions pending nor separate norms, and it is in * compound file format if the current useCompoundFile * setting is true. This method returns multiple merges * (mergeFactor at a time) so the {@link MergeScheduler} * in use may make use of concurrency. */	TokenNameCOMMENT_JAVADOC	 Returns the merges necessary to merge the index down to a specified number of segments. This respects the {@link #maxMergeSizeForForcedMerge} setting. By default, and assuming {@code maxNumSegments=1}, only one segment will be left in the index, where that segment has no deletions pending nor separate norms, and it is in compound file format if the current useCompoundFile setting is true. This method returns multiple merges (mergeFactor at a time) so the {@link MergeScheduler} in use may make use of concurrency. 
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
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"findForcedMerges: maxNumSegs="	TokenNameStringLiteral	findForcedMerges: maxNumSegs=
+	TokenNamePLUS	
maxNumSegments	TokenNameIdentifier	 max Num Segments
+	TokenNamePLUS	
" segsToMerge="	TokenNameStringLiteral	 segsToMerge=
+	TokenNamePLUS	
segmentsToMerge	TokenNameIdentifier	 segments To Merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the segments are already merged (e.g. there's only 1 segment), or 	TokenNameCOMMENT_LINE	If the segments are already merged (e.g. there's only 1 segment), or 
// there are <maxNumSegements:. 	TokenNameCOMMENT_LINE	there are <maxNumSegements:. 
if	TokenNameif	
(	TokenNameLPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"already merged; skip"	TokenNameStringLiteral	already merged; skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Find the newest (rightmost) segment that needs to 	TokenNameCOMMENT_LINE	Find the newest (rightmost) segment that needs to 
// be merged (other segments may have been flushed 	TokenNameCOMMENT_LINE	be merged (other segments may have been flushed 
// since merging started): 	TokenNameCOMMENT_LINE	since merging started): 
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
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// There is only one segment already, and it is merged 	TokenNameCOMMENT_LINE	There is only one segment already, and it is merged 
if	TokenNameif	
(	TokenNameLPAREN	
maxNumSegments	TokenNameIdentifier	 max Num Segments
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
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
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"already 1 seg; skip"	TokenNameStringLiteral	already 1 seg; skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check if there are any segments above the threshold 	TokenNameCOMMENT_LINE	Check if there are any segments above the threshold 
boolean	TokenNameboolean	
anyTooLarge	TokenNameIdentifier	 any Too Large
=	TokenNameEQUAL	
false	TokenNamefalse	
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
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxMergeSizeForForcedMerge	TokenNameIdentifier	 max Merge Size For Forced Merge
||	TokenNameOR_OR	
sizeDocs	TokenNameIdentifier	 size Docs
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anyTooLarge	TokenNameIdentifier	 any Too Large
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anyTooLarge	TokenNameIdentifier	 any Too Large
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
findForcedMergesSizeLimit	TokenNameIdentifier	 find Forced Merges Size Limit
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
maxNumSegments	TokenNameIdentifier	 max Num Segments
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
findForcedMergesMaxNumSegments	TokenNameIdentifier	 find Forced Merges Max Num Segments
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
maxNumSegments	TokenNameIdentifier	 max Num Segments
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Finds merges necessary to force-merge all deletes from the * index. We simply merge adjacent segments that have * deletes, up to mergeFactor at a time. */	TokenNameCOMMENT_JAVADOC	 Finds merges necessary to force-merge all deletes from the index. We simply merge adjacent segments that have deletes, up to mergeFactor at a time. 
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
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
segments	TokenNameIdentifier	 segments
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
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
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"findForcedDeleteMerges: "	TokenNameStringLiteral	findForcedDeleteMerges: 
+	TokenNamePLUS	
numSegments	TokenNameIdentifier	 num Segments
+	TokenNamePLUS	
" segments"	TokenNameStringLiteral	 segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
numDeletedDocs	TokenNameIdentifier	 num Deleted Docs
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delCount	TokenNameIdentifier	 del Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
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
" segment "	TokenNameStringLiteral	 segment 
+	TokenNamePLUS	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" has deletions"	TokenNameStringLiteral	 has deletions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
==	TokenNameEQUAL_EQUAL	
mergeFactor	TokenNameIdentifier	 merge Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We've seen mergeFactor segments in a row with 	TokenNameCOMMENT_LINE	We've seen mergeFactor segments in a row with 
// deletions, so force a merge now: 	TokenNameCOMMENT_LINE	deletions, so force a merge now: 
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" add merge "	TokenNameStringLiteral	 add merge 
+	TokenNamePLUS	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" inclusive"	TokenNameStringLiteral	 inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spec	TokenNameIdentifier	 spec
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
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// End of a sequence of segments with deletions, so, 	TokenNameCOMMENT_LINE	End of a sequence of segments with deletions, so, 
// merge those past segments even if it's fewer than 	TokenNameCOMMENT_LINE	merge those past segments even if it's fewer than 
// mergeFactor segments 	TokenNameCOMMENT_LINE	mergeFactor segments 
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" add merge "	TokenNameStringLiteral	 add merge 
+	TokenNamePLUS	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" inclusive"	TokenNameStringLiteral	 inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spec	TokenNameIdentifier	 spec
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
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
" add merge "	TokenNameStringLiteral	 add merge 
+	TokenNamePLUS	
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
(	TokenNameLPAREN	
numSegments	TokenNameIdentifier	 num Segments
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" inclusive"	TokenNameStringLiteral	 inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spec	TokenNameIdentifier	 spec
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
firstSegmentWithDeletions	TokenNameIdentifier	 first Segment With Deletions
,	TokenNameCOMMA	
numSegments	TokenNameIdentifier	 num Segments
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
static	TokenNamestatic	
class	TokenNameclass	
SegmentInfoAndLevel	TokenNameIdentifier	 Segment Info And Level
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
SegmentInfoAndLevel	TokenNameIdentifier	 Segment Info And Level
>	TokenNameGREATER	
{	TokenNameLBRACE	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
float	TokenNamefloat	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SegmentInfoAndLevel	TokenNameIdentifier	 Segment Info And Level
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
float	TokenNamefloat	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Sorts largest to smallest 	TokenNameCOMMENT_LINE	Sorts largest to smallest 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
SegmentInfoAndLevel	TokenNameIdentifier	 Segment Info And Level
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Checks if any merges are now necessary and returns a * {@link MergePolicy.MergeSpecification} if so. A merge * is necessary when there are more than {@link * #setMergeFactor} segments at a given level. When * multiple levels have too many segments, this method * will return multiple merges, allowing the {@link * MergeScheduler} to use concurrency. */	TokenNameCOMMENT_JAVADOC	 Checks if any merges are now necessary and returns a {@link MergePolicy.MergeSpecification} if so. A merge is necessary when there are more than {@link #setMergeFactor} segments at a given level. When multiple levels have too many segments, this method will return multiple merges, allowing the {@link MergeScheduler} to use concurrency. 
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
numSegments	TokenNameIdentifier	 num Segments
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"findMerges: "	TokenNameStringLiteral	findMerges: 
+	TokenNamePLUS	
numSegments	TokenNameIdentifier	 num Segments
+	TokenNamePLUS	
" segments"	TokenNameStringLiteral	 segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute levels, which is just log (base mergeFactor) 	TokenNameCOMMENT_LINE	Compute levels, which is just log (base mergeFactor) 
// of the size of each segment 	TokenNameCOMMENT_LINE	of the size of each segment 
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfoAndLevel	TokenNameIdentifier	 Segment Info And Level
>	TokenNameGREATER	
levels	TokenNameIdentifier	 levels
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfoAndLevel	TokenNameIdentifier	 Segment Info And Level
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
mergeFactor	TokenNameIdentifier	 merge Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
mergingSegments	TokenNameIdentifier	 merging Segments
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
final	TokenNamefinal	
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
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Floor tiny segments 	TokenNameCOMMENT_LINE	Floor tiny segments 
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
SegmentInfoAndLevel	TokenNameIdentifier	 Segment Info And Level
infoLevel	TokenNameIdentifier	 info Level
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfoAndLevel	TokenNameIdentifier	 Segment Info And Level
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
norm	TokenNameIdentifier	 norm
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
levels	TokenNameIdentifier	 levels
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
infoLevel	TokenNameIdentifier	 info Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
segBytes	TokenNameIdentifier	 seg Bytes
=	TokenNameEQUAL	
sizeBytes	TokenNameIdentifier	 size Bytes
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
mergingSegments	TokenNameIdentifier	 merging Segments
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
size	TokenNameIdentifier	 size
>=	TokenNameGREATER_EQUAL	
maxMergeSize	TokenNameIdentifier	 max Merge Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extra	TokenNameIdentifier	 extra
+=	TokenNamePLUS_EQUAL	
" [skip: too large]"	TokenNameStringLiteral	 [skip: too large]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"seg="	TokenNameStringLiteral	seg=
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
" level="	TokenNameStringLiteral	 level=
+	TokenNamePLUS	
infoLevel	TokenNameIdentifier	 info Level
.	TokenNameDOT	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
" size="	TokenNameStringLiteral	 size=
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%.3f MB"	TokenNameStringLiteral	%.3f MB
,	TokenNameCOMMA	
segBytes	TokenNameIdentifier	 seg Bytes
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
1024.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
extra	TokenNameIdentifier	 extra
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
float	TokenNamefloat	
levelFloor	TokenNameIdentifier	 level Floor
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minMergeSize	TokenNameIdentifier	 min Merge Size
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
levelFloor	TokenNameIdentifier	 level Floor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
levelFloor	TokenNameIdentifier	 level Floor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
minMergeSize	TokenNameIdentifier	 min Merge Size
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now, we quantize the log values into levels. The 	TokenNameCOMMENT_LINE	Now, we quantize the log values into levels. The 
// first level is any segment whose log size is within 	TokenNameCOMMENT_LINE	first level is any segment whose log size is within 
// LEVEL_LOG_SPAN of the max size, or, who has such as 	TokenNameCOMMENT_LINE	LEVEL_LOG_SPAN of the max size, or, who has such as 
// segment "to the right". Then, we find the max of all 	TokenNameCOMMENT_LINE	segment "to the right". Then, we find the max of all 
// other segments and use that to define the next level 	TokenNameCOMMENT_LINE	other segments and use that to define the next level 
// segment, etc. 	TokenNameCOMMENT_LINE	segment, etc. 
MergeSpecification	TokenNameIdentifier	 Merge Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numMergeableSegments	TokenNameIdentifier	 num Mergeable Segments
=	TokenNameEQUAL	
levels	TokenNameIdentifier	 levels
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
numMergeableSegments	TokenNameIdentifier	 num Mergeable Segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Find max level of all segments not already 	TokenNameCOMMENT_LINE	Find max level of all segments not already 
// quantized. 	TokenNameCOMMENT_LINE	quantized. 
float	TokenNamefloat	
maxLevel	TokenNameIdentifier	 max Level
=	TokenNameEQUAL	
levels	TokenNameIdentifier	 levels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numMergeableSegments	TokenNameIdentifier	 num Mergeable Segments
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
float	TokenNamefloat	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
levels	TokenNameIdentifier	 levels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
>	TokenNameGREATER	
maxLevel	TokenNameIdentifier	 max Level
)	TokenNameRPAREN	
maxLevel	TokenNameIdentifier	 max Level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now search backwards for the rightmost segment that 	TokenNameCOMMENT_LINE	Now search backwards for the rightmost segment that 
// falls into this level: 	TokenNameCOMMENT_LINE	falls into this level: 
float	TokenNamefloat	
levelBottom	TokenNameIdentifier	 level Bottom
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxLevel	TokenNameIdentifier	 max Level
<=	TokenNameLESS_EQUAL	
levelFloor	TokenNameIdentifier	 level Floor
)	TokenNameRPAREN	
// All remaining segments fall into the min level 	TokenNameCOMMENT_LINE	All remaining segments fall into the min level 
levelBottom	TokenNameIdentifier	 level Bottom
=	TokenNameEQUAL	
-	TokenNameMINUS	
1.0F	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
levelBottom	TokenNameIdentifier	 level Bottom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
maxLevel	TokenNameIdentifier	 max Level
-	TokenNameMINUS	
LEVEL_LOG_SPAN	TokenNameIdentifier	 LEVEL  LOG  SPAN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Force a boundary at the level floor 	TokenNameCOMMENT_LINE	Force a boundary at the level floor 
if	TokenNameif	
(	TokenNameLPAREN	
levelBottom	TokenNameIdentifier	 level Bottom
<	TokenNameLESS	
levelFloor	TokenNameIdentifier	 level Floor
&&	TokenNameAND_AND	
maxLevel	TokenNameIdentifier	 max Level
>=	TokenNameGREATER_EQUAL	
levelFloor	TokenNameIdentifier	 level Floor
)	TokenNameRPAREN	
levelBottom	TokenNameIdentifier	 level Bottom
=	TokenNameEQUAL	
levelFloor	TokenNameIdentifier	 level Floor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
numMergeableSegments	TokenNameIdentifier	 num Mergeable Segments
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
>=	TokenNameGREATER_EQUAL	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
>=	TokenNameGREATER_EQUAL	
levelBottom	TokenNameIdentifier	 level Bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
upto	TokenNameIdentifier	 upto
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" level "	TokenNameStringLiteral	 level 
+	TokenNamePLUS	
levelBottom	TokenNameIdentifier	 level Bottom
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
maxLevel	TokenNameIdentifier	 max Level
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
+	TokenNamePLUS	
" segments"	TokenNameStringLiteral	 segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Finally, record all merges that are viable at this level: 	TokenNameCOMMENT_LINE	Finally, record all merges that are viable at this level: 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
mergeFactor	TokenNameIdentifier	 merge Factor
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
anyTooLarge	TokenNameIdentifier	 any Too Large
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
anyMerging	TokenNameIdentifier	 any Merging
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
levels	TokenNameIdentifier	 levels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
anyTooLarge	TokenNameIdentifier	 any Too Large
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
maxMergeSize	TokenNameIdentifier	 max Merge Size
||	TokenNameOR_OR	
sizeDocs	TokenNameIdentifier	 size Docs
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mergingSegments	TokenNameIdentifier	 merging Segments
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anyMerging	TokenNameIdentifier	 any Merging
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anyMerging	TokenNameIdentifier	 any Merging
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// skip 	TokenNameCOMMENT_LINE	skip 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
anyTooLarge	TokenNameIdentifier	 any Too Large
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
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
mergeInfos	TokenNameIdentifier	 merge Infos
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
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergeInfos	TokenNameIdentifier	 merge Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
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
mergeInfos	TokenNameIdentifier	 merge Infos
)	TokenNameRPAREN	
+	TokenNamePLUS	
" start="	TokenNameStringLiteral	 start=
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
" end="	TokenNameStringLiteral	 end=
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
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
mergeInfos	TokenNameIdentifier	 merge Infos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
": contains segment over maxMergeSize or maxMergeDocs; skipping"	TokenNameStringLiteral	: contains segment over maxMergeSize or maxMergeDocs; skipping
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
mergeFactor	TokenNameIdentifier	 merge Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <p>Determines the largest segment (measured by * document count) that may be merged with other segments. * Small values (e.g., less than 10,000) are best for * interactive indexing, as this limits the length of * pauses while indexing to a few seconds. Larger values * are best for batched indexing and speedier * searches.</p> * * <p>The default value is {@link Integer#MAX_VALUE}.</p> * * <p>The default merge policy ({@link * LogByteSizeMergePolicy}) also allows you to set this * limit by net size (in MB) of the segment, using {@link * LogByteSizeMergePolicy#setMaxMergeMB}.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Determines the largest segment (measured by document count) that may be merged with other segments. Small values (e.g., less than 10,000) are best for interactive indexing, as this limits the length of pauses while indexing to a few seconds. Larger values are best for batched indexing and speedier searches.</p> * <p>The default value is {@link Integer#MAX_VALUE}.</p> * <p>The default merge policy ({@link LogByteSizeMergePolicy}) also allows you to set this limit by net size (in MB) of the segment, using {@link LogByteSizeMergePolicy#setMaxMergeMB}.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
int	TokenNameint	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
=	TokenNameEQUAL	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the largest segment (measured by document * count) that may be merged with other segments. * @see #setMaxMergeDocs */	TokenNameCOMMENT_JAVADOC	 Returns the largest segment (measured by document count) that may be merged with other segments. @see #setMaxMergeDocs 
public	TokenNamepublic	
int	TokenNameint	
getMaxMergeDocs	TokenNameIdentifier	 get Max Merge Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
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
"minMergeSize="	TokenNameStringLiteral	minMergeSize=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
minMergeSize	TokenNameIdentifier	 min Merge Size
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
"mergeFactor="	TokenNameStringLiteral	mergeFactor=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mergeFactor	TokenNameIdentifier	 merge Factor
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
"maxMergeSize="	TokenNameStringLiteral	maxMergeSize=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
maxMergeSize	TokenNameIdentifier	 max Merge Size
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
"maxMergeSizeForForcedMerge="	TokenNameStringLiteral	maxMergeSizeForForcedMerge=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
maxMergeSizeForForcedMerge	TokenNameIdentifier	 max Merge Size For Forced Merge
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
"calibrateSizeByDeletes="	TokenNameStringLiteral	calibrateSizeByDeletes=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
calibrateSizeByDeletes	TokenNameIdentifier	 calibrate Size By Deletes
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
"maxMergeDocs="	TokenNameStringLiteral	maxMergeDocs=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
maxMergeDocs	TokenNameIdentifier	 max Merge Docs
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
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
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
