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
/** * Task to perform mklbtype command to ClearCase. * <p> * The following attributes are interpreted: * <table border="1"> * <tr> * <th>Attribute</th> * <th>Values</th> * <th>Required</th> * </tr> * <tr> * <td>typename</td> * <td>Name of the label type to create</td> * <td>Yes</td> * <tr> * <tr> * <td>vob</td> * <td>Name of the VOB</td> * <td>No</td> * <tr> * <tr> * <td>replace</td> * <td>Replace an existing label definition of the same type</td> * <td>No</td> * <tr> * <tr> * <td>global</td> * <td>Either global or ordinary can be specified, not both. * Creates a label type that is global to the VOB or to * VOBs that use this VOB</td> * <td>No</td> * <tr> * <tr> * <td>ordinary</td> * <td>Either global or ordinary can be specified, not both. * Creates a label type that can be used only in the current * VOB. <B>Default</B></td> * <td>No</td> * <tr> * <tr> * <td>pbranch</td> * <td>Allows the label type to be used once per branch in a given * element's version tree</td> * <td>No</td> * <tr> * <tr> * <td>shared</td> * <td>Sets the way mastership is checked by ClearCase. See ClearCase * documentation for details</td> * <td>No</td> * <tr> * <tr> * <td>comment</td> * <td>Specify a comment. Only one of comment or cfile may be used.</td> * <td>No</td> * <tr> * <tr> * <td>commentfile</td> * <td>Specify a file containing a comment. Only one of comment or * cfile may be used.</td> * <td>No</td> * <tr> * <tr> * <td>failonerr</td> * <td>Throw an exception if the command fails. Default is true</td> * <td>No</td> * <tr> * </table> * */	TokenNameCOMMENT_JAVADOC	 Task to perform mklbtype command to ClearCase. <p> The following attributes are interpreted: <table border="1"> <tr> <th>Attribute</th> <th>Values</th> <th>Required</th> </tr> <tr> <td>typename</td> <td>Name of the label type to create</td> <td>Yes</td> <tr> <tr> <td>vob</td> <td>Name of the VOB</td> <td>No</td> <tr> <tr> <td>replace</td> <td>Replace an existing label definition of the same type</td> <td>No</td> <tr> <tr> <td>global</td> <td>Either global or ordinary can be specified, not both. Creates a label type that is global to the VOB or to VOBs that use this VOB</td> <td>No</td> <tr> <tr> <td>ordinary</td> <td>Either global or ordinary can be specified, not both. Creates a label type that can be used only in the current VOB. <B>Default</B></td> <td>No</td> <tr> <tr> <td>pbranch</td> <td>Allows the label type to be used once per branch in a given element's version tree</td> <td>No</td> <tr> <tr> <td>shared</td> <td>Sets the way mastership is checked by ClearCase. See ClearCase documentation for details</td> <td>No</td> <tr> <tr> <td>comment</td> <td>Specify a comment. Only one of comment or cfile may be used.</td> <td>No</td> <tr> <tr> <td>commentfile</td> <td>Specify a file containing a comment. Only one of comment or cfile may be used.</td> <td>No</td> <tr> <tr> <td>failonerr</td> <td>Throw an exception if the command fails. Default is true</td> <td>No</td> <tr> </table> 
public	TokenNamepublic	
class	TokenNameclass	
CCMklbtype	TokenNameIdentifier	 CC Mklbtype
extends	TokenNameextends	
ClearCase	TokenNameIdentifier	 Clear Case
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mTypeName	TokenNameIdentifier	 m Type Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mVOB	TokenNameIdentifier	 m VOB
=	TokenNameEQUAL	
null	TokenNamenull	
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
mReplace	TokenNameIdentifier	 m Replace
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mGlobal	TokenNameIdentifier	 m Global
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mOrdinary	TokenNameIdentifier	 m Ordinary
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mPbranch	TokenNameIdentifier	 m Pbranch
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mShared	TokenNameIdentifier	 m Shared
=	TokenNameEQUAL	
false	TokenNamefalse	
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
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Check for required attributes 	TokenNameCOMMENT_LINE	Check for required attributes 
if	TokenNameif	
(	TokenNameLPAREN	
getTypeName	TokenNameIdentifier	 get Type Name
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
"Required attribute TypeName not specified"	TokenNameStringLiteral	Required attribute TypeName not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// build the command line from what we got. the format is 	TokenNameCOMMENT_LINE	build the command line from what we got. the format is 
// cleartool mklbtype [options...] type-selector... 	TokenNameCOMMENT_LINE	cleartool mklbtype [options...] type-selector... 
// as specified in the CLEARTOOL help 	TokenNameCOMMENT_LINE	as specified in the CLEARTOOL help 
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
COMMAND_MKLBTYPE	TokenNameIdentifier	 COMMAND  MKLBTYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOptions	TokenNameIdentifier	 check Options
(	TokenNameLPAREN	
commandLine	TokenNameIdentifier	 command Line
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
getTypeSpecifier	TokenNameIdentifier	 get Type Specifier
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
getOrdinary	TokenNameIdentifier	 get Ordinary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -ordinary 	TokenNameCOMMENT_LINE	-ordinary 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_ORDINARY	TokenNameIdentifier	 FLAG  ORDINARY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getGlobal	TokenNameIdentifier	 get Global
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -global 	TokenNameCOMMENT_LINE	-global 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_GLOBAL	TokenNameIdentifier	 FLAG  GLOBAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPbranch	TokenNameIdentifier	 get Pbranch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -pbranch 	TokenNameCOMMENT_LINE	-pbranch 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_PBRANCH	TokenNameIdentifier	 FLAG  PBRANCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getShared	TokenNameIdentifier	 get Shared
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -shared 	TokenNameCOMMENT_LINE	-shared 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_SHARED	TokenNameIdentifier	 FLAG  SHARED
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
// type-name@vob 	TokenNameCOMMENT_LINE	type-name@vob 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getTypeSpecifier	TokenNameIdentifier	 get Type Specifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set type-name string * * @param tn the type-name string */	TokenNameCOMMENT_JAVADOC	 Set type-name string * @param tn the type-name string 
public	TokenNamepublic	
void	TokenNamevoid	
setTypeName	TokenNameIdentifier	 set Type Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tn	TokenNameIdentifier	 tn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mTypeName	TokenNameIdentifier	 m Type Name
=	TokenNameEQUAL	
tn	TokenNameIdentifier	 tn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get type-name string * * @return String containing the type-name */	TokenNameCOMMENT_JAVADOC	 Get type-name string * @return String containing the type-name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mTypeName	TokenNameIdentifier	 m Type Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the VOB name * * @param vob the VOB name */	TokenNameCOMMENT_JAVADOC	 Set the VOB name * @param vob the VOB name 
public	TokenNamepublic	
void	TokenNamevoid	
setVOB	TokenNameIdentifier	 set VOB
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
vob	TokenNameIdentifier	 vob
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mVOB	TokenNameIdentifier	 m VOB
=	TokenNameEQUAL	
vob	TokenNameIdentifier	 vob
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get VOB name * * @return String containing VOB name */	TokenNameCOMMENT_JAVADOC	 Get VOB name * @return String containing VOB name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVOB	TokenNameIdentifier	 get VOB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mVOB	TokenNameIdentifier	 m VOB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the replace flag * * @param repl the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 Set the replace flag * @param repl the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setReplace	TokenNameIdentifier	 set Replace
(	TokenNameLPAREN	
boolean	TokenNameboolean	
repl	TokenNameIdentifier	 repl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mReplace	TokenNameIdentifier	 m Replace
=	TokenNameEQUAL	
repl	TokenNameIdentifier	 repl
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
/** * Set the global flag * * @param glob the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 Set the global flag * @param glob the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setGlobal	TokenNameIdentifier	 set Global
(	TokenNameLPAREN	
boolean	TokenNameboolean	
glob	TokenNameIdentifier	 glob
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mGlobal	TokenNameIdentifier	 m Global
=	TokenNameEQUAL	
glob	TokenNameIdentifier	 glob
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get global flag status * * @return boolean containing status of global flag */	TokenNameCOMMENT_JAVADOC	 Get global flag status * @return boolean containing status of global flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getGlobal	TokenNameIdentifier	 get Global
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mGlobal	TokenNameIdentifier	 m Global
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the ordinary flag * * @param ordinary the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 Set the ordinary flag * @param ordinary the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setOrdinary	TokenNameIdentifier	 set Ordinary
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ordinary	TokenNameIdentifier	 ordinary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mOrdinary	TokenNameIdentifier	 m Ordinary
=	TokenNameEQUAL	
ordinary	TokenNameIdentifier	 ordinary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get ordinary flag status * * @return boolean containing status of ordinary flag */	TokenNameCOMMENT_JAVADOC	 Get ordinary flag status * @return boolean containing status of ordinary flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOrdinary	TokenNameIdentifier	 get Ordinary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mOrdinary	TokenNameIdentifier	 m Ordinary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the pbranch flag * * @param pbranch the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 Set the pbranch flag * @param pbranch the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setPbranch	TokenNameIdentifier	 set Pbranch
(	TokenNameLPAREN	
boolean	TokenNameboolean	
pbranch	TokenNameIdentifier	 pbranch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mPbranch	TokenNameIdentifier	 m Pbranch
=	TokenNameEQUAL	
pbranch	TokenNameIdentifier	 pbranch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get pbranch flag status * * @return boolean containing status of pbranch flag */	TokenNameCOMMENT_JAVADOC	 Get pbranch flag status * @return boolean containing status of pbranch flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getPbranch	TokenNameIdentifier	 get Pbranch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mPbranch	TokenNameIdentifier	 m Pbranch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the shared flag * * @param shared the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 Set the shared flag * @param shared the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setShared	TokenNameIdentifier	 set Shared
(	TokenNameLPAREN	
boolean	TokenNameboolean	
shared	TokenNameIdentifier	 shared
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mShared	TokenNameIdentifier	 m Shared
=	TokenNameEQUAL	
shared	TokenNameIdentifier	 shared
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get shared flag status * * @return boolean containing status of shared flag */	TokenNameCOMMENT_JAVADOC	 Get shared flag status * @return boolean containing status of shared flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getShared	TokenNameIdentifier	 get Shared
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mShared	TokenNameIdentifier	 m Shared
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set comment string * * @param comment the comment string */	TokenNameCOMMENT_JAVADOC	 Set comment string * @param comment the comment string 
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
/** * Set comment file * * @param cfile the path to the comment file */	TokenNameCOMMENT_JAVADOC	 Set comment file * @param cfile the path to the comment file 
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
/** * Get the 'commentfile' command * * @param cmd containing the command line string with or * without the commentfile flag and file appended */	TokenNameCOMMENT_JAVADOC	 Get the 'commentfile' command * @param cmd containing the command line string with or without the commentfile flag and file appended 
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
/** * Get the type-name specifier * * @return the 'type-name-specifier' command if the attribute was * specified, otherwise an empty string */	TokenNameCOMMENT_JAVADOC	 Get the type-name specifier * @return the 'type-name-specifier' command if the attribute was specified, otherwise an empty string 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getTypeSpecifier	TokenNameIdentifier	 get Type Specifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
typenm	TokenNameIdentifier	 typenm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
typenm	TokenNameIdentifier	 typenm
=	TokenNameEQUAL	
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getVOB	TokenNameIdentifier	 get VOB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
typenm	TokenNameIdentifier	 typenm
+=	TokenNamePLUS_EQUAL	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
getVOB	TokenNameIdentifier	 get VOB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
typenm	TokenNameIdentifier	 typenm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * -replace flag -- replace existing label definition of the same type */	TokenNameCOMMENT_JAVADOC	 -replace flag -- replace existing label definition of the same type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_REPLACE	TokenNameIdentifier	 FLAG  REPLACE
=	TokenNameEQUAL	
"-replace"	TokenNameStringLiteral	-replace
;	TokenNameSEMICOLON	
/** * -global flag -- creates a label type that is global to the VOB or to VOBs that use this VOB */	TokenNameCOMMENT_JAVADOC	 -global flag -- creates a label type that is global to the VOB or to VOBs that use this VOB 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_GLOBAL	TokenNameIdentifier	 FLAG  GLOBAL
=	TokenNameEQUAL	
"-global"	TokenNameStringLiteral	-global
;	TokenNameSEMICOLON	
/** * -ordinary flag -- creates a label type that can be used only in the current VOB */	TokenNameCOMMENT_JAVADOC	 -ordinary flag -- creates a label type that can be used only in the current VOB 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_ORDINARY	TokenNameIdentifier	 FLAG  ORDINARY
=	TokenNameEQUAL	
"-ordinary"	TokenNameStringLiteral	-ordinary
;	TokenNameSEMICOLON	
/** * -pbranch flag -- allows label type to be used once per branch */	TokenNameCOMMENT_JAVADOC	 -pbranch flag -- allows label type to be used once per branch 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_PBRANCH	TokenNameIdentifier	 FLAG  PBRANCH
=	TokenNameEQUAL	
"-pbranch"	TokenNameStringLiteral	-pbranch
;	TokenNameSEMICOLON	
/** * -shared flag -- sets the way mastership is checked by ClearCase */	TokenNameCOMMENT_JAVADOC	 -shared flag -- sets the way mastership is checked by ClearCase 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_SHARED	TokenNameIdentifier	 FLAG  SHARED
=	TokenNameEQUAL	
"-shared"	TokenNameStringLiteral	-shared
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
