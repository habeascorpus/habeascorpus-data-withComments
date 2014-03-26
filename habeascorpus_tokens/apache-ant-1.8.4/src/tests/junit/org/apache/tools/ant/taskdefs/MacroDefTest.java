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
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
MacroDefTest	TokenNameIdentifier	 Macro Def Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
MacroDefTest	TokenNameIdentifier	 Macro Def Test
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
"src/etc/testcases/taskdefs/macrodef.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/macrodef.xml
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
"Hello World"	TokenNameStringLiteral	Hello World
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
testDuplicateAttribute	TokenNameIdentifier	 test Duplicate Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"duplicate.attribute"	TokenNameStringLiteral	duplicate.attribute
,	TokenNameCOMMA	
"the attribute text has already been specified"	TokenNameStringLiteral	the attribute text has already been specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDuplicateElement	TokenNameIdentifier	 test Duplicate Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"duplicate.element"	TokenNameStringLiteral	duplicate.element
,	TokenNameCOMMA	
"the element text has already been specified"	TokenNameStringLiteral	the element text has already been specified
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
"Hello World"	TokenNameStringLiteral	Hello World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNested	TokenNameIdentifier	 test Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"nested"	TokenNameStringLiteral	nested
,	TokenNameCOMMA	
"A nested element"	TokenNameStringLiteral	A nested element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDouble	TokenNameIdentifier	 test Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"double"	TokenNameStringLiteral	double
,	TokenNameCOMMA	
"@{prop} is 'property', value of ${property} is 'A property value'"	TokenNameStringLiteral	@{prop} is 'property', value of ${property} is 'A property value'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIgnoreCase	TokenNameIdentifier	 test Ignore Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"ignorecase"	TokenNameStringLiteral	ignorecase
,	TokenNameCOMMA	
"a is ab is b"	TokenNameStringLiteral	a is ab is b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIgnoreElementCase	TokenNameIdentifier	 test Ignore Element Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"ignore-element-case"	TokenNameStringLiteral	ignore-element-case
,	TokenNameCOMMA	
"nested elementnested element"	TokenNameStringLiteral	nested elementnested element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTextElement	TokenNameIdentifier	 test Text Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"textelement"	TokenNameStringLiteral	textelement
,	TokenNameCOMMA	
"Hello world"	TokenNameStringLiteral	Hello world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTextTrim	TokenNameIdentifier	 test Text Trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"text.trim"	TokenNameStringLiteral	text.trim
,	TokenNameCOMMA	
"[Hello world]"	TokenNameStringLiteral	[Hello world]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDuplicateTextName	TokenNameIdentifier	 test Duplicate Text Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"duplicatetextname"	TokenNameStringLiteral	duplicatetextname
,	TokenNameCOMMA	
"the name "text" is already used as an attribute"	TokenNameStringLiteral	the name "text" is already used as an attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDuplicateTextName2	TokenNameIdentifier	 test Duplicate Text Name2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"duplicatetextname2"	TokenNameStringLiteral	duplicatetextname2
,	TokenNameCOMMA	
"the attribute name "text" has already been used by the text element"	TokenNameStringLiteral	the attribute name "text" has already been used by the text element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEscape	TokenNameIdentifier	 test Escape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"escape"	TokenNameStringLiteral	escape
,	TokenNameCOMMA	
"a@b or a@b is avalue@bvalue"	TokenNameStringLiteral	a@b or a@b is avalue@bvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAttributeDescription	TokenNameIdentifier	 test Attribute Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"attribute.description"	TokenNameStringLiteral	attribute.description
,	TokenNameCOMMA	
"description is hello world"	TokenNameStringLiteral	description is hello world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOverrideDefault	TokenNameIdentifier	 test Override Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"override.default"	TokenNameStringLiteral	override.default
,	TokenNameCOMMA	
"value is new"	TokenNameStringLiteral	value is new
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImplicit	TokenNameIdentifier	 test Implicit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"implicit"	TokenNameStringLiteral	implicit
,	TokenNameCOMMA	
"Before implicitIn implicitAfter implicit"	TokenNameStringLiteral	Before implicitIn implicitAfter implicit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImplicitNotOptional	TokenNameIdentifier	 test Implicit Not Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"implicit.notoptional"	TokenNameStringLiteral	implicit.notoptional
,	TokenNameCOMMA	
"Missing nested elements for implicit element implicit"	TokenNameStringLiteral	Missing nested elements for implicit element implicit
,	TokenNameCOMMA	
"Missing nested elements for implicit element implicit"	TokenNameStringLiteral	Missing nested elements for implicit element implicit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImplicitOptional	TokenNameIdentifier	 test Implicit Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"implicit.optional"	TokenNameStringLiteral	implicit.optional
,	TokenNameCOMMA	
"Before implicitAfter implicit"	TokenNameStringLiteral	Before implicitAfter implicit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImplicitExplicit	TokenNameIdentifier	 test Implicit Explicit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"implicit.explicit"	TokenNameStringLiteral	implicit.explicit
,	TokenNameCOMMA	
"Only one element allowed when using implicit elements"	TokenNameStringLiteral	Only one element allowed when using implicit elements
,	TokenNameCOMMA	
"Only one element allowed when using implicit elements"	TokenNameStringLiteral	Only one element allowed when using implicit elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBackTraceOff	TokenNameIdentifier	 test Back Trace Off
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"backtraceoff"	TokenNameStringLiteral	backtraceoff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"following error occurred"	TokenNameStringLiteral	following error occurred
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"error message contained backtrace - "	TokenNameStringLiteral	error message contained backtrace - 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBackTrace	TokenNameIdentifier	 test Back Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"backtraceon"	TokenNameStringLiteral	backtraceon
,	TokenNameCOMMA	
"Checking if a back trace is created"	TokenNameStringLiteral	Checking if a back trace is created
,	TokenNameCOMMA	
"following error occurred"	TokenNameStringLiteral	following error occurred
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTopLevelText	TokenNameIdentifier	 test Top Level Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"top-level-text"	TokenNameStringLiteral	top-level-text
,	TokenNameCOMMA	
"Hello World"	TokenNameStringLiteral	Hello World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
