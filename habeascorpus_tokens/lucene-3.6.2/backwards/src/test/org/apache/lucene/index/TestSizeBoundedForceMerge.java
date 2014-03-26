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
RAMDirectory	TokenNameIdentifier	 RAM Directory
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestSizeBoundedForceMerge	TokenNameIdentifier	 Test Size Bounded Force Merge
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
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
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMaxBufferedDocs	TokenNameIdentifier	 set Max Buffered Docs
(	TokenNameLPAREN	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setRAMBufferSizeMB	TokenNameIdentifier	 set RAM Buffer Size MB
(	TokenNameLPAREN	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
DEFAULT_RAM_BUFFER_SIZE_MB	TokenNameIdentifier	 DEFAULT  RAM  BUFFER  SIZE  MB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// prevent any merges by default. 	TokenNameCOMMENT_LINE	prevent any merges by default. 
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
.	TokenNameDOT	
COMPOUND_FILES	TokenNameIdentifier	 COMPOUND  FILES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
conf	TokenNameIdentifier	 conf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testByteSizeLimit	TokenNameIdentifier	 test Byte Size Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// tests that the max merge size constraint is applied during forceMerge. 	TokenNameCOMMENT_LINE	tests that the max merge size constraint is applied during forceMerge. 
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Prepare an index w/ several small segments and a large one. 	TokenNameCOMMENT_LINE	Prepare an index w/ several small segments and a large one. 
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numSegments	TokenNameIdentifier	 num Segments
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
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
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
7	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
30	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogByteSizeMergePolicy	TokenNameIdentifier	 Log Byte Size Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogByteSizeMergePolicy	TokenNameIdentifier	 Log Byte Size Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeMBForForcedMerge	TokenNameIdentifier	 set Max Merge MB For Forced Merge
(	TokenNameLPAREN	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Should only be 3 segments in the index, because one of them exceeds the size limit 	TokenNameCOMMENT_LINE	Should only be 3 segments in the index, because one of them exceeds the size limit 
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNumDocsLimit	TokenNameIdentifier	 test Num Docs Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// tests that the max merge docs constraint is applied during forceMerge. 	TokenNameCOMMENT_LINE	tests that the max merge docs constraint is applied during forceMerge. 
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Prepare an index w/ several small segments and a large one. 	TokenNameCOMMENT_LINE	Prepare an index w/ several small segments and a large one. 
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Should only be 3 segments in the index, because one of them exceeds the size limit 	TokenNameCOMMENT_LINE	Should only be 3 segments in the index, because one of them exceeds the size limit 
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLastSegmentTooLarge	TokenNameIdentifier	 test Last Segment Too Large
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFirstSegmentTooLarge	TokenNameIdentifier	 test First Segment Too Large
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAllSegmentsSmall	TokenNameIdentifier	 test All Segments Small
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAllSegmentsLarge	TokenNameIdentifier	 test All Segments Large
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOneLargeOneSmall	TokenNameIdentifier	 test One Large One Small
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMergeFactor	TokenNameIdentifier	 test Merge Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMergeFactor	TokenNameIdentifier	 set Merge Factor
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Should only be 4 segments in the index, because of the merge factor and 	TokenNameCOMMENT_LINE	Should only be 4 segments in the index, because of the merge factor and 
// max merge docs settings. 	TokenNameCOMMENT_LINE	max merge docs settings. 
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSingleMergeableSegment	TokenNameIdentifier	 test Single Mergeable Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// delete the last document, so that the last segment is merged. 	TokenNameCOMMENT_LINE	delete the last document, so that the last segment is merged. 
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Verify that the last segment does not have deletions. 	TokenNameCOMMENT_LINE	Verify that the last segment does not have deletions. 
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSingleNonMergeableSegment	TokenNameIdentifier	 test Single Non Mergeable Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Verify that the last segment does not have deletions. 	TokenNameCOMMENT_LINE	Verify that the last segment does not have deletions. 
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSingleMergeableTooLargeSegment	TokenNameIdentifier	 test Single Mergeable Too Large Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocs	TokenNameIdentifier	 add Docs
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// delete the last document 	TokenNameCOMMENT_LINE	delete the last document 
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newWriterConfig	TokenNameIdentifier	 new Writer Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
lmp	TokenNameIdentifier	 lmp
=	TokenNameEQUAL	
new	TokenNamenew	
LogDocMergePolicy	TokenNameIdentifier	 Log Doc Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lmp	TokenNameIdentifier	 lmp
.	TokenNameDOT	
setMaxMergeDocs	TokenNameIdentifier	 set Max Merge Docs
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
lmp	TokenNameIdentifier	 lmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Verify that the last segment does not have deletions. 	TokenNameCOMMENT_LINE	Verify that the last segment does not have deletions. 
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
