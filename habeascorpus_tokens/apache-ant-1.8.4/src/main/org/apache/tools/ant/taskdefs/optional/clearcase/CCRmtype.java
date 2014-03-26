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
/** * Task to perform rmtype command to ClearCase. * <p> * The following attributes are interpreted: * <table border="1"> * <tr> * <th>Attribute</th> * <th>Values</th> * <th>Required</th> * </tr> * <tr> * <td>typekind</td> * <td>The kind of type to create. Valid types are:<br> * attype attribute type<br> * brtype branch type<br> * eltype element type<br> * hltype hyperlink type<br> * lbtype label type<br> * trtype trigger type<br> * </td> * <td>Yes</td> * <tr> * <tr> * <td>typename</td> * <td>The name of the type to remove</td> * <td>Yes</td> * <tr> * <tr> * <td>vob</td> * <td>Name of the VOB</td> * <td>No</td> * <tr> * <tr> * <td>ignore</td> * <td>Used with trigger types only. Forces removal of trigger type * even if a pre-operation trigger would prevent its removal</td> * <td>No</td> * <tr> * <tr> * <td>rmall</td> * <td>Removes all instances of a type and the type object itself</td> * <td>No</td> * <tr> * <tr> * <td>comment</td> * <td>Specify a comment. Only one of comment or cfile may be used.</td> * <td>No</td> * <tr> * <tr> * <td>commentfile</td> * <td>Specify a file containing a comment. Only one of comment or cfile * may be used.</td> * <td>No</td> * <tr> * <tr> * <td>failonerr</td> * <td>Throw an exception if the command fails. Default is true</td> * <td>No</td> * <tr> * </table> * */	TokenNameCOMMENT_JAVADOC	 Task to perform rmtype command to ClearCase. <p> The following attributes are interpreted: <table border="1"> <tr> <th>Attribute</th> <th>Values</th> <th>Required</th> </tr> <tr> <td>typekind</td> <td>The kind of type to create. Valid types are:<br> attype attribute type<br> brtype branch type<br> eltype element type<br> hltype hyperlink type<br> lbtype label type<br> trtype trigger type<br> </td> <td>Yes</td> <tr> <tr> <td>typename</td> <td>The name of the type to remove</td> <td>Yes</td> <tr> <tr> <td>vob</td> <td>Name of the VOB</td> <td>No</td> <tr> <tr> <td>ignore</td> <td>Used with trigger types only. Forces removal of trigger type even if a pre-operation trigger would prevent its removal</td> <td>No</td> <tr> <tr> <td>rmall</td> <td>Removes all instances of a type and the type object itself</td> <td>No</td> <tr> <tr> <td>comment</td> <td>Specify a comment. Only one of comment or cfile may be used.</td> <td>No</td> <tr> <tr> <td>commentfile</td> <td>Specify a file containing a comment. Only one of comment or cfile may be used.</td> <td>No</td> <tr> <tr> <td>failonerr</td> <td>Throw an exception if the command fails. Default is true</td> <td>No</td> <tr> </table> 
public	TokenNamepublic	
class	TokenNameclass	
CCRmtype	TokenNameIdentifier	 CC Rmtype
extends	TokenNameextends	
ClearCase	TokenNameIdentifier	 Clear Case
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mTypeKind	TokenNameIdentifier	 m Type Kind
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
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
mRmall	TokenNameIdentifier	 m Rmall
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mIgnore	TokenNameIdentifier	 m Ignore
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
getTypeKind	TokenNameIdentifier	 get Type Kind
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
"Required attribute TypeKind not specified"	TokenNameStringLiteral	Required attribute TypeKind not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// cleartool rmtype [options...] type-selector... 	TokenNameCOMMENT_LINE	cleartool rmtype [options...] type-selector... 
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
COMMAND_RMTYPE	TokenNameIdentifier	 COMMAND  RMTYPE
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
getIgnore	TokenNameIdentifier	 get Ignore
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -ignore 	TokenNameCOMMENT_LINE	-ignore 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_IGNORE	TokenNameIdentifier	 FLAG  IGNORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getRmAll	TokenNameIdentifier	 get Rm All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// -rmall -force 	TokenNameCOMMENT_LINE	-rmall -force 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_RMALL	TokenNameIdentifier	 FLAG  RMALL
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
FLAG_FORCE	TokenNameIdentifier	 FLAG  FORCE
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
// type-kind:type-name 	TokenNameCOMMENT_LINE	type-kind:type-name 
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
/** * Set the ignore flag * * @param ignore the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 Set the ignore flag * @param ignore the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setIgnore	TokenNameIdentifier	 set Ignore
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mIgnore	TokenNameIdentifier	 m Ignore
=	TokenNameEQUAL	
ignore	TokenNameIdentifier	 ignore
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get ignore flag status * * @return boolean containing status of ignore flag */	TokenNameCOMMENT_JAVADOC	 Get ignore flag status * @return boolean containing status of ignore flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIgnore	TokenNameIdentifier	 get Ignore
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mIgnore	TokenNameIdentifier	 m Ignore
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set rmall flag * * @param rmall the status to set the flag to */	TokenNameCOMMENT_JAVADOC	 Set rmall flag * @param rmall the status to set the flag to 
public	TokenNamepublic	
void	TokenNamevoid	
setRmAll	TokenNameIdentifier	 set Rm All
(	TokenNameLPAREN	
boolean	TokenNameboolean	
rmall	TokenNameIdentifier	 rmall
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mRmall	TokenNameIdentifier	 m Rmall
=	TokenNameEQUAL	
rmall	TokenNameIdentifier	 rmall
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get rmall flag status * * @return boolean containing status of rmall flag */	TokenNameCOMMENT_JAVADOC	 Get rmall flag status * @return boolean containing status of rmall flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getRmAll	TokenNameIdentifier	 get Rm All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mRmall	TokenNameIdentifier	 m Rmall
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
/** * Set type-kind string * * @param tk the type-kind string */	TokenNameCOMMENT_JAVADOC	 Set type-kind string * @param tk the type-kind string 
public	TokenNamepublic	
void	TokenNamevoid	
setTypeKind	TokenNameIdentifier	 set Type Kind
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tk	TokenNameIdentifier	 tk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mTypeKind	TokenNameIdentifier	 m Type Kind
=	TokenNameEQUAL	
tk	TokenNameIdentifier	 tk
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get type-kind string * * @return String containing the type-kind */	TokenNameCOMMENT_JAVADOC	 Get type-kind string * @return String containing the type-kind 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeKind	TokenNameIdentifier	 get Type Kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mTypeKind	TokenNameIdentifier	 m Type Kind
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
/** * Get the 'type-specifier' string * * @return the 'type-kind:type-name@vob' specifier * */	TokenNameCOMMENT_JAVADOC	 Get the 'type-specifier' string * @return the 'type-kind:type-name@vob' specifier 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getTypeSpecifier	TokenNameIdentifier	 get Type Specifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tkind	TokenNameIdentifier	 tkind
=	TokenNameEQUAL	
getTypeKind	TokenNameIdentifier	 get Type Kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tname	TokenNameIdentifier	 tname
=	TokenNameEQUAL	
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
typeSpec	TokenNameIdentifier	 type Spec
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Return the type-selector 	TokenNameCOMMENT_LINE	Return the type-selector 
typeSpec	TokenNameIdentifier	 type Spec
=	TokenNameEQUAL	
tkind	TokenNameIdentifier	 tkind
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
tname	TokenNameIdentifier	 tname
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
typeSpec	TokenNameIdentifier	 type Spec
+=	TokenNamePLUS_EQUAL	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
getVOB	TokenNameIdentifier	 get VOB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
typeSpec	TokenNameIdentifier	 type Spec
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
/** * -ignore flag -- ignore pre-trigger operations when removing a trigger type */	TokenNameCOMMENT_JAVADOC	 -ignore flag -- ignore pre-trigger operations when removing a trigger type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_IGNORE	TokenNameIdentifier	 FLAG  IGNORE
=	TokenNameEQUAL	
"-ignore"	TokenNameStringLiteral	-ignore
;	TokenNameSEMICOLON	
/** * -rmall flag -- removes all instances of a type and the type object itself */	TokenNameCOMMENT_JAVADOC	 -rmall flag -- removes all instances of a type and the type object itself 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_RMALL	TokenNameIdentifier	 FLAG  RMALL
=	TokenNameEQUAL	
"-rmall"	TokenNameStringLiteral	-rmall
;	TokenNameSEMICOLON	
/** * -force flag -- suppresses confirmation prompts */	TokenNameCOMMENT_JAVADOC	 -force flag -- suppresses confirmation prompts 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_FORCE	TokenNameIdentifier	 FLAG  FORCE
=	TokenNameEQUAL	
"-force"	TokenNameStringLiteral	-force
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
