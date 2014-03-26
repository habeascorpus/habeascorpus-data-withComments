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
extension	TokenNameIdentifier	 extension
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
jar	TokenNameIdentifier	 jar
.	TokenNameDOT	
Manifest	TokenNameIdentifier	 Manifest
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
Task	TokenNameIdentifier	 Task
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
resolvers	TokenNameIdentifier	 resolvers
.	TokenNameDOT	
AntResolver	TokenNameIdentifier	 Ant Resolver
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
resolvers	TokenNameIdentifier	 resolvers
.	TokenNameDOT	
LocationResolver	TokenNameIdentifier	 Location Resolver
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
resolvers	TokenNameIdentifier	 resolvers
.	TokenNameDOT	
URLResolver	TokenNameIdentifier	 URL Resolver
;	TokenNameSEMICOLON	
/** * Tries to locate a JAR to satisfy an extension and place * location of JAR into property. * * @ant.task name="jarlib-resolve" */	TokenNameCOMMENT_JAVADOC	 Tries to locate a JAR to satisfy an extension and place location of JAR into property. * @ant.task name="jarlib-resolve" 
public	TokenNamepublic	
class	TokenNameclass	
JarLibResolveTask	TokenNameIdentifier	 Jar Lib Resolve Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * The name of the property in which the location of * library is stored. */	TokenNameCOMMENT_JAVADOC	 The name of the property in which the location of library is stored. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
;	TokenNameSEMICOLON	
/** * The extension that is required. */	TokenNameCOMMENT_JAVADOC	 The extension that is required. 
private	TokenNameprivate	
Extension	TokenNameIdentifier	 Extension
requiredExtension	TokenNameIdentifier	 required Extension
;	TokenNameSEMICOLON	
/** * The set of resolvers to use to attempt to locate library. */	TokenNameCOMMENT_JAVADOC	 The set of resolvers to use to attempt to locate library. 
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
resolvers	TokenNameIdentifier	 resolvers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Flag to indicate that you should check that * the librarys resolved actually contain * extension and if they don't then raise * an exception. */	TokenNameCOMMENT_JAVADOC	 Flag to indicate that you should check that the librarys resolved actually contain extension and if they don't then raise an exception. 
private	TokenNameprivate	
boolean	TokenNameboolean	
checkExtension	TokenNameIdentifier	 check Extension
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Flag indicating whether or not you should * throw a BuildException if you cannot resolve * library. */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether or not you should throw a BuildException if you cannot resolve library. 
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * The name of the property in which the location of * library is stored. * * @param property The name of the property in which the location of * library is stored. */	TokenNameCOMMENT_JAVADOC	 The name of the property in which the location of library is stored. * @param property The name of the property in which the location of library is stored. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
propertyName	TokenNameIdentifier	 property Name
=	TokenNameEQUAL	
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check nested libraries for extensions * * @param checkExtension if true, libraries returned by nested * resolvers should be checked to see if they supply extension. */	TokenNameCOMMENT_JAVADOC	 Check nested libraries for extensions * @param checkExtension if true, libraries returned by nested resolvers should be checked to see if they supply extension. 
public	TokenNamepublic	
void	TokenNamevoid	
setCheckExtension	TokenNameIdentifier	 set Check Extension
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
checkExtension	TokenNameIdentifier	 check Extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
checkExtension	TokenNameIdentifier	 check Extension
=	TokenNameEQUAL	
checkExtension	TokenNameIdentifier	 check Extension
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether to fail if error. * * @param failOnError if true, failure to locate library should fail build. */	TokenNameCOMMENT_JAVADOC	 Set whether to fail if error. * @param failOnError if true, failure to locate library should fail build. 
public	TokenNamepublic	
void	TokenNamevoid	
setFailOnError	TokenNameIdentifier	 set Fail On Error
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
failOnError	TokenNameIdentifier	 fail On Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds location resolver to look for a library in a location * relative to project directory. * * @param loc the resolver location to search. */	TokenNameCOMMENT_JAVADOC	 Adds location resolver to look for a library in a location relative to project directory. * @param loc the resolver location to search. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredLocation	TokenNameIdentifier	 add Configured Location
(	TokenNameLPAREN	
final	TokenNamefinal	
LocationResolver	TokenNameIdentifier	 Location Resolver
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolvers	TokenNameIdentifier	 resolvers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a URL resolver to download a library from a URL * to a local file. * * @param url the URL resolver from which to download the library */	TokenNameCOMMENT_JAVADOC	 Adds a URL resolver to download a library from a URL to a local file. * @param url the URL resolver from which to download the library 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredUrl	TokenNameIdentifier	 add Configured Url
(	TokenNameLPAREN	
final	TokenNamefinal	
URLResolver	TokenNameIdentifier	 URL Resolver
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolvers	TokenNameIdentifier	 resolvers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds Ant resolver to run an Ant build file to generate a library. * * @param ant the AntResolver to generate the library. */	TokenNameCOMMENT_JAVADOC	 Adds Ant resolver to run an Ant build file to generate a library. * @param ant the AntResolver to generate the library. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredAnt	TokenNameIdentifier	 add Configured Ant
(	TokenNameLPAREN	
final	TokenNamefinal	
AntResolver	TokenNameIdentifier	 Ant Resolver
ant	TokenNameIdentifier	 ant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolvers	TokenNameIdentifier	 resolvers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ant	TokenNameIdentifier	 ant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the Extension looking for. * * @param extension Set the Extension looking for. */	TokenNameCOMMENT_JAVADOC	 Set the Extension looking for. * @param extension Set the Extension looking for. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredExtension	TokenNameIdentifier	 add Configured Extension
(	TokenNameLPAREN	
final	TokenNamefinal	
ExtensionAdapter	TokenNameIdentifier	 Extension Adapter
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
requiredExtension	TokenNameIdentifier	 required Extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Can not specify extension to "	TokenNameStringLiteral	Can not specify extension to 
+	TokenNamePLUS	
"resolve multiple times."	TokenNameStringLiteral	resolve multiple times.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
requiredExtension	TokenNameIdentifier	 required Extension
=	TokenNameEQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
toExtension	TokenNameIdentifier	 to Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the task. * * @throws BuildException if the task fails. */	TokenNameCOMMENT_JAVADOC	 Execute the task. * @throws BuildException if the task fails. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Resolving extension: "	TokenNameStringLiteral	Resolving extension: 
+	TokenNamePLUS	
requiredExtension	TokenNameIdentifier	 required Extension
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
candidate	TokenNameIdentifier	 candidate
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Property Already set to: "	TokenNameStringLiteral	Property Already set to: 
+	TokenNamePLUS	
candidate	TokenNameIdentifier	 candidate
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
resolvers	TokenNameIdentifier	 resolvers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ExtensionResolver	TokenNameIdentifier	 Extension Resolver
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionResolver	TokenNameIdentifier	 Extension Resolver
)	TokenNameRPAREN	
resolvers	TokenNameIdentifier	 resolvers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Searching for extension using Resolver:"	TokenNameStringLiteral	Searching for extension using Resolver:
+	TokenNamePLUS	
resolver	TokenNameIdentifier	 resolver
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
requiredExtension	TokenNameIdentifier	 required Extension
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
checkExtension	TokenNameIdentifier	 check Extension
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"File "	TokenNameStringLiteral	File 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" returned by "	TokenNameStringLiteral	 returned by 
+	TokenNamePLUS	
"resolver failed to satisfy extension due to: "	TokenNameStringLiteral	resolver failed to satisfy extension due to: 
+	TokenNamePLUS	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Failed to resolve extension to file "	TokenNameStringLiteral	Failed to resolve extension to file 
+	TokenNamePLUS	
"using resolver "	TokenNameStringLiteral	using resolver 
+	TokenNamePLUS	
resolver	TokenNameIdentifier	 resolver
+	TokenNamePLUS	
" due to: "	TokenNameStringLiteral	 due to: 
+	TokenNamePLUS	
be	TokenNameIdentifier	 be
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
missingExtension	TokenNameIdentifier	 missing Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method that will throw a {@link BuildException} * if {@link #failOnError} is true else it just displays * a warning. */	TokenNameCOMMENT_JAVADOC	 Utility method that will throw a {@link BuildException} if {@link #failOnError} is true else it just displays a warning. 
private	TokenNameprivate	
void	TokenNamevoid	
missingExtension	TokenNameIdentifier	 missing Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Unable to resolve extension to a file"	TokenNameStringLiteral	Unable to resolve extension to a file
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if specified file satisfies extension. * If it does then set the relevent property * else throw a BuildException. * * @param file the candidate library * @throws BuildException if library does not satisfy extension */	TokenNameCOMMENT_JAVADOC	 Check if specified file satisfies extension. If it does then set the relevent property else throw a BuildException. * @param file the candidate library @throws BuildException if library does not satisfy extension 
private	TokenNameprivate	
void	TokenNamevoid	
checkExtension	TokenNameIdentifier	 check Extension
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
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
"File "	TokenNameStringLiteral	File 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" does not exist"	TokenNameStringLiteral	 does not exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"File "	TokenNameStringLiteral	File 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" is not a file"	TokenNameStringLiteral	 is not a file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
checkExtension	TokenNameIdentifier	 check Extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Setting property to "	TokenNameStringLiteral	Setting property to 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" without verifying library satisfies extension"	TokenNameStringLiteral	 without verifying library satisfies extension
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLibraryProperty	TokenNameIdentifier	 set Library Property
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Checking file "	TokenNameStringLiteral	Checking file 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" to see if it satisfies extension"	TokenNameStringLiteral	 to see if it satisfies extension
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
ExtensionUtil	TokenNameIdentifier	 Extension Util
.	TokenNameDOT	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extensions	TokenNameIdentifier	 extensions
=	TokenNameEQUAL	
Extension	TokenNameIdentifier	 Extension
.	TokenNameDOT	
getAvailable	TokenNameIdentifier	 get Available
(	TokenNameLPAREN	
manifest	TokenNameIdentifier	 manifest
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
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
extensions	TokenNameIdentifier	 extensions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
isCompatibleWith	TokenNameIdentifier	 is Compatible With
(	TokenNameLPAREN	
requiredExtension	TokenNameIdentifier	 required Extension
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLibraryProperty	TokenNameIdentifier	 set Library Property
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"File "	TokenNameStringLiteral	File 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" skipped as it "	TokenNameStringLiteral	 skipped as it 
+	TokenNamePLUS	
"does not satisfy extension"	TokenNameStringLiteral	does not satisfy extension
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Utility method to set the appropriate property * to indicate that specified file satisfies library * requirements. * * @param file the library */	TokenNameCOMMENT_JAVADOC	 Utility method to set the appropriate property to indicate that specified file satisfies library requirements. * @param file the library 
private	TokenNameprivate	
void	TokenNamevoid	
setLibraryProperty	TokenNameIdentifier	 set Library Property
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validate the tasks parameters. * * @throws BuildException if invalid parameters found */	TokenNameCOMMENT_JAVADOC	 Validate the tasks parameters. * @throws BuildException if invalid parameters found 
private	TokenNameprivate	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Property attribute must be specified."	TokenNameStringLiteral	Property attribute must be specified.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
requiredExtension	TokenNameIdentifier	 required Extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Extension element must be specified."	TokenNameStringLiteral	Extension element must be specified.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
