package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
surround	TokenNameIdentifier	 surround
.	TokenNameDOT	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestSuite	TokenNameIdentifier	 Test Suite
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
textui	TokenNameIdentifier	 textui
.	TokenNameDOT	
TestRunner	TokenNameIdentifier	 Test Runner
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
public	TokenNamepublic	
class	TokenNameclass	
Test02Boolean	TokenNameIdentifier	 Test02 Boolean
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestRunner	TokenNameIdentifier	 Test Runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
new	TokenNamenew	
TestSuite	TokenNameIdentifier	 Test Suite
(	TokenNameLPAREN	
Test02Boolean	TokenNameIdentifier	 Test02 Boolean
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
"bi"	TokenNameStringLiteral	bi
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxBasicQueries	TokenNameIdentifier	 max Basic Queries
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs1	TokenNameIdentifier	 docs1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"word1 word2 word3"	TokenNameStringLiteral	word1 word2 word3
,	TokenNameCOMMA	
"word4 word5"	TokenNameStringLiteral	word4 word5
,	TokenNameCOMMA	
"ord1 ord2 ord3"	TokenNameStringLiteral	ord1 ord2 ord3
,	TokenNameCOMMA	
"orda1 orda2 orda3 word2 worda3"	TokenNameStringLiteral	orda1 orda2 orda3 word2 worda3
,	TokenNameCOMMA	
"a c e a b c"	TokenNameStringLiteral	a c e a b c
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SingleFieldTestDb	TokenNameIdentifier	 Single Field Test Db
db1	TokenNameIdentifier	 db1
=	TokenNameEQUAL	
new	TokenNamenew	
SingleFieldTestDb	TokenNameIdentifier	 Single Field Test Db
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
docs1	TokenNameIdentifier	 docs1
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanQueryTst	TokenNameIdentifier	 Boolean Query Tst
bqt	TokenNameIdentifier	 bqt
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQueryTst	TokenNameIdentifier	 Boolean Query Tst
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
,	TokenNameCOMMA	
db1	TokenNameIdentifier	 db1
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
(	TokenNameLPAREN	
maxBasicQueries	TokenNameIdentifier	 max Basic Queries
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bqt	TokenNameIdentifier	 bqt
.	TokenNameDOT	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bqt	TokenNameIdentifier	 bqt
.	TokenNameDOT	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms01	TokenNameIdentifier	 test02 Terms01
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"word1"	TokenNameStringLiteral	word1
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms02	TokenNameIdentifier	 test02 Terms02
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"word*"	TokenNameStringLiteral	word*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms03	TokenNameIdentifier	 test02 Terms03
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"ord2"	TokenNameStringLiteral	ord2
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms04	TokenNameIdentifier	 test02 Terms04
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"kxork*"	TokenNameStringLiteral	kxork*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms05	TokenNameIdentifier	 test02 Terms05
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"wor*"	TokenNameStringLiteral	wor*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms06	TokenNameIdentifier	 test02 Terms06
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms10	TokenNameIdentifier	 test02 Terms10
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"abc?"	TokenNameStringLiteral	abc?
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms13	TokenNameIdentifier	 test02 Terms13
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"word?"	TokenNameStringLiteral	word?
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms14	TokenNameIdentifier	 test02 Terms14
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"w?rd?"	TokenNameStringLiteral	w?rd?
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms20	TokenNameIdentifier	 test02 Terms20
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"w*rd?"	TokenNameStringLiteral	w*rd?
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms21	TokenNameIdentifier	 test02 Terms21
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"w*rd??"	TokenNameStringLiteral	w*rd??
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms22	TokenNameIdentifier	 test02 Terms22
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"w*?da?"	TokenNameStringLiteral	w*?da?
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02Terms23	TokenNameIdentifier	 test02 Terms23
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"w?da?"	TokenNameStringLiteral	w?da?
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test03And01	TokenNameIdentifier	 test03 And01
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"word1 AND word2"	TokenNameStringLiteral	word1 AND word2
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test03And02	TokenNameIdentifier	 test03 And02
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"word* and ord*"	TokenNameStringLiteral	word* and ord*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test03And03	TokenNameIdentifier	 test03 And03
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"and(word1,word2)"	TokenNameStringLiteral	and(word1,word2)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test04Or01	TokenNameIdentifier	 test04 Or01
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"word1 or word2"	TokenNameStringLiteral	word1 or word2
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test04Or02	TokenNameIdentifier	 test04 Or02
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"word* OR ord*"	TokenNameStringLiteral	word* OR ord*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test04Or03	TokenNameIdentifier	 test04 Or03
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"OR (word1, word2)"	TokenNameStringLiteral	OR (word1, word2)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test05Not01	TokenNameIdentifier	 test05 Not01
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"word2 NOT word1"	TokenNameStringLiteral	word2 NOT word1
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test05Not02	TokenNameIdentifier	 test05 Not02
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"word2* not ord*"	TokenNameStringLiteral	word2* not ord*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test06AndOr01	TokenNameIdentifier	 test06 And Or01
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"(word1 or ab)and or(word2,xyz, defg)"	TokenNameStringLiteral	(word1 or ab)and or(word2,xyz, defg)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test07AndOrNot02	TokenNameIdentifier	 test07 And Or Not02
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
normalTest1	TokenNameIdentifier	 normal Test1
(	TokenNameLPAREN	
"or( word2* not ord*, and(xyz,def))"	TokenNameStringLiteral	or( word2* not ord*, and(xyz,def))
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
