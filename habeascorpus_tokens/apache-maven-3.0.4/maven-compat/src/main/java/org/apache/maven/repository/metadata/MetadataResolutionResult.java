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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusContainer	TokenNameIdentifier	 Plexus Container
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
;	TokenNameSEMICOLON	
/** * This object is tinted with ClasspathTransformation and GraphConflictResolver. * Get rid of them after debugging * * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> */	TokenNameCOMMENT_JAVADOC	 This object is tinted with ClasspathTransformation and GraphConflictResolver. Get rid of them after debugging * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
class	TokenNameclass	
MetadataResolutionResult	TokenNameIdentifier	 Metadata Resolution Result
{	TokenNameLBRACE	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
treeRoot	TokenNameIdentifier	 tree Root
;	TokenNameSEMICOLON	
/** * these components are are initialized on demand by * explicit call of the initTreeProcessing() */	TokenNameCOMMENT_JAVADOC	 these components are are initialized on demand by explicit call of the initTreeProcessing() 
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
classpathTransformation	TokenNameIdentifier	 classpath Transformation
;	TokenNameSEMICOLON	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
conflictResolver	TokenNameIdentifier	 conflict Resolver
;	TokenNameSEMICOLON	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
MetadataResolutionResult	TokenNameIdentifier	 Metadata Resolution Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
MetadataResolutionResult	TokenNameIdentifier	 Metadata Resolution Result
(	TokenNameLPAREN	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
treeRoot	TokenNameIdentifier	 tree Root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
getTree	TokenNameIdentifier	 get Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
treeRoot	TokenNameIdentifier	 tree Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
void	TokenNamevoid	
setTree	TokenNameIdentifier	 set Tree
(	TokenNameLPAREN	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
treeRoot	TokenNameIdentifier	 tree Root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
initTreeProcessing	TokenNameIdentifier	 init Tree Processing
(	TokenNameLPAREN	
PlexusContainer	TokenNameIdentifier	 Plexus Container
plexus	TokenNameIdentifier	 plexus
)	TokenNameRPAREN	
throws	TokenNamethrows	
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
{	TokenNameLBRACE	
classpathTransformation	TokenNameIdentifier	 classpath Transformation
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
)	TokenNameRPAREN	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conflictResolver	TokenNameIdentifier	 conflict Resolver
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
)	TokenNameRPAREN	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
GraphConflictResolver	TokenNameIdentifier	 Graph Conflict Resolver
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
getGraph	TokenNameIdentifier	 get Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
treeRoot	TokenNameIdentifier	 tree Root
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
new	TokenNamenew	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
treeRoot	TokenNameIdentifier	 tree Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
getGraph	TokenNameIdentifier	 get Graph
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
,	TokenNameCOMMA	
GraphConflictResolutionException	TokenNameIdentifier	 Graph Conflict Resolution Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
treeRoot	TokenNameIdentifier	 tree Root
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
conflictResolver	TokenNameIdentifier	 conflict Resolver
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
conflictResolver	TokenNameIdentifier	 conflict Resolver
.	TokenNameDOT	
resolveConflicts	TokenNameIdentifier	 resolve Conflicts
(	TokenNameLPAREN	
getGraph	TokenNameIdentifier	 get Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
getGraph	TokenNameIdentifier	 get Graph
(	TokenNameLPAREN	
MetadataResolutionRequestTypeEnum	TokenNameIdentifier	 Metadata Resolution Request Type Enum
requestType	TokenNameIdentifier	 request Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
,	TokenNameCOMMA	
GraphConflictResolutionException	TokenNameIdentifier	 Graph Conflict Resolution Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
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
treeRoot	TokenNameIdentifier	 tree Root
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
conflictResolver	TokenNameIdentifier	 conflict Resolver
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
requestType	TokenNameIdentifier	 request Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MetadataResolutionRequestTypeEnum	TokenNameIdentifier	 Metadata Resolution Request Type Enum
.	TokenNameDOT	
classpathCompile	TokenNameIdentifier	 classpath Compile
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
conflictResolver	TokenNameIdentifier	 conflict Resolver
.	TokenNameDOT	
resolveConflicts	TokenNameIdentifier	 resolve Conflicts
(	TokenNameLPAREN	
getGraph	TokenNameIdentifier	 get Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MetadataResolutionRequestTypeEnum	TokenNameIdentifier	 Metadata Resolution Request Type Enum
.	TokenNameDOT	
classpathRuntime	TokenNameIdentifier	 classpath Runtime
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
conflictResolver	TokenNameIdentifier	 conflict Resolver
.	TokenNameDOT	
resolveConflicts	TokenNameIdentifier	 resolve Conflicts
(	TokenNameLPAREN	
getGraph	TokenNameIdentifier	 get Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MetadataResolutionRequestTypeEnum	TokenNameIdentifier	 Metadata Resolution Request Type Enum
.	TokenNameDOT	
classpathRuntime	TokenNameIdentifier	 classpath Runtime
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
conflictResolver	TokenNameIdentifier	 conflict Resolver
.	TokenNameDOT	
resolveConflicts	TokenNameIdentifier	 resolve Conflicts
(	TokenNameLPAREN	
getGraph	TokenNameIdentifier	 get Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MetadataResolutionRequestTypeEnum	TokenNameIdentifier	 Metadata Resolution Request Type Enum
.	TokenNameDOT	
classpathRuntime	TokenNameIdentifier	 classpath Runtime
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
conflictResolver	TokenNameIdentifier	 conflict Resolver
.	TokenNameDOT	
resolveConflicts	TokenNameIdentifier	 resolve Conflicts
(	TokenNameLPAREN	
getGraph	TokenNameIdentifier	 get Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MetadataResolutionRequestTypeEnum	TokenNameIdentifier	 Metadata Resolution Request Type Enum
.	TokenNameDOT	
graph	TokenNameIdentifier	 graph
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getGraph	TokenNameIdentifier	 get Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MetadataResolutionRequestTypeEnum	TokenNameIdentifier	 Metadata Resolution Request Type Enum
.	TokenNameDOT	
versionedGraph	TokenNameIdentifier	 versioned Graph
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
getTree	TokenNameIdentifier	 get Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MetadataResolutionRequestTypeEnum	TokenNameIdentifier	 Metadata Resolution Request Type Enum
.	TokenNameDOT	
scopedGraph	TokenNameIdentifier	 scoped Graph
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
getTree	TokenNameIdentifier	 get Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
ClasspathContainer	TokenNameIdentifier	 Classpath Container
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataGraphTransformationException	TokenNameIdentifier	 Metadata Graph Transformation Exception
,	TokenNameCOMMA	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classpathTransformation	TokenNameIdentifier	 classpath Transformation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
dirtyGraph	TokenNameIdentifier	 dirty Graph
=	TokenNameEQUAL	
getGraph	TokenNameIdentifier	 get Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dirtyGraph	TokenNameIdentifier	 dirty Graph
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classpathTransformation	TokenNameIdentifier	 classpath Transformation
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
dirtyGraph	TokenNameIdentifier	 dirty Graph
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
getClasspathTree	TokenNameIdentifier	 get Classpath Tree
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataGraphTransformationException	TokenNameIdentifier	 Metadata Graph Transformation Exception
,	TokenNameCOMMA	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
ClasspathContainer	TokenNameIdentifier	 Classpath Container
cpc	TokenNameIdentifier	 cpc
=	TokenNameEQUAL	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cpc	TokenNameIdentifier	 cpc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cpc	TokenNameIdentifier	 cpc
.	TokenNameDOT	
getClasspathAsTree	TokenNameIdentifier	 get Classpath As Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
}	TokenNameRBRACE	
