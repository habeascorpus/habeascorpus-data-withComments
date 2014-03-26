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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
UnzipTest	TokenNameIdentifier	 Unzip Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
/** Utilities used for file operations */	TokenNameCOMMENT_JAVADOC	 Utilities used for file operations 
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
UnzipTest	TokenNameIdentifier	 Unzip Test
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
"src/etc/testcases/taskdefs/unzip.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/unzip.xml
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
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"required argument not specified"	TokenNameStringLiteral	required argument not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
,	TokenNameCOMMA	
"required argument not specified"	TokenNameStringLiteral	required argument not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
,	TokenNameCOMMA	
"required argument not specified"	TokenNameStringLiteral	required argument not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRealTest	TokenNameIdentifier	 test Real Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"realTest"	TokenNameStringLiteral	realTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogoUncorrupted	TokenNameIdentifier	 assert Logo Uncorrupted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that the logo gif file has not been corrupted * @throws IOException */	TokenNameCOMMENT_JAVADOC	 test that the logo gif file has not been corrupted @throws IOException 
private	TokenNameprivate	
void	TokenNamevoid	
assertLogoUncorrupted	TokenNameIdentifier	 assert Logo Uncorrupted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"../asf-logo.gif"	TokenNameStringLiteral	../asf-logo.gif
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"asf-logo.gif"	TokenNameStringLiteral	asf-logo.gif
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTestZipTask	TokenNameIdentifier	 test Test Zip Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testZipTask"	TokenNameStringLiteral	testZipTask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogoUncorrupted	TokenNameIdentifier	 assert Logo Uncorrupted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTestUncompressedZipTask	TokenNameIdentifier	 test Test Uncompressed Zip Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testUncompressedZipTask"	TokenNameStringLiteral	testUncompressedZipTask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogoUncorrupted	TokenNameIdentifier	 assert Logo Uncorrupted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * PR 11100 */	TokenNameCOMMENT_BLOCK	 PR 11100 
public	TokenNamepublic	
void	TokenNamevoid	
testPatternSetExcludeOnly	TokenNameIdentifier	 test Pattern Set Exclude Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testPatternSetExcludeOnly"	TokenNameStringLiteral	testPatternSetExcludeOnly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"1/foo is excluded"	TokenNameStringLiteral	1/foo is excluded
,	TokenNameCOMMA	
"unziptestout/1/foo"	TokenNameStringLiteral	unziptestout/1/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileExists	TokenNameIdentifier	 assert File Exists
(	TokenNameLPAREN	
"2/bar is not excluded"	TokenNameStringLiteral	2/bar is not excluded
,	TokenNameCOMMA	
"unziptestout/2/bar"	TokenNameStringLiteral	unziptestout/2/bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * PR 11100 */	TokenNameCOMMENT_BLOCK	 PR 11100 
public	TokenNamepublic	
void	TokenNamevoid	
testPatternSetIncludeOnly	TokenNameIdentifier	 test Pattern Set Include Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testPatternSetIncludeOnly"	TokenNameStringLiteral	testPatternSetIncludeOnly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"1/foo is not included"	TokenNameStringLiteral	1/foo is not included
,	TokenNameCOMMA	
"unziptestout/1/foo"	TokenNameStringLiteral	unziptestout/1/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileExists	TokenNameIdentifier	 assert File Exists
(	TokenNameLPAREN	
"2/bar is included"	TokenNameStringLiteral	2/bar is included
,	TokenNameCOMMA	
"unziptestout/2/bar"	TokenNameStringLiteral	unziptestout/2/bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * PR 11100 */	TokenNameCOMMENT_BLOCK	 PR 11100 
public	TokenNamepublic	
void	TokenNamevoid	
testPatternSetIncludeAndExclude	TokenNameIdentifier	 test Pattern Set Include And Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testPatternSetIncludeAndExclude"	TokenNameStringLiteral	testPatternSetIncludeAndExclude
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"1/foo is not included"	TokenNameStringLiteral	1/foo is not included
,	TokenNameCOMMA	
"unziptestout/1/foo"	TokenNameStringLiteral	unziptestout/1/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"2/bar is excluded"	TokenNameStringLiteral	2/bar is excluded
,	TokenNameCOMMA	
"unziptestout/2/bar"	TokenNameStringLiteral	unziptestout/2/bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * PR 38973 */	TokenNameCOMMENT_BLOCK	 PR 38973 
public	TokenNamepublic	
void	TokenNamevoid	
testTwoPatternSets	TokenNameIdentifier	 test Two Pattern Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testTwoPatternSets"	TokenNameStringLiteral	testTwoPatternSets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"1/foo is not included"	TokenNameStringLiteral	1/foo is not included
,	TokenNameCOMMA	
"unziptestout/1/foo"	TokenNameStringLiteral	unziptestout/1/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileExists	TokenNameIdentifier	 assert File Exists
(	TokenNameLPAREN	
"2/bar is included"	TokenNameStringLiteral	2/bar is included
,	TokenNameCOMMA	
"unziptestout/2/bar"	TokenNameStringLiteral	unziptestout/2/bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * PR 38973 */	TokenNameCOMMENT_BLOCK	 PR 38973 
public	TokenNamepublic	
void	TokenNamevoid	
testTwoPatternSetsWithExcludes	TokenNameIdentifier	 test Two Pattern Sets With Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testTwoPatternSetsWithExcludes"	TokenNameStringLiteral	testTwoPatternSetsWithExcludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"1/foo is not included"	TokenNameStringLiteral	1/foo is not included
,	TokenNameCOMMA	
"unziptestout/1/foo"	TokenNameStringLiteral	unziptestout/1/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"2/bar is excluded"	TokenNameStringLiteral	2/bar is excluded
,	TokenNameCOMMA	
"unziptestout/2/bar"	TokenNameStringLiteral	unziptestout/2/bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * PR 16213 */	TokenNameCOMMENT_BLOCK	 PR 16213 
public	TokenNamepublic	
void	TokenNamevoid	
XtestSelfExtractingArchive	TokenNameIdentifier	 Xtest Self Extracting Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// disabled because we lack a self extracting archive that we 	TokenNameCOMMENT_LINE	disabled because we lack a self extracting archive that we 
// are allowed to distribute - see PR 49080 	TokenNameCOMMENT_LINE	are allowed to distribute - see PR 49080 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"selfExtractingArchive"	TokenNameStringLiteral	selfExtractingArchive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * PR 20969 */	TokenNameCOMMENT_BLOCK	 PR 20969 
public	TokenNamepublic	
void	TokenNamevoid	
testPatternSetSlashOnly	TokenNameIdentifier	 test Pattern Set Slash Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testPatternSetSlashOnly"	TokenNameStringLiteral	testPatternSetSlashOnly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"1/foo is not included"	TokenNameStringLiteral	1/foo is not included
,	TokenNameCOMMA	
"unziptestout/1/foo"	TokenNameStringLiteral	unziptestout/1/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileExists	TokenNameIdentifier	 assert File Exists
(	TokenNameLPAREN	
""2/bar is included"	TokenNameStringLiteral	"2/bar is included
,	TokenNameCOMMA	
"unziptestout/2/bar"	TokenNameStringLiteral	unziptestout/2/bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * PR 10504 */	TokenNameCOMMENT_BLOCK	 PR 10504 
public	TokenNamepublic	
void	TokenNamevoid	
testEncoding	TokenNameIdentifier	 test Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"encodingTest"	TokenNameStringLiteral	encodingTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileExists	TokenNameIdentifier	 assert File Exists
(	TokenNameLPAREN	
"foo has been properly named"	TokenNameStringLiteral	foo has been properly named
,	TokenNameCOMMA	
"unziptestout/foo"	TokenNameStringLiteral	unziptestout/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * PR 21996 */	TokenNameCOMMENT_BLOCK	 PR 21996 
public	TokenNamepublic	
void	TokenNamevoid	
testFlattenMapper	TokenNameIdentifier	 test Flatten Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFlattenMapper"	TokenNameStringLiteral	testFlattenMapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"1/foo is not flattened"	TokenNameStringLiteral	1/foo is not flattened
,	TokenNameCOMMA	
"unziptestout/1/foo"	TokenNameStringLiteral	unziptestout/1/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileExists	TokenNameIdentifier	 assert File Exists
(	TokenNameLPAREN	
"foo is flattened"	TokenNameStringLiteral	foo is flattened
,	TokenNameCOMMA	
"unziptestout/foo"	TokenNameStringLiteral	unziptestout/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert that a file exists, relative to the project * @param message message if there is no mpatch * @param filename filename to resolve against the project */	TokenNameCOMMENT_JAVADOC	 assert that a file exists, relative to the project @param message message if there is no mpatch @param filename filename to resolve against the project 
private	TokenNameprivate	
void	TokenNamevoid	
assertFileExists	TokenNameIdentifier	 assert File Exists
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert that a file doesnt exist, relative to the project * * @param message message if there is no mpatch * @param filename filename to resolve against the project */	TokenNameCOMMENT_JAVADOC	 assert that a file doesnt exist, relative to the project * @param message message if there is no mpatch @param filename filename to resolve against the project 
private	TokenNameprivate	
void	TokenNamevoid	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
!	TokenNameNOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * PR 21996 */	TokenNameCOMMENT_JAVADOC	 PR 21996 
public	TokenNamepublic	
void	TokenNamevoid	
testGlobMapper	TokenNameIdentifier	 test Glob Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testGlobMapper"	TokenNameStringLiteral	testGlobMapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"1/foo is not mapped"	TokenNameStringLiteral	1/foo is not mapped
,	TokenNameCOMMA	
"unziptestout/1/foo"	TokenNameStringLiteral	unziptestout/1/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileExists	TokenNameIdentifier	 assert File Exists
(	TokenNameLPAREN	
"1/foo is mapped"	TokenNameStringLiteral	1/foo is mapped
,	TokenNameCOMMA	
"unziptestout/1/foo.txt"	TokenNameStringLiteral	unziptestout/1/foo.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTwoMappers	TokenNameIdentifier	 test Two Mappers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testTwoMappers"	TokenNameStringLiteral	testTwoMappers
,	TokenNameCOMMA	
Expand	TokenNameIdentifier	 Expand
.	TokenNameDOT	
ERROR_MULTIPLE_MAPPERS	TokenNameIdentifier	 ERROR  MULTIPLE  MAPPERS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResourceCollections	TokenNameIdentifier	 test Resource Collections
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testResourceCollection"	TokenNameStringLiteral	testResourceCollection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileExists	TokenNameIdentifier	 assert File Exists
(	TokenNameLPAREN	
"junit.jar has been extracted"	TokenNameStringLiteral	junit.jar has been extracted
,	TokenNameCOMMA	
"unziptestout/junit/framework/Assert.class"	TokenNameStringLiteral	unziptestout/junit/framework/Assert.class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDocumentationClaimsOnCopy	TokenNameIdentifier	 test Documentation Claims On Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testDocumentationClaimsOnCopy"	TokenNameStringLiteral	testDocumentationClaimsOnCopy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileMissing	TokenNameIdentifier	 assert File Missing
(	TokenNameLPAREN	
"1/foo is excluded"	TokenNameStringLiteral	1/foo is excluded
,	TokenNameCOMMA	
"unziptestout/1/foo"	TokenNameStringLiteral	unziptestout/1/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFileExists	TokenNameIdentifier	 assert File Exists
(	TokenNameLPAREN	
"2/bar is not excluded"	TokenNameStringLiteral	2/bar is not excluded
,	TokenNameCOMMA	
"unziptestout/2/bar"	TokenNameStringLiteral	unziptestout/2/bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
