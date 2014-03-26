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
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
TypedefTest	TokenNameIdentifier	 Typedef Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
TypedefTest	TokenNameIdentifier	 Typedef Test
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
"src/etc/testcases/taskdefs/typedef.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/typedef.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"empty"	TokenNameStringLiteral	empty
,	TokenNameCOMMA	
"required argument not specified"	TokenNameStringLiteral	required argument not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoName	TokenNameIdentifier	 test No Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"noName"	TokenNameStringLiteral	noName
,	TokenNameCOMMA	
"required argument not specified"	TokenNameStringLiteral	required argument not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoClassname	TokenNameIdentifier	 test No Classname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"noClassname"	TokenNameStringLiteral	noClassname
,	TokenNameCOMMA	
"required argument not specified"	TokenNameStringLiteral	required argument not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testClassNotFound	TokenNameIdentifier	 test Class Not Found
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"classNotFound"	TokenNameStringLiteral	classNotFound
,	TokenNameCOMMA	
"classname specified doesn't exist"	TokenNameStringLiteral	classname specified doesn't exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGlobal	TokenNameIdentifier	 test Global
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"testGlobal"	TokenNameStringLiteral	testGlobal
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getReferences	TokenNameIdentifier	 get References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"global"	TokenNameStringLiteral	global
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"ref is not null"	TokenNameStringLiteral	ref is not null
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"org.example.types.TypedefTestType"	TokenNameStringLiteral	org.example.types.TypedefTestType
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLocal	TokenNameIdentifier	 test Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"testLocal"	TokenNameStringLiteral	testLocal
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getReferences	TokenNameIdentifier	 get References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"local"	TokenNameStringLiteral	local
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"ref is not null"	TokenNameStringLiteral	ref is not null
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"org.example.types.TypedefTestType"	TokenNameStringLiteral	org.example.types.TypedefTestType
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test to make sure that one can define a not present * optional type twice and then have a valid definition. */	TokenNameCOMMENT_JAVADOC	 test to make sure that one can define a not present optional type twice and then have a valid definition. 
public	TokenNamepublic	
void	TokenNamevoid	
testDoubleNotPresent	TokenNameIdentifier	 test Double Not Present
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"double-notpresent"	TokenNameStringLiteral	double-notpresent
,	TokenNameCOMMA	
"hi"	TokenNameStringLiteral	hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoResourceOnErrorFailAll	TokenNameIdentifier	 test No Resource On Error Fail All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"noresourcefailall"	TokenNameStringLiteral	noresourcefailall
,	TokenNameCOMMA	
"the requested resource does not exist"	TokenNameStringLiteral	the requested resource does not exist
,	TokenNameCOMMA	
"Could not load definitions from resource "	TokenNameStringLiteral	Could not load definitions from resource 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoResourceOnErrorFail	TokenNameIdentifier	 test No Resource On Error Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"noresourcefail"	TokenNameStringLiteral	noresourcefail
,	TokenNameCOMMA	
"Could not load definitions from resource "	TokenNameStringLiteral	Could not load definitions from resource 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoResourceOnErrorNotFail	TokenNameIdentifier	 test No Resource On Error Not Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"noresourcenotfail"	TokenNameStringLiteral	noresourcenotfail
,	TokenNameCOMMA	
"Could not load definitions from resource "	TokenNameStringLiteral	Could not load definitions from resource 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
