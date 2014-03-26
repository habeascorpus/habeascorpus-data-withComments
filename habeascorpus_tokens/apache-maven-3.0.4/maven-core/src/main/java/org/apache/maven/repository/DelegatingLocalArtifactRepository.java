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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
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
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
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
MavenArtifactRepository	TokenNameIdentifier	 Maven Artifact Repository
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
/** * Delegating local artifact repository chains the reactor, IDE workspace * and user local repository. */	TokenNameCOMMENT_JAVADOC	 Delegating local artifact repository chains the reactor, IDE workspace and user local repository. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
DelegatingLocalArtifactRepository	TokenNameIdentifier	 Delegating Local Artifact Repository
extends	TokenNameextends	
MavenArtifactRepository	TokenNameIdentifier	 Maven Artifact Repository
{	TokenNameLBRACE	
private	TokenNameprivate	
LocalArtifactRepository	TokenNameIdentifier	 Local Artifact Repository
buildReactor	TokenNameIdentifier	 build Reactor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LocalArtifactRepository	TokenNameIdentifier	 Local Artifact Repository
ideWorkspace	TokenNameIdentifier	 ide Workspace
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DelegatingLocalArtifactRepository	TokenNameIdentifier	 Delegating Local Artifact Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
artifactRepository	TokenNameIdentifier	 artifact Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
=	TokenNameEQUAL	
artifactRepository	TokenNameIdentifier	 artifact Repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBuildReactor	TokenNameIdentifier	 set Build Reactor
(	TokenNameLPAREN	
LocalArtifactRepository	TokenNameIdentifier	 Local Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
buildReactor	TokenNameIdentifier	 build Reactor
=	TokenNameEQUAL	
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setIdeWorkspace	TokenNameIdentifier	 set Ide Workspace
(	TokenNameLPAREN	
LocalArtifactRepository	TokenNameIdentifier	 Local Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ideWorkspace	TokenNameIdentifier	 ide Workspace
=	TokenNameEQUAL	
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LocalArtifactRepository	TokenNameIdentifier	 Local Artifact Repository
getIdeWorspace	TokenNameIdentifier	 get Ide Worspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ideWorkspace	TokenNameIdentifier	 ide Workspace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Artifact	TokenNameIdentifier	 Artifact
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isRelease	TokenNameIdentifier	 is Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
buildReactor	TokenNameIdentifier	 build Reactor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
buildReactor	TokenNameIdentifier	 build Reactor
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ideWorkspace	TokenNameIdentifier	 ide Workspace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
ideWorkspace	TokenNameIdentifier	 ide Workspace
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buildReactor	TokenNameIdentifier	 build Reactor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
buildReactor	TokenNameIdentifier	 build Reactor
.	TokenNameDOT	
findVersions	TokenNameIdentifier	 find Versions
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ideWorkspace	TokenNameIdentifier	 ide Workspace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
ideWorkspace	TokenNameIdentifier	 ide Workspace
.	TokenNameDOT	
findVersions	TokenNameIdentifier	 find Versions
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
findVersions	TokenNameIdentifier	 find Versions
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
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
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
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
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
pathOf	TokenNameIdentifier	 path Of
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
pathOf	TokenNameIdentifier	 path Of
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
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
(	TokenNameLPAREN	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
getReleases	TokenNameIdentifier	 get Releases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
getReleases	TokenNameIdentifier	 get Releases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
buildReactor	TokenNameIdentifier	 build Reactor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
buildReactor	TokenNameIdentifier	 build Reactor
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
ideWorkspace	TokenNameIdentifier	 ide Workspace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ideWorkspace	TokenNameIdentifier	 ide Workspace
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
DelegatingLocalArtifactRepository	TokenNameIdentifier	 Delegating Local Artifact Repository
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DelegatingLocalArtifactRepository	TokenNameIdentifier	 Delegating Local Artifact Repository
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
buildReactor	TokenNameIdentifier	 build Reactor
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
buildReactor	TokenNameIdentifier	 build Reactor
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
ideWorkspace	TokenNameIdentifier	 ide Workspace
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ideWorkspace	TokenNameIdentifier	 ide Workspace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
userLocalArtifactRepository	TokenNameIdentifier	 user Local Artifact Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
