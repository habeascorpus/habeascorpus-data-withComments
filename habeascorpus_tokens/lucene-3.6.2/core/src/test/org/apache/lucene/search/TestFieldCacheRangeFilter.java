package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
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
Term	TokenNameIdentifier	 Term
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
IndexWriter	TokenNameIdentifier	 Index Writer
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
/** * A basic 'positive' Unit test class for the FieldCacheRangeFilter class. * * <p> * NOTE: at the moment, this class only tests for 'positive' results, * it does not verify the results to ensure there are no 'false positives', * nor does it adequately test 'negative' results. It also does not test * that garbage in results in an Exception. */	TokenNameCOMMENT_JAVADOC	 A basic 'positive' Unit test class for the FieldCacheRangeFilter class. * <p> NOTE: at the moment, this class only tests for 'positive' results, it does not verify the results to ensure there are no 'false positives', nor does it adequately test 'negative' results. It also does not test that garbage in results in an Exception. 
public	TokenNamepublic	
class	TokenNameclass	
TestFieldCacheRangeFilter	TokenNameIdentifier	 Test Field Cache Range Filter
extends	TokenNameextends	
BaseTestRangeFilter	TokenNameIdentifier	 Base Test Range Filter
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRangeFilterId	TokenNameIdentifier	 test Range Filter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
signedIndexReader	TokenNameIdentifier	 signed Index Reader
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
search	TokenNameIdentifier	 search
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
medId	TokenNameIdentifier	 med Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
minIP	TokenNameIdentifier	 min IP
=	TokenNameEQUAL	
pad	TokenNameIdentifier	 pad
(	TokenNameLPAREN	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
maxIP	TokenNameIdentifier	 max IP
=	TokenNameEQUAL	
pad	TokenNameIdentifier	 pad
(	TokenNameLPAREN	
maxId	TokenNameIdentifier	 max Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
medIP	TokenNameIdentifier	 med IP
=	TokenNameEQUAL	
pad	TokenNameIdentifier	 pad
(	TokenNameLPAREN	
medId	TokenNameIdentifier	 med Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"num of docs"	TokenNameStringLiteral	num of docs
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test id, bounded on both ends 	TokenNameCOMMENT_LINE	test id, bounded on both ends 
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fcrf	TokenNameIdentifier	 fcrf
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
=	TokenNameEQUAL	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
fcrf	TokenNameIdentifier	 fcrf
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but last"	TokenNameStringLiteral	all but last
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but first"	TokenNameStringLiteral	all but first
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but ends"	TokenNameStringLiteral	all but ends
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIP	TokenNameIdentifier	 med IP
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med and up"	TokenNameStringLiteral	med and up
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
medId	TokenNameIdentifier	 med Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
medIP	TokenNameIdentifier	 med IP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"up to med"	TokenNameStringLiteral	up to med
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
medId	TokenNameIdentifier	 med Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// unbounded id 	TokenNameCOMMENT_LINE	unbounded id 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min and up"	TokenNameStringLiteral	min and up
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max and down"	TokenNameStringLiteral	max and down
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not min, but up"	TokenNameStringLiteral	not min, but up
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not max, but down"	TokenNameStringLiteral	not max, but down
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIP	TokenNameIdentifier	 med IP
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med and up, not max"	TokenNameStringLiteral	med and up, not max
,	TokenNameCOMMA	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
medId	TokenNameIdentifier	 med Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
medIP	TokenNameIdentifier	 med IP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not min, up to med"	TokenNameStringLiteral	not min, up to med
,	TokenNameCOMMA	
medId	TokenNameIdentifier	 med Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// very small sets 	TokenNameCOMMENT_LINE	very small sets 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min,min,F,F"	TokenNameStringLiteral	min,min,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIP	TokenNameIdentifier	 med IP
,	TokenNameCOMMA	
medIP	TokenNameIdentifier	 med IP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med,med,F,F"	TokenNameStringLiteral	med,med,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,max,F,F"	TokenNameStringLiteral	max,max,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min,min,T,T"	TokenNameStringLiteral	min,min,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
minIP	TokenNameIdentifier	 min IP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"nul,min,F,T"	TokenNameStringLiteral	nul,min,F,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,max,T,T"	TokenNameStringLiteral	max,max,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIP	TokenNameIdentifier	 max IP
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,nul,T,T"	TokenNameStringLiteral	max,nul,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIP	TokenNameIdentifier	 med IP
,	TokenNameCOMMA	
medIP	TokenNameIdentifier	 med IP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med,med,T,T"	TokenNameStringLiteral	med,med,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFieldCacheRangeFilterRand	TokenNameIdentifier	 test Field Cache Range Filter Rand
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
signedIndexReader	TokenNameIdentifier	 signed Index Reader
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
search	TokenNameIdentifier	 search
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
minRP	TokenNameIdentifier	 min RP
=	TokenNameEQUAL	
pad	TokenNameIdentifier	 pad
(	TokenNameLPAREN	
signedIndexDir	TokenNameIdentifier	 signed Index Dir
.	TokenNameDOT	
minR	TokenNameIdentifier	 min R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
maxRP	TokenNameIdentifier	 max RP
=	TokenNameEQUAL	
pad	TokenNameIdentifier	 pad
(	TokenNameLPAREN	
signedIndexDir	TokenNameIdentifier	 signed Index Dir
.	TokenNameDOT	
maxR	TokenNameIdentifier	 max R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"num of docs"	TokenNameStringLiteral	num of docs
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test extremes, bounded on both ends 	TokenNameCOMMENT_LINE	test extremes, bounded on both ends 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but biggest"	TokenNameStringLiteral	all but biggest
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but smallest"	TokenNameStringLiteral	all but smallest
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but extremes"	TokenNameStringLiteral	all but extremes
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// unbounded 	TokenNameCOMMENT_LINE	unbounded 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"smallest and up"	TokenNameStringLiteral	smallest and up
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"biggest and down"	TokenNameStringLiteral	biggest and down
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not smallest, but up"	TokenNameStringLiteral	not smallest, but up
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not biggest, but down"	TokenNameStringLiteral	not biggest, but down
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// very small sets 	TokenNameCOMMENT_LINE	very small sets 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min,min,F,F"	TokenNameStringLiteral	min,min,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,max,F,F"	TokenNameStringLiteral	max,max,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min,min,T,T"	TokenNameStringLiteral	min,min,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
minRP	TokenNameIdentifier	 min RP
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"nul,min,F,T"	TokenNameStringLiteral	nul,min,F,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,max,T,T"	TokenNameStringLiteral	max,max,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
"rand"	TokenNameStringLiteral	rand
,	TokenNameCOMMA	
maxRP	TokenNameIdentifier	 max RP
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,nul,T,T"	TokenNameStringLiteral	max,nul,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// byte-ranges cannot be tested, because all ranges are too big for bytes, need an extra range for that 	TokenNameCOMMENT_LINE	byte-ranges cannot be tested, because all ranges are too big for bytes, need an extra range for that 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFieldCacheRangeFilterShorts	TokenNameIdentifier	 test Field Cache Range Filter Shorts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
signedIndexReader	TokenNameIdentifier	 signed Index Reader
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
search	TokenNameIdentifier	 search
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
medId	TokenNameIdentifier	 med Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Short	TokenNameIdentifier	 Short
minIdO	TokenNameIdentifier	 min Id O
=	TokenNameEQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Short	TokenNameIdentifier	 Short
maxIdO	TokenNameIdentifier	 max Id O
=	TokenNameEQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
maxId	TokenNameIdentifier	 max Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Short	TokenNameIdentifier	 Short
medIdO	TokenNameIdentifier	 med Id O
=	TokenNameEQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
medId	TokenNameIdentifier	 med Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"num of docs"	TokenNameStringLiteral	num of docs
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test id, bounded on both ends 	TokenNameCOMMENT_LINE	test id, bounded on both ends 
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Short	TokenNameIdentifier	 Short
>	TokenNameGREATER	
fcrf	TokenNameIdentifier	 fcrf
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
=	TokenNameEQUAL	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
fcrf	TokenNameIdentifier	 fcrf
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but last"	TokenNameStringLiteral	all but last
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but first"	TokenNameStringLiteral	all but first
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but ends"	TokenNameStringLiteral	all but ends
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med and up"	TokenNameStringLiteral	med and up
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
medId	TokenNameIdentifier	 med Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"up to med"	TokenNameStringLiteral	up to med
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
medId	TokenNameIdentifier	 med Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// unbounded id 	TokenNameCOMMENT_LINE	unbounded id 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min and up"	TokenNameStringLiteral	min and up
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max and down"	TokenNameStringLiteral	max and down
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not min, but up"	TokenNameStringLiteral	not min, but up
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not max, but down"	TokenNameStringLiteral	not max, but down
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med and up, not max"	TokenNameStringLiteral	med and up, not max
,	TokenNameCOMMA	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
medId	TokenNameIdentifier	 med Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not min, up to med"	TokenNameStringLiteral	not min, up to med
,	TokenNameCOMMA	
medId	TokenNameIdentifier	 med Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// very small sets 	TokenNameCOMMENT_LINE	very small sets 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min,min,F,F"	TokenNameStringLiteral	min,min,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med,med,F,F"	TokenNameStringLiteral	med,med,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,max,F,F"	TokenNameStringLiteral	max,max,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min,min,T,T"	TokenNameStringLiteral	min,min,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"nul,min,F,T"	TokenNameStringLiteral	nul,min,F,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,max,T,T"	TokenNameStringLiteral	max,max,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,nul,T,T"	TokenNameStringLiteral	max,nul,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med,med,T,T"	TokenNameStringLiteral	med,med,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// special cases 	TokenNameCOMMENT_LINE	special cases 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"overflow special case"	TokenNameStringLiteral	overflow special case
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"overflow special case"	TokenNameStringLiteral	overflow special case
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"inverse range"	TokenNameStringLiteral	inverse range
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFieldCacheRangeFilterInts	TokenNameIdentifier	 test Field Cache Range Filter Ints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
signedIndexReader	TokenNameIdentifier	 signed Index Reader
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
search	TokenNameIdentifier	 search
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
medId	TokenNameIdentifier	 med Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
minIdO	TokenNameIdentifier	 min Id O
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
maxIdO	TokenNameIdentifier	 max Id O
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
maxId	TokenNameIdentifier	 max Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
medIdO	TokenNameIdentifier	 med Id O
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
medId	TokenNameIdentifier	 med Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"num of docs"	TokenNameStringLiteral	num of docs
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test id, bounded on both ends 	TokenNameCOMMENT_LINE	test id, bounded on both ends 
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
fcrf	TokenNameIdentifier	 fcrf
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
=	TokenNameEQUAL	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
fcrf	TokenNameIdentifier	 fcrf
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but last"	TokenNameStringLiteral	all but last
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but first"	TokenNameStringLiteral	all but first
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but ends"	TokenNameStringLiteral	all but ends
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med and up"	TokenNameStringLiteral	med and up
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
medId	TokenNameIdentifier	 med Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"up to med"	TokenNameStringLiteral	up to med
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
medId	TokenNameIdentifier	 med Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// unbounded id 	TokenNameCOMMENT_LINE	unbounded id 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min and up"	TokenNameStringLiteral	min and up
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max and down"	TokenNameStringLiteral	max and down
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not min, but up"	TokenNameStringLiteral	not min, but up
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not max, but down"	TokenNameStringLiteral	not max, but down
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med and up, not max"	TokenNameStringLiteral	med and up, not max
,	TokenNameCOMMA	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
medId	TokenNameIdentifier	 med Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not min, up to med"	TokenNameStringLiteral	not min, up to med
,	TokenNameCOMMA	
medId	TokenNameIdentifier	 med Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// very small sets 	TokenNameCOMMENT_LINE	very small sets 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min,min,F,F"	TokenNameStringLiteral	min,min,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med,med,F,F"	TokenNameStringLiteral	med,med,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,max,F,F"	TokenNameStringLiteral	max,max,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min,min,T,T"	TokenNameStringLiteral	min,min,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"nul,min,F,T"	TokenNameStringLiteral	nul,min,F,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,max,T,T"	TokenNameStringLiteral	max,max,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,nul,T,T"	TokenNameStringLiteral	max,nul,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med,med,T,T"	TokenNameStringLiteral	med,med,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// special cases 	TokenNameCOMMENT_LINE	special cases 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"overflow special case"	TokenNameStringLiteral	overflow special case
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"overflow special case"	TokenNameStringLiteral	overflow special case
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"inverse range"	TokenNameStringLiteral	inverse range
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFieldCacheRangeFilterLongs	TokenNameIdentifier	 test Field Cache Range Filter Longs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
signedIndexReader	TokenNameIdentifier	 signed Index Reader
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
search	TokenNameIdentifier	 search
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
medId	TokenNameIdentifier	 med Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
minIdO	TokenNameIdentifier	 min Id O
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
maxIdO	TokenNameIdentifier	 max Id O
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
maxId	TokenNameIdentifier	 max Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
medIdO	TokenNameIdentifier	 med Id O
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
medId	TokenNameIdentifier	 med Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"num of docs"	TokenNameStringLiteral	num of docs
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test id, bounded on both ends 	TokenNameCOMMENT_LINE	test id, bounded on both ends 
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
fcrf	TokenNameIdentifier	 fcrf
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
=	TokenNameEQUAL	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
fcrf	TokenNameIdentifier	 fcrf
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but last"	TokenNameStringLiteral	all but last
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but first"	TokenNameStringLiteral	all but first
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"all but ends"	TokenNameStringLiteral	all but ends
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med and up"	TokenNameStringLiteral	med and up
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
medId	TokenNameIdentifier	 med Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"up to med"	TokenNameStringLiteral	up to med
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
medId	TokenNameIdentifier	 med Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// unbounded id 	TokenNameCOMMENT_LINE	unbounded id 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min and up"	TokenNameStringLiteral	min and up
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max and down"	TokenNameStringLiteral	max and down
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not min, but up"	TokenNameStringLiteral	not min, but up
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not max, but down"	TokenNameStringLiteral	not max, but down
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med and up, not max"	TokenNameStringLiteral	med and up, not max
,	TokenNameCOMMA	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
medId	TokenNameIdentifier	 med Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"not min, up to med"	TokenNameStringLiteral	not min, up to med
,	TokenNameCOMMA	
medId	TokenNameIdentifier	 med Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// very small sets 	TokenNameCOMMENT_LINE	very small sets 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min,min,F,F"	TokenNameStringLiteral	min,min,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med,med,F,F"	TokenNameStringLiteral	med,med,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,max,F,F"	TokenNameStringLiteral	max,max,F,F
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"min,min,T,T"	TokenNameStringLiteral	min,min,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"nul,min,F,T"	TokenNameStringLiteral	nul,min,F,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,max,T,T"	TokenNameStringLiteral	max,max,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"max,nul,T,T"	TokenNameStringLiteral	max,nul,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"med,med,T,T"	TokenNameStringLiteral	med,med,T,T
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// special cases 	TokenNameCOMMENT_LINE	special cases 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"overflow special case"	TokenNameStringLiteral	overflow special case
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"overflow special case"	TokenNameStringLiteral	overflow special case
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
maxIdO	TokenNameIdentifier	 max Id O
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"inverse range"	TokenNameStringLiteral	inverse range
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// float and double tests are a bit minimalistic, but its complicated, because missing precision 	TokenNameCOMMENT_LINE	float and double tests are a bit minimalistic, but its complicated, because missing precision 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFieldCacheRangeFilterFloats	TokenNameIdentifier	 test Field Cache Range Filter Floats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
signedIndexReader	TokenNameIdentifier	 signed Index Reader
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
search	TokenNameIdentifier	 search
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Float	TokenNameIdentifier	 Float
minIdO	TokenNameIdentifier	 min Id O
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
minId	TokenNameIdentifier	 min Id
+	TokenNamePLUS	
.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Float	TokenNameIdentifier	 Float
medIdO	TokenNameIdentifier	 med Id O
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
minIdO	TokenNameIdentifier	 min Id O
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"sum of two concenatted ranges"	TokenNameStringLiteral	sum of two concenatted ranges
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"infinity special case"	TokenNameStringLiteral	infinity special case
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"infinity special case"	TokenNameStringLiteral	infinity special case
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFieldCacheRangeFilterDoubles	TokenNameIdentifier	 test Field Cache Range Filter Doubles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
signedIndexReader	TokenNameIdentifier	 signed Index Reader
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
search	TokenNameIdentifier	 search
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
minIdO	TokenNameIdentifier	 min Id O
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
minId	TokenNameIdentifier	 min Id
+	TokenNamePLUS	
.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
medIdO	TokenNameIdentifier	 med Id O
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
minIdO	TokenNameIdentifier	 min Id O
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxId	TokenNameIdentifier	 max Id
-	TokenNameMINUS	
minId	TokenNameIdentifier	 min Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
minIdO	TokenNameIdentifier	 min Id O
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
medIdO	TokenNameIdentifier	 med Id O
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"sum of two concenatted ranges"	TokenNameStringLiteral	sum of two concenatted ranges
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"infinity special case"	TokenNameStringLiteral	infinity special case
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"infinity special case"	TokenNameStringLiteral	infinity special case
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSparseIndex	TokenNameIdentifier	 test Sparse Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
-	TokenNameMINUS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
<=	TokenNameLESS_EQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
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
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
search	TokenNameIdentifier	 search
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
>	TokenNameGREATER	
fcrf	TokenNameIdentifier	 fcrf
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
=	TokenNameEQUAL	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newByteRange	TokenNameIdentifier	 new Byte Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"DocIdSet must be not cacheable"	TokenNameStringLiteral	DocIdSet must be not cacheable
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
=	TokenNameEQUAL	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newByteRange	TokenNameIdentifier	 new Byte Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"DocIdSet must be not cacheable"	TokenNameStringLiteral	DocIdSet must be not cacheable
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
=	TokenNameEQUAL	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newByteRange	TokenNameIdentifier	 new Byte Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"DocIdSet must be not cacheable"	TokenNameStringLiteral	DocIdSet must be not cacheable
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
=	TokenNameEQUAL	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newByteRange	TokenNameIdentifier	 new Byte Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"DocIdSet must be not cacheable"	TokenNameStringLiteral	DocIdSet must be not cacheable
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
=	TokenNameEQUAL	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
.	TokenNameDOT	
newByteRange	TokenNameIdentifier	 new Byte Range
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"DocIdSet must be not cacheable"	TokenNameStringLiteral	DocIdSet must be not cacheable
,	TokenNameCOMMA	
fcrf	TokenNameIdentifier	 fcrf
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"find all"	TokenNameStringLiteral	find all
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
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
}	TokenNameRBRACE	
