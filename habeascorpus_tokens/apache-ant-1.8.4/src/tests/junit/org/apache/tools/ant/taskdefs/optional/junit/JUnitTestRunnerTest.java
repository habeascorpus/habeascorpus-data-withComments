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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Small testcase for the runner, tests are very very very basics. * They must be enhanced with time. * */	TokenNameCOMMENT_JAVADOC	 Small testcase for the runner, tests are very very very basics. They must be enhanced with time. 
public	TokenNamepublic	
class	TokenNameclass	
JUnitTestRunnerTest	TokenNameIdentifier	 J Unit Test Runner Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
// mandatory constructor 	TokenNameCOMMENT_LINE	mandatory constructor 
public	TokenNamepublic	
JUnitTestRunnerTest	TokenNameIdentifier	 J Unit Test Runner Test
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
// check that a valid method name generates no errors 	TokenNameCOMMENT_LINE	check that a valid method name generates no errors 
public	TokenNamepublic	
void	TokenNamevoid	
testValidMethod	TokenNameIdentifier	 test Valid Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestRunner	TokenNameIdentifier	 Test Runner
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
createRunnerForTestMethod	TokenNameIdentifier	 create Runner For Test Method
(	TokenNameLPAREN	
ValidMethodTestCase	TokenNameIdentifier	 Valid Method Test Case
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"testA"	TokenNameStringLiteral	testA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getFormatter	TokenNameIdentifier	 get Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
.	TokenNameDOT	
SUCCESS	TokenNameIdentifier	 SUCCESS
,	TokenNameCOMMA	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getRetCode	TokenNameIdentifier	 get Ret Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check that having an invalid method name generates an error 	TokenNameCOMMENT_LINE	check that having an invalid method name generates an error 
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidMethod	TokenNameIdentifier	 test Invalid Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestRunner	TokenNameIdentifier	 Test Runner
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
createRunnerForTestMethod	TokenNameIdentifier	 create Runner For Test Method
(	TokenNameLPAREN	
InvalidMethodTestCase	TokenNameIdentifier	 Invalid Method Test Case
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"testInvalid"	TokenNameStringLiteral	testInvalid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getFormatter	TokenNameIdentifier	 get Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// might be FAILURES or ERRORS depending on JUnit version? 	TokenNameCOMMENT_LINE	might be FAILURES or ERRORS depending on JUnit version? 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
,	TokenNameCOMMA	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getRetCode	TokenNameIdentifier	 get Ret Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
.	TokenNameDOT	
SUCCESS	TokenNameIdentifier	 SUCCESS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check that having no suite generates no errors 	TokenNameCOMMENT_LINE	check that having no suite generates no errors 
public	TokenNamepublic	
void	TokenNamevoid	
testNoSuite	TokenNameIdentifier	 test No Suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestRunner	TokenNameIdentifier	 Test Runner
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
NoSuiteTestCase	TokenNameIdentifier	 No Suite Test Case
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getFormatter	TokenNameIdentifier	 get Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
.	TokenNameDOT	
SUCCESS	TokenNameIdentifier	 SUCCESS
,	TokenNameCOMMA	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getRetCode	TokenNameIdentifier	 get Ret Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check that a suite generates no errors 	TokenNameCOMMENT_LINE	check that a suite generates no errors 
public	TokenNamepublic	
void	TokenNamevoid	
testSuite	TokenNameIdentifier	 test Suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestRunner	TokenNameIdentifier	 Test Runner
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
SuiteTestCase	TokenNameIdentifier	 Suite Test Case
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getFormatter	TokenNameIdentifier	 get Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
.	TokenNameDOT	
SUCCESS	TokenNameIdentifier	 SUCCESS
,	TokenNameCOMMA	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getRetCode	TokenNameIdentifier	 get Ret Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check that an invalid suite generates an error. 	TokenNameCOMMENT_LINE	check that an invalid suite generates an error. 
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidSuite	TokenNameIdentifier	 test Invalid Suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestRunner	TokenNameIdentifier	 Test Runner
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
InvalidSuiteTestCase	TokenNameIdentifier	 Invalid Suite Test Case
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getFormatter	TokenNameIdentifier	 get Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
,	TokenNameCOMMA	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
.	TokenNameDOT	
ERRORS	TokenNameIdentifier	 ERRORS
,	TokenNameCOMMA	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getRetCode	TokenNameIdentifier	 get Ret Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
,	TokenNameCOMMA	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"thrown on purpose"	TokenNameStringLiteral	thrown on purpose
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check that something which is not a testcase generates no errors 	TokenNameCOMMENT_LINE	check that something which is not a testcase generates no errors 
// at first even though this is incorrect. 	TokenNameCOMMENT_LINE	at first even though this is incorrect. 
public	TokenNamepublic	
void	TokenNamevoid	
testNoTestCase	TokenNameIdentifier	 test No Test Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestRunner	TokenNameIdentifier	 Test Runner
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
NoTestCase	TokenNameIdentifier	 No Test Case
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// On junit3 this is a FAILURE, on junit4 this is an ERROR 	TokenNameCOMMENT_LINE	On junit3 this is a FAILURE, on junit4 this is an ERROR 
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getRetCode	TokenNameIdentifier	 get Ret Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
.	TokenNameDOT	
FAILURES	TokenNameIdentifier	 FAILURES
&&	TokenNameAND_AND	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
.	TokenNameDOT	
ERRORS	TokenNameIdentifier	 ERRORS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Unexpected result "	TokenNameStringLiteral	Unexpected result 
+	TokenNamePLUS	
ret	TokenNameIdentifier	 ret
+	TokenNamePLUS	
" from junit runner"	TokenNameStringLiteral	 from junit runner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// JUnit3 test 	TokenNameCOMMENT_LINE	JUnit3 test 
//assertEquals(runner.getFormatter().getError(), JUnitTestRunner.FAILURES, runner.getRetCode()); 	TokenNameCOMMENT_LINE	assertEquals(runner.getFormatter().getError(), JUnitTestRunner.FAILURES, runner.getRetCode()); 
}	TokenNameRBRACE	
// check that an exception in the constructor is noticed 	TokenNameCOMMENT_LINE	check that an exception in the constructor is noticed 
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidTestCase	TokenNameIdentifier	 test Invalid Test Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestRunner	TokenNameIdentifier	 Test Runner
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
InvalidTestCase	TokenNameIdentifier	 Invalid Test Case
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// On junit3 this is a FAILURE, on junit4 this is an ERROR 	TokenNameCOMMENT_LINE	On junit3 this is a FAILURE, on junit4 this is an ERROR 
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getRetCode	TokenNameIdentifier	 get Ret Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
.	TokenNameDOT	
FAILURES	TokenNameIdentifier	 FAILURES
&&	TokenNameAND_AND	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
.	TokenNameDOT	
ERRORS	TokenNameIdentifier	 ERRORS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Unexpected result "	TokenNameStringLiteral	Unexpected result 
+	TokenNamePLUS	
ret	TokenNameIdentifier	 ret
+	TokenNamePLUS	
" from junit runner"	TokenNameStringLiteral	 from junit runner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// JUNIT3 test 	TokenNameCOMMENT_LINE	JUNIT3 test 
//assertEquals(error, JUnitTestRunner.FAILURES, runner.getRetCode()); 	TokenNameCOMMENT_LINE	assertEquals(error, JUnitTestRunner.FAILURES, runner.getRetCode()); 
//@fixme as of now does not report the original stacktrace. 	TokenNameCOMMENT_LINE	@fixme as of now does not report the original stacktrace. 
//assertTrue(error, error.indexOf("thrown on purpose") != -1); 	TokenNameCOMMENT_LINE	assertTrue(error, error.indexOf("thrown on purpose") != -1); 
}	TokenNameRBRACE	
protected	TokenNameprotected	
TestRunner	TokenNameIdentifier	 Test Runner
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TestRunner	TokenNameIdentifier	 Test Runner
(	TokenNameLPAREN	
new	TokenNamenew	
JUnitTest	TokenNameIdentifier	 J Unit Test
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
TestRunner	TokenNameIdentifier	 Test Runner
createRunnerForTestMethod	TokenNameIdentifier	 create Runner For Test Method
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TestRunner	TokenNameIdentifier	 Test Runner
(	TokenNameLPAREN	
new	TokenNamenew	
JUnitTest	TokenNameIdentifier	 J Unit Test
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
method	TokenNameIdentifier	 method
}	TokenNameRBRACE	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// the test runner that wrap the dummy formatter that interests us 	TokenNameCOMMENT_LINE	the test runner that wrap the dummy formatter that interests us 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
TestRunner	TokenNameIdentifier	 Test Runner
extends	TokenNameextends	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
{	TokenNameLBRACE	
private	TokenNameprivate	
ResultFormatter	TokenNameIdentifier	 Result Formatter
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
new	TokenNamenew	
ResultFormatter	TokenNameIdentifier	 Result Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestRunner	TokenNameIdentifier	 Test Runner
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methods	TokenNameIdentifier	 methods
,	TokenNameCOMMA	
boolean	TokenNameboolean	
haltonerror	TokenNameIdentifier	 haltonerror
,	TokenNameCOMMA	
boolean	TokenNameboolean	
filtertrace	TokenNameIdentifier	 filtertrace
,	TokenNameCOMMA	
boolean	TokenNameboolean	
haltonfailure	TokenNameIdentifier	 haltonfailure
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
methods	TokenNameIdentifier	 methods
,	TokenNameCOMMA	
haltonerror	TokenNameIdentifier	 haltonerror
,	TokenNameCOMMA	
filtertrace	TokenNameIdentifier	 filtertrace
,	TokenNameCOMMA	
haltonfailure	TokenNameIdentifier	 haltonfailure
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
TestRunner	TokenNameIdentifier	 Test Runner
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use the classloader that loaded this class otherwise 	TokenNameCOMMENT_LINE	use the classloader that loaded this class otherwise 
// it will not be able to run inner classes if this test 	TokenNameCOMMENT_LINE	it will not be able to run inner classes if this test 
// is ran in non-forked mode. 	TokenNameCOMMENT_LINE	is ran in non-forked mode. 
addFormatter	TokenNameIdentifier	 add Formatter
(	TokenNameLPAREN	
formatter	TokenNameIdentifier	 formatter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ResultFormatter	TokenNameIdentifier	 Result Formatter
getFormatter	TokenNameIdentifier	 get Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
formatter	TokenNameIdentifier	 formatter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// dummy formatter just to catch the error 	TokenNameCOMMENT_LINE	dummy formatter just to catch the error 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
ResultFormatter	TokenNameIdentifier	 Result Formatter
implements	TokenNameimplements	
JUnitResultFormatter	TokenNameIdentifier	 J Unit Result Formatter
{	TokenNameLBRACE	
private	TokenNameprivate	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setSystemOutput	TokenNameIdentifier	 set System Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSystemError	TokenNameIdentifier	 set System Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startTestSuite	TokenNameIdentifier	 start Test Suite
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
suite	TokenNameIdentifier	 suite
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endTestSuite	TokenNameIdentifier	 end Test Suite
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
suite	TokenNameIdentifier	 suite
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startTest	TokenNameIdentifier	 start Test
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endTest	TokenNameIdentifier	 end Test
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addFailure	TokenNameIdentifier	 add Failure
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addFailure	TokenNameIdentifier	 add Failure
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addError	TokenNameIdentifier	 add Error
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NoTestCase	TokenNameIdentifier	 No Test Case
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InvalidMethodTestCase	TokenNameIdentifier	 Invalid Method Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
InvalidMethodTestCase	TokenNameIdentifier	 Invalid Method Test Case
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
testA	TokenNameIdentifier	 test A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"thrown on purpose"	TokenNameStringLiteral	thrown on purpose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ValidMethodTestCase	TokenNameIdentifier	 Valid Method Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
ValidMethodTestCase	TokenNameIdentifier	 Valid Method Test Case
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
testA	TokenNameIdentifier	 test A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected to be executed 	TokenNameCOMMENT_LINE	expected to be executed 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testB	TokenNameIdentifier	 test B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not be executed 	TokenNameCOMMENT_LINE	should not be executed 
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"thrown on purpose"	TokenNameStringLiteral	thrown on purpose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InvalidTestCase	TokenNameIdentifier	 Invalid Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
InvalidTestCase	TokenNameIdentifier	 Invalid Test Case
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
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"thrown on purpose"	TokenNameStringLiteral	thrown on purpose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NoSuiteTestCase	TokenNameIdentifier	 No Suite Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
NoSuiteTestCase	TokenNameIdentifier	 No Suite Test Case
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
testA	TokenNameIdentifier	 test A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SuiteTestCase	TokenNameIdentifier	 Suite Test Case
extends	TokenNameextends	
NoSuiteTestCase	TokenNameIdentifier	 No Suite Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
SuiteTestCase	TokenNameIdentifier	 Suite Test Case
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
static	TokenNamestatic	
Test	TokenNameIdentifier	 Test
suite	TokenNameIdentifier	 suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TestSuite	TokenNameIdentifier	 Test Suite
(	TokenNameLPAREN	
SuiteTestCase	TokenNameIdentifier	 Suite Test Case
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InvalidSuiteTestCase	TokenNameIdentifier	 Invalid Suite Test Case
extends	TokenNameextends	
NoSuiteTestCase	TokenNameIdentifier	 No Suite Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
InvalidSuiteTestCase	TokenNameIdentifier	 Invalid Suite Test Case
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
static	TokenNamestatic	
Test	TokenNameIdentifier	 Test
suite	TokenNameIdentifier	 suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"thrown on purpose"	TokenNameStringLiteral	thrown on purpose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
textui	TokenNameIdentifier	 textui
.	TokenNameDOT	
TestRunner	TokenNameIdentifier	 Test Runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
JUnitTestRunnerTest	TokenNameIdentifier	 J Unit Test Runner Test
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
