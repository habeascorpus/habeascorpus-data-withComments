/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
/** * created 16-Mar-2006 12:25:12 */	TokenNameCOMMENT_JAVADOC	 created 16-Mar-2006 12:25:12 
public	TokenNamepublic	
class	TokenNameclass	
ExtendedTaskdefTest	TokenNameIdentifier	 Extended Taskdef Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
/** * Constructor for the BuildFileTest object. * * @param name string to pass up to TestCase constructor */	TokenNameCOMMENT_JAVADOC	 Constructor for the BuildFileTest object. * @param name string to pass up to TestCase constructor 
public	TokenNamepublic	
ExtendedTaskdefTest	TokenNameIdentifier	 Extended Taskdef Test
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
"src/etc/testcases/core/extended-taskdef.xml"	TokenNameStringLiteral	src/etc/testcases/core/extended-taskdef.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Automatically calls the target called "tearDown" * from the build file tested if it exits. * <p/> * This allows to use Ant tasks directly in the build file * to clean up after each test. Note that no "setUp" target * is automatically called, since it's trivial to have a * test target depend on it. */	TokenNameCOMMENT_JAVADOC	 Automatically calls the target called "tearDown" from the build file tested if it exits. <p/> This allows to use Ant tasks directly in the build file to clean up after each test. Note that no "setUp" target is automatically called, since it's trivial to have a test target depend on it. 
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"teardown"	TokenNameStringLiteral	teardown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRun	TokenNameIdentifier	 test Run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testRun"	TokenNameStringLiteral	testRun
,	TokenNameCOMMA	
"exception thrown by the subclass"	TokenNameStringLiteral	exception thrown by the subclass
,	TokenNameCOMMA	
"executing the Foo task"	TokenNameStringLiteral	executing the Foo task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRun2	TokenNameIdentifier	 test Run2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testRun2"	TokenNameStringLiteral	testRun2
,	TokenNameCOMMA	
"exception thrown by the subclass"	TokenNameStringLiteral	exception thrown by the subclass
,	TokenNameCOMMA	
"executing the Foo task"	TokenNameStringLiteral	executing the Foo task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
