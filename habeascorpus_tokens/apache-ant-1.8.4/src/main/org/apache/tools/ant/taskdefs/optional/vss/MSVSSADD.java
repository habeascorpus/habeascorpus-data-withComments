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
/** * Performs Add commands to Microsoft Visual SourceSafe. * * @ant.task name="vssadd" category="scm" */	TokenNameCOMMENT_JAVADOC	 Performs Add commands to Microsoft Visual SourceSafe. * @ant.task name="vssadd" category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
MSVSSADD	TokenNameIdentifier	 MSVSSADD
extends	TokenNameextends	
MSVSS	TokenNameIdentifier	 MSVSS
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
localPath	TokenNameIdentifier	 local Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Builds a command line to execute ss. * @return The constructed commandline. */	TokenNameCOMMENT_JAVADOC	 Builds a command line to execute ss. @return The constructed commandline. 
protected	TokenNameprotected	
Commandline	TokenNameIdentifier	 Commandline
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
commandLine	TokenNameIdentifier	 command Line
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first off, make sure that we've got a command and a localPath ... 	TokenNameCOMMENT_LINE	first off, make sure that we've got a command and a localPath ... 
if	TokenNameif	
(	TokenNameLPAREN	
getLocalpath	TokenNameIdentifier	 get Localpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"localPath attribute must be set!"	TokenNameStringLiteral	localPath attribute must be set!
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
// build the command line from what we got the format is 	TokenNameCOMMENT_LINE	build the command line from what we got the format is 
// ss Add VSS items [-B] [-C] [-D-] [-H] [-I-] [-K] [-N] [-O] [-R] [-W] [-Y] [-?] 	TokenNameCOMMENT_LINE	ss Add VSS items [-B] [-C] [-D-] [-H] [-I-] [-K] [-N] [-O] [-R] [-W] [-Y] [-?] 
// as specified in the SS.EXE help 	TokenNameCOMMENT_LINE	as specified in the SS.EXE help 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
getSSCommand	TokenNameIdentifier	 get SS Command
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
COMMAND_ADD	TokenNameIdentifier	 COMMAND  ADD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// VSS items 	TokenNameCOMMENT_LINE	VSS items 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getLocalpath	TokenNameIdentifier	 get Localpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -I- or -I-Y or -I-N 	TokenNameCOMMENT_LINE	-I- or -I-Y or -I-N 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getAutoresponse	TokenNameIdentifier	 get Autoresponse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -R 	TokenNameCOMMENT_LINE	-R 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getRecursive	TokenNameIdentifier	 get Recursive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -W 	TokenNameCOMMENT_LINE	-W 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getWritable	TokenNameIdentifier	 get Writable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -Y 	TokenNameCOMMENT_LINE	-Y 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getLogin	TokenNameIdentifier	 get Login
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -C 	TokenNameCOMMENT_LINE	-C 
commandLine	TokenNameIdentifier	 command Line
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
return	TokenNamereturn	
commandLine	TokenNameIdentifier	 command Line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the local path without the flag.; required * @todo See why this returns the local path without the flag. * @return The local path value. */	TokenNameCOMMENT_JAVADOC	 Returns the local path without the flag.; required @todo See why this returns the local path without the flag. @return The local path value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLocalpath	TokenNameIdentifier	 get Localpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localPath	TokenNameIdentifier	 local Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add files recursively. Defaults to false. * * @param recursive The boolean value for recursive. */	TokenNameCOMMENT_JAVADOC	 Add files recursively. Defaults to false. * @param recursive The boolean value for recursive. 
public	TokenNamepublic	
void	TokenNamevoid	
setRecursive	TokenNameIdentifier	 set Recursive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
recursive	TokenNameIdentifier	 recursive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalRecursive	TokenNameIdentifier	 set Internal Recursive
(	TokenNameLPAREN	
recursive	TokenNameIdentifier	 recursive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Unset the READ-ONLY flag on local copies of files added to VSS. Defaults to false. * * @param writable The boolean value for writable. */	TokenNameCOMMENT_JAVADOC	 Unset the READ-ONLY flag on local copies of files added to VSS. Defaults to false. * @param writable The boolean value for writable. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setWritable	TokenNameIdentifier	 set Writable
(	TokenNameLPAREN	
boolean	TokenNameboolean	
writable	TokenNameIdentifier	 writable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalWritable	TokenNameIdentifier	 set Internal Writable
(	TokenNameLPAREN	
writable	TokenNameIdentifier	 writable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Autoresponce behaviour. Valid options are Y and N. * * @param response The auto response value. */	TokenNameCOMMENT_JAVADOC	 Autoresponce behaviour. Valid options are Y and N. * @param response The auto response value. 
public	TokenNamepublic	
void	TokenNamevoid	
setAutoresponse	TokenNameIdentifier	 set Autoresponse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
response	TokenNameIdentifier	 response
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalAutoResponse	TokenNameIdentifier	 set Internal Auto Response
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Comment to apply to files added to SourceSafe. * * @param comment The comment to apply in SourceSafe */	TokenNameCOMMENT_JAVADOC	 Comment to apply to files added to SourceSafe. * @param comment The comment to apply in SourceSafe 
public	TokenNamepublic	
void	TokenNamevoid	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalComment	TokenNameIdentifier	 set Internal Comment
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override the project working directory. * * @param localPath The path on disk. */	TokenNameCOMMENT_JAVADOC	 Override the project working directory. * @param localPath The path on disk. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalpath	TokenNameIdentifier	 set Localpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
localPath	TokenNameIdentifier	 local Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
localPath	TokenNameIdentifier	 local Path
=	TokenNameEQUAL	
localPath	TokenNameIdentifier	 local Path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
