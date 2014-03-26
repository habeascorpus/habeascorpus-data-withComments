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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
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
Set	TokenNameIdentifier	 Set
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Plugin	TokenNameIdentifier	 Plugin
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
//TODO: lifecycles being executed 	TokenNameCOMMENT_LINE	TODO: lifecycles being executed 
//TODO: what runs in each phase 	TokenNameCOMMENT_LINE	TODO: what runs in each phase 
//TODO: plugins that need downloading 	TokenNameCOMMENT_LINE	TODO: plugins that need downloading 
//TODO: project dependencies that need downloading 	TokenNameCOMMENT_LINE	TODO: project dependencies that need downloading 
//TODO: unfortunately the plugins need to be downloaded in order to get the plugin.xml file. need to externalize this 	TokenNameCOMMENT_LINE	TODO: unfortunately the plugins need to be downloaded in order to get the plugin.xml file. need to externalize this 
// from the plugin archive. 	TokenNameCOMMENT_LINE	from the plugin archive. 
//TODO: this will be the class that people get in IDEs to modify 	TokenNameCOMMENT_LINE	TODO: this will be the class that people get in IDEs to modify 
public	TokenNamepublic	
class	TokenNameclass	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
{	TokenNameLBRACE	
/* At the moment, this class is totally immutable, and this is in line with thoughts about the pre-calculated execution plan that stays the same during the execution. If deciding to add mutable state to this class, it should be at least considered to separate this into a separate mutable structure. */	TokenNameCOMMENT_BLOCK	 At the moment, this class is totally immutable, and this is in line with thoughts about the pre-calculated execution plan that stays the same during the execution. If deciding to add mutable state to this class, it should be at least considered to separate this into a separate mutable structure. 
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
planItem	TokenNameIdentifier	 plan Item
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
lastMojoExecutionForAllPhases	TokenNameIdentifier	 last Mojo Execution For All Phases
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phasesInExecutionPlan	TokenNameIdentifier	 phases In Execution Plan
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MavenExecutionPlan	TokenNameIdentifier	 Maven Execution Plan
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
planItem	TokenNameIdentifier	 plan Item
,	TokenNameCOMMA	
DefaultLifecycles	TokenNameIdentifier	 Default Lifecycles
defaultLifecycles	TokenNameIdentifier	 default Lifecycles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
planItem	TokenNameIdentifier	 plan Item
=	TokenNameEQUAL	
planItem	TokenNameIdentifier	 plan Item
;	TokenNameSEMICOLON	
lastMojoExecutionForAllPhases	TokenNameIdentifier	 last Mojo Execution For All Phases
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
totalPhaseSet	TokenNameIdentifier	 total Phase Set
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultLifecycles	TokenNameIdentifier	 default Lifecycles
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
:	TokenNameCOLON	
getDistinctPhasesInOrderOfExecutionPlanAppearance	TokenNameIdentifier	 get Distinct Phases In Order Of Execution Plan Appearance
(	TokenNameLPAREN	
planItem	TokenNameIdentifier	 plan Item
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Lifecycle	TokenNameIdentifier	 Lifecycle
lifecycle	TokenNameIdentifier	 lifecycle
=	TokenNameEQUAL	
defaultLifecycles	TokenNameIdentifier	 default Lifecycles
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lifecycle	TokenNameIdentifier	 lifecycle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalPhaseSet	TokenNameIdentifier	 total Phase Set
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
getPhases	TokenNameIdentifier	 get Phases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
phasesInExecutionPlan	TokenNameIdentifier	 phases In Execution Plan
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
totalPhaseSet	TokenNameIdentifier	 total Phase Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
lastInExistingPhases	TokenNameIdentifier	 last In Existing Phases
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
:	TokenNameCOLON	
getExecutionPlanItems	TokenNameIdentifier	 get Execution Plan Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastInExistingPhases	TokenNameIdentifier	 last In Existing Phases
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
.	TokenNameDOT	
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
lastSeenExecutionPlanItem	TokenNameIdentifier	 last Seen Execution Plan Item
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
:	TokenNameCOLON	
totalPhaseSet	TokenNameIdentifier	 total Phase Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
forThisPhase	TokenNameIdentifier	 for This Phase
=	TokenNameEQUAL	
lastInExistingPhases	TokenNameIdentifier	 last In Existing Phases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
forThisPhase	TokenNameIdentifier	 for This Phase
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastSeenExecutionPlanItem	TokenNameIdentifier	 last Seen Execution Plan Item
=	TokenNameEQUAL	
forThisPhase	TokenNameIdentifier	 for This Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastMojoExecutionForAllPhases	TokenNameIdentifier	 last Mojo Execution For All Phases
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
,	TokenNameCOMMA	
lastSeenExecutionPlanItem	TokenNameIdentifier	 last Seen Execution Plan Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getExecutionPlanItems	TokenNameIdentifier	 get Execution Plan Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the last ExecutionPlanItem in the supplied phase. If no items are in the specified phase, * the closest executionPlanItem from an earlier phase item will be returned. * * @param requestedPhase the requested phase * The execution plan item * @return The ExecutionPlanItem or null if none can be found */	TokenNameCOMMENT_JAVADOC	 Returns the last ExecutionPlanItem in the supplied phase. If no items are in the specified phase, the closest executionPlanItem from an earlier phase item will be returned. * @param requestedPhase the requested phase The execution plan item @return The ExecutionPlanItem or null if none can be found 
public	TokenNamepublic	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
findLastInPhase	TokenNameIdentifier	 find Last In Phase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
requestedPhase	TokenNameIdentifier	 requested Phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastMojoExecutionForAllPhases	TokenNameIdentifier	 last Mojo Execution For All Phases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
requestedPhase	TokenNameIdentifier	 requested Phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
getExecutionPlanItems	TokenNameIdentifier	 get Execution Plan Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
planItem	TokenNameIdentifier	 plan Item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getDistinctPhasesInOrderOfExecutionPlanAppearance	TokenNameIdentifier	 get Distinct Phases In Order Of Execution Plan Appearance
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
planItems	TokenNameIdentifier	 plan Items
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
:	TokenNameCOLON	
planItems	TokenNameIdentifier	 plan Items
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
=	TokenNameEQUAL	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
.	TokenNameDOT	
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
forceAllComplete	TokenNameIdentifier	 force All Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
:	TokenNameCOLON	
getExecutionPlanItems	TokenNameIdentifier	 get Execution Plan Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
.	TokenNameDOT	
forceComplete	TokenNameIdentifier	 force Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
waitUntilAllDone	TokenNameIdentifier	 wait Until All Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
:	TokenNameCOLON	
getExecutionPlanItems	TokenNameIdentifier	 get Execution Plan Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
.	TokenNameDOT	
waitUntilDone	TokenNameIdentifier	 wait Until Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
containsPhase	TokenNameIdentifier	 contains Phase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
phasesInExecutionPlan	TokenNameIdentifier	 phases In Execution Plan
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>	TokenNameGREATER	
getMojoExecutions	TokenNameIdentifier	 get Mojo Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
:	TokenNameCOLON	
planItem	TokenNameIdentifier	 plan Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
.	TokenNameDOT	
getMojoExecution	TokenNameIdentifier	 get Mojo Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Plugin	TokenNameIdentifier	 Plugin
>	TokenNameGREATER	
getNonThreadSafePlugins	TokenNameIdentifier	 get Non Thread Safe Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Plugin	TokenNameIdentifier	 Plugin
>	TokenNameGREATER	
plugins	TokenNameIdentifier	 plugins
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Plugin	TokenNameIdentifier	 Plugin
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
:	TokenNameCOLON	
planItem	TokenNameIdentifier	 plan Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
=	TokenNameEQUAL	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
.	TokenNameDOT	
getMojoExecution	TokenNameIdentifier	 get Mojo Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isThreadSafe	TokenNameIdentifier	 is Thread Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
plugins	TokenNameIdentifier	 plugins
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getPlugin	TokenNameIdentifier	 get Plugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
plugins	TokenNameIdentifier	 plugins
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Used by m2e but will be removed, really. 	TokenNameCOMMENT_LINE	Used by m2e but will be removed, really. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>	TokenNameGREATER	
getExecutions	TokenNameIdentifier	 get Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getMojoExecutions	TokenNameIdentifier	 get Mojo Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
planItem	TokenNameIdentifier	 plan Item
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
