package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
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
import	TokenNameimport	
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
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenSession	TokenNameIdentifier	 Maven Session
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
public	TokenNamepublic	
interface	TokenNameinterface	
ProjectDependenciesResolver	TokenNameIdentifier	 Project Dependencies Resolver
{	TokenNameLBRACE	
/** * Resolves the transitive dependencies of the specified project. * * @param project The project whose dependencies should be resolved, must not be {@code null}. * @param scopesToResolve The dependency scopes that should be resolved, may be {@code null}. * @param session The current build session, must not be {@code null}. * @return The transitive dependencies of the specified project that match the requested scopes, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Resolves the transitive dependencies of the specified project. * @param project The project whose dependencies should be resolved, must not be {@code null}. @param scopesToResolve The dependency scopes that should be resolved, may be {@code null}. @param session The current build session, must not be {@code null}. @return The transitive dependencies of the specified project that match the requested scopes, never {@code null}. 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
scopesToResolve	TokenNameIdentifier	 scopes To Resolve
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
/** * Resolves the transitive dependencies of the specified project. * * @param project The project whose dependencies should be resolved, must not be {@code null}. * @param scopesToCollect The dependency scopes that should be collected, may be {@code null}. * @param scopesToResolve The dependency scopes that should be collected and also resolved, may be {@code null}. * @param session The current build session, must not be {@code null}. * @return The transitive dependencies of the specified project that match the requested scopes, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Resolves the transitive dependencies of the specified project. * @param project The project whose dependencies should be resolved, must not be {@code null}. @param scopesToCollect The dependency scopes that should be collected, may be {@code null}. @param scopesToResolve The dependency scopes that should be collected and also resolved, may be {@code null}. @param session The current build session, must not be {@code null}. @return The transitive dependencies of the specified project that match the requested scopes, never {@code null}. 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
resolve	TokenNameIdentifier	 resolve
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
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
/** * Resolves the transitive dependencies of the specified project. * * @param project The project whose dependencies should be resolved, must not be {@code null}. * @param scopesToCollect The dependency scopes that should be collected, may be {@code null}. * @param scopesToResolve The dependency scopes that should be collected and also resolved, may be {@code null}. * @param session The current build session, must not be {@code null}. * @param ignoreableArtifacts Artifacts that need not be resolved * @return The transitive dependencies of the specified project that match the requested scopes, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Resolves the transitive dependencies of the specified project. * @param project The project whose dependencies should be resolved, must not be {@code null}. @param scopesToCollect The dependency scopes that should be collected, may be {@code null}. @param scopesToResolve The dependency scopes that should be collected and also resolved, may be {@code null}. @param session The current build session, must not be {@code null}. @param ignoreableArtifacts Artifacts that need not be resolved @return The transitive dependencies of the specified project that match the requested scopes, never {@code null}. 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
resolve	TokenNameIdentifier	 resolve
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
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
ignoreableArtifacts	TokenNameIdentifier	 ignoreable Artifacts
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
/** * Resolves the transitive dependencies of the specified projects. Note that dependencies which can't be resolved * from any repository but are present among the set of specified projects will not cause an exception. Instead, * those unresolved artifacts will be returned in the result set, allowing the caller to take special care of * artifacts that haven't been build yet. * * @param projects The projects whose dependencies should be resolved, may be {@code null}. * @param scopes The dependency scopes that should be resolved, may be {@code null}. * @param session The current build session, must not be {@code null}. * @return The transitive dependencies of the specified projects that match the requested scopes, never {@code null} * . */	TokenNameCOMMENT_JAVADOC	 Resolves the transitive dependencies of the specified projects. Note that dependencies which can't be resolved from any repository but are present among the set of specified projects will not cause an exception. Instead, those unresolved artifacts will be returned in the result set, allowing the caller to take special care of artifacts that haven't been build yet. * @param projects The projects whose dependencies should be resolved, may be {@code null}. @param scopes The dependency scopes that should be resolved, may be {@code null}. @param session The current build session, must not be {@code null}. @return The transitive dependencies of the specified projects that match the requested scopes, never {@code null} . 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
scopes	TokenNameIdentifier	 scopes
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
