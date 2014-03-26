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
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier	 Lifecycle Execution Plan Calculator Stub
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
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
MojoExecution	TokenNameIdentifier	 Mojo Execution
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
PhaseRecorderTest	TokenNameIdentifier	 Phase Recorder Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testObserveExecution	TokenNameIdentifier	 test Observe Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PhaseRecorder	TokenNameIdentifier	 Phase Recorder
phaseRecorder	TokenNameIdentifier	 phase Recorder
=	TokenNameEQUAL	
new	TokenNamenew	
PhaseRecorder	TokenNameIdentifier	 Phase Recorder
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>	TokenNameGREATER	
executions	TokenNameIdentifier	 executions
=	TokenNameEQUAL	
plan	TokenNameIdentifier	 plan
.	TokenNameDOT	
getMojoExecutions	TokenNameIdentifier	 get Mojo Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution1	TokenNameIdentifier	 mojo Execution1
=	TokenNameEQUAL	
executions	TokenNameIdentifier	 executions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution2	TokenNameIdentifier	 mojo Execution2
=	TokenNameEQUAL	
executions	TokenNameIdentifier	 executions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
phaseRecorder	TokenNameIdentifier	 phase Recorder
.	TokenNameDOT	
observeExecution	TokenNameIdentifier	 observe Execution
(	TokenNameLPAREN	
mojoExecution1	TokenNameIdentifier	 mojo Execution1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
A	TokenNameIdentifier	 A
.	TokenNameDOT	
hasLifecyclePhase	TokenNameIdentifier	 has Lifecycle Phase
(	TokenNameLPAREN	
mojoExecution1	TokenNameIdentifier	 mojo Execution1
.	TokenNameDOT	
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
A	TokenNameIdentifier	 A
.	TokenNameDOT	
hasLifecyclePhase	TokenNameIdentifier	 has Lifecycle Phase
(	TokenNameLPAREN	
mojoExecution2	TokenNameIdentifier	 mojo Execution2
.	TokenNameDOT	
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
phaseRecorder	TokenNameIdentifier	 phase Recorder
.	TokenNameDOT	
isDifferentPhase	TokenNameIdentifier	 is Different Phase
(	TokenNameLPAREN	
mojoExecution1	TokenNameIdentifier	 mojo Execution1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
phaseRecorder	TokenNameIdentifier	 phase Recorder
.	TokenNameDOT	
isDifferentPhase	TokenNameIdentifier	 is Different Phase
(	TokenNameLPAREN	
mojoExecution2	TokenNameIdentifier	 mojo Execution2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
