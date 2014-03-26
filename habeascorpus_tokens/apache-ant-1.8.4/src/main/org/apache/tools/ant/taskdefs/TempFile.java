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
/** * This task sets a property to the name of a temporary file. * Unlike {@link File#createTempFile}, this task does not (by default) actually create the * temporary file, but it does guarantee that the file did not * exist when the task was executed. * <p> * Examples * <pre>&lt;tempfile property="temp.file" /&gt;</pre> * create a temporary file * <pre>&lt;tempfile property="temp.file" suffix=".xml" /&gt;</pre> * create a temporary file with the .xml suffix. * <pre>&lt;tempfile property="temp.file" destDir="build"/&gt;</pre> * create a temp file in the build subdir * @since Ant 1.5 * @ant.task */	TokenNameCOMMENT_JAVADOC	 This task sets a property to the name of a temporary file. Unlike {@link File#createTempFile}, this task does not (by default) actually create the temporary file, but it does guarantee that the file did not exist when the task was executed. <p> Examples <pre>&lt;tempfile property="temp.file" /&gt;</pre> create a temporary file <pre>&lt;tempfile property="temp.file" suffix=".xml" /&gt;</pre> create a temporary file with the .xml suffix. <pre>&lt;tempfile property="temp.file" destDir="build"/&gt;</pre> create a temp file in the build subdir @since Ant 1.5 @ant.task 
public	TokenNamepublic	
class	TokenNameclass	
TempFile	TokenNameIdentifier	 Temp File
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
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
/** * Name of property to set. */	TokenNameCOMMENT_JAVADOC	 Name of property to set. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
/** * Directory to create the file in. Can be null. */	TokenNameCOMMENT_JAVADOC	 Directory to create the file in. Can be null. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Prefix for the file. */	TokenNameCOMMENT_JAVADOC	 Prefix for the file. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
/** * Suffix for the file. */	TokenNameCOMMENT_JAVADOC	 Suffix for the file. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** deleteOnExit flag */	TokenNameCOMMENT_JAVADOC	 deleteOnExit flag 
private	TokenNameprivate	
boolean	TokenNameboolean	
deleteOnExit	TokenNameIdentifier	 delete On Exit
;	TokenNameSEMICOLON	
/** createFile flag */	TokenNameCOMMENT_JAVADOC	 createFile flag 
private	TokenNameprivate	
boolean	TokenNameboolean	
createFile	TokenNameIdentifier	 create File
;	TokenNameSEMICOLON	
/** * Sets the property you wish to assign the temporary file to. * * @param property The property to set * @ant.attribute group="required" */	TokenNameCOMMENT_JAVADOC	 Sets the property you wish to assign the temporary file to. * @param property The property to set @ant.attribute group="required" 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the destination directory. If not set, * the basedir directory is used instead. * * @param destDir The new destDir value */	TokenNameCOMMENT_JAVADOC	 Sets the destination directory. If not set, the basedir directory is used instead. * @param destDir The new destDir value 
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
/** * Sets the optional prefix string for the temp file. * * @param prefix string to prepend to generated string */	TokenNameCOMMENT_JAVADOC	 Sets the optional prefix string for the temp file. * @param prefix string to prepend to generated string 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the optional suffix string for the temp file. * * @param suffix suffix including any "." , e.g ".xml" */	TokenNameCOMMENT_JAVADOC	 Sets the optional suffix string for the temp file. * @param suffix suffix including any "." , e.g ".xml" 
public	TokenNamepublic	
void	TokenNamevoid	
setSuffix	TokenNameIdentifier	 set Suffix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether the tempfile created by this task should be set * for deletion on normal VM exit. * @param deleteOnExit boolean flag. */	TokenNameCOMMENT_JAVADOC	 Set whether the tempfile created by this task should be set for deletion on normal VM exit. @param deleteOnExit boolean flag. 
public	TokenNamepublic	
void	TokenNamevoid	
setDeleteOnExit	TokenNameIdentifier	 set Delete On Exit
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deleteOnExit	TokenNameIdentifier	 delete On Exit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
=	TokenNameEQUAL	
deleteOnExit	TokenNameIdentifier	 delete On Exit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Learn whether deleteOnExit is set for this tempfile task. * @return boolean deleteOnExit flag. */	TokenNameCOMMENT_JAVADOC	 Learn whether deleteOnExit is set for this tempfile task. @return boolean deleteOnExit flag. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDeleteOnExit	TokenNameIdentifier	 is Delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deleteOnExit	TokenNameIdentifier	 delete On Exit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set the file is actually created, if not just a name is created. * @param createFile boolean flag. */	TokenNameCOMMENT_JAVADOC	 If set the file is actually created, if not just a name is created. @param createFile boolean flag. 
public	TokenNamepublic	
void	TokenNamevoid	
setCreateFile	TokenNameIdentifier	 set Create File
(	TokenNameLPAREN	
boolean	TokenNameboolean	
createFile	TokenNameIdentifier	 create File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
createFile	TokenNameIdentifier	 create File
=	TokenNameEQUAL	
createFile	TokenNameIdentifier	 create File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Learn whether createFile flag is set for this tempfile task. * @return the createFile flag. */	TokenNameCOMMENT_JAVADOC	 Learn whether createFile flag is set for this tempfile task. @return the createFile flag. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCreateFile	TokenNameIdentifier	 is Create File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createFile	TokenNameIdentifier	 create File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the temporary file. * * @exception BuildException if something goes wrong with the build */	TokenNameCOMMENT_JAVADOC	 Creates the temporary file. * @exception BuildException if something goes wrong with the build 
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
property	TokenNameIdentifier	 property
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
property	TokenNameIdentifier	 property
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"no property specified"	TokenNameStringLiteral	no property specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
destDir	TokenNameIdentifier	 dest Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
destDir	TokenNameIdentifier	 dest Dir
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
tfile	TokenNameIdentifier	 tfile
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
suffix	TokenNameIdentifier	 suffix
,	TokenNameCOMMA	
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
deleteOnExit	TokenNameIdentifier	 delete On Exit
,	TokenNameCOMMA	
createFile	TokenNameIdentifier	 create File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
tfile	TokenNameIdentifier	 tfile
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
