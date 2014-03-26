package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
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
Model	TokenNameIdentifier	 Model
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
RemoteRepository	TokenNameIdentifier	 Remote Repository
;	TokenNameSEMICOLON	
/** * Collects settings required to resolve a plugin prefix. * * @since 3.0 * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects settings required to resolve a plugin prefix. * @since 3.0 @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
PluginPrefixRequest	TokenNameIdentifier	 Plugin Prefix Request
{	TokenNameLBRACE	
/** * Gets the prefix of the plugin. * * @return The prefix of the plugin. */	TokenNameCOMMENT_JAVADOC	 Gets the prefix of the plugin. * @return The prefix of the plugin. 
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the prefix of the plugin. * * @param prefix The prefix of the plugin. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the prefix of the plugin. * @param prefix The prefix of the plugin. @return This request, never {@code null}. 
PluginPrefixRequest	TokenNameIdentifier	 Plugin Prefix Request
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the list of group ids to scan for the plugin prefix. * * @return The list of group ids to scan for the plugin prefix, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the list of group ids to scan for the plugin prefix. * @return The list of group ids to scan for the plugin prefix, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getPluginGroups	TokenNameIdentifier	 get Plugin Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the list of group ids to scan for the plugin prefix. * * @param pluginGroups The list of group ids to scan for the plugin prefix, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the list of group ids to scan for the plugin prefix. * @param pluginGroups The list of group ids to scan for the plugin prefix, may be {@code null}. @return This request, never {@code null}. 
PluginPrefixRequest	TokenNameIdentifier	 Plugin Prefix Request
setPluginGroups	TokenNameIdentifier	 set Plugin Groups
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
pluginGroups	TokenNameIdentifier	 plugin Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the POM whose build plugins are to be scanned for the prefix. * * @return The POM whose build plugins are to be scanned for the prefix or {@code null} to only search the plugin * repositories. */	TokenNameCOMMENT_JAVADOC	 Gets the POM whose build plugins are to be scanned for the prefix. * @return The POM whose build plugins are to be scanned for the prefix or {@code null} to only search the plugin repositories. 
Model	TokenNameIdentifier	 Model
getPom	TokenNameIdentifier	 get Pom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the POM whose build plugins are to be scanned for the prefix. * * @param pom The POM whose build plugins are to be scanned for the prefix, may be {@code null} to only search the * plugin repositories. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the POM whose build plugins are to be scanned for the prefix. * @param pom The POM whose build plugins are to be scanned for the prefix, may be {@code null} to only search the plugin repositories. @return This request, never {@code null}. 
PluginPrefixRequest	TokenNameIdentifier	 Plugin Prefix Request
setPom	TokenNameIdentifier	 set Pom
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the remote repositories to use. * * @return The remote repositories to use, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the remote repositories to use. * @return The remote repositories to use, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
getRepositories	TokenNameIdentifier	 get Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the remote repositories to use. <em>Note:</em> When creating a request from a project, be sure to use the * plugin repositories and not the regular project repositories. * * @param repositories The remote repositories to use. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the remote repositories to use. <em>Note:</em> When creating a request from a project, be sure to use the plugin repositories and not the regular project repositories. * @param repositories The remote repositories to use. @return This request, never {@code null}. 
PluginPrefixRequest	TokenNameIdentifier	 Plugin Prefix Request
setRepositories	TokenNameIdentifier	 set Repositories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the session to use for repository access. * * @return The repository session or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the session to use for repository access. * @return The repository session or {@code null} if not set. 
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
getRepositorySession	TokenNameIdentifier	 get Repository Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the session to use for repository access. * * @param repositorySession The repository session to use. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the session to use for repository access. * @param repositorySession The repository session to use. @return This request, never {@code null}. 
PluginPrefixRequest	TokenNameIdentifier	 Plugin Prefix Request
setRepositorySession	TokenNameIdentifier	 set Repository Session
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
repositorySession	TokenNameIdentifier	 repository Session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
