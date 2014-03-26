package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
ConfigurationProperties	TokenNameIdentifier	 Configuration Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
Artifact	TokenNameIdentifier	 Artifact
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
deployment	TokenNameIdentifier	 deployment
.	TokenNameDOT	
DeployRequest	TokenNameIdentifier	 Deploy Request
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
MetadataGenerator	TokenNameIdentifier	 Metadata Generator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
Metadata	TokenNameIdentifier	 Metadata
;	TokenNameSEMICOLON	
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
class	TokenNameclass	
RemoteSnapshotMetadataGenerator	TokenNameIdentifier	 Remote Snapshot Metadata Generator
implements	TokenNameimplements	
MetadataGenerator	TokenNameIdentifier	 Metadata Generator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
RemoteSnapshotMetadata	TokenNameIdentifier	 Remote Snapshot Metadata
>	TokenNameGREATER	
snapshots	TokenNameIdentifier	 snapshots
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
legacyFormat	TokenNameIdentifier	 legacy Format
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RemoteSnapshotMetadataGenerator	TokenNameIdentifier	 Remote Snapshot Metadata Generator
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
DeployRequest	TokenNameIdentifier	 Deploy Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
legacyFormat	TokenNameIdentifier	 legacy Format
=	TokenNameEQUAL	
ConfigurationProperties	TokenNameIdentifier	 Configuration Properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getConfigProperties	TokenNameIdentifier	 get Config Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"maven.metadata.legacy"	TokenNameStringLiteral	maven.metadata.legacy
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
snapshots	TokenNameIdentifier	 snapshots
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
RemoteSnapshotMetadata	TokenNameIdentifier	 Remote Snapshot Metadata
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * NOTE: This should be considered a quirk to support interop with Maven's legacy ArtifactDeployer which * processes one artifact at a time and hence cannot associate the artifacts from the same project to use the * same timestamp+buildno for the snapshot versions. Allowing the caller to pass in metadata from a previous * deployment allows to re-establish the association between the artifacts of the same project. */	TokenNameCOMMENT_BLOCK	 NOTE: This should be considered a quirk to support interop with Maven's legacy ArtifactDeployer which processes one artifact at a time and hence cannot associate the artifacts from the same project to use the same timestamp+buildno for the snapshot versions. Allowing the caller to pass in metadata from a previous deployment allows to re-establish the association between the artifacts of the same project. 
for	TokenNamefor	
(	TokenNameLPAREN	
Metadata	TokenNameIdentifier	 Metadata
metadata	TokenNameIdentifier	 metadata
:	TokenNameCOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getMetadata	TokenNameIdentifier	 get Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
instanceof	TokenNameinstanceof	
RemoteSnapshotMetadata	TokenNameIdentifier	 Remote Snapshot Metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RemoteSnapshotMetadata	TokenNameIdentifier	 Remote Snapshot Metadata
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RemoteSnapshotMetadata	TokenNameIdentifier	 Remote Snapshot Metadata
)	TokenNameRPAREN	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Metadata	TokenNameIdentifier	 Metadata
>	TokenNameGREATER	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
:	TokenNameCOLON	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
RemoteSnapshotMetadata	TokenNameIdentifier	 Remote Snapshot Metadata
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RemoteSnapshotMetadata	TokenNameIdentifier	 Remote Snapshot Metadata
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
=	TokenNameEQUAL	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
=	TokenNameEQUAL	
new	TokenNamenew	
RemoteSnapshotMetadata	TokenNameIdentifier	 Remote Snapshot Metadata
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
legacyFormat	TokenNameIdentifier	 legacy Format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
.	TokenNameDOT	
bind	TokenNameIdentifier	 bind
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Artifact	TokenNameIdentifier	 Artifact
transformArtifact	TokenNameIdentifier	 transform Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
RemoteSnapshotMetadata	TokenNameIdentifier	 Remote Snapshot Metadata
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RemoteSnapshotMetadata	TokenNameIdentifier	 Remote Snapshot Metadata
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
=	TokenNameEQUAL	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
snapshotMetadata	TokenNameIdentifier	 snapshot Metadata
.	TokenNameDOT	
getExpandedVersion	TokenNameIdentifier	 get Expanded Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Metadata	TokenNameIdentifier	 Metadata
>	TokenNameGREATER	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
