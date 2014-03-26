package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
;	TokenNameSEMICOLON	
/** * Resolves conflicts in the supplied dependency graph. * Different implementations will implement different conflict resolution policies. * * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> */	TokenNameCOMMENT_JAVADOC	 Resolves conflicts in the supplied dependency graph. Different implementations will implement different conflict resolution policies. * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Cleanses the supplied graph by leaving only one directed versioned edge\ * between any two nodes, if multiple exists. Uses scope relationships, defined * in <code>ArtifactScopeEnum</code> * * @param graph the "dirty" graph to be simplified via conflict resolution * @param scope scope for which the graph should be resolved * * @return resulting "clean" graph for the specified scope * * @since 3.0 */	TokenNameCOMMENT_JAVADOC	 Cleanses the supplied graph by leaving only one directed versioned edge\ between any two nodes, if multiple exists. Uses scope relationships, defined in <code>ArtifactScopeEnum</code> * @param graph the "dirty" graph to be simplified via conflict resolution @param scope scope for which the graph should be resolved * @return resulting "clean" graph for the specified scope * @since 3.0 
MetadataGraph	TokenNameIdentifier	 Metadata Graph
resolveConflicts	TokenNameIdentifier	 resolve Conflicts
(	TokenNameLPAREN	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
graph	TokenNameIdentifier	 graph
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
throws	TokenNamethrows	
GraphConflictResolutionException	TokenNameIdentifier	 Graph Conflict Resolution Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
