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
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildFileTest	TokenNameIdentifier	 Build File Test
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
JUnitTaskTest	TokenNameIdentifier	 J Unit Task Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
/** * Constructor for the JUnitTaskTest object. */	TokenNameCOMMENT_JAVADOC	 Constructor for the JUnitTaskTest object. 
public	TokenNamepublic	
JUnitTaskTest	TokenNameIdentifier	 J Unit Task Test
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
/** * The JUnit setup method. */	TokenNameCOMMENT_JAVADOC	 The JUnit setup method. 
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/junit.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junit.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The teardown method for JUnit. */	TokenNameCOMMENT_JAVADOC	 The teardown method for JUnit. 
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"cleanup"	TokenNameStringLiteral	cleanup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCrash	TokenNameIdentifier	 test Crash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"crash"	TokenNameStringLiteral	crash
,	TokenNameCOMMA	
"crashed"	TokenNameStringLiteral	crashed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoCrash	TokenNameIdentifier	 test No Crash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"nocrash"	TokenNameStringLiteral	nocrash
,	TokenNameCOMMA	
"crashed"	TokenNameStringLiteral	crashed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTimeout	TokenNameIdentifier	 test Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"timeout"	TokenNameStringLiteral	timeout
,	TokenNameCOMMA	
"timeout"	TokenNameStringLiteral	timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoTimeout	TokenNameIdentifier	 test No Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"notimeout"	TokenNameStringLiteral	notimeout
,	TokenNameCOMMA	
"timeout"	TokenNameStringLiteral	timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNonForkedCapture	TokenNameIdentifier	 test Non Forked Capture
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"capture"	TokenNameStringLiteral	capture
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNoPrint	TokenNameIdentifier	 assert No Print
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"log"	TokenNameStringLiteral	log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNoPrint	TokenNameIdentifier	 assert No Print
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"debug log"	TokenNameStringLiteral	debug log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testForkedCapture	TokenNameIdentifier	 test Forked Capture
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"fork"	TokenNameStringLiteral	fork
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testNonForkedCapture	TokenNameIdentifier	 test Non Forked Capture
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// those would fail because of the way BuildFileTest captures output 	TokenNameCOMMENT_LINE	those would fail because of the way BuildFileTest captures output 
assertNoPrint	TokenNameIdentifier	 assert No Print
(	TokenNameLPAREN	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"output"	TokenNameStringLiteral	output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNoPrint	TokenNameIdentifier	 assert No Print
(	TokenNameLPAREN	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"error output"	TokenNameStringLiteral	error output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutput	TokenNameIdentifier	 assert Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBatchTestForkOnceToDir	TokenNameIdentifier	 test Batch Test Fork Once To Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertResultFilesExist	TokenNameIdentifier	 assert Result Files Exist
(	TokenNameLPAREN	
"testBatchTestForkOnceToDir"	TokenNameStringLiteral	testBatchTestForkOnceToDir
,	TokenNameCOMMA	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Bugzilla Report 32973 */	TokenNameCOMMENT_JAVADOC	 Bugzilla Report 32973 
public	TokenNamepublic	
void	TokenNamevoid	
testBatchTestForkOnceExtension	TokenNameIdentifier	 test Batch Test Fork Once Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertResultFilesExist	TokenNameIdentifier	 assert Result Files Exist
(	TokenNameLPAREN	
"testBatchTestForkOnceExtension"	TokenNameStringLiteral	testBatchTestForkOnceExtension
,	TokenNameCOMMA	
".foo"	TokenNameStringLiteral	.foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Bugzilla Report 42984 */	TokenNameCOMMENT_BLOCK	 Bugzilla Report 42984 
//TODO This scenario works from command line, but not from JUnit ... 	TokenNameCOMMENT_LINE	TODO This scenario works from command line, but not from JUnit ... 
// Running these steps from the junit.xml-directory work 	TokenNameCOMMENT_LINE	Running these steps from the junit.xml-directory work 
// $ ant -f junit.xml failureRecorder.prepare 	TokenNameCOMMENT_LINE	$ ant -f junit.xml failureRecorder.prepare 
// $ ant -f junit.xml failureRecorder.runtest 	TokenNameCOMMENT_LINE	$ ant -f junit.xml failureRecorder.runtest 
// $ ant -f junit.xml failureRecorder.runtest 	TokenNameCOMMENT_LINE	$ ant -f junit.xml failureRecorder.runtest 
// $ ant -f junit.xml failureRecorder.fixing 	TokenNameCOMMENT_LINE	$ ant -f junit.xml failureRecorder.fixing 
// $ ant -f junit.xml failureRecorder.runtest 	TokenNameCOMMENT_LINE	$ ant -f junit.xml failureRecorder.runtest 
// $ ant -f junit.xml failureRecorder.runtest 	TokenNameCOMMENT_LINE	$ ant -f junit.xml failureRecorder.runtest 
// But running the JUnit testcase fails in 4th run. 	TokenNameCOMMENT_LINE	But running the JUnit testcase fails in 4th run. 
public	TokenNamepublic	
void	TokenNamevoid	
testFailureRecorder	TokenNameIdentifier	 test Failure Recorder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
isAtLeastJavaVersion	TokenNameIdentifier	 is At Least Java Version
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
JAVA_1_5	TokenNameIdentifier	 JAVA 1 5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"junit.framework.JUnit4TestAdapter"	TokenNameStringLiteral	junit.framework.JUnit4TestAdapter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"skipping tests since it fails when"	TokenNameStringLiteral	skipping tests since it fails when
+	TokenNamePLUS	
" using JUnit 4"	TokenNameStringLiteral	 using JUnit 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// OK, this is JUnit3, can run test 	TokenNameCOMMENT_LINE	OK, this is JUnit3, can run test 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
testDir	TokenNameIdentifier	 test Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"out"	TokenNameStringLiteral	out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
collectorFile	TokenNameIdentifier	 collector File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"out/FailedTests.java"	TokenNameStringLiteral	out/FailedTests.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ensure that there is a clean test environment 	TokenNameCOMMENT_LINE	ensure that there is a clean test environment 
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Test directory '"	TokenNameStringLiteral	Test directory '
+	TokenNamePLUS	
testDir	TokenNameIdentifier	 test Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' must not exist before the test preparation."	TokenNameStringLiteral	' must not exist before the test preparation.
,	TokenNameCOMMA	
testDir	TokenNameIdentifier	 test Dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"The collector file '"	TokenNameStringLiteral	The collector file '
+	TokenNamePLUS	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'must not exist before the test preparation."	TokenNameStringLiteral	'must not exist before the test preparation.
,	TokenNameCOMMA	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// prepare the test environment 	TokenNameCOMMENT_LINE	prepare the test environment 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"failureRecorder.prepare"	TokenNameStringLiteral	failureRecorder.prepare
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Test directory '"	TokenNameStringLiteral	Test directory '
+	TokenNamePLUS	
testDir	TokenNameIdentifier	 test Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' was not created."	TokenNameStringLiteral	' was not created.
,	TokenNameCOMMA	
testDir	TokenNameIdentifier	 test Dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"There should be one class."	TokenNameStringLiteral	There should be one class.
,	TokenNameCOMMA	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
testDir	TokenNameIdentifier	 test Dir
,	TokenNameCOMMA	
"A.class"	TokenNameStringLiteral	A.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"The collector file '"	TokenNameStringLiteral	The collector file '
+	TokenNamePLUS	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' should not exist before the 1st run."	TokenNameStringLiteral	' should not exist before the 1st run.
,	TokenNameCOMMA	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1st junit run: should do all tests - failing and not failing tests 	TokenNameCOMMENT_LINE	1st junit run: should do all tests - failing and not failing tests 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"failureRecorder.runtest"	TokenNameStringLiteral	failureRecorder.runtest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"The collector file '"	TokenNameStringLiteral	The collector file '
+	TokenNamePLUS	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' should exist after the 1st run."	TokenNameStringLiteral	' should exist after the 1st run.
,	TokenNameCOMMA	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the passing test cases 	TokenNameCOMMENT_LINE	the passing test cases 
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"1st run: should run A.test01"	TokenNameStringLiteral	1st run: should run A.test01
,	TokenNameCOMMA	
"A.test01"	TokenNameStringLiteral	A.test01
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"1st run: should run B.test05"	TokenNameStringLiteral	1st run: should run B.test05
,	TokenNameCOMMA	
"B.test05"	TokenNameStringLiteral	B.test05
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"1st run: should run B.test06"	TokenNameStringLiteral	1st run: should run B.test06
,	TokenNameCOMMA	
"B.test06"	TokenNameStringLiteral	B.test06
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"1st run: should run C.test07"	TokenNameStringLiteral	1st run: should run C.test07
,	TokenNameCOMMA	
"C.test07"	TokenNameStringLiteral	C.test07
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"1st run: should run C.test08"	TokenNameStringLiteral	1st run: should run C.test08
,	TokenNameCOMMA	
"C.test08"	TokenNameStringLiteral	C.test08
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"1st run: should run C.test09"	TokenNameStringLiteral	1st run: should run C.test09
,	TokenNameCOMMA	
"C.test09"	TokenNameStringLiteral	C.test09
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the failing test cases 	TokenNameCOMMENT_LINE	the failing test cases 
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"1st run: should run A.test02"	TokenNameStringLiteral	1st run: should run A.test02
,	TokenNameCOMMA	
"A.test02"	TokenNameStringLiteral	A.test02
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"1st run: should run A.test03"	TokenNameStringLiteral	1st run: should run A.test03
,	TokenNameCOMMA	
"A.test03"	TokenNameStringLiteral	A.test03
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"1st run: should run B.test04"	TokenNameStringLiteral	1st run: should run B.test04
,	TokenNameCOMMA	
"B.test04"	TokenNameStringLiteral	B.test04
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"1st run: should run D.test10"	TokenNameStringLiteral	1st run: should run D.test10
,	TokenNameCOMMA	
"D.test10"	TokenNameStringLiteral	D.test10
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2nd junit run: should do only failing tests 	TokenNameCOMMENT_LINE	2nd junit run: should do only failing tests 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"failureRecorder.runtest"	TokenNameStringLiteral	failureRecorder.runtest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"The collector file '"	TokenNameStringLiteral	The collector file '
+	TokenNamePLUS	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' should exist after the 2nd run."	TokenNameStringLiteral	' should exist after the 2nd run.
,	TokenNameCOMMA	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the passing test cases 	TokenNameCOMMENT_LINE	the passing test cases 
assertOutputNotContaining	TokenNameIdentifier	 assert Output Not Containing
(	TokenNameLPAREN	
"2nd run: should not run A.test01"	TokenNameStringLiteral	2nd run: should not run A.test01
,	TokenNameCOMMA	
"A.test01"	TokenNameStringLiteral	A.test01
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputNotContaining	TokenNameIdentifier	 assert Output Not Containing
(	TokenNameLPAREN	
"2nd run: should not run A.test05"	TokenNameStringLiteral	2nd run: should not run A.test05
,	TokenNameCOMMA	
"B.test05"	TokenNameStringLiteral	B.test05
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputNotContaining	TokenNameIdentifier	 assert Output Not Containing
(	TokenNameLPAREN	
"2nd run: should not run B.test06"	TokenNameStringLiteral	2nd run: should not run B.test06
,	TokenNameCOMMA	
"B.test06"	TokenNameStringLiteral	B.test06
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputNotContaining	TokenNameIdentifier	 assert Output Not Containing
(	TokenNameLPAREN	
"2nd run: should not run C.test07"	TokenNameStringLiteral	2nd run: should not run C.test07
,	TokenNameCOMMA	
"C.test07"	TokenNameStringLiteral	C.test07
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputNotContaining	TokenNameIdentifier	 assert Output Not Containing
(	TokenNameLPAREN	
"2nd run: should not run C.test08"	TokenNameStringLiteral	2nd run: should not run C.test08
,	TokenNameCOMMA	
"C.test08"	TokenNameStringLiteral	C.test08
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputNotContaining	TokenNameIdentifier	 assert Output Not Containing
(	TokenNameLPAREN	
"2nd run: should not run C.test09"	TokenNameStringLiteral	2nd run: should not run C.test09
,	TokenNameCOMMA	
"C.test09"	TokenNameStringLiteral	C.test09
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the failing test cases 	TokenNameCOMMENT_LINE	the failing test cases 
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"2nd run: should run A.test02"	TokenNameStringLiteral	2nd run: should run A.test02
,	TokenNameCOMMA	
"A.test02"	TokenNameStringLiteral	A.test02
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"2nd run: should run A.test03"	TokenNameStringLiteral	2nd run: should run A.test03
,	TokenNameCOMMA	
"A.test03"	TokenNameStringLiteral	A.test03
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"2nd run: should run B.test04"	TokenNameStringLiteral	2nd run: should run B.test04
,	TokenNameCOMMA	
"B.test04"	TokenNameStringLiteral	B.test04
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"2nd run: should run D.test10"	TokenNameStringLiteral	2nd run: should run D.test10
,	TokenNameCOMMA	
"D.test10"	TokenNameStringLiteral	D.test10
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "fix" errors in class A 	TokenNameCOMMENT_LINE	"fix" errors in class A 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"failureRecorder.fixing"	TokenNameStringLiteral	failureRecorder.fixing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 3rd run: four running tests with two errors 	TokenNameCOMMENT_LINE	3rd run: four running tests with two errors 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"failureRecorder.runtest"	TokenNameStringLiteral	failureRecorder.runtest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"The collector file '"	TokenNameStringLiteral	The collector file '
+	TokenNamePLUS	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' should exist after the 3rd run."	TokenNameStringLiteral	' should exist after the 3rd run.
,	TokenNameCOMMA	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"3rd run: should run A.test02"	TokenNameStringLiteral	3rd run: should run A.test02
,	TokenNameCOMMA	
"A.test02"	TokenNameStringLiteral	A.test02
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"3rd run: should run A.test03"	TokenNameStringLiteral	3rd run: should run A.test03
,	TokenNameCOMMA	
"A.test03"	TokenNameStringLiteral	A.test03
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"3rd run: should run B.test04"	TokenNameStringLiteral	3rd run: should run B.test04
,	TokenNameCOMMA	
"B.test04"	TokenNameStringLiteral	B.test04
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"3rd run: should run D.test10"	TokenNameStringLiteral	3rd run: should run D.test10
,	TokenNameCOMMA	
"D.test10"	TokenNameStringLiteral	D.test10
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 4rd run: two running tests with errors 	TokenNameCOMMENT_LINE	4rd run: two running tests with errors 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"failureRecorder.runtest"	TokenNameStringLiteral	failureRecorder.runtest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"The collector file '"	TokenNameStringLiteral	The collector file '
+	TokenNamePLUS	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' should exist after the 4th run."	TokenNameStringLiteral	' should exist after the 4th run.
,	TokenNameCOMMA	
collectorFile	TokenNameIdentifier	 collector File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//TODO: these two statements fail 	TokenNameCOMMENT_LINE	TODO: these two statements fail 
//assertOutputNotContaining("4th run: should not run A.test02", "A.test02"); 	TokenNameCOMMENT_LINE	assertOutputNotContaining("4th run: should not run A.test02", "A.test02"); 
//assertOutputNotContaining("4th run: should not run A.test03", "A.test03"); 	TokenNameCOMMENT_LINE	assertOutputNotContaining("4th run: should not run A.test03", "A.test03"); 
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"4th run: should run B.test04"	TokenNameStringLiteral	4th run: should run B.test04
,	TokenNameCOMMA	
"B.test04"	TokenNameStringLiteral	B.test04
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
"4th run: should run D.test10"	TokenNameStringLiteral	4th run: should run D.test10
,	TokenNameCOMMA	
"D.test10"	TokenNameStringLiteral	D.test10
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"nested build's log: "	TokenNameStringLiteral	nested build's log: 
+	TokenNamePLUS	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"nested build's System.out: "	TokenNameStringLiteral	nested build's System.out: 
+	TokenNamePLUS	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"nested build's System.err: "	TokenNameStringLiteral	nested build's System.err: 
+	TokenNamePLUS	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Ant execution failed: "	TokenNameStringLiteral	Ant execution failed: 
+	TokenNamePLUS	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBatchTestForkOnceCustomFormatter	TokenNameIdentifier	 test Batch Test Fork Once Custom Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertResultFilesExist	TokenNameIdentifier	 assert Result Files Exist
(	TokenNameLPAREN	
"testBatchTestForkOnceCustomFormatter"	TokenNameStringLiteral	testBatchTestForkOnceCustomFormatter
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Bugzilla Issue 45411 	TokenNameCOMMENT_LINE	Bugzilla Issue 45411 
public	TokenNamepublic	
void	TokenNamevoid	
testMultilineAssertsNoFork	TokenNameIdentifier	 test Multiline Asserts No Fork
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogNotContaining	TokenNameIdentifier	 expect Log Not Containing
(	TokenNameLPAREN	
"testMultilineAssertsNoFork"	TokenNameStringLiteral	testMultilineAssertsNoFork
,	TokenNameCOMMA	
"messed up)"	TokenNameStringLiteral	messed up)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogNotContaining	TokenNameIdentifier	 assert Log Not Containing
(	TokenNameLPAREN	
"crashed)"	TokenNameStringLiteral	crashed)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Bugzilla Issue 45411 	TokenNameCOMMENT_LINE	Bugzilla Issue 45411 
public	TokenNamepublic	
void	TokenNamevoid	
testMultilineAssertsFork	TokenNameIdentifier	 test Multiline Asserts Fork
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogNotContaining	TokenNameIdentifier	 expect Log Not Containing
(	TokenNameLPAREN	
"testMultilineAssertsFork"	TokenNameStringLiteral	testMultilineAssertsFork
,	TokenNameCOMMA	
"messed up)"	TokenNameStringLiteral	messed up)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogNotContaining	TokenNameIdentifier	 assert Log Not Containing
(	TokenNameLPAREN	
"crashed)"	TokenNameStringLiteral	crashed)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertResultFilesExist	TokenNameIdentifier	 assert Result Files Exist
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResultFileExists	TokenNameIdentifier	 assert Result File Exists
(	TokenNameLPAREN	
"JUnitClassLoader"	TokenNameStringLiteral	JUnitClassLoader
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResultFileExists	TokenNameIdentifier	 assert Result File Exists
(	TokenNameLPAREN	
"JUnitTestRunner"	TokenNameStringLiteral	JUnitTestRunner
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResultFileExists	TokenNameIdentifier	 assert Result File Exists
(	TokenNameLPAREN	
"JUnitVersionHelper"	TokenNameStringLiteral	JUnitVersionHelper
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertResultFileExists	TokenNameIdentifier	 assert Result File Exists
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classNameFragment	TokenNameIdentifier	 class Name Fragment
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"result for "	TokenNameStringLiteral	result for 
+	TokenNamePLUS	
classNameFragment	TokenNameIdentifier	 class Name Fragment
+	TokenNamePLUS	
"Test"	TokenNameStringLiteral	Test
+	TokenNamePLUS	
ext	TokenNameIdentifier	 ext
+	TokenNamePLUS	
" exists"	TokenNameStringLiteral	 exists
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"out/TEST-org.apache.tools.ant."	TokenNameStringLiteral	out/TEST-org.apache.tools.ant.
+	TokenNamePLUS	
"taskdefs.optional.junit."	TokenNameStringLiteral	taskdefs.optional.junit.
+	TokenNamePLUS	
classNameFragment	TokenNameIdentifier	 class Name Fragment
+	TokenNamePLUS	
"Test"	TokenNameStringLiteral	Test
+	TokenNamePLUS	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertNoPrint	TokenNameIdentifier	 assert No Print
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
where	TokenNameIdentifier	 where
+	TokenNamePLUS	
" '"	TokenNameStringLiteral	 '
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
"' must not contain print statement"	TokenNameStringLiteral	' must not contain print statement
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"print to System."	TokenNameStringLiteral	print to System.
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertOutput	TokenNameIdentifier	 assert Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileReader	TokenNameIdentifier	 File Reader
inner	TokenNameIdentifier	 inner
=	TokenNameEQUAL	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"testlog.txt"	TokenNameStringLiteral	testlog.txt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Testsuite: org.apache.tools.ant.taskdefs.optional.junit.Printer"	TokenNameStringLiteral	Testsuite: org.apache.tools.ant.taskdefs.optional.junit.Printer
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Tests run: 1, Failures: 0, Errors: 0, Time elapsed:"	TokenNameStringLiteral	Tests run: 1, Failures: 0, Errors: 0, Time elapsed:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"------------- Standard Output ---------------"	TokenNameStringLiteral	------------- Standard Output ---------------
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPrint	TokenNameIdentifier	 assert Print
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"static"	TokenNameStringLiteral	static
,	TokenNameCOMMA	
"out"	TokenNameStringLiteral	out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPrint	TokenNameIdentifier	 assert Print
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"constructor"	TokenNameStringLiteral	constructor
,	TokenNameCOMMA	
"out"	TokenNameStringLiteral	out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPrint	TokenNameIdentifier	 assert Print
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"method"	TokenNameStringLiteral	method
,	TokenNameCOMMA	
"out"	TokenNameStringLiteral	out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"------------- ---------------- ---------------"	TokenNameStringLiteral	------------- ---------------- ---------------
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"------------- Standard Error -----------------"	TokenNameStringLiteral	------------- Standard Error -----------------
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPrint	TokenNameIdentifier	 assert Print
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"static"	TokenNameStringLiteral	static
,	TokenNameCOMMA	
"err"	TokenNameStringLiteral	err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPrint	TokenNameIdentifier	 assert Print
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"constructor"	TokenNameStringLiteral	constructor
,	TokenNameCOMMA	
"err"	TokenNameStringLiteral	err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPrint	TokenNameIdentifier	 assert Print
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"method"	TokenNameStringLiteral	method
,	TokenNameCOMMA	
"err"	TokenNameStringLiteral	err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"------------- ---------------- ---------------"	TokenNameStringLiteral	------------- ---------------- ---------------
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Testcase: testNoCrash took "	TokenNameStringLiteral	Testcase: testNoCrash took 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertPrint	TokenNameIdentifier	 assert Print
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
search	TokenNameIdentifier	 search
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
+	TokenNamePLUS	
" print to System."	TokenNameStringLiteral	 print to System.
+	TokenNamePLUS	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
search	TokenNameIdentifier	 search
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
