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
ClasspathContainer	TokenNameIdentifier	 Classpath Container
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
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
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
/** * * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
class	TokenNameclass	
DefaultClasspathTransformationTest	TokenNameIdentifier	 Default Classpath Transformation Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
transform	TokenNameIdentifier	 transform
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
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
.	TokenNameDOT	
ROLE	TokenNameIdentifier	 ROLE
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/* * v2 * v1< * v3-v4 * */	TokenNameCOMMENT_BLOCK	 v2 v1< v3-v4 
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
2	TokenNameIntegerLiteral	
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
test	TokenNameIdentifier	 test
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
testCompileClasspathTransform	TokenNameIdentifier	 test Compile Classpath Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ClasspathContainer	TokenNameIdentifier	 Classpath Container
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
graph	TokenNameIdentifier	 graph
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"null classpath container after compile transform"	TokenNameStringLiteral	null classpath container after compile transform
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"null classpath after compile transform"	TokenNameStringLiteral	null classpath after compile transform
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"compile classpath should have 3 entries"	TokenNameStringLiteral	compile classpath should have 3 entries
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------------------------ 
public	TokenNamepublic	
void	TokenNamevoid	
testRuntimeClasspathTransform	TokenNameIdentifier	 test Runtime Classpath Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ClasspathContainer	TokenNameIdentifier	 Classpath Container
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
graph	TokenNameIdentifier	 graph
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"null classpath container after runtime transform"	TokenNameStringLiteral	null classpath container after runtime transform
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"null classpath after runtime transform"	TokenNameStringLiteral	null classpath after runtime transform
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"runtime classpath should have 4 entries"	TokenNameStringLiteral	runtime classpath should have 4 entries
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"runtime artifact version should be 1.1"	TokenNameStringLiteral	runtime artifact version should be 1.1
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
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
testTestClasspathTransform	TokenNameIdentifier	 test Test Classpath Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ClasspathContainer	TokenNameIdentifier	 Classpath Container
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
graph	TokenNameIdentifier	 graph
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"null classpath container after runtime transform"	TokenNameStringLiteral	null classpath container after runtime transform
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"null classpath after runtime transform"	TokenNameStringLiteral	null classpath after runtime transform
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"runtime classpath should have 4 entries"	TokenNameStringLiteral	runtime classpath should have 4 entries
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"test artifact version should be 1.2"	TokenNameStringLiteral	test artifact version should be 1.2
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
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
