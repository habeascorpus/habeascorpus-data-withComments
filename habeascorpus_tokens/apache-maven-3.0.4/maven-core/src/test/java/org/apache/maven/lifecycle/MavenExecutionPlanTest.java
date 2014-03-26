/* * Licensed to the Apache Software Foundation (ASF) under one or more contributor license * agreements. See the NOTICE file distributed with this work for additional information regarding * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. You may obtain a * copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
;	TokenNameSEMICOLON	
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
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
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
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Stub
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
Plugin	TokenNameIdentifier	 Plugin
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
MavenExecutionPlanTest	TokenNameIdentifier	 Maven Execution Plan Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFindFirstWithMatchingSchedule	TokenNameIdentifier	 test Find First With Matching Schedule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scheduling	TokenNameIdentifier	 Scheduling
>	TokenNameGREATER	
cycles	TokenNameIdentifier	 cycles
=	TokenNameEQUAL	
DefaultLifecyclesStub	TokenNameIdentifier	 Default Lifecycles Stub
.	TokenNameDOT	
getSchedulingList	TokenNameIdentifier	 get Scheduling List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Schedule	TokenNameIdentifier	 Schedule
schedule	TokenNameIdentifier	 schedule
=	TokenNameEQUAL	
cycles	TokenNameIdentifier	 cycles
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSchedules	TokenNameIdentifier	 get Schedules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
schedule	TokenNameIdentifier	 schedule
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testForceAllComplete	TokenNameIdentifier	 test Force All Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
plan	TokenNameIdentifier	 plan
=	TokenNameEQUAL	
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Stub
.	TokenNameDOT	
getProjectAExceutionPlan	TokenNameIdentifier	 get Project A Exceution Plan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plan	TokenNameIdentifier	 plan
.	TokenNameDOT	
forceAllComplete	TokenNameIdentifier	 force All Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
planItemIterator	TokenNameIdentifier	 plan Item Iterator
=	TokenNameEQUAL	
plan	TokenNameIdentifier	 plan
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
planItemIterator	TokenNameIdentifier	 plan Item Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
planItemIterator	TokenNameIdentifier	 plan Item Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFindLastInPhase	TokenNameIdentifier	 test Find Last In Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
plan	TokenNameIdentifier	 plan
=	TokenNameEQUAL	
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Stub
.	TokenNameDOT	
getProjectAExceutionPlan	TokenNameIdentifier	 get Project A Exceution Plan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
plan	TokenNameIdentifier	 plan
.	TokenNameDOT	
findLastInPhase	TokenNameIdentifier	 find Last In Phase
(	TokenNameLPAREN	
"package"	TokenNameStringLiteral	package
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
beerPhase	TokenNameIdentifier	 beer Phase
=	TokenNameEQUAL	
plan	TokenNameIdentifier	 plan
.	TokenNameDOT	
findLastInPhase	TokenNameIdentifier	 find Last In Phase
(	TokenNameLPAREN	
"BEER"	TokenNameStringLiteral	BEER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Beer comes straight after package in stub 	TokenNameCOMMENT_LINE	Beer comes straight after package in stub 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
beerPhase	TokenNameIdentifier	 beer Phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testThreadSafeMojos	TokenNameIdentifier	 test Thread Safe Mojos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
plan	TokenNameIdentifier	 plan
=	TokenNameEQUAL	
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Stub
.	TokenNameDOT	
getProjectAExceutionPlan	TokenNameIdentifier	 get Project A Exceution Plan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Plugin	TokenNameIdentifier	 Plugin
>	TokenNameGREATER	
unSafePlugins	TokenNameIdentifier	 un Safe Plugins
=	TokenNameEQUAL	
plan	TokenNameIdentifier	 plan
.	TokenNameDOT	
getNonThreadSafePlugins	TokenNameIdentifier	 get Non Thread Safe Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// There is only a single threadsafe plugin here... 	TokenNameCOMMENT_LINE	There is only a single threadsafe plugin here... 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
plan	TokenNameIdentifier	 plan
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
unSafePlugins	TokenNameIdentifier	 un Safe Plugins
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFindLastWhenFirst	TokenNameIdentifier	 test Find Last When First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
plan	TokenNameIdentifier	 plan
=	TokenNameEQUAL	
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Stub
.	TokenNameDOT	
getProjectAExceutionPlan	TokenNameIdentifier	 get Project A Exceution Plan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
beerPhase	TokenNameIdentifier	 beer Phase
=	TokenNameEQUAL	
plan	TokenNameIdentifier	 plan
.	TokenNameDOT	
findLastInPhase	TokenNameIdentifier	 find Last In Phase
(	TokenNameLPAREN	
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Stub
.	TokenNameDOT	
VALIDATE	TokenNameIdentifier	 VALIDATE
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Beer comes straight after package in stub 	TokenNameCOMMENT_LINE	Beer comes straight after package in stub 
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
beerPhase	TokenNameIdentifier	 beer Phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFindLastInPhaseMisc	TokenNameIdentifier	 test Find Last In Phase Misc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
plan	TokenNameIdentifier	 plan
=	TokenNameEQUAL	
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Stub
.	TokenNameDOT	
getProjectAExceutionPlan	TokenNameIdentifier	 get Project A Exceution Plan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
plan	TokenNameIdentifier	 plan
.	TokenNameDOT	
findLastInPhase	TokenNameIdentifier	 find Last In Phase
(	TokenNameLPAREN	
"pacXkage"	TokenNameStringLiteral	pacXkage
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Beer comes straight after package in stub, much like real life. 	TokenNameCOMMENT_LINE	Beer comes straight after package in stub, much like real life. 
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
plan	TokenNameIdentifier	 plan
.	TokenNameDOT	
findLastInPhase	TokenNameIdentifier	 find Last In Phase
(	TokenNameLPAREN	
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Stub
.	TokenNameDOT	
INITIALIZE	TokenNameIdentifier	 INITIALIZE
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
