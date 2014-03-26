package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
AbstractArtifactMetadata	TokenNameIdentifier	 Abstract Artifact Metadata
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
RepositoryMetadataStoreException	TokenNameIdentifier	 Repository Metadata Store Exception
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
/** * Attach a POM to an artifact. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Attach a POM to an artifact. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
ProjectArtifactMetadata	TokenNameIdentifier	 Project Artifact Metadata
extends	TokenNameextends	
AbstractArtifactMetadata	TokenNameIdentifier	 Abstract Artifact Metadata
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ProjectArtifactMetadata	TokenNameIdentifier	 Project Artifact Metadata
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProjectArtifactMetadata	TokenNameIdentifier	 Project Artifact Metadata
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
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRemoteFilename	TokenNameIdentifier	 get Remote Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalFilename	TokenNameIdentifier	 get Local Filename
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".pom"	TokenNameStringLiteral	.pom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
storeInLocalRepository	TokenNameIdentifier	 store In Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
RepositoryMetadataStoreException	TokenNameIdentifier	 Repository Metadata Store Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
destination	TokenNameIdentifier	 destination
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localRepository	TokenNameIdentifier	 local Repository
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
localRepository	TokenNameIdentifier	 local Repository
.	TokenNameDOT	
pathOfLocalRepositoryMetadata	TokenNameIdentifier	 path Of Local Repository Metadata
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
remoteRepository	TokenNameIdentifier	 remote Repository
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
// I'm fully aware that the file could just be moved using File.rename but 	TokenNameCOMMENT_LINE	I'm fully aware that the file could just be moved using File.rename but 
// there are bugs in various JVM that have problems doing this across 	TokenNameCOMMENT_LINE	there are bugs in various JVM that have problems doing this across 
// different filesystem. So we'll incur the small hit to actually copy 	TokenNameCOMMENT_LINE	different filesystem. So we'll incur the small hit to actually copy 
// here and be safe. jvz. 	TokenNameCOMMENT_LINE	here and be safe. jvz. 
// ---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
try	TokenNametry	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
destination	TokenNameIdentifier	 destination
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RepositoryMetadataStoreException	TokenNameIdentifier	 Repository Metadata Store Exception
(	TokenNameLPAREN	
"Error copying POM to the local repository."	TokenNameStringLiteral	Error copying POM to the local repository.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"project information for "	TokenNameStringLiteral	project information for 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
storedInArtifactVersionDirectory	TokenNameIdentifier	 stored In Artifact Version Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"project "	TokenNameStringLiteral	project 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProjectArtifactMetadata	TokenNameIdentifier	 Project Artifact Metadata
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ProjectArtifactMetadata	TokenNameIdentifier	 Project Artifact Metadata
)	TokenNameRPAREN	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Cannot add two different pieces of metadata for: "	TokenNameStringLiteral	Cannot add two different pieces of metadata for: 
+	TokenNamePLUS	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
)	TokenNameRPAREN	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
