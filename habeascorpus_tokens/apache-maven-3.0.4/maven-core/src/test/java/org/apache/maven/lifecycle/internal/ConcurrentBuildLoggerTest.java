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
/* * Licensed to the Apache Software Foundation (ASF) under one or more contributor license * agreements. See the NOTICE file distributed with this work for additional information regarding * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. You may obtain a * copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
ConcurrentBuildLoggerTest	TokenNameIdentifier	 Concurrent Build Logger Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testToGraph	TokenNameIdentifier	 test To Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ConcurrentBuildLogger	TokenNameIdentifier	 Concurrent Build Logger
concurrentBuildLogger	TokenNameIdentifier	 concurrent Build Logger
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentBuildLogger	TokenNameIdentifier	 Concurrent Build Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MojoDescriptorCreator	TokenNameIdentifier	 Mojo Descriptor Creator
mojoDescriptorCreator	TokenNameIdentifier	 mojo Descriptor Creator
=	TokenNameEQUAL	
LifecycleExecutionPlanCalculatorTest	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Test
.	TokenNameDOT	
createMojoDescriptorCreator	TokenNameIdentifier	 create Mojo Descriptor Creator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LifecycleExecutionPlanCalculator	TokenNameIdentifier	 Lifecycle Execution Plan Calculator
lifecycleExecutionPlanCalculator	TokenNameIdentifier	 lifecycle Execution Plan Calculator
=	TokenNameEQUAL	
LifecycleExecutionPlanCalculatorTest	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Test
.	TokenNameDOT	
createExecutionPlaceCalculator	TokenNameIdentifier	 create Execution Place Calculator
(	TokenNameLPAREN	
mojoDescriptorCreator	TokenNameIdentifier	 mojo Descriptor Creator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
B	TokenNameIdentifier	 B
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
B	TokenNameIdentifier	 B
=	TokenNameEQUAL	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
C	TokenNameIdentifier	 C
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MavenSession	TokenNameIdentifier	 Maven Session
session1	TokenNameIdentifier	 session1
=	TokenNameEQUAL	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
getMavenSession	TokenNameIdentifier	 get Maven Session
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
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
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
executionPlan	TokenNameIdentifier	 execution Plan
=	TokenNameEQUAL	
lifecycleExecutionPlanCalculator	TokenNameIdentifier	 lifecycle Execution Plan Calculator
.	TokenNameDOT	
calculateExecutionPlan	TokenNameIdentifier	 calculate Execution Plan
(	TokenNameLPAREN	
session1	TokenNameIdentifier	 session1
,	TokenNameCOMMA	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
taskSegment1	TokenNameIdentifier	 task Segment1
.	TokenNameDOT	
getTasks	TokenNameIdentifier	 get Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
B	TokenNameIdentifier	 B
,	TokenNameCOMMA	
taskSegment1	TokenNameIdentifier	 task Segment1
.	TokenNameDOT	
getTasks	TokenNameIdentifier	 get Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
planItemIterator	TokenNameIdentifier	 plan Item Iterator
=	TokenNameEQUAL	
executionPlan	TokenNameIdentifier	 execution Plan
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BuildLogItem	TokenNameIdentifier	 Build Log Item
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
concurrentBuildLogger	TokenNameIdentifier	 concurrent Build Logger
.	TokenNameDOT	
createBuildLogItem	TokenNameIdentifier	 create Build Log Item
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
planItemIterator	TokenNameIdentifier	 plan Item Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BuildLogItem	TokenNameIdentifier	 Build Log Item
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
concurrentBuildLogger	TokenNameIdentifier	 concurrent Build Logger
.	TokenNameDOT	
createBuildLogItem	TokenNameIdentifier	 create Build Log Item
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
planItemIterator	TokenNameIdentifier	 plan Item Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
plan2ItemIterator	TokenNameIdentifier	 plan2 Item Iterator
=	TokenNameEQUAL	
executionPlan	TokenNameIdentifier	 execution Plan
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BuildLogItem	TokenNameIdentifier	 Build Log Item
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
concurrentBuildLogger	TokenNameIdentifier	 concurrent Build Logger
.	TokenNameDOT	
createBuildLogItem	TokenNameIdentifier	 create Build Log Item
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
,	TokenNameCOMMA	
plan2ItemIterator	TokenNameIdentifier	 plan2 Item Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BuildLogItem	TokenNameIdentifier	 Build Log Item
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
concurrentBuildLogger	TokenNameIdentifier	 concurrent Build Logger
.	TokenNameDOT	
createBuildLogItem	TokenNameIdentifier	 create Build Log Item
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
,	TokenNameCOMMA	
plan2ItemIterator	TokenNameIdentifier	 plan2 Item Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
"Project dependency"	TokenNameStringLiteral	Project dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
aPlan	TokenNameIdentifier	 a Plan
=	TokenNameEQUAL	
executionPlan	TokenNameIdentifier	 execution Plan
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
addWait	TokenNameIdentifier	 add Wait
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
aPlan	TokenNameIdentifier	 a Plan
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
addWait	TokenNameIdentifier	 add Wait
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
aPlan	TokenNameIdentifier	 a Plan
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
concurrentBuildLogger	TokenNameIdentifier	 concurrent Build Logger
.	TokenNameDOT	
toGraph	TokenNameIdentifier	 to Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"digraph"	TokenNameStringLiteral	digraph
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
