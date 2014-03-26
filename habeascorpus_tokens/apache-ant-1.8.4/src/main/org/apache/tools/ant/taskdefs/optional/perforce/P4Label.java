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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * Creates a new Perforce label and set contents to reflect current * client file revisions. * * Label name defaults to AntLabel if none set. * * Example Usage: * <pre> * &lt;P4Label name="MyLabel-${TSTAMP}-${DSTAMP}" desc="Auto Build Label" /&gt; * </pre> * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Creates a new Perforce label and set contents to reflect current client file revisions. * Label name defaults to AntLabel if none set. * Example Usage: <pre> &lt;P4Label name="MyLabel-${TSTAMP}-${DSTAMP}" desc="Auto Build Label" /&gt; </pre> * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Label	TokenNameIdentifier	 P4 Label
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
lock	TokenNameIdentifier	 lock
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * The name of the label; optional, default "AntLabel" * @param name the name of the label */	TokenNameCOMMENT_JAVADOC	 The name of the label; optional, default "AntLabel" @param name the name of the label 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** *Label Description; optional * @param desc description of the label */	TokenNameCOMMENT_JAVADOC	 *Label Description; optional @param desc description of the label 
public	TokenNamepublic	
void	TokenNamevoid	
setDesc	TokenNameIdentifier	 set Desc
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * when set to "locked", Perforce will lock the label once created; optional. * @param lock only admissible value "locked" */	TokenNameCOMMENT_JAVADOC	 when set to "locked", Perforce will lock the label once created; optional. @param lock only admissible value "locked" 
public	TokenNamepublic	
void	TokenNamevoid	
setLock	TokenNameIdentifier	 set Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lock	TokenNameIdentifier	 lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lock	TokenNameIdentifier	 lock
=	TokenNameEQUAL	
lock	TokenNameIdentifier	 lock
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * do the work * @throws BuildException if failonerror has been set to true and Perforce fails */	TokenNameCOMMENT_JAVADOC	 do the work @throws BuildException if failonerror has been set to true and Perforce fails 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"P4Label exec:"	TokenNameStringLiteral	P4Label exec:
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
P4View	TokenNameIdentifier	 P4 View
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
P4View	TokenNameIdentifier	 P4 View
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"View not set, assuming //depot/..."	TokenNameStringLiteral	View not set, assuming //depot/...
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
P4View	TokenNameIdentifier	 P4 View
=	TokenNameEQUAL	
"//depot/..."	TokenNameStringLiteral	//depot/...
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
P4View	TokenNameIdentifier	 P4 View
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
P4View	TokenNameIdentifier	 P4 View
,	TokenNameCOMMA	
":"	TokenNameStringLiteral	:
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
P4View	TokenNameIdentifier	 P4 View
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
P4View	TokenNameIdentifier	 P4 View
,	TokenNameCOMMA	
";"	TokenNameStringLiteral	;
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Label Description not set, assuming 'AntLabel'"	TokenNameStringLiteral	Label Description not set, assuming 'AntLabel'
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
"AntLabel"	TokenNameStringLiteral	AntLabel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"locked"	TokenNameStringLiteral	locked
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"lock attribute invalid - ignoring"	TokenNameStringLiteral	lock attribute invalid - ignoring
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyy.MM.dd-hh:mm"	TokenNameStringLiteral	yyyy.MM.dd-hh:mm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"AntLabel-"	TokenNameStringLiteral	AntLabel-
+	TokenNamePLUS	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"name not set, assuming '"	TokenNameStringLiteral	name not set, assuming '
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//We have to create a unlocked label first 	TokenNameCOMMENT_LINE	We have to create a unlocked label first 
String	TokenNameIdentifier	 String
newLabel	TokenNameIdentifier	 new Label
=	TokenNameEQUAL	
"Label: "	TokenNameStringLiteral	Label: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" Description: "	TokenNameStringLiteral	 Description: 
+	TokenNamePLUS	
desc	TokenNameIdentifier	 desc
+	TokenNamePLUS	
" Options: unlocked"	TokenNameStringLiteral	 Options: unlocked
+	TokenNamePLUS	
" View: "	TokenNameStringLiteral	 View: 
+	TokenNamePLUS	
P4View	TokenNameIdentifier	 P4 View
;	TokenNameSEMICOLON	
P4Handler	TokenNameIdentifier	 P4 Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
P4HandlerAdapter	TokenNameIdentifier	 P4 Handler Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
newLabel	TokenNameIdentifier	 new Label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"label -i"	TokenNameStringLiteral	label -i
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"labelsync -l "	TokenNameStringLiteral	labelsync -l 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
new	TokenNamenew	
P4HandlerAdapter	TokenNameIdentifier	 P4 Handler Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Created Label "	TokenNameStringLiteral	Created Label 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
desc	TokenNameIdentifier	 desc
+	TokenNamePLUS	
") with view: "	TokenNameStringLiteral	) with view: 
+	TokenNamePLUS	
P4View	TokenNameIdentifier	 P4 View
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Now lock if required 	TokenNameCOMMENT_LINE	Now lock if required 
if	TokenNameif	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"locked"	TokenNameStringLiteral	locked
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Modifying lock status to 'locked'"	TokenNameStringLiteral	Modifying lock status to 'locked'
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
labelSpec	TokenNameIdentifier	 label Spec
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Read back the label spec from perforce, 	TokenNameCOMMENT_LINE	Read back the label spec from perforce, 
//Replace Options 	TokenNameCOMMENT_LINE	Replace Options 
//Submit back to Perforce 	TokenNameCOMMENT_LINE	Submit back to Perforce 
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
P4HandlerAdapter	TokenNameIdentifier	 P4 Handler Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/^Options:/"	TokenNameStringLiteral	/^Options:/
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
"Options: "	TokenNameStringLiteral	Options: 
+	TokenNamePLUS	
lock	TokenNameIdentifier	 lock
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
labelSpec	TokenNameIdentifier	 label Spec
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"label -o "	TokenNameStringLiteral	label -o 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
labelSpec	TokenNameIdentifier	 label Spec
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Now locking label..."	TokenNameStringLiteral	Now locking label...
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
P4HandlerAdapter	TokenNameIdentifier	 P4 Handler Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
labelSpec	TokenNameIdentifier	 label Spec
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"label -i"	TokenNameStringLiteral	label -i
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
