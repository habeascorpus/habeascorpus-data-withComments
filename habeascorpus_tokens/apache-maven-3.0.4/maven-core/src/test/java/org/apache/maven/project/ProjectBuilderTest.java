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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
AbstractCoreMavenComponentTestCase	TokenNameIdentifier	 Abstract Core Maven Component Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenSession	TokenNameIdentifier	 Maven Session
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ProjectBuilderTest	TokenNameIdentifier	 Project Builder Test
extends	TokenNameextends	
AbstractCoreMavenComponentTestCase	TokenNameIdentifier	 Abstract Core Maven Component Test Case
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getProjectsDirectory	TokenNameIdentifier	 get Projects Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"src/test/projects/project-builder"	TokenNameStringLiteral	src/test/projects/project-builder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSystemScopeDependencyIsPresentInTheCompileClasspathElements	TokenNameIdentifier	 test System Scope Dependency Is Present In The Compile Classpath Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
pom	TokenNameIdentifier	 pom
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
"it0063"	TokenNameStringLiteral	it0063
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
eps	TokenNameIdentifier	 eps
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eps	TokenNameIdentifier	 eps
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"jre.home"	TokenNameStringLiteral	jre.home
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"jdk/jre"	TokenNameStringLiteral	jdk/jre
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
createMavenSession	TokenNameIdentifier	 create Maven Session
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
eps	TokenNameIdentifier	 eps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getCurrentProject	TokenNameIdentifier	 get Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Here we will actually not have any artifacts because the ProjectDependenciesResolver is not involved here. So 	TokenNameCOMMENT_LINE	Here we will actually not have any artifacts because the ProjectDependenciesResolver is not involved here. So 
// right now it's not valid to ask for artifacts unless plugins require the artifacts. 	TokenNameCOMMENT_LINE	right now it's not valid to ask for artifacts unless plugins require the artifacts. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getCompileClasspathElements	TokenNameIdentifier	 get Compile Classpath Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
