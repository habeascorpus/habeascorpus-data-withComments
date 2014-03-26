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
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
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
/** * Forms a request to retrieve artifact metadata. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Forms a request to retrieve artifact metadata. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultMetadataResolutionRequest	TokenNameIdentifier	 Default Metadata Resolution Request
implements	TokenNameimplements	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
{	TokenNameLBRACE	
private	TokenNameprivate	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
resolveManagedVersions	TokenNameIdentifier	 resolve Managed Versions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RepositoryRequest	TokenNameIdentifier	 Repository Request
repositoryRequest	TokenNameIdentifier	 repository Request
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultMetadataResolutionRequest	TokenNameIdentifier	 Default Metadata Resolution Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repositoryRequest	TokenNameIdentifier	 repository Request
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultMetadataResolutionRequest	TokenNameIdentifier	 Default Metadata Resolution Request
(	TokenNameLPAREN	
RepositoryRequest	TokenNameIdentifier	 Repository Request
repositoryRequest	TokenNameIdentifier	 repository Request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repositoryRequest	TokenNameIdentifier	 repository Request
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
(	TokenNameLPAREN	
repositoryRequest	TokenNameIdentifier	 repository Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultMetadataResolutionRequest	TokenNameIdentifier	 Default Metadata Resolution Request
(	TokenNameLPAREN	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
resolutionRequest	TokenNameIdentifier	 resolution Request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repositoryRequest	TokenNameIdentifier	 repository Request
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
(	TokenNameLPAREN	
resolutionRequest	TokenNameIdentifier	 resolution Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Artifact	TokenNameIdentifier	 Artifact
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultMetadataResolutionRequest	TokenNameIdentifier	 Default Metadata Resolution Request
setArtifact	TokenNameIdentifier	 set Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultMetadataResolutionRequest	TokenNameIdentifier	 Default Metadata Resolution Request
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
getRemoteRepositories	TokenNameIdentifier	 get Remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
getRemoteRepositories	TokenNameIdentifier	 get Remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultMetadataResolutionRequest	TokenNameIdentifier	 Default Metadata Resolution Request
setRemoteRepositories	TokenNameIdentifier	 set Remote Repositories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
setRemoteRepositories	TokenNameIdentifier	 set Remote Repositories
(	TokenNameLPAREN	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isResolveManagedVersions	TokenNameIdentifier	 is Resolve Managed Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolveManagedVersions	TokenNameIdentifier	 resolve Managed Versions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultMetadataResolutionRequest	TokenNameIdentifier	 Default Metadata Resolution Request
setResolveManagedVersions	TokenNameIdentifier	 set Resolve Managed Versions
(	TokenNameLPAREN	
boolean	TokenNameboolean	
resolveManagedVersions	TokenNameIdentifier	 resolve Managed Versions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolveManagedVersions	TokenNameIdentifier	 resolve Managed Versions
=	TokenNameEQUAL	
resolveManagedVersions	TokenNameIdentifier	 resolve Managed Versions
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isOffline	TokenNameIdentifier	 is Offline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
isOffline	TokenNameIdentifier	 is Offline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultMetadataResolutionRequest	TokenNameIdentifier	 Default Metadata Resolution Request
setOffline	TokenNameIdentifier	 set Offline
(	TokenNameLPAREN	
boolean	TokenNameboolean	
offline	TokenNameIdentifier	 offline
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
setOffline	TokenNameIdentifier	 set Offline
(	TokenNameLPAREN	
offline	TokenNameIdentifier	 offline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isForceUpdate	TokenNameIdentifier	 is Force Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
isForceUpdate	TokenNameIdentifier	 is Force Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultMetadataResolutionRequest	TokenNameIdentifier	 Default Metadata Resolution Request
setForceUpdate	TokenNameIdentifier	 set Force Update
(	TokenNameLPAREN	
boolean	TokenNameboolean	
forceUpdate	TokenNameIdentifier	 force Update
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
setForceUpdate	TokenNameIdentifier	 set Force Update
(	TokenNameLPAREN	
forceUpdate	TokenNameIdentifier	 force Update
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
