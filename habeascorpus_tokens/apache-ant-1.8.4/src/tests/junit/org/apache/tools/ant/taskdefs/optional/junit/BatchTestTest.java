/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
ComparisonFailure	TokenNameIdentifier	 Comparison Failure
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * * @author Marian Petras */	TokenNameCOMMENT_JAVADOC	 * @author Marian Petras 
public	TokenNamepublic	
class	TokenNameclass	
BatchTestTest	TokenNameIdentifier	 Batch Test Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
BatchTestTest	TokenNameIdentifier	 Batch Test Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParseTestMethodNamesList	TokenNameIdentifier	 test Parse Test Method Names List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"IllegalArgumentException expected when the param is <null>"	TokenNameStringLiteral	IllegalArgumentException expected when the param is <null>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//this is an expected exception 	TokenNameCOMMENT_LINE	this is an expected exception 
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
" ,"	TokenNameStringLiteral	 ,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
" , "	TokenNameStringLiteral	 , 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
",a"	TokenNameStringLiteral	,a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
" ,a"	TokenNameStringLiteral	 ,a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
" ,a"	TokenNameStringLiteral	 ,a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
" , a"	TokenNameStringLiteral	 , a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
" ,a "	TokenNameStringLiteral	 ,a 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
" ,a ,"	TokenNameStringLiteral	 ,a ,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"ab,,cd"	TokenNameStringLiteral	ab,,cd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"ab, ,cd"	TokenNameStringLiteral	ab, ,cd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"ab, ,cd"	TokenNameStringLiteral	ab, ,cd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"ab, ,cd,"	TokenNameStringLiteral	ab, ,cd,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
",ab, ,cd,"	TokenNameStringLiteral	,ab, ,cd,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc "	TokenNameStringLiteral	abc 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc"	TokenNameStringLiteral	 abc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc "	TokenNameStringLiteral	 abc 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc "	TokenNameStringLiteral	abc 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc,"	TokenNameStringLiteral	abc,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc, "	TokenNameStringLiteral	abc, 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc ,"	TokenNameStringLiteral	abc ,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc , "	TokenNameStringLiteral	abc , 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc ,"	TokenNameStringLiteral	 abc ,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* legal Java identifiers: */	TokenNameCOMMENT_BLOCK	 legal Java identifiers: 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"a"	TokenNameStringLiteral	a
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"a1"	TokenNameStringLiteral	a1
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"a1"	TokenNameStringLiteral	a1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"a$"	TokenNameStringLiteral	a$
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"a$"	TokenNameStringLiteral	a$
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"a$1"	TokenNameStringLiteral	a$1
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"a$1"	TokenNameStringLiteral	a$1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"_bc"	TokenNameStringLiteral	_bc
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"_bc"	TokenNameStringLiteral	_bc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"___"	TokenNameStringLiteral	___
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"___"	TokenNameStringLiteral	___
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* illegal Java identifiers: */	TokenNameCOMMENT_BLOCK	 illegal Java identifiers: 
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"1a"	TokenNameStringLiteral	1a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"1ab"	TokenNameStringLiteral	1ab
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"1abc"	TokenNameStringLiteral	1abc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"1abc d"	TokenNameStringLiteral	1abc d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"1abc de"	TokenNameStringLiteral	1abc de
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"1abc def"	TokenNameStringLiteral	1abc def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
"1abc def,"	TokenNameStringLiteral	1abc def,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
",1abc def"	TokenNameStringLiteral	,1abc def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc,def"	TokenNameStringLiteral	abc,def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc,def,"	TokenNameStringLiteral	abc,def,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc,def "	TokenNameStringLiteral	abc,def 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc, def"	TokenNameStringLiteral	abc, def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc, def "	TokenNameStringLiteral	abc, def 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc ,def"	TokenNameStringLiteral	abc ,def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc ,def "	TokenNameStringLiteral	abc ,def 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc , def"	TokenNameStringLiteral	abc , def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
"abc , def "	TokenNameStringLiteral	abc , def 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc,def"	TokenNameStringLiteral	 abc,def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc,def "	TokenNameStringLiteral	 abc,def 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc, def"	TokenNameStringLiteral	 abc, def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc, def "	TokenNameStringLiteral	 abc, def 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc ,def"	TokenNameStringLiteral	 abc ,def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc ,def "	TokenNameStringLiteral	 abc ,def 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc , def"	TokenNameStringLiteral	 abc , def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc , def "	TokenNameStringLiteral	 abc , def 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"def"	TokenNameStringLiteral	def
}	TokenNameRBRACE	
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
" abc , def ,"	TokenNameStringLiteral	 abc , def ,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
checkParseCausesIAE	TokenNameIdentifier	 check Parse Causes IAE
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
JUnitTest	TokenNameIdentifier	 J Unit Test
.	TokenNameDOT	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"IllegalArgumentException expected when the param is ""	TokenNameStringLiteral	IllegalArgumentException expected when the param is "
+	TokenNamePLUS	
param	TokenNameIdentifier	 param
+	TokenNamePLUS	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//this is an expected exception 	TokenNameCOMMENT_LINE	this is an expected exception 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ComparisonFailure	TokenNameIdentifier	 Comparison Failure
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
