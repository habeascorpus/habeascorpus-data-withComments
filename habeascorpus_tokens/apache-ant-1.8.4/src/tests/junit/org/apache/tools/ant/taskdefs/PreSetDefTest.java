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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
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
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
PreSetDefTest	TokenNameIdentifier	 Pre Set Def Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
PreSetDefTest	TokenNameIdentifier	 Pre Set Def Test
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
"src/etc/testcases/taskdefs/presetdef.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/presetdef.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimple	TokenNameIdentifier	 test Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"simple"	TokenNameStringLiteral	simple
,	TokenNameCOMMA	
"Hello world"	TokenNameStringLiteral	Hello world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testText	TokenNameIdentifier	 test Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"text"	TokenNameStringLiteral	text
,	TokenNameCOMMA	
"Inner Text"	TokenNameStringLiteral	Inner Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUri	TokenNameIdentifier	 test Uri
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"uri"	TokenNameStringLiteral	uri
,	TokenNameCOMMA	
"Hello world"	TokenNameStringLiteral	Hello world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultTest	TokenNameIdentifier	 test Default Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"defaulttest"	TokenNameStringLiteral	defaulttest
,	TokenNameCOMMA	
"attribute is false"	TokenNameStringLiteral	attribute is false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDoubleDefault	TokenNameIdentifier	 test Double Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"doubledefault"	TokenNameStringLiteral	doubledefault
,	TokenNameCOMMA	
"attribute is falseattribute is true"	TokenNameStringLiteral	attribute is falseattribute is true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTextOptional	TokenNameIdentifier	 test Text Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"text.optional"	TokenNameStringLiteral	text.optional
,	TokenNameCOMMA	
"MyTextoverride text"	TokenNameStringLiteral	MyTextoverride text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testElementOrder	TokenNameIdentifier	 test Element Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"element.order"	TokenNameStringLiteral	element.order
,	TokenNameCOMMA	
"Line 1Line 2"	TokenNameStringLiteral	Line 1Line 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testElementOrder2	TokenNameIdentifier	 test Element Order2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"element.order2"	TokenNameStringLiteral	element.order2
,	TokenNameCOMMA	
"Line 1Line 2Line 3"	TokenNameStringLiteral	Line 1Line 2Line 3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAntTypeTest	TokenNameIdentifier	 test Ant Type Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"antTypeTest"	TokenNameStringLiteral	antTypeTest
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCorrectTaskNameBadAttr	TokenNameIdentifier	 test Correct Task Name Bad Attr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"correct_taskname_badattr"	TokenNameStringLiteral	correct_taskname_badattr
,	TokenNameCOMMA	
"attribute message"	TokenNameStringLiteral	attribute message
,	TokenNameCOMMA	
"javac doesn't support the"	TokenNameStringLiteral	javac doesn't support the
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCorrectTaskNameBadEl	TokenNameIdentifier	 test Correct Task Name Bad El
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"correct_taskname_badel"	TokenNameStringLiteral	correct_taskname_badel
,	TokenNameCOMMA	
"element message"	TokenNameStringLiteral	element message
,	TokenNameCOMMA	
"javac doesn't support the"	TokenNameStringLiteral	javac doesn't support the
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPresetdefWithNestedElementTwice	TokenNameIdentifier	 test Presetdef With Nested Element Twice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// #38056 	TokenNameCOMMENT_LINE	#38056 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"presetdef-with-nested-element-twice"	TokenNameStringLiteral	presetdef-with-nested-element-twice
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"presetdef-with-nested-element-twice"	TokenNameStringLiteral	presetdef-with-nested-element-twice
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A test class to check default properties */	TokenNameCOMMENT_JAVADOC	 A test class to check default properties 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DefaultTest	TokenNameIdentifier	 Default Test
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isSet	TokenNameIdentifier	 is Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSet	TokenNameIdentifier	 is Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Attribute Already set"	TokenNameStringLiteral	Attribute Already set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
isSet	TokenNameIdentifier	 is Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"attribute is "	TokenNameStringLiteral	attribute is 
+	TokenNamePLUS	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A test class to check presetdef with add and addConfigured and ant-type */	TokenNameCOMMENT_JAVADOC	 A test class to check presetdef with add and addConfigured and ant-type 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
AntTypeTest	TokenNameIdentifier	 Ant Type Test
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addFileSet	TokenNameIdentifier	 add File Set
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredConfigured	TokenNameIdentifier	 add Configured Configured
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
