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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
ExecTask	TokenNameIdentifier	 Exec Task
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
LogStreamHandler	TokenNameIdentifier	 Log Stream Handler
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * A base class for creating tasks for executing commands on ClearCase. * <p> * The class extends the 'exec' task as it operates by executing the cleartool program * supplied with ClearCase. By default the task expects the cleartool executable to be * in the path, * you can override this be specifying the cleartooldir attribute. * </p> * <p> * This class provides set and get methods for the 'viewpath' and 'objselect' * attribute. It also contains constants for the flags that can be passed to * cleartool. * </p> * */	TokenNameCOMMENT_JAVADOC	 A base class for creating tasks for executing commands on ClearCase. <p> The class extends the 'exec' task as it operates by executing the cleartool program supplied with ClearCase. By default the task expects the cleartool executable to be in the path, you can override this be specifying the cleartooldir attribute. </p> <p> This class provides set and get methods for the 'viewpath' and 'objselect' attribute. It also contains constants for the flags that can be passed to cleartool. </p> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ClearCase	TokenNameIdentifier	 Clear Case
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mClearToolDir	TokenNameIdentifier	 m Clear Tool Dir
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mviewPath	TokenNameIdentifier	 mview Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mobjSelect	TokenNameIdentifier	 mobj Select
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
pcnt	TokenNameIdentifier	 pcnt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mFailonerr	TokenNameIdentifier	 m Failonerr
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Set the directory where the cleartool executable is located. * * @param dir the directory containing the cleartool executable */	TokenNameCOMMENT_JAVADOC	 Set the directory where the cleartool executable is located. * @param dir the directory containing the cleartool executable 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setClearToolDir	TokenNameIdentifier	 set Clear Tool Dir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mClearToolDir	TokenNameIdentifier	 m Clear Tool Dir
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
translatePath	TokenNameIdentifier	 translate Path
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds and returns the command string to execute cleartool * * @return String containing path to the executable */	TokenNameCOMMENT_JAVADOC	 Builds and returns the command string to execute cleartool * @return String containing path to the executable 
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getClearToolCommand	TokenNameIdentifier	 get Clear Tool Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
toReturn	TokenNameIdentifier	 to Return
=	TokenNameEQUAL	
mClearToolDir	TokenNameIdentifier	 m Clear Tool Dir
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
toReturn	TokenNameIdentifier	 to Return
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
toReturn	TokenNameIdentifier	 to Return
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toReturn	TokenNameIdentifier	 to Return
+=	TokenNamePLUS_EQUAL	
"/"	TokenNameStringLiteral	/
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
toReturn	TokenNameIdentifier	 to Return
+=	TokenNamePLUS_EQUAL	
CLEARTOOL_EXE	TokenNameIdentifier	 CLEARTOOL  EXE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toReturn	TokenNameIdentifier	 to Return
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the path to the item in a ClearCase view to operate on. * * @param viewPath Path to the view directory or file */	TokenNameCOMMENT_JAVADOC	 Set the path to the item in a ClearCase view to operate on. * @param viewPath Path to the view directory or file 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setViewPath	TokenNameIdentifier	 set View Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
viewPath	TokenNameIdentifier	 view Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mviewPath	TokenNameIdentifier	 mview Path
=	TokenNameEQUAL	
viewPath	TokenNameIdentifier	 view Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the path to the item in a clearcase view * * @return mviewPath */	TokenNameCOMMENT_JAVADOC	 Get the path to the item in a clearcase view * @return mviewPath 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getViewPath	TokenNameIdentifier	 get View Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mviewPath	TokenNameIdentifier	 mview Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the basename path of the item in a clearcase view * * @return basename */	TokenNameCOMMENT_JAVADOC	 Get the basename path of the item in a clearcase view * @return basename 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getViewPathBasename	TokenNameIdentifier	 get View Path Basename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
mviewPath	TokenNameIdentifier	 mview Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the object to operate on. * * @param objSelect object to operate on */	TokenNameCOMMENT_JAVADOC	 Set the object to operate on. * @param objSelect object to operate on 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setObjSelect	TokenNameIdentifier	 set Obj Select
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
objSelect	TokenNameIdentifier	 obj Select
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mobjSelect	TokenNameIdentifier	 mobj Select
=	TokenNameEQUAL	
objSelect	TokenNameIdentifier	 obj Select
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the object to operate on * * @return mobjSelect */	TokenNameCOMMENT_JAVADOC	 Get the object to operate on * @return mobjSelect 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getObjSelect	TokenNameIdentifier	 get Obj Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mobjSelect	TokenNameIdentifier	 mobj Select
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the given command are return success or failure * @param cmd command line to execute * @return the exit status of the subprocess or <code>INVALID</code> */	TokenNameCOMMENT_JAVADOC	 Execute the given command are return success or failure @param cmd command line to execute @return the exit status of the subprocess or <code>INVALID</code> 
protected	TokenNameprotected	
int	TokenNameint	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
aProj	TokenNameIdentifier	 a Proj
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Execute	TokenNameIdentifier	 Execute
exe	TokenNameIdentifier	 exe
=	TokenNameEQUAL	
new	TokenNamenew	
Execute	TokenNameIdentifier	 Execute
(	TokenNameLPAREN	
new	TokenNamenew	
LogStreamHandler	TokenNameIdentifier	 Log Stream Handler
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setAntRun	TokenNameIdentifier	 set Ant Run
(	TokenNameLPAREN	
aProj	TokenNameIdentifier	 a Proj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setWorkingDirectory	TokenNameIdentifier	 set Working Directory
(	TokenNameLPAREN	
aProj	TokenNameIdentifier	 a Proj
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setCommandline	TokenNameIdentifier	 set Commandline
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Execute the given command, and return it's output * @param cmdline command line to execute * @return output of the command line */	TokenNameCOMMENT_JAVADOC	 Execute the given command, and return it's output @param cmdline command line to execute @return output of the command line 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
runS	TokenNameIdentifier	 run S
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmdline	TokenNameIdentifier	 cmdline
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
outV	TokenNameIdentifier	 out V
=	TokenNameEQUAL	
"opts.cc.runS.output"	TokenNameStringLiteral	opts.cc.runS.output
+	TokenNamePLUS	
pcnt	TokenNameIdentifier	 pcnt
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ExecTask	TokenNameIdentifier	 Exec Task
exe	TokenNameIdentifier	 exe
=	TokenNameEQUAL	
new	TokenNamenew	
ExecTask	TokenNameIdentifier	 Exec Task
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
Argument	TokenNameIdentifier	 Argument
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
cmdline	TokenNameIdentifier	 cmdline
.	TokenNameDOT	
getExecutable	TokenNameIdentifier	 get Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
cmdline	TokenNameIdentifier	 cmdline
.	TokenNameDOT	
getArguments	TokenNameIdentifier	 get Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setOutputproperty	TokenNameIdentifier	 set Outputproperty
(	TokenNameLPAREN	
outV	TokenNameIdentifier	 out V
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
outV	TokenNameIdentifier	 out V
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, command will throw an exception on failure. * * @param failonerr the status to set the flag to * @since ant 1.6.1 */	TokenNameCOMMENT_JAVADOC	 If true, command will throw an exception on failure. * @param failonerr the status to set the flag to @since ant 1.6.1 
public	TokenNamepublic	
void	TokenNamevoid	
setFailOnErr	TokenNameIdentifier	 set Fail On Err
(	TokenNameLPAREN	
boolean	TokenNameboolean	
failonerr	TokenNameIdentifier	 failonerr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mFailonerr	TokenNameIdentifier	 m Failonerr
=	TokenNameEQUAL	
failonerr	TokenNameIdentifier	 failonerr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get failonerr flag status * * @return boolean containing status of failonerr flag * @since ant 1.6.1 */	TokenNameCOMMENT_JAVADOC	 Get failonerr flag status * @return boolean containing status of failonerr flag @since ant 1.6.1 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFailOnErr	TokenNameIdentifier	 get Fail On Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mFailonerr	TokenNameIdentifier	 m Failonerr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constant for the thing to execute */	TokenNameCOMMENT_JAVADOC	 Constant for the thing to execute 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CLEARTOOL_EXE	TokenNameIdentifier	 CLEARTOOL  EXE
=	TokenNameEQUAL	
"cleartool"	TokenNameStringLiteral	cleartool
;	TokenNameSEMICOLON	
/** * The 'Update' command */	TokenNameCOMMENT_JAVADOC	 The 'Update' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_UPDATE	TokenNameIdentifier	 COMMAND  UPDATE
=	TokenNameEQUAL	
"update"	TokenNameStringLiteral	update
;	TokenNameSEMICOLON	
/** * The 'Checkout' command */	TokenNameCOMMENT_JAVADOC	 The 'Checkout' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_CHECKOUT	TokenNameIdentifier	 COMMAND  CHECKOUT
=	TokenNameEQUAL	
"checkout"	TokenNameStringLiteral	checkout
;	TokenNameSEMICOLON	
/** * The 'Checkin' command */	TokenNameCOMMENT_JAVADOC	 The 'Checkin' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_CHECKIN	TokenNameIdentifier	 COMMAND  CHECKIN
=	TokenNameEQUAL	
"checkin"	TokenNameStringLiteral	checkin
;	TokenNameSEMICOLON	
/** * The 'UndoCheckout' command */	TokenNameCOMMENT_JAVADOC	 The 'UndoCheckout' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_UNCHECKOUT	TokenNameIdentifier	 COMMAND  UNCHECKOUT
=	TokenNameEQUAL	
"uncheckout"	TokenNameStringLiteral	uncheckout
;	TokenNameSEMICOLON	
/** * The 'Lock' command */	TokenNameCOMMENT_JAVADOC	 The 'Lock' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_LOCK	TokenNameIdentifier	 COMMAND  LOCK
=	TokenNameEQUAL	
"lock"	TokenNameStringLiteral	lock
;	TokenNameSEMICOLON	
/** * The 'Unlock' command */	TokenNameCOMMENT_JAVADOC	 The 'Unlock' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_UNLOCK	TokenNameIdentifier	 COMMAND  UNLOCK
=	TokenNameEQUAL	
"unlock"	TokenNameStringLiteral	unlock
;	TokenNameSEMICOLON	
/** * The 'Mkbl' command */	TokenNameCOMMENT_JAVADOC	 The 'Mkbl' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_MKBL	TokenNameIdentifier	 COMMAND  MKBL
=	TokenNameEQUAL	
"mkbl"	TokenNameStringLiteral	mkbl
;	TokenNameSEMICOLON	
/** * The 'Mklabel' command */	TokenNameCOMMENT_JAVADOC	 The 'Mklabel' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_MKLABEL	TokenNameIdentifier	 COMMAND  MKLABEL
=	TokenNameEQUAL	
"mklabel"	TokenNameStringLiteral	mklabel
;	TokenNameSEMICOLON	
/** * The 'Mklbtype' command */	TokenNameCOMMENT_JAVADOC	 The 'Mklbtype' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_MKLBTYPE	TokenNameIdentifier	 COMMAND  MKLBTYPE
=	TokenNameEQUAL	
"mklbtype"	TokenNameStringLiteral	mklbtype
;	TokenNameSEMICOLON	
/** * The 'Rmtype' command */	TokenNameCOMMENT_JAVADOC	 The 'Rmtype' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_RMTYPE	TokenNameIdentifier	 COMMAND  RMTYPE
=	TokenNameEQUAL	
"rmtype"	TokenNameStringLiteral	rmtype
;	TokenNameSEMICOLON	
/** * The 'LsCheckout' command */	TokenNameCOMMENT_JAVADOC	 The 'LsCheckout' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_LSCO	TokenNameIdentifier	 COMMAND  LSCO
=	TokenNameEQUAL	
"lsco"	TokenNameStringLiteral	lsco
;	TokenNameSEMICOLON	
/** * The 'Mkelem' command */	TokenNameCOMMENT_JAVADOC	 The 'Mkelem' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_MKELEM	TokenNameIdentifier	 COMMAND  MKELEM
=	TokenNameEQUAL	
"mkelem"	TokenNameStringLiteral	mkelem
;	TokenNameSEMICOLON	
/** * The 'Mkattr' command */	TokenNameCOMMENT_JAVADOC	 The 'Mkattr' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_MKATTR	TokenNameIdentifier	 COMMAND  MKATTR
=	TokenNameEQUAL	
"mkattr"	TokenNameStringLiteral	mkattr
;	TokenNameSEMICOLON	
/** * The 'Mkdir' command */	TokenNameCOMMENT_JAVADOC	 The 'Mkdir' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_MKDIR	TokenNameIdentifier	 COMMAND  MKDIR
=	TokenNameEQUAL	
"mkdir"	TokenNameStringLiteral	mkdir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
