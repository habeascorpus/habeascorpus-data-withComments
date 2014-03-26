package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
Artifact	TokenNameIdentifier	 Artifact
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
VersionRange	TokenNameIdentifier	 Version Range
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * Send resolution events to the debug log. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Send resolution events to the debug log. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
DebugResolutionListener	TokenNameIdentifier	 Debug Resolution Listener
implements	TokenNameimplements	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
,	TokenNameCOMMA	
ResolutionListenerForDepMgmt	TokenNameIdentifier	 Resolution Listener For Dep Mgmt
{	TokenNameLBRACE	
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
ignoredArtifacts	TokenNameIdentifier	 ignored Artifacts
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DebugResolutionListener	TokenNameIdentifier	 Debug Resolution Listener
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testArtifact	TokenNameIdentifier	 test Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startProcessChildren	TokenNameIdentifier	 start Process Children
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indent	TokenNameIdentifier	 indent
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endProcessChildren	TokenNameIdentifier	 end Process Children
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
indent	TokenNameIdentifier	 indent
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
includeArtifact	TokenNameIdentifier	 include Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
+	TokenNamePLUS	
" (selected for "	TokenNameStringLiteral	 (selected for 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
omitForNearer	TokenNameIdentifier	 omit For Nearer
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
omitted	TokenNameIdentifier	 omitted
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
kept	TokenNameIdentifier	 kept
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
omittedVersion	TokenNameIdentifier	 omitted Version
=	TokenNameEQUAL	
omitted	TokenNameIdentifier	 omitted
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
keptVersion	TokenNameIdentifier	 kept Version
=	TokenNameEQUAL	
kept	TokenNameIdentifier	 kept
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
omittedVersion	TokenNameIdentifier	 omitted Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
!	TokenNameNOT	
omittedVersion	TokenNameIdentifier	 omitted Version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keptVersion	TokenNameIdentifier	 kept Version
)	TokenNameRPAREN	
:	TokenNameCOLON	
keptVersion	TokenNameIdentifier	 kept Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
omitted	TokenNameIdentifier	 omitted
+	TokenNamePLUS	
" (removed - nearer found: "	TokenNameStringLiteral	 (removed - nearer found: 
+	TokenNamePLUS	
kept	TokenNameIdentifier	 kept
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
omitForCycle	TokenNameIdentifier	 omit For Cycle
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
omitted	TokenNameIdentifier	 omitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
omitted	TokenNameIdentifier	 omitted
+	TokenNamePLUS	
" (removed - causes a cycle in the graph)"	TokenNameStringLiteral	 (removed - causes a cycle in the graph)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
updateScopeCurrentPom	TokenNameIdentifier	 update Scope Current Pom
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ignoredScope	TokenNameIdentifier	 ignored Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
+	TokenNamePLUS	
" (not setting artifactScope to: "	TokenNameStringLiteral	 (not setting artifactScope to: 
+	TokenNamePLUS	
ignoredScope	TokenNameIdentifier	 ignored Scope
+	TokenNamePLUS	
"; local artifactScope "	TokenNameStringLiteral	; local artifactScope 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" wins)"	TokenNameStringLiteral	 wins)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: better way than static? this might hide messages in a reactor 	TokenNameCOMMENT_LINE	TODO: better way than static? this might hide messages in a reactor 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ignoredArtifacts	TokenNameIdentifier	 ignored Artifacts
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
" Artifact "	TokenNameStringLiteral	 Artifact 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
+	TokenNamePLUS	
" retains local artifactScope '"	TokenNameStringLiteral	 retains local artifactScope '
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' overriding broader artifactScope '"	TokenNameStringLiteral	' overriding broader artifactScope '
+	TokenNamePLUS	
ignoredScope	TokenNameIdentifier	 ignored Scope
+	TokenNamePLUS	
"' "	TokenNameStringLiteral	' 
+	TokenNamePLUS	
" given by a dependency. If this is not intended, modify or remove the local artifactScope. "	TokenNameStringLiteral	 given by a dependency. If this is not intended, modify or remove the local artifactScope. 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ignoredArtifacts	TokenNameIdentifier	 ignored Artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
updateScope	TokenNameIdentifier	 update Scope
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
+	TokenNamePLUS	
" (setting artifactScope to: "	TokenNameStringLiteral	 (setting artifactScope to: 
+	TokenNamePLUS	
scope	TokenNameIdentifier	 scope
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
selectVersionFromRange	TokenNameIdentifier	 select Version From Range
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
+	TokenNamePLUS	
" (setting version to: "	TokenNameStringLiteral	 (setting version to: 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" from range: "	TokenNameStringLiteral	 from range: 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersionRange	TokenNameIdentifier	 get Version Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
restrictRange	TokenNameIdentifier	 restrict Range
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
replacement	TokenNameIdentifier	 replacement
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
newRange	TokenNameIdentifier	 new Range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
+	TokenNamePLUS	
" (range restricted from: "	TokenNameStringLiteral	 (range restricted from: 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersionRange	TokenNameIdentifier	 get Version Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" and: "	TokenNameStringLiteral	 and: 
+	TokenNamePLUS	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getVersionRange	TokenNameIdentifier	 get Version Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to: "	TokenNameStringLiteral	 to: 
+	TokenNamePLUS	
newRange	TokenNameIdentifier	 new Range
+	TokenNamePLUS	
" )"	TokenNameStringLiteral	 )
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The logic used here used to be a copy of the logic used in the DefaultArtifactCollector, and this method was * called right before the actual version/artifactScope changes were done. However, a different set of conditionals (and * more information) is needed to be able to determine when and if the version and/or artifactScope changes. See the two * added methods, manageArtifactVersion and manageArtifactScope. */	TokenNameCOMMENT_JAVADOC	 The logic used here used to be a copy of the logic used in the DefaultArtifactCollector, and this method was called right before the actual version/artifactScope changes were done. However, a different set of conditionals (and more information) is needed to be able to determine when and if the version and/or artifactScope changes. See the two added methods, manageArtifactVersion and manageArtifactScope. 
public	TokenNamepublic	
void	TokenNamevoid	
manageArtifact	TokenNameIdentifier	 manage Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
" ("	TokenNameStringLiteral	 (
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
"applying version: "	TokenNameStringLiteral	applying version: 
+	TokenNamePLUS	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
"applying artifactScope: "	TokenNameStringLiteral	applying artifactScope: 
+	TokenNamePLUS	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
manageArtifactVersion	TokenNameIdentifier	 manage Artifact Version
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only show msg if a change is actually taking place 	TokenNameCOMMENT_LINE	only show msg if a change is actually taking place 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
+	TokenNamePLUS	
" (applying version: "	TokenNameStringLiteral	 (applying version: 
+	TokenNamePLUS	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
manageArtifactScope	TokenNameIdentifier	 manage Artifact Scope
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only show msg if a change is actually taking place 	TokenNameCOMMENT_LINE	only show msg if a change is actually taking place 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
+	TokenNamePLUS	
" (applying artifactScope: "	TokenNameStringLiteral	 (applying artifactScope: 
+	TokenNamePLUS	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
manageArtifactSystemPath	TokenNameIdentifier	 manage Artifact System Path
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only show msg if a change is actually taking place 	TokenNameCOMMENT_LINE	only show msg if a change is actually taking place 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
+	TokenNamePLUS	
" (applying system path: "	TokenNameStringLiteral	 (applying system path: 
+	TokenNamePLUS	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
