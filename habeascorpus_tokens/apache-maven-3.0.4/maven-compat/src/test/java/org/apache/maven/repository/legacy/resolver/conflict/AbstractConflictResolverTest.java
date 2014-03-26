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
Artifact	TokenNameIdentifier	 Artifact
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
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
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
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
VersionRange	TokenNameIdentifier	 Version Range
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
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
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
/** * Provides a basis for testing conflict resolvers. * * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> */	TokenNameCOMMENT_JAVADOC	 Provides a basis for testing conflict resolvers. * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractConflictResolverTest	TokenNameIdentifier	 Abstract Conflict Resolver Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
// constants -------------------------------------------------------------- 	TokenNameCOMMENT_LINE	constants -------------------------------------------------------------- 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GROUP_ID	TokenNameIdentifier	 GROUP  ID
=	TokenNameEQUAL	
"test"	TokenNameStringLiteral	test
;	TokenNameSEMICOLON	
// fields ----------------------------------------------------------------- 	TokenNameCOMMENT_LINE	fields ----------------------------------------------------------------- 
protected	TokenNameprotected	
Artifact	TokenNameIdentifier	 Artifact
a1	TokenNameIdentifier	 a1
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Artifact	TokenNameIdentifier	 Artifact
a2	TokenNameIdentifier	 a2
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Artifact	TokenNameIdentifier	 Artifact
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
roleHint	TokenNameIdentifier	 role Hint
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
artifactFactory	TokenNameIdentifier	 artifact Factory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
conflictResolver	TokenNameIdentifier	 conflict Resolver
;	TokenNameSEMICOLON	
// constructors ----------------------------------------------------------- 	TokenNameCOMMENT_LINE	constructors ----------------------------------------------------------- 
public	TokenNamepublic	
AbstractConflictResolverTest	TokenNameIdentifier	 Abstract Conflict Resolver Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
roleHint	TokenNameIdentifier	 role Hint
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
roleHint	TokenNameIdentifier	 role Hint
=	TokenNameEQUAL	
roleHint	TokenNameIdentifier	 role Hint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TestCase methods ------------------------------------------------------- 	TokenNameCOMMENT_LINE	TestCase methods ------------------------------------------------------- 
/* * @see junit.framework.TestCase#setUp() */	TokenNameCOMMENT_BLOCK	 @see junit.framework.TestCase#setUp() 
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
artifactFactory	TokenNameIdentifier	 artifact Factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
.	TokenNameDOT	
ROLE	TokenNameIdentifier	 ROLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conflictResolver	TokenNameIdentifier	 conflict Resolver
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
.	TokenNameDOT	
ROLE	TokenNameIdentifier	 ROLE
,	TokenNameCOMMA	
roleHint	TokenNameIdentifier	 role Hint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"2.0"	TokenNameStringLiteral	2.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * @see org.codehaus.plexus.PlexusTestCase#tearDown() */	TokenNameCOMMENT_BLOCK	 @see org.codehaus.plexus.PlexusTestCase#tearDown() 
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
artifactFactory	TokenNameIdentifier	 artifact Factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
conflictResolver	TokenNameIdentifier	 conflict Resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// protected methods ------------------------------------------------------ 	TokenNameCOMMENT_LINE	protected methods ------------------------------------------------------ 
protected	TokenNameprotected	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
getConflictResolver	TokenNameIdentifier	 get Conflict Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
conflictResolver	TokenNameIdentifier	 conflict Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
assertResolveConflict	TokenNameIdentifier	 assert Resolve Conflict
(	TokenNameLPAREN	
ResolutionNode	TokenNameIdentifier	 Resolution Node
expectedNode	TokenNameIdentifier	 expected Node
,	TokenNameCOMMA	
ResolutionNode	TokenNameIdentifier	 Resolution Node
actualNode1	TokenNameIdentifier	 actual Node1
,	TokenNameCOMMA	
ResolutionNode	TokenNameIdentifier	 Resolution Node
actualNode2	TokenNameIdentifier	 actual Node2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResolutionNode	TokenNameIdentifier	 Resolution Node
resolvedNode	TokenNameIdentifier	 resolved Node
=	TokenNameEQUAL	
getConflictResolver	TokenNameIdentifier	 get Conflict Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveConflict	TokenNameIdentifier	 resolve Conflict
(	TokenNameLPAREN	
actualNode1	TokenNameIdentifier	 actual Node1
,	TokenNameCOMMA	
actualNode2	TokenNameIdentifier	 actual Node2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Expected resolvable"	TokenNameStringLiteral	Expected resolvable
,	TokenNameCOMMA	
resolvedNode	TokenNameIdentifier	 resolved Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Resolution node"	TokenNameStringLiteral	Resolution node
,	TokenNameCOMMA	
expectedNode	TokenNameIdentifier	 expected Node
,	TokenNameCOMMA	
resolvedNode	TokenNameIdentifier	 resolved Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
assertUnresolvableConflict	TokenNameIdentifier	 assert Unresolvable Conflict
(	TokenNameLPAREN	
ResolutionNode	TokenNameIdentifier	 Resolution Node
actualNode1	TokenNameIdentifier	 actual Node1
,	TokenNameCOMMA	
ResolutionNode	TokenNameIdentifier	 Resolution Node
actualNode2	TokenNameIdentifier	 actual Node2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResolutionNode	TokenNameIdentifier	 Resolution Node
resolvedNode	TokenNameIdentifier	 resolved Node
=	TokenNameEQUAL	
getConflictResolver	TokenNameIdentifier	 get Conflict Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveConflict	TokenNameIdentifier	 resolve Conflict
(	TokenNameLPAREN	
actualNode1	TokenNameIdentifier	 actual Node1
,	TokenNameCOMMA	
actualNode2	TokenNameIdentifier	 actual Node2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Expected unresolvable"	TokenNameStringLiteral	Expected unresolvable
,	TokenNameCOMMA	
resolvedNode	TokenNameIdentifier	 resolved Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Artifact	TokenNameIdentifier	 Artifact
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Artifact	TokenNameIdentifier	 Artifact
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
boolean	TokenNameboolean	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Artifact	TokenNameIdentifier	 Artifact
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Artifact	TokenNameIdentifier	 Artifact
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
inheritedScope	TokenNameIdentifier	 inherited Scope
,	TokenNameCOMMA	
boolean	TokenNameboolean	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
versionRange	TokenNameIdentifier	 version Range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
artifactFactory	TokenNameIdentifier	 artifact Factory
.	TokenNameDOT	
createDependencyArtifact	TokenNameIdentifier	 create Dependency Artifact
(	TokenNameLPAREN	
GROUP_ID	TokenNameIdentifier	 GROUP  ID
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
"jar"	TokenNameStringLiteral	jar
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
inheritedScope	TokenNameIdentifier	 inherited Scope
,	TokenNameCOMMA	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
