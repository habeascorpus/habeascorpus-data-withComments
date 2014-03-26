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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
Metadata	TokenNameIdentifier	 Metadata
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
Versioning	TokenNameIdentifier	 Versioning
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
ArtifactProperties	TokenNameIdentifier	 Artifact Properties
;	TokenNameSEMICOLON	
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
final	TokenNamefinal	
class	TokenNameclass	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
extends	TokenNameextends	
MavenMetadata	TokenNameIdentifier	 Maven Metadata
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
public	TokenNamepublic	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
createMetadata	TokenNameIdentifier	 create Metadata
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
createMetadata	TokenNameIdentifier	 create Metadata
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Metadata	TokenNameIdentifier	 Metadata
createMetadata	TokenNameIdentifier	 create Metadata
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Versioning	TokenNameIdentifier	 Versioning
versioning	TokenNameIdentifier	 versioning
=	TokenNameEQUAL	
new	TokenNamenew	
Versioning	TokenNameIdentifier	 Versioning
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
addVersion	TokenNameIdentifier	 add Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
setRelease	TokenNameIdentifier	 set Release
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"maven-plugin"	TokenNameStringLiteral	maven-plugin
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
ArtifactProperties	TokenNameIdentifier	 Artifact Properties
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
setLatest	TokenNameIdentifier	 set Latest
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Metadata	TokenNameIdentifier	 Metadata
metadata	TokenNameIdentifier	 metadata
=	TokenNameEQUAL	
new	TokenNamenew	
Metadata	TokenNameIdentifier	 Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
setVersioning	TokenNameIdentifier	 set Versioning
(	TokenNameLPAREN	
versioning	TokenNameIdentifier	 versioning
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
Metadata	TokenNameIdentifier	 Metadata
recessive	TokenNameIdentifier	 recessive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Versioning	TokenNameIdentifier	 Versioning
versioning	TokenNameIdentifier	 versioning
=	TokenNameEQUAL	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getVersioning	TokenNameIdentifier	 get Versioning
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
updateTimestamp	TokenNameIdentifier	 update Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getVersioning	TokenNameIdentifier	 get Versioning
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
getLatest	TokenNameIdentifier	 get Latest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
setLatest	TokenNameIdentifier	 set Latest
(	TokenNameLPAREN	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getVersioning	TokenNameIdentifier	 get Versioning
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLatest	TokenNameIdentifier	 get Latest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
getRelease	TokenNameIdentifier	 get Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
setRelease	TokenNameIdentifier	 set Release
(	TokenNameLPAREN	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getVersioning	TokenNameIdentifier	 get Versioning
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRelease	TokenNameIdentifier	 get Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
versions	TokenNameIdentifier	 versions
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getVersioning	TokenNameIdentifier	 get Versioning
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersions	TokenNameIdentifier	 get Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
getVersions	TokenNameIdentifier	 get Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
setVersions	TokenNameIdentifier	 set Versions
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenMetadata	TokenNameIdentifier	 Maven Metadata
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionsMetadata	TokenNameIdentifier	 Versions Metadata
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Nature	TokenNameIdentifier	 Nature
getNature	TokenNameIdentifier	 get Nature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Nature	TokenNameIdentifier	 Nature
.	TokenNameDOT	
RELEASE_OR_SNAPSHOT	TokenNameIdentifier	 RELEASE  OR  SNAPSHOT
:	TokenNameCOLON	
Nature	TokenNameIdentifier	 Nature
.	TokenNameDOT	
RELEASE	TokenNameIdentifier	 RELEASE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
