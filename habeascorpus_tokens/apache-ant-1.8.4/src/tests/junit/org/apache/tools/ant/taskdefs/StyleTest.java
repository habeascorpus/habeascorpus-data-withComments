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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * TestCases for {@link XSLTProcess} task. * XXX merge with {@link XsltTest}? * @version 2003-08-05 */	TokenNameCOMMENT_JAVADOC	 TestCases for {@link XSLTProcess} task. XXX merge with {@link XsltTest}? @version 2003-08-05 
public	TokenNamepublic	
class	TokenNameclass	
StyleTest	TokenNameIdentifier	 Style Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StyleTest	TokenNameIdentifier	 Style Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/style/build.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/style/build.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//executeTarget("setup"); 	TokenNameCOMMENT_LINE	executeTarget("setup"); 
//commented out for performance while target is empty 	TokenNameCOMMENT_LINE	commented out for performance while target is empty 
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"teardown"	TokenNameStringLiteral	teardown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStyleIsSet	TokenNameIdentifier	 test Style Is Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"testStyleIsSet"	TokenNameStringLiteral	testStyleIsSet
,	TokenNameCOMMA	
"no stylesheet specified"	TokenNameStringLiteral	no stylesheet specified
,	TokenNameCOMMA	
"specify the "	TokenNameStringLiteral	specify the 
+	TokenNamePLUS	
"stylesheet either as a filename in style "	TokenNameStringLiteral	stylesheet either as a filename in style 
+	TokenNamePLUS	
"attribute or as a nested resource"	TokenNameStringLiteral	attribute or as a nested resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTransferParameterSet	TokenNameIdentifier	 test Transfer Parameter Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"testTransferParameterSet"	TokenNameStringLiteral	testTransferParameterSet
,	TokenNameCOMMA	
// target 	TokenNameCOMMENT_LINE	target 
"out/out.xml"	TokenNameStringLiteral	out/out.xml
,	TokenNameCOMMA	
// file 	TokenNameCOMMENT_LINE	file 
"set='myvalue'"	TokenNameStringLiteral	set='myvalue'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// exptected string 	TokenNameCOMMENT_LINE	exptected string 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTransferParameterEmpty	TokenNameIdentifier	 test Transfer Parameter Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"testTransferParameterEmpty"	TokenNameStringLiteral	testTransferParameterEmpty
,	TokenNameCOMMA	
"out/out.xml"	TokenNameStringLiteral	out/out.xml
,	TokenNameCOMMA	
"empty=''"	TokenNameStringLiteral	empty=''
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTransferParameterUnset	TokenNameIdentifier	 test Transfer Parameter Unset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"testTransferParameterUnset"	TokenNameStringLiteral	testTransferParameterUnset
,	TokenNameCOMMA	
"out/out.xml"	TokenNameStringLiteral	out/out.xml
,	TokenNameCOMMA	
"undefined='${value}'"	TokenNameStringLiteral	undefined='${value}'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTransferParameterUnsetWithIf	TokenNameIdentifier	 test Transfer Parameter Unset With If
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"testTransferParameterUnsetWithIf"	TokenNameStringLiteral	testTransferParameterUnsetWithIf
,	TokenNameCOMMA	
"out/out.xml"	TokenNameStringLiteral	out/out.xml
,	TokenNameCOMMA	
"undefined='undefined default value'"	TokenNameStringLiteral	undefined='undefined default value'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNewerStylesheet	TokenNameIdentifier	 test Newer Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"testNewerStylesheet"	TokenNameStringLiteral	testNewerStylesheet
,	TokenNameCOMMA	
"out/out.xml"	TokenNameStringLiteral	out/out.xml
,	TokenNameCOMMA	
"new-value"	TokenNameStringLiteral	new-value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultMapper	TokenNameIdentifier	 test Default Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testDefaultMapper	TokenNameIdentifier	 test Default Mapper
(	TokenNameLPAREN	
"testDefaultMapper"	TokenNameStringLiteral	testDefaultMapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExplicitFileset	TokenNameIdentifier	 test Explicit Fileset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testDefaultMapper	TokenNameIdentifier	 test Default Mapper
(	TokenNameLPAREN	
"testExplicitFileset"	TokenNameStringLiteral	testExplicitFileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultMapper	TokenNameIdentifier	 test Default Mapper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"out/data.html"	TokenNameStringLiteral	out/data.html
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
"out/data.html"	TokenNameStringLiteral	out/data.html
,	TokenNameCOMMA	
"set='myvalue'"	TokenNameStringLiteral	set='myvalue'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCustomMapper	TokenNameIdentifier	 test Custom Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"out/out.xml"	TokenNameStringLiteral	out/out.xml
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"testCustomMapper"	TokenNameStringLiteral	testCustomMapper
,	TokenNameCOMMA	
"out/out.xml"	TokenNameStringLiteral	out/out.xml
,	TokenNameCOMMA	
"set='myvalue'"	TokenNameStringLiteral	set='myvalue'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTypedMapper	TokenNameIdentifier	 test Typed Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"out/out.xml"	TokenNameStringLiteral	out/out.xml
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"testTypedMapper"	TokenNameStringLiteral	testTypedMapper
,	TokenNameCOMMA	
"out/out.xml"	TokenNameStringLiteral	out/out.xml
,	TokenNameCOMMA	
"set='myvalue'"	TokenNameStringLiteral	set='myvalue'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDirectoryHierarchyWithDirMatching	TokenNameIdentifier	 test Directory Hierarchy With Dir Matching
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testDirectoryHierarchyWithDirMatching"	TokenNameStringLiteral	testDirectoryHierarchyWithDirMatching
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"out/dest/level1/data.html"	TokenNameStringLiteral	out/dest/level1/data.html
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDirsWithSpaces	TokenNameIdentifier	 test Dirs With Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testDirsWithSpaces"	TokenNameStringLiteral	testDirsWithSpaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"out/d est/data.html"	TokenNameStringLiteral	out/d est/data.html
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithStyleAttrAndResource	TokenNameIdentifier	 test With Style Attr And Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"testWithStyleAttrAndResource"	TokenNameStringLiteral	testWithStyleAttrAndResource
,	TokenNameCOMMA	
"Must throws a BuildException"	TokenNameStringLiteral	Must throws a BuildException
,	TokenNameCOMMA	
"specify the "	TokenNameStringLiteral	specify the 
+	TokenNamePLUS	
"stylesheet either as a filename in style "	TokenNameStringLiteral	stylesheet either as a filename in style 
+	TokenNamePLUS	
"attribute or as a nested resource but not "	TokenNameStringLiteral	attribute or as a nested resource but not 
+	TokenNamePLUS	
"as both"	TokenNameStringLiteral	as both
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithFileResource	TokenNameIdentifier	 test With File Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"testWithFileResource"	TokenNameStringLiteral	testWithFileResource
,	TokenNameCOMMA	
"out/out.xml"	TokenNameStringLiteral	out/out.xml
,	TokenNameCOMMA	
"set='value'"	TokenNameStringLiteral	set='value'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithUrlResource	TokenNameIdentifier	 test With Url Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"testWithUrlResource"	TokenNameStringLiteral	testWithUrlResource
,	TokenNameCOMMA	
"out/out.xml"	TokenNameStringLiteral	out/out.xml
,	TokenNameCOMMA	
"set='value'"	TokenNameStringLiteral	set='value'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilenameAsParam	TokenNameIdentifier	 test Filename As Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFilenameAsParam"	TokenNameStringLiteral	testFilenameAsParam
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/one.txt"	TokenNameStringLiteral	out/out/one.txt
,	TokenNameCOMMA	
"filename='one.xml'"	TokenNameStringLiteral	filename='one.xml'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/two.txt"	TokenNameStringLiteral	out/out/two.txt
,	TokenNameCOMMA	
"filename='two.xml'"	TokenNameStringLiteral	filename='two.xml'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/three.txt"	TokenNameStringLiteral	out/out/three.txt
,	TokenNameCOMMA	
"filename='three.xml'"	TokenNameStringLiteral	filename='three.xml'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/dir/four.txt"	TokenNameStringLiteral	out/out/dir/four.txt
,	TokenNameCOMMA	
"filename='four.xml'"	TokenNameStringLiteral	filename='four.xml'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/dir/four.txt"	TokenNameStringLiteral	out/out/dir/four.txt
,	TokenNameCOMMA	
"filedir ='-not-set-'"	TokenNameStringLiteral	filedir ='-not-set-'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilenameAsParamNoSetting	TokenNameIdentifier	 test Filename As Param No Setting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFilenameAsParamNoSetting"	TokenNameStringLiteral	testFilenameAsParamNoSetting
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/one.txt"	TokenNameStringLiteral	out/out/one.txt
,	TokenNameCOMMA	
"filename='-not-set-'"	TokenNameStringLiteral	filename='-not-set-'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/two.txt"	TokenNameStringLiteral	out/out/two.txt
,	TokenNameCOMMA	
"filename='-not-set-'"	TokenNameStringLiteral	filename='-not-set-'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/three.txt"	TokenNameStringLiteral	out/out/three.txt
,	TokenNameCOMMA	
"filename='-not-set-'"	TokenNameStringLiteral	filename='-not-set-'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/dir/four.txt"	TokenNameStringLiteral	out/out/dir/four.txt
,	TokenNameCOMMA	
"filename='-not-set-'"	TokenNameStringLiteral	filename='-not-set-'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilenameAndFiledirAsParam	TokenNameIdentifier	 test Filename And Filedir As Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFilenameAndFiledirAsParam"	TokenNameStringLiteral	testFilenameAndFiledirAsParam
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/one.txt"	TokenNameStringLiteral	out/out/one.txt
,	TokenNameCOMMA	
"filename='one.xml'"	TokenNameStringLiteral	filename='one.xml'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/one.txt"	TokenNameStringLiteral	out/out/one.txt
,	TokenNameCOMMA	
"filedir ='.'"	TokenNameStringLiteral	filedir ='.'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/dir/four.txt"	TokenNameStringLiteral	out/out/dir/four.txt
,	TokenNameCOMMA	
"filename='four.xml'"	TokenNameStringLiteral	filename='four.xml'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
"out/out/dir/four.txt"	TokenNameStringLiteral	out/out/dir/four.txt
,	TokenNameCOMMA	
"filedir ='dir'"	TokenNameStringLiteral	filedir ='dir'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ************* copied from ConcatTest ************* 	TokenNameCOMMENT_LINE	************* copied from ConcatTest ************* 
// ------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------ 
// Helper methods - should be in BuildFileTest 	TokenNameCOMMENT_LINE	Helper methods - should be in BuildFileTest 
// ----------------------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------------------- 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertFileContains	TokenNameIdentifier	 assert File Contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expecting file "	TokenNameStringLiteral	expecting file 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" to contain "	TokenNameStringLiteral	 to contain 
+	TokenNamePLUS	
contains	TokenNameIdentifier	 contains
+	TokenNamePLUS	
" but got "	TokenNameStringLiteral	 but got 
+	TokenNamePLUS	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
