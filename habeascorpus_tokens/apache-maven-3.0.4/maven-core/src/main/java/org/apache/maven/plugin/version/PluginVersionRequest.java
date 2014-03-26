package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
version	TokenNameIdentifier	 version
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
/** * Collects settings required to resolve the version for a plugin. * * @since 3.0 * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects settings required to resolve the version for a plugin. * @since 3.0 @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
PluginVersionRequest	TokenNameIdentifier	 Plugin Version Request
{	TokenNameLBRACE	
/** * Gets the group id of the plugin. * * @return The group id of the plugin. */	TokenNameCOMMENT_JAVADOC	 Gets the group id of the plugin. * @return The group id of the plugin. 
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the group id of the plugin. * * @param groupId The group id of the plugin. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the group id of the plugin. * @param groupId The group id of the plugin. @return This request, never {@code null}. 
PluginVersionRequest	TokenNameIdentifier	 Plugin Version Request
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the artifact id of the plugin. * * @return The artifact id of the plugin. */	TokenNameCOMMENT_JAVADOC	 Gets the artifact id of the plugin. * @return The artifact id of the plugin. 
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the artifact id of the plugin. * * @param artifactId The artifact id of the plugin. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the artifact id of the plugin. * @param artifactId The artifact id of the plugin. @return This request, never {@code null}. 
PluginVersionRequest	TokenNameIdentifier	 Plugin Version Request
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the POM whose build plugins are to be scanned for the version. * * @return The POM whose build plugins are to be scanned for the verion or {@code null} to only search the plugin * repositories. */	TokenNameCOMMENT_JAVADOC	 Gets the POM whose build plugins are to be scanned for the version. * @return The POM whose build plugins are to be scanned for the verion or {@code null} to only search the plugin repositories. 
Model	TokenNameIdentifier	 Model
getPom	TokenNameIdentifier	 get Pom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the POM whose build plugins are to be scanned for the version. * * @param pom The POM whose build plugins are to be scanned for the version, may be {@code null} to only search the * plugin repositories. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the POM whose build plugins are to be scanned for the version. * @param pom The POM whose build plugins are to be scanned for the version, may be {@code null} to only search the plugin repositories. @return This request, never {@code null}. 
PluginVersionRequest	TokenNameIdentifier	 Plugin Version Request
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
PluginVersionRequest	TokenNameIdentifier	 Plugin Version Request
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
PluginVersionRequest	TokenNameIdentifier	 Plugin Version Request
setRepositorySession	TokenNameIdentifier	 set Repository Session
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
repositorySession	TokenNameIdentifier	 repository Session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
