package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
vectorhighlight	TokenNameIdentifier	 vectorhighlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
FieldPhraseListTest	TokenNameIdentifier	 Field Phrase List Test
extends	TokenNameextends	
AbstractTestCase	TokenNameIdentifier	 Abstract Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1TermIndex	TokenNameIdentifier	 test1 Term Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
make1d1fIndex	TokenNameIdentifier	 make1d1f Index
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"a(1.0)((0,1))"	TokenNameStringLiteral	a(1.0)((0,1))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2TermsIndex	TokenNameIdentifier	 test2 Terms Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
make1d1fIndex	TokenNameIdentifier	 make1d1f Index
(	TokenNameLPAREN	
"a a"	TokenNameStringLiteral	a a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"a(1.0)((0,1))"	TokenNameStringLiteral	a(1.0)((0,1))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"a(1.0)((2,3))"	TokenNameStringLiteral	a(1.0)((2,3))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1PhraseIndex	TokenNameIdentifier	 test1 Phrase Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
make1d1fIndex	TokenNameIdentifier	 make1d1f Index
(	TokenNameLPAREN	
"a b"	TokenNameStringLiteral	a b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ab(1.0)((0,3))"	TokenNameStringLiteral	ab(1.0)((0,3))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"b(1.0)((2,3))"	TokenNameStringLiteral	b(1.0)((2,3))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1PhraseIndexB	TokenNameIdentifier	 test1 Phrase Index B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// 01 12 23 34 45 56 67 78 (offsets) 	TokenNameCOMMENT_LINE	01 12 23 34 45 56 67 78 (offsets) 
// bb|bb|ba|ac|cb|ba|ab|bc 	TokenNameCOMMENT_LINE	bb|bb|ba|ac|cb|ba|ab|bc 
// 0 1 2 3 4 5 6 7 (positions) 	TokenNameCOMMENT_LINE	0 1 2 3 4 5 6 7 (positions) 
make1d1fIndexB	TokenNameIdentifier	 make1d1f Index B
(	TokenNameLPAREN	
"bbbacbabc"	TokenNameStringLiteral	bbbacbabc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"ba"	TokenNameStringLiteral	ba
,	TokenNameCOMMA	
"ac"	TokenNameStringLiteral	ac
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"baac(1.0)((2,5))"	TokenNameStringLiteral	baac(1.0)((2,5))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2ConcatTermsIndexB	TokenNameIdentifier	 test2 Concat Terms Index B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// 01 12 23 (offsets) 	TokenNameCOMMENT_LINE	01 12 23 (offsets) 
// ab|ba|ab 	TokenNameCOMMENT_LINE	ab|ba|ab 
// 0 1 2 (positions) 	TokenNameCOMMENT_LINE	0 1 2 (positions) 
make1d1fIndexB	TokenNameIdentifier	 make1d1f Index B
(	TokenNameLPAREN	
"abab"	TokenNameStringLiteral	abab
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ab(1.0)((0,2))"	TokenNameStringLiteral	ab(1.0)((0,2))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ab(1.0)((2,4))"	TokenNameStringLiteral	ab(1.0)((2,4))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Terms1PhraseIndex	TokenNameIdentifier	 test2 Terms1 Phrase Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
make1d1fIndex	TokenNameIdentifier	 make1d1f Index
(	TokenNameLPAREN	
"c a a b"	TokenNameStringLiteral	c a a b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// phraseHighlight = true 	TokenNameCOMMENT_LINE	phraseHighlight = true 
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ab(1.0)((4,7))"	TokenNameStringLiteral	ab(1.0)((4,7))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// phraseHighlight = false 	TokenNameCOMMENT_LINE	phraseHighlight = false 
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"a(1.0)((2,3))"	TokenNameStringLiteral	a(1.0)((2,3))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ab(1.0)((4,7))"	TokenNameStringLiteral	ab(1.0)((4,7))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPhraseSlop	TokenNameIdentifier	 test Phrase Slop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
make1d1fIndex	TokenNameIdentifier	 make1d1f Index
(	TokenNameLPAREN	
"c a a b c"	TokenNameStringLiteral	c a a b c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
2F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ac(2.0)((4,5)(8,9))"	TokenNameStringLiteral	ac(2.0)((4,5)(8,9))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2PhrasesOverlap	TokenNameIdentifier	 test2 Phrases Overlap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
make1d1fIndex	TokenNameIdentifier	 make1d1f Index
(	TokenNameLPAREN	
"d a b c d"	TokenNameStringLiteral	d a b c d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"abc(1.0)((2,7))"	TokenNameStringLiteral	abc(1.0)((2,7))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3TermsPhrase	TokenNameIdentifier	 test3 Terms Phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
make1d1fIndex	TokenNameIdentifier	 make1d1f Index
(	TokenNameLPAREN	
"d a b a b c d"	TokenNameStringLiteral	d a b a b c d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"abc(1.0)((6,11))"	TokenNameStringLiteral	abc(1.0)((6,11))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSearchLongestPhrase	TokenNameIdentifier	 test Search Longest Phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
make1d1fIndex	TokenNameIdentifier	 make1d1f Index
(	TokenNameLPAREN	
"d a b d c a b c"	TokenNameStringLiteral	d a b d c a b c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ab(1.0)((2,5))"	TokenNameStringLiteral	ab(1.0)((2,5))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"abc(1.0)((10,15))"	TokenNameStringLiteral	abc(1.0)((10,15))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1PhraseShortMV	TokenNameIdentifier	 test1 Phrase Short MV
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndexShortMV	TokenNameIdentifier	 make Index Short MV
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"d"	TokenNameStringLiteral	d
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"d(1.0)((9,10))"	TokenNameStringLiteral	d(1.0)((9,10))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1PhraseLongMV	TokenNameIdentifier	 test1 Phrase Long MV
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndexLongMV	TokenNameIdentifier	 make Index Long MV
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"search"	TokenNameStringLiteral	search
,	TokenNameCOMMA	
"engines"	TokenNameStringLiteral	engines
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"searchengines(1.0)((102,116))"	TokenNameStringLiteral	searchengines(1.0)((102,116))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"searchengines(1.0)((157,171))"	TokenNameStringLiteral	searchengines(1.0)((157,171))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1PhraseLongMVB	TokenNameIdentifier	 test1 Phrase Long MVB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndexLongMVB	TokenNameIdentifier	 make Index Long MVB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"sp"	TokenNameStringLiteral	sp
,	TokenNameCOMMA	
"pe"	TokenNameStringLiteral	pe
,	TokenNameCOMMA	
"ee"	TokenNameStringLiteral	ee
,	TokenNameCOMMA	
"ed"	TokenNameStringLiteral	ed
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "speed" -(2gram)-> "sp","pe","ee","ed" 	TokenNameCOMMENT_LINE	"speed" -(2gram)-> "sp","pe","ee","ed" 
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"sppeeeed(1.0)((88,93))"	TokenNameStringLiteral	sppeeeed(1.0)((88,93))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* This test shows a big speedup from limiting the number of analyzed phrases in * this bad case for FieldPhraseList */	TokenNameCOMMENT_BLOCK	 This test shows a big speedup from limiting the number of analyzed phrases in this bad case for FieldPhraseList 
/* But it is not reliable as a unit test since it is timing-dependent public void testManyRepeatedTerms() throws Exception { long t = System.currentTimeMillis(); testManyTermsWithLimit (-1); long t1 = System.currentTimeMillis(); testManyTermsWithLimit (1); long t2 = System.currentTimeMillis(); assertTrue (t2-t1 * 1000 < t1-t); } private void testManyTermsWithLimit (int limit) throws Exception { StringBuilder buf = new StringBuilder (); for (int i = 0; i < 16000; i++) { buf.append("a b c "); } make1d1fIndex( buf.toString()); Query query = tq("a"); FieldQuery fq = new FieldQuery( query, true, true ); FieldTermStack stack = new FieldTermStack( reader, 0, F, fq ); FieldPhraseList fpl = new FieldPhraseList( stack, fq, limit); if (limit < 0 || limit > 16000) assertEquals( 16000, fpl.phraseList.size() ); else assertEquals( limit, fpl.phraseList.size() ); assertEquals( "a(1.0)((0,1))", fpl.phraseList.get( 0 ).toString() ); } */	TokenNameCOMMENT_BLOCK	 But it is not reliable as a unit test since it is timing-dependent public void testManyRepeatedTerms() throws Exception { long t = System.currentTimeMillis(); testManyTermsWithLimit (-1); long t1 = System.currentTimeMillis(); testManyTermsWithLimit (1); long t2 = System.currentTimeMillis(); assertTrue (t2-t1 1000 < t1-t); } private void testManyTermsWithLimit (int limit) throws Exception { StringBuilder buf = new StringBuilder (); for (int i = 0; i < 16000; i++) { buf.append("a b c "); } make1d1fIndex( buf.toString()); Query query = tq("a"); FieldQuery fq = new FieldQuery( query, true, true ); FieldTermStack stack = new FieldTermStack( reader, 0, F, fq ); FieldPhraseList fpl = new FieldPhraseList( stack, fq, limit); if (limit < 0 || limit > 16000) assertEquals( 16000, fpl.phraseList.size() ); else assertEquals( limit, fpl.phraseList.size() ); assertEquals( "a(1.0)((0,1))", fpl.phraseList.get( 0 ).toString() ); } 
}	TokenNameRBRACE	
