package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
MojoExecution	TokenNameIdentifier	 Mojo Execution
;	TokenNameSEMICOLON	
/** * @since 3.0 * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @since 3.0 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
Schedule	TokenNameIdentifier	 Schedule
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
upstreamPhase	TokenNameIdentifier	 upstream Phase
;	TokenNameSEMICOLON	
// The upstream phase to lock to. 	TokenNameCOMMENT_LINE	The upstream phase to lock to. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pluginKey	TokenNameIdentifier	 plugin Key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mojoGoal	TokenNameIdentifier	 mojo Goal
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
mojoSynchronized	TokenNameIdentifier	 mojo Synchronized
;	TokenNameSEMICOLON	
// Indicates that this phase/mojo does not need to respect the reactor-dependency graph 	TokenNameCOMMENT_LINE	Indicates that this phase/mojo does not need to respect the reactor-dependency graph 
// (Module lifecycle order still must be respected ) 	TokenNameCOMMENT_LINE	(Module lifecycle order still must be respected ) 
private	TokenNameprivate	
boolean	TokenNameboolean	
parallel	TokenNameIdentifier	 parallel
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Schedule	TokenNameIdentifier	 Schedule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Schedule	TokenNameIdentifier	 Schedule
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mojoSynchronized	TokenNameIdentifier	 mojo Synchronized
,	TokenNameCOMMA	
boolean	TokenNameboolean	
parallel	TokenNameIdentifier	 parallel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
phase	TokenNameIdentifier	 phase
=	TokenNameEQUAL	
phase	TokenNameIdentifier	 phase
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mojoSynchronized	TokenNameIdentifier	 mojo Synchronized
=	TokenNameEQUAL	
mojoSynchronized	TokenNameIdentifier	 mojo Synchronized
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parallel	TokenNameIdentifier	 parallel
=	TokenNameEQUAL	
parallel	TokenNameIdentifier	 parallel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
phase	TokenNameIdentifier	 phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPhase	TokenNameIdentifier	 set Phase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
phase	TokenNameIdentifier	 phase
=	TokenNameEQUAL	
phase	TokenNameIdentifier	 phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPluginKey	TokenNameIdentifier	 get Plugin Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pluginKey	TokenNameIdentifier	 plugin Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPluginKey	TokenNameIdentifier	 set Plugin Key
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pluginKey	TokenNameIdentifier	 plugin Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pluginKey	TokenNameIdentifier	 plugin Key
=	TokenNameEQUAL	
pluginKey	TokenNameIdentifier	 plugin Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isMojoSynchronized	TokenNameIdentifier	 is Mojo Synchronized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoSynchronized	TokenNameIdentifier	 mojo Synchronized
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMojoSynchronized	TokenNameIdentifier	 set Mojo Synchronized
(	TokenNameLPAREN	
boolean	TokenNameboolean	
mojoSynchronized	TokenNameIdentifier	 mojo Synchronized
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mojoSynchronized	TokenNameIdentifier	 mojo Synchronized
=	TokenNameEQUAL	
mojoSynchronized	TokenNameIdentifier	 mojo Synchronized
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isParallel	TokenNameIdentifier	 is Parallel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parallel	TokenNameIdentifier	 parallel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setParallel	TokenNameIdentifier	 set Parallel
(	TokenNameLPAREN	
boolean	TokenNameboolean	
parallel	TokenNameIdentifier	 parallel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parallel	TokenNameIdentifier	 parallel
=	TokenNameEQUAL	
parallel	TokenNameIdentifier	 parallel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUpstreamPhase	TokenNameIdentifier	 get Upstream Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
upstreamPhase	TokenNameIdentifier	 upstream Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUpstreamPhase	TokenNameIdentifier	 set Upstream Phase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
upstreamPhase	TokenNameIdentifier	 upstream Phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
upstreamPhase	TokenNameIdentifier	 upstream Phase
=	TokenNameEQUAL	
upstreamPhase	TokenNameIdentifier	 upstream Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMojoGoal	TokenNameIdentifier	 get Mojo Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoGoal	TokenNameIdentifier	 mojo Goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMojoGoal	TokenNameIdentifier	 set Mojo Goal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mojoGoal	TokenNameIdentifier	 mojo Goal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mojoGoal	TokenNameIdentifier	 mojo Goal
=	TokenNameEQUAL	
mojoGoal	TokenNameIdentifier	 mojo Goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasUpstreamPhaseDefined	TokenNameIdentifier	 has Upstream Phase Defined
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getUpstreamPhase	TokenNameIdentifier	 get Upstream Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
appliesTo	TokenNameIdentifier	 applies To
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pluginKey	TokenNameIdentifier	 plugin Key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
mojoGoal	TokenNameIdentifier	 mojo Goal
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
pluginKeyMatches	TokenNameIdentifier	 plugin Key Matches
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pluginKey	TokenNameIdentifier	 plugin Key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
pluginKey	TokenNameIdentifier	 plugin Key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getPlugin	TokenNameIdentifier	 get Plugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
pluginGoalMatches	TokenNameIdentifier	 plugin Goal Matches
=	TokenNameEQUAL	
(	TokenNameLPAREN	
mojoGoal	TokenNameIdentifier	 mojo Goal
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
mojoGoal	TokenNameIdentifier	 mojo Goal
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pluginKeyMatches	TokenNameIdentifier	 plugin Key Matches
&&	TokenNameAND_AND	
pluginGoalMatches	TokenNameIdentifier	 plugin Goal Matches
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Schedule{"	TokenNameStringLiteral	Schedule{
+	TokenNamePLUS	
"phase='"	TokenNameStringLiteral	phase='
+	TokenNamePLUS	
phase	TokenNameIdentifier	 phase
+	TokenNamePLUS	
"', upstreamPhase='"	TokenNameStringLiteral	', upstreamPhase='
+	TokenNamePLUS	
upstreamPhase	TokenNameIdentifier	 upstream Phase
+	TokenNamePLUS	
"', pluginKey='"	TokenNameStringLiteral	', pluginKey='
+	TokenNamePLUS	
pluginKey	TokenNameIdentifier	 plugin Key
+	TokenNamePLUS	
"', mojoGoal='"	TokenNameStringLiteral	', mojoGoal='
+	TokenNamePLUS	
mojoGoal	TokenNameIdentifier	 mojo Goal
+	TokenNamePLUS	
"', mojoSynchronized="	TokenNameStringLiteral	', mojoSynchronized=
+	TokenNamePLUS	
mojoSynchronized	TokenNameIdentifier	 mojo Synchronized
+	TokenNamePLUS	
", parallel="	TokenNameStringLiteral	, parallel=
+	TokenNamePLUS	
parallel	TokenNameIdentifier	 parallel
+	TokenNamePLUS	
'}'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
