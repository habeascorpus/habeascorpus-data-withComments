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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenSession	TokenNameIdentifier	 Maven Session
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
MavenProject	TokenNameIdentifier	 Maven Project
;	TokenNameSEMICOLON	
/** * Collects basic settings to access the repository system. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects basic settings to access the repository system. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
implements	TokenNameimplements	
RepositoryRequest	TokenNameIdentifier	 Repository Request
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
offline	TokenNameIdentifier	 offline
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
forceUpdate	TokenNameIdentifier	 force Update
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
/** * Creates an empty repository request. */	TokenNameCOMMENT_JAVADOC	 Creates an empty repository request. 
public	TokenNamepublic	
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// enables no-arg constructor 	TokenNameCOMMENT_LINE	enables no-arg constructor 
}	TokenNameRBRACE	
/** * Creates a shallow copy of the specified repository request. * * @param repositoryRequest The repository request to copy from, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a shallow copy of the specified repository request. * @param repositoryRequest The repository request to copy from, must not be {@code null}. 
public	TokenNamepublic	
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
(	TokenNameLPAREN	
RepositoryRequest	TokenNameIdentifier	 Repository Request
repositoryRequest	TokenNameIdentifier	 repository Request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setRemoteRepositories	TokenNameIdentifier	 set Remote Repositories
(	TokenNameLPAREN	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
getRemoteRepositories	TokenNameIdentifier	 get Remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOffline	TokenNameIdentifier	 set Offline
(	TokenNameLPAREN	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
isOffline	TokenNameIdentifier	 is Offline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setForceUpdate	TokenNameIdentifier	 set Force Update
(	TokenNameLPAREN	
repositoryRequest	TokenNameIdentifier	 repository Request
.	TokenNameDOT	
isForceUpdate	TokenNameIdentifier	 is Force Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
RepositoryRequest	TokenNameIdentifier	 Repository Request
getRepositoryRequest	TokenNameIdentifier	 get Repository Request
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RepositoryRequest	TokenNameIdentifier	 Repository Request
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setRemoteRepositories	TokenNameIdentifier	 set Remote Repositories
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getPluginArtifactRepositories	TokenNameIdentifier	 get Plugin Artifact Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setOffline	TokenNameIdentifier	 set Offline
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
isOffline	TokenNameIdentifier	 is Offline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setForceUpdate	TokenNameIdentifier	 set Force Update
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getRequest	TokenNameIdentifier	 get Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isUpdateSnapshots	TokenNameIdentifier	 is Update Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
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
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
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
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
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
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
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
if	TokenNameif	
(	TokenNameLPAREN	
remoteRepositories	TokenNameIdentifier	 remote Repositories
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remoteRepositories	TokenNameIdentifier	 remote Repositories
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
remoteRepositories	TokenNameIdentifier	 remote Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultRepositoryRequest	TokenNameIdentifier	 Default Repository Request
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
}	TokenNameRBRACE	
