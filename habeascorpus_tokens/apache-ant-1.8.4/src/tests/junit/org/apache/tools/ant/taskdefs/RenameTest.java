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
RenameTest	TokenNameIdentifier	 Rename Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
RenameTest	TokenNameIdentifier	 Rename Test
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
"src/etc/testcases/taskdefs/rename.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/rename.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"required argument missing"	TokenNameStringLiteral	required argument missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
,	TokenNameCOMMA	
"required argument missing"	TokenNameStringLiteral	required argument missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
,	TokenNameCOMMA	
"required argument missing"	TokenNameStringLiteral	required argument missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public void test4() { expectBuildException("test4", "source and destination the same"); } public void test5() { executeTarget("test5"); } */	TokenNameCOMMENT_BLOCK	 public void test4() { expectBuildException("test4", "source and destination the same"); } public void test5() { executeTarget("test5"); } 
public	TokenNamepublic	
void	TokenNamevoid	
test6	TokenNameIdentifier	 test6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test6"	TokenNameStringLiteral	test6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	