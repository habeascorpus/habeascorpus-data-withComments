package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
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
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
RepositoryRequest	TokenNameIdentifier	 Repository Request
;	TokenNameSEMICOLON	
/** * Forms a request to retrieve artifact metadata. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Forms a request to retrieve artifact metadata. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
extends	TokenNameextends	
RepositoryRequest	TokenNameIdentifier	 Repository Request
{	TokenNameLBRACE	
/** * Indicates whether network access to remote repositories has been disabled. * * @return {@code true} if remote access has been disabled, {@code false} otherwise. */	TokenNameCOMMENT_JAVADOC	 Indicates whether network access to remote repositories has been disabled. * @return {@code true} if remote access has been disabled, {@code false} otherwise. 
boolean	TokenNameboolean	
isOffline	TokenNameIdentifier	 is Offline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enables/disables network access to remote repositories. * * @param offline {@code true} to disable remote access, {@code false} to allow network access. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Enables/disables network access to remote repositories. * @param offline {@code true} to disable remote access, {@code false} to allow network access. @return This request, never {@code null}. 
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setOffline	TokenNameIdentifier	 set Offline
(	TokenNameLPAREN	
boolean	TokenNameboolean	
offline	TokenNameIdentifier	 offline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the artifact to resolve metadata for. * * @return The artifact to resolve metadata for or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the artifact to resolve metadata for. * @return The artifact to resolve metadata for or {@code null} if not set. 
Artifact	TokenNameIdentifier	 Artifact
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the artifact for which to resolve metadata. * * @param artifact The artifact for which to resolve metadata. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the artifact for which to resolve metadata. * @param artifact The artifact for which to resolve metadata. @return This request, never {@code null}. 
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setArtifact	TokenNameIdentifier	 set Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the local repository to use for the resolution. * * @return The local repository to use for the resolution or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the local repository to use for the resolution. * @return The local repository to use for the resolution or {@code null} if not set. 
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the local repository to use for the resolution. * * @param localRepository The local repository to use for the resolution. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the local repository to use for the resolution. * @param localRepository The local repository to use for the resolution. @return This request, never {@code null}. 
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the remote repositories to use for the resolution. * * @return The remote repositories to use for the resolution, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the remote repositories to use for the resolution. * @return The remote repositories to use for the resolution, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
getRemoteRepositories	TokenNameIdentifier	 get Remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the remote repositories to use for the resolution. * * @param remoteRepositories The remote repositories to use for the resolution. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the remote repositories to use for the resolution. * @param remoteRepositories The remote repositories to use for the resolution. @return This request, never {@code null}. 
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setRemoteRepositories	TokenNameIdentifier	 set Remote Repositories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines whether the managed version information should be retrieved. * * @return {@code true} if the dependency management information should be retrieved, {@code false} otherwise. */	TokenNameCOMMENT_JAVADOC	 Determines whether the managed version information should be retrieved. * @return {@code true} if the dependency management information should be retrieved, {@code false} otherwise. 
boolean	TokenNameboolean	
isResolveManagedVersions	TokenNameIdentifier	 is Resolve Managed Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enables/disables resolution of the dependency manageemnt information. * * @param resolveManagedVersions {@code true} if the dependency management information should be retrieved, {@code * false} otherwise. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Enables/disables resolution of the dependency manageemnt information. * @param resolveManagedVersions {@code true} if the dependency management information should be retrieved, {@code false} otherwise. @return This request, never {@code null}. 
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setResolveManagedVersions	TokenNameIdentifier	 set Resolve Managed Versions
(	TokenNameLPAREN	
boolean	TokenNameboolean	
resolveManagedVersions	TokenNameIdentifier	 resolve Managed Versions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
