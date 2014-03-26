package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
resolution	TokenNameIdentifier	 resolution
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
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
/** * Resolves a POM from its coordinates. During the build process, the * {@link org.apache.maven.model.building.ModelBuilder} will add any relevant repositories to the model resolver. In * other words, the model resolver is stateful and should not be reused across multiple model building requests. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Resolves a POM from its coordinates. During the build process, the {@link org.apache.maven.model.building.ModelBuilder} will add any relevant repositories to the model resolver. In other words, the model resolver is stateful and should not be reused across multiple model building requests. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ModelResolver	TokenNameIdentifier	 Model Resolver
{	TokenNameLBRACE	
/** * Tries to resolve the POM for the specified coordinates. * * @param groupId The group identifier of the POM, must not be {@code null}. * @param artifactId The artifact identifier of the POM, must not be {@code null}. * @param version The version of the POM, must not be {@code null}. * @return The source of the requested POM, never {@code null}. * @throws UnresolvableModelException If the POM could not be resolved from any configured repository. */	TokenNameCOMMENT_JAVADOC	 Tries to resolve the POM for the specified coordinates. * @param groupId The group identifier of the POM, must not be {@code null}. @param artifactId The artifact identifier of the POM, must not be {@code null}. @param version The version of the POM, must not be {@code null}. @return The source of the requested POM, never {@code null}. @throws UnresolvableModelException If the POM could not be resolved from any configured repository. 
ModelSource	TokenNameIdentifier	 Model Source
resolveModel	TokenNameIdentifier	 resolve Model
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnresolvableModelException	TokenNameIdentifier	 Unresolvable Model Exception
;	TokenNameSEMICOLON	
/** * Adds a repository to use for subsequent resolution requests. The order in which repositories are added matters, * repositories that were added first should also be searched first. When multiple repositories with the same * identifier are added, only the first repository being added will be used. * * @param repository The repository to add to the internal search chain, must not be {@code null}. * @throws InvalidRepositoryException If the repository could not be added (e.g. due to invalid URL or layout). */	TokenNameCOMMENT_JAVADOC	 Adds a repository to use for subsequent resolution requests. The order in which repositories are added matters, repositories that were added first should also be searched first. When multiple repositories with the same identifier are added, only the first repository being added will be used. * @param repository The repository to add to the internal search chain, must not be {@code null}. @throws InvalidRepositoryException If the repository could not be added (e.g. due to invalid URL or layout). 
void	TokenNamevoid	
addRepository	TokenNameIdentifier	 add Repository
(	TokenNameLPAREN	
Repository	TokenNameIdentifier	 Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRepositoryException	TokenNameIdentifier	 Invalid Repository Exception
;	TokenNameSEMICOLON	
/** * Clones this resolver for usage in a forked resolution process. In general, implementors need not provide a deep * clone. The only requirement is that invocations of {@link #addRepository(Repository)} on the clone do not affect * the state of the original resolver and vice versa. * * @return The cloned resolver, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Clones this resolver for usage in a forked resolution process. In general, implementors need not provide a deep clone. The only requirement is that invocations of {@link #addRepository(Repository)} on the clone do not affect the state of the original resolver and vice versa. * @return The cloned resolver, never {@code null}. 
ModelResolver	TokenNameIdentifier	 Model Resolver
newCopy	TokenNameIdentifier	 new Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
