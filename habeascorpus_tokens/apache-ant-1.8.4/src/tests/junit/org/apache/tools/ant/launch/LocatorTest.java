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
launch	TokenNameIdentifier	 launch
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** Test the locator in the ant-launch JAR */	TokenNameCOMMENT_JAVADOC	 Test the locator in the ant-launch JAR 
public	TokenNamepublic	
class	TokenNameclass	
LocatorTest	TokenNameIdentifier	 Locator Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
windows	TokenNameIdentifier	 windows
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
unix	TokenNameIdentifier	 unix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LAUNCHER_JAR	TokenNameIdentifier	 LAUNCHER  JAR
=	TokenNameEQUAL	
"//morzine/slo/Java/Apache/ant/lib/ant-launcher.jar"	TokenNameStringLiteral	//morzine/slo/Java/Apache/ant/lib/ant-launcher.jar
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SHARED_JAR_URI	TokenNameIdentifier	 SHARED  JAR  URI
=	TokenNameEQUAL	
"jar:file:"	TokenNameStringLiteral	jar:file:
+	TokenNamePLUS	
LAUNCHER_JAR	TokenNameIdentifier	 LAUNCHER  JAR
+	TokenNamePLUS	
"!/org/apache/tools/ant/launch/Launcher.class"	TokenNameStringLiteral	!/org/apache/tools/ant/launch/Launcher.class
;	TokenNameSEMICOLON	
/** * No-arg constructor to enable serialization. This method is not intended to be used by mere mortals without calling * setName(). */	TokenNameCOMMENT_JAVADOC	 No-arg constructor to enable serialization. This method is not intended to be used by mere mortals without calling setName(). 
public	TokenNamepublic	
LocatorTest	TokenNameIdentifier	 Locator Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Constructs a test case with the given name. * @param name */	TokenNameCOMMENT_JAVADOC	 Constructs a test case with the given name. @param name 
public	TokenNamepublic	
LocatorTest	TokenNameIdentifier	 Locator Test
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
/** * Sets up the fixture, for example, open a network connection. * This method is called before a test is executed. */	TokenNameCOMMENT_JAVADOC	 Sets up the fixture, for example, open a network connection. This method is called before a test is executed. 
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
windows	TokenNameIdentifier	 windows
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
FAMILY_DOS	TokenNameIdentifier	 FAMILY  DOS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unix	TokenNameIdentifier	 unix
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
FAMILY_UNIX	TokenNameIdentifier	 FAMILY  UNIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * expect a uri to resolve to strings on different platforms * @param uri uri to parse * @param expectedUnix unix string (or null to skip that test) * @param expectedDos DOS string (or null to skip that test) * @return the resolved string */	TokenNameCOMMENT_JAVADOC	 expect a uri to resolve to strings on different platforms @param uri uri to parse @param expectedUnix unix string (or null to skip that test) @param expectedDos DOS string (or null to skip that test) @return the resolved string 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
resolveTo	TokenNameIdentifier	 resolve To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expectedUnix	TokenNameIdentifier	 expected Unix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expectedDos	TokenNameIdentifier	 expected Dos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResolved	TokenNameIdentifier	 assert Resolved
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
expectedUnix	TokenNameIdentifier	 expected Unix
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
unix	TokenNameIdentifier	 unix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResolved	TokenNameIdentifier	 assert Resolved
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
expectedDos	TokenNameIdentifier	 expected Dos
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
windows	TokenNameIdentifier	 windows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert something resolved * @param uri original URI * @param expectedResult what we expected * @param result what we got * @param enabled is the test enabled? */	TokenNameCOMMENT_JAVADOC	 Assert something resolved @param uri original URI @param expectedResult what we expected @param result what we got @param enabled is the test enabled? 
private	TokenNameprivate	
void	TokenNamevoid	
assertResolved	TokenNameIdentifier	 assert Resolved
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expectedResult	TokenNameIdentifier	 expected Result
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
boolean	TokenNameboolean	
enabled	TokenNameIdentifier	 enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enabled	TokenNameIdentifier	 enabled
&&	TokenNameAND_AND	
expectedResult	TokenNameIdentifier	 expected Result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Expected "	TokenNameStringLiteral	Expected 
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
" to resolve to "	TokenNameStringLiteral	 to resolve to 
+	TokenNamePLUS	
expectedResult	TokenNameIdentifier	 expected Result
+	TokenNamePLUS	
" but got "	TokenNameStringLiteral	 but got 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
expectedResult	TokenNameIdentifier	 expected Result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This asserts that we can round trip the path to a URI and back again * @param path filename with no directory separators * @return the trailing filename */	TokenNameCOMMENT_JAVADOC	 This asserts that we can round trip the path to a URI and back again @param path filename with no directory separators @return the trailing filename 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
assertResolves	TokenNameIdentifier	 assert Resolves
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
asuri	TokenNameIdentifier	 asuri
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toASCIIString	TokenNameIdentifier	 to ASCII String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fullpath	TokenNameIdentifier	 fullpath
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
resolveTo	TokenNameIdentifier	 resolve To
(	TokenNameLPAREN	
asuri	TokenNameIdentifier	 asuri
,	TokenNameCOMMA	
fullpath	TokenNameIdentifier	 fullpath
,	TokenNameCOMMA	
fullpath	TokenNameIdentifier	 fullpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * this isnt really a valid URI, except maybe in IE * @throws Exception */	TokenNameCOMMENT_JAVADOC	 this isnt really a valid URI, except maybe in IE @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testNetworkURI	TokenNameIdentifier	 test Network URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
resolveTo	TokenNameIdentifier	 resolve To
(	TokenNameLPAREN	
"file:\\PC03\jclasses\lib\ant-1.7.0.jar"	TokenNameStringLiteral	file:\\PC03\jclasses\lib\ant-1.7.0.jar
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
"\\PC03\jclasses\lib\ant-1.7.0.jar"	TokenNameStringLiteral	\\PC03\jclasses\lib\ant-1.7.0.jar
,	TokenNameCOMMA	
"\\PC03\jclasses\lib\ant-1.7.0.jar"	TokenNameStringLiteral	\\PC03\jclasses\lib\ant-1.7.0.jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is not being tested as we don't appear to generate paths like this in the launcher * @throws Exception */	TokenNameCOMMENT_JAVADOC	 This is not being tested as we don't appear to generate paths like this in the launcher @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
NotestTripleForwardSlashNetworkURI	TokenNameIdentifier	 Notest Triple Forward Slash Network URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
resolveTo	TokenNameIdentifier	 resolve To
(	TokenNameLPAREN	
"file:///PC03/jclasses/lib/ant-1.7.0.jar"	TokenNameStringLiteral	file:///PC03/jclasses/lib/ant-1.7.0.jar
,	TokenNameCOMMA	
"///PC03/jclasses/lib/ant-1.7.0.jar"	TokenNameStringLiteral	///PC03/jclasses/lib/ant-1.7.0.jar
,	TokenNameCOMMA	
"\\PC03\jclasses\lib\ant-1.7.0.jar"	TokenNameStringLiteral	\\PC03\jclasses\lib\ant-1.7.0.jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnixNetworkPath	TokenNameIdentifier	 test Unix Network Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
resolveTo	TokenNameIdentifier	 resolve To
(	TokenNameLPAREN	
"file://cluster/home/ant/lib"	TokenNameStringLiteral	file://cluster/home/ant/lib
,	TokenNameCOMMA	
"//cluster/home/ant/lib"	TokenNameStringLiteral	//cluster/home/ant/lib
,	TokenNameCOMMA	
"\\cluster\home\ant\lib"	TokenNameStringLiteral	\\cluster\home\ant\lib
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnixPath	TokenNameIdentifier	 test Unix Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
resolveTo	TokenNameIdentifier	 resolve To
(	TokenNameLPAREN	
"file:/home/ant/lib"	TokenNameStringLiteral	file:/home/ant/lib
,	TokenNameCOMMA	
"/home/ant/lib"	TokenNameStringLiteral	/home/ant/lib
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSpacedURI	TokenNameIdentifier	 test Spaced URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
resolveTo	TokenNameIdentifier	 resolve To
(	TokenNameLPAREN	
"file:C:\Program Files\Ant\lib"	TokenNameStringLiteral	file:C:\Program Files\Ant\lib
,	TokenNameCOMMA	
"C:\Program Files\Ant\lib"	TokenNameStringLiteral	C:\Program Files\Ant\lib
,	TokenNameCOMMA	
"C:\Program Files\Ant\lib"	TokenNameStringLiteral	C:\Program Files\Ant\lib
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Bug 42275; Ant failing to run off a remote share * @throws Throwable if desired */	TokenNameCOMMENT_JAVADOC	 Bug 42275; Ant failing to run off a remote share @throws Throwable if desired 
public	TokenNamepublic	
void	TokenNamevoid	
testAntOnRemoteShare	TokenNameIdentifier	 test Ant On Remote Share
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
fromJarURI	TokenNameIdentifier	 from Jar URI
(	TokenNameLPAREN	
SHARED_JAR_URI	TokenNameIdentifier	 SHARED  JAR  URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResolved	TokenNameIdentifier	 assert Resolved
(	TokenNameLPAREN	
SHARED_JAR_URI	TokenNameIdentifier	 SHARED  JAR  URI
,	TokenNameCOMMA	
LAUNCHER_JAR	TokenNameIdentifier	 LAUNCHER  JAR
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
unix	TokenNameIdentifier	 unix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResolved	TokenNameIdentifier	 assert Resolved
(	TokenNameLPAREN	
SHARED_JAR_URI	TokenNameIdentifier	 SHARED  JAR  URI
,	TokenNameCOMMA	
LAUNCHER_JAR	TokenNameIdentifier	 LAUNCHER  JAR
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
windows	TokenNameIdentifier	 windows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Bug 42275; Ant failing to run off a remote share * * @throws Throwable if desired */	TokenNameCOMMENT_JAVADOC	 Bug 42275; Ant failing to run off a remote share * @throws Throwable if desired 
public	TokenNamepublic	
void	TokenNamevoid	
testFileFromRemoteShare	TokenNameIdentifier	 test File From Remote Share
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
fromJarURI	TokenNameIdentifier	 from Jar URI
(	TokenNameLPAREN	
SHARED_JAR_URI	TokenNameIdentifier	 SHARED  JAR  URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
windows	TokenNameIdentifier	 windows
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"\\"	TokenNameStringLiteral	\\
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHttpURI	TokenNameIdentifier	 test Http URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
"http://ant.apache.org"	TokenNameStringLiteral	http://ant.apache.org
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
ERROR_NOT_FILE_URI	TokenNameIdentifier	 ERROR  NOT  FILE  URI
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInternationalURI	TokenNameIdentifier	 test International URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
assertResolves	TokenNameIdentifier	 assert Resolves
(	TokenNameLPAREN	
"Löwenbrau.aus.München"	TokenNameStringLiteral	Löwenbrau.aus.München
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
umlauted	TokenNameIdentifier	 umlauted
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"expected 0xf6 (ö), but got "	TokenNameStringLiteral	expected 0xf6 (ö), but got 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
umlauted	TokenNameIdentifier	 umlauted
)	TokenNameRPAREN	
+	TokenNamePLUS	
" '"	TokenNameStringLiteral	 '
+	TokenNamePLUS	
umlauted	TokenNameIdentifier	 umlauted
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
0xf6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
umlauted	TokenNameIdentifier	 umlauted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/tmp/a%C3%A7a%C3%AD%20berry"	TokenNameStringLiteral	file:/tmp/a%C3%A7a%C3%AD%20berry
,	TokenNameCOMMA	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
encodeURI	TokenNameIdentifier	 encode URI
(	TokenNameLPAREN	
"file:/tmp/açaí berry"	TokenNameStringLiteral	file:/tmp/açaí berry
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/tmp/açaí berry"	TokenNameStringLiteral	file:/tmp/açaí berry
,	TokenNameCOMMA	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
decodeUri	TokenNameIdentifier	 decode Uri
(	TokenNameLPAREN	
"file:/tmp/a%C3%A7a%C3%AD%20berry"	TokenNameStringLiteral	file:/tmp/a%C3%A7a%C3%AD%20berry
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/tmp/açaí berry"	TokenNameStringLiteral	file:/tmp/açaí berry
,	TokenNameCOMMA	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
decodeUri	TokenNameIdentifier	 decode Uri
(	TokenNameLPAREN	
"file:/tmp/açaí%20berry"	TokenNameStringLiteral	file:/tmp/açaí%20berry
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// #50543 	TokenNameCOMMENT_LINE	#50543 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/tmp/hezky ?esky"	TokenNameStringLiteral	file:/tmp/hezky ?esky
,	TokenNameCOMMA	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
decodeUri	TokenNameIdentifier	 decode Uri
(	TokenNameLPAREN	
"file:/tmp/hezky%20?esky"	TokenNameStringLiteral	file:/tmp/hezky%20?esky
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// non-ISO-8859-1 variant 	TokenNameCOMMENT_LINE	non-ISO-8859-1 variant 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOddLowAsciiURI	TokenNameIdentifier	 test Odd Low Ascii URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertResolves	TokenNameIdentifier	 assert Resolves
(	TokenNameLPAREN	
"hash# and percent%"	TokenNameStringLiteral	hash# and percent%
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
