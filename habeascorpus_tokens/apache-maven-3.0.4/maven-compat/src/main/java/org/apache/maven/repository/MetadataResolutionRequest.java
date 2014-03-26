package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
;	TokenNameSEMICOLON	
/** * * * @author Oleg Gusakov * */	TokenNameCOMMENT_JAVADOC	 * @author Oleg Gusakov 
public	TokenNamepublic	
class	TokenNameclass	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
{	TokenNameLBRACE	
private	TokenNameprivate	
MavenArtifactMetadata	TokenNameIdentifier	 Maven Artifact Metadata
mad	TokenNameIdentifier	 mad
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
// Needs to go away 	TokenNameCOMMENT_LINE	Needs to go away 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
;	TokenNameSEMICOLON	
// This is like a filter but overrides all transitive versions 	TokenNameCOMMENT_LINE	This is like a filter but overrides all transitive versions 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
managedVersionMap	TokenNameIdentifier	 managed Version Map
;	TokenNameSEMICOLON	
/** result type - flat list; the default */	TokenNameCOMMENT_JAVADOC	 result type - flat list; the default 
private	TokenNameprivate	
boolean	TokenNameboolean	
asList	TokenNameIdentifier	 as List
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** result type - dirty tree */	TokenNameCOMMENT_JAVADOC	 result type - dirty tree 
private	TokenNameprivate	
boolean	TokenNameboolean	
asDirtyTree	TokenNameIdentifier	 as Dirty Tree
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** result type - resolved tree */	TokenNameCOMMENT_JAVADOC	 result type - resolved tree 
private	TokenNameprivate	
boolean	TokenNameboolean	
asResolvedTree	TokenNameIdentifier	 as Resolved Tree
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** result type - graph */	TokenNameCOMMENT_JAVADOC	 result type - graph 
private	TokenNameprivate	
boolean	TokenNameboolean	
asGraph	TokenNameIdentifier	 as Graph
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
(	TokenNameLPAREN	
MavenArtifactMetadata	TokenNameIdentifier	 Maven Artifact Metadata
md	TokenNameIdentifier	 md
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mad	TokenNameIdentifier	 mad
=	TokenNameEQUAL	
md	TokenNameIdentifier	 md
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localRepository	TokenNameIdentifier	 local Repository
=	TokenNameEQUAL	
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
remoteRepositories	TokenNameIdentifier	 remote Repositories
=	TokenNameEQUAL	
remoteRepositories	TokenNameIdentifier	 remote Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenArtifactMetadata	TokenNameIdentifier	 Maven Artifact Metadata
getArtifactMetadata	TokenNameIdentifier	 get Artifact Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mad	TokenNameIdentifier	 mad
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setArtifactMetadata	TokenNameIdentifier	 set Artifact Metadata
(	TokenNameLPAREN	
MavenArtifactMetadata	TokenNameIdentifier	 Maven Artifact Metadata
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mad	TokenNameIdentifier	 mad
=	TokenNameEQUAL	
md	TokenNameIdentifier	 md
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setArtifactDependencies	TokenNameIdentifier	 set Artifact Dependencies
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
=	TokenNameEQUAL	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
getArtifactDependencies	TokenNameIdentifier	 get Artifact Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
localRepository	TokenNameIdentifier	 local Repository
=	TokenNameEQUAL	
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
getRemoteRepostories	TokenNameIdentifier	 get Remote Repostories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
remoteRepositories	TokenNameIdentifier	 remote Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setRemoteRepostories	TokenNameIdentifier	 set Remote Repostories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepostories	TokenNameIdentifier	 remote Repostories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
remoteRepositories	TokenNameIdentifier	 remote Repositories
=	TokenNameEQUAL	
remoteRepostories	TokenNameIdentifier	 remote Repostories
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getManagedVersionMap	TokenNameIdentifier	 get Managed Version Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
managedVersionMap	TokenNameIdentifier	 managed Version Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setManagedVersionMap	TokenNameIdentifier	 set Managed Version Map
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
managedVersionMap	TokenNameIdentifier	 managed Version Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
managedVersionMap	TokenNameIdentifier	 managed Version Map
=	TokenNameEQUAL	
managedVersionMap	TokenNameIdentifier	 managed Version Map
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
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
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"REQUEST: "	TokenNameStringLiteral	REQUEST: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"artifact: "	TokenNameStringLiteral	artifact: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mad	TokenNameIdentifier	 mad
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"localRepository: "	TokenNameStringLiteral	localRepository: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"remoteRepositories: "	TokenNameStringLiteral	remoteRepositories: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAsList	TokenNameIdentifier	 is As List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
asList	TokenNameIdentifier	 as List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setAsList	TokenNameIdentifier	 set As List
(	TokenNameLPAREN	
boolean	TokenNameboolean	
asList	TokenNameIdentifier	 as List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAsDirtyTree	TokenNameIdentifier	 is As Dirty Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
asDirtyTree	TokenNameIdentifier	 as Dirty Tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setAsDirtyTree	TokenNameIdentifier	 set As Dirty Tree
(	TokenNameLPAREN	
boolean	TokenNameboolean	
asDirtyTree	TokenNameIdentifier	 as Dirty Tree
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
asDirtyTree	TokenNameIdentifier	 as Dirty Tree
=	TokenNameEQUAL	
asDirtyTree	TokenNameIdentifier	 as Dirty Tree
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAsResolvedTree	TokenNameIdentifier	 is As Resolved Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
asResolvedTree	TokenNameIdentifier	 as Resolved Tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setAsResolvedTree	TokenNameIdentifier	 set As Resolved Tree
(	TokenNameLPAREN	
boolean	TokenNameboolean	
asResolvedTree	TokenNameIdentifier	 as Resolved Tree
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
asResolvedTree	TokenNameIdentifier	 as Resolved Tree
=	TokenNameEQUAL	
asResolvedTree	TokenNameIdentifier	 as Resolved Tree
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAsGraph	TokenNameIdentifier	 is As Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
asGraph	TokenNameIdentifier	 as Graph
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setAsGraph	TokenNameIdentifier	 set As Graph
(	TokenNameLPAREN	
boolean	TokenNameboolean	
asGraph	TokenNameIdentifier	 as Graph
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
asGraph	TokenNameIdentifier	 as Graph
=	TokenNameEQUAL	
asGraph	TokenNameIdentifier	 as Graph
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
