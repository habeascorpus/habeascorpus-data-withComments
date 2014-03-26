package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Basic equivalence tests for core queries */	TokenNameCOMMENT_JAVADOC	 Basic equivalence tests for core queries 
public	TokenNamepublic	
class	TokenNameclass	
TestSimpleSearchEquivalence	TokenNameIdentifier	 Test Simple Search Equivalence
extends	TokenNameextends	
SearchEquivalenceTestBase	TokenNameIdentifier	 Search Equivalence Test Base
{	TokenNameLBRACE	
// TODO: we could go a little crazy for a lot of these, 	TokenNameCOMMENT_LINE	TODO: we could go a little crazy for a lot of these, 
// but these are just simple minimal cases in case something 	TokenNameCOMMENT_LINE	but these are just simple minimal cases in case something 
// goes horribly wrong. Put more intense tests elsewhere. 	TokenNameCOMMENT_LINE	goes horribly wrong. Put more intense tests elsewhere. 
/** A ⊆ (A B) */	TokenNameCOMMENT_JAVADOC	 A ⊆ (A B) 
public	TokenNamepublic	
void	TokenNamevoid	
testTermVersusBooleanOr	TokenNameIdentifier	 test Term Versus Boolean Or
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
TermQuery	TokenNameIdentifier	 Term Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
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
SHOULD	TokenNameIdentifier	 SHOULD
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
SHOULD	TokenNameIdentifier	 SHOULD
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
/** A ⊆ (+A B) */	TokenNameCOMMENT_JAVADOC	 A ⊆ (+A B) 
public	TokenNamepublic	
void	TokenNamevoid	
testTermVersusBooleanReqOpt	TokenNameIdentifier	 test Term Versus Boolean Req Opt
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
TermQuery	TokenNameIdentifier	 Term Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
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
SHOULD	TokenNameIdentifier	 SHOULD
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
/** (A -B) ⊆ A */	TokenNameCOMMENT_JAVADOC	 (A -B) ⊆ A 
public	TokenNamepublic	
void	TokenNamevoid	
testBooleanReqExclVersusTerm	TokenNameIdentifier	 test Boolean Req Excl Versus Term
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
MUST	TokenNameIdentifier	 MUST
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
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
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
/** (+A +B) ⊆ (A B) */	TokenNameCOMMENT_JAVADOC	 (+A +B) ⊆ (A B) 
public	TokenNamepublic	
void	TokenNamevoid	
testBooleanAndVersusBooleanOr	TokenNameIdentifier	 test Boolean And Versus Boolean Or
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
SHOULD	TokenNameIdentifier	 SHOULD
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
SHOULD	TokenNameIdentifier	 SHOULD
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
/** (A B) = (A | B) */	TokenNameCOMMENT_JAVADOC	 (A B) = (A | B) 
public	TokenNamepublic	
void	TokenNamevoid	
testDisjunctionSumVersusDisjunctionMax	TokenNameIdentifier	 test Disjunction Sum Versus Disjunction Max
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
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
DisjunctionMaxQuery	TokenNameIdentifier	 Disjunction Max Query
(	TokenNameLPAREN	
0.5f	TokenNameFloatingPointLiteral	
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
/** "A B" ⊆ (+A +B) */	TokenNameCOMMENT_JAVADOC	 "A B" ⊆ (+A +B) 
public	TokenNamepublic	
void	TokenNamevoid	
testExactPhraseVersusBooleanAnd	TokenNameIdentifier	 test Exact Phrase Versus Boolean And
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
PhraseQuery	TokenNameIdentifier	 Phrase Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
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
assertSubsetOf	TokenNameIdentifier	 assert Subset Of
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** same as above, with posincs */	TokenNameCOMMENT_JAVADOC	 same as above, with posincs 
public	TokenNamepublic	
void	TokenNamevoid	
testExactPhraseVersusBooleanAndWithHoles	TokenNameIdentifier	 test Exact Phrase Versus Boolean And With Holes
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
PhraseQuery	TokenNameIdentifier	 Phrase Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
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
assertSubsetOf	TokenNameIdentifier	 assert Subset Of
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** "A B" ⊆ "A B"~1 */	TokenNameCOMMENT_JAVADOC	 "A B" ⊆ "A B"~1 
public	TokenNamepublic	
void	TokenNamevoid	
testPhraseVersusSloppyPhrase	TokenNameIdentifier	 test Phrase Versus Sloppy Phrase
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
PhraseQuery	TokenNameIdentifier	 Phrase Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
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
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
/** same as above, with posincs */	TokenNameCOMMENT_JAVADOC	 same as above, with posincs 
public	TokenNamepublic	
void	TokenNamevoid	
testPhraseVersusSloppyPhraseWithHoles	TokenNameIdentifier	 test Phrase Versus Sloppy Phrase With Holes
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
PhraseQuery	TokenNameIdentifier	 Phrase Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
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
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
/** "A B" ⊆ "A (B C)" */	TokenNameCOMMENT_JAVADOC	 "A B" ⊆ "A (B C)" 
public	TokenNamepublic	
void	TokenNamevoid	
testExactPhraseVersusMultiPhrase	TokenNameIdentifier	 test Exact Phrase Versus Multi Phrase
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
PhraseQuery	TokenNameIdentifier	 Phrase Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t3	TokenNameIdentifier	 t3
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiPhraseQuery	TokenNameIdentifier	 Multi Phrase Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
MultiPhraseQuery	TokenNameIdentifier	 Multi Phrase Query
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
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
t3	TokenNameIdentifier	 t3
}	TokenNameRBRACE	
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
/** same as above, with posincs */	TokenNameCOMMENT_JAVADOC	 same as above, with posincs 
public	TokenNamepublic	
void	TokenNamevoid	
testExactPhraseVersusMultiPhraseWithHoles	TokenNameIdentifier	 test Exact Phrase Versus Multi Phrase With Holes
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
PhraseQuery	TokenNameIdentifier	 Phrase Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t3	TokenNameIdentifier	 t3
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiPhraseQuery	TokenNameIdentifier	 Multi Phrase Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
new	TokenNamenew	
MultiPhraseQuery	TokenNameIdentifier	 Multi Phrase Query
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
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
t3	TokenNameIdentifier	 t3
}	TokenNameRBRACE	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
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
/** "A B"~∞ = +A +B if A != B */	TokenNameCOMMENT_JAVADOC	 "A B"~∞ = +A +B if A != B 
public	TokenNamepublic	
void	TokenNamevoid	
testSloppyPhraseVersusBooleanAnd	TokenNameIdentifier	 test Sloppy Phrase Versus Boolean And
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
// semantics differ from SpanNear: SloppyPhrase handles repeats, 	TokenNameCOMMENT_LINE	semantics differ from SpanNear: SloppyPhrase handles repeats, 
// so we must ensure t1 != t2 	TokenNameCOMMENT_LINE	so we must ensure t1 != t2 
do	TokenNamedo	
{	TokenNameLBRACE	
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PhraseQuery	TokenNameIdentifier	 Phrase Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
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
}	TokenNameRBRACE	
