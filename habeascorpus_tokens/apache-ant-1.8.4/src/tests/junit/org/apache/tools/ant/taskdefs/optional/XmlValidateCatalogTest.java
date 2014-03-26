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
/** * Tests the XMLValidate optional task with nested external catalogs. * * @see XmlValidateTest * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Tests the XMLValidate optional task with nested external catalogs. * @see XmlValidateTest @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
XmlValidateCatalogTest	TokenNameIdentifier	 Xml Validate Catalog Test
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
XmlValidateCatalogTest	TokenNameIdentifier	 Xml Validate Catalog Test
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
"xmlvalidate.xml"	TokenNameStringLiteral	xmlvalidate.xml
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
}	TokenNameRBRACE	
/** * catalogfiles fileset should be ignored * if resolver.jar is not present, but will * be used if it is. either way, test should * work b/c we have a nested dtd with the same * entity */	TokenNameCOMMENT_JAVADOC	 catalogfiles fileset should be ignored if resolver.jar is not present, but will be used if it is. either way, test should work b/c we have a nested dtd with the same entity 
public	TokenNamepublic	
void	TokenNamevoid	
testXmlCatalogFiles	TokenNameIdentifier	 test Xml Catalog Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"xmlcatalogfiles"	TokenNameStringLiteral	xmlcatalogfiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test nested catalogpath. * It should be ignored if resolver.jar is not * present, but will be used if it is. either * way, test should work b/c we have a nested * dtd with the same entity */	TokenNameCOMMENT_JAVADOC	 Test nested catalogpath. It should be ignored if resolver.jar is not present, but will be used if it is. either way, test should work b/c we have a nested dtd with the same entity 
public	TokenNamepublic	
void	TokenNamevoid	
testXmlCatalogPath	TokenNameIdentifier	 test Xml Catalog Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"xmlcatalogpath"	TokenNameStringLiteral	xmlcatalogpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
