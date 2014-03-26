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
types	TokenNameIdentifier	 types
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
/** * Some tests for filelist. */	TokenNameCOMMENT_JAVADOC	 Some tests for filelist. 
public	TokenNamepublic	
class	TokenNameclass	
FileListTest	TokenNameIdentifier	 File List Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
FileListTest	TokenNameIdentifier	 File List Test
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
"src/etc/testcases/types/filelist.xml"	TokenNameStringLiteral	src/etc/testcases/types/filelist.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyElementIfIsReference	TokenNameIdentifier	 test Empty Element If Is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileList	TokenNameIdentifier	 File List
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
FileList	TokenNameIdentifier	 File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"dummyref"	TokenNameStringLiteral	dummyref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add reference to FileList with directory attribute set."	TokenNameStringLiteral	Can add reference to FileList with directory attribute set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify more than one attribute when using refid"	TokenNameStringLiteral	You must not specify more than one attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
FileList	TokenNameIdentifier	 File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setFiles	TokenNameIdentifier	 set Files
(	TokenNameLPAREN	
"foo.xml,c/d/bar.xml"	TokenNameStringLiteral	foo.xml,c/d/bar.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"dummyref"	TokenNameStringLiteral	dummyref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add reference to FileList with file attribute set."	TokenNameStringLiteral	Can add reference to FileList with file attribute set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify more than one attribute when using refid"	TokenNameStringLiteral	You must not specify more than one attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
FileList	TokenNameIdentifier	 File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"dummyref"	TokenNameStringLiteral	dummyref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setFiles	TokenNameIdentifier	 set Files
(	TokenNameLPAREN	
"a/b/foo.java"	TokenNameStringLiteral	a/b/foo.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can set files in FileList that is a reference."	TokenNameStringLiteral	Can set files in FileList that is a reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify more than one attribute when using refid"	TokenNameStringLiteral	You must not specify more than one attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can set dir in FileList that is a reference."	TokenNameStringLiteral	Can set dir in FileList that is a reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify more than one attribute when using refid"	TokenNameStringLiteral	You must not specify more than one attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCircularReferenceCheck	TokenNameIdentifier	 test Circular Reference Check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileList	TokenNameIdentifier	 File List
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
FileList	TokenNameIdentifier	 File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"dummy"	TokenNameStringLiteral	dummy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make FileList a Reference to itself."	TokenNameStringLiteral	Can make FileList a Reference to itself.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"This data type contains a circular reference."	TokenNameStringLiteral	This data type contains a circular reference.
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make FileList a Reference to itself."	TokenNameStringLiteral	Can make FileList a Reference to itself.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"This data type contains a circular reference."	TokenNameStringLiteral	This data type contains a circular reference.
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// dummy1 --> dummy2 --> dummy3 --> dummy1 	TokenNameCOMMENT_LINE	dummy1 --> dummy2 --> dummy3 --> dummy1 
FileList	TokenNameIdentifier	 File List
f1	TokenNameIdentifier	 f1
=	TokenNameEQUAL	
new	TokenNamenew	
FileList	TokenNameIdentifier	 File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy1"	TokenNameStringLiteral	dummy1
,	TokenNameCOMMA	
f1	TokenNameIdentifier	 f1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f1	TokenNameIdentifier	 f1
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"dummy2"	TokenNameStringLiteral	dummy2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileList	TokenNameIdentifier	 File List
f2	TokenNameIdentifier	 f2
=	TokenNameEQUAL	
new	TokenNamenew	
FileList	TokenNameIdentifier	 File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy2"	TokenNameStringLiteral	dummy2
,	TokenNameCOMMA	
f2	TokenNameIdentifier	 f2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f2	TokenNameIdentifier	 f2
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"dummy3"	TokenNameStringLiteral	dummy3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileList	TokenNameIdentifier	 File List
f3	TokenNameIdentifier	 f3
=	TokenNameEQUAL	
new	TokenNamenew	
FileList	TokenNameIdentifier	 File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy3"	TokenNameStringLiteral	dummy3
,	TokenNameCOMMA	
f3	TokenNameIdentifier	 f3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f3	TokenNameIdentifier	 f3
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"dummy1"	TokenNameStringLiteral	dummy1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f1	TokenNameIdentifier	 f1
.	TokenNameDOT	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make circular reference."	TokenNameStringLiteral	Can make circular reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"This data type contains a circular reference."	TokenNameStringLiteral	This data type contains a circular reference.
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
f1	TokenNameIdentifier	 f1
.	TokenNameDOT	
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make circular reference."	TokenNameStringLiteral	Can make circular reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"This data type contains a circular reference."	TokenNameStringLiteral	This data type contains a circular reference.
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// dummy1 --> dummy2 --> dummy3 	TokenNameCOMMENT_LINE	dummy1 --> dummy2 --> dummy3 
// (which has the Project's basedir as root). 	TokenNameCOMMENT_LINE	(which has the Project's basedir as root). 
f1	TokenNameIdentifier	 f1
=	TokenNameEQUAL	
new	TokenNamenew	
FileList	TokenNameIdentifier	 File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy1"	TokenNameStringLiteral	dummy1
,	TokenNameCOMMA	
f1	TokenNameIdentifier	 f1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f1	TokenNameIdentifier	 f1
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"dummy2"	TokenNameStringLiteral	dummy2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f2	TokenNameIdentifier	 f2
=	TokenNameEQUAL	
new	TokenNamenew	
FileList	TokenNameIdentifier	 File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy2"	TokenNameStringLiteral	dummy2
,	TokenNameCOMMA	
f2	TokenNameIdentifier	 f2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f2	TokenNameIdentifier	 f2
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"dummy3"	TokenNameStringLiteral	dummy3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f3	TokenNameIdentifier	 f3
=	TokenNameEQUAL	
new	TokenNamenew	
FileList	TokenNameIdentifier	 File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy3"	TokenNameStringLiteral	dummy3
,	TokenNameCOMMA	
f3	TokenNameIdentifier	 f3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f3	TokenNameIdentifier	 f3
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
f1	TokenNameIdentifier	 f1
.	TokenNameDOT	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Dir is basedir"	TokenNameStringLiteral	Dir is basedir
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimple	TokenNameIdentifier	 test Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"simple"	TokenNameStringLiteral	simple
,	TokenNameCOMMA	
"/abc/a"	TokenNameStringLiteral	/abc/a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDouble	TokenNameIdentifier	 test Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"double"	TokenNameStringLiteral	double
,	TokenNameCOMMA	
"/abc/a:/abc/b"	TokenNameStringLiteral	/abc/a:/abc/b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNested	TokenNameIdentifier	 test Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"nested"	TokenNameStringLiteral	nested
,	TokenNameCOMMA	
"/abc/a:/abc/b"	TokenNameStringLiteral	/abc/a:/abc/b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
