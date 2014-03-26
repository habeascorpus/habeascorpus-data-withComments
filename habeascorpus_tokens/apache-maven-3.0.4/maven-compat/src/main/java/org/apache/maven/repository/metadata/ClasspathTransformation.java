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
/** * Helper class to conver an Md Graph into some form of a classpath * * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 Helper class to conver an Md Graph into some form of a classpath * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
ClasspathTransformation	TokenNameIdentifier	 Classpath Transformation
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Transform Graph into a Collection of metadata objects that * could serve as a classpath for a particular scope * * @param dirtyGraph - dependency graph * @param scope - which classpath to extract * @param resolve - whether to resolve artifacts. * @return Collection of metadata objects in the linked subgraph of the graph which * contains the graph.getEntry() vertice */	TokenNameCOMMENT_JAVADOC	 Transform Graph into a Collection of metadata objects that could serve as a classpath for a particular scope * @param dirtyGraph - dependency graph @param scope - which classpath to extract @param resolve - whether to resolve artifacts. @return Collection of metadata objects in the linked subgraph of the graph which contains the graph.getEntry() vertice 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
