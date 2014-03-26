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
/** * Testcases for the &lt;isreference&gt; condition. * */	TokenNameCOMMENT_JAVADOC	 Testcases for the &lt;isreference&gt; condition. 
public	TokenNamepublic	
class	TokenNameclass	
IsReferenceTest	TokenNameIdentifier	 Is Reference Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
IsReferenceTest	TokenNameIdentifier	 Is Reference Test
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
"src/etc/testcases/taskdefs/conditions/isreference.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/conditions/isreference.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasic	TokenNameIdentifier	 test Basic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"basic"	TokenNameStringLiteral	basic
,	TokenNameCOMMA	
"global-path"	TokenNameStringLiteral	global-path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertySet	TokenNameIdentifier	 assert Property Set
(	TokenNameLPAREN	
"target-path"	TokenNameStringLiteral	target-path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"undefined"	TokenNameStringLiteral	undefined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNotEnoughArgs	TokenNameIdentifier	 test Not Enough Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"isreference-incomplete"	TokenNameStringLiteral	isreference-incomplete
,	TokenNameCOMMA	
"refid attribute has been omitted"	TokenNameStringLiteral	refid attribute has been omitted
,	TokenNameCOMMA	
"No reference specified for isreference "	TokenNameStringLiteral	No reference specified for isreference 
+	TokenNamePLUS	
"condition"	TokenNameStringLiteral	condition
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
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
"global-path"	TokenNameStringLiteral	global-path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"global-path-as-fileset"	TokenNameStringLiteral	global-path-as-fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"global-path-as-foo"	TokenNameStringLiteral	global-path-as-foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertySet	TokenNameIdentifier	 assert Property Set
(	TokenNameLPAREN	
"global-echo"	TokenNameStringLiteral	global-echo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
