package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
Artifact	TokenNameIdentifier	 Artifact
;	TokenNameSEMICOLON	
/** * Filter to only retain objects in the given artifactScope or better. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Filter to only retain objects in the given artifactScope or better. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractScopeArtifactFilter	TokenNameIdentifier	 Abstract Scope Artifact Filter
implements	TokenNameimplements	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
compileScope	TokenNameIdentifier	 compile Scope
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
runtimeScope	TokenNameIdentifier	 runtime Scope
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
testScope	TokenNameIdentifier	 test Scope
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
providedScope	TokenNameIdentifier	 provided Scope
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
systemScope	TokenNameIdentifier	 system Scope
;	TokenNameSEMICOLON	
void	TokenNamevoid	
addScopeInternal	TokenNameIdentifier	 add Scope Internal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
systemScope	TokenNameIdentifier	 system Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
providedScope	TokenNameIdentifier	 provided Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
compileScope	TokenNameIdentifier	 compile Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compileScope	TokenNameIdentifier	 compile Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
runtimeScope	TokenNameIdentifier	 runtime Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE_PLUS_RUNTIME	TokenNameIdentifier	 SCOPE  COMPILE  PLUS  RUNTIME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
systemScope	TokenNameIdentifier	 system Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
providedScope	TokenNameIdentifier	 provided Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
compileScope	TokenNameIdentifier	 compile Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
runtimeScope	TokenNameIdentifier	 runtime Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME_PLUS_SYSTEM	TokenNameIdentifier	 SCOPE  RUNTIME  PLUS  SYSTEM
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
systemScope	TokenNameIdentifier	 system Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
compileScope	TokenNameIdentifier	 compile Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
runtimeScope	TokenNameIdentifier	 runtime Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
systemScope	TokenNameIdentifier	 system Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
providedScope	TokenNameIdentifier	 provided Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
compileScope	TokenNameIdentifier	 compile Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
runtimeScope	TokenNameIdentifier	 runtime Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
testScope	TokenNameIdentifier	 test Scope
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compileScope	TokenNameIdentifier	 compile Scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runtimeScope	TokenNameIdentifier	 runtime Scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
testScope	TokenNameIdentifier	 test Scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
providedScope	TokenNameIdentifier	 provided Scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
systemScope	TokenNameIdentifier	 system Scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
