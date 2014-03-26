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
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestResult	TokenNameIdentifier	 Test Result
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
JUnitVersionHelperTest	TokenNameIdentifier	 J Unit Version Helper Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
JUnitVersionHelperTest	TokenNameIdentifier	 J Unit Version Helper Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMyOwnName	TokenNameIdentifier	 test My Own Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"testMyOwnName"	TokenNameStringLiteral	testMyOwnName
,	TokenNameCOMMA	
JUnitVersionHelper	TokenNameIdentifier	 J Unit Version Helper
.	TokenNameDOT	
getTestCaseName	TokenNameIdentifier	 get Test Case Name
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNonTestCaseName	TokenNameIdentifier	 test Non Test Case Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"I'm a foo"	TokenNameStringLiteral	I'm a foo
,	TokenNameCOMMA	
JUnitVersionHelper	TokenNameIdentifier	 J Unit Version Helper
.	TokenNameDOT	
getTestCaseName	TokenNameIdentifier	 get Test Case Name
(	TokenNameLPAREN	
new	TokenNamenew	
Foo1	TokenNameIdentifier	 Foo1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoStringReturn	TokenNameIdentifier	 test No String Return
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"unknown"	TokenNameStringLiteral	unknown
,	TokenNameCOMMA	
JUnitVersionHelper	TokenNameIdentifier	 J Unit Version Helper
.	TokenNameDOT	
getTestCaseName	TokenNameIdentifier	 get Test Case Name
(	TokenNameLPAREN	
new	TokenNamenew	
Foo2	TokenNameIdentifier	 Foo2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoGetName	TokenNameIdentifier	 test No Get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"unknown"	TokenNameStringLiteral	unknown
,	TokenNameCOMMA	
JUnitVersionHelper	TokenNameIdentifier	 J Unit Version Helper
.	TokenNameDOT	
getTestCaseName	TokenNameIdentifier	 get Test Case Name
(	TokenNameLPAREN	
new	TokenNamenew	
Foo3	TokenNameIdentifier	 Foo3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNameNotGetName	TokenNameIdentifier	 test Name Not Get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"I'm a foo, too"	TokenNameStringLiteral	I'm a foo, too
,	TokenNameCOMMA	
JUnitVersionHelper	TokenNameIdentifier	 J Unit Version Helper
.	TokenNameDOT	
getTestCaseName	TokenNameIdentifier	 get Test Case Name
(	TokenNameLPAREN	
new	TokenNamenew	
Foo4	TokenNameIdentifier	 Foo4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNull	TokenNameIdentifier	 test Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"unknown"	TokenNameStringLiteral	unknown
,	TokenNameCOMMA	
JUnitVersionHelper	TokenNameIdentifier	 J Unit Version Helper
.	TokenNameDOT	
getTestCaseName	TokenNameIdentifier	 get Test Case Name
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTestCaseSubClass	TokenNameIdentifier	 test Test Case Sub Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"overridden getName"	TokenNameStringLiteral	overridden getName
,	TokenNameCOMMA	
JUnitVersionHelper	TokenNameIdentifier	 J Unit Version Helper
.	TokenNameDOT	
getTestCaseName	TokenNameIdentifier	 get Test Case Name
(	TokenNameLPAREN	
new	TokenNamenew	
Foo5	TokenNameIdentifier	 Foo5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Foo	TokenNameIdentifier	 Foo
implements	TokenNameimplements	
Test	TokenNameIdentifier	 Test
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
countTestCases	TokenNameIdentifier	 count Test Cases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
TestResult	TokenNameIdentifier	 Test Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Foo1	TokenNameIdentifier	 Foo1
extends	TokenNameextends	
Foo	TokenNameIdentifier	 Foo
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"I'm a foo"	TokenNameStringLiteral	I'm a foo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Foo2	TokenNameIdentifier	 Foo2
extends	TokenNameextends	
Foo	TokenNameIdentifier	 Foo
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Foo3	TokenNameIdentifier	 Foo3
extends	TokenNameextends	
Foo	TokenNameIdentifier	 Foo
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Foo4	TokenNameIdentifier	 Foo4
extends	TokenNameextends	
Foo	TokenNameIdentifier	 Foo
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"I'm a foo, too"	TokenNameStringLiteral	I'm a foo, too
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Foo5	TokenNameIdentifier	 Foo5
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"overridden getName"	TokenNameStringLiteral	overridden getName
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
