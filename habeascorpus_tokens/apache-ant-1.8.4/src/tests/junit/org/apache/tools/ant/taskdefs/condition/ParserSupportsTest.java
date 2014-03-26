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
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
ParserSupportsTest	TokenNameIdentifier	 Parser Supports Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
ParserSupportsTest	TokenNameIdentifier	 Parser Supports Test
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
"src/etc/testcases/taskdefs/conditions/parsersupports.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/conditions/parsersupports.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testEmpty"	TokenNameStringLiteral	testEmpty
,	TokenNameCOMMA	
ParserSupports	TokenNameIdentifier	 Parser Supports
.	TokenNameDOT	
ERROR_NO_ATTRIBUTES	TokenNameIdentifier	 ERROR  NO  ATTRIBUTES
,	TokenNameCOMMA	
ParserSupports	TokenNameIdentifier	 Parser Supports
.	TokenNameDOT	
ERROR_NO_ATTRIBUTES	TokenNameIdentifier	 ERROR  NO  ATTRIBUTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBoth	TokenNameIdentifier	 test Both
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testBoth"	TokenNameStringLiteral	testBoth
,	TokenNameCOMMA	
ParserSupports	TokenNameIdentifier	 Parser Supports
.	TokenNameDOT	
ERROR_BOTH_ATTRIBUTES	TokenNameIdentifier	 ERROR  BOTH  ATTRIBUTES
,	TokenNameCOMMA	
ParserSupports	TokenNameIdentifier	 Parser Supports
.	TokenNameDOT	
ERROR_BOTH_ATTRIBUTES	TokenNameIdentifier	 ERROR  BOTH  ATTRIBUTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNamespaces	TokenNameIdentifier	 test Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testNamespaces"	TokenNameStringLiteral	testNamespaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPropertyNoValue	TokenNameIdentifier	 test Property No Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testPropertyNoValue"	TokenNameStringLiteral	testPropertyNoValue
,	TokenNameCOMMA	
ParserSupports	TokenNameIdentifier	 Parser Supports
.	TokenNameDOT	
ERROR_NO_VALUE	TokenNameIdentifier	 ERROR  NO  VALUE
,	TokenNameCOMMA	
ParserSupports	TokenNameIdentifier	 Parser Supports
.	TokenNameDOT	
ERROR_NO_VALUE	TokenNameIdentifier	 ERROR  NO  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnknownProperty	TokenNameIdentifier	 test Unknown Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testUnknownProperty"	TokenNameStringLiteral	testUnknownProperty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
NotestPropertyInvalid	TokenNameIdentifier	 Notest Property Invalid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testPropertyInvalid"	TokenNameStringLiteral	testPropertyInvalid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
NotestXercesProperty	TokenNameIdentifier	 Notest Xerces Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testXercesProperty"	TokenNameStringLiteral	testXercesProperty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
