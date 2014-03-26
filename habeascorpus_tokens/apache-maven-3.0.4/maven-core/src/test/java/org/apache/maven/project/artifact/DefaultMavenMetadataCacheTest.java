package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
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
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
ExcludesArtifactFilter	TokenNameIdentifier	 Excludes Artifact Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
DefaultMavenMetadataCache	TokenNameIdentifier	 Default Maven Metadata Cache
.	TokenNameDOT	
CacheKey	TokenNameIdentifier	 Cache Key
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
DelegatingLocalArtifactRepository	TokenNameIdentifier	 Delegating Local Artifact Repository
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
RepositorySystem	TokenNameIdentifier	 Repository System
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
/** * @author Igor Fedorenko */	TokenNameCOMMENT_JAVADOC	 @author Igor Fedorenko 
public	TokenNamepublic	
class	TokenNameclass	
DefaultMavenMetadataCacheTest	TokenNameIdentifier	 Default Maven Metadata Cache Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
RepositorySystem	TokenNameIdentifier	 Repository System
repositorySystem	TokenNameIdentifier	 repository System
;	TokenNameSEMICOLON	
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
repositorySystem	TokenNameIdentifier	 repository System
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
RepositorySystem	TokenNameIdentifier	 Repository System
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
repositorySystem	TokenNameIdentifier	 repository System
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
public	TokenNamepublic	
void	TokenNamevoid	
testCacheKey	TokenNameIdentifier	 test Cache Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
"testGroup"	TokenNameStringLiteral	testGroup
,	TokenNameCOMMA	
"testArtifact"	TokenNameStringLiteral	testArtifact
,	TokenNameCOMMA	
"1.2.3"	TokenNameStringLiteral	1.2.3
,	TokenNameCOMMA	
"jar"	TokenNameStringLiteral	jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
lr1	TokenNameIdentifier	 lr1
=	TokenNameEQUAL	
new	TokenNamenew	
DelegatingLocalArtifactRepository	TokenNameIdentifier	 Delegating Local Artifact Repository
(	TokenNameLPAREN	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
createDefaultLocalRepository	TokenNameIdentifier	 create Default Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
rr1	TokenNameIdentifier	 rr1
=	TokenNameEQUAL	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
createDefaultRemoteRepository	TokenNameIdentifier	 create Default Remote Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
setDependencyFilter	TokenNameIdentifier	 set Dependency Filter
(	TokenNameLPAREN	
new	TokenNamenew	
ExcludesArtifactFilter	TokenNameIdentifier	 Excludes Artifact Filter
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
"testGroup"	TokenNameStringLiteral	testGroup
,	TokenNameCOMMA	
"testArtifact"	TokenNameStringLiteral	testArtifact
,	TokenNameCOMMA	
"1.2.3"	TokenNameStringLiteral	1.2.3
,	TokenNameCOMMA	
"jar"	TokenNameStringLiteral	jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
lr2	TokenNameIdentifier	 lr2
=	TokenNameEQUAL	
new	TokenNamenew	
DelegatingLocalArtifactRepository	TokenNameIdentifier	 Delegating Local Artifact Repository
(	TokenNameLPAREN	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
createDefaultLocalRepository	TokenNameIdentifier	 create Default Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
rr2	TokenNameIdentifier	 rr2
=	TokenNameEQUAL	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
createDefaultRemoteRepository	TokenNameIdentifier	 create Default Remote Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
setDependencyFilter	TokenNameIdentifier	 set Dependency Filter
(	TokenNameLPAREN	
new	TokenNamenew	
ExcludesArtifactFilter	TokenNameIdentifier	 Excludes Artifact Filter
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sanity checks 	TokenNameCOMMENT_LINE	sanity checks 
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
lr1	TokenNameIdentifier	 lr1
,	TokenNameCOMMA	
lr2	TokenNameIdentifier	 lr2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
rr1	TokenNameIdentifier	 rr1
,	TokenNameCOMMA	
rr2	TokenNameIdentifier	 rr2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CacheKey	TokenNameIdentifier	 Cache Key
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
new	TokenNamenew	
CacheKey	TokenNameIdentifier	 Cache Key
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
lr1	TokenNameIdentifier	 lr1
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
rr1	TokenNameIdentifier	 rr1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CacheKey	TokenNameIdentifier	 Cache Key
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
new	TokenNamenew	
CacheKey	TokenNameIdentifier	 Cache Key
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
lr2	TokenNameIdentifier	 lr2
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
rr2	TokenNameIdentifier	 rr2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
