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
ccm	TokenNameIdentifier	 ccm
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
ExecuteStreamHandler	TokenNameIdentifier	 Execute Stream Handler
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
/** * A base class for creating tasks for executing commands on Continuus 5.1. * <p> * The class extends the task as it operates by executing the ccm.exe program * supplied with Continuus/Synergy. By default the task expects the ccm executable to be * in the path, * you can override this be specifying the ccmdir attribute. * </p> * */	TokenNameCOMMENT_JAVADOC	 A base class for creating tasks for executing commands on Continuus 5.1. <p> The class extends the task as it operates by executing the ccm.exe program supplied with Continuus/Synergy. By default the task expects the ccm executable to be in the path, you can override this be specifying the ccmdir attribute. </p> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Continuus	TokenNameIdentifier	 Continuus
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ccmDir	TokenNameIdentifier	 ccm Dir
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ccmAction	TokenNameIdentifier	 ccm Action
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Get the value of ccmAction. * @return value of ccmAction. */	TokenNameCOMMENT_JAVADOC	 Get the value of ccmAction. @return value of ccmAction. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCcmAction	TokenNameIdentifier	 get Ccm Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ccmAction	TokenNameIdentifier	 ccm Action
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value of ccmAction. * @param v Value to assign to ccmAction. * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Set the value of ccmAction. @param v Value to assign to ccmAction. @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setCcmAction	TokenNameIdentifier	 set Ccm Action
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ccmAction	TokenNameIdentifier	 ccm Action
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the directory where the ccm executable is located. * * @param dir the directory containing the ccm executable */	TokenNameCOMMENT_JAVADOC	 Set the directory where the ccm executable is located. * @param dir the directory containing the ccm executable 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setCcmDir	TokenNameIdentifier	 set Ccm Dir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ccmDir	TokenNameIdentifier	 ccm Dir
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
translatePath	TokenNameIdentifier	 translate Path
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds and returns the command string to execute ccm * @return String containing path to the executable */	TokenNameCOMMENT_JAVADOC	 Builds and returns the command string to execute ccm @return String containing path to the executable 
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getCcmCommand	TokenNameIdentifier	 get Ccm Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
toReturn	TokenNameIdentifier	 to Return
=	TokenNameEQUAL	
ccmDir	TokenNameIdentifier	 ccm Dir
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
CCM_EXE	TokenNameIdentifier	 CCM  EXE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toReturn	TokenNameIdentifier	 to Return
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the command. * @param cmd the command line * @param handler an execute stream handler * @return the exit status of the command */	TokenNameCOMMENT_JAVADOC	 Run the command. @param cmd the command line @param handler an execute stream handler @return the exit status of the command 
protected	TokenNameprotected	
int	TokenNameint	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
ExecuteStreamHandler	TokenNameIdentifier	 Execute Stream Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Execute	TokenNameIdentifier	 Execute
exe	TokenNameIdentifier	 exe
=	TokenNameEQUAL	
new	TokenNamenew	
Execute	TokenNameIdentifier	 Execute
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setAntRun	TokenNameIdentifier	 set Ant Run
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setWorkingDirectory	TokenNameIdentifier	 set Working Directory
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
/** * Run the command. * @param cmd the command line * @return the exit status of the command */	TokenNameCOMMENT_JAVADOC	 Run the command. @param cmd the command line @return the exit status of the command 
protected	TokenNameprotected	
int	TokenNameint	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
new	TokenNamenew	
LogStreamHandler	TokenNameIdentifier	 Log Stream Handler
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constant for the thing to execute */	TokenNameCOMMENT_JAVADOC	 Constant for the thing to execute 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CCM_EXE	TokenNameIdentifier	 CCM  EXE
=	TokenNameEQUAL	
"ccm"	TokenNameStringLiteral	ccm
;	TokenNameSEMICOLON	
/** * The 'CreateTask' command */	TokenNameCOMMENT_JAVADOC	 The 'CreateTask' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_CREATE_TASK	TokenNameIdentifier	 COMMAND  CREATE  TASK
=	TokenNameEQUAL	
"create_task"	TokenNameStringLiteral	create_task
;	TokenNameSEMICOLON	
/** * The 'Checkout' command */	TokenNameCOMMENT_JAVADOC	 The 'Checkout' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_CHECKOUT	TokenNameIdentifier	 COMMAND  CHECKOUT
=	TokenNameEQUAL	
"co"	TokenNameStringLiteral	co
;	TokenNameSEMICOLON	
/** * The 'Checkin' command */	TokenNameCOMMENT_JAVADOC	 The 'Checkin' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_CHECKIN	TokenNameIdentifier	 COMMAND  CHECKIN
=	TokenNameEQUAL	
"ci"	TokenNameStringLiteral	ci
;	TokenNameSEMICOLON	
/** * The 'Reconfigure' command */	TokenNameCOMMENT_JAVADOC	 The 'Reconfigure' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_RECONFIGURE	TokenNameIdentifier	 COMMAND  RECONFIGURE
=	TokenNameEQUAL	
"reconfigure"	TokenNameStringLiteral	reconfigure
;	TokenNameSEMICOLON	
/** * The 'Reconfigure' command */	TokenNameCOMMENT_JAVADOC	 The 'Reconfigure' command 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMAND_DEFAULT_TASK	TokenNameIdentifier	 COMMAND  DEFAULT  TASK
=	TokenNameEQUAL	
"default_task"	TokenNameStringLiteral	default_task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
