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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelSource	TokenNameIdentifier	 Model Source
;	TokenNameSEMICOLON	
/** * Builds in-memory descriptions of projects. */	TokenNameCOMMENT_JAVADOC	 Builds in-memory descriptions of projects. 
public	TokenNamepublic	
interface	TokenNameinterface	
ProjectBuilder	TokenNameIdentifier	 Project Builder
{	TokenNameLBRACE	
/** * Builds a project descriptor from the specified POM file. * * @param projectFile The POM file to build the project from, must not be {@code null}. * @param request The project building request that holds further parameters, must not be {@code null}. * @return The result of the project building, never {@code null}. * @throws ProjectBuildingException If the project descriptor could not be successfully built. */	TokenNameCOMMENT_JAVADOC	 Builds a project descriptor from the specified POM file. * @param projectFile The POM file to build the project from, must not be {@code null}. @param request The project building request that holds further parameters, must not be {@code null}. @return The result of the project building, never {@code null}. @throws ProjectBuildingException If the project descriptor could not be successfully built. 
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
projectFile	TokenNameIdentifier	 project File
,	TokenNameCOMMA	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
/** * Builds a project descriptor for the specified artifact. * * @param projectArtifact The POM artifact to build the project from, must not be {@code null}. * @param request The project building request that holds further parameters, must not be {@code null}. * @return The result of the project building, never {@code null}. * @throws ProjectBuildingException If the project descriptor could not be successfully built. */	TokenNameCOMMENT_JAVADOC	 Builds a project descriptor for the specified artifact. * @param projectArtifact The POM artifact to build the project from, must not be {@code null}. @param request The project building request that holds further parameters, must not be {@code null}. @return The result of the project building, never {@code null}. @throws ProjectBuildingException If the project descriptor could not be successfully built. 
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
projectArtifact	TokenNameIdentifier	 project Artifact
,	TokenNameCOMMA	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
/** * Builds a project descriptor for the specified artifact. * * @param projectArtifact The POM artifact to build the project from, must not be {@code null}. * @param allowStubModel A flag controlling the case of a missing POM artifact. If {@code true} and the specified * POM artifact does not exist, a simple stub model will be returned. If {@code false}, an exception will * be thrown. * @param request The project building request that holds further parameters, must not be {@code null}. * @return The result of the project building, never {@code null}. * @throws ProjectBuildingException If the project descriptor could not be successfully built. */	TokenNameCOMMENT_JAVADOC	 Builds a project descriptor for the specified artifact. * @param projectArtifact The POM artifact to build the project from, must not be {@code null}. @param allowStubModel A flag controlling the case of a missing POM artifact. If {@code true} and the specified POM artifact does not exist, a simple stub model will be returned. If {@code false}, an exception will be thrown. @param request The project building request that holds further parameters, must not be {@code null}. @return The result of the project building, never {@code null}. @throws ProjectBuildingException If the project descriptor could not be successfully built. 
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
projectArtifact	TokenNameIdentifier	 project Artifact
,	TokenNameCOMMA	
boolean	TokenNameboolean	
allowStubModel	TokenNameIdentifier	 allow Stub Model
,	TokenNameCOMMA	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
/** * Builds a project descriptor for the specified model source. * * @param modelSource The source of the model to built the project descriptor from, must not be {@code null}. * @param request The project building request that holds further parameters, must not be {@code null}. * @return The result of the project building, never {@code null}. * @throws ProjectBuildingException If the project descriptor could not be successfully built. */	TokenNameCOMMENT_JAVADOC	 Builds a project descriptor for the specified model source. * @param modelSource The source of the model to built the project descriptor from, must not be {@code null}. @param request The project building request that holds further parameters, must not be {@code null}. @return The result of the project building, never {@code null}. @throws ProjectBuildingException If the project descriptor could not be successfully built. 
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
ModelSource	TokenNameIdentifier	 Model Source
modelSource	TokenNameIdentifier	 model Source
,	TokenNameCOMMA	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
/** * Builds the projects for the specified POM files and optionally their children. * * @param pomFiles The POM files to build, must not be {@code null}. * @param recursive {@code true} to recursively build sub modules referenced by the POM files, {@code false} to * build only the specified POM files. * @param request The project builder configuration that provides further parameters, must not be {@code null}. * @return The results of the project builder where each result corresponds to one project that was built, never * {@code null}. * @throws ProjectBuildingException If an error was encountered during building of any project. * {@link ProjectBuildingException#getResults()} provides access to the details of the problems. */	TokenNameCOMMENT_JAVADOC	 Builds the projects for the specified POM files and optionally their children. * @param pomFiles The POM files to build, must not be {@code null}. @param recursive {@code true} to recursively build sub modules referenced by the POM files, {@code false} to build only the specified POM files. @param request The project builder configuration that provides further parameters, must not be {@code null}. @return The results of the project builder where each result corresponds to one project that was built, never {@code null}. @throws ProjectBuildingException If an error was encountered during building of any project. {@link ProjectBuildingException#getResults()} provides access to the details of the problems. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
>	TokenNameGREATER	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
pomFiles	TokenNameIdentifier	 pom Files
,	TokenNameCOMMA	
boolean	TokenNameboolean	
recursive	TokenNameIdentifier	 recursive
,	TokenNameCOMMA	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
