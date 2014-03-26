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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
RepositoryMetadataStoreException	TokenNameIdentifier	 Repository Metadata Store Exception
;	TokenNameSEMICOLON	
/** * Contains metadata about an artifact, and methods to retrieve/store it from an artifact repository. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> * @todo merge with artifactmetadatasource * @todo retrieval exception not appropriate for store */	TokenNameCOMMENT_JAVADOC	 Contains metadata about an artifact, and methods to retrieve/store it from an artifact repository. * @author <a href="mailto:brett@apache.org">Brett Porter</a> @todo merge with artifactmetadatasource @todo retrieval exception not appropriate for store 
public	TokenNamepublic	
interface	TokenNameinterface	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
{	TokenNameLBRACE	
/** Whether this metadata should be stored alongside the artifact. */	TokenNameCOMMENT_JAVADOC	 Whether this metadata should be stored alongside the artifact. 
boolean	TokenNameboolean	
storedInArtifactVersionDirectory	TokenNameIdentifier	 stored In Artifact Version Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Whether this metadata should be stored alongside the group. */	TokenNameCOMMENT_JAVADOC	 Whether this metadata should be stored alongside the group. 
boolean	TokenNameboolean	
storedInGroupDirectory	TokenNameIdentifier	 stored In Group Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the filename of this metadata on the local repository. * * @param repository the remote repository it came from * @return the filename */	TokenNameCOMMENT_JAVADOC	 Get the filename of this metadata on the local repository. * @param repository the remote repository it came from @return the filename 
String	TokenNameIdentifier	 String
getLocalFilename	TokenNameIdentifier	 get Local Filename
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the filename of this metadata on the remote repository. * * @return the filename */	TokenNameCOMMENT_JAVADOC	 Get the filename of this metadata on the remote repository. * @return the filename 
String	TokenNameIdentifier	 String
getRemoteFilename	TokenNameIdentifier	 get Remote Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Merge a new metadata set into this piece of metadata. * * @param metadata the new metadata * @todo this should only be needed on the repository metadata */	TokenNameCOMMENT_JAVADOC	 Merge a new metadata set into this piece of metadata. * @param metadata the new metadata @todo this should only be needed on the repository metadata 
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Store the metadata in the local repository. * * @param localRepository the local repository * @param remoteRepository the remote repository it came from * @todo this should only be needed on the repository metadata */	TokenNameCOMMENT_JAVADOC	 Store the metadata in the local repository. * @param localRepository the local repository @param remoteRepository the remote repository it came from @todo this should only be needed on the repository metadata 
void	TokenNamevoid	
storeInLocalRepository	TokenNameIdentifier	 store In Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
RepositoryMetadataStoreException	TokenNameIdentifier	 Repository Metadata Store Exception
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
extendedToString	TokenNameIdentifier	 extended To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
