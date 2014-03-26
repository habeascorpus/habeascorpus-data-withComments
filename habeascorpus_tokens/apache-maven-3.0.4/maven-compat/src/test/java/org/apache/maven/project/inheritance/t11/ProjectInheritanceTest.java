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
t11	TokenNameIdentifier	 t11
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
/** * Verifies scope of root project is preserved regardless of parent depenedency management. * * @author <a href="mailto:pschneider@gmail.com">Patrick Schneider</a> * @see <a href="http://jira.codehaus.org/browse/MNG-2919">MNG-2919</a> */	TokenNameCOMMENT_JAVADOC	 Verifies scope of root project is preserved regardless of parent depenedency management. * @author <a href="mailto:pschneider@gmail.com">Patrick Schneider</a> @see <a href="http://jira.codehaus.org/browse/MNG-2919">MNG-2919</a> 
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
testDependencyManagementDoesNotOverrideScopeOfCurrentArtifact	TokenNameIdentifier	 test Dependency Management Does Not Override Scope Of Current Artifact
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
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"dependencyManagement has overwritten the scope of the currently building child project"	TokenNameStringLiteral	dependencyManagement has overwritten the scope of the currently building child project
,	TokenNameCOMMA	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
