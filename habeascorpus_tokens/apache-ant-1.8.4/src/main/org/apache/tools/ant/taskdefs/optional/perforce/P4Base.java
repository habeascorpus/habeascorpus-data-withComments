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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
oro	TokenNameIdentifier	 oro
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
perl	TokenNameIdentifier	 perl
.	TokenNameDOT	
Perl5Util	TokenNameIdentifier	 Perl5 Util
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
/** Base class for Perforce (P4) ANT tasks. See individual task for example usage. * * @see P4Sync * @see P4Have * @see P4Change * @see P4Edit * @see P4Submit * @see P4Label * @see org.apache.tools.ant.taskdefs.Execute */	TokenNameCOMMENT_JAVADOC	 Base class for Perforce (P4) ANT tasks. See individual task for example usage. * @see P4Sync @see P4Have @see P4Change @see P4Edit @see P4Submit @see P4Label @see org.apache.tools.ant.taskdefs.Execute 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
P4Base	TokenNameIdentifier	 P4 Base
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
// CheckStyle:MemberNameCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:MemberNameCheck OFF - bc 
/**Perl5 regexp in Java - cool eh? */	TokenNameCOMMENT_JAVADOC	Perl5 regexp in Java - cool eh? 
protected	TokenNameprotected	
Perl5Util	TokenNameIdentifier	 Perl5 Util
util	TokenNameIdentifier	 util
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The OS shell to use (cmd.exe or /bin/sh) */	TokenNameCOMMENT_JAVADOC	 The OS shell to use (cmd.exe or /bin/sh) 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
shell	TokenNameIdentifier	 shell
;	TokenNameSEMICOLON	
//P4 runtime directives 	TokenNameCOMMENT_LINE	P4 runtime directives 
/** Perforce Server Port (eg KM01:1666) */	TokenNameCOMMENT_JAVADOC	 Perforce Server Port (eg KM01:1666) 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
P4Port	TokenNameIdentifier	 P4 Port
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** Perforce Client (eg myclientspec) */	TokenNameCOMMENT_JAVADOC	 Perforce Client (eg myclientspec) 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
P4Client	TokenNameIdentifier	 P4 Client
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** Perforce User (eg fbloggs) */	TokenNameCOMMENT_JAVADOC	 Perforce User (eg fbloggs) 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
P4User	TokenNameIdentifier	 P4 User
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** Perforce view for commands. (eg //projects/foobar/main/source/... )*/	TokenNameCOMMENT_JAVADOC	 Perforce view for commands. (eg //projects/foobar/main/source/... )
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
P4View	TokenNameIdentifier	 P4 View
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// Perforce task directives 	TokenNameCOMMENT_LINE	Perforce task directives 
/** Keep going or fail on error - defaults to fail. */	TokenNameCOMMENT_JAVADOC	 Keep going or fail on error - defaults to fail. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
//P4 g-opts and cmd opts (rtfm) 	TokenNameCOMMENT_LINE	P4 g-opts and cmd opts (rtfm) 
/** Perforce 'global' opts. * Forms half of low level API */	TokenNameCOMMENT_JAVADOC	 Perforce 'global' opts. Forms half of low level API 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
P4Opts	TokenNameIdentifier	 P4 Opts
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** Perforce command opts. * Forms half of low level API */	TokenNameCOMMENT_JAVADOC	 Perforce command opts. Forms half of low level API 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** Set by the task or a handler to indicate that the task has failed. BuildExceptions * can also be thrown to indicate failure. */	TokenNameCOMMENT_JAVADOC	 Set by the task or a handler to indicate that the task has failed. BuildExceptions can also be thrown to indicate failure. 
private	TokenNameprivate	
boolean	TokenNameboolean	
inError	TokenNameIdentifier	 in Error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** If inError is set, then errorMessage needs to contain the reason why. */	TokenNameCOMMENT_JAVADOC	 If inError is set, then errorMessage needs to contain the reason why. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
errorMessage	TokenNameIdentifier	 error Message
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// CheckStyle:MemberNameCheck ON 	TokenNameCOMMENT_LINE	CheckStyle:MemberNameCheck ON 
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * gets whether or not the task has encountered an error * @return error flag * @since ant 1.6 */	TokenNameCOMMENT_JAVADOC	 gets whether or not the task has encountered an error @return error flag @since ant 1.6 
public	TokenNamepublic	
boolean	TokenNameboolean	
getInError	TokenNameIdentifier	 get In Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inError	TokenNameIdentifier	 in Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the error flag on the task * @param inError if true an error has been encountered by the handler * @since ant 1.6 */	TokenNameCOMMENT_JAVADOC	 sets the error flag on the task @param inError if true an error has been encountered by the handler @since ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setInError	TokenNameIdentifier	 set In Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
inError	TokenNameIdentifier	 in Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inError	TokenNameIdentifier	 in Error
=	TokenNameEQUAL	
inError	TokenNameIdentifier	 in Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gets the error message recorded by the Perforce handler * @return error message */	TokenNameCOMMENT_JAVADOC	 gets the error message recorded by the Perforce handler @return error message 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getErrorMessage	TokenNameIdentifier	 get Error Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
errorMessage	TokenNameIdentifier	 error Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the error message * @param errorMessage line of error output */	TokenNameCOMMENT_JAVADOC	 sets the error message @param errorMessage line of error output 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorMessage	TokenNameIdentifier	 set Error Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorMessage	TokenNameIdentifier	 error Message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorMessage	TokenNameIdentifier	 error Message
=	TokenNameEQUAL	
errorMessage	TokenNameIdentifier	 error Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Setters called by Ant 	TokenNameCOMMENT_LINE	Setters called by Ant 
/** * The p4d server and port to connect to; * optional, default "perforce:1666" * * @param p4Port the port one wants to set such as localhost:1666 */	TokenNameCOMMENT_JAVADOC	 The p4d server and port to connect to; optional, default "perforce:1666" * @param p4Port the port one wants to set such as localhost:1666 
public	TokenNamepublic	
void	TokenNamevoid	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p4Port	TokenNameIdentifier	 p4 Port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
P4Port	TokenNameIdentifier	 P4 Port
=	TokenNameEQUAL	
"-p"	TokenNameStringLiteral	-p
+	TokenNamePLUS	
p4Port	TokenNameIdentifier	 p4 Port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The p4 client spec to use; * optional, defaults to the current user * * @param p4Client the name of the Perforce client spec */	TokenNameCOMMENT_JAVADOC	 The p4 client spec to use; optional, defaults to the current user * @param p4Client the name of the Perforce client spec 
public	TokenNamepublic	
void	TokenNamevoid	
setClient	TokenNameIdentifier	 set Client
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p4Client	TokenNameIdentifier	 p4 Client
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
P4Client	TokenNameIdentifier	 P4 Client
=	TokenNameEQUAL	
"-c"	TokenNameStringLiteral	-c
+	TokenNamePLUS	
p4Client	TokenNameIdentifier	 p4 Client
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The p4 username; * optional, defaults to the current user * * @param p4User the user name */	TokenNameCOMMENT_JAVADOC	 The p4 username; optional, defaults to the current user * @param p4User the user name 
public	TokenNamepublic	
void	TokenNamevoid	
setUser	TokenNameIdentifier	 set User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p4User	TokenNameIdentifier	 p4 User
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
P4User	TokenNameIdentifier	 P4 User
=	TokenNameEQUAL	
"-u"	TokenNameStringLiteral	-u
+	TokenNamePLUS	
p4User	TokenNameIdentifier	 p4 User
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set global P4 options; Used on all * of the Perforce tasks. * * @param p4Opts global options, to use a specific P4Config file for instance */	TokenNameCOMMENT_JAVADOC	 Set global P4 options; Used on all of the Perforce tasks. * @param p4Opts global options, to use a specific P4Config file for instance 
public	TokenNamepublic	
void	TokenNamevoid	
setGlobalopts	TokenNameIdentifier	 set Globalopts
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p4Opts	TokenNameIdentifier	 p4 Opts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
P4Opts	TokenNameIdentifier	 P4 Opts
=	TokenNameEQUAL	
p4Opts	TokenNameIdentifier	 p4 Opts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The client, branch or label view to operate upon; * optional default "//...". * * the view is required for the following tasks : * <ul> * <li>p4delete</li> * <li>p4edit</li> * <li>p4reopen</li> * <li>p4resolve</li> * </ul> * * @param p4View the view one wants to use */	TokenNameCOMMENT_JAVADOC	 The client, branch or label view to operate upon; optional default "//...". * the view is required for the following tasks : <ul> <li>p4delete</li> <li>p4edit</li> <li>p4reopen</li> <li>p4resolve</li> </ul> * @param p4View the view one wants to use 
public	TokenNamepublic	
void	TokenNamevoid	
setView	TokenNameIdentifier	 set View
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p4View	TokenNameIdentifier	 p4 View
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
P4View	TokenNameIdentifier	 P4 View
=	TokenNameEQUAL	
p4View	TokenNameIdentifier	 p4 View
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set extra command options; only used on some * of the Perforce tasks. * * @param p4CmdOpts command line options going after the particular * Perforce command */	TokenNameCOMMENT_JAVADOC	 Set extra command options; only used on some of the Perforce tasks. * @param p4CmdOpts command line options going after the particular Perforce command 
public	TokenNamepublic	
void	TokenNamevoid	
setCmdopts	TokenNameIdentifier	 set Cmdopts
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p4CmdOpts	TokenNameIdentifier	 p4 Cmd Opts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
p4CmdOpts	TokenNameIdentifier	 p4 Cmd Opts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * whether to stop the build (true, default) * or keep going if an error is returned from the p4 command * @param fail indicates whether one wants to fail the build if an error comes from the * Perforce command */	TokenNameCOMMENT_JAVADOC	 whether to stop the build (true, default) or keep going if an error is returned from the p4 command @param fail indicates whether one wants to fail the build if an error comes from the Perforce command 
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
/** * sets attributes Port, Client, User from properties * if these properties are defined. * Called automatically by UnknownElement * @see org.apache.tools.ant.UnknownElement * <table> * <tr><th>Property</th><th>Attribute</th></tr> * <tr><td>p4.port</td><td>Port</td></tr> * <tr><td>p4.client</td><td>Client</td></tr> * <tr><td>p4.user</td><td>User</td></tr> * </table> */	TokenNameCOMMENT_JAVADOC	 sets attributes Port, Client, User from properties if these properties are defined. Called automatically by UnknownElement @see org.apache.tools.ant.UnknownElement <table> <tr><th>Property</th><th>Attribute</th></tr> <tr><td>p4.port</td><td>Port</td></tr> <tr><td>p4.client</td><td>Client</td></tr> <tr><td>p4.user</td><td>User</td></tr> </table> 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
util	TokenNameIdentifier	 util
=	TokenNameEQUAL	
new	TokenNamenew	
Perl5Util	TokenNameIdentifier	 Perl5 Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Get default P4 settings from environment - Mark would have done something cool with 	TokenNameCOMMENT_LINE	Get default P4 settings from environment - Mark would have done something cool with 
//introspection here.....:-) 	TokenNameCOMMENT_LINE	introspection here.....:-) 
String	TokenNameIdentifier	 String
tmpprop	TokenNameIdentifier	 tmpprop
;	TokenNameSEMICOLON	
// CheckStyle:InnerAssignment OFF 	TokenNameCOMMENT_LINE	CheckStyle:InnerAssignment OFF 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tmpprop	TokenNameIdentifier	 tmpprop
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"p4.port"	TokenNameStringLiteral	p4.port
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
tmpprop	TokenNameIdentifier	 tmpprop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tmpprop	TokenNameIdentifier	 tmpprop
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"p4.client"	TokenNameStringLiteral	p4.client
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setClient	TokenNameIdentifier	 set Client
(	TokenNameLPAREN	
tmpprop	TokenNameIdentifier	 tmpprop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tmpprop	TokenNameIdentifier	 tmpprop
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"p4.user"	TokenNameStringLiteral	p4.user
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUser	TokenNameIdentifier	 set User
(	TokenNameLPAREN	
tmpprop	TokenNameIdentifier	 tmpprop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:InnerAssignment ON 	TokenNameCOMMENT_LINE	CheckStyle:InnerAssignment ON 
}	TokenNameRBRACE	
/** * no usages found for this method * runs a Perforce command without a handler * @param command the command that one wants to execute * @throws BuildException if failonerror is set and the command fails */	TokenNameCOMMENT_JAVADOC	 no usages found for this method runs a Perforce command without a handler @param command the command that one wants to execute @throws BuildException if failonerror is set and the command fails 
protected	TokenNameprotected	
void	TokenNamevoid	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute P4 command assembled by subclasses. * * @param command The command to run * @param handler A P4Handler to process any input and output * * @throws BuildException if failonerror has been set to true */	TokenNameCOMMENT_JAVADOC	 Execute P4 command assembled by subclasses. * @param command The command to run @param handler A P4Handler to process any input and output * @throws BuildException if failonerror has been set to true 
protected	TokenNameprotected	
void	TokenNamevoid	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
P4Handler	TokenNameIdentifier	 P4 Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// reset error flags before executing the command 	TokenNameCOMMENT_LINE	reset error flags before executing the command 
inError	TokenNameIdentifier	 in Error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
errorMessage	TokenNameIdentifier	 error Message
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
Commandline	TokenNameIdentifier	 Commandline
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
"p4"	TokenNameStringLiteral	p4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Check API for these - it's how CVS does it... 	TokenNameCOMMENT_LINE	Check API for these - it's how CVS does it... 
if	TokenNameif	
(	TokenNameLPAREN	
P4Port	TokenNameIdentifier	 P4 Port
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
P4Port	TokenNameIdentifier	 P4 Port
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
P4Port	TokenNameIdentifier	 P4 Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
P4User	TokenNameIdentifier	 P4 User
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
P4User	TokenNameIdentifier	 P4 User
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
P4User	TokenNameIdentifier	 P4 User
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
P4Client	TokenNameIdentifier	 P4 Client
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
P4Client	TokenNameIdentifier	 P4 Client
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
P4Client	TokenNameIdentifier	 P4 Client
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
P4Opts	TokenNameIdentifier	 P4 Opts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
P4Opts	TokenNameIdentifier	 P4 Opts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
P4Opts	TokenNameIdentifier	 P4 Opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
commandline	TokenNameIdentifier	 commandline
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
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleP4OutputHandler	TokenNameIdentifier	 Simple P4 Output Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Execute	TokenNameIdentifier	 Execute
exe	TokenNameIdentifier	 exe
=	TokenNameEQUAL	
new	TokenNamenew	
Execute	TokenNameIdentifier	 Execute
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
null	TokenNamenull	
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
setCommandline	TokenNameIdentifier	 set Commandline
(	TokenNameLPAREN	
commandline	TokenNameIdentifier	 commandline
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inError	TokenNameIdentifier	 in Error
&&	TokenNameAND_AND	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
errorMessage	TokenNameIdentifier	 error Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Error stopping execution framework: "	TokenNameStringLiteral	Error stopping execution framework: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
failMsg	TokenNameIdentifier	 fail Msg
=	TokenNameEQUAL	
"Problem exec'ing P4 command: "	TokenNameStringLiteral	Problem exec'ing P4 command: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
failMsg	TokenNameIdentifier	 fail Msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
failMsg	TokenNameIdentifier	 fail Msg
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
