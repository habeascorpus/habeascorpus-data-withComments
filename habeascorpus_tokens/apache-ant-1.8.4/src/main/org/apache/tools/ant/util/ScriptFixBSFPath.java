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
util	TokenNameIdentifier	 util
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
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
/** * A class to modify a classloader to * support BSF language support. */	TokenNameCOMMENT_JAVADOC	 A class to modify a classloader to support BSF language support. 
public	TokenNamepublic	
class	TokenNameclass	
ScriptFixBSFPath	TokenNameIdentifier	 Script Fix BSF Path
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UTIL_OPTIONAL_PACKAGE	TokenNameIdentifier	 UTIL  OPTIONAL  PACKAGE
=	TokenNameEQUAL	
"org.apache.tools.ant.util.optional"	TokenNameStringLiteral	org.apache.tools.ant.util.optional
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BSF_PACKAGE	TokenNameIdentifier	 BSF  PACKAGE
=	TokenNameEQUAL	
"org.apache.bsf"	TokenNameStringLiteral	org.apache.bsf
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
=	TokenNameEQUAL	
BSF_PACKAGE	TokenNameIdentifier	 BSF  PACKAGE
+	TokenNamePLUS	
".BSFManager"	TokenNameStringLiteral	.BSFManager
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BSF_SCRIPT_RUNNER	TokenNameIdentifier	 BSF  SCRIPT  RUNNER
=	TokenNameEQUAL	
UTIL_OPTIONAL_PACKAGE	TokenNameIdentifier	 UTIL  OPTIONAL  PACKAGE
+	TokenNamePLUS	
".ScriptRunner"	TokenNameStringLiteral	.ScriptRunner
;	TokenNameSEMICOLON	
/** * The following are languages that have * scripting engines embedded in bsf.jar. * The array is converted to a map of * languagename->classname. */	TokenNameCOMMENT_JAVADOC	 The following are languages that have scripting engines embedded in bsf.jar. The array is converted to a map of languagename->classname. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BSF_LANGUAGES	TokenNameIdentifier	 BSF  LANGUAGES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"js"	TokenNameStringLiteral	js
,	TokenNameCOMMA	
"org.mozilla.javascript.Scriptable"	TokenNameStringLiteral	org.mozilla.javascript.Scriptable
,	TokenNameCOMMA	
"javascript"	TokenNameStringLiteral	javascript
,	TokenNameCOMMA	
"org.mozilla.javascript.Scriptable"	TokenNameStringLiteral	org.mozilla.javascript.Scriptable
,	TokenNameCOMMA	
"jacl"	TokenNameStringLiteral	jacl
,	TokenNameCOMMA	
"tcl.lang.Interp"	TokenNameStringLiteral	tcl.lang.Interp
,	TokenNameCOMMA	
"netrexx"	TokenNameStringLiteral	netrexx
,	TokenNameCOMMA	
"netrexx.lang.Rexx"	TokenNameStringLiteral	netrexx.lang.Rexx
,	TokenNameCOMMA	
"nrx"	TokenNameStringLiteral	nrx
,	TokenNameCOMMA	
"netrexx.lang.Rexx"	TokenNameStringLiteral	netrexx.lang.Rexx
,	TokenNameCOMMA	
"jython"	TokenNameStringLiteral	jython
,	TokenNameCOMMA	
"org.python.core.Py"	TokenNameStringLiteral	org.python.core.Py
,	TokenNameCOMMA	
"py"	TokenNameStringLiteral	py
,	TokenNameCOMMA	
"org.python.core.Py"	TokenNameStringLiteral	org.python.core.Py
,	TokenNameCOMMA	
"xslt"	TokenNameStringLiteral	xslt
,	TokenNameCOMMA	
"org.apache.xpath.objects.XObject"	TokenNameStringLiteral	org.apache.xpath.objects.XObject
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** A map of languages for which the engine in located in bsf */	TokenNameCOMMENT_JAVADOC	 A map of languages for which the engine in located in bsf 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
BSF_LANGUAGE_MAP	TokenNameIdentifier	 BSF  LANGUAGE  MAP
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
BSF_LANGUAGES	TokenNameIdentifier	 BSF  LANGUAGES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BSF_LANGUAGE_MAP	TokenNameIdentifier	 BSF  LANGUAGE  MAP
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
BSF_LANGUAGES	TokenNameIdentifier	 BSF  LANGUAGES
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
BSF_LANGUAGES	TokenNameIdentifier	 BSF  LANGUAGES
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
getClassSource	TokenNameIdentifier	 get Class Source
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
getResourceSource	TokenNameIdentifier	 get Resource Source
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
,	TokenNameCOMMA	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
classNameToResource	TokenNameIdentifier	 class Name To Resource
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
getClassSource	TokenNameIdentifier	 get Class Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClassSource	TokenNameIdentifier	 get Class Source
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if need to mess about with the classloader. * The class loader will need to be modified for two * reasons: * <ol> * <li>language is at a higher level than bsf for engines in bsf, * move bsf. * </li> * <li>bsf is at a higher level than oata.util.optional.ScriptRunner * </li> * </ol> * * Assume a simple model for the loader: * thisloader<-customloader * or * thisloader * * @param loader the classloader to fix. * @param language the language to use. */	TokenNameCOMMENT_JAVADOC	 Check if need to mess about with the classloader. The class loader will need to be modified for two reasons: <ol> <li>language is at a higher level than bsf for engines in bsf, move bsf. </li> <li>bsf is at a higher level than oata.util.optional.ScriptRunner </li> </ol> * Assume a simple model for the loader: thisloader<-customloader or thisloader * @param loader the classloader to fix. @param language the language to use. 
public	TokenNamepublic	
void	TokenNamevoid	
fixClassLoader	TokenNameIdentifier	 fix Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
==	TokenNameEQUAL_EQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
instanceof	TokenNameinstanceof	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
myLoader	TokenNameIdentifier	 my Loader
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
fixLoader	TokenNameIdentifier	 fix Loader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
)	TokenNameRPAREN	
loader	TokenNameIdentifier	 loader
;	TokenNameSEMICOLON	
// Check for location of bsf in this classloader 	TokenNameCOMMENT_LINE	Check for location of bsf in this classloader 
File	TokenNameIdentifier	 File
bsfSource	TokenNameIdentifier	 bsf Source
=	TokenNameEQUAL	
getClassSource	TokenNameIdentifier	 get Class Source
(	TokenNameLPAREN	
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If bsf is not in the classloader for this, need to move 	TokenNameCOMMENT_LINE	If bsf is not in the classloader for this, need to move 
// runner. 	TokenNameCOMMENT_LINE	runner. 
boolean	TokenNameboolean	
needMoveRunner	TokenNameIdentifier	 need Move Runner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bsfSource	TokenNameIdentifier	 bsf Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check for location of language 	TokenNameCOMMENT_LINE	Check for location of language 
String	TokenNameIdentifier	 String
languageClassName	TokenNameIdentifier	 language Class Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
BSF_LANGUAGE_MAP	TokenNameIdentifier	 BSF  LANGUAGE  MAP
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if need to need to move bsf 	TokenNameCOMMENT_LINE	Check if need to need to move bsf 
boolean	TokenNameboolean	
needMoveBsf	TokenNameIdentifier	 need Move Bsf
=	TokenNameEQUAL	
bsfSource	TokenNameIdentifier	 bsf Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
languageClassName	TokenNameIdentifier	 language Class Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
classExists	TokenNameIdentifier	 class Exists
(	TokenNameLPAREN	
myLoader	TokenNameIdentifier	 my Loader
,	TokenNameCOMMA	
languageClassName	TokenNameIdentifier	 language Class Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
classExists	TokenNameIdentifier	 class Exists
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
,	TokenNameCOMMA	
languageClassName	TokenNameIdentifier	 language Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Update need to move runner 	TokenNameCOMMENT_LINE	Update need to move runner 
needMoveRunner	TokenNameIdentifier	 need Move Runner
=	TokenNameEQUAL	
needMoveRunner	TokenNameIdentifier	 need Move Runner
||	TokenNameOR_OR	
needMoveBsf	TokenNameIdentifier	 need Move Bsf
;	TokenNameSEMICOLON	
// Check if bsf in place 	TokenNameCOMMENT_LINE	Check if bsf in place 
if	TokenNameif	
(	TokenNameLPAREN	
bsfSource	TokenNameIdentifier	 bsf Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bsfSource	TokenNameIdentifier	 bsf Source
=	TokenNameEQUAL	
getClassSource	TokenNameIdentifier	 get Class Source
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
,	TokenNameCOMMA	
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bsfSource	TokenNameIdentifier	 bsf Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to find BSF classes for scripting"	TokenNameStringLiteral	Unable to find BSF classes for scripting
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needMoveBsf	TokenNameIdentifier	 need Move Bsf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fixLoader	TokenNameIdentifier	 fix Loader
.	TokenNameDOT	
addPathComponent	TokenNameIdentifier	 add Path Component
(	TokenNameLPAREN	
bsfSource	TokenNameIdentifier	 bsf Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fixLoader	TokenNameIdentifier	 fix Loader
.	TokenNameDOT	
addLoaderPackageRoot	TokenNameIdentifier	 add Loader Package Root
(	TokenNameLPAREN	
BSF_PACKAGE	TokenNameIdentifier	 BSF  PACKAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needMoveRunner	TokenNameIdentifier	 need Move Runner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fixLoader	TokenNameIdentifier	 fix Loader
.	TokenNameDOT	
addPathComponent	TokenNameIdentifier	 add Path Component
(	TokenNameLPAREN	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
getResourceSource	TokenNameIdentifier	 get Resource Source
(	TokenNameLPAREN	
fixLoader	TokenNameIdentifier	 fix Loader
,	TokenNameCOMMA	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
classNameToResource	TokenNameIdentifier	 class Name To Resource
(	TokenNameLPAREN	
BSF_SCRIPT_RUNNER	TokenNameIdentifier	 BSF  SCRIPT  RUNNER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fixLoader	TokenNameIdentifier	 fix Loader
.	TokenNameDOT	
addLoaderPackageRoot	TokenNameIdentifier	 add Loader Package Root
(	TokenNameLPAREN	
UTIL_OPTIONAL_PACKAGE	TokenNameIdentifier	 UTIL  OPTIONAL  PACKAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
