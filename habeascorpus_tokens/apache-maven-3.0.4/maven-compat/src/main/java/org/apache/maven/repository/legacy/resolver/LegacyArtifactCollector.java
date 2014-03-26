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
resolver	TokenNameIdentifier	 resolver
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
ArtifactMetadataSource	TokenNameIdentifier	 Artifact Metadata Source
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
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
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
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
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
ResolutionListener	TokenNameIdentifier	 Resolution Listener
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
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
conflict	TokenNameIdentifier	 conflict
.	TokenNameDOT	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
;	TokenNameSEMICOLON	
/** * Artifact collector - takes a set of original artifacts and resolves all of the best versions to use * along with their metadata. No artifacts are downloaded. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Artifact collector - takes a set of original artifacts and resolves all of the best versions to use along with their metadata. No artifacts are downloaded. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
LegacyArtifactCollector	TokenNameIdentifier	 Legacy Artifact Collector
{	TokenNameLBRACE	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
originatingArtifact	TokenNameIdentifier	 originating Artifact
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
managedVersions	TokenNameIdentifier	 managed Versions
,	TokenNameCOMMA	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
repositoryRequest	TokenNameIdentifier	 repository Request
,	TokenNameCOMMA	
ArtifactMetadataSource	TokenNameIdentifier	 Artifact Metadata Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
>	TokenNameGREATER	
listeners	TokenNameIdentifier	 listeners
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
>	TokenNameGREATER	
conflictResolvers	TokenNameIdentifier	 conflict Resolvers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
originatingArtifact	TokenNameIdentifier	 originating Artifact
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
managedVersions	TokenNameIdentifier	 managed Versions
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
,	TokenNameCOMMA	
ArtifactMetadataSource	TokenNameIdentifier	 Artifact Metadata Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
>	TokenNameGREATER	
listeners	TokenNameIdentifier	 listeners
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
>	TokenNameGREATER	
conflictResolvers	TokenNameIdentifier	 conflict Resolvers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// used by maven-dependency-tree and maven-dependency-plugin 	TokenNameCOMMENT_LINE	used by maven-dependency-tree and maven-dependency-plugin 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
originatingArtifact	TokenNameIdentifier	 originating Artifact
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
managedVersions	TokenNameIdentifier	 managed Versions
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
,	TokenNameCOMMA	
ArtifactMetadataSource	TokenNameIdentifier	 Artifact Metadata Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
>	TokenNameGREATER	
listeners	TokenNameIdentifier	 listeners
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
