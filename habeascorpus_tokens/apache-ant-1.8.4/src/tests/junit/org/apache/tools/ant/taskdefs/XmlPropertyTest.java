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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileFilter	TokenNameIdentifier	 File Filter
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
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Path	TokenNameIdentifier	 Path
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
XmlPropertyTest	TokenNameIdentifier	 Xml Property Test
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
XmlPropertyTest	TokenNameIdentifier	 Xml Property Test
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
"src/etc/testcases/taskdefs/xmlproperty.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/xmlproperty.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFile	TokenNameIdentifier	 test File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testProperties	TokenNameIdentifier	 test Properties
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResource	TokenNameIdentifier	 test Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testProperties	TokenNameIdentifier	 test Properties
(	TokenNameLPAREN	
"testResource"	TokenNameStringLiteral	testResource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testProperties	TokenNameIdentifier	 test Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root-tag(myattr)"	TokenNameStringLiteral	root-tag(myattr)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Text"	TokenNameStringLiteral	Text
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root-tag.inner-tag"	TokenNameStringLiteral	root-tag.inner-tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"val"	TokenNameStringLiteral	val
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root-tag.inner-tag(someattr)"	TokenNameStringLiteral	root-tag.inner-tag(someattr)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"false"	TokenNameStringLiteral	false
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root-tag.a2.a3.a4"	TokenNameStringLiteral	root-tag.a2.a3.a4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"CDATA failed"	TokenNameStringLiteral	CDATA failed
,	TokenNameCOMMA	
"<test>"	TokenNameStringLiteral	<test>
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root-tag.cdatatag"	TokenNameStringLiteral	root-tag.cdatatag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDTD	TokenNameIdentifier	 test DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testdtd"	TokenNameStringLiteral	testdtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Text"	TokenNameStringLiteral	Text
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root-tag.inner-tag"	TokenNameStringLiteral	root-tag.inner-tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNone	TokenNameIdentifier	 test None
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testNone"	TokenNameStringLiteral	testNone
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testKeeproot	TokenNameIdentifier	 test Keeproot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testKeeproot"	TokenNameStringLiteral	testKeeproot
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCollapse	TokenNameIdentifier	 test Collapse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testCollapse"	TokenNameStringLiteral	testCollapse
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSemantic	TokenNameIdentifier	 test Semantic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testSemantic"	TokenNameStringLiteral	testSemantic
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testKeeprootCollapse	TokenNameIdentifier	 test Keeproot Collapse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testKeeprootCollapse"	TokenNameStringLiteral	testKeeprootCollapse
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testKeeprootSemantic	TokenNameIdentifier	 test Keeproot Semantic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testKeeprootSemantic"	TokenNameStringLiteral	testKeeprootSemantic
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCollapseSemantic	TokenNameIdentifier	 test Collapse Semantic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testCollapseSemantic"	TokenNameStringLiteral	testCollapseSemantic
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testKeeprootCollapseSemantic	TokenNameIdentifier	 test Keeproot Collapse Semantic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testKeeprootCollapseSemantic"	TokenNameStringLiteral	testKeeprootCollapseSemantic
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInclude	TokenNameIdentifier	 test Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testInclude"	TokenNameStringLiteral	testInclude
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSemanticInclude	TokenNameIdentifier	 test Semantic Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testSemanticInclude"	TokenNameStringLiteral	testSemanticInclude
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSemanticLocal	TokenNameIdentifier	 test Semantic Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testSemanticInclude"	TokenNameStringLiteral	testSemanticInclude
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNeedsCatalog	TokenNameIdentifier	 test Needs Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testneedscat"	TokenNameStringLiteral	testneedscat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"skinconfig.foo"	TokenNameStringLiteral	skinconfig.foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Actually run a test, finding all input files (and corresponding * goldfile) */	TokenNameCOMMENT_JAVADOC	 Actually run a test, finding all input files (and corresponding goldfile) 
private	TokenNameprivate	
void	TokenNamevoid	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
keepRoot	TokenNameIdentifier	 keep Root
,	TokenNameCOMMA	
boolean	TokenNameboolean	
collapse	TokenNameIdentifier	 collapse
,	TokenNameCOMMA	
boolean	TokenNameboolean	
semantic	TokenNameIdentifier	 semantic
,	TokenNameCOMMA	
boolean	TokenNameboolean	
include	TokenNameIdentifier	 include
,	TokenNameCOMMA	
boolean	TokenNameboolean	
localRoot	TokenNameIdentifier	 local Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
getFiles	TokenNameIdentifier	 get Files
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
"src/etc/testcases/taskdefs/xmlproperty/inputs"	TokenNameStringLiteral	src/etc/testcases/taskdefs/xmlproperty/inputs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
inputFile	TokenNameIdentifier	 input File
=	TokenNameEQUAL	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// What's the working directory? If local, then its the 	TokenNameCOMMENT_LINE	What's the working directory? If local, then its the 
// folder of the input file. Otherwise, its the "current" dir.. 	TokenNameCOMMENT_LINE	folder of the input file. Otherwise, its the "current" dir.. 
File	TokenNameIdentifier	 File
workingDir	TokenNameIdentifier	 working Dir
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localRoot	TokenNameIdentifier	 local Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
workingDir	TokenNameIdentifier	 working Dir
=	TokenNameEQUAL	
inputFile	TokenNameIdentifier	 input File
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
workingDir	TokenNameIdentifier	 working Dir
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
propertyFile	TokenNameIdentifier	 property File
=	TokenNameEQUAL	
getGoldfile	TokenNameIdentifier	 get Goldfile
(	TokenNameLPAREN	
inputFile	TokenNameIdentifier	 input File
,	TokenNameCOMMA	
keepRoot	TokenNameIdentifier	 keep Root
,	TokenNameCOMMA	
collapse	TokenNameIdentifier	 collapse
,	TokenNameCOMMA	
semantic	TokenNameIdentifier	 semantic
,	TokenNameCOMMA	
include	TokenNameIdentifier	 include
,	TokenNameCOMMA	
localRoot	TokenNameIdentifier	 local Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
propertyFile	TokenNameIdentifier	 property File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Skipping as " 	TokenNameCOMMENT_LINE	System.out.println("Skipping as " 
// + propertyFile.getAbsolutePath() 	TokenNameCOMMENT_LINE	+ propertyFile.getAbsolutePath() 
// + ") doesn't exist."); 	TokenNameCOMMENT_LINE	+ ") doesn't exist."); 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println(msg + " (" + propertyFile.getName() + ") in (" + workingDir + ")"); 	TokenNameCOMMENT_LINE	System.out.println(msg + " (" + propertyFile.getName() + ") in (" + workingDir + ")"); 
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XmlProperty	TokenNameIdentifier	 Xml Property
xmlproperty	TokenNameIdentifier	 xmlproperty
=	TokenNameEQUAL	
new	TokenNamenew	
XmlProperty	TokenNameIdentifier	 Xml Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlproperty	TokenNameIdentifier	 xmlproperty
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlproperty	TokenNameIdentifier	 xmlproperty
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
inputFile	TokenNameIdentifier	 input File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlproperty	TokenNameIdentifier	 xmlproperty
.	TokenNameDOT	
setKeeproot	TokenNameIdentifier	 set Keeproot
(	TokenNameLPAREN	
keepRoot	TokenNameIdentifier	 keep Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlproperty	TokenNameIdentifier	 xmlproperty
.	TokenNameDOT	
setCollapseAttributes	TokenNameIdentifier	 set Collapse Attributes
(	TokenNameLPAREN	
collapse	TokenNameIdentifier	 collapse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlproperty	TokenNameIdentifier	 xmlproperty
.	TokenNameDOT	
setSemanticAttributes	TokenNameIdentifier	 set Semantic Attributes
(	TokenNameLPAREN	
semantic	TokenNameIdentifier	 semantic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlproperty	TokenNameIdentifier	 xmlproperty
.	TokenNameDOT	
setIncludeSemanticAttribute	TokenNameIdentifier	 set Include Semantic Attribute
(	TokenNameLPAREN	
include	TokenNameIdentifier	 include
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlproperty	TokenNameIdentifier	 xmlproperty
.	TokenNameDOT	
setRootDirectory	TokenNameIdentifier	 set Root Directory
(	TokenNameLPAREN	
workingDir	TokenNameIdentifier	 working Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set a property on the project to make sure that loading 	TokenNameCOMMENT_LINE	Set a property on the project to make sure that loading 
// a property with the same name from an xml file will 	TokenNameCOMMENT_LINE	a property with the same name from an xml file will 
// *not* change it. 	TokenNameCOMMENT_LINE	*not* change it. 
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
"override.property.test"	TokenNameStringLiteral	override.property.test
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlproperty	TokenNameIdentifier	 xmlproperty
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
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
props	TokenNameIdentifier	 props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
propertyFile	TokenNameIdentifier	 property File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//printProperties(p.getProperties()); 	TokenNameCOMMENT_LINE	printProperties(p.getProperties()); 
ensureProperties	TokenNameIdentifier	 ensure Properties
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
inputFile	TokenNameIdentifier	 input File
,	TokenNameCOMMA	
workingDir	TokenNameIdentifier	 working Dir
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ensureReferences	TokenNameIdentifier	 ensure References
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
inputFile	TokenNameIdentifier	 input File
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getReferences	TokenNameIdentifier	 get References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Make sure every property loaded from the goldfile was also * read from the XmlProperty. We could try and test the other way, * but some other properties may get set in the XmlProperty due * to generic Project/Task configuration. */	TokenNameCOMMENT_JAVADOC	 Make sure every property loaded from the goldfile was also read from the XmlProperty. We could try and test the other way, but some other properties may get set in the XmlProperty due to generic Project/Task configuration. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
ensureProperties	TokenNameIdentifier	 ensure Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
inputFile	TokenNameIdentifier	 input File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
workingDir	TokenNameIdentifier	 working Dir
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
xmlproperties	TokenNameIdentifier	 xmlproperties
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Every key identified by the Properties must have been loaded. 	TokenNameCOMMENT_LINE	Every key identified by the Properties must have been loaded. 
Enumeration	TokenNameIdentifier	 Enumeration
propertyKeyEnum	TokenNameIdentifier	 property Key Enum
=	TokenNameEQUAL	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
propertyKeyEnum	TokenNameIdentifier	 property Key Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
currentKey	TokenNameIdentifier	 current Key
=	TokenNameEQUAL	
propertyKeyEnum	TokenNameIdentifier	 property Key Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
assertMsg	TokenNameIdentifier	 assert Msg
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
inputFile	TokenNameIdentifier	 input File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Key="	TokenNameStringLiteral	 Key=
+	TokenNamePLUS	
currentKey	TokenNameIdentifier	 current Key
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
propertyValue	TokenNameIdentifier	 property Value
=	TokenNameEQUAL	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
currentKey	TokenNameIdentifier	 current Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xmlValue	TokenNameIdentifier	 xml Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
xmlproperties	TokenNameIdentifier	 xmlproperties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentKey	TokenNameIdentifier	 current Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propertyValue	TokenNameIdentifier	 property Value
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"ID."	TokenNameStringLiteral	ID.
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The property is an id's thing -- either a property 	TokenNameCOMMENT_LINE	The property is an id's thing -- either a property 
// or a path. We need to make sure 	TokenNameCOMMENT_LINE	or a path. We need to make sure 
// that the object was created with the given id. 	TokenNameCOMMENT_LINE	that the object was created with the given id. 
// We don't have an adequate way of testing the actual 	TokenNameCOMMENT_LINE	We don't have an adequate way of testing the actual 
// *value* of the Path object, though... 	TokenNameCOMMENT_LINE	*value* of the Path object, though... 
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
currentKey	TokenNameIdentifier	 current Key
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getReferences	TokenNameIdentifier	 get References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
assertMsg	TokenNameIdentifier	 assert Msg
+	TokenNamePLUS	
" Object ID does not exist."	TokenNameStringLiteral	 Object ID does not exist.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// What is the property supposed to be? 	TokenNameCOMMENT_LINE	What is the property supposed to be? 
propertyValue	TokenNameIdentifier	 property Value
=	TokenNameEQUAL	
propertyValue	TokenNameIdentifier	 property Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
propertyValue	TokenNameIdentifier	 property Value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propertyValue	TokenNameIdentifier	 property Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"path"	TokenNameStringLiteral	path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
assertMsg	TokenNameIdentifier	 assert Msg
+	TokenNamePLUS	
" Path ID is a "	TokenNameStringLiteral	 Path ID is a 
+	TokenNamePLUS	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
assertMsg	TokenNameIdentifier	 assert Msg
,	TokenNameCOMMA	
propertyValue	TokenNameIdentifier	 property Value
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
propertyValue	TokenNameIdentifier	 property Value
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"FILE."	TokenNameStringLiteral	FILE.
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The property is the name of a file. We are testing 	TokenNameCOMMENT_LINE	The property is the name of a file. We are testing 
// a location attribute, so we need to resolve the given 	TokenNameCOMMENT_LINE	a location attribute, so we need to resolve the given 
// file name in the provided folder. 	TokenNameCOMMENT_LINE	file name in the provided folder. 
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
propertyValue	TokenNameIdentifier	 property Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
propertyValue	TokenNameIdentifier	 property Value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
workingDir	TokenNameIdentifier	 working Dir
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propertyValue	TokenNameIdentifier	 property Value
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
assertMsg	TokenNameIdentifier	 assert Msg
,	TokenNameCOMMA	
propertyValue	TokenNameIdentifier	 property Value
,	TokenNameCOMMA	
xmlValue	TokenNameIdentifier	 xml Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Debugging method to print the properties in the given hashtable */	TokenNameCOMMENT_JAVADOC	 Debugging method to print the properties in the given hashtable 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
printProperties	TokenNameIdentifier	 print Properties
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
xmlproperties	TokenNameIdentifier	 xmlproperties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
keyEnum	TokenNameIdentifier	 key Enum
=	TokenNameEQUAL	
xmlproperties	TokenNameIdentifier	 xmlproperties
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keyEnum	TokenNameIdentifier	 key Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
currentKey	TokenNameIdentifier	 current Key
=	TokenNameEQUAL	
keyEnum	TokenNameIdentifier	 key Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
currentKey	TokenNameIdentifier	 current Key
+	TokenNamePLUS	
" = "	TokenNameStringLiteral	 = 
+	TokenNamePLUS	
xmlproperties	TokenNameIdentifier	 xmlproperties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentKey	TokenNameIdentifier	 current Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Ensure all references loaded by the project are valid. */	TokenNameCOMMENT_JAVADOC	 Ensure all references loaded by the project are valid. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
ensureReferences	TokenNameIdentifier	 ensure References
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
inputFile	TokenNameIdentifier	 input File
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
references	TokenNameIdentifier	 references
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
referenceKeyEnum	TokenNameIdentifier	 reference Key Enum
=	TokenNameEQUAL	
references	TokenNameIdentifier	 references
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
referenceKeyEnum	TokenNameIdentifier	 reference Key Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
currentKey	TokenNameIdentifier	 current Key
=	TokenNameEQUAL	
referenceKeyEnum	TokenNameIdentifier	 reference Key Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
currentValue	TokenNameIdentifier	 current Value
=	TokenNameEQUAL	
references	TokenNameIdentifier	 references
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentKey	TokenNameIdentifier	 current Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentValue	TokenNameIdentifier	 current Value
instanceof	TokenNameinstanceof	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currentValue	TokenNameIdentifier	 current Value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
currentKey	TokenNameIdentifier	 current Key
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"ant."	TokenNameStringLiteral	ant.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
inputFile	TokenNameIdentifier	 input File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Key="	TokenNameStringLiteral	 Key=
+	TokenNamePLUS	
currentKey	TokenNameIdentifier	 current Key
+	TokenNamePLUS	
" is not a recognized type."	TokenNameStringLiteral	 is not a recognized type.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Munge the name of the input file to find an appropriate goldfile, * based on hardwired naming conventions. */	TokenNameCOMMENT_JAVADOC	 Munge the name of the input file to find an appropriate goldfile, based on hardwired naming conventions. 
private	TokenNameprivate	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
getGoldfile	TokenNameIdentifier	 get Goldfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
boolean	TokenNameboolean	
keepRoot	TokenNameIdentifier	 keep Root
,	TokenNameCOMMA	
boolean	TokenNameboolean	
collapse	TokenNameIdentifier	 collapse
,	TokenNameCOMMA	
boolean	TokenNameboolean	
semantic	TokenNameIdentifier	 semantic
,	TokenNameCOMMA	
boolean	TokenNameboolean	
include	TokenNameIdentifier	 include
,	TokenNameCOMMA	
boolean	TokenNameboolean	
localRoot	TokenNameIdentifier	 local Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Substitute .xml with .properties 	TokenNameCOMMENT_LINE	Substitute .xml with .properties 
String	TokenNameIdentifier	 String
baseName	TokenNameIdentifier	 base Name
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseName	TokenNameIdentifier	 base Name
=	TokenNameEQUAL	
baseName	TokenNameIdentifier	 base Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
baseName	TokenNameIdentifier	 base Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".properties"	TokenNameStringLiteral	.properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
goldFileFolder	TokenNameIdentifier	 gold File Folder
=	TokenNameEQUAL	
"goldfiles/"	TokenNameStringLiteral	goldfiles/
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keepRoot	TokenNameIdentifier	 keep Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
goldFileFolder	TokenNameIdentifier	 gold File Folder
+=	TokenNamePLUS_EQUAL	
"keeproot-"	TokenNameStringLiteral	keeproot-
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
goldFileFolder	TokenNameIdentifier	 gold File Folder
+=	TokenNamePLUS_EQUAL	
"nokeeproot-"	TokenNameStringLiteral	nokeeproot-
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
semantic	TokenNameIdentifier	 semantic
)	TokenNameRPAREN	
{	TokenNameLBRACE	
goldFileFolder	TokenNameIdentifier	 gold File Folder
+=	TokenNamePLUS_EQUAL	
"semantic-"	TokenNameStringLiteral	semantic-
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
include	TokenNameIdentifier	 include
)	TokenNameRPAREN	
{	TokenNameLBRACE	
goldFileFolder	TokenNameIdentifier	 gold File Folder
+=	TokenNamePLUS_EQUAL	
"include-"	TokenNameStringLiteral	include-
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
collapse	TokenNameIdentifier	 collapse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
goldFileFolder	TokenNameIdentifier	 gold File Folder
+=	TokenNamePLUS_EQUAL	
"collapse-"	TokenNameStringLiteral	collapse-
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
goldFileFolder	TokenNameIdentifier	 gold File Folder
+=	TokenNamePLUS_EQUAL	
"nocollapse-"	TokenNameStringLiteral	nocollapse-
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
goldFileFolder	TokenNameIdentifier	 gold File Folder
+	TokenNamePLUS	
baseName	TokenNameIdentifier	 base Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve a list of xml files in the specified folder * and below. */	TokenNameCOMMENT_JAVADOC	 Retrieve a list of xml files in the specified folder and below. 
private	TokenNameprivate	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
startingDir	TokenNameIdentifier	 starting Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
startingDir	TokenNameIdentifier	 starting Dir
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Collect a list of xml files in the specified folder * and below. */	TokenNameCOMMENT_JAVADOC	 Collect a list of xml files in the specified folder and below. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
startingDir	TokenNameIdentifier	 starting Dir
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
collect	TokenNameIdentifier	 collect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileFilter	TokenNameIdentifier	 File Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
FileFilter	TokenNameIdentifier	 File Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"taskdefs"	TokenNameStringLiteral	taskdefs
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
startingDir	TokenNameIdentifier	 starting Dir
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
collect	TokenNameIdentifier	 collect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
