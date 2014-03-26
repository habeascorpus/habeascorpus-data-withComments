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
Iterator	TokenNameIdentifier	 Iterator
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
installation	TokenNameIdentifier	 installation
.	TokenNameDOT	
InstallRequest	TokenNameIdentifier	 Install Request
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
VersionsMetadataGenerator	TokenNameIdentifier	 Versions Metadata Generator
implements	TokenNameimplements	
MetadataGenerator	TokenNameIdentifier	 Metadata Generator
{	TokenNameLBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
>	TokenNameGREATER	
versions	TokenNameIdentifier	 versions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
>	TokenNameGREATER	
processedVersions	TokenNameIdentifier	 processed Versions
;	TokenNameSEMICOLON	
public	TokenNamepublic	
VersionsMetadataGenerator	TokenNameIdentifier	 Versions Metadata Generator
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
InstallRequest	TokenNameIdentifier	 Install Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getMetadata	TokenNameIdentifier	 get Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionsMetadataGenerator	TokenNameIdentifier	 Versions Metadata Generator
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
DeployRequest	TokenNameIdentifier	 Deploy Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getMetadata	TokenNameIdentifier	 get Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
VersionsMetadataGenerator	TokenNameIdentifier	 Versions Metadata Generator
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Metadata	TokenNameIdentifier	 Metadata
>	TokenNameGREATER	
metadatas	TokenNameIdentifier	 metadatas
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versions	TokenNameIdentifier	 versions
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processedVersions	TokenNameIdentifier	 processed Versions
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * NOTE: This should be considered a quirk to support interop with Maven's legacy ArtifactDeployer which * processes one artifact at a time and hence cannot associate the artifacts from the same project to use the * same version index. Allowing the caller to pass in metadata from a previous deployment allows to re-establish * the association between the artifacts of the same project. */	TokenNameCOMMENT_BLOCK	 NOTE: This should be considered a quirk to support interop with Maven's legacy ArtifactDeployer which processes one artifact at a time and hence cannot associate the artifacts from the same project to use the same version index. Allowing the caller to pass in metadata from a previous deployment allows to re-establish the association between the artifacts of the same project. 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Metadata	TokenNameIdentifier	 Metadata
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
metadatas	TokenNameIdentifier	 metadatas
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Metadata	TokenNameIdentifier	 Metadata
metadata	TokenNameIdentifier	 metadata
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
instanceof	TokenNameinstanceof	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
versionsMetadata	TokenNameIdentifier	 versions Metadata
=	TokenNameEQUAL	
(	TokenNameLPAREN	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
)	TokenNameRPAREN	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
processedVersions	TokenNameIdentifier	 processed Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
versionsMetadata	TokenNameIdentifier	 versions Metadata
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
versionsMetadata	TokenNameIdentifier	 versions Metadata
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
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
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
for	TokenNamefor	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
:	TokenNameCOLON	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
processedVersions	TokenNameIdentifier	 processed Versions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
versionsMetadata	TokenNameIdentifier	 versions Metadata
=	TokenNameEQUAL	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
versionsMetadata	TokenNameIdentifier	 versions Metadata
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versionsMetadata	TokenNameIdentifier	 versions Metadata
=	TokenNameEQUAL	
new	TokenNamenew	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
versionsMetadata	TokenNameIdentifier	 versions Metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
