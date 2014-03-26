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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
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
/** * @since 3.0 * @author Jason van Zyl * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @since 3.0 @author Jason van Zyl @author Kristian Rosenvold 
// TODO: The configuration for the lifecycle needs to be externalized so that I can use the annotations properly for the 	TokenNameCOMMENT_LINE	TODO: The configuration for the lifecycle needs to be externalized so that I can use the annotations properly for the 
// wiring and reference and external source for the lifecycle configuration. 	TokenNameCOMMENT_LINE	wiring and reference and external source for the lifecycle configuration. 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
DefaultLifecycles	TokenNameIdentifier	 Default Lifecycles
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultLifecycles	TokenNameIdentifier	 Default Lifecycles
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
STANDARD_LIFECYCLES	TokenNameIdentifier	 STANDARD  LIFECYCLES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"clean"	TokenNameStringLiteral	clean
,	TokenNameCOMMA	
"site"	TokenNameStringLiteral	site
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// @Configuration(source="org/apache/maven/lifecycle/lifecycles.xml") 	TokenNameCOMMENT_LINE	@Configuration(source="org/apache/maven/lifecycle/lifecycles.xml") 
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
Lifecycle	TokenNameIdentifier	 Lifecycle
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
lifecycles	TokenNameIdentifier	 lifecycles
;	TokenNameSEMICOLON	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultLifecycles	TokenNameIdentifier	 Default Lifecycles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultLifecycles	TokenNameIdentifier	 Default Lifecycles
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
lifecycles	TokenNameIdentifier	 lifecycles
,	TokenNameCOMMA	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lifecycles	TokenNameIdentifier	 lifecycles
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lifecycles	TokenNameIdentifier	 lifecycles
=	TokenNameEQUAL	
lifecycles	TokenNameIdentifier	 lifecycles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Lifecycle	TokenNameIdentifier	 Lifecycle
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPhaseToLifecycleMap	TokenNameIdentifier	 get Phase To Lifecycle Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * We use this to map all phases to the lifecycle that contains it. This is used so that a user can specify the * phase they want to execute and we can easily determine what lifecycle we need to run. * * @return A map of lifecycles, indexed on id */	TokenNameCOMMENT_JAVADOC	 We use this to map all phases to the lifecycle that contains it. This is used so that a user can specify the phase they want to execute and we can easily determine what lifecycle we need to run. * @return A map of lifecycles, indexed on id 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
getPhaseToLifecycleMap	TokenNameIdentifier	 get Phase To Lifecycle Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If people are going to make their own lifecycles then we need to tell people how to namespace them correctly 	TokenNameCOMMENT_LINE	If people are going to make their own lifecycles then we need to tell people how to namespace them correctly 
// so that they don't interfere with internally defined lifecycles. 	TokenNameCOMMENT_LINE	so that they don't interfere with internally defined lifecycles. 
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
phaseToLifecycleMap	TokenNameIdentifier	 phase To Lifecycle Map
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
Lifecycle	TokenNameIdentifier	 Lifecycle
lifecycle	TokenNameIdentifier	 lifecycle
:	TokenNameCOLON	
getLifeCycles	TokenNameIdentifier	 get Life Cycles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Lifecycle "	TokenNameStringLiteral	Lifecycle 
+	TokenNamePLUS	
lifecycle	TokenNameIdentifier	 lifecycle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
:	TokenNameCOLON	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
getPhases	TokenNameIdentifier	 get Phases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The first definition wins. 	TokenNameCOMMENT_LINE	The first definition wins. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
phaseToLifecycleMap	TokenNameIdentifier	 phase To Lifecycle Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
phaseToLifecycleMap	TokenNameIdentifier	 phase To Lifecycle Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
,	TokenNameCOMMA	
lifecycle	TokenNameIdentifier	 lifecycle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Lifecycle	TokenNameIdentifier	 Lifecycle
original	TokenNameIdentifier	 original
=	TokenNameEQUAL	
phaseToLifecycleMap	TokenNameIdentifier	 phase To Lifecycle Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Duplicated lifecycle phase "	TokenNameStringLiteral	Duplicated lifecycle phase 
+	TokenNamePLUS	
phase	TokenNameIdentifier	 phase
+	TokenNamePLUS	
". Defined in "	TokenNameStringLiteral	. Defined in 
+	TokenNamePLUS	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" but also in "	TokenNameStringLiteral	 but also in 
+	TokenNamePLUS	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
phaseToLifecycleMap	TokenNameIdentifier	 phase To Lifecycle Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
getLifeCycles	TokenNameIdentifier	 get Life Cycles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ensure canonical order of standard lifecycles 	TokenNameCOMMENT_LINE	ensure canonical order of standard lifecycles 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
lifecycles	TokenNameIdentifier	 lifecycles
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
lifecycles	TokenNameIdentifier	 lifecycles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
lifecycleNames	TokenNameIdentifier	 lifecycle Names
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
STANDARD_LIFECYCLES	TokenNameIdentifier	 STANDARD  LIFECYCLES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lifecycleNames	TokenNameIdentifier	 lifecycle Names
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
lifecycles	TokenNameIdentifier	 lifecycles
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
lifecycleNames	TokenNameIdentifier	 lifecycle Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lifecycles	TokenNameIdentifier	 lifecycles
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLifecyclePhaseList	TokenNameIdentifier	 get Lifecycle Phase List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phases	TokenNameIdentifier	 phases
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
Lifecycle	TokenNameIdentifier	 Lifecycle
lifecycle	TokenNameIdentifier	 lifecycle
:	TokenNameCOLON	
lifecycles	TokenNameIdentifier	 lifecycles
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
phases	TokenNameIdentifier	 phases
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
return	TokenNamereturn	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
phases	TokenNameIdentifier	 phases
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
