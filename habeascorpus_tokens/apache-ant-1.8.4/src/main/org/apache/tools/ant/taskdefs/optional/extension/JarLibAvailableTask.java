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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
/** * Checks whether an extension is present in a fileset or an extensionSet. * * @ant.task name="jarlib-available" */	TokenNameCOMMENT_JAVADOC	 Checks whether an extension is present in a fileset or an extensionSet. * @ant.task name="jarlib-available" 
public	TokenNamepublic	
class	TokenNameclass	
JarLibAvailableTask	TokenNameIdentifier	 Jar Lib Available Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * The library to display information about. */	TokenNameCOMMENT_JAVADOC	 The library to display information about. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
libraryFile	TokenNameIdentifier	 library File
;	TokenNameSEMICOLON	
/** * Filesets specifying all the librarys * to display information about. */	TokenNameCOMMENT_JAVADOC	 Filesets specifying all the librarys to display information about. 
private	TokenNameprivate	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
extensionFileSets	TokenNameIdentifier	 extension File Sets
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The name of the property to set if extension is available. */	TokenNameCOMMENT_JAVADOC	 The name of the property to set if extension is available. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
;	TokenNameSEMICOLON	
/** * The extension that is required. */	TokenNameCOMMENT_JAVADOC	 The extension that is required. 
private	TokenNameprivate	
ExtensionAdapter	TokenNameIdentifier	 Extension Adapter
requiredExtension	TokenNameIdentifier	 required Extension
;	TokenNameSEMICOLON	
/** * The name of property to set if extensions are available. * * @param property The name of property to set if extensions is available. */	TokenNameCOMMENT_JAVADOC	 The name of property to set if extensions are available. * @param property The name of property to set if extensions is available. 
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
/** * The JAR library to check. * * @param file The jar library to check. */	TokenNameCOMMENT_JAVADOC	 The JAR library to check. * @param file The jar library to check. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
libraryFile	TokenNameIdentifier	 library File
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
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
"search for multiple times."	TokenNameStringLiteral	search for multiple times.
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a set of extensions to search in. * * @param extensionSet a set of extensions to search in. */	TokenNameCOMMENT_JAVADOC	 Adds a set of extensions to search in. * @param extensionSet a set of extensions to search in. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredExtensionSet	TokenNameIdentifier	 add Configured Extension Set
(	TokenNameLPAREN	
final	TokenNamefinal	
ExtensionSet	TokenNameIdentifier	 Extension Set
extensionSet	TokenNameIdentifier	 extension Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extensionFileSets	TokenNameIdentifier	 extension File Sets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
extensionSet	TokenNameIdentifier	 extension Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the task. * * @throws BuildException if somethign goes wrong. */	TokenNameCOMMENT_JAVADOC	 Execute the task. * @throws BuildException if somethign goes wrong. 
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
Extension	TokenNameIdentifier	 Extension
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
requiredExtension	TokenNameIdentifier	 required Extension
.	TokenNameDOT	
toExtension	TokenNameIdentifier	 to Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if list of files to check has been specified 	TokenNameCOMMENT_LINE	Check if list of files to check has been specified 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
extensionFileSets	TokenNameIdentifier	 extension File Sets
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
extensionFileSets	TokenNameIdentifier	 extension File Sets
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
ExtensionSet	TokenNameIdentifier	 Extension Set
extensionSet	TokenNameIdentifier	 extension Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionSet	TokenNameIdentifier	 Extension Set
)	TokenNameRPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extensions	TokenNameIdentifier	 extensions
=	TokenNameEQUAL	
extensionSet	TokenNameIdentifier	 extension Set
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
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
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
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
ExtensionUtil	TokenNameIdentifier	 Extension Util
.	TokenNameDOT	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
libraryFile	TokenNameIdentifier	 library File
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
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
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
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
libraryFile	TokenNameIdentifier	 library File
&&	TokenNameAND_AND	
extensionFileSets	TokenNameIdentifier	 extension File Sets
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"File attribute not specified."	TokenNameStringLiteral	File attribute not specified.
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
!=	TokenNameNOT_EQUAL	
libraryFile	TokenNameIdentifier	 library File
&&	TokenNameAND_AND	
!	TokenNameNOT	
libraryFile	TokenNameIdentifier	 library File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"File '"	TokenNameStringLiteral	File '
+	TokenNamePLUS	
libraryFile	TokenNameIdentifier	 library File
+	TokenNamePLUS	
"' does not exist."	TokenNameStringLiteral	' does not exist.
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
!=	TokenNameNOT_EQUAL	
libraryFile	TokenNameIdentifier	 library File
&&	TokenNameAND_AND	
!	TokenNameNOT	
libraryFile	TokenNameIdentifier	 library File
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
libraryFile	TokenNameIdentifier	 library File
+	TokenNamePLUS	
"' is not a file."	TokenNameStringLiteral	' is not a file.
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
