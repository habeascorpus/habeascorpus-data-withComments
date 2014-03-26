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
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
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
/** * maven dependency metadata graph * * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 maven dependency metadata graph * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
class	TokenNameclass	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_VERTICES	TokenNameIdentifier	 DEFAULT  VERTICES
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_EDGES	TokenNameIdentifier	 DEFAULT  EDGES
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// flags to indicate the granularity of vertices 	TokenNameCOMMENT_LINE	flags to indicate the granularity of vertices 
private	TokenNameprivate	
boolean	TokenNameboolean	
versionedVertices	TokenNameIdentifier	 versioned Vertices
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
scopedVertices	TokenNameIdentifier	 scoped Vertices
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * the entry point we started building the graph from */	TokenNameCOMMENT_JAVADOC	 the entry point we started building the graph from 
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
// graph vertices 	TokenNameCOMMENT_LINE	graph vertices 
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
vertices	TokenNameIdentifier	 vertices
;	TokenNameSEMICOLON	
/** * incident and excident edges per node */	TokenNameCOMMENT_JAVADOC	 incident and excident edges per node 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>>	TokenNameRIGHT_SHIFT	
incidentEdges	TokenNameIdentifier	 incident Edges
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>>	TokenNameRIGHT_SHIFT	
excidentEdges	TokenNameIdentifier	 excident Edges
;	TokenNameSEMICOLON	
/** * null in dirty graph, actual * scope for conflict-resolved graph */	TokenNameCOMMENT_JAVADOC	 null in dirty graph, actual scope for conflict-resolved graph 
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
/** * init graph */	TokenNameCOMMENT_JAVADOC	 init graph 
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
int	TokenNameint	
nVertices	TokenNameIdentifier	 n Vertices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
nVertices	TokenNameIdentifier	 n Vertices
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
nVertices	TokenNameIdentifier	 n Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
int	TokenNameint	
nVertices	TokenNameIdentifier	 n Vertices
,	TokenNameCOMMA	
int	TokenNameint	
nEdges	TokenNameIdentifier	 n Edges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
nVertices	TokenNameIdentifier	 n Vertices
,	TokenNameCOMMA	
nEdges	TokenNameIdentifier	 n Edges
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
/** * construct a single vertex */	TokenNameCOMMENT_JAVADOC	 construct a single vertex 
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
checkVertex	TokenNameIdentifier	 check Vertex
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVertices	TokenNameIdentifier	 check Vertices
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setCompareVersion	TokenNameIdentifier	 set Compare Version
(	TokenNameLPAREN	
versionedVertices	TokenNameIdentifier	 versioned Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setCompareScope	TokenNameIdentifier	 set Compare Scope
(	TokenNameLPAREN	
scopedVertices	TokenNameIdentifier	 scoped Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
/** * construct graph from a "dirty" tree */	TokenNameCOMMENT_JAVADOC	 construct graph from a "dirty" tree 
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
tree	TokenNameIdentifier	 tree
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
/** * construct graph from a "dirty" tree * * @param tree "dirty" tree root * @param versionedVertices true if graph nodes should be versioned (different versions -> different nodes) * @param scopedVertices true if graph nodes should be versioned and scoped (different versions and/or scopes -> different nodes) * */	TokenNameCOMMENT_JAVADOC	 construct graph from a "dirty" tree * @param tree "dirty" tree root @param versionedVertices true if graph nodes should be versioned (different versions -> different nodes) @param scopedVertices true if graph nodes should be versioned and scoped (different versions and/or scopes -> different nodes) 
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
boolean	TokenNameboolean	
versionedVertices	TokenNameIdentifier	 versioned Vertices
,	TokenNameCOMMA	
boolean	TokenNameboolean	
scopedVertices	TokenNameIdentifier	 scoped Vertices
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
(	TokenNameLPAREN	
"tree is null"	TokenNameStringLiteral	tree is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setVersionedVertices	TokenNameIdentifier	 set Versioned Vertices
(	TokenNameLPAREN	
versionedVertices	TokenNameIdentifier	 versioned Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setScopedVertices	TokenNameIdentifier	 set Scoped Vertices
(	TokenNameLPAREN	
scopedVertices	TokenNameIdentifier	 scoped Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
versionedVertices	TokenNameIdentifier	 versioned Vertices
=	TokenNameEQUAL	
scopedVertices	TokenNameIdentifier	 scoped Vertices
||	TokenNameOR_OR	
versionedVertices	TokenNameIdentifier	 versioned Vertices
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scopedVertices	TokenNameIdentifier	 scoped Vertices
=	TokenNameEQUAL	
scopedVertices	TokenNameIdentifier	 scoped Vertices
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
countNodes	TokenNameIdentifier	 count Nodes
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processTreeNodes	TokenNameIdentifier	 process Tree Nodes
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
private	TokenNameprivate	
void	TokenNamevoid	
processTreeNodes	TokenNameIdentifier	 process Tree Nodes
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
parentVertex	TokenNameIdentifier	 parent Vertex
,	TokenNameCOMMA	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
int	TokenNameint	
pomOrder	TokenNameIdentifier	 pom Order
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
vertex	TokenNameIdentifier	 vertex
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
md	TokenNameIdentifier	 md
,	TokenNameCOMMA	
versionedVertices	TokenNameIdentifier	 versioned Vertices
,	TokenNameCOMMA	
scopedVertices	TokenNameIdentifier	 scoped Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
vertex	TokenNameIdentifier	 vertex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
vertex	TokenNameIdentifier	 vertex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parentVertex	TokenNameIdentifier	 parent Vertex
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// then create the edge 	TokenNameCOMMENT_LINE	then create the edge 
{	TokenNameLBRACE	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
artifactScope	TokenNameIdentifier	 artifact Scope
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
artifactUri	TokenNameIdentifier	 artifact Uri
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
pomOrder	TokenNameIdentifier	 pom Order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addEdge	TokenNameIdentifier	 add Edge
(	TokenNameLPAREN	
parentVertex	TokenNameIdentifier	 parent Vertex
,	TokenNameCOMMA	
vertex	TokenNameIdentifier	 vertex
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
vertex	TokenNameIdentifier	 vertex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
kids	TokenNameIdentifier	 kids
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kids	TokenNameIdentifier	 kids
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
kids	TokenNameIdentifier	 kids
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
kids	TokenNameIdentifier	 kids
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
kids	TokenNameIdentifier	 kids
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
processTreeNodes	TokenNameIdentifier	 process Tree Nodes
(	TokenNameLPAREN	
vertex	TokenNameIdentifier	 vertex
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
findVertex	TokenNameIdentifier	 find Vertex
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
vertices	TokenNameIdentifier	 vertices
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setCompareVersion	TokenNameIdentifier	 set Compare Version
(	TokenNameLPAREN	
versionedVertices	TokenNameIdentifier	 versioned Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setCompareScope	TokenNameIdentifier	 set Compare Scope
(	TokenNameLPAREN	
scopedVertices	TokenNameIdentifier	 scoped Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
gv	TokenNameIdentifier	 gv
:	TokenNameCOLON	
vertices	TokenNameIdentifier	 vertices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
addVertex	TokenNameIdentifier	 add Vertex
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkVertices	TokenNameIdentifier	 check Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
findVertex	TokenNameIdentifier	 find Vertex
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setCompareVersion	TokenNameIdentifier	 set Compare Version
(	TokenNameLPAREN	
versionedVertices	TokenNameIdentifier	 versioned Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setCompareScope	TokenNameIdentifier	 set Compare Scope
(	TokenNameLPAREN	
scopedVertices	TokenNameIdentifier	 scoped Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
/** * init graph */	TokenNameCOMMENT_JAVADOC	 init graph 
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
int	TokenNameint	
nVertices	TokenNameIdentifier	 n Vertices
,	TokenNameCOMMA	
int	TokenNameint	
nEdges	TokenNameIdentifier	 n Edges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nV	TokenNameIdentifier	 n V
=	TokenNameEQUAL	
nVertices	TokenNameIdentifier	 n Vertices
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nVertices	TokenNameIdentifier	 n Vertices
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nV	TokenNameIdentifier	 n V
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkVertices	TokenNameIdentifier	 check Vertices
(	TokenNameLPAREN	
nV	TokenNameIdentifier	 n V
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nE	TokenNameIdentifier	 n E
=	TokenNameEQUAL	
nVertices	TokenNameIdentifier	 n Vertices
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nEdges	TokenNameIdentifier	 n Edges
<=	TokenNameLESS_EQUAL	
nV	TokenNameIdentifier	 n V
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nE	TokenNameIdentifier	 n E
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
nE	TokenNameIdentifier	 n E
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkEdges	TokenNameIdentifier	 check Edges
(	TokenNameLPAREN	
nE	TokenNameIdentifier	 n E
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkVertices	TokenNameIdentifier	 check Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkVertices	TokenNameIdentifier	 check Vertices
(	TokenNameLPAREN	
DEFAULT_VERTICES	TokenNameIdentifier	 DEFAULT  VERTICES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkVertices	TokenNameIdentifier	 check Vertices
(	TokenNameLPAREN	
int	TokenNameint	
nVertices	TokenNameIdentifier	 n Vertices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vertices	TokenNameIdentifier	 vertices
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vertices	TokenNameIdentifier	 vertices
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkEdges	TokenNameIdentifier	 check Edges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
DEFAULT_EDGES	TokenNameIdentifier	 DEFAULT  EDGES
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
vertices	TokenNameIdentifier	 vertices
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkEdges	TokenNameIdentifier	 check Edges
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkEdges	TokenNameIdentifier	 check Edges
(	TokenNameLPAREN	
int	TokenNameint	
nEdges	TokenNameIdentifier	 n Edges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
incidentEdges	TokenNameIdentifier	 incident Edges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
incidentEdges	TokenNameIdentifier	 incident Edges
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
nEdges	TokenNameIdentifier	 n Edges
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
excidentEdges	TokenNameIdentifier	 excident Edges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
excidentEdges	TokenNameIdentifier	 excident Edges
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
nEdges	TokenNameIdentifier	 n Edges
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
checkVertex	TokenNameIdentifier	 check Vertex
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
(	TokenNameLPAREN	
"null vertex"	TokenNameStringLiteral	null vertex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
(	TokenNameLPAREN	
"vertex without metadata"	TokenNameStringLiteral	vertex without metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
checkEdge	TokenNameIdentifier	 check Edge
(	TokenNameLPAREN	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
(	TokenNameLPAREN	
"badly formed edge"	TokenNameStringLiteral	badly formed edge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
getEdgesBetween	TokenNameIdentifier	 get Edges Between
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
vFrom	TokenNameIdentifier	 v From
,	TokenNameCOMMA	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
vTo	TokenNameIdentifier	 v To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
edges	TokenNameIdentifier	 edges
=	TokenNameEQUAL	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
vTo	TokenNameIdentifier	 v To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
(	TokenNameLPAREN	
edges	TokenNameIdentifier	 edges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
vFrom	TokenNameIdentifier	 v From
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
addEdge	TokenNameIdentifier	 add Edge
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
vFrom	TokenNameIdentifier	 v From
,	TokenNameCOMMA	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
vTo	TokenNameIdentifier	 v To
,	TokenNameCOMMA	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
checkVertex	TokenNameIdentifier	 check Vertex
(	TokenNameLPAREN	
vFrom	TokenNameIdentifier	 v From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVertex	TokenNameIdentifier	 check Vertex
(	TokenNameLPAREN	
vTo	TokenNameIdentifier	 v To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVertices	TokenNameIdentifier	 check Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkEdge	TokenNameIdentifier	 check Edge
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkEdges	TokenNameIdentifier	 check Edges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
vFrom	TokenNameIdentifier	 v From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
vTo	TokenNameIdentifier	 v To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vFrom	TokenNameIdentifier	 v From
.	TokenNameDOT	
setCompareVersion	TokenNameIdentifier	 set Compare Version
(	TokenNameLPAREN	
versionedVertices	TokenNameIdentifier	 versioned Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vFrom	TokenNameIdentifier	 v From
.	TokenNameDOT	
setCompareScope	TokenNameIdentifier	 set Compare Scope
(	TokenNameLPAREN	
scopedVertices	TokenNameIdentifier	 scoped Vertices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
exList	TokenNameIdentifier	 ex List
=	TokenNameEQUAL	
excidentEdges	TokenNameIdentifier	 excident Edges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
vFrom	TokenNameIdentifier	 v From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exList	TokenNameIdentifier	 ex List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exList	TokenNameIdentifier	 ex List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
excidentEdges	TokenNameIdentifier	 excident Edges
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
vFrom	TokenNameIdentifier	 v From
,	TokenNameCOMMA	
exList	TokenNameIdentifier	 ex List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
exList	TokenNameIdentifier	 ex List
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exList	TokenNameIdentifier	 ex List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
inList	TokenNameIdentifier	 in List
=	TokenNameEQUAL	
incidentEdges	TokenNameIdentifier	 incident Edges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
vTo	TokenNameIdentifier	 v To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inList	TokenNameIdentifier	 in List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inList	TokenNameIdentifier	 in List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incidentEdges	TokenNameIdentifier	 incident Edges
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
vTo	TokenNameIdentifier	 v To
,	TokenNameCOMMA	
inList	TokenNameIdentifier	 in List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inList	TokenNameIdentifier	 in List
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inList	TokenNameIdentifier	 in List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
removeVertex	TokenNameIdentifier	 remove Vertex
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vertices	TokenNameIdentifier	 vertices
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
if	TokenNameif	
(	TokenNameLPAREN	
incidentEdges	TokenNameIdentifier	 incident Edges
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
incidentEdges	TokenNameIdentifier	 incident Edges
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
excidentEdges	TokenNameIdentifier	 excident Edges
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
excidentEdges	TokenNameIdentifier	 excident Edges
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
countNodes	TokenNameIdentifier	 count Nodes
(	TokenNameLPAREN	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
tree	TokenNameIdentifier	 tree
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
kids	TokenNameIdentifier	 kids
=	TokenNameEQUAL	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kids	TokenNameIdentifier	 kids
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
kids	TokenNameIdentifier	 kids
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
n	TokenNameIdentifier	 n
:	TokenNameCOLON	
kids	TokenNameIdentifier	 kids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
countNodes	TokenNameIdentifier	 count Nodes
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEntry	TokenNameIdentifier	 set Entry
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
getVertices	TokenNameIdentifier	 get Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vertices	TokenNameIdentifier	 vertices
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
vertex	TokenNameIdentifier	 vertex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkEdges	TokenNameIdentifier	 check Edges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
incidentEdges	TokenNameIdentifier	 incident Edges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
vertex	TokenNameIdentifier	 vertex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
vertex	TokenNameIdentifier	 vertex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkEdges	TokenNameIdentifier	 check Edges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
excidentEdges	TokenNameIdentifier	 excident Edges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
vertex	TokenNameIdentifier	 vertex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isVersionedVertices	TokenNameIdentifier	 is Versioned Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
versionedVertices	TokenNameIdentifier	 versioned Vertices
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setVersionedVertices	TokenNameIdentifier	 set Versioned Vertices
(	TokenNameLPAREN	
boolean	TokenNameboolean	
versionedVertices	TokenNameIdentifier	 versioned Vertices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
versionedVertices	TokenNameIdentifier	 versioned Vertices
=	TokenNameEQUAL	
versionedVertices	TokenNameIdentifier	 versioned Vertices
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isScopedVertices	TokenNameIdentifier	 is Scoped Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scopedVertices	TokenNameIdentifier	 scoped Vertices
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setScopedVertices	TokenNameIdentifier	 set Scoped Vertices
(	TokenNameLPAREN	
boolean	TokenNameboolean	
scopedVertices	TokenNameIdentifier	 scoped Vertices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scopedVertices	TokenNameIdentifier	 scoped Vertices
=	TokenNameEQUAL	
scopedVertices	TokenNameIdentifier	 scoped Vertices
;	TokenNameSEMICOLON	
// scoped graph is versioned by definition 	TokenNameCOMMENT_LINE	scoped graph is versioned by definition 
if	TokenNameif	
(	TokenNameLPAREN	
scopedVertices	TokenNameIdentifier	 scoped Vertices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versionedVertices	TokenNameIdentifier	 versioned Vertices
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entry	TokenNameIdentifier	 entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
vertices	TokenNameIdentifier	 vertices
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
vertices	TokenNameIdentifier	 vertices
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmptyEdges	TokenNameIdentifier	 is Empty Edges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
incidentEdges	TokenNameIdentifier	 incident Edges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
incidentEdges	TokenNameIdentifier	 incident Edges
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
512	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"empty"	TokenNameStringLiteral	empty
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v	TokenNameIdentifier	 v
:	TokenNameCOLON	
vertices	TokenNameIdentifier	 vertices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Vertex: "	TokenNameStringLiteral	Vertex: 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
ins	TokenNameIdentifier	 ins
=	TokenNameEQUAL	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ins	TokenNameIdentifier	 ins
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" from : "	TokenNameStringLiteral	 from : 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" no entries "	TokenNameStringLiteral	 no entries 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
outs	TokenNameIdentifier	 outs
=	TokenNameEQUAL	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outs	TokenNameIdentifier	 outs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
outs	TokenNameIdentifier	 outs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" to : "	TokenNameStringLiteral	 to : 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" no exit "	TokenNameStringLiteral	 no exit 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"------------------------------------------------- "	TokenNameStringLiteral	------------------------------------------------- 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"============================================================= "	TokenNameStringLiteral	============================================================= 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
}	TokenNameRBRACE	
