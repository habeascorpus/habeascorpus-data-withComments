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
Test03Distance	TokenNameIdentifier	 Test03 Distance
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
Test03Distance	TokenNameIdentifier	 Test03 Distance
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
exceptionQueries	TokenNameIdentifier	 exception Queries
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"(aa and bb) w cc"	TokenNameStringLiteral	(aa and bb) w cc
,	TokenNameCOMMA	
"(aa or bb) w (cc and dd)"	TokenNameStringLiteral	(aa or bb) w (cc and dd)
,	TokenNameCOMMA	
"(aa opt bb) w cc"	TokenNameStringLiteral	(aa opt bb) w cc
,	TokenNameCOMMA	
"(aa not bb) w cc"	TokenNameStringLiteral	(aa not bb) w cc
,	TokenNameCOMMA	
"(aa or bb) w (bi:cc)"	TokenNameStringLiteral	(aa or bb) w (bi:cc)
,	TokenNameCOMMA	
"(aa or bb) w bi:cc"	TokenNameStringLiteral	(aa or bb) w bi:cc
,	TokenNameCOMMA	
"(aa or bi:bb) w cc"	TokenNameStringLiteral	(aa or bi:bb) w cc
,	TokenNameCOMMA	
"(aa or (bi:bb)) w cc"	TokenNameStringLiteral	(aa or (bi:bb)) w cc
,	TokenNameCOMMA	
"(aa or (bb and dd)) w cc"	TokenNameStringLiteral	(aa or (bb and dd)) w cc
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
test00Exceptions	TokenNameIdentifier	 test00 Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
ExceptionQueryTst	TokenNameIdentifier	 Exception Query Tst
.	TokenNameDOT	
getFailQueries	TokenNameIdentifier	 get Fail Queries
(	TokenNameLPAREN	
exceptionQueries	TokenNameIdentifier	 exception Queries
,	TokenNameCOMMA	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"No ParseException for: "	TokenNameStringLiteral	No ParseException for: 
+	TokenNamePLUS	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
"bi"	TokenNameStringLiteral	bi
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
private	TokenNameprivate	
void	TokenNamevoid	
distanceTst	TokenNameIdentifier	 distance Tst
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
,	TokenNameCOMMA	
SingleFieldTestDb	TokenNameIdentifier	 Single Field Test Db
db	TokenNameIdentifier	 db
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
db	TokenNameIdentifier	 db
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
distanceTest1	TokenNameIdentifier	 distance Test1
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
distanceTst	TokenNameIdentifier	 distance Tst
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
,	TokenNameCOMMA	
db1	TokenNameIdentifier	 db1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0W01	TokenNameIdentifier	 test0 W01
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word1 w word2"	TokenNameStringLiteral	word1 w word2
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0N01	TokenNameIdentifier	 test0 N01
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word1 n word2"	TokenNameStringLiteral	word1 n word2
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0N01r	TokenNameIdentifier	 test0 N01r
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* r reverse */	TokenNameCOMMENT_BLOCK	 r reverse 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expdnrs	TokenNameIdentifier	 expdnrs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word2 n word1"	TokenNameStringLiteral	word2 n word1
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0W02	TokenNameIdentifier	 test0 W02
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word2 w word1"	TokenNameStringLiteral	word2 w word1
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0W03	TokenNameIdentifier	 test0 W03
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word2 2W word1"	TokenNameStringLiteral	word2 2W word1
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0N03	TokenNameIdentifier	 test0 N03
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word2 2N word1"	TokenNameStringLiteral	word2 2N word1
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0N03r	TokenNameIdentifier	 test0 N03r
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word1 2N word2"	TokenNameStringLiteral	word1 2N word2
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0W04	TokenNameIdentifier	 test0 W04
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word2 3w word1"	TokenNameStringLiteral	word2 3w word1
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0N04	TokenNameIdentifier	 test0 N04
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word2 3n word1"	TokenNameStringLiteral	word2 3n word1
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0N04r	TokenNameIdentifier	 test0 N04r
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word1 3n word2"	TokenNameStringLiteral	word1 3n word2
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0W05	TokenNameIdentifier	 test0 W05
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"orda1 w orda3"	TokenNameStringLiteral	orda1 w orda3
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test0W06	TokenNameIdentifier	 test0 W06
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"orda1 2w orda3"	TokenNameStringLiteral	orda1 2w orda3
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Wtrunc01	TokenNameIdentifier	 test1 Wtrunc01
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word1* w word2"	TokenNameStringLiteral	word1* w word2
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Wtrunc02	TokenNameIdentifier	 test1 Wtrunc02
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word* w word2"	TokenNameStringLiteral	word* w word2
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Wtrunc02r	TokenNameIdentifier	 test1 Wtrunc02r
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word2 w word*"	TokenNameStringLiteral	word2 w word*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Ntrunc02	TokenNameIdentifier	 test1 Ntrunc02
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word* n word2"	TokenNameStringLiteral	word* n word2
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Ntrunc02r	TokenNameIdentifier	 test1 Ntrunc02r
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word2 n word*"	TokenNameStringLiteral	word2 n word*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Wtrunc03	TokenNameIdentifier	 test1 Wtrunc03
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word1* w word2*"	TokenNameStringLiteral	word1* w word2*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Ntrunc03	TokenNameIdentifier	 test1 Ntrunc03
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word1* N word2*"	TokenNameStringLiteral	word1* N word2*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Wtrunc04	TokenNameIdentifier	 test1 Wtrunc04
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"kxork* w kxor*"	TokenNameStringLiteral	kxork* w kxor*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Ntrunc04	TokenNameIdentifier	 test1 Ntrunc04
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"kxork* 99n kxor*"	TokenNameStringLiteral	kxork* 99n kxor*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Wtrunc05	TokenNameIdentifier	 test1 Wtrunc05
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word2* 2W word1*"	TokenNameStringLiteral	word2* 2W word1*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Ntrunc05	TokenNameIdentifier	 test1 Ntrunc05
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word2* 2N word1*"	TokenNameStringLiteral	word2* 2N word1*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Wtrunc06	TokenNameIdentifier	 test1 Wtrunc06
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"ord* W word*"	TokenNameStringLiteral	ord* W word*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Ntrunc06	TokenNameIdentifier	 test1 Ntrunc06
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"ord* N word*"	TokenNameStringLiteral	ord* N word*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Ntrunc06r	TokenNameIdentifier	 test1 Ntrunc06r
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"word* N ord*"	TokenNameStringLiteral	word* N ord*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Wtrunc07	TokenNameIdentifier	 test1 Wtrunc07
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"(orda2 OR orda3) W word*"	TokenNameStringLiteral	(orda2 OR orda3) W word*
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Wtrunc08	TokenNameIdentifier	 test1 Wtrunc08
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"(orda2 OR orda3) W (word2 OR worda3)"	TokenNameStringLiteral	(orda2 OR orda3) W (word2 OR worda3)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Wtrunc09	TokenNameIdentifier	 test1 Wtrunc09
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"(orda2 OR orda3) 2W (word2 OR worda3)"	TokenNameStringLiteral	(orda2 OR orda3) 2W (word2 OR worda3)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1Ntrunc09	TokenNameIdentifier	 test1 Ntrunc09
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
distanceTest1	TokenNameIdentifier	 distance Test1
(	TokenNameLPAREN	
"(orda2 OR orda3) 2N (word2 OR worda3)"	TokenNameStringLiteral	(orda2 OR orda3) 2N (word2 OR worda3)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs2	TokenNameIdentifier	 docs2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"w1 w2 w3 w4 w5"	TokenNameStringLiteral	w1 w2 w3 w4 w5
,	TokenNameCOMMA	
"w1 w3 w2 w3"	TokenNameStringLiteral	w1 w3 w2 w3
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SingleFieldTestDb	TokenNameIdentifier	 Single Field Test Db
db2	TokenNameIdentifier	 db2
=	TokenNameEQUAL	
new	TokenNamenew	
SingleFieldTestDb	TokenNameIdentifier	 Single Field Test Db
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
docs2	TokenNameIdentifier	 docs2
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
distanceTest2	TokenNameIdentifier	 distance Test2
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
distanceTst	TokenNameIdentifier	 distance Tst
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
,	TokenNameCOMMA	
db2	TokenNameIdentifier	 db2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Wprefix01	TokenNameIdentifier	 test2 Wprefix01
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
distanceTest2	TokenNameIdentifier	 distance Test2
(	TokenNameLPAREN	
"W (w1, w2, w3)"	TokenNameStringLiteral	W (w1, w2, w3)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Nprefix01a	TokenNameIdentifier	 test2 Nprefix01a
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
distanceTest2	TokenNameIdentifier	 distance Test2
(	TokenNameLPAREN	
"N(w1, w2, w3)"	TokenNameStringLiteral	N(w1, w2, w3)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Nprefix01b	TokenNameIdentifier	 test2 Nprefix01b
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
distanceTest2	TokenNameIdentifier	 distance Test2
(	TokenNameLPAREN	
"N(w3, w1, w2)"	TokenNameStringLiteral	N(w3, w1, w2)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Wprefix02	TokenNameIdentifier	 test2 Wprefix02
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
distanceTest2	TokenNameIdentifier	 distance Test2
(	TokenNameLPAREN	
"2W(w1,w2,w3)"	TokenNameStringLiteral	2W(w1,w2,w3)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Nprefix02a	TokenNameIdentifier	 test2 Nprefix02a
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
distanceTest2	TokenNameIdentifier	 distance Test2
(	TokenNameLPAREN	
"2N(w1,w2,w3)"	TokenNameStringLiteral	2N(w1,w2,w3)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Nprefix02b	TokenNameIdentifier	 test2 Nprefix02b
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
distanceTest2	TokenNameIdentifier	 distance Test2
(	TokenNameLPAREN	
"2N(w2,w3,w1)"	TokenNameStringLiteral	2N(w2,w3,w1)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Wnested01	TokenNameIdentifier	 test2 Wnested01
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
distanceTest2	TokenNameIdentifier	 distance Test2
(	TokenNameLPAREN	
"w1 W w2 W w3"	TokenNameStringLiteral	w1 W w2 W w3
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Nnested01	TokenNameIdentifier	 test2 Nnested01
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
distanceTest2	TokenNameIdentifier	 distance Test2
(	TokenNameLPAREN	
"w1 N w2 N w3"	TokenNameStringLiteral	w1 N w2 N w3
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Wnested02	TokenNameIdentifier	 test2 Wnested02
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
distanceTest2	TokenNameIdentifier	 distance Test2
(	TokenNameLPAREN	
"w1 2W w2 2W w3"	TokenNameStringLiteral	w1 2W w2 2W w3
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2Nnested02	TokenNameIdentifier	 test2 Nnested02
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
distanceTest2	TokenNameIdentifier	 distance Test2
(	TokenNameLPAREN	
"w1 2N w2 2N w3"	TokenNameStringLiteral	w1 2N w2 2N w3
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs3	TokenNameIdentifier	 docs3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"low pressure temperature inversion and rain"	TokenNameStringLiteral	low pressure temperature inversion and rain
,	TokenNameCOMMA	
"when the temperature has a negative height above a depression no precipitation gradient is expected"	TokenNameStringLiteral	when the temperature has a negative height above a depression no precipitation gradient is expected
,	TokenNameCOMMA	
"when the temperature has a negative height gradient above a depression no precipitation is expected"	TokenNameStringLiteral	when the temperature has a negative height gradient above a depression no precipitation is expected
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SingleFieldTestDb	TokenNameIdentifier	 Single Field Test Db
db3	TokenNameIdentifier	 db3
=	TokenNameEQUAL	
new	TokenNamenew	
SingleFieldTestDb	TokenNameIdentifier	 Single Field Test Db
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
docs3	TokenNameIdentifier	 docs3
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
distanceTest3	TokenNameIdentifier	 distance Test3
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
distanceTst	TokenNameIdentifier	 distance Tst
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
,	TokenNameCOMMA	
db3	TokenNameIdentifier	 db3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3Example01	TokenNameIdentifier	 test3 Example01
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
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// query does not match doc 1 because "gradient" is in wrong place there. 	TokenNameCOMMENT_LINE	query does not match doc 1 because "gradient" is in wrong place there. 
distanceTest3	TokenNameIdentifier	 distance Test3
(	TokenNameLPAREN	
"50n((low w pressure*) or depression*,"	TokenNameStringLiteral	50n((low w pressure*) or depression*,
+	TokenNamePLUS	
"5n(temperat*, (invers* or (negativ* 3n gradient*))),"	TokenNameStringLiteral	5n(temperat*, (invers* or (negativ* 3n gradient*))),
+	TokenNamePLUS	
"rain* or precipitat*)"	TokenNameStringLiteral	rain* or precipitat*)
,	TokenNameCOMMA	
expdnrs	TokenNameIdentifier	 expdnrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
