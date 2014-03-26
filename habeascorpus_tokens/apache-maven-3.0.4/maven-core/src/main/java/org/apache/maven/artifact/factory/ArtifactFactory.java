package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
VersionRange	TokenNameIdentifier	 Version Range
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
{	TokenNameLBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createArtifactWithClassifier	TokenNameIdentifier	 create Artifact With Classifier
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createDependencyArtifact	TokenNameIdentifier	 create Dependency Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createDependencyArtifact	TokenNameIdentifier	 create Dependency Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
boolean	TokenNameboolean	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createDependencyArtifact	TokenNameIdentifier	 create Dependency Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
inheritedScope	TokenNameIdentifier	 inherited Scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createDependencyArtifact	TokenNameIdentifier	 create Dependency Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
inheritedScope	TokenNameIdentifier	 inherited Scope
,	TokenNameCOMMA	
boolean	TokenNameboolean	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createBuildArtifact	TokenNameIdentifier	 create Build Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
packaging	TokenNameIdentifier	 packaging
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createProjectArtifact	TokenNameIdentifier	 create Project Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createParentArtifact	TokenNameIdentifier	 create Parent Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createPluginArtifact	TokenNameIdentifier	 create Plugin Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
versionRange	TokenNameIdentifier	 version Range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createProjectArtifact	TokenNameIdentifier	 create Project Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
createExtensionArtifact	TokenNameIdentifier	 create Extension Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
versionRange	TokenNameIdentifier	 version Range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
