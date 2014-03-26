package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
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
resolution	TokenNameIdentifier	 resolution
.	TokenNameDOT	
ModelResolver	TokenNameIdentifier	 Model Resolver
;	TokenNameSEMICOLON	
/** * Collects settings that control the building of effective models. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects settings that control the building of effective models. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
{	TokenNameLBRACE	
/** * Denotes minimal validation of POMs. This validation level is meant for processing of POMs from repositories * during metadata retrieval. */	TokenNameCOMMENT_JAVADOC	 Denotes minimal validation of POMs. This validation level is meant for processing of POMs from repositories during metadata retrieval. 
int	TokenNameint	
VALIDATION_LEVEL_MINIMAL	TokenNameIdentifier	 VALIDATION  LEVEL  MINIMAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Denotes validation as performed by Maven 2.0. This validation level is meant as a compatibility mode to allow * users to migrate their projects. */	TokenNameCOMMENT_JAVADOC	 Denotes validation as performed by Maven 2.0. This validation level is meant as a compatibility mode to allow users to migrate their projects. 
int	TokenNameint	
VALIDATION_LEVEL_MAVEN_2_0	TokenNameIdentifier	 VALIDATION  LEVEL  MAVEN 2 0
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Denotes validation as performed by Maven 3.0. This validation level is meant for existing projects. */	TokenNameCOMMENT_JAVADOC	 Denotes validation as performed by Maven 3.0. This validation level is meant for existing projects. 
int	TokenNameint	
VALIDATION_LEVEL_MAVEN_3_0	TokenNameIdentifier	 VALIDATION  LEVEL  MAVEN 3 0
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Denotes validation as performed by Maven 3.1. This validation level is meant for new projects. */	TokenNameCOMMENT_JAVADOC	 Denotes validation as performed by Maven 3.1. This validation level is meant for new projects. 
int	TokenNameint	
VALIDATION_LEVEL_MAVEN_3_1	TokenNameIdentifier	 VALIDATION  LEVEL  MAVEN 3 1
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Denotes strict validation as recommended by the current Maven version. */	TokenNameCOMMENT_JAVADOC	 Denotes strict validation as recommended by the current Maven version. 
int	TokenNameint	
VALIDATION_LEVEL_STRICT	TokenNameIdentifier	 VALIDATION  LEVEL  STRICT
=	TokenNameEQUAL	
VALIDATION_LEVEL_MAVEN_3_0	TokenNameIdentifier	 VALIDATION  LEVEL  MAVEN 3 0
;	TokenNameSEMICOLON	
/** * Gets the source of the POM to process. * * @return The source of the POM or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the source of the POM to process. * @return The source of the POM or {@code null} if not set. 
ModelSource	TokenNameIdentifier	 Model Source
getModelSource	TokenNameIdentifier	 get Model Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the source of the POM to process. Eventually, either {@link #setModelSource(ModelSource)} or * {@link #setPomFile(File)} must be set. * * @param modelSource The source of the POM to process, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the source of the POM to process. Eventually, either {@link #setModelSource(ModelSource)} or {@link #setPomFile(File)} must be set. * @param modelSource The source of the POM to process, may be {@code null}. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setModelSource	TokenNameIdentifier	 set Model Source
(	TokenNameLPAREN	
ModelSource	TokenNameIdentifier	 Model Source
modelSource	TokenNameIdentifier	 model Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the POM file of the project to build. * * @return The POM file of the project or {@code null} if not applicable (i.e. when processing a POM from the * repository). */	TokenNameCOMMENT_JAVADOC	 Gets the POM file of the project to build. * @return The POM file of the project or {@code null} if not applicable (i.e. when processing a POM from the repository). 
File	TokenNameIdentifier	 File
getPomFile	TokenNameIdentifier	 get Pom File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the POM file of the project to build. Note that providing the path to a POM file via this method will make * the model builder operate in project mode. This mode is meant for effective models that are employed during the * build process of a local project. Hence the effective model will support the notion of a project directory. To * build the model for a POM from the repository, use {@link #setModelSource(ModelSource)} in combination with a * {@link FileModelSource} instead. * * @param pomFile The POM file of the project to build the effective model for, may be {@code null} to build the * model of some POM from the repository. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the POM file of the project to build. Note that providing the path to a POM file via this method will make the model builder operate in project mode. This mode is meant for effective models that are employed during the build process of a local project. Hence the effective model will support the notion of a project directory. To build the model for a POM from the repository, use {@link #setModelSource(ModelSource)} in combination with a {@link FileModelSource} instead. * @param pomFile The POM file of the project to build the effective model for, may be {@code null} to build the model of some POM from the repository. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setPomFile	TokenNameIdentifier	 set Pom File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the level of validation to perform on processed models. * * @return The level of validation to perform on processed models. */	TokenNameCOMMENT_JAVADOC	 Gets the level of validation to perform on processed models. * @return The level of validation to perform on processed models. 
int	TokenNameint	
getValidationLevel	TokenNameIdentifier	 get Validation Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the level of validation to perform on processed models. For building of projects, * {@link #VALIDATION_LEVEL_STRICT} should be used to ensure proper building. For the mere retrievel of dependencies * during artifact resolution, {@link #VALIDATION_LEVEL_MINIMAL} should be used to account for models of poor * quality. By default, models are validated in strict mode. * * @param validationLevel The level of validation to perform on processed models. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the level of validation to perform on processed models. For building of projects, {@link #VALIDATION_LEVEL_STRICT} should be used to ensure proper building. For the mere retrievel of dependencies during artifact resolution, {@link #VALIDATION_LEVEL_MINIMAL} should be used to account for models of poor quality. By default, models are validated in strict mode. * @param validationLevel The level of validation to perform on processed models. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setValidationLevel	TokenNameIdentifier	 set Validation Level
(	TokenNameLPAREN	
int	TokenNameint	
validationLevel	TokenNameIdentifier	 validation Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicates whether plugin executions and configurations should be processed. If enabled, lifecycle-induced plugin * executions will be injected into the model and common plugin configuration will be propagated to individual * executions. * * @return {@code true} if plugins should be processed, {@code false} otherwise. */	TokenNameCOMMENT_JAVADOC	 Indicates whether plugin executions and configurations should be processed. If enabled, lifecycle-induced plugin executions will be injected into the model and common plugin configuration will be propagated to individual executions. * @return {@code true} if plugins should be processed, {@code false} otherwise. 
boolean	TokenNameboolean	
isProcessPlugins	TokenNameIdentifier	 is Process Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Controls the processing of plugin executions and configurations. * * @param processPlugins {@code true} to enable plugin processing, {@code false} otherwise. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Controls the processing of plugin executions and configurations. * @param processPlugins {@code true} to enable plugin processing, {@code false} otherwise. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setProcessPlugins	TokenNameIdentifier	 set Process Plugins
(	TokenNameLPAREN	
boolean	TokenNameboolean	
processPlugins	TokenNameIdentifier	 process Plugins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicates whether the model building should happen in two phases. If enabled, the initial invocation of the model * builder will only produce an interim result which may be used to analyze inter-model dependencies before the * final invocation of the model builder is performed. * * @return {@code true} if two-phase building is enabled, {@code false} if the model should be build in a single * step. */	TokenNameCOMMENT_JAVADOC	 Indicates whether the model building should happen in two phases. If enabled, the initial invocation of the model builder will only produce an interim result which may be used to analyze inter-model dependencies before the final invocation of the model builder is performed. * @return {@code true} if two-phase building is enabled, {@code false} if the model should be build in a single step. 
boolean	TokenNameboolean	
isTwoPhaseBuilding	TokenNameIdentifier	 is Two Phase Building
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enables/disables two-phase building. If enabled, the initial invocation of the model builder will only produce an * interim result which may be used to analyze inter-model dependencies before the final invocation of the model * builder is performed. * * @param twoPhaseBuilding {@code true} to enable two-phase building, {@code false} if the model should be build in * a single step. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Enables/disables two-phase building. If enabled, the initial invocation of the model builder will only produce an interim result which may be used to analyze inter-model dependencies before the final invocation of the model builder is performed. * @param twoPhaseBuilding {@code true} to enable two-phase building, {@code false} if the model should be build in a single step. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setTwoPhaseBuilding	TokenNameIdentifier	 set Two Phase Building
(	TokenNameLPAREN	
boolean	TokenNameboolean	
twoPhaseBuilding	TokenNameIdentifier	 two Phase Building
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicates whether the model should track the line/column number of the model source from which it was parsed. * * @return {@code true} if location tracking is enabled, {@code false} otherwise. */	TokenNameCOMMENT_JAVADOC	 Indicates whether the model should track the line/column number of the model source from which it was parsed. * @return {@code true} if location tracking is enabled, {@code false} otherwise. 
boolean	TokenNameboolean	
isLocationTracking	TokenNameIdentifier	 is Location Tracking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enables/disables the tracking of line/column numbers for the model source being parsed. By default, input * locations are not tracked. * * @param locationTracking {@code true} to enable location tracking, {@code false} to disable it. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Enables/disables the tracking of line/column numbers for the model source being parsed. By default, input locations are not tracked. * @param locationTracking {@code true} to enable location tracking, {@code false} to disable it. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setLocationTracking	TokenNameIdentifier	 set Location Tracking
(	TokenNameLPAREN	
boolean	TokenNameboolean	
locationTracking	TokenNameIdentifier	 location Tracking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the external profiles that should be considered for model building. * * @return The external profiles that should be considered for model building, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the external profiles that should be considered for model building. * @return The external profiles that should be considered for model building, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
getProfiles	TokenNameIdentifier	 get Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the external profiles that should be considered for model building. * * @param profiles The external profiles that should be considered for model building, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the external profiles that should be considered for model building. * @param profiles The external profiles that should be considered for model building, may be {@code null}. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setProfiles	TokenNameIdentifier	 set Profiles
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
profiles	TokenNameIdentifier	 profiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the identifiers of those profiles that should be activated by explicit demand. * * @return The identifiers of those profiles to activate, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the identifiers of those profiles that should be activated by explicit demand. * @return The identifiers of those profiles to activate, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getActiveProfileIds	TokenNameIdentifier	 get Active Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the identifiers of those profiles that should be activated by explicit demand. * * @param activeProfileIds The identifiers of those profiles to activate, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the identifiers of those profiles that should be activated by explicit demand. * @param activeProfileIds The identifiers of those profiles to activate, may be {@code null}. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setActiveProfileIds	TokenNameIdentifier	 set Active Profile Ids
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the identifiers of those profiles that should be deactivated by explicit demand. * * @return The identifiers of those profiles to deactivate, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the identifiers of those profiles that should be deactivated by explicit demand. * @return The identifiers of those profiles to deactivate, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getInactiveProfileIds	TokenNameIdentifier	 get Inactive Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the identifiers of those profiles that should be deactivated by explicit demand. * * @param inactiveProfileIds The identifiers of those profiles to deactivate, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the identifiers of those profiles that should be deactivated by explicit demand. * @param inactiveProfileIds The identifiers of those profiles to deactivate, may be {@code null}. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setInactiveProfileIds	TokenNameIdentifier	 set Inactive Profile Ids
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the system properties to use for interpolation and profile activation. The system properties are collected * from the runtime environment like {@link System#getProperties()} and environment variables. * * @return The system properties, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the system properties to use for interpolation and profile activation. The system properties are collected from the runtime environment like {@link System#getProperties()} and environment variables. * @return The system properties, never {@code null}. 
Properties	TokenNameIdentifier	 Properties
getSystemProperties	TokenNameIdentifier	 get System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the system properties to use for interpolation and profile activation. The system properties are collected * from the runtime environment like {@link System#getProperties()} and environment variables. * * @param systemProperties The system properties, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the system properties to use for interpolation and profile activation. The system properties are collected from the runtime environment like {@link System#getProperties()} and environment variables. * @param systemProperties The system properties, may be {@code null}. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the user properties to use for interpolation and profile activation. The user properties have been * configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command * line. * * @return The user properties, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the user properties to use for interpolation and profile activation. The user properties have been configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * @return The user properties, never {@code null}. 
Properties	TokenNameIdentifier	 Properties
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the user properties to use for interpolation and profile activation. The user properties have been * configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command * line. * * @param userProperties The user properties, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the user properties to use for interpolation and profile activation. The user properties have been configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * @param userProperties The user properties, may be {@code null}. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the start time of the build. * * @return The start time of the build or {@code null} if unknown. */	TokenNameCOMMENT_JAVADOC	 Gets the start time of the build. * @return The start time of the build or {@code null} if unknown. 
Date	TokenNameIdentifier	 Date
getBuildStartTime	TokenNameIdentifier	 get Build Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the start time of the build. * * @param buildStartTime The start time of the build, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the start time of the build. * @param buildStartTime The start time of the build, may be {@code null}. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setBuildStartTime	TokenNameIdentifier	 set Build Start Time
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
buildStartTime	TokenNameIdentifier	 build Start Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the model resolver to use for resolution of mixins or parents that are not locally reachable from the * project directory. * * @return The model resolver or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the model resolver to use for resolution of mixins or parents that are not locally reachable from the project directory. * @return The model resolver or {@code null} if not set. 
ModelResolver	TokenNameIdentifier	 Model Resolver
getModelResolver	TokenNameIdentifier	 get Model Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the model resolver to use for resolution of mixins or parents that are not locally reachable from the * project directory. * * @param modelResolver The model resolver to use, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the model resolver to use for resolution of mixins or parents that are not locally reachable from the project directory. * @param modelResolver The model resolver to use, may be {@code null}. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setModelResolver	TokenNameIdentifier	 set Model Resolver
(	TokenNameLPAREN	
ModelResolver	TokenNameIdentifier	 Model Resolver
modelResolver	TokenNameIdentifier	 model Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the model building listener to notify during the build process. * * @return The model building listener to notify or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the model building listener to notify during the build process. * @return The model building listener to notify or {@code null} if none. 
ModelBuildingListener	TokenNameIdentifier	 Model Building Listener
getModelBuildingListener	TokenNameIdentifier	 get Model Building Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the model building listener to notify during the build process. * * @param modelBuildingListener The model building listener to notify, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the model building listener to notify during the build process. * @param modelBuildingListener The model building listener to notify, may be {@code null}. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setModelBuildingListener	TokenNameIdentifier	 set Model Building Listener
(	TokenNameLPAREN	
ModelBuildingListener	TokenNameIdentifier	 Model Building Listener
modelBuildingListener	TokenNameIdentifier	 model Building Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the model cache to use for reuse of previously built models. * * @return The model cache or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the model cache to use for reuse of previously built models. * @return The model cache or {@code null} if not set. 
ModelCache	TokenNameIdentifier	 Model Cache
getModelCache	TokenNameIdentifier	 get Model Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the model cache to use for reuse of previously built models. This is an optional component that serves * performance optimizations. * * @param modelCache The model cache to use, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the model cache to use for reuse of previously built models. This is an optional component that serves performance optimizations. * @param modelCache The model cache to use, may be {@code null}. @return This request, never {@code null}. 
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setModelCache	TokenNameIdentifier	 set Model Cache
(	TokenNameLPAREN	
ModelCache	TokenNameIdentifier	 Model Cache
modelCache	TokenNameIdentifier	 model Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
