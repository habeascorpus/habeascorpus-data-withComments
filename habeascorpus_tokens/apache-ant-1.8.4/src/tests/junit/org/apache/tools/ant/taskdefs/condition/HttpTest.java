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
/** * Testcases for the &lt;http&gt; condition. All these tests require * us to be online as they attempt to get the status of various pages * on the Ant Apache web site. */	TokenNameCOMMENT_JAVADOC	 Testcases for the &lt;http&gt; condition. All these tests require us to be online as they attempt to get the status of various pages on the Ant Apache web site. 
public	TokenNamepublic	
class	TokenNameclass	
HttpTest	TokenNameIdentifier	 Http Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
HttpTest	TokenNameIdentifier	 Http Test
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
"src/etc/testcases/taskdefs/conditions/http.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/conditions/http.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoMethod	TokenNameIdentifier	 test No Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"basic-no-method"	TokenNameStringLiteral	basic-no-method
,	TokenNameCOMMA	
"basic-no-method"	TokenNameStringLiteral	basic-no-method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"basic-no-method-bad-url"	TokenNameStringLiteral	basic-no-method-bad-url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHeadRequest	TokenNameIdentifier	 test Head Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"test-head-request"	TokenNameStringLiteral	test-head-request
,	TokenNameCOMMA	
"test-head-request"	TokenNameStringLiteral	test-head-request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"test-head-request-bad-url"	TokenNameStringLiteral	test-head-request-bad-url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetRequest	TokenNameIdentifier	 test Get Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"test-get-request"	TokenNameStringLiteral	test-get-request
,	TokenNameCOMMA	
"test-get-request"	TokenNameStringLiteral	test-get-request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
"test-get-request-bad-url"	TokenNameStringLiteral	test-get-request-bad-url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadRequestMethod	TokenNameIdentifier	 test Bad Request Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"bad-request-method"	TokenNameStringLiteral	bad-request-method
,	TokenNameCOMMA	
"invalid HTTP request method specified"	TokenNameStringLiteral	invalid HTTP request method specified
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
