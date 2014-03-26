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
sos	TokenNameIdentifier	 sos
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
/** * Testcase to ensure that command line generation and required attributes are * correct. * */	TokenNameCOMMENT_JAVADOC	 Testcase to ensure that command line generation and required attributes are correct. 
public	TokenNamepublic	
class	TokenNameclass	
SOSTest	TokenNameIdentifier	 SOS Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
private	TokenNameprivate	
Commandline	TokenNameIdentifier	 Commandline
commandline	TokenNameIdentifier	 commandline
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
=	TokenNameEQUAL	
"\\server\vss\srcsafe.ini"	TokenNameStringLiteral	\\server\vss\srcsafe.ini
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
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
=	TokenNameEQUAL	
"192.168.0.1:8888"	TokenNameStringLiteral	192.168.0.1:8888
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
=	TokenNameEQUAL	
"ant"	TokenNameStringLiteral	ant
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SOS_PASSWORD	TokenNameIdentifier	 SOS  PASSWORD
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
SRC_FILE	TokenNameIdentifier	 SRC  FILE
=	TokenNameEQUAL	
"Class1.java"	TokenNameStringLiteral	Class1.java
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
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
=	TokenNameEQUAL	
"I fixed a bug"	TokenNameStringLiteral	I fixed a bug
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SOS_HOME	TokenNameIdentifier	 SOS  HOME
=	TokenNameEQUAL	
"/home/user/.sos"	TokenNameStringLiteral	/home/user/.sos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VERSION	TokenNameIdentifier	 VERSION
=	TokenNameEQUAL	
"007"	TokenNameStringLiteral	007
;	TokenNameSEMICOLON	
/** * Constructor for the SOSTest object * * @param s Test name */	TokenNameCOMMENT_JAVADOC	 Constructor for the SOSTest object * @param s Test name 
public	TokenNamepublic	
SOSTest	TokenNameIdentifier	 SOS Test
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
/** Test SOSGetFile flags & commandline generation */	TokenNameCOMMENT_JAVADOC	 Test SOSGetFile flags & commandline generation 
public	TokenNamepublic	
void	TokenNamevoid	
testGetFileFlags	TokenNameIdentifier	 test Get File Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"soscmd"	TokenNameStringLiteral	soscmd
,	TokenNameCOMMA	
"-command"	TokenNameStringLiteral	-command
,	TokenNameCOMMA	
"GetFile"	TokenNameStringLiteral	GetFile
,	TokenNameCOMMA	
"-file"	TokenNameStringLiteral	-file
,	TokenNameCOMMA	
SRC_FILE	TokenNameIdentifier	 SRC  FILE
,	TokenNameCOMMA	
"-revision"	TokenNameStringLiteral	-revision
,	TokenNameCOMMA	
"007"	TokenNameStringLiteral	007
,	TokenNameCOMMA	
"-server"	TokenNameStringLiteral	-server
,	TokenNameCOMMA	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
,	TokenNameCOMMA	
"-name"	TokenNameStringLiteral	-name
,	TokenNameCOMMA	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
,	TokenNameCOMMA	
"-password"	TokenNameStringLiteral	-password
,	TokenNameCOMMA	
SOS_PASSWORD	TokenNameIdentifier	 SOS  PASSWORD
,	TokenNameCOMMA	
"-database"	TokenNameStringLiteral	-database
,	TokenNameCOMMA	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
,	TokenNameCOMMA	
"-project"	TokenNameStringLiteral	-project
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
"-verbose"	TokenNameStringLiteral	-verbose
,	TokenNameCOMMA	
"-nocompress"	TokenNameStringLiteral	-nocompress
,	TokenNameCOMMA	
"-nocache"	TokenNameStringLiteral	-nocache
,	TokenNameCOMMA	
"-workdir"	TokenNameStringLiteral	-workdir
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a SOSGet task 	TokenNameCOMMENT_LINE	Set up a SOSGet task 
SOSGet	TokenNameIdentifier	 SOS Get
sosGet	TokenNameIdentifier	 sos Get
=	TokenNameEQUAL	
new	TokenNamenew	
SOSGet	TokenNameIdentifier	 SOS Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setVssServerPath	TokenNameIdentifier	 set Vss Server Path
(	TokenNameLPAREN	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setSosServerPath	TokenNameIdentifier	 set Sos Server Path
(	TokenNameLPAREN	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setProjectPath	TokenNameIdentifier	 set Project Path
(	TokenNameLPAREN	
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
SRC_FILE	TokenNameIdentifier	 SRC  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
SOS_PASSWORD	TokenNameIdentifier	 SOS  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setLocalPath	TokenNameIdentifier	 set Local Path
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
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setNoCache	TokenNameIdentifier	 set No Cache
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setNoCompress	TokenNameIdentifier	 set No Compress
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
sosGet	TokenNameIdentifier	 sos Get
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
/** Test SOSGetProject flags & commandline generation */	TokenNameCOMMENT_JAVADOC	 Test SOSGetProject flags & commandline generation 
public	TokenNamepublic	
void	TokenNamevoid	
testGetProjectFlags	TokenNameIdentifier	 test Get Project Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"soscmd"	TokenNameStringLiteral	soscmd
,	TokenNameCOMMA	
"-command"	TokenNameStringLiteral	-command
,	TokenNameCOMMA	
"GetProject"	TokenNameStringLiteral	GetProject
,	TokenNameCOMMA	
"-recursive"	TokenNameStringLiteral	-recursive
,	TokenNameCOMMA	
"-label"	TokenNameStringLiteral	-label
,	TokenNameCOMMA	
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
,	TokenNameCOMMA	
"-server"	TokenNameStringLiteral	-server
,	TokenNameCOMMA	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
,	TokenNameCOMMA	
"-name"	TokenNameStringLiteral	-name
,	TokenNameCOMMA	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
,	TokenNameCOMMA	
"-password"	TokenNameStringLiteral	-password
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"-database"	TokenNameStringLiteral	-database
,	TokenNameCOMMA	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
,	TokenNameCOMMA	
"-project"	TokenNameStringLiteral	-project
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"-soshome"	TokenNameStringLiteral	-soshome
,	TokenNameCOMMA	
SOS_HOME	TokenNameIdentifier	 SOS  HOME
,	TokenNameCOMMA	
"-workdir"	TokenNameStringLiteral	-workdir
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a SOSGet task 	TokenNameCOMMENT_LINE	Set up a SOSGet task 
SOSGet	TokenNameIdentifier	 SOS Get
sosGet	TokenNameIdentifier	 sos Get
=	TokenNameEQUAL	
new	TokenNamenew	
SOSGet	TokenNameIdentifier	 SOS Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setVssServerPath	TokenNameIdentifier	 set Vss Server Path
(	TokenNameLPAREN	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setSosServerPath	TokenNameIdentifier	 set Sos Server Path
(	TokenNameLPAREN	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setProjectPath	TokenNameIdentifier	 set Project Path
(	TokenNameLPAREN	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setLabel	TokenNameIdentifier	 set Label
(	TokenNameLPAREN	
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setSosHome	TokenNameIdentifier	 set Sos Home
(	TokenNameLPAREN	
SOS_HOME	TokenNameIdentifier	 SOS  HOME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setNoCache	TokenNameIdentifier	 set No Cache
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setNoCompress	TokenNameIdentifier	 set No Compress
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosGet	TokenNameIdentifier	 sos Get
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
sosGet	TokenNameIdentifier	 sos Get
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
/** Tests SOSGet required attributes. */	TokenNameCOMMENT_JAVADOC	 Tests SOSGet required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetExceptions	TokenNameIdentifier	 test Get Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/sos/sos.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/sos/sos.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"sosget.1"	TokenNameStringLiteral	sosget.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"sosserverpath attribute must be set!"	TokenNameStringLiteral	sosserverpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"sosget.2"	TokenNameStringLiteral	sosget.2
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"username attribute must be set!"	TokenNameStringLiteral	username attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"sosget.3"	TokenNameStringLiteral	sosget.3
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vssserverpath attribute must be set!"	TokenNameStringLiteral	vssserverpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"sosget.4"	TokenNameStringLiteral	sosget.4
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"projectpath attribute must be set!"	TokenNameStringLiteral	projectpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test CheckInFile option flags */	TokenNameCOMMENT_JAVADOC	 Test CheckInFile option flags 
public	TokenNamepublic	
void	TokenNamevoid	
testCheckinFileFlags	TokenNameIdentifier	 test Checkin File Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"soscmd"	TokenNameStringLiteral	soscmd
,	TokenNameCOMMA	
"-command"	TokenNameStringLiteral	-command
,	TokenNameCOMMA	
"CheckInFile"	TokenNameStringLiteral	CheckInFile
,	TokenNameCOMMA	
"-file"	TokenNameStringLiteral	-file
,	TokenNameCOMMA	
SRC_FILE	TokenNameIdentifier	 SRC  FILE
,	TokenNameCOMMA	
"-server"	TokenNameStringLiteral	-server
,	TokenNameCOMMA	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
,	TokenNameCOMMA	
"-name"	TokenNameStringLiteral	-name
,	TokenNameCOMMA	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
,	TokenNameCOMMA	
"-password"	TokenNameStringLiteral	-password
,	TokenNameCOMMA	
SOS_PASSWORD	TokenNameIdentifier	 SOS  PASSWORD
,	TokenNameCOMMA	
"-database"	TokenNameStringLiteral	-database
,	TokenNameCOMMA	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
,	TokenNameCOMMA	
"-project"	TokenNameStringLiteral	-project
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
"-verbose"	TokenNameStringLiteral	-verbose
,	TokenNameCOMMA	
"-nocompress"	TokenNameStringLiteral	-nocompress
,	TokenNameCOMMA	
"-nocache"	TokenNameStringLiteral	-nocache
,	TokenNameCOMMA	
"-workdir"	TokenNameStringLiteral	-workdir
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
"-log"	TokenNameStringLiteral	-log
,	TokenNameCOMMA	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a SOSCheckin task 	TokenNameCOMMENT_LINE	Set up a SOSCheckin task 
SOSCheckin	TokenNameIdentifier	 SOS Checkin
sosCheckin	TokenNameIdentifier	 sos Checkin
=	TokenNameEQUAL	
new	TokenNamenew	
SOSCheckin	TokenNameIdentifier	 SOS Checkin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setVssServerPath	TokenNameIdentifier	 set Vss Server Path
(	TokenNameLPAREN	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setSosServerPath	TokenNameIdentifier	 set Sos Server Path
(	TokenNameLPAREN	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setProjectPath	TokenNameIdentifier	 set Project Path
(	TokenNameLPAREN	
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
SRC_FILE	TokenNameIdentifier	 SRC  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
SOS_PASSWORD	TokenNameIdentifier	 SOS  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setLocalPath	TokenNameIdentifier	 set Local Path
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
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setNoCache	TokenNameIdentifier	 set No Cache
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setNoCompress	TokenNameIdentifier	 set No Compress
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
sosCheckin	TokenNameIdentifier	 sos Checkin
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
/** Test CheckInProject option flags */	TokenNameCOMMENT_JAVADOC	 Test CheckInProject option flags 
public	TokenNamepublic	
void	TokenNamevoid	
testCheckinProjectFlags	TokenNameIdentifier	 test Checkin Project Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"soscmd"	TokenNameStringLiteral	soscmd
,	TokenNameCOMMA	
"-command"	TokenNameStringLiteral	-command
,	TokenNameCOMMA	
"CheckInProject"	TokenNameStringLiteral	CheckInProject
,	TokenNameCOMMA	
"-recursive"	TokenNameStringLiteral	-recursive
,	TokenNameCOMMA	
"-server"	TokenNameStringLiteral	-server
,	TokenNameCOMMA	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
,	TokenNameCOMMA	
"-name"	TokenNameStringLiteral	-name
,	TokenNameCOMMA	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
,	TokenNameCOMMA	
"-password"	TokenNameStringLiteral	-password
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"-database"	TokenNameStringLiteral	-database
,	TokenNameCOMMA	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
,	TokenNameCOMMA	
"-project"	TokenNameStringLiteral	-project
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"-soshome"	TokenNameStringLiteral	-soshome
,	TokenNameCOMMA	
SOS_HOME	TokenNameIdentifier	 SOS  HOME
,	TokenNameCOMMA	
"-workdir"	TokenNameStringLiteral	-workdir
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
,	TokenNameCOMMA	
"-log"	TokenNameStringLiteral	-log
,	TokenNameCOMMA	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a SOSCheckin task 	TokenNameCOMMENT_LINE	Set up a SOSCheckin task 
SOSCheckin	TokenNameIdentifier	 SOS Checkin
sosCheckin	TokenNameIdentifier	 sos Checkin
=	TokenNameEQUAL	
new	TokenNamenew	
SOSCheckin	TokenNameIdentifier	 SOS Checkin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setVssServerPath	TokenNameIdentifier	 set Vss Server Path
(	TokenNameLPAREN	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setSosServerPath	TokenNameIdentifier	 set Sos Server Path
(	TokenNameLPAREN	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setProjectPath	TokenNameIdentifier	 set Project Path
(	TokenNameLPAREN	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setSosHome	TokenNameIdentifier	 set Sos Home
(	TokenNameLPAREN	
SOS_HOME	TokenNameIdentifier	 SOS  HOME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setNoCache	TokenNameIdentifier	 set No Cache
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setNoCompress	TokenNameIdentifier	 set No Compress
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckin	TokenNameIdentifier	 sos Checkin
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
sosCheckin	TokenNameIdentifier	 sos Checkin
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
/** Test SOSCheckIn required attributes. */	TokenNameCOMMENT_JAVADOC	 Test SOSCheckIn required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testCheckinExceptions	TokenNameIdentifier	 test Checkin Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/sos/sos.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/sos/sos.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soscheckin.1"	TokenNameStringLiteral	soscheckin.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"sosserverpath attribute must be set!"	TokenNameStringLiteral	sosserverpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soscheckin.2"	TokenNameStringLiteral	soscheckin.2
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"username attribute must be set!"	TokenNameStringLiteral	username attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soscheckin.3"	TokenNameStringLiteral	soscheckin.3
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vssserverpath attribute must be set!"	TokenNameStringLiteral	vssserverpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soscheckin.4"	TokenNameStringLiteral	soscheckin.4
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"projectpath attribute must be set!"	TokenNameStringLiteral	projectpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test CheckOutFile option flags */	TokenNameCOMMENT_JAVADOC	 Test CheckOutFile option flags 
public	TokenNamepublic	
void	TokenNamevoid	
testCheckoutFileFlags	TokenNameIdentifier	 test Checkout File Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"soscmd"	TokenNameStringLiteral	soscmd
,	TokenNameCOMMA	
"-command"	TokenNameStringLiteral	-command
,	TokenNameCOMMA	
"CheckOutFile"	TokenNameStringLiteral	CheckOutFile
,	TokenNameCOMMA	
"-file"	TokenNameStringLiteral	-file
,	TokenNameCOMMA	
SRC_FILE	TokenNameIdentifier	 SRC  FILE
,	TokenNameCOMMA	
"-server"	TokenNameStringLiteral	-server
,	TokenNameCOMMA	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
,	TokenNameCOMMA	
"-name"	TokenNameStringLiteral	-name
,	TokenNameCOMMA	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
,	TokenNameCOMMA	
"-password"	TokenNameStringLiteral	-password
,	TokenNameCOMMA	
SOS_PASSWORD	TokenNameIdentifier	 SOS  PASSWORD
,	TokenNameCOMMA	
"-database"	TokenNameStringLiteral	-database
,	TokenNameCOMMA	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
,	TokenNameCOMMA	
"-project"	TokenNameStringLiteral	-project
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
"-verbose"	TokenNameStringLiteral	-verbose
,	TokenNameCOMMA	
"-nocompress"	TokenNameStringLiteral	-nocompress
,	TokenNameCOMMA	
"-nocache"	TokenNameStringLiteral	-nocache
,	TokenNameCOMMA	
"-workdir"	TokenNameStringLiteral	-workdir
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a SOSCheckout task 	TokenNameCOMMENT_LINE	Set up a SOSCheckout task 
SOSCheckout	TokenNameIdentifier	 SOS Checkout
sosCheckout	TokenNameIdentifier	 sos Checkout
=	TokenNameEQUAL	
new	TokenNamenew	
SOSCheckout	TokenNameIdentifier	 SOS Checkout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setVssServerPath	TokenNameIdentifier	 set Vss Server Path
(	TokenNameLPAREN	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setSosServerPath	TokenNameIdentifier	 set Sos Server Path
(	TokenNameLPAREN	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setProjectPath	TokenNameIdentifier	 set Project Path
(	TokenNameLPAREN	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
SRC_FILE	TokenNameIdentifier	 SRC  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
SOS_PASSWORD	TokenNameIdentifier	 SOS  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setLocalPath	TokenNameIdentifier	 set Local Path
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
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setNoCache	TokenNameIdentifier	 set No Cache
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setNoCompress	TokenNameIdentifier	 set No Compress
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
sosCheckout	TokenNameIdentifier	 sos Checkout
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
/** Test CheckOutProject option flags */	TokenNameCOMMENT_JAVADOC	 Test CheckOutProject option flags 
public	TokenNamepublic	
void	TokenNamevoid	
testCheckoutProjectFlags	TokenNameIdentifier	 test Checkout Project Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"soscmd"	TokenNameStringLiteral	soscmd
,	TokenNameCOMMA	
"-command"	TokenNameStringLiteral	-command
,	TokenNameCOMMA	
"CheckOutProject"	TokenNameStringLiteral	CheckOutProject
,	TokenNameCOMMA	
"-recursive"	TokenNameStringLiteral	-recursive
,	TokenNameCOMMA	
"-server"	TokenNameStringLiteral	-server
,	TokenNameCOMMA	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
,	TokenNameCOMMA	
"-name"	TokenNameStringLiteral	-name
,	TokenNameCOMMA	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
,	TokenNameCOMMA	
"-password"	TokenNameStringLiteral	-password
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"-database"	TokenNameStringLiteral	-database
,	TokenNameCOMMA	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
,	TokenNameCOMMA	
"-project"	TokenNameStringLiteral	-project
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"-soshome"	TokenNameStringLiteral	-soshome
,	TokenNameCOMMA	
SOS_HOME	TokenNameIdentifier	 SOS  HOME
,	TokenNameCOMMA	
"-workdir"	TokenNameStringLiteral	-workdir
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a sosCheckout task 	TokenNameCOMMENT_LINE	Set up a sosCheckout task 
SOSCheckout	TokenNameIdentifier	 SOS Checkout
sosCheckout	TokenNameIdentifier	 sos Checkout
=	TokenNameEQUAL	
new	TokenNamenew	
SOSCheckout	TokenNameIdentifier	 SOS Checkout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setVssServerPath	TokenNameIdentifier	 set Vss Server Path
(	TokenNameLPAREN	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setSosServerPath	TokenNameIdentifier	 set Sos Server Path
(	TokenNameLPAREN	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setProjectPath	TokenNameIdentifier	 set Project Path
(	TokenNameLPAREN	
VSS_PROJECT_PATH	TokenNameIdentifier	 VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setSosHome	TokenNameIdentifier	 set Sos Home
(	TokenNameLPAREN	
SOS_HOME	TokenNameIdentifier	 SOS  HOME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setNoCache	TokenNameIdentifier	 set No Cache
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setNoCompress	TokenNameIdentifier	 set No Compress
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosCheckout	TokenNameIdentifier	 sos Checkout
.	TokenNameDOT	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
sosCheckout	TokenNameIdentifier	 sos Checkout
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
/** Test SOSCheckout required attributes. */	TokenNameCOMMENT_JAVADOC	 Test SOSCheckout required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testCheckoutExceptions	TokenNameIdentifier	 test Checkout Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/sos/sos.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/sos/sos.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soscheckout.1"	TokenNameStringLiteral	soscheckout.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"sosserverpath attribute must be set!"	TokenNameStringLiteral	sosserverpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soscheckout.2"	TokenNameStringLiteral	soscheckout.2
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"username attribute must be set!"	TokenNameStringLiteral	username attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soscheckout.3"	TokenNameStringLiteral	soscheckout.3
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vssserverpath attribute must be set!"	TokenNameStringLiteral	vssserverpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soscheckout.4"	TokenNameStringLiteral	soscheckout.4
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"projectpath attribute must be set!"	TokenNameStringLiteral	projectpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test Label option flags */	TokenNameCOMMENT_JAVADOC	 Test Label option flags 
public	TokenNamepublic	
void	TokenNamevoid	
testLabelFlags	TokenNameIdentifier	 test Label Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"soscmd"	TokenNameStringLiteral	soscmd
,	TokenNameCOMMA	
"-command"	TokenNameStringLiteral	-command
,	TokenNameCOMMA	
"AddLabel"	TokenNameStringLiteral	AddLabel
,	TokenNameCOMMA	
"-server"	TokenNameStringLiteral	-server
,	TokenNameCOMMA	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
,	TokenNameCOMMA	
"-name"	TokenNameStringLiteral	-name
,	TokenNameCOMMA	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
,	TokenNameCOMMA	
"-password"	TokenNameStringLiteral	-password
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"-database"	TokenNameStringLiteral	-database
,	TokenNameCOMMA	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
,	TokenNameCOMMA	
"-project"	TokenNameStringLiteral	-project
,	TokenNameCOMMA	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
,	TokenNameCOMMA	
"-label"	TokenNameStringLiteral	-label
,	TokenNameCOMMA	
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
,	TokenNameCOMMA	
"-verbose"	TokenNameStringLiteral	-verbose
,	TokenNameCOMMA	
"-log"	TokenNameStringLiteral	-log
,	TokenNameCOMMA	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Set up a sosCheckout task 	TokenNameCOMMENT_LINE	Set up a sosCheckout task 
SOSLabel	TokenNameIdentifier	 SOS Label
sosLabel	TokenNameIdentifier	 sos Label
=	TokenNameEQUAL	
new	TokenNamenew	
SOSLabel	TokenNameIdentifier	 SOS Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosLabel	TokenNameIdentifier	 sos Label
.	TokenNameDOT	
setVssServerPath	TokenNameIdentifier	 set Vss Server Path
(	TokenNameLPAREN	
VSS_SERVER_PATH	TokenNameIdentifier	 VSS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosLabel	TokenNameIdentifier	 sos Label
.	TokenNameDOT	
setSosServerPath	TokenNameIdentifier	 set Sos Server Path
(	TokenNameLPAREN	
SOS_SERVER_PATH	TokenNameIdentifier	 SOS  SERVER  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosLabel	TokenNameIdentifier	 sos Label
.	TokenNameDOT	
setProjectPath	TokenNameIdentifier	 set Project Path
(	TokenNameLPAREN	
DS_VSS_PROJECT_PATH	TokenNameIdentifier	 DS  VSS  PROJECT  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosLabel	TokenNameIdentifier	 sos Label
.	TokenNameDOT	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
SOS_USERNAME	TokenNameIdentifier	 SOS  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosLabel	TokenNameIdentifier	 sos Label
.	TokenNameDOT	
setSosHome	TokenNameIdentifier	 set Sos Home
(	TokenNameLPAREN	
SOS_HOME	TokenNameIdentifier	 SOS  HOME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosLabel	TokenNameIdentifier	 sos Label
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
SRC_COMMENT	TokenNameIdentifier	 SRC  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosLabel	TokenNameIdentifier	 sos Label
.	TokenNameDOT	
setLabel	TokenNameIdentifier	 set Label
(	TokenNameLPAREN	
SRC_LABEL	TokenNameIdentifier	 SRC  LABEL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosLabel	TokenNameIdentifier	 sos Label
.	TokenNameDOT	
setNoCache	TokenNameIdentifier	 set No Cache
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosLabel	TokenNameIdentifier	 sos Label
.	TokenNameDOT	
setNoCompress	TokenNameIdentifier	 set No Compress
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sosLabel	TokenNameIdentifier	 sos Label
.	TokenNameDOT	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
sosLabel	TokenNameIdentifier	 sos Label
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
/** Test SOSLabel required attributes. */	TokenNameCOMMENT_JAVADOC	 Test SOSLabel required attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
testLabelExceptions	TokenNameIdentifier	 test Label Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/sos/sos.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/sos/sos.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soslabel.1"	TokenNameStringLiteral	soslabel.1
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"sosserverpath attribute must be set!"	TokenNameStringLiteral	sosserverpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soslabel.2"	TokenNameStringLiteral	soslabel.2
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"username attribute must be set!"	TokenNameStringLiteral	username attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soslabel.3"	TokenNameStringLiteral	soslabel.3
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"vssserverpath attribute must be set!"	TokenNameStringLiteral	vssserverpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soslabel.4"	TokenNameStringLiteral	soslabel.4
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"projectpath attribute must be set!"	TokenNameStringLiteral	projectpath attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"soslabel.5"	TokenNameStringLiteral	soslabel.5
,	TokenNameCOMMA	
"some cause"	TokenNameStringLiteral	some cause
,	TokenNameCOMMA	
"label attribute must be set!"	TokenNameStringLiteral	label attribute must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Iterate through the generated command line comparing it to reference * one. * * @param sTestCmdLine The reference command line; * @param sGeneratedCmdLine The generated command line; */	TokenNameCOMMENT_JAVADOC	 Iterate through the generated command line comparing it to reference one. * @param sTestCmdLine The reference command line; @param sGeneratedCmdLine The generated command line; 
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
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"arg # "	TokenNameStringLiteral	arg # 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sTestCmdLine	TokenNameIdentifier	 s Test Cmd Line
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
sGeneratedCmdLine	TokenNameIdentifier	 s Generated Cmd Line
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
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
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sGeneratedCmdLine	TokenNameIdentifier	 s Generated Cmd Line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
