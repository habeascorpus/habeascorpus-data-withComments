package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
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
Properties	TokenNameIdentifier	 Properties
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
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
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
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
public	TokenNamepublic	
interface	TokenNameinterface	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
{	TokenNameLBRACE	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
setRemoteRepositories	TokenNameIdentifier	 set Remote Repositories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
getRemoteRepositories	TokenNameIdentifier	 get Remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
setPluginArtifactRepositories	TokenNameIdentifier	 set Plugin Artifact Repositories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
pluginArtifacgRepositories	TokenNameIdentifier	 plugin Artifacg Repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
getPluginArtifactRepositories	TokenNameIdentifier	 get Plugin Artifact Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the system properties to use for interpolation and profile activation. The system properties are collected * from the runtime environment like {@link System#getProperties()} and environment variables. * * @param systemProperties The system properties, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the system properties to use for interpolation and profile activation. The system properties are collected from the runtime environment like {@link System#getProperties()} and environment variables. * @param systemProperties The system properties, may be {@code null}. @return This request, never {@code null}. 
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the system properties to use for interpolation and profile activation. The system properties are collected * from the runtime environment like {@link System#getProperties()} and environment variables. * * @return The system properties, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the system properties to use for interpolation and profile activation. The system properties are collected from the runtime environment like {@link System#getProperties()} and environment variables. * @return The system properties, never {@code null}. 
Properties	TokenNameIdentifier	 Properties
getSystemProperties	TokenNameIdentifier	 get System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the user properties to use for interpolation and profile activation. The user properties have been * configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command * line. * * @param userProperties The user properties, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the user properties to use for interpolation and profile activation. The user properties have been configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * @param userProperties The user properties, may be {@code null}. @return This request, never {@code null}. 
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the user properties to use for interpolation and profile activation. The user properties have been * configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command * line. * * @return The user properties, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the user properties to use for interpolation and profile activation. The user properties have been configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * @return The user properties, never {@code null}. 
Properties	TokenNameIdentifier	 Properties
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
setProcessPlugins	TokenNameIdentifier	 set Process Plugins
(	TokenNameLPAREN	
boolean	TokenNameboolean	
processPlugins	TokenNameIdentifier	 process Plugins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isProcessPlugins	TokenNameIdentifier	 is Process Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
setResolveDependencies	TokenNameIdentifier	 set Resolve Dependencies
(	TokenNameLPAREN	
boolean	TokenNameboolean	
resolveDependencies	TokenNameIdentifier	 resolve Dependencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isResolveDependencies	TokenNameIdentifier	 is Resolve Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Controls the level of validation to perform on processed models. By default, models are validated in strict mode. * * @param validationLevel The level of validation to perform on processed models, e.g. * {@link ModelBuildingRequest#VALIDATION_LEVEL_STRICT}. * @return This configuration, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Controls the level of validation to perform on processed models. By default, models are validated in strict mode. * @param validationLevel The level of validation to perform on processed models, e.g. {@link ModelBuildingRequest#VALIDATION_LEVEL_STRICT}. @return This configuration, never {@code null}. 
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
setValidationLevel	TokenNameIdentifier	 set Validation Level
(	TokenNameLPAREN	
int	TokenNameint	
validationLevel	TokenNameIdentifier	 validation Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the level of validation to perform on processed models. * * @return The level of validation to perform on processed models. */	TokenNameCOMMENT_JAVADOC	 Gets the level of validation to perform on processed models. * @return The level of validation to perform on processed models. 
int	TokenNameint	
getValidationLevel	TokenNameIdentifier	 get Validation Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Profiles 	TokenNameCOMMENT_LINE	Profiles 
/** * Set any active profiles that the {@link ProjectBuilder} should consider while constructing * a {@link MavenProject}. */	TokenNameCOMMENT_JAVADOC	 Set any active profiles that the {@link ProjectBuilder} should consider while constructing a {@link MavenProject}. 
void	TokenNamevoid	
setActiveProfileIds	TokenNameIdentifier	 set Active Profile Ids
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getActiveProfileIds	TokenNameIdentifier	 get Active Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setInactiveProfileIds	TokenNameIdentifier	 set Inactive Profile Ids
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getInactiveProfileIds	TokenNameIdentifier	 get Inactive Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a {@link org.apache.maven.model.Profile} that has come from an external source. This may be from a custom configuration * like the MavenCLI settings.xml file, or from a custom dialog in an IDE integration like M2Eclipse. * @param profile */	TokenNameCOMMENT_JAVADOC	 Add a {@link org.apache.maven.model.Profile} that has come from an external source. This may be from a custom configuration like the MavenCLI settings.xml file, or from a custom dialog in an IDE integration like M2Eclipse. @param profile 
void	TokenNamevoid	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setProfiles	TokenNameIdentifier	 set Profiles
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
profiles	TokenNameIdentifier	 profiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
getProfiles	TokenNameIdentifier	 get Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the start time of the build. * * @return The start time of the build or {@code null} if unknown. */	TokenNameCOMMENT_JAVADOC	 Gets the start time of the build. * @return The start time of the build or {@code null} if unknown. 
Date	TokenNameIdentifier	 Date
getBuildStartTime	TokenNameIdentifier	 get Build Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the start time of the build. * * @param buildStartTime The start time of the build, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the start time of the build. * @param buildStartTime The start time of the build, may be {@code null}. @return This request, never {@code null}. 
void	TokenNamevoid	
setBuildStartTime	TokenNameIdentifier	 set Build Start Time
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
buildStartTime	TokenNameIdentifier	 build Start Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
getRepositorySession	TokenNameIdentifier	 get Repository Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
setRepositorySession	TokenNameIdentifier	 set Repository Session
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
repositorySession	TokenNameIdentifier	 repository Session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the merge mode used to combine repositories declared in the POM with the repositories specified in this * request. * * @param mode The repository merge mode, must not be {@code null}. * @return This request for chaining, never {@code null}. * @see #setRemoteRepositories(List) */	TokenNameCOMMENT_JAVADOC	 Sets the merge mode used to combine repositories declared in the POM with the repositories specified in this request. * @param mode The repository merge mode, must not be {@code null}. @return This request for chaining, never {@code null}. @see #setRemoteRepositories(List) 
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
setRepositoryMerging	TokenNameIdentifier	 set Repository Merging
(	TokenNameLPAREN	
RepositoryMerging	TokenNameIdentifier	 Repository Merging
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the merge mode used to combine repositories declared in the POM with the repositories specified in this * request * * @return The merge mode, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the merge mode used to combine repositories declared in the POM with the repositories specified in this request * @return The merge mode, never {@code null}. 
RepositoryMerging	TokenNameIdentifier	 Repository Merging
getRepositoryMerging	TokenNameIdentifier	 get Repository Merging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The possible merge modes for combining remote repositories. */	TokenNameCOMMENT_JAVADOC	 The possible merge modes for combining remote repositories. 
enum	TokenNameenum	
RepositoryMerging	TokenNameIdentifier	 Repository Merging
{	TokenNameLBRACE	
/** * The repositories declared in the POM have precedence over the repositories specified in the request. */	TokenNameCOMMENT_JAVADOC	 The repositories declared in the POM have precedence over the repositories specified in the request. 
POM_DOMINANT	TokenNameIdentifier	 POM  DOMINANT
,	TokenNameCOMMA	
/** * The repositories specified in the request have precedence over the repositories declared in the POM. */	TokenNameCOMMENT_JAVADOC	 The repositories specified in the request have precedence over the repositories declared in the POM. 
REQUEST_DOMINANT	TokenNameIdentifier	 REQUEST  DOMINANT
,	TokenNameCOMMA	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
