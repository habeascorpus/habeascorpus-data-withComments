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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
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
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
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
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
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
ArrayUtil	TokenNameIdentifier	 Array Util
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestPerSegmentDeletes	TokenNameIdentifier	 Test Per Segment Deletes
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDeletes1	TokenNameIdentifier	 test Deletes1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
//IndexWriter.debug2 = System.out; 	TokenNameCOMMENT_LINE	IndexWriter.debug2 = System.out; 
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
iwc	TokenNameIdentifier	 iwc
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iwc	TokenNameIdentifier	 iwc
.	TokenNameDOT	
setMergeScheduler	TokenNameIdentifier	 set Merge Scheduler
(	TokenNameLPAREN	
new	TokenNamenew	
SerialMergeScheduler	TokenNameIdentifier	 Serial Merge Scheduler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iwc	TokenNameIdentifier	 iwc
.	TokenNameDOT	
setMaxBufferedDocs	TokenNameIdentifier	 set Max Buffered Docs
(	TokenNameLPAREN	
5000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iwc	TokenNameIdentifier	 iwc
.	TokenNameDOT	
setRAMBufferSizeMB	TokenNameIdentifier	 set RAM Buffer Size MB
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RangeMergePolicy	TokenNameIdentifier	 Range Merge Policy
fsmp	TokenNameIdentifier	 fsmp
=	TokenNameEQUAL	
new	TokenNamenew	
RangeMergePolicy	TokenNameIdentifier	 Range Merge Policy
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iwc	TokenNameIdentifier	 iwc
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
fsmp	TokenNameIdentifier	 fsmp
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
iwc	TokenNameIdentifier	 iwc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
?	TokenNameQUESTION	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); 	TokenNameCOMMENT_LINE	System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); 
}	TokenNameRBRACE	
//System.out.println("commit1"); 	TokenNameCOMMENT_LINE	System.out.println("commit1"); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); 	TokenNameCOMMENT_LINE	System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); 
}	TokenNameRBRACE	
//System.out.println("commit2"); 	TokenNameCOMMENT_LINE	System.out.println("commit2"); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); 	TokenNameCOMMENT_LINE	System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); 
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
deleteDocuments	TokenNameIdentifier	 delete Documents
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
deleteDocuments	TokenNameIdentifier	 delete Documents
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"11"	TokenNameStringLiteral	11
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// flushing without applying deletes means 	TokenNameCOMMENT_LINE	flushing without applying deletes means 
// there will still be deletes in the segment infos 	TokenNameCOMMENT_LINE	there will still be deletes in the segment infos 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
bufferedDeletesStream	TokenNameIdentifier	 buffered Deletes Stream
.	TokenNameDOT	
any	TokenNameIdentifier	 any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get reader flushes pending deletes 	TokenNameCOMMENT_LINE	get reader flushes pending deletes 
// so there should not be anymore 	TokenNameCOMMENT_LINE	so there should not be anymore 
IndexReader	TokenNameIdentifier	 Index Reader
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
bufferedDeletesStream	TokenNameIdentifier	 buffered Deletes Stream
.	TokenNameDOT	
any	TokenNameIdentifier	 any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// delete id:2 from the first segment 	TokenNameCOMMENT_LINE	delete id:2 from the first segment 
// merge segments 0 and 1 	TokenNameCOMMENT_LINE	merge segments 0 and 1 
// which should apply the delete id:2 	TokenNameCOMMENT_LINE	which should apply the delete id:2 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
deleteDocuments	TokenNameIdentifier	 delete Documents
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fsmp	TokenNameIdentifier	 fsmp
.	TokenNameDOT	
doMerge	TokenNameIdentifier	 do Merge
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fsmp	TokenNameIdentifier	 fsmp
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fsmp	TokenNameIdentifier	 fsmp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
maybeMerge	TokenNameIdentifier	 maybe Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// id:2 shouldn't exist anymore because 	TokenNameCOMMENT_LINE	id:2 shouldn't exist anymore because 
// it's been applied in the merge and now it's gone 	TokenNameCOMMENT_LINE	it's been applied in the merge and now it's gone 
IndexReader	TokenNameIdentifier	 Index Reader
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
id2docs	TokenNameIdentifier	 id2docs
=	TokenNameEQUAL	
toDocsArray	TokenNameIdentifier	 to Docs Array
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
id2docs	TokenNameIdentifier	 id2docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** // added docs are in the ram buffer for (int x = 15; x < 20; x++) { writer.addDocument(TestIndexWriterReader.createDocument(x, "4", 2)); System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); } assertTrue(writer.numRamDocs() > 0); // delete from the ram buffer writer.deleteDocuments(new Term("id", Integer.toString(13))); Term id3 = new Term("id", Integer.toString(3)); // delete from the 1st segment writer.deleteDocuments(id3); assertTrue(writer.numRamDocs() > 0); //System.out // .println("segdels1:" + writer.docWriter.deletesToString()); //assertTrue(writer.docWriter.segmentDeletes.size() > 0); // we cause a merge to happen fsmp.doMerge = true; fsmp.start = 0; fsmp.length = 2; System.out.println("maybeMerge "+writer.segmentInfos); SegmentInfo info0 = writer.segmentInfos.info(0); SegmentInfo info1 = writer.segmentInfos.info(1); writer.maybeMerge(); System.out.println("maybeMerge after "+writer.segmentInfos); // there should be docs in RAM assertTrue(writer.numRamDocs() > 0); // assert we've merged the 1 and 2 segments // and still have a segment leftover == 2 assertEquals(2, writer.segmentInfos.size()); assertFalse(segThere(info0, writer.segmentInfos)); assertFalse(segThere(info1, writer.segmentInfos)); //System.out.println("segdels2:" + writer.docWriter.deletesToString()); //assertTrue(writer.docWriter.segmentDeletes.size() > 0); IndexReader r = writer.getReader(); IndexReader r1 = r.getSequentialSubReaders()[0]; printDelDocs(r1.getDeletedDocs()); int[] docs = toDocsArray(id3, null, r); System.out.println("id3 docs:"+Arrays.toString(docs)); // there shouldn't be any docs for id:3 assertTrue(docs == null); r.close(); part2(writer, fsmp); **/	TokenNameCOMMENT_JAVADOC	 // added docs are in the ram buffer for (int x = 15; x < 20; x++) { writer.addDocument(TestIndexWriterReader.createDocument(x, "4", 2)); System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); } assertTrue(writer.numRamDocs() > 0); // delete from the ram buffer writer.deleteDocuments(new Term("id", Integer.toString(13))); Term id3 = new Term("id", Integer.toString(3)); // delete from the 1st segment writer.deleteDocuments(id3); assertTrue(writer.numRamDocs() > 0); //System.out // .println("segdels1:" + writer.docWriter.deletesToString()); //assertTrue(writer.docWriter.segmentDeletes.size() > 0); // we cause a merge to happen fsmp.doMerge = true; fsmp.start = 0; fsmp.length = 2; System.out.println("maybeMerge "+writer.segmentInfos); SegmentInfo info0 = writer.segmentInfos.info(0); SegmentInfo info1 = writer.segmentInfos.info(1); writer.maybeMerge(); System.out.println("maybeMerge after "+writer.segmentInfos); // there should be docs in RAM assertTrue(writer.numRamDocs() > 0); // assert we've merged the 1 and 2 segments // and still have a segment leftover == 2 assertEquals(2, writer.segmentInfos.size()); assertFalse(segThere(info0, writer.segmentInfos)); assertFalse(segThere(info1, writer.segmentInfos)); //System.out.println("segdels2:" + writer.docWriter.deletesToString()); //assertTrue(writer.docWriter.segmentDeletes.size() > 0); IndexReader r = writer.getReader(); IndexReader r1 = r.getSequentialSubReaders()[0]; printDelDocs(r1.getDeletedDocs()); int[] docs = toDocsArray(id3, null, r); System.out.println("id3 docs:"+Arrays.toString(docs)); // there shouldn't be any docs for id:3 assertTrue(docs == null); r.close(); part2(writer, fsmp); *
// System.out.println("segdels2:"+writer.docWriter.segmentDeletes.toString()); 	TokenNameCOMMENT_LINE	System.out.println("segdels2:"+writer.docWriter.segmentDeletes.toString()); 
//System.out.println("close"); 	TokenNameCOMMENT_LINE	System.out.println("close"); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** static boolean hasPendingDeletes(SegmentInfos infos) { for (SegmentInfo info : infos) { if (info.deletes.any()) { return true; } } return false; } **/	TokenNameCOMMENT_JAVADOC	 static boolean hasPendingDeletes(SegmentInfos infos) { for (SegmentInfo info : infos) { if (info.deletes.any()) { return true; } } return false; } *
void	TokenNamevoid	
part2	TokenNameIdentifier	 part2
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
RangeMergePolicy	TokenNameIdentifier	 Range Merge Policy
fsmp	TokenNameIdentifier	 fsmp
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); 	TokenNameCOMMENT_LINE	System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); 
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); 	TokenNameCOMMENT_LINE	System.out.println("numRamDocs(" + x + ")" + writer.numRamDocs()); 
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("infos3:"+writer.segmentInfos); 	TokenNameCOMMENT_LINE	System.out.println("infos3:"+writer.segmentInfos); 
Term	TokenNameIdentifier	 Term
delterm	TokenNameIdentifier	 delterm
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"8"	TokenNameStringLiteral	8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
deleteDocuments	TokenNameIdentifier	 delete Documents
(	TokenNameLPAREN	
delterm	TokenNameIdentifier	 delterm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("segdels3:" + writer.docWriter.deletesToString()); 	TokenNameCOMMENT_LINE	System.out.println("segdels3:" + writer.docWriter.deletesToString()); 
fsmp	TokenNameIdentifier	 fsmp
.	TokenNameDOT	
doMerge	TokenNameIdentifier	 do Merge
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fsmp	TokenNameIdentifier	 fsmp
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fsmp	TokenNameIdentifier	 fsmp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
maybeMerge	TokenNameIdentifier	 maybe Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// deletes for info1, the newly created segment from the 	TokenNameCOMMENT_LINE	deletes for info1, the newly created segment from the 
// merge should have no deletes because they were applied in 	TokenNameCOMMENT_LINE	merge should have no deletes because they were applied in 
// the merge 	TokenNameCOMMENT_LINE	the merge 
//SegmentInfo info1 = writer.segmentInfos.info(1); 	TokenNameCOMMENT_LINE	SegmentInfo info1 = writer.segmentInfos.info(1); 
//assertFalse(exists(info1, writer.docWriter.segmentDeletes)); 	TokenNameCOMMENT_LINE	assertFalse(exists(info1, writer.docWriter.segmentDeletes)); 
//System.out.println("infos4:"+writer.segmentInfos); 	TokenNameCOMMENT_LINE	System.out.println("infos4:"+writer.segmentInfos); 
//System.out.println("segdels4:" + writer.docWriter.deletesToString()); 	TokenNameCOMMENT_LINE	System.out.println("segdels4:" + writer.docWriter.deletesToString()); 
}	TokenNameRBRACE	
boolean	TokenNameboolean	
segThere	TokenNameIdentifier	 seg There
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
si	TokenNameIdentifier	 si
:	TokenNameCOLON	
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
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
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toDocsArray	TokenNameIdentifier	 to Docs Array
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
termDocs	TokenNameIdentifier	 term Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
class	TokenNameclass	
RangeMergePolicy	TokenNameIdentifier	 Range Merge Policy
extends	TokenNameextends	
MergePolicy	TokenNameIdentifier	 Merge Policy
{	TokenNameLBRACE	
boolean	TokenNameboolean	
doMerge	TokenNameIdentifier	 do Merge
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RangeMergePolicy	TokenNameIdentifier	 Range Merge Policy
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
MergeSpecification	TokenNameIdentifier	 Merge Specification
ms	TokenNameIdentifier	 ms
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSpecification	TokenNameIdentifier	 Merge Specification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doMerge	TokenNameIdentifier	 do Merge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OneMerge	TokenNameIdentifier	 One Merge
om	TokenNameIdentifier	 om
=	TokenNameEQUAL	
new	TokenNamenew	
OneMerge	TokenNameIdentifier	 One Merge
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ms	TokenNameIdentifier	 ms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
om	TokenNameIdentifier	 om
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doMerge	TokenNameIdentifier	 do Merge
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ms	TokenNameIdentifier	 ms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
