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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelProblem	TokenNameIdentifier	 Model Problem
;	TokenNameSEMICOLON	
/** * Collects the output of the project builder. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects the output of the project builder. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
{	TokenNameLBRACE	
/** * Gets the identifier of the project that could not be built. The general format of the identifier is {@code * <groupId>:<artifactId>:<version>} but some of these coordinates may still be unknown at the point the exception * is thrown so this information is merely meant to assist the user. * * @return The identifier of the project or an empty string if not known, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the identifier of the project that could not be built. The general format of the identifier is {@code <groupId>:<artifactId>:<version>} but some of these coordinates may still be unknown at the point the exception is thrown so this information is merely meant to assist the user. * @return The identifier of the project or an empty string if not known, never {@code null}. 
String	TokenNameIdentifier	 String
getProjectId	TokenNameIdentifier	 get Project Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the POM file from which the project was built. * * @return The POM file or {@code null} if unknown. */	TokenNameCOMMENT_JAVADOC	 Gets the POM file from which the project was built. * @return The POM file or {@code null} if unknown. 
File	TokenNameIdentifier	 File
getPomFile	TokenNameIdentifier	 get Pom File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the project that was built. * * @return The project that was built or {@code null} if an error occurred and this result accompanies a * {@link ProjectBuildingException}. */	TokenNameCOMMENT_JAVADOC	 Gets the project that was built. * @return The project that was built or {@code null} if an error occurred and this result accompanies a {@link ProjectBuildingException}. 
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the problems that were encountered during the project building. * * @return The problems that were encountered during the project building, can be empty but never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the problems that were encountered during the project building. * @return The problems that were encountered during the project building, can be empty but never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the result of the dependency resolution for the project. * * @return The result of the dependency resolution for the project or {@code null} if the project dependencies were * not requested. */	TokenNameCOMMENT_JAVADOC	 Gets the result of the dependency resolution for the project. * @return The result of the dependency resolution for the project or {@code null} if the project dependencies were not requested. 
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
getDependencyResolutionResult	TokenNameIdentifier	 get Dependency Resolution Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
