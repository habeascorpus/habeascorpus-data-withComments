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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Permissions	TokenNameIdentifier	 Permissions
;	TokenNameSEMICOLON	
/** * Handles the portions of {@link JUnitTask} which need to directly access * actual JUnit classes, so that junit.jar need not be on Ant's startup classpath. * Neither JUnitTask.java nor JUnitTaskMirror.java nor their transitive static * deps may import any junit.** classes! * Specifically, need to not refer to * - JUnitResultFormatter or its subclasses * - JUnitVersionHelper * - JUnitTestRunner * Cf. JUnitTask.SplitLoader#isSplit(String) * Public only to permit access from classes in this package; do not use directly. * * @since 1.7 * @see "bug #38799" */	TokenNameCOMMENT_JAVADOC	 Handles the portions of {@link JUnitTask} which need to directly access actual JUnit classes, so that junit.jar need not be on Ant's startup classpath. Neither JUnitTask.java nor JUnitTaskMirror.java nor their transitive static deps may import any junit.** classes! Specifically, need to not refer to - JUnitResultFormatter or its subclasses - JUnitVersionHelper - JUnitTestRunner Cf. JUnitTask.SplitLoader#isSplit(String) Public only to permit access from classes in this package; do not use directly. * @since 1.7 @see "bug #38799" 
public	TokenNamepublic	
interface	TokenNameinterface	
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
{	TokenNameLBRACE	
/** * Add the formatter to be called when the jvm exits before * the test suite finishs. * @param test the test. * @param formatter the fomatter to use. * @param out the output stream to use. * @param message the message to write out. * @param testCase the name of the test. */	TokenNameCOMMENT_JAVADOC	 Add the formatter to be called when the jvm exits before the test suite finishs. @param test the test. @param formatter the fomatter to use. @param out the output stream to use. @param message the message to write out. @param testCase the name of the test. 
void	TokenNamevoid	
addVmExit	TokenNameIdentifier	 add Vm Exit
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
formatter	TokenNameIdentifier	 formatter
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
;	TokenNameSEMICOLON	
/** * Create a new test runner for a test. * @param test the test to run. * @param methods names of the test methods to be run. * @param haltOnError if true halt the tests if an error occurs. * @param filterTrace if true filter the stack traces. * @param haltOnFailure if true halt the test if a failure occurs. * @param showOutput if true show output. * @param logTestListenerEvents if true log test listener events. * @param classLoader the classloader to use to create the runner. * @return the test runner. */	TokenNameCOMMENT_JAVADOC	 Create a new test runner for a test. @param test the test to run. @param methods names of the test methods to be run. @param haltOnError if true halt the tests if an error occurs. @param filterTrace if true filter the stack traces. @param haltOnFailure if true halt the test if a failure occurs. @param showOutput if true show output. @param logTestListenerEvents if true log test listener events. @param classLoader the classloader to use to create the runner. @return the test runner. 
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
;	TokenNameSEMICOLON	
/** * Create a summary result formatter. * @return the created formatter. */	TokenNameCOMMENT_JAVADOC	 Create a summary result formatter. @return the created formatter. 
SummaryJUnitResultFormatterMirror	TokenNameIdentifier	 Summary J Unit Result Formatter Mirror
newSummaryJUnitResultFormatter	TokenNameIdentifier	 new Summary J Unit Result Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The interface that JUnitResultFormatter extends. */	TokenNameCOMMENT_JAVADOC	 The interface that JUnitResultFormatter extends. 
public	TokenNamepublic	
interface	TokenNameinterface	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
{	TokenNameLBRACE	
/** * Set the output stream. * @param outputStream the stream to use. */	TokenNameCOMMENT_JAVADOC	 Set the output stream. @param outputStream the stream to use. 
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
outputStream	TokenNameIdentifier	 output Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The interface that SummaryJUnitResultFormatter extends. */	TokenNameCOMMENT_JAVADOC	 The interface that SummaryJUnitResultFormatter extends. 
public	TokenNamepublic	
interface	TokenNameinterface	
SummaryJUnitResultFormatterMirror	TokenNameIdentifier	 Summary J Unit Result Formatter Mirror
extends	TokenNameextends	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
{	TokenNameLBRACE	
/** * Set where standard out and standard error should be included. * @param value if true include the outputs in the summary. */	TokenNameCOMMENT_JAVADOC	 Set where standard out and standard error should be included. @param value if true include the outputs in the summary. 
void	TokenNamevoid	
setWithOutAndErr	TokenNameIdentifier	 set With Out And Err
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Interface that test runners implement. */	TokenNameCOMMENT_JAVADOC	 Interface that test runners implement. 
public	TokenNamepublic	
interface	TokenNameinterface	
JUnitTestRunnerMirror	TokenNameIdentifier	 J Unit Test Runner Mirror
{	TokenNameLBRACE	
/** * Used in formatter arguments as a placeholder for the basename * of the output file (which gets replaced by a test specific * output file name later). * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Used in formatter arguments as a placeholder for the basename of the output file (which gets replaced by a test specific output file name later). * @since Ant 1.6.3 
String	TokenNameIdentifier	 String
IGNORED_FILE_NAME	TokenNameIdentifier	 IGNORED  FILE  NAME
=	TokenNameEQUAL	
"IGNORETHIS"	TokenNameStringLiteral	IGNORETHIS
;	TokenNameSEMICOLON	
/** * No problems with this test. */	TokenNameCOMMENT_JAVADOC	 No problems with this test. 
int	TokenNameint	
SUCCESS	TokenNameIdentifier	 SUCCESS
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Some tests failed. */	TokenNameCOMMENT_JAVADOC	 Some tests failed. 
int	TokenNameint	
FAILURES	TokenNameIdentifier	 FAILURES
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * An error occurred. */	TokenNameCOMMENT_JAVADOC	 An error occurred. 
int	TokenNameint	
ERRORS	TokenNameIdentifier	 ERRORS
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Permissions for the test run. * @param perm the permissions to use. */	TokenNameCOMMENT_JAVADOC	 Permissions for the test run. @param perm the permissions to use. 
void	TokenNamevoid	
setPermissions	TokenNameIdentifier	 set Permissions
(	TokenNameLPAREN	
Permissions	TokenNameIdentifier	 Permissions
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Run the test. */	TokenNameCOMMENT_JAVADOC	 Run the test. 
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a formatter to the test. * @param formatter the formatter to use. */	TokenNameCOMMENT_JAVADOC	 Add a formatter to the test. @param formatter the formatter to use. 
void	TokenNamevoid	
addFormatter	TokenNameIdentifier	 add Formatter
(	TokenNameLPAREN	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
formatter	TokenNameIdentifier	 formatter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns what System.exit() would return in the standalone version. * * @return 2 if errors occurred, 1 if tests failed else 0. */	TokenNameCOMMENT_JAVADOC	 Returns what System.exit() would return in the standalone version. * @return 2 if errors occurred, 1 if tests failed else 0. 
int	TokenNameint	
getRetCode	TokenNameIdentifier	 get Ret Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Handle output sent to System.err. * * @param output coming from System.err */	TokenNameCOMMENT_JAVADOC	 Handle output sent to System.err. * @param output coming from System.err 
void	TokenNamevoid	
handleErrorFlush	TokenNameIdentifier	 handle Error Flush
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Handle output sent to System.err. * * @param output output for System.err */	TokenNameCOMMENT_JAVADOC	 Handle output sent to System.err. * @param output output for System.err 
void	TokenNamevoid	
handleErrorOutput	TokenNameIdentifier	 handle Error Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Handle output sent to System.out. * * @param output output for System.out. */	TokenNameCOMMENT_JAVADOC	 Handle output sent to System.out. * @param output output for System.out. 
void	TokenNamevoid	
handleOutput	TokenNameIdentifier	 handle Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Handle an input request. * * @param buffer the buffer into which data is to be read. * @param offset the offset into the buffer at which data is stored. * @param length the amount of data to read. * * @return the number of bytes read. * * @exception IOException if the data cannot be read. */	TokenNameCOMMENT_JAVADOC	 Handle an input request. * @param buffer the buffer into which data is to be read. @param offset the offset into the buffer at which data is stored. @param length the amount of data to read. * @return the number of bytes read. * @exception IOException if the data cannot be read. 
int	TokenNameint	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Handle output sent to System.out. * * @param output output for System.out. */	TokenNameCOMMENT_JAVADOC	 Handle output sent to System.out. * @param output output for System.out. 
void	TokenNamevoid	
handleFlush	TokenNameIdentifier	 handle Flush
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
