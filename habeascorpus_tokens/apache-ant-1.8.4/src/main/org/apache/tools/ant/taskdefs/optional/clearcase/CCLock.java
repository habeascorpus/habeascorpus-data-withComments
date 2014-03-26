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
/** * TODO: * comment field doesn't include all options yet */	TokenNameCOMMENT_JAVADOC	 TODO: comment field doesn't include all options yet 
/** * Performs a ClearCase Lock command. * * <p> * The following attributes are interpreted: * <table border="1"> * <tr> * <th>Attribute</th> * <th>Values</th> * <th>Required</th> * </tr> * <tr> * <td>replace</td> * <td>Specifies replacing an existing lock</td> * <td>No</td> * <tr> * <tr> * <td>nusers</td> * <td>Specifies user(s) who can still modify the object/pname</td> * <td>No</td> * <tr> * <tr> * <td>obsolete</td> * <td>Specifies that the object/pname should be marked obsolete</td> * <td>No</td> * <tr> * <tr> * <td>comment</td> * <td>Specifies how to populate comments fields</td> * <td>No</td> * <tr> * <tr> * <td>pname</td> * <td>Specifies the pathname to be locked.</td> * <td>No</td> * <tr> * <td>objselect</td> * <td>This variable is obsolete. Should use <i>objsel</i> instead.</td> * <td>No</td> * <tr> * <tr> * <td>objsel</td> * <td>Specifies the object(s) to be unlocked.</td> * <td>No</td> * <tr> * <tr> * <td>failonerr</td> * <td>Throw an exception if the command fails. Default is true</td> * <td>No</td> * <tr> * </table> * */	TokenNameCOMMENT_JAVADOC	 Performs a ClearCase Lock command. * <p> The following attributes are interpreted: <table border="1"> <tr> <th>Attribute</th> <th>Values</th> <th>Required</th> </tr> <tr> <td>replace</td> <td>Specifies replacing an existing lock</td> <td>No</td> <tr> <tr> <td>nusers</td> <td>Specifies user(s) who can still modify the object/pname</td> <td>No</td> <tr> <tr> <td>obsolete</td> <td>Specifies that the object/pname should be marked obsolete</td> <td>No</td> <tr> <tr> <td>comment</td> <td>Specifies how to populate comments fields</td> <td>No</td> <tr> <tr> <td>pname</td> <td>Specifies the pathname to be locked.</td> <td>No</td> <tr> <td>objselect</td> <td>This variable is obsolete. Should use <i>objsel</i> instead.</td> <td>No</td> <tr> <tr> <td>objsel</td> <td>Specifies the object(s) to be unlocked.</td> <td>No</td> <tr> <tr> <td>failonerr</td> <td>Throw an exception if the command fails. Default is true</td> <td>No</td> <tr> </table> 
public	TokenNamepublic	
class	TokenNameclass	
CCLock	TokenNameIdentifier	 CC Lock
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
mObsolete	TokenNameIdentifier	 m Obsolete
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mComment	TokenNameIdentifier	 m Comment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mNusers	TokenNameIdentifier	 m Nusers
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mPname	TokenNameIdentifier	 m Pname
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mObjselect	TokenNameIdentifier	 m Objselect
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
// cleartool lock [options...] 	TokenNameCOMMENT_LINE	cleartool lock [options...] 
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
COMMAND_LOCK	TokenNameIdentifier	 COMMAND  LOCK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check the command line options 	TokenNameCOMMENT_LINE	Check the command line options 
checkOptions	TokenNameIdentifier	 check Options
(	TokenNameLPAREN	
commandLine	TokenNameIdentifier	 command Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For debugging 	TokenNameCOMMENT_LINE	For debugging 
// System.out.println(commandLine.toString()); 	TokenNameCOMMENT_LINE	System.out.println(commandLine.toString()); 
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
getOpType	TokenNameIdentifier	 get Op Type
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
getObsolete	TokenNameIdentifier	 get Obsolete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -obsolete 	TokenNameCOMMENT_LINE	-obsolete 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_OBSOLETE	TokenNameIdentifier	 FLAG  OBSOLETE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
getNusersCommand	TokenNameIdentifier	 get Nusers Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getCommentCommand	TokenNameIdentifier	 get Comment Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getObjselect	TokenNameIdentifier	 get Objselect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getPname	TokenNameIdentifier	 get Pname
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
"Should select either an element "	TokenNameStringLiteral	Should select either an element 
+	TokenNamePLUS	
"(pname) or an object (objselect)"	TokenNameStringLiteral	(pname) or an object (objselect)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getPnameCommand	TokenNameIdentifier	 get Pname Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// object selector 	TokenNameCOMMENT_LINE	object selector 
if	TokenNameif	
(	TokenNameLPAREN	
getObjselect	TokenNameIdentifier	 get Objselect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
getObjselect	TokenNameIdentifier	 get Objselect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If true, replace an existing lock. * * @param replace the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, replace an existing lock. * @param replace the status to set the flag to 
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
/** * If true, mark object as obsolete. * * @param obsolete the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, mark object as obsolete. * @param obsolete the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setObsolete	TokenNameIdentifier	 set Obsolete
(	TokenNameLPAREN	
boolean	TokenNameboolean	
obsolete	TokenNameIdentifier	 obsolete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mObsolete	TokenNameIdentifier	 m Obsolete
=	TokenNameEQUAL	
obsolete	TokenNameIdentifier	 obsolete
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get obsolete flag status * * @return boolean containing status of obsolete flag */	TokenNameCOMMENT_JAVADOC	 Get obsolete flag status * @return boolean containing status of obsolete flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getObsolete	TokenNameIdentifier	 get Obsolete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mObsolete	TokenNameIdentifier	 m Obsolete
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the users who may continue to * edit the object while it is locked. * * @param nusers users excluded from lock */	TokenNameCOMMENT_JAVADOC	 Sets the users who may continue to edit the object while it is locked. * @param nusers users excluded from lock 
public	TokenNamepublic	
void	TokenNamevoid	
setNusers	TokenNameIdentifier	 set Nusers
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nusers	TokenNameIdentifier	 nusers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mNusers	TokenNameIdentifier	 m Nusers
=	TokenNameEQUAL	
nusers	TokenNameIdentifier	 nusers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get nusers list * * @return String containing the list of users excluded from lock */	TokenNameCOMMENT_JAVADOC	 Get nusers list * @return String containing the list of users excluded from lock 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNusers	TokenNameIdentifier	 get Nusers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mNusers	TokenNameIdentifier	 m Nusers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets how comments should be written * for the event record(s) * * @param comment comment method to use */	TokenNameCOMMENT_JAVADOC	 Sets how comments should be written for the event record(s) * @param comment comment method to use 
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
/** * Get comment method * * @return String containing the desired comment method */	TokenNameCOMMENT_JAVADOC	 Get comment method * @return String containing the desired comment method 
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
/** * Sets the pathname to be locked * * @param pname pathname to be locked */	TokenNameCOMMENT_JAVADOC	 Sets the pathname to be locked * @param pname pathname to be locked 
public	TokenNamepublic	
void	TokenNamevoid	
setPname	TokenNameIdentifier	 set Pname
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pname	TokenNameIdentifier	 pname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mPname	TokenNameIdentifier	 m Pname
=	TokenNameEQUAL	
pname	TokenNameIdentifier	 pname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the pathname to be locked * * @return String containing the pathname to be locked */	TokenNameCOMMENT_JAVADOC	 Get the pathname to be locked * @return String containing the pathname to be locked 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPname	TokenNameIdentifier	 get Pname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mPname	TokenNameIdentifier	 m Pname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the object(s) to be locked * * @param objsel objects to be locked * @since ant 1.6.1 */	TokenNameCOMMENT_JAVADOC	 Sets the object(s) to be locked * @param objsel objects to be locked @since ant 1.6.1 
public	TokenNamepublic	
void	TokenNamevoid	
setObjSel	TokenNameIdentifier	 set Obj Sel
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
objsel	TokenNameIdentifier	 objsel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mObjselect	TokenNameIdentifier	 m Objselect
=	TokenNameEQUAL	
objsel	TokenNameIdentifier	 objsel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the object(s) to be locked * * @param objselect objects to be locked */	TokenNameCOMMENT_JAVADOC	 Sets the object(s) to be locked * @param objselect objects to be locked 
public	TokenNamepublic	
void	TokenNamevoid	
setObjselect	TokenNameIdentifier	 set Objselect
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
objselect	TokenNameIdentifier	 objselect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mObjselect	TokenNameIdentifier	 m Objselect
=	TokenNameEQUAL	
objselect	TokenNameIdentifier	 objselect
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get list of objects to be locked * * @return String containing the objects to be locked */	TokenNameCOMMENT_JAVADOC	 Get list of objects to be locked * @return String containing the objects to be locked 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getObjselect	TokenNameIdentifier	 get Objselect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mObjselect	TokenNameIdentifier	 m Objselect
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the 'nusers' command * * @param cmd containing the command line string with or * without the nusers flag and value appended */	TokenNameCOMMENT_JAVADOC	 Get the 'nusers' command * @param cmd containing the command line string with or without the nusers flag and value appended 
private	TokenNameprivate	
void	TokenNamevoid	
getNusersCommand	TokenNameIdentifier	 get Nusers Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNusers	TokenNameIdentifier	 get Nusers
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
FLAG_NUSERS	TokenNameIdentifier	 FLAG  NUSERS
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
getNusers	TokenNameIdentifier	 get Nusers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the 'comment' command * * @param cmd containing the command line string with or without the * comment flag and value appended */	TokenNameCOMMENT_JAVADOC	 Get the 'comment' command * @param cmd containing the command line string with or without the comment flag and value appended 
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
/** * Get the 'pname' command * * @param cmd containing the command line string with or * without the pname flag and value appended */	TokenNameCOMMENT_JAVADOC	 Get the 'pname' command * @param cmd containing the command line string with or without the pname flag and value appended 
private	TokenNameprivate	
void	TokenNamevoid	
getPnameCommand	TokenNameIdentifier	 get Pname Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPname	TokenNameIdentifier	 get Pname
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
FLAG_PNAME	TokenNameIdentifier	 FLAG  PNAME
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
getPname	TokenNameIdentifier	 get Pname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return which object/pname is being operated on * * @return String containing the object/pname being worked on */	TokenNameCOMMENT_JAVADOC	 Return which object/pname is being operated on * @return String containing the object/pname being worked on 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getOpType	TokenNameIdentifier	 get Op Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPname	TokenNameIdentifier	 get Pname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPname	TokenNameIdentifier	 get Pname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
getObjselect	TokenNameIdentifier	 get Objselect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * -replace flag -- replace existing lock on object(s) */	TokenNameCOMMENT_JAVADOC	 -replace flag -- replace existing lock on object(s) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_REPLACE	TokenNameIdentifier	 FLAG  REPLACE
=	TokenNameEQUAL	
"-replace"	TokenNameStringLiteral	-replace
;	TokenNameSEMICOLON	
/** * -nusers flag -- list of users to exclude from lock */	TokenNameCOMMENT_JAVADOC	 -nusers flag -- list of users to exclude from lock 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_NUSERS	TokenNameIdentifier	 FLAG  NUSERS
=	TokenNameEQUAL	
"-nusers"	TokenNameStringLiteral	-nusers
;	TokenNameSEMICOLON	
/** * -obsolete flag -- mark locked object as obsolete */	TokenNameCOMMENT_JAVADOC	 -obsolete flag -- mark locked object as obsolete 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_OBSOLETE	TokenNameIdentifier	 FLAG  OBSOLETE
=	TokenNameEQUAL	
"-obsolete"	TokenNameStringLiteral	-obsolete
;	TokenNameSEMICOLON	
/** * -comment flag -- method to use for commenting events */	TokenNameCOMMENT_JAVADOC	 -comment flag -- method to use for commenting events 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
=	TokenNameEQUAL	
"-comment"	TokenNameStringLiteral	-comment
;	TokenNameSEMICOLON	
/** * -pname flag -- pathname to lock */	TokenNameCOMMENT_JAVADOC	 -pname flag -- pathname to lock 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_PNAME	TokenNameIdentifier	 FLAG  PNAME
=	TokenNameEQUAL	
"-pname"	TokenNameStringLiteral	-pname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
