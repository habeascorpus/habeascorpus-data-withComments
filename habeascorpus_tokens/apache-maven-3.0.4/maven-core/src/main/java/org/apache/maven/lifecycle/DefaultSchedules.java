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
BuilderCommon	TokenNameIdentifier	 Builder Common
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
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
MojoExecution	TokenNameIdentifier	 Mojo Execution
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Defines scheduling information needed by weave mode. * * @since 3.0 * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 Defines scheduling information needed by weave mode. * @since 3.0 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
DefaultSchedules	TokenNameIdentifier	 Default Schedules
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scheduling	TokenNameIdentifier	 Scheduling
>	TokenNameGREATER	
schedules	TokenNameIdentifier	 schedules
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultSchedules	TokenNameIdentifier	 Default Schedules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultSchedules	TokenNameIdentifier	 Default Schedules
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scheduling	TokenNameIdentifier	 Scheduling
>	TokenNameGREATER	
schedules	TokenNameIdentifier	 schedules
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
schedules	TokenNameIdentifier	 schedules
=	TokenNameEQUAL	
schedules	TokenNameIdentifier	 schedules
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
createExecutionPlanItem	TokenNameIdentifier	 create Execution Plan Item
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>	TokenNameGREATER	
executions	TokenNameIdentifier	 executions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BuilderCommon	TokenNameIdentifier	 Builder Common
.	TokenNameDOT	
attachToThread	TokenNameIdentifier	 attach To Thread
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
:	TokenNameCOLON	
executions	TokenNameIdentifier	 executions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lifeCyclePhase	TokenNameIdentifier	 life Cycle Phase
=	TokenNameEQUAL	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Scheduling	TokenNameIdentifier	 Scheduling
scheduling	TokenNameIdentifier	 scheduling
=	TokenNameEQUAL	
getScheduling	TokenNameIdentifier	 get Scheduling
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Schedule	TokenNameIdentifier	 Schedule
schedule	TokenNameIdentifier	 schedule
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scheduling	TokenNameIdentifier	 scheduling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schedule	TokenNameIdentifier	 schedule
=	TokenNameEQUAL	
scheduling	TokenNameIdentifier	 scheduling
.	TokenNameDOT	
getSchedule	TokenNameIdentifier	 get Schedule
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
schedule	TokenNameIdentifier	 schedule
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schedule	TokenNameIdentifier	 schedule
=	TokenNameEQUAL	
scheduling	TokenNameIdentifier	 scheduling
.	TokenNameDOT	
getSchedule	TokenNameIdentifier	 get Schedule
(	TokenNameLPAREN	
lifeCyclePhase	TokenNameIdentifier	 life Cycle Phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
schedule	TokenNameIdentifier	 schedule
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets scheduling associated with a given phase. * <p/> * This is part of the experimental weave mode and therefore not part of the public api. * * @param lifecyclePhaseName The name of the lifecycle phase * @return Schecduling information related to phase */	TokenNameCOMMENT_JAVADOC	 Gets scheduling associated with a given phase. <p/> This is part of the experimental weave mode and therefore not part of the public api. * @param lifecyclePhaseName The name of the lifecycle phase @return Schecduling information related to phase 
Scheduling	TokenNameIdentifier	 Scheduling
getScheduling	TokenNameIdentifier	 get Scheduling
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lifecyclePhaseName	TokenNameIdentifier	 lifecycle Phase Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Scheduling	TokenNameIdentifier	 Scheduling
schedule	TokenNameIdentifier	 schedule
:	TokenNameCOLON	
schedules	TokenNameIdentifier	 schedules
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lifecyclePhaseName	TokenNameIdentifier	 lifecycle Phase Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
schedule	TokenNameIdentifier	 schedule
.	TokenNameDOT	
getLifecycle	TokenNameIdentifier	 get Lifecycle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
schedule	TokenNameIdentifier	 schedule
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scheduling	TokenNameIdentifier	 Scheduling
>	TokenNameGREATER	
getSchedules	TokenNameIdentifier	 get Schedules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
schedules	TokenNameIdentifier	 schedules
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
