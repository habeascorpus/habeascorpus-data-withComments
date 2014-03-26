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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
SingleFragListBuilderTest	TokenNameIdentifier	 Single Frag List Builder Test
extends	TokenNameextends	
AbstractTestCase	TokenNameIdentifier	 Abstract Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNullFieldFragList	TokenNameIdentifier	 test Null Field Frag List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SingleFragListBuilder	TokenNameIdentifier	 Single Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SingleFragListBuilder	TokenNameIdentifier	 Single Frag List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldFragList	TokenNameIdentifier	 Field Frag List
ffl	TokenNameIdentifier	 ffl
=	TokenNameEQUAL	
sflb	TokenNameIdentifier	 sflb
.	TokenNameDOT	
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
fpl	TokenNameIdentifier	 fpl
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b c d"	TokenNameStringLiteral	b c d
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ffl	TokenNameIdentifier	 ffl
.	TokenNameDOT	
getFragInfos	TokenNameIdentifier	 get Frag Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShortFieldFragList	TokenNameIdentifier	 test Short Field Frag List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SingleFragListBuilder	TokenNameIdentifier	 Single Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SingleFragListBuilder	TokenNameIdentifier	 Single Frag List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldFragList	TokenNameIdentifier	 Field Frag List
ffl	TokenNameIdentifier	 ffl
=	TokenNameEQUAL	
sflb	TokenNameIdentifier	 sflb
.	TokenNameDOT	
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
fpl	TokenNameIdentifier	 fpl
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"a b c d"	TokenNameStringLiteral	a b c d
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ffl	TokenNameIdentifier	 ffl
.	TokenNameDOT	
getFragInfos	TokenNameIdentifier	 get Frag Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"subInfos=(a((0,1)))/1.0(0,2147483647)"	TokenNameStringLiteral	subInfos=(a((0,1)))/1.0(0,2147483647)
,	TokenNameCOMMA	
ffl	TokenNameIdentifier	 ffl
.	TokenNameDOT	
getFragInfos	TokenNameIdentifier	 get Frag Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
testLongFieldFragList	TokenNameIdentifier	 test Long Field Frag List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SingleFragListBuilder	TokenNameIdentifier	 Single Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SingleFragListBuilder	TokenNameIdentifier	 Single Frag List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldFragList	TokenNameIdentifier	 Field Frag List
ffl	TokenNameIdentifier	 ffl
=	TokenNameEQUAL	
sflb	TokenNameIdentifier	 sflb
.	TokenNameDOT	
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
fpl	TokenNameIdentifier	 fpl
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"a b c d"	TokenNameStringLiteral	a b c d
,	TokenNameCOMMA	
"a b c d e f g h i"	TokenNameStringLiteral	a b c d e f g h i
,	TokenNameCOMMA	
"j k l m n o p q r s t u v w x y z a b c"	TokenNameStringLiteral	j k l m n o p q r s t u v w x y z a b c
,	TokenNameCOMMA	
"d e f g"	TokenNameStringLiteral	d e f g
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ffl	TokenNameIdentifier	 ffl
.	TokenNameDOT	
getFragInfos	TokenNameIdentifier	 get Frag Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"subInfos=(a((0,1))a((8,9))a((60,61)))/3.0(0,2147483647)"	TokenNameStringLiteral	subInfos=(a((0,1))a((8,9))a((60,61)))/3.0(0,2147483647)
,	TokenNameCOMMA	
ffl	TokenNameIdentifier	 ffl
.	TokenNameDOT	
getFragInfos	TokenNameIdentifier	 get Frag Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
private	TokenNameprivate	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
queryValue	TokenNameIdentifier	 query Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
indexValues	TokenNameIdentifier	 index Values
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
make1dmfIndex	TokenNameIdentifier	 make1dmf Index
(	TokenNameLPAREN	
indexValues	TokenNameIdentifier	 index Values
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
return	TokenNamereturn	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
