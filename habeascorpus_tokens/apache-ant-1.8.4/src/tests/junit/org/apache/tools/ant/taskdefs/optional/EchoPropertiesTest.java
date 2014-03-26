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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
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
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * Tests the EchoProperties task. * * @created 17-Jan-2002 * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Tests the EchoProperties task. * @created 17-Jan-2002 @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
EchoPropertiesTest	TokenNameIdentifier	 Echo Properties Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GOOD_OUTFILE	TokenNameIdentifier	 GOOD  OUTFILE
=	TokenNameEQUAL	
"test.properties"	TokenNameStringLiteral	test.properties
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GOOD_OUTFILE_XML	TokenNameIdentifier	 GOOD  OUTFILE  XML
=	TokenNameEQUAL	
"test.xml"	TokenNameStringLiteral	test.xml
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PREFIX_OUTFILE	TokenNameIdentifier	 PREFIX  OUTFILE
=	TokenNameEQUAL	
"test-prefix.properties"	TokenNameStringLiteral	test-prefix.properties
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEST_VALUE	TokenNameIdentifier	 TEST  VALUE
=	TokenNameEQUAL	
"isSet"	TokenNameStringLiteral	isSet
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EchoPropertiesTest	TokenNameIdentifier	 Echo Properties Test
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
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
+	TokenNamePLUS	
"echoproperties.xml"	TokenNameStringLiteral	echoproperties.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"test.property"	TokenNameStringLiteral	test.property
,	TokenNameCOMMA	
TEST_VALUE	TokenNameIdentifier	 TEST  VALUE
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
"cleanup"	TokenNameStringLiteral	cleanup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoToLog	TokenNameIdentifier	 test Echo To Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testEchoToLog"	TokenNameStringLiteral	testEchoToLog
,	TokenNameCOMMA	
"test.property="	TokenNameStringLiteral	test.property=
+	TokenNamePLUS	
TEST_VALUE	TokenNameIdentifier	 TEST  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoWithEmptyPrefixToLog	TokenNameIdentifier	 test Echo With Empty Prefix To Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testEchoWithEmptyPrefixToLog"	TokenNameStringLiteral	testEchoWithEmptyPrefixToLog
,	TokenNameCOMMA	
"test.property="	TokenNameStringLiteral	test.property=
+	TokenNamePLUS	
TEST_VALUE	TokenNameIdentifier	 TEST  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReadBadFile	TokenNameIdentifier	 test Read Bad File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testReadBadFile"	TokenNameStringLiteral	testReadBadFile
,	TokenNameCOMMA	
"srcfile is a directory"	TokenNameStringLiteral	srcfile is a directory
,	TokenNameCOMMA	
"srcfile is a directory!"	TokenNameStringLiteral	srcfile is a directory!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReadBadFileFail	TokenNameIdentifier	 test Read Bad File Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testReadBadFile"	TokenNameStringLiteral	testReadBadFile
,	TokenNameCOMMA	
"srcfile is a directory"	TokenNameStringLiteral	srcfile is a directory
,	TokenNameCOMMA	
"srcfile is a directory!"	TokenNameStringLiteral	srcfile is a directory!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReadBadFileNoFail	TokenNameIdentifier	 test Read Bad File No Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"testReadBadFileNoFail"	TokenNameStringLiteral	testReadBadFileNoFail
,	TokenNameCOMMA	
"srcfile is a directory!"	TokenNameStringLiteral	srcfile is a directory!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoToBadFile	TokenNameIdentifier	 test Echo To Bad File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testEchoToBadFile"	TokenNameStringLiteral	testEchoToBadFile
,	TokenNameCOMMA	
"destfile is a directory"	TokenNameStringLiteral	destfile is a directory
,	TokenNameCOMMA	
"destfile is a directory!"	TokenNameStringLiteral	destfile is a directory!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoToBadFileFail	TokenNameIdentifier	 test Echo To Bad File Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testEchoToBadFileFail"	TokenNameStringLiteral	testEchoToBadFileFail
,	TokenNameCOMMA	
"destfile is a directory"	TokenNameStringLiteral	destfile is a directory
,	TokenNameCOMMA	
"destfile is a directory!"	TokenNameStringLiteral	destfile is a directory!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoToBadFileNoFail	TokenNameIdentifier	 test Echo To Bad File No Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"testEchoToBadFileNoFail"	TokenNameStringLiteral	testEchoToBadFileNoFail
,	TokenNameCOMMA	
"destfile is a directory!"	TokenNameStringLiteral	destfile is a directory!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoToGoodFile	TokenNameIdentifier	 test Echo To Good File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testEchoToGoodFile"	TokenNameStringLiteral	testEchoToGoodFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertGoodFile	TokenNameIdentifier	 assert Good File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoToGoodFileXml	TokenNameIdentifier	 test Echo To Good File Xml
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testEchoToGoodFileXml"	TokenNameStringLiteral	testEchoToGoodFileXml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read in the file 	TokenNameCOMMENT_LINE	read in the file 
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
GOOD_OUTFILE_XML	TokenNameIdentifier	 GOOD  OUTFILE  XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileReader	TokenNameIdentifier	 File Reader
fr	TokenNameIdentifier	 fr
=	TokenNameEQUAL	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
fr	TokenNameIdentifier	 fr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"<property name="test.property" value=""	TokenNameStringLiteral	<property name="test.property" value="
+	TokenNamePLUS	
TEST_VALUE	TokenNameIdentifier	 TEST  VALUE
+	TokenNamePLUS	
"" />"	TokenNameStringLiteral	" />
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found the property we set - it's good. 	TokenNameCOMMENT_LINE	found the property we set - it's good. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"did not encounter set property in generated file."	TokenNameStringLiteral	did not encounter set property in generated file.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fr	TokenNameIdentifier	 fr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoToGoodFileFail	TokenNameIdentifier	 test Echo To Good File Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testEchoToGoodFileFail"	TokenNameStringLiteral	testEchoToGoodFileFail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertGoodFile	TokenNameIdentifier	 assert Good File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoToGoodFileNoFail	TokenNameIdentifier	 test Echo To Good File No Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testEchoToGoodFileNoFail"	TokenNameStringLiteral	testEchoToGoodFileNoFail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertGoodFile	TokenNameIdentifier	 assert Good File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoPrefix	TokenNameIdentifier	 test Echo Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testEchoPrefixVarious	TokenNameIdentifier	 test Echo Prefix Various
(	TokenNameLPAREN	
"testEchoPrefix"	TokenNameStringLiteral	testEchoPrefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoPrefixAsPropertyset	TokenNameIdentifier	 test Echo Prefix As Propertyset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testEchoPrefixVarious	TokenNameIdentifier	 test Echo Prefix Various
(	TokenNameLPAREN	
"testEchoPrefixAsPropertyset"	TokenNameStringLiteral	testEchoPrefixAsPropertyset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoPrefixAsNegatedPropertyset	TokenNameIdentifier	 test Echo Prefix As Negated Propertyset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testEchoPrefixVarious	TokenNameIdentifier	 test Echo Prefix Various
(	TokenNameLPAREN	
"testEchoPrefixAsNegatedPropertyset"	TokenNameStringLiteral	testEchoPrefixAsNegatedPropertyset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEchoPrefixAsDoublyNegatedPropertyset	TokenNameIdentifier	 test Echo Prefix As Doubly Negated Propertyset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testEchoPrefixVarious	TokenNameIdentifier	 test Echo Prefix Various
(	TokenNameLPAREN	
"testEchoPrefixAsDoublyNegatedPropertyset"	TokenNameStringLiteral	testEchoPrefixAsDoublyNegatedPropertyset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithPrefixAndRegex	TokenNameIdentifier	 test With Prefix And Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"testWithPrefixAndRegex"	TokenNameStringLiteral	testWithPrefixAndRegex
,	TokenNameCOMMA	
"The target must fail with prefix and regex attributes set"	TokenNameStringLiteral	The target must fail with prefix and regex attributes set
,	TokenNameCOMMA	
"Please specify either prefix or regex, but not both"	TokenNameStringLiteral	Please specify either prefix or regex, but not both
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithEmptyPrefixAndRegex	TokenNameIdentifier	 test With Empty Prefix And Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testEchoWithEmptyPrefixToLog"	TokenNameStringLiteral	testEchoWithEmptyPrefixToLog
,	TokenNameCOMMA	
"test.property="	TokenNameStringLiteral	test.property=
+	TokenNamePLUS	
TEST_VALUE	TokenNameIdentifier	 TEST  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithRegex	TokenNameIdentifier	 test With Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
.	TokenNameDOT	
regexpMatcherPresent	TokenNameIdentifier	 regexp Matcher Present
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Test 'testWithRegex' skipped because no regexp matcher is present."	TokenNameStringLiteral	Test 'testWithRegex' skipped because no regexp matcher is present.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testWithRegex"	TokenNameStringLiteral	testWithRegex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDebuglogContaining	TokenNameIdentifier	 assert Debuglog Containing
(	TokenNameLPAREN	
"ant.home="	TokenNameStringLiteral	ant.home=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testEchoPrefixVarious	TokenNameIdentifier	 test Echo Prefix Various
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
loadPropFile	TokenNameIdentifier	 load Prop File
(	TokenNameLPAREN	
PREFIX_OUTFILE	TokenNameIdentifier	 PREFIX  OUTFILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"prefix didn't include 'a.set' property"	TokenNameStringLiteral	prefix didn't include 'a.set' property
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"a.set"	TokenNameStringLiteral	a.set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"prefix failed to filter out property 'b.set'"	TokenNameStringLiteral	prefix failed to filter out property 'b.set'
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"b.set"	TokenNameStringLiteral	b.set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Properties	TokenNameIdentifier	 Properties
loadPropFile	TokenNameIdentifier	 load Prop File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
relativeFilename	TokenNameIdentifier	 relative Filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
relativeFilename	TokenNameIdentifier	 relative Filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
props	TokenNameIdentifier	 props
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
assertGoodFile	TokenNameIdentifier	 assert Good File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
GOOD_OUTFILE	TokenNameIdentifier	 GOOD  OUTFILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Did not create "	TokenNameStringLiteral	Did not create 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
loadPropFile	TokenNameIdentifier	 load Prop File
(	TokenNameLPAREN	
GOOD_OUTFILE	TokenNameIdentifier	 GOOD  OUTFILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"test property not found "	TokenNameStringLiteral	test property not found 
,	TokenNameCOMMA	
TEST_VALUE	TokenNameIdentifier	 TEST  VALUE
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"test.property"	TokenNameStringLiteral	test.property
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* // read in the file FileReader fr = new FileReader( f ); try { BufferedReader br = new BufferedReader( fr ); String read = null; while ( (read = br.readLine()) != null) { if (read.indexOf("test.property" + TEST_VALUE) >= 0) { // found the property we set - it's good. return; } } fail( "did not encounter set property in generated file." ); } finally { try { fr.close(); } catch(IOException e) {} } */	TokenNameCOMMENT_BLOCK	 // read in the file FileReader fr = new FileReader( f ); try { BufferedReader br = new BufferedReader( fr ); String read = null; while ( (read = br.readLine()) != null) { if (read.indexOf("test.property" + TEST_VALUE) >= 0) { // found the property we set - it's good. return; } } fail( "did not encounter set property in generated file." ); } finally { try { fr.close(); } catch(IOException e) {} } 
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
toAbsolute	TokenNameIdentifier	 to Absolute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else 	TokenNameCOMMENT_LINE	else 
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
