package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
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
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
OpenMode	TokenNameIdentifier	 Open Mode
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/******************************************************************************* * Some expanded tests to make sure my patch doesn't break other SpanTermQuery * functionality. * */	TokenNameCOMMENT_JAVADOC	***************************************************************************** Some expanded tests to make sure my patch doesn't break other SpanTermQuery functionality. 
public	TokenNamepublic	
class	TokenNameclass	
TestSpansAdvanced2	TokenNameIdentifier	 Test Spans Advanced2
extends	TokenNameextends	
TestSpansAdvanced	TokenNameIdentifier	 Test Spans Advanced
{	TokenNameLBRACE	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher2	TokenNameIdentifier	 searcher2
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader2	TokenNameIdentifier	 reader2
;	TokenNameSEMICOLON	
/** * Initializes the tests by adding documents to the index. */	TokenNameCOMMENT_JAVADOC	 Initializes the tests by adding documents to the index. 
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
// create test index 	TokenNameCOMMENT_LINE	create test index 
final	TokenNamefinal	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
mDirectory	TokenNameIdentifier	 m Directory
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
setOpenMode	TokenNameIdentifier	 set Open Mode
(	TokenNameLPAREN	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
APPEND	TokenNameIdentifier	 APPEND
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
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
"Should we, could we, would we?"	TokenNameStringLiteral	Should we, could we, would we?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
"It should. Should it?"	TokenNameStringLiteral	It should. Should it?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
"It shouldn't."	TokenNameStringLiteral	It shouldn't.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"D"	TokenNameStringLiteral	D
,	TokenNameCOMMA	
"Should we, should we, should we."	TokenNameStringLiteral	Should we, should we, should we.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader2	TokenNameIdentifier	 reader2
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// re-open the searcher since we added more docs 	TokenNameCOMMENT_LINE	re-open the searcher since we added more docs 
searcher2	TokenNameIdentifier	 searcher2
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader2	TokenNameIdentifier	 reader2
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
searcher2	TokenNameIdentifier	 searcher2
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
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Verifies that the index has the correct number of documents. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Verifies that the index has the correct number of documents. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testVerifyIndex	TokenNameIdentifier	 test Verify Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
mDirectory	TokenNameIdentifier	 m Directory
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests a single span query that matches multiple documents. * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Tests a single span query that matches multiple documents. * @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
testSingleSpanQuery	TokenNameIdentifier	 test Single Span Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
spanQuery	TokenNameIdentifier	 span Query
=	TokenNameEQUAL	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
FIELD_TEXT	TokenNameIdentifier	 FIELD  TEXT
,	TokenNameCOMMA	
"should"	TokenNameStringLiteral	should
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedIds	TokenNameIdentifier	 expected Ids
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
"D"	TokenNameStringLiteral	D
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedScores	TokenNameIdentifier	 expected Scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0.625f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.45927936f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.35355338f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.35355338f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.35355338f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.35355338f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.26516503f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertHits	TokenNameIdentifier	 assert Hits
(	TokenNameLPAREN	
searcher2	TokenNameIdentifier	 searcher2
,	TokenNameCOMMA	
spanQuery	TokenNameIdentifier	 span Query
,	TokenNameCOMMA	
"single span query"	TokenNameStringLiteral	single span query
,	TokenNameCOMMA	
expectedIds	TokenNameIdentifier	 expected Ids
,	TokenNameCOMMA	
expectedScores	TokenNameIdentifier	 expected Scores
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests a single span query that matches multiple documents. * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Tests a single span query that matches multiple documents. * @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
testMultipleDifferentSpanQueries	TokenNameIdentifier	 test Multiple Different Span Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
spanQuery1	TokenNameIdentifier	 span Query1
=	TokenNameEQUAL	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
FIELD_TEXT	TokenNameIdentifier	 FIELD  TEXT
,	TokenNameCOMMA	
"should"	TokenNameStringLiteral	should
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
spanQuery2	TokenNameIdentifier	 span Query2
=	TokenNameEQUAL	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
FIELD_TEXT	TokenNameIdentifier	 FIELD  TEXT
,	TokenNameCOMMA	
"we"	TokenNameStringLiteral	we
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BooleanQuery	TokenNameIdentifier	 Boolean Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
spanQuery1	TokenNameIdentifier	 span Query1
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
spanQuery2	TokenNameIdentifier	 span Query2
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedIds	TokenNameIdentifier	 expected Ids
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"D"	TokenNameStringLiteral	D
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// these values were pre LUCENE-413 	TokenNameCOMMENT_LINE	these values were pre LUCENE-413 
// final float[] expectedScores = new float[] { 0.93163157f, 0.20698164f }; 	TokenNameCOMMENT_LINE	final float[] expectedScores = new float[] { 0.93163157f, 0.20698164f }; 
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedScores	TokenNameIdentifier	 expected Scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1.0191123f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.93163157f	TokenNameFloatingPointLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertHits	TokenNameIdentifier	 assert Hits
(	TokenNameLPAREN	
searcher2	TokenNameIdentifier	 searcher2
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
"multiple different span queries"	TokenNameStringLiteral	multiple different span queries
,	TokenNameCOMMA	
expectedIds	TokenNameIdentifier	 expected Ids
,	TokenNameCOMMA	
expectedScores	TokenNameIdentifier	 expected Scores
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests two span queries. * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Tests two span queries. * @throws IOException 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
testBooleanQueryWithSpanQueries	TokenNameIdentifier	 test Boolean Query With Span Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
doTestBooleanQueryWithSpanQueries	TokenNameIdentifier	 do Test Boolean Query With Span Queries
(	TokenNameLPAREN	
searcher2	TokenNameIdentifier	 searcher2
,	TokenNameCOMMA	
0.73500174f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
