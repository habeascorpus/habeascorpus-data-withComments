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
/** * Integrate file(s). * P4Change should be used to obtain a new changelist for P4Integrate, * although P4Integrate can open files to the default change, * P4Submit cannot yet submit to it. * Example Usage:<br> * &lt;p4integrate change="${p4.change}" * fromfile="//depot/project/dev/foo.txt" tofile="//depot/project/main/foo.txt" /&gt; * * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Integrate file(s). P4Change should be used to obtain a new changelist for P4Integrate, although P4Integrate can open files to the default change, P4Submit cannot yet submit to it. Example Usage:<br> &lt;p4integrate change="${p4.change}" fromfile="//depot/project/dev/foo.txt" tofile="//depot/project/main/foo.txt" /&gt; * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Integrate	TokenNameIdentifier	 P4 Integrate
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
change	TokenNameIdentifier	 change
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fromfile	TokenNameIdentifier	 fromfile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
tofile	TokenNameIdentifier	 tofile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
branch	TokenNameIdentifier	 branch
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
restoredeletedrevisions	TokenNameIdentifier	 restoredeletedrevisions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
forceintegrate	TokenNameIdentifier	 forceintegrate
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
leavetargetrevision	TokenNameIdentifier	 leavetargetrevision
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
enablebaselessmerges	TokenNameIdentifier	 enablebaselessmerges
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
simulationmode	TokenNameIdentifier	 simulationmode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
reversebranchmappings	TokenNameIdentifier	 reversebranchmappings
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
propagatesourcefiletype	TokenNameIdentifier	 propagatesourcefiletype
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
nocopynewtargetfiles	TokenNameIdentifier	 nocopynewtargetfiles
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * get the changelist number * * @return the changelist number set for this task */	TokenNameCOMMENT_JAVADOC	 get the changelist number * @return the changelist number set for this task 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getChange	TokenNameIdentifier	 get Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the changelist number for the operation * * @param change An existing changelist number to assign files to; optional * but strongly recommended. */	TokenNameCOMMENT_JAVADOC	 set the changelist number for the operation * @param change An existing changelist number to assign files to; optional but strongly recommended. 
public	TokenNamepublic	
void	TokenNamevoid	
setChange	TokenNameIdentifier	 set Change
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
change	TokenNameIdentifier	 change
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
change	TokenNameIdentifier	 change
=	TokenNameEQUAL	
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the from file specification * * @return the from file specification */	TokenNameCOMMENT_JAVADOC	 get the from file specification * @return the from file specification 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFromfile	TokenNameIdentifier	 get Fromfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fromfile	TokenNameIdentifier	 fromfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the from file specification * * @param fromf the from file specification */	TokenNameCOMMENT_JAVADOC	 sets the from file specification * @param fromf the from file specification 
public	TokenNamepublic	
void	TokenNamevoid	
setFromfile	TokenNameIdentifier	 set Fromfile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fromf	TokenNameIdentifier	 fromf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fromfile	TokenNameIdentifier	 fromfile
=	TokenNameEQUAL	
fromf	TokenNameIdentifier	 fromf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the to file specification * * @return the to file specification */	TokenNameCOMMENT_JAVADOC	 get the to file specification * @return the to file specification 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTofile	TokenNameIdentifier	 get Tofile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tofile	TokenNameIdentifier	 tofile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the to file specification * * @param tof the to file specification */	TokenNameCOMMENT_JAVADOC	 sets the to file specification * @param tof the to file specification 
public	TokenNamepublic	
void	TokenNamevoid	
setTofile	TokenNameIdentifier	 set Tofile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tof	TokenNameIdentifier	 tof
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tofile	TokenNameIdentifier	 tofile
=	TokenNameEQUAL	
tof	TokenNameIdentifier	 tof
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the branch * * @return the name of the branch */	TokenNameCOMMENT_JAVADOC	 get the branch * @return the name of the branch 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBranch	TokenNameIdentifier	 get Branch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
branch	TokenNameIdentifier	 branch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the branch * * @param br the name of the branch to use */	TokenNameCOMMENT_JAVADOC	 sets the branch * @param br the name of the branch to use 
public	TokenNamepublic	
void	TokenNamevoid	
setBranch	TokenNameIdentifier	 set Branch
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
br	TokenNameIdentifier	 br
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
branch	TokenNameIdentifier	 branch
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gets the restoredeletedrevisions flag * * @return restore deleted revisions */	TokenNameCOMMENT_JAVADOC	 gets the restoredeletedrevisions flag * @return restore deleted revisions 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRestoreDeletedRevisions	TokenNameIdentifier	 is Restore Deleted Revisions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
restoredeletedrevisions	TokenNameIdentifier	 restoredeletedrevisions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the restoredeletedrevisions flag * * @param setrest value chosen for restoredeletedrevisions */	TokenNameCOMMENT_JAVADOC	 sets the restoredeletedrevisions flag * @param setrest value chosen for restoredeletedrevisions 
public	TokenNamepublic	
void	TokenNamevoid	
setRestoreDeletedRevisions	TokenNameIdentifier	 set Restore Deleted Revisions
(	TokenNameLPAREN	
boolean	TokenNameboolean	
setrest	TokenNameIdentifier	 setrest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
restoredeletedrevisions	TokenNameIdentifier	 restoredeletedrevisions
=	TokenNameEQUAL	
setrest	TokenNameIdentifier	 setrest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gets the forceintegrate flag * * @return restore deleted revisions */	TokenNameCOMMENT_JAVADOC	 gets the forceintegrate flag * @return restore deleted revisions 
public	TokenNamepublic	
boolean	TokenNameboolean	
isForceIntegrate	TokenNameIdentifier	 is Force Integrate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
forceintegrate	TokenNameIdentifier	 forceintegrate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the forceintegrate flag * * @param setrest value chosen for forceintegrate */	TokenNameCOMMENT_JAVADOC	 sets the forceintegrate flag * @param setrest value chosen for forceintegrate 
public	TokenNamepublic	
void	TokenNamevoid	
setForceIntegrate	TokenNameIdentifier	 set Force Integrate
(	TokenNameLPAREN	
boolean	TokenNameboolean	
setrest	TokenNameIdentifier	 setrest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
forceintegrate	TokenNameIdentifier	 forceintegrate
=	TokenNameEQUAL	
setrest	TokenNameIdentifier	 setrest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gets the leavetargetrevision flag * * @return flag indicating if the target revision should be preserved */	TokenNameCOMMENT_JAVADOC	 gets the leavetargetrevision flag * @return flag indicating if the target revision should be preserved 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLeaveTargetRevision	TokenNameIdentifier	 is Leave Target Revision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
leavetargetrevision	TokenNameIdentifier	 leavetargetrevision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the leavetargetrevision flag * * @param setrest value chosen for leavetargetrevision */	TokenNameCOMMENT_JAVADOC	 sets the leavetargetrevision flag * @param setrest value chosen for leavetargetrevision 
public	TokenNamepublic	
void	TokenNamevoid	
setLeaveTargetRevision	TokenNameIdentifier	 set Leave Target Revision
(	TokenNameLPAREN	
boolean	TokenNameboolean	
setrest	TokenNameIdentifier	 setrest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
leavetargetrevision	TokenNameIdentifier	 leavetargetrevision
=	TokenNameEQUAL	
setrest	TokenNameIdentifier	 setrest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gets the enablebaselessmerges flag * * @return boolean indicating if baseless merges are desired */	TokenNameCOMMENT_JAVADOC	 gets the enablebaselessmerges flag * @return boolean indicating if baseless merges are desired 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEnableBaselessMerges	TokenNameIdentifier	 is Enable Baseless Merges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
enablebaselessmerges	TokenNameIdentifier	 enablebaselessmerges
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the enablebaselessmerges flag * * @param setrest value chosen for enablebaselessmerges */	TokenNameCOMMENT_JAVADOC	 sets the enablebaselessmerges flag * @param setrest value chosen for enablebaselessmerges 
public	TokenNamepublic	
void	TokenNamevoid	
setEnableBaselessMerges	TokenNameIdentifier	 set Enable Baseless Merges
(	TokenNameLPAREN	
boolean	TokenNameboolean	
setrest	TokenNameIdentifier	 setrest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
enablebaselessmerges	TokenNameIdentifier	 enablebaselessmerges
=	TokenNameEQUAL	
setrest	TokenNameIdentifier	 setrest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gets the simulationmode flag * * @return simulation mode flag */	TokenNameCOMMENT_JAVADOC	 gets the simulationmode flag * @return simulation mode flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSimulationMode	TokenNameIdentifier	 is Simulation Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
simulationmode	TokenNameIdentifier	 simulationmode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the simulationmode flag * * @param setrest value chosen for simulationmode */	TokenNameCOMMENT_JAVADOC	 sets the simulationmode flag * @param setrest value chosen for simulationmode 
public	TokenNamepublic	
void	TokenNamevoid	
setSimulationMode	TokenNameIdentifier	 set Simulation Mode
(	TokenNameLPAREN	
boolean	TokenNameboolean	
setrest	TokenNameIdentifier	 setrest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
simulationmode	TokenNameIdentifier	 simulationmode
=	TokenNameEQUAL	
setrest	TokenNameIdentifier	 setrest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns the flag indicating if reverse branch mappings are sought * * @return reversebranchmappings flag */	TokenNameCOMMENT_JAVADOC	 returns the flag indicating if reverse branch mappings are sought * @return reversebranchmappings flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReversebranchmappings	TokenNameIdentifier	 is Reversebranchmappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reversebranchmappings	TokenNameIdentifier	 reversebranchmappings
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the reversebranchmappings flag * * @param reversebranchmappings flag indicating if reverse branch mappings are sought */	TokenNameCOMMENT_JAVADOC	 sets the reversebranchmappings flag * @param reversebranchmappings flag indicating if reverse branch mappings are sought 
public	TokenNamepublic	
void	TokenNamevoid	
setReversebranchmappings	TokenNameIdentifier	 set Reversebranchmappings
(	TokenNameLPAREN	
boolean	TokenNameboolean	
reversebranchmappings	TokenNameIdentifier	 reversebranchmappings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reversebranchmappings	TokenNameIdentifier	 reversebranchmappings
=	TokenNameEQUAL	
reversebranchmappings	TokenNameIdentifier	 reversebranchmappings
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns flag indicating if propagation of source file type is sought * * @return flag set to true if you want to propagate source file type for existing target files */	TokenNameCOMMENT_JAVADOC	 returns flag indicating if propagation of source file type is sought * @return flag set to true if you want to propagate source file type for existing target files 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPropagatesourcefiletype	TokenNameIdentifier	 is Propagatesourcefiletype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
propagatesourcefiletype	TokenNameIdentifier	 propagatesourcefiletype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets flag indicating if one wants to propagate the source file type * * @param propagatesourcefiletype * set it to true if you want to change the type of existing target files * according to type of source file. */	TokenNameCOMMENT_JAVADOC	 sets flag indicating if one wants to propagate the source file type * @param propagatesourcefiletype set it to true if you want to change the type of existing target files according to type of source file. 
public	TokenNamepublic	
void	TokenNamevoid	
setPropagatesourcefiletype	TokenNameIdentifier	 set Propagatesourcefiletype
(	TokenNameLPAREN	
boolean	TokenNameboolean	
propagatesourcefiletype	TokenNameIdentifier	 propagatesourcefiletype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
propagatesourcefiletype	TokenNameIdentifier	 propagatesourcefiletype
=	TokenNameEQUAL	
propagatesourcefiletype	TokenNameIdentifier	 propagatesourcefiletype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * indicates intention to suppress the copying on the local hard disk of new target files. * * @return indicates intention to suppress the copying * on the local hard disk of new target files. */	TokenNameCOMMENT_JAVADOC	 indicates intention to suppress the copying on the local hard disk of new target files. * @return indicates intention to suppress the copying on the local hard disk of new target files. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNocopynewtargetfiles	TokenNameIdentifier	 is Nocopynewtargetfiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nocopynewtargetfiles	TokenNameIdentifier	 nocopynewtargetfiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets nocopynewtargetfiles flag * * @param nocopynewtargetfiles set it to true to gain speed in integration by not copying on * the local Perforce client new target files */	TokenNameCOMMENT_JAVADOC	 sets nocopynewtargetfiles flag * @param nocopynewtargetfiles set it to true to gain speed in integration by not copying on the local Perforce client new target files 
public	TokenNamepublic	
void	TokenNamevoid	
setNocopynewtargetfiles	TokenNameIdentifier	 set Nocopynewtargetfiles
(	TokenNameLPAREN	
boolean	TokenNameboolean	
nocopynewtargetfiles	TokenNameIdentifier	 nocopynewtargetfiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nocopynewtargetfiles	TokenNameIdentifier	 nocopynewtargetfiles
=	TokenNameEQUAL	
nocopynewtargetfiles	TokenNameIdentifier	 nocopynewtargetfiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * execute the p4 integrate * @throws BuildException if there are missing parameters */	TokenNameCOMMENT_JAVADOC	 execute the p4 integrate @throws BuildException if there are missing parameters 
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
change	TokenNameIdentifier	 change
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
"-c "	TokenNameStringLiteral	-c 
+	TokenNamePLUS	
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
forceintegrate	TokenNameIdentifier	 forceintegrate
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
restoredeletedrevisions	TokenNameIdentifier	 restoredeletedrevisions
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
leavetargetrevision	TokenNameIdentifier	 leavetargetrevision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -h"	TokenNameStringLiteral	 -h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
enablebaselessmerges	TokenNameIdentifier	 enablebaselessmerges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -i"	TokenNameStringLiteral	 -i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
simulationmode	TokenNameIdentifier	 simulationmode
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
reversebranchmappings	TokenNameIdentifier	 reversebranchmappings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -r"	TokenNameStringLiteral	 -r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
propagatesourcefiletype	TokenNameIdentifier	 propagatesourcefiletype
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
nocopynewtargetfiles	TokenNameIdentifier	 nocopynewtargetfiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
"-v"	TokenNameStringLiteral	-v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
branch	TokenNameIdentifier	 branch
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fromfile	TokenNameIdentifier	 fromfile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tofile	TokenNameIdentifier	 tofile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
fromfile	TokenNameIdentifier	 fromfile
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
tofile	TokenNameIdentifier	 tofile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
branch	TokenNameIdentifier	 branch
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fromfile	TokenNameIdentifier	 fromfile
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tofile	TokenNameIdentifier	 tofile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -b "	TokenNameStringLiteral	 -b 
+	TokenNamePLUS	
branch	TokenNameIdentifier	 branch
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
tofile	TokenNameIdentifier	 tofile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
branch	TokenNameIdentifier	 branch
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fromfile	TokenNameIdentifier	 fromfile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" -b "	TokenNameStringLiteral	 -b 
+	TokenNamePLUS	
branch	TokenNameIdentifier	 branch
+	TokenNamePLUS	
" -s "	TokenNameStringLiteral	 -s 
+	TokenNamePLUS	
fromfile	TokenNameIdentifier	 fromfile
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
tofile	TokenNameIdentifier	 tofile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"you need to specify fromfile and tofile, "	TokenNameStringLiteral	you need to specify fromfile and tofile, 
+	TokenNamePLUS	
"or branch and tofile, or branch and fromfile, or branch and fromfile and tofile "	TokenNameStringLiteral	or branch and tofile, or branch and fromfile, or branch and fromfile and tofile 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"-s integrate "	TokenNameStringLiteral	-s integrate 
+	TokenNamePLUS	
command	TokenNameIdentifier	 command
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
