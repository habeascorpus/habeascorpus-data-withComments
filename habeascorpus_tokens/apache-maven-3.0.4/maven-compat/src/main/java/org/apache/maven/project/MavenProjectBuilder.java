package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
ProfileManager	TokenNameIdentifier	 Profile Manager
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
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
MavenProjectBuilder	TokenNameIdentifier	 Maven Project Builder
{	TokenNameLBRACE	
MavenProject	TokenNameIdentifier	 Maven Project
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
//TODO maven-site-plugin -- Vincent, Dennis and Lukas are checking but this doesn't appear to be required anymore. 	TokenNameCOMMENT_LINE	TODO maven-site-plugin -- Vincent, Dennis and Lukas are checking but this doesn't appear to be required anymore. 
MavenProject	TokenNameIdentifier	 Maven Project
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ProfileManager	TokenNameIdentifier	 Profile Manager
profileManager	TokenNameIdentifier	 profile Manager
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
//TODO remote-resources-plugin 	TokenNameCOMMENT_LINE	TODO remote-resources-plugin 
MavenProject	TokenNameIdentifier	 Maven Project
buildFromRepository	TokenNameIdentifier	 build From Repository
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
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
//TODO remote-resources-plugin 	TokenNameCOMMENT_LINE	TODO remote-resources-plugin 
MavenProject	TokenNameIdentifier	 Maven Project
buildFromRepository	TokenNameIdentifier	 build From Repository
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
boolean	TokenNameboolean	
allowStubModel	TokenNameIdentifier	 allow Stub Model
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
// TODO: this is only to provide a project for plugins that don't need a project to execute but need some 	TokenNameCOMMENT_LINE	TODO: this is only to provide a project for plugins that don't need a project to execute but need some 
// of the values from a MavenProject. Ideally this should be something internal and nothing outside Maven 	TokenNameCOMMENT_LINE	of the values from a MavenProject. Ideally this should be something internal and nothing outside Maven 
// would ever need this so it should not be exposed in a public API 	TokenNameCOMMENT_LINE	would ever need this so it should not be exposed in a public API 
MavenProject	TokenNameIdentifier	 Maven Project
buildStandaloneSuperProject	TokenNameIdentifier	 build Standalone Super Project
(	TokenNameLPAREN	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
buildStandaloneSuperProject	TokenNameIdentifier	 build Standalone Super Project
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
buildStandaloneSuperProject	TokenNameIdentifier	 build Standalone Super Project
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ProfileManager	TokenNameIdentifier	 Profile Manager
profileManager	TokenNameIdentifier	 profile Manager
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
buildWithDependencies	TokenNameIdentifier	 build With Dependencies
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ProfileManager	TokenNameIdentifier	 Profile Manager
globalProfileManager	TokenNameIdentifier	 global Profile Manager
,	TokenNameCOMMA	
TransferListener	TokenNameIdentifier	 Transfer Listener
transferListener	TokenNameIdentifier	 transfer Listener
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
,	TokenNameCOMMA	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
buildWithDependencies	TokenNameIdentifier	 build With Dependencies
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ProfileManager	TokenNameIdentifier	 Profile Manager
globalProfileManager	TokenNameIdentifier	 global Profile Manager
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
,	TokenNameCOMMA	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
,	TokenNameCOMMA	
ArtifactNotFoundException	TokenNameIdentifier	 Artifact Not Found Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
