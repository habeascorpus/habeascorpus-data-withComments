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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
conflict	TokenNameIdentifier	 conflict
.	TokenNameDOT	
FarthestConflictResolver	TokenNameIdentifier	 Farthest Conflict Resolver
;	TokenNameSEMICOLON	
/** * Tests <code>FarthestConflictResolver</code>. * * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> * @see FarthestConflictResolver */	TokenNameCOMMENT_JAVADOC	 Tests <code>FarthestConflictResolver</code>. * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> @see FarthestConflictResolver 
public	TokenNamepublic	
class	TokenNameclass	
FarthestConflictResolverTest	TokenNameIdentifier	 Farthest Conflict Resolver Test
extends	TokenNameextends	
AbstractConflictResolverTest	TokenNameIdentifier	 Abstract Conflict Resolver Test
{	TokenNameLBRACE	
// constructors ----------------------------------------------------------- 	TokenNameCOMMENT_LINE	constructors ----------------------------------------------------------- 
public	TokenNamepublic	
FarthestConflictResolverTest	TokenNameIdentifier	 Farthest Conflict Resolver Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"farthest"	TokenNameStringLiteral	farthest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tests ------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	tests ------------------------------------------------------------------ 
/** * Tests that <code>a:2.0</code> wins in the scenario: * <pre> * a:1.0 * b:1.0 -> a:2.0 * </pre> */	TokenNameCOMMENT_JAVADOC	 Tests that <code>a:2.0</code> wins in the scenario: <pre> a:1.0 b:1.0 -> a:2.0 </pre> 
public	TokenNamepublic	
void	TokenNamevoid	
testDepth	TokenNameIdentifier	 test Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResolutionNode	TokenNameIdentifier	 Resolution Node
a1n	TokenNameIdentifier	 a1n
=	TokenNameEQUAL	
new	TokenNamenew	
ResolutionNode	TokenNameIdentifier	 Resolution Node
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResolutionNode	TokenNameIdentifier	 Resolution Node
b1n	TokenNameIdentifier	 b1n
=	TokenNameEQUAL	
new	TokenNamenew	
ResolutionNode	TokenNameIdentifier	 Resolution Node
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResolutionNode	TokenNameIdentifier	 Resolution Node
a2n	TokenNameIdentifier	 a2n
=	TokenNameEQUAL	
new	TokenNamenew	
ResolutionNode	TokenNameIdentifier	 Resolution Node
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
,	TokenNameCOMMA	
b1n	TokenNameIdentifier	 b1n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResolveConflict	TokenNameIdentifier	 assert Resolve Conflict
(	TokenNameLPAREN	
a2n	TokenNameIdentifier	 a2n
,	TokenNameCOMMA	
a1n	TokenNameIdentifier	 a1n
,	TokenNameCOMMA	
a2n	TokenNameIdentifier	 a2n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that <code>a:2.0</code> wins in the scenario: * <pre> * b:1.0 -> a:2.0 * a:1.0 * </pre> */	TokenNameCOMMENT_JAVADOC	 Tests that <code>a:2.0</code> wins in the scenario: <pre> b:1.0 -> a:2.0 a:1.0 </pre> 
public	TokenNamepublic	
void	TokenNamevoid	
testDepthReversed	TokenNameIdentifier	 test Depth Reversed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResolutionNode	TokenNameIdentifier	 Resolution Node
b1n	TokenNameIdentifier	 b1n
=	TokenNameEQUAL	
new	TokenNamenew	
ResolutionNode	TokenNameIdentifier	 Resolution Node
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResolutionNode	TokenNameIdentifier	 Resolution Node
a2n	TokenNameIdentifier	 a2n
=	TokenNameEQUAL	
new	TokenNamenew	
ResolutionNode	TokenNameIdentifier	 Resolution Node
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
,	TokenNameCOMMA	
b1n	TokenNameIdentifier	 b1n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResolutionNode	TokenNameIdentifier	 Resolution Node
a1n	TokenNameIdentifier	 a1n
=	TokenNameEQUAL	
new	TokenNamenew	
ResolutionNode	TokenNameIdentifier	 Resolution Node
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResolveConflict	TokenNameIdentifier	 assert Resolve Conflict
(	TokenNameLPAREN	
a2n	TokenNameIdentifier	 a2n
,	TokenNameCOMMA	
a2n	TokenNameIdentifier	 a2n
,	TokenNameCOMMA	
a1n	TokenNameIdentifier	 a1n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that <code>a:1.0</code> wins in the scenario: * <pre> * a:1.0 * a:2.0 * </pre> */	TokenNameCOMMENT_JAVADOC	 Tests that <code>a:1.0</code> wins in the scenario: <pre> a:1.0 a:2.0 </pre> 
public	TokenNamepublic	
void	TokenNamevoid	
testEqual	TokenNameIdentifier	 test Equal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResolutionNode	TokenNameIdentifier	 Resolution Node
a1n	TokenNameIdentifier	 a1n
=	TokenNameEQUAL	
new	TokenNamenew	
ResolutionNode	TokenNameIdentifier	 Resolution Node
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResolutionNode	TokenNameIdentifier	 Resolution Node
a2n	TokenNameIdentifier	 a2n
=	TokenNameEQUAL	
new	TokenNamenew	
ResolutionNode	TokenNameIdentifier	 Resolution Node
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResolveConflict	TokenNameIdentifier	 assert Resolve Conflict
(	TokenNameLPAREN	
a1n	TokenNameIdentifier	 a1n
,	TokenNameCOMMA	
a1n	TokenNameIdentifier	 a1n
,	TokenNameCOMMA	
a2n	TokenNameIdentifier	 a2n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that <code>a:2.0</code> wins in the scenario: * <pre> * a:2.0 * a:1.0 * </pre> */	TokenNameCOMMENT_JAVADOC	 Tests that <code>a:2.0</code> wins in the scenario: <pre> a:2.0 a:1.0 </pre> 
public	TokenNamepublic	
void	TokenNamevoid	
testEqualReversed	TokenNameIdentifier	 test Equal Reversed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResolutionNode	TokenNameIdentifier	 Resolution Node
a2n	TokenNameIdentifier	 a2n
=	TokenNameEQUAL	
new	TokenNamenew	
ResolutionNode	TokenNameIdentifier	 Resolution Node
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ResolutionNode	TokenNameIdentifier	 Resolution Node
a1n	TokenNameIdentifier	 a1n
=	TokenNameEQUAL	
new	TokenNamenew	
ResolutionNode	TokenNameIdentifier	 Resolution Node
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertResolveConflict	TokenNameIdentifier	 assert Resolve Conflict
(	TokenNameLPAREN	
a2n	TokenNameIdentifier	 a2n
,	TokenNameCOMMA	
a2n	TokenNameIdentifier	 a2n
,	TokenNameCOMMA	
a1n	TokenNameIdentifier	 a1n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
