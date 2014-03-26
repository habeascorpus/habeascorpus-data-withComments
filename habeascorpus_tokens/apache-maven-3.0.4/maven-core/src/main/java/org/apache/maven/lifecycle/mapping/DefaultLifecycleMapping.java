package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
mapping	TokenNameIdentifier	 mapping
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DefaultLifecycleMapping	TokenNameIdentifier	 Default Lifecycle Mapping
implements	TokenNameimplements	
LifecycleMapping	TokenNameIdentifier	 Lifecycle Mapping
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
lifecycles	TokenNameIdentifier	 lifecycles
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
lifecycleMap	TokenNameIdentifier	 lifecycle Map
;	TokenNameSEMICOLON	
/** @deprecated use lifecycles instead */	TokenNameCOMMENT_JAVADOC	 @deprecated use lifecycles instead 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phases	TokenNameIdentifier	 phases
;	TokenNameSEMICOLON	
/** * Populates the lifecycle map from the injected list of lifecycle mappings (if not already done). */	TokenNameCOMMENT_JAVADOC	 Populates the lifecycle map from the injected list of lifecycle mappings (if not already done). 
private	TokenNameprivate	
void	TokenNamevoid	
initLifecycleMap	TokenNameIdentifier	 init Lifecycle Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lifecycleMap	TokenNameIdentifier	 lifecycle Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lifecycleMap	TokenNameIdentifier	 lifecycle Map
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
if	TokenNameif	
(	TokenNameLPAREN	
lifecycles	TokenNameIdentifier	 lifecycles
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Lifecycle	TokenNameIdentifier	 Lifecycle
lifecycle	TokenNameIdentifier	 lifecycle
:	TokenNameCOLON	
lifecycles	TokenNameIdentifier	 lifecycles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lifecycleMap	TokenNameIdentifier	 lifecycle Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lifecycle	TokenNameIdentifier	 lifecycle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* * NOTE: This is to provide a migration path for implementors of the legacy API which did not know about * getLifecycles(). */	TokenNameCOMMENT_BLOCK	 NOTE: This is to provide a migration path for implementors of the legacy API which did not know about getLifecycles(). 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lifecycleIds	TokenNameIdentifier	 lifecycle Ids
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"clean"	TokenNameStringLiteral	clean
,	TokenNameCOMMA	
"site"	TokenNameStringLiteral	site
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lifecycleId	TokenNameIdentifier	 lifecycle Id
:	TokenNameCOLON	
lifecycleIds	TokenNameIdentifier	 lifecycle Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phases	TokenNameIdentifier	 phases
=	TokenNameEQUAL	
getPhases	TokenNameIdentifier	 get Phases
(	TokenNameLPAREN	
lifecycleId	TokenNameIdentifier	 lifecycle Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
phases	TokenNameIdentifier	 phases
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Lifecycle	TokenNameIdentifier	 Lifecycle
lifecycle	TokenNameIdentifier	 lifecycle
=	TokenNameEQUAL	
new	TokenNamenew	
Lifecycle	TokenNameIdentifier	 Lifecycle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
lifecycleId	TokenNameIdentifier	 lifecycle Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
setPhases	TokenNameIdentifier	 set Phases
(	TokenNameLPAREN	
phases	TokenNameIdentifier	 phases
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lifecycleMap	TokenNameIdentifier	 lifecycle Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
lifecycleId	TokenNameIdentifier	 lifecycle Id
,	TokenNameCOMMA	
lifecycle	TokenNameIdentifier	 lifecycle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Lifecycle	TokenNameIdentifier	 Lifecycle
>	TokenNameGREATER	
getLifecycles	TokenNameIdentifier	 get Lifecycles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initLifecycleMap	TokenNameIdentifier	 init Lifecycle Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lifecycleMap	TokenNameIdentifier	 lifecycle Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getOptionalMojos	TokenNameIdentifier	 get Optional Mojos
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lifecycle	TokenNameIdentifier	 lifecycle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getPhases	TokenNameIdentifier	 get Phases
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lifecycle	TokenNameIdentifier	 lifecycle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initLifecycleMap	TokenNameIdentifier	 init Lifecycle Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Lifecycle	TokenNameIdentifier	 Lifecycle
lifecycleMapping	TokenNameIdentifier	 lifecycle Mapping
=	TokenNameEQUAL	
lifecycleMap	TokenNameIdentifier	 lifecycle Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lifecycle	TokenNameIdentifier	 lifecycle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lifecycleMapping	TokenNameIdentifier	 lifecycle Mapping
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lifecycleMapping	TokenNameIdentifier	 lifecycle Mapping
.	TokenNameDOT	
getPhases	TokenNameIdentifier	 get Phases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
lifecycle	TokenNameIdentifier	 lifecycle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
phases	TokenNameIdentifier	 phases
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
