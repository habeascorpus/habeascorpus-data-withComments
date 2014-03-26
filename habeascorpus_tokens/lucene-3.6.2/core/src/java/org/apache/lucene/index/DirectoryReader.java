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
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
Arrays	TokenNameIdentifier	 Arrays
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
HashMap	TokenNameIdentifier	 Hash Map
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
FieldSelector	TokenNameIdentifier	 Field Selector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Similarity	TokenNameIdentifier	 Similarity
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
Lock	TokenNameIdentifier	 Lock
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
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
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
IOUtils	TokenNameIdentifier	 IO Utils
;	TokenNameSEMICOLON	
/** * An IndexReader which reads indexes with multiple segments. */	TokenNameCOMMENT_JAVADOC	 An IndexReader which reads indexes with multiple segments. 
class	TokenNameclass	
DirectoryReader	TokenNameIdentifier	 Directory Reader
extends	TokenNameextends	
IndexReader	TokenNameIdentifier	 Index Reader
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
protected	TokenNameprotected	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
deletionPolicy	TokenNameIdentifier	 deletion Policy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Lock	TokenNameIdentifier	 Lock
writeLock	TokenNameIdentifier	 write Lock
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segmentInfos	TokenNameIdentifier	 segment Infos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
stale	TokenNameIdentifier	 stale
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
rollbackHasChanges	TokenNameIdentifier	 rollback Has Changes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
;	TokenNameSEMICOLON	
// 1st docno for each segment 	TokenNameCOMMENT_LINE	1st docno for each segment 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
normsCache	TokenNameIdentifier	 norms Cache
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Max version in index as of when we opened; this can be 	TokenNameCOMMENT_LINE	Max version in index as of when we opened; this can be 
// > our current segmentInfos version in case we were 	TokenNameCOMMENT_LINE	> our current segmentInfos version in case we were 
// opened on a past IndexCommit: 	TokenNameCOMMENT_LINE	opened on a past IndexCommit: 
private	TokenNameprivate	
long	TokenNamelong	
maxIndexVersion	TokenNameIdentifier	 max Index Version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
;	TokenNameSEMICOLON	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
final	TokenNamefinal	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
final	TokenNamefinal	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FindSegmentsFile	TokenNameIdentifier	 Find Segments File
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
doBody	TokenNameIdentifier	 do Body
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
segmentFileName	TokenNameIdentifier	 segment File Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
segmentFileName	TokenNameIdentifier	 segment File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
ReadOnlyDirectoryReader	TokenNameIdentifier	 Read Only Directory Reader
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
DirectoryReader	TokenNameIdentifier	 Directory Reader
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct reading the named set of readers. */	TokenNameCOMMENT_JAVADOC	 Construct reading the named set of readers. 
DirectoryReader	TokenNameIdentifier	 Directory Reader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
,	TokenNameCOMMA	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
readOnly	TokenNameIdentifier	 read Only
=	TokenNameEQUAL	
readOnly	TokenNameIdentifier	 read Only
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
segmentInfos	TokenNameIdentifier	 segment Infos
=	TokenNameEQUAL	
sis	TokenNameIdentifier	 sis
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
deletionPolicy	TokenNameIdentifier	 deletion Policy
=	TokenNameEQUAL	
deletionPolicy	TokenNameIdentifier	 deletion Policy
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
=	TokenNameEQUAL	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
;	TokenNameSEMICOLON	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// To reduce the chance of hitting FileNotFound 	TokenNameCOMMENT_LINE	To reduce the chance of hitting FileNotFound 
// (and having to retry), we open segments in 	TokenNameCOMMENT_LINE	(and having to retry), we open segments in 
// reverse because IndexWriter merges & deletes 	TokenNameCOMMENT_LINE	reverse because IndexWriter merges & deletes 
// the newest segments first. 	TokenNameCOMMENT_LINE	the newest segments first. 
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readers	TokenNameIdentifier	 readers
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
IOException	TokenNameIdentifier	 IO Exception
prior	TokenNameIdentifier	 prior
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prior	TokenNameIdentifier	 prior
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
prior	TokenNameIdentifier	 prior
,	TokenNameCOMMA	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Used by near real-time search 	TokenNameCOMMENT_LINE	Used by near real-time search 
DirectoryReader	TokenNameIdentifier	 Directory Reader
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
,	TokenNameCOMMA	
boolean	TokenNameboolean	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
readOnly	TokenNameIdentifier	 read Only
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
=	TokenNameEQUAL	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
;	TokenNameSEMICOLON	
// saved for reopen 	TokenNameCOMMENT_LINE	saved for reopen 
this	TokenNamethis	
.	TokenNameDOT	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
=	TokenNameEQUAL	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
;	TokenNameSEMICOLON	
// IndexWriter synchronizes externally before calling 	TokenNameCOMMENT_LINE	IndexWriter synchronizes externally before calling 
// us, which ensures infos will not change; so there's 	TokenNameCOMMENT_LINE	us, which ensures infos will not change; so there's 
// no need to process segments in reverse order 	TokenNameCOMMENT_LINE	no need to process segments in reverse order 
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentReader	TokenNameIdentifier	 Segment Reader
>	TokenNameGREATER	
readers	TokenNameIdentifier	 readers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentReader	TokenNameIdentifier	 Segment Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
)	TokenNameRPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
infosUpto	TokenNameIdentifier	 infos Upto
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
numSegments	TokenNameIdentifier	 num Segments
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOException	TokenNameIdentifier	 IO Exception
prior	TokenNameIdentifier	 prior
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
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
assert	TokenNameassert	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
==	TokenNameEQUAL_EQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
readerPool	TokenNameIdentifier	 reader Pool
.	TokenNameDOT	
getReadOnlyClone	TokenNameIdentifier	 get Read Only Clone
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getKeepFullyDeletedSegments	TokenNameIdentifier	 get Keep Fully Deleted Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
infosUpto	TokenNameIdentifier	 infos Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
infosUpto	TokenNameIdentifier	 infos Upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prior	TokenNameIdentifier	 prior
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
prior	TokenNameIdentifier	 prior
,	TokenNameCOMMA	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This constructor is only used for {@link #doOpenIfChanged()} */	TokenNameCOMMENT_JAVADOC	 This constructor is only used for {@link #doOpenIfChanged()} 
DirectoryReader	TokenNameIdentifier	 Directory Reader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldReaders	TokenNameIdentifier	 old Readers
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldStarts	TokenNameIdentifier	 old Starts
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
oldNormsCache	TokenNameIdentifier	 old Norms Cache
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doClone	TokenNameIdentifier	 do Clone
,	TokenNameCOMMA	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
readOnly	TokenNameIdentifier	 read Only
=	TokenNameEQUAL	
readOnly	TokenNameIdentifier	 read Only
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
segmentInfos	TokenNameIdentifier	 segment Infos
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
=	TokenNameEQUAL	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
;	TokenNameSEMICOLON	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// we put the old SegmentReaders in a map, that allows us 	TokenNameCOMMENT_LINE	we put the old SegmentReaders in a map, that allows us 
// to lookup a reader using its segment name 	TokenNameCOMMENT_LINE	to lookup a reader using its segment name 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
segmentReaders	TokenNameIdentifier	 segment Readers
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldReaders	TokenNameIdentifier	 old Readers
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create a Map SegmentName->SegmentReader 	TokenNameCOMMENT_LINE	create a Map SegmentName->SegmentReader 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
oldReaders	TokenNameIdentifier	 old Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segmentReaders	TokenNameIdentifier	 segment Readers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
oldReaders	TokenNameIdentifier	 old Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getSegmentName	TokenNameIdentifier	 get Segment Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newReaders	TokenNameIdentifier	 new Readers
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// remember which readers are shared between the old and the re-opened 	TokenNameCOMMENT_LINE	remember which readers are shared between the old and the re-opened 
// DirectoryReader - we have to incRef those readers 	TokenNameCOMMENT_LINE	DirectoryReader - we have to incRef those readers 
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readerShared	TokenNameIdentifier	 reader Shared
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// find SegmentReader for this segment 	TokenNameCOMMENT_LINE	find SegmentReader for this segment 
Integer	TokenNameIdentifier	 Integer
oldReaderIndex	TokenNameIdentifier	 old Reader Index
=	TokenNameEQUAL	
segmentReaders	TokenNameIdentifier	 segment Readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldReaderIndex	TokenNameIdentifier	 old Reader Index
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this is a new segment, no old SegmentReader can be reused 	TokenNameCOMMENT_LINE	this is a new segment, no old SegmentReader can be reused 
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// there is an old reader for this segment - we'll try to reopen it 	TokenNameCOMMENT_LINE	there is an old reader for this segment - we'll try to reopen it 
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
oldReaders	TokenNameIdentifier	 old Readers
[	TokenNameLBRACKET	
oldReaderIndex	TokenNameIdentifier	 old Reader Index
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IOException	TokenNameIdentifier	 IO Exception
prior	TokenNameIdentifier	 prior
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
SegmentReader	TokenNameIdentifier	 Segment Reader
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getSegmentInfo	TokenNameIdentifier	 get Segment Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We should never see a totally new segment during cloning 	TokenNameCOMMENT_LINE	We should never see a totally new segment during cloning 
assert	TokenNameassert	
!	TokenNameNOT	
doClone	TokenNameIdentifier	 do Clone
;	TokenNameSEMICOLON	
// this is a new reader; in case we hit an exception we can close it safely 	TokenNameCOMMENT_LINE	this is a new reader; in case we hit an exception we can close it safely 
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readerShared	TokenNameIdentifier	 reader Shared
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
reopenSegment	TokenNameIdentifier	 reopen Segment
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
doClone	TokenNameIdentifier	 do Clone
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this reader will be shared between the old and the new one, 	TokenNameCOMMENT_LINE	this reader will be shared between the old and the new one, 
// so we must incRef it 	TokenNameCOMMENT_LINE	so we must incRef it 
readerShared	TokenNameIdentifier	 reader Shared
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
readerShared	TokenNameIdentifier	 reader Shared
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Steal ref returned to us by reopenSegment: 	TokenNameCOMMENT_LINE	Steal ref returned to us by reopenSegment: 
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prior	TokenNameIdentifier	 prior
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
readerShared	TokenNameIdentifier	 reader Shared
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this is a new subReader that is not used by the old one, 	TokenNameCOMMENT_LINE	this is a new subReader that is not used by the old one, 
// we can close it 	TokenNameCOMMENT_LINE	we can close it 
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// this subReader is also used by the old reader, so instead 	TokenNameCOMMENT_LINE	this subReader is also used by the old reader, so instead 
// closing we must decRef it 	TokenNameCOMMENT_LINE	closing we must decRef it 
newReaders	TokenNameIdentifier	 new Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prior	TokenNameIdentifier	 prior
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
prior	TokenNameIdentifier	 prior
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// throw the first exception 	TokenNameCOMMENT_LINE	throw the first exception 
if	TokenNameif	
(	TokenNameLPAREN	
prior	TokenNameIdentifier	 prior
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
prior	TokenNameIdentifier	 prior
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// initialize the readers to calculate maxDoc before we try to reuse the old normsCache 	TokenNameCOMMENT_LINE	initialize the readers to calculate maxDoc before we try to reuse the old normsCache 
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
newReaders	TokenNameIdentifier	 new Readers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try to copy unchanged norms from the old normsCache to the new one 	TokenNameCOMMENT_LINE	try to copy unchanged norms from the old normsCache to the new one 
if	TokenNameif	
(	TokenNameLPAREN	
oldNormsCache	TokenNameIdentifier	 old Norms Cache
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
oldNormsCache	TokenNameIdentifier	 old Norms Cache
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldBytes	TokenNameIdentifier	 old Bytes
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
oldReaderIndex	TokenNameIdentifier	 old Reader Index
=	TokenNameEQUAL	
segmentReaders	TokenNameIdentifier	 segment Readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getSegmentName	TokenNameIdentifier	 get Segment Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this SegmentReader was not re-opened, we can copy all of its norms 	TokenNameCOMMENT_LINE	this SegmentReader was not re-opened, we can copy all of its norms 
if	TokenNameif	
(	TokenNameLPAREN	
oldReaderIndex	TokenNameIdentifier	 old Reader Index
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
oldReaders	TokenNameIdentifier	 old Readers
[	TokenNameLBRACKET	
oldReaderIndex	TokenNameIdentifier	 old Reader Index
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
||	TokenNameOR_OR	
oldReaders	TokenNameIdentifier	 old Readers
[	TokenNameLBRACKET	
oldReaderIndex	TokenNameIdentifier	 old Reader Index
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we don't have to synchronize here: either this constructor is called from a SegmentReader, 	TokenNameCOMMENT_LINE	we don't have to synchronize here: either this constructor is called from a SegmentReader, 
// in which case no old norms cache is present, or it is called from MultiReader.reopen(), 	TokenNameCOMMENT_LINE	in which case no old norms cache is present, or it is called from MultiReader.reopen(), 
// which is synchronized 	TokenNameCOMMENT_LINE	which is synchronized 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
oldBytes	TokenNameIdentifier	 old Bytes
,	TokenNameCOMMA	
oldStarts	TokenNameIdentifier	 old Starts
[	TokenNameLBRACKET	
oldReaderIndex	TokenNameIdentifier	 old Reader Index
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
normsCache	TokenNameIdentifier	 norms Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update cache 	TokenNameCOMMENT_LINE	update cache 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasChanges	TokenNameIdentifier	 has Changes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
segmentsFile	TokenNameIdentifier	 segments File
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segmentsFile	TokenNameIdentifier	 segments File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
segmentsFile	TokenNameIdentifier	 segments File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":nrt"	TokenNameStringLiteral	:nrt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FieldInfos	TokenNameIdentifier	 Field Infos
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"call getFieldInfos() on each sub reader, or use ReaderUtil.getMergedFieldInfos, instead"	TokenNameStringLiteral	call getFieldInfos() on each sub reader, or use ReaderUtil.getMergedFieldInfos, instead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subReaders	TokenNameIdentifier	 sub Readers
=	TokenNameEQUAL	
subReaders	TokenNameIdentifier	 sub Readers
;	TokenNameSEMICOLON	
starts	TokenNameIdentifier	 starts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// build starts array 	TokenNameCOMMENT_LINE	build starts array 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
maxDoc	TokenNameIdentifier	 max Doc
+=	TokenNamePLUS_EQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// compute maxDocs 	TokenNameCOMMENT_LINE	compute maxDocs 
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxIndexVersion	TokenNameIdentifier	 max Index Version
=	TokenNameEQUAL	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
readCurrentVersion	TokenNameIdentifier	 read Current Version
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Preserve current readOnly 	TokenNameCOMMENT_LINE	Preserve current readOnly 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
IndexReader	TokenNameIdentifier	 Index Reader
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// doOpenIfChanged calls ensureOpen 	TokenNameCOMMENT_LINE	doOpenIfChanged calls ensureOpen 
DirectoryReader	TokenNameIdentifier	 Directory Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
)	TokenNameRPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
!=	TokenNameNOT_EQUAL	
newReader	TokenNameIdentifier	 new Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newReader	TokenNameIdentifier	 new Reader
.	TokenNameDOT	
deletionPolicy	TokenNameIdentifier	 deletion Policy
=	TokenNameEQUAL	
deletionPolicy	TokenNameIdentifier	 deletion Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newReader	TokenNameIdentifier	 new Reader
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
// If we're cloning a non-readOnly reader, move the 	TokenNameCOMMENT_LINE	If we're cloning a non-readOnly reader, move the 
// writeLock (if there is one) to the new reader: 	TokenNameCOMMENT_LINE	writeLock (if there is one) to the new reader: 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
openReadOnly	TokenNameIdentifier	 open Read Only
&&	TokenNameAND_AND	
writeLock	TokenNameIdentifier	 write Lock
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In near real-time search, reader is always readonly 	TokenNameCOMMENT_LINE	In near real-time search, reader is always readonly 
assert	TokenNameassert	
writer	TokenNameIdentifier	 writer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
newReader	TokenNameIdentifier	 new Reader
.	TokenNameDOT	
writeLock	TokenNameIdentifier	 write Lock
=	TokenNameEQUAL	
writeLock	TokenNameIdentifier	 write Lock
;	TokenNameSEMICOLON	
newReader	TokenNameIdentifier	 new Reader
.	TokenNameDOT	
hasChanges	TokenNameIdentifier	 has Changes
=	TokenNameEQUAL	
hasChanges	TokenNameIdentifier	 has Changes
;	TokenNameSEMICOLON	
newReader	TokenNameIdentifier	 new Reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
hasDeletions	TokenNameIdentifier	 has Deletions
;	TokenNameSEMICOLON	
writeLock	TokenNameIdentifier	 write Lock
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
hasChanges	TokenNameIdentifier	 has Changes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newReader	TokenNameIdentifier	 new Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Preserve current readOnly 	TokenNameCOMMENT_LINE	Preserve current readOnly 
return	TokenNamereturn	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
openReadOnly	TokenNameIdentifier	 open Read Only
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
&&	TokenNameAND_AND	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenFromWriter	TokenNameIdentifier	 do Open From Writer
(	TokenNameLPAREN	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
,	TokenNameCOMMA	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
readOnly	TokenNameIdentifier	 read Only
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"a reader obtained from IndexWriter.getReader() can only be reopened with openReadOnly=true (got false)"	TokenNameStringLiteral	a reader obtained from IndexWriter.getReader() can only be reopened with openReadOnly=true (got false)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"a reader obtained from IndexWriter.getReader() cannot currently accept a commit"	TokenNameStringLiteral	a reader obtained from IndexWriter.getReader() cannot currently accept a commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
nrtIsCurrent	TokenNameIdentifier	 nrt Is Current
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If in fact no changes took place, return null: 	TokenNameCOMMENT_LINE	If in fact no changes took place, return null: 
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
,	TokenNameCOMMA	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
commit	TokenNameIdentifier	 commit
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
openReadOnly	TokenNameIdentifier	 open Read Only
;	TokenNameSEMICOLON	
// If we were obtained by writer.getReader(), re-ask the 	TokenNameCOMMENT_LINE	If we were obtained by writer.getReader(), re-ask the 
// writer to get a new reader. 	TokenNameCOMMENT_LINE	writer to get a new reader. 
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doOpenFromWriter	TokenNameIdentifier	 do Open From Writer
(	TokenNameLPAREN	
openReadOnly	TokenNameIdentifier	 open Read Only
,	TokenNameCOMMA	
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
doOpenNoWriter	TokenNameIdentifier	 do Open No Writer
(	TokenNameLPAREN	
openReadOnly	TokenNameIdentifier	 open Read Only
,	TokenNameCOMMA	
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenNoWriter	TokenNameIdentifier	 do Open No Writer
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
,	TokenNameCOMMA	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasChanges	TokenNameIdentifier	 has Changes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We have changes, which means we are not readOnly: 	TokenNameCOMMENT_LINE	We have changes, which means we are not readOnly: 
assert	TokenNameassert	
readOnly	TokenNameIdentifier	 read Only
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// and we hold the write lock: 	TokenNameCOMMENT_LINE	and we hold the write lock: 
assert	TokenNameassert	
writeLock	TokenNameIdentifier	 write Lock
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// so no other writer holds the write lock, which 	TokenNameCOMMENT_LINE	so no other writer holds the write lock, which 
// means no changes could have been done to the index: 	TokenNameCOMMENT_LINE	means no changes could have been done to the index: 
assert	TokenNameassert	
isCurrent	TokenNameIdentifier	 is Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isCurrent	TokenNameIdentifier	 is Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
openReadOnly	TokenNameIdentifier	 open Read Only
!=	TokenNameNOT_EQUAL	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Just fallback to clone 	TokenNameCOMMENT_LINE	Just fallback to clone 
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"the specified commit does not match the specified Directory"	TokenNameStringLiteral	the specified commit does not match the specified Directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
!=	TokenNameNOT_EQUAL	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Just fallback to clone 	TokenNameCOMMENT_LINE	Just fallback to clone 
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
FindSegmentsFile	TokenNameIdentifier	 Find Segments File
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
doBody	TokenNameIdentifier	 do Body
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
segmentFileName	TokenNameIdentifier	 segment File Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
segmentFileName	TokenNameIdentifier	 segment File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
DirectoryReader	TokenNameIdentifier	 Directory Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doClone	TokenNameIdentifier	 do Clone
,	TokenNameCOMMA	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DirectoryReader	TokenNameIdentifier	 Directory Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
ReadOnlyDirectoryReader	TokenNameIdentifier	 Read Only Directory Reader
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
,	TokenNameCOMMA	
normsCache	TokenNameIdentifier	 norms Cache
,	TokenNameCOMMA	
doClone	TokenNameIdentifier	 do Clone
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryReader	TokenNameIdentifier	 Directory Reader
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
,	TokenNameCOMMA	
normsCache	TokenNameIdentifier	 norms Cache
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
doClone	TokenNameIdentifier	 do Clone
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Version number when this IndexReader was opened. */	TokenNameCOMMENT_JAVADOC	 Version number when this IndexReader was opened. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTermFreqVectors	TokenNameIdentifier	 get Term Freq Vectors
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTermFreqVectors	TokenNameIdentifier	 get Term Freq Vectors
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to segment 	TokenNameCOMMENT_LINE	dispatch to segment 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isOptimized	TokenNameIdentifier	 is Optimized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't call ensureOpen() here (it could affect performance) 	TokenNameCOMMENT_LINE	Don't call ensureOpen() here (it could affect performance) 
// NOTE: multiple threads may wind up init'ing 	TokenNameCOMMENT_LINE	NOTE: multiple threads may wind up init'ing 
// numDocs... but that's harmless 	TokenNameCOMMENT_LINE	numDocs... but that's harmless 
if	TokenNameif	
(	TokenNameLPAREN	
numDocs	TokenNameIdentifier	 num Docs
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check cache 	TokenNameCOMMENT_LINE	check cache 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// cache miss--recompute 	TokenNameCOMMENT_LINE	cache miss--recompute 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sum from readers 	TokenNameCOMMENT_LINE	sum from readers 
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't call ensureOpen() here (it could affect performance) 	TokenNameCOMMENT_LINE	Don't call ensureOpen() here (it could affect performance) 
return	TokenNamereturn	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadoc 	TokenNameCOMMENT_LINE	inherit javadoc 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
FieldSelector	TokenNameIdentifier	 Field Selector
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to segment reader 	TokenNameCOMMENT_LINE	dispatch to segment reader 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't call ensureOpen() here (it could affect performance) 	TokenNameCOMMENT_LINE	Don't call ensureOpen() here (it could affect performance) 
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to segment reader 	TokenNameCOMMENT_LINE	dispatch to segment reader 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hasDeletions	TokenNameIdentifier	 has Deletions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
void	TokenNamevoid	
doDelete	TokenNameIdentifier	 do Delete
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// invalidate cache 	TokenNameCOMMENT_LINE	invalidate cache 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to segment reader 	TokenNameCOMMENT_LINE	dispatch to segment reader 
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
void	TokenNamevoid	
doUndeleteAll	TokenNameIdentifier	 do Undelete All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
undeleteAll	TokenNameIdentifier	 undelete All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// invalidate cache 	TokenNameCOMMENT_LINE	invalidate cache 
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find reader for doc n: 	TokenNameCOMMENT_LINE	find reader for doc n: 
return	TokenNamereturn	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
starts	TokenNameIdentifier	 starts
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
,	TokenNameCOMMA	
int	TokenNameint	
numSubReaders	TokenNameIdentifier	 num Sub Readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find reader for doc n: 	TokenNameCOMMENT_LINE	find reader for doc n: 
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// search starts array 	TokenNameCOMMENT_LINE	search starts array 
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
numSubReaders	TokenNameIdentifier	 num Sub Readers
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// for first element less 	TokenNameCOMMENT_LINE	for first element less 
while	TokenNamewhile	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
>=	TokenNameGREATER_EQUAL	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
midValue	TokenNameIdentifier	 mid Value
=	TokenNameEQUAL	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
midValue	TokenNameIdentifier	 mid Value
)	TokenNameRPAREN	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
midValue	TokenNameIdentifier	 mid Value
)	TokenNameRPAREN	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// found a match 	TokenNameCOMMENT_LINE	found a match 
while	TokenNamewhile	
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
numSubReaders	TokenNameIdentifier	 num Sub Readers
&&	TokenNameAND_AND	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
midValue	TokenNameIdentifier	 mid Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mid	TokenNameIdentifier	 mid
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// scan to last match 	TokenNameCOMMENT_LINE	scan to last match 
}	TokenNameRBRACE	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
normsCache	TokenNameIdentifier	 norms Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
// cache hit 	TokenNameCOMMENT_LINE	cache hit 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
normsCache	TokenNameIdentifier	 norms Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update cache 	TokenNameCOMMENT_LINE	update cache 
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
normsCache	TokenNameIdentifier	 norms Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
encodeNormValue	TokenNameIdentifier	 encode Norm Value
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// cache hit 	TokenNameCOMMENT_LINE	cache hit 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// read from segments 	TokenNameCOMMENT_LINE	read from segments 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
void	TokenNamevoid	
doSetNorm	TokenNameIdentifier	 do Set Norm
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
normsCache	TokenNameIdentifier	 norms Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normsCache	TokenNameIdentifier	 norms Cache
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clear cache 	TokenNameCOMMENT_LINE	clear cache 
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch 	TokenNameCOMMENT_LINE	dispatch 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimize single segment case: 	TokenNameCOMMENT_LINE	Optimize single segment case: 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiTermEnum	TokenNameIdentifier	 Multi Term Enum
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimize single segment case: 	TokenNameCOMMENT_LINE	Optimize single segment case: 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiTermEnum	TokenNameIdentifier	 Multi Term Enum
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// sum freqs in segments 	TokenNameCOMMENT_LINE	sum freqs in segments 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimize single segment case: 	TokenNameCOMMENT_LINE	Optimize single segment case: 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiTermDocs	TokenNameIdentifier	 Multi Term Docs
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimize single segment case: 	TokenNameCOMMENT_LINE	Optimize single segment case: 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermPositions	TokenNameIdentifier	 Term Positions
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimize single segment case: 	TokenNameCOMMENT_LINE	Optimize single segment case: 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiTermPositions	TokenNameIdentifier	 Multi Term Positions
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tries to acquire the WriteLock on this directory. this method is only valid if this IndexReader is directory * owner. * * @throws StaleReaderException if the index has changed since this reader was opened * @throws CorruptIndexException if the index is corrupt * @throws org.apache.lucene.store.LockObtainFailedException * if another writer has this index open (<code>write.lock</code> could not be * obtained) * @throws IOException if there is a low-level IO error * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tries to acquire the WriteLock on this directory. this method is only valid if this IndexReader is directory owner. * @throws StaleReaderException if the index has changed since this reader was opened @throws CorruptIndexException if the index is corrupt @throws org.apache.lucene.store.LockObtainFailedException if another writer has this index open (<code>write.lock</code> could not be obtained) @throws IOException if there is a low-level IO error @deprecated 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
void	TokenNamevoid	
acquireWriteLock	TokenNameIdentifier	 acquire Write Lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
StaleReaderException	TokenNameIdentifier	 Stale Reader Exception
,	TokenNameCOMMA	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: we should not reach this code w/ the core 	TokenNameCOMMENT_LINE	NOTE: we should not reach this code w/ the core 
// IndexReader classes; however, an external subclass 	TokenNameCOMMENT_LINE	IndexReader classes; however, an external subclass 
// of IndexReader could reach this. 	TokenNameCOMMENT_LINE	of IndexReader could reach this. 
ReadOnlySegmentReader	TokenNameIdentifier	 Read Only Segment Reader
.	TokenNameDOT	
noWrite	TokenNameIdentifier	 no Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stale	TokenNameIdentifier	 stale
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
StaleReaderException	TokenNameIdentifier	 Stale Reader Exception
(	TokenNameLPAREN	
"IndexReader out of date and no longer valid for delete, undelete, or setNorm operations"	TokenNameStringLiteral	IndexReader out of date and no longer valid for delete, undelete, or setNorm operations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
writeLock	TokenNameIdentifier	 write Lock
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Lock	TokenNameIdentifier	 Lock
writeLock	TokenNameIdentifier	 write Lock
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
makeLock	TokenNameIdentifier	 make Lock
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
.	TokenNameDOT	
WRITE_LOCK_NAME	TokenNameIdentifier	 WRITE  LOCK  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
writeLock	TokenNameIdentifier	 write Lock
.	TokenNameDOT	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
WRITE_LOCK_TIMEOUT	TokenNameIdentifier	 WRITE  LOCK  TIMEOUT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// obtain write lock 	TokenNameCOMMENT_LINE	obtain write lock 
throw	TokenNamethrow	
new	TokenNamenew	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
(	TokenNameLPAREN	
"Index locked for write: "	TokenNameStringLiteral	Index locked for write: 
+	TokenNamePLUS	
writeLock	TokenNameIdentifier	 write Lock
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
writeLock	TokenNameIdentifier	 write Lock
=	TokenNameEQUAL	
writeLock	TokenNameIdentifier	 write Lock
;	TokenNameSEMICOLON	
// we have to check whether index has changed since this reader was opened. 	TokenNameCOMMENT_LINE	we have to check whether index has changed since this reader was opened. 
// if so, this reader is no longer valid for 	TokenNameCOMMENT_LINE	if so, this reader is no longer valid for 
// deletion 	TokenNameCOMMENT_LINE	deletion 
if	TokenNameif	
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
readCurrentVersion	TokenNameIdentifier	 read Current Version
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxIndexVersion	TokenNameIdentifier	 max Index Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stale	TokenNameIdentifier	 stale
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
writeLock	TokenNameIdentifier	 write Lock
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
writeLock	TokenNameIdentifier	 write Lock
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
StaleReaderException	TokenNameIdentifier	 Stale Reader Exception
(	TokenNameLPAREN	
"IndexReader out of date and no longer valid for delete, undelete, or setNorm operations"	TokenNameStringLiteral	IndexReader out of date and no longer valid for delete, undelete, or setNorm operations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Commit changes resulting from delete, undeleteAll, or setNorm operations * <p/> * If an exception is hit, then either no changes or all changes will have been committed to the index (transactional * semantics). * * @throws IOException if there is a low-level IO error * @deprecated */	TokenNameCOMMENT_JAVADOC	 Commit changes resulting from delete, undeleteAll, or setNorm operations <p/> If an exception is hit, then either no changes or all changes will have been committed to the index (transactional semantics). * @throws IOException if there is a low-level IO error @deprecated 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
void	TokenNamevoid	
doCommit	TokenNameIdentifier	 do Commit
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasChanges	TokenNameIdentifier	 has Changes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
setUserData	TokenNameIdentifier	 set User Data
(	TokenNameLPAREN	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Default deleter (for backwards compatibility) is 	TokenNameCOMMENT_LINE	Default deleter (for backwards compatibility) is 
// KeepOnlyLastCommitDeleter: 	TokenNameCOMMENT_LINE	KeepOnlyLastCommitDeleter: 
IndexFileDeleter	TokenNameIdentifier	 Index File Deleter
deleter	TokenNameIdentifier	 deleter
=	TokenNameEQUAL	
new	TokenNamenew	
IndexFileDeleter	TokenNameIdentifier	 Index File Deleter
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
deletionPolicy	TokenNameIdentifier	 deletion Policy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
segmentInfos	TokenNameIdentifier	 segment Infos
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
updateGeneration	TokenNameIdentifier	 update Generation
(	TokenNameLPAREN	
deleter	TokenNameIdentifier	 deleter
.	TokenNameDOT	
getLastSegmentInfos	TokenNameIdentifier	 get Last Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
changed	TokenNameIdentifier	 changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Checkpoint the state we are about to change, in 	TokenNameCOMMENT_LINE	Checkpoint the state we are about to change, in 
// case we have to roll back: 	TokenNameCOMMENT_LINE	case we have to roll back: 
startCommit	TokenNameIdentifier	 start Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
rollbackSegments	TokenNameIdentifier	 rollback Segments
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
createBackupSegmentInfos	TokenNameIdentifier	 create Backup Segment Infos
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remove segments that contain only 100% deleted 	TokenNameCOMMENT_LINE	Remove segments that contain only 100% deleted 
// docs: 	TokenNameCOMMENT_LINE	docs: 
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
pruneDeletedSegments	TokenNameIdentifier	 prune Deleted Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Sync all files we just wrote 	TokenNameCOMMENT_LINE	Sync all files we just wrote 
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Rollback changes that were made to 	TokenNameCOMMENT_LINE	Rollback changes that were made to 
// SegmentInfos but failed to get [fully] 	TokenNameCOMMENT_LINE	SegmentInfos but failed to get [fully] 
// committed. This way this reader instance 	TokenNameCOMMENT_LINE	committed. This way this reader instance 
// remains consistent (matched to what's 	TokenNameCOMMENT_LINE	remains consistent (matched to what's 
// actually in the index): 	TokenNameCOMMENT_LINE	actually in the index): 
rollbackCommit	TokenNameIdentifier	 rollback Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Recompute deletable files & remove them (so 	TokenNameCOMMENT_LINE	Recompute deletable files & remove them (so 
// partially written .del files, etc, are 	TokenNameCOMMENT_LINE	partially written .del files, etc, are 
// removed): 	TokenNameCOMMENT_LINE	removed): 
deleter	TokenNameIdentifier	 deleter
.	TokenNameDOT	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Restore all SegmentInfos (in case we pruned some) 	TokenNameCOMMENT_LINE	Restore all SegmentInfos (in case we pruned some) 
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
rollbackSegmentInfos	TokenNameIdentifier	 rollback Segment Infos
(	TokenNameLPAREN	
rollbackSegments	TokenNameIdentifier	 rollback Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Have the deleter remove any now unreferenced 	TokenNameCOMMENT_LINE	Have the deleter remove any now unreferenced 
// files due to this commit: 	TokenNameCOMMENT_LINE	files due to this commit: 
deleter	TokenNameIdentifier	 deleter
.	TokenNameDOT	
checkpoint	TokenNameIdentifier	 checkpoint
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleter	TokenNameIdentifier	 deleter
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxIndexVersion	TokenNameIdentifier	 max Index Version
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
writeLock	TokenNameIdentifier	 write Lock
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeLock	TokenNameIdentifier	 write Lock
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// release write lock 	TokenNameCOMMENT_LINE	release write lock 
writeLock	TokenNameIdentifier	 write Lock
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
hasChanges	TokenNameIdentifier	 has Changes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
startCommit	TokenNameIdentifier	 start Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rollbackHasChanges	TokenNameIdentifier	 rollback Has Changes
=	TokenNameEQUAL	
hasChanges	TokenNameIdentifier	 has Changes
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
startCommit	TokenNameIdentifier	 start Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
rollbackCommit	TokenNameIdentifier	 rollback Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasChanges	TokenNameIdentifier	 has Changes
=	TokenNameEQUAL	
rollbackHasChanges	TokenNameIdentifier	 rollback Has Changes
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
rollbackCommit	TokenNameIdentifier	 rollback Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getCommitUserData	TokenNameIdentifier	 get Commit User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isCurrent	TokenNameIdentifier	 is Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
isClosed	TokenNameIdentifier	 is Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we loaded SegmentInfos from the directory 	TokenNameCOMMENT_LINE	we loaded SegmentInfos from the directory 
return	TokenNamereturn	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
readCurrentVersion	TokenNameIdentifier	 read Current Version
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
nrtIsCurrent	TokenNameIdentifier	 nrt Is Current
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
doClose	TokenNameIdentifier	 do Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
normsCache	TokenNameIdentifier	 norms Cache
=	TokenNameEQUAL	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try to close each reader, even if an exception is thrown 	TokenNameCOMMENT_LINE	try to close each reader, even if an exception is thrown 
try	TokenNametry	
{	TokenNameLBRACE	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ioe	TokenNameIdentifier	 ioe
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since we just closed, writer may now be able to 	TokenNameCOMMENT_LINE	Since we just closed, writer may now be able to 
// delete unused files: 	TokenNameCOMMENT_LINE	delete unused files: 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
deletePendingFiles	TokenNameIdentifier	 delete Pending Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// throw the first exception 	TokenNameCOMMENT_LINE	throw the first exception 
if	TokenNameif	
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the directory this index resides in. */	TokenNameCOMMENT_JAVADOC	 Returns the directory this index resides in. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't ensureOpen here -- in certain cases, when a 	TokenNameCOMMENT_LINE	Don't ensureOpen here -- in certain cases, when a 
// cloned/reopened reader needs to commit, it may call 	TokenNameCOMMENT_LINE	cloned/reopened reader needs to commit, it may call 
// this method on the closed original reader 	TokenNameCOMMENT_LINE	this method on the closed original reader 
return	TokenNamereturn	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getTermInfosIndexDivisor	TokenNameIdentifier	 get Term Infos Index Divisor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: return the IndexCommit that this reader has opened. * <p/> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Expert: return the IndexCommit that this reader has opened. <p/> @lucene.experimental 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IndexCommit	TokenNameIdentifier	 Index Commit
getIndexCommit	TokenNameIdentifier	 get Index Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ReaderCommit	TokenNameIdentifier	 Reader Commit
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see org.apache.lucene.index.IndexReader#listCommits */	TokenNameCOMMENT_JAVADOC	 @see org.apache.lucene.index.IndexReader#listCommits 
public	TokenNamepublic	
static	TokenNamestatic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
listCommits	TokenNameIdentifier	 list Commits
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
commits	TokenNameIdentifier	 commits
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfos	TokenNameIdentifier	 Segment Infos
latest	TokenNameIdentifier	 latest
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
latest	TokenNameIdentifier	 latest
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
currentGen	TokenNameIdentifier	 current Gen
=	TokenNameEQUAL	
latest	TokenNameIdentifier	 latest
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ReaderCommit	TokenNameIdentifier	 Reader Commit
(	TokenNameLPAREN	
latest	TokenNameIdentifier	 latest
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
SEGMENTS	TokenNameIdentifier	 SEGMENTS
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
SEGMENTS_GEN	TokenNameIdentifier	 SEGMENTS  GEN
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
generationFromSegmentsFileName	TokenNameIdentifier	 generation From Segments File Name
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
<	TokenNameLESS	
currentGen	TokenNameIdentifier	 current Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// IOException allowed to throw there, in case 	TokenNameCOMMENT_LINE	IOException allowed to throw there, in case 
// segments_N is corrupt 	TokenNameCOMMENT_LINE	segments_N is corrupt 
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
fnfe	TokenNameIdentifier	 fnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// LUCENE-948: on NFS (and maybe others), if 	TokenNameCOMMENT_LINE	LUCENE-948: on NFS (and maybe others), if 
// you have writers switching back and forth 	TokenNameCOMMENT_LINE	you have writers switching back and forth 
// between machines, it's very likely that the 	TokenNameCOMMENT_LINE	between machines, it's very likely that the 
// dir listing will be stale and will claim a 	TokenNameCOMMENT_LINE	dir listing will be stale and will claim a 
// file segments_X exists when in fact it 	TokenNameCOMMENT_LINE	file segments_X exists when in fact it 
// doesn't. So, we catch this and handle it 	TokenNameCOMMENT_LINE	doesn't. So, we catch this and handle it 
// as if the file does not exist 	TokenNameCOMMENT_LINE	as if the file does not exist 
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sis	TokenNameIdentifier	 sis
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ReaderCommit	TokenNameIdentifier	 Reader Commit
(	TokenNameLPAREN	
sis	TokenNameIdentifier	 sis
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Ensure that the commit points are sorted in ascending order. 	TokenNameCOMMENT_LINE	Ensure that the commit points are sorted in ascending order. 
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
commits	TokenNameIdentifier	 commits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ReaderCommit	TokenNameIdentifier	 Reader Commit
extends	TokenNameextends	
IndexCommit	TokenNameIdentifier	 Index Commit
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
segmentsFileName	TokenNameIdentifier	 segments File Name
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
long	TokenNamelong	
generation	TokenNameIdentifier	 generation
;	TokenNameSEMICOLON	
long	TokenNamelong	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
userData	TokenNameIdentifier	 user Data
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
segmentCount	TokenNameIdentifier	 segment Count
;	TokenNameSEMICOLON	
ReaderCommit	TokenNameIdentifier	 Reader Commit
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
segmentsFileName	TokenNameIdentifier	 segments File Name
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
userData	TokenNameIdentifier	 user Data
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableCollection	TokenNameIdentifier	 unmodifiable Collection
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
generation	TokenNameIdentifier	 generation
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentCount	TokenNameIdentifier	 segment Count
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
"DirectoryReader.ReaderCommit("	TokenNameStringLiteral	DirectoryReader.ReaderCommit(
+	TokenNamePLUS	
segmentsFileName	TokenNameIdentifier	 segments File Name
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getSegmentCount	TokenNameIdentifier	 get Segment Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segmentCount	TokenNameIdentifier	 segment Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segmentsFileName	TokenNameIdentifier	 segments File Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getFileNames	TokenNameIdentifier	 get File Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
generation	TokenNameIdentifier	 generation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userData	TokenNameIdentifier	 user Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This IndexCommit does not support deletions"	TokenNameStringLiteral	This IndexCommit does not support deletions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
MultiTermEnum	TokenNameIdentifier	 Multi Term Enum
extends	TokenNameextends	
TermEnum	TokenNameIdentifier	 Term Enum
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
topReader	TokenNameIdentifier	 top Reader
;	TokenNameSEMICOLON	
// used for matching TermEnum to TermDocs 	TokenNameCOMMENT_LINE	used for matching TermEnum to TermDocs 
private	TokenNameprivate	
SegmentMergeQueue	TokenNameIdentifier	 Segment Merge Queue
queue	TokenNameIdentifier	 queue
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matchingSegments	TokenNameIdentifier	 matching Segments
;	TokenNameSEMICOLON	
// null terminated array of matching segments 	TokenNameCOMMENT_LINE	null terminated array of matching segments 
public	TokenNamepublic	
MultiTermEnum	TokenNameIdentifier	 Multi Term Enum
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
topReader	TokenNameIdentifier	 top Reader
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readers	TokenNameIdentifier	 readers
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
topReader	TokenNameIdentifier	 top Reader
=	TokenNameEQUAL	
topReader	TokenNameIdentifier	 top Reader
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentMergeQueue	TokenNameIdentifier	 Segment Merge Queue
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchingSegments	TokenNameIdentifier	 matching Segments
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
[	TokenNameLBRACKET	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termEnum	TokenNameIdentifier	 term Enum
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
termEnum	TokenNameIdentifier	 term Enum
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
smi	TokenNameIdentifier	 smi
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
(	TokenNameLPAREN	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
termEnum	TokenNameIdentifier	 term Enum
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// initialize queue 	TokenNameCOMMENT_LINE	initialize queue 
else	TokenNameelse	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
matchingSegments	TokenNameIdentifier	 matching Segments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
smi	TokenNameIdentifier	 smi
=	TokenNameEQUAL	
matchingSegments	TokenNameIdentifier	 matching Segments
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// done with segment 	TokenNameCOMMENT_LINE	done with segment 
}	TokenNameRBRACE	
int	TokenNameint	
numMatchingSegments	TokenNameIdentifier	 num Matching Segments
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
matchingSegments	TokenNameIdentifier	 matching Segments
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchingSegments	TokenNameIdentifier	 matching Segments
[	TokenNameLBRACKET	
numMatchingSegments	TokenNameIdentifier	 num Matching Segments
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docFreq	TokenNameIdentifier	 doc Freq
+=	TokenNamePLUS_EQUAL	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// increment freq 	TokenNameCOMMENT_LINE	increment freq 
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
matchingSegments	TokenNameIdentifier	 matching Segments
[	TokenNameLBRACKET	
numMatchingSegments	TokenNameIdentifier	 num Matching Segments
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
MultiTermDocs	TokenNameIdentifier	 Multi Term Docs
implements	TokenNameimplements	
TermDocs	TokenNameIdentifier	 Term Docs
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
topReader	TokenNameIdentifier	 top Reader
;	TokenNameSEMICOLON	
// used for matching TermEnum to TermDocs 	TokenNameCOMMENT_LINE	used for matching TermEnum to TermDocs 
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readers	TokenNameIdentifier	 readers
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TermDocs	TokenNameIdentifier	 Term Docs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readerTermDocs	TokenNameIdentifier	 reader Term Docs
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
TermDocs	TokenNameIdentifier	 Term Docs
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
// == readerTermDocs[pointer] 	TokenNameCOMMENT_LINE	== readerTermDocs[pointer] 
private	TokenNameprivate	
MultiTermEnum	TokenNameIdentifier	 Multi Term Enum
tenum	TokenNameIdentifier	 tenum
;	TokenNameSEMICOLON	
// the term enum used for seeking... can be null 	TokenNameCOMMENT_LINE	the term enum used for seeking... can be null 
int	TokenNameint	
matchingSegmentPos	TokenNameIdentifier	 matching Segment Pos
;	TokenNameSEMICOLON	
// position into the matching segments from tenum 	TokenNameCOMMENT_LINE	position into the matching segments from tenum 
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
smi	TokenNameIdentifier	 smi
;	TokenNameSEMICOLON	
// current segment mere info... can be null 	TokenNameCOMMENT_LINE	current segment mere info... can be null 
public	TokenNamepublic	
MultiTermDocs	TokenNameIdentifier	 Multi Term Docs
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
topReader	TokenNameIdentifier	 top Reader
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
topReader	TokenNameIdentifier	 top Reader
=	TokenNameEQUAL	
topReader	TokenNameIdentifier	 top Reader
;	TokenNameSEMICOLON	
readers	TokenNameIdentifier	 readers
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
starts	TokenNameIdentifier	 starts
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
readerTermDocs	TokenNameIdentifier	 reader Term Docs
=	TokenNameEQUAL	
new	TokenNamenew	
TermDocs	TokenNameIdentifier	 Term Docs
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tenum	TokenNameIdentifier	 tenum
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
smi	TokenNameIdentifier	 smi
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
matchingSegmentPos	TokenNameIdentifier	 matching Segment Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
instanceof	TokenNameinstanceof	
MultiTermEnum	TokenNameIdentifier	 Multi Term Enum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tenum	TokenNameIdentifier	 tenum
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MultiTermEnum	TokenNameIdentifier	 Multi Term Enum
)	TokenNameRPAREN	
termEnum	TokenNameIdentifier	 term Enum
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
topReader	TokenNameIdentifier	 top Reader
!=	TokenNameNOT_EQUAL	
tenum	TokenNameIdentifier	 tenum
.	TokenNameDOT	
topReader	TokenNameIdentifier	 top Reader
)	TokenNameRPAREN	
tenum	TokenNameIdentifier	 tenum
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
<	TokenNameLESS	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tenum	TokenNameIdentifier	 tenum
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
smi	TokenNameIdentifier	 smi
=	TokenNameEQUAL	
tenum	TokenNameIdentifier	 tenum
.	TokenNameDOT	
matchingSegments	TokenNameIdentifier	 matching Segments
[	TokenNameLBRACKET	
matchingSegmentPos	TokenNameIdentifier	 matching Segment Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
++	TokenNamePLUS_PLUS	
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
}	TokenNameRBRACE	
/** Optimized implementation. */	TokenNameCOMMENT_JAVADOC	 Optimized implementation. 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
<	TokenNameLESS	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try next segment 	TokenNameCOMMENT_LINE	try next segment 
if	TokenNameif	
(	TokenNameLPAREN	
tenum	TokenNameIdentifier	 tenum
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
smi	TokenNameIdentifier	 smi
=	TokenNameEQUAL	
tenum	TokenNameIdentifier	 tenum
.	TokenNameDOT	
matchingSegments	TokenNameIdentifier	 matching Segments
[	TokenNameLBRACKET	
matchingSegmentPos	TokenNameIdentifier	 matching Segment Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// none left in segment 	TokenNameCOMMENT_LINE	none left in segment 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// got some 	TokenNameCOMMENT_LINE	got some 
final	TokenNamefinal	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
// adjust doc numbers 	TokenNameCOMMENT_LINE	adjust doc numbers 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
docs	TokenNameIdentifier	 docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
return	TokenNamereturn	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* A Possible future optimization could skip entire segments */	TokenNameCOMMENT_BLOCK	 A Possible future optimization could skip entire segments 
public	TokenNamepublic	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
-	TokenNameMINUS	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
<	TokenNameLESS	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tenum	TokenNameIdentifier	 tenum
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
smi	TokenNameIdentifier	 smi
=	TokenNameEQUAL	
tenum	TokenNameIdentifier	 tenum
.	TokenNameDOT	
matchingSegments	TokenNameIdentifier	 matching Segments
[	TokenNameLBRACKET	
matchingSegmentPos	TokenNameIdentifier	 matching Segment Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermDocs	TokenNameIdentifier	 Term Docs
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
readerTermDocs	TokenNameIdentifier	 reader Term Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
readerTermDocs	TokenNameIdentifier	 reader Term Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
ord	TokenNameIdentifier	 ord
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
termEnum	TokenNameIdentifier	 term Enum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
:	TokenNameCOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
readerTermDocs	TokenNameIdentifier	 reader Term Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
readerTermDocs	TokenNameIdentifier	 reader Term Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
readerTermDocs	TokenNameIdentifier	 reader Term Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
MultiTermPositions	TokenNameIdentifier	 Multi Term Positions
extends	TokenNameextends	
MultiTermDocs	TokenNameIdentifier	 Multi Term Docs
implements	TokenNameimplements	
TermPositions	TokenNameIdentifier	 Term Positions
{	TokenNameLBRACE	
public	TokenNamepublic	
MultiTermPositions	TokenNameIdentifier	 Multi Term Positions
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
topReader	TokenNameIdentifier	 top Reader
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
topReader	TokenNameIdentifier	 top Reader
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
.	TokenNameDOT	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: Remove warning after API has been finalized 	TokenNameCOMMENT_LINE	TODO: Remove warning after API has been finalized 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
.	TokenNameDOT	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
