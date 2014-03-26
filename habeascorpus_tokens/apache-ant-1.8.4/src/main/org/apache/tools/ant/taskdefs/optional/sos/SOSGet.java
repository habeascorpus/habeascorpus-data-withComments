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
/** * Retrieves a read-only copy of the specified project or file * from Visual SourceSafe via a SourceOffSite server. * * @ant.task name="sosget" category="scm" */	TokenNameCOMMENT_JAVADOC	 Retrieves a read-only copy of the specified project or file from Visual SourceSafe via a SourceOffSite server. * @ant.task name="sosget" category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
SOSGet	TokenNameIdentifier	 SOS Get
extends	TokenNameextends	
SOS	TokenNameIdentifier	 SOS
{	TokenNameLBRACE	
/** * The Filename to act upon. * If no file is specified then the tasks * act upon the project. * * @param filename The new file value */	TokenNameCOMMENT_JAVADOC	 The Filename to act upon. If no file is specified then the tasks act upon the project. * @param filename The new file value 
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
/** * Flag to recursively apply the action. Defaults to false * * @param recursive True for recursive operation. */	TokenNameCOMMENT_JAVADOC	 Flag to recursively apply the action. Defaults to false * @param recursive True for recursive operation. 
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
/** * Set the version number to get - * only works with SOSGet on a file. * * @param version The new version value */	TokenNameCOMMENT_JAVADOC	 Set the version number to get - only works with SOSGet on a file. * @param version The new version value 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalVersion	TokenNameIdentifier	 set Internal Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The labeled version to operate on in SourceSafe. * * @param label The new label value */	TokenNameCOMMENT_JAVADOC	 The labeled version to operate on in SourceSafe. * @param label The new label value 
public	TokenNamepublic	
void	TokenNamevoid	
setLabel	TokenNameIdentifier	 set Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalLabel	TokenNameIdentifier	 set Internal Label
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Build the command line <br> * * GetFile required parameters: -server -name -password -database -project -file<br> * GetFile optional parameters: -workdir -revision -verbose -nocache -nocompression -soshome<br> * * GetProject required parameters: -server -name -password -database -project<br> * GetProject optional parameters: -label -workdir -recursive -verbose -nocache * -nocompression -soshome<br> * * @return Commandline the generated command to be executed */	TokenNameCOMMENT_JAVADOC	 Build the command line <br> * GetFile required parameters: -server -name -password -database -project -file<br> GetFile optional parameters: -workdir -revision -verbose -nocache -nocompression -soshome<br> * GetProject required parameters: -server -name -password -database -project<br> GetProject optional parameters: -label -workdir -recursive -verbose -nocache -nocompression -soshome<br> * @return Commandline the generated command to be executed 
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
// add -command GetFile to the commandline 	TokenNameCOMMENT_LINE	add -command GetFile to the commandline 
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
COMMAND_GET_FILE	TokenNameIdentifier	 COMMAND  GET  FILE
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
// look for a version attribute 	TokenNameCOMMENT_LINE	look for a version attribute 
if	TokenNameif	
(	TokenNameLPAREN	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//add -revision xxxxx to the commandline 	TokenNameCOMMENT_LINE	add -revision xxxxx to the commandline 
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
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
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
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// add -command GetProject to the commandline 	TokenNameCOMMENT_LINE	add -command GetProject to the commandline 
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
COMMAND_GET_PROJECT	TokenNameIdentifier	 COMMAND  GET  PROJECT
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
// look for a label option 	TokenNameCOMMENT_LINE	look for a label option 
if	TokenNameif	
(	TokenNameLPAREN	
getLabel	TokenNameIdentifier	 get Label
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
FLAG_LABEL	TokenNameIdentifier	 FLAG  LABEL
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
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
getRequiredAttributes	TokenNameIdentifier	 get Required Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getOptionalAttributes	TokenNameIdentifier	 get Optional Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
commandLine	TokenNameIdentifier	 command Line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
