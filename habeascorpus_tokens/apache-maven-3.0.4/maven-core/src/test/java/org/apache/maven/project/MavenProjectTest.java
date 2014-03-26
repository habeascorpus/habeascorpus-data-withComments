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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
DependencyManagement	TokenNameIdentifier	 Dependency Management
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Parent	TokenNameIdentifier	 Parent
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MavenProjectTest	TokenNameIdentifier	 Maven Project Test
extends	TokenNameextends	
AbstractMavenProjectTestCase	TokenNameIdentifier	 Abstract Maven Project Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldInterpretChildPathAdjustmentBasedOnModulePaths	TokenNameIdentifier	 test Should Interpret Child Path Adjustment Based On Module Paths
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Model	TokenNameIdentifier	 Model
parentModel	TokenNameIdentifier	 parent Model
=	TokenNameEQUAL	
new	TokenNamenew	
Model	TokenNameIdentifier	 Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parentModel	TokenNameIdentifier	 parent Model
.	TokenNameDOT	
addModule	TokenNameIdentifier	 add Module
(	TokenNameLPAREN	
"../child"	TokenNameStringLiteral	../child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
parentProject	TokenNameIdentifier	 parent Project
=	TokenNameEQUAL	
new	TokenNamenew	
MavenProject	TokenNameIdentifier	 Maven Project
(	TokenNameLPAREN	
parentModel	TokenNameIdentifier	 parent Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Model	TokenNameIdentifier	 Model
childModel	TokenNameIdentifier	 child Model
=	TokenNameEQUAL	
new	TokenNamenew	
Model	TokenNameIdentifier	 Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childModel	TokenNameIdentifier	 child Model
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
"artifact"	TokenNameStringLiteral	artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
childProject	TokenNameIdentifier	 child Project
=	TokenNameEQUAL	
new	TokenNamenew	
MavenProject	TokenNameIdentifier	 Maven Project
(	TokenNameLPAREN	
childModel	TokenNameIdentifier	 child Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
childFile	TokenNameIdentifier	 child File
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
"maven-project-tests"	TokenNameStringLiteral	maven-project-tests
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/child/pom.xml"	TokenNameStringLiteral	/child/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childProject	TokenNameIdentifier	 child Project
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
childFile	TokenNameIdentifier	 child File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
adjustment	TokenNameIdentifier	 adjustment
=	TokenNameEQUAL	
parentProject	TokenNameIdentifier	 parent Project
.	TokenNameDOT	
getModulePathAdjustment	TokenNameIdentifier	 get Module Path Adjustment
(	TokenNameLPAREN	
childProject	TokenNameIdentifier	 child Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
adjustment	TokenNameIdentifier	 adjustment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
".."	TokenNameStringLiteral	..
,	TokenNameCOMMA	
adjustment	TokenNameIdentifier	 adjustment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIdentityProtoInheritance	TokenNameIdentifier	 test Identity Proto Inheritance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parent	TokenNameIdentifier	 Parent
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
new	TokenNamenew	
Parent	TokenNameIdentifier	 Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
"test-group"	TokenNameStringLiteral	test-group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
"1000"	TokenNameStringLiteral	1000
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
"test-artifact"	TokenNameStringLiteral	test-artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
new	TokenNamenew	
Model	TokenNameIdentifier	 Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
"real-artifact"	TokenNameStringLiteral	real-artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
MavenProject	TokenNameIdentifier	 Maven Project
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"groupId proto-inheritance failed."	TokenNameStringLiteral	groupId proto-inheritance failed.
,	TokenNameCOMMA	
"test-group"	TokenNameStringLiteral	test-group
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"artifactId is masked."	TokenNameStringLiteral	artifactId is masked.
,	TokenNameCOMMA	
"real-artifact"	TokenNameStringLiteral	real-artifact
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"version proto-inheritance failed."	TokenNameStringLiteral	version proto-inheritance failed.
,	TokenNameCOMMA	
"1000"	TokenNameStringLiteral	1000
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// draw the NPE. 	TokenNameCOMMENT_LINE	draw the NPE. 
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyConstructor	TokenNameIdentifier	 test Empty Constructor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
MavenProject	TokenNameIdentifier	 Maven Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
.	TokenNameDOT	
EMPTY_PROJECT_GROUP_ID	TokenNameIdentifier	 EMPTY  PROJECT  GROUP  ID
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
MavenProject	TokenNameIdentifier	 Maven Project
.	TokenNameDOT	
EMPTY_PROJECT_ARTIFACT_ID	TokenNameIdentifier	 EMPTY  PROJECT  ARTIFACT  ID
+	TokenNamePLUS	
":jar:"	TokenNameStringLiteral	:jar:
+	TokenNamePLUS	
MavenProject	TokenNameIdentifier	 Maven Project
.	TokenNameDOT	
EMPTY_PROJECT_VERSION	TokenNameIdentifier	 EMPTY  PROJECT  VERSION
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testClone	TokenNameIdentifier	 test Clone
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
"canonical-pom.xml"	TokenNameStringLiteral	canonical-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
projectToClone	TokenNameIdentifier	 project To Clone
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
clonedProject	TokenNameIdentifier	 cloned Project
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
)	TokenNameRPAREN	
projectToClone	TokenNameIdentifier	 project To Clone
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"maven-core"	TokenNameStringLiteral	maven-core
,	TokenNameCOMMA	
clonedProject	TokenNameIdentifier	 cloned Project
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
?	TokenNameQUESTION	
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
clonedMap	TokenNameIdentifier	 cloned Map
=	TokenNameEQUAL	
clonedProject	TokenNameIdentifier	 cloned Project
.	TokenNameDOT	
getManagedVersionMap	TokenNameIdentifier	 get Managed Version Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"ManagedVersionMap not copied"	TokenNameStringLiteral	ManagedVersionMap not copied
,	TokenNameCOMMA	
clonedMap	TokenNameIdentifier	 cloned Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"ManagedVersionMap is not empty"	TokenNameStringLiteral	ManagedVersionMap is not empty
,	TokenNameCOMMA	
clonedMap	TokenNameIdentifier	 cloned Map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCloneWithDependencyManagement	TokenNameIdentifier	 test Clone With Dependency Management
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
"dependencyManagement-pom.xml"	TokenNameStringLiteral	dependencyManagement-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
projectToClone	TokenNameIdentifier	 project To Clone
=	TokenNameEQUAL	
getProjectWithDependencies	TokenNameIdentifier	 get Project With Dependencies
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DependencyManagement	TokenNameIdentifier	 Dependency Management
dep	TokenNameIdentifier	 dep
=	TokenNameEQUAL	
projectToClone	TokenNameIdentifier	 project To Clone
.	TokenNameDOT	
getDependencyManagement	TokenNameIdentifier	 get Dependency Management
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"No dependencyManagement"	TokenNameStringLiteral	No dependencyManagement
,	TokenNameCOMMA	
dep	TokenNameIdentifier	 dep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
dep	TokenNameIdentifier	 dep
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"No dependencies"	TokenNameStringLiteral	No dependencies
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Empty dependency list"	TokenNameStringLiteral	Empty dependency list
,	TokenNameCOMMA	
!	TokenNameNOT	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
?	TokenNameQUESTION	
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
projectToClone	TokenNameIdentifier	 project To Clone
.	TokenNameDOT	
getManagedVersionMap	TokenNameIdentifier	 get Managed Version Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"No ManagedVersionMap"	TokenNameStringLiteral	No ManagedVersionMap
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"ManagedVersionMap is empty"	TokenNameStringLiteral	ManagedVersionMap is empty
,	TokenNameCOMMA	
!	TokenNameNOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
clonedProject	TokenNameIdentifier	 cloned Project
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
)	TokenNameRPAREN	
projectToClone	TokenNameIdentifier	 project To Clone
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"maven-core"	TokenNameStringLiteral	maven-core
,	TokenNameCOMMA	
clonedProject	TokenNameIdentifier	 cloned Project
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
?	TokenNameQUESTION	
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
clonedMap	TokenNameIdentifier	 cloned Map
=	TokenNameEQUAL	
clonedProject	TokenNameIdentifier	 cloned Project
.	TokenNameDOT	
getManagedVersionMap	TokenNameIdentifier	 get Managed Version Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"ManagedVersionMap not copied"	TokenNameStringLiteral	ManagedVersionMap not copied
,	TokenNameCOMMA	
clonedMap	TokenNameIdentifier	 cloned Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"ManagedVersionMap is empty"	TokenNameStringLiteral	ManagedVersionMap is empty
,	TokenNameCOMMA	
!	TokenNameNOT	
clonedMap	TokenNameIdentifier	 cloned Map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"ManagedVersionMap does not contain test key"	TokenNameStringLiteral	ManagedVersionMap does not contain test key
,	TokenNameCOMMA	
clonedMap	TokenNameIdentifier	 cloned Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"maven-test:maven-test-b:jar"	TokenNameStringLiteral	maven-test:maven-test-b:jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetModulePathAdjustment	TokenNameIdentifier	 test Get Module Path Adjustment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Model	TokenNameIdentifier	 Model
moduleModel	TokenNameIdentifier	 module Model
=	TokenNameEQUAL	
new	TokenNamenew	
Model	TokenNameIdentifier	 Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
module	TokenNameIdentifier	 module
=	TokenNameEQUAL	
new	TokenNamenew	
MavenProject	TokenNameIdentifier	 Maven Project
(	TokenNameLPAREN	
moduleModel	TokenNameIdentifier	 module Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
module	TokenNameIdentifier	 module
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"module-dir/pom.xml"	TokenNameStringLiteral	module-dir/pom.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Model	TokenNameIdentifier	 Model
parentModel	TokenNameIdentifier	 parent Model
=	TokenNameEQUAL	
new	TokenNamenew	
Model	TokenNameIdentifier	 Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parentModel	TokenNameIdentifier	 parent Model
.	TokenNameDOT	
addModule	TokenNameIdentifier	 add Module
(	TokenNameLPAREN	
"../module-dir"	TokenNameStringLiteral	../module-dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
new	TokenNamenew	
MavenProject	TokenNameIdentifier	 Maven Project
(	TokenNameLPAREN	
parentModel	TokenNameIdentifier	 parent Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"parent-dir/pom.xml"	TokenNameStringLiteral	parent-dir/pom.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pathAdjustment	TokenNameIdentifier	 path Adjustment
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getModulePathAdjustment	TokenNameIdentifier	 get Module Path Adjustment
(	TokenNameLPAREN	
module	TokenNameIdentifier	 module
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
".."	TokenNameStringLiteral	..
,	TokenNameCOMMA	
pathAdjustment	TokenNameIdentifier	 path Adjustment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCloneWithDistributionManagement	TokenNameIdentifier	 test Clone With Distribution Management
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
"distributionManagement-pom.xml"	TokenNameStringLiteral	distributionManagement-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
projectToClone	TokenNameIdentifier	 project To Clone
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
clonedProject	TokenNameIdentifier	 cloned Project
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
)	TokenNameRPAREN	
projectToClone	TokenNameIdentifier	 project To Clone
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"clonedProject - distributionManagement"	TokenNameStringLiteral	clonedProject - distributionManagement
,	TokenNameCOMMA	
clonedProject	TokenNameIdentifier	 cloned Project
.	TokenNameDOT	
getDistributionManagementArtifactRepository	TokenNameIdentifier	 get Distribution Management Artifact Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCloneWithActiveProfile	TokenNameIdentifier	 test Clone With Active Profile
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
"withActiveByDefaultProfile-pom.xml"	TokenNameStringLiteral	withActiveByDefaultProfile-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
projectToClone	TokenNameIdentifier	 project To Clone
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
activeProfilesOrig	TokenNameIdentifier	 active Profiles Orig
=	TokenNameEQUAL	
projectToClone	TokenNameIdentifier	 project To Clone
.	TokenNameDOT	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Expecting 1 active profile"	TokenNameStringLiteral	Expecting 1 active profile
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
activeProfilesOrig	TokenNameIdentifier	 active Profiles Orig
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
clonedProject	TokenNameIdentifier	 cloned Project
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
)	TokenNameRPAREN	
projectToClone	TokenNameIdentifier	 project To Clone
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
activeProfilesClone	TokenNameIdentifier	 active Profiles Clone
=	TokenNameEQUAL	
clonedProject	TokenNameIdentifier	 cloned Project
.	TokenNameDOT	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Expecting 1 active profile"	TokenNameStringLiteral	Expecting 1 active profile
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
activeProfilesClone	TokenNameIdentifier	 active Profiles Clone
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
"The list of active profiles should have been cloned too but is same"	TokenNameStringLiteral	The list of active profiles should have been cloned too but is same
,	TokenNameCOMMA	
activeProfilesOrig	TokenNameIdentifier	 active Profiles Orig
,	TokenNameCOMMA	
activeProfilesClone	TokenNameIdentifier	 active Profiles Clone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
