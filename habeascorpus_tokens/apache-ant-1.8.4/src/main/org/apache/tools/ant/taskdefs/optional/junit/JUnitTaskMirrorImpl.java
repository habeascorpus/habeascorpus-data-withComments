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
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestResult	TokenNameIdentifier	 Test Result
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
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
;	TokenNameSEMICOLON	
/** * Implementation of the part of the junit task which can directly refer to junit.* classes. * Public only to permit use of reflection; do not use directly. * @see JUnitTaskMirror * @see "bug #38799" * @since 1.7 */	TokenNameCOMMENT_JAVADOC	 Implementation of the part of the junit task which can directly refer to junit.* classes. Public only to permit use of reflection; do not use directly. @see JUnitTaskMirror @see "bug #38799" @since 1.7 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
JUnitTaskMirrorImpl	TokenNameIdentifier	 J Unit Task Mirror Impl
implements	TokenNameimplements	
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
JUnitTask	TokenNameIdentifier	 J Unit Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
/** * Constructor. * @param task the junittask that uses this mirror. */	TokenNameCOMMENT_JAVADOC	 Constructor. @param task the junittask that uses this mirror. 
public	TokenNamepublic	
JUnitTaskMirrorImpl	TokenNameIdentifier	 J Unit Task Mirror Impl
(	TokenNameLPAREN	
JUnitTask	TokenNameIdentifier	 J Unit Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
addVmExit	TokenNameIdentifier	 add Vm Exit
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
.	TokenNameDOT	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
aFormatter	TokenNameIdentifier	 a Formatter
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
testCase	TokenNameIdentifier	 test Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JUnitResultFormatter	TokenNameIdentifier	 J Unit Result Formatter
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JUnitResultFormatter	TokenNameIdentifier	 J Unit Result Formatter
)	TokenNameRPAREN	
aFormatter	TokenNameIdentifier	 a Formatter
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
startTestSuite	TokenNameIdentifier	 start Test Suite
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//the trick to integrating test output to the formatter, is to 	TokenNameCOMMENT_LINE	the trick to integrating test output to the formatter, is to 
//create a special test class that asserts an error 	TokenNameCOMMENT_LINE	create a special test class that asserts an error 
//and tell the formatter that it raised. 	TokenNameCOMMENT_LINE	and tell the formatter that it raised. 
TestCase	TokenNameIdentifier	 Test Case
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
VmExitErrorTest	TokenNameIdentifier	 Vm Exit Error Test
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
testCase	TokenNameIdentifier	 test Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
startTest	TokenNameIdentifier	 start Test
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
addError	TokenNameIdentifier	 add Error
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
new	TokenNamenew	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
endTestSuite	TokenNameIdentifier	 end Test Suite
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
.	TokenNameDOT	
JUnitTestRunnerMirror	TokenNameIdentifier	 J Unit Test Runner Mirror
newJUnitTestRunner	TokenNameIdentifier	 new J Unit Test Runner
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
haltOnError	TokenNameIdentifier	 halt On Error
,	TokenNameCOMMA	
boolean	TokenNameboolean	
filterTrace	TokenNameIdentifier	 filter Trace
,	TokenNameCOMMA	
boolean	TokenNameboolean	
haltOnFailure	TokenNameIdentifier	 halt On Failure
,	TokenNameCOMMA	
boolean	TokenNameboolean	
showOutput	TokenNameIdentifier	 show Output
,	TokenNameCOMMA	
boolean	TokenNameboolean	
logTestListenerEvents	TokenNameIdentifier	 log Test Listener Events
,	TokenNameCOMMA	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
classLoader	TokenNameIdentifier	 class Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
methods	TokenNameIdentifier	 methods
,	TokenNameCOMMA	
haltOnError	TokenNameIdentifier	 halt On Error
,	TokenNameCOMMA	
filterTrace	TokenNameIdentifier	 filter Trace
,	TokenNameCOMMA	
haltOnFailure	TokenNameIdentifier	 halt On Failure
,	TokenNameCOMMA	
showOutput	TokenNameIdentifier	 show Output
,	TokenNameCOMMA	
logTestListenerEvents	TokenNameIdentifier	 log Test Listener Events
,	TokenNameCOMMA	
classLoader	TokenNameIdentifier	 class Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
.	TokenNameDOT	
SummaryJUnitResultFormatterMirror	TokenNameIdentifier	 Summary J Unit Result Formatter Mirror
newSummaryJUnitResultFormatter	TokenNameIdentifier	 new Summary J Unit Result Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SummaryJUnitResultFormatter	TokenNameIdentifier	 Summary J Unit Result Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
VmExitErrorTest	TokenNameIdentifier	 Vm Exit Error Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JUnitTest	TokenNameIdentifier	 J Unit Test
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
testCase	TokenNameIdentifier	 test Case
;	TokenNameSEMICOLON	
VmExitErrorTest	TokenNameIdentifier	 Vm Exit Error Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aMessage	TokenNameIdentifier	 a Message
,	TokenNameCOMMA	
JUnitTest	TokenNameIdentifier	 J Unit Test
anOriginalTest	TokenNameIdentifier	 an Original Test
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aTestCase	TokenNameIdentifier	 a Test Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
aMessage	TokenNameIdentifier	 a Message
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
anOriginalTest	TokenNameIdentifier	 an Original Test
;	TokenNameSEMICOLON	
testCase	TokenNameIdentifier	 test Case
=	TokenNameEQUAL	
aTestCase	TokenNameIdentifier	 a Test Case
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
countTestCases	TokenNameIdentifier	 count Test Cases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
TestResult	TokenNameIdentifier	 Test Result
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
testCase	TokenNameIdentifier	 test Case
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
testCase	TokenNameIdentifier	 test Case
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
