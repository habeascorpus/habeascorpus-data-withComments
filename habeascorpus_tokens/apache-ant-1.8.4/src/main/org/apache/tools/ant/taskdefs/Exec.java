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
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
FileWriter	TokenNameIdentifier	 File Writer
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
MagicNames	TokenNameIdentifier	 Magic Names
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
/** * Executes a given command if the os platform is appropriate. * * <p><strong>As of Ant 1.2, this class is no longer the * implementation of Ant's &lt;exec&gt; task - it is considered to be * dead code by the Ant developers and is unmaintained. Don't use * it.</strong></p> * * @deprecated since 1.2. * delegate to {@link org.apache.tools.ant.taskdefs.Execute Execute} * instead. */	TokenNameCOMMENT_JAVADOC	 Executes a given command if the os platform is appropriate. * <p><strong>As of Ant 1.2, this class is no longer the implementation of Ant's &lt;exec&gt; task - it is considered to be dead code by the Ant developers and is unmaintained. Don't use it.</strong></p> * @deprecated since 1.2. delegate to {@link org.apache.tools.ant.taskdefs.Execute Execute} instead. 
public	TokenNamepublic	
class	TokenNameclass	
Exec	TokenNameIdentifier	 Exec
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
PrintWriter	TokenNameIdentifier	 Print Writer
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructor for Exec. * Prints a warning message to std error. */	TokenNameCOMMENT_JAVADOC	 Constructor for Exec. Prints a warning message to std error. 
public	TokenNamepublic	
Exec	TokenNameIdentifier	 Exec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"As of Ant 1.2 released in October 2000, "	TokenNameStringLiteral	As of Ant 1.2 released in October 2000, 
+	TokenNamePLUS	
"the Exec class"	TokenNameStringLiteral	the Exec class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"is considered to be dead code by the Ant "	TokenNameStringLiteral	is considered to be dead code by the Ant 
+	TokenNamePLUS	
"developers and is unmaintained."	TokenNameStringLiteral	developers and is unmaintained.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Don't use it!"	TokenNameStringLiteral	Don't use it!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the task. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Execute the task. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the command. * @param command the command to exec * @return the exit value of the command * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Execute the command. @param command the command to exec @return the exit value of the command @throws BuildException on error 
protected	TokenNameprotected	
int	TokenNameint	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
int	TokenNameint	
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// assume the worst 	TokenNameCOMMENT_LINE	assume the worst 
// test if os match 	TokenNameCOMMENT_LINE	test if os match 
String	TokenNameIdentifier	 String
myos	TokenNameIdentifier	 myos
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Myos = "	TokenNameStringLiteral	Myos = 
+	TokenNamePLUS	
myos	TokenNameIdentifier	 myos
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
myos	TokenNameIdentifier	 myos
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this command will be executed only on the specified OS 	TokenNameCOMMENT_LINE	this command will be executed only on the specified OS 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Not found in "	TokenNameStringLiteral	Not found in 
+	TokenNamePLUS	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// default directory to the project's base directory 	TokenNameCOMMENT_LINE	default directory to the project's base directory 
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
myos	TokenNameIdentifier	 myos
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"windows"	TokenNameStringLiteral	windows
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
myos	TokenNameIdentifier	 myos
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"nt"	TokenNameStringLiteral	nt
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
"cmd /c cd "	TokenNameStringLiteral	cmd /c cd 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
" && "	TokenNameStringLiteral	 && 
+	TokenNamePLUS	
command	TokenNameIdentifier	 command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ant	TokenNameIdentifier	 ant
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
ANT_HOME	TokenNameIdentifier	 ANT  HOME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ant	TokenNameIdentifier	 ant
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Property '"	TokenNameStringLiteral	Property '
+	TokenNamePLUS	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
ANT_HOME	TokenNameIdentifier	 ANT  HOME
+	TokenNamePLUS	
"' not "	TokenNameStringLiteral	' not 
+	TokenNamePLUS	
"found"	TokenNameStringLiteral	found
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
antRun	TokenNameIdentifier	 ant Run
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
ant	TokenNameIdentifier	 ant
+	TokenNamePLUS	
"/bin/antRun.bat"	TokenNameStringLiteral	/bin/antRun.bat
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
antRun	TokenNameIdentifier	 ant Run
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
command	TokenNameIdentifier	 command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ant	TokenNameIdentifier	 ant
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
ANT_HOME	TokenNameIdentifier	 ANT  HOME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ant	TokenNameIdentifier	 ant
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Property '"	TokenNameStringLiteral	Property '
+	TokenNamePLUS	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
ANT_HOME	TokenNameIdentifier	 ANT  HOME
+	TokenNamePLUS	
"' not found"	TokenNameStringLiteral	' not found
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
antRun	TokenNameIdentifier	 ant Run
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
ant	TokenNameIdentifier	 ant
+	TokenNamePLUS	
"/bin/antRun"	TokenNameStringLiteral	/bin/antRun
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
antRun	TokenNameIdentifier	 ant Run
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
command	TokenNameIdentifier	 command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// show the command 	TokenNameCOMMENT_LINE	show the command 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// exec command on system runtime 	TokenNameCOMMENT_LINE	exec command on system runtime 
Process	TokenNameIdentifier	 Process
proc	TokenNameIdentifier	 proc
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Output redirected to "	TokenNameStringLiteral	Output redirected to 
+	TokenNamePLUS	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// copy input and error to the output stream 	TokenNameCOMMENT_LINE	copy input and error to the output stream 
StreamPumper	TokenNameIdentifier	 Stream Pumper
inputPumper	TokenNameIdentifier	 input Pumper
=	TokenNameEQUAL	
new	TokenNamenew	
StreamPumper	TokenNameIdentifier	 Stream Pumper
(	TokenNameLPAREN	
proc	TokenNameIdentifier	 proc
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamPumper	TokenNameIdentifier	 Stream Pumper
errorPumper	TokenNameIdentifier	 error Pumper
=	TokenNameEQUAL	
new	TokenNamenew	
StreamPumper	TokenNameIdentifier	 Stream Pumper
(	TokenNameLPAREN	
proc	TokenNameIdentifier	 proc
.	TokenNameDOT	
getErrorStream	TokenNameIdentifier	 get Error Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// starts pumping away the generated output/error 	TokenNameCOMMENT_LINE	starts pumping away the generated output/error 
inputPumper	TokenNameIdentifier	 input Pumper
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorPumper	TokenNameIdentifier	 error Pumper
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Wait for everything to finish 	TokenNameCOMMENT_LINE	Wait for everything to finish 
proc	TokenNameIdentifier	 proc
.	TokenNameDOT	
waitFor	TokenNameIdentifier	 wait For
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inputPumper	TokenNameIdentifier	 input Pumper
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorPumper	TokenNameIdentifier	 error Pumper
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
proc	TokenNameIdentifier	 proc
.	TokenNameDOT	
destroy	TokenNameIdentifier	 destroy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close the output file if required 	TokenNameCOMMENT_LINE	close the output file if required 
logFlush	TokenNameIdentifier	 log Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check its exit value 	TokenNameCOMMENT_LINE	check its exit value 
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
proc	TokenNameIdentifier	 proc
.	TokenNameDOT	
exitValue	TokenNameIdentifier	 exit Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Exec returned: "	TokenNameStringLiteral	Exec returned: 
+	TokenNamePLUS	
err	TokenNameIdentifier	 err
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Result: "	TokenNameStringLiteral	Result: 
+	TokenNamePLUS	
err	TokenNameIdentifier	 err
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
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Error exec: "	TokenNameStringLiteral	Error exec: 
+	TokenNamePLUS	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
return	TokenNamereturn	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the directory. * @param d a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Set the directory. @param d a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the Operating System that this exec is to run in. * @param os a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Set the Operating System that this exec is to run in. @param os a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setOs	TokenNameIdentifier	 set Os
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the command to exec. * @param command a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Set the command to exec. @param command a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setCommand	TokenNameIdentifier	 set Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
command	TokenNameIdentifier	 command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the output filename. * @param out a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Set the output filename. @param out a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the failOnError attribute. * Default is false. * @param fail a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 Set the failOnError attribute. Default is false. @param fail a <code>boolean</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setFailonerror	TokenNameIdentifier	 set Failonerror
(	TokenNameLPAREN	
boolean	TokenNameboolean	
fail	TokenNameIdentifier	 fail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
fail	TokenNameIdentifier	 fail
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Log an output message. * @param line the line to putput * @param messageLevel the level of logging - ignored * if output is going to a file */	TokenNameCOMMENT_JAVADOC	 Log an output message. @param line the line to putput @param messageLevel the level of logging - ignored if output is going to a file 
protected	TokenNameprotected	
void	TokenNamevoid	
outputLog	TokenNameIdentifier	 output Log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
messageLevel	TokenNameIdentifier	 message Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fos	TokenNameIdentifier	 fos
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
messageLevel	TokenNameIdentifier	 message Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Close output. */	TokenNameCOMMENT_JAVADOC	 Close output. 
protected	TokenNameprotected	
void	TokenNamevoid	
logFlush	TokenNameIdentifier	 log Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fos	TokenNameIdentifier	 fos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Inner class for continually pumping the input stream during 	TokenNameCOMMENT_LINE	Inner class for continually pumping the input stream during 
// Process's runtime. 	TokenNameCOMMENT_LINE	Process's runtime. 
class	TokenNameclass	
StreamPumper	TokenNameIdentifier	 Stream Pumper
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
BufferedReader	TokenNameIdentifier	 Buffered Reader
din	TokenNameIdentifier	 din
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
messageLevel	TokenNameIdentifier	 message Level
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
endOfStream	TokenNameIdentifier	 end Of Stream
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SLEEP_TIME	TokenNameIdentifier	 SLEEP  TIME
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StreamPumper	TokenNameIdentifier	 Stream Pumper
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
int	TokenNameint	
messageLevel	TokenNameIdentifier	 message Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
din	TokenNameIdentifier	 din
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
messageLevel	TokenNameIdentifier	 message Level
=	TokenNameEQUAL	
messageLevel	TokenNameIdentifier	 message Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
pumpStream	TokenNameIdentifier	 pump Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
endOfStream	TokenNameIdentifier	 end Of Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
din	TokenNameIdentifier	 din
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputLog	TokenNameIdentifier	 output Log
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
messageLevel	TokenNameIdentifier	 message Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
endOfStream	TokenNameIdentifier	 end Of Stream
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
endOfStream	TokenNameIdentifier	 end Of Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pumpStream	TokenNameIdentifier	 pump Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
SLEEP_TIME	TokenNameIdentifier	 SLEEP  TIME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
din	TokenNameIdentifier	 din
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
