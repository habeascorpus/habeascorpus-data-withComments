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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
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
Field	TokenNameIdentifier	 Field
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
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
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
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
OpenMode	TokenNameIdentifier	 Open Mode
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestSegmentMerger	TokenNameIdentifier	 Test Segment Merger
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
//The variables for the new merged segment 	TokenNameCOMMENT_LINE	The variables for the new merged segment 
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
mergedDir	TokenNameIdentifier	 merged Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mergedSegment	TokenNameIdentifier	 merged Segment
=	TokenNameEQUAL	
"test"	TokenNameStringLiteral	test
;	TokenNameSEMICOLON	
//First segment to be merged 	TokenNameCOMMENT_LINE	First segment to be merged 
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
merge1Dir	TokenNameIdentifier	 merge1 Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Document	TokenNameIdentifier	 Document
doc1	TokenNameIdentifier	 doc1
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader1	TokenNameIdentifier	 reader1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//Second Segment to be merged 	TokenNameCOMMENT_LINE	Second Segment to be merged 
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
merge2Dir	TokenNameIdentifier	 merge2 Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Document	TokenNameIdentifier	 Document
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader2	TokenNameIdentifier	 reader2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedDir	TokenNameIdentifier	 merged Dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merge1Dir	TokenNameIdentifier	 merge1 Dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merge2Dir	TokenNameIdentifier	 merge2 Dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
setupDoc	TokenNameIdentifier	 setup Doc
(	TokenNameLPAREN	
doc1	TokenNameIdentifier	 doc1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfo	TokenNameIdentifier	 Segment Info
info1	TokenNameIdentifier	 info1
=	TokenNameEQUAL	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
writeDoc	TokenNameIdentifier	 write Doc
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
merge1Dir	TokenNameIdentifier	 merge1 Dir
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
setupDoc	TokenNameIdentifier	 setup Doc
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfo	TokenNameIdentifier	 Segment Info
info2	TokenNameIdentifier	 info2
=	TokenNameEQUAL	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
writeDoc	TokenNameIdentifier	 write Doc
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
merge2Dir	TokenNameIdentifier	 merge2 Dir
,	TokenNameCOMMA	
doc2	TokenNameIdentifier	 doc2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader1	TokenNameIdentifier	 reader1
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
info1	TokenNameIdentifier	 info1
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader2	TokenNameIdentifier	 reader2
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
info2	TokenNameIdentifier	 info2
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
reader1	TokenNameIdentifier	 reader1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader2	TokenNameIdentifier	 reader2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedDir	TokenNameIdentifier	 merged Dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merge1Dir	TokenNameIdentifier	 merge1 Dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merge2Dir	TokenNameIdentifier	 merge2 Dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mergedDir	TokenNameIdentifier	 merged Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
merge1Dir	TokenNameIdentifier	 merge1 Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
merge2Dir	TokenNameIdentifier	 merge2 Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
reader1	TokenNameIdentifier	 reader1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
reader2	TokenNameIdentifier	 reader2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMerge	TokenNameIdentifier	 test Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SegmentMerger	TokenNameIdentifier	 Segment Merger
merger	TokenNameIdentifier	 merger
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentMerger	TokenNameIdentifier	 Segment Merger
(	TokenNameLPAREN	
mergedDir	TokenNameIdentifier	 merged Dir
,	TokenNameCOMMA	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
DEFAULT_TERM_INDEX_INTERVAL	TokenNameIdentifier	 DEFAULT  TERM  INDEX  INTERVAL
,	TokenNameCOMMA	
mergedSegment	TokenNameIdentifier	 merged Segment
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
reader1	TokenNameIdentifier	 reader1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
reader2	TokenNameIdentifier	 reader2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
docsMerged	TokenNameIdentifier	 docs Merged
=	TokenNameEQUAL	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
docsMerged	TokenNameIdentifier	 docs Merged
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Should be able to open a new SegmentReader against the new directory 	TokenNameCOMMENT_LINE	Should be able to open a new SegmentReader against the new directory 
SegmentReader	TokenNameIdentifier	 Segment Reader
mergedReader	TokenNameIdentifier	 merged Reader
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
mergedDir	TokenNameIdentifier	 merged Dir
,	TokenNameCOMMA	
new	TokenNamenew	
SegmentInfo	TokenNameIdentifier	 Segment Info
(	TokenNameLPAREN	
mergedSegment	TokenNameIdentifier	 merged Segment
,	TokenNameCOMMA	
docsMerged	TokenNameIdentifier	 docs Merged
,	TokenNameCOMMA	
mergedDir	TokenNameIdentifier	 merged Dir
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasProx	TokenNameIdentifier	 has Prox
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasVectors	TokenNameIdentifier	 has Vectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mergedReader	TokenNameIdentifier	 merged Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mergedReader	TokenNameIdentifier	 merged Reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
newDoc1	TokenNameIdentifier	 new Doc1
=	TokenNameEQUAL	
mergedReader	TokenNameIdentifier	 merged Reader
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
newDoc1	TokenNameIdentifier	 new Doc1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//There are 2 unstored fields on the document 	TokenNameCOMMENT_LINE	There are 2 unstored fields on the document 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
numFields	TokenNameIdentifier	 num Fields
(	TokenNameLPAREN	
newDoc1	TokenNameIdentifier	 new Doc1
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
numFields	TokenNameIdentifier	 num Fields
(	TokenNameLPAREN	
doc1	TokenNameIdentifier	 doc1
)	TokenNameRPAREN	
-	TokenNameMINUS	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
unstored	TokenNameIdentifier	 unstored
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
newDoc2	TokenNameIdentifier	 new Doc2
=	TokenNameEQUAL	
mergedReader	TokenNameIdentifier	 merged Reader
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
newDoc2	TokenNameIdentifier	 new Doc2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
numFields	TokenNameIdentifier	 num Fields
(	TokenNameLPAREN	
newDoc2	TokenNameIdentifier	 new Doc2
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
numFields	TokenNameIdentifier	 num Fields
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
)	TokenNameRPAREN	
-	TokenNameMINUS	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
unstored	TokenNameIdentifier	 unstored
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
=	TokenNameEQUAL	
mergedReader	TokenNameIdentifier	 merged Reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
TEXT_FIELD_2_KEY	TokenNameIdentifier	 TEXT  FIELD 2  KEY
,	TokenNameCOMMA	
"field"	TokenNameStringLiteral	field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
termDocs	TokenNameIdentifier	 term Docs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tvCount	TokenNameIdentifier	 tv Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
:	TokenNameCOLON	
mergedReader	TokenNameIdentifier	 merged Reader
.	TokenNameDOT	
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tvCount	TokenNameIdentifier	 tv Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//System.out.println("stored size: " + stored.size()); 	TokenNameCOMMENT_LINE	System.out.println("stored size: " + stored.size()); 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"We do not have 3 fields that were indexed with term vector"	TokenNameStringLiteral	We do not have 3 fields that were indexed with term vector
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tvCount	TokenNameIdentifier	 tv Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
vector	TokenNameIdentifier	 vector
=	TokenNameEQUAL	
mergedReader	TokenNameIdentifier	 merged Reader
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
TEXT_FIELD_2_KEY	TokenNameIdentifier	 TEXT  FIELD 2  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
vector	TokenNameIdentifier	 vector
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Terms size: " + terms.length); 	TokenNameCOMMENT_LINE	System.out.println("Terms size: " + terms.length); 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
=	TokenNameEQUAL	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
getTermFrequencies	TokenNameIdentifier	 get Term Frequencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
freqs	TokenNameIdentifier	 freqs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Freqs size: " + freqs.length); 	TokenNameCOMMENT_LINE	System.out.println("Freqs size: " + freqs.length); 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
vector	TokenNameIdentifier	 vector
instanceof	TokenNameinstanceof	
TermPositionVector	TokenNameIdentifier	 Term Position Vector
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println("Term: " + term + " Freq: " + freq); 	TokenNameCOMMENT_LINE	System.out.println("Term: " + term + " Freq: " + freq); 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
FIELD_2_TEXT	TokenNameIdentifier	 FIELD 2  TEXT
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
FIELD_2_FREQS	TokenNameIdentifier	 FIELD 2  FREQS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TestSegmentReader	TokenNameIdentifier	 Test Segment Reader
.	TokenNameDOT	
checkNorms	TokenNameIdentifier	 check Norms
(	TokenNameLPAREN	
mergedReader	TokenNameIdentifier	 merged Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedReader	TokenNameIdentifier	 merged Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-3143 	TokenNameCOMMENT_LINE	LUCENE-3143 
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidFilesToCreateCompound	TokenNameIdentifier	 test Invalid Files To Create Compound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
iwc	TokenNameIdentifier	 iwc
=	TokenNameEQUAL	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
iwc	TokenNameIdentifier	 iwc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create an index w/ .del file 	TokenNameCOMMENT_LINE	Create an index w/ .del file 
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
deleteDocuments	TokenNameIdentifier	 delete Documents
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Assert that SM fails if .del exists 	TokenNameCOMMENT_LINE	Assert that SM fails if .del exists 
SegmentMerger	TokenNameIdentifier	 Segment Merger
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentMerger	TokenNameIdentifier	 Segment Merger
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
doFail	TokenNameIdentifier	 do Fail
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
createCompoundFile	TokenNameIdentifier	 create Compound File
(	TokenNameLPAREN	
"b1"	TokenNameStringLiteral	b1
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doFail	TokenNameIdentifier	 do Fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AssertionError	TokenNameIdentifier	 Assertion Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected 	TokenNameCOMMENT_LINE	expected 
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"should not have been able to create a .cfs with .del and .s* files"	TokenNameStringLiteral	should not have been able to create a .cfs with .del and .s* files
,	TokenNameCOMMA	
doFail	TokenNameIdentifier	 do Fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create an index w/ .s* 	TokenNameCOMMENT_LINE	Create an index w/ .s* 
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setOpenMode	TokenNameIdentifier	 set Open Mode
(	TokenNameLPAREN	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Assert that SM fails if .s* exists 	TokenNameCOMMENT_LINE	Assert that SM fails if .s* exists 
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
try	TokenNametry	
{	TokenNameLBRACE	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
createCompoundFile	TokenNameIdentifier	 create Compound File
(	TokenNameLPAREN	
"b2"	TokenNameStringLiteral	b2
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doFail	TokenNameIdentifier	 do Fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AssertionError	TokenNameIdentifier	 Assertion Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected 	TokenNameCOMMENT_LINE	expected 
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"should not have been able to create a .cfs with .del and .s* files"	TokenNameStringLiteral	should not have been able to create a .cfs with .del and .s* files
,	TokenNameCOMMA	
doFail	TokenNameIdentifier	 do Fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
