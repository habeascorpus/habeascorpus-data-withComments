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
Iterator	TokenNameIdentifier	 Iterator
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
RepositorySystem	TokenNameIdentifier	 Repository System
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
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
DefaultArtifactDescriptorReader	TokenNameIdentifier	 Default Artifact Descriptor Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
ArtifactDescriptorReader	TokenNameIdentifier	 Artifact Descriptor Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
ArtifactResolver	TokenNameIdentifier	 Artifact Resolver
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ProjectClasspathTest	TokenNameIdentifier	 Project Classpath Test
extends	TokenNameextends	
AbstractMavenProjectTestCase	TokenNameIdentifier	 Abstract Maven Project Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
"projects/scope/"	TokenNameStringLiteral	projects/scope/
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ArtifactResolver	TokenNameIdentifier	 Artifact Resolver
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ArtifactResolver	TokenNameIdentifier	 Artifact Resolver
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"classpath"	TokenNameStringLiteral	classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultArtifactDescriptorReader	TokenNameIdentifier	 Default Artifact Descriptor Reader
pomReader	TokenNameIdentifier	 pom Reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DefaultArtifactDescriptorReader	TokenNameIdentifier	 Default Artifact Descriptor Reader
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ArtifactDescriptorReader	TokenNameIdentifier	 Artifact Descriptor Reader
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pomReader	TokenNameIdentifier	 pom Reader
.	TokenNameDOT	
setArtifactResolver	TokenNameIdentifier	 set Artifact Resolver
(	TokenNameLPAREN	
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projectBuilder	TokenNameIdentifier	 project Builder
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ProjectBuilder	TokenNameIdentifier	 Project Builder
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"classpath"	TokenNameStringLiteral	classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the metadata source looks up the default impl, so we have to trick it 	TokenNameCOMMENT_LINE	the metadata source looks up the default impl, so we have to trick it 
getContainer	TokenNameIdentifier	 get Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addComponent	TokenNameIdentifier	 add Component
(	TokenNameLPAREN	
projectBuilder	TokenNameIdentifier	 project Builder
,	TokenNameCOMMA	
ProjectBuilder	TokenNameIdentifier	 Project Builder
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
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
String	TokenNameIdentifier	 String
getCustomConfigurationName	TokenNameIdentifier	 get Custom Configuration Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testProjectClasspath	TokenNameIdentifier	 test Project Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
getFileForClasspathResource	TokenNameIdentifier	 get File For Classpath Resource
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
"project-with-scoped-dependencies.xml"	TokenNameStringLiteral	project-with-scoped-dependencies.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
getProjectWithDependencies	TokenNameIdentifier	 get Project With Dependencies
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Test project can't be null!"	TokenNameStringLiteral	Test project can't be null!
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkArtifactIdScope	TokenNameIdentifier	 check Artifact Id Scope
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"provided"	TokenNameStringLiteral	provided
,	TokenNameCOMMA	
"provided"	TokenNameStringLiteral	provided
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkArtifactIdScope	TokenNameIdentifier	 check Artifact Id Scope
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkArtifactIdScope	TokenNameIdentifier	 check Artifact Id Scope
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"compile"	TokenNameStringLiteral	compile
,	TokenNameCOMMA	
"compile"	TokenNameStringLiteral	compile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkArtifactIdScope	TokenNameIdentifier	 check Artifact Id Scope
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"runtime"	TokenNameStringLiteral	runtime
,	TokenNameCOMMA	
"runtime"	TokenNameStringLiteral	runtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkArtifactIdScope	TokenNameIdentifier	 check Artifact Id Scope
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"compile"	TokenNameStringLiteral	compile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check all transitive deps of a test dependency are test, except test and provided which is skipped 	TokenNameCOMMENT_LINE	check all transitive deps of a test dependency are test, except test and provided which is skipped 
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"maven-test-test"	TokenNameStringLiteral	maven-test-test
,	TokenNameCOMMA	
"scope-provided"	TokenNameStringLiteral	scope-provided
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Check no provided dependencies are transitive"	TokenNameStringLiteral	Check no provided dependencies are transitive
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"maven-test-test"	TokenNameStringLiteral	maven-test-test
,	TokenNameCOMMA	
"scope-test"	TokenNameStringLiteral	scope-test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Check no test dependencies are transitive"	TokenNameStringLiteral	Check no test dependencies are transitive
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"maven-test-test"	TokenNameStringLiteral	maven-test-test
,	TokenNameCOMMA	
"scope-compile"	TokenNameStringLiteral	scope-compile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"a = "	TokenNameStringLiteral	a = 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"b = "	TokenNameStringLiteral	b = 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Check scope"	TokenNameStringLiteral	Check scope
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"maven-test-test"	TokenNameStringLiteral	maven-test-test
,	TokenNameCOMMA	
"scope-default"	TokenNameStringLiteral	scope-default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Check scope"	TokenNameStringLiteral	Check scope
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"maven-test-test"	TokenNameStringLiteral	maven-test-test
,	TokenNameCOMMA	
"scope-runtime"	TokenNameStringLiteral	scope-runtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Check scope"	TokenNameStringLiteral	Check scope
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check all transitive deps of a provided dependency are provided scope, except for test 	TokenNameCOMMENT_LINE	check all transitive deps of a provided dependency are provided scope, except for test 
checkGroupIdScope	TokenNameIdentifier	 check Group Id Scope
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"provided"	TokenNameStringLiteral	provided
,	TokenNameCOMMA	
"maven-test-provided"	TokenNameStringLiteral	maven-test-provided
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"maven-test-provided"	TokenNameStringLiteral	maven-test-provided
,	TokenNameCOMMA	
"scope-runtime"	TokenNameStringLiteral	scope-runtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Check scope"	TokenNameStringLiteral	Check scope
,	TokenNameCOMMA	
"provided"	TokenNameStringLiteral	provided
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check all transitive deps of a runtime dependency are runtime scope, except for test 	TokenNameCOMMENT_LINE	check all transitive deps of a runtime dependency are runtime scope, except for test 
checkGroupIdScope	TokenNameIdentifier	 check Group Id Scope
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"runtime"	TokenNameStringLiteral	runtime
,	TokenNameCOMMA	
"maven-test-runtime"	TokenNameStringLiteral	maven-test-runtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"maven-test-runtime"	TokenNameStringLiteral	maven-test-runtime
,	TokenNameCOMMA	
"scope-runtime"	TokenNameStringLiteral	scope-runtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Check scope"	TokenNameStringLiteral	Check scope
,	TokenNameCOMMA	
"runtime"	TokenNameStringLiteral	runtime
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check all transitive deps of a compile dependency are compile scope, except for runtime and test 	TokenNameCOMMENT_LINE	check all transitive deps of a compile dependency are compile scope, except for runtime and test 
checkGroupIdScope	TokenNameIdentifier	 check Group Id Scope
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"compile"	TokenNameStringLiteral	compile
,	TokenNameCOMMA	
"maven-test-compile"	TokenNameStringLiteral	maven-test-compile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"maven-test-compile"	TokenNameStringLiteral	maven-test-compile
,	TokenNameCOMMA	
"scope-runtime"	TokenNameStringLiteral	scope-runtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Check scope"	TokenNameStringLiteral	Check scope
,	TokenNameCOMMA	
"runtime"	TokenNameStringLiteral	runtime
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check all transitive deps of a default dependency are compile scope, except for runtime and test 	TokenNameCOMMENT_LINE	check all transitive deps of a default dependency are compile scope, except for runtime and test 
checkGroupIdScope	TokenNameIdentifier	 check Group Id Scope
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"compile"	TokenNameStringLiteral	compile
,	TokenNameCOMMA	
"maven-test-default"	TokenNameStringLiteral	maven-test-default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"maven-test-default"	TokenNameStringLiteral	maven-test-default
,	TokenNameCOMMA	
"scope-runtime"	TokenNameStringLiteral	scope-runtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Check scope"	TokenNameStringLiteral	Check scope
,	TokenNameCOMMA	
"runtime"	TokenNameStringLiteral	runtime
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkGroupIdScope	TokenNameIdentifier	 check Group Id Scope
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scopeValue	TokenNameIdentifier	 scope Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
"scope-compile"	TokenNameStringLiteral	scope-compile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Check scope"	TokenNameStringLiteral	Check scope
,	TokenNameCOMMA	
scopeValue	TokenNameIdentifier	 scope Value
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
"scope-test"	TokenNameStringLiteral	scope-test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Check test dependency is not transitive"	TokenNameStringLiteral	Check test dependency is not transitive
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
"scope-provided"	TokenNameStringLiteral	scope-provided
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Check provided dependency is not transitive"	TokenNameStringLiteral	Check provided dependency is not transitive
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
"scope-default"	TokenNameStringLiteral	scope-default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Check scope"	TokenNameStringLiteral	Check scope
,	TokenNameCOMMA	
scopeValue	TokenNameIdentifier	 scope Value
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkArtifactIdScope	TokenNameIdentifier	 check Artifact Id Scope
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scopeValue	TokenNameIdentifier	 scope Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
"scope-"	TokenNameStringLiteral	scope-
+	TokenNamePLUS	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"maven-test"	TokenNameStringLiteral	maven-test
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Check scope"	TokenNameStringLiteral	Check scope
,	TokenNameCOMMA	
scopeValue	TokenNameIdentifier	 scope Value
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Artifact	TokenNameIdentifier	 Artifact
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"[ Looking for "	TokenNameStringLiteral	[ Looking for 
+	TokenNamePLUS	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
" ]"	TokenNameStringLiteral	 ]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifacts	TokenNameIdentifier	 get Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"RETURN"	TokenNameStringLiteral	RETURN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Return null"	TokenNameStringLiteral	Return null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
