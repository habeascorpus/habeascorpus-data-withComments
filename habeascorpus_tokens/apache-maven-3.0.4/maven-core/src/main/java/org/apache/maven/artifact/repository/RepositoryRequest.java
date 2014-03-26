package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Collects basic settings to access the repository system. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects basic settings to access the repository system. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
RepositoryRequest	TokenNameIdentifier	 Repository Request
{	TokenNameLBRACE	
/** * Indicates whether network access to remote repositories has been disabled. * * @return {@code true} if remote access has been disabled, {@code false} otherwise. */	TokenNameCOMMENT_JAVADOC	 Indicates whether network access to remote repositories has been disabled. * @return {@code true} if remote access has been disabled, {@code false} otherwise. 
boolean	TokenNameboolean	
isOffline	TokenNameIdentifier	 is Offline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enables/disables network access to remote repositories. * * @param offline {@code true} to disable remote access, {@code false} to allow network access. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Enables/disables network access to remote repositories. * @param offline {@code true} to disable remote access, {@code false} to allow network access. @return This request, never {@code null}. 
RepositoryRequest	TokenNameIdentifier	 Repository Request
setOffline	TokenNameIdentifier	 set Offline
(	TokenNameLPAREN	
boolean	TokenNameboolean	
offline	TokenNameIdentifier	 offline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicates whether remote repositories should be re-checked for updated artifacts/metadata regardless of their * configured update policy. * * @return {@code true} if remote repositories should be re-checked for updated artifacts/metadata, {@code false} * otherwise. */	TokenNameCOMMENT_JAVADOC	 Indicates whether remote repositories should be re-checked for updated artifacts/metadata regardless of their configured update policy. * @return {@code true} if remote repositories should be re-checked for updated artifacts/metadata, {@code false} otherwise. 
boolean	TokenNameboolean	
isForceUpdate	TokenNameIdentifier	 is Force Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enables/disabled forced checks for updated artifacts/metadata on remote repositories. * * @param forceUpdate {@code true} to forcibly check the remote repositories for updated artifacts/metadata, {@code * false} to use the update policy configured on each repository. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Enables/disabled forced checks for updated artifacts/metadata on remote repositories. * @param forceUpdate {@code true} to forcibly check the remote repositories for updated artifacts/metadata, {@code false} to use the update policy configured on each repository. @return This request, never {@code null}. 
RepositoryRequest	TokenNameIdentifier	 Repository Request
setForceUpdate	TokenNameIdentifier	 set Force Update
(	TokenNameLPAREN	
boolean	TokenNameboolean	
forceUpdate	TokenNameIdentifier	 force Update
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the local repository to use. * * @return The local repository to use or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the local repository to use. * @return The local repository to use or {@code null} if not set. 
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the local repository to use. * * @param localRepository The local repository to use. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the local repository to use. * @param localRepository The local repository to use. @return This request, never {@code null}. 
RepositoryRequest	TokenNameIdentifier	 Repository Request
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the remote repositories to use. * * @return The remote repositories to use, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the remote repositories to use. * @return The remote repositories to use, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
getRemoteRepositories	TokenNameIdentifier	 get Remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the remote repositories to use. * * @param remoteRepositories The remote repositories to use. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the remote repositories to use. * @param remoteRepositories The remote repositories to use. @return This request, never {@code null}. 
RepositoryRequest	TokenNameIdentifier	 Repository Request
setRemoteRepositories	TokenNameIdentifier	 set Remote Repositories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
