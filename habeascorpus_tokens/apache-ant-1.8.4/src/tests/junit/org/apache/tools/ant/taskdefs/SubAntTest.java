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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
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
BuildEvent	TokenNameIdentifier	 Build Event
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
BuildListener	TokenNameIdentifier	 Build Listener
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SubAntTest	TokenNameIdentifier	 Sub Ant Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
SubAntTest	TokenNameIdentifier	 Sub Ant Test
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
"src/etc/testcases/taskdefs/subant.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/subant.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testnodirs	TokenNameIdentifier	 testnodirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testnodirs"	TokenNameStringLiteral	testnodirs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"testnodirs"	TokenNameStringLiteral	testnodirs
,	TokenNameCOMMA	
"No sub-builds to iterate on"	TokenNameStringLiteral	No sub-builds to iterate on
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// target must be specified 	TokenNameCOMMENT_LINE	target must be specified 
public	TokenNamepublic	
void	TokenNamevoid	
testgenericantfile	TokenNameIdentifier	 testgenericantfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"subant/subant-test1"	TokenNameStringLiteral	subant/subant-test1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir3	TokenNameIdentifier	 dir3
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"subant/subant-test2"	TokenNameStringLiteral	subant/subant-test2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testBaseDirs	TokenNameIdentifier	 test Base Dirs
(	TokenNameLPAREN	
"testgenericantfile"	TokenNameStringLiteral	testgenericantfile
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dir3	TokenNameIdentifier	 dir3
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testantfile	TokenNameIdentifier	 testantfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// basedir of subant/subant-test1/subant.xml is .. 	TokenNameCOMMENT_LINE	basedir of subant/subant-test1/subant.xml is .. 
// therefore we expect here the subant/subant-test1 subdirectory 	TokenNameCOMMENT_LINE	therefore we expect here the subant/subant-test1 subdirectory 
File	TokenNameIdentifier	 File
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"subant/subant-test1"	TokenNameStringLiteral	subant/subant-test1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// basedir of subant/subant-test2/subant.xml is .. 	TokenNameCOMMENT_LINE	basedir of subant/subant-test2/subant.xml is .. 
// therefore we expect here the subant subdirectory 	TokenNameCOMMENT_LINE	therefore we expect here the subant subdirectory 
File	TokenNameIdentifier	 File
dir3	TokenNameIdentifier	 dir3
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"subant"	TokenNameStringLiteral	subant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testBaseDirs	TokenNameIdentifier	 test Base Dirs
(	TokenNameLPAREN	
"testantfile"	TokenNameStringLiteral	testantfile
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dir3	TokenNameIdentifier	 dir3
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultipleTargets	TokenNameIdentifier	 test Multiple Targets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"multipleTargets"	TokenNameStringLiteral	multipleTargets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
"test1-one"	TokenNameStringLiteral	test1-one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
"test1-two"	TokenNameStringLiteral	test1-two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
"test2-one"	TokenNameStringLiteral	test2-one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
"test2-two"	TokenNameStringLiteral	test2-two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultipleTargetsOneDoesntExist_FOEfalse	TokenNameIdentifier	 test Multiple Targets One Doesnt Exist  FO Efalse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"multipleTargetsOneDoesntExist_FOEfalse"	TokenNameStringLiteral	multipleTargetsOneDoesntExist_FOEfalse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
"Target "three" does not exist in the project "subant""	TokenNameStringLiteral	Target "three" does not exist in the project "subant"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultipleTargetsOneDoesntExist_FOEtrue	TokenNameIdentifier	 test Multiple Targets One Doesnt Exist  FO Etrue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"multipleTargetsOneDoesntExist_FOEtrue"	TokenNameStringLiteral	multipleTargetsOneDoesntExist_FOEtrue
,	TokenNameCOMMA	
"Calling not existent target"	TokenNameStringLiteral	Calling not existent target
,	TokenNameCOMMA	
"Target "three" does not exist in the project "subant""	TokenNameStringLiteral	Target "three" does not exist in the project "subant"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
testBaseDirs	TokenNameIdentifier	 test Base Dirs
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dirs	TokenNameIdentifier	 dirs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SubAntTest	TokenNameIdentifier	 Sub Ant Test
.	TokenNameDOT	
BasedirChecker	TokenNameIdentifier	 Basedir Checker
bc	TokenNameIdentifier	 bc
=	TokenNameEQUAL	
new	TokenNamenew	
SubAntTest	TokenNameIdentifier	 Sub Ant Test
.	TokenNameDOT	
BasedirChecker	TokenNameIdentifier	 Basedir Checker
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
bc	TokenNameIdentifier	 bc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
bc	TokenNameIdentifier	 bc
.	TokenNameDOT	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ae	TokenNameIdentifier	 ae
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ae	TokenNameIdentifier	 ae
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
removeBuildListener	TokenNameIdentifier	 remove Build Listener
(	TokenNameLPAREN	
bc	TokenNameIdentifier	 bc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
BasedirChecker	TokenNameIdentifier	 Basedir Checker
implements	TokenNameimplements	
BuildListener	TokenNameIdentifier	 Build Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedBasedirs	TokenNameIdentifier	 expected Basedirs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
calls	TokenNameIdentifier	 calls
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
BasedirChecker	TokenNameIdentifier	 Basedir Checker
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dirs	TokenNameIdentifier	 dirs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedBasedirs	TokenNameIdentifier	 expected Basedirs
=	TokenNameEQUAL	
dirs	TokenNameIdentifier	 dirs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildStarted	TokenNameIdentifier	 build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
targetFinished	TokenNameIdentifier	 target Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
taskFinished	TokenNameIdentifier	 task Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedBasedirs	TokenNameIdentifier	 expected Basedirs
[	TokenNameLBRACKET	
calls	TokenNameIdentifier	 calls
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
