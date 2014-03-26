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
/** * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Resolve	TokenNameIdentifier	 P4 Resolve
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
resolvemode	TokenNameIdentifier	 resolvemode
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
redoall	TokenNameIdentifier	 redoall
;	TokenNameSEMICOLON	
/* -f */	TokenNameCOMMENT_BLOCK	 -f 
private	TokenNameprivate	
boolean	TokenNameboolean	
simulationmode	TokenNameIdentifier	 simulationmode
;	TokenNameSEMICOLON	
/* -n */	TokenNameCOMMENT_BLOCK	 -n 
private	TokenNameprivate	
boolean	TokenNameboolean	
forcetextmode	TokenNameIdentifier	 forcetextmode
;	TokenNameSEMICOLON	
/* -t */	TokenNameCOMMENT_BLOCK	 -t 
private	TokenNameprivate	
boolean	TokenNameboolean	
markersforall	TokenNameIdentifier	 markersforall
;	TokenNameSEMICOLON	
/* -v */	TokenNameCOMMENT_BLOCK	 -v 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
AUTOMATIC	TokenNameIdentifier	 AUTOMATIC
=	TokenNameEQUAL	
"automatic"	TokenNameStringLiteral	automatic
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FORCE	TokenNameIdentifier	 FORCE
=	TokenNameEQUAL	
"force"	TokenNameStringLiteral	force
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAFE	TokenNameIdentifier	 SAFE
=	TokenNameEQUAL	
"safe"	TokenNameStringLiteral	safe
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
THEIRS	TokenNameIdentifier	 THEIRS
=	TokenNameEQUAL	
"theirs"	TokenNameStringLiteral	theirs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
YOURS	TokenNameIdentifier	 YOURS
=	TokenNameEQUAL	
"yours"	TokenNameStringLiteral	yours
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
RESOLVE_MODES	TokenNameIdentifier	 RESOLVE  MODES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
AUTOMATIC	TokenNameIdentifier	 AUTOMATIC
,	TokenNameCOMMA	
FORCE	TokenNameIdentifier	 FORCE
,	TokenNameCOMMA	
SAFE	TokenNameIdentifier	 SAFE
,	TokenNameCOMMA	
THEIRS	TokenNameIdentifier	 THEIRS
,	TokenNameCOMMA	
YOURS	TokenNameIdentifier	 YOURS
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * returns the resolve mode * @return returns the resolve mode */	TokenNameCOMMENT_JAVADOC	 returns the resolve mode @return returns the resolve mode 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getResolvemode	TokenNameIdentifier	 get Resolvemode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolvemode	TokenNameIdentifier	 resolvemode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * values for resolvemode * <ul> * <li> automatic -am</li> * <li> force -af </li> * <li> safe -as </li> * <li> theirs -at </li> * <li> yours -ay </li> * </ul> * @param resolvemode one of automatic, force, safe, theirs, yours */	TokenNameCOMMENT_JAVADOC	 values for resolvemode <ul> <li> automatic -am</li> <li> force -af </li> <li> safe -as </li> <li> theirs -at </li> <li> yours -ay </li> </ul> @param resolvemode one of automatic, force, safe, theirs, yours 
public	TokenNamepublic	
void	TokenNamevoid	
setResolvemode	TokenNameIdentifier	 set Resolvemode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resolvemode	TokenNameIdentifier	 resolvemode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
<	TokenNameLESS	
RESOLVE_MODES	TokenNameIdentifier	 RESOLVE  MODES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resolvemode	TokenNameIdentifier	 resolvemode
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
RESOLVE_MODES	TokenNameIdentifier	 RESOLVE  MODES
[	TokenNameLBRACKET	
counter	TokenNameIdentifier	 counter
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unacceptable value for resolve mode"	TokenNameStringLiteral	Unacceptable value for resolve mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolvemode	TokenNameIdentifier	 resolvemode
=	TokenNameEQUAL	
resolvemode	TokenNameIdentifier	 resolvemode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * allows previously resolved files to be resolved again * @return flag indicating whether one wants to * allow previously resolved files to be resolved again */	TokenNameCOMMENT_JAVADOC	 allows previously resolved files to be resolved again @return flag indicating whether one wants to allow previously resolved files to be resolved again 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRedoall	TokenNameIdentifier	 is Redoall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
redoall	TokenNameIdentifier	 redoall
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the redoall flag * @param redoall flag indicating whether one want to * allow previously resolved files to be resolved again */	TokenNameCOMMENT_JAVADOC	 set the redoall flag @param redoall flag indicating whether one want to allow previously resolved files to be resolved again 
public	TokenNamepublic	
void	TokenNamevoid	
setRedoall	TokenNameIdentifier	 set Redoall
(	TokenNameLPAREN	
boolean	TokenNameboolean	
redoall	TokenNameIdentifier	 redoall
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
redoall	TokenNameIdentifier	 redoall
=	TokenNameEQUAL	
redoall	TokenNameIdentifier	 redoall
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * read the simulation mode flag * @return flag indicating whether one wants just to simulate * the p4 resolve operation whithout actually doing it */	TokenNameCOMMENT_JAVADOC	 read the simulation mode flag @return flag indicating whether one wants just to simulate the p4 resolve operation whithout actually doing it 
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
/** * sets a flag * @param simulationmode set to true, lists the integrations which would be performed, * without actually doing them. */	TokenNameCOMMENT_JAVADOC	 sets a flag @param simulationmode set to true, lists the integrations which would be performed, without actually doing them. 
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
/** * If set to true, attempts a textual merge, even for binary files * @return flag value */	TokenNameCOMMENT_JAVADOC	 If set to true, attempts a textual merge, even for binary files @return flag value 
public	TokenNamepublic	
boolean	TokenNameboolean	
isForcetextmode	TokenNameIdentifier	 is Forcetextmode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
forcetextmode	TokenNameIdentifier	 forcetextmode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set to true, attempts a textual merge, even for binary files * @param forcetextmode set the flag value */	TokenNameCOMMENT_JAVADOC	 If set to true, attempts a textual merge, even for binary files @param forcetextmode set the flag value 
public	TokenNamepublic	
void	TokenNamevoid	
setForcetextmode	TokenNameIdentifier	 set Forcetextmode
(	TokenNameLPAREN	
boolean	TokenNameboolean	
forcetextmode	TokenNameIdentifier	 forcetextmode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
forcetextmode	TokenNameIdentifier	 forcetextmode
=	TokenNameEQUAL	
forcetextmode	TokenNameIdentifier	 forcetextmode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set to true, puts in markers for all changes, conflicting or not * @return flag markersforall value */	TokenNameCOMMENT_JAVADOC	 If set to true, puts in markers for all changes, conflicting or not @return flag markersforall value 
public	TokenNamepublic	
boolean	TokenNameboolean	
isMarkersforall	TokenNameIdentifier	 is Markersforall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
markersforall	TokenNameIdentifier	 markersforall
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set to true, puts in markers for all changes, conflicting or not * @param markersforall flag true or false */	TokenNameCOMMENT_JAVADOC	 If set to true, puts in markers for all changes, conflicting or not @param markersforall flag true or false 
public	TokenNamepublic	
void	TokenNamevoid	
setMarkersforall	TokenNameIdentifier	 set Markersforall
(	TokenNameLPAREN	
boolean	TokenNameboolean	
markersforall	TokenNameIdentifier	 markersforall
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
markersforall	TokenNameIdentifier	 markersforall
=	TokenNameEQUAL	
markersforall	TokenNameIdentifier	 markersforall
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * execute the p4 resolve * @throws BuildException if there is a wrong resolve mode specified * or no view specified */	TokenNameCOMMENT_JAVADOC	 execute the p4 resolve @throws BuildException if there is a wrong resolve mode specified or no view specified 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
resolvemode	TokenNameIdentifier	 resolvemode
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
AUTOMATIC	TokenNameIdentifier	 AUTOMATIC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -am"	TokenNameStringLiteral	 -am
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
resolvemode	TokenNameIdentifier	 resolvemode
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FORCE	TokenNameIdentifier	 FORCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -af"	TokenNameStringLiteral	 -af
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
resolvemode	TokenNameIdentifier	 resolvemode
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SAFE	TokenNameIdentifier	 SAFE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -as"	TokenNameStringLiteral	 -as
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
resolvemode	TokenNameIdentifier	 resolvemode
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
THEIRS	TokenNameIdentifier	 THEIRS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -at"	TokenNameStringLiteral	 -at
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
resolvemode	TokenNameIdentifier	 resolvemode
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
YOURS	TokenNameIdentifier	 YOURS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -ay"	TokenNameStringLiteral	 -ay
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"unsupported or absent resolve mode"	TokenNameStringLiteral	unsupported or absent resolve mode
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
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"please specify a view"	TokenNameStringLiteral	please specify a view
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isRedoall	TokenNameIdentifier	 is Redoall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -f"	TokenNameStringLiteral	 -f
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
isForcetextmode	TokenNameIdentifier	 is Forcetextmode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -t"	TokenNameStringLiteral	 -t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isMarkersforall	TokenNameIdentifier	 is Markersforall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -v"	TokenNameStringLiteral	 -v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"-s resolve "	TokenNameStringLiteral	-s resolve 
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
