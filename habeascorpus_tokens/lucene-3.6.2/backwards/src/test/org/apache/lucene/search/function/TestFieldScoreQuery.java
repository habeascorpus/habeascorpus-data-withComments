package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
IndexSearcher	TokenNameIdentifier	 Index Searcher
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
Query	TokenNameIdentifier	 Query
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
QueryUtils	TokenNameIdentifier	 Query Utils
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
ScoreDoc	TokenNameIdentifier	 Score Doc
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
TopDocs	TokenNameIdentifier	 Top Docs
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
BeforeClass	TokenNameIdentifier	 Before Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
/** * Test FieldScoreQuery search. * <p> * Tests here create an index with a few documents, each having * an int value indexed field and a float value indexed field. * The values of these fields are later used for scoring. * <p> * The rank tests use Hits to verify that docs are ordered (by score) as expected. * <p> * The exact score tests use TopDocs top to verify the exact score. */	TokenNameCOMMENT_JAVADOC	 Test FieldScoreQuery search. <p> Tests here create an index with a few documents, each having an int value indexed field and a float value indexed field. The values of these fields are later used for scoring. <p> The rank tests use Hits to verify that docs are ordered (by score) as expected. <p> The exact score tests use TopDocs top to verify the exact score. 
public	TokenNamepublic	
class	TokenNameclass	
TestFieldScoreQuery	TokenNameIdentifier	 Test Field Score Query
extends	TokenNameextends	
FunctionTestSetup	TokenNameIdentifier	 Function Test Setup
{	TokenNameLBRACE	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
beforeClass	TokenNameIdentifier	 before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.BYTE returns docs in expected order. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.BYTE returns docs in expected order. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRankByte	TokenNameIdentifier	 test Rank Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// INT field values are small enough to be parsed as byte 	TokenNameCOMMENT_LINE	INT field values are small enough to be parsed as byte 
doTestRank	TokenNameIdentifier	 do Test Rank
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BYTE	TokenNameIdentifier	 BYTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.SHORT returns docs in expected order. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.SHORT returns docs in expected order. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRankShort	TokenNameIdentifier	 test Rank Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// INT field values are small enough to be parsed as short 	TokenNameCOMMENT_LINE	INT field values are small enough to be parsed as short 
doTestRank	TokenNameIdentifier	 do Test Rank
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.INT returns docs in expected order. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.INT returns docs in expected order. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRankInt	TokenNameIdentifier	 test Rank Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doTestRank	TokenNameIdentifier	 do Test Rank
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.FLOAT returns docs in expected order. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.FLOAT returns docs in expected order. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRankFloat	TokenNameIdentifier	 test Rank Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// INT field can be parsed as float 	TokenNameCOMMENT_LINE	INT field can be parsed as float 
doTestRank	TokenNameIdentifier	 do Test Rank
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same values, but in flot format 	TokenNameCOMMENT_LINE	same values, but in flot format 
doTestRank	TokenNameIdentifier	 do Test Rank
(	TokenNameLPAREN	
FLOAT_FIELD	TokenNameIdentifier	 FLOAT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test that FieldScoreQuery returns docs in expected order. 	TokenNameCOMMENT_LINE	Test that FieldScoreQuery returns docs in expected order. 
private	TokenNameprivate	
void	TokenNamevoid	
doTestRank	TokenNameIdentifier	 do Test Rank
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
tp	TokenNameIdentifier	 tp
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
tp	TokenNameIdentifier	 tp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"test: "	TokenNameStringLiteral	test: 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
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
"All docs should be matched!"	TokenNameStringLiteral	All docs should be matched!
,	TokenNameCOMMA	
N_DOCS	TokenNameIdentifier	 N  DOCS
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prevID	TokenNameIdentifier	 prev ID
=	TokenNameEQUAL	
"ID"	TokenNameStringLiteral	ID
+	TokenNamePLUS	
(	TokenNameLPAREN	
N_DOCS	TokenNameIdentifier	 N  DOCS
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// greater than all ids of docs in this test 	TokenNameCOMMENT_LINE	greater than all ids of docs in this test 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
resID	TokenNameIdentifier	 res ID
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
". score="	TokenNameStringLiteral	. score=
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
resID	TokenNameIdentifier	 res ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"res id "	TokenNameStringLiteral	res id 
+	TokenNamePLUS	
resID	TokenNameIdentifier	 res ID
+	TokenNamePLUS	
" should be < prev res id "	TokenNameStringLiteral	 should be < prev res id 
+	TokenNamePLUS	
prevID	TokenNameIdentifier	 prev ID
,	TokenNameCOMMA	
resID	TokenNameIdentifier	 res ID
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
prevID	TokenNameIdentifier	 prev ID
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevID	TokenNameIdentifier	 prev ID
=	TokenNameEQUAL	
resID	TokenNameIdentifier	 res ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.BYTE returns the expected scores. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.BYTE returns the expected scores. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testExactScoreByte	TokenNameIdentifier	 test Exact Score Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// INT field values are small enough to be parsed as byte 	TokenNameCOMMENT_LINE	INT field values are small enough to be parsed as byte 
doTestExactScore	TokenNameIdentifier	 do Test Exact Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BYTE	TokenNameIdentifier	 BYTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.SHORT returns the expected scores. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.SHORT returns the expected scores. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testExactScoreShort	TokenNameIdentifier	 test Exact Score Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// INT field values are small enough to be parsed as short 	TokenNameCOMMENT_LINE	INT field values are small enough to be parsed as short 
doTestExactScore	TokenNameIdentifier	 do Test Exact Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.INT returns the expected scores. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.INT returns the expected scores. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testExactScoreInt	TokenNameIdentifier	 test Exact Score Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doTestExactScore	TokenNameIdentifier	 do Test Exact Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.FLOAT returns the expected scores. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.FLOAT returns the expected scores. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testExactScoreFloat	TokenNameIdentifier	 test Exact Score Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// INT field can be parsed as float 	TokenNameCOMMENT_LINE	INT field can be parsed as float 
doTestExactScore	TokenNameIdentifier	 do Test Exact Score
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same values, but in flot format 	TokenNameCOMMENT_LINE	same values, but in flot format 
doTestExactScore	TokenNameIdentifier	 do Test Exact Score
(	TokenNameLPAREN	
FLOAT_FIELD	TokenNameIdentifier	 FLOAT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test that FieldScoreQuery returns docs with expected score. 	TokenNameCOMMENT_LINE	Test that FieldScoreQuery returns docs with expected score. 
private	TokenNameprivate	
void	TokenNamevoid	
doTestExactScore	TokenNameIdentifier	 do Test Exact Score
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
tp	TokenNameIdentifier	 tp
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
tp	TokenNameIdentifier	 tp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocs	TokenNameIdentifier	 Top Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"All docs should be matched!"	TokenNameStringLiteral	All docs should be matched!
,	TokenNameCOMMA	
N_DOCS	TokenNameIdentifier	 N  DOCS
,	TokenNameCOMMA	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
aSd	TokenNameIdentifier	 a Sd
:	TokenNameCOLON	
sd	TokenNameIdentifier	 sd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
aSd	TokenNameIdentifier	 a Sd
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
aSd	TokenNameIdentifier	 a Sd
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
aSd	TokenNameIdentifier	 a Sd
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
expectedScore	TokenNameIdentifier	 expected Score
=	TokenNameEQUAL	
expectedFieldScore	TokenNameIdentifier	 expected Field Score
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "ID7" --> 7.0 	TokenNameCOMMENT_LINE	"ID7" --> 7.0 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"score of "	TokenNameStringLiteral	score of 
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
" shuould be "	TokenNameStringLiteral	 shuould be 
+	TokenNamePLUS	
expectedScore	TokenNameIdentifier	 expected Score
+	TokenNamePLUS	
" != "	TokenNameStringLiteral	 != 
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
expectedScore	TokenNameIdentifier	 expected Score
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
TEST_SCORE_TOLERANCE_DELTA	TokenNameIdentifier	 TEST  SCORE  TOLERANCE  DELTA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.BYTE caches/reuses loaded values and consumes the proper RAM resources. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.BYTE caches/reuses loaded values and consumes the proper RAM resources. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCachingByte	TokenNameIdentifier	 test Caching Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// INT field values are small enough to be parsed as byte 	TokenNameCOMMENT_LINE	INT field values are small enough to be parsed as byte 
doTestCaching	TokenNameIdentifier	 do Test Caching
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BYTE	TokenNameIdentifier	 BYTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.SHORT caches/reuses loaded values and consumes the proper RAM resources. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.SHORT caches/reuses loaded values and consumes the proper RAM resources. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCachingShort	TokenNameIdentifier	 test Caching Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// INT field values are small enough to be parsed as short 	TokenNameCOMMENT_LINE	INT field values are small enough to be parsed as short 
doTestCaching	TokenNameIdentifier	 do Test Caching
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.INT caches/reuses loaded values and consumes the proper RAM resources. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.INT caches/reuses loaded values and consumes the proper RAM resources. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCachingInt	TokenNameIdentifier	 test Caching Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doTestCaching	TokenNameIdentifier	 do Test Caching
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test that FieldScoreQuery of Type.FLOAT caches/reuses loaded values and consumes the proper RAM resources. */	TokenNameCOMMENT_JAVADOC	 Test that FieldScoreQuery of Type.FLOAT caches/reuses loaded values and consumes the proper RAM resources. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCachingFloat	TokenNameIdentifier	 test Caching Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// INT field values can be parsed as float 	TokenNameCOMMENT_LINE	INT field values can be parsed as float 
doTestCaching	TokenNameIdentifier	 do Test Caching
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same values, but in flot format 	TokenNameCOMMENT_LINE	same values, but in flot format 
doTestCaching	TokenNameIdentifier	 do Test Caching
(	TokenNameLPAREN	
FLOAT_FIELD	TokenNameIdentifier	 FLOAT  FIELD
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test that values loaded for FieldScoreQuery are cached properly and consumes the proper RAM resources. 	TokenNameCOMMENT_LINE	Test that values loaded for FieldScoreQuery are cached properly and consumes the proper RAM resources. 
private	TokenNameprivate	
void	TokenNamevoid	
doTestCaching	TokenNameIdentifier	 do Test Caching
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
tp	TokenNameIdentifier	 tp
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// prepare expected array types for comparison 	TokenNameCOMMENT_LINE	prepare expected array types for comparison 
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
expectedArrayTypes	TokenNameIdentifier	 expected Array Types
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedArrayTypes	TokenNameIdentifier	 expected Array Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BYTE	TokenNameIdentifier	 BYTE
,	TokenNameCOMMA	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedArrayTypes	TokenNameIdentifier	 expected Array Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
,	TokenNameCOMMA	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedArrayTypes	TokenNameIdentifier	 expected Array Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedArrayTypes	TokenNameIdentifier	 expected Array Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
warned	TokenNameIdentifier	 warned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// print warning once. 	TokenNameCOMMENT_LINE	print warning once. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
tp	TokenNameIdentifier	 tp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
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
"All docs should be matched!"	TokenNameStringLiteral	All docs should be matched!
,	TokenNameCOMMA	
N_DOCS	TokenNameIdentifier	 N  DOCS
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readers	TokenNameIdentifier	 readers
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
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
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
innerArray	TokenNameIdentifier	 inner Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
valSrc	TokenNameIdentifier	 val Src
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
.	TokenNameDOT	
getInnerArray	TokenNameIdentifier	 get Inner Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
". compare: "	TokenNameStringLiteral	. compare: 
+	TokenNamePLUS	
innerArray	TokenNameIdentifier	 inner Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
expectedArrayTypes	TokenNameIdentifier	 expected Array Types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tp	TokenNameIdentifier	 tp
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"field values should be cached in the correct array type!"	TokenNameStringLiteral	field values should be cached in the correct array type!
,	TokenNameCOMMA	
innerArray	TokenNameIdentifier	 inner Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
expectedArrayTypes	TokenNameIdentifier	 expected Array Types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tp	TokenNameIdentifier	 tp
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
". compare: "	TokenNameStringLiteral	. compare: 
+	TokenNamePLUS	
innerArray	TokenNameIdentifier	 inner Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
valSrc	TokenNameIdentifier	 val Src
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
.	TokenNameDOT	
getInnerArray	TokenNameIdentifier	 get Inner Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
"field values should be cached and reused!"	TokenNameStringLiteral	field values should be cached and reused!
,	TokenNameCOMMA	
innerArray	TokenNameIdentifier	 inner Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
valSrc	TokenNameIdentifier	 val Src
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
.	TokenNameDOT	
getInnerArray	TokenNameIdentifier	 get Inner Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
warned	TokenNameIdentifier	 warned
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARNING: "	TokenNameStringLiteral	WARNING: 
+	TokenNamePLUS	
testName	TokenNameIdentifier	 test Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" cannot fully test values of "	TokenNameStringLiteral	 cannot fully test values of 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
warned	TokenNameIdentifier	 warned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify new values are reloaded (not reused) for a new reader 	TokenNameCOMMENT_LINE	verify new values are reloaded (not reused) for a new reader 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
tp	TokenNameIdentifier	 tp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
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
"All docs should be matched!"	TokenNameStringLiteral	All docs should be matched!
,	TokenNameCOMMA	
N_DOCS	TokenNameIdentifier	 N  DOCS
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readers	TokenNameIdentifier	 readers
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
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
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"compare: "	TokenNameStringLiteral	compare: 
+	TokenNamePLUS	
innerArray	TokenNameIdentifier	 inner Array
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
valSrc	TokenNameIdentifier	 val Src
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
.	TokenNameDOT	
getInnerArray	TokenNameIdentifier	 get Inner Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
"cached field values should not be reused if reader as changed!"	TokenNameStringLiteral	cached field values should not be reused if reader as changed!
,	TokenNameCOMMA	
innerArray	TokenNameIdentifier	 inner Array
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
valSrc	TokenNameIdentifier	 val Src
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
.	TokenNameDOT	
getInnerArray	TokenNameIdentifier	 get Inner Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
warned	TokenNameIdentifier	 warned
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARNING: "	TokenNameStringLiteral	WARNING: 
+	TokenNamePLUS	
testName	TokenNameIdentifier	 test Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" cannot fully test values of "	TokenNameStringLiteral	 cannot fully test values of 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
warned	TokenNameIdentifier	 warned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
