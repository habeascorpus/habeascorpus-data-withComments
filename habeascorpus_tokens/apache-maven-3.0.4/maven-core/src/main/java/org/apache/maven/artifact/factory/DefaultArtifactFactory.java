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
DefaultArtifact	TokenNameIdentifier	 Default Artifact
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
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
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
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
ArtifactHandlerManager	TokenNameIdentifier	 Artifact Handler Manager
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
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultArtifactFactory	TokenNameIdentifier	 Default Artifact Factory
implements	TokenNameimplements	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
ArtifactHandlerManager	TokenNameIdentifier	 Artifact Handler Manager
artifactHandlerManager	TokenNameIdentifier	 artifact Handler Manager
;	TokenNameSEMICOLON	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
inheritedScope	TokenNameIdentifier	 inherited Scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
inheritedScope	TokenNameIdentifier	 inherited Scope
,	TokenNameCOMMA	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
packaging	TokenNameIdentifier	 packaging
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createProjectArtifact	TokenNameIdentifier	 create Project Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createProjectArtifact	TokenNameIdentifier	 create Project Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
"maven-plugin"	TokenNameStringLiteral	maven-plugin
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
"pom"	TokenNameStringLiteral	pom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
"jar"	TokenNameStringLiteral	jar
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
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
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
inheritedScope	TokenNameIdentifier	 inherited Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
versionRange	TokenNameIdentifier	 version Range
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versionRange	TokenNameIdentifier	 version Range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
inheritedScope	TokenNameIdentifier	 inherited Scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Artifact	TokenNameIdentifier	 Artifact
createArtifact	TokenNameIdentifier	 create Artifact
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
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
inheritedScope	TokenNameIdentifier	 inherited Scope
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Artifact	TokenNameIdentifier	 Artifact
createArtifact	TokenNameIdentifier	 create Artifact
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
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
desiredScope	TokenNameIdentifier	 desired Scope
=	TokenNameEQUAL	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inheritedScope	TokenNameIdentifier	 inherited Scope
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
desiredScope	TokenNameIdentifier	 desired Scope
=	TokenNameEQUAL	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
inheritedScope	TokenNameIdentifier	 inherited Scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// added to retain compile artifactScope. Remove if you want compile inherited as runtime 	TokenNameCOMMENT_LINE	added to retain compile artifactScope. Remove if you want compile inherited as runtime 
desiredScope	TokenNameIdentifier	 desired Scope
=	TokenNameEQUAL	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
inheritedScope	TokenNameIdentifier	 inherited Scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
desiredScope	TokenNameIdentifier	 desired Scope
=	TokenNameEQUAL	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
inheritedScope	TokenNameIdentifier	 inherited Scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
desiredScope	TokenNameIdentifier	 desired Scope
=	TokenNameEQUAL	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// system scopes come through unchanged... 	TokenNameCOMMENT_LINE	system scopes come through unchanged... 
desiredScope	TokenNameIdentifier	 desired Scope
=	TokenNameEQUAL	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
artifactHandlerManager	TokenNameIdentifier	 artifact Handler Manager
.	TokenNameDOT	
getArtifactHandler	TokenNameIdentifier	 get Artifact Handler
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
desiredScope	TokenNameIdentifier	 desired Scope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
