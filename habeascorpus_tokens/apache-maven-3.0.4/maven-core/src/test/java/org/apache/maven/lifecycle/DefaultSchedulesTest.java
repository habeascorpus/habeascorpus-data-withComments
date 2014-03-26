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
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DefaultSchedulesTest	TokenNameIdentifier	 Default Schedules Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
DefaultSchedules	TokenNameIdentifier	 Default Schedules
defaultSchedules	TokenNameIdentifier	 default Schedules
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultSchedulesTest	TokenNameIdentifier	 Default Schedules Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
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
defaultSchedules	TokenNameIdentifier	 default Schedules
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
DefaultSchedules	TokenNameIdentifier	 Default Schedules
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testScheduling	TokenNameIdentifier	 test Scheduling
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
schedulings	TokenNameIdentifier	 schedulings
=	TokenNameEQUAL	
defaultSchedules	TokenNameIdentifier	 default Schedules
.	TokenNameDOT	
getSchedules	TokenNameIdentifier	 get Schedules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultLifecyclesTest	TokenNameIdentifier	 Default Lifecycles Test
.	TokenNameDOT	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
schedulings	TokenNameIdentifier	 schedulings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultLifecyclesTest	TokenNameIdentifier	 Default Lifecycles Test
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
schedulings	TokenNameIdentifier	 schedulings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Scheduling	TokenNameIdentifier	 Scheduling
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
schedulings	TokenNameIdentifier	 schedulings
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultLifecyclesTest	TokenNameIdentifier	 Default Lifecycles Test
.	TokenNameDOT	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getLifecycle	TokenNameIdentifier	 get Lifecycle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Schedule	TokenNameIdentifier	 Schedule
>	TokenNameGREATER	
schedules	TokenNameIdentifier	 schedules
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getSchedules	TokenNameIdentifier	 get Schedules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultLifecyclesTest	TokenNameIdentifier	 Default Lifecycles Test
.	TokenNameDOT	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
schedules	TokenNameIdentifier	 schedules
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ok so if we ever change the first schedule this test will have to change 	TokenNameCOMMENT_LINE	Ok so if we ever change the first schedule this test will have to change 
Schedule	TokenNameIdentifier	 Schedule
firstSchedule	TokenNameIdentifier	 first Schedule
=	TokenNameEQUAL	
schedules	TokenNameIdentifier	 schedules
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultLifecyclesTest	TokenNameIdentifier	 Default Lifecycles Test
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
firstSchedule	TokenNameIdentifier	 first Schedule
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultLifecyclesTest	TokenNameIdentifier	 Default Lifecycles Test
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Should be parllel"	TokenNameStringLiteral	Should be parllel
,	TokenNameCOMMA	
firstSchedule	TokenNameIdentifier	 first Schedule
.	TokenNameDOT	
isParallel	TokenNameIdentifier	 is Parallel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
