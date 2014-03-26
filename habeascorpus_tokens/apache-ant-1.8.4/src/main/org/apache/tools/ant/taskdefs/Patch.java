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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Commandline	TokenNameIdentifier	 Commandline
;	TokenNameSEMICOLON	
/** * Patches a file by applying a 'diff' file to it; requires "patch" to be * on the execution path. * * @since Ant 1.1 * * @ant.task category="utility" */	TokenNameCOMMENT_JAVADOC	 Patches a file by applying a 'diff' file to it; requires "patch" to be on the execution path. * @since Ant 1.1 * @ant.task category="utility" 
public	TokenNamepublic	
class	TokenNameclass	
Patch	TokenNameIdentifier	 Patch
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
originalFile	TokenNameIdentifier	 original File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
havePatchfile	TokenNameIdentifier	 have Patchfile
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Halt on error return value from patch invocation. */	TokenNameCOMMENT_JAVADOC	 Halt on error return value from patch invocation. 
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The file to patch; optional if it can be inferred from * the diff file * @param file the file to patch */	TokenNameCOMMENT_JAVADOC	 The file to patch; optional if it can be inferred from the diff file @param file the file to patch 
public	TokenNamepublic	
void	TokenNamevoid	
setOriginalfile	TokenNameIdentifier	 set Originalfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
originalFile	TokenNameIdentifier	 original File
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of a file to send the output to, instead of patching * the file(s) in place; optional. * @param file the file to send the output to * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 The name of a file to send the output to, instead of patching the file(s) in place; optional. @param file the file to send the output to @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setDestfile	TokenNameIdentifier	 set Destfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
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
"-o"	TokenNameStringLiteral	-o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The file containing the diff output; required. * @param file the file containing the diff output */	TokenNameCOMMENT_JAVADOC	 The file containing the diff output; required. @param file the file containing the diff output 
public	TokenNamepublic	
void	TokenNamevoid	
setPatchfile	TokenNameIdentifier	 set Patchfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"patchfile "	TokenNameStringLiteral	patchfile 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" doesn't exist"	TokenNameStringLiteral	 doesn't exist
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
"-i"	TokenNameStringLiteral	-i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
havePatchfile	TokenNameIdentifier	 have Patchfile
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * flag to create backups; optional, default=false * @param backups if true create backups */	TokenNameCOMMENT_JAVADOC	 flag to create backups; optional, default=false @param backups if true create backups 
public	TokenNamepublic	
void	TokenNamevoid	
setBackups	TokenNameIdentifier	 set Backups
(	TokenNameLPAREN	
boolean	TokenNameboolean	
backups	TokenNameIdentifier	 backups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
backups	TokenNameIdentifier	 backups
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
"-b"	TokenNameStringLiteral	-b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * flag to ignore whitespace differences; default=false * @param ignore if true ignore whitespace differences */	TokenNameCOMMENT_JAVADOC	 flag to ignore whitespace differences; default=false @param ignore if true ignore whitespace differences 
public	TokenNamepublic	
void	TokenNamevoid	
setIgnorewhitespace	TokenNameIdentifier	 set Ignorewhitespace
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ignore	TokenNameIdentifier	 ignore
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
"-l"	TokenNameStringLiteral	-l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Strip the smallest prefix containing <i>num</i> leading slashes * from filenames. * * <p>patch's <i>-p</i> option. * @param num number of lines to strip * @exception BuildException if num is < 0, or other errors */	TokenNameCOMMENT_JAVADOC	 Strip the smallest prefix containing <i>num</i> leading slashes from filenames. * <p>patch's <i>-p</i> option. @param num number of lines to strip @exception BuildException if num is < 0, or other errors 
public	TokenNamepublic	
void	TokenNamevoid	
setStrip	TokenNameIdentifier	 set Strip
(	TokenNameLPAREN	
int	TokenNameint	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"strip has to be >= 0"	TokenNameStringLiteral	strip has to be >= 0
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
"-p"	TokenNameStringLiteral	-p
+	TokenNamePLUS	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Work silently unless an error occurs; optional, default=false * @param q if true suppress set the -s option on the patch command */	TokenNameCOMMENT_JAVADOC	 Work silently unless an error occurs; optional, default=false @param q if true suppress set the -s option on the patch command 
public	TokenNamepublic	
void	TokenNamevoid	
setQuiet	TokenNameIdentifier	 set Quiet
(	TokenNameLPAREN	
boolean	TokenNameboolean	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
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
"-s"	TokenNameStringLiteral	-s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Assume patch was created with old and new files swapped; optional, * default=false * @param r if true set the -R option on the patch command */	TokenNameCOMMENT_JAVADOC	 Assume patch was created with old and new files swapped; optional, default=false @param r if true set the -R option on the patch command 
public	TokenNamepublic	
void	TokenNamevoid	
setReverse	TokenNameIdentifier	 set Reverse
(	TokenNameLPAREN	
boolean	TokenNameboolean	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
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
"-R"	TokenNameStringLiteral	-R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The directory to run the patch command in, defaults to the * project's base directory. * @param directory the directory to run the patch command in * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 The directory to run the patch command in, defaults to the project's base directory. @param directory the directory to run the patch command in @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If <code>true</code>, stop the build process if the patch command * exits with an error status. * @param value <code>true</code> if it should halt, otherwise * <code>false</code>. The default is <code>false</code>. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 If <code>true</code>, stop the build process if the patch command exits with an error status. @param value <code>true</code> if it should halt, otherwise <code>false</code>. The default is <code>false</code>. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setFailOnError	TokenNameIdentifier	 set Fail On Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PATCH	TokenNameIdentifier	 PATCH
=	TokenNameEQUAL	
"patch"	TokenNameStringLiteral	patch
;	TokenNameSEMICOLON	
/** * execute patch * @throws BuildException when it all goes a bit pear shaped */	TokenNameCOMMENT_JAVADOC	 execute patch @throws BuildException when it all goes a bit pear shaped 
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
!	TokenNameNOT	
havePatchfile	TokenNameIdentifier	 have Patchfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"patchfile argument is required"	TokenNameStringLiteral	patchfile argument is required
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Commandline	TokenNameIdentifier	 Commandline
toExecute	TokenNameIdentifier	 to Execute
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
)	TokenNameRPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toExecute	TokenNameIdentifier	 to Execute
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
PATCH	TokenNameIdentifier	 PATCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
originalFile	TokenNameIdentifier	 original File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toExecute	TokenNameIdentifier	 to Execute
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
originalFile	TokenNameIdentifier	 original File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setCommandline	TokenNameIdentifier	 set Commandline
(	TokenNameLPAREN	
toExecute	TokenNameIdentifier	 to Execute
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
setWorkingDirectory	TokenNameIdentifier	 set Working Directory
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
+	TokenNamePLUS	
" is not a directory."	TokenNameStringLiteral	 is not a directory.
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"directory "	TokenNameStringLiteral	directory 
+	TokenNamePLUS	
directory	TokenNameIdentifier	 directory
+	TokenNamePLUS	
" doesn't exist"	TokenNameStringLiteral	 doesn't exist
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
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
toExecute	TokenNameIdentifier	 to Execute
.	TokenNameDOT	
describeCommand	TokenNameIdentifier	 describe Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
returncode	TokenNameIdentifier	 returncode
=	TokenNameEQUAL	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Execute	TokenNameIdentifier	 Execute
.	TokenNameDOT	
isFailure	TokenNameIdentifier	 is Failure
(	TokenNameLPAREN	
returncode	TokenNameIdentifier	 returncode
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
PATCH	TokenNameIdentifier	 PATCH
+	TokenNamePLUS	
"' failed with exit code "	TokenNameStringLiteral	' failed with exit code 
+	TokenNamePLUS	
returncode	TokenNameIdentifier	 returncode
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
