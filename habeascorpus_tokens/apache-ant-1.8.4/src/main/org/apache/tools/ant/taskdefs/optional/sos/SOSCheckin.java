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
/** * Commits and unlocks files in Visual SourceSafe via a SourceOffSite server. * * @ant.task name="soscheckin" category="scm" */	TokenNameCOMMENT_JAVADOC	 Commits and unlocks files in Visual SourceSafe via a SourceOffSite server. * @ant.task name="soscheckin" category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
SOSCheckin	TokenNameIdentifier	 SOS Checkin
extends	TokenNameextends	
SOS	TokenNameIdentifier	 SOS
{	TokenNameLBRACE	
/** * The filename to act upon. * If no file is specified then the task * acts upon the project. * * @param filename The new file value */	TokenNameCOMMENT_JAVADOC	 The filename to act upon. If no file is specified then the task acts upon the project. * @param filename The new file value 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalFilename	TokenNameIdentifier	 set Internal Filename
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flag to recursively apply the action. Defaults to false. * * @param recursive True for recursive operation. */	TokenNameCOMMENT_JAVADOC	 Flag to recursively apply the action. Defaults to false. * @param recursive True for recursive operation. 
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
/** * The comment to apply to all files being labelled. * * @param comment The new comment value */	TokenNameCOMMENT_JAVADOC	 The comment to apply to all files being labelled. * @param comment The new comment value 
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
/** * Build the command line. <p> * * CheckInFile required parameters: -server -name -password -database -project * -file<br> * CheckInFile optional parameters: -workdir -log -verbose -nocache -nocompression * -soshome<br> * CheckInProject required parameters: -server -name -password -database * -project<br> * CheckInProject optional parameters: workdir -recursive -log -verbose * -nocache -nocompression -soshome<br> * * @return Commandline the generated command to be executed */	TokenNameCOMMENT_JAVADOC	 Build the command line. <p> * CheckInFile required parameters: -server -name -password -database -project -file<br> CheckInFile optional parameters: -workdir -log -verbose -nocache -nocompression -soshome<br> CheckInProject required parameters: -server -name -password -database -project<br> CheckInProject optional parameters: workdir -recursive -log -verbose -nocache -nocompression -soshome<br> * @return Commandline the generated command to be executed 
protected	TokenNameprotected	
Commandline	TokenNameIdentifier	 Commandline
buildCmdLine	TokenNameIdentifier	 build Cmd Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commandLine	TokenNameIdentifier	 command Line
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we find a "file" attribute then act on a file otherwise act on a project 	TokenNameCOMMENT_LINE	If we find a "file" attribute then act on a file otherwise act on a project 
if	TokenNameif	
(	TokenNameLPAREN	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add -command CheckInFile to the commandline 	TokenNameCOMMENT_LINE	add -command CheckInFile to the commandline 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
SOSCmd	TokenNameIdentifier	 SOS Cmd
.	TokenNameDOT	
FLAG_COMMAND	TokenNameIdentifier	 FLAG  COMMAND
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
SOSCmd	TokenNameIdentifier	 SOS Cmd
.	TokenNameDOT	
COMMAND_CHECKIN_FILE	TokenNameIdentifier	 COMMAND  CHECKIN  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add -file xxxxx to the commandline 	TokenNameCOMMENT_LINE	add -file xxxxx to the commandline 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
SOSCmd	TokenNameIdentifier	 SOS Cmd
.	TokenNameDOT	
FLAG_FILE	TokenNameIdentifier	 FLAG  FILE
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
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// add -command CheckInProject to the commandline 	TokenNameCOMMENT_LINE	add -command CheckInProject to the commandline 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
SOSCmd	TokenNameIdentifier	 SOS Cmd
.	TokenNameDOT	
FLAG_COMMAND	TokenNameIdentifier	 FLAG  COMMAND
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
SOSCmd	TokenNameIdentifier	 SOS Cmd
.	TokenNameDOT	
COMMAND_CHECKIN_PROJECT	TokenNameIdentifier	 COMMAND  CHECKIN  PROJECT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// look for a recursive option 	TokenNameCOMMENT_LINE	look for a recursive option 
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
}	TokenNameRBRACE	
getRequiredAttributes	TokenNameIdentifier	 get Required Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getOptionalAttributes	TokenNameIdentifier	 get Optional Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Look for a comment 	TokenNameCOMMENT_LINE	Look for a comment 
if	TokenNameif	
(	TokenNameLPAREN	
getComment	TokenNameIdentifier	 get Comment
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
SOSCmd	TokenNameIdentifier	 SOS Cmd
.	TokenNameDOT	
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
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
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
commandLine	TokenNameIdentifier	 command Line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
