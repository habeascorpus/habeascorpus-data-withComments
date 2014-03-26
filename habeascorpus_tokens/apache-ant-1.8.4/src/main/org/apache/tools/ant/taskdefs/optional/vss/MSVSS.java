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
vss	TokenNameIdentifier	 vss
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
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
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
/** * A base class for creating tasks for executing commands on Visual SourceSafe. * <p> * The class extends the 'exec' task as it operates by executing the ss.exe program * supplied with SourceSafe. By default the task expects ss.exe to be in the path, * you can override this be specifying the ssdir attribute. * </p> * <p> * This class provides set and get methods for 'login' and 'vsspath' attributes. It * also contains constants for the flags that can be passed to SS. * </p> * */	TokenNameCOMMENT_JAVADOC	 A base class for creating tasks for executing commands on Visual SourceSafe. <p> The class extends the 'exec' task as it operates by executing the ss.exe program supplied with SourceSafe. By default the task expects ss.exe to be in the path, you can override this be specifying the ssdir attribute. </p> <p> This class provides set and get methods for 'login' and 'vsspath' attributes. It also contains constants for the flags that can be passed to SS. </p> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
MSVSS	TokenNameIdentifier	 MSVSS
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
MSVSSConstants	TokenNameIdentifier	 MSVSS Constants
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ssDir	TokenNameIdentifier	 ss Dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
vssLogin	TokenNameIdentifier	 vss Login
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
vssPath	TokenNameIdentifier	 vss Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
serverPath	TokenNameIdentifier	 server Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Version */	TokenNameCOMMENT_JAVADOC	 Version 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Date */	TokenNameCOMMENT_JAVADOC	 Date 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Label */	TokenNameCOMMENT_JAVADOC	 Label 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Auto response */	TokenNameCOMMENT_JAVADOC	 Auto response 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
autoResponse	TokenNameIdentifier	 auto Response
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Local path */	TokenNameCOMMENT_JAVADOC	 Local path 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
localPath	TokenNameIdentifier	 local Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Comment */	TokenNameCOMMENT_JAVADOC	 Comment 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** From label */	TokenNameCOMMENT_JAVADOC	 From label 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fromLabel	TokenNameIdentifier	 from Label
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** To label */	TokenNameCOMMENT_JAVADOC	 To label 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toLabel	TokenNameIdentifier	 to Label
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Output file name */	TokenNameCOMMENT_JAVADOC	 Output file name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
outputFileName	TokenNameIdentifier	 output File Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** User */	TokenNameCOMMENT_JAVADOC	 User 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** From date */	TokenNameCOMMENT_JAVADOC	 From date 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fromDate	TokenNameIdentifier	 from Date
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** To date */	TokenNameCOMMENT_JAVADOC	 To date 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toDate	TokenNameIdentifier	 to Date
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** History style */	TokenNameCOMMENT_JAVADOC	 History style 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
style	TokenNameIdentifier	 style
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Quiet defaults to false */	TokenNameCOMMENT_JAVADOC	 Quiet defaults to false 
private	TokenNameprivate	
boolean	TokenNameboolean	
quiet	TokenNameIdentifier	 quiet
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Recursive defaults to false */	TokenNameCOMMENT_JAVADOC	 Recursive defaults to false 
private	TokenNameprivate	
boolean	TokenNameboolean	
recursive	TokenNameIdentifier	 recursive
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Writable defaults to false */	TokenNameCOMMENT_JAVADOC	 Writable defaults to false 
private	TokenNameprivate	
boolean	TokenNameboolean	
writable	TokenNameIdentifier	 writable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Fail on error defaults to true */	TokenNameCOMMENT_JAVADOC	 Fail on error defaults to true 
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Get local copy for checkout defaults to true */	TokenNameCOMMENT_JAVADOC	 Get local copy for checkout defaults to true 
private	TokenNameprivate	
boolean	TokenNameboolean	
getLocalCopy	TokenNameIdentifier	 get Local Copy
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Number of days offset for History */	TokenNameCOMMENT_JAVADOC	 Number of days offset for History 
private	TokenNameprivate	
int	TokenNameint	
numDays	TokenNameIdentifier	 num Days
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
/** Date format for History */	TokenNameCOMMENT_JAVADOC	 Date format for History 
private	TokenNameprivate	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
getDateInstance	TokenNameIdentifier	 get Date Instance
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Timestamp for retreived files */	TokenNameCOMMENT_JAVADOC	 Timestamp for retreived files 
private	TokenNameprivate	
CurrentModUpdated	TokenNameIdentifier	 Current Mod Updated
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Behaviour for writable files */	TokenNameCOMMENT_JAVADOC	 Behaviour for writable files 
private	TokenNameprivate	
WritableFiles	TokenNameIdentifier	 Writable Files
writableFiles	TokenNameIdentifier	 writable Files
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Each sub-class must implemnt this method and return the constructed * command line to be executed. It is up to the sub-task to determine the * required attrubutes and their order. * @return The Constructed command line. */	TokenNameCOMMENT_JAVADOC	 Each sub-class must implemnt this method and return the constructed command line to be executed. It is up to the sub-task to determine the required attrubutes and their order. @return The Constructed command line. 
abstract	TokenNameabstract	
Commandline	TokenNameIdentifier	 Commandline
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Directory where <code>ss.exe</code> resides. * By default the task expects it to be in the PATH. * @param dir The directory containing ss.exe. */	TokenNameCOMMENT_JAVADOC	 Directory where <code>ss.exe</code> resides. By default the task expects it to be in the PATH. @param dir The directory containing ss.exe. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setSsdir	TokenNameIdentifier	 set Ssdir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ssDir	TokenNameIdentifier	 ss Dir
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
translatePath	TokenNameIdentifier	 translate Path
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Login to use when accessing VSS, formatted as "username,password". * <p> * You can omit the password if your database is not password protected. * If you have a password and omit it, Ant will hang. * @param vssLogin The login string to use. */	TokenNameCOMMENT_JAVADOC	 Login to use when accessing VSS, formatted as "username,password". <p> You can omit the password if your database is not password protected. If you have a password and omit it, Ant will hang. @param vssLogin The login string to use. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setLogin	TokenNameIdentifier	 set Login
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
vssLogin	TokenNameIdentifier	 vss Login
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
vssLogin	TokenNameIdentifier	 vss Login
=	TokenNameEQUAL	
vssLogin	TokenNameIdentifier	 vss Login
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * SourceSafe path which specifies the project/file(s) you wish to perform * the action on. * <p> * A prefix of 'vss://' will be removed if specified. * @param vssPath The VSS project path. * @ant.attribute group="required" */	TokenNameCOMMENT_JAVADOC	 SourceSafe path which specifies the project/file(s) you wish to perform the action on. <p> A prefix of 'vss://' will be removed if specified. @param vssPath The VSS project path. @ant.attribute group="required" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setVsspath	TokenNameIdentifier	 set Vsspath
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
vssPath	TokenNameIdentifier	 vss Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
projectPath	TokenNameIdentifier	 project Path
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
if	TokenNameif	
(	TokenNameLPAREN	
vssPath	TokenNameIdentifier	 vss Path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"vss://"	TokenNameStringLiteral	vss://
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//$NON-NLS-1$ 	TokenNameCOMMENT_LINE	$NON-NLS-1$ 
projectPath	TokenNameIdentifier	 project Path
=	TokenNameEQUAL	
vssPath	TokenNameIdentifier	 vss Path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
projectPath	TokenNameIdentifier	 project Path
=	TokenNameEQUAL	
vssPath	TokenNameIdentifier	 vss Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
if	TokenNameif	
(	TokenNameLPAREN	
projectPath	TokenNameIdentifier	 project Path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
PROJECT_PREFIX	TokenNameIdentifier	 PROJECT  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
vssPath	TokenNameIdentifier	 vss Path
=	TokenNameEQUAL	
projectPath	TokenNameIdentifier	 project Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
vssPath	TokenNameIdentifier	 vss Path
=	TokenNameEQUAL	
PROJECT_PREFIX	TokenNameIdentifier	 PROJECT  PREFIX
+	TokenNamePLUS	
projectPath	TokenNameIdentifier	 project Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Directory where <code>srssafe.ini</code> resides. * @param serverPath The path to the VSS server. */	TokenNameCOMMENT_JAVADOC	 Directory where <code>srssafe.ini</code> resides. @param serverPath The path to the VSS server. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setServerpath	TokenNameIdentifier	 set Serverpath
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
serverPath	TokenNameIdentifier	 server Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
serverPath	TokenNameIdentifier	 server Path
=	TokenNameEQUAL	
serverPath	TokenNameIdentifier	 server Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates if the build should fail if the Sourcesafe command does. Defaults to true. * @param failOnError True if task should fail on any error. */	TokenNameCOMMENT_JAVADOC	 Indicates if the build should fail if the Sourcesafe command does. Defaults to true. @param failOnError True if task should fail on any error. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setFailOnError	TokenNameIdentifier	 set Fail On Error
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
failOnError	TokenNameIdentifier	 fail On Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes the task. <br> * Builds a command line to execute ss.exe and then calls Exec's run method * to execute the command line. * @throws BuildException if the command cannot execute. */	TokenNameCOMMENT_JAVADOC	 Executes the task. <br> Builds a command line to execute ss.exe and then calls Exec's run method to execute the command line. @throws BuildException if the command cannot execute. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Commandline	TokenNameIdentifier	 Commandline
commandLine	TokenNameIdentifier	 command Line
=	TokenNameEQUAL	
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
getFailOnError	TokenNameIdentifier	 get Fail On Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Failed executing: "	TokenNameStringLiteral	Failed executing: 
+	TokenNamePLUS	
formatCommandLine	TokenNameIdentifier	 format Command Line
(	TokenNameLPAREN	
commandLine	TokenNameIdentifier	 command Line
)	TokenNameRPAREN	
+	TokenNamePLUS	
" With a return code of "	TokenNameStringLiteral	 With a return code of 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
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
// Special setters for the sub-classes 	TokenNameCOMMENT_LINE	Special setters for the sub-classes 
/** * Set the internal comment attribute. * @param comment the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the internal comment attribute. @param comment the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalComment	TokenNameIdentifier	 set Internal Comment
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the auto response attribute. * @param autoResponse the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the auto response attribute. @param autoResponse the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalAutoResponse	TokenNameIdentifier	 set Internal Auto Response
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
autoResponse	TokenNameIdentifier	 auto Response
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
autoResponse	TokenNameIdentifier	 auto Response
=	TokenNameEQUAL	
autoResponse	TokenNameIdentifier	 auto Response
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the date attribute. * @param date the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the date attribute. @param date the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalDate	TokenNameIdentifier	 set Internal Date
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the date format attribute. * @param dateFormat the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the date format attribute. @param dateFormat the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalDateFormat	TokenNameIdentifier	 set Internal Date Format
(	TokenNameLPAREN	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the failOnError attribute. * @param failOnError the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the failOnError attribute. @param failOnError the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalFailOnError	TokenNameIdentifier	 set Internal Fail On Error
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
failOnError	TokenNameIdentifier	 fail On Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the from date attribute. * @param fromDate the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the from date attribute. @param fromDate the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalFromDate	TokenNameIdentifier	 set Internal From Date
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fromDate	TokenNameIdentifier	 from Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fromDate	TokenNameIdentifier	 from Date
=	TokenNameEQUAL	
fromDate	TokenNameIdentifier	 from Date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the from label attribute. * @param fromLabel the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the from label attribute. @param fromLabel the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalFromLabel	TokenNameIdentifier	 set Internal From Label
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fromLabel	TokenNameIdentifier	 from Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fromLabel	TokenNameIdentifier	 from Label
=	TokenNameEQUAL	
fromLabel	TokenNameIdentifier	 from Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the label attribute. * @param label the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the label attribute. @param label the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalLabel	TokenNameIdentifier	 set Internal Label
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the local path comment attribute. * @param localPath the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the local path comment attribute. @param localPath the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalLocalPath	TokenNameIdentifier	 set Internal Local Path
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localPath	TokenNameIdentifier	 local Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
localPath	TokenNameIdentifier	 local Path
=	TokenNameEQUAL	
localPath	TokenNameIdentifier	 local Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the num days attribute. * @param numDays the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the num days attribute. @param numDays the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalNumDays	TokenNameIdentifier	 set Internal Num Days
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
numDays	TokenNameIdentifier	 num Days
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numDays	TokenNameIdentifier	 num Days
=	TokenNameEQUAL	
numDays	TokenNameIdentifier	 num Days
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the outputFileName comment attribute. * @param outputFileName the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the outputFileName comment attribute. @param outputFileName the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalOutputFilename	TokenNameIdentifier	 set Internal Output Filename
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
outputFileName	TokenNameIdentifier	 output File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outputFileName	TokenNameIdentifier	 output File Name
=	TokenNameEQUAL	
outputFileName	TokenNameIdentifier	 output File Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the quiet attribute. * @param quiet the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the quiet attribute. @param quiet the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalQuiet	TokenNameIdentifier	 set Internal Quiet
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
quiet	TokenNameIdentifier	 quiet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
quiet	TokenNameIdentifier	 quiet
=	TokenNameEQUAL	
quiet	TokenNameIdentifier	 quiet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the recursive attribute. * @param recursive the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the recursive attribute. @param recursive the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalRecursive	TokenNameIdentifier	 set Internal Recursive
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
recursive	TokenNameIdentifier	 recursive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
recursive	TokenNameIdentifier	 recursive
=	TokenNameEQUAL	
recursive	TokenNameIdentifier	 recursive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the style attribute. * @param style the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the style attribute. @param style the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalStyle	TokenNameIdentifier	 set Internal Style
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
style	TokenNameIdentifier	 style
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
style	TokenNameIdentifier	 style
=	TokenNameEQUAL	
style	TokenNameIdentifier	 style
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the to date attribute. * @param toDate the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the to date attribute. @param toDate the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalToDate	TokenNameIdentifier	 set Internal To Date
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toDate	TokenNameIdentifier	 to Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
toDate	TokenNameIdentifier	 to Date
=	TokenNameEQUAL	
toDate	TokenNameIdentifier	 to Date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the to label attribute. * @param toLabel the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the to label attribute. @param toLabel the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalToLabel	TokenNameIdentifier	 set Internal To Label
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toLabel	TokenNameIdentifier	 to Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
toLabel	TokenNameIdentifier	 to Label
=	TokenNameEQUAL	
toLabel	TokenNameIdentifier	 to Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the user attribute. * @param user the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the user attribute. @param user the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalUser	TokenNameIdentifier	 set Internal User
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
user	TokenNameIdentifier	 user
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the version attribute. * @param version the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the version attribute. @param version the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalVersion	TokenNameIdentifier	 set Internal Version
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the writable attribute. * @param writable the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the writable attribute. @param writable the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalWritable	TokenNameIdentifier	 set Internal Writable
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
writable	TokenNameIdentifier	 writable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
writable	TokenNameIdentifier	 writable
=	TokenNameEQUAL	
writable	TokenNameIdentifier	 writable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the timestamp attribute. * @param timestamp the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the timestamp attribute. @param timestamp the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalFileTimeStamp	TokenNameIdentifier	 set Internal File Time Stamp
(	TokenNameLPAREN	
final	TokenNamefinal	
CurrentModUpdated	TokenNameIdentifier	 Current Mod Updated
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the writableFiles attribute. * @param writableFiles the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the writableFiles attribute. @param writableFiles the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalWritableFiles	TokenNameIdentifier	 set Internal Writable Files
(	TokenNameLPAREN	
final	TokenNamefinal	
WritableFiles	TokenNameIdentifier	 Writable Files
writableFiles	TokenNameIdentifier	 writable Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
writableFiles	TokenNameIdentifier	 writable Files
=	TokenNameEQUAL	
writableFiles	TokenNameIdentifier	 writable Files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the getLocalCopy attribute. * @param getLocalCopy the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the getLocalCopy attribute. @param getLocalCopy the value to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalGetLocalCopy	TokenNameIdentifier	 set Internal Get Local Copy
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
getLocalCopy	TokenNameIdentifier	 get Local Copy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
getLocalCopy	TokenNameIdentifier	 get Local Copy
=	TokenNameEQUAL	
getLocalCopy	TokenNameIdentifier	 get Local Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the sscommand string. "ss" or "c:\path\to\ss" * @return The path to ss.exe or just ss if sscommand is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the sscommand string. "ss" or "c:\path\to\ss" @return The path to ss.exe or just ss if sscommand is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getSSCommand	TokenNameIdentifier	 get SS Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ssDir	TokenNameIdentifier	 ss Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SS_EXE	TokenNameIdentifier	 SS  EXE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ssDir	TokenNameIdentifier	 ss Dir
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ssDir	TokenNameIdentifier	 ss Dir
+	TokenNamePLUS	
SS_EXE	TokenNameIdentifier	 SS  EXE
:	TokenNameCOLON	
ssDir	TokenNameIdentifier	 ss Dir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
SS_EXE	TokenNameIdentifier	 SS  EXE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the vssserverpath string. * @return null if vssserverpath is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the vssserverpath string. @return null if vssserverpath is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getVsspath	TokenNameIdentifier	 get Vsspath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vssPath	TokenNameIdentifier	 vss Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the quiet string. -O- * @return An empty string if quiet is not set or is false. */	TokenNameCOMMENT_JAVADOC	 Gets the quiet string. -O- @return An empty string if quiet is not set or is false. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getQuiet	TokenNameIdentifier	 get Quiet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
quiet	TokenNameIdentifier	 quiet
?	TokenNameQUESTION	
FLAG_QUIET	TokenNameIdentifier	 FLAG  QUIET
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the recursive string. "-R" * @return An empty string if recursive is not set or is false. */	TokenNameCOMMENT_JAVADOC	 Gets the recursive string. "-R" @return An empty string if recursive is not set or is false. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getRecursive	TokenNameIdentifier	 get Recursive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recursive	TokenNameIdentifier	 recursive
?	TokenNameQUESTION	
FLAG_RECURSION	TokenNameIdentifier	 FLAG  RECURSION
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the writable string. "-W" * @return An empty string if writable is not set or is false. */	TokenNameCOMMENT_JAVADOC	 Gets the writable string. "-W" @return An empty string if writable is not set or is false. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getWritable	TokenNameIdentifier	 get Writable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
writable	TokenNameIdentifier	 writable
?	TokenNameQUESTION	
FLAG_WRITABLE	TokenNameIdentifier	 FLAG  WRITABLE
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the label string. "-Lbuild1" * Max label length is 32 chars * @return An empty string if label is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the label string. "-Lbuild1" Max label length is 32 chars @return An empty string if label is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
shortLabel	TokenNameIdentifier	 short Label
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shortLabel	TokenNameIdentifier	 short Label
=	TokenNameEQUAL	
FLAG_LABEL	TokenNameIdentifier	 FLAG  LABEL
+	TokenNamePLUS	
getShortLabel	TokenNameIdentifier	 get Short Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
shortLabel	TokenNameIdentifier	 short Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return at most the 30 first chars of the label, * logging a warning message about the truncation * @return at most the 30 first chars of the label */	TokenNameCOMMENT_JAVADOC	 Return at most the 30 first chars of the label, logging a warning message about the truncation @return at most the 30 first chars of the label 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getShortLabel	TokenNameIdentifier	 get Short Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
shortLabel	TokenNameIdentifier	 short Label
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shortLabel	TokenNameIdentifier	 short Label
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Label is longer than 31 characters, truncated to: "	TokenNameStringLiteral	Label is longer than 31 characters, truncated to: 
+	TokenNamePLUS	
shortLabel	TokenNameIdentifier	 short Label
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
shortLabel	TokenNameIdentifier	 short Label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
return	TokenNamereturn	
shortLabel	TokenNameIdentifier	 short Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the style string. "-Lbuild1" * @return An empty string if label is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the style string. "-Lbuild1" @return An empty string if label is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getStyle	TokenNameIdentifier	 get Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
style	TokenNameIdentifier	 style
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
style	TokenNameIdentifier	 style
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the version string. Returns the first specified of version "-V1.0", * date "-Vd01.01.01", label "-Vlbuild1". * @return An empty string if a version, date and label are not set. */	TokenNameCOMMENT_JAVADOC	 Gets the version string. Returns the first specified of version "-V1.0", date "-Vd01.01.01", label "-Vlbuild1". @return An empty string if a version, date and label are not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getVersionDateLabel	TokenNameIdentifier	 get Version Date Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
versionDateLabel	TokenNameIdentifier	 version Date Label
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versionDateLabel	TokenNameIdentifier	 version Date Label
=	TokenNameEQUAL	
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versionDateLabel	TokenNameIdentifier	 version Date Label
=	TokenNameEQUAL	
FLAG_VERSION_DATE	TokenNameIdentifier	 FLAG  VERSION  DATE
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Use getShortLabel() so labels longer then 30 char are truncated 	TokenNameCOMMENT_LINE	Use getShortLabel() so labels longer then 30 char are truncated 
// and the user is warned 	TokenNameCOMMENT_LINE	and the user is warned 
String	TokenNameIdentifier	 String
shortLabel	TokenNameIdentifier	 short Label
=	TokenNameEQUAL	
getShortLabel	TokenNameIdentifier	 get Short Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shortLabel	TokenNameIdentifier	 short Label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
shortLabel	TokenNameIdentifier	 short Label
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versionDateLabel	TokenNameIdentifier	 version Date Label
=	TokenNameEQUAL	
FLAG_VERSION_LABEL	TokenNameIdentifier	 FLAG  VERSION  LABEL
+	TokenNamePLUS	
shortLabel	TokenNameIdentifier	 short Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
versionDateLabel	TokenNameIdentifier	 version Date Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the version string. * @return An empty string if a version is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the version string. @return An empty string if a version is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the localpath string. "-GLc:\source" <p> * The localpath is created if it didn't exist. * @return An empty string if localpath is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the localpath string. "-GLc:\source" <p> The localpath is created if it didn't exist. @return An empty string if localpath is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLocalpath	TokenNameIdentifier	 get Localpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lclPath	TokenNameIdentifier	 lcl Path
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
//set to empty str if no local path return 	TokenNameCOMMENT_LINE	set to empty str if no local path return 
if	TokenNameif	
(	TokenNameLPAREN	
localPath	TokenNameIdentifier	 local Path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//make sure m_LocalDir exists, create it if it doesn't 	TokenNameCOMMENT_LINE	make sure m_LocalDir exists, create it if it doesn't 
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
localPath	TokenNameIdentifier	 local Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Directory "	TokenNameStringLiteral	Directory 
+	TokenNamePLUS	
localPath	TokenNameIdentifier	 local Path
+	TokenNamePLUS	
" creation was not "	TokenNameStringLiteral	 creation was not 
+	TokenNamePLUS	
"successful for an unknown reason"	TokenNameStringLiteral	successful for an unknown reason
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
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Created dir: "	TokenNameStringLiteral	Created dir: 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lclPath	TokenNameIdentifier	 lcl Path
=	TokenNameEQUAL	
FLAG_OVERRIDE_WORKING_DIR	TokenNameIdentifier	 FLAG  OVERRIDE  WORKING  DIR
+	TokenNamePLUS	
localPath	TokenNameIdentifier	 local Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lclPath	TokenNameIdentifier	 lcl Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the comment string. "-Ccomment text" * @return A comment of "-" if comment is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the comment string. "-Ccomment text" @return A comment of "-" if comment is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comment	TokenNameIdentifier	 comment
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
+	TokenNamePLUS	
comment	TokenNameIdentifier	 comment
:	TokenNameCOLON	
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the auto response string. This can be Y "-I-Y" or N "-I-N". * @return The default value "-I-" if autoresponse is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the auto response string. This can be Y "-I-Y" or N "-I-N". @return The default value "-I-" if autoresponse is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getAutoresponse	TokenNameIdentifier	 get Autoresponse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
autoResponse	TokenNameIdentifier	 auto Response
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
autoResponse	TokenNameIdentifier	 auto Response
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"Y"	TokenNameStringLiteral	Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_AUTORESPONSE_YES	TokenNameIdentifier	 FLAG  AUTORESPONSE  YES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
autoResponse	TokenNameIdentifier	 auto Response
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_AUTORESPONSE_NO	TokenNameIdentifier	 FLAG  AUTORESPONSE  NO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the login string. This can be user and password, "-Yuser,password" * or just user "-Yuser". * @return An empty string if login is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the login string. This can be user and password, "-Yuser,password" or just user "-Yuser". @return An empty string if login is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLogin	TokenNameIdentifier	 get Login
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vssLogin	TokenNameIdentifier	 vss Login
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
+	TokenNamePLUS	
vssLogin	TokenNameIdentifier	 vss Login
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the output file string. "-Ooutput.file" * @return An empty string if user is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the output file string. "-Ooutput.file" @return An empty string if user is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outputFileName	TokenNameIdentifier	 output File Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
FLAG_OUTPUT	TokenNameIdentifier	 FLAG  OUTPUT
+	TokenNamePLUS	
outputFileName	TokenNameIdentifier	 output File Name
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the user string. "-Uusername" * @return An empty string if user is not set. */	TokenNameCOMMENT_JAVADOC	 Gets the user string. "-Uusername" @return An empty string if user is not set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getUser	TokenNameIdentifier	 get User
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
user	TokenNameIdentifier	 user
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
FLAG_USER	TokenNameIdentifier	 FLAG  USER
+	TokenNamePLUS	
user	TokenNameIdentifier	 user
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the version string. This can be to-from "-VLbuild2~Lbuild1", from * "~Lbuild1" or to "-VLbuild2". * @return An empty string if neither tolabel or fromlabel are set. */	TokenNameCOMMENT_JAVADOC	 Gets the version string. This can be to-from "-VLbuild2~Lbuild1", from "~Lbuild1" or to "-VLbuild2". @return An empty string if neither tolabel or fromlabel are set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getVersionLabel	TokenNameIdentifier	 get Version Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromLabel	TokenNameIdentifier	 from Label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
toLabel	TokenNameIdentifier	 to Label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
if	TokenNameif	
(	TokenNameLPAREN	
fromLabel	TokenNameIdentifier	 from Label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
toLabel	TokenNameIdentifier	 to Label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromLabel	TokenNameIdentifier	 from Label
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fromLabel	TokenNameIdentifier	 from Label
=	TokenNameEQUAL	
fromLabel	TokenNameIdentifier	 from Label
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"FromLabel is longer than 31 characters, truncated to: "	TokenNameStringLiteral	FromLabel is longer than 31 characters, truncated to: 
+	TokenNamePLUS	
fromLabel	TokenNameIdentifier	 from Label
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toLabel	TokenNameIdentifier	 to Label
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toLabel	TokenNameIdentifier	 to Label
=	TokenNameEQUAL	
toLabel	TokenNameIdentifier	 to Label
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"ToLabel is longer than 31 characters, truncated to: "	TokenNameStringLiteral	ToLabel is longer than 31 characters, truncated to: 
+	TokenNamePLUS	
toLabel	TokenNameIdentifier	 to Label
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
FLAG_VERSION_LABEL	TokenNameIdentifier	 FLAG  VERSION  LABEL
+	TokenNamePLUS	
toLabel	TokenNameIdentifier	 to Label
+	TokenNamePLUS	
VALUE_FROMLABEL	TokenNameIdentifier	 VALUE  FROMLABEL
+	TokenNamePLUS	
fromLabel	TokenNameIdentifier	 from Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fromLabel	TokenNameIdentifier	 from Label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromLabel	TokenNameIdentifier	 from Label
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fromLabel	TokenNameIdentifier	 from Label
=	TokenNameEQUAL	
fromLabel	TokenNameIdentifier	 from Label
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"FromLabel is longer than 31 characters, truncated to: "	TokenNameStringLiteral	FromLabel is longer than 31 characters, truncated to: 
+	TokenNamePLUS	
fromLabel	TokenNameIdentifier	 from Label
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
+	TokenNamePLUS	
VALUE_FROMLABEL	TokenNameIdentifier	 VALUE  FROMLABEL
+	TokenNamePLUS	
fromLabel	TokenNameIdentifier	 from Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toLabel	TokenNameIdentifier	 to Label
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toLabel	TokenNameIdentifier	 to Label
=	TokenNameEQUAL	
toLabel	TokenNameIdentifier	 to Label
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"ToLabel is longer than 31 characters, truncated to: "	TokenNameStringLiteral	ToLabel is longer than 31 characters, truncated to: 
+	TokenNamePLUS	
toLabel	TokenNameIdentifier	 to Label
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
FLAG_VERSION_LABEL	TokenNameIdentifier	 FLAG  VERSION  LABEL
+	TokenNamePLUS	
toLabel	TokenNameIdentifier	 to Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
}	TokenNameRBRACE	
/** * Gets the Version date string. * @return An empty string if neither Todate or from date are set. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Gets the Version date string. @return An empty string if neither Todate or from date are set. @throws BuildException if there is an error. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getVersionDate	TokenNameIdentifier	 get Version Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromDate	TokenNameIdentifier	 from Date
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
toDate	TokenNameIdentifier	 to Date
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
numDays	TokenNameIdentifier	 num Days
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromDate	TokenNameIdentifier	 from Date
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
toDate	TokenNameIdentifier	 to Date
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_VERSION_DATE	TokenNameIdentifier	 FLAG  VERSION  DATE
+	TokenNamePLUS	
toDate	TokenNameIdentifier	 to Date
+	TokenNamePLUS	
VALUE_FROMDATE	TokenNameIdentifier	 VALUE  FROMDATE
+	TokenNamePLUS	
fromDate	TokenNameIdentifier	 from Date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
toDate	TokenNameIdentifier	 to Date
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
numDays	TokenNameIdentifier	 num Days
!=	TokenNameNOT_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_VERSION_DATE	TokenNameIdentifier	 FLAG  VERSION  DATE
+	TokenNamePLUS	
toDate	TokenNameIdentifier	 to Date
+	TokenNamePLUS	
VALUE_FROMDATE	TokenNameIdentifier	 VALUE  FROMDATE
+	TokenNamePLUS	
calcDate	TokenNameIdentifier	 calc Date
(	TokenNameLPAREN	
toDate	TokenNameIdentifier	 to Date
,	TokenNameCOMMA	
numDays	TokenNameIdentifier	 num Days
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Error parsing date: "	TokenNameStringLiteral	Error parsing date: 
+	TokenNamePLUS	
toDate	TokenNameIdentifier	 to Date
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
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fromDate	TokenNameIdentifier	 from Date
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
numDays	TokenNameIdentifier	 num Days
!=	TokenNameNOT_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_VERSION_DATE	TokenNameIdentifier	 FLAG  VERSION  DATE
+	TokenNamePLUS	
calcDate	TokenNameIdentifier	 calc Date
(	TokenNameLPAREN	
fromDate	TokenNameIdentifier	 from Date
,	TokenNameCOMMA	
numDays	TokenNameIdentifier	 num Days
)	TokenNameRPAREN	
+	TokenNamePLUS	
VALUE_FROMDATE	TokenNameIdentifier	 VALUE  FROMDATE
+	TokenNamePLUS	
fromDate	TokenNameIdentifier	 from Date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Error parsing date: "	TokenNameStringLiteral	Error parsing date: 
+	TokenNamePLUS	
fromDate	TokenNameIdentifier	 from Date
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
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
fromDate	TokenNameIdentifier	 from Date
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
+	TokenNamePLUS	
VALUE_FROMDATE	TokenNameIdentifier	 VALUE  FROMDATE
+	TokenNamePLUS	
fromDate	TokenNameIdentifier	 from Date
:	TokenNameCOLON	
FLAG_VERSION_DATE	TokenNameIdentifier	 FLAG  VERSION  DATE
+	TokenNamePLUS	
toDate	TokenNameIdentifier	 to Date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Builds and returns the -G- flag if required. * @return An empty string if get local copy is true. */	TokenNameCOMMENT_JAVADOC	 Builds and returns the -G- flag if required. @return An empty string if get local copy is true. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getGetLocalCopy	TokenNameIdentifier	 get Get Local Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
!	TokenNameNOT	
getLocalCopy	TokenNameIdentifier	 get Local Copy
)	TokenNameRPAREN	
?	TokenNameQUESTION	
FLAG_NO_GET	TokenNameIdentifier	 FLAG  NO  GET
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the value of the fail on error flag. * @return True if the FailOnError flag has been set or if 'writablefiles=skip'. */	TokenNameCOMMENT_JAVADOC	 Gets the value of the fail on error flag. @return True if the FailOnError flag has been set or if 'writablefiles=skip'. 
private	TokenNameprivate	
boolean	TokenNameboolean	
getFailOnError	TokenNameIdentifier	 get Fail On Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getWritableFiles	TokenNameIdentifier	 get Writable Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
WRITABLE_SKIP	TokenNameIdentifier	 WRITABLE  SKIP
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
failOnError	TokenNameIdentifier	 fail On Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the value set for the FileTimeStamp. * if it equals "current" then we return -GTC * if it equals "modified" then we return -GTM * if it equals "updated" then we return -GTU * otherwise we return -GTC * * @return The default file time flag, if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the value set for the FileTimeStamp. if it equals "current" then we return -GTC if it equals "modified" then we return -GTM if it equals "updated" then we return -GTU otherwise we return -GTC * @return The default file time flag, if not set. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFileTimeStamp	TokenNameIdentifier	 get File Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TIME_MODIFIED	TokenNameIdentifier	 TIME  MODIFIED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_FILETIME_MODIFIED	TokenNameIdentifier	 FLAG  FILETIME  MODIFIED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TIME_UPDATED	TokenNameIdentifier	 TIME  UPDATED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_FILETIME_UPDATED	TokenNameIdentifier	 FLAG  FILETIME  UPDATED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_FILETIME_DEF	TokenNameIdentifier	 FLAG  FILETIME  DEF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the value to determine the behaviour when encountering writable files. * @return An empty String, if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the value to determine the behaviour when encountering writable files. @return An empty String, if not set. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getWritableFiles	TokenNameIdentifier	 get Writable Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writableFiles	TokenNameIdentifier	 writable Files
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
writableFiles	TokenNameIdentifier	 writable Files
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
WRITABLE_REPLACE	TokenNameIdentifier	 WRITABLE  REPLACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FLAG_REPLACE_WRITABLE	TokenNameIdentifier	 FLAG  REPLACE  WRITABLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
writableFiles	TokenNameIdentifier	 writable Files
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
WRITABLE_SKIP	TokenNameIdentifier	 WRITABLE  SKIP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ss.exe exits with '100', when files have been skipped 	TokenNameCOMMENT_LINE	ss.exe exits with '100', when files have been skipped 
// so we have to ignore the failure 	TokenNameCOMMENT_LINE	so we have to ignore the failure 
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
FLAG_SKIP_WRITABLE	TokenNameIdentifier	 FLAG  SKIP  WRITABLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets up the required environment and executes the command line. * * @param cmd The command line to execute. * @return The return code from the exec'd process. */	TokenNameCOMMENT_JAVADOC	 Sets up the required environment and executes the command line. * @param cmd The command line to execute. @return The return code from the exec'd process. 
private	TokenNameprivate	
int	TokenNameint	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
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
// If location of ss.ini is specified we need to set the 	TokenNameCOMMENT_LINE	If location of ss.ini is specified we need to set the 
// environment-variable SSDIR to this value 	TokenNameCOMMENT_LINE	environment-variable SSDIR to this value 
if	TokenNameif	
(	TokenNameLPAREN	
serverPath	TokenNameIdentifier	 server Path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
env	TokenNameIdentifier	 env
=	TokenNameEQUAL	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
getEnvironment	TokenNameIdentifier	 get Environment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
env	TokenNameIdentifier	 env
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
env	TokenNameIdentifier	 env
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newEnv	TokenNameIdentifier	 new Env
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
env	TokenNameIdentifier	 env
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
env	TokenNameIdentifier	 env
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newEnv	TokenNameIdentifier	 new Env
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
env	TokenNameIdentifier	 env
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newEnv	TokenNameIdentifier	 new Env
[	TokenNameLBRACKET	
env	TokenNameIdentifier	 env
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"SSDIR="	TokenNameStringLiteral	SSDIR=
+	TokenNamePLUS	
serverPath	TokenNameIdentifier	 server Path
;	TokenNameSEMICOLON	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setEnvironment	TokenNameIdentifier	 set Environment
(	TokenNameLPAREN	
newEnv	TokenNameIdentifier	 new Env
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// Use the OS launcher so we get environment variables 	TokenNameCOMMENT_LINE	Use the OS launcher so we get environment variables 
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setVMLauncher	TokenNameIdentifier	 set VM Launcher
(	TokenNameLPAREN	
false	TokenNamefalse	
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
/** * Calculates the start date for version comparison. * <p> * Calculates the date numDay days earlier than startdate. * @param startDate The start date. * @param daysToAdd The number of days to add. * @return The calculated date. * @throws ParseException */	TokenNameCOMMENT_JAVADOC	 Calculates the start date for version comparison. <p> Calculates the date numDay days earlier than startdate. @param startDate The start date. @param daysToAdd The number of days to add. @return The calculated date. @throws ParseException 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
calcDate	TokenNameIdentifier	 calc Date
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
startDate	TokenNameIdentifier	 start Date
,	TokenNameCOMMA	
int	TokenNameint	
daysToAdd	TokenNameIdentifier	 days To Add
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
calendar	TokenNameIdentifier	 calendar
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
currentDate	TokenNameIdentifier	 current Date
=	TokenNameEQUAL	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
startDate	TokenNameIdentifier	 start Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
currentDate	TokenNameIdentifier	 current Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
daysToAdd	TokenNameIdentifier	 days To Add
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Changes the password to '***' so it isn't displayed on screen if the build fails * * @param cmd The command line to clean * @return The command line as a string with out the password */	TokenNameCOMMENT_JAVADOC	 Changes the password to '***' so it isn't displayed on screen if the build fails * @param cmd The command line to clean @return The command line as a string with out the password 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
formatCommandLine	TokenNameIdentifier	 format Command Line
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sBuff	TokenNameIdentifier	 s Buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexUser	TokenNameIdentifier	 index User
=	TokenNameEQUAL	
sBuff	TokenNameIdentifier	 s Buff
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexUser	TokenNameIdentifier	 index User
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
indexPass	TokenNameIdentifier	 index Pass
=	TokenNameEQUAL	
sBuff	TokenNameIdentifier	 s Buff
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
indexUser	TokenNameIdentifier	 index User
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexAfterPass	TokenNameIdentifier	 index After Pass
=	TokenNameEQUAL	
sBuff	TokenNameIdentifier	 s Buff
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
indexPass	TokenNameIdentifier	 index Pass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
indexPass	TokenNameIdentifier	 index Pass
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
indexAfterPass	TokenNameIdentifier	 index After Pass
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sBuff	TokenNameIdentifier	 s Buff
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sBuff	TokenNameIdentifier	 s Buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extention of EnumeratedAttribute to hold the values for file time stamp. */	TokenNameCOMMENT_JAVADOC	 Extention of EnumeratedAttribute to hold the values for file time stamp. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CurrentModUpdated	TokenNameIdentifier	 Current Mod Updated
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** * Gets the list of allowable values. * @return The values. */	TokenNameCOMMENT_JAVADOC	 Gets the list of allowable values. @return The values. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
TIME_CURRENT	TokenNameIdentifier	 TIME  CURRENT
,	TokenNameCOMMA	
TIME_MODIFIED	TokenNameIdentifier	 TIME  MODIFIED
,	TokenNameCOMMA	
TIME_UPDATED	TokenNameIdentifier	 TIME  UPDATED
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Extention of EnumeratedAttribute to hold the values for writable filess. */	TokenNameCOMMENT_JAVADOC	 Extention of EnumeratedAttribute to hold the values for writable filess. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
WritableFiles	TokenNameIdentifier	 Writable Files
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** * Gets the list of allowable values. * @return The values. */	TokenNameCOMMENT_JAVADOC	 Gets the list of allowable values. @return The values. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
WRITABLE_REPLACE	TokenNameIdentifier	 WRITABLE  REPLACE
,	TokenNameCOMMA	
WRITABLE_SKIP	TokenNameIdentifier	 WRITABLE  SKIP
,	TokenNameCOMMA	
WRITABLE_FAIL	TokenNameIdentifier	 WRITABLE  FAIL
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
