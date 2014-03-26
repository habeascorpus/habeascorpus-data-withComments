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
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ScoreOrderFragmentsBuilderTest	TokenNameIdentifier	 Score Order Fragments Builder Test
extends	TokenNameextends	
AbstractTestCase	TokenNameIdentifier	 Abstract Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3Frags	TokenNameIdentifier	 test3 Frags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FieldFragList	TokenNameIdentifier	 Field Frag List
ffl	TokenNameIdentifier	 ffl
=	TokenNameEQUAL	
ffl	TokenNameIdentifier	 ffl
(	TokenNameLPAREN	
"a c"	TokenNameStringLiteral	a c
,	TokenNameCOMMA	
"a b b b b b b b b b b b a b a b b b b b c a a b b"	TokenNameStringLiteral	a b b b b b b b b b b b a b a b b b b b c a a b b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreOrderFragmentsBuilder	TokenNameIdentifier	 Score Order Fragments Builder
sofb	TokenNameIdentifier	 sofb
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreOrderFragmentsBuilder	TokenNameIdentifier	 Score Order Fragments Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
sofb	TokenNameIdentifier	 sofb
.	TokenNameDOT	
createFragments	TokenNameIdentifier	 create Fragments
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
ffl	TokenNameIdentifier	 ffl
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check score order 	TokenNameCOMMENT_LINE	check score order 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<b>c</b> <b>a</b> <b>a</b> b b"	TokenNameStringLiteral	<b>c</b> <b>a</b> <b>a</b> b b
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"b b <b>a</b> b <b>a</b> b b b b b c"	TokenNameStringLiteral	b b <b>a</b> b <b>a</b> b b b b b c
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<b>a</b> b b b b b b b b b b"	TokenNameStringLiteral	<b>a</b> b b b b b b b b b b
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
FieldFragList	TokenNameIdentifier	 Field Frag List
ffl	TokenNameIdentifier	 ffl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
queryValue	TokenNameIdentifier	 query Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
indexValue	TokenNameIdentifier	 index Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
make1d1fIndex	TokenNameIdentifier	 make1d1f Index
(	TokenNameLPAREN	
indexValue	TokenNameIdentifier	 index Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
paW	TokenNameIdentifier	 pa W
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
queryValue	TokenNameIdentifier	 query Value
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
return	TokenNamereturn	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
fpl	TokenNameIdentifier	 fpl
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
