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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
rmic	TokenNameIdentifier	 rmic
.	TokenNameDOT	
RmicAdapterFactory	TokenNameIdentifier	 Rmic Adapter Factory
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
rmic	TokenNameIdentifier	 rmic
.	TokenNameDOT	
DefaultRmicAdapter	TokenNameIdentifier	 Default Rmic Adapter
;	TokenNameSEMICOLON	
/** * Date: 04-Aug-2004 * Time: 22:15:46 */	TokenNameCOMMENT_JAVADOC	 Date: 04-Aug-2004 Time: 22:15:46 
public	TokenNamepublic	
class	TokenNameclass	
RmicAdvancedTest	TokenNameIdentifier	 Rmic Advanced Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
RmicAdvancedTest	TokenNameIdentifier	 Rmic Advanced Test
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
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/rmic/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/rmic/
;	TokenNameSEMICOLON	
/** * The JUnit setup method */	TokenNameCOMMENT_JAVADOC	 The JUnit setup method 
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
+	TokenNamePLUS	
"rmic.xml"	TokenNameStringLiteral	rmic.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The teardown method for JUnit */	TokenNameCOMMENT_JAVADOC	 The teardown method for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"teardown"	TokenNameStringLiteral	teardown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify that "default" binds us to the default compiler */	TokenNameCOMMENT_JAVADOC	 verify that "default" binds us to the default compiler 
public	TokenNamepublic	
void	TokenNamevoid	
testDefault	TokenNameIdentifier	 test Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testDefault"	TokenNameStringLiteral	testDefault
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify that "default" binds us to the default compiler */	TokenNameCOMMENT_JAVADOC	 verify that "default" binds us to the default compiler 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultDest	TokenNameIdentifier	 test Default Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testDefaultDest"	TokenNameStringLiteral	testDefaultDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify that "" binds us to the default compiler */	TokenNameCOMMENT_JAVADOC	 verify that "" binds us to the default compiler 
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testEmpty"	TokenNameStringLiteral	testEmpty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify that "" binds us to the default compiler */	TokenNameCOMMENT_JAVADOC	 verify that "" binds us to the default compiler 
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyDest	TokenNameIdentifier	 test Empty Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testEmptyDest"	TokenNameStringLiteral	testEmptyDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test sun's rmic compiler */	TokenNameCOMMENT_JAVADOC	 test sun's rmic compiler 
public	TokenNamepublic	
void	TokenNamevoid	
testRmic	TokenNameIdentifier	 test Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testRmic"	TokenNameStringLiteral	testRmic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test sun's rmic compiler */	TokenNameCOMMENT_JAVADOC	 test sun's rmic compiler 
public	TokenNamepublic	
void	TokenNamevoid	
testRmicDest	TokenNameIdentifier	 test Rmic Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testRmicDest"	TokenNameStringLiteral	testRmicDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test sun's rmic compiler strips * out -J arguments when not forking */	TokenNameCOMMENT_JAVADOC	 test sun's rmic compiler strips out -J arguments when not forking 
public	TokenNamepublic	
void	TokenNamevoid	
testRmicJArg	TokenNameIdentifier	 test Rmic J Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testRmicJArg"	TokenNameStringLiteral	testRmicJArg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test sun's rmic compiler strips * out -J arguments when not forking */	TokenNameCOMMENT_JAVADOC	 test sun's rmic compiler strips out -J arguments when not forking 
public	TokenNamepublic	
void	TokenNamevoid	
testRmicJArgDest	TokenNameIdentifier	 test Rmic J Arg Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testRmicJArgDest"	TokenNameStringLiteral	testRmicJArgDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testKaffe	TokenNameIdentifier	 test Kaffe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testKaffe"	TokenNameStringLiteral	testKaffe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testKaffeDest	TokenNameIdentifier	 test Kaffe Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testKaffeDest"	TokenNameStringLiteral	testKaffeDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// WLrmic tests don't work 	TokenNameCOMMENT_LINE	WLrmic tests don't work 
/** * test weblogic */	TokenNameCOMMENT_JAVADOC	 test weblogic 
public	TokenNamepublic	
void	TokenNamevoid	
XtestWlrmic	TokenNameIdentifier	 Xtest Wlrmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testWlrmic"	TokenNameStringLiteral	testWlrmic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test weblogic's stripping of -J args */	TokenNameCOMMENT_JAVADOC	 test weblogic's stripping of -J args 
public	TokenNamepublic	
void	TokenNamevoid	
XtestWlrmicJArg	TokenNameIdentifier	 Xtest Wlrmic J Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testWlrmicJArg"	TokenNameStringLiteral	testWlrmicJArg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the forking compiler */	TokenNameCOMMENT_JAVADOC	 test the forking compiler 
public	TokenNamepublic	
void	TokenNamevoid	
NotestForking	TokenNameIdentifier	 Notest Forking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testForking"	TokenNameStringLiteral	testForking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the forking compiler */	TokenNameCOMMENT_JAVADOC	 test the forking compiler 
public	TokenNamepublic	
void	TokenNamevoid	
testForkingAntClasspath	TokenNameIdentifier	 test Forking Ant Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testForkingAntClasspath"	TokenNameStringLiteral	testForkingAntClasspath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the forking compiler */	TokenNameCOMMENT_JAVADOC	 test the forking compiler 
public	TokenNamepublic	
void	TokenNamevoid	
testForkingAntClasspathDest	TokenNameIdentifier	 test Forking Ant Classpath Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testForkingAntClasspathDest"	TokenNameStringLiteral	testForkingAntClasspathDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the forking compiler */	TokenNameCOMMENT_JAVADOC	 test the forking compiler 
public	TokenNamepublic	
void	TokenNamevoid	
testAntClasspath	TokenNameIdentifier	 test Ant Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testAntClasspath"	TokenNameStringLiteral	testAntClasspath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the forking compiler */	TokenNameCOMMENT_JAVADOC	 test the forking compiler 
public	TokenNamepublic	
void	TokenNamevoid	
testAntClasspathDest	TokenNameIdentifier	 test Ant Classpath Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testAntClasspathDest"	TokenNameStringLiteral	testAntClasspathDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testBadName	TokenNameIdentifier	 test Bad Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testBadName"	TokenNameStringLiteral	testBadName
,	TokenNameCOMMA	
"compiler not known"	TokenNameStringLiteral	compiler not known
,	TokenNameCOMMA	
RmicAdapterFactory	TokenNameIdentifier	 Rmic Adapter Factory
.	TokenNameDOT	
ERROR_UNKNOWN_COMPILER	TokenNameIdentifier	 ERROR  UNKNOWN  COMPILER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * load an adapter by name */	TokenNameCOMMENT_JAVADOC	 load an adapter by name 
public	TokenNamepublic	
void	TokenNamevoid	
testExplicitClass	TokenNameIdentifier	 test Explicit Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testExplicitClass"	TokenNameStringLiteral	testExplicitClass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testWrongClass	TokenNameIdentifier	 test Wrong Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testWrongClass"	TokenNameStringLiteral	testWrongClass
,	TokenNameCOMMA	
"class not an RMIC adapter"	TokenNameStringLiteral	class not an RMIC adapter
,	TokenNameCOMMA	
RmicAdapterFactory	TokenNameIdentifier	 Rmic Adapter Factory
.	TokenNameDOT	
ERROR_NOT_RMIC_ADAPTER	TokenNameIdentifier	 ERROR  NOT  RMIC  ADAPTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultBadClass	TokenNameIdentifier	 test Default Bad Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testDefaultBadClass"	TokenNameStringLiteral	testDefaultBadClass
,	TokenNameCOMMA	
"expected the class to fail"	TokenNameStringLiteral	expected the class to fail
,	TokenNameCOMMA	
Rmic	TokenNameIdentifier	 Rmic
.	TokenNameDOT	
ERROR_RMIC_FAILED	TokenNameIdentifier	 ERROR  RMIC  FAILED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//dont look for much text here as it is vendor and version dependent 	TokenNameCOMMENT_LINE	dont look for much text here as it is vendor and version dependent 
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
"unimplemented.class"	TokenNameStringLiteral	unimplemented.class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testMagicProperty	TokenNameIdentifier	 test Magic Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testMagicProperty"	TokenNameStringLiteral	testMagicProperty
,	TokenNameCOMMA	
"magic property not working"	TokenNameStringLiteral	magic property not working
,	TokenNameCOMMA	
RmicAdapterFactory	TokenNameIdentifier	 Rmic Adapter Factory
.	TokenNameDOT	
ERROR_UNKNOWN_COMPILER	TokenNameIdentifier	 ERROR  UNKNOWN  COMPILER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testMagicPropertyOverridesEmptyString	TokenNameIdentifier	 test Magic Property Overrides Empty String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testMagicPropertyOverridesEmptyString"	TokenNameStringLiteral	testMagicPropertyOverridesEmptyString
,	TokenNameCOMMA	
"magic property not working"	TokenNameStringLiteral	magic property not working
,	TokenNameCOMMA	
RmicAdapterFactory	TokenNameIdentifier	 Rmic Adapter Factory
.	TokenNameDOT	
ERROR_UNKNOWN_COMPILER	TokenNameIdentifier	 ERROR  UNKNOWN  COMPILER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
void	TokenNamevoid	
testMagicPropertyIsEmptyString	TokenNameIdentifier	 test Magic Property Is Empty String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testMagicPropertyIsEmptyString"	TokenNameStringLiteral	testMagicPropertyIsEmptyString
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
NotestFailingAdapter	TokenNameIdentifier	 Notest Failing Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testFailingAdapter"	TokenNameStringLiteral	testFailingAdapter
,	TokenNameCOMMA	
"expected failures to propagate"	TokenNameStringLiteral	expected failures to propagate
,	TokenNameCOMMA	
Rmic	TokenNameIdentifier	 Rmic
.	TokenNameDOT	
ERROR_RMIC_FAILED	TokenNameIdentifier	 ERROR  RMIC  FAILED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that version 1.1 stubs are good * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that version 1.1 stubs are good @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testVersion11	TokenNameIdentifier	 test Version11
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testVersion11"	TokenNameStringLiteral	testVersion11
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that version 1.1 stubs are good * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that version 1.1 stubs are good @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testVersion11Dest	TokenNameIdentifier	 test Version11 Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testVersion11Dest"	TokenNameStringLiteral	testVersion11Dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that version 1.2 stubs are good * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that version 1.2 stubs are good * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testVersion12	TokenNameIdentifier	 test Version12
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testVersion12"	TokenNameStringLiteral	testVersion12
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that version 1.2 stubs are good * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that version 1.2 stubs are good * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testVersion12Dest	TokenNameIdentifier	 test Version12 Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testVersion12Dest"	TokenNameStringLiteral	testVersion12Dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that version compat stubs are good * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that version compat stubs are good * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testVersionCompat	TokenNameIdentifier	 test Version Compat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testVersionCompat"	TokenNameStringLiteral	testVersionCompat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that version compat stubs are good * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that version compat stubs are good * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testVersionCompatDest	TokenNameIdentifier	 test Version Compat Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testVersionCompatDest"	TokenNameStringLiteral	testVersionCompatDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that passes -Xnew to sun's rmic. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that passes -Xnew to sun's rmic. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testXnew	TokenNameIdentifier	 test Xnew
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testXnew"	TokenNameStringLiteral	testXnew
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that passes -Xnew to sun's rmic. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that passes -Xnew to sun's rmic. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testXnewDest	TokenNameIdentifier	 test Xnew Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testXnewDest"	TokenNameStringLiteral	testXnewDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that passes -Xnew to sun's rmic running in a different VM. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that passes -Xnew to sun's rmic running in a different VM. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testXnewForked	TokenNameIdentifier	 test Xnew Forked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testXnewForked"	TokenNameStringLiteral	testXnewForked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that passes -Xnew to sun's rmic running in a different VM. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that passes -Xnew to sun's rmic running in a different VM. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testXnewForkedDest	TokenNameIdentifier	 test Xnew Forked Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testXnewForkedDest"	TokenNameStringLiteral	testXnewForkedDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that runs the new xnew compiler adapter. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that runs the new xnew compiler adapter. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testXnewCompiler	TokenNameIdentifier	 test Xnew Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testXnewCompiler"	TokenNameStringLiteral	testXnewCompiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that runs the new xnew compiler adapter. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that runs the new xnew compiler adapter. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testXnewCompilerDest	TokenNameIdentifier	 test Xnew Compiler Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testXnewCompilerDest"	TokenNameStringLiteral	testXnewCompilerDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that verifies that IDL compiles. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that verifies that IDL compiles. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testIDL	TokenNameIdentifier	 test IDL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testIDL"	TokenNameStringLiteral	testIDL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that verifies that IDL compiles. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that verifies that IDL compiles. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testIDLDest	TokenNameIdentifier	 test IDL Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testIDLDest"	TokenNameStringLiteral	testIDLDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that verifies that IIOP compiles. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that verifies that IIOP compiles. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testIIOP	TokenNameIdentifier	 test IIOP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testIIOP"	TokenNameStringLiteral	testIIOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that verifies that IIOP compiles. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 test that verifies that IIOP compiles. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testIIOPDest	TokenNameIdentifier	 test IIOP Dest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testIIOPDest"	TokenNameStringLiteral	testIIOPDest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * this little bunny verifies that we can load stuff, and that * a failure to execute is turned into a fault */	TokenNameCOMMENT_JAVADOC	 this little bunny verifies that we can load stuff, and that a failure to execute is turned into a fault 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
FailingRmicAdapter	TokenNameIdentifier	 Failing Rmic Adapter
extends	TokenNameextends	
DefaultRmicAdapter	TokenNameIdentifier	 Default Rmic Adapter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOG_MESSAGE	TokenNameIdentifier	 LOG  MESSAGE
=	TokenNameEQUAL	
"hello from FailingRmicAdapter"	TokenNameStringLiteral	hello from FailingRmicAdapter
;	TokenNameSEMICOLON	
/** * Executes the task. * * @return false -always */	TokenNameCOMMENT_JAVADOC	 Executes the task. * @return false -always 
public	TokenNamepublic	
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
LOG_MESSAGE	TokenNameIdentifier	 LOG  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
