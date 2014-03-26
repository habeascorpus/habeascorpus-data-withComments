package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
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
Collection	TokenNameIdentifier	 Collection
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
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
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
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
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
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
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
public	TokenNamepublic	
interface	TokenNameinterface	
Artifact	TokenNameIdentifier	 Artifact
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
RELEASE_VERSION	TokenNameIdentifier	 RELEASE  VERSION
=	TokenNameEQUAL	
"RELEASE"	TokenNameStringLiteral	RELEASE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
LATEST_VERSION	TokenNameIdentifier	 LATEST  VERSION
=	TokenNameEQUAL	
"LATEST"	TokenNameStringLiteral	LATEST
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SNAPSHOT_VERSION	TokenNameIdentifier	 SNAPSHOT  VERSION
=	TokenNameEQUAL	
"SNAPSHOT"	TokenNameStringLiteral	SNAPSHOT
;	TokenNameSEMICOLON	
Pattern	TokenNameIdentifier	 Pattern
VERSION_FILE_PATTERN	TokenNameIdentifier	 VERSION  FILE  PATTERN
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"^(.*)-([0-9]{8}.[0-9]{6})-([0-9]+)$"	TokenNameStringLiteral	^(.*)-([0-9]{8}.[0-9]{6})-([0-9]+)$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: into artifactScope handler 	TokenNameCOMMENT_LINE	TODO: into artifactScope handler 
String	TokenNameIdentifier	 String
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
=	TokenNameEQUAL	
"compile"	TokenNameStringLiteral	compile
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SCOPE_COMPILE_PLUS_RUNTIME	TokenNameIdentifier	 SCOPE  COMPILE  PLUS  RUNTIME
=	TokenNameEQUAL	
"compile+runtime"	TokenNameStringLiteral	compile+runtime
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
=	TokenNameEQUAL	
"test"	TokenNameStringLiteral	test
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
=	TokenNameEQUAL	
"runtime"	TokenNameStringLiteral	runtime
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SCOPE_RUNTIME_PLUS_SYSTEM	TokenNameIdentifier	 SCOPE  RUNTIME  PLUS  SYSTEM
=	TokenNameEQUAL	
"runtime+system"	TokenNameStringLiteral	runtime+system
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
=	TokenNameEQUAL	
"provided"	TokenNameStringLiteral	provided
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
=	TokenNameEQUAL	
"system"	TokenNameStringLiteral	system
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SCOPE_IMPORT	TokenNameIdentifier	 SCOPE  IMPORT
=	TokenNameEQUAL	
"import"	TokenNameStringLiteral	import
;	TokenNameSEMICOLON	
// Used to import dependencyManagement dependencies 	TokenNameCOMMENT_LINE	Used to import dependencyManagement dependencies 
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasClassifier	TokenNameIdentifier	 has Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
destination	TokenNameIdentifier	 destination
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setBaseVersion	TokenNameIdentifier	 set Base Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseVersion	TokenNameIdentifier	 base Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getDependencyConflictId	TokenNameIdentifier	 get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
addMetadata	TokenNameIdentifier	 add Metadata
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
>	TokenNameGREATER	
getMetadataList	TokenNameIdentifier	 get Metadata List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setRepository	TokenNameIdentifier	 set Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getRepository	TokenNameIdentifier	 get Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
updateVersion	TokenNameIdentifier	 update Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getDownloadUrl	TokenNameIdentifier	 get Download Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setDownloadUrl	TokenNameIdentifier	 set Download Url
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
downloadUrl	TokenNameIdentifier	 download Url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
getDependencyFilter	TokenNameIdentifier	 get Dependency Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setDependencyFilter	TokenNameIdentifier	 set Dependency Filter
(	TokenNameLPAREN	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
artifactFilter	TokenNameIdentifier	 artifact Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
getArtifactHandler	TokenNameIdentifier	 get Artifact Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getDependencyTrail	TokenNameIdentifier	 get Dependency Trail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setDependencyTrail	TokenNameIdentifier	 set Dependency Trail
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
dependencyTrail	TokenNameIdentifier	 dependency Trail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VersionRange	TokenNameIdentifier	 Version Range
getVersionRange	TokenNameIdentifier	 get Version Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setVersionRange	TokenNameIdentifier	 set Version Range
(	TokenNameLPAREN	
VersionRange	TokenNameIdentifier	 Version Range
newRange	TokenNameIdentifier	 new Range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
selectVersion	TokenNameIdentifier	 select Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setResolved	TokenNameIdentifier	 set Resolved
(	TokenNameLPAREN	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setResolvedVersion	TokenNameIdentifier	 set Resolved Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setArtifactHandler	TokenNameIdentifier	 set Artifact Handler
(	TokenNameLPAREN	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isRelease	TokenNameIdentifier	 is Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setRelease	TokenNameIdentifier	 set Release
(	TokenNameLPAREN	
boolean	TokenNameboolean	
release	TokenNameIdentifier	 release
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
>	TokenNameGREATER	
getAvailableVersions	TokenNameIdentifier	 get Available Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setAvailableVersions	TokenNameIdentifier	 set Available Versions
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
>	TokenNameGREATER	
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isOptional	TokenNameIdentifier	 is Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setOptional	TokenNameIdentifier	 set Optional
(	TokenNameLPAREN	
boolean	TokenNameboolean	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
