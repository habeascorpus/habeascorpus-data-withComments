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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
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
/** * default implementation of the metadata classpath transformer * * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 default implementation of the metadata classpath transformer * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultClasspathTransformation	TokenNameIdentifier	 Default Classpath Transformation
implements	TokenNameimplements	
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
conflictResolver	TokenNameIdentifier	 conflict Resolver
;	TokenNameSEMICOLON	
//---------------------------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------------------------------- 
public	TokenNamepublic	
ClasspathContainer	TokenNameIdentifier	 Classpath Container
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
dirtyGraph	TokenNameIdentifier	 dirty Graph
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
boolean	TokenNameboolean	
resolve	TokenNameIdentifier	 resolve
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataGraphTransformationException	TokenNameIdentifier	 Metadata Graph Transformation Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dirtyGraph	TokenNameIdentifier	 dirty Graph
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
dirtyGraph	TokenNameIdentifier	 dirty Graph
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
MetadataGraph	TokenNameIdentifier	 Metadata Graph
cleanGraph	TokenNameIdentifier	 clean Graph
=	TokenNameEQUAL	
conflictResolver	TokenNameIdentifier	 conflict Resolver
.	TokenNameDOT	
resolveConflicts	TokenNameIdentifier	 resolve Conflicts
(	TokenNameLPAREN	
dirtyGraph	TokenNameIdentifier	 dirty Graph
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cleanGraph	TokenNameIdentifier	 clean Graph
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
cleanGraph	TokenNameIdentifier	 clean Graph
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
ClasspathContainer	TokenNameIdentifier	 Classpath Container
cpc	TokenNameIdentifier	 cpc
=	TokenNameEQUAL	
new	TokenNamenew	
ClasspathContainer	TokenNameIdentifier	 Classpath Container
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cleanGraph	TokenNameIdentifier	 clean Graph
.	TokenNameDOT	
isEmptyEdges	TokenNameIdentifier	 is Empty Edges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// single entry in the classpath, populated from itself 	TokenNameCOMMENT_LINE	single entry in the classpath, populated from itself 
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
amd	TokenNameIdentifier	 amd
=	TokenNameEQUAL	
cleanGraph	TokenNameIdentifier	 clean Graph
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cpc	TokenNameIdentifier	 cpc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
amd	TokenNameIdentifier	 amd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ClasspathGraphVisitor	TokenNameIdentifier	 Classpath Graph Visitor
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
ClasspathGraphVisitor	TokenNameIdentifier	 Classpath Graph Visitor
(	TokenNameLPAREN	
cleanGraph	TokenNameIdentifier	 clean Graph
,	TokenNameCOMMA	
cpc	TokenNameIdentifier	 cpc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
cleanGraph	TokenNameIdentifier	 clean Graph
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// entry point 	TokenNameCOMMENT_LINE	entry point 
v	TokenNameIdentifier	 v
.	TokenNameDOT	
visit	TokenNameIdentifier	 visit
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// , md.getVersion(), md.getArtifactUri() ); 	TokenNameCOMMENT_LINE	, md.getVersion(), md.getArtifactUri() ); 
}	TokenNameRBRACE	
return	TokenNamereturn	
cpc	TokenNameIdentifier	 cpc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
GraphConflictResolutionException	TokenNameIdentifier	 Graph Conflict Resolution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MetadataGraphTransformationException	TokenNameIdentifier	 Metadata Graph Transformation Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//=================================================================================================== 	TokenNameCOMMENT_LINE	=================================================================================================== 
/** * Helper class to traverse graph. Required to make the containing method thread-safe * and yet use class level data to lessen stack usage in recursion */	TokenNameCOMMENT_JAVADOC	 Helper class to traverse graph. Required to make the containing method thread-safe and yet use class level data to lessen stack usage in recursion 
private	TokenNameprivate	
class	TokenNameclass	
ClasspathGraphVisitor	TokenNameIdentifier	 Classpath Graph Visitor
{	TokenNameLBRACE	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
graph	TokenNameIdentifier	 graph
;	TokenNameSEMICOLON	
ClasspathContainer	TokenNameIdentifier	 Classpath Container
cpc	TokenNameIdentifier	 cpc
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
visited	TokenNameIdentifier	 visited
;	TokenNameSEMICOLON	
// ----------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------------------------------------- 
protected	TokenNameprotected	
ClasspathGraphVisitor	TokenNameIdentifier	 Classpath Graph Visitor
(	TokenNameLPAREN	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
cleanGraph	TokenNameIdentifier	 clean Graph
,	TokenNameCOMMA	
ClasspathContainer	TokenNameIdentifier	 Classpath Container
cpc	TokenNameIdentifier	 cpc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cpc	TokenNameIdentifier	 cpc
=	TokenNameEQUAL	
cpc	TokenNameIdentifier	 cpc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
graph	TokenNameIdentifier	 graph
=	TokenNameEQUAL	
cleanGraph	TokenNameIdentifier	 clean Graph
;	TokenNameSEMICOLON	
visited	TokenNameIdentifier	 visited
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
(	TokenNameLPAREN	
cleanGraph	TokenNameIdentifier	 clean Graph
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
}	TokenNameRBRACE	
// ----------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------------------------------------- 
protected	TokenNameprotected	
void	TokenNamevoid	
visit	TokenNameIdentifier	 visit
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
// , String version, String artifactUri ) 	TokenNameCOMMENT_LINE	, String version, String artifactUri ) 
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
if	TokenNameif	
(	TokenNameLPAREN	
visited	TokenNameIdentifier	 visited
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cpc	TokenNameIdentifier	 cpc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// TreeSet<MetadataGraphEdge> deps = new TreeSet<MetadataGraphEdge>( 	TokenNameCOMMENT_LINE	TreeSet<MetadataGraphEdge> deps = new TreeSet<MetadataGraphEdge>( 
// new Comparator<MetadataGraphEdge>() 	TokenNameCOMMENT_LINE	new Comparator<MetadataGraphEdge>() 
// { 	TokenNameCOMMENT_LINE	{ 
// public int compare( MetadataGraphEdge e1 	TokenNameCOMMENT_LINE	public int compare( MetadataGraphEdge e1 
// , MetadataGraphEdge e2 	TokenNameCOMMENT_LINE	, MetadataGraphEdge e2 
// ) 	TokenNameCOMMENT_LINE	) 
// { 	TokenNameCOMMENT_LINE	{ 
// if( e1.getDepth() == e2.getDepth() ) 	TokenNameCOMMENT_LINE	if( e1.getDepth() == e2.getDepth() ) 
// { 	TokenNameCOMMENT_LINE	{ 
// if( e2.getPomOrder() == e1.getPomOrder() ) 	TokenNameCOMMENT_LINE	if( e2.getPomOrder() == e1.getPomOrder() ) 
// return e1.getTarget().toString().compareTo(e2.getTarget().toString() ); 	TokenNameCOMMENT_LINE	return e1.getTarget().toString().compareTo(e2.getTarget().toString() ); 
// 	TokenNameCOMMENT_LINE	 
// return e2.getPomOrder() - e1.getPomOrder(); 	TokenNameCOMMENT_LINE	return e2.getPomOrder() - e1.getPomOrder(); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// return e2.getDepth() - e1.getDepth(); 	TokenNameCOMMENT_LINE	return e2.getDepth() - e1.getDepth(); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// ); 	TokenNameCOMMENT_LINE	); 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
exits	TokenNameIdentifier	 exits
=	TokenNameEQUAL	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
getExcidentEdges	TokenNameIdentifier	 get Excident Edges
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exits	TokenNameIdentifier	 exits
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
exits	TokenNameIdentifier	 exits
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortedExits	TokenNameIdentifier	 sorted Exits
=	TokenNameEQUAL	
exits	TokenNameIdentifier	 exits
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
[	TokenNameLBRACKET	
exits	TokenNameIdentifier	 exits
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
sortedExits	TokenNameIdentifier	 sorted Exits
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e1	TokenNameIdentifier	 e1
,	TokenNameCOMMA	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getPomOrder	TokenNameIdentifier	 get Pom Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getPomOrder	TokenNameIdentifier	 get Pom Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getPomOrder	TokenNameIdentifier	 get Pom Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getPomOrder	TokenNameIdentifier	 get Pom Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
sortedExits	TokenNameIdentifier	 sorted Exits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
targetNode	TokenNameIdentifier	 target Node
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetNode	TokenNameIdentifier	 target Node
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setArtifactScope	TokenNameIdentifier	 set Artifact Scope
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetNode	TokenNameIdentifier	 target Node
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setWhy	TokenNameIdentifier	 set Why
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
visit	TokenNameIdentifier	 visit
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//----------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------------------------------------- 
//----------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------------------------------------- 
}	TokenNameRBRACE	
//---------------------------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------------------------------- 
//---------------------------------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------------------------------- 
}	TokenNameRBRACE	
