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
/** * Performs ClearCase mkelem. * * <p> * The following attributes are interpreted: * <table border="1"> * <tr> * <th>Attribute</th> * <th>Values</th> * <th>Required</th> * </tr> * <tr> * <td>viewpath</td> * <td>Path to the ClearCase view file or directory that the command will operate on</td> * <td>Yes</td> * <tr> * <tr> * <td>comment</td> * <td>Specify a comment. Only one of comment or cfile may be used.</td> * <td>No</td> * <tr> * <tr> * <td>commentfile</td> * <td>Specify a file containing a comment. Only one of comment or cfile may be used.</td> * <td>No</td> * <tr> * <tr> * <td>nowarn</td> * <td>Suppress warning messages</td> * <td>No</td> * <tr> * <tr> * <td>nocheckout</td> * <td>Do not checkout after element creation</td> * <td>No</td> * <tr> * <tr> * <td>checkin</td> * <td>Checkin element after creation</td> * <td>No</td> * <tr> * <tr> * <td>preservetime</td> * <td>Preserve the modification time (for checkin)</td> * <td>No</td> * <tr> * <tr> * <td>master</td> * <td>Assign mastership of the main branch to the current site</td> * <td>No</td> * <tr> * <tr> * <td>eltype</td> * <td>Element type to use during element creation</td> * <td>No</td> * <tr> * <tr> * <td>failonerr</td> * <td>Throw an exception if the command fails. Default is true</td> * <td>No</td> * <tr> * </table> * */	TokenNameCOMMENT_JAVADOC	 Performs ClearCase mkelem. * <p> The following attributes are interpreted: <table border="1"> <tr> <th>Attribute</th> <th>Values</th> <th>Required</th> </tr> <tr> <td>viewpath</td> <td>Path to the ClearCase view file or directory that the command will operate on</td> <td>Yes</td> <tr> <tr> <td>comment</td> <td>Specify a comment. Only one of comment or cfile may be used.</td> <td>No</td> <tr> <tr> <td>commentfile</td> <td>Specify a file containing a comment. Only one of comment or cfile may be used.</td> <td>No</td> <tr> <tr> <td>nowarn</td> <td>Suppress warning messages</td> <td>No</td> <tr> <tr> <td>nocheckout</td> <td>Do not checkout after element creation</td> <td>No</td> <tr> <tr> <td>checkin</td> <td>Checkin element after creation</td> <td>No</td> <tr> <tr> <td>preservetime</td> <td>Preserve the modification time (for checkin)</td> <td>No</td> <tr> <tr> <td>master</td> <td>Assign mastership of the main branch to the current site</td> <td>No</td> <tr> <tr> <td>eltype</td> <td>Element type to use during element creation</td> <td>No</td> <tr> <tr> <td>failonerr</td> <td>Throw an exception if the command fails. Default is true</td> <td>No</td> <tr> </table> 
public	TokenNamepublic	
class	TokenNameclass	
CCMkelem	TokenNameIdentifier	 CC Mkelem
extends	TokenNameextends	
ClearCase	TokenNameIdentifier	 Clear Case
{	TokenNameLBRACE	
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
private	TokenNameprivate	
boolean	TokenNameboolean	
mNwarn	TokenNameIdentifier	 m Nwarn
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mPtime	TokenNameIdentifier	 m Ptime
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mNoco	TokenNameIdentifier	 m Noco
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mCheckin	TokenNameIdentifier	 m Checkin
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mMaster	TokenNameIdentifier	 m Master
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mEltype	TokenNameIdentifier	 m Eltype
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
// cleartool mkelem [options...] [viewpath ...] 	TokenNameCOMMENT_LINE	cleartool mkelem [options...] [viewpath ...] 
// as specified in the CLEARTOOL.EXE help 	TokenNameCOMMENT_LINE	as specified in the CLEARTOOL.EXE help 
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
COMMAND_MKELEM	TokenNameIdentifier	 COMMAND  MKELEM
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
getNoWarn	TokenNameIdentifier	 get No Warn
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -nwarn 	TokenNameCOMMENT_LINE	-nwarn 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_NOWARN	TokenNameIdentifier	 FLAG  NOWARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Should choose either -ci or -nco. */	TokenNameCOMMENT_BLOCK	 Should choose either -ci or -nco. 
if	TokenNameif	
(	TokenNameLPAREN	
getNoCheckout	TokenNameIdentifier	 get No Checkout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
getCheckin	TokenNameIdentifier	 get Checkin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Should choose either [nocheckout | checkin]"	TokenNameStringLiteral	Should choose either [nocheckout | checkin]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNoCheckout	TokenNameIdentifier	 get No Checkout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -nco 	TokenNameCOMMENT_LINE	-nco 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_NOCHECKOUT	TokenNameIdentifier	 FLAG  NOCHECKOUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getCheckin	TokenNameIdentifier	 get Checkin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -ci 	TokenNameCOMMENT_LINE	-ci 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_CHECKIN	TokenNameIdentifier	 FLAG  CHECKIN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getPreserveTime	TokenNameIdentifier	 get Preserve Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -ptime 	TokenNameCOMMENT_LINE	-ptime 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_PRESERVETIME	TokenNameIdentifier	 FLAG  PRESERVETIME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getMaster	TokenNameIdentifier	 get Master
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -master 	TokenNameCOMMENT_LINE	-master 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_MASTER	TokenNameIdentifier	 FLAG  MASTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getEltype	TokenNameIdentifier	 get Eltype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -eltype 	TokenNameCOMMENT_LINE	-eltype 
getEltypeCommand	TokenNameIdentifier	 get Eltype Command
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
/** * Sets the comment string. * * @param comment the comment string */	TokenNameCOMMENT_JAVADOC	 Sets the comment string. * @param comment the comment string 
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
/** * Specifies a file containing a comment. * * @param cfile the path to the comment file */	TokenNameCOMMENT_JAVADOC	 Specifies a file containing a comment. * @param cfile the path to the comment file 
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
/** * If true, suppress warning messages. * * @param nwarn the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, suppress warning messages. * @param nwarn the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setNoWarn	TokenNameIdentifier	 set No Warn
(	TokenNameLPAREN	
boolean	TokenNameboolean	
nwarn	TokenNameIdentifier	 nwarn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mNwarn	TokenNameIdentifier	 m Nwarn
=	TokenNameEQUAL	
nwarn	TokenNameIdentifier	 nwarn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get nowarn flag status * * @return boolean containing status of nwarn flag */	TokenNameCOMMENT_JAVADOC	 Get nowarn flag status * @return boolean containing status of nwarn flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getNoWarn	TokenNameIdentifier	 get No Warn
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mNwarn	TokenNameIdentifier	 m Nwarn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, preserve the modification time. * * @param ptime the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, preserve the modification time. * @param ptime the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setPreserveTime	TokenNameIdentifier	 set Preserve Time
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ptime	TokenNameIdentifier	 ptime
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mPtime	TokenNameIdentifier	 m Ptime
=	TokenNameEQUAL	
ptime	TokenNameIdentifier	 ptime
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get preservetime flag status * * @return boolean containing status of preservetime flag */	TokenNameCOMMENT_JAVADOC	 Get preservetime flag status * @return boolean containing status of preservetime flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getPreserveTime	TokenNameIdentifier	 get Preserve Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mPtime	TokenNameIdentifier	 m Ptime
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, do not checkout element after creation. * * @param co the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, do not checkout element after creation. * @param co the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setNoCheckout	TokenNameIdentifier	 set No Checkout
(	TokenNameLPAREN	
boolean	TokenNameboolean	
co	TokenNameIdentifier	 co
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mNoco	TokenNameIdentifier	 m Noco
=	TokenNameEQUAL	
co	TokenNameIdentifier	 co
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get no checkout flag status * * @return boolean containing status of noco flag */	TokenNameCOMMENT_JAVADOC	 Get no checkout flag status * @return boolean containing status of noco flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getNoCheckout	TokenNameIdentifier	 get No Checkout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mNoco	TokenNameIdentifier	 m Noco
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, checkin the element after creation * * @param ci the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, checkin the element after creation * @param ci the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setCheckin	TokenNameIdentifier	 set Checkin
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mCheckin	TokenNameIdentifier	 m Checkin
=	TokenNameEQUAL	
ci	TokenNameIdentifier	 ci
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get ci flag status * * @return boolean containing status of ci flag */	TokenNameCOMMENT_JAVADOC	 Get ci flag status * @return boolean containing status of ci flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCheckin	TokenNameIdentifier	 get Checkin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mCheckin	TokenNameIdentifier	 m Checkin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, changes mastership of the main branch * to the current site * * @param master the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, changes mastership of the main branch to the current site * @param master the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setMaster	TokenNameIdentifier	 set Master
(	TokenNameLPAREN	
boolean	TokenNameboolean	
master	TokenNameIdentifier	 master
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mMaster	TokenNameIdentifier	 m Master
=	TokenNameEQUAL	
master	TokenNameIdentifier	 master
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get master flag status * * @return boolean containing status of master flag */	TokenNameCOMMENT_JAVADOC	 Get master flag status * @return boolean containing status of master flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getMaster	TokenNameIdentifier	 get Master
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mMaster	TokenNameIdentifier	 m Master
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specifies the element type to use. * * @param eltype to create element */	TokenNameCOMMENT_JAVADOC	 Specifies the element type to use. * @param eltype to create element 
public	TokenNamepublic	
void	TokenNamevoid	
setEltype	TokenNameIdentifier	 set Eltype
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eltype	TokenNameIdentifier	 eltype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mEltype	TokenNameIdentifier	 m Eltype
=	TokenNameEQUAL	
eltype	TokenNameIdentifier	 eltype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get element type * * @return String containing the element type */	TokenNameCOMMENT_JAVADOC	 Get element type * @return String containing the element type 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEltype	TokenNameIdentifier	 get Eltype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mEltype	TokenNameIdentifier	 m Eltype
;	TokenNameSEMICOLON	
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
/** * Get the 'element type' command * * @param cmd containing the command line string with or * without the comment flag and string appended */	TokenNameCOMMENT_JAVADOC	 Get the 'element type' command * @param cmd containing the command line string with or without the comment flag and string appended 
private	TokenNameprivate	
void	TokenNamevoid	
getEltypeCommand	TokenNameIdentifier	 get Eltype Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getEltype	TokenNameIdentifier	 get Eltype
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
FLAG_ELTYPE	TokenNameIdentifier	 FLAG  ELTYPE
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
getEltype	TokenNameIdentifier	 get Eltype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * -c flag -- comment to attach to the file */	TokenNameCOMMENT_JAVADOC	 -c flag -- comment to attach to the file 
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
/** * -nwarn flag -- suppresses warning messages */	TokenNameCOMMENT_JAVADOC	 -nwarn flag -- suppresses warning messages 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_NOWARN	TokenNameIdentifier	 FLAG  NOWARN
=	TokenNameEQUAL	
"-nwarn"	TokenNameStringLiteral	-nwarn
;	TokenNameSEMICOLON	
/** * -ptime flag -- preserves the modification time on checkin */	TokenNameCOMMENT_JAVADOC	 -ptime flag -- preserves the modification time on checkin 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_PRESERVETIME	TokenNameIdentifier	 FLAG  PRESERVETIME
=	TokenNameEQUAL	
"-ptime"	TokenNameStringLiteral	-ptime
;	TokenNameSEMICOLON	
/** * -nco flag -- do not checkout element after creation */	TokenNameCOMMENT_JAVADOC	 -nco flag -- do not checkout element after creation 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_NOCHECKOUT	TokenNameIdentifier	 FLAG  NOCHECKOUT
=	TokenNameEQUAL	
"-nco"	TokenNameStringLiteral	-nco
;	TokenNameSEMICOLON	
/** * -ci flag -- checkin element after creation */	TokenNameCOMMENT_JAVADOC	 -ci flag -- checkin element after creation 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_CHECKIN	TokenNameIdentifier	 FLAG  CHECKIN
=	TokenNameEQUAL	
"-ci"	TokenNameStringLiteral	-ci
;	TokenNameSEMICOLON	
/** * -master flag -- change mastership of main branch to current site */	TokenNameCOMMENT_JAVADOC	 -master flag -- change mastership of main branch to current site 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_MASTER	TokenNameIdentifier	 FLAG  MASTER
=	TokenNameEQUAL	
"-master"	TokenNameStringLiteral	-master
;	TokenNameSEMICOLON	
/** * -eltype flag -- element type to use during creation */	TokenNameCOMMENT_JAVADOC	 -eltype flag -- element type to use during creation 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_ELTYPE	TokenNameIdentifier	 FLAG  ELTYPE
=	TokenNameEQUAL	
"-eltype"	TokenNameStringLiteral	-eltype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
