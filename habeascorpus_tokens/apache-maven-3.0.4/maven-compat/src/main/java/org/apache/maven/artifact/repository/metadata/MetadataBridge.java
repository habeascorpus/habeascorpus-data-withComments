package	TokenNamepackage	
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
DefaultArtifactRepository	TokenNameIdentifier	 Default Artifact Repository
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
RepositoryMetadata	TokenNameIdentifier	 Repository Metadata
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
RepositoryException	TokenNameIdentifier	 Repository Exception
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
MergeableMetadata	TokenNameIdentifier	 Mergeable Metadata
;	TokenNameSEMICOLON	
/** * <strong>Warning:</strong> This is an internal utility class that is only public for technical reasons, it is not part * of the public API. In particular, this class can be changed or deleted without prior notice. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 <strong>Warning:</strong> This is an internal utility class that is only public for technical reasons, it is not part of the public API. In particular, this class can be changed or deleted without prior notice. * @author Benjamin Bentmann 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
MetadataBridge	TokenNameIdentifier	 Metadata Bridge
implements	TokenNameimplements	
MergeableMetadata	TokenNameIdentifier	 Mergeable Metadata
{	TokenNameLBRACE	
private	TokenNameprivate	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
merged	TokenNameIdentifier	 merged
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MetadataBridge	TokenNameIdentifier	 Metadata Bridge
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
=	TokenNameEQUAL	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
RepositoryException	TokenNameIdentifier	 Repository Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepo	TokenNameIdentifier	 local Repo
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataRepository	TokenNameIdentifier	 Metadata Repository
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
storeInLocalRepository	TokenNameIdentifier	 store In Local Repository
(	TokenNameLPAREN	
localRepo	TokenNameIdentifier	 local Repo
,	TokenNameCOMMA	
localRepo	TokenNameIdentifier	 local Repo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RepositoryException	TokenNameIdentifier	 Repository Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isMerged	TokenNameIdentifier	 is Merged
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
merged	TokenNameIdentifier	 merged
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
emptify	TokenNameIdentifier	 emptify
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
storedInGroupDirectory	TokenNameIdentifier	 stored In Group Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
emptify	TokenNameIdentifier	 emptify
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
storedInArtifactVersionDirectory	TokenNameIdentifier	 stored In Artifact Version Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
emptify	TokenNameIdentifier	 emptify
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getRemoteFilename	TokenNameIdentifier	 get Remote Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
emptify	TokenNameIdentifier	 emptify
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
string	TokenNameIdentifier	 string
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataBridge	TokenNameIdentifier	 Metadata Bridge
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Nature	TokenNameIdentifier	 Nature
getNature	TokenNameIdentifier	 get Nature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
instanceof	TokenNameinstanceof	
RepositoryMetadata	TokenNameIdentifier	 Repository Metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RepositoryMetadata	TokenNameIdentifier	 Repository Metadata
)	TokenNameRPAREN	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
.	TokenNameDOT	
getNature	TokenNameIdentifier	 get Nature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
RepositoryMetadata	TokenNameIdentifier	 Repository Metadata
.	TokenNameDOT	
RELEASE_OR_SNAPSHOT	TokenNameIdentifier	 RELEASE  OR  SNAPSHOT
:	TokenNameCOLON	
return	TokenNamereturn	
Nature	TokenNameIdentifier	 Nature
.	TokenNameDOT	
RELEASE_OR_SNAPSHOT	TokenNameIdentifier	 RELEASE  OR  SNAPSHOT
;	TokenNameSEMICOLON	
case	TokenNamecase	
RepositoryMetadata	TokenNameIdentifier	 Repository Metadata
.	TokenNameDOT	
SNAPSHOT	TokenNameIdentifier	 SNAPSHOT
:	TokenNameCOLON	
return	TokenNamereturn	
Nature	TokenNameIdentifier	 Nature
.	TokenNameDOT	
SNAPSHOT	TokenNameIdentifier	 SNAPSHOT
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
Nature	TokenNameIdentifier	 Nature
.	TokenNameDOT	
RELEASE	TokenNameIdentifier	 RELEASE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Nature	TokenNameIdentifier	 Nature
.	TokenNameDOT	
RELEASE	TokenNameIdentifier	 RELEASE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"deprecation"	TokenNameStringLiteral	deprecation
)	TokenNameRPAREN	
static	TokenNamestatic	
class	TokenNameclass	
MetadataRepository	TokenNameIdentifier	 Metadata Repository
extends	TokenNameextends	
DefaultArtifactRepository	TokenNameIdentifier	 Default Artifact Repository
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
metadataFile	TokenNameIdentifier	 metadata File
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MetadataRepository	TokenNameIdentifier	 Metadata Repository
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
metadataFile	TokenNameIdentifier	 metadata File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"local"	TokenNameStringLiteral	local
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
metadataFile	TokenNameIdentifier	 metadata File
=	TokenNameEQUAL	
metadataFile	TokenNameIdentifier	 metadata File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metadataFile	TokenNameIdentifier	 metadata File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
pathOfLocalRepositoryMetadata	TokenNameIdentifier	 path Of Local Repository Metadata
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metadataFile	TokenNameIdentifier	 metadata File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
