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
condition	TokenNameIdentifier	 condition
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
/** * test the typeexists condition */	TokenNameCOMMENT_JAVADOC	 test the typeexists condition 
public	TokenNamepublic	
class	TokenNameclass	
TypeFoundTest	TokenNameIdentifier	 Type Found Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
TypeFoundTest	TokenNameIdentifier	 Type Found Test
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
"src/etc/testcases/taskdefs/conditions/typefound.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/conditions/typefound.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTask	TokenNameIdentifier	 test Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"testTask"	TokenNameStringLiteral	testTask
,	TokenNameCOMMA	
"testTask"	TokenNameStringLiteral	testTask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUndefined	TokenNameIdentifier	 test Undefined
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testUndefined"	TokenNameStringLiteral	testUndefined
,	TokenNameCOMMA	
"left out the name attribute"	TokenNameStringLiteral	left out the name attribute
,	TokenNameCOMMA	
"No type specified"	TokenNameStringLiteral	No type specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTaskThatIsntDefined	TokenNameIdentifier	 test Task That Isnt Defined
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"testTaskThatIsntDefined"	TokenNameStringLiteral	testTaskThatIsntDefined
,	TokenNameCOMMA	
"testTaskThatIsntDefined"	TokenNameStringLiteral	testTaskThatIsntDefined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTaskThatDoesntReallyExist	TokenNameIdentifier	 test Task That Doesnt Really Exist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"testTaskThatDoesntReallyExist"	TokenNameStringLiteral	testTaskThatDoesntReallyExist
,	TokenNameCOMMA	
"testTaskThatDoesntReallyExist"	TokenNameStringLiteral	testTaskThatDoesntReallyExist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testType	TokenNameIdentifier	 test Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"testType"	TokenNameStringLiteral	testType
,	TokenNameCOMMA	
"testType"	TokenNameStringLiteral	testType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPreset	TokenNameIdentifier	 test Preset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"testPreset"	TokenNameStringLiteral	testPreset
,	TokenNameCOMMA	
"testPreset"	TokenNameStringLiteral	testPreset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMacro	TokenNameIdentifier	 test Macro
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"testMacro"	TokenNameStringLiteral	testMacro
,	TokenNameCOMMA	
"testMacro"	TokenNameStringLiteral	testMacro
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
