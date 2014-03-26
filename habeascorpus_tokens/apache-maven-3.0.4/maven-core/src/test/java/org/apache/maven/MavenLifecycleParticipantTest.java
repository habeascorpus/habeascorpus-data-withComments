package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more contributor license * agreements. See the NOTICE file distributed with this work for additional information regarding * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. You may obtain a * copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenExecutionRequest	TokenNameIdentifier	 Maven Execution Request
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenSession	TokenNameIdentifier	 Maven Session
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Dependency	TokenNameIdentifier	 Dependency
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
MavenProject	TokenNameIdentifier	 Maven Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusContainer	TokenNameIdentifier	 Plexus Container
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ComponentDescriptor	TokenNameIdentifier	 Component Descriptor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MavenLifecycleParticipantTest	TokenNameIdentifier	 Maven Lifecycle Participant Test
extends	TokenNameextends	
AbstractCoreMavenComponentTestCase	TokenNameIdentifier	 Abstract Core Maven Component Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INJECTED_ARTIFACT_ID	TokenNameIdentifier	 INJECTED  ARTIFACT  ID
=	TokenNameEQUAL	
"injected"	TokenNameStringLiteral	injected
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InjectDependencyLifecycleListener	TokenNameIdentifier	 Inject Dependency Lifecycle Listener
extends	TokenNameextends	
AbstractMavenLifecycleParticipant	TokenNameIdentifier	 Abstract Maven Lifecycle Participant
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
afterProjectsRead	TokenNameIdentifier	 after Projects Read
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getProjects	TokenNameIdentifier	 get Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
=	TokenNameEQUAL	
new	TokenNamenew	
Dependency	TokenNameIdentifier	 Dependency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
INJECTED_ARTIFACT_ID	TokenNameIdentifier	 INJECTED  ARTIFACT  ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
"system"	TokenNameStringLiteral	system
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
setSystemPath	TokenNameIdentifier	 set System Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"src/test/projects/lifecycle-executor/project-with-additional-lifecycle-elements/pom.xml"	TokenNameStringLiteral	src/test/projects/lifecycle-executor/project-with-additional-lifecycle-elements/pom.xml
)	TokenNameRPAREN	
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
afterSessionStart	TokenNameIdentifier	 after Session Start
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"injected"	TokenNameStringLiteral	injected
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setupContainer	TokenNameIdentifier	 setup Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setupContainer	TokenNameIdentifier	 setup Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getProjectsDirectory	TokenNameIdentifier	 get Projects Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"src/test/projects/lifecycle-listener"	TokenNameStringLiteral	src/test/projects/lifecycle-listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDependencyInjection	TokenNameIdentifier	 test Dependency Injection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PlexusContainer	TokenNameIdentifier	 Plexus Container
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
getContainer	TokenNameIdentifier	 get Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ComponentDescriptor	TokenNameIdentifier	 Component Descriptor
cd	TokenNameIdentifier	 cd
=	TokenNameEQUAL	
new	TokenNamenew	
ComponentDescriptor	TokenNameIdentifier	 Component Descriptor
(	TokenNameLPAREN	
InjectDependencyLifecycleListener	TokenNameIdentifier	 Inject Dependency Lifecycle Listener
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getContainerRealm	TokenNameIdentifier	 get Container Realm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
setRoleClass	TokenNameIdentifier	 set Role Class
(	TokenNameLPAREN	
AbstractMavenLifecycleParticipant	TokenNameIdentifier	 Abstract Maven Lifecycle Participant
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
addComponentDescriptor	TokenNameIdentifier	 add Component Descriptor
(	TokenNameLPAREN	
cd	TokenNameIdentifier	 cd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Maven	TokenNameIdentifier	 Maven
maven	TokenNameIdentifier	 maven
=	TokenNameEQUAL	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
Maven	TokenNameIdentifier	 Maven
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom	TokenNameIdentifier	 pom
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
"lifecycle-listener-dependency-injection"	TokenNameStringLiteral	lifecycle-listener-dependency-injection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenExecutionRequest	TokenNameIdentifier	 Maven Execution Request
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
createMavenExecutionRequest	TokenNameIdentifier	 create Maven Execution Request
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setGoals	TokenNameIdentifier	 set Goals
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
"validate"	TokenNameStringLiteral	validate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getExceptions	TokenNameIdentifier	 get Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
hasExceptions	TokenNameIdentifier	 has Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifacts	TokenNameIdentifier	 get Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
INJECTED_ARTIFACT_ID	TokenNameIdentifier	 INJECTED  ARTIFACT  ID
,	TokenNameCOMMA	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
