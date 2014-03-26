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
Artifact	TokenNameIdentifier	 Artifact
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
project	TokenNameIdentifier	 project
.	TokenNameDOT	
MavenProject	TokenNameIdentifier	 Maven Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
classworlds	TokenNameIdentifier	 classworlds
.	TokenNameDOT	
realm	TokenNameIdentifier	 realm
.	TokenNameDOT	
ClassRealm	TokenNameIdentifier	 Class Realm
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
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
DependencyFilter	TokenNameIdentifier	 Dependency Filter
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
/** * Caches plugin class realms. <strong>Warning:</strong> This is an internal utility interface that is only public for * technical reasons, it is not part of the public API. In particular, this interface can be changed or deleted without * prior notice. * * @author Igor Fedorenko * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Caches plugin class realms. <strong>Warning:</strong> This is an internal utility interface that is only public for technical reasons, it is not part of the public API. In particular, this interface can be changed or deleted without prior notice. * @author Igor Fedorenko @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
PluginRealmCache	TokenNameIdentifier	 Plugin Realm Cache
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CacheRecord	TokenNameIdentifier	 Cache Record
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
ClassRealm	TokenNameIdentifier	 Class Realm
realm	TokenNameIdentifier	 realm
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CacheRecord	TokenNameIdentifier	 Cache Record
(	TokenNameLPAREN	
ClassRealm	TokenNameIdentifier	 Class Realm
realm	TokenNameIdentifier	 realm
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
realm	TokenNameIdentifier	 realm
=	TokenNameEQUAL	
realm	TokenNameIdentifier	 realm
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifacts	TokenNameIdentifier	 artifacts
=	TokenNameEQUAL	
artifacts	TokenNameIdentifier	 artifacts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A cache key. */	TokenNameCOMMENT_JAVADOC	 A cache key. 
interface	TokenNameinterface	
Key	TokenNameIdentifier	 Key
{	TokenNameLBRACE	
// marker interface for cache keys 	TokenNameCOMMENT_LINE	marker interface for cache keys 
}	TokenNameRBRACE	
Key	TokenNameIdentifier	 Key
createKey	TokenNameIdentifier	 create Key
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
parentRealm	TokenNameIdentifier	 parent Realm
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
>	TokenNameGREATER	
foreignImports	TokenNameIdentifier	 foreign Imports
,	TokenNameCOMMA	
DependencyFilter	TokenNameIdentifier	 Dependency Filter
dependencyFilter	TokenNameIdentifier	 dependency Filter
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
;	TokenNameSEMICOLON	
CacheRecord	TokenNameIdentifier	 Cache Record
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Key	TokenNameIdentifier	 Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CacheRecord	TokenNameIdentifier	 Cache Record
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Key	TokenNameIdentifier	 Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
ClassRealm	TokenNameIdentifier	 Class Realm
pluginRealm	TokenNameIdentifier	 plugin Realm
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
pluginArtifacts	TokenNameIdentifier	 plugin Artifacts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Registers the specified cache record for usage with the given project. Integrators can use the information * collected from this method in combination with a custom cache implementation to dispose unused records from the * cache. * * @param project The project that employs the plugin realm, must not be {@code null}. * @param record The cache record being used for the project, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Registers the specified cache record for usage with the given project. Integrators can use the information collected from this method in combination with a custom cache implementation to dispose unused records from the cache. * @param project The project that employs the plugin realm, must not be {@code null}. @param record The cache record being used for the project, must not be {@code null}. 
void	TokenNamevoid	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
CacheRecord	TokenNameIdentifier	 Cache Record
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
