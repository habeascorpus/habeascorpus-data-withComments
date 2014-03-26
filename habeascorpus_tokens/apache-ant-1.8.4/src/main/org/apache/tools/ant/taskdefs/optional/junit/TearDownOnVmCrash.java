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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
/** * Formatter that doesn't create any output but tries to invoke the * tearDown method on a testcase if that test was forked and caused a * timeout or VM crash. * * <p>This formatter has some limitations, for details see the * &lt;junit&gt; task's manual.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Formatter that doesn't create any output but tries to invoke the tearDown method on a testcase if that test was forked and caused a timeout or VM crash. * <p>This formatter has some limitations, for details see the &lt;junit&gt; task's manual.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
TearDownOnVmCrash	TokenNameIdentifier	 Tear Down On Vm Crash
implements	TokenNameimplements	
JUnitResultFormatter	TokenNameIdentifier	 J Unit Result Formatter
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
suiteName	TokenNameIdentifier	 suite Name
;	TokenNameSEMICOLON	
/** * Records the suite's name to later determine the class to invoke * tearDown on. */	TokenNameCOMMENT_JAVADOC	 Records the suite's name to later determine the class to invoke tearDown on. 
public	TokenNamepublic	
void	TokenNamevoid	
startTestSuite	TokenNameIdentifier	 start Test Suite
(	TokenNameLPAREN	
final	TokenNamefinal	
JUnitTest	TokenNameIdentifier	 J Unit Test
suite	TokenNameIdentifier	 suite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suiteName	TokenNameIdentifier	 suite Name
=	TokenNameEQUAL	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
suiteName	TokenNameIdentifier	 suite Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
suiteName	TokenNameIdentifier	 suite Name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
JUnitTask	TokenNameIdentifier	 J Unit Task
.	TokenNameDOT	
NAME_OF_DUMMY_TEST	TokenNameIdentifier	 NAME  OF  DUMMY  TEST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no way to know which class caused the timeout 	TokenNameCOMMENT_LINE	no way to know which class caused the timeout 
suiteName	TokenNameIdentifier	 suite Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Only invoke tearDown if the suite is known and not the dummy * test we get when a Batch fails and the error is an actual * error generated by Ant. */	TokenNameCOMMENT_JAVADOC	 Only invoke tearDown if the suite is known and not the dummy test we get when a Batch fails and the error is an actual error generated by Ant. 
public	TokenNamepublic	
void	TokenNamevoid	
addError	TokenNameIdentifier	 add Error
(	TokenNameLPAREN	
final	TokenNamefinal	
Test	TokenNameIdentifier	 Test
fakeTest	TokenNameIdentifier	 fake Test
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
suiteName	TokenNameIdentifier	 suite Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fakeTest	TokenNameIdentifier	 fake Test
instanceof	TokenNameinstanceof	
JUnitTaskMirrorImpl	TokenNameIdentifier	 J Unit Task Mirror Impl
.	TokenNameDOT	
VmExitErrorTest	TokenNameIdentifier	 Vm Exit Error Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// no need to implement the rest 	TokenNameCOMMENT_LINE	no need to implement the rest 
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
startTest	TokenNameIdentifier	 start Test
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
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
endTestSuite	TokenNameIdentifier	 end Test Suite
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
suite	TokenNameIdentifier	 suite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSystemOutput	TokenNameIdentifier	 set System Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSystemError	TokenNameIdentifier	 set System Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// first try to load the class and let's hope it is on our 	TokenNameCOMMENT_LINE	first try to load the class and let's hope it is on our 
// classpath 	TokenNameCOMMENT_LINE	classpath 
Class	TokenNameIdentifier	 Class
testClass	TokenNameIdentifier	 test Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
testClass	TokenNameIdentifier	 test Class
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
suiteName	TokenNameIdentifier	 suite Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
testClass	TokenNameIdentifier	 test Class
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
suiteName	TokenNameIdentifier	 suite Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fall back to system classloader 	TokenNameCOMMENT_LINE	fall back to system classloader 
testClass	TokenNameIdentifier	 test Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
suiteName	TokenNameIdentifier	 suite Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if the test has a suite method, then we can't know 	TokenNameCOMMENT_LINE	if the test has a suite method, then we can't know 
// which test of the executed suite timed out, ignore it 	TokenNameCOMMENT_LINE	which test of the executed suite timed out, ignore it 
try	TokenNametry	
{	TokenNameLBRACE	
// check if there is a suite method 	TokenNameCOMMENT_LINE	check if there is a suite method 
testClass	TokenNameIdentifier	 test Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"suite"	TokenNameStringLiteral	suite
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no suite method 	TokenNameCOMMENT_LINE	no suite method 
}	TokenNameRBRACE	
// a loadable class and no suite method 	TokenNameCOMMENT_LINE	a loadable class and no suite method 
// no reason to check for JUnit 4 since JUnit4TestAdapter 	TokenNameCOMMENT_LINE	no reason to check for JUnit 4 since JUnit4TestAdapter 
// doesn't have any tearDown method. 	TokenNameCOMMENT_LINE	doesn't have any tearDown method. 
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
testClass	TokenNameIdentifier	 test Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"tearDown"	TokenNameStringLiteral	tearDown
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
getReturnType	TokenNameIdentifier	 get Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Void	TokenNameIdentifier	 Void
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no tearDown, fine 	TokenNameCOMMENT_LINE	no tearDown, fine 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// class probably is not in our classpath, there is 	TokenNameCOMMENT_LINE	class probably is not in our classpath, there is 
// nothing we can do 	TokenNameCOMMENT_LINE	nothing we can do 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
ite	TokenNameIdentifier	 ite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Caught an exception while trying to invoke"	TokenNameStringLiteral	Caught an exception while trying to invoke
+	TokenNamePLUS	
" tearDown: "	TokenNameStringLiteral	 tearDown: 
+	TokenNamePLUS	
ite	TokenNameIdentifier	 ite
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Caught an exception while trying to invoke"	TokenNameStringLiteral	Caught an exception while trying to invoke
+	TokenNamePLUS	
" tearDown: "	TokenNameStringLiteral	 tearDown: 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
