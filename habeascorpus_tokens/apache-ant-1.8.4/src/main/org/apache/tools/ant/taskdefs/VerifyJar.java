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
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
ChainableReader	TokenNameIdentifier	 Chainable Reader
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
RedirectorElement	TokenNameIdentifier	 Redirector Element
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
FilterChain	TokenNameIdentifier	 Filter Chain
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
FileProvider	TokenNameIdentifier	 File Provider
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * JAR verification task. * For every JAR passed in, we fork jarsigner to verify * that it is correctly signed. This is more rigorous than just checking for * the existence of a signature; the entire certification chain is tested * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 JAR verification task. For every JAR passed in, we fork jarsigner to verify that it is correctly signed. This is more rigorous than just checking for the existence of a signature; the entire certification chain is tested @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
VerifyJar	TokenNameIdentifier	 Verify Jar
extends	TokenNameextends	
AbstractJarSignerTask	TokenNameIdentifier	 Abstract Jar Signer Task
{	TokenNameLBRACE	
/** * no file message {@value} */	TokenNameCOMMENT_JAVADOC	 no file message {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_FILE	TokenNameIdentifier	 ERROR  NO  FILE
=	TokenNameEQUAL	
"Not found :"	TokenNameStringLiteral	Not found :
;	TokenNameSEMICOLON	
/** * The string we look for in the text to indicate direct verification */	TokenNameCOMMENT_JAVADOC	 The string we look for in the text to indicate direct verification 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VERIFIED_TEXT	TokenNameIdentifier	 VERIFIED  TEXT
=	TokenNameEQUAL	
"jar verified."	TokenNameStringLiteral	jar verified.
;	TokenNameSEMICOLON	
/** * certification flag */	TokenNameCOMMENT_JAVADOC	 certification flag 
private	TokenNameprivate	
boolean	TokenNameboolean	
certificates	TokenNameIdentifier	 certificates
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BufferingOutputFilter	TokenNameIdentifier	 Buffering Output Filter
outputCache	TokenNameIdentifier	 output Cache
=	TokenNameEQUAL	
new	TokenNamenew	
BufferingOutputFilter	TokenNameIdentifier	 Buffering Output Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Error output if there is a failure to verify the jar. */	TokenNameCOMMENT_JAVADOC	 Error output if there is a failure to verify the jar. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_VERIFY	TokenNameIdentifier	 ERROR  NO  VERIFY
=	TokenNameEQUAL	
"Failed to verify "	TokenNameStringLiteral	Failed to verify 
;	TokenNameSEMICOLON	
/** * Ask for certificate information to be printed * @param certificates if true print certificates. */	TokenNameCOMMENT_JAVADOC	 Ask for certificate information to be printed @param certificates if true print certificates. 
public	TokenNamepublic	
void	TokenNamevoid	
setCertificates	TokenNameIdentifier	 set Certificates
(	TokenNameLPAREN	
boolean	TokenNameboolean	
certificates	TokenNameIdentifier	 certificates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
certificates	TokenNameIdentifier	 certificates
=	TokenNameEQUAL	
certificates	TokenNameIdentifier	 certificates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify our jar files * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 verify our jar files @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
//validation logic 	TokenNameCOMMENT_LINE	validation logic 
final	TokenNamefinal	
boolean	TokenNameboolean	
hasJar	TokenNameIdentifier	 has Jar
=	TokenNameEQUAL	
jar	TokenNameIdentifier	 jar
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasJar	TokenNameIdentifier	 has Jar
&&	TokenNameAND_AND	
!	TokenNameNOT	
hasResources	TokenNameIdentifier	 has Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_SOURCE	TokenNameIdentifier	 ERROR  NO  SOURCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
beginExecution	TokenNameIdentifier	 begin Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//patch the redirector to save output to a file 	TokenNameCOMMENT_LINE	patch the redirector to save output to a file 
RedirectorElement	TokenNameIdentifier	 Redirector Element
redirector	TokenNameIdentifier	 redirector
=	TokenNameEQUAL	
getRedirector	TokenNameIdentifier	 get Redirector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setAlwaysLog	TokenNameIdentifier	 set Always Log
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterChain	TokenNameIdentifier	 Filter Chain
outputFilterChain	TokenNameIdentifier	 output Filter Chain
=	TokenNameEQUAL	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
createOutputFilterChain	TokenNameIdentifier	 create Output Filter Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputFilterChain	TokenNameIdentifier	 output Filter Chain
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
outputCache	TokenNameIdentifier	 output Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
sources	TokenNameIdentifier	 sources
=	TokenNameEQUAL	
createUnifiedSourcePath	TokenNameIdentifier	 create Unified Source Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileProvider	TokenNameIdentifier	 File Provider
fr	TokenNameIdentifier	 fr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileProvider	TokenNameIdentifier	 File Provider
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
FileProvider	TokenNameIdentifier	 File Provider
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
verifyOneJar	TokenNameIdentifier	 verify One Jar
(	TokenNameLPAREN	
fr	TokenNameIdentifier	 fr
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
endExecution	TokenNameIdentifier	 end Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * verify a JAR. * @param jar the jar to verify. * @throws BuildException if the file could not be verified */	TokenNameCOMMENT_JAVADOC	 verify a JAR. @param jar the jar to verify. @throws BuildException if the file could not be verified 
private	TokenNameprivate	
void	TokenNamevoid	
verifyOneJar	TokenNameIdentifier	 verify One Jar
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
jar	TokenNameIdentifier	 jar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
jar	TokenNameIdentifier	 jar
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_FILE	TokenNameIdentifier	 ERROR  NO  FILE
+	TokenNamePLUS	
jar	TokenNameIdentifier	 jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ExecTask	TokenNameIdentifier	 Exec Task
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
createJarSigner	TokenNameIdentifier	 create Jar Signer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCommonOptions	TokenNameIdentifier	 set Common Options
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bindToKeystore	TokenNameIdentifier	 bind To Keystore
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//verify special operations 	TokenNameCOMMENT_LINE	verify special operations 
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-verify"	TokenNameStringLiteral	-verify
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
certificates	TokenNameIdentifier	 certificates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-certs"	TokenNameStringLiteral	-certs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//JAR is required 	TokenNameCOMMENT_LINE	JAR is required 
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
jar	TokenNameIdentifier	 jar
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Verifying JAR: "	TokenNameStringLiteral	Verifying JAR: 
+	TokenNamePLUS	
jar	TokenNameIdentifier	 jar
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputCache	TokenNameIdentifier	 output Cache
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
outputCache	TokenNameIdentifier	 output Cache
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//deal with jdk1.4.2 bug: 	TokenNameCOMMENT_LINE	deal with jdk1.4.2 bug: 
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"zip file closed"	TokenNameStringLiteral	zip file closed
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"You are running "	TokenNameStringLiteral	You are running 
+	TokenNamePLUS	
JARSIGNER_COMMAND	TokenNameIdentifier	 JARSIGNER  COMMAND
+	TokenNamePLUS	
" against a JVM with"	TokenNameStringLiteral	 against a JVM with
+	TokenNamePLUS	
" a known bug that manifests as an IllegalStateException."	TokenNameStringLiteral	 a known bug that manifests as an IllegalStateException.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
VERIFIED_TEXT	TokenNameIdentifier	 VERIFIED  TEXT
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_VERIFY	TokenNameIdentifier	 ERROR  NO  VERIFY
+	TokenNamePLUS	
jar	TokenNameIdentifier	 jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * we are not thread safe here. Do not use on multiple threads at the same time. */	TokenNameCOMMENT_JAVADOC	 we are not thread safe here. Do not use on multiple threads at the same time. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
BufferingOutputFilter	TokenNameIdentifier	 Buffering Output Filter
implements	TokenNameimplements	
ChainableReader	TokenNameIdentifier	 Chainable Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
BufferingOutputFilterReader	TokenNameIdentifier	 Buffering Output Filter Reader
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
chain	TokenNameIdentifier	 chain
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
BufferingOutputFilterReader	TokenNameIdentifier	 Buffering Output Filter Reader
(	TokenNameLPAREN	
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * catch the output of the buffer */	TokenNameCOMMENT_JAVADOC	 catch the output of the buffer 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
BufferingOutputFilterReader	TokenNameIdentifier	 Buffering Output Filter Reader
extends	TokenNameextends	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
Reader	TokenNameIdentifier	 Reader
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BufferingOutputFilterReader	TokenNameIdentifier	 Buffering Output Filter Reader
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//hand down 	TokenNameCOMMENT_LINE	hand down 
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//cache 	TokenNameCOMMENT_LINE	cache 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//return 	TokenNameCOMMENT_LINE	return 
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
