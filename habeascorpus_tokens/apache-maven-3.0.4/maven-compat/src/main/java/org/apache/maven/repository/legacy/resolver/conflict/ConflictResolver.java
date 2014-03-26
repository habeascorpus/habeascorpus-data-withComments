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
/** * Determines which version of an artifact to use when there are conflicting declarations. * * @author <a href="mailto:jason@maven.org">Jason van Zyl</a> * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> */	TokenNameCOMMENT_JAVADOC	 Determines which version of an artifact to use when there are conflicting declarations. * @author <a href="mailto:jason@maven.org">Jason van Zyl</a> @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines which of the specified versions of an artifact to use when there are conflicting declarations. * * @param node1 the first artifact declaration * @param node2 the second artifact declaration * @return the artifact declaration to use: <code>node1</code>; <code>node2</code>; or <code>null</code>if * this conflict cannot be resolved * @since 3.0 */	TokenNameCOMMENT_JAVADOC	 Determines which of the specified versions of an artifact to use when there are conflicting declarations. * @param node1 the first artifact declaration @param node2 the second artifact declaration @return the artifact declaration to use: <code>node1</code>; <code>node2</code>; or <code>null</code>if this conflict cannot be resolved @since 3.0 
ResolutionNode	TokenNameIdentifier	 Resolution Node
resolveConflict	TokenNameIdentifier	 resolve Conflict
(	TokenNameLPAREN	
ResolutionNode	TokenNameIdentifier	 Resolution Node
node1	TokenNameIdentifier	 node1
,	TokenNameCOMMA	
ResolutionNode	TokenNameIdentifier	 Resolution Node
node2	TokenNameIdentifier	 node2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
