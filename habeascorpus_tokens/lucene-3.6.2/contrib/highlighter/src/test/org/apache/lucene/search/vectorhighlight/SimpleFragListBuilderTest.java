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
SimpleFragListBuilderTest	TokenNameIdentifier	 Simple Frag List Builder Test
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
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
testTooSmallFragSize	TokenNameIdentifier	 test Too Small Frag Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
sflb	TokenNameIdentifier	 sflb
.	TokenNameDOT	
minFragCharSize	TokenNameIdentifier	 min Frag Char Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"IllegalArgumentException must be thrown"	TokenNameStringLiteral	IllegalArgumentException must be thrown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSmallerFragSizeThanTermQuery	TokenNameIdentifier	 test Smaller Frag Size Than Term Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
"abcdefghijklmnopqrs"	TokenNameStringLiteral	abcdefghijklmnopqrs
,	TokenNameCOMMA	
"abcdefghijklmnopqrs"	TokenNameStringLiteral	abcdefghijklmnopqrs
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sflb	TokenNameIdentifier	 sflb
.	TokenNameDOT	
minFragCharSize	TokenNameIdentifier	 min Frag Char Size
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
"subInfos=(abcdefghijklmnopqrs((0,19)))/1.0(0,19)"	TokenNameStringLiteral	subInfos=(abcdefghijklmnopqrs((0,19)))/1.0(0,19)
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
testSmallerFragSizeThanPhraseQuery	TokenNameIdentifier	 test Smaller Frag Size Than Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
""abcdefgh jklmnopqrs""	TokenNameStringLiteral	"abcdefgh jklmnopqrs"
,	TokenNameCOMMA	
"abcdefgh jklmnopqrs"	TokenNameStringLiteral	abcdefgh jklmnopqrs
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sflb	TokenNameIdentifier	 sflb
.	TokenNameDOT	
minFragCharSize	TokenNameIdentifier	 min Frag Char Size
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
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"subInfos=(abcdefghjklmnopqrs((0,21)))/1.0(0,21)"	TokenNameStringLiteral	subInfos=(abcdefghjklmnopqrs((0,21)))/1.0(0,21)
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
test1TermIndex	TokenNameIdentifier	 test1 Term Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
"a"	TokenNameStringLiteral	a
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
"subInfos=(a((0,1)))/1.0(0,100)"	TokenNameStringLiteral	subInfos=(a((0,1)))/1.0(0,100)
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
test2TermsIndex1Frag	TokenNameIdentifier	 test2 Terms Index1 Frag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
"a a"	TokenNameStringLiteral	a a
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
"subInfos=(a((0,1))a((2,3)))/2.0(0,100)"	TokenNameStringLiteral	subInfos=(a((0,1))a((2,3)))/2.0(0,100)
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
"a b b b b b b b b a"	TokenNameStringLiteral	a b b b b b b b b a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
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
"subInfos=(a((0,1))a((18,19)))/2.0(0,20)"	TokenNameStringLiteral	subInfos=(a((0,1))a((18,19)))/2.0(0,20)
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
"b b b b a b b b b a"	TokenNameStringLiteral	b b b b a b b b b a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
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
"subInfos=(a((8,9))a((18,19)))/2.0(2,22)"	TokenNameStringLiteral	subInfos=(a((8,9))a((18,19)))/2.0(2,22)
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
test2TermsIndex2Frags	TokenNameIdentifier	 test2 Terms Index2 Frags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
"a b b b b b b b b b b b b b a"	TokenNameStringLiteral	a b b b b b b b b b b b b b a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
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
"subInfos=(a((0,1)))/1.0(0,20)"	TokenNameStringLiteral	subInfos=(a((0,1)))/1.0(0,20)
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"subInfos=(a((28,29)))/1.0(22,42)"	TokenNameStringLiteral	subInfos=(a((28,29)))/1.0(22,42)
,	TokenNameCOMMA	
ffl	TokenNameIdentifier	 ffl
.	TokenNameDOT	
getFragInfos	TokenNameIdentifier	 get Frag Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"a b b b b b b b b b b b b a"	TokenNameStringLiteral	a b b b b b b b b b b b b a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
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
"subInfos=(a((0,1)))/1.0(0,20)"	TokenNameStringLiteral	subInfos=(a((0,1)))/1.0(0,20)
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"subInfos=(a((26,27)))/1.0(20,40)"	TokenNameStringLiteral	subInfos=(a((26,27)))/1.0(20,40)
,	TokenNameCOMMA	
ffl	TokenNameIdentifier	 ffl
.	TokenNameDOT	
getFragInfos	TokenNameIdentifier	 get Frag Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"a b b b b b b b b b a"	TokenNameStringLiteral	a b b b b b b b b b a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
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
"subInfos=(a((0,1)))/1.0(0,20)"	TokenNameStringLiteral	subInfos=(a((0,1)))/1.0(0,20)
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"subInfos=(a((20,21)))/1.0(20,40)"	TokenNameStringLiteral	subInfos=(a((20,21)))/1.0(20,40)
,	TokenNameCOMMA	
ffl	TokenNameIdentifier	 ffl
.	TokenNameDOT	
getFragInfos	TokenNameIdentifier	 get Frag Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
test2TermsQuery	TokenNameIdentifier	 test2 Terms Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
"a b"	TokenNameStringLiteral	a b
,	TokenNameCOMMA	
"c d e"	TokenNameStringLiteral	c d e
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
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
ffl	TokenNameIdentifier	 ffl
=	TokenNameEQUAL	
sflb	TokenNameIdentifier	 sflb
.	TokenNameDOT	
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
fpl	TokenNameIdentifier	 fpl
(	TokenNameLPAREN	
"a b"	TokenNameStringLiteral	a b
,	TokenNameCOMMA	
"d b c"	TokenNameStringLiteral	d b c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
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
"subInfos=(b((2,3)))/1.0(0,20)"	TokenNameStringLiteral	subInfos=(b((2,3)))/1.0(0,20)
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
ffl	TokenNameIdentifier	 ffl
=	TokenNameEQUAL	
sflb	TokenNameIdentifier	 sflb
.	TokenNameDOT	
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
fpl	TokenNameIdentifier	 fpl
(	TokenNameLPAREN	
"a b"	TokenNameStringLiteral	a b
,	TokenNameCOMMA	
"a b c"	TokenNameStringLiteral	a b c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
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
"subInfos=(a((0,1))b((2,3)))/2.0(0,20)"	TokenNameStringLiteral	subInfos=(a((0,1))b((2,3)))/2.0(0,20)
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
testPhraseQuery	TokenNameIdentifier	 test Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
""a b""	TokenNameStringLiteral	"a b"
,	TokenNameCOMMA	
"c d e"	TokenNameStringLiteral	c d e
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
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
ffl	TokenNameIdentifier	 ffl
=	TokenNameEQUAL	
sflb	TokenNameIdentifier	 sflb
.	TokenNameDOT	
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
fpl	TokenNameIdentifier	 fpl
(	TokenNameLPAREN	
""a b""	TokenNameStringLiteral	"a b"
,	TokenNameCOMMA	
"a c b"	TokenNameStringLiteral	a c b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
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
ffl	TokenNameIdentifier	 ffl
=	TokenNameEQUAL	
sflb	TokenNameIdentifier	 sflb
.	TokenNameDOT	
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
fpl	TokenNameIdentifier	 fpl
(	TokenNameLPAREN	
""a b""	TokenNameStringLiteral	"a b"
,	TokenNameCOMMA	
"a b c"	TokenNameStringLiteral	a b c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
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
"subInfos=(ab((0,3)))/1.0(0,20)"	TokenNameStringLiteral	subInfos=(ab((0,3)))/1.0(0,20)
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
testPhraseQuerySlop	TokenNameIdentifier	 test Phrase Query Slop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
""a b"~1"	TokenNameStringLiteral	"a b"~1
,	TokenNameCOMMA	
"a c b"	TokenNameStringLiteral	a c b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
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
"subInfos=(ab((0,1)(4,5)))/1.0(0,20)"	TokenNameStringLiteral	subInfos=(ab((0,1)(4,5)))/1.0(0,20)
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
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
"subInfos=(d((9,10)))/1.0(3,103)"	TokenNameStringLiteral	subInfos=(d((9,10)))/1.0(3,103)
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
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
"subInfos=(searchengines((102,116))searchengines((157,171)))/2.0(96,196)"	TokenNameStringLiteral	subInfos=(searchengines((102,116))searchengines((157,171)))/2.0(96,196)
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
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
sflb	TokenNameIdentifier	 sflb
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
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
"subInfos=(sppeeeed((88,93)))/1.0(82,182)"	TokenNameStringLiteral	subInfos=(sppeeeed((88,93)))/1.0(82,182)
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
}	TokenNameRBRACE	
