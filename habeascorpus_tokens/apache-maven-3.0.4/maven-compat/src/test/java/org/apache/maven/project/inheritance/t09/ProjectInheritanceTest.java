package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
inheritance	TokenNameIdentifier	 inheritance
.	TokenNameDOT	
t09	TokenNameIdentifier	 t09
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
Map	TokenNameIdentifier	 Map
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
MavenProject	TokenNameIdentifier	 Maven Project
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
inheritance	TokenNameIdentifier	 inheritance
.	TokenNameDOT	
AbstractProjectInheritanceTestCase	TokenNameIdentifier	 Abstract Project Inheritance Test Case
;	TokenNameSEMICOLON	
/** * Verifies exclusions listed in dependencyManagement are valid for * transitive dependencies. * * @author <a href="mailto:pschneider@gmail.com">Patrick Schneider</a> */	TokenNameCOMMENT_JAVADOC	 Verifies exclusions listed in dependencyManagement are valid for transitive dependencies. * @author <a href="mailto:pschneider@gmail.com">Patrick Schneider</a> 
public	TokenNamepublic	
class	TokenNameclass	
ProjectInheritanceTest	TokenNameIdentifier	 Project Inheritance Test
extends	TokenNameextends	
AbstractProjectInheritanceTestCase	TokenNameIdentifier	 Abstract Project Inheritance Test Case
{	TokenNameLBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// p1 inherits from p0 	TokenNameCOMMENT_LINE	p1 inherits from p0 
// p0 inhertis from super model 	TokenNameCOMMENT_LINE	p0 inhertis from super model 
// 	TokenNameCOMMENT_LINE	 
// or we can show it graphically as: 	TokenNameCOMMENT_LINE	or we can show it graphically as: 
// 	TokenNameCOMMENT_LINE	 
// p1 ---> p0 --> super model 	TokenNameCOMMENT_LINE	p1 ---> p0 --> super model 
// 	TokenNameCOMMENT_LINE	 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
/** * How the test project is set up: * * 1. dependencyManagement lists dependencies on a & b, * with an exclusion on c in b. * 2. the child project lists a dependency on project a only * 3. a depends on b (which is transitive to the child project), * and b depends on c. * * We should see that the resulting size of collected artifacts is two: * a & b only. */	TokenNameCOMMENT_JAVADOC	 How the test project is set up: * 1. dependencyManagement lists dependencies on a & b, with an exclusion on c in b. 2. the child project lists a dependency on project a only 3. a depends on b (which is transitive to the child project), and b depends on c. * We should see that the resulting size of collected artifacts is two: a & b only. 
public	TokenNamepublic	
void	TokenNamevoid	
testDependencyManagementExclusionsExcludeTransitively	TokenNameIdentifier	 test Dependency Management Exclusions Exclude Transitively
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
localRepo	TokenNameIdentifier	 local Repo
=	TokenNameEQUAL	
getLocalRepositoryPath	TokenNameIdentifier	 get Local Repository Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom0	TokenNameIdentifier	 pom0
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localRepo	TokenNameIdentifier	 local Repo
,	TokenNameCOMMA	
"p0/pom.xml"	TokenNameStringLiteral	p0/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom0Basedir	TokenNameIdentifier	 pom0 Basedir
=	TokenNameEQUAL	
pom0	TokenNameIdentifier	 pom0
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom1	TokenNameIdentifier	 pom1
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pom0Basedir	TokenNameIdentifier	 pom0 Basedir
,	TokenNameCOMMA	
"p1/pom.xml"	TokenNameStringLiteral	p1/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// load the child project, which inherits from p0... 	TokenNameCOMMENT_LINE	load the child project, which inherits from p0... 
MavenProject	TokenNameIdentifier	 Maven Project
project0	TokenNameIdentifier	 project0
=	TokenNameEQUAL	
getProjectWithDependencies	TokenNameIdentifier	 get Project With Dependencies
(	TokenNameLPAREN	
pom0	TokenNameIdentifier	 pom0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project1	TokenNameIdentifier	 project1
=	TokenNameEQUAL	
getProjectWithDependencies	TokenNameIdentifier	 get Project With Dependencies
(	TokenNameLPAREN	
pom1	TokenNameIdentifier	 pom1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Parent is null"	TokenNameStringLiteral	Parent is null
,	TokenNameCOMMA	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
pom0Basedir	TokenNameIdentifier	 pom0 Basedir
,	TokenNameCOMMA	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getArtifactMap	TokenNameIdentifier	 get Artifact Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"No artifacts"	TokenNameStringLiteral	No artifacts
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No Artifacts"	TokenNameStringLiteral	No Artifacts
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Set size should be 2, is "	TokenNameStringLiteral	Set size should be 2, is 
+	TokenNamePLUS	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"maven-test:t09-a is not in the project"	TokenNameStringLiteral	maven-test:t09-a is not in the project
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"maven-test:t09-a"	TokenNameStringLiteral	maven-test:t09-a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"maven-test:t09-b is not in the project"	TokenNameStringLiteral	maven-test:t09-b is not in the project
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"maven-test:t09-b"	TokenNameStringLiteral	maven-test:t09-b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"maven-test:t09-c is in the project"	TokenNameStringLiteral	maven-test:t09-c is in the project
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"maven-test:t09-c"	TokenNameStringLiteral	maven-test:t09-c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Setup exactly the same as the above test, except that the child project * now depends upon d, which has a transitive dependency on c. Even though * we did list an exclusion on c, it was only from within the context of * project b. We will pick up project c in this case because no * restrictions were placed on d. This demonstrates that a, b, c, & d will * all be collected. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Setup exactly the same as the above test, except that the child project now depends upon d, which has a transitive dependency on c. Even though we did list an exclusion on c, it was only from within the context of project b. We will pick up project c in this case because no restrictions were placed on d. This demonstrates that a, b, c, & d will all be collected. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testDependencyManagementExclusionDoesNotOverrideGloballyForTransitives	TokenNameIdentifier	 test Dependency Management Exclusion Does Not Override Globally For Transitives
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
localRepo	TokenNameIdentifier	 local Repo
=	TokenNameEQUAL	
getLocalRepositoryPath	TokenNameIdentifier	 get Local Repository Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom0	TokenNameIdentifier	 pom0
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localRepo	TokenNameIdentifier	 local Repo
,	TokenNameCOMMA	
"p0/pom.xml"	TokenNameStringLiteral	p0/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom0Basedir	TokenNameIdentifier	 pom0 Basedir
=	TokenNameEQUAL	
pom0	TokenNameIdentifier	 pom0
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom2	TokenNameIdentifier	 pom2
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pom0Basedir	TokenNameIdentifier	 pom0 Basedir
,	TokenNameCOMMA	
"p2/pom.xml"	TokenNameStringLiteral	p2/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// load the child project, which inherits from p0... 	TokenNameCOMMENT_LINE	load the child project, which inherits from p0... 
MavenProject	TokenNameIdentifier	 Maven Project
project0	TokenNameIdentifier	 project0
=	TokenNameEQUAL	
getProjectWithDependencies	TokenNameIdentifier	 get Project With Dependencies
(	TokenNameLPAREN	
pom0	TokenNameIdentifier	 pom0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project2	TokenNameIdentifier	 project2
=	TokenNameEQUAL	
getProjectWithDependencies	TokenNameIdentifier	 get Project With Dependencies
(	TokenNameLPAREN	
pom2	TokenNameIdentifier	 pom2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
pom0Basedir	TokenNameIdentifier	 pom0 Basedir
,	TokenNameCOMMA	
project2	TokenNameIdentifier	 project2
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
project2	TokenNameIdentifier	 project2
.	TokenNameDOT	
getArtifactMap	TokenNameIdentifier	 get Artifact Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"No artifacts"	TokenNameStringLiteral	No artifacts
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No Artifacts"	TokenNameStringLiteral	No Artifacts
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Set size should be 4, is "	TokenNameStringLiteral	Set size should be 4, is 
+	TokenNamePLUS	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"maven-test:t09-a is not in the project"	TokenNameStringLiteral	maven-test:t09-a is not in the project
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"maven-test:t09-a"	TokenNameStringLiteral	maven-test:t09-a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"maven-test:t09-b is not in the project"	TokenNameStringLiteral	maven-test:t09-b is not in the project
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"maven-test:t09-b"	TokenNameStringLiteral	maven-test:t09-b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"maven-test:t09-c is not in the project"	TokenNameStringLiteral	maven-test:t09-c is not in the project
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"maven-test:t09-c"	TokenNameStringLiteral	maven-test:t09-c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"maven-test:t09-d is not in the project"	TokenNameStringLiteral	maven-test:t09-d is not in the project
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"maven-test:t09-d"	TokenNameStringLiteral	maven-test:t09-d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
