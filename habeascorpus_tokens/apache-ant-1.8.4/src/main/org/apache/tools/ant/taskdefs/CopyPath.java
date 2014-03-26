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
Reference	TokenNameIdentifier	 Reference
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
/** * Copy the contents of a path to a destination, using the mapper of choice * * @since Ant 1.7.0 * * @ant.task category="filesystem" * @deprecated this task should have never been released and was * obsoleted by ResourceCollection support in Copy available since Ant * 1.7.0. Don't use it. */	TokenNameCOMMENT_JAVADOC	 Copy the contents of a path to a destination, using the mapper of choice * @since Ant 1.7.0 * @ant.task category="filesystem" @deprecated this task should have never been released and was obsoleted by ResourceCollection support in Copy available since Ant 1.7.0. Don't use it. 
public	TokenNamepublic	
class	TokenNameclass	
CopyPath	TokenNameIdentifier	 Copy Path
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
// Error messages 	TokenNameCOMMENT_LINE	Error messages 
/** No destdir attribute */	TokenNameCOMMENT_JAVADOC	 No destdir attribute 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_DESTDIR	TokenNameIdentifier	 ERROR  NO  DESTDIR
=	TokenNameEQUAL	
"No destDir specified"	TokenNameStringLiteral	No destDir specified
;	TokenNameSEMICOLON	
/** No path */	TokenNameCOMMENT_JAVADOC	 No path 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_PATH	TokenNameIdentifier	 ERROR  NO  PATH
=	TokenNameEQUAL	
"No path specified"	TokenNameStringLiteral	No path specified
;	TokenNameSEMICOLON	
/** No mapper */	TokenNameCOMMENT_JAVADOC	 No mapper 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_MAPPER	TokenNameIdentifier	 ERROR  NO  MAPPER
=	TokenNameEQUAL	
"No mapper specified"	TokenNameStringLiteral	No mapper specified
;	TokenNameSEMICOLON	
// fileutils 	TokenNameCOMMENT_LINE	fileutils 
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
// --- Fields -- 	TokenNameCOMMENT_LINE	--- Fields -- 
private	TokenNameprivate	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapper	TokenNameIdentifier	 mapper
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
;	TokenNameSEMICOLON	
// TODO not read, yet in a public setter 	TokenNameCOMMENT_LINE	TODO not read, yet in a public setter 
private	TokenNameprivate	
long	TokenNamelong	
granularity	TokenNameIdentifier	 granularity
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The dest dir attribute. * @param destDir the value of the destdir attribute. */	TokenNameCOMMENT_JAVADOC	 The dest dir attribute. @param destDir the value of the destdir attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setDestDir	TokenNameIdentifier	 set Dest Dir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
destDir	TokenNameIdentifier	 dest Dir
=	TokenNameEQUAL	
destDir	TokenNameIdentifier	 dest Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a mapper * * @param newmapper the mapper to add. */	TokenNameCOMMENT_JAVADOC	 add a mapper * @param newmapper the mapper to add. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
newmapper	TokenNameIdentifier	 newmapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mapper	TokenNameIdentifier	 mapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one mapper allowed"	TokenNameStringLiteral	Only one mapper allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mapper	TokenNameIdentifier	 mapper
=	TokenNameEQUAL	
newmapper	TokenNameIdentifier	 newmapper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the path to be used when running the Java class. * * @param s * an Ant Path object containing the path. */	TokenNameCOMMENT_JAVADOC	 Set the path to be used when running the Java class. * @param s an Ant Path object containing the path. 
public	TokenNamepublic	
void	TokenNamevoid	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the path to use by reference. * * @param r * a reference to an existing path. */	TokenNameCOMMENT_JAVADOC	 Set the path to use by reference. * @param r a reference to an existing path. 
public	TokenNamepublic	
void	TokenNamevoid	
setPathRef	TokenNameIdentifier	 set Path Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a path. * * @return a path to be configured. */	TokenNameCOMMENT_JAVADOC	 Create a path. * @return a path to be configured. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the number of milliseconds leeway to give before deciding a * target is out of date. * TODO: This is not yet used. * @param granularity the granularity used to decide if a target is out of * date. */	TokenNameCOMMENT_JAVADOC	 Set the number of milliseconds leeway to give before deciding a target is out of date. TODO: This is not yet used. @param granularity the granularity used to decide if a target is out of date. 
public	TokenNamepublic	
void	TokenNamevoid	
setGranularity	TokenNameIdentifier	 set Granularity
(	TokenNameLPAREN	
long	TokenNamelong	
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
/** * Give the copied files the same last modified time as the original files. * @param preserveLastModified if true preserve the modified time; * default is false. */	TokenNameCOMMENT_JAVADOC	 Give the copied files the same last modified time as the original files. @param preserveLastModified if true preserve the modified time; default is false. 
public	TokenNamepublic	
void	TokenNamevoid	
setPreserveLastModified	TokenNameIdentifier	 set Preserve Last Modified
(	TokenNameLPAREN	
boolean	TokenNameboolean	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
=	TokenNameEQUAL	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ensure we have a consistent and legal set of attributes, and set any * internal flags necessary based on different combinations of attributes. * * @throws BuildException * if an error occurs. */	TokenNameCOMMENT_JAVADOC	 Ensure we have a consistent and legal set of attributes, and set any internal flags necessary based on different combinations of attributes. * @throws BuildException if an error occurs. 
protected	TokenNameprotected	
void	TokenNamevoid	
validateAttributes	TokenNameIdentifier	 validate Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
destDir	TokenNameIdentifier	 dest Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_DESTDIR	TokenNameIdentifier	 ERROR  NO  DESTDIR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mapper	TokenNameIdentifier	 mapper
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_MAPPER	TokenNameIdentifier	 ERROR  NO  MAPPER
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
ERROR_NO_PATH	TokenNameIdentifier	 ERROR  NO  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is a very minimal derivative of the nomal copy logic. * * @throws BuildException * if something goes wrong with the build. */	TokenNameCOMMENT_JAVADOC	 This is a very minimal derivative of the nomal copy logic. * @throws BuildException if something goes wrong with the build. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"This task should have never been released and was"	TokenNameStringLiteral	This task should have never been released and was
+	TokenNamePLUS	
" obsoleted by ResourceCollection support in <copy> available"	TokenNameStringLiteral	 obsoleted by ResourceCollection support in <copy> available
+	TokenNamePLUS	
" since Ant 1.7.0. Don't use it."	TokenNameStringLiteral	 since Ant 1.7.0. Don't use it.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateAttributes	TokenNameIdentifier	 validate Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sourceFiles	TokenNameIdentifier	 source Files
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sourceFiles	TokenNameIdentifier	 source Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Path is empty"	TokenNameStringLiteral	Path is empty
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
sources	TokenNameIdentifier	 sources
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sources	TokenNameIdentifier	 sources
<	TokenNameLESS	
sourceFiles	TokenNameIdentifier	 source Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
sources	TokenNameIdentifier	 sources
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sourceFileName	TokenNameIdentifier	 source File Name
=	TokenNameEQUAL	
sourceFiles	TokenNameIdentifier	 source Files
[	TokenNameLBRACKET	
sources	TokenNameIdentifier	 sources
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
sourceFile	TokenNameIdentifier	 source File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toFiles	TokenNameIdentifier	 to Files
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
sourceFileName	TokenNameIdentifier	 source File Name
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
toFiles	TokenNameIdentifier	 to Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
destFileName	TokenNameIdentifier	 dest File Name
=	TokenNameEQUAL	
toFiles	TokenNameIdentifier	 to Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
destFile	TokenNameIdentifier	 dest File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
destFileName	TokenNameIdentifier	 dest File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sourceFile	TokenNameIdentifier	 source File
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Skipping self-copy of "	TokenNameStringLiteral	Skipping self-copy of 
+	TokenNamePLUS	
sourceFileName	TokenNameIdentifier	 source File Name
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sourceFile	TokenNameIdentifier	 source File
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Skipping directory "	TokenNameStringLiteral	Skipping directory 
+	TokenNamePLUS	
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Copying "	TokenNameStringLiteral	Copying 
+	TokenNamePLUS	
sourceFile	TokenNameIdentifier	 source File
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
destFile	TokenNameIdentifier	 dest File
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
sourceFile	TokenNameIdentifier	 source File
,	TokenNameCOMMA	
destFile	TokenNameIdentifier	 dest File
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Failed to copy "	TokenNameStringLiteral	Failed to copy 
+	TokenNamePLUS	
sourceFile	TokenNameIdentifier	 source File
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
destFile	TokenNameIdentifier	 dest File
+	TokenNamePLUS	
" due to "	TokenNameStringLiteral	 due to 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
" and I couldn't delete the corrupt "	TokenNameStringLiteral	 and I couldn't delete the corrupt 
+	TokenNamePLUS	
destFile	TokenNameIdentifier	 dest File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
