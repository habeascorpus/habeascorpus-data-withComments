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
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
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
DefaultLifecycles	TokenNameIdentifier	 Default Lifecycles
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
Lifecycle	TokenNameIdentifier	 Lifecycle
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
Schedule	TokenNameIdentifier	 Schedule
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
Scheduling	TokenNameIdentifier	 Scheduling
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
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
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
DefaultLifecyclesStub	TokenNameIdentifier	 Default Lifecycles Stub
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
DefaultLifecycles	TokenNameIdentifier	 Default Lifecycles
createDefaultLifecycles	TokenNameIdentifier	 create Default Lifecycles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stubDefaultCycle	TokenNameIdentifier	 stub Default Cycle
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
VALIDATE	TokenNameIdentifier	 VALIDATE
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
INITIALIZE	TokenNameIdentifier	 INITIALIZE
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
PROCESS_RESOURCES	TokenNameIdentifier	 PROCESS  RESOURCES
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
COMPILE	TokenNameIdentifier	 COMPILE
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TEST	TokenNameIdentifier	 TEST
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
PROCESS_TEST_RESOURCES	TokenNameIdentifier	 PROCESS  TEST  RESOURCES
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
PACKAGE	TokenNameIdentifier	 PACKAGE
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"BEER"	TokenNameStringLiteral	BEER
,	TokenNameCOMMA	
INSTALL	TokenNameIdentifier	 INSTALL
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The two phases below are really for future expansion, some would say they lack a drink 	TokenNameCOMMENT_LINE	The two phases below are really for future expansion, some would say they lack a drink 
// The point being that they do not really have to match the "real" stuff, 	TokenNameCOMMENT_LINE	The point being that they do not really have to match the "real" stuff, 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stubCleanCycle	TokenNameIdentifier	 stub Clean Cycle
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
PRE_CLEAN	TokenNameIdentifier	 PRE  CLEAN
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CLEAN	TokenNameIdentifier	 CLEAN
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
POST_CLEAN	TokenNameIdentifier	 POST  CLEAN
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stubSiteCycle	TokenNameIdentifier	 stub Site Cycle
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
PRE_SITE	TokenNameIdentifier	 PRE  SITE
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SITE	TokenNameIdentifier	 SITE
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
POST_SITE	TokenNameIdentifier	 POST  SITE
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SITE_DEPLOY	TokenNameIdentifier	 SITE  DEPLOY
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
lcs	TokenNameIdentifier	 lcs
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
stubDefaultCycle	TokenNameIdentifier	 stub Default Cycle
,	TokenNameCOMMA	
stubCleanCycle	TokenNameIdentifier	 stub Clean Cycle
,	TokenNameCOMMA	
stubSiteCycle	TokenNameIdentifier	 stub Site Cycle
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
lifeCycles	TokenNameIdentifier	 life Cycles
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
:	TokenNameCOLON	
DefaultLifecycles	TokenNameIdentifier	 Default Lifecycles
.	TokenNameDOT	
STANDARD_LIFECYCLES	TokenNameIdentifier	 STANDARD  LIFECYCLES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Lifecycle	TokenNameIdentifier	 Lifecycle
lifecycle	TokenNameIdentifier	 lifecycle
=	TokenNameEQUAL	
new	TokenNamenew	
Lifecycle	TokenNameIdentifier	 Lifecycle
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
lcs	TokenNameIdentifier	 lcs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lifeCycles	TokenNameIdentifier	 life Cycles
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
lifecycle	TokenNameIdentifier	 lifecycle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultLifecycles	TokenNameIdentifier	 Default Lifecycles
(	TokenNameLPAREN	
lifeCycles	TokenNameIdentifier	 life Cycles
,	TokenNameCOMMA	
new	TokenNamenew	
LoggerStub	TokenNameIdentifier	 Logger Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scheduling	TokenNameIdentifier	 Scheduling
>	TokenNameGREATER	
getSchedulingList	TokenNameIdentifier	 get Scheduling List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
new	TokenNamenew	
Scheduling	TokenNameIdentifier	 Scheduling
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
new	TokenNamenew	
Schedule	TokenNameIdentifier	 Schedule
(	TokenNameLPAREN	
"compile"	TokenNameStringLiteral	compile
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Schedule	TokenNameIdentifier	 Schedule
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
