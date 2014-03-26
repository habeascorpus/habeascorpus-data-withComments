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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
jar	TokenNameIdentifier	 jar
.	TokenNameDOT	
JarFile	TokenNameIdentifier	 Jar File
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
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
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
FileSet	TokenNameIdentifier	 File Set
;	TokenNameSEMICOLON	
/** * A set of useful methods relating to extensions. * */	TokenNameCOMMENT_JAVADOC	 A set of useful methods relating to extensions. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ExtensionUtil	TokenNameIdentifier	 Extension Util
{	TokenNameLBRACE	
/** * Class is not meant to be instantiated. */	TokenNameCOMMENT_JAVADOC	 Class is not meant to be instantiated. 
private	TokenNameprivate	
ExtensionUtil	TokenNameIdentifier	 Extension Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//all methods static 	TokenNameCOMMENT_LINE	all methods static 
}	TokenNameRBRACE	
/** * Convert a list of extensionAdapter objects to extensions. * * @param adapters the list of ExtensionAdapterss to add to convert * @throws BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Convert a list of extensionAdapter objects to extensions. * @param adapters the list of ExtensionAdapterss to add to convert @throws BuildException if an error occurs 
static	TokenNamestatic	
ArrayList	TokenNameIdentifier	 Array List
toExtensions	TokenNameIdentifier	 to Extensions
(	TokenNameLPAREN	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
adapters	TokenNameIdentifier	 adapters
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
adapters	TokenNameIdentifier	 adapters
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
ExtensionAdapter	TokenNameIdentifier	 Extension Adapter
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionAdapter	TokenNameIdentifier	 Extension Adapter
)	TokenNameRPAREN	
adapters	TokenNameIdentifier	 adapters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
toExtension	TokenNameIdentifier	 to Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
results	TokenNameIdentifier	 results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generate a list of extensions from a specified fileset. * * @param libraries the list to add extensions to * @param fileset the filesets containing librarys * @throws BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Generate a list of extensions from a specified fileset. * @param libraries the list to add extensions to @param fileset the filesets containing librarys @throws BuildException if an error occurs 
static	TokenNamestatic	
void	TokenNamevoid	
extractExtensions	TokenNameIdentifier	 extract Extensions
(	TokenNameLPAREN	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
libraries	TokenNameIdentifier	 libraries
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extensions	TokenNameIdentifier	 extensions
=	TokenNameEQUAL	
getExtensions	TokenNameIdentifier	 get Extensions
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
fileset	TokenNameIdentifier	 fileset
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
libraries	TokenNameIdentifier	 libraries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extensions	TokenNameIdentifier	 extensions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Retrieve extensions from the specified libraries. * * @param libraries the filesets for libraries * @return the extensions contained in libraries * @throws BuildException if failing to scan libraries */	TokenNameCOMMENT_JAVADOC	 Retrieve extensions from the specified libraries. * @param libraries the filesets for libraries @return the extensions contained in libraries @throws BuildException if failing to scan libraries 
private	TokenNameprivate	
static	TokenNamestatic	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExtensions	TokenNameIdentifier	 get Extensions
(	TokenNameLPAREN	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
libraries	TokenNameIdentifier	 libraries
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
extensions	TokenNameIdentifier	 extensions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
libraries	TokenNameIdentifier	 libraries
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
FileSet	TokenNameIdentifier	 File Set
fileSet	TokenNameIdentifier	 file Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
includeImpl	TokenNameIdentifier	 include Impl
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
includeURL	TokenNameIdentifier	 include URL
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileSet	TokenNameIdentifier	 file Set
instanceof	TokenNameinstanceof	
LibFileSet	TokenNameIdentifier	 Lib File Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LibFileSet	TokenNameIdentifier	 Lib File Set
libFileSet	TokenNameIdentifier	 lib File Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LibFileSet	TokenNameIdentifier	 Lib File Set
)	TokenNameRPAREN	
fileSet	TokenNameIdentifier	 file Set
;	TokenNameSEMICOLON	
includeImpl	TokenNameIdentifier	 include Impl
=	TokenNameEQUAL	
libFileSet	TokenNameIdentifier	 lib File Set
.	TokenNameDOT	
isIncludeImpl	TokenNameIdentifier	 is Include Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
includeURL	TokenNameIdentifier	 include URL
=	TokenNameEQUAL	
libFileSet	TokenNameIdentifier	 lib File Set
.	TokenNameDOT	
isIncludeURL	TokenNameIdentifier	 is Include URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
fileSet	TokenNameIdentifier	 file Set
.	TokenNameDOT	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loadExtensions	TokenNameIdentifier	 load Extensions
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
extensions	TokenNameIdentifier	 extensions
,	TokenNameCOMMA	
includeImpl	TokenNameIdentifier	 include Impl
,	TokenNameCOMMA	
includeURL	TokenNameIdentifier	 include URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load list of available extensions from specified file. * * @param file the file * @param extensionList the list to add available extensions to * @throws BuildException if there is an error */	TokenNameCOMMENT_JAVADOC	 Load list of available extensions from specified file. * @param file the file @param extensionList the list to add available extensions to @throws BuildException if there is an error 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
loadExtensions	TokenNameIdentifier	 load Extensions
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
extensionList	TokenNameIdentifier	 extension List
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
includeImpl	TokenNameIdentifier	 include Impl
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
includeURL	TokenNameIdentifier	 include URL
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
JarFile	TokenNameIdentifier	 Jar File
jarFile	TokenNameIdentifier	 jar File
=	TokenNameEQUAL	
new	TokenNamenew	
JarFile	TokenNameIdentifier	 Jar File
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
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
getManifest	TokenNameIdentifier	 get Manifest
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
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
extensionList	TokenNameIdentifier	 extension List
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
,	TokenNameCOMMA	
includeImpl	TokenNameIdentifier	 include Impl
,	TokenNameCOMMA	
includeURL	TokenNameIdentifier	 include URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add extension to list. * If extension should not have implementation details but * does strip them. If extension should not have url but does * then strip it. * * @param extensionList the list of extensions to add to * @param originalExtension the extension * @param includeImpl false to exclude implementation details * @param includeURL false to exclude implementation URL */	TokenNameCOMMENT_JAVADOC	 Add extension to list. If extension should not have implementation details but does strip them. If extension should not have url but does then strip it. * @param extensionList the list of extensions to add to @param originalExtension the extension @param includeImpl false to exclude implementation details @param includeURL false to exclude implementation URL 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
extensionList	TokenNameIdentifier	 extension List
,	TokenNameCOMMA	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
originalExtension	TokenNameIdentifier	 original Extension
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
includeImpl	TokenNameIdentifier	 include Impl
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
includeURL	TokenNameIdentifier	 include URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
originalExtension	TokenNameIdentifier	 original Extension
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeURL	TokenNameIdentifier	 include URL
&&	TokenNameAND_AND	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationURL	TokenNameIdentifier	 get Implementation URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
new	TokenNamenew	
Extension	TokenNameIdentifier	 Extension
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getExtensionName	TokenNameIdentifier	 get Extension Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getSpecificationVersion	TokenNameIdentifier	 get Specification Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getSpecificationVendor	TokenNameIdentifier	 get Specification Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationVendor	TokenNameIdentifier	 get Implementation Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationVendorID	TokenNameIdentifier	 get Implementation Vendor ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasImplAttributes	TokenNameIdentifier	 has Impl Attributes
=	TokenNameEQUAL	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationURL	TokenNameIdentifier	 get Implementation URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationVendorID	TokenNameIdentifier	 get Implementation Vendor ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationVendor	TokenNameIdentifier	 get Implementation Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeImpl	TokenNameIdentifier	 include Impl
&&	TokenNameAND_AND	
hasImplAttributes	TokenNameIdentifier	 has Impl Attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
new	TokenNamenew	
Extension	TokenNameIdentifier	 Extension
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getExtensionName	TokenNameIdentifier	 get Extension Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getSpecificationVersion	TokenNameIdentifier	 get Specification Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getSpecificationVendor	TokenNameIdentifier	 get Specification Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationURL	TokenNameIdentifier	 get Implementation URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
extensionList	TokenNameIdentifier	 extension List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve manifest for specified file. * * @param file the file * @return the manifest * @throws BuildException if errror occurs (file doesn't exist, * file not a jar, manifest doesn't exist in file) */	TokenNameCOMMENT_JAVADOC	 Retrieve manifest for specified file. * @param file the file @return the manifest @throws BuildException if errror occurs (file doesn't exist, file not a jar, manifest doesn't exist in file) 
static	TokenNamestatic	
Manifest	TokenNameIdentifier	 Manifest
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
JarFile	TokenNameIdentifier	 Jar File
jarFile	TokenNameIdentifier	 jar File
=	TokenNameEQUAL	
new	TokenNamenew	
JarFile	TokenNameIdentifier	 Jar File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
getManifest	TokenNameIdentifier	 get Manifest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" doesn't have a MANIFEST"	TokenNameStringLiteral	 doesn't have a MANIFEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
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
}	TokenNameRBRACE	
