package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
conflict	TokenNameIdentifier	 conflict
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
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
ResolutionNode	TokenNameIdentifier	 Resolution Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
/** * Resolves conflicting artifacts by always selecting the <em>farthest</em> declaration. Farthest is defined as the * declaration that has the most transitive steps away from the project being built. * * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> * @since 3.0 */	TokenNameCOMMENT_JAVADOC	 Resolves conflicting artifacts by always selecting the <em>farthest</em> declaration. Farthest is defined as the declaration that has the most transitive steps away from the project being built. * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> @since 3.0 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
hint	TokenNameIdentifier	 hint
=	TokenNameEQUAL	
"farthest"	TokenNameStringLiteral	farthest
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
FarthestConflictResolver	TokenNameIdentifier	 Farthest Conflict Resolver
implements	TokenNameimplements	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
{	TokenNameLBRACE	
// ConflictResolver methods ----------------------------------------------- 	TokenNameCOMMENT_LINE	ConflictResolver methods ----------------------------------------------- 
/* * @see org.apache.maven.artifact.resolver.conflict.ConflictResolver#resolveConflict(org.apache.maven.artifact.resolver.ResolutionNode, * org.apache.maven.artifact.resolver.ResolutionNode) */	TokenNameCOMMENT_BLOCK	 @see org.apache.maven.artifact.resolver.conflict.ConflictResolver#resolveConflict(org.apache.maven.artifact.resolver.ResolutionNode, org.apache.maven.artifact.resolver.ResolutionNode) 
public	TokenNamepublic	
ResolutionNode	TokenNameIdentifier	 Resolution Node
resolveConflict	TokenNameIdentifier	 resolve Conflict
(	TokenNameLPAREN	
ResolutionNode	TokenNameIdentifier	 Resolution Node
node1	TokenNameIdentifier	 node1
,	TokenNameCOMMA	
ResolutionNode	TokenNameIdentifier	 Resolution Node
node2	TokenNameIdentifier	 node2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node1	TokenNameIdentifier	 node1
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
node2	TokenNameIdentifier	 node2
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
node1	TokenNameIdentifier	 node1
:	TokenNameCOLON	
node2	TokenNameIdentifier	 node2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
