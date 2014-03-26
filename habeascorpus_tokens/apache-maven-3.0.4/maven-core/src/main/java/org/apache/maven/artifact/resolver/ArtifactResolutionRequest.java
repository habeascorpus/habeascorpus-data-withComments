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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
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
RepositoryCache	TokenNameIdentifier	 Repository Cache
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
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Mirror	TokenNameIdentifier	 Mirror
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Proxy	TokenNameIdentifier	 Proxy
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Server	TokenNameIdentifier	 Server
;	TokenNameSEMICOLON	
/** * A resolution request allows you to either use an existing MavenProject, or a coordinate (gid:aid:version) * to process a POMs dependencies. * * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 A resolution request allows you to either use an existing MavenProject, or a coordinate (gid:aid:version) to process a POMs dependencies. * @author Jason van Zyl 
public	TokenNamepublic	
class	TokenNameclass	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
implements	TokenNameimplements	
RepositoryRequest	TokenNameIdentifier	 Repository Request
{	TokenNameLBRACE	
private	TokenNameprivate	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
// Needs to go away 	TokenNameCOMMENT_LINE	Needs to go away 
// These are really overrides now, projects defining dependencies for a plugin that override what is 	TokenNameCOMMENT_LINE	These are really overrides now, projects defining dependencies for a plugin that override what is 
// specified in the plugin itself. 	TokenNameCOMMENT_LINE	specified in the plugin itself. 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
collectionFilter	TokenNameIdentifier	 collection Filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
resolutionFilter	TokenNameIdentifier	 resolution Filter
;	TokenNameSEMICOLON	
// Needs to go away 	TokenNameCOMMENT_LINE	Needs to go away 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
>	TokenNameGREATER	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This is like a filter but overrides all transitive versions 	TokenNameCOMMENT_LINE	This is like a filter but overrides all transitive versions 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
managedVersionMap	TokenNameIdentifier	 managed Version Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
resolveRoot	TokenNameIdentifier	 resolve Root
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
resolveTransitively	TokenNameIdentifier	 resolve Transitively
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
offline	TokenNameIdentifier	 offline
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
forceUpdate	TokenNameIdentifier	 force Update
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
servers	TokenNameIdentifier	 servers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Mirror	TokenNameIdentifier	 Mirror
>	TokenNameGREATER	
mirrors	TokenNameIdentifier	 mirrors
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
proxies	TokenNameIdentifier	 proxies
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nothing here 	TokenNameCOMMENT_LINE	nothing here 
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
(	TokenNameLPAREN	
RepositoryRequest	TokenNameIdentifier	 Repository Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setRemoteRepositories	TokenNameIdentifier	 set Remote Repositories
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getRemoteRepositories	TokenNameIdentifier	 get Remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOffline	TokenNameIdentifier	 set Offline
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
isOffline	TokenNameIdentifier	 is Offline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setForceUpdate	TokenNameIdentifier	 set Force Update
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
isForceUpdate	TokenNameIdentifier	 is Force Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
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
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setArtifactDependencies	TokenNameIdentifier	 set Artifact Dependencies
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
=	TokenNameEQUAL	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
getArtifactDependencies	TokenNameIdentifier	 get Artifact Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
localRepository	TokenNameIdentifier	 local Repository
=	TokenNameEQUAL	
localRepository	TokenNameIdentifier	 local Repository
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
remoteRepositories	TokenNameIdentifier	 remote Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setRemoteRepositories	TokenNameIdentifier	 set Remote Repositories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
remoteRepositories	TokenNameIdentifier	 remote Repositories
=	TokenNameEQUAL	
remoteRepositories	TokenNameIdentifier	 remote Repositories
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the artifact filter that controls traversal of the dependency graph. * * @return The filter used to determine which of the artifacts in the dependency graph should be traversed or * {@code null} to collect all transitive dependencies. */	TokenNameCOMMENT_JAVADOC	 Gets the artifact filter that controls traversal of the dependency graph. * @return The filter used to determine which of the artifacts in the dependency graph should be traversed or {@code null} to collect all transitive dependencies. 
public	TokenNamepublic	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
getCollectionFilter	TokenNameIdentifier	 get Collection Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
collectionFilter	TokenNameIdentifier	 collection Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setCollectionFilter	TokenNameIdentifier	 set Collection Filter
(	TokenNameLPAREN	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
collectionFilter	TokenNameIdentifier	 collection Filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the artifact filter that controls downloading of artifact files. This filter operates on those artifacts * that have been included by the {@link #getCollectionFilter()}. * * @return The filter used to determine which of the artifacts should have their files resolved or {@code null} to * resolve the files for all collected artifacts. */	TokenNameCOMMENT_JAVADOC	 Gets the artifact filter that controls downloading of artifact files. This filter operates on those artifacts that have been included by the {@link #getCollectionFilter()}. * @return The filter used to determine which of the artifacts should have their files resolved or {@code null} to resolve the files for all collected artifacts. 
public	TokenNamepublic	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
getResolutionFilter	TokenNameIdentifier	 get Resolution Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolutionFilter	TokenNameIdentifier	 resolution Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setResolutionFilter	TokenNameIdentifier	 set Resolution Filter
(	TokenNameLPAREN	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolutionFilter	TokenNameIdentifier	 resolution Filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
>	TokenNameGREATER	
getListeners	TokenNameIdentifier	 get Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
listeners	TokenNameIdentifier	 listeners
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setListeners	TokenNameIdentifier	 set Listeners
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
>	TokenNameGREATER	
listeners	TokenNameIdentifier	 listeners
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
addListener	TokenNameIdentifier	 add Listener
(	TokenNameLPAREN	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getManagedVersionMap	TokenNameIdentifier	 get Managed Version Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
managedVersionMap	TokenNameIdentifier	 managed Version Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setManagedVersionMap	TokenNameIdentifier	 set Managed Version Map
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
managedVersionMap	TokenNameIdentifier	 managed Version Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
managedVersionMap	TokenNameIdentifier	 managed Version Map
=	TokenNameEQUAL	
managedVersionMap	TokenNameIdentifier	 managed Version Map
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setResolveRoot	TokenNameIdentifier	 set Resolve Root
(	TokenNameLPAREN	
boolean	TokenNameboolean	
resolveRoot	TokenNameIdentifier	 resolve Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolveRoot	TokenNameIdentifier	 resolve Root
=	TokenNameEQUAL	
resolveRoot	TokenNameIdentifier	 resolve Root
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isResolveRoot	TokenNameIdentifier	 is Resolve Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolveRoot	TokenNameIdentifier	 resolve Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setResolveTransitively	TokenNameIdentifier	 set Resolve Transitively
(	TokenNameLPAREN	
boolean	TokenNameboolean	
resolveDependencies	TokenNameIdentifier	 resolve Dependencies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolveTransitively	TokenNameIdentifier	 resolve Transitively
=	TokenNameEQUAL	
resolveDependencies	TokenNameIdentifier	 resolve Dependencies
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isResolveTransitively	TokenNameIdentifier	 is Resolve Transitively
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolveTransitively	TokenNameIdentifier	 resolve Transitively
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"REQUEST: "	TokenNameStringLiteral	REQUEST: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"artifact: "	TokenNameStringLiteral	artifact: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"localRepository: "	TokenNameStringLiteral	localRepository: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"remoteRepositories: "	TokenNameStringLiteral	remoteRepositories: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RepositoryCache	TokenNameIdentifier	 Repository Cache
getCache	TokenNameIdentifier	 get Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setCache	TokenNameIdentifier	 set Cache
(	TokenNameLPAREN	
RepositoryCache	TokenNameIdentifier	 Repository Cache
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
offline	TokenNameIdentifier	 offline
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setOffline	TokenNameIdentifier	 set Offline
(	TokenNameLPAREN	
boolean	TokenNameboolean	
offline	TokenNameIdentifier	 offline
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offline	TokenNameIdentifier	 offline
=	TokenNameEQUAL	
offline	TokenNameIdentifier	 offline
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
forceUpdate	TokenNameIdentifier	 force Update
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setForceUpdate	TokenNameIdentifier	 set Force Update
(	TokenNameLPAREN	
boolean	TokenNameboolean	
forceUpdate	TokenNameIdentifier	 force Update
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
forceUpdate	TokenNameIdentifier	 force Update
=	TokenNameEQUAL	
forceUpdate	TokenNameIdentifier	 force Update
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setServers	TokenNameIdentifier	 set Servers
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
servers	TokenNameIdentifier	 servers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
servers	TokenNameIdentifier	 servers
=	TokenNameEQUAL	
servers	TokenNameIdentifier	 servers
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
getServers	TokenNameIdentifier	 get Servers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
servers	TokenNameIdentifier	 servers
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
servers	TokenNameIdentifier	 servers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
servers	TokenNameIdentifier	 servers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setMirrors	TokenNameIdentifier	 set Mirrors
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Mirror	TokenNameIdentifier	 Mirror
>	TokenNameGREATER	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mirrors	TokenNameIdentifier	 mirrors
=	TokenNameEQUAL	
mirrors	TokenNameIdentifier	 mirrors
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Mirror	TokenNameIdentifier	 Mirror
>	TokenNameGREATER	
getMirrors	TokenNameIdentifier	 get Mirrors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mirrors	TokenNameIdentifier	 mirrors
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mirrors	TokenNameIdentifier	 mirrors
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Mirror	TokenNameIdentifier	 Mirror
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
mirrors	TokenNameIdentifier	 mirrors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionRequest	TokenNameIdentifier	 Artifact Resolution Request
setProxies	TokenNameIdentifier	 set Proxies
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
proxies	TokenNameIdentifier	 proxies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
proxies	TokenNameIdentifier	 proxies
=	TokenNameEQUAL	
proxies	TokenNameIdentifier	 proxies
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
getProxies	TokenNameIdentifier	 get Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
proxies	TokenNameIdentifier	 proxies
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
proxies	TokenNameIdentifier	 proxies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
proxies	TokenNameIdentifier	 proxies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
