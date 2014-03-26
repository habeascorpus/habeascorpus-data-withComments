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
Collections	TokenNameIdentifier	 Collections
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
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
Proxy	TokenNameIdentifier	 Proxy
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
;	TokenNameSEMICOLON	
/** * This class is an abstraction of the location from/to resources can be * transfered. * * @author <a href="michal.maczka@dimatics.com">Michal Maczka </a> */	TokenNameCOMMENT_JAVADOC	 This class is an abstraction of the location from/to resources can be transfered. * @author <a href="michal.maczka@dimatics.com">Michal Maczka </a> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
DefaultArtifactRepository	TokenNameIdentifier	 Default Artifact Repository
extends	TokenNameextends	
Repository	TokenNameIdentifier	 Repository
implements	TokenNameimplements	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
{	TokenNameLBRACE	
private	TokenNameprivate	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
snapshots	TokenNameIdentifier	 snapshots
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
releases	TokenNameIdentifier	 releases
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
blacklisted	TokenNameIdentifier	 blacklisted
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Authentication	TokenNameIdentifier	 Authentication
authentication	TokenNameIdentifier	 authentication
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Proxy	TokenNameIdentifier	 Proxy
proxy	TokenNameIdentifier	 proxy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
mirroredRepositories	TokenNameIdentifier	 mirrored Repositories
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a local repository or a test repository. * * @param id the unique identifier of the repository * @param url the URL of the repository * @param layout the layout of the repository */	TokenNameCOMMENT_JAVADOC	 Create a local repository or a test repository. * @param id the unique identifier of the repository @param url the URL of the repository @param layout the layout of the repository 
public	TokenNamepublic	
DefaultArtifactRepository	TokenNameIdentifier	 Default Artifact Repository
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a remote deployment repository. * * @param id the unique identifier of the repository * @param url the URL of the repository * @param layout the layout of the repository * @param uniqueVersion whether to assign each snapshot a unique version */	TokenNameCOMMENT_JAVADOC	 Create a remote deployment repository. * @param id the unique identifier of the repository @param url the URL of the repository @param layout the layout of the repository @param uniqueVersion whether to assign each snapshot a unique version 
public	TokenNamepublic	
DefaultArtifactRepository	TokenNameIdentifier	 Default Artifact Repository
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
boolean	TokenNameboolean	
uniqueVersion	TokenNameIdentifier	 unique Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a remote download repository. * * @param id the unique identifier of the repository * @param url the URL of the repository * @param layout the layout of the repository * @param snapshots the policies to use for snapshots * @param releases the policies to use for releases */	TokenNameCOMMENT_JAVADOC	 Create a remote download repository. * @param id the unique identifier of the repository @param url the URL of the repository @param layout the layout of the repository @param snapshots the policies to use for snapshots @param releases the policies to use for releases 
public	TokenNamepublic	
DefaultArtifactRepository	TokenNameIdentifier	 Default Artifact Repository
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
snapshots	TokenNameIdentifier	 snapshots
,	TokenNameCOMMA	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
releases	TokenNameIdentifier	 releases
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
snapshots	TokenNameIdentifier	 snapshots
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
snapshots	TokenNameIdentifier	 snapshots
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
.	TokenNameDOT	
UPDATE_POLICY_ALWAYS	TokenNameIdentifier	 UPDATE  POLICY  ALWAYS
,	TokenNameCOMMA	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
.	TokenNameDOT	
CHECKSUM_POLICY_IGNORE	TokenNameIdentifier	 CHECKSUM  POLICY  IGNORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
snapshots	TokenNameIdentifier	 snapshots
=	TokenNameEQUAL	
snapshots	TokenNameIdentifier	 snapshots
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
releases	TokenNameIdentifier	 releases
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
releases	TokenNameIdentifier	 releases
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
.	TokenNameDOT	
UPDATE_POLICY_ALWAYS	TokenNameIdentifier	 UPDATE  POLICY  ALWAYS
,	TokenNameCOMMA	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
.	TokenNameDOT	
CHECKSUM_POLICY_IGNORE	TokenNameIdentifier	 CHECKSUM  POLICY  IGNORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
releases	TokenNameIdentifier	 releases
=	TokenNameEQUAL	
releases	TokenNameIdentifier	 releases
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
pathOf	TokenNameIdentifier	 path Of
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
pathOf	TokenNameIdentifier	 path Of
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
pathOfRemoteRepositoryMetadata	TokenNameIdentifier	 path Of Remote Repository Metadata
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
artifactMetadata	TokenNameIdentifier	 artifact Metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
pathOfRemoteRepositoryMetadata	TokenNameIdentifier	 path Of Remote Repository Metadata
(	TokenNameLPAREN	
artifactMetadata	TokenNameIdentifier	 artifact Metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
pathOfLocalRepositoryMetadata	TokenNameIdentifier	 path Of Local Repository Metadata
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSnapshotUpdatePolicy	TokenNameIdentifier	 set Snapshot Update Policy
(	TokenNameLPAREN	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
snapshots	TokenNameIdentifier	 snapshots
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
snapshots	TokenNameIdentifier	 snapshots
=	TokenNameEQUAL	
snapshots	TokenNameIdentifier	 snapshots
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
snapshots	TokenNameIdentifier	 snapshots
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setReleaseUpdatePolicy	TokenNameIdentifier	 set Release Update Policy
(	TokenNameLPAREN	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
releases	TokenNameIdentifier	 releases
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
releases	TokenNameIdentifier	 releases
=	TokenNameEQUAL	
releases	TokenNameIdentifier	 releases
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
getReleases	TokenNameIdentifier	 get Releases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
releases	TokenNameIdentifier	 releases
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isBlacklisted	TokenNameIdentifier	 is Blacklisted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
blacklisted	TokenNameIdentifier	 blacklisted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBlacklisted	TokenNameIdentifier	 set Blacklisted
(	TokenNameLPAREN	
boolean	TokenNameboolean	
blacklisted	TokenNameIdentifier	 blacklisted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
blacklisted	TokenNameIdentifier	 blacklisted
=	TokenNameEQUAL	
blacklisted	TokenNameIdentifier	 blacklisted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" id: "	TokenNameStringLiteral	 id: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" url: "	TokenNameStringLiteral	 url: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" layout: "	TokenNameStringLiteral	 layout: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
layout	TokenNameIdentifier	 layout
:	TokenNameCOLON	
"none"	TokenNameStringLiteral	none
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
snapshots	TokenNameIdentifier	 snapshots
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"snapshots: [enabled => "	TokenNameStringLiteral	snapshots: [enabled => 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", update => "	TokenNameStringLiteral	, update => 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
releases	TokenNameIdentifier	 releases
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" releases: [enabled => "	TokenNameStringLiteral	 releases: [enabled => 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
releases	TokenNameIdentifier	 releases
.	TokenNameDOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", update => "	TokenNameStringLiteral	, update => 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
releases	TokenNameIdentifier	 releases
.	TokenNameDOT	
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Artifact	TokenNameIdentifier	 Artifact
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
artifactFile	TokenNameIdentifier	 artifact File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pathOf	TokenNameIdentifier	 path Of
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We need to set the file here or the resolver will fail with an NPE, not fully equipped to deal 	TokenNameCOMMENT_LINE	We need to set the file here or the resolver will fail with an NPE, not fully equipped to deal 
// with multiple local repository implementations yet. 	TokenNameCOMMENT_LINE	with multiple local repository implementations yet. 
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
artifactFile	TokenNameIdentifier	 artifact File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
artifactFile	TokenNameIdentifier	 artifact File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setResolved	TokenNameIdentifier	 set Resolved
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
findVersions	TokenNameIdentifier	 find Versions
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
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
boolean	TokenNameboolean	
isProjectAware	TokenNameIdentifier	 is Project Aware
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Authentication	TokenNameIdentifier	 Authentication
getAuthentication	TokenNameIdentifier	 get Authentication
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
authentication	TokenNameIdentifier	 authentication
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAuthentication	TokenNameIdentifier	 set Authentication
(	TokenNameLPAREN	
Authentication	TokenNameIdentifier	 Authentication
authentication	TokenNameIdentifier	 authentication
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
authentication	TokenNameIdentifier	 authentication
=	TokenNameEQUAL	
authentication	TokenNameIdentifier	 authentication
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Proxy	TokenNameIdentifier	 Proxy
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
proxy	TokenNameIdentifier	 proxy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
Proxy	TokenNameIdentifier	 Proxy
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
proxy	TokenNameIdentifier	 proxy
=	TokenNameEQUAL	
proxy	TokenNameIdentifier	 proxy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isUniqueVersion	TokenNameIdentifier	 is Unique Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
getMirroredRepositories	TokenNameIdentifier	 get Mirrored Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mirroredRepositories	TokenNameIdentifier	 mirrored Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMirroredRepositories	TokenNameIdentifier	 set Mirrored Repositories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
mirroredRepositories	TokenNameIdentifier	 mirrored Repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mirroredRepositories	TokenNameIdentifier	 mirrored Repositories
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mirroredRepositories	TokenNameIdentifier	 mirrored Repositories
=	TokenNameEQUAL	
mirroredRepositories	TokenNameIdentifier	 mirrored Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mirroredRepositories	TokenNameIdentifier	 mirrored Repositories
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
