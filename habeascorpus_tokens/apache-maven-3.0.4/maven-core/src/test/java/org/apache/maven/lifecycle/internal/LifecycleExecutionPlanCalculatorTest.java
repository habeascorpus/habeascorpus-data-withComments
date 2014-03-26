/* * Licensed to the Apache Software Foundation (ASF) under one or more contributor license * agreements. See the NOTICE file distributed with this work for additional information regarding * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. You may obtain a * copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
AbstractCoreMavenComponentTestCase	TokenNameIdentifier	 Abstract Core Maven Component Test Case
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
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
BuildPluginManagerStub	TokenNameIdentifier	 Build Plugin Manager Stub
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
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
DefaultLifecyclesStub	TokenNameIdentifier	 Default Lifecycles Stub
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
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
DefaultSchedulesStub	TokenNameIdentifier	 Default Schedules Stub
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
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
PluginPrefixResolverStub	TokenNameIdentifier	 Plugin Prefix Resolver Stub
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
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
PluginVersionResolverStub	TokenNameIdentifier	 Plugin Version Resolver Stub
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
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
;	TokenNameSEMICOLON	
/** * @author Kristian Rosenvold> */	TokenNameCOMMENT_JAVADOC	 @author Kristian Rosenvold> 
public	TokenNamepublic	
class	TokenNameclass	
LifecycleExecutionPlanCalculatorTest	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Test
extends	TokenNameextends	
AbstractCoreMavenComponentTestCase	TokenNameIdentifier	 Abstract Core Maven Component Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCalculateExecutionPlanWithGoalTasks	TokenNameIdentifier	 test Calculate Execution Plan With Goal Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MojoDescriptorCreator	TokenNameIdentifier	 Mojo Descriptor Creator
mojoDescriptorCreator	TokenNameIdentifier	 mojo Descriptor Creator
=	TokenNameEQUAL	
createMojoDescriptorCreator	TokenNameIdentifier	 create Mojo Descriptor Creator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LifecycleExecutionPlanCalculator	TokenNameIdentifier	 Lifecycle Execution Plan Calculator
lifecycleExecutionPlanCalculator	TokenNameIdentifier	 lifecycle Execution Plan Calculator
=	TokenNameEQUAL	
createExecutionPlaceCalculator	TokenNameIdentifier	 create Execution Place Calculator
(	TokenNameLPAREN	
mojoDescriptorCreator	TokenNameIdentifier	 mojo Descriptor Creator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
GoalTask	TokenNameIdentifier	 Goal Task
goalTask1	TokenNameIdentifier	 goal Task1
=	TokenNameEQUAL	
new	TokenNamenew	
GoalTask	TokenNameIdentifier	 Goal Task
(	TokenNameLPAREN	
"compiler:compile"	TokenNameStringLiteral	compiler:compile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
GoalTask	TokenNameIdentifier	 Goal Task
goalTask2	TokenNameIdentifier	 goal Task2
=	TokenNameEQUAL	
new	TokenNamenew	
GoalTask	TokenNameIdentifier	 Goal Task
(	TokenNameLPAREN	
"surefire:test"	TokenNameStringLiteral	surefire:test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment1	TokenNameIdentifier	 task Segment1
=	TokenNameEQUAL	
new	TokenNamenew	
TaskSegment	TokenNameIdentifier	 Task Segment
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
goalTask1	TokenNameIdentifier	 goal Task1
,	TokenNameCOMMA	
goalTask2	TokenNameIdentifier	 goal Task2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MavenSession	TokenNameIdentifier	 Maven Session
session1	TokenNameIdentifier	 session1
=	TokenNameEQUAL	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
getMavenSession	TokenNameIdentifier	 get Maven Session
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
executionPlan	TokenNameIdentifier	 execution Plan
=	TokenNameEQUAL	
lifecycleExecutionPlanCalculator	TokenNameIdentifier	 lifecycle Execution Plan Calculator
.	TokenNameDOT	
calculateExecutionPlan	TokenNameIdentifier	 calculate Execution Plan
(	TokenNameLPAREN	
session1	TokenNameIdentifier	 session1
,	TokenNameCOMMA	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
taskSegment1	TokenNameIdentifier	 task Segment1
.	TokenNameDOT	
getTasks	TokenNameIdentifier	 get Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
executionPlan	TokenNameIdentifier	 execution Plan
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
GoalTask	TokenNameIdentifier	 Goal Task
goalTask3	TokenNameIdentifier	 goal Task3
=	TokenNameEQUAL	
new	TokenNamenew	
GoalTask	TokenNameIdentifier	 Goal Task
(	TokenNameLPAREN	
"surefire:test"	TokenNameStringLiteral	surefire:test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment2	TokenNameIdentifier	 task Segment2
=	TokenNameEQUAL	
new	TokenNamenew	
TaskSegment	TokenNameIdentifier	 Task Segment
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
goalTask1	TokenNameIdentifier	 goal Task1
,	TokenNameCOMMA	
goalTask2	TokenNameIdentifier	 goal Task2
,	TokenNameCOMMA	
goalTask3	TokenNameIdentifier	 goal Task3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
executionPlan2	TokenNameIdentifier	 execution Plan2
=	TokenNameEQUAL	
lifecycleExecutionPlanCalculator	TokenNameIdentifier	 lifecycle Execution Plan Calculator
.	TokenNameDOT	
calculateExecutionPlan	TokenNameIdentifier	 calculate Execution Plan
(	TokenNameLPAREN	
session1	TokenNameIdentifier	 session1
,	TokenNameCOMMA	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
taskSegment2	TokenNameIdentifier	 task Segment2
.	TokenNameDOT	
getTasks	TokenNameIdentifier	 get Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
executionPlan2	TokenNameIdentifier	 execution Plan2
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Maybe also make one with LifeCycleTasks 	TokenNameCOMMENT_LINE	Maybe also make one with LifeCycleTasks 
public	TokenNamepublic	
static	TokenNamestatic	
LifecycleExecutionPlanCalculator	TokenNameIdentifier	 Lifecycle Execution Plan Calculator
createExecutionPlaceCalculator	TokenNameIdentifier	 create Execution Place Calculator
(	TokenNameLPAREN	
MojoDescriptorCreator	TokenNameIdentifier	 Mojo Descriptor Creator
mojoDescriptorCreator	TokenNameIdentifier	 mojo Descriptor Creator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LifecyclePluginResolver	TokenNameIdentifier	 Lifecycle Plugin Resolver
lifecyclePluginResolver	TokenNameIdentifier	 lifecycle Plugin Resolver
=	TokenNameEQUAL	
new	TokenNamenew	
LifecyclePluginResolver	TokenNameIdentifier	 Lifecycle Plugin Resolver
(	TokenNameLPAREN	
new	TokenNamenew	
PluginVersionResolverStub	TokenNameIdentifier	 Plugin Version Resolver Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DefaultLifecycleExecutionPlanCalculator	TokenNameIdentifier	 Default Lifecycle Execution Plan Calculator
(	TokenNameLPAREN	
new	TokenNamenew	
BuildPluginManagerStub	TokenNameIdentifier	 Build Plugin Manager Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DefaultLifecyclesStub	TokenNameIdentifier	 Default Lifecycles Stub
.	TokenNameDOT	
createDefaultLifecycles	TokenNameIdentifier	 create Default Lifecycles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mojoDescriptorCreator	TokenNameIdentifier	 mojo Descriptor Creator
,	TokenNameCOMMA	
lifecyclePluginResolver	TokenNameIdentifier	 lifecycle Plugin Resolver
,	TokenNameCOMMA	
DefaultSchedulesStub	TokenNameIdentifier	 Default Schedules Stub
.	TokenNameDOT	
createDefaultSchedules	TokenNameIdentifier	 create Default Schedules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
MojoDescriptorCreator	TokenNameIdentifier	 Mojo Descriptor Creator
createMojoDescriptorCreator	TokenNameIdentifier	 create Mojo Descriptor Creator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MojoDescriptorCreator	TokenNameIdentifier	 Mojo Descriptor Creator
(	TokenNameLPAREN	
new	TokenNamenew	
PluginVersionResolverStub	TokenNameIdentifier	 Plugin Version Resolver Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BuildPluginManagerStub	TokenNameIdentifier	 Build Plugin Manager Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
PluginPrefixResolverStub	TokenNameIdentifier	 Plugin Prefix Resolver Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
LifecyclePluginResolver	TokenNameIdentifier	 Lifecycle Plugin Resolver
(	TokenNameLPAREN	
new	TokenNamenew	
PluginVersionResolverStub	TokenNameIdentifier	 Plugin Version Resolver Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
"src/test/projects/lifecycle-executor"	TokenNameStringLiteral	src/test/projects/lifecycle-executor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
