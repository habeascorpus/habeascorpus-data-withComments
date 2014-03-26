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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
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
IndexWriter	TokenNameIdentifier	 Index Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
QueryParser	TokenNameIdentifier	 Query Parser
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Tests {@link MultiSearcher} ranking, i.e. makes sure this bug is fixed: * http://issues.apache.org/bugzilla/show_bug.cgi?id=31841 * */	TokenNameCOMMENT_JAVADOC	 Tests {@link MultiSearcher} ranking, i.e. makes sure this bug is fixed: http://issues.apache.org/bugzilla/show_bug.cgi?id=31841 
public	TokenNamepublic	
class	TokenNameclass	
TestMultiSearcherRanking	TokenNameIdentifier	 Test Multi Searcher Ranking
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FIELD_NAME	TokenNameIdentifier	 FIELD  NAME
=	TokenNameEQUAL	
"body"	TokenNameStringLiteral	body
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Searcher	TokenNameIdentifier	 Searcher
multiSearcher	TokenNameIdentifier	 multi Searcher
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Searcher	TokenNameIdentifier	 Searcher
singleSearcher	TokenNameIdentifier	 single Searcher
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testOneTermQuery	TokenNameIdentifier	 test One Term Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
checkQuery	TokenNameIdentifier	 check Query
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTwoTermQuery	TokenNameIdentifier	 test Two Term Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
checkQuery	TokenNameIdentifier	 check Query
(	TokenNameLPAREN	
"three foo"	TokenNameStringLiteral	three foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPrefixQuery	TokenNameIdentifier	 test Prefix Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
checkQuery	TokenNameIdentifier	 check Query
(	TokenNameLPAREN	
"multi*"	TokenNameStringLiteral	multi*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFuzzyQuery	TokenNameIdentifier	 test Fuzzy Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
checkQuery	TokenNameIdentifier	 check Query
(	TokenNameLPAREN	
"multiThree~"	TokenNameStringLiteral	multiThree~
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRangeQuery	TokenNameIdentifier	 test Range Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
checkQuery	TokenNameIdentifier	 check Query
(	TokenNameLPAREN	
"{multiA TO multiP}"	TokenNameStringLiteral	{multiA TO multiP}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultiPhraseQuery	TokenNameIdentifier	 test Multi Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
checkQuery	TokenNameIdentifier	 check Query
(	TokenNameLPAREN	
""blueberry pi*""	TokenNameStringLiteral	"blueberry pi*"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoMatchQuery	TokenNameIdentifier	 test No Match Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
checkQuery	TokenNameIdentifier	 check Query
(	TokenNameLPAREN	
"+three +nomatch"	TokenNameStringLiteral	+three +nomatch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public void testTermRepeatedQuery() throws IOException, ParseException { // TODO: this corner case yields different results. checkQuery("multi* multi* foo"); } */	TokenNameCOMMENT_BLOCK	 public void testTermRepeatedQuery() throws IOException, ParseException { // TODO: this corner case yields different results. checkQuery("multi* multi* foo"); } 
/** * checks if a query yields the same result when executed on * a single IndexSearcher containing all documents and on a * MultiSearcher aggregating sub-searchers * @param queryStr the query to check. * @throws IOException * @throws ParseException */	TokenNameCOMMENT_JAVADOC	 checks if a query yields the same result when executed on a single IndexSearcher containing all documents and on a MultiSearcher aggregating sub-searchers @param queryStr the query to check. @throws IOException @throws ParseException 
private	TokenNameprivate	
void	TokenNamevoid	
checkQuery	TokenNameIdentifier	 check Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
queryStr	TokenNameIdentifier	 query Str
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// check result hit ranking 	TokenNameCOMMENT_LINE	check result hit ranking 
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Query: "	TokenNameStringLiteral	Query: 
+	TokenNamePLUS	
queryStr	TokenNameIdentifier	 query Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryParser	TokenNameIdentifier	 Query Parser
queryParser	TokenNameIdentifier	 query Parser
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParser	TokenNameIdentifier	 Query Parser
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
FIELD_NAME	TokenNameIdentifier	 FIELD  NAME
,	TokenNameCOMMA	
new	TokenNamenew	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
queryStr	TokenNameIdentifier	 query Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
multiSearcherHits	TokenNameIdentifier	 multi Searcher Hits
=	TokenNameEQUAL	
multiSearcher	TokenNameIdentifier	 multi Searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
singleSearcherHits	TokenNameIdentifier	 single Searcher Hits
=	TokenNameEQUAL	
singleSearcher	TokenNameIdentifier	 single Searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
multiSearcherHits	TokenNameIdentifier	 multi Searcher Hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
singleSearcherHits	TokenNameIdentifier	 single Searcher Hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
multiSearcherHits	TokenNameIdentifier	 multi Searcher Hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
docMulti	TokenNameIdentifier	 doc Multi
=	TokenNameEQUAL	
multiSearcher	TokenNameIdentifier	 multi Searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
multiSearcherHits	TokenNameIdentifier	 multi Searcher Hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
docSingle	TokenNameIdentifier	 doc Single
=	TokenNameEQUAL	
singleSearcher	TokenNameIdentifier	 single Searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
singleSearcherHits	TokenNameIdentifier	 single Searcher Hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Multi: "	TokenNameStringLiteral	Multi: 
+	TokenNamePLUS	
docMulti	TokenNameIdentifier	 doc Multi
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
FIELD_NAME	TokenNameIdentifier	 FIELD  NAME
)	TokenNameRPAREN	
+	TokenNamePLUS	
" score="	TokenNameStringLiteral	 score=
+	TokenNamePLUS	
multiSearcherHits	TokenNameIdentifier	 multi Searcher Hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Single: "	TokenNameStringLiteral	Single: 
+	TokenNamePLUS	
docSingle	TokenNameIdentifier	 doc Single
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
FIELD_NAME	TokenNameIdentifier	 FIELD  NAME
)	TokenNameRPAREN	
+	TokenNamePLUS	
" score="	TokenNameStringLiteral	 score=
+	TokenNamePLUS	
singleSearcherHits	TokenNameIdentifier	 single Searcher Hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
multiSearcherHits	TokenNameIdentifier	 multi Searcher Hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
singleSearcherHits	TokenNameIdentifier	 single Searcher Hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
0.001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
docMulti	TokenNameIdentifier	 doc Multi
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
FIELD_NAME	TokenNameIdentifier	 FIELD  NAME
)	TokenNameRPAREN	
,	TokenNameCOMMA	
docSingle	TokenNameIdentifier	 doc Single
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
FIELD_NAME	TokenNameIdentifier	 FIELD  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * initializes multiSearcher and singleSearcher with the same document set */	TokenNameCOMMENT_JAVADOC	 initializes multiSearcher and singleSearcher with the same document set 
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
// create MultiSearcher from two seperate searchers 	TokenNameCOMMENT_LINE	create MultiSearcher from two seperate searchers 
d1	TokenNameIdentifier	 d1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
iw1	TokenNameIdentifier	 iw1
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCollection1	TokenNameIdentifier	 add Collection1
(	TokenNameLPAREN	
iw1	TokenNameIdentifier	 iw1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iw1	TokenNameIdentifier	 iw1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d2	TokenNameIdentifier	 d2
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
iw2	TokenNameIdentifier	 iw2
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
d2	TokenNameIdentifier	 d2
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCollection2	TokenNameIdentifier	 add Collection2
(	TokenNameLPAREN	
iw2	TokenNameIdentifier	 iw2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iw2	TokenNameIdentifier	 iw2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Searchable	TokenNameIdentifier	 Searchable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
Searchable	TokenNameIdentifier	 Searchable
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
d2	TokenNameIdentifier	 d2
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
multiSearcher	TokenNameIdentifier	 multi Searcher
=	TokenNameEQUAL	
new	TokenNamenew	
MultiSearcher	TokenNameIdentifier	 Multi Searcher
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create IndexSearcher which contains all documents 	TokenNameCOMMENT_LINE	create IndexSearcher which contains all documents 
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
iw	TokenNameIdentifier	 iw
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCollection1	TokenNameIdentifier	 add Collection1
(	TokenNameLPAREN	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCollection2	TokenNameIdentifier	 add Collection2
(	TokenNameLPAREN	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
singleSearcher	TokenNameIdentifier	 single Searcher
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Directory	TokenNameIdentifier	 Directory
d1	TokenNameIdentifier	 d1
,	TokenNameCOMMA	
d2	TokenNameIdentifier	 d2
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
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
multiSearcher	TokenNameIdentifier	 multi Searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
singleSearcher	TokenNameIdentifier	 single Searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d1	TokenNameIdentifier	 d1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d2	TokenNameIdentifier	 d2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
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
private	TokenNameprivate	
void	TokenNamevoid	
addCollection1	TokenNameIdentifier	 add Collection1
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"one blah three"	TokenNameStringLiteral	one blah three
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"one foo three multiOne"	TokenNameStringLiteral	one foo three multiOne
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"one foobar three multiThree"	TokenNameStringLiteral	one foobar three multiThree
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"blueberry pie"	TokenNameStringLiteral	blueberry pie
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"blueberry strudel"	TokenNameStringLiteral	blueberry strudel
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"blueberry pizza"	TokenNameStringLiteral	blueberry pizza
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addCollection2	TokenNameIdentifier	 add Collection2
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"two blah three"	TokenNameStringLiteral	two blah three
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"two foo xxx multiTwo"	TokenNameStringLiteral	two foo xxx multiTwo
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"two foobar xxx multiThreee"	TokenNameStringLiteral	two foobar xxx multiThreee
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"blueberry chewing gum"	TokenNameStringLiteral	blueberry chewing gum
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"bluebird pizza"	TokenNameStringLiteral	bluebird pizza
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"bluebird foobar pizza"	TokenNameStringLiteral	bluebird foobar pizza
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"piccadilly circus"	TokenNameStringLiteral	piccadilly circus
,	TokenNameCOMMA	
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
IndexWriter	TokenNameIdentifier	 Index Writer
iw	TokenNameIdentifier	 iw
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
FIELD_NAME	TokenNameIdentifier	 FIELD  NAME
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
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
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
