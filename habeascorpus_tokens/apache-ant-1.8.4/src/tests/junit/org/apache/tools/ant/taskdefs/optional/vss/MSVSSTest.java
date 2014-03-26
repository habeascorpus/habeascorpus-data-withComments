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
vss	TokenNameIdentifier	 vss
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
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
Location	TokenNameIdentifier	 Location
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
import	TokenNameimport	
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
Tstamp	TokenNameIdentifier	 Tstamp
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Commandline	TokenNameIdentifier	 Commandline
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
;	TokenNameSEMICOLON	
/** * Testcase to ensure that command line generation and required attributes are correct. * */	TokenNameCOMMENT_JAVADOC	 Testcase to ensure that command line generation and required attributes are correct. 
public	TokenNamepublic	
class	TokenNameclass	
MSVSSTest	TokenNameIdentifier	 MSVSS Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
implements	TokenNameimplements	
MSVSSConstants	TokenNameIdentifier	 MSVSS Constants
{	TokenNameLBRACE	
private	TokenNameprivate	
Commandline	TokenNameIdentifier	 Commandline
commandline	TokenNameIdentifier	 commandline
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
=	TokenNameEQUAL	
"/SourceRoot/Project"	TokenNameStringLiteral	/SourceRoot/Project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
=	TokenNameEQUAL	
"$/SourceRoot/Project"	TokenNameStringLiteral	$/SourceRoot/Project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
=	TokenNameEQUAL	
"ant"	TokenNameStringLiteral	ant
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
=	TokenNameEQUAL	
"rocks"	TokenNameStringLiteral	rocks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOCAL_PATH	TokenNameIdentifier	 LOCAL  PATH
=	TokenNameEQUAL	
"testdir"	TokenNameStringLiteral	testdir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
=	TokenNameEQUAL	
"label1"	TokenNameStringLiteral	label1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LONG_LABEL	TokenNameIdentifier	 LONG  LABEL
=	TokenNameEQUAL	
"123456789012345678901234567890"	TokenNameStringLiteral	123456789012345678901234567890
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
=	TokenNameEQUAL	
"I fixed a bug"	TokenNameStringLiteral	I fixed a bug
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VERSION	TokenNameIdentifier	 VERSION
=	TokenNameEQUAL	
"007"	TokenNameStringLiteral	007
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE	TokenNameIdentifier	 DATE
=	TokenNameEQUAL	
"00-00-00"	TokenNameStringLiteral	00-00-00
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE2	TokenNameIdentifier	 DAT E2
=	TokenNameEQUAL	
"01-01-01"	TokenNameStringLiteral	01-01-01
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OUTPUT	TokenNameIdentifier	 OUTPUT
=	TokenNameEQUAL	
"output.log"	TokenNameStringLiteral	output.log
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SS_DIR	TokenNameIdentifier	 SS  DIR
=	TokenNameEQUAL	
"c:/winnt"	TokenNameStringLiteral	c:/winnt
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructor for the MSVSSTest object * * @param s Test name */	TokenNameCOMMENT_JAVADOC	 Constructor for the MSVSSTest object * @param s Test name 
public	TokenNamepublic	
MSVSSTest	TokenNameIdentifier	 MSVSS Test
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
/** * The JUnit setup method * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 The JUnit setup method * @throws Exception 
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The teardown method for JUnit * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 The teardown method for JUnit * @throws Exception 
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LOCAL_PATH	TokenNameIdentifier	 LOCAL  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Tests VSSGet commandline generation. */	TokenNameCOMMENT_JAVADOC	 Tests VSSGet commandline generation. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetCommandLine	TokenNameIdentifier	 test Get Command Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_GET	TokenNameIdentifier	 COMMAND  GET
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_OVERRIDE_WORKING_DIR	TokenNameIdentifier	 FLAG  OVERRIDE  WORKING  DIR
+	TokenNamePLUS	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
LOCAL_PATH	TokenNameIdentifier	 LOCAL  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_RECURSION	TokenNameIdentifier	 FLAG  RECURSION
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
,	TokenNameCOMMA	
FLAG_FILETIME_UPDATED	TokenNameIdentifier	 FLAG  FILETIME  UPDATED
,	TokenNameCOMMA	
FLAG_SKIP_WRITABLE	TokenNameIdentifier	 FLAG  SKIP  WRITABLE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a VSSGet task 	TokenNameCOMMENT_LINE	Set up a VSSGet task 
MSVSSGET	TokenNameIdentifier	 MSVSSGET
vssGet	TokenNameIdentifier	 vss Get
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSGET	TokenNameIdentifier	 MSVSSGET
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setLocalpath	TokenNameIdentifier	 set Localpath
(	TokenNameLPAREN	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
LOCAL_PATH	TokenNameIdentifier	 LOCAL  PATH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setQuiet	TokenNameIdentifier	 set Quiet
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setDate	TokenNameIdentifier	 set Date
(	TokenNameLPAREN	
DATE	TokenNameIdentifier	 DATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setLabel	TokenNameIdentifier	 set Label
(	TokenNameLPAREN	
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
CurrentModUpdated	TokenNameIdentifier	 Current Mod Updated
cmu	TokenNameIdentifier	 cmu
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
CurrentModUpdated	TokenNameIdentifier	 Current Mod Updated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
TIME_UPDATED	TokenNameIdentifier	 TIME  UPDATED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setFileTimeStamp	TokenNameIdentifier	 set File Time Stamp
(	TokenNameLPAREN	
cmu	TokenNameIdentifier	 cmu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
WritableFiles	TokenNameIdentifier	 Writable Files
wf	TokenNameIdentifier	 wf
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
WritableFiles	TokenNameIdentifier	 Writable Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wf	TokenNameIdentifier	 wf
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
WRITABLE_SKIP	TokenNameIdentifier	 WRITABLE  SKIP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
setWritableFiles	TokenNameIdentifier	 set Writable Files
(	TokenNameLPAREN	
wf	TokenNameIdentifier	 wf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssGet	TokenNameIdentifier	 vss Get
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests VSSGet required attributes. */	TokenNameCOMMENT_JAVADOC	 Tests VSSGet required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetExceptions	TokenNameIdentifier	 test Get Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/vss/vss.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/vss/vss.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"vssget.1"	TokenNameStringLiteral	vssget.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vsspath attribute must be set!"	TokenNameStringLiteral	vsspath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests Label commandline generation. */	TokenNameCOMMENT_JAVADOC	 Tests Label commandline generation. 
public	TokenNamepublic	
void	TokenNamevoid	
testLabelCommandLine1	TokenNameIdentifier	 test Label Command Line1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_LABEL	TokenNameIdentifier	 COMMAND  LABEL
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
+	TokenNamePLUS	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_YES	TokenNameIdentifier	 FLAG  AUTORESPONSE  YES
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LABEL	TokenNameIdentifier	 FLAG  LABEL
+	TokenNamePLUS	
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a VSSLabel task 	TokenNameCOMMENT_LINE	Set up a VSSLabel task 
MSVSSLABEL	TokenNameIdentifier	 MSVSSLABEL
vssLabel	TokenNameIdentifier	 vss Label
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSLABEL	TokenNameIdentifier	 MSVSSLABEL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setAutoresponse	TokenNameIdentifier	 set Autoresponse
(	TokenNameLPAREN	
"Y"	TokenNameStringLiteral	Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setLabel	TokenNameIdentifier	 set Label
(	TokenNameLPAREN	
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests Label commandline generation with a label of more than 31 chars. */	TokenNameCOMMENT_JAVADOC	 Tests Label commandline generation with a label of more than 31 chars. 
public	TokenNamepublic	
void	TokenNamevoid	
testLabelCommandLine2	TokenNameIdentifier	 test Label Command Line2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_LABEL	TokenNameIdentifier	 COMMAND  LABEL
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
+	TokenNamePLUS	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LABEL	TokenNameIdentifier	 FLAG  LABEL
+	TokenNamePLUS	
LONG_LABEL	TokenNameIdentifier	 LONG  LABEL
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a VSSLabel task 	TokenNameCOMMENT_LINE	Set up a VSSLabel task 
MSVSSLABEL	TokenNameIdentifier	 MSVSSLABEL
vssLabel	TokenNameIdentifier	 vss Label
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSLABEL	TokenNameIdentifier	 MSVSSLABEL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setLabel	TokenNameIdentifier	 set Label
(	TokenNameLPAREN	
LONG_LABEL	TokenNameIdentifier	 LONG  LABEL
+	TokenNamePLUS	
"blahblah"	TokenNameStringLiteral	blahblah
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssLabel	TokenNameIdentifier	 vss Label
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test VSSLabel required attributes. */	TokenNameCOMMENT_JAVADOC	 Test VSSLabel required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testLabelExceptions	TokenNameIdentifier	 test Label Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/vss/vss.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/vss/vss.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"vsslabel.1"	TokenNameStringLiteral	vsslabel.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vsspath attribute must be set!"	TokenNameStringLiteral	vsspath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"vsslabel.2"	TokenNameStringLiteral	vsslabel.2
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"label attribute must be set!"	TokenNameStringLiteral	label attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests VSSHistory commandline generation with from label. */	TokenNameCOMMENT_JAVADOC	 Tests VSSHistory commandline generation with from label. 
public	TokenNamepublic	
void	TokenNamevoid	
testHistoryCommandLine1	TokenNameIdentifier	 test History Command Line1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_HISTORY	TokenNameIdentifier	 COMMAND  HISTORY
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_VERSION_LABEL	TokenNameIdentifier	 FLAG  VERSION  LABEL
+	TokenNamePLUS	
LONG_LABEL	TokenNameIdentifier	 LONG  LABEL
+	TokenNamePLUS	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
VALUE_FROMLABEL	TokenNameIdentifier	 VALUE  FROMLABEL
+	TokenNamePLUS	
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_OUTPUT	TokenNameIdentifier	 FLAG  OUTPUT
+	TokenNamePLUS	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
OUTPUT	TokenNameIdentifier	 OUTPUT
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a VSSHistory task 	TokenNameCOMMENT_LINE	Set up a VSSHistory task 
MSVSSHISTORY	TokenNameIdentifier	 MSVSSHISTORY
vssHistory	TokenNameIdentifier	 vss History
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSHISTORY	TokenNameIdentifier	 MSVSSHISTORY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setFromLabel	TokenNameIdentifier	 set From Label
(	TokenNameLPAREN	
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setToLabel	TokenNameIdentifier	 set To Label
(	TokenNameLPAREN	
LONG_LABEL	TokenNameIdentifier	 LONG  LABEL
+	TokenNamePLUS	
"blahblah"	TokenNameStringLiteral	blahblah
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OUTPUT	TokenNameIdentifier	 OUTPUT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests VSSHistory commandline generation with from date. */	TokenNameCOMMENT_JAVADOC	 Tests VSSHistory commandline generation with from date. 
public	TokenNamepublic	
void	TokenNamevoid	
testHistoryCommandLine2	TokenNameIdentifier	 test History Command Line2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_HISTORY	TokenNameIdentifier	 COMMAND  HISTORY
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_VERSION_DATE	TokenNameIdentifier	 FLAG  VERSION  DATE
+	TokenNamePLUS	
DATE	TokenNameIdentifier	 DATE
+	TokenNamePLUS	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
VALUE_FROMDATE	TokenNameIdentifier	 VALUE  FROMDATE
+	TokenNamePLUS	
DATE2	TokenNameIdentifier	 DAT E2
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_RECURSION	TokenNameIdentifier	 FLAG  RECURSION
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a VSSHistory task 	TokenNameCOMMENT_LINE	Set up a VSSHistory task 
MSVSSHISTORY	TokenNameIdentifier	 MSVSSHISTORY
vssHistory	TokenNameIdentifier	 vss History
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSHISTORY	TokenNameIdentifier	 MSVSSHISTORY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setFromDate	TokenNameIdentifier	 set From Date
(	TokenNameLPAREN	
DATE2	TokenNameIdentifier	 DAT E2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setToDate	TokenNameIdentifier	 set To Date
(	TokenNameLPAREN	
DATE	TokenNameIdentifier	 DATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests VSSHistory commandline generation with date calculation. */	TokenNameCOMMENT_JAVADOC	 Tests VSSHistory commandline generation with date calculation. 
public	TokenNamepublic	
void	TokenNamevoid	
testHistoryCommandLine3	TokenNameIdentifier	 test History Command Line3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Set up a Timestamp 	TokenNameCOMMENT_LINE	Set up a Timestamp 
Tstamp	TokenNameIdentifier	 Tstamp
tstamp	TokenNameIdentifier	 tstamp
=	TokenNameEQUAL	
new	TokenNamenew	
Tstamp	TokenNameIdentifier	 Tstamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
new	TokenNamenew	
Location	TokenNameIdentifier	 Location
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/vss/vss.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/vss/vss.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Tstamp	TokenNameIdentifier	 Tstamp
.	TokenNameDOT	
CustomFormat	TokenNameIdentifier	 Custom Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
createFormat	TokenNameIdentifier	 create Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"today"	TokenNameStringLiteral	today
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"HH:mm:ss z"	TokenNameStringLiteral	HH:mm:ss z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
today	TokenNameIdentifier	 today
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"today"	TokenNameStringLiteral	today
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get today's date 	TokenNameCOMMENT_LINE	Get today's date 
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
sdf	TokenNameIdentifier	 sdf
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm:ss z"	TokenNameStringLiteral	HH:mm:ss z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set up a VSSHistory task 	TokenNameCOMMENT_LINE	Set up a VSSHistory task 
MSVSSHISTORY	TokenNameIdentifier	 MSVSSHISTORY
vssHistory	TokenNameIdentifier	 vss History
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSHISTORY	TokenNameIdentifier	 MSVSSHISTORY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setToDate	TokenNameIdentifier	 set To Date
(	TokenNameLPAREN	
today	TokenNameIdentifier	 today
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_HISTORY	TokenNameIdentifier	 COMMAND  HISTORY
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_VERSION_DATE	TokenNameIdentifier	 FLAG  VERSION  DATE
+	TokenNamePLUS	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssHistory	TokenNameIdentifier	 vss History
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests VSSHistory required attributes. */	TokenNameCOMMENT_JAVADOC	 Tests VSSHistory required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testHistoryExceptions	TokenNameIdentifier	 test History Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/vss/vss.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/vss/vss.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"vsshistory.1"	TokenNameStringLiteral	vsshistory.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vsspath attribute must be set!"	TokenNameStringLiteral	vsspath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests CheckIn commandline generation. */	TokenNameCOMMENT_JAVADOC	 Tests CheckIn commandline generation. 
public	TokenNamepublic	
void	TokenNamevoid	
testCheckinCommandLine	TokenNameIdentifier	 test Checkin Command Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_CHECKIN	TokenNameIdentifier	 COMMAND  CHECKIN
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_NO	TokenNameIdentifier	 FLAG  AUTORESPONSE  NO
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_WRITABLE	TokenNameIdentifier	 FLAG  WRITABLE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
+	TokenNamePLUS	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a VSSCheckIn task 	TokenNameCOMMENT_LINE	Set up a VSSCheckIn task 
MSVSSCHECKIN	TokenNameIdentifier	 MSVSSCHECKIN
vssCheckin	TokenNameIdentifier	 vss Checkin
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSCHECKIN	TokenNameIdentifier	 MSVSSCHECKIN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckin	TokenNameIdentifier	 vss Checkin
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckin	TokenNameIdentifier	 vss Checkin
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckin	TokenNameIdentifier	 vss Checkin
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckin	TokenNameIdentifier	 vss Checkin
.	TokenNameDOT	
setAutoresponse	TokenNameIdentifier	 set Autoresponse
(	TokenNameLPAREN	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckin	TokenNameIdentifier	 vss Checkin
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckin	TokenNameIdentifier	 vss Checkin
.	TokenNameDOT	
setWritable	TokenNameIdentifier	 set Writable
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssCheckin	TokenNameIdentifier	 vss Checkin
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test VSSCheckIn required attributes. */	TokenNameCOMMENT_JAVADOC	 Test VSSCheckIn required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testCheckinExceptions	TokenNameIdentifier	 test Checkin Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/vss/vss.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/vss/vss.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"vsscheckin.1"	TokenNameStringLiteral	vsscheckin.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vsspath attribute must be set!"	TokenNameStringLiteral	vsspath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests CheckOut commandline generation. */	TokenNameCOMMENT_JAVADOC	 Tests CheckOut commandline generation. 
public	TokenNamepublic	
void	TokenNamevoid	
testCheckoutCommandLine	TokenNameIdentifier	 test Checkout Command Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
SS_DIR	TokenNameIdentifier	 SS  DIR
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_CHECKOUT	TokenNameIdentifier	 COMMAND  CHECKOUT
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_RECURSION	TokenNameIdentifier	 FLAG  RECURSION
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_VERSION_DATE	TokenNameIdentifier	 FLAG  VERSION  DATE
+	TokenNamePLUS	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
,	TokenNameCOMMA	
FLAG_FILETIME_MODIFIED	TokenNameIdentifier	 FLAG  FILETIME  MODIFIED
,	TokenNameCOMMA	
FLAG_NO_GET	TokenNameIdentifier	 FLAG  NO  GET
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a VSSCheckOut task 	TokenNameCOMMENT_LINE	Set up a VSSCheckOut task 
MSVSSCHECKOUT	TokenNameIdentifier	 MSVSSCHECKOUT
vssCheckout	TokenNameIdentifier	 vss Checkout
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSCHECKOUT	TokenNameIdentifier	 MSVSSCHECKOUT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckout	TokenNameIdentifier	 vss Checkout
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckout	TokenNameIdentifier	 vss Checkout
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckout	TokenNameIdentifier	 vss Checkout
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckout	TokenNameIdentifier	 vss Checkout
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckout	TokenNameIdentifier	 vss Checkout
.	TokenNameDOT	
setDate	TokenNameIdentifier	 set Date
(	TokenNameLPAREN	
DATE	TokenNameIdentifier	 DATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckout	TokenNameIdentifier	 vss Checkout
.	TokenNameDOT	
setLabel	TokenNameIdentifier	 set Label
(	TokenNameLPAREN	
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckout	TokenNameIdentifier	 vss Checkout
.	TokenNameDOT	
setSsdir	TokenNameIdentifier	 set Ssdir
(	TokenNameLPAREN	
SS_DIR	TokenNameIdentifier	 SS  DIR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
CurrentModUpdated	TokenNameIdentifier	 Current Mod Updated
cmu	TokenNameIdentifier	 cmu
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
CurrentModUpdated	TokenNameIdentifier	 Current Mod Updated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
TIME_MODIFIED	TokenNameIdentifier	 TIME  MODIFIED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckout	TokenNameIdentifier	 vss Checkout
.	TokenNameDOT	
setFileTimeStamp	TokenNameIdentifier	 set File Time Stamp
(	TokenNameLPAREN	
cmu	TokenNameIdentifier	 cmu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCheckout	TokenNameIdentifier	 vss Checkout
.	TokenNameDOT	
setGetLocalCopy	TokenNameIdentifier	 set Get Local Copy
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssCheckout	TokenNameIdentifier	 vss Checkout
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test VSSCheckout required attributes. */	TokenNameCOMMENT_JAVADOC	 Test VSSCheckout required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testCheckoutExceptions	TokenNameIdentifier	 test Checkout Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/vss/vss.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/vss/vss.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"vsscheckout.1"	TokenNameStringLiteral	vsscheckout.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vsspath attribute must be set!"	TokenNameStringLiteral	vsspath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"vsscheckout.2"	TokenNameStringLiteral	vsscheckout.2
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"blah is not a legal value for this attribute"	TokenNameStringLiteral	blah is not a legal value for this attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests Add commandline generation. */	TokenNameCOMMENT_JAVADOC	 Tests Add commandline generation. 
public	TokenNamepublic	
void	TokenNamevoid	
testAddCommandLine	TokenNameIdentifier	 test Add Command Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
SS_DIR	TokenNameIdentifier	 SS  DIR
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_ADD	TokenNameIdentifier	 COMMAND  ADD
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
LOCAL_PATH	TokenNameIdentifier	 LOCAL  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_RECURSION	TokenNameIdentifier	 FLAG  RECURSION
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a VSSAdd task 	TokenNameCOMMENT_LINE	Set up a VSSAdd task 
MSVSSADD	TokenNameIdentifier	 MSVSSADD
vssAdd	TokenNameIdentifier	 vss Add
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSADD	TokenNameIdentifier	 MSVSSADD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssAdd	TokenNameIdentifier	 vss Add
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssAdd	TokenNameIdentifier	 vss Add
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
VSS_PASSWORD	TokenNameIdentifier	 VSS  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssAdd	TokenNameIdentifier	 vss Add
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssAdd	TokenNameIdentifier	 vss Add
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssAdd	TokenNameIdentifier	 vss Add
.	TokenNameDOT	
setSsdir	TokenNameIdentifier	 set Ssdir
(	TokenNameLPAREN	
SS_DIR	TokenNameIdentifier	 SS  DIR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssAdd	TokenNameIdentifier	 vss Add
.	TokenNameDOT	
setWritable	TokenNameIdentifier	 set Writable
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssAdd	TokenNameIdentifier	 vss Add
.	TokenNameDOT	
setLocalpath	TokenNameIdentifier	 set Localpath
(	TokenNameLPAREN	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
LOCAL_PATH	TokenNameIdentifier	 LOCAL  PATH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssAdd	TokenNameIdentifier	 vss Add
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test VSSAdd required attributes. */	TokenNameCOMMENT_JAVADOC	 Test VSSAdd required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testAddExceptions	TokenNameIdentifier	 test Add Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/vss/vss.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/vss/vss.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"vssadd.1"	TokenNameStringLiteral	vssadd.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"localPath attribute must be set!"	TokenNameStringLiteral	localPath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests CP commandline generation. */	TokenNameCOMMENT_JAVADOC	 Tests CP commandline generation. 
public	TokenNamepublic	
void	TokenNamevoid	
testCpCommandLine	TokenNameIdentifier	 test Cp Command Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_CP	TokenNameIdentifier	 COMMAND  CP
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a VSSCp task 	TokenNameCOMMENT_LINE	Set up a VSSCp task 
MSVSSCP	TokenNameIdentifier	 MSVSSCP
vssCp	TokenNameIdentifier	 vss Cp
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSCP	TokenNameIdentifier	 MSVSSCP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCp	TokenNameIdentifier	 vss Cp
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCp	TokenNameIdentifier	 vss Cp
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCp	TokenNameIdentifier	 vss Cp
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssCp	TokenNameIdentifier	 vss Cp
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test VSSCP required attributes. */	TokenNameCOMMENT_JAVADOC	 Test VSSCP required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testCpExceptions	TokenNameIdentifier	 test Cp Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/vss/vss.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/vss/vss.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"vsscp.1"	TokenNameStringLiteral	vsscp.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vsspath attribute must be set!"	TokenNameStringLiteral	vsspath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests Create commandline generation. */	TokenNameCOMMENT_JAVADOC	 Tests Create commandline generation. 
public	TokenNamepublic	
void	TokenNamevoid	
testCreateCommandLine	TokenNameIdentifier	 test Create Command Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
SS_EXE	TokenNameIdentifier	 SS  EXE
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
COMMAND_CREATE	TokenNameIdentifier	 COMMAND  CREATE
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
+	TokenNamePLUS	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_AUTORESPONSE_NO	TokenNameIdentifier	 FLAG  AUTORESPONSE  NO
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_QUIET	TokenNameIdentifier	 FLAG  QUIET
,	TokenNameCOMMA	
MSVSS	TokenNameIdentifier	 MSVSS
.	TokenNameDOT	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a VSSCreate task 	TokenNameCOMMENT_LINE	Set up a VSSCreate task 
MSVSSCREATE	TokenNameIdentifier	 MSVSSCREATE
vssCreate	TokenNameIdentifier	 vss Create
=	TokenNameEQUAL	
new	TokenNamenew	
MSVSSCREATE	TokenNameIdentifier	 MSVSSCREATE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCreate	TokenNameIdentifier	 vss Create
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCreate	TokenNameIdentifier	 vss Create
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCreate	TokenNameIdentifier	 vss Create
.	TokenNameDOT	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
VSS_USERNAME	TokenNameIdentifier	 VSS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCreate	TokenNameIdentifier	 vss Create
.	TokenNameDOT	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCreate	TokenNameIdentifier	 vss Create
.	TokenNameDOT	
setFailOnError	TokenNameIdentifier	 set Fail On Error
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCreate	TokenNameIdentifier	 vss Create
.	TokenNameDOT	
setAutoresponse	TokenNameIdentifier	 set Autoresponse
(	TokenNameLPAREN	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vssCreate	TokenNameIdentifier	 vss Create
.	TokenNameDOT	
setQuiet	TokenNameIdentifier	 set Quiet
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
vssCreate	TokenNameIdentifier	 vss Create
.	TokenNameDOT	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test VSSCreate required attributes. */	TokenNameCOMMENT_JAVADOC	 Test VSSCreate required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testCreateExceptions	TokenNameIdentifier	 test Create Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/vss/vss.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/vss/vss.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"vsscreate.1"	TokenNameStringLiteral	vsscreate.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vsspath attribute must be set!"	TokenNameStringLiteral	vsspath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Iterate through the generated command line comparing it to reference one. * @param sTestCmdLine The reference command line; * @param sGeneratedCmdLine The generated command line; */	TokenNameCOMMENT_JAVADOC	 Iterate through the generated command line comparing it to reference one. @param sTestCmdLine The reference command line; @param sGeneratedCmdLine The generated command line; 
private	TokenNameprivate	
void	TokenNamevoid	
checkCommandLines	TokenNameIdentifier	 check Command Lines
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sGeneratedCmdLine	TokenNameIdentifier	 s Generated Cmd Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
testLength	TokenNameIdentifier	 test Length
=	TokenNameEQUAL	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
genLength	TokenNameIdentifier	 gen Length
=	TokenNameEQUAL	
sGeneratedCmdLine	TokenNameIdentifier	 s Generated Cmd Line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
genIndex	TokenNameIdentifier	 gen Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
testIndex	TokenNameIdentifier	 test Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
testIndex	TokenNameIdentifier	 test Index
<	TokenNameLESS	
testLength	TokenNameIdentifier	 test Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sGeneratedCmdLine	TokenNameIdentifier	 s Generated Cmd Line
[	TokenNameLBRACKET	
genIndex	TokenNameIdentifier	 gen Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genIndex	TokenNameIdentifier	 gen Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"arg # "	TokenNameStringLiteral	arg # 
+	TokenNamePLUS	
testIndex	TokenNameIdentifier	 test Index
,	TokenNameCOMMA	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
[	TokenNameLBRACKET	
testIndex	TokenNameIdentifier	 test Index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
sGeneratedCmdLine	TokenNameIdentifier	 s Generated Cmd Line
[	TokenNameLBRACKET	
genIndex	TokenNameIdentifier	 gen Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testIndex	TokenNameIdentifier	 test Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
genIndex	TokenNameIdentifier	 gen Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
aioob	TokenNameIdentifier	 aioob
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"missing arg "	TokenNameStringLiteral	missing arg 
+	TokenNamePLUS	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
[	TokenNameLBRACKET	
testIndex	TokenNameIdentifier	 test Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Count the number of empty strings 	TokenNameCOMMENT_LINE	Count the number of empty strings 
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
genLength	TokenNameIdentifier	 gen Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sGeneratedCmdLine	TokenNameIdentifier	 s Generated Cmd Line
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cnt	TokenNameIdentifier	 cnt
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
genLength	TokenNameIdentifier	 gen Length
-	TokenNameMINUS	
cnt	TokenNameIdentifier	 cnt
>	TokenNameGREATER	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We have extra elements 	TokenNameCOMMENT_LINE	We have extra elements 
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"extra args"	TokenNameStringLiteral	extra args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
