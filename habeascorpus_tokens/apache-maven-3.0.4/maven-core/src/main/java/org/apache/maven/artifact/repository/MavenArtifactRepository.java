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
//TODO: completely separate local and remote artifact repositories 	TokenNameCOMMENT_LINE	TODO: completely separate local and remote artifact repositories 
public	TokenNamepublic	
class	TokenNameclass	
MavenArtifactRepository	TokenNameIdentifier	 Maven Artifact Repository
implements	TokenNameimplements	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
basedir	TokenNameIdentifier	 basedir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
;	TokenNameSEMICOLON	
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
public	TokenNamepublic	
MavenArtifactRepository	TokenNameIdentifier	 Maven Artifact Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Create a remote download repository. * * @param id the unique identifier of the repository * @param url the URL of the repository * @param layout the layout of the repository * @param snapshots the policies to use for snapshots * @param releases the policies to use for releases */	TokenNameCOMMENT_JAVADOC	 Create a remote download repository. * @param id the unique identifier of the repository @param url the URL of the repository @param layout the layout of the repository @param snapshots the policies to use for snapshots @param releases the policies to use for releases 
public	TokenNamepublic	
MavenArtifactRepository	TokenNameIdentifier	 Maven Artifact Repository
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
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
snapshots	TokenNameIdentifier	 snapshots
=	TokenNameEQUAL	
snapshots	TokenNameIdentifier	 snapshots
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
releases	TokenNameIdentifier	 releases
=	TokenNameEQUAL	
releases	TokenNameIdentifier	 releases
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Derive these from the URL 	TokenNameCOMMENT_LINE	Derive these from the URL 
// 	TokenNameCOMMENT_LINE	 
this	TokenNamethis	
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
protocol	TokenNameIdentifier	 protocol
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
basedir	TokenNameIdentifier	 basedir
=	TokenNameEQUAL	
basedir	TokenNameIdentifier	 basedir
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
basedir	TokenNameIdentifier	 basedir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
protocol	TokenNameIdentifier	 protocol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
protocol	TokenNameIdentifier	 protocol
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
basedir	TokenNameIdentifier	 basedir
=	TokenNameEQUAL	
basedir	TokenNameIdentifier	 basedir
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Path Utils 	TokenNameCOMMENT_LINE	Path Utils 
/** * /** * Return the protocol name. * <br/> * E.g: for input * <code>http://www.codehause.org</code> this method will return <code>http</code> * * @param url the url * @return the host name */	TokenNameCOMMENT_JAVADOC	 /** Return the protocol name. <br/> E.g: for input <code>http://www.codehause.org</code> this method will return <code>http</code> * @param url the url @return the host name 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Derive the path portion of the given URL. * * @param url the repository URL * @return the basedir of the repository * @todo need to URL decode for spaces? */	TokenNameCOMMENT_JAVADOC	 Derive the path portion of the given URL. * @param url the repository URL @return the basedir of the repository @todo need to URL decode for spaces? 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
basedir	TokenNameIdentifier	 basedir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// special case: if omitted // on protocol, keep path as is 	TokenNameCOMMENT_LINE	special case: if omitted // on protocol, keep path as is 
if	TokenNameif	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"//"	TokenNameStringLiteral	//
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'|'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// special case: if there is a windows drive letter, then keep the original return value 	TokenNameCOMMENT_LINE	special case: if there is a windows drive letter, then keep the original return value 
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Now we expect the host 	TokenNameCOMMENT_LINE	Now we expect the host 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// special case: if there is a windows drive letter, then keep the original return value 	TokenNameCOMMENT_LINE	special case: if there is a windows drive letter, then keep the original return value 
if	TokenNameif	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'|'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// leading / was previously stripped 	TokenNameCOMMENT_LINE	leading / was previously stripped 
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
retValue	TokenNameIdentifier	 ret Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// special case: if there is a windows drive letter using |, switch to : 	TokenNameCOMMENT_LINE	special case: if there is a windows drive letter using |, switch to : 
if	TokenNameif	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize separators 	TokenNameCOMMENT_LINE	normalize separators 
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
"/"	TokenNameStringLiteral	/
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decodes the specified (portion of a) URL. <strong>Note:</strong> This decoder assumes that ISO-8859-1 is used to * convert URL-encoded octets to characters. * * @param url The URL to decode, may be <code>null</code>. * @return The decoded URL or <code>null</code> if the input was <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Decodes the specified (portion of a) URL. <strong>Note:</strong> This decoder assumes that ISO-8859-1 is used to convert URL-encoded octets to characters. * @param url The URL to decode, may be <code>null</code>. @return The decoded URL or <code>null</code> if the input was <code>null</code>. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
decoded	TokenNameIdentifier	 decoded
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
<	TokenNameLESS	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
hexStr	TokenNameIdentifier	 hex Str
=	TokenNameEQUAL	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
hexStr	TokenNameIdentifier	 hex Str
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decoded	TokenNameIdentifier	 decoded
=	TokenNameEQUAL	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
decoded	TokenNameIdentifier	 decoded
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
decoded	TokenNameIdentifier	 decoded
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
boolean	TokenNameboolean	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s1	TokenNameIdentifier	 s1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
:	TokenNameCOLON	
s2	TokenNameIdentifier	 s2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
isBlacklisted	TokenNameIdentifier	 is Blacklisted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBlacklisted	TokenNameIdentifier	 set Blacklisted
(	TokenNameLPAREN	
boolean	TokenNameboolean	
blackListed	TokenNameIdentifier	 black Listed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
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
