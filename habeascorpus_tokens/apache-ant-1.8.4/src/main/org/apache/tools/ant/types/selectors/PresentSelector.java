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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Mapper	TokenNameIdentifier	 Mapper
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
FileNameMapper	TokenNameIdentifier	 File Name Mapper
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
IdentityMapper	TokenNameIdentifier	 Identity Mapper
;	TokenNameSEMICOLON	
/** * Selector that filters files based on whether they appear in another * directory tree. It can contain a mapper element, so isn't available * as an ExtendSelector (since those parameters can't hold other * elements). * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Selector that filters files based on whether they appear in another directory tree. It can contain a mapper element, so isn't available as an ExtendSelector (since those parameters can't hold other elements). * @since 1.5 
public	TokenNamepublic	
class	TokenNameclass	
PresentSelector	TokenNameIdentifier	 Present Selector
extends	TokenNameextends	
BaseSelector	TokenNameIdentifier	 Base Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
targetdir	TokenNameIdentifier	 targetdir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Mapper	TokenNameIdentifier	 Mapper
mapperElement	TokenNameIdentifier	 mapper Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
destmustexist	TokenNameIdentifier	 destmustexist
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Creates a new <code>PresentSelector</code> instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>PresentSelector</code> instance. 
public	TokenNamepublic	
PresentSelector	TokenNameIdentifier	 Present Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @return a string describing this object */	TokenNameCOMMENT_JAVADOC	 @return a string describing this object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"{presentselector targetdir: "	TokenNameStringLiteral	{presentselector targetdir: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetdir	TokenNameIdentifier	 targetdir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"NOT YET SET"	TokenNameStringLiteral	NOT YET SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
targetdir	TokenNameIdentifier	 targetdir
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" present: "	TokenNameStringLiteral	 present: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
destmustexist	TokenNameIdentifier	 destmustexist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"both"	TokenNameStringLiteral	both
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"srconly"	TokenNameStringLiteral	srconly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
mapperElement	TokenNameIdentifier	 mapper Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mapperElement	TokenNameIdentifier	 mapper Element
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of the file or directory which is checked for matching * files. * * @param targetdir the directory to scan looking for matching files. */	TokenNameCOMMENT_JAVADOC	 The name of the file or directory which is checked for matching files. * @param targetdir the directory to scan looking for matching files. 
public	TokenNamepublic	
void	TokenNamevoid	
setTargetdir	TokenNameIdentifier	 set Targetdir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
targetdir	TokenNameIdentifier	 targetdir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
targetdir	TokenNameIdentifier	 targetdir
=	TokenNameEQUAL	
targetdir	TokenNameIdentifier	 targetdir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Defines the FileNameMapper to use (nested mapper element). * @return a mapper to be configured * @throws BuildException if more than one mapper defined */	TokenNameCOMMENT_JAVADOC	 Defines the FileNameMapper to use (nested mapper element). @return a mapper to be configured @throws BuildException if more than one mapper defined 
public	TokenNamepublic	
Mapper	TokenNameIdentifier	 Mapper
createMapper	TokenNameIdentifier	 create Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
mapperElement	TokenNameIdentifier	 mapper Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot define more than one mapper"	TokenNameStringLiteral	Cannot define more than one mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mapperElement	TokenNameIdentifier	 mapper Element
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mapperElement	TokenNameIdentifier	 mapper Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a configured FileNameMapper instance. * @param fileNameMapper the FileNameMapper to add * @throws BuildException if more than one mapper defined * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Add a configured FileNameMapper instance. @param fileNameMapper the FileNameMapper to add @throws BuildException if more than one mapper defined @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
fileNameMapper	TokenNameIdentifier	 file Name Mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
mapperElement	TokenNameIdentifier	 mapper Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot define more than one mapper"	TokenNameStringLiteral	Cannot define more than one mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This sets whether to select a file if its dest file is present. * It could be a <code>negate</code> boolean, but by doing things * this way, we get some documentation on how the system works. * A user looking at the documentation should clearly understand * that the ONLY files whose presence is being tested are those * that already exist in the source directory, hence the lack of * a <code>destonly</code> option. * * @param fp An attribute set to either <code>srconly</code or * <code>both</code>. */	TokenNameCOMMENT_JAVADOC	 This sets whether to select a file if its dest file is present. It could be a <code>negate</code> boolean, but by doing things this way, we get some documentation on how the system works. A user looking at the documentation should clearly understand that the ONLY files whose presence is being tested are those that already exist in the source directory, hence the lack of a <code>destonly</code> option. * @param fp An attribute set to either <code>srconly</code or <code>both</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setPresent	TokenNameIdentifier	 set Present
(	TokenNameLPAREN	
FilePresence	TokenNameIdentifier	 File Presence
fp	TokenNameIdentifier	 fp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
destmustexist	TokenNameIdentifier	 destmustexist
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks to make sure all settings are kosher. In this case, it * means that the targetdir attribute has been set and we have a mapper. */	TokenNameCOMMENT_JAVADOC	 Checks to make sure all settings are kosher. In this case, it means that the targetdir attribute has been set and we have a mapper. 
public	TokenNamepublic	
void	TokenNamevoid	
verifySettings	TokenNameIdentifier	 verify Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
targetdir	TokenNameIdentifier	 targetdir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"The targetdir attribute is required."	TokenNameStringLiteral	The targetdir attribute is required.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mapperElement	TokenNameIdentifier	 mapper Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityMapper	TokenNameIdentifier	 Identity Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
mapperElement	TokenNameIdentifier	 mapper Element
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Could not set <mapper> element."	TokenNameStringLiteral	Could not set <mapper> element.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The heart of the matter. This is where the selector gets to decide * on the inclusion of a file in a particular fileset. * * @param basedir the base directory the scan is being done from * @param filename is the name of the file to check * @param file is a java.io.File object the selector can use * @return whether the file should be selected or not */	TokenNameCOMMENT_JAVADOC	 The heart of the matter. This is where the selector gets to decide on the inclusion of a file in a particular fileset. * @param basedir the base directory the scan is being done from @param filename is the name of the file to check @param file is a java.io.File object the selector can use @return whether the file should be selected or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// throw BuildException on error 	TokenNameCOMMENT_LINE	throw BuildException on error 
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Determine file whose existence is to be checked 	TokenNameCOMMENT_LINE	Determine file whose existence is to be checked 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
destfiles	TokenNameIdentifier	 destfiles
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If filename does not match the To attribute of the mapper 	TokenNameCOMMENT_LINE	If filename does not match the To attribute of the mapper 
// then filter it out of the files we are considering 	TokenNameCOMMENT_LINE	then filter it out of the files we are considering 
if	TokenNameif	
(	TokenNameLPAREN	
destfiles	TokenNameIdentifier	 destfiles
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Sanity check 	TokenNameCOMMENT_LINE	Sanity check 
if	TokenNameif	
(	TokenNameLPAREN	
destfiles	TokenNameIdentifier	 destfiles
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
destfiles	TokenNameIdentifier	 destfiles
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid destination file results for "	TokenNameStringLiteral	Invalid destination file results for 
+	TokenNamePLUS	
targetdir	TokenNameIdentifier	 targetdir
+	TokenNamePLUS	
" with filename "	TokenNameStringLiteral	 with filename 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
destname	TokenNameIdentifier	 destname
=	TokenNameEQUAL	
destfiles	TokenNameIdentifier	 destfiles
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
destfile	TokenNameIdentifier	 destfile
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
targetdir	TokenNameIdentifier	 targetdir
,	TokenNameCOMMA	
destname	TokenNameIdentifier	 destname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
destfile	TokenNameIdentifier	 destfile
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
destmustexist	TokenNameIdentifier	 destmustexist
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Enumerated attribute with the values for indicating where a file's * presence is allowed and required. */	TokenNameCOMMENT_JAVADOC	 Enumerated attribute with the values for indicating where a file's presence is allowed and required. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
FilePresence	TokenNameIdentifier	 File Presence
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** * @return the values as an array of strings */	TokenNameCOMMENT_JAVADOC	 @return the values as an array of strings 
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
"srconly"	TokenNameStringLiteral	srconly
,	TokenNameCOMMA	
"both"	TokenNameStringLiteral	both
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
