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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenSession	TokenNameIdentifier	 Maven Session
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
/** * Provides basic services to manage Maven plugins and their mojos. This component is kept general in its design such * that the plugins/mojos can be used in arbitrary contexts. In particular, the mojos can be used for ordinary build * plugins as well as special purpose plugins like reports. * * @since 3.0 * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Provides basic services to manage Maven plugins and their mojos. This component is kept general in its design such that the plugins/mojos can be used in arbitrary contexts. In particular, the mojos can be used for ordinary build plugins as well as special purpose plugins like reports. * @since 3.0 @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
MavenPluginManager	TokenNameIdentifier	 Maven Plugin Manager
{	TokenNameLBRACE	
/** * Retrieves the descriptor for the specified plugin from its main artifact. * * @param plugin The plugin whose descriptor should be retrieved, must not be {@code null}. * @param repositories The plugin repositories to use for resolving the plugin's main artifact, must not be {@code * null}. * @param session The repository session to use for resolving the plugin's main artifact, must not be {@code null}. * @return The plugin descriptor, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Retrieves the descriptor for the specified plugin from its main artifact. * @param plugin The plugin whose descriptor should be retrieved, must not be {@code null}. @param repositories The plugin repositories to use for resolving the plugin's main artifact, must not be {@code null}. @param session The repository session to use for resolving the plugin's main artifact, must not be {@code null}. @return The plugin descriptor, never {@code null}. 
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
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
,	TokenNameCOMMA	
PluginDescriptorParsingException	TokenNameIdentifier	 Plugin Descriptor Parsing Exception
,	TokenNameCOMMA	
InvalidPluginDescriptorException	TokenNameIdentifier	 Invalid Plugin Descriptor Exception
;	TokenNameSEMICOLON	
/** * Retrieves the descriptor for the specified plugin goal from the plugin's main artifact. * * @param plugin The plugin whose mojo descriptor should be retrieved, must not be {@code null}. * @param goal The simple name of the mojo whose descriptor should be retrieved, must not be {@code null}. * @param repositories The plugin repositories to use for resolving the plugin's main artifact, must not be {@code * null}. * @param session The repository session to use for resolving the plugin's main artifact, must not be {@code null}. * @return The mojo descriptor, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Retrieves the descriptor for the specified plugin goal from the plugin's main artifact. * @param plugin The plugin whose mojo descriptor should be retrieved, must not be {@code null}. @param goal The simple name of the mojo whose descriptor should be retrieved, must not be {@code null}. @param repositories The plugin repositories to use for resolving the plugin's main artifact, must not be {@code null}. @param session The repository session to use for resolving the plugin's main artifact, must not be {@code null}. @return The mojo descriptor, never {@code null}. 
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
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
MojoNotFoundException	TokenNameIdentifier	 Mojo Not Found Exception
,	TokenNameCOMMA	
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
,	TokenNameCOMMA	
PluginDescriptorParsingException	TokenNameIdentifier	 Plugin Descriptor Parsing Exception
,	TokenNameCOMMA	
InvalidPluginDescriptorException	TokenNameIdentifier	 Invalid Plugin Descriptor Exception
;	TokenNameSEMICOLON	
/** * Verifies the specified plugin is compatible with the current Maven runtime. * * @param pluginDescriptor The descriptor of the plugin to check, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Verifies the specified plugin is compatible with the current Maven runtime. * @param pluginDescriptor The descriptor of the plugin to check, must not be {@code null}. 
void	TokenNamevoid	
checkRequiredMavenVersion	TokenNameIdentifier	 check Required Maven Version
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
throws	TokenNamethrows	
PluginIncompatibleException	TokenNameIdentifier	 Plugin Incompatible Exception
;	TokenNameSEMICOLON	
/** * Sets up the class realm for the specified plugin. Both the class realm and the plugin artifacts that constitute * it will be stored in the plugin descriptor. * * @param pluginDescriptor The plugin descriptor in which to save the class realm and the plugin artifacts, must not * be {@code null}. * @param session The build session from which to pick the current project and repository settings, must not be * {@code null}. * @param parent The parent class realm for the plugin, may be {@code null} to use the Maven core realm. * @param imports The packages/types to import from the parent realm, may be {@code null}. * @param filter The filter used to exclude certain plugin dependencies, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets up the class realm for the specified plugin. Both the class realm and the plugin artifacts that constitute it will be stored in the plugin descriptor. * @param pluginDescriptor The plugin descriptor in which to save the class realm and the plugin artifacts, must not be {@code null}. @param session The build session from which to pick the current project and repository settings, must not be {@code null}. @param parent The parent class realm for the plugin, may be {@code null} to use the Maven core realm. @param imports The packages/types to import from the parent realm, may be {@code null}. @param filter The filter used to exclude certain plugin dependencies, may be {@code null}. 
void	TokenNamevoid	
setupPluginRealm	TokenNameIdentifier	 setup Plugin Realm
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
imports	TokenNameIdentifier	 imports
,	TokenNameCOMMA	
DependencyFilter	TokenNameIdentifier	 Dependency Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
throws	TokenNamethrows	
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
,	TokenNameCOMMA	
PluginContainerException	TokenNameIdentifier	 Plugin Container Exception
;	TokenNameSEMICOLON	
/** * Looks up the mojo for the specified mojo execution and populates its parameters from the configuration given by * the mojo execution. The mojo/plugin descriptor associated with the mojo execution provides the class realm to * lookup the mojo from. <strong>Warning:</strong> The returned mojo instance must be released via * {@link #releaseMojo(Object, MojoExecution)} when the mojo is no longer needed to free any resources allocated for * it. * * @param mojoInterface The component role of the mojo, must not be {@code null}. * @param session The build session in whose context the mojo will be used, must not be {@code null}. * @param mojoExecution The mojo execution to retrieve the mojo for, must not be {@code null}. * @return The ready-to-execute mojo, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Looks up the mojo for the specified mojo execution and populates its parameters from the configuration given by the mojo execution. The mojo/plugin descriptor associated with the mojo execution provides the class realm to lookup the mojo from. <strong>Warning:</strong> The returned mojo instance must be released via {@link #releaseMojo(Object, MojoExecution)} when the mojo is no longer needed to free any resources allocated for it. * @param mojoInterface The component role of the mojo, must not be {@code null}. @param session The build session in whose context the mojo will be used, must not be {@code null}. @param mojoExecution The mojo execution to retrieve the mojo for, must not be {@code null}. @return The ready-to-execute mojo, never {@code null}. 
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
T	TokenNameIdentifier	 T
getConfiguredMojo	TokenNameIdentifier	 get Configured Mojo
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
mojoInterface	TokenNameIdentifier	 mojo Interface
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
)	TokenNameRPAREN	
throws	TokenNamethrows	
PluginConfigurationException	TokenNameIdentifier	 Plugin Configuration Exception
,	TokenNameCOMMA	
PluginContainerException	TokenNameIdentifier	 Plugin Container Exception
;	TokenNameSEMICOLON	
/** * Releases the specified mojo back to the container. * * @param mojo The mojo to release, may be {@code null}. * @param mojoExecution The mojo execution the mojo was originally retrieved for, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Releases the specified mojo back to the container. * @param mojo The mojo to release, may be {@code null}. @param mojoExecution The mojo execution the mojo was originally retrieved for, must not be {@code null}. 
void	TokenNamevoid	
releaseMojo	TokenNameIdentifier	 release Mojo
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
mojo	TokenNameIdentifier	 mojo
,	TokenNameCOMMA	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
