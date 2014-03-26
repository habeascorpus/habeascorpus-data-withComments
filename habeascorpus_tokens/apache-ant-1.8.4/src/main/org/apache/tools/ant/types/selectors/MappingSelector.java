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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IdentityMapper	TokenNameIdentifier	 Identity Mapper
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * A mapping selector is an abstract class adding mapping support to the base * selector */	TokenNameCOMMENT_JAVADOC	 A mapping selector is an abstract class adding mapping support to the base selector 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
MappingSelector	TokenNameIdentifier	 Mapping Selector
extends	TokenNameextends	
BaseSelector	TokenNameIdentifier	 Base Selector
{	TokenNameLBRACE	
/** Utilities used for file operations */	TokenNameCOMMENT_JAVADOC	 Utilities used for file operations 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
targetdir	TokenNameIdentifier	 targetdir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Mapper	TokenNameIdentifier	 Mapper
mapperElement	TokenNameIdentifier	 mapper Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
granularity	TokenNameIdentifier	 granularity
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Creates a new <code>MappingSelector</code> instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>MappingSelector</code> instance. 
public	TokenNamepublic	
MappingSelector	TokenNameIdentifier	 Mapping Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
granularity	TokenNameIdentifier	 granularity
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of the file or directory which is checked for out-of-date * files. * * @param targetdir the directory to scan looking for files. */	TokenNameCOMMENT_JAVADOC	 The name of the file or directory which is checked for out-of-date files. * @param targetdir the directory to scan looking for files. 
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
/** * Checks to make sure all settings are kosher. In this case, it * means that the dest attribute has been set and we have a mapper. */	TokenNameCOMMENT_JAVADOC	 Checks to make sure all settings are kosher. In this case, it means that the dest attribute has been set and we have a mapper. 
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
// Determine file whose out-of-dateness is to be checked 	TokenNameCOMMENT_LINE	Determine file whose out-of-dateness is to be checked 
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
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
targetdir	TokenNameIdentifier	 targetdir
,	TokenNameCOMMA	
destname	TokenNameIdentifier	 destname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
=	TokenNameEQUAL	
selectionTest	TokenNameIdentifier	 selection Test
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
destfile	TokenNameIdentifier	 destfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
selected	TokenNameIdentifier	 selected
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * this test is our selection test that compared the file with the destfile * @param srcfile file to test; may be null * @param destfile destination file * @return true if source file compares with destination file */	TokenNameCOMMENT_JAVADOC	 this test is our selection test that compared the file with the destfile @param srcfile file to test; may be null @param destfile destination file @return true if source file compares with destination file 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
selectionTest	TokenNameIdentifier	 selection Test
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
srcfile	TokenNameIdentifier	 srcfile
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destfile	TokenNameIdentifier	 destfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the number of milliseconds leeway we will give before we consider * a file out of date. Defaults to 2000 on MS-DOS derivatives and 1000 on * others. * @param granularity the leeway in milliseconds */	TokenNameCOMMENT_JAVADOC	 Sets the number of milliseconds leeway we will give before we consider a file out of date. Defaults to 2000 on MS-DOS derivatives and 1000 on others. @param granularity the leeway in milliseconds 
public	TokenNamepublic	
void	TokenNamevoid	
setGranularity	TokenNameIdentifier	 set Granularity
(	TokenNameLPAREN	
int	TokenNameint	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
granularity	TokenNameIdentifier	 granularity
=	TokenNameEQUAL	
granularity	TokenNameIdentifier	 granularity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	