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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
class	TokenNameclass	
DefaultGraphConflictResolverTest	TokenNameIdentifier	 Default Graph Conflict Resolver Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
;	TokenNameSEMICOLON	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
graph	TokenNameIdentifier	 graph
;	TokenNameSEMICOLON	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v3	TokenNameIdentifier	 v3
;	TokenNameSEMICOLON	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
v4	TokenNameIdentifier	 v4
;	TokenNameSEMICOLON	
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
.	TokenNameDOT	
ROLE	TokenNameIdentifier	 ROLE
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * v2 * v1< * v3-v4 * */	TokenNameCOMMENT_BLOCK	 v2 v1< v3-v4 
graph	TokenNameIdentifier	 graph
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
addVertex	TokenNameIdentifier	 add Vertex
(	TokenNameLPAREN	
new	TokenNamenew	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
"g"	TokenNameStringLiteral	g
,	TokenNameCOMMA	
"a1"	TokenNameStringLiteral	a1
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
setEntry	TokenNameIdentifier	 set Entry
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
addVertex	TokenNameIdentifier	 add Vertex
(	TokenNameLPAREN	
new	TokenNamenew	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
"g"	TokenNameStringLiteral	g
,	TokenNameCOMMA	
"a2"	TokenNameStringLiteral	a2
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v3	TokenNameIdentifier	 v3
=	TokenNameEQUAL	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
addVertex	TokenNameIdentifier	 add Vertex
(	TokenNameLPAREN	
new	TokenNamenew	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
"g"	TokenNameStringLiteral	g
,	TokenNameCOMMA	
"a3"	TokenNameStringLiteral	a3
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v4	TokenNameIdentifier	 v4
=	TokenNameEQUAL	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
addVertex	TokenNameIdentifier	 add Vertex
(	TokenNameLPAREN	
new	TokenNamenew	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
"g"	TokenNameStringLiteral	g
,	TokenNameCOMMA	
"a4"	TokenNameStringLiteral	a4
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// v1-->v2 	TokenNameCOMMENT_LINE	v1-->v2 
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
addEdge	TokenNameIdentifier	 add Edge
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
v2	TokenNameIdentifier	 v2
,	TokenNameCOMMA	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
addEdge	TokenNameIdentifier	 add Edge
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
v2	TokenNameIdentifier	 v2
,	TokenNameCOMMA	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// v1-->v3 	TokenNameCOMMENT_LINE	v1-->v3 
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
addEdge	TokenNameIdentifier	 add Edge
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
v3	TokenNameIdentifier	 v3
,	TokenNameCOMMA	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
addEdge	TokenNameIdentifier	 add Edge
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
v3	TokenNameIdentifier	 v3
,	TokenNameCOMMA	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// v3-->v4 	TokenNameCOMMENT_LINE	v3-->v4 
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
addEdge	TokenNameIdentifier	 add Edge
(	TokenNameLPAREN	
v3	TokenNameIdentifier	 v3
,	TokenNameCOMMA	
v4	TokenNameIdentifier	 v4
,	TokenNameCOMMA	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
addEdge	TokenNameIdentifier	 add Edge
(	TokenNameLPAREN	
v3	TokenNameIdentifier	 v3
,	TokenNameCOMMA	
v4	TokenNameIdentifier	 v4
,	TokenNameCOMMA	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
provided	TokenNameIdentifier	 provided
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
public	TokenNamepublic	
void	TokenNamevoid	
testCompileResolution	TokenNameIdentifier	 test Compile Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
resolveConflicts	TokenNameIdentifier	 resolve Conflicts
(	TokenNameLPAREN	
graph	TokenNameIdentifier	 graph
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"null graph after resolver"	TokenNameStringLiteral	null graph after resolver
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"no vertices in the resulting graph after resolver"	TokenNameStringLiteral	no vertices in the resulting graph after resolver
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getVertices	TokenNameIdentifier	 get Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"no edges in the resulting graph after resolver"	TokenNameStringLiteral	no edges in the resulting graph after resolver
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of vertices in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of vertices in the resulting graph after resolver
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of excident edges in the resulting graph entry after resolver"	TokenNameStringLiteral	wrong # of excident edges in the resulting graph entry after resolver
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of v2 incident edges in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of v2 incident edges in the resulting graph after resolver
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong edge v1-v2 in the resulting graph after resolver"	TokenNameStringLiteral	wrong edge v1-v2 in the resulting graph after resolver
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of edges v1-v3 in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of edges v1-v3 in the resulting graph after resolver
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v3	TokenNameIdentifier	 v3
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong edge v1-v3 in the resulting graph after resolver"	TokenNameStringLiteral	wrong edge v1-v3 in the resulting graph after resolver
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v3	TokenNameIdentifier	 v3
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of edges v3-v4 in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of edges v3-v4 in the resulting graph after resolver
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v4	TokenNameIdentifier	 v4
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong edge v3-v4 in the resulting graph after resolver"	TokenNameStringLiteral	wrong edge v3-v4 in the resulting graph after resolver
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v4	TokenNameIdentifier	 v4
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
public	TokenNamepublic	
void	TokenNamevoid	
testRuntimeResolution	TokenNameIdentifier	 test Runtime Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
resolveConflicts	TokenNameIdentifier	 resolve Conflicts
(	TokenNameLPAREN	
graph	TokenNameIdentifier	 graph
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"null graph after resolver"	TokenNameStringLiteral	null graph after resolver
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"no vertices in the resulting graph after resolver"	TokenNameStringLiteral	no vertices in the resulting graph after resolver
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getVertices	TokenNameIdentifier	 get Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"no edges in the resulting graph after resolver"	TokenNameStringLiteral	no edges in the resulting graph after resolver
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of vertices in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of vertices in the resulting graph after resolver
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of excident edges in the resulting graph entry after resolver"	TokenNameStringLiteral	wrong # of excident edges in the resulting graph entry after resolver
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of v2 incident edges in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of v2 incident edges in the resulting graph after resolver
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong edge v1-v2 in the resulting graph after resolver"	TokenNameStringLiteral	wrong edge v1-v2 in the resulting graph after resolver
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of edges v1-v3 in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of edges v1-v3 in the resulting graph after resolver
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v3	TokenNameIdentifier	 v3
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong edge v1-v3 in the resulting graph after resolver"	TokenNameStringLiteral	wrong edge v1-v3 in the resulting graph after resolver
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v3	TokenNameIdentifier	 v3
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of edges v3-v4 in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of edges v3-v4 in the resulting graph after resolver
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v4	TokenNameIdentifier	 v4
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong edge v3-v4 in the resulting graph after resolver"	TokenNameStringLiteral	wrong edge v3-v4 in the resulting graph after resolver
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v4	TokenNameIdentifier	 v4
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
public	TokenNamepublic	
void	TokenNamevoid	
testTestResolution	TokenNameIdentifier	 test Test Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
resolveConflicts	TokenNameIdentifier	 resolve Conflicts
(	TokenNameLPAREN	
graph	TokenNameIdentifier	 graph
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"null graph after resolver"	TokenNameStringLiteral	null graph after resolver
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"no vertices in the resulting graph after resolver"	TokenNameStringLiteral	no vertices in the resulting graph after resolver
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getVertices	TokenNameIdentifier	 get Vertices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"no edges in the resulting graph after resolver"	TokenNameStringLiteral	no edges in the resulting graph after resolver
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of vertices in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of vertices in the resulting graph after resolver
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of excident edges in the resulting graph entry after resolver"	TokenNameStringLiteral	wrong # of excident edges in the resulting graph entry after resolver
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of v2 incident edges in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of v2 incident edges in the resulting graph after resolver
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong edge v1-v2 in the resulting graph after resolver"	TokenNameStringLiteral	wrong edge v1-v2 in the resulting graph after resolver
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of edges v1-v3 in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of edges v1-v3 in the resulting graph after resolver
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v3	TokenNameIdentifier	 v3
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong edge v1-v3 in the resulting graph after resolver"	TokenNameStringLiteral	wrong edge v1-v3 in the resulting graph after resolver
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v3	TokenNameIdentifier	 v3
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong # of edges v3-v4 in the resulting graph after resolver"	TokenNameStringLiteral	wrong # of edges v3-v4 in the resulting graph after resolver
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v4	TokenNameIdentifier	 v4
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong edge v3-v4 in the resulting graph after resolver"	TokenNameStringLiteral	wrong edge v3-v4 in the resulting graph after resolver
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getIncidentEdges	TokenNameIdentifier	 get Incident Edges
(	TokenNameLPAREN	
v4	TokenNameIdentifier	 v4
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
}	TokenNameRBRACE	
