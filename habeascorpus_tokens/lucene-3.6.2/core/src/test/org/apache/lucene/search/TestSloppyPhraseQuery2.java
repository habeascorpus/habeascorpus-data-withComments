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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
/** * random sloppy phrase query tests */	TokenNameCOMMENT_JAVADOC	 random sloppy phrase query tests 
public	TokenNamepublic	
class	TokenNameclass	
TestSloppyPhraseQuery2	TokenNameIdentifier	 Test Sloppy Phrase Query2
extends	TokenNameextends	
SearchEquivalenceTestBase	TokenNameIdentifier	 Search Equivalence Test Base
{	TokenNameLBRACE	
/** "A B"~N ⊆ "A B"~N+1 */	TokenNameCOMMENT_JAVADOC	 "A B"~N ⊆ "A B"~N+1 
public	TokenNamepublic	
void	TokenNamevoid	
testIncreasingSloppiness	TokenNameIdentifier	 test Increasing Sloppiness
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
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
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
}	TokenNameRBRACE	
/** same as the above with posincr */	TokenNameCOMMENT_JAVADOC	 same as the above with posincr 
public	TokenNamepublic	
void	TokenNamevoid	
testIncreasingSloppinessWithHoles	TokenNameIdentifier	 test Increasing Sloppiness With Holes
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
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
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
}	TokenNameRBRACE	
/** "A B C"~N ⊆ "A B C"~N+1 */	TokenNameCOMMENT_JAVADOC	 "A B C"~N ⊆ "A B C"~N+1 
public	TokenNamepublic	
void	TokenNamevoid	
testIncreasingSloppiness3	TokenNameIdentifier	 test Increasing Sloppiness3
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
Term	TokenNameIdentifier	 Term
t3	TokenNameIdentifier	 t3
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
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t3	TokenNameIdentifier	 t3
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
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t3	TokenNameIdentifier	 t3
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
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
}	TokenNameRBRACE	
/** same as the above with posincr */	TokenNameCOMMENT_JAVADOC	 same as the above with posincr 
public	TokenNamepublic	
void	TokenNamevoid	
testIncreasingSloppiness3WithHoles	TokenNameIdentifier	 test Increasing Sloppiness3 With Holes
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
Term	TokenNameIdentifier	 Term
t3	TokenNameIdentifier	 t3
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos1	TokenNameIdentifier	 pos1
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos2	TokenNameIdentifier	 pos2
=	TokenNameEQUAL	
pos1	TokenNameIdentifier	 pos1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
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
pos1	TokenNameIdentifier	 pos1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t3	TokenNameIdentifier	 t3
,	TokenNameCOMMA	
pos2	TokenNameIdentifier	 pos2
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
pos1	TokenNameIdentifier	 pos1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t3	TokenNameIdentifier	 t3
,	TokenNameCOMMA	
pos2	TokenNameIdentifier	 pos2
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
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
}	TokenNameRBRACE	
/** "A A"~N ⊆ "A A"~N+1 */	TokenNameCOMMENT_JAVADOC	 "A A"~N ⊆ "A A"~N+1 
public	TokenNamepublic	
void	TokenNamevoid	
testRepetitiveIncreasingSloppiness	TokenNameIdentifier	 test Repetitive Increasing Sloppiness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
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
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
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
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
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
}	TokenNameRBRACE	
/** same as the above with posincr */	TokenNameCOMMENT_JAVADOC	 same as the above with posincr 
public	TokenNamepublic	
void	TokenNamevoid	
testRepetitiveIncreasingSloppinessWithHoles	TokenNameIdentifier	 test Repetitive Increasing Sloppiness With Holes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
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
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
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
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
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
}	TokenNameRBRACE	
/** "A A A"~N ⊆ "A A A"~N+1 */	TokenNameCOMMENT_JAVADOC	 "A A A"~N ⊆ "A A A"~N+1 
public	TokenNamepublic	
void	TokenNamevoid	
testRepetitiveIncreasingSloppiness3	TokenNameIdentifier	 test Repetitive Increasing Sloppiness3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
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
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
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
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
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
}	TokenNameRBRACE	
/** same as the above with posincr */	TokenNameCOMMENT_JAVADOC	 same as the above with posincr 
public	TokenNamepublic	
void	TokenNamevoid	
testRepetitiveIncreasingSloppiness3WithHoles	TokenNameIdentifier	 test Repetitive Increasing Sloppiness3 With Holes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
randomTerm	TokenNameIdentifier	 random Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos1	TokenNameIdentifier	 pos1
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos2	TokenNameIdentifier	 pos2
=	TokenNameEQUAL	
pos1	TokenNameIdentifier	 pos1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
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
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
pos1	TokenNameIdentifier	 pos1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
pos2	TokenNameIdentifier	 pos2
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
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
pos1	TokenNameIdentifier	 pos1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
pos2	TokenNameIdentifier	 pos2
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
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
}	TokenNameRBRACE	
/** MultiPhraseQuery~N ⊆ MultiPhraseQuery~N+1 */	TokenNameCOMMENT_JAVADOC	 MultiPhraseQuery~N ⊆ MultiPhraseQuery~N+1 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomIncreasingSloppiness	TokenNameIdentifier	 test Random Increasing Sloppiness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
long	TokenNamelong	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiPhraseQuery	TokenNameIdentifier	 Multi Phrase Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
randomPhraseQuery	TokenNameIdentifier	 random Phrase Query
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiPhraseQuery	TokenNameIdentifier	 Multi Phrase Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
randomPhraseQuery	TokenNameIdentifier	 random Phrase Query
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
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
}	TokenNameRBRACE	
private	TokenNameprivate	
MultiPhraseQuery	TokenNameIdentifier	 Multi Phrase Query
randomPhraseQuery	TokenNameIdentifier	 random Phrase Query
(	TokenNameLPAREN	
long	TokenNamelong	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiPhraseQuery	TokenNameIdentifier	 Multi Phrase Query
pq	TokenNameIdentifier	 pq
=	TokenNameEQUAL	
new	TokenNamenew	
MultiPhraseQuery	TokenNameIdentifier	 Multi Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
depth	TokenNameIdentifier	 depth
]	TokenNameRBRACKET	
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
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pq	TokenNameIdentifier	 pq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
