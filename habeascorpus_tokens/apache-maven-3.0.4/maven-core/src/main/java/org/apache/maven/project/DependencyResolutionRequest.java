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
/** * A request to resolve the dependencies of a project. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A request to resolve the dependencies of a project. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
DependencyResolutionRequest	TokenNameIdentifier	 Dependency Resolution Request
{	TokenNameLBRACE	
/** * Gets the project to resolve dependencies for. * * @return The project to resolve dependencies for or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the project to resolve dependencies for. * @return The project to resolve dependencies for or {@code null} if not set. 
MavenProject	TokenNameIdentifier	 Maven Project
getMavenProject	TokenNameIdentifier	 get Maven Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the project to resolve dependencies for. * * @param project The project to resolve dependencies for, may be {@code null}. * @return This request for chaining, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the project to resolve dependencies for. * @param project The project to resolve dependencies for, may be {@code null}. @return This request for chaining, never {@code null}. 
DependencyResolutionRequest	TokenNameIdentifier	 Dependency Resolution Request
setMavenProject	TokenNameIdentifier	 set Maven Project
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the filter used to exclude some dependencies from resolution. * * @return The filter to exclude dependencies from resolution or {@code null} to resolve all dependencies. */	TokenNameCOMMENT_JAVADOC	 Gets the filter used to exclude some dependencies from resolution. * @return The filter to exclude dependencies from resolution or {@code null} to resolve all dependencies. 
DependencyFilter	TokenNameIdentifier	 Dependency Filter
getResolutionFilter	TokenNameIdentifier	 get Resolution Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the filter used to exclude some dependencies from resolution. Note that this filter only controls the * resolution/download of dependency artifacts, not the inclusion of dependency nodes in the resolved dependeny * graph. * * @param filter The filter to exclude dependencies from resolution, may be {@code null} to resolve all * dependencies. * @return This request for chaining, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the filter used to exclude some dependencies from resolution. Note that this filter only controls the resolution/download of dependency artifacts, not the inclusion of dependency nodes in the resolved dependeny graph. * @param filter The filter to exclude dependencies from resolution, may be {@code null} to resolve all dependencies. @return This request for chaining, never {@code null}. 
DependencyResolutionRequest	TokenNameIdentifier	 Dependency Resolution Request
setResolutionFilter	TokenNameIdentifier	 set Resolution Filter
(	TokenNameLPAREN	
DependencyFilter	TokenNameIdentifier	 Dependency Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the session to use for repository access. * * @return The repository session or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the session to use for repository access. * @return The repository session or {@code null} if not set. 
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
getRepositorySession	TokenNameIdentifier	 get Repository Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the session to use for repository access. * * @param repositorySession The repository session to use. * @return This request for chaining, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the session to use for repository access. * @param repositorySession The repository session to use. @return This request for chaining, never {@code null}. 
DependencyResolutionRequest	TokenNameIdentifier	 Dependency Resolution Request
setRepositorySession	TokenNameIdentifier	 set Repository Session
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
repositorySession	TokenNameIdentifier	 repository Session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
