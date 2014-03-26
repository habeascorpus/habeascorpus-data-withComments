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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
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
*	TokenNameMULTIPLY	
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
/** * Test search based on OrdFieldSource and ReverseOrdFieldSource. * <p/> * Tests here create an index with a few documents, each having * an indexed "id" field. * The ord values of this field are later used for scoring. * <p/> * The order tests use Hits to verify that docs are ordered as expected. * <p/> * The exact score tests use TopDocs top to verify the exact score. */	TokenNameCOMMENT_JAVADOC	 Test search based on OrdFieldSource and ReverseOrdFieldSource. <p/> Tests here create an index with a few documents, each having an indexed "id" field. The ord values of this field are later used for scoring. <p/> The order tests use Hits to verify that docs are ordered as expected. <p/> The exact score tests use TopDocs top to verify the exact score. 
public	TokenNamepublic	
class	TokenNameclass	
TestOrdValues	TokenNameIdentifier	 Test Ord Values
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
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test OrdFieldSource */	TokenNameCOMMENT_JAVADOC	 Test OrdFieldSource 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testOrdFieldRank	TokenNameIdentifier	 test Ord Field Rank
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doTestRank	TokenNameIdentifier	 do Test Rank
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test ReverseOrdFieldSource */	TokenNameCOMMENT_JAVADOC	 Test ReverseOrdFieldSource 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testReverseOrdFieldRank	TokenNameIdentifier	 test Reverse Ord Field Rank
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doTestRank	TokenNameIdentifier	 do Test Rank
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test that queries based on reverse/ordFieldScore scores correctly 	TokenNameCOMMENT_LINE	Test that queries based on reverse/ordFieldScore scores correctly 
private	TokenNameprivate	
void	TokenNamevoid	
doTestRank	TokenNameIdentifier	 do Test Rank
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
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
ValueSource	TokenNameIdentifier	 Value Source
vs	TokenNameIdentifier	 vs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
ReverseOrdFieldSource	TokenNameIdentifier	 Reverse Ord Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
(	TokenNameLPAREN	
vs	TokenNameIdentifier	 vs
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
inOrder	TokenNameIdentifier	 in Order
?	TokenNameQUESTION	
"IE"	TokenNameStringLiteral	IE
// greater than all ids of docs in this test ("ID0001", etc.) 	TokenNameCOMMENT_LINE	greater than all ids of docs in this test ("ID0001", etc.) 
:	TokenNameCOLON	
"IC"	TokenNameStringLiteral	IC
;	TokenNameSEMICOLON	
// smaller than all ids of docs in this test ("ID0001", etc.) 	TokenNameCOMMENT_LINE	smaller than all ids of docs in this test ("ID0001", etc.) 
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
if	TokenNameif	
(	TokenNameLPAREN	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"res id "	TokenNameStringLiteral	res id 
+	TokenNamePLUS	
resID	TokenNameIdentifier	 res ID
+	TokenNamePLUS	
" should be > prev res id "	TokenNameStringLiteral	 should be > prev res id 
+	TokenNamePLUS	
prevID	TokenNameIdentifier	 prev ID
,	TokenNameCOMMA	
resID	TokenNameIdentifier	 res ID
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
prevID	TokenNameIdentifier	 prev ID
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Test exact score for OrdFieldSource */	TokenNameCOMMENT_JAVADOC	 Test exact score for OrdFieldSource 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testOrdFieldExactScore	TokenNameIdentifier	 test Ord Field Exact Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doTestExactScore	TokenNameIdentifier	 do Test Exact Score
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test exact score for ReverseOrdFieldSource */	TokenNameCOMMENT_JAVADOC	 Test exact score for ReverseOrdFieldSource 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testReverseOrdFieldExactScore	TokenNameIdentifier	 test Reverse Ord Field Exact Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doTestExactScore	TokenNameIdentifier	 do Test Exact Score
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test that queries based on reverse/ordFieldScore returns docs with expected score. 	TokenNameCOMMENT_LINE	Test that queries based on reverse/ordFieldScore returns docs with expected score. 
private	TokenNameprivate	
void	TokenNamevoid	
doTestExactScore	TokenNameIdentifier	 do Test Exact Score
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
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
ValueSource	TokenNameIdentifier	 Value Source
vs	TokenNameIdentifier	 vs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
ReverseOrdFieldSource	TokenNameIdentifier	 Reverse Ord Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
(	TokenNameLPAREN	
vs	TokenNameIdentifier	 vs
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
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
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
sd	TokenNameIdentifier	 sd
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
"-------- "	TokenNameStringLiteral	-------- 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
". Explain doc "	TokenNameStringLiteral	. Explain doc 
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
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
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
expectedScore	TokenNameIdentifier	 expected Score
=	TokenNameEQUAL	
N_DOCS	TokenNameIdentifier	 N  DOCS
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"score of result "	TokenNameStringLiteral	score of result 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
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
String	TokenNameIdentifier	 String
expectedId	TokenNameIdentifier	 expected Id
=	TokenNameEQUAL	
inOrder	TokenNameIdentifier	 in Order
?	TokenNameQUESTION	
id2String	TokenNameIdentifier	 id2 String
(	TokenNameLPAREN	
N_DOCS	TokenNameIdentifier	 N  DOCS
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
// in-order ==> larger values first 	TokenNameCOMMENT_LINE	in-order ==> larger values first 
:	TokenNameCOLON	
id2String	TokenNameIdentifier	 id2 String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reverse ==> smaller values first 	TokenNameCOMMENT_LINE	reverse ==> smaller values first 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"id of result "	TokenNameStringLiteral	id of result 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" shuould be "	TokenNameStringLiteral	 shuould be 
+	TokenNamePLUS	
expectedId	TokenNameIdentifier	 expected Id
+	TokenNamePLUS	
" != "	TokenNameStringLiteral	 != 
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
expectedId	TokenNameIdentifier	 expected Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
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
/** * Test caching OrdFieldSource */	TokenNameCOMMENT_JAVADOC	 Test caching OrdFieldSource 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCachingOrd	TokenNameIdentifier	 test Caching Ord
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doTestCaching	TokenNameIdentifier	 do Test Caching
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test caching for ReverseOrdFieldSource */	TokenNameCOMMENT_JAVADOC	 Test caching for ReverseOrdFieldSource 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCachingReverseOrd	TokenNameIdentifier	 test Caching Reverse Ord
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doTestCaching	TokenNameIdentifier	 do Test Caching
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
,	TokenNameCOMMA	
false	TokenNamefalse	
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
boolean	TokenNameboolean	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
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
Object	TokenNameIdentifier	 Object
innerArray	TokenNameIdentifier	 inner Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
warned	TokenNameIdentifier	 warned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// print warning once 	TokenNameCOMMENT_LINE	print warning once 
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
ValueSource	TokenNameIdentifier	 Value Source
vs	TokenNameIdentifier	 vs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
ReverseOrdFieldSource	TokenNameIdentifier	 Reverse Ord Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
(	TokenNameLPAREN	
vs	TokenNameIdentifier	 vs
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
try	TokenNametry	
{	TokenNameLBRACE	
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
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
innerArray	TokenNameIdentifier	 inner Array
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
ValueSource	TokenNameIdentifier	 Value Source
vs	TokenNameIdentifier	 vs
;	TokenNameSEMICOLON	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
// verify that different values are loaded for a different field 	TokenNameCOMMENT_LINE	verify that different values are loaded for a different field 
String	TokenNameIdentifier	 String
field2	TokenNameIdentifier	 field2
=	TokenNameEQUAL	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
field2	TokenNameIdentifier	 field2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// otherwise this test is meaningless. 	TokenNameCOMMENT_LINE	otherwise this test is meaningless. 
if	TokenNameif	
(	TokenNameLPAREN	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
(	TokenNameLPAREN	
field2	TokenNameIdentifier	 field2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
ReverseOrdFieldSource	TokenNameIdentifier	 Reverse Ord Field Source
(	TokenNameLPAREN	
field2	TokenNameIdentifier	 field2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
(	TokenNameLPAREN	
vs	TokenNameIdentifier	 vs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"compare (should differ): "	TokenNameStringLiteral	compare (should differ): 
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
"different values shuold be loaded for a different field!"	TokenNameStringLiteral	different values shuold be loaded for a different field!
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
if	TokenNameif	
(	TokenNameLPAREN	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
ReverseOrdFieldSource	TokenNameIdentifier	 Reverse Ord Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
(	TokenNameLPAREN	
vs	TokenNameIdentifier	 vs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"compare (should differ): "	TokenNameStringLiteral	compare (should differ): 
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
// LUCENE-1250 	TokenNameCOMMENT_LINE	LUCENE-1250 
public	TokenNamepublic	
void	TokenNamevoid	
testEqualsNull	TokenNameIdentifier	 test Equals Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
ofs	TokenNameIdentifier	 ofs
=	TokenNameEQUAL	
new	TokenNamenew	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
ofs	TokenNameIdentifier	 ofs
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ReverseOrdFieldSource	TokenNameIdentifier	 Reverse Ord Field Source
rofs	TokenNameIdentifier	 rofs
=	TokenNameEQUAL	
new	TokenNamenew	
ReverseOrdFieldSource	TokenNameIdentifier	 Reverse Ord Field Source
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
rofs	TokenNameIdentifier	 rofs
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
