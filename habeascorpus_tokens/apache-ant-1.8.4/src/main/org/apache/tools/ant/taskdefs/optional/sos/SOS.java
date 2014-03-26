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
sos	TokenNameIdentifier	 sos
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * A base class for creating tasks for executing commands on SourceOffSite. * * These tasks were inspired by the VSS tasks. * */	TokenNameCOMMENT_JAVADOC	 A base class for creating tasks for executing commands on SourceOffSite. * These tasks were inspired by the VSS tasks. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SOS	TokenNameIdentifier	 SOS
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
SOSCmd	TokenNameIdentifier	 SOS Cmd
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ERROR_EXIT_STATUS	TokenNameIdentifier	 ERROR  EXIT  STATUS
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
sosCmdDir	TokenNameIdentifier	 sos Cmd Dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
sosUsername	TokenNameIdentifier	 sos Username
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
sosPassword	TokenNameIdentifier	 sos Password
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
projectPath	TokenNameIdentifier	 project Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
vssServerPath	TokenNameIdentifier	 vss Server Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
sosServerPath	TokenNameIdentifier	 sos Server Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
sosHome	TokenNameIdentifier	 sos Home
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
localPath	TokenNameIdentifier	 local Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
noCompress	TokenNameIdentifier	 no Compress
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
noCache	TokenNameIdentifier	 no Cache
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
recursive	TokenNameIdentifier	 recursive
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** Commandline to be executed. */	TokenNameCOMMENT_JAVADOC	 Commandline to be executed. 
protected	TokenNameprotected	
Commandline	TokenNameIdentifier	 Commandline
commandLine	TokenNameIdentifier	 command Line
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Flag to disable the cache when set. * Required if SOSHOME is set as an environment variable. * Defaults to false. * * @param nocache True to disable caching. */	TokenNameCOMMENT_JAVADOC	 Flag to disable the cache when set. Required if SOSHOME is set as an environment variable. Defaults to false. * @param nocache True to disable caching. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setNoCache	TokenNameIdentifier	 set No Cache
(	TokenNameLPAREN	
boolean	TokenNameboolean	
nocache	TokenNameIdentifier	 nocache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noCache	TokenNameIdentifier	 no Cache
=	TokenNameEQUAL	
nocache	TokenNameIdentifier	 nocache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flag to disable compression when set. Defaults to false. * * @param nocompress True to disable compression. */	TokenNameCOMMENT_JAVADOC	 Flag to disable compression when set. Defaults to false. * @param nocompress True to disable compression. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setNoCompress	TokenNameIdentifier	 set No Compress
(	TokenNameLPAREN	
boolean	TokenNameboolean	
nocompress	TokenNameIdentifier	 nocompress
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noCompress	TokenNameIdentifier	 no Compress
=	TokenNameEQUAL	
nocompress	TokenNameIdentifier	 nocompress
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The directory where soscmd(.exe) is located. * soscmd must be on the path if omitted. * * @param dir The new sosCmd value. */	TokenNameCOMMENT_JAVADOC	 The directory where soscmd(.exe) is located. soscmd must be on the path if omitted. * @param dir The new sosCmd value. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setSosCmd	TokenNameIdentifier	 set Sos Cmd
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sosCmdDir	TokenNameIdentifier	 sos Cmd Dir
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
translatePath	TokenNameIdentifier	 translate Path
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The SourceSafe username. * * @param username The new username value. * * @ant.attribute group="required" */	TokenNameCOMMENT_JAVADOC	 The SourceSafe username. * @param username The new username value. * @ant.attribute group="required" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sosUsername	TokenNameIdentifier	 sos Username
=	TokenNameEQUAL	
username	TokenNameIdentifier	 username
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The SourceSafe password. * * @param password The new password value. */	TokenNameCOMMENT_JAVADOC	 The SourceSafe password. * @param password The new password value. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sosPassword	TokenNameIdentifier	 sos Password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The SourceSafe project path. * * @param projectpath The new projectpath value. * * @ant.attribute group="required" */	TokenNameCOMMENT_JAVADOC	 The SourceSafe project path. * @param projectpath The new projectpath value. * @ant.attribute group="required" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setProjectPath	TokenNameIdentifier	 set Project Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectpath	TokenNameIdentifier	 projectpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
projectpath	TokenNameIdentifier	 projectpath
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
SOSCmd	TokenNameIdentifier	 SOS Cmd
.	TokenNameDOT	
PROJECT_PREFIX	TokenNameIdentifier	 PROJECT  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
projectPath	TokenNameIdentifier	 project Path
=	TokenNameEQUAL	
projectpath	TokenNameIdentifier	 projectpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
projectPath	TokenNameIdentifier	 project Path
=	TokenNameEQUAL	
SOSCmd	TokenNameIdentifier	 SOS Cmd
.	TokenNameDOT	
PROJECT_PREFIX	TokenNameIdentifier	 PROJECT  PREFIX
+	TokenNamePLUS	
projectpath	TokenNameIdentifier	 projectpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The path to the location of the ss.ini file. * * @param vssServerPath The new vssServerPath value. * * @ant.attribute group="required" */	TokenNameCOMMENT_JAVADOC	 The path to the location of the ss.ini file. * @param vssServerPath The new vssServerPath value. * @ant.attribute group="required" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setVssServerPath	TokenNameIdentifier	 set Vss Server Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
vssServerPath	TokenNameIdentifier	 vss Server Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
vssServerPath	TokenNameIdentifier	 vss Server Path
=	TokenNameEQUAL	
vssServerPath	TokenNameIdentifier	 vss Server Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Path to the SourceOffSite home directory. * * @param sosHome The new sosHome value. */	TokenNameCOMMENT_JAVADOC	 Path to the SourceOffSite home directory. * @param sosHome The new sosHome value. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setSosHome	TokenNameIdentifier	 set Sos Home
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sosHome	TokenNameIdentifier	 sos Home
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sosHome	TokenNameIdentifier	 sos Home
=	TokenNameEQUAL	
sosHome	TokenNameIdentifier	 sos Home
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The address and port of SourceOffSite Server, * for example 192.168.0.1:8888. * * @param sosServerPath The new sosServerPath value. * * @ant.attribute group="required" */	TokenNameCOMMENT_JAVADOC	 The address and port of SourceOffSite Server, for example 192.168.0.1:8888. * @param sosServerPath The new sosServerPath value. * @ant.attribute group="required" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setSosServerPath	TokenNameIdentifier	 set Sos Server Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sosServerPath	TokenNameIdentifier	 sos Server Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sosServerPath	TokenNameIdentifier	 sos Server Path
=	TokenNameEQUAL	
sosServerPath	TokenNameIdentifier	 sos Server Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override the working directory and get to the specified path. * * @param path The new localPath value. */	TokenNameCOMMENT_JAVADOC	 Override the working directory and get to the specified path. * @param path The new localPath value. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setLocalPath	TokenNameIdentifier	 set Local Path
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localPath	TokenNameIdentifier	 local Path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Enable verbose output. Defaults to false. * * @param verbose True for verbose output. */	TokenNameCOMMENT_JAVADOC	 Enable verbose output. Defaults to false. * @param verbose True for verbose output. 
public	TokenNamepublic	
void	TokenNamevoid	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Special setters for the sub-classes 	TokenNameCOMMENT_LINE	Special setters for the sub-classes 
/** * Set the file name. * @param file the filename to use. */	TokenNameCOMMENT_JAVADOC	 Set the file name. @param file the filename to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalFilename	TokenNameIdentifier	 set Internal Filename
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the recursive flag. * @param recurse if true use the recursive flag on the command line. */	TokenNameCOMMENT_JAVADOC	 Set the recursive flag. @param recurse if true use the recursive flag on the command line. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalRecursive	TokenNameIdentifier	 set Internal Recursive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
recurse	TokenNameIdentifier	 recurse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recursive	TokenNameIdentifier	 recursive
=	TokenNameEQUAL	
recurse	TokenNameIdentifier	 recurse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the comment text. * @param text the comment text to use. */	TokenNameCOMMENT_JAVADOC	 Set the comment text. @param text the comment text to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalComment	TokenNameIdentifier	 set Internal Comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the label. * @param text the label to use. */	TokenNameCOMMENT_JAVADOC	 Set the label. @param text the label to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalLabel	TokenNameIdentifier	 set Internal Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the version. * @param text the version to use. */	TokenNameCOMMENT_JAVADOC	 Set the version. @param text the version to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
setInternalVersion	TokenNameIdentifier	 set Internal Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the executable to run. Add the path if it was specifed in the build file * * @return the executable to run. */	TokenNameCOMMENT_JAVADOC	 Get the executable to run. Add the path if it was specifed in the build file * @return the executable to run. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getSosCommand	TokenNameIdentifier	 get Sos Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sosCmdDir	TokenNameIdentifier	 sos Cmd Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
COMMAND_SOS_EXE	TokenNameIdentifier	 COMMAND  SOS  EXE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
sosCmdDir	TokenNameIdentifier	 sos Cmd Dir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
COMMAND_SOS_EXE	TokenNameIdentifier	 COMMAND  SOS  EXE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the comment * @return if it was set, null if not. */	TokenNameCOMMENT_JAVADOC	 Get the comment @return if it was set, null if not. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the version * @return if it was set, null if not. */	TokenNameCOMMENT_JAVADOC	 Get the version @return if it was set, null if not. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the label * @return if it was set, null if not. */	TokenNameCOMMENT_JAVADOC	 Get the label @return if it was set, null if not. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the username * @return if it was set, null if not. */	TokenNameCOMMENT_JAVADOC	 Get the username @return if it was set, null if not. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getUsername	TokenNameIdentifier	 get Username
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sosUsername	TokenNameIdentifier	 sos Username
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the password * @return empty string if it wasn't set. */	TokenNameCOMMENT_JAVADOC	 Get the password @return empty string if it wasn't set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sosPassword	TokenNameIdentifier	 sos Password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the project path * @return if it was set, null if not. */	TokenNameCOMMENT_JAVADOC	 Get the project path @return if it was set, null if not. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getProjectPath	TokenNameIdentifier	 get Project Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectPath	TokenNameIdentifier	 project Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the VSS server path * @return if it was set, null if not. */	TokenNameCOMMENT_JAVADOC	 Get the VSS server path @return if it was set, null if not. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getVssServerPath	TokenNameIdentifier	 get Vss Server Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vssServerPath	TokenNameIdentifier	 vss Server Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the SOS home directory. * @return if it was set, null if not. */	TokenNameCOMMENT_JAVADOC	 Get the SOS home directory. @return if it was set, null if not. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getSosHome	TokenNameIdentifier	 get Sos Home
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sosHome	TokenNameIdentifier	 sos Home
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the SOS serve path. * @return if it was set, null if not. */	TokenNameCOMMENT_JAVADOC	 Get the SOS serve path. @return if it was set, null if not. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getSosServerPath	TokenNameIdentifier	 get Sos Server Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sosServerPath	TokenNameIdentifier	 sos Server Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the filename to be acted upon. * @return if it was set, null if not. */	TokenNameCOMMENT_JAVADOC	 Get the filename to be acted upon. @return if it was set, null if not. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the NoCompress flag. * * @return the 'nocompress' Flag if the attribute was 'true', * otherwise an empty string. */	TokenNameCOMMENT_JAVADOC	 Get the NoCompress flag. * @return the 'nocompress' Flag if the attribute was 'true', otherwise an empty string. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getNoCompress	TokenNameIdentifier	 get No Compress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
noCompress	TokenNameIdentifier	 no Compress
?	TokenNameQUESTION	
FLAG_NO_COMPRESSION	TokenNameIdentifier	 FLAG  NO  COMPRESSION
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the NoCache flag. * * @return the 'nocache' Flag if the attribute was 'true', otherwise an empty string. */	TokenNameCOMMENT_JAVADOC	 Get the NoCache flag. * @return the 'nocache' Flag if the attribute was 'true', otherwise an empty string. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getNoCache	TokenNameIdentifier	 get No Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
noCache	TokenNameIdentifier	 no Cache
?	TokenNameQUESTION	
FLAG_NO_CACHE	TokenNameIdentifier	 FLAG  NO  CACHE
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the 'verbose' Flag. * * @return the 'verbose' Flag if the attribute was 'true', otherwise an empty string. */	TokenNameCOMMENT_JAVADOC	 Get the 'verbose' Flag. * @return the 'verbose' Flag if the attribute was 'true', otherwise an empty string. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
verbose	TokenNameIdentifier	 verbose
?	TokenNameQUESTION	
FLAG_VERBOSE	TokenNameIdentifier	 FLAG  VERBOSE
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the 'recursive' Flag. * * @return the 'recursive' Flag if the attribute was 'true', otherwise an empty string. */	TokenNameCOMMENT_JAVADOC	 Get the 'recursive' Flag. * @return the 'recursive' Flag if the attribute was 'true', otherwise an empty string. 
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
/** * Builds and returns the working directory. * <p> * The localpath is created if it didn't exist. * * @return the absolute path of the working directory. */	TokenNameCOMMENT_JAVADOC	 Builds and returns the working directory. <p> The localpath is created if it didn't exist. * @return the absolute path of the working directory. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLocalPath	TokenNameIdentifier	 get Local Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localPath	TokenNameIdentifier	 local Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// make sure localDir exists, create it if it doesn't 	TokenNameCOMMENT_LINE	make sure localDir exists, create it if it doesn't 
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
return	TokenNamereturn	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Subclasses implement the logic required to construct the command line. * * @return The command line to execute. */	TokenNameCOMMENT_JAVADOC	 Subclasses implement the logic required to construct the command line. * @return The command line to execute. 
abstract	TokenNameabstract	
Commandline	TokenNameIdentifier	 Commandline
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Execute the created command line. * * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Execute the created command line. * @throws BuildException on error. 
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
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
ERROR_EXIT_STATUS	TokenNameIdentifier	 ERROR  EXIT  STATUS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is the exit status 	TokenNameCOMMENT_LINE	This is the exit status 
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
/** * Execute the created command line. * * @param cmd The command line to run. * @return int the exit code. * @throws BuildException */	TokenNameCOMMENT_JAVADOC	 Execute the created command line. * @param cmd The command line to run. @return int the exit code. @throws BuildException 
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
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setVMLauncher	TokenNameIdentifier	 set VM Launcher
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use the OS VM launcher so we get environment variables 	TokenNameCOMMENT_LINE	Use the OS VM launcher so we get environment variables 
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
/** Sets the executable and add the required attributes to the command line. */	TokenNameCOMMENT_JAVADOC	 Sets the executable and add the required attributes to the command line. 
protected	TokenNameprotected	
void	TokenNamevoid	
getRequiredAttributes	TokenNameIdentifier	 get Required Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the path to the soscmd(.exe) 	TokenNameCOMMENT_LINE	Get the path to the soscmd(.exe) 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
getSosCommand	TokenNameIdentifier	 get Sos Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// SOS server address is required 	TokenNameCOMMENT_LINE	SOS server address is required 
if	TokenNameif	
(	TokenNameLPAREN	
getSosServerPath	TokenNameIdentifier	 get Sos Server Path
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
"sosserverpath attribute must be set!"	TokenNameStringLiteral	sosserverpath attribute must be set!
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_SOS_SERVER	TokenNameIdentifier	 FLAG  SOS  SERVER
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
getSosServerPath	TokenNameIdentifier	 get Sos Server Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Login info is required 	TokenNameCOMMENT_LINE	Login info is required 
if	TokenNameif	
(	TokenNameLPAREN	
getUsername	TokenNameIdentifier	 get Username
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
"username attribute must be set!"	TokenNameStringLiteral	username attribute must be set!
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_USERNAME	TokenNameIdentifier	 FLAG  USERNAME
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
getUsername	TokenNameIdentifier	 get Username
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The SOS class knows that the SOS server needs the password flag, 	TokenNameCOMMENT_LINE	The SOS class knows that the SOS server needs the password flag, 
// even if there is no password ,so we send a " " 	TokenNameCOMMENT_LINE	even if there is no password ,so we send a " " 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_PASSWORD	TokenNameIdentifier	 FLAG  PASSWORD
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
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// VSS Info is required 	TokenNameCOMMENT_LINE	VSS Info is required 
if	TokenNameif	
(	TokenNameLPAREN	
getVssServerPath	TokenNameIdentifier	 get Vss Server Path
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
"vssserverpath attribute must be set!"	TokenNameStringLiteral	vssserverpath attribute must be set!
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_VSS_SERVER	TokenNameIdentifier	 FLAG  VSS  SERVER
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
getVssServerPath	TokenNameIdentifier	 get Vss Server Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// VSS project is required 	TokenNameCOMMENT_LINE	VSS project is required 
if	TokenNameif	
(	TokenNameLPAREN	
getProjectPath	TokenNameIdentifier	 get Project Path
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
"projectpath attribute must be set!"	TokenNameStringLiteral	projectpath attribute must be set!
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_PROJECT	TokenNameIdentifier	 FLAG  PROJECT
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
getProjectPath	TokenNameIdentifier	 get Project Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Adds the optional attributes to the command line. */	TokenNameCOMMENT_JAVADOC	 Adds the optional attributes to the command line. 
protected	TokenNameprotected	
void	TokenNamevoid	
getOptionalAttributes	TokenNameIdentifier	 get Optional Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -verbose 	TokenNameCOMMENT_LINE	-verbose 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Disable Compression 	TokenNameCOMMENT_LINE	Disable Compression 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getNoCompress	TokenNameIdentifier	 get No Compress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Path to the SourceOffSite home directory /home/user/.sos 	TokenNameCOMMENT_LINE	Path to the SourceOffSite home directory /home/user/.sos 
if	TokenNameif	
(	TokenNameLPAREN	
getSosHome	TokenNameIdentifier	 get Sos Home
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If -soshome was not specified then we can look for nocache 	TokenNameCOMMENT_LINE	If -soshome was not specified then we can look for nocache 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getNoCache	TokenNameIdentifier	 get No Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_SOS_HOME	TokenNameIdentifier	 FLAG  SOS  HOME
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
getSosHome	TokenNameIdentifier	 get Sos Home
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//If a working directory was specified then add it to the command line 	TokenNameCOMMENT_LINE	If a working directory was specified then add it to the command line 
if	TokenNameif	
(	TokenNameLPAREN	
getLocalPath	TokenNameIdentifier	 get Local Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_WORKING_DIR	TokenNameIdentifier	 FLAG  WORKING  DIR
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
getLocalPath	TokenNameIdentifier	 get Local Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
