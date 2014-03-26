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
/** * Tests the {@link XSLTProcess} task. * XXX merge with {@link StyleTest}? * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Tests the {@link XSLTProcess} task. XXX merge with {@link StyleTest}? @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
XsltTest	TokenNameIdentifier	 Xslt Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
/** * where tasks run */	TokenNameCOMMENT_JAVADOC	 where tasks run 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/
;	TokenNameSEMICOLON	
/** * Constructor * * @param name testname */	TokenNameCOMMENT_JAVADOC	 Constructor * @param name testname 
public	TokenNamepublic	
XsltTest	TokenNameIdentifier	 Xslt Test
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
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
+	TokenNamePLUS	
"xslt.xml"	TokenNameStringLiteral	xslt.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The teardown method for JUnit */	TokenNameCOMMENT_JAVADOC	 The teardown method for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"teardown"	TokenNameStringLiteral	teardown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testCatchNoDtd	TokenNameIdentifier	 test Catch No Dtd
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testCatchNoDtd"	TokenNameStringLiteral	testCatchNoDtd
,	TokenNameCOMMA	
"expected failure"	TokenNameStringLiteral	expected failure
,	TokenNameCOMMA	
/* actually: "chemical" */	TokenNameCOMMENT_BLOCK	 actually: "chemical" 
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testCatalog	TokenNameIdentifier	 test Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testCatalog"	TokenNameStringLiteral	testCatalog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOutputProperty	TokenNameIdentifier	 test Output Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testOutputProperty"	TokenNameStringLiteral	testOutputProperty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Only runs if xalan.jar is in CP (not incl. Sun's JRE repackaging): public void testFactory() throws Exception { executeTarget("testFactory"); } public void testAttribute() throws Exception { executeTarget("testAttribute"); } */	TokenNameCOMMENT_BLOCK	 Only runs if xalan.jar is in CP (not incl. Sun's JRE repackaging): public void testFactory() throws Exception { executeTarget("testFactory"); } public void testAttribute() throws Exception { executeTarget("testAttribute"); } 
public	TokenNamepublic	
void	TokenNamevoid	
testXMLWithEntitiesInNonAsciiPath	TokenNameIdentifier	 test XML With Entities In Non Ascii Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testXMLWithEntitiesInNonAsciiPath"	TokenNameStringLiteral	testXMLWithEntitiesInNonAsciiPath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * check that the system id gets set properly on stylesheets. * @throws Exception if something goes wrong. */	TokenNameCOMMENT_JAVADOC	 check that the system id gets set properly on stylesheets. @throws Exception if something goes wrong. 
public	TokenNamepublic	
void	TokenNamevoid	
testStyleSheetWithInclude	TokenNameIdentifier	 test Style Sheet With Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testStyleSheetWithInclude"	TokenNameStringLiteral	testStyleSheetWithInclude
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"java.io.FileNotFoundException"	TokenNameStringLiteral	java.io.FileNotFoundException
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"xsl:include was not found"	TokenNameStringLiteral	xsl:include was not found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
