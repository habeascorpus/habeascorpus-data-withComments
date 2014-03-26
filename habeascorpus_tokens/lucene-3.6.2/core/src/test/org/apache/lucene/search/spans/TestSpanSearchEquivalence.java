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
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
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
BooleanQuery	TokenNameIdentifier	 Boolean Query
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
PhraseQuery	TokenNameIdentifier	 Phrase Query
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
SearchEquivalenceTestBase	TokenNameIdentifier	 Search Equivalence Test Base
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
TermQuery	TokenNameIdentifier	 Term Query
;	TokenNameSEMICOLON	
/** * Basic equivalence tests for span queries */	TokenNameCOMMENT_JAVADOC	 Basic equivalence tests for span queries 
public	TokenNamepublic	
class	TokenNameclass	
TestSpanSearchEquivalence	TokenNameIdentifier	 Test Span Search Equivalence
extends	TokenNameextends	
SearchEquivalenceTestBase	TokenNameIdentifier	 Search Equivalence Test Base
{	TokenNameLBRACE	
// TODO: we could go a little crazy for a lot of these, 	TokenNameCOMMENT_LINE	TODO: we could go a little crazy for a lot of these, 
// but these are just simple minimal cases in case something 	TokenNameCOMMENT_LINE	but these are just simple minimal cases in case something 
// goes horribly wrong. Put more intense tests elsewhere. 	TokenNameCOMMENT_LINE	goes horribly wrong. Put more intense tests elsewhere. 
/** SpanTermQuery(A) = TermQuery(A) */	TokenNameCOMMENT_JAVADOC	 SpanTermQuery(A) = TermQuery(A) 
public	TokenNamepublic	
void	TokenNamevoid	
testSpanTermVersusTerm	TokenNameIdentifier	 test Span Term Versus Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameSet	TokenNameIdentifier	 assert Same Set
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** SpanOrQuery(A, B) = (A B) */	TokenNameCOMMENT_JAVADOC	 SpanOrQuery(A, B) = (A B) 
public	TokenNamepublic	
void	TokenNamevoid	
testSpanOrVersusBoolean	TokenNameIdentifier	 test Span Or Versus Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
(	TokenNameLPAREN	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameSet	TokenNameIdentifier	 assert Same Set
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** SpanNotQuery(A, B) ⊆ SpanTermQuery(A) */	TokenNameCOMMENT_JAVADOC	 SpanNotQuery(A, B) ⊆ SpanTermQuery(A) 
public	TokenNamepublic	
void	TokenNamevoid	
testSpanNotVersusSpanTerm	TokenNameIdentifier	 test Span Not Versus Span Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSubsetOf	TokenNameIdentifier	 assert Subset Of
(	TokenNameLPAREN	
new	TokenNamenew	
SpanNotQuery	TokenNameIdentifier	 Span Not Query
(	TokenNameLPAREN	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** SpanFirstQuery(A, 10) ⊆ SpanTermQuery(A) */	TokenNameCOMMENT_JAVADOC	 SpanFirstQuery(A, 10) ⊆ SpanTermQuery(A) 
public	TokenNamepublic	
void	TokenNamevoid	
testSpanFirstVersusSpanTerm	TokenNameIdentifier	 test Span First Versus Span Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSubsetOf	TokenNameIdentifier	 assert Subset Of
(	TokenNameLPAREN	
new	TokenNamenew	
SpanFirstQuery	TokenNameIdentifier	 Span First Query
(	TokenNameLPAREN	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** SpanNearQuery([A, B], 0, true) = "A B" */	TokenNameCOMMENT_JAVADOC	 SpanNearQuery([A, B], 0, true) = "A B" 
public	TokenNamepublic	
void	TokenNamevoid	
testSpanNearVersusPhrase	TokenNameIdentifier	 test Span Near Versus Phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
subquery	TokenNameIdentifier	 subquery
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
subquery	TokenNameIdentifier	 subquery
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PhraseQuery	TokenNameIdentifier	 Phrase Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameSet	TokenNameIdentifier	 assert Same Set
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** SpanNearQuery([A, B], ∞, false) = +A +B */	TokenNameCOMMENT_JAVADOC	 SpanNearQuery([A, B], ∞, false) = +A +B 
public	TokenNamepublic	
void	TokenNamevoid	
testSpanNearVersusBooleanAnd	TokenNameIdentifier	 test Span Near Versus Boolean And
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
subquery	TokenNameIdentifier	 subquery
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
subquery	TokenNameIdentifier	 subquery
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameSet	TokenNameIdentifier	 assert Same Set
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** SpanNearQuery([A B], 0, false) ⊆ SpanNearQuery([A B], 1, false) */	TokenNameCOMMENT_JAVADOC	 SpanNearQuery([A B], 0, false) ⊆ SpanNearQuery([A B], 1, false) 
public	TokenNamepublic	
void	TokenNamevoid	
testSpanNearVersusSloppySpanNear	TokenNameIdentifier	 test Span Near Versus Sloppy Span Near
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
subquery	TokenNameIdentifier	 subquery
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
subquery	TokenNameIdentifier	 subquery
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
subquery	TokenNameIdentifier	 subquery
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSubsetOf	TokenNameIdentifier	 assert Subset Of
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** SpanNearQuery([A B], 3, true) ⊆ SpanNearQuery([A B], 3, false) */	TokenNameCOMMENT_JAVADOC	 SpanNearQuery([A B], 3, true) ⊆ SpanNearQuery([A B], 3, false) 
public	TokenNamepublic	
void	TokenNamevoid	
testSpanNearInOrderVersusOutOfOrder	TokenNameIdentifier	 test Span Near In Order Versus Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
subquery	TokenNameIdentifier	 subquery
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
subquery	TokenNameIdentifier	 subquery
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
subquery	TokenNameIdentifier	 subquery
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSubsetOf	TokenNameIdentifier	 assert Subset Of
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
