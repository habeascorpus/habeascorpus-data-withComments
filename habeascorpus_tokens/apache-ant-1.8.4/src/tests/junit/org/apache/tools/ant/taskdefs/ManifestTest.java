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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * Testcase for the Manifest class used in the jar task. * */	TokenNameCOMMENT_JAVADOC	 Testcase for the Manifest class used in the jar task. 
public	TokenNamepublic	
class	TokenNameclass	
ManifestTest	TokenNameIdentifier	 Manifest Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXPANDED_MANIFEST	TokenNameIdentifier	 EXPANDED  MANIFEST
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/manifests/META-INF/MANIFEST.MF"	TokenNameStringLiteral	src/etc/testcases/taskdefs/manifests/META-INF/MANIFEST.MF
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LONG_LINE	TokenNameIdentifier	 LONG  LINE
=	TokenNameEQUAL	
"AReallyLongLineToTestLineBreakingInManifests-ACapabilityWhich"	TokenNameStringLiteral	AReallyLongLineToTestLineBreakingInManifests-ACapabilityWhich
+	TokenNamePLUS	
"IsSureToLeadToHundredsOfQuestionsAboutWhyAntMungesManifests"	TokenNameStringLiteral	IsSureToLeadToHundredsOfQuestionsAboutWhyAntMungesManifests
+	TokenNamePLUS	
"OfCourseTheAnswerIsThatIsWhatTheSpecRequiresAndIfAnythingHas"	TokenNameStringLiteral	OfCourseTheAnswerIsThatIsWhatTheSpecRequiresAndIfAnythingHas
+	TokenNamePLUS	
"AProblemWithThatItIsNotABugInAnt"	TokenNameStringLiteral	AProblemWithThatItIsNotABugInAnt
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LONG_70_NAME	TokenNameIdentifier	 LONG 70  NAME
=	TokenNameEQUAL	
"ThisNameIsJustSeventyCharactersWhichIsAllowedAccordingToTheSpecsFiller"	TokenNameStringLiteral	ThisNameIsJustSeventyCharactersWhichIsAllowedAccordingToTheSpecsFiller
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LONG_68_NAME	TokenNameIdentifier	 LONG 68  NAME
=	TokenNameEQUAL	
"ThisNameIsJustSixtyEightCharactersWhichIsAllowedAccordingToTheSpecsX"	TokenNameStringLiteral	ThisNameIsJustSixtyEightCharactersWhichIsAllowedAccordingToTheSpecsX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOT_LONG_NAME	TokenNameIdentifier	 NOT  LONG  NAME
=	TokenNameEQUAL	
"NameIsJustUnderSeventyCharactersWhichIsAllowedAccordingTheSpec"	TokenNameStringLiteral	NameIsJustUnderSeventyCharactersWhichIsAllowedAccordingTheSpec
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALUE	TokenNameIdentifier	 VALUE
=	TokenNameEQUAL	
"NOT_LONG"	TokenNameStringLiteral	NOT_LONG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ManifestTest	TokenNameIdentifier	 Manifest Test
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
"src/etc/testcases/taskdefs/manifest.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/manifest.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"clean"	TokenNameStringLiteral	clean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Empty manifest - is OK */	TokenNameCOMMENT_JAVADOC	 Empty manifest - is OK 
public	TokenNamepublic	
void	TokenNamevoid	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
EXPANDED_MANIFEST	TokenNameIdentifier	 EXPANDED  MANIFEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getManifestVersion	TokenNameIdentifier	 get Manifest Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Manifest was not created with correct version - "	TokenNameStringLiteral	Manifest was not created with correct version - 
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Simple Manifest with version 2.0 */	TokenNameCOMMENT_JAVADOC	 Simple Manifest with version 2.0 
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
EXPANDED_MANIFEST	TokenNameIdentifier	 EXPANDED  MANIFEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getManifestVersion	TokenNameIdentifier	 get Manifest Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Manifest was not created with correct version - "	TokenNameStringLiteral	Manifest was not created with correct version - 
,	TokenNameCOMMA	
"2.0"	TokenNameStringLiteral	2.0
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Malformed manifest - no : on the line */	TokenNameCOMMENT_JAVADOC	 Malformed manifest - no : on the line 
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
,	TokenNameCOMMA	
"Manifest is invalid - no colon on header line"	TokenNameStringLiteral	Manifest is invalid - no colon on header line
,	TokenNameCOMMA	
"Invalid Manifest"	TokenNameStringLiteral	Invalid Manifest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Malformed manifest - starts with continuation line */	TokenNameCOMMENT_JAVADOC	 Malformed manifest - starts with continuation line 
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
,	TokenNameCOMMA	
"Manifest is invalid - section starts with continuation line"	TokenNameStringLiteral	Manifest is invalid - section starts with continuation line
,	TokenNameCOMMA	
"Invalid Manifest"	TokenNameStringLiteral	Invalid Manifest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Malformed manifest - Name attribute in main section */	TokenNameCOMMENT_JAVADOC	 Malformed manifest - Name attribute in main section 
public	TokenNamepublic	
void	TokenNamevoid	
test5	TokenNameIdentifier	 test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test5"	TokenNameStringLiteral	test5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasWarning	TokenNameIdentifier	 has Warning
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Manifest warning: "Name" attributes should not occur in the main section"	TokenNameStringLiteral	Manifest warning: "Name" attributes should not occur in the main section
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expected warning about Name in main section"	TokenNameStringLiteral	Expected warning about Name in main section
,	TokenNameCOMMA	
hasWarning	TokenNameIdentifier	 has Warning
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * New Section not starting with Name attribute. */	TokenNameCOMMENT_JAVADOC	 New Section not starting with Name attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
test6	TokenNameIdentifier	 test6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test6"	TokenNameStringLiteral	test6
,	TokenNameCOMMA	
"Manifest is invalid - section starts with incorrect attribute"	TokenNameStringLiteral	Manifest is invalid - section starts with incorrect attribute
,	TokenNameCOMMA	
"Invalid Manifest"	TokenNameStringLiteral	Invalid Manifest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasWarning	TokenNameIdentifier	 has Warning
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Manifest sections should start with a "Name" attribute"	TokenNameStringLiteral	Manifest sections should start with a "Name" attribute
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expected warning about section not starting with Name: attribute"	TokenNameStringLiteral	Expected warning about section not starting with Name: attribute
,	TokenNameCOMMA	
hasWarning	TokenNameIdentifier	 has Warning
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * From attribute is illegal */	TokenNameCOMMENT_JAVADOC	 From attribute is illegal 
public	TokenNamepublic	
void	TokenNamevoid	
test7	TokenNameIdentifier	 test7
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test7"	TokenNameStringLiteral	test7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasWarning	TokenNameIdentifier	 has Warning
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
ERROR_FROM_FORBIDDEN	TokenNameIdentifier	 ERROR  FROM  FORBIDDEN
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expected warning about From: attribute"	TokenNameStringLiteral	Expected warning about From: attribute
,	TokenNameCOMMA	
hasWarning	TokenNameIdentifier	 has Warning
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inline manifest - OK */	TokenNameCOMMENT_JAVADOC	 Inline manifest - OK 
public	TokenNamepublic	
void	TokenNamevoid	
test8	TokenNameIdentifier	 test8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test8"	TokenNameStringLiteral	test8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
EXPANDED_MANIFEST	TokenNameIdentifier	 EXPANDED  MANIFEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
Section	TokenNameIdentifier	 Section
mainSection	TokenNameIdentifier	 main Section
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getMainSection	TokenNameIdentifier	 get Main Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
getAttributeValue	TokenNameIdentifier	 get Attribute Value
(	TokenNameLPAREN	
"class-path"	TokenNameStringLiteral	class-path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Class-Path attribute was not set correctly - "	TokenNameStringLiteral	Class-Path attribute was not set correctly - 
,	TokenNameCOMMA	
"fubar"	TokenNameStringLiteral	fubar
,	TokenNameCOMMA	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
Section	TokenNameIdentifier	 Section
testSection	TokenNameIdentifier	 test Section
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getSection	TokenNameIdentifier	 get Section
(	TokenNameLPAREN	
"Test"	TokenNameStringLiteral	Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
testAttr	TokenNameIdentifier	 test Attr
=	TokenNameEQUAL	
testSection	TokenNameIdentifier	 test Section
.	TokenNameDOT	
getAttributeValue	TokenNameIdentifier	 get Attribute Value
(	TokenNameLPAREN	
"TestAttr"	TokenNameStringLiteral	TestAttr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TestAttr attribute was not set correctly - "	TokenNameStringLiteral	TestAttr attribute was not set correctly - 
,	TokenNameCOMMA	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
testAttr	TokenNameIdentifier	 test Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inline manifest - Invalid since has a Name attribute in the section element */	TokenNameCOMMENT_JAVADOC	 Inline manifest - Invalid since has a Name attribute in the section element 
public	TokenNamepublic	
void	TokenNamevoid	
test9	TokenNameIdentifier	 test9
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test9"	TokenNameStringLiteral	test9
,	TokenNameCOMMA	
"Construction is invalid - Name attribute should not be used"	TokenNameStringLiteral	Construction is invalid - Name attribute should not be used
,	TokenNameCOMMA	
"Specify the section name using the "name" attribute of the <section> element"	TokenNameStringLiteral	Specify the section name using the "name" attribute of the <section> element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inline manifest - Invalid attribute without name */	TokenNameCOMMENT_JAVADOC	 Inline manifest - Invalid attribute without name 
public	TokenNamepublic	
void	TokenNamevoid	
test10	TokenNameIdentifier	 test10
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test10"	TokenNameStringLiteral	test10
,	TokenNameCOMMA	
"Attribute has no name"	TokenNameStringLiteral	Attribute has no name
,	TokenNameCOMMA	
"Attributes must have name and value"	TokenNameStringLiteral	Attributes must have name and value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inline manifest - Invalid attribute without value */	TokenNameCOMMENT_JAVADOC	 Inline manifest - Invalid attribute without value 
public	TokenNamepublic	
void	TokenNamevoid	
test11	TokenNameIdentifier	 test11
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test11"	TokenNameStringLiteral	test11
,	TokenNameCOMMA	
"Attribute has no value"	TokenNameStringLiteral	Attribute has no value
,	TokenNameCOMMA	
"Attributes must have name and value"	TokenNameStringLiteral	Attributes must have name and value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inline manifest - Invalid attribute without value */	TokenNameCOMMENT_JAVADOC	 Inline manifest - Invalid attribute without value 
public	TokenNamepublic	
void	TokenNamevoid	
test12	TokenNameIdentifier	 test12
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test12"	TokenNameStringLiteral	test12
,	TokenNameCOMMA	
"Section with no name"	TokenNameStringLiteral	Section with no name
,	TokenNameCOMMA	
"Sections must have a name"	TokenNameStringLiteral	Sections must have a name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inline manifest - Duplicate attribute */	TokenNameCOMMENT_JAVADOC	 Inline manifest - Duplicate attribute 
public	TokenNamepublic	
void	TokenNamevoid	
test13	TokenNameIdentifier	 test13
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"test13"	TokenNameStringLiteral	test13
,	TokenNameCOMMA	
"Duplicate Attribute"	TokenNameStringLiteral	Duplicate Attribute
,	TokenNameCOMMA	
"The attribute "Test" may not occur more than once in the same section"	TokenNameStringLiteral	The attribute "Test" may not occur more than once in the same section
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inline manifest - OK since classpath entries can be duplicated. */	TokenNameCOMMENT_JAVADOC	 Inline manifest - OK since classpath entries can be duplicated. 
public	TokenNamepublic	
void	TokenNamevoid	
test14	TokenNameIdentifier	 test14
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test14"	TokenNameStringLiteral	test14
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
EXPANDED_MANIFEST	TokenNameIdentifier	 EXPANDED  MANIFEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
Section	TokenNameIdentifier	 Section
mainSection	TokenNameIdentifier	 main Section
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getMainSection	TokenNameIdentifier	 get Main Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
getAttributeValue	TokenNameIdentifier	 get Attribute Value
(	TokenNameLPAREN	
"class-path"	TokenNameStringLiteral	class-path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Class-Path attribute was not set correctly - "	TokenNameStringLiteral	Class-Path attribute was not set correctly - 
,	TokenNameCOMMA	
"Test1 Test2 Test3 Test4"	TokenNameStringLiteral	Test1 Test2 Test3 Test4
,	TokenNameCOMMA	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tets long line wrapping */	TokenNameCOMMENT_JAVADOC	 Tets long line wrapping 
public	TokenNamepublic	
void	TokenNamevoid	
testLongLine	TokenNameIdentifier	 test Long Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.longline"	TokenNameStringLiteral	test.longline
,	TokenNameCOMMA	
LONG_LINE	TokenNameIdentifier	 LONG  LINE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.long68name"	TokenNameStringLiteral	test.long68name
,	TokenNameCOMMA	
LONG_68_NAME	TokenNameIdentifier	 LONG 68  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.long70name"	TokenNameStringLiteral	test.long70name
,	TokenNameCOMMA	
LONG_70_NAME	TokenNameIdentifier	 LONG 70  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.notlongname"	TokenNameStringLiteral	test.notlongname
,	TokenNameCOMMA	
NOT_LONG_NAME	TokenNameIdentifier	 NOT  LONG  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.value"	TokenNameStringLiteral	test.value
,	TokenNameCOMMA	
VALUE	TokenNameIdentifier	 VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testLongLine"	TokenNameStringLiteral	testLongLine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
EXPANDED_MANIFEST	TokenNameIdentifier	 EXPANDED  MANIFEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
Section	TokenNameIdentifier	 Section
mainSection	TokenNameIdentifier	 main Section
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getMainSection	TokenNameIdentifier	 get Main Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
getAttributeValue	TokenNameIdentifier	 get Attribute Value
(	TokenNameLPAREN	
"class-path"	TokenNameStringLiteral	class-path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Class-Path attribute was not set correctly - "	TokenNameStringLiteral	Class-Path attribute was not set correctly - 
,	TokenNameCOMMA	
LONG_LINE	TokenNameIdentifier	 LONG  LINE
,	TokenNameCOMMA	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
getAttributeValue	TokenNameIdentifier	 get Attribute Value
(	TokenNameLPAREN	
LONG_68_NAME	TokenNameIdentifier	 LONG 68  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"LONG_68_NAME_VALUE_MISMATCH"	TokenNameStringLiteral	LONG_68_NAME_VALUE_MISMATCH
,	TokenNameCOMMA	
VALUE	TokenNameIdentifier	 VALUE
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
getAttributeValue	TokenNameIdentifier	 get Attribute Value
(	TokenNameLPAREN	
LONG_70_NAME	TokenNameIdentifier	 LONG 70  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"LONG_70_NAME_VALUE_MISMATCH"	TokenNameStringLiteral	LONG_70_NAME_VALUE_MISMATCH
,	TokenNameCOMMA	
VALUE	TokenNameIdentifier	 VALUE
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
getAttributeValue	TokenNameIdentifier	 get Attribute Value
(	TokenNameLPAREN	
NOT_LONG_NAME	TokenNameIdentifier	 NOT  LONG  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"NOT_LONG_NAME_VALUE_MISMATCH"	TokenNameStringLiteral	NOT_LONG_NAME_VALUE_MISMATCH
,	TokenNameCOMMA	
VALUE	TokenNameIdentifier	 VALUE
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
EXPANDED_MANIFEST	TokenNameIdentifier	 EXPANDED  MANIFEST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Manifest file should have contained string "	TokenNameStringLiteral	Manifest file should have contained string 
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
" NOT_LONG"	TokenNameStringLiteral	 NOT_LONG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Manifest file should have contained string "	TokenNameStringLiteral	Manifest file should have contained string 
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
" NG"	TokenNameStringLiteral	 NG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Manifest file should have contained string "	TokenNameStringLiteral	Manifest file should have contained string 
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
LONG_70_NAME	TokenNameIdentifier	 LONG 70  NAME
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Manifest file should have contained string "	TokenNameStringLiteral	Manifest file should have contained string 
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
NOT_LONG_NAME	TokenNameIdentifier	 NOT  LONG  NAME
+	TokenNamePLUS	
": NOT_LO"	TokenNameStringLiteral	: NOT_LO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests ordering of sections */	TokenNameCOMMENT_JAVADOC	 Tests ordering of sections 
public	TokenNamepublic	
void	TokenNamevoid	
testOrder1	TokenNameIdentifier	 test Order1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testOrder1"	TokenNameStringLiteral	testOrder1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
EXPANDED_MANIFEST	TokenNameIdentifier	 EXPANDED  MANIFEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getSectionNames	TokenNameIdentifier	 get Section Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
section1	TokenNameIdentifier	 section1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
section2	TokenNameIdentifier	 section2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"First section name unexpected"	TokenNameStringLiteral	First section name unexpected
,	TokenNameCOMMA	
"Test1"	TokenNameStringLiteral	Test1
,	TokenNameCOMMA	
section1	TokenNameIdentifier	 section1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Second section name unexpected"	TokenNameStringLiteral	Second section name unexpected
,	TokenNameCOMMA	
"Test2"	TokenNameStringLiteral	Test2
,	TokenNameCOMMA	
section2	TokenNameIdentifier	 section2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
Section	TokenNameIdentifier	 Section
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getSection	TokenNameIdentifier	 get Section
(	TokenNameLPAREN	
"Test1"	TokenNameStringLiteral	Test1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getAttributeKeys	TokenNameIdentifier	 get Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attr1Key	TokenNameIdentifier	 attr1 Key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attr2Key	TokenNameIdentifier	 attr2 Key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attr1	TokenNameIdentifier	 attr1
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attr1Key	TokenNameIdentifier	 attr1 Key
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attr2	TokenNameIdentifier	 attr2
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attr2Key	TokenNameIdentifier	 attr2 Key
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"First attribute name unexpected"	TokenNameStringLiteral	First attribute name unexpected
,	TokenNameCOMMA	
"TestAttr1"	TokenNameStringLiteral	TestAttr1
,	TokenNameCOMMA	
attr1	TokenNameIdentifier	 attr1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Second attribute name unexpected"	TokenNameStringLiteral	Second attribute name unexpected
,	TokenNameCOMMA	
"TestAttr2"	TokenNameStringLiteral	TestAttr2
,	TokenNameCOMMA	
attr2	TokenNameIdentifier	 attr2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests ordering of sections */	TokenNameCOMMENT_JAVADOC	 Tests ordering of sections 
public	TokenNamepublic	
void	TokenNamevoid	
testOrder2	TokenNameIdentifier	 test Order2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testOrder2"	TokenNameStringLiteral	testOrder2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
EXPANDED_MANIFEST	TokenNameIdentifier	 EXPANDED  MANIFEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getSectionNames	TokenNameIdentifier	 get Section Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
section1	TokenNameIdentifier	 section1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
section2	TokenNameIdentifier	 section2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"First section name unexpected"	TokenNameStringLiteral	First section name unexpected
,	TokenNameCOMMA	
"Test2"	TokenNameStringLiteral	Test2
,	TokenNameCOMMA	
section1	TokenNameIdentifier	 section1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Second section name unexpected"	TokenNameStringLiteral	Second section name unexpected
,	TokenNameCOMMA	
"Test1"	TokenNameStringLiteral	Test1
,	TokenNameCOMMA	
section2	TokenNameIdentifier	 section2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
Section	TokenNameIdentifier	 Section
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getSection	TokenNameIdentifier	 get Section
(	TokenNameLPAREN	
"Test1"	TokenNameStringLiteral	Test1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getAttributeKeys	TokenNameIdentifier	 get Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attr1Key	TokenNameIdentifier	 attr1 Key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attr2Key	TokenNameIdentifier	 attr2 Key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attr1	TokenNameIdentifier	 attr1
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attr1Key	TokenNameIdentifier	 attr1 Key
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attr2	TokenNameIdentifier	 attr2
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attr2Key	TokenNameIdentifier	 attr2 Key
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"First attribute name unexpected"	TokenNameStringLiteral	First attribute name unexpected
,	TokenNameCOMMA	
"TestAttr2"	TokenNameStringLiteral	TestAttr2
,	TokenNameCOMMA	
attr1	TokenNameIdentifier	 attr1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Second attribute name unexpected"	TokenNameStringLiteral	Second attribute name unexpected
,	TokenNameCOMMA	
"TestAttr1"	TokenNameStringLiteral	TestAttr1
,	TokenNameCOMMA	
attr2	TokenNameIdentifier	 attr2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * file attribute for manifest task is required. */	TokenNameCOMMENT_JAVADOC	 file attribute for manifest task is required. 
public	TokenNamepublic	
void	TokenNamevoid	
testNoFile	TokenNameIdentifier	 test No File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testNoFile"	TokenNameStringLiteral	testNoFile
,	TokenNameCOMMA	
"file is required"	TokenNameStringLiteral	file is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * replace changes Manifest-Version from 2.0 to 1.0 */	TokenNameCOMMENT_JAVADOC	 replace changes Manifest-Version from 2.0 to 1.0 
public	TokenNamepublic	
void	TokenNamevoid	
testReplace	TokenNameIdentifier	 test Replace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testReplace"	TokenNameStringLiteral	testReplace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
mf	TokenNameIdentifier	 mf
=	TokenNameEQUAL	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/mftest.mf"	TokenNameStringLiteral	src/etc/testcases/taskdefs/mftest.mf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
mf	TokenNameIdentifier	 mf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
getDefaultManifest	TokenNameIdentifier	 get Default Manifest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mf	TokenNameIdentifier	 mf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * update keeps the Manifest-Version and adds a new attribute Foo */	TokenNameCOMMENT_JAVADOC	 update keeps the Manifest-Version and adds a new attribute Foo 
public	TokenNamepublic	
void	TokenNamevoid	
testUpdate	TokenNameIdentifier	 test Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testUpdate"	TokenNameStringLiteral	testUpdate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
mf	TokenNameIdentifier	 mf
=	TokenNameEQUAL	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/mftest.mf"	TokenNameStringLiteral	src/etc/testcases/taskdefs/mftest.mf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
mf	TokenNameIdentifier	 mf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
getDefaultManifest	TokenNameIdentifier	 get Default Manifest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mf	TokenNameIdentifier	 mf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mfAsString	TokenNameIdentifier	 mf As String
=	TokenNameEQUAL	
mf	TokenNameIdentifier	 mf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
mfAsString	TokenNameIdentifier	 mf As String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mfAsString	TokenNameIdentifier	 mf As String
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Manifest-Version: 2.0"	TokenNameStringLiteral	Manifest-Version: 2.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mfAsString	TokenNameIdentifier	 mf As String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Foo: Bar"	TokenNameStringLiteral	Foo: Bar
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mf	TokenNameIdentifier	 mf
=	TokenNameEQUAL	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/mftest2.mf"	TokenNameStringLiteral	src/etc/testcases/taskdefs/mftest2.mf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
mf	TokenNameIdentifier	 mf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mfAsString	TokenNameIdentifier	 mf As String
=	TokenNameEQUAL	
mf	TokenNameIdentifier	 mf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
mfAsString	TokenNameIdentifier	 mf As String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mfAsString	TokenNameIdentifier	 mf As String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Foo: Bar"	TokenNameStringLiteral	Foo: Bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mfAsString	TokenNameIdentifier	 mf As String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Foo: Baz"	TokenNameStringLiteral	Foo: Baz
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFrom	TokenNameIdentifier	 test From
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testFrom"	TokenNameStringLiteral	testFrom
,	TokenNameCOMMA	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
ERROR_FROM_FORBIDDEN	TokenNameIdentifier	 ERROR  FROM  FORBIDDEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalName	TokenNameIdentifier	 test Illegal Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testIllegalName"	TokenNameStringLiteral	testIllegalName
,	TokenNameCOMMA	
"Manifest attribute names must not contain ' '"	TokenNameStringLiteral	Manifest attribute names must not contain ' '
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalNameInSection	TokenNameIdentifier	 test Illegal Name In Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testIllegalNameInSection"	TokenNameStringLiteral	testIllegalNameInSection
,	TokenNameCOMMA	
"Manifest attribute names must not contain ' '"	TokenNameStringLiteral	Manifest attribute names must not contain ' '
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalNameBegin	TokenNameIdentifier	 test Illegal Name Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testIllegalNameInSection"	TokenNameStringLiteral	testIllegalNameInSection
,	TokenNameCOMMA	
"Manifest attribute names must not start with '-' at the begin."	TokenNameStringLiteral	Manifest attribute names must not start with '-' at the begin.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalName2	TokenNameIdentifier	 test Illegal Name2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testIllegalName"	TokenNameStringLiteral	testIllegalName
,	TokenNameCOMMA	
"Manifest attribute names must not contain '.'"	TokenNameStringLiteral	Manifest attribute names must not contain '.'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalName3	TokenNameIdentifier	 test Illegal Name3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testIllegalName"	TokenNameStringLiteral	testIllegalName
,	TokenNameCOMMA	
"Manifest attribute names must not contain '*'"	TokenNameStringLiteral	Manifest attribute names must not contain '*'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads mftest.mf. */	TokenNameCOMMENT_JAVADOC	 Reads mftest.mf. 
private	TokenNameprivate	
Manifest	TokenNameIdentifier	 Manifest
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
FileReader	TokenNameIdentifier	 File Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Manifest	TokenNameIdentifier	 Manifest
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
