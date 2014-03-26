/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * Portions of this software are based upon public domain software * originally written at the National Center for Supercomputing Applications, * University of Illinois, Urbana-Champaign. */	TokenNameCOMMENT_BLOCK	 Portions of this software are based upon public domain software originally written at the National Center for Supercomputing Applications, University of Illinois, Urbana-Champaign. 
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
perforce	TokenNameIdentifier	 perforce
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
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
FileSet	TokenNameIdentifier	 File Set
;	TokenNameSEMICOLON	
/** * Adds specified files to Perforce. * * <b>Example Usage:</b> * <table border="1"> * <th>Function</th><th>Command</th> * <tr><td>Add files using P4USER, P4PORT and P4CLIENT settings specified</td> * <td>&lt;P4add <br>P4view="//projects/foo/main/source/..." <br>P4User="fbloggs" * <br>P4Port="km01:1666" * <br>P4Client="fbloggsclient"&gt;<br>&lt;fileset basedir="dir" includes="**&#47;*.java"&gt;<br> * &lt;/p4add&gt;</td></tr> * <tr><td>Add files using P4USER, P4PORT and P4CLIENT settings defined in environment</td><td> * &lt;P4add P4view="//projects/foo/main/source/..." /&gt;<br>&lt;fileset basedir="dir" * includes="**&#47;*.java"&gt;<br>&lt;/p4add&gt;</td></tr> * <tr><td>Specify the length of command line arguments to pass to each invocation of p4</td> * <td>&lt;p4add Commandlength="450"&gt;</td></tr> * </table> * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Adds specified files to Perforce. * <b>Example Usage:</b> <table border="1"> <th>Function</th><th>Command</th> <tr><td>Add files using P4USER, P4PORT and P4CLIENT settings specified</td> <td>&lt;P4add <br>P4view="//projects/foo/main/source/..." <br>P4User="fbloggs" <br>P4Port="km01:1666" <br>P4Client="fbloggsclient"&gt;<br>&lt;fileset basedir="dir" includes="**&#47;*.java"&gt;<br> &lt;/p4add&gt;</td></tr> <tr><td>Add files using P4USER, P4PORT and P4CLIENT settings defined in environment</td><td> &lt;P4add P4view="//projects/foo/main/source/..." /&gt;<br>&lt;fileset basedir="dir" includes="**&#47;*.java"&gt;<br>&lt;/p4add&gt;</td></tr> <tr><td>Specify the length of command line arguments to pass to each invocation of p4</td> <td>&lt;p4add Commandlength="450"&gt;</td></tr> </table> * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Add	TokenNameIdentifier	 P4 Add
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_CMD_LENGTH	TokenNameIdentifier	 DEFAULT  CMD  LENGTH
=	TokenNameEQUAL	
450	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
changelist	TokenNameIdentifier	 changelist
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
addCmd	TokenNameIdentifier	 add Cmd
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
filesets	TokenNameIdentifier	 filesets
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
cmdLength	TokenNameIdentifier	 cmd Length
=	TokenNameEQUAL	
DEFAULT_CMD_LENGTH	TokenNameIdentifier	 DEFAULT  CMD  LENGTH
;	TokenNameSEMICOLON	
/** * Set the maximum length * of the commandline when calling Perforce to add the files. * Defaults to 450, higher values mean faster execution, * but also possible failures. * @param len maximum length of command line default is 450. * @throws BuildException if trying to set the command line length to 0 or less. */	TokenNameCOMMENT_JAVADOC	 Set the maximum length of the commandline when calling Perforce to add the files. Defaults to 450, higher values mean faster execution, but also possible failures. @param len maximum length of command line default is 450. @throws BuildException if trying to set the command line length to 0 or less. 
public	TokenNamepublic	
void	TokenNamevoid	
setCommandlength	TokenNameIdentifier	 set Commandlength
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"P4Add: Commandlength should be a positive number"	TokenNameStringLiteral	P4Add: Commandlength should be a positive number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cmdLength	TokenNameIdentifier	 cmd Length
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If specified the open files are associated with the * specified pending changelist number; otherwise the open files are * associated with the default changelist. * * @param changelist the change list number. * * @throws BuildException if trying to set a change list number &lt;=0. */	TokenNameCOMMENT_JAVADOC	 If specified the open files are associated with the specified pending changelist number; otherwise the open files are associated with the default changelist. * @param changelist the change list number. * @throws BuildException if trying to set a change list number &lt;=0. 
public	TokenNamepublic	
void	TokenNamevoid	
setChangelist	TokenNameIdentifier	 set Changelist
(	TokenNameLPAREN	
int	TokenNameint	
changelist	TokenNameIdentifier	 changelist
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
changelist	TokenNameIdentifier	 changelist
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"P4Add: Changelist# should be a positive number"	TokenNameStringLiteral	P4Add: Changelist# should be a positive number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
changelist	TokenNameIdentifier	 changelist
=	TokenNameEQUAL	
changelist	TokenNameIdentifier	 changelist
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a fileset whose files will be added to Perforce. * * @param set the FileSet that one wants to add to Perforce Source Control. */	TokenNameCOMMENT_JAVADOC	 Add a fileset whose files will be added to Perforce. * @param set the FileSet that one wants to add to Perforce Source Control. 
public	TokenNamepublic	
void	TokenNamevoid	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the task. * * @throws BuildException if the execution of the Perforce command fails. */	TokenNameCOMMENT_JAVADOC	 Run the task. * @throws BuildException if the execution of the Perforce command fails. 
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
P4View	TokenNameIdentifier	 P4 View
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addCmd	TokenNameIdentifier	 add Cmd
=	TokenNameEQUAL	
P4View	TokenNameIdentifier	 P4 View
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
changelist	TokenNameIdentifier	 changelist
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
"-c "	TokenNameStringLiteral	-c 
+	TokenNamePLUS	
changelist	TokenNameIdentifier	 changelist
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
filelist	TokenNameIdentifier	 filelist
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileSet	TokenNameIdentifier	 File Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcFiles	TokenNameIdentifier	 src Files
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcFiles	TokenNameIdentifier	 src Files
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
srcFiles	TokenNameIdentifier	 src Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
srcFiles	TokenNameIdentifier	 src Files
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filelist	TokenNameIdentifier	 filelist
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filelist	TokenNameIdentifier	 filelist
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
cmdLength	TokenNameIdentifier	 cmd Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execP4Add	TokenNameIdentifier	 exec P4 Add
(	TokenNameLPAREN	
filelist	TokenNameIdentifier	 filelist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filelist	TokenNameIdentifier	 filelist
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filelist	TokenNameIdentifier	 filelist
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execP4Add	TokenNameIdentifier	 exec P4 Add
(	TokenNameLPAREN	
filelist	TokenNameIdentifier	 filelist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"No files specified to add!"	TokenNameStringLiteral	No files specified to add!
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
execP4Add	TokenNameIdentifier	 exec P4 Add
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Execing add "	TokenNameStringLiteral	Execing add 
+	TokenNamePLUS	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
addCmd	TokenNameIdentifier	 add Cmd
+	TokenNamePLUS	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"-s add "	TokenNameStringLiteral	-s add 
+	TokenNamePLUS	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
addCmd	TokenNameIdentifier	 add Cmd
+	TokenNamePLUS	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
new	TokenNamenew	
SimpleP4OutputHandler	TokenNameIdentifier	 Simple P4 Output Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
