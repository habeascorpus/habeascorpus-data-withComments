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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Callable	TokenNameIdentifier	 Callable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
CompletionService	TokenNameIdentifier	 Completion Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ExecutionException	TokenNameIdentifier	 Execution Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Future	TokenNameIdentifier	 Future
;	TokenNameSEMICOLON	
/** * Builds the full lifecycle in weave-mode (phase by phase as opposed to project-by-project) * * @since 3.0 * @author Kristian Rosenvold * Builds one or more lifecycles for a full module * <p/> * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 Builds the full lifecycle in weave-mode (phase by phase as opposed to project-by-project) * @since 3.0 @author Kristian Rosenvold Builds one or more lifecycles for a full module <p/> NOTE: This class is not part of any public api and can be changed or deleted without prior notice. 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
LifecycleThreadedBuilder	TokenNameIdentifier	 Lifecycle Threaded Builder
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
LifecycleThreadedBuilder	TokenNameIdentifier	 Lifecycle Threaded Builder
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
LifecycleModuleBuilder	TokenNameIdentifier	 Lifecycle Module Builder
lifecycleModuleBuilder	TokenNameIdentifier	 lifecycle Module Builder
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"UnusedDeclaration"	TokenNameStringLiteral	UnusedDeclaration
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
LifecycleThreadedBuilder	TokenNameIdentifier	 Lifecycle Threaded Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
ReactorContext	TokenNameIdentifier	 Reactor Context
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
ProjectBuildList	TokenNameIdentifier	 Project Build List
projectBuilds	TokenNameIdentifier	 project Builds
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TaskSegment	TokenNameIdentifier	 Task Segment
>	TokenNameGREATER	
currentTaskSegment	TokenNameIdentifier	 current Task Segment
,	TokenNameCOMMA	
ConcurrencyDependencyGraph	TokenNameIdentifier	 Concurrency Dependency Graph
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
CompletionService	TokenNameIdentifier	 Completion Service
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
service	TokenNameIdentifier	 service
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Currently disabled 	TokenNameCOMMENT_LINE	Currently disabled 
ThreadOutputMuxer	TokenNameIdentifier	 Thread Output Muxer
muxer	TokenNameIdentifier	 muxer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// new ThreadOutputMuxer( analyzer.getProjectBuilds(), System.out ); 	TokenNameCOMMENT_LINE	new ThreadOutputMuxer( analyzer.getProjectBuilds(), System.out ); 
for	TokenNamefor	
(	TokenNameLPAREN	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment	TokenNameIdentifier	 task Segment
:	TokenNameCOLON	
currentTaskSegment	TokenNameIdentifier	 current Task Segment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
,	TokenNameCOMMA	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
projectBuildMap	TokenNameIdentifier	 project Build Map
=	TokenNameEQUAL	
projectBuilds	TokenNameIdentifier	 project Builds
.	TokenNameDOT	
selectSegment	TokenNameIdentifier	 select Segment
(	TokenNameLPAREN	
taskSegment	TokenNameIdentifier	 task Segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
multiThreadedProjectTaskSegmentBuild	TokenNameIdentifier	 multi Threaded Project Task Segment Build
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
service	TokenNameIdentifier	 service
,	TokenNameCOMMA	
taskSegment	TokenNameIdentifier	 task Segment
,	TokenNameCOMMA	
projectBuildMap	TokenNameIdentifier	 project Build Map
,	TokenNameCOMMA	
muxer	TokenNameIdentifier	 muxer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reactorContext	TokenNameIdentifier	 reactor Context
.	TokenNameDOT	
getReactorBuildStatus	TokenNameIdentifier	 get Reactor Build Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isHalted	TokenNameIdentifier	 is Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Why are we just ignoring this exception? Are exceptions are being used for flow control 	TokenNameCOMMENT_LINE	Why are we just ignoring this exception? Are exceptions are being used for flow control 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
multiThreadedProjectTaskSegmentBuild	TokenNameIdentifier	 multi Threaded Project Task Segment Build
(	TokenNameLPAREN	
ConcurrencyDependencyGraph	TokenNameIdentifier	 Concurrency Dependency Graph
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
ReactorContext	TokenNameIdentifier	 Reactor Context
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
rootSession	TokenNameIdentifier	 root Session
,	TokenNameCOMMA	
CompletionService	TokenNameIdentifier	 Completion Service
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
service	TokenNameIdentifier	 service
,	TokenNameCOMMA	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment	TokenNameIdentifier	 task Segment
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
,	TokenNameCOMMA	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
projectBuildList	TokenNameIdentifier	 project Build List
,	TokenNameCOMMA	
ThreadOutputMuxer	TokenNameIdentifier	 Thread Output Muxer
muxer	TokenNameIdentifier	 muxer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// schedule independent projects 	TokenNameCOMMENT_LINE	schedule independent projects 
for	TokenNamefor	
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
:	TokenNameCOLON	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
getRootSchedulableBuilds	TokenNameIdentifier	 get Root Schedulable Builds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectSegment	TokenNameIdentifier	 project Segment
=	TokenNameEQUAL	
projectBuildList	TokenNameIdentifier	 project Build List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Scheduling: "	TokenNameStringLiteral	Scheduling: 
+	TokenNamePLUS	
projectSegment	TokenNameIdentifier	 project Segment
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
createBuildCallable	TokenNameIdentifier	 create Build Callable
(	TokenNameLPAREN	
rootSession	TokenNameIdentifier	 root Session
,	TokenNameCOMMA	
projectSegment	TokenNameIdentifier	 project Segment
,	TokenNameCOMMA	
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
taskSegment	TokenNameIdentifier	 task Segment
,	TokenNameCOMMA	
muxer	TokenNameIdentifier	 muxer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for each finished project 	TokenNameCOMMENT_LINE	for each finished project 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
getNumberOfBuilds	TokenNameIdentifier	 get Number Of Builds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
=	TokenNameEQUAL	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
take	TokenNameIdentifier	 take
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reactorContext	TokenNameIdentifier	 reactor Context
.	TokenNameDOT	
getReactorBuildStatus	TokenNameIdentifier	 get Reactor Build Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isHalted	TokenNameIdentifier	 is Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
newItemsThatCanBeBuilt	TokenNameIdentifier	 new Items That Can Be Built
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
markAsFinished	TokenNameIdentifier	 mark As Finished
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
:	TokenNameCOLON	
newItemsThatCanBeBuilt	TokenNameIdentifier	 new Items That Can Be Built
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProjectSegment	TokenNameIdentifier	 Project Segment
scheduledDependent	TokenNameIdentifier	 scheduled Dependent
=	TokenNameEQUAL	
projectBuildList	TokenNameIdentifier	 project Build List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Scheduling: "	TokenNameStringLiteral	Scheduling: 
+	TokenNamePLUS	
scheduledDependent	TokenNameIdentifier	 scheduled Dependent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
createBuildCallable	TokenNameIdentifier	 create Build Callable
(	TokenNameLPAREN	
rootSession	TokenNameIdentifier	 root Session
,	TokenNameCOMMA	
scheduledDependent	TokenNameIdentifier	 scheduled Dependent
,	TokenNameCOMMA	
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
taskSegment	TokenNameIdentifier	 task Segment
,	TokenNameCOMMA	
muxer	TokenNameIdentifier	 muxer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ExecutionException	TokenNameIdentifier	 Execution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// cancel outstanding builds (if any) - this can happen if an exception is thrown in above block 	TokenNameCOMMENT_LINE	cancel outstanding builds (if any) - this can happen if an exception is thrown in above block 
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
unprocessed	TokenNameIdentifier	 unprocessed
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
unprocessed	TokenNameIdentifier	 unprocessed
=	TokenNameEQUAL	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
unprocessed	TokenNameIdentifier	 unprocessed
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
ExecutionException	TokenNameIdentifier	 Execution Exception
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
createBuildCallable	TokenNameIdentifier	 create Build Callable
(	TokenNameLPAREN	
final	TokenNamefinal	
MavenSession	TokenNameIdentifier	 Maven Session
rootSession	TokenNameIdentifier	 root Session
,	TokenNameCOMMA	
final	TokenNamefinal	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
,	TokenNameCOMMA	
final	TokenNamefinal	
ReactorContext	TokenNameIdentifier	 Reactor Context
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
final	TokenNamefinal	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment	TokenNameIdentifier	 task Segment
,	TokenNameCOMMA	
final	TokenNamefinal	
ThreadOutputMuxer	TokenNameIdentifier	 Thread Output Muxer
muxer	TokenNameIdentifier	 muxer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
ProjectSegment	TokenNameIdentifier	 Project Segment
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// muxer.associateThreadWithProjectSegment( projectBuild ); 	TokenNameCOMMENT_LINE	muxer.associateThreadWithProjectSegment( projectBuild ); 
lifecycleModuleBuilder	TokenNameIdentifier	 lifecycle Module Builder
.	TokenNameDOT	
buildProject	TokenNameIdentifier	 build Project
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
getSession	TokenNameIdentifier	 get Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rootSession	TokenNameIdentifier	 root Session
,	TokenNameCOMMA	
reactorContext	TokenNameIdentifier	 reactor Context
,	TokenNameCOMMA	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
taskSegment	TokenNameIdentifier	 task Segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// muxer.setThisModuleComplete( projectBuild ); 	TokenNameCOMMENT_LINE	muxer.setThisModuleComplete( projectBuild ); 
return	TokenNamereturn	
projectBuild	TokenNameIdentifier	 project Build
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
