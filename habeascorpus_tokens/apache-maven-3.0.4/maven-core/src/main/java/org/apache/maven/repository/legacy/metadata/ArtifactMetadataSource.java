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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
;	TokenNameSEMICOLON	
/** * Provides some metadata operations, like querying the remote repository for a list of versions available for an * artifact. * * @author <a href="mailto:jason@maven.org">Jason van Zyl </a> */	TokenNameCOMMENT_JAVADOC	 Provides some metadata operations, like querying the remote repository for a list of versions available for an artifact. * @author <a href="mailto:jason@maven.org">Jason van Zyl </a> 
public	TokenNamepublic	
interface	TokenNameinterface	
ArtifactMetadataSource	TokenNameIdentifier	 Artifact Metadata Source
{	TokenNameLBRACE	
ResolutionGroup	TokenNameIdentifier	 Resolution Group
retrieve	TokenNameIdentifier	 retrieve
(	TokenNameLPAREN	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
;	TokenNameSEMICOLON	
ResolutionGroup	TokenNameIdentifier	 Resolution Group
retrieve	TokenNameIdentifier	 retrieve
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
;	TokenNameSEMICOLON	
/** * Get a list of available versions for an artifact in the remote repository * * @param artifact artifact we are interested in. Only <code>groupid</code> and <code>artifactId</code> * are needed, for instance the following code will work * <code>artifactFactory.createProjectArtifact( "org.apache.maven", "maven", "" )</code> * @param localRepository local repository * @param remoteRepositories remote repositories, {@link List} $lt; {@link ArtifactRepository} > * @return {@link List} $lt; {@link ArtifactVersion} > * @throws ArtifactMetadataRetrievalException * in case of error while retrieving repository metadata from the repository. */	TokenNameCOMMENT_JAVADOC	 Get a list of available versions for an artifact in the remote repository * @param artifact artifact we are interested in. Only <code>groupid</code> and <code>artifactId</code> are needed, for instance the following code will work <code>artifactFactory.createProjectArtifact( "org.apache.maven", "maven", "" )</code> @param localRepository local repository @param remoteRepositories remote repositories, {@link List} $lt; {@link ArtifactRepository} > @return {@link List} $lt; {@link ArtifactVersion} > @throws ArtifactMetadataRetrievalException in case of error while retrieving repository metadata from the repository. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
>	TokenNameGREATER	
retrieveAvailableVersions	TokenNameIdentifier	 retrieve Available Versions
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
;	TokenNameSEMICOLON	
/** * Get a list of available versions for an artifact in the remote deployment repository. This ignores any update * policy checks and mirrors and always retrieves the latest information from the given repository. * * @param artifact artifact we are interested in. Only <code>groupid</code> and <code>artifactId</code> are * needed, for instance the following code will work * <code>artifactFactory.createProjectArtifact( "org.apache.maven", "maven", "" )</code> * @param localRepository local repository * @param deploymentRepository remote repository * @return {@link List} $lt; {@link ArtifactVersion} > * @throws ArtifactMetadataRetrievalException * in case of error while retrieving repository metadata from the repository. */	TokenNameCOMMENT_JAVADOC	 Get a list of available versions for an artifact in the remote deployment repository. This ignores any update policy checks and mirrors and always retrieves the latest information from the given repository. * @param artifact artifact we are interested in. Only <code>groupid</code> and <code>artifactId</code> are needed, for instance the following code will work <code>artifactFactory.createProjectArtifact( "org.apache.maven", "maven", "" )</code> @param localRepository local repository @param deploymentRepository remote repository @return {@link List} $lt; {@link ArtifactVersion} > @throws ArtifactMetadataRetrievalException in case of error while retrieving repository metadata from the repository. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
>	TokenNameGREATER	
retrieveAvailableVersionsFromDeploymentRepository	TokenNameIdentifier	 retrieve Available Versions From Deployment Repository
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
