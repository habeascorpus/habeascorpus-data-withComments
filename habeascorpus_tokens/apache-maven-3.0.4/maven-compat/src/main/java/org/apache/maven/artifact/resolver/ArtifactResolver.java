package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
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
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
TransferListener	TokenNameIdentifier	 Transfer Listener
;	TokenNameSEMICOLON	
/** * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
// Just hide the one method we want behind the RepositorySystem interface. 	TokenNameCOMMENT_LINE	Just hide the one method we want behind the RepositorySystem interface. 
public	TokenNamepublic	
interface	TokenNameinterface	
ArtifactResolver	TokenNameIdentifier	 Artifact Resolver
{	TokenNameLBRACE	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The rest is deprecated 	TokenNameCOMMENT_LINE	The rest is deprecated 
// USED BY MAVEN ASSEMBLY PLUGIN 2.2-beta-2 	TokenNameCOMMENT_LINE	USED BY MAVEN ASSEMBLY PLUGIN 2.2-beta-2 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
ArtifactResolver	TokenNameIdentifier	 Artifact Resolver
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// USED BY SUREFIRE 	TokenNameCOMMENT_LINE	USED BY SUREFIRE 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
resolveTransitively	TokenNameIdentifier	 resolve Transitively
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
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
// USED BY MAVEN ASSEMBLY PLUGIN 	TokenNameCOMMENT_LINE	USED BY MAVEN ASSEMBLY PLUGIN 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
resolveTransitively	TokenNameIdentifier	 resolve Transitively
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
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
// USED BY MAVEN ASSEMBLY PLUGIN 	TokenNameCOMMENT_LINE	USED BY MAVEN ASSEMBLY PLUGIN 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
resolveTransitively	TokenNameIdentifier	 resolve Transitively
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
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
resolveTransitively	TokenNameIdentifier	 resolve Transitively
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ArtifactMetadataSource	TokenNameIdentifier	 Artifact Metadata Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
resolveTransitively	TokenNameIdentifier	 resolve Transitively
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
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
resolveTransitively	TokenNameIdentifier	 resolve Transitively
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ArtifactMetadataSource	TokenNameIdentifier	 Artifact Metadata Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
>	TokenNameGREATER	
listeners	TokenNameIdentifier	 listeners
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
// USED BY REMOTE RESOURCES PLUGIN 	TokenNameCOMMENT_LINE	USED BY REMOTE RESOURCES PLUGIN 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
// USED BY REMOTE RESOURCES PLUGIN 	TokenNameCOMMENT_LINE	USED BY REMOTE RESOURCES PLUGIN 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
TransferListener	TokenNameIdentifier	 Transfer Listener
downloadMonitor	TokenNameIdentifier	 download Monitor
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
// USED BY ARCHETYPE DOWNLOADER 	TokenNameCOMMENT_LINE	USED BY ARCHETYPE DOWNLOADER 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
void	TokenNamevoid	
resolveAlways	TokenNameIdentifier	 resolve Always
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
