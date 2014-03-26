/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
/** * Test case for ant class loader * */	TokenNameCOMMENT_JAVADOC	 Test case for ant class loader 
public	TokenNamepublic	
class	TokenNameclass	
AntClassLoaderDelegationTest	TokenNameIdentifier	 Ant Class Loader Delegation Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** Instance of a utility class to use for file operations. */	TokenNameCOMMENT_JAVADOC	 Instance of a utility class to use for file operations. 
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
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AntClassLoaderDelegationTest	TokenNameIdentifier	 Ant Class Loader Delegation Test
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
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sample resource present in build/testcases/ */	TokenNameCOMMENT_JAVADOC	 Sample resource present in build/testcases/ 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEST_RESOURCE	TokenNameIdentifier	 TEST  RESOURCE
=	TokenNameEQUAL	
"apache/tools/ant/IncludeTest.class"	TokenNameStringLiteral	apache/tools/ant/IncludeTest.class
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testFindResources	TokenNameIdentifier	 test Find Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// This path should contain the class files for these testcases: 	TokenNameCOMMENT_LINE	This path should contain the class files for these testcases: 
String	TokenNameIdentifier	 String
buildTestcases	TokenNameIdentifier	 build Testcases
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"build.tests"	TokenNameStringLiteral	build.tests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"defined ${build.tests}"	TokenNameStringLiteral	defined ${build.tests}
,	TokenNameCOMMA	
buildTestcases	TokenNameIdentifier	 build Testcases
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"have a dir "	TokenNameStringLiteral	have a dir 
+	TokenNamePLUS	
buildTestcases	TokenNameIdentifier	 build Testcases
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
buildTestcases	TokenNameIdentifier	 build Testcases
)	TokenNameRPAREN	
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
buildTestcases	TokenNameIdentifier	 build Testcases
+	TokenNamePLUS	
"/org"	TokenNameStringLiteral	/org
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A special parent loader which is not the system class loader: 	TokenNameCOMMENT_LINE	A special parent loader which is not the system class loader: 
ClassLoader	TokenNameIdentifier	 Class Loader
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
new	TokenNamenew	
ParentLoader	TokenNameIdentifier	 Parent Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// An AntClassLoader which is supposed to delegate to 	TokenNameCOMMENT_LINE	An AntClassLoader which is supposed to delegate to 
// the parent and then to the disk path: 	TokenNameCOMMENT_LINE	the parent and then to the disk path: 
ClassLoader	TokenNameIdentifier	 Class Loader
acl	TokenNameIdentifier	 acl
=	TokenNameEQUAL	
new	TokenNamenew	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The intended result URLs: 	TokenNameCOMMENT_LINE	The intended result URLs: 
URL	TokenNameIdentifier	 URL
urlFromPath	TokenNameIdentifier	 url From Path
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
buildTestcases	TokenNameIdentifier	 build Testcases
)	TokenNameRPAREN	
+	TokenNamePLUS	
"org/"	TokenNameStringLiteral	org/
+	TokenNamePLUS	
TEST_RESOURCE	TokenNameIdentifier	 TEST  RESOURCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
urlFromParent	TokenNameIdentifier	 url From Parent
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
"http://ant.apache.org/"	TokenNameStringLiteral	http://ant.apache.org/
+	TokenNamePLUS	
TEST_RESOURCE	TokenNameIdentifier	 TEST  RESOURCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"correct resources (regular delegation order)"	TokenNameStringLiteral	correct resources (regular delegation order)
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
urlFromParent	TokenNameIdentifier	 url From Parent
,	TokenNameCOMMA	
urlFromPath	TokenNameIdentifier	 url From Path
}	TokenNameRBRACE	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
enum2List	TokenNameIdentifier	 enum2 List
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
TEST_RESOURCE	TokenNameIdentifier	 TEST  RESOURCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acl	TokenNameIdentifier	 acl
=	TokenNameEQUAL	
new	TokenNamenew	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"correct resources (reverse delegation order)"	TokenNameStringLiteral	correct resources (reverse delegation order)
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
urlFromPath	TokenNameIdentifier	 url From Path
,	TokenNameCOMMA	
urlFromParent	TokenNameIdentifier	 url From Parent
}	TokenNameRBRACE	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
enum2List	TokenNameIdentifier	 enum2 List
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
TEST_RESOURCE	TokenNameIdentifier	 TEST  RESOURCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFindIsolateResources	TokenNameIdentifier	 test Find Isolate Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
buildTestcases	TokenNameIdentifier	 build Testcases
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"build.tests"	TokenNameStringLiteral	build.tests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"defined ${build.tests}"	TokenNameStringLiteral	defined ${build.tests}
,	TokenNameCOMMA	
buildTestcases	TokenNameIdentifier	 build Testcases
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"have a dir "	TokenNameStringLiteral	have a dir 
+	TokenNamePLUS	
buildTestcases	TokenNameIdentifier	 build Testcases
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
buildTestcases	TokenNameIdentifier	 build Testcases
)	TokenNameRPAREN	
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
buildTestcases	TokenNameIdentifier	 build Testcases
+	TokenNamePLUS	
"/org"	TokenNameStringLiteral	/org
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A special parent loader which is not the system class loader: 	TokenNameCOMMENT_LINE	A special parent loader which is not the system class loader: 
ClassLoader	TokenNameIdentifier	 Class Loader
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
new	TokenNamenew	
ParentLoader	TokenNameIdentifier	 Parent Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
urlFromPath	TokenNameIdentifier	 url From Path
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
buildTestcases	TokenNameIdentifier	 build Testcases
)	TokenNameRPAREN	
+	TokenNamePLUS	
"org/"	TokenNameStringLiteral	org/
+	TokenNamePLUS	
TEST_RESOURCE	TokenNameIdentifier	 TEST  RESOURCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
acl	TokenNameIdentifier	 acl
=	TokenNameEQUAL	
new	TokenNamenew	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
setIsolated	TokenNameIdentifier	 set Isolated
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"correct resources (reverse delegation order)"	TokenNameStringLiteral	correct resources (reverse delegation order)
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
urlFromPath	TokenNameIdentifier	 url From Path
}	TokenNameRBRACE	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
enum2List	TokenNameIdentifier	 enum2 List
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
TEST_RESOURCE	TokenNameIdentifier	 TEST  RESOURCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
enum2List	TokenNameIdentifier	 enum2 List
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Special loader that just knows how to find TEST_RESOURCE. */	TokenNameCOMMENT_JAVADOC	 Special loader that just knows how to find TEST_RESOURCE. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ParentLoader	TokenNameIdentifier	 Parent Loader
extends	TokenNameextends	
ClassLoader	TokenNameIdentifier	 Class Loader
{	TokenNameLBRACE	
public	TokenNamepublic	
ParentLoader	TokenNameIdentifier	 Parent Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Enumeration	TokenNameIdentifier	 Enumeration
findResources	TokenNameIdentifier	 find Resources
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TEST_RESOURCE	TokenNameIdentifier	 TEST  RESOURCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
"http://ant.apache.org/"	TokenNameStringLiteral	http://ant.apache.org/
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
