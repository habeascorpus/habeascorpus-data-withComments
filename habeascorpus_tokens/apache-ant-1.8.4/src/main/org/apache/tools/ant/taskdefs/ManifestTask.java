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
FileInputStream	TokenNameIdentifier	 File Input Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
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
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
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
/** * Creates a manifest file for inclusion in a JAR, Ant task wrapper * around {@link Manifest Manifest}. This task can be used to write a * Manifest file, optionally replacing or updating an existing file. * * @since Ant 1.5 * * @ant.task category="java" */	TokenNameCOMMENT_JAVADOC	 Creates a manifest file for inclusion in a JAR, Ant task wrapper around {@link Manifest Manifest}. This task can be used to write a Manifest file, optionally replacing or updating an existing file. * @since Ant 1.5 * @ant.task category="java" 
public	TokenNamepublic	
class	TokenNameclass	
ManifestTask	TokenNameIdentifier	 Manifest Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * Specifies the valid characters which can be used in attribute names. * {@value} */	TokenNameCOMMENT_JAVADOC	 Specifies the valid characters which can be used in attribute names. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALID_ATTRIBUTE_CHARS	TokenNameIdentifier	 VALID  ATTRIBUTE  CHARS
=	TokenNameEQUAL	
"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_"	TokenNameStringLiteral	abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_
;	TokenNameSEMICOLON	
/** * Holds the real data. */	TokenNameCOMMENT_JAVADOC	 Holds the real data. 
private	TokenNameprivate	
Manifest	TokenNameIdentifier	 Manifest
nestedManifest	TokenNameIdentifier	 nested Manifest
=	TokenNameEQUAL	
new	TokenNamenew	
Manifest	TokenNameIdentifier	 Manifest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The file to which the manifest should be written when used as a task */	TokenNameCOMMENT_JAVADOC	 The file to which the manifest should be written when used as a task 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
manifestFile	TokenNameIdentifier	 manifest File
;	TokenNameSEMICOLON	
/** * The mode with which the manifest file is written */	TokenNameCOMMENT_JAVADOC	 The mode with which the manifest file is written 
private	TokenNameprivate	
Mode	TokenNameIdentifier	 Mode
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
/** * The encoding of the manifest file */	TokenNameCOMMENT_JAVADOC	 The encoding of the manifest file 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
/** * whether to merge Class-Path attributes. */	TokenNameCOMMENT_JAVADOC	 whether to merge Class-Path attributes. 
private	TokenNameprivate	
boolean	TokenNameboolean	
mergeClassPaths	TokenNameIdentifier	 merge Class Paths
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * whether to flatten Class-Path attributes into a single one. */	TokenNameCOMMENT_JAVADOC	 whether to flatten Class-Path attributes into a single one. 
private	TokenNameprivate	
boolean	TokenNameboolean	
flattenClassPaths	TokenNameIdentifier	 flatten Class Paths
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Helper class for Manifest's mode attribute. */	TokenNameCOMMENT_JAVADOC	 Helper class for Manifest's mode attribute. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Mode	TokenNameIdentifier	 Mode
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** * Get Allowed values for the mode attribute. * * @return a String array of the allowed values. */	TokenNameCOMMENT_JAVADOC	 Get Allowed values for the mode attribute. * @return a String array of the allowed values. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"update"	TokenNameStringLiteral	update
,	TokenNameCOMMA	
"replace"	TokenNameStringLiteral	replace
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
ManifestTask	TokenNameIdentifier	 Manifest Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
new	TokenNamenew	
Mode	TokenNameIdentifier	 Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"replace"	TokenNameStringLiteral	replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a section to the manifest * * @param section the manifest section to be added * * @exception ManifestException if the section is not valid. */	TokenNameCOMMENT_JAVADOC	 Add a section to the manifest * @param section the manifest section to be added * @exception ManifestException if the section is not valid. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredSection	TokenNameIdentifier	 add Configured Section
(	TokenNameLPAREN	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
Section	TokenNameIdentifier	 Section
section	TokenNameIdentifier	 section
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
attributeKeys	TokenNameIdentifier	 attribute Keys
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getAttributeKeys	TokenNameIdentifier	 get Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
attributeKeys	TokenNameIdentifier	 attribute Keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attributeKeys	TokenNameIdentifier	 attribute Keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAttribute	TokenNameIdentifier	 check Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nestedManifest	TokenNameIdentifier	 nested Manifest
.	TokenNameDOT	
addConfiguredSection	TokenNameIdentifier	 add Configured Section
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an attribute to the manifest - it is added to the main section. * * @param attribute the attribute to be added. * * @exception ManifestException if the attribute is not valid. */	TokenNameCOMMENT_JAVADOC	 Add an attribute to the manifest - it is added to the main section. * @param attribute the attribute to be added. * @exception ManifestException if the attribute is not valid. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredAttribute	TokenNameIdentifier	 add Configured Attribute
(	TokenNameLPAREN	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
checkAttribute	TokenNameIdentifier	 check Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nestedManifest	TokenNameIdentifier	 nested Manifest
.	TokenNameDOT	
addConfiguredAttribute	TokenNameIdentifier	 add Configured Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks the attribute agains the Jar-specification. * * Jar-Specification <i>"Name-Value pairs and Sections"</i>: <pre> * name: alphanum *headerchar * alphanum: {A-Z} | {a-z} | {0-9} * headerchar: alphanum | - | _ * </pre> * So the resulting regexp would be <tt>[A-Za-z0-9][A-Za-z0-9-_]*</tt>. * * Because of JDK 1.2 compliance and the possible absence of a * regexp matcher we can not use regexps here. Instead we have to * check each character. * * @param attribute The attribute to check * @throws BuildException if the check fails */	TokenNameCOMMENT_JAVADOC	 Checks the attribute agains the Jar-specification. * Jar-Specification <i>"Name-Value pairs and Sections"</i>: <pre> name: alphanum *headerchar alphanum: {A-Z} | {a-z} | {0-9} headerchar: alphanum | - | _ </pre> So the resulting regexp would be <tt>[A-Za-z0-9][A-Za-z0-9-_]*</tt>. * Because of JDK 1.2 compliance and the possible absence of a regexp matcher we can not use regexps here. Instead we have to check each character. * @param attribute The attribute to check @throws BuildException if the check fails 
private	TokenNameprivate	
void	TokenNamevoid	
checkAttribute	TokenNameIdentifier	 check Attribute
(	TokenNameLPAREN	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Manifest attribute names must not start with '"	TokenNameStringLiteral	Manifest attribute names must not start with '
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
"'."	TokenNameStringLiteral	'.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VALID_ATTRIBUTE_CHARS	TokenNameIdentifier	 VALID  ATTRIBUTE  CHARS
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Manifest attribute names must not contain '"	TokenNameStringLiteral	Manifest attribute names must not contain '
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The name of the manifest file to create/update. * Required if used as a task. * @param f the Manifest file to be written */	TokenNameCOMMENT_JAVADOC	 The name of the manifest file to create/update. Required if used as a task. @param f the Manifest file to be written 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
manifestFile	TokenNameIdentifier	 manifest File
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The encoding to use for reading in an existing manifest file * @param encoding the manifest file encoding. */	TokenNameCOMMENT_JAVADOC	 The encoding to use for reading in an existing manifest file @param encoding the manifest file encoding. 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Update policy: either "update" or "replace"; default is "replace". * @param m the mode value - update or replace. */	TokenNameCOMMENT_JAVADOC	 Update policy: either "update" or "replace"; default is "replace". @param m the mode value - update or replace. 
public	TokenNamepublic	
void	TokenNamevoid	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
Mode	TokenNameIdentifier	 Mode
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to merge Class-Path attributes. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Whether to merge Class-Path attributes. * @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setMergeClassPathAttributes	TokenNameIdentifier	 set Merge Class Path Attributes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergeClassPaths	TokenNameIdentifier	 merge Class Paths
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to flatten multi-valued attributes (i.e. Class-Path) * into a single one. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Whether to flatten multi-valued attributes (i.e. Class-Path) into a single one. * @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setFlattenAttributes	TokenNameIdentifier	 set Flatten Attributes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flattenClassPaths	TokenNameIdentifier	 flatten Class Paths
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create or update the Manifest when used as a task. * * @throws BuildException if the manifest cannot be written. */	TokenNameCOMMENT_JAVADOC	 Create or update the Manifest when used as a task. * @throws BuildException if the manifest cannot be written. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
manifestFile	TokenNameIdentifier	 manifest File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"the file attribute is required"	TokenNameStringLiteral	the file attribute is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Manifest	TokenNameIdentifier	 Manifest
toWrite	TokenNameIdentifier	 to Write
=	TokenNameEQUAL	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
getDefaultManifest	TokenNameIdentifier	 get Default Manifest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
BuildException	TokenNameIdentifier	 Build Exception
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
manifestFile	TokenNameIdentifier	 manifest File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
isr	TokenNameIdentifier	 isr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
manifestFile	TokenNameIdentifier	 manifest File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isr	TokenNameIdentifier	 isr
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
isr	TokenNameIdentifier	 isr
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
Manifest	TokenNameIdentifier	 Manifest
(	TokenNameLPAREN	
isr	TokenNameIdentifier	 isr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ManifestException	TokenNameIdentifier	 Manifest Exception
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Existing manifest "	TokenNameStringLiteral	Existing manifest 
+	TokenNamePLUS	
manifestFile	TokenNameIdentifier	 manifest File
+	TokenNamePLUS	
" is invalid"	TokenNameStringLiteral	 is invalid
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Failed to read "	TokenNameStringLiteral	Failed to read 
+	TokenNamePLUS	
manifestFile	TokenNameIdentifier	 manifest File
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
isr	TokenNameIdentifier	 isr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//look for and print warnings 	TokenNameCOMMENT_LINE	look for and print warnings 
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
nestedManifest	TokenNameIdentifier	 nested Manifest
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Manifest warning: "	TokenNameStringLiteral	Manifest warning: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"update"	TokenNameStringLiteral	update
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
manifestFile	TokenNameIdentifier	 manifest File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toWrite	TokenNameIdentifier	 to Write
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
mergeClassPaths	TokenNameIdentifier	 merge Class Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
toWrite	TokenNameIdentifier	 to Write
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
nestedManifest	TokenNameIdentifier	 nested Manifest
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
mergeClassPaths	TokenNameIdentifier	 merge Class Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ManifestException	TokenNameIdentifier	 Manifest Exception
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Manifest is invalid"	TokenNameStringLiteral	Manifest is invalid
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toWrite	TokenNameIdentifier	 to Write
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Manifest has not changed, do not recreate"	TokenNameStringLiteral	Manifest has not changed, do not recreate
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PrintWriter	TokenNameIdentifier	 Print Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
manifestFile	TokenNameIdentifier	 manifest File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
fos	TokenNameIdentifier	 fos
,	TokenNameCOMMA	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
JAR_ENCODING	TokenNameIdentifier	 JAR  ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
osw	TokenNameIdentifier	 osw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toWrite	TokenNameIdentifier	 to Write
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
flattenClassPaths	TokenNameIdentifier	 flatten Class Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
checkError	TokenNameIdentifier	 check Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Encountered an error writing manifest"	TokenNameStringLiteral	Encountered an error writing manifest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Failed to write "	TokenNameStringLiteral	Failed to write 
+	TokenNamePLUS	
manifestFile	TokenNameIdentifier	 manifest File
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
