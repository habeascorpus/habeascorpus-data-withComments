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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexOutput	TokenNameIdentifier	 Index Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexInput	TokenNameIdentifier	 Index Input
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
BitVector	TokenNameIdentifier	 Bit Vector
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
HashSet	TokenNameIdentifier	 Hash Set
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Information about a segment such as it's name, directory, and files related * to the segment. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Information about a segment such as it's name, directory, and files related to the segment. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SegmentInfo	TokenNameIdentifier	 Segment Info
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NO	TokenNameIdentifier	 NO
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// e.g. no norms; no deletes; 	TokenNameCOMMENT_LINE	e.g. no norms; no deletes; 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
YES	TokenNameIdentifier	 YES
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// e.g. have norms; have deletes; 	TokenNameCOMMENT_LINE	e.g. have norms; have deletes; 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHECK_DIR	TokenNameIdentifier	 CHECK  DIR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// e.g. must check dir to see if there are norms/deletions 	TokenNameCOMMENT_LINE	e.g. must check dir to see if there are norms/deletions 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WITHOUT_GEN	TokenNameIdentifier	 WITHOUT  GEN
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// a file name that has no GEN in it. 	TokenNameCOMMENT_LINE	a file name that has no GEN in it. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
// unique name in dir 	TokenNameCOMMENT_LINE	unique name in dir 
public	TokenNamepublic	
int	TokenNameint	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
// number of docs in seg 	TokenNameCOMMENT_LINE	number of docs in seg 
public	TokenNamepublic	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
// where segment resides 	TokenNameCOMMENT_LINE	where segment resides 
private	TokenNameprivate	
boolean	TokenNameboolean	
preLockless	TokenNameIdentifier	 pre Lockless
;	TokenNameSEMICOLON	
// true if this is a segments file written before 	TokenNameCOMMENT_LINE	true if this is a segments file written before 
// lock-less commits (2.1) 	TokenNameCOMMENT_LINE	lock-less commits (2.1) 
private	TokenNameprivate	
long	TokenNamelong	
delGen	TokenNameIdentifier	 del Gen
;	TokenNameSEMICOLON	
// current generation of del file; NO if there 	TokenNameCOMMENT_LINE	current generation of del file; NO if there 
// are no deletes; CHECK_DIR if it's a pre-2.1 segment 	TokenNameCOMMENT_LINE	are no deletes; CHECK_DIR if it's a pre-2.1 segment 
// (and we must check filesystem); YES or higher if 	TokenNameCOMMENT_LINE	(and we must check filesystem); YES or higher if 
// there are deletes at generation N 	TokenNameCOMMENT_LINE	there are deletes at generation N 
private	TokenNameprivate	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
normGen	TokenNameIdentifier	 norm Gen
;	TokenNameSEMICOLON	
// current generation of each field's norm file. 	TokenNameCOMMENT_LINE	current generation of each field's norm file. 
// If this array is null, for lockLess this means no 	TokenNameCOMMENT_LINE	If this array is null, for lockLess this means no 
// separate norms. For preLockLess this means we must 	TokenNameCOMMENT_LINE	separate norms. For preLockLess this means we must 
// check filesystem. If this array is not null, its 	TokenNameCOMMENT_LINE	check filesystem. If this array is not null, its 
// values mean: NO says this field has no separate 	TokenNameCOMMENT_LINE	values mean: NO says this field has no separate 
// norms; CHECK_DIR says it is a preLockLess segment and 	TokenNameCOMMENT_LINE	norms; CHECK_DIR says it is a preLockLess segment and 
// filesystem must be checked; >= YES says this field 	TokenNameCOMMENT_LINE	filesystem must be checked; >= YES says this field 
// has separate norms with the specified generation 	TokenNameCOMMENT_LINE	has separate norms with the specified generation 
private	TokenNameprivate	
byte	TokenNamebyte	
isCompoundFile	TokenNameIdentifier	 is Compound File
;	TokenNameSEMICOLON	
// NO if it is not; YES if it is; CHECK_DIR if it's 	TokenNameCOMMENT_LINE	NO if it is not; YES if it is; CHECK_DIR if it's 
// pre-2.1 (ie, must check file system to see 	TokenNameCOMMENT_LINE	pre-2.1 (ie, must check file system to see 
// if <name>.cfs and <name>.nrm exist) 	TokenNameCOMMENT_LINE	if <name>.cfs and <name>.nrm exist) 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
;	TokenNameSEMICOLON	
// true if this segment maintains norms in a single file; 	TokenNameCOMMENT_LINE	true if this segment maintains norms in a single file; 
// false otherwise 	TokenNameCOMMENT_LINE	false otherwise 
// this is currently false for segments populated by DocumentWriter 	TokenNameCOMMENT_LINE	this is currently false for segments populated by DocumentWriter 
// and true for newly created merged segments (both 	TokenNameCOMMENT_LINE	and true for newly created merged segments (both 
// compound and non compound). 	TokenNameCOMMENT_LINE	compound and non compound). 
private	TokenNameprivate	
volatile	TokenNamevolatile	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
// cached list of files that this segment uses 	TokenNameCOMMENT_LINE	cached list of files that this segment uses 
// in the Directory 	TokenNameCOMMENT_LINE	in the Directory 
private	TokenNameprivate	
volatile	TokenNamevolatile	
long	TokenNamelong	
sizeInBytesNoStore	TokenNameIdentifier	 size In Bytes No Store
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// total byte size of all but the store files (computed on demand) 	TokenNameCOMMENT_LINE	total byte size of all but the store files (computed on demand) 
private	TokenNameprivate	
volatile	TokenNamevolatile	
long	TokenNamelong	
sizeInBytesWithStore	TokenNameIdentifier	 size In Bytes With Store
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// total byte size of all of our files (computed on demand) 	TokenNameCOMMENT_LINE	total byte size of all of our files (computed on demand) 
private	TokenNameprivate	
int	TokenNameint	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
;	TokenNameSEMICOLON	
// if this segment shares stored fields & vectors, this 	TokenNameCOMMENT_LINE	if this segment shares stored fields & vectors, this 
// offset is where in that file this segment's docs begin 	TokenNameCOMMENT_LINE	offset is where in that file this segment's docs begin 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
docStoreSegment	TokenNameIdentifier	 doc Store Segment
;	TokenNameSEMICOLON	
// name used to derive fields/vectors file we share with 	TokenNameCOMMENT_LINE	name used to derive fields/vectors file we share with 
// other segments 	TokenNameCOMMENT_LINE	other segments 
private	TokenNameprivate	
boolean	TokenNameboolean	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
;	TokenNameSEMICOLON	
// whether doc store files are stored in compound file (*.cfx) 	TokenNameCOMMENT_LINE	whether doc store files are stored in compound file (*.cfx) 
private	TokenNameprivate	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
// How many deleted docs in this segment, or -1 if not yet known 	TokenNameCOMMENT_LINE	How many deleted docs in this segment, or -1 if not yet known 
// (if it's an older index) 	TokenNameCOMMENT_LINE	(if it's an older index) 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasProx	TokenNameIdentifier	 has Prox
;	TokenNameSEMICOLON	
// True if this segment has any fields with omitTermFreqAndPositions==false 	TokenNameCOMMENT_LINE	True if this segment has any fields with omitTermFreqAndPositions==false 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasVectors	TokenNameIdentifier	 has Vectors
;	TokenNameSEMICOLON	
// True if this segment wrote term vectors 	TokenNameCOMMENT_LINE	True if this segment wrote term vectors 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
diagnostics	TokenNameIdentifier	 diagnostics
;	TokenNameSEMICOLON	
// Tracks the Lucene version this segment was created with, since 3.1. The 	TokenNameCOMMENT_LINE	Tracks the Lucene version this segment was created with, since 3.1. The 
// format expected is "x.y" - "2.x" for pre-3.0 indexes, and specific versions 	TokenNameCOMMENT_LINE	format expected is "x.y" - "2.x" for pre-3.0 indexes, and specific versions 
// afterwards ("3.0", "3.1" etc.). 	TokenNameCOMMENT_LINE	afterwards ("3.0", "3.1" etc.). 
// see Constants.LUCENE_MAIN_VERSION. 	TokenNameCOMMENT_LINE	see Constants.LUCENE_MAIN_VERSION. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
// NOTE: only used in-RAM by IW to track buffered deletes; 	TokenNameCOMMENT_LINE	NOTE: only used in-RAM by IW to track buffered deletes; 
// this is never written to/read from the Directory 	TokenNameCOMMENT_LINE	this is never written to/read from the Directory 
private	TokenNameprivate	
long	TokenNamelong	
bufferedDeletesGen	TokenNameIdentifier	 buffered Deletes Gen
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SegmentInfo	TokenNameIdentifier	 Segment Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
docCount	TokenNameIdentifier	 doc Count
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCompoundFile	TokenNameIdentifier	 is Compound File
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasProx	TokenNameIdentifier	 has Prox
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasVectors	TokenNameIdentifier	 has Vectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
=	TokenNameEQUAL	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
delGen	TokenNameIdentifier	 del Gen
=	TokenNameEQUAL	
NO	TokenNameIdentifier	 NO
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isCompoundFile	TokenNameIdentifier	 is Compound File
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
isCompoundFile	TokenNameIdentifier	 is Compound File
?	TokenNameQUESTION	
YES	TokenNameIdentifier	 YES
:	TokenNameCOLON	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preLockless	TokenNameIdentifier	 pre Lockless
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
=	TokenNameEQUAL	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasProx	TokenNameIdentifier	 has Prox
=	TokenNameEQUAL	
hasProx	TokenNameIdentifier	 has Prox
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
hasVectors	TokenNameIdentifier	 has Vectors
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy everything from src SegmentInfo into our instance. */	TokenNameCOMMENT_JAVADOC	 Copy everything from src SegmentInfo into our instance. 
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
docCount	TokenNameIdentifier	 doc Count
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
preLockless	TokenNameIdentifier	 pre Lockless
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
preLockless	TokenNameIdentifier	 pre Lockless
;	TokenNameSEMICOLON	
delGen	TokenNameIdentifier	 del Gen
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
delGen	TokenNameIdentifier	 del Gen
;	TokenNameSEMICOLON	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
;	TokenNameSEMICOLON	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
;	TokenNameSEMICOLON	
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
hasVectors	TokenNameIdentifier	 has Vectors
;	TokenNameSEMICOLON	
hasProx	TokenNameIdentifier	 has Prox
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
hasProx	TokenNameIdentifier	 has Prox
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
normGen	TokenNameIdentifier	 norm Gen
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normGen	TokenNameIdentifier	 norm Gen
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
normGen	TokenNameIdentifier	 norm Gen
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
normGen	TokenNameIdentifier	 norm Gen
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
normGen	TokenNameIdentifier	 norm Gen
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
normGen	TokenNameIdentifier	 norm Gen
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
normGen	TokenNameIdentifier	 norm Gen
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isCompoundFile	TokenNameIdentifier	 is Compound File
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
isCompoundFile	TokenNameIdentifier	 is Compound File
;	TokenNameSEMICOLON	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
;	TokenNameSEMICOLON	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setDiagnostics	TokenNameIdentifier	 set Diagnostics
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
diagnostics	TokenNameIdentifier	 diagnostics
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
diagnostics	TokenNameIdentifier	 diagnostics
=	TokenNameEQUAL	
diagnostics	TokenNameIdentifier	 diagnostics
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getDiagnostics	TokenNameIdentifier	 get Diagnostics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
diagnostics	TokenNameIdentifier	 diagnostics
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new SegmentInfo instance by reading a * previously saved SegmentInfo from input. * * @param dir directory to load from * @param format format of the segments info file * @param input input handle to read segment info from */	TokenNameCOMMENT_JAVADOC	 Construct a new SegmentInfo instance by reading a previously saved SegmentInfo from input. * @param dir directory to load from @param format format of the segments info file @param input input handle to read segment info from 
SegmentInfo	TokenNameIdentifier	 Segment Info
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
int	TokenNameint	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<=	TokenNameLESS_EQUAL	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FORMAT_3_1	TokenNameIdentifier	 FORMAT 3 1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docCount	TokenNameIdentifier	 doc Count
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<=	TokenNameLESS_EQUAL	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FORMAT_LOCKLESS	TokenNameIdentifier	 FORMAT  LOCKLESS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delGen	TokenNameIdentifier	 del Gen
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<=	TokenNameLESS_EQUAL	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FORMAT_SHARED_DOC_STORE	TokenNameIdentifier	 FORMAT  SHARED  DOC  STORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<=	TokenNameLESS_EQUAL	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FORMAT_SINGLE_NORM_FILE	TokenNameIdentifier	 FORMAT  SINGLE  NORM  FILE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numNormGen	TokenNameIdentifier	 num Norm Gen
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numNormGen	TokenNameIdentifier	 num Norm Gen
==	TokenNameEQUAL_EQUAL	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normGen	TokenNameIdentifier	 norm Gen
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
normGen	TokenNameIdentifier	 norm Gen
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
numNormGen	TokenNameIdentifier	 num Norm Gen
]	TokenNameRBRACKET	
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
numNormGen	TokenNameIdentifier	 num Norm Gen
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
isCompoundFile	TokenNameIdentifier	 is Compound File
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preLockless	TokenNameIdentifier	 pre Lockless
=	TokenNameEQUAL	
(	TokenNameLPAREN	
isCompoundFile	TokenNameIdentifier	 is Compound File
==	TokenNameEQUAL_EQUAL	
CHECK_DIR	TokenNameIdentifier	 CHECK  DIR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<=	TokenNameLESS_EQUAL	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FORMAT_DEL_COUNT	TokenNameIdentifier	 FORMAT  DEL  COUNT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
delCount	TokenNameIdentifier	 del Count
<=	TokenNameLESS_EQUAL	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<=	TokenNameLESS_EQUAL	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FORMAT_HAS_PROX	TokenNameIdentifier	 FORMAT  HAS  PROX
)	TokenNameRPAREN	
hasProx	TokenNameIdentifier	 has Prox
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
hasProx	TokenNameIdentifier	 has Prox
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<=	TokenNameLESS_EQUAL	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FORMAT_DIAGNOSTICS	TokenNameIdentifier	 FORMAT  DIAGNOSTICS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
diagnostics	TokenNameIdentifier	 diagnostics
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readStringStringMap	TokenNameIdentifier	 read String String Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
diagnostics	TokenNameIdentifier	 diagnostics
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<=	TokenNameLESS_EQUAL	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FORMAT_HAS_VECTORS	TokenNameIdentifier	 FORMAT  HAS  VECTORS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
storesSegment	TokenNameIdentifier	 stores Segment
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
isCompoundFile	TokenNameIdentifier	 is Compound File
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
storesSegment	TokenNameIdentifier	 stores Segment
=	TokenNameEQUAL	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
;	TokenNameSEMICOLON	
isCompoundFile	TokenNameIdentifier	 is Compound File
=	TokenNameEQUAL	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
COMPOUND_FILE_STORE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  STORE  EXTENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
storesSegment	TokenNameIdentifier	 stores Segment
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
isCompoundFile	TokenNameIdentifier	 is Compound File
=	TokenNameEQUAL	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
COMPOUND_FILE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  EXTENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dirToTest	TokenNameIdentifier	 dir To Test
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isCompoundFile	TokenNameIdentifier	 is Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dirToTest	TokenNameIdentifier	 dir To Test
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
storesSegment	TokenNameIdentifier	 stores Segment
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dirToTest	TokenNameIdentifier	 dir To Test
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
dirToTest	TokenNameIdentifier	 dir To Test
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
storesSegment	TokenNameIdentifier	 stores Segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isCompoundFile	TokenNameIdentifier	 is Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dirToTest	TokenNameIdentifier	 dir To Test
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
delGen	TokenNameIdentifier	 del Gen
=	TokenNameEQUAL	
CHECK_DIR	TokenNameIdentifier	 CHECK  DIR
;	TokenNameSEMICOLON	
normGen	TokenNameIdentifier	 norm Gen
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
isCompoundFile	TokenNameIdentifier	 is Compound File
=	TokenNameEQUAL	
CHECK_DIR	TokenNameIdentifier	 CHECK  DIR
;	TokenNameSEMICOLON	
preLockless	TokenNameIdentifier	 pre Lockless
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hasProx	TokenNameIdentifier	 has Prox
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
diagnostics	TokenNameIdentifier	 diagnostics
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
setNumFields	TokenNameIdentifier	 set Num Fields
(	TokenNameLPAREN	
int	TokenNameint	
numFields	TokenNameIdentifier	 num Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// normGen is null if we loaded a pre-2.1 segment 	TokenNameCOMMENT_LINE	normGen is null if we loaded a pre-2.1 segment 
// file, or, if this segments file hasn't had any 	TokenNameCOMMENT_LINE	file, or, if this segments file hasn't had any 
// norms set against it yet: 	TokenNameCOMMENT_LINE	norms set against it yet: 
normGen	TokenNameIdentifier	 norm Gen
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
numFields	TokenNameIdentifier	 num Fields
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preLockless	TokenNameIdentifier	 pre Lockless
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do nothing: thus leaving normGen[k]==CHECK_DIR (==0), so that later we know 	TokenNameCOMMENT_LINE	Do nothing: thus leaving normGen[k]==CHECK_DIR (==0), so that later we know 
// we have to check filesystem for norm files, because this is prelockless. 	TokenNameCOMMENT_LINE	we have to check filesystem for norm files, because this is prelockless. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This is a FORMAT_LOCKLESS segment, which means 	TokenNameCOMMENT_LINE	This is a FORMAT_LOCKLESS segment, which means 
// there are no separate norms: 	TokenNameCOMMENT_LINE	there are no separate norms: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numFields	TokenNameIdentifier	 num Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NO	TokenNameIdentifier	 NO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns total size in bytes of all of files used by this segment (if * {@code includeDocStores} is true), or the size of all files except the store * files otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns total size in bytes of all of files used by this segment (if {@code includeDocStores} is true), or the size of all files except the store files otherwise. 
public	TokenNamepublic	
long	TokenNamelong	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
includeDocStores	TokenNameIdentifier	 include Doc Stores
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
includeDocStores	TokenNameIdentifier	 include Doc Stores
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sizeInBytesWithStore	TokenNameIdentifier	 size In Bytes With Store
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sizeInBytesWithStore	TokenNameIdentifier	 size In Bytes With Store
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We don't count bytes used by a shared doc store 	TokenNameCOMMENT_LINE	We don't count bytes used by a shared doc store 
// against this segment 	TokenNameCOMMENT_LINE	against this segment 
if	TokenNameif	
(	TokenNameLPAREN	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
isDocStoreFile	TokenNameIdentifier	 is Doc Store File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sizeInBytesWithStore	TokenNameIdentifier	 size In Bytes With Store
=	TokenNameEQUAL	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sizeInBytesWithStore	TokenNameIdentifier	 size In Bytes With Store
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sizeInBytesNoStore	TokenNameIdentifier	 size In Bytes No Store
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sizeInBytesNoStore	TokenNameIdentifier	 size In Bytes No Store
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
isDocStoreFile	TokenNameIdentifier	 is Doc Store File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sizeInBytesNoStore	TokenNameIdentifier	 size In Bytes No Store
=	TokenNameEQUAL	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sizeInBytesNoStore	TokenNameIdentifier	 size In Bytes No Store
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getHasVectors	TokenNameIdentifier	 get Has Vectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
hasVectors	TokenNameIdentifier	 has Vectors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setHasVectors	TokenNameIdentifier	 set Has Vectors
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Cases: 	TokenNameCOMMENT_LINE	Cases: 
// 	TokenNameCOMMENT_LINE	 
// delGen == NO: this means this segment was written 	TokenNameCOMMENT_LINE	delGen == NO: this means this segment was written 
// by the LOCKLESS code and for certain does not have 	TokenNameCOMMENT_LINE	by the LOCKLESS code and for certain does not have 
// deletions yet 	TokenNameCOMMENT_LINE	deletions yet 
// 	TokenNameCOMMENT_LINE	 
// delGen == CHECK_DIR: this means this segment was written by 	TokenNameCOMMENT_LINE	delGen == CHECK_DIR: this means this segment was written by 
// pre-LOCKLESS code which means we must check 	TokenNameCOMMENT_LINE	pre-LOCKLESS code which means we must check 
// directory to see if .del file exists 	TokenNameCOMMENT_LINE	directory to see if .del file exists 
// 	TokenNameCOMMENT_LINE	 
// delGen >= YES: this means this segment was written by 	TokenNameCOMMENT_LINE	delGen >= YES: this means this segment was written by 
// the LOCKLESS code and for certain has 	TokenNameCOMMENT_LINE	the LOCKLESS code and for certain has 
// deletions 	TokenNameCOMMENT_LINE	deletions 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
delGen	TokenNameIdentifier	 del Gen
==	TokenNameEQUAL_EQUAL	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
delGen	TokenNameIdentifier	 del Gen
>=	TokenNameGREATER_EQUAL	
YES	TokenNameIdentifier	 YES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
getDelFileName	TokenNameIdentifier	 get Del File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
advanceDelGen	TokenNameIdentifier	 advance Del Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// delGen 0 is reserved for pre-LOCKLESS format 	TokenNameCOMMENT_LINE	delGen 0 is reserved for pre-LOCKLESS format 
if	TokenNameif	
(	TokenNameLPAREN	
delGen	TokenNameIdentifier	 del Gen
==	TokenNameEQUAL_EQUAL	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delGen	TokenNameIdentifier	 del Gen
=	TokenNameEQUAL	
YES	TokenNameIdentifier	 YES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
delGen	TokenNameIdentifier	 del Gen
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
clearDelGen	TokenNameIdentifier	 clear Del Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delGen	TokenNameIdentifier	 del Gen
=	TokenNameEQUAL	
NO	TokenNameIdentifier	 NO
;	TokenNameSEMICOLON	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentInfo	TokenNameIdentifier	 Segment Info
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfo	TokenNameIdentifier	 Segment Info
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
docCount	TokenNameIdentifier	 doc Count
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
,	TokenNameCOMMA	
hasProx	TokenNameIdentifier	 has Prox
,	TokenNameCOMMA	
hasVectors	TokenNameIdentifier	 has Vectors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
=	TokenNameEQUAL	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
=	TokenNameEQUAL	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
=	TokenNameEQUAL	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
delGen	TokenNameIdentifier	 del Gen
=	TokenNameEQUAL	
delGen	TokenNameIdentifier	 del Gen
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
preLockless	TokenNameIdentifier	 pre Lockless
=	TokenNameEQUAL	
preLockless	TokenNameIdentifier	 pre Lockless
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
isCompoundFile	TokenNameIdentifier	 is Compound File
=	TokenNameEQUAL	
isCompoundFile	TokenNameIdentifier	 is Compound File
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
diagnostics	TokenNameIdentifier	 diagnostics
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
diagnostics	TokenNameIdentifier	 diagnostics
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
normGen	TokenNameIdentifier	 norm Gen
=	TokenNameEQUAL	
normGen	TokenNameIdentifier	 norm Gen
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
return	TokenNamereturn	
si	TokenNameIdentifier	 si
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDelFileName	TokenNameIdentifier	 get Del File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delGen	TokenNameIdentifier	 del Gen
==	TokenNameEQUAL_EQUAL	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In this case we know there is no deletion filename 	TokenNameCOMMENT_LINE	In this case we know there is no deletion filename 
// against this segment 	TokenNameCOMMENT_LINE	against this segment 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// If delGen is CHECK_DIR, it's the pre-lockless-commit file format 	TokenNameCOMMENT_LINE	If delGen is CHECK_DIR, it's the pre-lockless-commit file format 
return	TokenNamereturn	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
fileNameFromGeneration	TokenNameIdentifier	 file Name From Generation
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
DELETES_EXTENSION	TokenNameIdentifier	 DELETES  EXTENSION
,	TokenNameCOMMA	
delGen	TokenNameIdentifier	 del Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if this field for this segment has saved a separate norms file (_<segment>_N.sX). * * @param fieldNumber the field index to check */	TokenNameCOMMENT_JAVADOC	 Returns true if this field for this segment has saved a separate norms file (_<segment>_N.sX). * @param fieldNumber the field index to check 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasSeparateNorms	TokenNameIdentifier	 has Separate Norms
(	TokenNameLPAREN	
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
preLockless	TokenNameIdentifier	 pre Lockless
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
fieldNumber	TokenNameIdentifier	 field Number
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CHECK_DIR	TokenNameIdentifier	 CHECK  DIR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Must fallback to directory file exists check: 	TokenNameCOMMENT_LINE	Must fallback to directory file exists check: 
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
".s"	TokenNameStringLiteral	.s
+	TokenNamePLUS	
fieldNumber	TokenNameIdentifier	 field Number
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
fieldNumber	TokenNameIdentifier	 field Number
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if any fields in this segment have separate norms. */	TokenNameCOMMENT_JAVADOC	 Returns true if any fields in this segment have separate norms. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasSeparateNorms	TokenNameIdentifier	 has Separate Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
preLockless	TokenNameIdentifier	 pre Lockless
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This means we were created w/ LOCKLESS code and no 	TokenNameCOMMENT_LINE	This means we were created w/ LOCKLESS code and no 
// norms are written yet: 	TokenNameCOMMENT_LINE	norms are written yet: 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This means this segment was saved with pre-LOCKLESS 	TokenNameCOMMENT_LINE	This means this segment was saved with pre-LOCKLESS 
// code. So we must fallback to the original 	TokenNameCOMMENT_LINE	code. So we must fallback to the original 
// directory list check: 	TokenNameCOMMENT_LINE	directory list check: 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"cannot read directory "	TokenNameStringLiteral	cannot read directory 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
": listAll() returned null"	TokenNameStringLiteral	: listAll() returned null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
".s"	TokenNameStringLiteral	.s
;	TokenNameSEMICOLON	
int	TokenNameint	
patternLength	TokenNameIdentifier	 pattern Length
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
patternLength	TokenNameIdentifier	 pattern Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This means this segment was saved with LOCKLESS 	TokenNameCOMMENT_LINE	This means this segment was saved with LOCKLESS 
// code so we first check whether any normGen's are >= 1 	TokenNameCOMMENT_LINE	code so we first check whether any normGen's are >= 1 
// (meaning they definitely have separate norms): 	TokenNameCOMMENT_LINE	(meaning they definitely have separate norms): 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
normGen	TokenNameIdentifier	 norm Gen
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
YES	TokenNameIdentifier	 YES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Next we look for any == 0. These cases were 	TokenNameCOMMENT_LINE	Next we look for any == 0. These cases were 
// pre-LOCKLESS and must be checked in directory: 	TokenNameCOMMENT_LINE	pre-LOCKLESS and must be checked in directory: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
normGen	TokenNameIdentifier	 norm Gen
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CHECK_DIR	TokenNameIdentifier	 CHECK  DIR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasSeparateNorms	TokenNameIdentifier	 has Separate Norms
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Increment the generation count for the norms file for * this field. * * @param fieldIndex field whose norm file will be rewritten */	TokenNameCOMMENT_JAVADOC	 Increment the generation count for the norms file for this field. * @param fieldIndex field whose norm file will be rewritten 
void	TokenNamevoid	
advanceNormGen	TokenNameIdentifier	 advance Norm Gen
(	TokenNameLPAREN	
int	TokenNameint	
fieldIndex	TokenNameIdentifier	 field Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
fieldIndex	TokenNameIdentifier	 field Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
fieldIndex	TokenNameIdentifier	 field Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
YES	TokenNameIdentifier	 YES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
fieldIndex	TokenNameIdentifier	 field Index
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the file name for the norms file for this field. * * @param number field index */	TokenNameCOMMENT_JAVADOC	 Get the file name for the norms file for this field. * @param number field index 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNormFileName	TokenNameIdentifier	 get Norm File Name
(	TokenNameLPAREN	
int	TokenNameint	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
gen	TokenNameIdentifier	 gen
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gen	TokenNameIdentifier	 gen
=	TokenNameEQUAL	
CHECK_DIR	TokenNameIdentifier	 CHECK  DIR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
gen	TokenNameIdentifier	 gen
=	TokenNameEQUAL	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
number	TokenNameIdentifier	 number
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasSeparateNorms	TokenNameIdentifier	 has Separate Norms
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// case 1: separate norm 	TokenNameCOMMENT_LINE	case 1: separate norm 
return	TokenNamereturn	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
fileNameFromGeneration	TokenNameIdentifier	 file Name From Generation
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
"s"	TokenNameStringLiteral	s
+	TokenNamePLUS	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// case 2: lockless (or nrm file exists) - single file for all norms 	TokenNameCOMMENT_LINE	case 2: lockless (or nrm file exists) - single file for all norms 
return	TokenNamereturn	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
fileNameFromGeneration	TokenNameIdentifier	 file Name From Generation
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
NORMS_EXTENSION	TokenNameIdentifier	 NORMS  EXTENSION
,	TokenNameCOMMA	
WITHOUT_GEN	TokenNameIdentifier	 WITHOUT  GEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// case 3: norm file for each field 	TokenNameCOMMENT_LINE	case 3: norm file for each field 
return	TokenNamereturn	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
fileNameFromGeneration	TokenNameIdentifier	 file Name From Generation
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
"f"	TokenNameStringLiteral	f
+	TokenNamePLUS	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
WITHOUT_GEN	TokenNameIdentifier	 WITHOUT  GEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Mark whether this segment is stored as a compound file. * * @param isCompoundFile true if this is a compound file; * else, false */	TokenNameCOMMENT_JAVADOC	 Mark whether this segment is stored as a compound file. * @param isCompoundFile true if this is a compound file; else, false 
void	TokenNamevoid	
setUseCompoundFile	TokenNameIdentifier	 set Use Compound File
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isCompoundFile	TokenNameIdentifier	 is Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isCompoundFile	TokenNameIdentifier	 is Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isCompoundFile	TokenNameIdentifier	 is Compound File
=	TokenNameEQUAL	
YES	TokenNameIdentifier	 YES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isCompoundFile	TokenNameIdentifier	 is Compound File
=	TokenNameEQUAL	
NO	TokenNameIdentifier	 NO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this segment is stored as a compound * file; else, false. */	TokenNameCOMMENT_JAVADOC	 Returns true if this segment is stored as a compound file; else, false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isCompoundFile	TokenNameIdentifier	 is Compound File
==	TokenNameEQUAL_EQUAL	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isCompoundFile	TokenNameIdentifier	 is Compound File
==	TokenNameEQUAL_EQUAL	
YES	TokenNameIdentifier	 YES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
COMPOUND_FILE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getDelCount	TokenNameIdentifier	 get Del Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delCount	TokenNameIdentifier	 del Count
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
delFileName	TokenNameIdentifier	 del File Name
=	TokenNameEQUAL	
getDelFileName	TokenNameIdentifier	 get Del File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
new	TokenNamenew	
BitVector	TokenNameIdentifier	 Bit Vector
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
delFileName	TokenNameIdentifier	 del File Name
)	TokenNameRPAREN	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
delCount	TokenNameIdentifier	 del Count
<=	TokenNameLESS_EQUAL	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setDelCount	TokenNameIdentifier	 set Del Count
(	TokenNameLPAREN	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
assert	TokenNameassert	
delCount	TokenNameIdentifier	 del Count
<=	TokenNameLESS_EQUAL	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getDocStoreOffset	TokenNameIdentifier	 get Doc Store Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getDocStoreIsCompoundFile	TokenNameIdentifier	 get Doc Store Is Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setDocStoreIsCompoundFile	TokenNameIdentifier	 set Doc Store Is Compound File
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocStoreSegment	TokenNameIdentifier	 get Doc Store Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDocStoreSegment	TokenNameIdentifier	 set Doc Store Segment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
=	TokenNameEQUAL	
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setDocStoreOffset	TokenNameIdentifier	 set Doc Store Offset
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setDocStore	TokenNameIdentifier	 set Doc Store
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCompoundFile	TokenNameIdentifier	 is Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
=	TokenNameEQUAL	
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
=	TokenNameEQUAL	
isCompoundFile	TokenNameIdentifier	 is Compound File
;	TokenNameSEMICOLON	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Save this segment's info. */	TokenNameCOMMENT_JAVADOC	 Save this segment's info. 
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
delCount	TokenNameIdentifier	 del Count
<=	TokenNameLESS_EQUAL	
docCount	TokenNameIdentifier	 doc Count
:	TokenNameCOLON	
"delCount="	TokenNameStringLiteral	delCount=
+	TokenNamePLUS	
delCount	TokenNameIdentifier	 del Count
+	TokenNamePLUS	
" docCount="	TokenNameStringLiteral	 docCount=
+	TokenNamePLUS	
docCount	TokenNameIdentifier	 doc Count
+	TokenNamePLUS	
" segment="	TokenNameStringLiteral	 segment=
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
// Write the Lucene version that created this segment, since 3.1 	TokenNameCOMMENT_LINE	Write the Lucene version that created this segment, since 3.1 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
delGen	TokenNameIdentifier	 del Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
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
normGen	TokenNameIdentifier	 norm Gen
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
isCompoundFile	TokenNameIdentifier	 is Compound File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
delCount	TokenNameIdentifier	 del Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
hasProx	TokenNameIdentifier	 has Prox
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeStringStringMap	TokenNameIdentifier	 write String String Map
(	TokenNameLPAREN	
diagnostics	TokenNameIdentifier	 diagnostics
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
hasVectors	TokenNameIdentifier	 has Vectors
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setHasProx	TokenNameIdentifier	 set Has Prox
(	TokenNameLPAREN	
boolean	TokenNameboolean	
hasProx	TokenNameIdentifier	 has Prox
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hasProx	TokenNameIdentifier	 has Prox
=	TokenNameEQUAL	
hasProx	TokenNameIdentifier	 has Prox
;	TokenNameSEMICOLON	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getHasProx	TokenNameIdentifier	 get Has Prox
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasProx	TokenNameIdentifier	 has Prox
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addIfExists	TokenNameIdentifier	 add If Exists
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Return all files referenced by this SegmentInfo. The * returns List is a locally cached List so you should not * modify it. */	TokenNameCOMMENT_BLOCK	 Return all files referenced by this SegmentInfo. The returns List is a locally cached List so you should not modify it. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Already cached: 	TokenNameCOMMENT_LINE	Already cached: 
return	TokenNamereturn	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
filesSet	TokenNameIdentifier	 files Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
=	TokenNameEQUAL	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
COMPOUND_FILE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
:	TokenNameCOLON	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
NON_STORE_INDEX_EXTENSIONS	TokenNameIdentifier	 NON  STORE  INDEX  EXTENSIONS
)	TokenNameRPAREN	
addIfExists	TokenNameIdentifier	 add If Exists
(	TokenNameLPAREN	
filesSet	TokenNameIdentifier	 files Set
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are sharing doc stores (stored fields, term 	TokenNameCOMMENT_LINE	We are sharing doc stores (stored fields, term 
// vectors) with other segments 	TokenNameCOMMENT_LINE	vectors) with other segments 
assert	TokenNameassert	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
COMPOUND_FILE_STORE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  STORE  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FIELDS_INDEX_EXTENSION	TokenNameIdentifier	 FIELDS  INDEX  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FIELDS_EXTENSION	TokenNameIdentifier	 FIELDS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasVectors	TokenNameIdentifier	 has Vectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_FIELDS_EXTENSION	TokenNameIdentifier	 VECTORS  FIELDS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FIELDS_INDEX_EXTENSION	TokenNameIdentifier	 FIELDS  INDEX  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FIELDS_EXTENSION	TokenNameIdentifier	 FIELDS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasVectors	TokenNameIdentifier	 has Vectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_FIELDS_EXTENSION	TokenNameIdentifier	 VECTORS  FIELDS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
delFileName	TokenNameIdentifier	 del File Name
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
fileNameFromGeneration	TokenNameIdentifier	 file Name From Generation
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
DELETES_EXTENSION	TokenNameIdentifier	 DELETES  EXTENSION
,	TokenNameCOMMA	
delGen	TokenNameIdentifier	 del Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delFileName	TokenNameIdentifier	 del File Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
delGen	TokenNameIdentifier	 del Gen
>=	TokenNameGREATER_EQUAL	
YES	TokenNameIdentifier	 YES
||	TokenNameOR_OR	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
delFileName	TokenNameIdentifier	 del File Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
delFileName	TokenNameIdentifier	 del File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Careful logic for norms files 	TokenNameCOMMENT_LINE	Careful logic for norms files 
if	TokenNameif	
(	TokenNameLPAREN	
normGen	TokenNameIdentifier	 norm Gen
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
normGen	TokenNameIdentifier	 norm Gen
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
gen	TokenNameIdentifier	 gen
=	TokenNameEQUAL	
normGen	TokenNameIdentifier	 norm Gen
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
>=	TokenNameGREATER_EQUAL	
YES	TokenNameIdentifier	 YES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely a separate norm file, with generation: 	TokenNameCOMMENT_LINE	Definitely a separate norm file, with generation: 
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
fileNameFromGeneration	TokenNameIdentifier	 file Name From Generation
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
SEPARATE_NORMS_EXTENSION	TokenNameIdentifier	 SEPARATE  NORMS  EXTENSION
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
NO	TokenNameIdentifier	 NO
==	TokenNameEQUAL_EQUAL	
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No separate norms but maybe plain norms 	TokenNameCOMMENT_LINE	No separate norms but maybe plain norms 
// in the non compound file case: 	TokenNameCOMMENT_LINE	in the non compound file case: 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
&&	TokenNameAND_AND	
!	TokenNameNOT	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
PLAIN_NORMS_EXTENSION	TokenNameIdentifier	 PLAIN  NORMS  EXTENSION
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
CHECK_DIR	TokenNameIdentifier	 CHECK  DIR
==	TokenNameEQUAL_EQUAL	
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Pre-2.1: we have to check file existence 	TokenNameCOMMENT_LINE	Pre-2.1: we have to check file existence 
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
SEPARATE_NORMS_EXTENSION	TokenNameIdentifier	 SEPARATE  NORMS  EXTENSION
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
PLAIN_NORMS_EXTENSION	TokenNameIdentifier	 PLAIN  NORMS  EXTENSION
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
preLockless	TokenNameIdentifier	 pre Lockless
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasSingleNormFile	TokenNameIdentifier	 has Single Norm File
&&	TokenNameAND_AND	
!	TokenNameNOT	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Pre-2.1: we have to scan the dir to find all 	TokenNameCOMMENT_LINE	Pre-2.1: we have to scan the dir to find all 
// matching _X.sN/_X.fN files for our segment: 	TokenNameCOMMENT_LINE	matching _X.sN/_X.fN files for our segment: 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
SEPARATE_NORMS_EXTENSION	TokenNameIdentifier	 SEPARATE  NORMS  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
PLAIN_NORMS_EXTENSION	TokenNameIdentifier	 PLAIN  NORMS  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
allFiles	TokenNameIdentifier	 all Files
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
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
allFiles	TokenNameIdentifier	 all Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
allFiles	TokenNameIdentifier	 all Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
prefixLength	TokenNameIdentifier	 prefix Length
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesSet	TokenNameIdentifier	 files Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
filesSet	TokenNameIdentifier	 files Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Called whenever any change is made that affects which * files this segment has. */	TokenNameCOMMENT_BLOCK	 Called whenever any change is made that affects which files this segment has. 
private	TokenNameprivate	
void	TokenNamevoid	
clearFiles	TokenNameIdentifier	 clear Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sizeInBytesNoStore	TokenNameIdentifier	 size In Bytes No Store
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sizeInBytesWithStore	TokenNameIdentifier	 size In Bytes With Store
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Used for debugging. Format may suddenly change. * * <p>Current format looks like * <code>_a(3.1):c45/4->_1</code>, which means the segment's * name is <code>_a</code>; it was created with Lucene 3.1 (or * '?' if it's unkown); it's using compound file * format (would be <code>C</code> if not compound); it * has 45 documents; it has 4 deletions (this part is * left off when there are no deletions); it's using the * shared doc stores named <code>_1</code> (this part is * left off if doc stores are private).</p> */	TokenNameCOMMENT_JAVADOC	 Used for debugging. Format may suddenly change. * <p>Current format looks like <code>_a(3.1):c45/4->_1</code>, which means the segment's name is <code>_a</code>; it was created with Lucene 3.1 (or '?' if it's unkown); it's using compound file format (would be <code>C</code> if not compound); it has 45 documents; it has 4 deletions (this part is left off when there are no deletions); it's using the shared doc stores named <code>_1</code> (this part is left off if doc stores are private).</p> 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
int	TokenNameint	
pendingDelCount	TokenNameIdentifier	 pending Del Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"?"	TokenNameStringLiteral	?
:	TokenNameCOLON	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
cfs	TokenNameIdentifier	 cfs
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
'c'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
!=	TokenNameNOT_EQUAL	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'x'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasVectors	TokenNameIdentifier	 has Vectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'v'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
getDelCount	TokenNameIdentifier	 get Del Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delCount	TokenNameIdentifier	 del Count
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delCount	TokenNameIdentifier	 del Count
+=	TokenNamePLUS_EQUAL	
pendingDelCount	TokenNameIdentifier	 pending Del Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delCount	TokenNameIdentifier	 del Count
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delCount	TokenNameIdentifier	 del Count
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
delCount	TokenNameIdentifier	 del Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"->"	TokenNameStringLiteral	->
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
docStoreSegment	TokenNameIdentifier	 doc Store Segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docStoreIsCompoundFile	TokenNameIdentifier	 doc Store Is Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'C'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** We consider another SegmentInfo instance equal if it * has the same dir and same name. */	TokenNameCOMMENT_JAVADOC	 We consider another SegmentInfo instance equal if it has the same dir and same name. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
SegmentInfo	TokenNameIdentifier	 Segment Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
==	TokenNameEQUAL_EQUAL	
dir	TokenNameIdentifier	 dir
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used by SegmentInfos to upgrade segments that do not record their code * version (either "2.x" or "3.0"). * <p> * <b>NOTE:</b> this method is used for internal purposes only - you should * not modify the version of a SegmentInfo, or it may result in unexpected * exceptions thrown when you attempt to open the index. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Used by SegmentInfos to upgrade segments that do not record their code version (either "2.x" or "3.0"). <p> <b>NOTE:</b> this method is used for internal purposes only - you should not modify the version of a SegmentInfo, or it may result in unexpected exceptions thrown when you attempt to open the index. * @lucene.internal 
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the version of the code which wrote the segment. */	TokenNameCOMMENT_JAVADOC	 Returns the version of the code which wrote the segment. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
getBufferedDeletesGen	TokenNameIdentifier	 get Buffered Deletes Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bufferedDeletesGen	TokenNameIdentifier	 buffered Deletes Gen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setBufferedDeletesGen	TokenNameIdentifier	 set Buffered Deletes Gen
(	TokenNameLPAREN	
long	TokenNamelong	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferedDeletesGen	TokenNameIdentifier	 buffered Deletes Gen
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
