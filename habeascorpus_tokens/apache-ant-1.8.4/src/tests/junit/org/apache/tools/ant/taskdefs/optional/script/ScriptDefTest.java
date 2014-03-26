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
script	TokenNameIdentifier	 script
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
Project	TokenNameIdentifier	 Project
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
FileSet	TokenNameIdentifier	 File Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Tests the examples of the &lt;scriptdef&gt; task. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Tests the examples of the &lt;scriptdef&gt; task. * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
ScriptDefTest	TokenNameIdentifier	 Script Def Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
ScriptDefTest	TokenNameIdentifier	 Script Def Test
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
"src/etc/testcases/taskdefs/optional/script/scriptdef.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/script/scriptdef.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimple	TokenNameIdentifier	 test Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"simple"	TokenNameStringLiteral	simple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get the fileset and its basedir 	TokenNameCOMMENT_LINE	get the fileset and its basedir 
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileSet	TokenNameIdentifier	 File Set
fileset	TokenNameIdentifier	 fileset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
"testfileset"	TokenNameStringLiteral	testfileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
baseDir	TokenNameIdentifier	 base Dir
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expecting attribute value printed"	TokenNameStringLiteral	Expecting attribute value printed
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Attribute attr1 = test"	TokenNameStringLiteral	Attribute attr1 = test
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expecting nested element value printed"	TokenNameStringLiteral	Expecting nested element value printed
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Fileset basedir = "	TokenNameStringLiteral	Fileset basedir = 
+	TokenNamePLUS	
baseDir	TokenNameIdentifier	 base Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoLang	TokenNameIdentifier	 test No Lang
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"nolang"	TokenNameStringLiteral	nolang
,	TokenNameCOMMA	
"Absence of language attribute not detected"	TokenNameStringLiteral	Absence of language attribute not detected
,	TokenNameCOMMA	
"requires a language attribute"	TokenNameStringLiteral	requires a language attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoName	TokenNameIdentifier	 test No Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"noname"	TokenNameStringLiteral	noname
,	TokenNameCOMMA	
"Absence of name attribute not detected"	TokenNameStringLiteral	Absence of name attribute not detected
,	TokenNameCOMMA	
"scriptdef requires a name attribute"	TokenNameStringLiteral	scriptdef requires a name attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNestedByClassName	TokenNameIdentifier	 test Nested By Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"nestedbyclassname"	TokenNameStringLiteral	nestedbyclassname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get the fileset and its basedir 	TokenNameCOMMENT_LINE	get the fileset and its basedir 
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileSet	TokenNameIdentifier	 File Set
fileset	TokenNameIdentifier	 fileset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
"testfileset"	TokenNameStringLiteral	testfileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
baseDir	TokenNameIdentifier	 base Dir
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expecting attribute value to be printed"	TokenNameStringLiteral	Expecting attribute value to be printed
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Attribute attr1 = test"	TokenNameStringLiteral	Attribute attr1 = test
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expecting nested element value to be printed"	TokenNameStringLiteral	Expecting nested element value to be printed
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Fileset basedir = "	TokenNameStringLiteral	Fileset basedir = 
+	TokenNamePLUS	
baseDir	TokenNameIdentifier	 base Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoElement	TokenNameIdentifier	 test No Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectOutput	TokenNameIdentifier	 expect Output
(	TokenNameLPAREN	
"noelement"	TokenNameStringLiteral	noelement
,	TokenNameCOMMA	
"Attribute attr1 = test"	TokenNameStringLiteral	Attribute attr1 = test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testException	TokenNameIdentifier	 test Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"exception"	TokenNameStringLiteral	exception
,	TokenNameCOMMA	
"Should have thrown an exception in the script"	TokenNameStringLiteral	Should have thrown an exception in the script
,	TokenNameCOMMA	
"TypeError"	TokenNameStringLiteral	TypeError
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDoubleDef	TokenNameIdentifier	 test Double Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"doubledef"	TokenNameStringLiteral	doubledef
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Task1 did not execute"	TokenNameStringLiteral	Task1 did not execute
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Task1"	TokenNameStringLiteral	Task1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Task2 did not execute"	TokenNameStringLiteral	Task2 did not execute
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Task2"	TokenNameStringLiteral	Task2
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDoubleAttribute	TokenNameIdentifier	 test Double Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"doubleAttributeDef"	TokenNameStringLiteral	doubleAttributeDef
,	TokenNameCOMMA	
"Should have detected duplicate attribute definition"	TokenNameStringLiteral	Should have detected duplicate attribute definition
,	TokenNameCOMMA	
"attr1 attribute more than once"	TokenNameStringLiteral	attr1 attribute more than once
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testProperty	TokenNameIdentifier	 test Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"property"	TokenNameStringLiteral	property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get the fileset and its basedir 	TokenNameCOMMENT_LINE	get the fileset and its basedir 
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expecting property in attribute value replaced"	TokenNameStringLiteral	Expecting property in attribute value replaced
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Attribute value = test"	TokenNameStringLiteral	Attribute value = test
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
