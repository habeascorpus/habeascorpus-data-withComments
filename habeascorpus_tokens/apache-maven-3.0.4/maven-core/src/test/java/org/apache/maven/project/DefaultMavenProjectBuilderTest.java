package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
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
Iterator	TokenNameIdentifier	 Iterator
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DefaultMavenProjectBuilderTest	TokenNameIdentifier	 Default Maven Project Builder Test
extends	TokenNameextends	
AbstractMavenProjectTestCase	TokenNameIdentifier	 Abstract Maven Project Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
filesToDelete	TokenNameIdentifier	 files To Delete
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
localRepoDir	TokenNameIdentifier	 local Repo Dir
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
projectBuilder	TokenNameIdentifier	 project Builder
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ProjectBuilder	TokenNameIdentifier	 Project Builder
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localRepoDir	TokenNameIdentifier	 local Repo Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.io.tmpdir"	TokenNameStringLiteral	java.io.tmpdir
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"local-repo."	TokenNameStringLiteral	local-repo.
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localRepoDir	TokenNameIdentifier	 local Repo Dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filesToDelete	TokenNameIdentifier	 files To Delete
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
localRepoDir	TokenNameIdentifier	 local Repo Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
filesToDelete	TokenNameIdentifier	 files To Delete
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
filesToDelete	TokenNameIdentifier	 files To Delete
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
deleteDirectory	TokenNameIdentifier	 delete Directory
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
boolean	TokenNameboolean	
allowStub	TokenNameIdentifier	 allow Stub
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultProjectBuildingRequest	TokenNameIdentifier	 Default Project Building Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initRepoSession	TokenNameIdentifier	 init Repo Session
(	TokenNameLPAREN	
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
projectBuilder	TokenNameIdentifier	 project Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
allowStub	TokenNameIdentifier	 allow Stub
,	TokenNameCOMMA	
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that we can build ok from the middle pom of a (parent,child,grandchild) heirarchy * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Check that we can build ok from the middle pom of a (parent,child,grandchild) heirarchy @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testBuildFromMiddlePom	TokenNameIdentifier	 test Build From Middle Pom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f1	TokenNameIdentifier	 f1
=	TokenNameEQUAL	
getTestFile	TokenNameIdentifier	 get Test File
(	TokenNameLPAREN	
"src/test/resources/projects/grandchild-check/child/pom.xml"	TokenNameStringLiteral	src/test/resources/projects/grandchild-check/child/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f2	TokenNameIdentifier	 f2
=	TokenNameEQUAL	
getTestFile	TokenNameIdentifier	 get Test File
(	TokenNameLPAREN	
"src/test/resources/projects/grandchild-check/child/grandchild/pom.xml"	TokenNameStringLiteral	src/test/resources/projects/grandchild-check/child/grandchild/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
f1	TokenNameIdentifier	 f1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// it's the building of the grandchild project, having already cached the child project 	TokenNameCOMMENT_LINE	it's the building of the grandchild project, having already cached the child project 
// (but not the parent project), which causes the problem. 	TokenNameCOMMENT_LINE	(but not the parent project), which causes the problem. 
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
f2	TokenNameIdentifier	 f2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDuplicatePluginDefinitionsMerged	TokenNameIdentifier	 test Duplicate Plugin Definitions Merged
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f1	TokenNameIdentifier	 f1
=	TokenNameEQUAL	
getTestFile	TokenNameIdentifier	 get Test File
(	TokenNameLPAREN	
"src/test/resources/projects/duplicate-plugins-merged-pom.xml"	TokenNameStringLiteral	src/test/resources/projects/duplicate-plugins-merged-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
f1	TokenNameIdentifier	 f1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBuildPlugins	TokenNameIdentifier	 get Build Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBuildPlugins	TokenNameIdentifier	 get Build Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExecutions	TokenNameIdentifier	 get Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"first"	TokenNameStringLiteral	first
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBuildPlugins	TokenNameIdentifier	 get Build Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExecutions	TokenNameIdentifier	 get Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBuildStubModelForMissingRemotePom	TokenNameIdentifier	 test Build Stub Model For Missing Remote Pom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
pom	TokenNameIdentifier	 pom
=	TokenNameEQUAL	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
createProjectArtifact	TokenNameIdentifier	 create Project Artifact
(	TokenNameLPAREN	
"org.apache.maven.its"	TokenNameStringLiteral	org.apache.maven.its
,	TokenNameCOMMA	
"missing"	TokenNameStringLiteral	missing
,	TokenNameCOMMA	
"0.1"	TokenNameStringLiteral	0.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getRemoteArtifactRepositories	TokenNameIdentifier	 get Remote Artifact Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getRemoteArtifactRepositories	TokenNameIdentifier	 get Remote Artifact Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getPluginArtifactRepositories	TokenNameIdentifier	 get Plugin Artifact Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getPluginArtifactRepositories	TokenNameIdentifier	 get Plugin Artifact Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getParentArtifact	TokenNameIdentifier	 get Parent Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
isExecutionRoot	TokenNameIdentifier	 is Execution Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
repoLayout	TokenNameIdentifier	 repo Layout
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
createArtifactRepository	TokenNameIdentifier	 create Artifact Repository
(	TokenNameLPAREN	
"local"	TokenNameStringLiteral	local
,	TokenNameCOMMA	
"file://"	TokenNameStringLiteral	file://
+	TokenNamePLUS	
localRepoDir	TokenNameIdentifier	 local Repo Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
repoLayout	TokenNameIdentifier	 repo Layout
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
xtestLoop	TokenNameIdentifier	 xtest Loop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f1	TokenNameIdentifier	 f1
=	TokenNameEQUAL	
getTestFile	TokenNameIdentifier	 get Test File
(	TokenNameLPAREN	
"src/test/resources/projects/duplicate-plugins-merged-pom.xml"	TokenNameStringLiteral	src/test/resources/projects/duplicate-plugins-merged-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
f1	TokenNameIdentifier	 f1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPartialResultUponBadDependencyDeclaration	TokenNameIdentifier	 test Partial Result Upon Bad Dependency Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
=	TokenNameEQUAL	
getTestFile	TokenNameIdentifier	 get Test File
(	TokenNameLPAREN	
"src/test/resources/projects/bad-dependency.xml"	TokenNameStringLiteral	src/test/resources/projects/bad-dependency.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
newBuildingRequest	TokenNameIdentifier	 new Building Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setProcessPlugins	TokenNameIdentifier	 set Process Plugins
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setResolveDependencies	TokenNameIdentifier	 set Resolve Dependencies
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projectBuilder	TokenNameIdentifier	 project Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
pomFile	TokenNameIdentifier	 pom File
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Project building did not fail despite invalid POM"	TokenNameStringLiteral	Project building did not fail despite invalid POM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
>	TokenNameGREATER	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getResults	TokenNameIdentifier	 get Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArtifacts	TokenNameIdentifier	 get Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getDependencyResolutionResult	TokenNameIdentifier	 get Dependency Resolution Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
