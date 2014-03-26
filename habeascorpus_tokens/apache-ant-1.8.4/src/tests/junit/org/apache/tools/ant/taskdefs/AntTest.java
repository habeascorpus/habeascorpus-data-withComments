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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
InputHandler	TokenNameIdentifier	 Input Handler
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
PropertyFileInputHandler	TokenNameIdentifier	 Property File Input Handler
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
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
AntTest	TokenNameIdentifier	 Ant Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
AntTest	TokenNameIdentifier	 Ant Test
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
"src/etc/testcases/taskdefs/ant.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/ant.xml
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
"recursive call"	TokenNameStringLiteral	recursive call
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// target must be specified 	TokenNameCOMMENT_LINE	target must be specified 
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
// Should fail since a recursion will occur... 	TokenNameCOMMENT_LINE	Should fail since a recursion will occur... 
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"recursive call"	TokenNameStringLiteral	recursive call
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
,	TokenNameCOMMA	
"target attribute must not be empty"	TokenNameStringLiteral	target attribute must not be empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test4b	TokenNameIdentifier	 test4b
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test4b"	TokenNameStringLiteral	test4b
,	TokenNameCOMMA	
"target doesn't exist"	TokenNameStringLiteral	target doesn't exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test6	TokenNameIdentifier	 test6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test6"	TokenNameStringLiteral	test6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExplicitBasedir1	TokenNameIdentifier	 test Explicit Basedir1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
".."	TokenNameStringLiteral	..
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testBaseDirs	TokenNameIdentifier	 test Base Dirs
(	TokenNameLPAREN	
"explicitBasedir1"	TokenNameStringLiteral	explicitBasedir1
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
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExplicitBasedir2	TokenNameIdentifier	 test Explicit Basedir2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
".."	TokenNameStringLiteral	..
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testBaseDirs	TokenNameIdentifier	 test Base Dirs
(	TokenNameLPAREN	
"explicitBasedir2"	TokenNameStringLiteral	explicitBasedir2
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
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInheritBasedir	TokenNameIdentifier	 test Inherit Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
basedir	TokenNameIdentifier	 basedir
=	TokenNameEQUAL	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testBaseDirs	TokenNameIdentifier	 test Base Dirs
(	TokenNameLPAREN	
"inheritBasedir"	TokenNameStringLiteral	inheritBasedir
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDoNotInheritBasedir	TokenNameIdentifier	 test Do Not Inherit Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"ant"	TokenNameStringLiteral	ant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testBaseDirs	TokenNameIdentifier	 test Base Dirs
(	TokenNameLPAREN	
"doNotInheritBasedir"	TokenNameStringLiteral	doNotInheritBasedir
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
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasedirTripleCall	TokenNameIdentifier	 test Basedir Triple Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"ant"	TokenNameStringLiteral	ant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testBaseDirs	TokenNameIdentifier	 test Base Dirs
(	TokenNameLPAREN	
"tripleCall"	TokenNameStringLiteral	tripleCall
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
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
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
BasedirChecker	TokenNameIdentifier	 Basedir Checker
bc	TokenNameIdentifier	 bc
=	TokenNameEQUAL	
new	TokenNamenew	
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
public	TokenNamepublic	
void	TokenNamevoid	
testReferenceInheritance	TokenNameIdentifier	 test Reference Inheritance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
Path	TokenNameIdentifier	 Path
.	TokenNameDOT	
systemClasspath	TokenNameIdentifier	 system Classpath
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"path"	TokenNameStringLiteral	path
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"no-override"	TokenNameStringLiteral	no-override
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
"testInherit"	TokenNameStringLiteral	testInherit
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"path"	TokenNameStringLiteral	path
,	TokenNameCOMMA	
"path"	TokenNameStringLiteral	path
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
"testInherit"	TokenNameStringLiteral	testInherit
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"no-override"	TokenNameStringLiteral	no-override
,	TokenNameCOMMA	
"no-override"	TokenNameStringLiteral	no-override
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
"testInherit"	TokenNameStringLiteral	testInherit
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"no-override"	TokenNameStringLiteral	no-override
,	TokenNameCOMMA	
"no-override"	TokenNameStringLiteral	no-override
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReferenceNoInheritance	TokenNameIdentifier	 test Reference No Inheritance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
Path	TokenNameIdentifier	 Path
.	TokenNameDOT	
systemClasspath	TokenNameIdentifier	 system Classpath
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"path"	TokenNameStringLiteral	path
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"no-override"	TokenNameStringLiteral	no-override
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
"testNoInherit"	TokenNameStringLiteral	testNoInherit
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"path"	TokenNameStringLiteral	path
,	TokenNameCOMMA	
"path"	TokenNameStringLiteral	path
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
"testNoInherit"	TokenNameStringLiteral	testNoInherit
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"path"	TokenNameStringLiteral	path
,	TokenNameCOMMA	
"path"	TokenNameStringLiteral	path
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
"testInherit"	TokenNameStringLiteral	testInherit
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"no-override"	TokenNameStringLiteral	no-override
,	TokenNameCOMMA	
"no-override"	TokenNameStringLiteral	no-override
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
"testInherit"	TokenNameStringLiteral	testInherit
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"no-override"	TokenNameStringLiteral	no-override
,	TokenNameCOMMA	
"no-override"	TokenNameStringLiteral	no-override
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReferenceRename	TokenNameIdentifier	 test Reference Rename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
Path	TokenNameIdentifier	 Path
.	TokenNameDOT	
systemClasspath	TokenNameIdentifier	 system Classpath
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"path"	TokenNameStringLiteral	path
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
"testRename"	TokenNameStringLiteral	testRename
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"path"	TokenNameStringLiteral	path
,	TokenNameCOMMA	
"path"	TokenNameStringLiteral	path
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
"testRename"	TokenNameStringLiteral	testRename
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"path"	TokenNameStringLiteral	path
,	TokenNameCOMMA	
"path"	TokenNameStringLiteral	path
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
"testRename"	TokenNameStringLiteral	testRename
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"newpath"	TokenNameStringLiteral	newpath
,	TokenNameCOMMA	
"newpath"	TokenNameStringLiteral	newpath
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInheritPath	TokenNameIdentifier	 test Inherit Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testInheritPath"	TokenNameStringLiteral	testInheritPath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
testReference	TokenNameIdentifier	 test Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expect	TokenNameIdentifier	 expect
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ReferenceChecker	TokenNameIdentifier	 Reference Checker
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
new	TokenNamenew	
ReferenceChecker	TokenNameIdentifier	 Reference Checker
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
expect	TokenNameIdentifier	 expect
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
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
rc	TokenNameIdentifier	 rc
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
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLogfilePlacement	TokenNameIdentifier	 test Logfile Placement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
logFiles	TokenNameIdentifier	 log Files
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"test1.log"	TokenNameStringLiteral	test1.log
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"test2.log"	TokenNameStringLiteral	test2.log
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"ant/test3.log"	TokenNameStringLiteral	ant/test3.log
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"ant/test4.log"	TokenNameStringLiteral	ant/test4.log
)	TokenNameRPAREN	
}	TokenNameRBRACE	
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
logFiles	TokenNameIdentifier	 log Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
logFiles	TokenNameIdentifier	 log Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't exist"	TokenNameStringLiteral	 doesn't exist
,	TokenNameCOMMA	
!	TokenNameNOT	
logFiles	TokenNameIdentifier	 log Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testLogfilePlacement"	TokenNameStringLiteral	testLogfilePlacement
)	TokenNameRPAREN	
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
logFiles	TokenNameIdentifier	 log Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
logFiles	TokenNameIdentifier	 log Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" exists"	TokenNameStringLiteral	 exists
,	TokenNameCOMMA	
logFiles	TokenNameIdentifier	 log Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInputHandlerInheritance	TokenNameIdentifier	 test Input Handler Inheritance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InputHandler	TokenNameIdentifier	 Input Handler
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyFileInputHandler	TokenNameIdentifier	 Property File Input Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setInputHandler	TokenNameIdentifier	 set Input Handler
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputHandlerChecker	TokenNameIdentifier	 Input Handler Checker
ic	TokenNameIdentifier	 ic
=	TokenNameEQUAL	
new	TokenNamenew	
InputHandlerChecker	TokenNameIdentifier	 Input Handler Checker
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
ic	TokenNameIdentifier	 ic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"tripleCall"	TokenNameStringLiteral	tripleCall
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
ic	TokenNameIdentifier	 ic
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
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeBuildListener	TokenNameIdentifier	 remove Build Listener
(	TokenNameLPAREN	
ic	TokenNameIdentifier	 ic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRefId	TokenNameIdentifier	 test Ref Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
testPath	TokenNameIdentifier	 test Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testPath	TokenNameIdentifier	 test Path
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.class.path"	TokenNameStringLiteral	java.class.path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyChecker	TokenNameIdentifier	 Property Checker
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyChecker	TokenNameIdentifier	 Property Checker
(	TokenNameLPAREN	
"testprop"	TokenNameStringLiteral	testprop
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
testPath	TokenNameIdentifier	 test Path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testRefid"	TokenNameStringLiteral	testRefid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
pc	TokenNameIdentifier	 pc
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
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUserPropertyWinsInheritAll	TokenNameIdentifier	 test User Property Wins Inherit All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"7"	TokenNameStringLiteral	7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"test-property-override-inheritall-start"	TokenNameStringLiteral	test-property-override-inheritall-start
,	TokenNameCOMMA	
"The value of test is 7"	TokenNameStringLiteral	The value of test is 7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUserPropertyWinsNoInheritAll	TokenNameIdentifier	 test User Property Wins No Inherit All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"7"	TokenNameStringLiteral	7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"test-property-override-no-inheritall-start"	TokenNameStringLiteral	test-property-override-no-inheritall-start
,	TokenNameCOMMA	
"The value of test is 7"	TokenNameStringLiteral	The value of test is 7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOverrideWinsInheritAll	TokenNameIdentifier	 test Override Wins Inherit All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"test-property-override-inheritall-start"	TokenNameStringLiteral	test-property-override-inheritall-start
,	TokenNameCOMMA	
"The value of test is 4"	TokenNameStringLiteral	The value of test is 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOverrideWinsNoInheritAll	TokenNameIdentifier	 test Override Wins No Inherit All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"test-property-override-no-inheritall-start"	TokenNameStringLiteral	test-property-override-no-inheritall-start
,	TokenNameCOMMA	
"The value of test is 4"	TokenNameStringLiteral	The value of test is 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPropertySet	TokenNameIdentifier	 test Property Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test-propertyset"	TokenNameStringLiteral	test-propertyset
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
"test1 is ${test1}"	TokenNameStringLiteral	test1 is ${test1}
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
"test2 is ${test2}"	TokenNameStringLiteral	test2 is ${test2}
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
"test1.x is 1"	TokenNameStringLiteral	test1.x is 1
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInfiniteLoopViaDepends	TokenNameIdentifier	 test Infinite Loop Via Depends
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"infinite-loop-via-depends"	TokenNameStringLiteral	infinite-loop-via-depends
,	TokenNameCOMMA	
"recursive call"	TokenNameStringLiteral	recursive call
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultiSameProperty	TokenNameIdentifier	 test Multi Same Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"multi-same-property"	TokenNameStringLiteral	multi-same-property
,	TokenNameCOMMA	
"prop is two"	TokenNameStringLiteral	prop is two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTopLevelTarget	TokenNameIdentifier	 test Top Level Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"topleveltarget"	TokenNameStringLiteral	topleveltarget
,	TokenNameCOMMA	
"Hello world"	TokenNameStringLiteral	Hello world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultiplePropertyFileChildren	TokenNameIdentifier	 test Multiple Property File Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyChecker	TokenNameIdentifier	 Property Checker
pcBar	TokenNameIdentifier	 pc Bar
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyChecker	TokenNameIdentifier	 Property Checker
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
"Bar"	TokenNameStringLiteral	Bar
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyChecker	TokenNameIdentifier	 Property Checker
pcFoo	TokenNameIdentifier	 pc Foo
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyChecker	TokenNameIdentifier	 Property Checker
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
"Foo"	TokenNameStringLiteral	Foo
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
pcBar	TokenNameIdentifier	 pc Bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
pcFoo	TokenNameIdentifier	 pc Foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"multiple-property-file-children"	TokenNameStringLiteral	multiple-property-file-children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
aeBar	TokenNameIdentifier	 ae Bar
=	TokenNameEQUAL	
pcBar	TokenNameIdentifier	 pc Bar
.	TokenNameDOT	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aeBar	TokenNameIdentifier	 ae Bar
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
aeBar	TokenNameIdentifier	 ae Bar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
aeFoo	TokenNameIdentifier	 ae Foo
=	TokenNameEQUAL	
pcFoo	TokenNameIdentifier	 pc Foo
.	TokenNameDOT	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aeFoo	TokenNameIdentifier	 ae Foo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
aeFoo	TokenNameIdentifier	 ae Foo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
removeBuildListener	TokenNameIdentifier	 remove Build Listener
(	TokenNameLPAREN	
pcBar	TokenNameIdentifier	 pc Bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
removeBuildListener	TokenNameIdentifier	 remove Build Listener
(	TokenNameLPAREN	
pcFoo	TokenNameIdentifier	 pc Foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBlankTarget	TokenNameIdentifier	 test Blank Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"blank-target"	TokenNameStringLiteral	blank-target
,	TokenNameCOMMA	
"target name must not be empty"	TokenNameStringLiteral	target name must not be empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultipleTargets	TokenNameIdentifier	 test Multiple Targets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"multiple-targets"	TokenNameStringLiteral	multiple-targets
,	TokenNameCOMMA	
"tadadctbdbtc"	TokenNameStringLiteral	tadadctbdbtc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultipleTargets2	TokenNameIdentifier	 test Multiple Targets2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"multiple-targets-2"	TokenNameStringLiteral	multiple-targets-2
,	TokenNameCOMMA	
"dadctb"	TokenNameStringLiteral	dadctb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAntCoreLib	TokenNameIdentifier	 test Ant Core Lib
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Cf. #42263 	TokenNameCOMMENT_LINE	Cf. #42263 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"sub-show-ant.core.lib"	TokenNameStringLiteral	sub-show-ant.core.lib
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
realLog	TokenNameIdentifier	 real Log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"found ant.core.lib in: "	TokenNameStringLiteral	found ant.core.lib in: 
+	TokenNamePLUS	
realLog	TokenNameIdentifier	 real Log
,	TokenNameCOMMA	
realLog	TokenNameIdentifier	 real Log
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
".*(ant[.]jar|build.classes).*"	TokenNameStringLiteral	.*(ant[.]jar|build.classes).*
)	TokenNameRPAREN	
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
private	TokenNameprivate	
class	TokenNameclass	
ReferenceChecker	TokenNameIdentifier	 Reference Checker
implements	TokenNameimplements	
BuildListener	TokenNameIdentifier	 Build Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectSame	TokenNameIdentifier	 expect Same
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
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
ReferenceChecker	TokenNameIdentifier	 Reference Checker
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectSame	TokenNameIdentifier	 expect Same
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
expectSame	TokenNameIdentifier	 expect Same
=	TokenNameEQUAL	
expectSame	TokenNameIdentifier	 expect Same
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
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
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Call "	TokenNameStringLiteral	Call 
+	TokenNamePLUS	
calls	TokenNameIdentifier	 calls
+	TokenNamePLUS	
" refid='"	TokenNameStringLiteral	 refid='
+	TokenNamePLUS	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
calls	TokenNameIdentifier	 calls
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
calls	TokenNameIdentifier	 calls
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectSame	TokenNameIdentifier	 expect Same
[	TokenNameLBRACKET	
calls	TokenNameIdentifier	 calls
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// a rather convoluted equals() test 	TokenNameCOMMENT_LINE	a rather convoluted equals() test 
Path	TokenNameIdentifier	 Path
expect	TokenNameIdentifier	 expect
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
received	TokenNameIdentifier	 received
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
calls	TokenNameIdentifier	 calls
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
shouldBeEqual	TokenNameIdentifier	 should Be Equal
=	TokenNameEQUAL	
expectSame	TokenNameIdentifier	 expect Same
[	TokenNameLBRACKET	
calls	TokenNameIdentifier	 calls
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
received	TokenNameIdentifier	 received
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
!	TokenNameNOT	
shouldBeEqual	TokenNameIdentifier	 should Be Equal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
l1	TokenNameIdentifier	 l1
=	TokenNameEQUAL	
expect	TokenNameIdentifier	 expect
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
l2	TokenNameIdentifier	 l2
=	TokenNameEQUAL	
received	TokenNameIdentifier	 received
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l1	TokenNameIdentifier	 l1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
l2	TokenNameIdentifier	 l2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
l1	TokenNameIdentifier	 l1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
l1	TokenNameIdentifier	 l1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
l2	TokenNameIdentifier	 l2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
!	TokenNameNOT	
shouldBeEqual	TokenNameIdentifier	 should Be Equal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
shouldBeEqual	TokenNameIdentifier	 should Be Equal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
!	TokenNameNOT	
shouldBeEqual	TokenNameIdentifier	 should Be Equal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
private	TokenNameprivate	
class	TokenNameclass	
InputHandlerChecker	TokenNameIdentifier	 Input Handler Checker
implements	TokenNameimplements	
BuildListener	TokenNameIdentifier	 Build Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
InputHandler	TokenNameIdentifier	 Input Handler
ih	TokenNameIdentifier	 ih
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
InputHandlerChecker	TokenNameIdentifier	 Input Handler Checker
(	TokenNameLPAREN	
InputHandler	TokenNameIdentifier	 Input Handler
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
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
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
targetFinished	TokenNameIdentifier	 target Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
taskFinished	TokenNameIdentifier	 task Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getInputHandler	TokenNameIdentifier	 get Input Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getInputHandler	TokenNameIdentifier	 get Input Handler
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
private	TokenNameprivate	
class	TokenNameclass	
PropertyChecker	TokenNameIdentifier	 Property Checker
implements	TokenNameimplements	
BuildListener	TokenNameIdentifier	 Build Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedValues	TokenNameIdentifier	 expected Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
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
PropertyChecker	TokenNameIdentifier	 Property Checker
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
expectedValues	TokenNameIdentifier	 expected Values
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
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
calls	TokenNameIdentifier	 calls
>=	TokenNameGREATER_EQUAL	
expectedValues	TokenNameIdentifier	 expected Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
new	TokenNamenew	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
(	TokenNameLPAREN	
"Unexpected invocation of"	TokenNameStringLiteral	Unexpected invocation of
+	TokenNamePLUS	
" target "	TokenNameStringLiteral	 target 
+	TokenNamePLUS	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
expectedValues	TokenNameIdentifier	 expected Values
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
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
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
