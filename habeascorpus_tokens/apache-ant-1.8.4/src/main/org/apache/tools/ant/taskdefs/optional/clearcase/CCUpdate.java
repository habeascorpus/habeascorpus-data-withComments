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
/** * Performs a ClearCase Update command. * * <p> * The following attributes are interpreted: * <table border="1"> * <tr> * <th>Attribute</th> * <th>Values</th> * <th>Required</th> * </tr> * <tr> * <td>viewpath</td> * <td>Path to the ClearCase view file or directory that the command will operate on</td> * <td>No</td> * <tr> * <tr> * <td>graphical</td> * <td>Displays a graphical dialog during the update</td> * <td>No</td> * <tr> * <tr> * <td>log</td> * <td>Specifies a log file for ClearCase to write to</td> * <td>No</td> * <tr> * <tr> * <td>overwrite</td> * <td>Specifies whether to overwrite hijacked files or not</td> * <td>No</td> * <tr> * <tr> * <td>rename</td> * <td>Specifies that hijacked files should be renamed with a .keep extension</td> * <td>No</td> * <tr> * <tr> * <td>currenttime</td> * <td>Specifies that modification time should be written as the current * time. Either currenttime or preservetime can be specified.</td> * <td>No</td> * <tr> * <tr> * <td>preservetime</td> * <td>Specifies that modification time should preserved from the VOB * time. Either currenttime or preservetime can be specified.</td> * <td>No</td> * <tr> * <tr> * <td>failonerr</td> * <td>Throw an exception if the command fails. Default is true</td> * <td>No</td> * <tr> * </table> * */	TokenNameCOMMENT_JAVADOC	 Performs a ClearCase Update command. * <p> The following attributes are interpreted: <table border="1"> <tr> <th>Attribute</th> <th>Values</th> <th>Required</th> </tr> <tr> <td>viewpath</td> <td>Path to the ClearCase view file or directory that the command will operate on</td> <td>No</td> <tr> <tr> <td>graphical</td> <td>Displays a graphical dialog during the update</td> <td>No</td> <tr> <tr> <td>log</td> <td>Specifies a log file for ClearCase to write to</td> <td>No</td> <tr> <tr> <td>overwrite</td> <td>Specifies whether to overwrite hijacked files or not</td> <td>No</td> <tr> <tr> <td>rename</td> <td>Specifies that hijacked files should be renamed with a .keep extension</td> <td>No</td> <tr> <tr> <td>currenttime</td> <td>Specifies that modification time should be written as the current time. Either currenttime or preservetime can be specified.</td> <td>No</td> <tr> <tr> <td>preservetime</td> <td>Specifies that modification time should preserved from the VOB time. Either currenttime or preservetime can be specified.</td> <td>No</td> <tr> <tr> <td>failonerr</td> <td>Throw an exception if the command fails. Default is true</td> <td>No</td> <tr> </table> 
public	TokenNamepublic	
class	TokenNameclass	
CCUpdate	TokenNameIdentifier	 CC Update
extends	TokenNameextends	
ClearCase	TokenNameIdentifier	 Clear Case
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
mGraphical	TokenNameIdentifier	 m Graphical
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mOverwrite	TokenNameIdentifier	 m Overwrite
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mRename	TokenNameIdentifier	 m Rename
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mCtime	TokenNameIdentifier	 m Ctime
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
String	TokenNameIdentifier	 String
mLog	TokenNameIdentifier	 m Log
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
// build the command line from what we got the format is 	TokenNameCOMMENT_LINE	build the command line from what we got the format is 
// cleartool update [options...] [viewpath ...] 	TokenNameCOMMENT_LINE	cleartool update [options...] [viewpath ...] 
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
COMMAND_UPDATE	TokenNameIdentifier	 COMMAND  UPDATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check the command line options 	TokenNameCOMMENT_LINE	Check the command line options 
checkOptions	TokenNameIdentifier	 check Options
(	TokenNameLPAREN	
commandLine	TokenNameIdentifier	 command Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For debugging 	TokenNameCOMMENT_LINE	For debugging 
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
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
// ClearCase items 	TokenNameCOMMENT_LINE	ClearCase items 
if	TokenNameif	
(	TokenNameLPAREN	
getGraphical	TokenNameIdentifier	 get Graphical
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -graphical 	TokenNameCOMMENT_LINE	-graphical 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_GRAPHICAL	TokenNameIdentifier	 FLAG  GRAPHICAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getOverwrite	TokenNameIdentifier	 get Overwrite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -overwrite 	TokenNameCOMMENT_LINE	-overwrite 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_OVERWRITE	TokenNameIdentifier	 FLAG  OVERWRITE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getRename	TokenNameIdentifier	 get Rename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -rename 	TokenNameCOMMENT_LINE	-rename 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_RENAME	TokenNameIdentifier	 FLAG  RENAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// -noverwrite 	TokenNameCOMMENT_LINE	-noverwrite 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_NOVERWRITE	TokenNameIdentifier	 FLAG  NOVERWRITE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -ctime 	TokenNameCOMMENT_LINE	-ctime 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_CURRENTTIME	TokenNameIdentifier	 FLAG  CURRENTTIME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
// -log logname 	TokenNameCOMMENT_LINE	-log logname 
getLogCommand	TokenNameIdentifier	 get Log Command
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
/** * If true, displays a graphical dialog during the update. * * @param graphical the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, displays a graphical dialog during the update. * @param graphical the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setGraphical	TokenNameIdentifier	 set Graphical
(	TokenNameLPAREN	
boolean	TokenNameboolean	
graphical	TokenNameIdentifier	 graphical
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mGraphical	TokenNameIdentifier	 m Graphical
=	TokenNameEQUAL	
graphical	TokenNameIdentifier	 graphical
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get graphical flag status * * @return boolean containing status of graphical flag */	TokenNameCOMMENT_JAVADOC	 Get graphical flag status * @return boolean containing status of graphical flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getGraphical	TokenNameIdentifier	 get Graphical
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mGraphical	TokenNameIdentifier	 m Graphical
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, overwrite hijacked files. * * @param ow the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, overwrite hijacked files. * @param ow the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setOverwrite	TokenNameIdentifier	 set Overwrite
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ow	TokenNameIdentifier	 ow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mOverwrite	TokenNameIdentifier	 m Overwrite
=	TokenNameEQUAL	
ow	TokenNameIdentifier	 ow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get overwrite hijacked files status * * @return boolean containing status of overwrite flag */	TokenNameCOMMENT_JAVADOC	 Get overwrite hijacked files status * @return boolean containing status of overwrite flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOverwrite	TokenNameIdentifier	 get Overwrite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mOverwrite	TokenNameIdentifier	 m Overwrite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, hijacked files are renamed with a .keep extension. * * @param ren the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, hijacked files are renamed with a .keep extension. * @param ren the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setRename	TokenNameIdentifier	 set Rename
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ren	TokenNameIdentifier	 ren
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mRename	TokenNameIdentifier	 m Rename
=	TokenNameEQUAL	
ren	TokenNameIdentifier	 ren
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get rename hijacked files status * * @return boolean containing status of rename flag */	TokenNameCOMMENT_JAVADOC	 Get rename hijacked files status * @return boolean containing status of rename flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getRename	TokenNameIdentifier	 get Rename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mRename	TokenNameIdentifier	 m Rename
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, modification time should be written as the current time. * Either currenttime or preservetime can be specified. * * @param ct the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, modification time should be written as the current time. Either currenttime or preservetime can be specified. * @param ct the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentTime	TokenNameIdentifier	 set Current Time
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ct	TokenNameIdentifier	 ct
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mCtime	TokenNameIdentifier	 m Ctime
=	TokenNameEQUAL	
ct	TokenNameIdentifier	 ct
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get current time status * * @return boolean containing status of current time flag */	TokenNameCOMMENT_JAVADOC	 Get current time status * @return boolean containing status of current time flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mCtime	TokenNameIdentifier	 m Ctime
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, modification time should be preserved from the VOB time. * Either currenttime or preservetime can be specified. * * @param pt the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, modification time should be preserved from the VOB time. Either currenttime or preservetime can be specified. * @param pt the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setPreserveTime	TokenNameIdentifier	 set Preserve Time
(	TokenNameLPAREN	
boolean	TokenNameboolean	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mPtime	TokenNameIdentifier	 m Ptime
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get preserve time status * * @return boolean containing status of preserve time flag */	TokenNameCOMMENT_JAVADOC	 Get preserve time status * @return boolean containing status of preserve time flag 
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
/** * Sets the log file where cleartool records * the status of the command. * * @param log the path to the log file */	TokenNameCOMMENT_JAVADOC	 Sets the log file where cleartool records the status of the command. * @param log the path to the log file 
public	TokenNamepublic	
void	TokenNamevoid	
setLog	TokenNameIdentifier	 set Log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mLog	TokenNameIdentifier	 m Log
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get log file * * @return String containing the path to the log file */	TokenNameCOMMENT_JAVADOC	 Get log file * @return String containing the path to the log file 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mLog	TokenNameIdentifier	 m Log
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the 'log' command * * @param cmd containing the command line string with or without the log flag and path appended */	TokenNameCOMMENT_JAVADOC	 Get the 'log' command * @param cmd containing the command line string with or without the log flag and path appended 
private	TokenNameprivate	
void	TokenNamevoid	
getLogCommand	TokenNameIdentifier	 get Log Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
FLAG_LOG	TokenNameIdentifier	 FLAG  LOG
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
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * -graphical flag -- display graphical dialog during update operation */	TokenNameCOMMENT_JAVADOC	 -graphical flag -- display graphical dialog during update operation 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_GRAPHICAL	TokenNameIdentifier	 FLAG  GRAPHICAL
=	TokenNameEQUAL	
"-graphical"	TokenNameStringLiteral	-graphical
;	TokenNameSEMICOLON	
/** * -log flag -- file to log status to */	TokenNameCOMMENT_JAVADOC	 -log flag -- file to log status to 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_LOG	TokenNameIdentifier	 FLAG  LOG
=	TokenNameEQUAL	
"-log"	TokenNameStringLiteral	-log
;	TokenNameSEMICOLON	
/** * -overwrite flag -- overwrite hijacked files */	TokenNameCOMMENT_JAVADOC	 -overwrite flag -- overwrite hijacked files 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_OVERWRITE	TokenNameIdentifier	 FLAG  OVERWRITE
=	TokenNameEQUAL	
"-overwrite"	TokenNameStringLiteral	-overwrite
;	TokenNameSEMICOLON	
/** * -noverwrite flag -- do not overwrite hijacked files */	TokenNameCOMMENT_JAVADOC	 -noverwrite flag -- do not overwrite hijacked files 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_NOVERWRITE	TokenNameIdentifier	 FLAG  NOVERWRITE
=	TokenNameEQUAL	
"-noverwrite"	TokenNameStringLiteral	-noverwrite
;	TokenNameSEMICOLON	
/** * -rename flag -- rename hijacked files with .keep extension */	TokenNameCOMMENT_JAVADOC	 -rename flag -- rename hijacked files with .keep extension 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_RENAME	TokenNameIdentifier	 FLAG  RENAME
=	TokenNameEQUAL	
"-rename"	TokenNameStringLiteral	-rename
;	TokenNameSEMICOLON	
/** * -ctime flag -- modified time is written as the current time */	TokenNameCOMMENT_JAVADOC	 -ctime flag -- modified time is written as the current time 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_CURRENTTIME	TokenNameIdentifier	 FLAG  CURRENTTIME
=	TokenNameEQUAL	
"-ctime"	TokenNameStringLiteral	-ctime
;	TokenNameSEMICOLON	
/** * -ptime flag -- modified time is written as the VOB time */	TokenNameCOMMENT_JAVADOC	 -ptime flag -- modified time is written as the VOB time 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_PRESERVETIME	TokenNameIdentifier	 FLAG  PRESERVETIME
=	TokenNameEQUAL	
"-ptime"	TokenNameStringLiteral	-ptime
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
