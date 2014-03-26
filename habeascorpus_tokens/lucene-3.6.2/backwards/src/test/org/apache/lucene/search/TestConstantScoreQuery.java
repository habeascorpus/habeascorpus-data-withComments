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
Term	TokenNameIdentifier	 Term
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** This class only tests some basic functionality in CSQ, the main parts are mostly * tested by MultiTermQuery tests, explanations seems to be tested in TestExplanations! */	TokenNameCOMMENT_JAVADOC	 This class only tests some basic functionality in CSQ, the main parts are mostly tested by MultiTermQuery tests, explanations seems to be tested in TestExplanations! 
public	TokenNamepublic	
class	TokenNameclass	
TestConstantScoreQuery	TokenNameIdentifier	 Test Constant Score Query
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCSQ	TokenNameIdentifier	 test CSQ
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
q3	TokenNameIdentifier	 q3
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
checkEqual	TokenNameIdentifier	 check Equal
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
checkEqual	TokenNameIdentifier	 check Equal
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
checkEqual	TokenNameIdentifier	 check Equal
(	TokenNameLPAREN	
q3	TokenNameIdentifier	 q3
,	TokenNameCOMMA	
q3	TokenNameIdentifier	 q3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
checkUnequal	TokenNameIdentifier	 check Unequal
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
checkUnequal	TokenNameIdentifier	 check Unequal
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
q3	TokenNameIdentifier	 q3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
checkUnequal	TokenNameIdentifier	 check Unequal
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q3	TokenNameIdentifier	 q3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
checkUnequal	TokenNameIdentifier	 check Unequal
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
expectedScore	TokenNameIdentifier	 expected Score
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
scorerClassName	TokenNameIdentifier	 scorer Class Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
innerScorerClassName	TokenNameIdentifier	 inner Scorer Class Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
new	TokenNamenew	
Collector	TokenNameIdentifier	 Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Scorer is implemented by wrong class"	TokenNameStringLiteral	Scorer is implemented by wrong class
,	TokenNameCOMMA	
scorerClassName	TokenNameIdentifier	 scorer Class Name
,	TokenNameCOMMA	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
innerScorerClassName	TokenNameIdentifier	 inner Scorer Class Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
scorer	TokenNameIdentifier	 scorer
instanceof	TokenNameinstanceof	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
.	TokenNameDOT	
ConstantScorer	TokenNameIdentifier	 Constant Scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
.	TokenNameDOT	
ConstantScorer	TokenNameIdentifier	 Constant Scorer
innerScorer	TokenNameIdentifier	 inner Scorer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
.	TokenNameDOT	
ConstantScorer	TokenNameIdentifier	 Constant Scorer
)	TokenNameRPAREN	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"inner Scorer is implemented by wrong class"	TokenNameStringLiteral	inner Scorer is implemented by wrong class
,	TokenNameCOMMA	
innerScorerClassName	TokenNameIdentifier	 inner Scorer Class Name
,	TokenNameCOMMA	
innerScorer	TokenNameIdentifier	 inner Scorer
.	TokenNameDOT	
docIdSetIterator	TokenNameIdentifier	 doc Id Set Iterator
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Score differs from expected"	TokenNameStringLiteral	Score differs from expected
,	TokenNameCOMMA	
expectedScore	TokenNameIdentifier	 expected Score
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"invalid number of results"	TokenNameStringLiteral	invalid number of results
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWrapped2Times	TokenNameIdentifier	 test Wrapped2 Times
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
directory	TokenNameIdentifier	 directory
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
directory	TokenNameIdentifier	 directory
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
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"term"	TokenNameStringLiteral	term
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
reader	TokenNameIdentifier	 reader
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
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set a similarity that does not normalize our boost away 	TokenNameCOMMENT_LINE	set a similarity that does not normalize our boost away 
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
setSimilarity	TokenNameIdentifier	 set Similarity
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
queryNorm	TokenNameIdentifier	 query Norm
(	TokenNameLPAREN	
float	TokenNamefloat	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
csq1	TokenNameIdentifier	 csq1
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"term"	TokenNameStringLiteral	term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csq1	TokenNameIdentifier	 csq1
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
2.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
csq2	TokenNameIdentifier	 csq2
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
csq1	TokenNameIdentifier	 csq1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csq2	TokenNameIdentifier	 csq2
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
5.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
csq1	TokenNameIdentifier	 csq1
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
csq2	TokenNameIdentifier	 csq2
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
csqbq	TokenNameIdentifier	 csqbq
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csqbq	TokenNameIdentifier	 csqbq
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
17.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
csq1	TokenNameIdentifier	 csq1
,	TokenNameCOMMA	
csq1	TokenNameIdentifier	 csq1
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
.	TokenNameDOT	
ConstantScorer	TokenNameIdentifier	 Constant Scorer
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
csq2	TokenNameIdentifier	 csq2
,	TokenNameCOMMA	
csq2	TokenNameIdentifier	 csq2
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
.	TokenNameDOT	
ConstantScorer	TokenNameIdentifier	 Constant Scorer
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
.	TokenNameDOT	
ConstantScorer	TokenNameIdentifier	 Constant Scorer
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for the combined BQ, the scorer should always be BooleanScorer's BucketScorer, because our scorer supports out-of order collection! 	TokenNameCOMMENT_LINE	for the combined BQ, the scorer should always be BooleanScorer's BucketScorer, because our scorer supports out-of order collection! 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bucketScorerClass	TokenNameIdentifier	 bucket Scorer Class
=	TokenNameEQUAL	
BooleanScorer	TokenNameIdentifier	 Boolean Scorer
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"$BucketScorer"	TokenNameStringLiteral	$BucketScorer
;	TokenNameSEMICOLON	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
csq1	TokenNameIdentifier	 csq1
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
csq2	TokenNameIdentifier	 csq2
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bucketScorerClass	TokenNameIdentifier	 bucket Scorer Class
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
csqbq	TokenNameIdentifier	 csqbq
,	TokenNameCOMMA	
csqbq	TokenNameIdentifier	 csqbq
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
.	TokenNameDOT	
ConstantScorer	TokenNameIdentifier	 Constant Scorer
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bucketScorerClass	TokenNameIdentifier	 bucket Scorer Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
