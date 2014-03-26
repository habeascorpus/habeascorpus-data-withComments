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
/** * Class Scheduling. * * @since 3.0 */	TokenNameCOMMENT_JAVADOC	 Class Scheduling. * @since 3.0 
public	TokenNamepublic	
class	TokenNameclass	
Scheduling	TokenNameIdentifier	 Scheduling
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lifecycle	TokenNameIdentifier	 lifecycle
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Schedule	TokenNameIdentifier	 Schedule
>	TokenNameGREATER	
schedules	TokenNameIdentifier	 schedules
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Scheduling	TokenNameIdentifier	 Scheduling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Scheduling	TokenNameIdentifier	 Scheduling
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lifecycle	TokenNameIdentifier	 lifecycle
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Schedule	TokenNameIdentifier	 Schedule
>	TokenNameGREATER	
schedules	TokenNameIdentifier	 schedules
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
=	TokenNameEQUAL	
lifecycle	TokenNameIdentifier	 lifecycle
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
schedules	TokenNameIdentifier	 schedules
=	TokenNameEQUAL	
schedules	TokenNameIdentifier	 schedules
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLifecycle	TokenNameIdentifier	 get Lifecycle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lifecycle	TokenNameIdentifier	 lifecycle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLifecycle	TokenNameIdentifier	 set Lifecycle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lifecycle	TokenNameIdentifier	 lifecycle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
=	TokenNameEQUAL	
lifecycle	TokenNameIdentifier	 lifecycle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Schedule	TokenNameIdentifier	 Schedule
>	TokenNameGREATER	
getSchedules	TokenNameIdentifier	 get Schedules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
schedules	TokenNameIdentifier	 schedules
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Schedule	TokenNameIdentifier	 Schedule
getSchedule	TokenNameIdentifier	 get Schedule
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
phaseName	TokenNameIdentifier	 phase Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
phaseName	TokenNameIdentifier	 phase Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Schedule	TokenNameIdentifier	 Schedule
schedule	TokenNameIdentifier	 schedule
:	TokenNameCOLON	
schedules	TokenNameIdentifier	 schedules
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
phaseName	TokenNameIdentifier	 phase Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
schedule	TokenNameIdentifier	 schedule
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
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
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Schedule	TokenNameIdentifier	 Schedule
getSchedule	TokenNameIdentifier	 get Schedule
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Schedule	TokenNameIdentifier	 Schedule
schedule	TokenNameIdentifier	 schedule
:	TokenNameCOLON	
schedules	TokenNameIdentifier	 schedules
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
schedule	TokenNameIdentifier	 schedule
.	TokenNameDOT	
appliesTo	TokenNameIdentifier	 applies To
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
schedule	TokenNameIdentifier	 schedule
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSchedules	TokenNameIdentifier	 set Schedules
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Schedule	TokenNameIdentifier	 Schedule
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
}	TokenNameRBRACE	
