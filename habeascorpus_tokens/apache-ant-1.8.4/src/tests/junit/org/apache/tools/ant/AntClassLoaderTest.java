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
PrintStream	TokenNameIdentifier	 Print Stream
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
/** * Test case for ant class loader * */	TokenNameCOMMENT_JAVADOC	 Test case for ant class loader 
public	TokenNamepublic	
class	TokenNameclass	
AntClassLoaderTest	TokenNameIdentifier	 Ant Class Loader Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
loader	TokenNameIdentifier	 loader
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AntClassLoaderTest	TokenNameIdentifier	 Ant Class Loader Test
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
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/antclassloader.xml"	TokenNameStringLiteral	src/etc/testcases/core/antclassloader.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"setup"	TokenNameStringLiteral	setup
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
loader	TokenNameIdentifier	 loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"cleanup"	TokenNameStringLiteral	cleanup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//test inspired by bug report 37085 	TokenNameCOMMENT_LINE	test inspired by bug report 37085 
public	TokenNamepublic	
void	TokenNamevoid	
testJarWithManifestInDirWithSpace	TokenNameIdentifier	 test Jar With Manifest In Dir With Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
mainjarstring	TokenNameIdentifier	 mainjarstring
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"main.jar"	TokenNameStringLiteral	main.jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
extjarstring	TokenNameIdentifier	 extjarstring
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"ext.jar"	TokenNameStringLiteral	ext.jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
myPath	TokenNameIdentifier	 my Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myPath	TokenNameIdentifier	 my Path
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
mainjarstring	TokenNameIdentifier	 mainjarstring
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"build.sysclasspath"	TokenNameStringLiteral	build.sysclasspath
,	TokenNameCOMMA	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
myPath	TokenNameIdentifier	 my Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
mainjarstring	TokenNameIdentifier	 mainjarstring
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
+	TokenNamePLUS	
extjarstring	TokenNameIdentifier	 extjarstring
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJarWithManifestInNonAsciiDir	TokenNameIdentifier	 test Jar With Manifest In Non Ascii Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
mainjarstring	TokenNameIdentifier	 mainjarstring
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"main.jar.nonascii"	TokenNameStringLiteral	main.jar.nonascii
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
extjarstring	TokenNameIdentifier	 extjarstring
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"ext.jar.nonascii"	TokenNameStringLiteral	ext.jar.nonascii
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
myPath	TokenNameIdentifier	 my Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myPath	TokenNameIdentifier	 my Path
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
mainjarstring	TokenNameIdentifier	 mainjarstring
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"build.sysclasspath"	TokenNameStringLiteral	build.sysclasspath
,	TokenNameCOMMA	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
myPath	TokenNameIdentifier	 my Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
mainjarstring	TokenNameIdentifier	 mainjarstring
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
+	TokenNamePLUS	
extjarstring	TokenNameIdentifier	 extjarstring
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCleanup	TokenNameIdentifier	 test Cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// we don't expect to find this 	TokenNameCOMMENT_LINE	we don't expect to find this 
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
findClass	TokenNameIdentifier	 find Class
(	TokenNameLPAREN	
"fubar"	TokenNameStringLiteral	fubar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Did not expect to find fubar class"	TokenNameStringLiteral	Did not expect to find fubar class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore expected 	TokenNameCOMMENT_LINE	ignore expected 
}	TokenNameRBRACE	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// we don't expect to find this 	TokenNameCOMMENT_LINE	we don't expect to find this 
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
findClass	TokenNameIdentifier	 find Class
(	TokenNameLPAREN	
"fubar"	TokenNameStringLiteral	fubar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Did not expect to find fubar class"	TokenNameStringLiteral	Did not expect to find fubar class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore expected 	TokenNameCOMMENT_LINE	ignore expected 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"loader should not fail even if cleaned up"	TokenNameStringLiteral	loader should not fail even if cleaned up
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tell the build it is finished 	TokenNameCOMMENT_LINE	tell the build it is finished 
p	TokenNameIdentifier	 p
.	TokenNameDOT	
fireBuildFinished	TokenNameIdentifier	 fire Build Finished
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// we don't expect to find this 	TokenNameCOMMENT_LINE	we don't expect to find this 
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
findClass	TokenNameIdentifier	 find Class
(	TokenNameLPAREN	
"fubar"	TokenNameStringLiteral	fubar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Did not expect to find fubar class"	TokenNameStringLiteral	Did not expect to find fubar class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore expected 	TokenNameCOMMENT_LINE	ignore expected 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"loader should not fail even if project finished"	TokenNameStringLiteral	loader should not fail even if project finished
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetPackage	TokenNameIdentifier	 test Get Package
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"prepareGetPackageTest"	TokenNameStringLiteral	prepareGetPackageTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
myPath	TokenNameIdentifier	 my Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myPath	TokenNameIdentifier	 my Path
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"tmp.dir"	TokenNameStringLiteral	tmp.dir
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/test.jar"	TokenNameStringLiteral	/test.jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"build.sysclasspath"	TokenNameStringLiteral	build.sysclasspath
,	TokenNameCOMMA	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
myPath	TokenNameIdentifier	 my Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"should find class"	TokenNameStringLiteral	should find class
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
findClass	TokenNameIdentifier	 find Class
(	TokenNameLPAREN	
"org.example.Foo"	TokenNameStringLiteral	org.example.Foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"should find package"	TokenNameStringLiteral	should find package
,	TokenNameCOMMA	
new	TokenNamenew	
GetPackageWrapper	TokenNameIdentifier	 Get Package Wrapper
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
.	TokenNameDOT	
getPackage	TokenNameIdentifier	 get Package
(	TokenNameLPAREN	
"org.example"	TokenNameStringLiteral	org.example
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCodeSource	TokenNameIdentifier	 test Code Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"prepareGetPackageTest"	TokenNameStringLiteral	prepareGetPackageTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
myPath	TokenNameIdentifier	 my Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myPath	TokenNameIdentifier	 my Path
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"tmp.dir"	TokenNameStringLiteral	tmp.dir
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/test.jar"	TokenNameStringLiteral	/test.jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"build.sysclasspath"	TokenNameStringLiteral	build.sysclasspath
,	TokenNameCOMMA	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
myPath	TokenNameIdentifier	 my Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
foo	TokenNameIdentifier	 foo
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
findClass	TokenNameIdentifier	 find Class
(	TokenNameLPAREN	
"org.example.Foo"	TokenNameStringLiteral	org.example.Foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
codeSourceLocation	TokenNameIdentifier	 code Source Location
=	TokenNameEQUAL	
foo	TokenNameIdentifier	 foo
.	TokenNameDOT	
getProtectionDomain	TokenNameIdentifier	 get Protection Domain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCodeSource	TokenNameIdentifier	 get Code Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
codeSourceLocation	TokenNameIdentifier	 code Source Location
+	TokenNamePLUS	
" should point to test.jar"	TokenNameStringLiteral	 should point to test.jar
,	TokenNameCOMMA	
codeSourceLocation	TokenNameIdentifier	 code Source Location
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"test.jar"	TokenNameStringLiteral	test.jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSignedJar	TokenNameIdentifier	 test Signed Jar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"signTestJar"	TokenNameStringLiteral	signTestJar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
jar	TokenNameIdentifier	 jar
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"tmp.dir"	TokenNameStringLiteral	tmp.dir
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/test.jar"	TokenNameStringLiteral	/test.jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
myPath	TokenNameIdentifier	 my Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myPath	TokenNameIdentifier	 my Path
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
jar	TokenNameIdentifier	 jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"build.sysclasspath"	TokenNameStringLiteral	build.sysclasspath
,	TokenNameCOMMA	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
myPath	TokenNameIdentifier	 my Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
foo	TokenNameIdentifier	 foo
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
findClass	TokenNameIdentifier	 find Class
(	TokenNameLPAREN	
"org.example.Foo"	TokenNameStringLiteral	org.example.Foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"should find class"	TokenNameStringLiteral	should find class
,	TokenNameCOMMA	
foo	TokenNameIdentifier	 foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"should have certificates"	TokenNameStringLiteral	should have certificates
,	TokenNameCOMMA	
foo	TokenNameIdentifier	 foo
.	TokenNameDOT	
getProtectionDomain	TokenNameIdentifier	 get Protection Domain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCodeSource	TokenNameIdentifier	 get Code Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCertificates	TokenNameIdentifier	 get Certificates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"should be signed"	TokenNameStringLiteral	should be signed
,	TokenNameCOMMA	
foo	TokenNameIdentifier	 foo
.	TokenNameDOT	
getSigners	TokenNameIdentifier	 get Signers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see https://issues.apache.org/bugzilla/show_bug.cgi?id=47593 */	TokenNameCOMMENT_JAVADOC	 @see https://issues.apache.org/bugzilla/show_bug.cgi?id=47593 
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidZipException	TokenNameIdentifier	 test Invalid Zip Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"createNonJar"	TokenNameStringLiteral	createNonJar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
jar	TokenNameIdentifier	 jar
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"tmp.dir"	TokenNameStringLiteral	tmp.dir
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/foo.jar"	TokenNameStringLiteral	/foo.jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
myPath	TokenNameIdentifier	 my Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myPath	TokenNameIdentifier	 my Path
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
jar	TokenNameIdentifier	 jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"build.sysclasspath"	TokenNameStringLiteral	build.sysclasspath
,	TokenNameCOMMA	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
myPath	TokenNameIdentifier	 my Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
sysErr	TokenNameIdentifier	 sys Err
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
errBuffer	TokenNameIdentifier	 err Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BuildFileTest	TokenNameIdentifier	 Build File Test
.	TokenNameDOT	
AntOutputStream	TokenNameIdentifier	 Ant Output Stream
(	TokenNameLPAREN	
errBuffer	TokenNameIdentifier	 err Buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setErr	TokenNameIdentifier	 set Err
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
"foo.txt"	TokenNameStringLiteral	foo.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startMessage	TokenNameIdentifier	 start Message
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Unable to obtain resource from "	TokenNameStringLiteral	Unable to obtain resource from 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
startMessage	TokenNameIdentifier	 start Message
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"foo.jar"	TokenNameStringLiteral	foo.jar
,	TokenNameCOMMA	
startMessage	TokenNameIdentifier	 start Message
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
errBuffer	TokenNameIdentifier	 err Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startMessage	TokenNameIdentifier	 start Message
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Unable to obtain resource from "	TokenNameStringLiteral	Unable to obtain resource from 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
startMessage	TokenNameIdentifier	 start Message
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"foo.jar"	TokenNameStringLiteral	foo.jar
,	TokenNameCOMMA	
startMessage	TokenNameIdentifier	 start Message
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setErr	TokenNameIdentifier	 set Err
(	TokenNameLPAREN	
sysErr	TokenNameIdentifier	 sys Err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
GetPackageWrapper	TokenNameIdentifier	 Get Package Wrapper
extends	TokenNameextends	
ClassLoader	TokenNameIdentifier	 Class Loader
{	TokenNameLBRACE	
GetPackageWrapper	TokenNameIdentifier	 Get Package Wrapper
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Package	TokenNameIdentifier	 Package
getPackage	TokenNameIdentifier	 get Package
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getPackage	TokenNameIdentifier	 get Package
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
