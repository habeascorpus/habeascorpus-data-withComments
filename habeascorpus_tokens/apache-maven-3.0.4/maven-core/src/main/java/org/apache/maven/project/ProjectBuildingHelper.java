package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
InvalidRepositoryException	TokenNameIdentifier	 Invalid Repository Exception
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
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
Model	TokenNameIdentifier	 Model
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
Repository	TokenNameIdentifier	 Repository
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
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
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
version	TokenNameIdentifier	 version
.	TokenNameDOT	
PluginVersionResolutionException	TokenNameIdentifier	 Plugin Version Resolution Exception
;	TokenNameSEMICOLON	
/** * Assists the project builder. <strong>Warning:</strong> This is an internal utility interface that is only public for * technical reasons, it is not part of the public API. In particular, this interface can be changed or deleted without * prior notice. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Assists the project builder. <strong>Warning:</strong> This is an internal utility interface that is only public for technical reasons, it is not part of the public API. In particular, this interface can be changed or deleted without prior notice. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ProjectBuildingHelper	TokenNameIdentifier	 Project Building Helper
{	TokenNameLBRACE	
/** * Creates the effective artifact repositories from the specified POM repositories. * * @param pomRepositories The POM repositories to create the artifact repositories from, must not be {@code null}. * @param externalRepositories The external (and already mirrored) repositories to merge into the result list, may * be {@code null}. * @param request The project building request holding further settings like repository settings, must not be * {@code null}. * @return The effective artifact repositories, never {@code null}. * @throws InvalidRepositoryException */	TokenNameCOMMENT_JAVADOC	 Creates the effective artifact repositories from the specified POM repositories. * @param pomRepositories The POM repositories to create the artifact repositories from, must not be {@code null}. @param externalRepositories The external (and already mirrored) repositories to merge into the result list, may be {@code null}. @param request The project building request holding further settings like repository settings, must not be {@code null}. @return The effective artifact repositories, never {@code null}. @throws InvalidRepositoryException 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
createArtifactRepositories	TokenNameIdentifier	 create Artifact Repositories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Repository	TokenNameIdentifier	 Repository
>	TokenNameGREATER	
pomRepositories	TokenNameIdentifier	 pom Repositories
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
externalRepositories	TokenNameIdentifier	 external Repositories
,	TokenNameCOMMA	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRepositoryException	TokenNameIdentifier	 Invalid Repository Exception
;	TokenNameSEMICOLON	
/** * Creates the project realm that hosts the build extensions of the specified model. * * @param project The project to create the project realm for, must not be {@code null} * @param model The model to create the project realm for, must not be {@code null} * @param request The project building request holding further settings like repository settings, must not be * {@code null}. * @return The record with the project realm and extension artifact filter, never {@code null}. * @throws PluginResolutionException If any build extension could not be resolved. */	TokenNameCOMMENT_JAVADOC	 Creates the project realm that hosts the build extensions of the specified model. * @param project The project to create the project realm for, must not be {@code null} @param model The model to create the project realm for, must not be {@code null} @param request The project building request holding further settings like repository settings, must not be {@code null}. @return The record with the project realm and extension artifact filter, never {@code null}. @throws PluginResolutionException If any build extension could not be resolved. 
ProjectRealmCache	TokenNameIdentifier	 Project Realm Cache
.	TokenNameDOT	
CacheRecord	TokenNameIdentifier	 Cache Record
createProjectRealm	TokenNameIdentifier	 create Project Realm
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
,	TokenNameCOMMA	
PluginVersionResolutionException	TokenNameIdentifier	 Plugin Version Resolution Exception
;	TokenNameSEMICOLON	
/** * Updates the context class loader such that the container will search the project realm when the model builder * injects the lifecycle bindings from the packaging in the next step. The context class loader is to be reset by * the project builder when the project is fully assembled. * * @param project The project whose class realm should be selected, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Updates the context class loader such that the container will search the project realm when the model builder injects the lifecycle bindings from the packaging in the next step. The context class loader is to be reset by the project builder when the project is fully assembled. * @param project The project whose class realm should be selected, must not be {@code null}. 
void	TokenNamevoid	
selectProjectRealm	TokenNameIdentifier	 select Project Realm
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
