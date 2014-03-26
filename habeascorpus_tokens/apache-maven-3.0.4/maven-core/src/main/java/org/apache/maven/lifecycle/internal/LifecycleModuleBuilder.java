package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
BuildSuccess	TokenNameIdentifier	 Build Success
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
ExecutionEvent	TokenNameIdentifier	 Execution Event
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
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
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
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
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
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Requirement	TokenNameIdentifier	 Requirement
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
/** * Builds one or more lifecycles for a full module * * @since 3.0 * @author Benjamin Bentmann * @author Jason van Zyl * @author Kristian Rosenvold (extracted class) * <p/> * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 Builds one or more lifecycles for a full module * @since 3.0 @author Benjamin Bentmann @author Jason van Zyl @author Kristian Rosenvold (extracted class) <p/> NOTE: This class is not part of any public api and can be changed or deleted without prior notice. 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
LifecycleModuleBuilder	TokenNameIdentifier	 Lifecycle Module Builder
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
LifecycleModuleBuilder	TokenNameIdentifier	 Lifecycle Module Builder
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
MojoExecutor	TokenNameIdentifier	 Mojo Executor
mojoExecutor	TokenNameIdentifier	 mojo Executor
;	TokenNameSEMICOLON	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
BuilderCommon	TokenNameIdentifier	 Builder Common
builderCommon	TokenNameIdentifier	 builder Common
;	TokenNameSEMICOLON	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
ExecutionEventCatapult	TokenNameIdentifier	 Execution Event Catapult
eventCatapult	TokenNameIdentifier	 event Catapult
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
buildProject	TokenNameIdentifier	 build Project
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
ReactorContext	TokenNameIdentifier	 Reactor Context
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
currentProject	TokenNameIdentifier	 current Project
,	TokenNameCOMMA	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment	TokenNameIdentifier	 task Segment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildProject	TokenNameIdentifier	 build Project
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
currentProject	TokenNameIdentifier	 current Project
,	TokenNameCOMMA	
taskSegment	TokenNameIdentifier	 task Segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildProject	TokenNameIdentifier	 build Project
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
rootSession	TokenNameIdentifier	 root Session
,	TokenNameCOMMA	
ReactorContext	TokenNameIdentifier	 Reactor Context
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
currentProject	TokenNameIdentifier	 current Project
,	TokenNameCOMMA	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment	TokenNameIdentifier	 task Segment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
setCurrentProject	TokenNameIdentifier	 set Current Project
(	TokenNameLPAREN	
currentProject	TokenNameIdentifier	 current Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
buildStartTime	TokenNameIdentifier	 build Start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reactorContext	TokenNameIdentifier	 reactor Context
.	TokenNameDOT	
getReactorBuildStatus	TokenNameIdentifier	 get Reactor Build Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isHaltedOrBlacklisted	TokenNameIdentifier	 is Halted Or Blacklisted
(	TokenNameLPAREN	
currentProject	TokenNameIdentifier	 current Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eventCatapult	TokenNameIdentifier	 event Catapult
.	TokenNameDOT	
fire	TokenNameIdentifier	 fire
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
ProjectSkipped	TokenNameIdentifier	 Project Skipped
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
eventCatapult	TokenNameIdentifier	 event Catapult
.	TokenNameDOT	
fire	TokenNameIdentifier	 fire
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
ProjectStarted	TokenNameIdentifier	 Project Started
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BuilderCommon	TokenNameIdentifier	 Builder Common
.	TokenNameDOT	
attachToThread	TokenNameIdentifier	 attach To Thread
(	TokenNameLPAREN	
currentProject	TokenNameIdentifier	 current Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
executionPlan	TokenNameIdentifier	 execution Plan
=	TokenNameEQUAL	
builderCommon	TokenNameIdentifier	 builder Common
.	TokenNameDOT	
resolveBuildPlan	TokenNameIdentifier	 resolve Build Plan
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
currentProject	TokenNameIdentifier	 current Project
,	TokenNameCOMMA	
taskSegment	TokenNameIdentifier	 task Segment
,	TokenNameCOMMA	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mojoExecutor	TokenNameIdentifier	 mojo Executor
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
executionPlan	TokenNameIdentifier	 execution Plan
.	TokenNameDOT	
getMojoExecutions	TokenNameIdentifier	 get Mojo Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reactorContext	TokenNameIdentifier	 reactor Context
.	TokenNameDOT	
getProjectIndex	TokenNameIdentifier	 get Project Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
buildEndTime	TokenNameIdentifier	 build End Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reactorContext	TokenNameIdentifier	 reactor Context
.	TokenNameDOT	
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addBuildSummary	TokenNameIdentifier	 add Build Summary
(	TokenNameLPAREN	
new	TokenNamenew	
BuildSuccess	TokenNameIdentifier	 Build Success
(	TokenNameLPAREN	
currentProject	TokenNameIdentifier	 current Project
,	TokenNameCOMMA	
buildEndTime	TokenNameIdentifier	 build End Time
-	TokenNameMINUS	
buildStartTime	TokenNameIdentifier	 build Start Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventCatapult	TokenNameIdentifier	 event Catapult
.	TokenNameDOT	
fire	TokenNameIdentifier	 fire
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
ProjectSucceeded	TokenNameIdentifier	 Project Succeeded
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builderCommon	TokenNameIdentifier	 builder Common
.	TokenNameDOT	
handleBuildError	TokenNameIdentifier	 handle Build Error
(	TokenNameLPAREN	
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
rootSession	TokenNameIdentifier	 root Session
,	TokenNameCOMMA	
currentProject	TokenNameIdentifier	 current Project
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
buildStartTime	TokenNameIdentifier	 build Start Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
setCurrentProject	TokenNameIdentifier	 set Current Project
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setContextClassLoader	TokenNameIdentifier	 set Context Class Loader
(	TokenNameLPAREN	
reactorContext	TokenNameIdentifier	 reactor Context
.	TokenNameDOT	
getOriginalContextClassLoader	TokenNameIdentifier	 get Original Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
