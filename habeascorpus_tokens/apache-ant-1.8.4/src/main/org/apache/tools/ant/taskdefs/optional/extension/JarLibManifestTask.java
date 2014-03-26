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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
ArrayList	TokenNameIdentifier	 Array List
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
jar	TokenNameIdentifier	 jar
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
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
MagicNames	TokenNameIdentifier	 Magic Names
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
/** * Generates a manifest that declares all the dependencies. * The dependencies are determined by looking in the * specified path and searching for Extension / "Optional Package" * specifications in the manifests of the jars. * * <p>Prior to JDK1.3, an "Optional Package" was known as an Extension. * The specification for this mechanism is available in the JDK1.3 * documentation in the directory * $JDK_HOME/docs/guide/extensions/versioning.html. Alternatively it is * available online at <a href="http://java.sun.com/j2se/1.3/docs/guide/extensions/versioning.html"> * http://java.sun.com/j2se/1.3/docs/guide/extensions/versioning.html</a>.</p> * * @ant.task name="jarlib-manifest" */	TokenNameCOMMENT_JAVADOC	 Generates a manifest that declares all the dependencies. The dependencies are determined by looking in the specified path and searching for Extension / "Optional Package" specifications in the manifests of the jars. * <p>Prior to JDK1.3, an "Optional Package" was known as an Extension. The specification for this mechanism is available in the JDK1.3 documentation in the directory $JDK_HOME/docs/guide/extensions/versioning.html. Alternatively it is available online at <a href="http://java.sun.com/j2se/1.3/docs/guide/extensions/versioning.html"> http://java.sun.com/j2se/1.3/docs/guide/extensions/versioning.html</a>.</p> * @ant.task name="jarlib-manifest" 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
JarLibManifestTask	TokenNameIdentifier	 Jar Lib Manifest Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * Version of manifest spec that task generates. */	TokenNameCOMMENT_JAVADOC	 Version of manifest spec that task generates. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MANIFEST_VERSION	TokenNameIdentifier	 MANIFEST  VERSION
=	TokenNameEQUAL	
"1.0"	TokenNameStringLiteral	1.0
;	TokenNameSEMICOLON	
/** * "Created-By" string used when creating manifest. */	TokenNameCOMMENT_JAVADOC	 "Created-By" string used when creating manifest. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CREATED_BY	TokenNameIdentifier	 CREATED  BY
=	TokenNameEQUAL	
"Created-By"	TokenNameStringLiteral	Created-By
;	TokenNameSEMICOLON	
/** * The library to display information about. */	TokenNameCOMMENT_JAVADOC	 The library to display information about. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
destFile	TokenNameIdentifier	 dest File
;	TokenNameSEMICOLON	
/** * The extension supported by this library (if any). */	TokenNameCOMMENT_JAVADOC	 The extension supported by this library (if any). 
private	TokenNameprivate	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
/** * ExtensionAdapter objects representing * dependencies required by library. */	TokenNameCOMMENT_JAVADOC	 ExtensionAdapter objects representing dependencies required by library. 
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * ExtensionAdapter objects representing optional * dependencies required by library. */	TokenNameCOMMENT_JAVADOC	 ExtensionAdapter objects representing optional dependencies required by library. 
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
optionals	TokenNameIdentifier	 optionals
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Extra attributes the user specifies for main section * in manifest. */	TokenNameCOMMENT_JAVADOC	 Extra attributes the user specifies for main section in manifest. 
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
extraAttributes	TokenNameIdentifier	 extra Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The location where generated manifest is placed. * * @param destFile The location where generated manifest is placed. */	TokenNameCOMMENT_JAVADOC	 The location where generated manifest is placed. * @param destFile The location where generated manifest is placed. 
public	TokenNamepublic	
void	TokenNamevoid	
setDestfile	TokenNameIdentifier	 set Destfile
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
destFile	TokenNameIdentifier	 dest File
=	TokenNameEQUAL	
destFile	TokenNameIdentifier	 dest File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an extension that this library implements. * * @param extensionAdapter an extension that this library implements. * * @throws BuildException if there is multiple extensions detected * in the library. */	TokenNameCOMMENT_JAVADOC	 Adds an extension that this library implements. * @param extensionAdapter an extension that this library implements. * @throws BuildException if there is multiple extensions detected in the library. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredExtension	TokenNameIdentifier	 add Configured Extension
(	TokenNameLPAREN	
final	TokenNamefinal	
ExtensionAdapter	TokenNameIdentifier	 Extension Adapter
extensionAdapter	TokenNameIdentifier	 extension Adapter
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Can not have multiple extensions defined in one library."	TokenNameStringLiteral	Can not have multiple extensions defined in one library.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
extensionAdapter	TokenNameIdentifier	 extension Adapter
.	TokenNameDOT	
toExtension	TokenNameIdentifier	 to Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a set of extensions that this library requires. * * @param extensionSet a set of extensions that this library requires. */	TokenNameCOMMENT_JAVADOC	 Adds a set of extensions that this library requires. * @param extensionSet a set of extensions that this library requires. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredDepends	TokenNameIdentifier	 add Configured Depends
(	TokenNameLPAREN	
final	TokenNamefinal	
ExtensionSet	TokenNameIdentifier	 Extension Set
extensionSet	TokenNameIdentifier	 extension Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extensionSet	TokenNameIdentifier	 extension Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a set of extensions that this library optionally requires. * * @param extensionSet a set of extensions that this library optionally requires. */	TokenNameCOMMENT_JAVADOC	 Adds a set of extensions that this library optionally requires. * @param extensionSet a set of extensions that this library optionally requires. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredOptions	TokenNameIdentifier	 add Configured Options
(	TokenNameLPAREN	
final	TokenNamefinal	
ExtensionSet	TokenNameIdentifier	 Extension Set
extensionSet	TokenNameIdentifier	 extension Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionals	TokenNameIdentifier	 optionals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extensionSet	TokenNameIdentifier	 extension Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an attribute that is to be put in main section of manifest. * * @param attribute an attribute that is to be put in main section of manifest. */	TokenNameCOMMENT_JAVADOC	 Adds an attribute that is to be put in main section of manifest. * @param attribute an attribute that is to be put in main section of manifest. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredAttribute	TokenNameIdentifier	 add Configured Attribute
(	TokenNameLPAREN	
final	TokenNamefinal	
ExtraAttribute	TokenNameIdentifier	 Extra Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extraAttributes	TokenNameIdentifier	 extra Attributes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
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
final	TokenNamefinal	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
new	TokenNamenew	
Manifest	TokenNameIdentifier	 Manifest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getMainAttributes	TokenNameIdentifier	 get Main Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
MANIFEST_VERSION	TokenNameIdentifier	 MANIFEST  VERSION
,	TokenNameCOMMA	
MANIFEST_VERSION	TokenNameIdentifier	 MANIFEST  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
putValue	TokenNameIdentifier	 put Value
(	TokenNameLPAREN	
CREATED_BY	TokenNameIdentifier	 CREATED  BY
,	TokenNameCOMMA	
"Apache Ant "	TokenNameStringLiteral	Apache Ant 
+	TokenNamePLUS	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
ANT_VERSION	TokenNameIdentifier	 ANT  VERSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendExtraAttributes	TokenNameIdentifier	 append Extra Attributes
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Extension	TokenNameIdentifier	 Extension
.	TokenNameDOT	
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Add all the dependency data to manifest for dependencies 	TokenNameCOMMENT_LINE	Add all the dependency data to manifest for dependencies 
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
depends	TokenNameIdentifier	 depends
=	TokenNameEQUAL	
toExtensions	TokenNameIdentifier	 to Extensions
(	TokenNameLPAREN	
dependencies	TokenNameIdentifier	 dependencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendExtensionList	TokenNameIdentifier	 append Extension List
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Extension	TokenNameIdentifier	 Extension
.	TokenNameDOT	
EXTENSION_LIST	TokenNameIdentifier	 EXTENSION  LIST
,	TokenNameCOMMA	
"lib"	TokenNameStringLiteral	lib
,	TokenNameCOMMA	
depends	TokenNameIdentifier	 depends
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendLibraryList	TokenNameIdentifier	 append Library List
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
"lib"	TokenNameStringLiteral	lib
,	TokenNameCOMMA	
depends	TokenNameIdentifier	 depends
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add all the dependency data to manifest for "optional" 	TokenNameCOMMENT_LINE	Add all the dependency data to manifest for "optional" 
//dependencies 	TokenNameCOMMENT_LINE	dependencies 
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
option	TokenNameIdentifier	 option
=	TokenNameEQUAL	
toExtensions	TokenNameIdentifier	 to Extensions
(	TokenNameLPAREN	
optionals	TokenNameIdentifier	 optionals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendExtensionList	TokenNameIdentifier	 append Extension List
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Extension	TokenNameIdentifier	 Extension
.	TokenNameDOT	
OPTIONAL_EXTENSION_LIST	TokenNameIdentifier	 OPTIONAL  EXTENSION  LIST
,	TokenNameCOMMA	
"opt"	TokenNameStringLiteral	opt
,	TokenNameCOMMA	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendLibraryList	TokenNameIdentifier	 append Library List
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
"opt"	TokenNameStringLiteral	opt
,	TokenNameCOMMA	
option	TokenNameIdentifier	 option
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Generating manifest "	TokenNameStringLiteral	Generating manifest 
+	TokenNamePLUS	
destFile	TokenNameIdentifier	 dest File
.	TokenNameDOT	
getAbsoluteFile	TokenNameIdentifier	 get Absolute File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeManifest	TokenNameIdentifier	 write Manifest
(	TokenNameLPAREN	
manifest	TokenNameIdentifier	 manifest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Destfile attribute not specified."	TokenNameStringLiteral	Destfile attribute not specified.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
destFile	TokenNameIdentifier	 dest File
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
destFile	TokenNameIdentifier	 dest File
+	TokenNamePLUS	
" is not a file."	TokenNameStringLiteral	 is not a file.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add any extra attributes to the manifest. * * @param attributes the manifest section to write * attributes to */	TokenNameCOMMENT_JAVADOC	 Add any extra attributes to the manifest. * @param attributes the manifest section to write attributes to 
private	TokenNameprivate	
void	TokenNamevoid	
appendExtraAttributes	TokenNameIdentifier	 append Extra Attributes
(	TokenNameLPAREN	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
extraAttributes	TokenNameIdentifier	 extra Attributes
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ExtraAttribute	TokenNameIdentifier	 Extra Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtraAttribute	TokenNameIdentifier	 Extra Attribute
)	TokenNameRPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
putValue	TokenNameIdentifier	 put Value
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write out manifest to destfile. * * @param manifest the manifest * @throws IOException if error writing file */	TokenNameCOMMENT_JAVADOC	 Write out manifest to destfile. * @param manifest the manifest @throws IOException if error writing file 
private	TokenNameprivate	
void	TokenNamevoid	
writeManifest	TokenNameIdentifier	 write Manifest
(	TokenNameLPAREN	
final	TokenNamefinal	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileOutputStream	TokenNameIdentifier	 File Output Stream
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append specified extensions to specified attributes. * Use the extensionKey to list the extensions, usually "Extension-List:" * for required dependencies and "Optional-Extension-List:" for optional * dependencies. NOTE: "Optional" dependencies are not part of the * specification. * * @param attributes the attributes to add extensions to * @param extensions the list of extensions * @throws BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Append specified extensions to specified attributes. Use the extensionKey to list the extensions, usually "Extension-List:" for required dependencies and "Optional-Extension-List:" for optional dependencies. NOTE: "Optional" dependencies are not part of the specification. * @param attributes the attributes to add extensions to @param extensions the list of extensions @throws BuildException if an error occurs 
private	TokenNameprivate	
void	TokenNamevoid	
appendLibraryList	TokenNameIdentifier	 append Library List
(	TokenNameLPAREN	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
listPrefix	TokenNameIdentifier	 list Prefix
,	TokenNameCOMMA	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
extensions	TokenNameIdentifier	 extensions
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
extensions	TokenNameIdentifier	 extensions
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
Extension	TokenNameIdentifier	 Extension
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Extension	TokenNameIdentifier	 Extension
)	TokenNameRPAREN	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
listPrefix	TokenNameIdentifier	 list Prefix
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
Extension	TokenNameIdentifier	 Extension
.	TokenNameDOT	
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append an attribute such as "Extension-List: lib0 lib1 lib2" * using specified prefix and counting up to specified size. * Also use specified extensionKey so that can generate list of * optional dependencies aswell. * * @param size the number of librarys to list * @param listPrefix the prefix for all librarys * @param attributes the attributes to add key-value to * @param extensionKey the key to use */	TokenNameCOMMENT_JAVADOC	 Append an attribute such as "Extension-List: lib0 lib1 lib2" using specified prefix and counting up to specified size. Also use specified extensionKey so that can generate list of optional dependencies aswell. * @param size the number of librarys to list @param listPrefix the prefix for all librarys @param attributes the attributes to add key-value to @param extensionKey the key to use 
private	TokenNameprivate	
void	TokenNamevoid	
appendExtensionList	TokenNameIdentifier	 append Extension List
(	TokenNameLPAREN	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
extensionKey	TokenNameIdentifier	 extension Key
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
listPrefix	TokenNameIdentifier	 list Prefix
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
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
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
listPrefix	TokenNameIdentifier	 list Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//add in something like 	TokenNameCOMMENT_LINE	add in something like 
//"Extension-List: javahelp java3d" 	TokenNameCOMMENT_LINE	"Extension-List: javahelp java3d" 
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
extensionKey	TokenNameIdentifier	 extension Key
,	TokenNameCOMMA	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a list of ExtensionSet objects to extensions. * * @param extensionSets the list of ExtensionSets to add to list * @throws BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Convert a list of ExtensionSet objects to extensions. * @param extensionSets the list of ExtensionSets to add to list @throws BuildException if an error occurs 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
toExtensions	TokenNameIdentifier	 to Extensions
(	TokenNameLPAREN	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
extensionSets	TokenNameIdentifier	 extension Sets
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
extensionSets	TokenNameIdentifier	 extension Sets
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
ExtensionSet	TokenNameIdentifier	 Extension Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionSet	TokenNameIdentifier	 Extension Set
)	TokenNameRPAREN	
extensionSets	TokenNameIdentifier	 extension Sets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extensions	TokenNameIdentifier	 extensions
=	TokenNameEQUAL	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
toExtensions	TokenNameIdentifier	 to Extensions
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extensions	TokenNameIdentifier	 extensions
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
results	TokenNameIdentifier	 results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
