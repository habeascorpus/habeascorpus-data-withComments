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
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
;	TokenNameSEMICOLON	
/** * Context of dependency artifacts for a particular project. * * @since 3.0 * @author Benjamin Bentmann * @author Kristian Rosenvold (class extract only) * <p/> * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 Context of dependency artifacts for a particular project. * @since 3.0 @author Benjamin Bentmann @author Kristian Rosenvold (class extract only) <p/> NOTE: This class is not part of any public api and can be changed or deleted without prior notice. 
// TODO: From a concurrency perspective, this class is not good. The combination of mutable/immutable state is not nice 	TokenNameCOMMENT_LINE	TODO: From a concurrency perspective, this class is not good. The combination of mutable/immutable state is not nice 
public	TokenNamepublic	
class	TokenNameclass	
DependencyContext	TokenNameIdentifier	 Dependency Context
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
scopesToCollectForCurrentProject	TokenNameIdentifier	 scopes To Collect For Current Project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
scopesToResolveForCurrentProject	TokenNameIdentifier	 scopes To Resolve For Current Project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
scopesToCollectForAggregatedProjects	TokenNameIdentifier	 scopes To Collect For Aggregated Projects
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
scopesToResolveForAggregatedProjects	TokenNameIdentifier	 scopes To Resolve For Aggregated Projects
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
lastDependencyArtifacts	TokenNameIdentifier	 last Dependency Artifacts
=	TokenNameEQUAL	
UNRESOLVED	TokenNameIdentifier	 UNRESOLVED
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
lastDependencyArtifactCount	TokenNameIdentifier	 last Dependency Artifact Count
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DependencyContext	TokenNameIdentifier	 Dependency Context
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
scopesToCollect	TokenNameIdentifier	 scopes To Collect
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
scopesToResolve	TokenNameIdentifier	 scopes To Resolve
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
scopesToCollectForCurrentProject	TokenNameIdentifier	 scopes To Collect For Current Project
=	TokenNameEQUAL	
scopesToCollect	TokenNameIdentifier	 scopes To Collect
;	TokenNameSEMICOLON	
scopesToResolveForCurrentProject	TokenNameIdentifier	 scopes To Resolve For Current Project
=	TokenNameEQUAL	
scopesToResolve	TokenNameIdentifier	 scopes To Resolve
;	TokenNameSEMICOLON	
scopesToCollectForAggregatedProjects	TokenNameIdentifier	 scopes To Collect For Aggregated Projects
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scopesToResolveForAggregatedProjects	TokenNameIdentifier	 scopes To Resolve For Aggregated Projects
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getScopesToCollectForCurrentProject	TokenNameIdentifier	 get Scopes To Collect For Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scopesToCollectForCurrentProject	TokenNameIdentifier	 scopes To Collect For Current Project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getScopesToResolveForCurrentProject	TokenNameIdentifier	 get Scopes To Resolve For Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scopesToResolveForCurrentProject	TokenNameIdentifier	 scopes To Resolve For Current Project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getScopesToCollectForAggregatedProjects	TokenNameIdentifier	 get Scopes To Collect For Aggregated Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scopesToCollectForAggregatedProjects	TokenNameIdentifier	 scopes To Collect For Aggregated Projects
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getScopesToResolveForAggregatedProjects	TokenNameIdentifier	 get Scopes To Resolve For Aggregated Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scopesToResolveForAggregatedProjects	TokenNameIdentifier	 scopes To Resolve For Aggregated Projects
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isResolutionRequiredForCurrentProject	TokenNameIdentifier	 is Resolution Required For Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastDependencyArtifacts	TokenNameIdentifier	 last Dependency Artifacts
!=	TokenNameNOT_EQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getDependencyArtifacts	TokenNameIdentifier	 get Dependency Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
lastDependencyArtifacts	TokenNameIdentifier	 last Dependency Artifacts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
lastDependencyArtifactCount	TokenNameIdentifier	 last Dependency Artifact Count
!=	TokenNameNOT_EQUAL	
lastDependencyArtifacts	TokenNameIdentifier	 last Dependency Artifacts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isResolutionRequiredForAggregatedProjects	TokenNameIdentifier	 is Resolution Required For Aggregated Projects
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
scopesToCollect	TokenNameIdentifier	 scopes To Collect
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
scopesToResolve	TokenNameIdentifier	 scopes To Resolve
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
required	TokenNameIdentifier	 required
=	TokenNameEQUAL	
scopesToCollectForAggregatedProjects	TokenNameIdentifier	 scopes To Collect For Aggregated Projects
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
scopesToCollect	TokenNameIdentifier	 scopes To Collect
)	TokenNameRPAREN	
||	TokenNameOR_OR	
scopesToResolveForAggregatedProjects	TokenNameIdentifier	 scopes To Resolve For Aggregated Projects
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
scopesToResolve	TokenNameIdentifier	 scopes To Resolve
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
required	TokenNameIdentifier	 required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
synchronizeWithProjectState	TokenNameIdentifier	 synchronize With Project State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastDependencyArtifacts	TokenNameIdentifier	 last Dependency Artifacts
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getDependencyArtifacts	TokenNameIdentifier	 get Dependency Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDependencyArtifactCount	TokenNameIdentifier	 last Dependency Artifact Count
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lastDependencyArtifacts	TokenNameIdentifier	 last Dependency Artifacts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
lastDependencyArtifacts	TokenNameIdentifier	 last Dependency Artifacts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
