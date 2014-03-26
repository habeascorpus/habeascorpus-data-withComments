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
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
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
SerialMergeScheduler	TokenNameIdentifier	 Serial Merge Scheduler
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
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
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestCachingSpanFilter	TokenNameIdentifier	 Test Caching Span Filter
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEnforceDeletions	TokenNameIdentifier	 test Enforce Deletions
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
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergeScheduler	TokenNameIdentifier	 set Merge Scheduler
(	TokenNameLPAREN	
new	TokenNamenew	
SerialMergeScheduler	TokenNameIdentifier	 Serial Merge Scheduler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
// asserts below requires no unexpected merges: 	TokenNameCOMMENT_LINE	asserts below requires no unexpected merges: 
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: cannot use writer.getReader because RIW (on 	TokenNameCOMMENT_LINE	NOTE: cannot use writer.getReader because RIW (on 
// flipping a coin) may give us a newly opened reader, 	TokenNameCOMMENT_LINE	flipping a coin) may give us a newly opened reader, 
// but we use .reopen on this reader below and expect to 	TokenNameCOMMENT_LINE	but we use .reopen on this reader below and expect to 
// (must) get an NRT reader: 	TokenNameCOMMENT_LINE	(must) get an NRT reader: 
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same reason we don't wrap? 	TokenNameCOMMENT_LINE	same reason we don't wrap? 
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add a doc, refresh the reader, and check that its there 	TokenNameCOMMENT_LINE	add a doc, refresh the reader, and check that its there 
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
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
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
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
refreshReader	TokenNameIdentifier	 refresh Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocs	TokenNameIdentifier	 Top Docs
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Should find a hit..."	TokenNameStringLiteral	Should find a hit...
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SpanFilter	TokenNameIdentifier	 Span Filter
startFilter	TokenNameIdentifier	 start Filter
=	TokenNameEQUAL	
new	TokenNamenew	
SpanQueryFilter	TokenNameIdentifier	 Span Query Filter
(	TokenNameLPAREN	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ignore deletions 	TokenNameCOMMENT_LINE	ignore deletions 
CachingSpanFilter	TokenNameIdentifier	 Caching Span Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
CachingSpanFilter	TokenNameIdentifier	 Caching Span Filter
(	TokenNameLPAREN	
startFilter	TokenNameIdentifier	 start Filter
,	TokenNameCOMMA	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
.	TokenNameDOT	
DeletesMode	TokenNameIdentifier	 Deletes Mode
.	TokenNameDOT	
IGNORE	TokenNameIdentifier	 IGNORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[query + filter] Should find a hit..."	TokenNameStringLiteral	[query + filter] Should find a hit...
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
constantScore	TokenNameIdentifier	 constant Score
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
constantScore	TokenNameIdentifier	 constant Score
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[just filter] Should find a hit..."	TokenNameStringLiteral	[just filter] Should find a hit...
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now delete the doc, refresh the reader, and see that 	TokenNameCOMMENT_LINE	now delete the doc, refresh the reader, and see that 
// it's not there 	TokenNameCOMMENT_LINE	it's not there 
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
keepFullyDeletedSegments	TokenNameIdentifier	 keep Fully Deleted Segments
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
w	TokenNameIdentifier	 w
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
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
refreshReader	TokenNameIdentifier	 refresh Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[query + filter] Should *not* find a hit..."	TokenNameStringLiteral	[query + filter] Should *not* find a hit...
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
constantScore	TokenNameIdentifier	 constant Score
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[just filter] Should find a hit..."	TokenNameStringLiteral	[just filter] Should find a hit...
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// force cache to regenerate: 	TokenNameCOMMENT_LINE	force cache to regenerate: 
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
CachingSpanFilter	TokenNameIdentifier	 Caching Span Filter
(	TokenNameLPAREN	
startFilter	TokenNameIdentifier	 start Filter
,	TokenNameCOMMA	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
.	TokenNameDOT	
DeletesMode	TokenNameIdentifier	 Deletes Mode
.	TokenNameDOT	
RECACHE	TokenNameIdentifier	 RECACHE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
refreshReader	TokenNameIdentifier	 refresh Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[query + filter] Should find a hit..."	TokenNameStringLiteral	[query + filter] Should find a hit...
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
constantScore	TokenNameIdentifier	 constant Score
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
constantScore	TokenNameIdentifier	 constant Score
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[just filter] Should find a hit..."	TokenNameStringLiteral	[just filter] Should find a hit...
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: important to hold ref here so GC doesn't clear 	TokenNameCOMMENT_LINE	NOTE: important to hold ref here so GC doesn't clear 
// the cache entry! Else the assert below may sometimes 	TokenNameCOMMENT_LINE	the cache entry! Else the assert below may sometimes 
// fail: 	TokenNameCOMMENT_LINE	fail: 
IndexReader	TokenNameIdentifier	 Index Reader
oldReader	TokenNameIdentifier	 old Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
// make sure we get a cache hit when we reopen readers 	TokenNameCOMMENT_LINE	make sure we get a cache hit when we reopen readers 
// that had no new deletions 	TokenNameCOMMENT_LINE	that had no new deletions 
// Deletes nothing: 	TokenNameCOMMENT_LINE	Deletes nothing: 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
deleteDocuments	TokenNameIdentifier	 delete Documents
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
refreshReader	TokenNameIdentifier	 refresh Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
oldReader	TokenNameIdentifier	 old Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
missCount	TokenNameIdentifier	 miss Count
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
missCount	TokenNameIdentifier	 miss Count
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
constantScore	TokenNameIdentifier	 constant Score
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[just filter] Should find a hit..."	TokenNameStringLiteral	[just filter] Should find a hit...
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
missCount	TokenNameIdentifier	 miss Count
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
missCount	TokenNameIdentifier	 miss Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now delete the doc, refresh the reader, and see that it's not there 	TokenNameCOMMENT_LINE	now delete the doc, refresh the reader, and see that it's not there 
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
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
refreshReader	TokenNameIdentifier	 refresh Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[query + filter] Should *not* find a hit..."	TokenNameStringLiteral	[query + filter] Should *not* find a hit...
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
constantScore	TokenNameIdentifier	 constant Score
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[just filter] Should *not* find a hit..."	TokenNameStringLiteral	[just filter] Should *not* find a hit...
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: silliness to make sure JRE does not optimize 	TokenNameCOMMENT_LINE	NOTE: silliness to make sure JRE does not optimize 
// away our holding onto oldReader to prevent 	TokenNameCOMMENT_LINE	away our holding onto oldReader to prevent 
// CachingWrapperFilter's WeakHashMap from dropping the 	TokenNameCOMMENT_LINE	CachingWrapperFilter's WeakHashMap from dropping the 
// entry: 	TokenNameCOMMENT_LINE	entry: 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
oldReader	TokenNameIdentifier	 old Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
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
private	TokenNameprivate	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
refreshReader	TokenNameIdentifier	 refresh Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
oldReader	TokenNameIdentifier	 old Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
oldReader	TokenNameIdentifier	 old Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
