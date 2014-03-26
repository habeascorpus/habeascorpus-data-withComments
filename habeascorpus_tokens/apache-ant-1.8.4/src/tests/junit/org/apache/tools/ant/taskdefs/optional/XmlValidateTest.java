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
BuildException	TokenNameIdentifier	 Build Exception
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
/** * Tests the XMLValidate optional task, by running targets in the test script * <code>src/etc/testcases/taskdefs/optional/xmlvalidate.xml</code> * <p> * * @see XmlValidateCatalogTest * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Tests the XMLValidate optional task, by running targets in the test script <code>src/etc/testcases/taskdefs/optional/xmlvalidate.xml</code> <p> * @see XmlValidateCatalogTest @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
XmlValidateTest	TokenNameIdentifier	 Xml Validate Test
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
XmlValidateTest	TokenNameIdentifier	 Xml Validate Test
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
/** * Basic inline 'dtd' element test. */	TokenNameCOMMENT_JAVADOC	 Basic inline 'dtd' element test. 
public	TokenNamepublic	
void	TokenNamevoid	
testValidate	TokenNameIdentifier	 test Validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testValidate"	TokenNameStringLiteral	testValidate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test indirect validation. */	TokenNameCOMMENT_JAVADOC	 Test indirect validation. 
public	TokenNamepublic	
void	TokenNamevoid	
testDeepValidate	TokenNameIdentifier	 test Deep Validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testDeepValidate"	TokenNameStringLiteral	testDeepValidate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
void	TokenNamevoid	
testXmlCatalog	TokenNameIdentifier	 test Xml Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"xmlcatalog"	TokenNameStringLiteral	xmlcatalog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
void	TokenNamevoid	
testXmlCatalogViaRefid	TokenNameIdentifier	 test Xml Catalog Via Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"xmlcatalogViaRefid"	TokenNameStringLiteral	xmlcatalogViaRefid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that the nested dtd element is used when resolver.jar is not * present. This test should pass either way. */	TokenNameCOMMENT_JAVADOC	 Test that the nested dtd element is used when resolver.jar is not present. This test should pass either way. 
public	TokenNamepublic	
void	TokenNamevoid	
testXmlCatalogFiles	TokenNameIdentifier	 test Xml Catalog Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"xmlcatalogfiles-override"	TokenNameStringLiteral	xmlcatalogfiles-override
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test nested catalogpath. * Test that the nested dtd element is used when resolver.jar is not * present. This test should pass either way. */	TokenNameCOMMENT_JAVADOC	 Test nested catalogpath. Test that the nested dtd element is used when resolver.jar is not present. This test should pass either way. 
public	TokenNamepublic	
void	TokenNamevoid	
testXmlCatalogPath	TokenNameIdentifier	 test Xml Catalog Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"xmlcatalogpath-override"	TokenNameStringLiteral	xmlcatalogpath-override
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test nested xmlcatalog definitions */	TokenNameCOMMENT_JAVADOC	 Test nested xmlcatalog definitions 
public	TokenNamepublic	
void	TokenNamevoid	
testXmlCatalogNested	TokenNameIdentifier	 test Xml Catalog Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"xmlcatalognested"	TokenNameStringLiteral	xmlcatalognested
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test xml schema validation */	TokenNameCOMMENT_JAVADOC	 Test xml schema validation 
public	TokenNamepublic	
void	TokenNamevoid	
testXmlSchemaGood	TokenNameIdentifier	 test Xml Schema Good
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testSchemaGood"	TokenNameStringLiteral	testSchemaGood
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
" doesn't recognize feature http://apache.org/xml/features/validation/schema"	TokenNameStringLiteral	 doesn't recognize feature http://apache.org/xml/features/validation/schema
)	TokenNameRPAREN	
||	TokenNameOR_OR	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
" doesn't support feature http://apache.org/xml/features/validation/schema"	TokenNameStringLiteral	 doesn't support feature http://apache.org/xml/features/validation/schema
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" skipped, parser doesn't support schema"	TokenNameStringLiteral	 skipped, parser doesn't support schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test xml schema validation */	TokenNameCOMMENT_JAVADOC	 Test xml schema validation 
public	TokenNamepublic	
void	TokenNamevoid	
testXmlSchemaBad	TokenNameIdentifier	 test Xml Schema Bad
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testSchemaBad"	TokenNameStringLiteral	testSchemaBad
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw BuildException because 'Bad Schema Validation'"	TokenNameStringLiteral	Should throw BuildException because 'Bad Schema Validation'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testSchemaBad"	TokenNameStringLiteral	testSchemaBad
,	TokenNameCOMMA	
"Bad Schema Validation"	TokenNameStringLiteral	Bad Schema Validation
,	TokenNameCOMMA	
"not a valid XML document"	TokenNameStringLiteral	not a valid XML document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
" doesn't recognize feature http://apache.org/xml/features/validation/schema"	TokenNameStringLiteral	 doesn't recognize feature http://apache.org/xml/features/validation/schema
)	TokenNameRPAREN	
||	TokenNameOR_OR	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
" doesn't support feature http://apache.org/xml/features/validation/schema"	TokenNameStringLiteral	 doesn't support feature http://apache.org/xml/features/validation/schema
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" skipped, parser doesn't support schema"	TokenNameStringLiteral	 skipped, parser doesn't support schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"not a valid XML document"	TokenNameStringLiteral	not a valid XML document
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * iso-2022-jp.xml is valid but wouldn't get recognized on systems * with a different native encoding. * * Bug 11279 */	TokenNameCOMMENT_JAVADOC	 iso-2022-jp.xml is valid but wouldn't get recognized on systems with a different native encoding. * Bug 11279 
public	TokenNamepublic	
void	TokenNamevoid	
testIso2022Jp	TokenNameIdentifier	 test Iso2022 Jp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testIso2022Jp"	TokenNameStringLiteral	testIso2022Jp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * utf-8.xml is invalid as it contains non-UTF-8 characters, but * would pass on systems with a native iso-8859-1 (or similar) * encoding. * * Bug 11279 */	TokenNameCOMMENT_JAVADOC	 utf-8.xml is invalid as it contains non-UTF-8 characters, but would pass on systems with a native iso-8859-1 (or similar) encoding. * Bug 11279 
public	TokenNamepublic	
void	TokenNamevoid	
testUtf8	TokenNameIdentifier	 test Utf8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testUtf8"	TokenNameStringLiteral	testUtf8
,	TokenNameCOMMA	
"invalid characters in file"	TokenNameStringLiteral	invalid characters in file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Tests property element, using XML schema properties as an example. 	TokenNameCOMMENT_LINE	Tests property element, using XML schema properties as an example. 
public	TokenNamepublic	
void	TokenNamevoid	
testPropertySchemaForValidXML	TokenNameIdentifier	 test Property Schema For Valid XML
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testProperty.validXML"	TokenNameStringLiteral	testProperty.validXML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPropertySchemaForInvalidXML	TokenNameIdentifier	 test Property Schema For Invalid XML
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testProperty.invalidXML"	TokenNameStringLiteral	testProperty.invalidXML
,	TokenNameCOMMA	
"XML file does not satisfy schema."	TokenNameStringLiteral	XML file does not satisfy schema.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
