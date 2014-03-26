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
IOException	TokenNameIdentifier	 IO Exception
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
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
Commandline	TokenNameIdentifier	 Commandline
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
PatternSet	TokenNameIdentifier	 Pattern Set
;	TokenNameSEMICOLON	
/** * Chmod equivalent for unix-like environments. * * @since Ant 1.1 * * @ant.task category="filesystem" * @todo Refactor so it does not extend from ExecuteOn and then turn around * and unsupport several attributes. */	TokenNameCOMMENT_JAVADOC	 Chmod equivalent for unix-like environments. * @since Ant 1.1 * @ant.task category="filesystem" @todo Refactor so it does not extend from ExecuteOn and then turn around and unsupport several attributes. 
public	TokenNamepublic	
class	TokenNameclass	
Chmod	TokenNameIdentifier	 Chmod
extends	TokenNameextends	
ExecuteOn	TokenNameIdentifier	 Execute On
{	TokenNameLBRACE	
private	TokenNameprivate	
FileSet	TokenNameIdentifier	 File Set
defaultSet	TokenNameIdentifier	 default Set
=	TokenNameEQUAL	
new	TokenNamenew	
FileSet	TokenNameIdentifier	 File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
defaultSetDefined	TokenNameIdentifier	 default Set Defined
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
havePerm	TokenNameIdentifier	 have Perm
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Chmod task for setting file and directory permissions. */	TokenNameCOMMENT_JAVADOC	 Chmod task for setting file and directory permissions. 
public	TokenNamepublic	
Chmod	TokenNameIdentifier	 Chmod
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
"chmod"	TokenNameStringLiteral	chmod
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setParallel	TokenNameIdentifier	 set Parallel
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setSkipEmptyFilesets	TokenNameIdentifier	 set Skip Empty Filesets
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the project of this task. * Calls the super class and sets the project on dhe default FileSet. * @param project the project for this task. * @see org.apache.tools.ant.ProjectComponent#setProject */	TokenNameCOMMENT_JAVADOC	 Set the project of this task. Calls the super class and sets the project on dhe default FileSet. @param project the project for this task. @see org.apache.tools.ant.ProjectComponent#setProject 
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The file or single directory of which the permissions must be changed. * @param src the source file or directory. */	TokenNameCOMMENT_JAVADOC	 The file or single directory of which the permissions must be changed. @param src the source file or directory. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileSet	TokenNameIdentifier	 File Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
FileSet	TokenNameIdentifier	 File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The directory which holds the files whose permissions must be changed. * @param src the directory. */	TokenNameCOMMENT_JAVADOC	 The directory which holds the files whose permissions must be changed. @param src the directory. 
public	TokenNamepublic	
void	TokenNamevoid	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the new permissions. * @param perm the new permissions. */	TokenNameCOMMENT_JAVADOC	 Set the new permissions. @param perm the new permissions. 
public	TokenNamepublic	
void	TokenNamevoid	
setPerm	TokenNameIdentifier	 set Perm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
havePerm	TokenNameIdentifier	 have Perm
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a name entry on the include list. * @return a NameEntry to be configured. */	TokenNameCOMMENT_JAVADOC	 Add a name entry on the include list. @return a NameEntry to be configured. 
public	TokenNamepublic	
PatternSet	TokenNameIdentifier	 Pattern Set
.	TokenNameDOT	
NameEntry	TokenNameIdentifier	 Name Entry
createInclude	TokenNameIdentifier	 create Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultSetDefined	TokenNameIdentifier	 default Set Defined
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
createInclude	TokenNameIdentifier	 create Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a name entry on the exclude list. * @return a nameentry to be configured. */	TokenNameCOMMENT_JAVADOC	 Add a name entry on the exclude list. @return a nameentry to be configured. 
public	TokenNamepublic	
PatternSet	TokenNameIdentifier	 Pattern Set
.	TokenNameDOT	
NameEntry	TokenNameIdentifier	 Name Entry
createExclude	TokenNameIdentifier	 create Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultSetDefined	TokenNameIdentifier	 default Set Defined
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
createExclude	TokenNameIdentifier	 create Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a set of patterns. * @return a patternset to be configured. */	TokenNameCOMMENT_JAVADOC	 Add a set of patterns. @return a patternset to be configured. 
public	TokenNamepublic	
PatternSet	TokenNameIdentifier	 Pattern Set
createPatternSet	TokenNameIdentifier	 create Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultSetDefined	TokenNameIdentifier	 default Set Defined
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
createPatternSet	TokenNameIdentifier	 create Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the set of include patterns. Patterns may be separated by a comma * or a space. * * @param includes the string containing the include patterns. */	TokenNameCOMMENT_JAVADOC	 Sets the set of include patterns. Patterns may be separated by a comma or a space. * @param includes the string containing the include patterns. 
public	TokenNamepublic	
void	TokenNamevoid	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
includes	TokenNameIdentifier	 includes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultSetDefined	TokenNameIdentifier	 default Set Defined
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
includes	TokenNameIdentifier	 includes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the set of exclude patterns. Patterns may be separated by a comma * or a space. * * @param excludes the string containing the exclude patterns. */	TokenNameCOMMENT_JAVADOC	 Sets the set of exclude patterns. Patterns may be separated by a comma or a space. * @param excludes the string containing the exclude patterns. 
public	TokenNamepublic	
void	TokenNamevoid	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultSetDefined	TokenNameIdentifier	 default Set Defined
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets whether default exclusions should be used or not. * * @param useDefaultExcludes "true"|"on"|"yes" when default exclusions * should be used, "false"|"off"|"no" when they * shouldn't be used. */	TokenNameCOMMENT_JAVADOC	 Sets whether default exclusions should be used or not. * @param useDefaultExcludes "true"|"on"|"yes" when default exclusions should be used, "false"|"off"|"no" when they shouldn't be used. 
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultexcludes	TokenNameIdentifier	 set Defaultexcludes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useDefaultExcludes	TokenNameIdentifier	 use Default Excludes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultSetDefined	TokenNameIdentifier	 default Set Defined
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
setDefaultexcludes	TokenNameIdentifier	 set Defaultexcludes
(	TokenNameLPAREN	
useDefaultExcludes	TokenNameIdentifier	 use Default Excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check the attributes and nested elements. */	TokenNameCOMMENT_JAVADOC	 Check the attributes and nested elements. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkConfiguration	TokenNameIdentifier	 check Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
havePerm	TokenNameIdentifier	 have Perm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Required attribute perm not set in chmod"	TokenNameStringLiteral	Required attribute perm not set in chmod
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaultSetDefined	TokenNameIdentifier	 default Set Defined
&&	TokenNameAND_AND	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
defaultSet	TokenNameIdentifier	 default Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
checkConfiguration	TokenNameIdentifier	 check Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Carry out the chmoding. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Carry out the chmoding. @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
/* * In Ant 1.1, <chmod dir="foo" /> means, change the permissions * of directory foo, not anything inside of it. This is the case the * second branch of the if statement below catches for backwards * compatibility. */	TokenNameCOMMENT_BLOCK	 In Ant 1.1, <chmod dir="foo" /> means, change the permissions of directory foo, not anything inside of it. This is the case the second branch of the if statement below catches for backwards compatibility. 
if	TokenNameif	
(	TokenNameLPAREN	
defaultSetDefined	TokenNameIdentifier	 default Set Defined
||	TokenNameOR_OR	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaultSetDefined	TokenNameIdentifier	 default Set Defined
&&	TokenNameAND_AND	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
defaultSet	TokenNameIdentifier	 default Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isValidOs	TokenNameIdentifier	 is Valid Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are chmodding the given directory 	TokenNameCOMMENT_LINE	we are chmodding the given directory 
Execute	TokenNameIdentifier	 Execute
execute	TokenNameIdentifier	 execute
=	TokenNameEQUAL	
prepareExec	TokenNameIdentifier	 prepare Exec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Commandline	TokenNameIdentifier	 Commandline
cloned	TokenNameIdentifier	 cloned
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
)	TokenNameRPAREN	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cloned	TokenNameIdentifier	 cloned
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
defaultSet	TokenNameIdentifier	 default Set
.	TokenNameDOT	
getDir	TokenNameIdentifier	 get Dir
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
execute	TokenNameIdentifier	 execute
.	TokenNameDOT	
setCommandline	TokenNameIdentifier	 set Commandline
(	TokenNameLPAREN	
cloned	TokenNameIdentifier	 cloned
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runExecute	TokenNameIdentifier	 run Execute
(	TokenNameLPAREN	
execute	TokenNameIdentifier	 execute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"Execute failed: "	TokenNameStringLiteral	Execute failed: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
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
// close the output file if required 	TokenNameCOMMENT_LINE	close the output file if required 
logFlush	TokenNameIdentifier	 log Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the executable. * This is not allowed for Chmod. * @param e ignored. * @throws BuildException always. * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Set the executable. This is not allowed for Chmod. @param e ignored. @throws BuildException always. @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the executable attribute"	TokenNameStringLiteral	 doesn't support the executable attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the command. * This is not allowed for Chmod. * @param cmdl ignored. * @throws BuildException always. * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Set the command. This is not allowed for Chmod. @param cmdl ignored. @throws BuildException always. @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setCommand	TokenNameIdentifier	 set Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmdl	TokenNameIdentifier	 cmdl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the command attribute"	TokenNameStringLiteral	 doesn't support the command attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is not allowed for Chmod. * @param skip ignored. * @throws BuildException always. * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 This is not allowed for Chmod. @param skip ignored. @throws BuildException always. @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setSkipEmptyFilesets	TokenNameIdentifier	 set Skip Empty Filesets
(	TokenNameLPAREN	
boolean	TokenNameboolean	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the skipemptyfileset attribute"	TokenNameStringLiteral	 doesn't support the skipemptyfileset attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is not allowed for Chmod. * @param b ignored. * @throws BuildException always. * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 This is not allowed for Chmod. @param b ignored. @throws BuildException always. @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setAddsourcefile	TokenNameIdentifier	 set Addsourcefile
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the addsourcefile attribute"	TokenNameStringLiteral	 doesn't support the addsourcefile attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if the os is valid. * Always include unix. * @return true if the os is valid. */	TokenNameCOMMENT_JAVADOC	 Check if the os is valid. Always include unix. @return true if the os is valid. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValidOs	TokenNameIdentifier	 is Valid Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOs	TokenNameIdentifier	 get Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getOsFamily	TokenNameIdentifier	 get Os Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
FAMILY_UNIX	TokenNameIdentifier	 FAMILY  UNIX
)	TokenNameRPAREN	
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
isValidOs	TokenNameIdentifier	 is Valid Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
