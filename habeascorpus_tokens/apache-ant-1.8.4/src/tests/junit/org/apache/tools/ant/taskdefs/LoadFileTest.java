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
/** * Test the load file task * * @created 10 December 2001 */	TokenNameCOMMENT_JAVADOC	 Test the load file task * @created 10 December 2001 
public	TokenNamepublic	
class	TokenNameclass	
LoadFileTest	TokenNameIdentifier	 Load File Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
/** * Constructor for the LoadFileTest object * * @param name Description of Parameter */	TokenNameCOMMENT_JAVADOC	 Constructor for the LoadFileTest object * @param name Description of Parameter 
public	TokenNamepublic	
LoadFileTest	TokenNameIdentifier	 Load File Test
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
/** * The JUnit setup method */	TokenNameCOMMENT_JAVADOC	 The JUnit setup method 
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/loadfile.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/loadfile.xml
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
"cleanup"	TokenNameStringLiteral	cleanup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testNoSourcefileDefined	TokenNameIdentifier	 test No Sourcefile Defined
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testNoSourcefileDefined"	TokenNameStringLiteral	testNoSourcefileDefined
,	TokenNameCOMMA	
"source file not defined"	TokenNameStringLiteral	source file not defined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testNoPropertyDefined	TokenNameIdentifier	 test No Property Defined
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testNoPropertyDefined"	TokenNameStringLiteral	testNoPropertyDefined
,	TokenNameCOMMA	
"output property not defined"	TokenNameStringLiteral	output property not defined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testNoSourcefilefound	TokenNameIdentifier	 test No Sourcefilefound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testNoSourcefilefound"	TokenNameStringLiteral	testNoSourcefilefound
,	TokenNameCOMMA	
"File not found"	TokenNameStringLiteral	File not found
,	TokenNameCOMMA	
" doesn't exist"	TokenNameStringLiteral	 doesn't exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testFailOnError	TokenNameIdentifier	 test Fail On Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"testFailOnError"	TokenNameStringLiteral	testFailOnError
,	TokenNameCOMMA	
"testFailOnError"	TokenNameStringLiteral	testFailOnError
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testLoadAFile	TokenNameIdentifier	 test Load A File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testLoadAFile"	TokenNameStringLiteral	testLoadAFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"testLoadAFile"	TokenNameStringLiteral	testLoadAFile
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"eh?"	TokenNameStringLiteral	eh?
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"property is not all in the file"	TokenNameStringLiteral	property is not all in the file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testLoadAFileEnc	TokenNameIdentifier	 test Load A File Enc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testLoadAFileEnc"	TokenNameStringLiteral	testLoadAFileEnc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"testLoadAFileEnc"	TokenNameStringLiteral	testLoadAFileEnc
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"file load failed"	TokenNameStringLiteral	file load failed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testEvalProps	TokenNameIdentifier	 test Eval Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testEvalProps"	TokenNameStringLiteral	testEvalProps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"testEvalProps"	TokenNameStringLiteral	testEvalProps
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"rain"	TokenNameStringLiteral	rain
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"property eval broken"	TokenNameStringLiteral	property eval broken
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test FilterChain and FilterReaders */	TokenNameCOMMENT_JAVADOC	 Test FilterChain and FilterReaders 
public	TokenNamepublic	
void	TokenNamevoid	
testFilterChain	TokenNameIdentifier	 test Filter Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFilterChain"	TokenNameStringLiteral	testFilterChain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"testFilterChain"	TokenNameStringLiteral	testFilterChain
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"World!"	TokenNameStringLiteral	World!
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Filter Chain broken"	TokenNameStringLiteral	Filter Chain broken
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test StripJavaComments filterreader functionality. */	TokenNameCOMMENT_JAVADOC	 Test StripJavaComments filterreader functionality. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
testStripJavaComments	TokenNameIdentifier	 test Strip Java Comments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testStripJavaComments"	TokenNameStringLiteral	testStripJavaComments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"expected"	TokenNameStringLiteral	expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
generated	TokenNameIdentifier	 generated
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"testStripJavaComments"	TokenNameStringLiteral	testStripJavaComments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
generated	TokenNameIdentifier	 generated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testOneLine	TokenNameIdentifier	 test One Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"testOneLine"	TokenNameStringLiteral	testOneLine
,	TokenNameCOMMA	
"testOneLine"	TokenNameStringLiteral	testOneLine
,	TokenNameCOMMA	
"1,2,3,4"	TokenNameStringLiteral	1,2,3,4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
