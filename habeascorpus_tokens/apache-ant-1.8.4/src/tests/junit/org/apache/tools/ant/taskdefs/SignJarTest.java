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
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
;	TokenNameSEMICOLON	
/** * Testcase for the Signjar task * */	TokenNameCOMMENT_JAVADOC	 Testcase for the Signjar task 
public	TokenNamepublic	
class	TokenNameclass	
SignJarTest	TokenNameIdentifier	 Sign Jar Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXPANDED_MANIFEST	TokenNameIdentifier	 EXPANDED  MANIFEST
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/manifests/META-INF/MANIFEST.MF"	TokenNameStringLiteral	src/etc/testcases/taskdefs/manifests/META-INF/MANIFEST.MF
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SignJarTest	TokenNameIdentifier	 Sign Jar Test
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
"src/etc/testcases/taskdefs/signjar.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/signjar.xml
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
"clean"	TokenNameStringLiteral	clean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * check for being offline * @return true if the system property "offline" is "true" */	TokenNameCOMMENT_JAVADOC	 check for being offline @return true if the system property "offline" is "true" 
private	TokenNameprivate	
boolean	TokenNameboolean	
isOffline	TokenNameIdentifier	 is Offline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
"offline"	TokenNameStringLiteral	offline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSigFile	TokenNameIdentifier	 test Sig File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"sigfile"	TokenNameStringLiteral	sigfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SignJarChild	TokenNameIdentifier	 Sign Jar Child
sj	TokenNameIdentifier	 sj
=	TokenNameEQUAL	
new	TokenNamenew	
SignJarChild	TokenNameIdentifier	 Sign Jar Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"testonly"	TokenNameStringLiteral	testonly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
setKeystore	TokenNameIdentifier	 set Keystore
(	TokenNameLPAREN	
"testkeystore"	TokenNameStringLiteral	testkeystore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
setStorepass	TokenNameIdentifier	 set Storepass
(	TokenNameLPAREN	
"apacheant"	TokenNameStringLiteral	apacheant
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
"test.jar"	TokenNameStringLiteral	test.jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
setJar	TokenNameIdentifier	 set Jar
(	TokenNameLPAREN	
jar	TokenNameIdentifier	 jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"mustn't find signature without sigfile attribute"	TokenNameStringLiteral	mustn't find signature without sigfile attribute
,	TokenNameCOMMA	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
isSigned	TokenNameIdentifier	 is Signed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
setSigfile	TokenNameIdentifier	 set Sigfile
(	TokenNameLPAREN	
"TEST"	TokenNameStringLiteral	TEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"must find signature with sigfile attribute"	TokenNameStringLiteral	must find signature with sigfile attribute
,	TokenNameCOMMA	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
isSigned	TokenNameIdentifier	 is Signed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidChars	TokenNameIdentifier	 test Invalid Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"invalidchars"	TokenNameStringLiteral	invalidchars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SignJarChild	TokenNameIdentifier	 Sign Jar Child
sj	TokenNameIdentifier	 sj
=	TokenNameEQUAL	
new	TokenNamenew	
SignJarChild	TokenNameIdentifier	 Sign Jar Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"test@nly"	TokenNameStringLiteral	test@nly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
setKeystore	TokenNameIdentifier	 set Keystore
(	TokenNameLPAREN	
"testkeystore"	TokenNameStringLiteral	testkeystore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
setStorepass	TokenNameIdentifier	 set Storepass
(	TokenNameLPAREN	
"apacheant"	TokenNameStringLiteral	apacheant
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
"test.jar"	TokenNameStringLiteral	test.jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
setJar	TokenNameIdentifier	 set Jar
(	TokenNameLPAREN	
jar	TokenNameIdentifier	 jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
sj	TokenNameIdentifier	 sj
.	TokenNameDOT	
isSigned	TokenNameIdentifier	 is Signed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * subclass in order to get access to protected isSigned method if * tests and task come from different classloaders. */	TokenNameCOMMENT_JAVADOC	 subclass in order to get access to protected isSigned method if tests and task come from different classloaders. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SignJarChild	TokenNameIdentifier	 Sign Jar Child
extends	TokenNameextends	
SignJar	TokenNameIdentifier	 Sign Jar
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSigned	TokenNameIdentifier	 is Signed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isSigned	TokenNameIdentifier	 is Signed
(	TokenNameLPAREN	
jar	TokenNameIdentifier	 jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testURLKeystoreFile	TokenNameIdentifier	 test URL Keystore File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"urlKeystoreFile"	TokenNameStringLiteral	urlKeystoreFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testURLKeystoreHTTP	TokenNameIdentifier	 test URL Keystore HTTP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isOffline	TokenNameIdentifier	 is Offline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"urlKeystoreHTTP"	TokenNameStringLiteral	urlKeystoreHTTP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTsaLocalhost	TokenNameIdentifier	 test Tsa Localhost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//only test on java1.5+ 	TokenNameCOMMENT_LINE	only test on java1.5+ 
if	TokenNameif	
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
getJavaVersionNumber	TokenNameIdentifier	 get Java Version Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testTsaLocalhost"	TokenNameStringLiteral	testTsaLocalhost
,	TokenNameCOMMA	
"no TSA at localhost:0"	TokenNameStringLiteral	no TSA at localhost:0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
"java.net.ConnectException"	TokenNameStringLiteral	java.net.ConnectException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see https://issues.apache.org/bugzilla/show_bug.cgi?id=50081 */	TokenNameCOMMENT_JAVADOC	 @see https://issues.apache.org/bugzilla/show_bug.cgi?id=50081 
public	TokenNamepublic	
void	TokenNamevoid	
testSignUnnormalizedJar	TokenNameIdentifier	 test Sign Unnormalized Jar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"jar"	TokenNameStringLiteral	jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
testJar	TokenNameIdentifier	 test Jar
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
"test.jar"	TokenNameStringLiteral	test.jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
testJarParent	TokenNameIdentifier	 test Jar Parent
=	TokenNameEQUAL	
testJar	TokenNameIdentifier	 test Jar
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
testJarParent	TokenNameIdentifier	 test Jar Parent
,	TokenNameCOMMA	
"../"	TokenNameStringLiteral	../
+	TokenNamePLUS	
testJarParent	TokenNameIdentifier	 test Jar Parent
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
testJar	TokenNameIdentifier	 test Jar
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
testJar	TokenNameIdentifier	 test Jar
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
testJar	TokenNameIdentifier	 test Jar
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SignJar	TokenNameIdentifier	 Sign Jar
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
SignJar	TokenNameIdentifier	 Sign Jar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setJar	TokenNameIdentifier	 set Jar
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
"testonly"	TokenNameStringLiteral	testonly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setStorepass	TokenNameIdentifier	 set Storepass
(	TokenNameLPAREN	
"apacheant"	TokenNameStringLiteral	apacheant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setKeystore	TokenNameIdentifier	 set Keystore
(	TokenNameLPAREN	
"testkeystore"	TokenNameStringLiteral	testkeystore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
