package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
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
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
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
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
DependencyNode	TokenNameIdentifier	 Dependency Node
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
/** * Assists in resolving the dependencies of a plugin. <strong>Warning:</strong> This is an internal utility interface * that is only public for technical reasons, it is not part of the public API. In particular, this interface can be * changed or deleted without prior notice. * * @since 3.0 * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Assists in resolving the dependencies of a plugin. <strong>Warning:</strong> This is an internal utility interface that is only public for technical reasons, it is not part of the public API. In particular, this interface can be changed or deleted without prior notice. * @since 3.0 @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
PluginDependenciesResolver	TokenNameIdentifier	 Plugin Dependencies Resolver
{	TokenNameLBRACE	
/** * Resolves the main artifact of the specified plugin. * * @param plugin The plugin for which to resolve the main artifact, must not be {@code null}. * @param repositories The plugin repositories to use for resolving the plugin's main artifact, must not be {@code * null}. * @param session The repository session to use for resolving the plugin's main artifact, must not be {@code null}. * @return The resolved plugin artifact, never {@code null}. * @throws PluginResolutionException If the plugin artifact could not be resolved. */	TokenNameCOMMENT_JAVADOC	 Resolves the main artifact of the specified plugin. * @param plugin The plugin for which to resolve the main artifact, must not be {@code null}. @param repositories The plugin repositories to use for resolving the plugin's main artifact, must not be {@code null}. @param session The repository session to use for resolving the plugin's main artifact, must not be {@code null}. @return The resolved plugin artifact, never {@code null}. @throws PluginResolutionException If the plugin artifact could not be resolved. 
public	TokenNamepublic	
Artifact	TokenNameIdentifier	 Artifact
resolve	TokenNameIdentifier	 resolve
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
throws	TokenNamethrows	
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
;	TokenNameSEMICOLON	
/** * Resolves the runtime dependencies of the specified plugin. * * @param plugin The plugin for which to resolve the dependencies, must not be {@code null}. * @param pluginArtifact The plugin's main artifact, may be {@code null}. * @param dependencyFilter A filter to exclude artifacts from resolution (but not collection), may be {@code null}. * @param repositories The plugin repositories to use for resolving the plugin artifacts, must not be {@code null}. * @param session The repository session to use for resolving the plugin artifacts, must not be {@code null}. * @return The dependency tree denoting the resolved plugin class path, never {@code null}. * @throws PluginResolutionException If any dependency could not be resolved. */	TokenNameCOMMENT_JAVADOC	 Resolves the runtime dependencies of the specified plugin. * @param plugin The plugin for which to resolve the dependencies, must not be {@code null}. @param pluginArtifact The plugin's main artifact, may be {@code null}. @param dependencyFilter A filter to exclude artifacts from resolution (but not collection), may be {@code null}. @param repositories The plugin repositories to use for resolving the plugin artifacts, must not be {@code null}. @param session The repository session to use for resolving the plugin artifacts, must not be {@code null}. @return The dependency tree denoting the resolved plugin class path, never {@code null}. @throws PluginResolutionException If any dependency could not be resolved. 
DependencyNode	TokenNameIdentifier	 Dependency Node
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
pluginArtifact	TokenNameIdentifier	 plugin Artifact
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
throws	TokenNamethrows	
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
