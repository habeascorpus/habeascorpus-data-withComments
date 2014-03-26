package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
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
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
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
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Plugin	TokenNameIdentifier	 Plugin
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ComponentDescriptor	TokenNameIdentifier	 Component Descriptor
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
LocalRepository	TokenNameIdentifier	 Local Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
RemoteRepository	TokenNameIdentifier	 Remote Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
WorkspaceRepository	TokenNameIdentifier	 Workspace Repository
;	TokenNameSEMICOLON	
/** * Caches raw plugin descriptors. A raw plugin descriptor is a descriptor that has just been extracted from the plugin * artifact and does not contain any runtime specific data. The cache must not be used for descriptors that hold runtime * data like the plugin realm. <strong>Warning:</strong> This is an internal utility interface that is only public for * technical reasons, it is not part of the public API. In particular, this interface can be changed or deleted without * prior notice. * * @since 3.0 * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Caches raw plugin descriptors. A raw plugin descriptor is a descriptor that has just been extracted from the plugin artifact and does not contain any runtime specific data. The cache must not be used for descriptors that hold runtime data like the plugin realm. <strong>Warning:</strong> This is an internal utility interface that is only public for technical reasons, it is not part of the public API. In particular, this interface can be changed or deleted without prior notice. * @since 3.0 @author Benjamin Bentmann 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
PluginDescriptorCache	TokenNameIdentifier	 Plugin Descriptor Cache
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultPluginDescriptorCache	TokenNameIdentifier	 Default Plugin Descriptor Cache
implements	TokenNameimplements	
PluginDescriptorCache	TokenNameIdentifier	 Plugin Descriptor Cache
{	TokenNameLBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Key	TokenNameIdentifier	 Key
,	TokenNameCOMMA	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
>	TokenNameGREATER	
descriptors	TokenNameIdentifier	 descriptors
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Key	TokenNameIdentifier	 Key
,	TokenNameCOMMA	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
>	TokenNameGREATER	
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
descriptors	TokenNameIdentifier	 descriptors
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Key	TokenNameIdentifier	 Key
createKey	TokenNameIdentifier	 create Key
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
,	TokenNameCOMMA	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CacheKey	TokenNameIdentifier	 Cache Key
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
repositories	TokenNameIdentifier	 repositories
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Key	TokenNameIdentifier	 Key
cacheKey	TokenNameIdentifier	 cache Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
descriptors	TokenNameIdentifier	 descriptors
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cacheKey	TokenNameIdentifier	 cache Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Key	TokenNameIdentifier	 Key
cacheKey	TokenNameIdentifier	 cache Key
,	TokenNameCOMMA	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
descriptors	TokenNameIdentifier	 descriptors
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
cacheKey	TokenNameIdentifier	 cache Key
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
new	TokenNamenew	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setGoalPrefix	TokenNameIdentifier	 set Goal Prefix
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getGoalPrefix	TokenNameIdentifier	 get Goal Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setInheritedByDefault	TokenNameIdentifier	 set Inherited By Default
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
isInheritedByDefault	TokenNameIdentifier	 is Inherited By Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setRequiredMavenVersion	TokenNameIdentifier	 set Required Maven Version
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getRequiredMavenVersion	TokenNameIdentifier	 get Required Maven Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setPluginArtifact	TokenNameIdentifier	 set Plugin Artifact
(	TokenNameLPAREN	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
copyArtifactSafe	TokenNameIdentifier	 copy Artifact Safe
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getPluginArtifact	TokenNameIdentifier	 get Plugin Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setComponents	TokenNameIdentifier	 set Components
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getMojos	TokenNameIdentifier	 get Mojos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setIsolatedRealm	TokenNameIdentifier	 set Isolated Realm
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
isIsolatedRealm	TokenNameIdentifier	 is Isolated Realm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ComponentDescriptor	TokenNameIdentifier	 Component Descriptor
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
>	TokenNameGREATER	
mojos	TokenNameIdentifier	 mojos
,	TokenNameCOMMA	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ComponentDescriptor	TokenNameIdentifier	 Component Descriptor
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
clones	TokenNameIdentifier	 clones
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mojos	TokenNameIdentifier	 mojos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clones	TokenNameIdentifier	 clones
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ComponentDescriptor	TokenNameIdentifier	 Component Descriptor
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
mojos	TokenNameIdentifier	 mojos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojo	TokenNameIdentifier	 mojo
:	TokenNameCOLON	
mojos	TokenNameIdentifier	 mojos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setPluginDescriptor	TokenNameIdentifier	 set Plugin Descriptor
(	TokenNameLPAREN	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clones	TokenNameIdentifier	 clones
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
clones	TokenNameIdentifier	 clones
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CacheKey	TokenNameIdentifier	 Cache Key
implements	TokenNameimplements	
Key	TokenNameIdentifier	 Key
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
WorkspaceRepository	TokenNameIdentifier	 Workspace Repository
workspace	TokenNameIdentifier	 workspace
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
LocalRepository	TokenNameIdentifier	 Local Repository
localRepo	TokenNameIdentifier	 local Repo
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CacheKey	TokenNameIdentifier	 Cache Key
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
,	TokenNameCOMMA	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
workspace	TokenNameIdentifier	 workspace
=	TokenNameEQUAL	
CacheUtils	TokenNameIdentifier	 Cache Utils
.	TokenNameDOT	
getWorkspace	TokenNameIdentifier	 get Workspace
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localRepo	TokenNameIdentifier	 local Repo
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repositories	TokenNameIdentifier	 repositories
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
(	TokenNameLPAREN	
repositories	TokenNameIdentifier	 repositories
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
RemoteRepository	TokenNameIdentifier	 Remote Repository
repository	TokenNameIdentifier	 repository
:	TokenNameCOLON	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
isRepositoryManager	TokenNameIdentifier	 is Repository Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repositories	TokenNameIdentifier	 repositories
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getMirroredRepositories	TokenNameIdentifier	 get Mirrored Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repositories	TokenNameIdentifier	 repositories
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
groupId	TokenNameIdentifier	 group Id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
workspace	TokenNameIdentifier	 workspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
localRepo	TokenNameIdentifier	 local Repo
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
CacheUtils	TokenNameIdentifier	 Cache Utils
.	TokenNameDOT	
repositoriesHashCode	TokenNameIdentifier	 repositories Hash Code
(	TokenNameLPAREN	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
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
return	TokenNamereturn	
hashCode	TokenNameIdentifier	 hash Code
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
!	TokenNameNOT	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
CacheKey	TokenNameIdentifier	 Cache Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CacheKey	TokenNameIdentifier	 Cache Key
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CacheKey	TokenNameIdentifier	 Cache Key
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
localRepo	TokenNameIdentifier	 local Repo
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
localRepo	TokenNameIdentifier	 local Repo
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
workspace	TokenNameIdentifier	 workspace
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
workspace	TokenNameIdentifier	 workspace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
CacheUtils	TokenNameIdentifier	 Cache Utils
.	TokenNameDOT	
repositoriesEquals	TokenNameIdentifier	 repositories Equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
repositories	TokenNameIdentifier	 repositories
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
