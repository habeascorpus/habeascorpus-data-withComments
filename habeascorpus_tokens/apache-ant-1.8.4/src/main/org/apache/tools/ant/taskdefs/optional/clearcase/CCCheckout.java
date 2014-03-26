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
/** * Performs ClearCase checkout. * * <p> * The following attributes are interpreted: * <table border="1"> * <tr> * <th>Attribute</th> * <th>Values</th> * <th>Required</th> * </tr> * <tr> * <td>viewpath</td> * <td>Path to the ClearCase view file or directory that the command will operate on</td> * <td>No</td> * <tr> * <tr> * <td>reserved</td> * <td>Specifies whether to check out the file as reserved or not</td> * <td>Yes</td> * <tr> * <tr> * <td>out</td> * <td>Creates a writable file under a different filename</td> * <td>No</td> * <tr> * <tr> * <td>nodata</td> * <td>Checks out the file but does not create an editable file containing its data</td> * <td>No</td> * <tr> * <tr> * <td>branch</td> * <td>Specify a branch to check out the file to</td> * <td>No</td> * <tr> * <tr> * <td>version</td> * <td>Allows checkout of a version other than main latest</td> * <td>No</td> * <tr> * <tr> * <td>nowarn</td> * <td>Suppress warning messages</td> * <td>No</td> * <tr> * <tr> * <td>comment</td> * <td>Specify a comment. Only one of comment or cfile may be used.</td> * <td>No</td> * <tr> * <tr> * <td>commentfile</td> * <td>Specify a file containing a comment. Only one of comment or cfile may be used.</td> * <td>No</td> * <tr> * <tr> * <td>notco</td> * <td>Fail if it's already checked out to the current view. Set to false to ignore it.</td> * <td>No</td> * <tr> * <tr> * <td>failonerr</td> * <td>Throw an exception if the command fails. Default is true</td> * <td>No</td> * <tr> * </table> * */	TokenNameCOMMENT_JAVADOC	 Performs ClearCase checkout. * <p> The following attributes are interpreted: <table border="1"> <tr> <th>Attribute</th> <th>Values</th> <th>Required</th> </tr> <tr> <td>viewpath</td> <td>Path to the ClearCase view file or directory that the command will operate on</td> <td>No</td> <tr> <tr> <td>reserved</td> <td>Specifies whether to check out the file as reserved or not</td> <td>Yes</td> <tr> <tr> <td>out</td> <td>Creates a writable file under a different filename</td> <td>No</td> <tr> <tr> <td>nodata</td> <td>Checks out the file but does not create an editable file containing its data</td> <td>No</td> <tr> <tr> <td>branch</td> <td>Specify a branch to check out the file to</td> <td>No</td> <tr> <tr> <td>version</td> <td>Allows checkout of a version other than main latest</td> <td>No</td> <tr> <tr> <td>nowarn</td> <td>Suppress warning messages</td> <td>No</td> <tr> <tr> <td>comment</td> <td>Specify a comment. Only one of comment or cfile may be used.</td> <td>No</td> <tr> <tr> <td>commentfile</td> <td>Specify a file containing a comment. Only one of comment or cfile may be used.</td> <td>No</td> <tr> <tr> <td>notco</td> <td>Fail if it's already checked out to the current view. Set to false to ignore it.</td> <td>No</td> <tr> <tr> <td>failonerr</td> <td>Throw an exception if the command fails. Default is true</td> <td>No</td> <tr> </table> 
public	TokenNamepublic	
class	TokenNameclass	
CCCheckout	TokenNameIdentifier	 CC Checkout
extends	TokenNameextends	
ClearCase	TokenNameIdentifier	 Clear Case
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
mReserved	TokenNameIdentifier	 m Reserved
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mOut	TokenNameIdentifier	 m Out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mNdata	TokenNameIdentifier	 m Ndata
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mBranch	TokenNameIdentifier	 m Branch
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mVersion	TokenNameIdentifier	 m Version
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mNwarn	TokenNameIdentifier	 m Nwarn
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
mCfile	TokenNameIdentifier	 m Cfile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mNotco	TokenNameIdentifier	 m Notco
=	TokenNameEQUAL	
true	TokenNametrue	
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
// cleartool checkout [options...] [viewpath ...] 	TokenNameCOMMENT_LINE	cleartool checkout [options...] [viewpath ...] 
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
COMMAND_CHECKOUT	TokenNameIdentifier	 COMMAND  CHECKOUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOptions	TokenNameIdentifier	 check Options
(	TokenNameLPAREN	
commandLine	TokenNameIdentifier	 command Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * If configured to not care about whether the element is * already checked out to the current view. * Then check to see if it is checked out. */	TokenNameCOMMENT_BLOCK	 If configured to not care about whether the element is already checked out to the current view. Then check to see if it is checked out. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getNotco	TokenNameIdentifier	 get Notco
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
lsCheckout	TokenNameIdentifier	 ls Checkout
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
"Already checked out in this view: "	TokenNameStringLiteral	Already checked out in this view: 
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
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Check to see if the element is checked out in the current view. */	TokenNameCOMMENT_JAVADOC	 Check to see if the element is checked out in the current view. 
private	TokenNameprivate	
boolean	TokenNameboolean	
lsCheckout	TokenNameIdentifier	 ls Checkout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
cmdl	TokenNameIdentifier	 cmdl
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// build the command line from what we got the format is 	TokenNameCOMMENT_LINE	build the command line from what we got the format is 
// cleartool lsco [options...] [viewpath ...] 	TokenNameCOMMENT_LINE	cleartool lsco [options...] [viewpath ...] 
// as specified in the CLEARTOOL.EXE help 	TokenNameCOMMENT_LINE	as specified in the CLEARTOOL.EXE help 
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
getClearToolCommand	TokenNameIdentifier	 get Clear Tool Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
COMMAND_LSCO	TokenNameIdentifier	 COMMAND  LSCO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-cview"	TokenNameStringLiteral	-cview
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-short"	TokenNameStringLiteral	-short
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-d"	TokenNameStringLiteral	-d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// viewpath 	TokenNameCOMMENT_LINE	viewpath 
cmdl	TokenNameIdentifier	 cmdl
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
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
runS	TokenNameIdentifier	 run S
(	TokenNameLPAREN	
cmdl	TokenNameIdentifier	 cmdl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println( "lsCheckout: " + result ); 	TokenNameCOMMENT_LINE	System.out.println( "lsCheckout: " + result ); 
return	TokenNamereturn	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
getReserved	TokenNameIdentifier	 get Reserved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -reserved 	TokenNameCOMMENT_LINE	-reserved 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_RESERVED	TokenNameIdentifier	 FLAG  RESERVED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// -unreserved 	TokenNameCOMMENT_LINE	-unreserved 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_UNRESERVED	TokenNameIdentifier	 FLAG  UNRESERVED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getOut	TokenNameIdentifier	 get Out
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -out 	TokenNameCOMMENT_LINE	-out 
getOutCommand	TokenNameIdentifier	 get Out Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNoData	TokenNameIdentifier	 get No Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -ndata 	TokenNameCOMMENT_LINE	-ndata 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_NODATA	TokenNameIdentifier	 FLAG  NODATA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getBranch	TokenNameIdentifier	 get Branch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -branch 	TokenNameCOMMENT_LINE	-branch 
getBranchCommand	TokenNameIdentifier	 get Branch Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -version 	TokenNameCOMMENT_LINE	-version 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
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
// Print out info about the notco option 	TokenNameCOMMENT_LINE	Print out info about the notco option 
// System.out.println( "Notco: " + (getNotco() ? "yes" : "no") ); 	TokenNameCOMMENT_LINE	System.out.println( "Notco: " + (getNotco() ? "yes" : "no") ); 
}	TokenNameRBRACE	
/** * If true, checks out the file as reserved. * * @param reserved the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, checks out the file as reserved. * @param reserved the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setReserved	TokenNameIdentifier	 set Reserved
(	TokenNameLPAREN	
boolean	TokenNameboolean	
reserved	TokenNameIdentifier	 reserved
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mReserved	TokenNameIdentifier	 m Reserved
=	TokenNameEQUAL	
reserved	TokenNameIdentifier	 reserved
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get reserved flag status * * @return boolean containing status of reserved flag */	TokenNameCOMMENT_JAVADOC	 Get reserved flag status * @return boolean containing status of reserved flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getReserved	TokenNameIdentifier	 get Reserved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mReserved	TokenNameIdentifier	 m Reserved
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, checkout fails if the element is already checked out to the current view. * * @param notco the status to set the flag to * @since ant 1.6.1 */	TokenNameCOMMENT_JAVADOC	 If true, checkout fails if the element is already checked out to the current view. * @param notco the status to set the flag to @since ant 1.6.1 
public	TokenNamepublic	
void	TokenNamevoid	
setNotco	TokenNameIdentifier	 set Notco
(	TokenNameLPAREN	
boolean	TokenNameboolean	
notco	TokenNameIdentifier	 notco
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mNotco	TokenNameIdentifier	 m Notco
=	TokenNameEQUAL	
notco	TokenNameIdentifier	 notco
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get notco flag status * * @return boolean containing status of notco flag * @since ant 1.6.1 */	TokenNameCOMMENT_JAVADOC	 Get notco flag status * @return boolean containing status of notco flag @since ant 1.6.1 
public	TokenNamepublic	
boolean	TokenNameboolean	
getNotco	TokenNameIdentifier	 get Notco
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mNotco	TokenNameIdentifier	 m Notco
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a writable file under a different filename. * * @param outf the path to the out file */	TokenNameCOMMENT_JAVADOC	 Creates a writable file under a different filename. * @param outf the path to the out file 
public	TokenNamepublic	
void	TokenNamevoid	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
outf	TokenNameIdentifier	 outf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mOut	TokenNameIdentifier	 m Out
=	TokenNameEQUAL	
outf	TokenNameIdentifier	 outf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get out file * * @return String containing the path to the out file */	TokenNameCOMMENT_JAVADOC	 Get out file * @return String containing the path to the out file 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOut	TokenNameIdentifier	 get Out
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mOut	TokenNameIdentifier	 m Out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, checks out the file but does not create an * editable file containing its data. * * @param ndata the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, checks out the file but does not create an editable file containing its data. * @param ndata the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setNoData	TokenNameIdentifier	 set No Data
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ndata	TokenNameIdentifier	 ndata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mNdata	TokenNameIdentifier	 m Ndata
=	TokenNameEQUAL	
ndata	TokenNameIdentifier	 ndata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get nodata flag status * * @return boolean containing status of ndata flag */	TokenNameCOMMENT_JAVADOC	 Get nodata flag status * @return boolean containing status of ndata flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getNoData	TokenNameIdentifier	 get No Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mNdata	TokenNameIdentifier	 m Ndata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify a branch to check out the file to. * * @param branch the name of the branch */	TokenNameCOMMENT_JAVADOC	 Specify a branch to check out the file to. * @param branch the name of the branch 
public	TokenNamepublic	
void	TokenNamevoid	
setBranch	TokenNameIdentifier	 set Branch
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
branch	TokenNameIdentifier	 branch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mBranch	TokenNameIdentifier	 m Branch
=	TokenNameEQUAL	
branch	TokenNameIdentifier	 branch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get branch name * * @return String containing the name of the branch */	TokenNameCOMMENT_JAVADOC	 Get branch name * @return String containing the name of the branch 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBranch	TokenNameIdentifier	 get Branch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mBranch	TokenNameIdentifier	 m Branch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, allows checkout of a version other than main latest. * * @param version the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, allows checkout of a version other than main latest. * @param version the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
boolean	TokenNameboolean	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mVersion	TokenNameIdentifier	 m Version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get version flag status * * @return boolean containing status of version flag */	TokenNameCOMMENT_JAVADOC	 Get version flag status * @return boolean containing status of version flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mVersion	TokenNameIdentifier	 m Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, warning messages are suppressed. * * @param nwarn the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 If true, warning messages are suppressed. * @param nwarn the status to set the flag to 
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
/** * Get the 'out' command * * @param cmd containing the command line string with or * without the out flag and path appended */	TokenNameCOMMENT_JAVADOC	 Get the 'out' command * @param cmd containing the command line string with or without the out flag and path appended 
private	TokenNameprivate	
void	TokenNamevoid	
getOutCommand	TokenNameIdentifier	 get Out Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getOut	TokenNameIdentifier	 get Out
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
FLAG_OUT	TokenNameIdentifier	 FLAG  OUT
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
getOut	TokenNameIdentifier	 get Out
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the 'branch' command * * @param cmd containing the command line string with or without the branch flag and name appended */	TokenNameCOMMENT_JAVADOC	 Get the 'branch' command * @param cmd containing the command line string with or without the branch flag and name appended 
private	TokenNameprivate	
void	TokenNamevoid	
getBranchCommand	TokenNameIdentifier	 get Branch Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getBranch	TokenNameIdentifier	 get Branch
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
FLAG_BRANCH	TokenNameIdentifier	 FLAG  BRANCH
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
getBranch	TokenNameIdentifier	 get Branch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Get the 'cfile' command * * @param cmd containing the command line string with or * without the cfile flag and file appended */	TokenNameCOMMENT_JAVADOC	 Get the 'cfile' command * @param cmd containing the command line string with or without the cfile flag and file appended 
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
/** * -reserved flag -- check out the file as reserved */	TokenNameCOMMENT_JAVADOC	 -reserved flag -- check out the file as reserved 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_RESERVED	TokenNameIdentifier	 FLAG  RESERVED
=	TokenNameEQUAL	
"-reserved"	TokenNameStringLiteral	-reserved
;	TokenNameSEMICOLON	
/** * -reserved flag -- check out the file as unreserved */	TokenNameCOMMENT_JAVADOC	 -reserved flag -- check out the file as unreserved 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_UNRESERVED	TokenNameIdentifier	 FLAG  UNRESERVED
=	TokenNameEQUAL	
"-unreserved"	TokenNameStringLiteral	-unreserved
;	TokenNameSEMICOLON	
/** * -out flag -- create a writable file under a different filename */	TokenNameCOMMENT_JAVADOC	 -out flag -- create a writable file under a different filename 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_OUT	TokenNameIdentifier	 FLAG  OUT
=	TokenNameEQUAL	
"-out"	TokenNameStringLiteral	-out
;	TokenNameSEMICOLON	
/** * -ndata flag -- checks out the file but does not create an editable file containing its data */	TokenNameCOMMENT_JAVADOC	 -ndata flag -- checks out the file but does not create an editable file containing its data 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_NODATA	TokenNameIdentifier	 FLAG  NODATA
=	TokenNameEQUAL	
"-ndata"	TokenNameStringLiteral	-ndata
;	TokenNameSEMICOLON	
/** * -branch flag -- checks out the file on a specified branch */	TokenNameCOMMENT_JAVADOC	 -branch flag -- checks out the file on a specified branch 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_BRANCH	TokenNameIdentifier	 FLAG  BRANCH
=	TokenNameEQUAL	
"-branch"	TokenNameStringLiteral	-branch
;	TokenNameSEMICOLON	
/** * -version flag -- allows checkout of a version that is not main latest */	TokenNameCOMMENT_JAVADOC	 -version flag -- allows checkout of a version that is not main latest 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
=	TokenNameEQUAL	
"-version"	TokenNameStringLiteral	-version
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
}	TokenNameRBRACE	
