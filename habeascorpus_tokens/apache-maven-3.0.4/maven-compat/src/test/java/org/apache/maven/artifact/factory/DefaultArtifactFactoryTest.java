package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
VersionRange	TokenNameIdentifier	 Version Range
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
public	TokenNamepublic	
class	TokenNameclass	
DefaultArtifactFactoryTest	TokenNameIdentifier	 Default Artifact Factory Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPropagationOfSystemScopeRegardlessOfInheritedScope	TokenNameIdentifier	 test Propagation Of System Scope Regardless Of Inherited Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
factory	TokenNameIdentifier	 factory
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
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createDependencyArtifact	TokenNameIdentifier	 create Dependency Artifact
(	TokenNameLPAREN	
"test-grp"	TokenNameStringLiteral	test-grp
,	TokenNameCOMMA	
"test-artifact"	TokenNameStringLiteral	test-artifact
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"system"	TokenNameStringLiteral	system
,	TokenNameCOMMA	
"provided"	TokenNameStringLiteral	provided
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
artifact2	TokenNameIdentifier	 artifact2
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createDependencyArtifact	TokenNameIdentifier	 create Dependency Artifact
(	TokenNameLPAREN	
"test-grp"	TokenNameStringLiteral	test-grp
,	TokenNameCOMMA	
"test-artifact-2"	TokenNameStringLiteral	test-artifact-2
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"system"	TokenNameStringLiteral	system
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
artifact3	TokenNameIdentifier	 artifact3
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createDependencyArtifact	TokenNameIdentifier	 create Dependency Artifact
(	TokenNameLPAREN	
"test-grp"	TokenNameStringLiteral	test-grp
,	TokenNameCOMMA	
"test-artifact-3"	TokenNameStringLiteral	test-artifact-3
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"system"	TokenNameStringLiteral	system
,	TokenNameCOMMA	
"runtime"	TokenNameStringLiteral	runtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
artifact4	TokenNameIdentifier	 artifact4
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createDependencyArtifact	TokenNameIdentifier	 create Dependency Artifact
(	TokenNameLPAREN	
"test-grp"	TokenNameStringLiteral	test-grp
,	TokenNameCOMMA	
"test-artifact-4"	TokenNameStringLiteral	test-artifact-4
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"system"	TokenNameStringLiteral	system
,	TokenNameCOMMA	
"compile"	TokenNameStringLiteral	compile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this one should never happen in practice... 	TokenNameCOMMENT_LINE	this one should never happen in practice... 
Artifact	TokenNameIdentifier	 Artifact
artifact5	TokenNameIdentifier	 artifact5
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createDependencyArtifact	TokenNameIdentifier	 create Dependency Artifact
(	TokenNameLPAREN	
"test-grp"	TokenNameStringLiteral	test-grp
,	TokenNameCOMMA	
"test-artifact-5"	TokenNameStringLiteral	test-artifact-5
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"system"	TokenNameStringLiteral	system
,	TokenNameCOMMA	
"system"	TokenNameStringLiteral	system
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"system"	TokenNameStringLiteral	system
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"system"	TokenNameStringLiteral	system
,	TokenNameCOMMA	
artifact2	TokenNameIdentifier	 artifact2
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"system"	TokenNameStringLiteral	system
,	TokenNameCOMMA	
artifact3	TokenNameIdentifier	 artifact3
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"system"	TokenNameStringLiteral	system
,	TokenNameCOMMA	
artifact4	TokenNameIdentifier	 artifact4
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"system"	TokenNameStringLiteral	system
,	TokenNameCOMMA	
artifact5	TokenNameIdentifier	 artifact5
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
