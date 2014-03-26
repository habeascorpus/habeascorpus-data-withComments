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
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
;	TokenNameSEMICOLON	
/** * Describes repository directory metadata. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> * @todo not happy about the store method - they use "this" */	TokenNameCOMMENT_JAVADOC	 Describes repository directory metadata. * @author <a href="mailto:brett@apache.org">Brett Porter</a> @todo not happy about the store method - they use "this" 
public	TokenNamepublic	
interface	TokenNameinterface	
RepositoryMetadata	TokenNameIdentifier	 Repository Metadata
extends	TokenNameextends	
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
{	TokenNameLBRACE	
int	TokenNameint	
RELEASE	TokenNameIdentifier	 RELEASE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
SNAPSHOT	TokenNameIdentifier	 SNAPSHOT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
RELEASE_OR_SNAPSHOT	TokenNameIdentifier	 RELEASE  OR  SNAPSHOT
=	TokenNameEQUAL	
RELEASE	TokenNameIdentifier	 RELEASE
|	TokenNameOR	
SNAPSHOT	TokenNameIdentifier	 SNAPSHOT
;	TokenNameSEMICOLON	
/** * Get the repository the metadata was located in. * * @return the repository */	TokenNameCOMMENT_JAVADOC	 Get the repository the metadata was located in. * @return the repository 
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getRepository	TokenNameIdentifier	 get Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the repository the metadata was located in. * * @param remoteRepository the repository */	TokenNameCOMMENT_JAVADOC	 Set the repository the metadata was located in. * @param remoteRepository the repository 
void	TokenNamevoid	
setRepository	TokenNameIdentifier	 set Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the repository metadata associated with this marker. * * @return the metadata, or <code>null</code> if none loaded */	TokenNameCOMMENT_JAVADOC	 Get the repository metadata associated with this marker. * @return the metadata, or <code>null</code> if none loaded 
Metadata	TokenNameIdentifier	 Metadata
getMetadata	TokenNameIdentifier	 get Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the metadata contents. * * @param metadata the metadata */	TokenNameCOMMENT_JAVADOC	 Set the metadata contents. * @param metadata the metadata 
void	TokenNamevoid	
setMetadata	TokenNameIdentifier	 set Metadata
(	TokenNameLPAREN	
Metadata	TokenNameIdentifier	 Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether this represents a snapshot. * * @return if it is a snapshot */	TokenNameCOMMENT_JAVADOC	 Whether this represents a snapshot. * @return if it is a snapshot 
boolean	TokenNameboolean	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the artifact quality this metadata refers to. One of {@link #RELEASE}, {@link #SNAPSHOT} or * {@link #RELEASE_OR_SNAPSHOT}. * * @return The artifact quality this metadata refers to. */	TokenNameCOMMENT_JAVADOC	 Gets the artifact quality this metadata refers to. One of {@link #RELEASE}, {@link #SNAPSHOT} or {@link #RELEASE_OR_SNAPSHOT}. * @return The artifact quality this metadata refers to. 
int	TokenNameint	
getNature	TokenNameIdentifier	 get Nature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the policy that applies to this metadata regarding the specified repository. * * @param repository The repository for which to determine the policy, must not be {@code null}. * @return The policy, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the policy that applies to this metadata regarding the specified repository. * @param repository The repository for which to determine the policy, must not be {@code null}. @return The policy, never {@code null}. 
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
getPolicy	TokenNameIdentifier	 get Policy
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
