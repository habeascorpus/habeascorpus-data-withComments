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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
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
/** * Resolves conflicting artifacts by always selecting the <em>newest</em> declaration. Newest is defined as the * declaration whose version is greater according to <code>ArtifactVersion.compareTo</code>. * * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> * @see ArtifactVersion#compareTo * @since 3.0 */	TokenNameCOMMENT_JAVADOC	 Resolves conflicting artifacts by always selecting the <em>newest</em> declaration. Newest is defined as the declaration whose version is greater according to <code>ArtifactVersion.compareTo</code>. * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> @see ArtifactVersion#compareTo @since 3.0 
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
"newest"	TokenNameStringLiteral	newest
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
NewestConflictResolver	TokenNameIdentifier	 Newest Conflict Resolver
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
try	TokenNametry	
{	TokenNameLBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
version1	TokenNameIdentifier	 version1
=	TokenNameEQUAL	
node1	TokenNameIdentifier	 node1
.	TokenNameDOT	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
version2	TokenNameIdentifier	 version2
=	TokenNameEQUAL	
node2	TokenNameIdentifier	 node2
.	TokenNameDOT	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
version1	TokenNameIdentifier	 version1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
version2	TokenNameIdentifier	 version2
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
node1	TokenNameIdentifier	 node1
:	TokenNameCOLON	
node2	TokenNameIdentifier	 node2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: log message or throw exception? 	TokenNameCOMMENT_LINE	TODO: log message or throw exception? 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
