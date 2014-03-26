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
/** * This method syncs an existing Perforce label against the Perforce client * or against a set of files/revisions. * * * Example Usage: * <pre> * &lt;p4labelsync name="MyLabel-${TSTAMP}-${DSTAMP}" * view="//depot/...#head;//depot2/file1#25" /&gt; * </pre> * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 This method syncs an existing Perforce label against the Perforce client or against a set of files/revisions. * Example Usage: <pre> &lt;p4labelsync name="MyLabel-${TSTAMP}-${DSTAMP}" view="//depot/...#head;//depot2/file1#25" /&gt; </pre> * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Labelsync	TokenNameIdentifier	 P4 Labelsync
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
;	TokenNameSEMICOLON	
/* -a */	TokenNameCOMMENT_BLOCK	 -a 
private	TokenNameprivate	
boolean	TokenNameboolean	
delete	TokenNameIdentifier	 delete
;	TokenNameSEMICOLON	
/* -n */	TokenNameCOMMENT_BLOCK	 -n 
private	TokenNameprivate	
boolean	TokenNameboolean	
simulationmode	TokenNameIdentifier	 simulationmode
;	TokenNameSEMICOLON	
/* -n */	TokenNameCOMMENT_BLOCK	 -n 
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * -a flag of p4 labelsync - preserve files which exist in the label, * but not in the current view * @return add attribute * if set to true the task will not remove any files from the label * only add files which were not there previously or update these where the revision has changed * the add attribute is the -a flag of p4 labelsync */	TokenNameCOMMENT_JAVADOC	 -a flag of p4 labelsync - preserve files which exist in the label, but not in the current view @return add attribute if set to true the task will not remove any files from the label only add files which were not there previously or update these where the revision has changed the add attribute is the -a flag of p4 labelsync 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAdd	TokenNameIdentifier	 is Add
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
add	TokenNameIdentifier	 add
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * -a flag of p4 labelsync - preserve files which exist in the label, * but not in the current view * @param add if set to true the task will not remove any files from the label * only add files which were not there previously or update these where the revision has changed * the add attribute is the -a flag of p4 labelsync */	TokenNameCOMMENT_JAVADOC	 -a flag of p4 labelsync - preserve files which exist in the label, but not in the current view @param add if set to true the task will not remove any files from the label only add files which were not there previously or update these where the revision has changed the add attribute is the -a flag of p4 labelsync 
public	TokenNamepublic	
void	TokenNamevoid	
setAdd	TokenNameIdentifier	 set Add
(	TokenNameLPAREN	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
=	TokenNameEQUAL	
add	TokenNameIdentifier	 add
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * -d flag of p4 labelsync; indicates an intention of deleting from the label * the files specified in the view * @return delete attribute */	TokenNameCOMMENT_JAVADOC	 -d flag of p4 labelsync; indicates an intention of deleting from the label the files specified in the view @return delete attribute 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDelete	TokenNameIdentifier	 is Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
delete	TokenNameIdentifier	 delete
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * -d flag of p4 labelsync; indicates an intention of deleting from the label * the files specified in the view * @param delete indicates intention of deleting from the label * the files specified in the view */	TokenNameCOMMENT_JAVADOC	 -d flag of p4 labelsync; indicates an intention of deleting from the label the files specified in the view @param delete indicates intention of deleting from the label the files specified in the view 
public	TokenNamepublic	
void	TokenNamevoid	
setDelete	TokenNameIdentifier	 set Delete
(	TokenNameLPAREN	
boolean	TokenNameboolean	
delete	TokenNameIdentifier	 delete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
=	TokenNameEQUAL	
delete	TokenNameIdentifier	 delete
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of the label; optional, default "AntLabel" * @param name of the label */	TokenNameCOMMENT_JAVADOC	 The name of the label; optional, default "AntLabel" @param name of the label 
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
/** * -n flag of p4 labelsync - display changes without actually doing them * @return -n flag of p4 labelsync */	TokenNameCOMMENT_JAVADOC	 -n flag of p4 labelsync - display changes without actually doing them @return -n flag of p4 labelsync 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSimulationmode	TokenNameIdentifier	 is Simulationmode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
simulationmode	TokenNameIdentifier	 simulationmode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * -n flag of p4 labelsync - display changes without actually doing them * @param simulationmode display changes without actually doing them */	TokenNameCOMMENT_JAVADOC	 -n flag of p4 labelsync - display changes without actually doing them @param simulationmode display changes without actually doing them 
public	TokenNamepublic	
void	TokenNamevoid	
setSimulationmode	TokenNameIdentifier	 set Simulationmode
(	TokenNameLPAREN	
boolean	TokenNameboolean	
simulationmode	TokenNameIdentifier	 simulationmode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
simulationmode	TokenNameIdentifier	 simulationmode
=	TokenNameEQUAL	
simulationmode	TokenNameIdentifier	 simulationmode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * do the work * @throws BuildException if the label name is not supplied */	TokenNameCOMMENT_JAVADOC	 do the work @throws BuildException if the label name is not supplied 
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
"P4Labelsync exec:"	TokenNameStringLiteral	P4Labelsync exec:
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
P4View	TokenNameIdentifier	 P4 View
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
P4View	TokenNameIdentifier	 P4 View
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
P4View	TokenNameIdentifier	 P4 View
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4View	TokenNameIdentifier	 P4 View
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
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
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"name attribute is compulsory for labelsync"	TokenNameStringLiteral	name attribute is compulsory for labelsync
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isSimulationmode	TokenNameIdentifier	 is Simulationmode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -n"	TokenNameStringLiteral	 -n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isDelete	TokenNameIdentifier	 is Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -d"	TokenNameStringLiteral	 -d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isAdd	TokenNameIdentifier	 is Add
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -a"	TokenNameStringLiteral	 -a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"-s labelsync -l "	TokenNameStringLiteral	-s labelsync -l 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
P4View	TokenNameIdentifier	 P4 View
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
