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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
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
public	TokenNamepublic	
interface	TokenNameinterface	
RepositoryMetadataManager	TokenNameIdentifier	 Repository Metadata Manager
{	TokenNameLBRACE	
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
RepositoryMetadata	TokenNameIdentifier	 Repository Metadata
repositoryMetadata	TokenNameIdentifier	 repository Metadata
,	TokenNameCOMMA	
RepositoryRequest	TokenNameIdentifier	 Repository Request
repositoryRequest	TokenNameIdentifier	 repository Request
)	TokenNameRPAREN	
throws	TokenNamethrows	
RepositoryMetadataResolutionException	TokenNameIdentifier	 Repository Metadata Resolution Exception
;	TokenNameSEMICOLON	
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
RepositoryMetadata	TokenNameIdentifier	 Repository Metadata
repositoryMetadata	TokenNameIdentifier	 repository Metadata
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
RepositoryMetadataResolutionException	TokenNameIdentifier	 Repository Metadata Resolution Exception
;	TokenNameSEMICOLON	
void	TokenNamevoid	
resolveAlways	TokenNameIdentifier	 resolve Always
(	TokenNameLPAREN	
RepositoryMetadata	TokenNameIdentifier	 Repository Metadata
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
RepositoryMetadataResolutionException	TokenNameIdentifier	 Repository Metadata Resolution Exception
;	TokenNameSEMICOLON	
/** * Deploy metadata to the remote repository. * * @param metadata the metadata to deploy * @param localRepository the local repository to install to first * @param deploymentRepository the remote repository to deploy to */	TokenNameCOMMENT_JAVADOC	 Deploy metadata to the remote repository. * @param metadata the metadata to deploy @param localRepository the local repository to install to first @param deploymentRepository the remote repository to deploy to 
void	TokenNamevoid	
deploy	TokenNameIdentifier	 deploy
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
deploymentRepository	TokenNameIdentifier	 deployment Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
RepositoryMetadataDeploymentException	TokenNameIdentifier	 Repository Metadata Deployment Exception
;	TokenNameSEMICOLON	
/** * Install the metadata in the local repository. * * @param metadata the metadata * @param localRepository the local repository */	TokenNameCOMMENT_JAVADOC	 Install the metadata in the local repository. * @param metadata the metadata @param localRepository the local repository 
void	TokenNamevoid	
install	TokenNameIdentifier	 install
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
RepositoryMetadataInstallationException	TokenNameIdentifier	 Repository Metadata Installation Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
