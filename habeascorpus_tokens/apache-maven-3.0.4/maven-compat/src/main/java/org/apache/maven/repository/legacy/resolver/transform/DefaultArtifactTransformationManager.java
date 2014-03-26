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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Requirement	TokenNameIdentifier	 Requirement
;	TokenNameSEMICOLON	
/** * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ArtifactTransformationManager	TokenNameIdentifier	 Artifact Transformation Manager
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultArtifactTransformationManager	TokenNameIdentifier	 Default Artifact Transformation Manager
implements	TokenNameimplements	
ArtifactTransformationManager	TokenNameIdentifier	 Artifact Transformation Manager
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ArtifactTransformation	TokenNameIdentifier	 Artifact Transformation
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"release"	TokenNameStringLiteral	release
,	TokenNameCOMMA	
"latest"	TokenNameStringLiteral	latest
,	TokenNameCOMMA	
"snapshot"	TokenNameStringLiteral	snapshot
}	TokenNameRBRACE	
)	TokenNameRPAREN	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactTransformation	TokenNameIdentifier	 Artifact Transformation
>	TokenNameGREATER	
artifactTransformations	TokenNameIdentifier	 artifact Transformations
;	TokenNameSEMICOLON	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ArtifactTransformation	TokenNameIdentifier	 Artifact Transformation
transform	TokenNameIdentifier	 transform
:	TokenNameCOLON	
artifactTransformations	TokenNameIdentifier	 artifact Transformations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
transformForResolve	TokenNameIdentifier	 transform For Resolve
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ArtifactTransformation	TokenNameIdentifier	 Artifact Transformation
transform	TokenNameIdentifier	 transform
:	TokenNameCOLON	
artifactTransformations	TokenNameIdentifier	 artifact Transformations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
transformForResolve	TokenNameIdentifier	 transform For Resolve
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
remoteRepositories	TokenNameIdentifier	 remote Repositories
,	TokenNameCOMMA	
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ArtifactTransformation	TokenNameIdentifier	 Artifact Transformation
transform	TokenNameIdentifier	 transform
:	TokenNameCOLON	
artifactTransformations	TokenNameIdentifier	 artifact Transformations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
transformForInstall	TokenNameIdentifier	 transform For Install
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ArtifactTransformation	TokenNameIdentifier	 Artifact Transformation
transform	TokenNameIdentifier	 transform
:	TokenNameCOLON	
artifactTransformations	TokenNameIdentifier	 artifact Transformations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
transformForDeployment	TokenNameIdentifier	 transform For Deployment
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
remoteRepository	TokenNameIdentifier	 remote Repository
,	TokenNameCOMMA	
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getArtifactTransformations	TokenNameIdentifier	 get Artifact Transformations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactTransformations	TokenNameIdentifier	 artifact Transformations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
