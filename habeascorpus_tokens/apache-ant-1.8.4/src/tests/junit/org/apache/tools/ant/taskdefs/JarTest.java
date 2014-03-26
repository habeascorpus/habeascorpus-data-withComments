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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
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
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipFile	TokenNameIdentifier	 Zip File
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
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
JarTest	TokenNameIdentifier	 Jar Test
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
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tempJar	TokenNameIdentifier	 temp Jar
=	TokenNameEQUAL	
"tmp.jar"	TokenNameStringLiteral	tmp.jar
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tempDir	TokenNameIdentifier	 temp Dir
=	TokenNameEQUAL	
"jartmp/"	TokenNameStringLiteral	jartmp/
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Reader	TokenNameIdentifier	 Reader
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JarTest	TokenNameIdentifier	 Jar Test
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
"src/etc/testcases/taskdefs/jar.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/jar.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
r1	TokenNameIdentifier	 r1
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
if	TokenNameif	
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
r2	TokenNameIdentifier	 r2
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
"manifest file does not exist"	TokenNameStringLiteral	manifest file does not exist
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
"Unrecognized whenempty attribute: format C: /y"	TokenNameStringLiteral	Unrecognized whenempty attribute: format C: /y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
jarFile	TokenNameIdentifier	 jar File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tempJar	TokenNameIdentifier	 temp Jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoRecreateWithoutUpdate	TokenNameIdentifier	 test No Recreate Without Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testNoRecreate	TokenNameIdentifier	 test No Recreate
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoRecreateWithUpdate	TokenNameIdentifier	 test No Recreate With Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testNoRecreate	TokenNameIdentifier	 test No Recreate
(	TokenNameLPAREN	
"testNoRecreateWithUpdate"	TokenNameStringLiteral	testNoRecreateWithUpdate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testNoRecreate	TokenNameIdentifier	 test No Recreate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
secondTarget	TokenNameIdentifier	 second Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
jarFile	TokenNameIdentifier	 jar File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tempJar	TokenNameIdentifier	 temp Jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
jarModifiedDate	TokenNameIdentifier	 jar Modified Date
=	TokenNameEQUAL	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
2500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// end of try-catch 	TokenNameCOMMENT_LINE	end of try-catch 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
secondTarget	TokenNameIdentifier	 second Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"jar has not been recreated in "	TokenNameStringLiteral	jar has not been recreated in 
+	TokenNamePLUS	
secondTarget	TokenNameIdentifier	 second Target
,	TokenNameCOMMA	
jarModifiedDate	TokenNameIdentifier	 jar Modified Date
,	TokenNameCOMMA	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRecreateWithoutUpdateAdditionalFiles	TokenNameIdentifier	 test Recreate Without Update Additional Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRecreate	TokenNameIdentifier	 test Recreate
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
,	TokenNameCOMMA	
"testRecreateWithoutUpdateAdditionalFiles"	TokenNameStringLiteral	testRecreateWithoutUpdateAdditionalFiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRecreateWithUpdateAdditionalFiles	TokenNameIdentifier	 test Recreate With Update Additional Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRecreate	TokenNameIdentifier	 test Recreate
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
,	TokenNameCOMMA	
"testRecreateWithUpdateAdditionalFiles"	TokenNameStringLiteral	testRecreateWithUpdateAdditionalFiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRecreateWithoutUpdateNewerFile	TokenNameIdentifier	 test Recreate Without Update Newer File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRecreate	TokenNameIdentifier	 test Recreate
(	TokenNameLPAREN	
"testRecreateNewerFileSetup"	TokenNameStringLiteral	testRecreateNewerFileSetup
,	TokenNameCOMMA	
"testRecreateWithoutUpdateNewerFile"	TokenNameStringLiteral	testRecreateWithoutUpdateNewerFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRecreateWithUpdateNewerFile	TokenNameIdentifier	 test Recreate With Update Newer File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRecreate	TokenNameIdentifier	 test Recreate
(	TokenNameLPAREN	
"testRecreateNewerFileSetup"	TokenNameStringLiteral	testRecreateNewerFileSetup
,	TokenNameCOMMA	
"testRecreateWithUpdateNewerFile"	TokenNameStringLiteral	testRecreateWithUpdateNewerFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testRecreate	TokenNameIdentifier	 test Recreate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
firstTarget	TokenNameIdentifier	 first Target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
secondTarget	TokenNameIdentifier	 second Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
firstTarget	TokenNameIdentifier	 first Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
sleeptime	TokenNameIdentifier	 sleeptime
=	TokenNameEQUAL	
3000	TokenNameIntegerLiteral	
+	TokenNamePLUS	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
sleeptime	TokenNameIdentifier	 sleeptime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// end of try-catch 	TokenNameCOMMENT_LINE	end of try-catch 
File	TokenNameIdentifier	 File
jarFile	TokenNameIdentifier	 jar File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tempJar	TokenNameIdentifier	 temp Jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
jarModifiedDate	TokenNameIdentifier	 jar Modified Date
=	TokenNameEQUAL	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
secondTarget	TokenNameIdentifier	 second Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarFile	TokenNameIdentifier	 jar File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tempJar	TokenNameIdentifier	 temp Jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"jar has been recreated in "	TokenNameStringLiteral	jar has been recreated in 
+	TokenNamePLUS	
secondTarget	TokenNameIdentifier	 second Target
,	TokenNameCOMMA	
jarModifiedDate	TokenNameIdentifier	 jar Modified Date
<	TokenNameLESS	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testManifestStaysIntact	TokenNameIdentifier	 test Manifest Stays Intact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testManifestStaysIntact"	TokenNameStringLiteral	testManifestStaysIntact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
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
tempDir	TokenNameIdentifier	 temp Dir
+	TokenNamePLUS	
"manifest"	TokenNameStringLiteral	manifest
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
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
tempDir	TokenNameIdentifier	 temp Dir
+	TokenNamePLUS	
"META-INF/MANIFEST.MF"	TokenNameStringLiteral	META-INF/MANIFEST.MF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
mf1	TokenNameIdentifier	 mf1
=	TokenNameEQUAL	
new	TokenNamenew	
Manifest	TokenNameIdentifier	 Manifest
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
mf2	TokenNameIdentifier	 mf2
=	TokenNameEQUAL	
new	TokenNamenew	
Manifest	TokenNameIdentifier	 Manifest
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
mf1	TokenNameIdentifier	 mf1
,	TokenNameCOMMA	
mf2	TokenNameIdentifier	 mf2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoRecreateBasedirExcludesWithUpdate	TokenNameIdentifier	 test No Recreate Basedir Excludes With Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testNoRecreate	TokenNameIdentifier	 test No Recreate
(	TokenNameLPAREN	
"testNoRecreateBasedirExcludesWithUpdate"	TokenNameStringLiteral	testNoRecreateBasedirExcludesWithUpdate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoRecreateBasedirExcludesWithoutUpdate	TokenNameIdentifier	 test No Recreate Basedir Excludes Without Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testNoRecreate	TokenNameIdentifier	 test No Recreate
(	TokenNameLPAREN	
"testNoRecreateBasedirExcludesWithoutUpdate"	TokenNameStringLiteral	testNoRecreateBasedirExcludesWithoutUpdate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoRecreateZipfilesetExcludesWithUpdate	TokenNameIdentifier	 test No Recreate Zipfileset Excludes With Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testNoRecreate	TokenNameIdentifier	 test No Recreate
(	TokenNameLPAREN	
"testNoRecreateZipfilesetExcludesWithUpdate"	TokenNameStringLiteral	testNoRecreateZipfilesetExcludesWithUpdate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoRecreateZipfilesetExcludesWithoutUpdate	TokenNameIdentifier	 test No Recreate Zipfileset Excludes Without Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testNoRecreate	TokenNameIdentifier	 test No Recreate
(	TokenNameLPAREN	
"testNoRecreateZipfilesetExcludesWithoutUpdate"	TokenNameStringLiteral	testNoRecreateZipfilesetExcludesWithoutUpdate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRecreateZipfilesetWithoutUpdateAdditionalFiles	TokenNameIdentifier	 test Recreate Zipfileset Without Update Additional Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRecreate	TokenNameIdentifier	 test Recreate
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
,	TokenNameCOMMA	
"testRecreateZipfilesetWithoutUpdateAdditionalFiles"	TokenNameStringLiteral	testRecreateZipfilesetWithoutUpdateAdditionalFiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRecreateZipfilesetWithUpdateAdditionalFiles	TokenNameIdentifier	 test Recreate Zipfileset With Update Additional Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRecreate	TokenNameIdentifier	 test Recreate
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
,	TokenNameCOMMA	
"testRecreateZipfilesetWithUpdateAdditionalFiles"	TokenNameStringLiteral	testRecreateZipfilesetWithUpdateAdditionalFiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRecreateZipfilesetWithoutUpdateNewerFile	TokenNameIdentifier	 test Recreate Zipfileset Without Update Newer File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRecreate	TokenNameIdentifier	 test Recreate
(	TokenNameLPAREN	
"testRecreateNewerFileSetup"	TokenNameStringLiteral	testRecreateNewerFileSetup
,	TokenNameCOMMA	
"testRecreateZipfilesetWithoutUpdateNewerFile"	TokenNameStringLiteral	testRecreateZipfilesetWithoutUpdateNewerFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRecreateZipfilesetWithUpdateNewerFile	TokenNameIdentifier	 test Recreate Zipfileset With Update Newer File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRecreate	TokenNameIdentifier	 test Recreate
(	TokenNameLPAREN	
"testRecreateNewerFileSetup"	TokenNameStringLiteral	testRecreateNewerFileSetup
,	TokenNameCOMMA	
"testRecreateZipfilesetWithUpdateNewerFile"	TokenNameStringLiteral	testRecreateZipfilesetWithUpdateNewerFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCreateWithEmptyFileset	TokenNameIdentifier	 test Create With Empty Fileset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testCreateWithEmptyFilesetSetUp"	TokenNameStringLiteral	testCreateWithEmptyFilesetSetUp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testCreateWithEmptyFileset"	TokenNameStringLiteral	testCreateWithEmptyFileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testCreateWithEmptyFileset"	TokenNameStringLiteral	testCreateWithEmptyFileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUpdateIfOnlyManifestHasChanged	TokenNameIdentifier	 test Update If Only Manifest Has Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testUpdateIfOnlyManifestHasChanged"	TokenNameStringLiteral	testUpdateIfOnlyManifestHasChanged
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
jarXml	TokenNameIdentifier	 jar Xml
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
tempDir	TokenNameIdentifier	 temp Dir
+	TokenNamePLUS	
"jar.xml"	TokenNameStringLiteral	jar.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
jarXml	TokenNameIdentifier	 jar Xml
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bugzilla report 10262 	TokenNameCOMMENT_LINE	bugzilla report 10262 
public	TokenNamepublic	
void	TokenNamevoid	
testNoDuplicateIndex	TokenNameIdentifier	 test No Duplicate Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ZipFile	TokenNameIdentifier	 Zip File
archive	TokenNameIdentifier	 archive
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testIndexTests"	TokenNameStringLiteral	testIndexTests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
tempJar	TokenNameIdentifier	 temp Jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numberOfIndexLists	TokenNameIdentifier	 number Of Index Lists
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"META-INF/INDEX.LIST"	TokenNameStringLiteral	META-INF/INDEX.LIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberOfIndexLists	TokenNameIdentifier	 number Of Index Lists
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numberOfIndexLists	TokenNameIdentifier	 number Of Index Lists
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
archive	TokenNameIdentifier	 archive
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// bugzilla report 16972 	TokenNameCOMMENT_LINE	bugzilla report 16972 
public	TokenNamepublic	
void	TokenNamevoid	
testRootFilesInIndex	TokenNameIdentifier	 test Root Files In Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ZipFile	TokenNameIdentifier	 Zip File
archive	TokenNameIdentifier	 archive
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testIndexTests"	TokenNameStringLiteral	testIndexTests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
tempJar	TokenNameIdentifier	 temp Jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
"META-INF/INDEX.LIST"	TokenNameStringLiteral	META-INF/INDEX.LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
"UTF8"	TokenNameStringLiteral	UTF8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundSub	TokenNameIdentifier	 found Sub
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundSubFoo	TokenNameIdentifier	 found Sub Foo
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundFoo	TokenNameIdentifier	 found Foo
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundFoo	TokenNameIdentifier	 found Foo
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"sub"	TokenNameStringLiteral	sub
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundSub	TokenNameIdentifier	 found Sub
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"sub/foo"	TokenNameStringLiteral	sub/foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundSubFoo	TokenNameIdentifier	 found Sub Foo
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
foundSub	TokenNameIdentifier	 found Sub
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
foundSubFoo	TokenNameIdentifier	 found Sub Foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
foundFoo	TokenNameIdentifier	 found Foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
archive	TokenNameIdentifier	 archive
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
archive	TokenNameIdentifier	 archive
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testManifestOnlyJar	TokenNameIdentifier	 test Manifest Only Jar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testManifestOnlyJar"	TokenNameStringLiteral	testManifestOnlyJar
,	TokenNameCOMMA	
"Building MANIFEST-only jar: "	TokenNameStringLiteral	Building MANIFEST-only jar: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
manifestFile	TokenNameIdentifier	 manifest File
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
tempDir	TokenNameIdentifier	 temp Dir
+	TokenNamePLUS	
"META-INF"	TokenNameStringLiteral	META-INF
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"MANIFEST.MF"	TokenNameStringLiteral	MANIFEST.MF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
manifestFile	TokenNameIdentifier	 manifest File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIndexJarsPlusJarMarker	TokenNameIdentifier	 test Index Jars Plus Jar Marker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testIndexJarsPlusJarMarker"	TokenNameStringLiteral	testIndexJarsPlusJarMarker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoVersionInfoFail	TokenNameIdentifier	 test No Version Info Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testNoVersionInfoFail"	TokenNameStringLiteral	testNoVersionInfoFail
,	TokenNameCOMMA	
"Manifest Implemention information missing."	TokenNameStringLiteral	Manifest Implemention information missing.
,	TokenNameCOMMA	
"No Implementation-Title set."	TokenNameStringLiteral	No Implementation-Title set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoVersionInfoIgnore	TokenNameIdentifier	 test No Version Info Ignore
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testNoVersionInfoIgnore"	TokenNameStringLiteral	testNoVersionInfoIgnore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Title set."	TokenNameStringLiteral	No Implementation-Title set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Version set."	TokenNameStringLiteral	No Implementation-Version set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Vendor set."	TokenNameStringLiteral	No Implementation-Vendor set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoVersionInfoWarn	TokenNameIdentifier	 test No Version Info Warn
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testNoVersionInfoWarn"	TokenNameStringLiteral	testNoVersionInfoWarn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Title set."	TokenNameStringLiteral	No Implementation-Title set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Version set."	TokenNameStringLiteral	No Implementation-Version set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Vendor set."	TokenNameStringLiteral	No Implementation-Vendor set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoVersionInfoNoStrict	TokenNameIdentifier	 test No Version Info No Strict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testNoVersionInfoNoStrict"	TokenNameStringLiteral	testNoVersionInfoNoStrict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Title set."	TokenNameStringLiteral	No Implementation-Title set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Version set."	TokenNameStringLiteral	No Implementation-Version set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Vendor set."	TokenNameStringLiteral	No Implementation-Vendor set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHasVersionInfo	TokenNameIdentifier	 test Has Version Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testHasVersionInfo"	TokenNameStringLiteral	testHasVersionInfo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Title set."	TokenNameStringLiteral	No Implementation-Title set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Version set."	TokenNameStringLiteral	No Implementation-Version set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No Implementation-Vendor set."	TokenNameStringLiteral	No Implementation-Vendor set.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
