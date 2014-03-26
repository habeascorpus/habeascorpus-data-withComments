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
t08	TokenNameIdentifier	 t08
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
/** * A test which demonstrates maven's dependency management * * @author <a href="rgoers@apache.org">Ralph Goers</a> */	TokenNameCOMMENT_JAVADOC	 A test which demonstrates maven's dependency management * @author <a href="rgoers@apache.org">Ralph Goers</a> 
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
public	TokenNamepublic	
void	TokenNamevoid	
testDependencyManagement	TokenNameIdentifier	 test Dependency Management
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
// load everything... 	TokenNameCOMMENT_LINE	load everything... 
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Project "	TokenNameStringLiteral	Project 
+	TokenNamePLUS	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
project1	TokenNameIdentifier	 project1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getArtifacts	TokenNameIdentifier	 get Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"No artifacts"	TokenNameStringLiteral	No artifacts
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No Artifacts"	TokenNameStringLiteral	No Artifacts
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Set size should be 4, is "	TokenNameStringLiteral	Set size should be 4, is 
+	TokenNamePLUS	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
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
"Artifact: "	TokenNameStringLiteral	Artifact: 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getDependencyConflictId	TokenNameIdentifier	 get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Optional="	TokenNameStringLiteral	 Optional=
+	TokenNamePLUS	
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isOptional	TokenNameIdentifier	 is Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"true"	TokenNameStringLiteral	true
:	TokenNameCOLON	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Incorrect version for "	TokenNameStringLiteral	Incorrect version for 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getDependencyConflictId	TokenNameIdentifier	 get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
