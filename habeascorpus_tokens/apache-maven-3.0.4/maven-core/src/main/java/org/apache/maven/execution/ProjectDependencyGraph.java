package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
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
project	TokenNameIdentifier	 project
.	TokenNameDOT	
MavenProject	TokenNameIdentifier	 Maven Project
;	TokenNameSEMICOLON	
/** * Describes the inter-dependencies between projects in the reactor. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Describes the inter-dependencies between projects in the reactor. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ProjectDependencyGraph	TokenNameIdentifier	 Project Dependency Graph
{	TokenNameLBRACE	
/** * Gets all projects in their intended build order, i.e. after topologically sorting the projects according to their * inter-dependencies. * * @return The projects in the build order, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets all projects in their intended build order, i.e. after topologically sorting the projects according to their inter-dependencies. * @return The projects in the build order, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the downstream projects of the specified project. A downstream project is a project that directly or * indirectly depends on the given project. * * @param project The project whose downstream projects should be retrieved, must not be {@code null}. * @param transitive A flag whether to retrieve all direct and indirect downstream projects or just the immediate * downstream projects. * @return The downstream projects in the build order, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the downstream projects of the specified project. A downstream project is a project that directly or indirectly depends on the given project. * @param project The project whose downstream projects should be retrieved, must not be {@code null}. @param transitive A flag whether to retrieve all direct and indirect downstream projects or just the immediate downstream projects. @return The downstream projects in the build order, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getDownstreamProjects	TokenNameIdentifier	 get Downstream Projects
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
boolean	TokenNameboolean	
transitive	TokenNameIdentifier	 transitive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the upstream projects of the specified project. An upstream project is a project that directly or indirectly * is a prerequisite of the given project. * * @param project The project whose upstream projects should be retrieved, must not be {@code null}. * @param transitive A flag whether to retrieve all direct and indirect upstream projects or just the immediate * upstream projects. * @return The upstream projects in the build order, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the upstream projects of the specified project. An upstream project is a project that directly or indirectly is a prerequisite of the given project. * @param project The project whose upstream projects should be retrieved, must not be {@code null}. @param transitive A flag whether to retrieve all direct and indirect upstream projects or just the immediate upstream projects. @return The upstream projects in the build order, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
boolean	TokenNameboolean	
transitive	TokenNameIdentifier	 transitive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
