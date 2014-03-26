package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
/** * This is the main graph data structure used by the RepositorySystem to present tree and graph objects. * * @author Oleg Gusakov * */	TokenNameCOMMENT_JAVADOC	 This is the main graph data structure used by the RepositorySystem to present tree and graph objects. * @author Oleg Gusakov 
public	TokenNamepublic	
class	TokenNameclass	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
{	TokenNameLBRACE	
/** all graph nodes */	TokenNameCOMMENT_JAVADOC	 all graph nodes 
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
>	TokenNameGREATER	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
/** entry point for tree-like structures */	TokenNameCOMMENT_JAVADOC	 entry point for tree-like structures 
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataGraph	TokenNameIdentifier	 Metadata Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * find a node by the GAV (metadata) * * @param md * @return */	TokenNameCOMMENT_JAVADOC	 find a node by the GAV (metadata) * @param md @return 
public	TokenNamepublic	
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
findNode	TokenNameIdentifier	 find Node
(	TokenNameLPAREN	
MavenArtifactMetadata	TokenNameIdentifier	 Maven Artifact Metadata
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
mgn	TokenNameIdentifier	 mgn
:	TokenNameCOLON	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mgn	TokenNameIdentifier	 mgn
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mgn	TokenNameIdentifier	 mgn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * getter * * @return */	TokenNameCOMMENT_JAVADOC	 getter * @return 
public	TokenNamepublic	
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * getter * * @return */	TokenNameCOMMENT_JAVADOC	 getter * @return 
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
MetadataGraphNode	TokenNameIdentifier	 Metadata Graph Node
>	TokenNameGREATER	
getNodes	TokenNameIdentifier	 get Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
