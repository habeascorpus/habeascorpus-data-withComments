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
Collections	TokenNameIdentifier	 Collections
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
AbstractArtifactComponentTestCase	TokenNameIdentifier	 Abstract Artifact Component Test Case
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
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
DefaultArtifactResolver	TokenNameIdentifier	 Default Artifact Resolver
.	TokenNameDOT	
DaemonThreadCreator	TokenNameIdentifier	 Daemon Thread Creator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DefaultArtifactResolverTest	TokenNameIdentifier	 Default Artifact Resolver Test
extends	TokenNameextends	
AbstractArtifactComponentTestCase	TokenNameIdentifier	 Abstract Artifact Component Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
DefaultArtifactResolver	TokenNameIdentifier	 Default Artifact Resolver
artifactResolver	TokenNameIdentifier	 artifact Resolver
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Artifact	TokenNameIdentifier	 Artifact
projectArtifact	TokenNameIdentifier	 project Artifact
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifactResolver	TokenNameIdentifier	 artifact Resolver
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DefaultArtifactResolver	TokenNameIdentifier	 Default Artifact Resolver
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ArtifactResolver	TokenNameIdentifier	 Artifact Resolver
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projectArtifact	TokenNameIdentifier	 project Artifact
=	TokenNameEQUAL	
createLocalArtifact	TokenNameIdentifier	 create Local Artifact
(	TokenNameLPAREN	
"project"	TokenNameStringLiteral	project
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
artifactFactory	TokenNameIdentifier	 artifact Factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
projectArtifact	TokenNameIdentifier	 project Artifact
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
component	TokenNameIdentifier	 component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"resolver"	TokenNameStringLiteral	resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMNG4738	TokenNameIdentifier	 test MN G4738
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
createLocalArtifact	TokenNameIdentifier	 create Local Artifact
(	TokenNameLPAREN	
"g"	TokenNameStringLiteral	g
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createLocalArtifact	TokenNameIdentifier	 create Local Artifact
(	TokenNameLPAREN	
"h"	TokenNameStringLiteral	h
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifactResolver	TokenNameIdentifier	 artifact Resolver
.	TokenNameDOT	
resolveTransitively	TokenNameIdentifier	 resolve Transitively
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
,	TokenNameCOMMA	
projectArtifact	TokenNameIdentifier	 project Artifact
,	TokenNameCOMMA	
remoteRepositories	TokenNameIdentifier	 remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
localRepository	TokenNameIdentifier	 local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we want to see all top-level thread groups 	TokenNameCOMMENT_LINE	we want to see all top-level thread groups 
ThreadGroup	TokenNameIdentifier	 Thread Group
tg	TokenNameIdentifier	 tg
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getThreadGroup	TokenNameIdentifier	 get Thread Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
tg	TokenNameIdentifier	 tg
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tg	TokenNameIdentifier	 tg
=	TokenNameEQUAL	
tg	TokenNameIdentifier	 tg
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ThreadGroup	TokenNameIdentifier	 Thread Group
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tgList	TokenNameIdentifier	 tg List
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadGroup	TokenNameIdentifier	 Thread Group
[	TokenNameLBRACKET	
tg	TokenNameIdentifier	 tg
.	TokenNameDOT	
activeGroupCount	TokenNameIdentifier	 active Group Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tg	TokenNameIdentifier	 tg
.	TokenNameDOT	
enumerate	TokenNameIdentifier	 enumerate
(	TokenNameLPAREN	
tgList	TokenNameIdentifier	 tg List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
seen	TokenNameIdentifier	 seen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
tgList	TokenNameIdentifier	 tg List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tgList	TokenNameIdentifier	 tg List
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DaemonThreadCreator	TokenNameIdentifier	 Daemon Thread Creator
.	TokenNameDOT	
THREADGROUP_NAME	TokenNameIdentifier	 THREADGROUP  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
seen	TokenNameIdentifier	 seen
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tg	TokenNameIdentifier	 tg
=	TokenNameEQUAL	
tgList	TokenNameIdentifier	 tg List
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
[	TokenNameLBRACKET	
tg	TokenNameIdentifier	 tg
.	TokenNameDOT	
activeCount	TokenNameIdentifier	 active Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tg	TokenNameIdentifier	 tg
.	TokenNameDOT	
enumerate	TokenNameIdentifier	 enumerate
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
active	TokenNameIdentifier	 active
:	TokenNameCOLON	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
daemon	TokenNameIdentifier	 daemon
=	TokenNameEQUAL	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
isDaemon	TokenNameIdentifier	 is Daemon
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" is no daemon Thread."	TokenNameStringLiteral	 is no daemon Thread.
,	TokenNameCOMMA	
daemon	TokenNameIdentifier	 daemon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Could not find ThreadGroup: "	TokenNameStringLiteral	Could not find ThreadGroup: 
+	TokenNamePLUS	
DaemonThreadCreator	TokenNameIdentifier	 Daemon Thread Creator
.	TokenNameDOT	
THREADGROUP_NAME	TokenNameIdentifier	 THREADGROUP  NAME
,	TokenNameCOMMA	
seen	TokenNameIdentifier	 seen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLookup	TokenNameIdentifier	 test Lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ArtifactResolver	TokenNameIdentifier	 Artifact Resolver
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ArtifactResolver	TokenNameIdentifier	 Artifact Resolver
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
