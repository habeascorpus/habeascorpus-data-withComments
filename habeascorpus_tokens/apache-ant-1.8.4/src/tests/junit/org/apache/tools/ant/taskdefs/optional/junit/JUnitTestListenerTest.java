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
public	TokenNamepublic	
class	TokenNameclass	
JUnitTestListenerTest	TokenNameIdentifier	 J Unit Test Listener Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
// The captureToSummary test writes to stdout and stderr, good for 	TokenNameCOMMENT_LINE	The captureToSummary test writes to stdout and stderr, good for 
// verifying that the TestListener support doesn't break anything. 	TokenNameCOMMENT_LINE	verifying that the TestListener support doesn't break anything. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PASS_TEST_TARGET	TokenNameIdentifier	 PASS  TEST  TARGET
=	TokenNameEQUAL	
"captureToSummary"	TokenNameStringLiteral	captureToSummary
;	TokenNameSEMICOLON	
// testNoCrash is the test invoked by the captureToSummary's junit task 	TokenNameCOMMENT_LINE	testNoCrash is the test invoked by the captureToSummary's junit task 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PASS_TEST	TokenNameIdentifier	 PASS  TEST
=	TokenNameEQUAL	
"testNoCrash"	TokenNameStringLiteral	testNoCrash
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JUnitTestListenerTest	TokenNameIdentifier	 J Unit Test Listener Test
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
testFullLogOutput	TokenNameIdentifier	 test Full Log Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"enableEvents"	TokenNameStringLiteral	enableEvents
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
PASS_TEST_TARGET	TokenNameIdentifier	 PASS  TEST  TARGET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expecting full log to have BuildListener events"	TokenNameStringLiteral	expecting full log to have BuildListener events
,	TokenNameCOMMA	
hasBuildListenerEvents	TokenNameIdentifier	 has Build Listener Events
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoLogOutput	TokenNameIdentifier	 test No Log Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"enableEvents"	TokenNameStringLiteral	enableEvents
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
PASS_TEST_TARGET	TokenNameIdentifier	 PASS  TEST  TARGET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"expecting log to not have BuildListener events"	TokenNameStringLiteral	expecting log to not have BuildListener events
,	TokenNameCOMMA	
hasBuildListenerEvents	TokenNameIdentifier	 has Build Listener Events
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTestCountFired	TokenNameIdentifier	 test Test Count Fired
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"enableEvents"	TokenNameStringLiteral	enableEvents
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
PASS_TEST_TARGET	TokenNameIdentifier	 PASS  TEST  TARGET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expecting test count message"	TokenNameStringLiteral	expecting test count message
,	TokenNameCOMMA	
hasEventMessage	TokenNameIdentifier	 has Event Message
(	TokenNameLPAREN	
JUnitTask	TokenNameIdentifier	 J Unit Task
.	TokenNameDOT	
TESTLISTENER_PREFIX	TokenNameIdentifier	 TESTLISTENER  PREFIX
+	TokenNamePLUS	
"tests to run: "	TokenNameStringLiteral	tests to run: 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStartTestFired	TokenNameIdentifier	 test Start Test Fired
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"enableEvents"	TokenNameStringLiteral	enableEvents
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
PASS_TEST_TARGET	TokenNameIdentifier	 PASS  TEST  TARGET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expecting test started message"	TokenNameStringLiteral	expecting test started message
,	TokenNameCOMMA	
hasEventMessage	TokenNameIdentifier	 has Event Message
(	TokenNameLPAREN	
JUnitTask	TokenNameIdentifier	 J Unit Task
.	TokenNameDOT	
TESTLISTENER_PREFIX	TokenNameIdentifier	 TESTLISTENER  PREFIX
+	TokenNamePLUS	
"startTest("	TokenNameStringLiteral	startTest(
+	TokenNamePLUS	
PASS_TEST	TokenNameIdentifier	 PASS  TEST
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEndTestFired	TokenNameIdentifier	 test End Test Fired
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"enableEvents"	TokenNameStringLiteral	enableEvents
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
PASS_TEST_TARGET	TokenNameIdentifier	 PASS  TEST  TARGET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expecting test ended message"	TokenNameStringLiteral	expecting test ended message
,	TokenNameCOMMA	
hasEventMessage	TokenNameIdentifier	 has Event Message
(	TokenNameLPAREN	
JUnitTask	TokenNameIdentifier	 J Unit Task
.	TokenNameDOT	
TESTLISTENER_PREFIX	TokenNameIdentifier	 TESTLISTENER  PREFIX
+	TokenNamePLUS	
"endTest("	TokenNameStringLiteral	endTest(
+	TokenNamePLUS	
PASS_TEST	TokenNameIdentifier	 PASS  TEST
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoFullLogOutputByDefault	TokenNameIdentifier	 test No Full Log Output By Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
PASS_TEST_TARGET	TokenNameIdentifier	 PASS  TEST  TARGET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"expecting full log to not have BuildListener events"	TokenNameStringLiteral	expecting full log to not have BuildListener events
,	TokenNameCOMMA	
hasBuildListenerEvents	TokenNameIdentifier	 has Build Listener Events
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFullLogOutputMagicProperty	TokenNameIdentifier	 test Full Log Output Magic Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
JUnitTask	TokenNameIdentifier	 J Unit Task
.	TokenNameDOT	
ENABLE_TESTLISTENER_EVENTS	TokenNameIdentifier	 ENABLE  TESTLISTENER  EVENTS
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
PASS_TEST_TARGET	TokenNameIdentifier	 PASS  TEST  TARGET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expecting full log to have BuildListener events"	TokenNameStringLiteral	expecting full log to have BuildListener events
,	TokenNameCOMMA	
hasBuildListenerEvents	TokenNameIdentifier	 has Build Listener Events
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoFullLogOutputMagicPropertyWins	TokenNameIdentifier	 test No Full Log Output Magic Property Wins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
JUnitTask	TokenNameIdentifier	 J Unit Task
.	TokenNameDOT	
ENABLE_TESTLISTENER_EVENTS	TokenNameIdentifier	 ENABLE  TESTLISTENER  EVENTS
,	TokenNameCOMMA	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"enableEvents"	TokenNameStringLiteral	enableEvents
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
PASS_TEST_TARGET	TokenNameIdentifier	 PASS  TEST  TARGET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"expecting full log to not have BuildListener events"	TokenNameStringLiteral	expecting full log to not have BuildListener events
,	TokenNameCOMMA	
hasBuildListenerEvents	TokenNameIdentifier	 has Build Listener Events
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasBuildListenerEvents	TokenNameIdentifier	 has Build Listener Events
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
JUnitTask	TokenNameIdentifier	 J Unit Task
.	TokenNameDOT	
TESTLISTENER_PREFIX	TokenNameIdentifier	 TESTLISTENER  PREFIX
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasEventMessage	TokenNameIdentifier	 has Event Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eventPrefix	TokenNameIdentifier	 event Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
eventPrefix	TokenNameIdentifier	 event Prefix
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
