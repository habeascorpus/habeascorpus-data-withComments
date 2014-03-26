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
clearcase	TokenNameIdentifier	 clearcase
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
Execute	TokenNameIdentifier	 Execute
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** * Task to perform mkattr command to ClearCase. * <p> * The following attributes are interpreted: * <table border="1"> * <tr> * <th>Attribute</th> * <th>Values</th> * <th>Required</th> * </tr> * <tr> * <td>viewpath</td> * <td>Path to the ClearCase view file or directory that the command will operate on</td> * <td>Yes</td> * <tr> * <tr> * <td>replace</td> * <td>Replace the value of the attribute if it already exists</td> * <td>No</td> * <tr> * <tr> * <td>recurse</td> * <td>Process each subdirectory under viewpath</td> * <td>No</td> * <tr> * <tr> * <td>version</td> * <td>Identify a specific version to attach the attribute to</td> * <td>No</td> * <tr> * <tr> * <td>typename</td> * <td>Name of the attribute type</td> * <td>Yes</td> * <tr> * <tr> * <td>typevalue</td> * <td>Value to attach to the attribute type</td> * <td>Yes</td> * <tr> * <tr> * <td>comment</td> * <td>Specify a comment. Only one of comment or cfile may be used.</td> * <td>No</td> * <tr> * <tr> * <td>commentfile</td> * <td>Specify a file containing a comment. Only one of comment or cfile may be used.</td> * <td>No</td> * <tr> * <tr> * <td>failonerr</td> * <td>Throw an exception if the command fails. Default is true</td> * <td>No</td> * <tr> * </table> * */	TokenNameCOMMENT_JAVADOC	 Task to perform mkattr command to ClearCase. <p> The following attributes are interpreted: <table border="1"> <tr> <th>Attribute</th> <th>Values</th> <th>Required</th> </tr> <tr> <td>viewpath</td> <td>Path to the ClearCase view file or directory that the command will operate on</td> <td>Yes</td> <tr> <tr> <td>replace</td> <td>Replace the value of the attribute if it already exists</td> <td>No</td> <tr> <tr> <td>recurse</td> <td>Process each subdirectory under viewpath</td> <td>No</td> <tr> <tr> <td>version</td> <td>Identify a specific version to attach the attribute to</td> <td>No</td> <tr> <tr> <td>typename</td> <td>Name of the attribute type</td> <td>Yes</td> <tr> <tr> <td>typevalue</td> <td>Value to attach to the attribute type</td> <td>Yes</td> <tr> <tr> <td>comment</td> <td>Specify a comment. Only one of comment or cfile may be used.</td> <td>No</td> <tr> <tr> <td>commentfile</td> <td>Specify a file containing a comment. Only one of comment or cfile may be used.</td> <td>No</td> <tr> <tr> <td>failonerr</td> <td>Throw an exception if the command fails. Default is true</td> <td>No</td> <tr> </table> 
public	TokenNamepublic	
class	TokenNameclass	
CCMkattr	TokenNameIdentifier	 CC Mkattr
extends	TokenNameextends	
ClearCase	TokenNameIdentifier	 Clear Case
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
mReplace	TokenNameIdentifier	 m Replace
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mRecurse	TokenNameIdentifier	 m Recurse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mVersion	TokenNameIdentifier	 m Version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mTypeName	TokenNameIdentifier	 m Type Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mTypeValue	TokenNameIdentifier	 m Type Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mComment	TokenNameIdentifier	 m Comment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mCfile	TokenNameIdentifier	 m Cfile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Executes the task. * <p> * Builds a command line to execute cleartool and then calls Exec's run method * to execute the command line. * @throws BuildException if the command fails and failonerr is set to true */	TokenNameCOMMENT_JAVADOC	 Executes the task. <p> Builds a command line to execute cleartool and then calls Exec's run method to execute the command line. @throws BuildException if the command fails and failonerr is set to true 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
commandLine	TokenNameIdentifier	 command Line
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Project	TokenNameIdentifier	 Project
aProj	TokenNameIdentifier	 a Proj
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Check for required attributes 	TokenNameCOMMENT_LINE	Check for required attributes 
if	TokenNameif	
(	TokenNameLPAREN	
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Required attribute TypeName not specified"	TokenNameStringLiteral	Required attribute TypeName not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getTypeValue	TokenNameIdentifier	 get Type Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Required attribute TypeValue not specified"	TokenNameStringLiteral	Required attribute TypeValue not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Default the viewpath to basedir if it is not specified 	TokenNameCOMMENT_LINE	Default the viewpath to basedir if it is not specified 
if	TokenNameif	
(	TokenNameLPAREN	
getViewPath	TokenNameIdentifier	 get View Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setViewPath	TokenNameIdentifier	 set View Path
(	TokenNameLPAREN	
aProj	TokenNameIdentifier	 a Proj
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// build the command line from what we got. the format is 	TokenNameCOMMENT_LINE	build the command line from what we got. the format is 
// cleartool mkattr [options...] [viewpath ...] 	TokenNameCOMMENT_LINE	cleartool mkattr [options...] [viewpath ...] 
// as specified in the CLEARTOOL help 	TokenNameCOMMENT_LINE	as specified in the CLEARTOOL help 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
getClearToolCommand	TokenNameIdentifier	 get Clear Tool Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
COMMAND_MKATTR	TokenNameIdentifier	 COMMAND  MKATTR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOptions	TokenNameIdentifier	 check Options
(	TokenNameLPAREN	
commandLine	TokenNameIdentifier	 command Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getFailOnErr	TokenNameIdentifier	 get Fail On Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Ignoring any errors that occur for: "	TokenNameStringLiteral	Ignoring any errors that occur for: 
+	TokenNamePLUS	
getViewPathBasename	TokenNameIdentifier	 get View Path Basename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// For debugging 	TokenNameCOMMENT_LINE	For debugging 
// System.out.println(commandLine.toString()); 	TokenNameCOMMENT_LINE	System.out.println(commandLine.toString()); 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
commandLine	TokenNameIdentifier	 command Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Execute	TokenNameIdentifier	 Execute
.	TokenNameDOT	
isFailure	TokenNameIdentifier	 is Failure
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
getFailOnErr	TokenNameIdentifier	 get Fail On Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Failed executing: "	TokenNameStringLiteral	Failed executing: 
+	TokenNamePLUS	
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Check the command line options. */	TokenNameCOMMENT_JAVADOC	 Check the command line options. 
private	TokenNameprivate	
void	TokenNamevoid	
checkOptions	TokenNameIdentifier	 check Options
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getReplace	TokenNameIdentifier	 get Replace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -replace 	TokenNameCOMMENT_LINE	-replace 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_REPLACE	TokenNameIdentifier	 FLAG  REPLACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getRecurse	TokenNameIdentifier	 get Recurse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -recurse 	TokenNameCOMMENT_LINE	-recurse 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_RECURSE	TokenNameIdentifier	 FLAG  RECURSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -version 	TokenNameCOMMENT_LINE	-version 
getVersionCommand	TokenNameIdentifier	 get Version Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -c 	TokenNameCOMMENT_LINE	-c 
getCommentCommand	TokenNameIdentifier	 get Comment Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getCommentFile	TokenNameIdentifier	 get Comment File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -cfile 	TokenNameCOMMENT_LINE	-cfile 
getCommentFileCommand	TokenNameIdentifier	 get Comment File Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_NOCOMMENT	TokenNameIdentifier	 FLAG  NOCOMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// type 	TokenNameCOMMENT_LINE	type 
getTypeCommand	TokenNameIdentifier	 get Type Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getTypeValue	TokenNameIdentifier	 get Type Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// type value 	TokenNameCOMMENT_LINE	type value 
getTypeValueCommand	TokenNameIdentifier	 get Type Value Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// viewpath 	TokenNameCOMMENT_LINE	viewpath 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getViewPath	TokenNameIdentifier	 get View Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the replace flag * * @param replace the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 Set the replace flag * @param replace the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setReplace	TokenNameIdentifier	 set Replace
(	TokenNameLPAREN	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mReplace	TokenNameIdentifier	 m Replace
=	TokenNameEQUAL	
replace	TokenNameIdentifier	 replace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get replace flag status * * @return boolean containing status of replace flag */	TokenNameCOMMENT_JAVADOC	 Get replace flag status * @return boolean containing status of replace flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getReplace	TokenNameIdentifier	 get Replace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mReplace	TokenNameIdentifier	 m Replace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set recurse flag * * @param recurse the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 Set recurse flag * @param recurse the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setRecurse	TokenNameIdentifier	 set Recurse
(	TokenNameLPAREN	
boolean	TokenNameboolean	
recurse	TokenNameIdentifier	 recurse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mRecurse	TokenNameIdentifier	 m Recurse
=	TokenNameEQUAL	
recurse	TokenNameIdentifier	 recurse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get recurse flag status * * @return boolean containing status of recurse flag */	TokenNameCOMMENT_JAVADOC	 Get recurse flag status * @return boolean containing status of recurse flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getRecurse	TokenNameIdentifier	 get Recurse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mRecurse	TokenNameIdentifier	 m Recurse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the version flag * * @param version the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 Set the version flag * @param version the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mVersion	TokenNameIdentifier	 m Version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get version flag status * * @return boolean containing status of version flag */	TokenNameCOMMENT_JAVADOC	 Get version flag status * @return boolean containing status of version flag 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mVersion	TokenNameIdentifier	 m Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set comment string * * @param comment the comment string */	TokenNameCOMMENT_JAVADOC	 Set comment string * @param comment the comment string 
public	TokenNamepublic	
void	TokenNamevoid	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mComment	TokenNameIdentifier	 m Comment
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get comment string * * @return String containing the comment */	TokenNameCOMMENT_JAVADOC	 Get comment string * @return String containing the comment 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mComment	TokenNameIdentifier	 m Comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set comment file * * @param cfile the path to the comment file */	TokenNameCOMMENT_JAVADOC	 Set comment file * @param cfile the path to the comment file 
public	TokenNamepublic	
void	TokenNamevoid	
setCommentFile	TokenNameIdentifier	 set Comment File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cfile	TokenNameIdentifier	 cfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mCfile	TokenNameIdentifier	 m Cfile
=	TokenNameEQUAL	
cfile	TokenNameIdentifier	 cfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get comment file * * @return String containing the path to the comment file */	TokenNameCOMMENT_JAVADOC	 Get comment file * @return String containing the path to the comment file 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCommentFile	TokenNameIdentifier	 get Comment File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mCfile	TokenNameIdentifier	 m Cfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the attribute type-name * * @param tn the type name */	TokenNameCOMMENT_JAVADOC	 Set the attribute type-name * @param tn the type name 
public	TokenNamepublic	
void	TokenNamevoid	
setTypeName	TokenNameIdentifier	 set Type Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tn	TokenNameIdentifier	 tn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mTypeName	TokenNameIdentifier	 m Type Name
=	TokenNameEQUAL	
tn	TokenNameIdentifier	 tn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get attribute type-name * * @return String containing type name */	TokenNameCOMMENT_JAVADOC	 Get attribute type-name * @return String containing type name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mTypeName	TokenNameIdentifier	 m Type Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the attribute type-value * * @param tv the type value */	TokenNameCOMMENT_JAVADOC	 Set the attribute type-value * @param tv the type value 
public	TokenNamepublic	
void	TokenNamevoid	
setTypeValue	TokenNameIdentifier	 set Type Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tv	TokenNameIdentifier	 tv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mTypeValue	TokenNameIdentifier	 m Type Value
=	TokenNameEQUAL	
tv	TokenNameIdentifier	 tv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the attribute type-value * * @return String containing type value */	TokenNameCOMMENT_JAVADOC	 Get the attribute type-value * @return String containing type value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeValue	TokenNameIdentifier	 get Type Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mTypeValue	TokenNameIdentifier	 m Type Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the 'version' command * * @param cmd CommandLine containing the command line string with or * without the version flag and string appended */	TokenNameCOMMENT_JAVADOC	 Get the 'version' command * @param cmd CommandLine containing the command line string with or without the version flag and string appended 
private	TokenNameprivate	
void	TokenNamevoid	
getVersionCommand	TokenNameIdentifier	 get Version Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Had to make two separate commands here because if a space is inserted between the flag and the value, it is treated as a Windows filename with a space and it is enclosed in double quotes ("). This breaks clearcase. */	TokenNameCOMMENT_BLOCK	 Had to make two separate commands here because if a space is inserted between the flag and the value, it is treated as a Windows filename with a space and it is enclosed in double quotes ("). This breaks clearcase. 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the 'comment' command * * @param cmd containing the command line string with or * without the comment flag and string appended */	TokenNameCOMMENT_JAVADOC	 Get the 'comment' command * @param cmd containing the command line string with or without the comment flag and string appended 
private	TokenNameprivate	
void	TokenNamevoid	
getCommentCommand	TokenNameIdentifier	 get Comment Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Had to make two separate commands here because if a space is inserted between the flag and the value, it is treated as a Windows filename with a space and it is enclosed in double quotes ("). This breaks clearcase. */	TokenNameCOMMENT_BLOCK	 Had to make two separate commands here because if a space is inserted between the flag and the value, it is treated as a Windows filename with a space and it is enclosed in double quotes ("). This breaks clearcase. 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the 'commentfile' command * * @param cmd containing the command line string with or * without the commentfile flag and file appended */	TokenNameCOMMENT_JAVADOC	 Get the 'commentfile' command * @param cmd containing the command line string with or without the commentfile flag and file appended 
private	TokenNameprivate	
void	TokenNamevoid	
getCommentFileCommand	TokenNameIdentifier	 get Comment File Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getCommentFile	TokenNameIdentifier	 get Comment File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Had to make two separate commands here because if a space is inserted between the flag and the value, it is treated as a Windows filename with a space and it is enclosed in double quotes ("). This breaks clearcase. */	TokenNameCOMMENT_BLOCK	 Had to make two separate commands here because if a space is inserted between the flag and the value, it is treated as a Windows filename with a space and it is enclosed in double quotes ("). This breaks clearcase. 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_COMMENTFILE	TokenNameIdentifier	 FLAG  COMMENTFILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getCommentFile	TokenNameIdentifier	 get Comment File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the attribute type-name * * @param cmd containing the command line string with or * without the type-name */	TokenNameCOMMENT_JAVADOC	 Get the attribute type-name * @param cmd containing the command line string with or without the type-name 
private	TokenNameprivate	
void	TokenNamevoid	
getTypeCommand	TokenNameIdentifier	 get Type Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
typenm	TokenNameIdentifier	 typenm
=	TokenNameEQUAL	
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
typenm	TokenNameIdentifier	 typenm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
typenm	TokenNameIdentifier	 typenm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the attribute type-value * * @param cmd containing the command line string with or * without the type-value */	TokenNameCOMMENT_JAVADOC	 Get the attribute type-value * @param cmd containing the command line string with or without the type-value 
private	TokenNameprivate	
void	TokenNamevoid	
getTypeValueCommand	TokenNameIdentifier	 get Type Value Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
typevl	TokenNameIdentifier	 typevl
=	TokenNameEQUAL	
getTypeValue	TokenNameIdentifier	 get Type Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
typevl	TokenNameIdentifier	 typevl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"windows"	TokenNameStringLiteral	windows
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
typevl	TokenNameIdentifier	 typevl
=	TokenNameEQUAL	
"\""	TokenNameStringLiteral	\"
+	TokenNamePLUS	
typevl	TokenNameIdentifier	 typevl
+	TokenNamePLUS	
"\""	TokenNameStringLiteral	\"
;	TokenNameSEMICOLON	
// Windows quoting of the value 	TokenNameCOMMENT_LINE	Windows quoting of the value 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
typevl	TokenNameIdentifier	 typevl
=	TokenNameEQUAL	
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
typevl	TokenNameIdentifier	 typevl
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
typevl	TokenNameIdentifier	 typevl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * -replace flag -- replace the existing value of the attribute */	TokenNameCOMMENT_JAVADOC	 -replace flag -- replace the existing value of the attribute 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_REPLACE	TokenNameIdentifier	 FLAG  REPLACE
=	TokenNameEQUAL	
"-replace"	TokenNameStringLiteral	-replace
;	TokenNameSEMICOLON	
/** * -recurse flag -- process all subdirectories */	TokenNameCOMMENT_JAVADOC	 -recurse flag -- process all subdirectories 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_RECURSE	TokenNameIdentifier	 FLAG  RECURSE
=	TokenNameEQUAL	
"-recurse"	TokenNameStringLiteral	-recurse
;	TokenNameSEMICOLON	
/** * -version flag -- attach attribute to specified version */	TokenNameCOMMENT_JAVADOC	 -version flag -- attach attribute to specified version 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
=	TokenNameEQUAL	
"-version"	TokenNameStringLiteral	-version
;	TokenNameSEMICOLON	
/** * -c flag -- comment to attach to the element */	TokenNameCOMMENT_JAVADOC	 -c flag -- comment to attach to the element 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
=	TokenNameEQUAL	
"-c"	TokenNameStringLiteral	-c
;	TokenNameSEMICOLON	
/** * -cfile flag -- file containing a comment to attach to the file */	TokenNameCOMMENT_JAVADOC	 -cfile flag -- file containing a comment to attach to the file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_COMMENTFILE	TokenNameIdentifier	 FLAG  COMMENTFILE
=	TokenNameEQUAL	
"-cfile"	TokenNameStringLiteral	-cfile
;	TokenNameSEMICOLON	
/** * -nc flag -- no comment is specified */	TokenNameCOMMENT_JAVADOC	 -nc flag -- no comment is specified 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_NOCOMMENT	TokenNameIdentifier	 FLAG  NOCOMMENT
=	TokenNameEQUAL	
"-nc"	TokenNameStringLiteral	-nc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
