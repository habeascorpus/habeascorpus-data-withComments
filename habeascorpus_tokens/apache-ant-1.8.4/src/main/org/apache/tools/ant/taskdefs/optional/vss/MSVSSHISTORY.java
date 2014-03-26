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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
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
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
;	TokenNameSEMICOLON	
/** * Performs History commands to Microsoft Visual SourceSafe. * * @ant.task name="vsshistory" category="scm" */	TokenNameCOMMENT_JAVADOC	 Performs History commands to Microsoft Visual SourceSafe. * @ant.task name="vsshistory" category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
MSVSSHISTORY	TokenNameIdentifier	 MSVSSHISTORY
extends	TokenNameextends	
MSVSS	TokenNameIdentifier	 MSVSS
{	TokenNameLBRACE	
/** * Builds a command line to execute ss. * @return The constructed commandline. */	TokenNameCOMMENT_JAVADOC	 Builds a command line to execute ss. @return The constructed commandline. 
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
// first off, make sure that we've got a command and a vssdir and a label ... 	TokenNameCOMMENT_LINE	first off, make sure that we've got a command and a vssdir and a label ... 
if	TokenNameif	
(	TokenNameLPAREN	
getVsspath	TokenNameIdentifier	 get Vsspath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"vsspath attribute must be set!"	TokenNameStringLiteral	vsspath attribute must be set!
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
// ss History elements [-H] [-L] [-N] [-O] [-V] [-Y] [-#] [-?] 	TokenNameCOMMENT_LINE	ss History elements [-H] [-L] [-N] [-O] [-V] [-Y] [-#] [-?] 
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
COMMAND_HISTORY	TokenNameIdentifier	 COMMAND  HISTORY
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
getVsspath	TokenNameIdentifier	 get Vsspath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -I- 	TokenNameCOMMENT_LINE	-I- 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ignore all errors 	TokenNameCOMMENT_LINE	ignore all errors 
// -Vd 	TokenNameCOMMENT_LINE	-Vd 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getVersionDate	TokenNameIdentifier	 get Version Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -VL 	TokenNameCOMMENT_LINE	-VL 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getVersionLabel	TokenNameIdentifier	 get Version Label
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
// -B / -D / -F- 	TokenNameCOMMENT_LINE	-B / -D / -F- 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getStyle	TokenNameIdentifier	 get Style
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
// -O 	TokenNameCOMMENT_LINE	-O 
commandLine	TokenNameIdentifier	 command Line
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
commandLine	TokenNameIdentifier	 command Line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve history recursively. Defaults to false. * * @param recursive The boolean value for recursive. */	TokenNameCOMMENT_JAVADOC	 Retrieve history recursively. Defaults to false. * @param recursive The boolean value for recursive. 
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
/** * Name of the user whose change history is generated. * * @param user The username. */	TokenNameCOMMENT_JAVADOC	 Name of the user whose change history is generated. * @param user The username. 
public	TokenNamepublic	
void	TokenNamevoid	
setUser	TokenNameIdentifier	 set User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalUser	TokenNameIdentifier	 set Internal User
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Date representing the 'start' of the range. * * @param fromDate The start date. */	TokenNameCOMMENT_JAVADOC	 Date representing the 'start' of the range. * @param fromDate The start date. 
public	TokenNamepublic	
void	TokenNamevoid	
setFromDate	TokenNameIdentifier	 set From Date
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fromDate	TokenNameIdentifier	 from Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalFromDate	TokenNameIdentifier	 set Internal From Date
(	TokenNameLPAREN	
fromDate	TokenNameIdentifier	 from Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Date representing the 'end' of the range. * * @param toDate The end date. */	TokenNameCOMMENT_JAVADOC	 Date representing the 'end' of the range. * @param toDate The end date. 
public	TokenNamepublic	
void	TokenNamevoid	
setToDate	TokenNameIdentifier	 set To Date
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toDate	TokenNameIdentifier	 to Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalToDate	TokenNameIdentifier	 set Internal To Date
(	TokenNameLPAREN	
toDate	TokenNameIdentifier	 to Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Label representing the 'start' of the range. * * @param fromLabel The start label. */	TokenNameCOMMENT_JAVADOC	 Label representing the 'start' of the range. * @param fromLabel The start label. 
public	TokenNamepublic	
void	TokenNamevoid	
setFromLabel	TokenNameIdentifier	 set From Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fromLabel	TokenNameIdentifier	 from Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalFromLabel	TokenNameIdentifier	 set Internal From Label
(	TokenNameLPAREN	
fromLabel	TokenNameIdentifier	 from Label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Label representing the 'end' of the range. * * @param toLabel The end label. */	TokenNameCOMMENT_JAVADOC	 Label representing the 'end' of the range. * @param toLabel The end label. 
public	TokenNamepublic	
void	TokenNamevoid	
setToLabel	TokenNameIdentifier	 set To Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toLabel	TokenNameIdentifier	 to Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalToLabel	TokenNameIdentifier	 set Internal To Label
(	TokenNameLPAREN	
toLabel	TokenNameIdentifier	 to Label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Number of days for comparison. * Defaults to 2 days. * * @param numd The number of days. */	TokenNameCOMMENT_JAVADOC	 Number of days for comparison. Defaults to 2 days. * @param numd The number of days. 
public	TokenNamepublic	
void	TokenNamevoid	
setNumdays	TokenNameIdentifier	 set Numdays
(	TokenNameLPAREN	
int	TokenNameint	
numd	TokenNameIdentifier	 numd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalNumDays	TokenNameIdentifier	 set Internal Num Days
(	TokenNameLPAREN	
numd	TokenNameIdentifier	 numd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Output file name for the history. * * @param outfile The output file name. */	TokenNameCOMMENT_JAVADOC	 Output file name for the history. * @param outfile The output file name. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
outfile	TokenNameIdentifier	 outfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outfile	TokenNameIdentifier	 outfile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalOutputFilename	TokenNameIdentifier	 set Internal Output Filename
(	TokenNameLPAREN	
outfile	TokenNameIdentifier	 outfile
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Format of dates in <code>fromDate</code and <code>toDate</code>. * Used when calculating dates with the numdays attribute. * This string uses the formatting rules of <code>SimpleDateFormat</code>. * Defaults to <code>DateFormat.SHORT</code>. * * @param dateFormat The date format. */	TokenNameCOMMENT_JAVADOC	 Format of dates in <code>fromDate</code and <code>toDate</code>. Used when calculating dates with the numdays attribute. This string uses the formatting rules of <code>SimpleDateFormat</code>. Defaults to <code>DateFormat.SHORT</code>. * @param dateFormat The date format. 
public	TokenNamepublic	
void	TokenNamevoid	
setDateFormat	TokenNameIdentifier	 set Date Format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dateFormat	TokenNameIdentifier	 date Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalDateFormat	TokenNameIdentifier	 set Internal Date Format
(	TokenNameLPAREN	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
dateFormat	TokenNameIdentifier	 date Format
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Output style. Valid options are: * <ul> * <li>brief: -B Display a brief history. * <li>codediff: -D Display line-by-line file changes. * <li>nofile: -F- Do not display individual file updates in the project history. * <li>default: No option specified. Display in Source Safe's default format. * </ul> * * @param attr The history style: */	TokenNameCOMMENT_JAVADOC	 Output style. Valid options are: <ul> <li>brief: -B Display a brief history. <li>codediff: -D Display line-by-line file changes. <li>nofile: -F- Do not display individual file updates in the project history. <li>default: No option specified. Display in Source Safe's default format. </ul> * @param attr The history style: 
public	TokenNamepublic	
void	TokenNamevoid	
setStyle	TokenNameIdentifier	 set Style
(	TokenNameLPAREN	
BriefCodediffNofile	TokenNameIdentifier	 Brief Codediff Nofile
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
option	TokenNameIdentifier	 option
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
STYLE_BRIEF	TokenNameIdentifier	 STYLE  BRIEF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalStyle	TokenNameIdentifier	 set Internal Style
(	TokenNameLPAREN	
FLAG_BRIEF	TokenNameIdentifier	 FLAG  BRIEF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
STYLE_CODEDIFF	TokenNameIdentifier	 STYLE  CODEDIFF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalStyle	TokenNameIdentifier	 set Internal Style
(	TokenNameLPAREN	
FLAG_CODEDIFF	TokenNameIdentifier	 FLAG  CODEDIFF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
STYLE_DEFAULT	TokenNameIdentifier	 STYLE  DEFAULT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalStyle	TokenNameIdentifier	 set Internal Style
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
STYLE_NOFILE	TokenNameIdentifier	 STYLE  NOFILE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setInternalStyle	TokenNameIdentifier	 set Internal Style
(	TokenNameLPAREN	
FLAG_NO_FILE	TokenNameIdentifier	 FLAG  NO  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Style "	TokenNameStringLiteral	Style 
+	TokenNamePLUS	
attr	TokenNameIdentifier	 attr
+	TokenNamePLUS	
" unknown."	TokenNameStringLiteral	 unknown.
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Extention of EnumeratedAttribute to hold the values for style. */	TokenNameCOMMENT_JAVADOC	 Extention of EnumeratedAttribute to hold the values for style. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
BriefCodediffNofile	TokenNameIdentifier	 Brief Codediff Nofile
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** * Gets the list of allowable values. * @return The values. */	TokenNameCOMMENT_JAVADOC	 Gets the list of allowable values. @return The values. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
STYLE_BRIEF	TokenNameIdentifier	 STYLE  BRIEF
,	TokenNameCOMMA	
STYLE_CODEDIFF	TokenNameIdentifier	 STYLE  CODEDIFF
,	TokenNameCOMMA	
STYLE_NOFILE	TokenNameIdentifier	 STYLE  NOFILE
,	TokenNameCOMMA	
STYLE_DEFAULT	TokenNameIdentifier	 STYLE  DEFAULT
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
