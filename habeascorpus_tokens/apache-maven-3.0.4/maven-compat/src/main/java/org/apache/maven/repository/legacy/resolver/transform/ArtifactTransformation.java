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
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
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
deployer	TokenNameIdentifier	 deployer
.	TokenNameDOT	
ArtifactDeploymentException	TokenNameIdentifier	 Artifact Deployment Exception
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
installer	TokenNameIdentifier	 installer
.	TokenNameDOT	
ArtifactInstallationException	TokenNameIdentifier	 Artifact Installation Exception
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
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
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
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
;	TokenNameSEMICOLON	
/** * @author <a href="mailto:jason@maven.org">Jason van Zyl </a> */	TokenNameCOMMENT_JAVADOC	 @author <a href="mailto:jason@maven.org">Jason van Zyl </a> 
public	TokenNamepublic	
interface	TokenNameinterface	
ArtifactTransformation	TokenNameIdentifier	 Artifact Transformation
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
ArtifactTransformation	TokenNameIdentifier	 Artifact Transformation
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Take in a artifact and return the transformed artifact for locating in the remote repository. If no * transformation has occured the original artifact is returned. * * @param artifact Artifact to be transformed. * @param request the repositories to check * @param localRepository the local repository */	TokenNameCOMMENT_JAVADOC	 Take in a artifact and return the transformed artifact for locating in the remote repository. If no transformation has occured the original artifact is returned. * @param artifact Artifact to be transformed. @param request the repositories to check @param localRepository the local repository 
void	TokenNamevoid	
transformForResolve	TokenNameIdentifier	 transform For Resolve
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
RepositoryRequest	TokenNameIdentifier	 Repository Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
/** * Take in a artifact and return the transformed artifact for locating in the remote repository. If no * transformation has occured the original artifact is returned. * * @param artifact Artifact to be transformed. * @param remoteRepositories the repositories to check * @param localRepository the local repository */	TokenNameCOMMENT_JAVADOC	 Take in a artifact and return the transformed artifact for locating in the remote repository. If no transformation has occured the original artifact is returned. * @param artifact Artifact to be transformed. @param remoteRepositories the repositories to check @param localRepository the local repository 
void	TokenNamevoid	
transformForResolve	TokenNameIdentifier	 transform For Resolve
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
/** * Take in a artifact and return the transformed artifact for locating in the local repository. If no * transformation has occured the original artifact is returned. * * @param artifact Artifact to be transformed. * @param localRepository the local repository it will be stored in */	TokenNameCOMMENT_JAVADOC	 Take in a artifact and return the transformed artifact for locating in the local repository. If no transformation has occured the original artifact is returned. * @param artifact Artifact to be transformed. @param localRepository the local repository it will be stored in 
void	TokenNamevoid	
transformForInstall	TokenNameIdentifier	 transform For Install
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactInstallationException	TokenNameIdentifier	 Artifact Installation Exception
;	TokenNameSEMICOLON	
/** * Take in a artifact and return the transformed artifact for distributing toa remote repository. If no * transformation has occured the original artifact is returned. * * @param artifact Artifact to be transformed. * @param remoteRepository the repository to deploy to * @param localRepository the local repository */	TokenNameCOMMENT_JAVADOC	 Take in a artifact and return the transformed artifact for distributing toa remote repository. If no transformation has occured the original artifact is returned. * @param artifact Artifact to be transformed. @param remoteRepository the repository to deploy to @param localRepository the local repository 
void	TokenNamevoid	
transformForDeployment	TokenNameIdentifier	 transform For Deployment
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactDeploymentException	TokenNameIdentifier	 Artifact Deployment Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
