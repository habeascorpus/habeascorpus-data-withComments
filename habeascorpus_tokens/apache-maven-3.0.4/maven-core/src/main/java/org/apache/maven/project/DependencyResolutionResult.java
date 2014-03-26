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
List	TokenNameIdentifier	 List
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
Dependency	TokenNameIdentifier	 Dependency
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
/** * The result of a project dependency resolution. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 The result of a project dependency resolution. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
{	TokenNameLBRACE	
/** * Gets the dependency graph of the project. * * @return The dependency graph or {@code null} if not available. */	TokenNameCOMMENT_JAVADOC	 Gets the dependency graph of the project. * @return The dependency graph or {@code null} if not available. 
DependencyNode	TokenNameIdentifier	 Dependency Node
getDependencyGraph	TokenNameIdentifier	 get Dependency Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the transitive dependencies of the project that were not excluded by * {@link DependencyResolutionRequest#getResolutionFilter()}. This list is a union of the results from * {@link #getResolvedDependencies()} and {@link #getUnresolvedDependencies()}. * * @return The transitive dependencies, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the transitive dependencies of the project that were not excluded by {@link DependencyResolutionRequest#getResolutionFilter()}. This list is a union of the results from {@link #getResolvedDependencies()} and {@link #getUnresolvedDependencies()}. * @return The transitive dependencies, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the dependencies that were successfully resolved. * * @return The resolved dependencies, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the dependencies that were successfully resolved. * @return The resolved dependencies, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
getResolvedDependencies	TokenNameIdentifier	 get Resolved Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the dependencies that could not be resolved. * * @return The unresolved dependencies, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the dependencies that could not be resolved. * @return The unresolved dependencies, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
getUnresolvedDependencies	TokenNameIdentifier	 get Unresolved Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the errors that occurred while building the dependency graph. * * @return The errors that occurred while building the dependency graph, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the errors that occurred while building the dependency graph. * @return The errors that occurred while building the dependency graph, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
getCollectionErrors	TokenNameIdentifier	 get Collection Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the errors that occurred while resolving the specified dependency. * * @param dependency The dependency for which to retrieve the errors, must not be {@code null}. * @return The resolution errors for the specified dependency, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the errors that occurred while resolving the specified dependency. * @param dependency The dependency for which to retrieve the errors, must not be {@code null}. @return The resolution errors for the specified dependency, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
getResolutionErrors	TokenNameIdentifier	 get Resolution Errors
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
