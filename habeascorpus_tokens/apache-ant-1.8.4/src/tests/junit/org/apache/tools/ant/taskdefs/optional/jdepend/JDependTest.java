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
jdepend	TokenNameIdentifier	 jdepend
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
/** * Testcase for the JDepend optional task. * */	TokenNameCOMMENT_JAVADOC	 Testcase for the JDepend optional task. 
public	TokenNamepublic	
class	TokenNameclass	
JDependTest	TokenNameIdentifier	 J Depend Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESULT_FILESET	TokenNameIdentifier	 RESULT  FILESET
=	TokenNameEQUAL	
"result"	TokenNameStringLiteral	result
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JDependTest	TokenNameIdentifier	 J Depend Test
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
"src/etc/testcases/taskdefs/optional/jdepend/jdepend.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/jdepend/jdepend.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test simple */	TokenNameCOMMENT_JAVADOC	 Test simple 
public	TokenNamepublic	
void	TokenNamevoid	
testSimple	TokenNameIdentifier	 test Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectOutputContaining	TokenNameIdentifier	 expect Output Containing
(	TokenNameLPAREN	
"simple"	TokenNameStringLiteral	simple
,	TokenNameCOMMA	
"Package: org.apache.tools.ant.util.facade"	TokenNameStringLiteral	Package: org.apache.tools.ant.util.facade
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test xml */	TokenNameCOMMENT_JAVADOC	 Test xml 
public	TokenNamepublic	
void	TokenNamevoid	
testXml	TokenNameIdentifier	 test Xml
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectOutputContaining	TokenNameIdentifier	 expect Output Containing
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
,	TokenNameCOMMA	
"<DependsUpon>"	TokenNameStringLiteral	<DependsUpon>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test fork * - forked output goes to log */	TokenNameCOMMENT_JAVADOC	 Test fork - forked output goes to log 
public	TokenNamepublic	
void	TokenNamevoid	
testFork	TokenNameIdentifier	 test Fork
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"fork"	TokenNameStringLiteral	fork
,	TokenNameCOMMA	
"Package: org.apache.tools.ant.util.facade"	TokenNameStringLiteral	Package: org.apache.tools.ant.util.facade
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test fork xml */	TokenNameCOMMENT_JAVADOC	 Test fork xml 
public	TokenNamepublic	
void	TokenNamevoid	
testForkXml	TokenNameIdentifier	 test Fork Xml
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"fork-xml"	TokenNameStringLiteral	fork-xml
,	TokenNameCOMMA	
"<DependsUpon>"	TokenNameStringLiteral	<DependsUpon>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test timeout */	TokenNameCOMMENT_JAVADOC	 Test timeout 
public	TokenNamepublic	
void	TokenNamevoid	
testTimeout	TokenNameIdentifier	 test Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"fork-timeout"	TokenNameStringLiteral	fork-timeout
,	TokenNameCOMMA	
"JDepend FAILED - Timed out"	TokenNameStringLiteral	JDepend FAILED - Timed out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test timeout without timing out */	TokenNameCOMMENT_JAVADOC	 Test timeout without timing out 
public	TokenNamepublic	
void	TokenNamevoid	
testTimeoutNot	TokenNameIdentifier	 test Timeout Not
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"fork-timeout-not"	TokenNameStringLiteral	fork-timeout-not
,	TokenNameCOMMA	
"Package: org.apache.tools.ant.util.facade"	TokenNameStringLiteral	Package: org.apache.tools.ant.util.facade
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that the given message has been outputted */	TokenNameCOMMENT_JAVADOC	 Assert that the given message has been outputted 
protected	TokenNameprotected	
void	TokenNamevoid	
expectOutputContaining	TokenNameIdentifier	 expect Output Containing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
