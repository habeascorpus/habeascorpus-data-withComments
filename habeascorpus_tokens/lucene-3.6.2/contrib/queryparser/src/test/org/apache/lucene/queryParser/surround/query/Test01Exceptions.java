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
Test01Exceptions	TokenNameIdentifier	 Test01 Exceptions
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** Main for running test case by itself. */	TokenNameCOMMENT_JAVADOC	 Main for running test case by itself. 
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
Test01Exceptions	TokenNameIdentifier	 Test01 Exceptions
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
/* to show actual parsing error messages */	TokenNameCOMMENT_BLOCK	 to show actual parsing error messages 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
"bi"	TokenNameStringLiteral	bi
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exceptionQueries	TokenNameIdentifier	 exception Queries
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"*"	TokenNameStringLiteral	*
,	TokenNameCOMMA	
"a*"	TokenNameStringLiteral	a*
,	TokenNameCOMMA	
"ab*"	TokenNameStringLiteral	ab*
,	TokenNameCOMMA	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
"a?"	TokenNameStringLiteral	a?
,	TokenNameCOMMA	
"ab?"	TokenNameStringLiteral	ab?
,	TokenNameCOMMA	
"a???b"	TokenNameStringLiteral	a???b
,	TokenNameCOMMA	
"a?"	TokenNameStringLiteral	a?
,	TokenNameCOMMA	
"a*b?"	TokenNameStringLiteral	a*b?
,	TokenNameCOMMA	
"word1 word2"	TokenNameStringLiteral	word1 word2
,	TokenNameCOMMA	
"word2 AND"	TokenNameStringLiteral	word2 AND
,	TokenNameCOMMA	
"word1 OR"	TokenNameStringLiteral	word1 OR
,	TokenNameCOMMA	
"AND(word2)"	TokenNameStringLiteral	AND(word2)
,	TokenNameCOMMA	
"AND(word2,)"	TokenNameStringLiteral	AND(word2,)
,	TokenNameCOMMA	
"AND(word2,word1,)"	TokenNameStringLiteral	AND(word2,word1,)
,	TokenNameCOMMA	
"OR(word2)"	TokenNameStringLiteral	OR(word2)
,	TokenNameCOMMA	
"OR(word2 ,"	TokenNameStringLiteral	OR(word2 ,
,	TokenNameCOMMA	
"OR(word2 , word1 ,)"	TokenNameStringLiteral	OR(word2 , word1 ,)
,	TokenNameCOMMA	
"xx NOT"	TokenNameStringLiteral	xx NOT
,	TokenNameCOMMA	
"xx (a AND b)"	TokenNameStringLiteral	xx (a AND b)
,	TokenNameCOMMA	
"(a AND b"	TokenNameStringLiteral	(a AND b
,	TokenNameCOMMA	
"a OR b)"	TokenNameStringLiteral	a OR b)
,	TokenNameCOMMA	
"or(word2+ not ord+, and xyz,def)"	TokenNameStringLiteral	or(word2+ not ord+, and xyz,def)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
test01Exceptions	TokenNameIdentifier	 test01 Exceptions
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
}	TokenNameRBRACE	
