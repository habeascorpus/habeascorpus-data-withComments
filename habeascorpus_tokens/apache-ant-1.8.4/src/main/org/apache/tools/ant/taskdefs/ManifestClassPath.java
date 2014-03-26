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
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
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
launch	TokenNameIdentifier	 launch
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
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
/** * Converts a Path into a property suitable as a Manifest classpath. * * @since Ant 1.7 * * @ant.task category="property" */	TokenNameCOMMENT_JAVADOC	 Converts a Path into a property suitable as a Manifest classpath. * @since Ant 1.7 * @ant.task category="property" 
public	TokenNamepublic	
class	TokenNameclass	
ManifestClassPath	TokenNameIdentifier	 Manifest Class Path
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** The property name to hold the classpath value. */	TokenNameCOMMENT_JAVADOC	 The property name to hold the classpath value. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** The directory the classpath will be relative from. */	TokenNameCOMMENT_JAVADOC	 The directory the classpath will be relative from. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
/** The maximum parent directory level to traverse. */	TokenNameCOMMENT_JAVADOC	 The maximum parent directory level to traverse. 
private	TokenNameprivate	
int	TokenNameint	
maxParentLevels	TokenNameIdentifier	 max Parent Levels
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The classpath to convert. */	TokenNameCOMMENT_JAVADOC	 The classpath to convert. 
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
/** * Sets a property, which must not already exist, with a space * separated list of files and directories relative to the jar * file's parent directory. */	TokenNameCOMMENT_JAVADOC	 Sets a property, which must not already exist, with a space separated list of files and directories relative to the jar file's parent directory. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Missing 'property' attribute!"	TokenNameStringLiteral	Missing 'property' attribute!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Missing 'jarfile' attribute!"	TokenNameStringLiteral	Missing 'jarfile' attribute!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Property '"	TokenNameStringLiteral	Property '
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"' already set!"	TokenNameStringLiteral	' already set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Missing nested <classpath>!"	TokenNameStringLiteral	Missing nested <classpath>!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
tooLongSb	TokenNameIdentifier	 too Long Sb
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
maxParentLevels	TokenNameIdentifier	 max Parent Levels
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tooLongSb	TokenNameIdentifier	 too Long Sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"../"	TokenNameStringLiteral	../
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
tooLongPrefix	TokenNameIdentifier	 too Long Prefix
=	TokenNameEQUAL	
tooLongSb	TokenNameIdentifier	 too Long Sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Normalize the reference directory (containing the jar) 	TokenNameCOMMENT_LINE	Normalize the reference directory (containing the jar) 
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
fileUtils	TokenNameIdentifier	 file Utils
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
fileUtils	TokenNameIdentifier	 file Utils
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
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
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Normalize the current file 	TokenNameCOMMENT_LINE	Normalize the current file 
File	TokenNameIdentifier	 File
pathEntry	TokenNameIdentifier	 path Entry
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fullPath	TokenNameIdentifier	 full Path
=	TokenNameEQUAL	
pathEntry	TokenNameIdentifier	 path Entry
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathEntry	TokenNameIdentifier	 path Entry
=	TokenNameEQUAL	
fileUtils	TokenNameIdentifier	 file Utils
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
fullPath	TokenNameIdentifier	 full Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
relPath	TokenNameIdentifier	 rel Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
canonicalPath	TokenNameIdentifier	 canonical Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
relPath	TokenNameIdentifier	 rel Path
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getRelativePath	TokenNameIdentifier	 get Relative Path
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
pathEntry	TokenNameIdentifier	 path Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
canonicalPath	TokenNameIdentifier	 canonical Path
=	TokenNameEQUAL	
pathEntry	TokenNameIdentifier	 path Entry
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// getRelativePath always uses '/' as separator, adapt 	TokenNameCOMMENT_LINE	getRelativePath always uses '/' as separator, adapt 
if	TokenNameif	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
!=	TokenNameNOT_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
canonicalPath	TokenNameIdentifier	 canonical Path
=	TokenNameEQUAL	
canonicalPath	TokenNameIdentifier	 canonical Path
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"error trying to get the relative path"	TokenNameStringLiteral	error trying to get the relative path
+	TokenNamePLUS	
" from "	TokenNameStringLiteral	 from 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
fullPath	TokenNameIdentifier	 full Path
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// No match, so bail out! 	TokenNameCOMMENT_LINE	No match, so bail out! 
if	TokenNameif	
(	TokenNameLPAREN	
relPath	TokenNameIdentifier	 rel Path
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
canonicalPath	TokenNameIdentifier	 canonical Path
)	TokenNameRPAREN	
||	TokenNameOR_OR	
relPath	TokenNameIdentifier	 rel Path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
tooLongPrefix	TokenNameIdentifier	 too Long Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No suitable relative path from "	TokenNameStringLiteral	No suitable relative path from 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
fullPath	TokenNameIdentifier	 full Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pathEntry	TokenNameIdentifier	 path Entry
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
relPath	TokenNameIdentifier	 rel Path
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
relPath	TokenNameIdentifier	 rel Path
=	TokenNameEQUAL	
relPath	TokenNameIdentifier	 rel Path
+	TokenNamePLUS	
'/'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
relPath	TokenNameIdentifier	 rel Path
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
encodeURI	TokenNameIdentifier	 encode URI
(	TokenNameLPAREN	
relPath	TokenNameIdentifier	 rel Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Manifest's ClassPath: attribute always uses forward 	TokenNameCOMMENT_LINE	Manifest's ClassPath: attribute always uses forward 
// slashes '/', and is space-separated. Ant will properly 	TokenNameCOMMENT_LINE	slashes '/', and is space-separated. Ant will properly 
// format it on 72 columns with proper line continuation 	TokenNameCOMMENT_LINE	format it on 72 columns with proper line continuation 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
relPath	TokenNameIdentifier	 rel Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Finally assign the property with the manifest classpath 	TokenNameCOMMENT_LINE	Finally assign the property with the manifest classpath 
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the property name to hold the classpath value. * * @param name the property name */	TokenNameCOMMENT_JAVADOC	 Sets the property name to hold the classpath value. * @param name the property name 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The JAR file to contain the classpath attribute in its manifest. * * @param jarfile the JAR file. Need not exist yet, but its parent * directory must exist on the other hand. */	TokenNameCOMMENT_JAVADOC	 The JAR file to contain the classpath attribute in its manifest. * @param jarfile the JAR file. Need not exist yet, but its parent directory must exist on the other hand. 
public	TokenNamepublic	
void	TokenNamevoid	
setJarFile	TokenNameIdentifier	 set Jar File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
jarfile	TokenNameIdentifier	 jarfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
jarfile	TokenNameIdentifier	 jarfile
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Jar's directory not found: "	TokenNameStringLiteral	Jar's directory not found: 
+	TokenNamePLUS	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the maximum parent directory levels allowed when computing * a relative path. * * @param levels the max level. Defaults to 2. */	TokenNameCOMMENT_JAVADOC	 Sets the maximum parent directory levels allowed when computing a relative path. * @param levels the max level. Defaults to 2. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxParentLevels	TokenNameIdentifier	 set Max Parent Levels
(	TokenNameLPAREN	
int	TokenNameint	
levels	TokenNameIdentifier	 levels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"maxParentLevels must not be a negative"	TokenNameStringLiteral	maxParentLevels must not be a negative
+	TokenNamePLUS	
" number"	TokenNameStringLiteral	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxParentLevels	TokenNameIdentifier	 max Parent Levels
=	TokenNameEQUAL	
levels	TokenNameIdentifier	 levels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the classpath to convert. * * @param path the classpath to convert. */	TokenNameCOMMENT_JAVADOC	 Adds the classpath to convert. * @param path the classpath to convert. 
public	TokenNamepublic	
void	TokenNamevoid	
addClassPath	TokenNameIdentifier	 add Class Path
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
