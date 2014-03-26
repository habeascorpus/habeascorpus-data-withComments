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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
TreeSet	TokenNameIdentifier	 Tree Set
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
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
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
Requirement	TokenNameIdentifier	 Requirement
;	TokenNameSEMICOLON	
/** * Default conflict resolver.Implements closer newer first policy by default, but could be configured via plexus * * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> */	TokenNameCOMMENT_JAVADOC	 Default conflict resolver.Implements closer newer first policy by default, but could be configured via plexus * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultGraphConflictResolver	TokenNameIdentifier	 Default Graph Conflict Resolver
implements	TokenNameimplements	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
{	TokenNameLBRACE	
/** * artifact, closer to the entry point, is selected */	TokenNameCOMMENT_JAVADOC	 artifact, closer to the entry point, is selected 
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
GraphConflictResolutionPolicy	TokenNameIdentifier	 Graph Conflict Resolution Policy
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
protected	TokenNameprotected	
GraphConflictResolutionPolicy	TokenNameIdentifier	 Graph Conflict Resolution Policy
policy	TokenNameIdentifier	 policy
;	TokenNameSEMICOLON	
// ------------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------- 
// ------------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------- 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
GraphConflictResolutionException	TokenNameIdentifier	 Graph Conflict Resolution Exception
(	TokenNameLPAREN	
"no GraphConflictResolutionPolicy injected"	TokenNameStringLiteral	no GraphConflictResolutionPolicy injected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
graph	TokenNameIdentifier	 graph
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
GraphConflictResolutionException	TokenNameIdentifier	 Graph Conflict Resolution Exception
(	TokenNameLPAREN	
"graph with an entry, but not vertices do not exist"	TokenNameStringLiteral	graph with an entry, but not vertices do not exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
isEmptyEdges	TokenNameIdentifier	 is Empty Edges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// no edges - nothing to worry about 	TokenNameCOMMENT_LINE	no edges - nothing to worry about 
}	TokenNameRBRACE	
final	TokenNamefinal	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
vertices	TokenNameIdentifier	 vertices
=	TokenNameEQUAL	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
getVertices	TokenNameIdentifier	 get Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// edge case - single vertex graph 	TokenNameCOMMENT_LINE	edge case - single vertex graph 
if	TokenNameif	
(	TokenNameLPAREN	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
requestedScope	TokenNameIdentifier	 requested Scope
=	TokenNameEQUAL	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
checkScope	TokenNameIdentifier	 check Scope
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
setVersionedVertices	TokenNameIdentifier	 set Versioned Vertices
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
setScopedVertices	TokenNameIdentifier	 set Scoped Vertices
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
resEntry	TokenNameIdentifier	 res Entry
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
addVertex	TokenNameIdentifier	 add Vertex
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
setEntry	TokenNameIdentifier	 set Entry
(	TokenNameLPAREN	
resEntry	TokenNameIdentifier	 res Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
requestedScope	TokenNameIdentifier	 requested Scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v	TokenNameIdentifier	 v
:	TokenNameCOLON	
vertices	TokenNameIdentifier	 vertices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
ins	TokenNameIdentifier	 ins
=	TokenNameEQUAL	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
edge	TokenNameIdentifier	 edge
=	TokenNameEQUAL	
cleanEdges	TokenNameIdentifier	 clean Edges
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
ins	TokenNameIdentifier	 ins
,	TokenNameCOMMA	
requestedScope	TokenNameIdentifier	 requested Scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
edge	TokenNameIdentifier	 edge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no edges - don't need this vertex any more 	TokenNameCOMMENT_LINE	no edges - don't need this vertex any more 
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// unless it's an entry point. 	TokenNameCOMMENT_LINE	unless it's an entry point. 
// currently processing the entry point - it should not have any entry incident edges 	TokenNameCOMMENT_LINE	currently processing the entry point - it should not have any entry incident edges 
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setWhy	TokenNameIdentifier	 set Why
(	TokenNameLPAREN	
"This is a graph entry point. No links."	TokenNameStringLiteral	This is a graph entry point. No links.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// System.out.println("--->"+v.getMd().toDomainString() 	TokenNameCOMMENT_LINE	System.out.println("--->"+v.getMd().toDomainString() 
// +" has been terminated on this entry set\n-------------------\n" 	TokenNameCOMMENT_LINE	+" has been terminated on this entry set\n-------------------\n" 
// +ins 	TokenNameCOMMENT_LINE	+ins 
// +"\n-------------------\n" 	TokenNameCOMMENT_LINE	+"\n-------------------\n" 
// ); 	TokenNameCOMMENT_LINE	); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// System.out.println("+++>"+v.getMd().toDomainString()+" still has "+edge.toString() ); 	TokenNameCOMMENT_LINE	System.out.println("+++>"+v.getMd().toDomainString()+" still has "+edge.toString() ); 
// fill in domain md with actual version data 	TokenNameCOMMENT_LINE	fill in domain md with actual version data 
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
newMd	TokenNameIdentifier	 new Md
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
edge	TokenNameIdentifier	 edge
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getScopeAsEnum	TokenNameIdentifier	 get Scope As Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
edge	TokenNameIdentifier	 edge
.	TokenNameDOT	
getArtifactUri	TokenNameIdentifier	 get Artifact Uri
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
edge	TokenNameIdentifier	 edge
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
edge	TokenNameIdentifier	 edge
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
edge	TokenNameIdentifier	 edge
.	TokenNameDOT	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
edge	TokenNameIdentifier	 edge
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
edge	TokenNameIdentifier	 edge
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
newV	TokenNameIdentifier	 new V
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
addVertex	TokenNameIdentifier	 add Vertex
(	TokenNameLPAREN	
newMd	TokenNameIdentifier	 new Md
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
sourceV	TokenNameIdentifier	 source V
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
addVertex	TokenNameIdentifier	 add Vertex
(	TokenNameLPAREN	
edge	TokenNameIdentifier	 edge
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
addEdge	TokenNameIdentifier	 add Edge
(	TokenNameLPAREN	
sourceV	TokenNameIdentifier	 source V
,	TokenNameCOMMA	
newV	TokenNameIdentifier	 new V
,	TokenNameCOMMA	
edge	TokenNameIdentifier	 edge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
linkedRes	TokenNameIdentifier	 linked Res
=	TokenNameEQUAL	
findLinkedSubgraph	TokenNameIdentifier	 find Linked Subgraph
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("Original graph("+graph.getVertices().size()+"):\n"+graph.toString()); 	TokenNameCOMMENT_LINE	System.err.println("Original graph("+graph.getVertices().size()+"):\n"+graph.toString()); 
// System.err.println("Cleaned("+requestedScope+") graph("+res.getVertices().size()+"):\n"+res.toString()); 	TokenNameCOMMENT_LINE	System.err.println("Cleaned("+requestedScope+") graph("+res.getVertices().size()+"):\n"+res.toString()); 
// System.err.println("Linked("+requestedScope+") 	TokenNameCOMMENT_LINE	System.err.println("Linked("+requestedScope+") 
// subgraph("+linkedRes.getVertices().size()+"):\n"+linkedRes.toString()); 	TokenNameCOMMENT_LINE	subgraph("+linkedRes.getVertices().size()+"):\n"+linkedRes.toString()); 
return	TokenNamereturn	
linkedRes	TokenNameIdentifier	 linked Res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
GraphConflictResolutionException	TokenNameIdentifier	 Graph Conflict Resolution Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------- 
private	TokenNameprivate	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
findLinkedSubgraph	TokenNameIdentifier	 find Linked Subgraph
(	TokenNameLPAREN	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getVertices	TokenNameIdentifier	 get Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
visited	TokenNameIdentifier	 visited
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getVertices	TokenNameIdentifier	 get Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
visit	TokenNameIdentifier	 visit
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
visited	TokenNameIdentifier	 visited
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
dropList	TokenNameIdentifier	 drop List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getVertices	TokenNameIdentifier	 get Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// collect drop list 	TokenNameCOMMENT_LINE	collect drop list 
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v	TokenNameIdentifier	 v
:	TokenNameCOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getVertices	TokenNameIdentifier	 get Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
visited	TokenNameIdentifier	 visited
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dropList	TokenNameIdentifier	 drop List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dropList	TokenNameIdentifier	 drop List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// now - drop vertices 	TokenNameCOMMENT_LINE	now - drop vertices 
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
vertices	TokenNameIdentifier	 vertices
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getVertices	TokenNameIdentifier	 get Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v	TokenNameIdentifier	 v
:	TokenNameCOLON	
dropList	TokenNameIdentifier	 drop List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------- 
private	TokenNameprivate	
void	TokenNamevoid	
visit	TokenNameIdentifier	 visit
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
visited	TokenNameIdentifier	 visited
,	TokenNameCOMMA	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
graph	TokenNameIdentifier	 graph
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
visited	TokenNameIdentifier	 visited
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
visited	TokenNameIdentifier	 visited
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
exitList	TokenNameIdentifier	 exit List
=	TokenNameEQUAL	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// String s = "|---> "+from.getMd().toString()+" - "+(exitList == null ? -1 : exitList.size()) + " exit links"; 	TokenNameCOMMENT_LINE	String s = "|---> "+from.getMd().toString()+" - "+(exitList == null ? -1 : exitList.size()) + " exit links"; 
if	TokenNameif	
(	TokenNameLPAREN	
exitList	TokenNameIdentifier	 exit List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
exitList	TokenNameIdentifier	 exit List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
visit	TokenNameIdentifier	 visit
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
visited	TokenNameIdentifier	 visited
,	TokenNameCOMMA	
graph	TokenNameIdentifier	 graph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------- 
private	TokenNameprivate	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
cleanEdges	TokenNameIdentifier	 clean Edges
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
edges	TokenNameIdentifier	 edges
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
edges	TokenNameIdentifier	 edges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
edges	TokenNameIdentifier	 edges
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
edges	TokenNameIdentifier	 edges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
edges	TokenNameIdentifier	 edges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
.	TokenNameDOT	
encloses	TokenNameIdentifier	 encloses
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
edges	TokenNameIdentifier	 edges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
scope	TokenNameIdentifier	 scope
.	TokenNameDOT	
encloses	TokenNameIdentifier	 encloses
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------- 
// ------------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------- 
}	TokenNameRBRACE	
