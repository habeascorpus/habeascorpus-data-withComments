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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
AbstractModelBuildingListener	TokenNameIdentifier	 Abstract Model Building Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelBuildingEvent	TokenNameIdentifier	 Model Building Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelProblem	TokenNameIdentifier	 Model Problem
.	TokenNameDOT	
Severity	TokenNameIdentifier	 Severity
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
PluginVersionResolutionException	TokenNameIdentifier	 Plugin Version Resolution Exception
;	TokenNameSEMICOLON	
/** * Processes events from the model builder while building the effective model for a {@link MavenProject} instance. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Processes events from the model builder while building the effective model for a {@link MavenProject} instance. * @author Benjamin Bentmann 
class	TokenNameclass	
DefaultModelBuildingListener	TokenNameIdentifier	 Default Model Building Listener
extends	TokenNameextends	
AbstractModelBuildingListener	TokenNameIdentifier	 Abstract Model Building Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ProjectBuildingHelper	TokenNameIdentifier	 Project Building Helper
projectBuildingHelper	TokenNameIdentifier	 project Building Helper
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
projectBuildingRequest	TokenNameIdentifier	 project Building Request
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
pluginRepositories	TokenNameIdentifier	 plugin Repositories
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultModelBuildingListener	TokenNameIdentifier	 Default Model Building Listener
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
ProjectBuildingHelper	TokenNameIdentifier	 Project Building Helper
projectBuildingHelper	TokenNameIdentifier	 project Building Helper
,	TokenNameCOMMA	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
projectBuildingRequest	TokenNameIdentifier	 project Building Request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"project missing"	TokenNameStringLiteral	project missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
projectBuildingHelper	TokenNameIdentifier	 project Building Helper
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"project building helper missing"	TokenNameStringLiteral	project building helper missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
projectBuildingHelper	TokenNameIdentifier	 project Building Helper
=	TokenNameEQUAL	
projectBuildingHelper	TokenNameIdentifier	 project Building Helper
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
projectBuildingRequest	TokenNameIdentifier	 project Building Request
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"project building request missing"	TokenNameStringLiteral	project building request missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
projectBuildingRequest	TokenNameIdentifier	 project Building Request
=	TokenNameEQUAL	
projectBuildingRequest	TokenNameIdentifier	 project Building Request
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
remoteRepositories	TokenNameIdentifier	 remote Repositories
=	TokenNameEQUAL	
projectBuildingRequest	TokenNameIdentifier	 project Building Request
.	TokenNameDOT	
getRemoteRepositories	TokenNameIdentifier	 get Remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginRepositories	TokenNameIdentifier	 plugin Repositories
=	TokenNameEQUAL	
projectBuildingRequest	TokenNameIdentifier	 project Building Request
.	TokenNameDOT	
getPluginArtifactRepositories	TokenNameIdentifier	 get Plugin Artifact Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the project whose model is being built. * * @return The project, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the project whose model is being built. * @return The project, never {@code null}. 
public	TokenNamepublic	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
buildExtensionsAssembled	TokenNameIdentifier	 build Extensions Assembled
(	TokenNameLPAREN	
ModelBuildingEvent	TokenNameIdentifier	 Model Building Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
pluginRepositories	TokenNameIdentifier	 plugin Repositories
=	TokenNameEQUAL	
projectBuildingHelper	TokenNameIdentifier	 project Building Helper
.	TokenNameDOT	
createArtifactRepositories	TokenNameIdentifier	 create Artifact Repositories
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getPluginRepositories	TokenNameIdentifier	 get Plugin Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pluginRepositories	TokenNameIdentifier	 plugin Repositories
,	TokenNameCOMMA	
projectBuildingRequest	TokenNameIdentifier	 project Building Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Invalid plugin repository: "	TokenNameStringLiteral	Invalid plugin repository: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setPluginArtifactRepositories	TokenNameIdentifier	 set Plugin Artifact Repositories
(	TokenNameLPAREN	
pluginRepositories	TokenNameIdentifier	 plugin Repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRequest	TokenNameIdentifier	 get Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isProcessPlugins	TokenNameIdentifier	 is Process Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ProjectRealmCache	TokenNameIdentifier	 Project Realm Cache
.	TokenNameDOT	
CacheRecord	TokenNameIdentifier	 Cache Record
record	TokenNameIdentifier	 record
=	TokenNameEQUAL	
projectBuildingHelper	TokenNameIdentifier	 project Building Helper
.	TokenNameDOT	
createProjectRealm	TokenNameIdentifier	 create Project Realm
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
projectBuildingRequest	TokenNameIdentifier	 project Building Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setClassRealm	TokenNameIdentifier	 set Class Realm
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
realm	TokenNameIdentifier	 realm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setExtensionDependencyFilter	TokenNameIdentifier	 set Extension Dependency Filter
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
extensionArtifactFilter	TokenNameIdentifier	 extension Artifact Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Unresolveable build extension: "	TokenNameStringLiteral	Unresolveable build extension: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
PluginVersionResolutionException	TokenNameIdentifier	 Plugin Version Resolution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Unresolveable build extension: "	TokenNameStringLiteral	Unresolveable build extension: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
projectBuildingHelper	TokenNameIdentifier	 project Building Helper
.	TokenNameDOT	
selectProjectRealm	TokenNameIdentifier	 select Project Realm
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// build the regular repos after extensions are loaded to allow for custom layouts 	TokenNameCOMMENT_LINE	build the regular repos after extensions are loaded to allow for custom layouts 
try	TokenNametry	
{	TokenNameLBRACE	
remoteRepositories	TokenNameIdentifier	 remote Repositories
=	TokenNameEQUAL	
projectBuildingHelper	TokenNameIdentifier	 project Building Helper
.	TokenNameDOT	
createArtifactRepositories	TokenNameIdentifier	 create Artifact Repositories
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getRepositories	TokenNameIdentifier	 get Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
remoteRepositories	TokenNameIdentifier	 remote Repositories
,	TokenNameCOMMA	
projectBuildingRequest	TokenNameIdentifier	 project Building Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Invalid artifact repository: "	TokenNameStringLiteral	Invalid artifact repository: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setRemoteArtifactRepositories	TokenNameIdentifier	 set Remote Artifact Repositories
(	TokenNameLPAREN	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
