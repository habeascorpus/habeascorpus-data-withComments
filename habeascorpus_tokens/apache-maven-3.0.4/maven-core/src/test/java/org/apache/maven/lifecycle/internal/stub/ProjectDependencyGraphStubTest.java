/* * Licensed to the Apache Software Foundation (ASF) under one or more contributor license * agreements. See the NOTICE file distributed with this work for additional information regarding * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. You may obtain a * copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Tests the stub. Yeah, I know. * * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 Tests the stub. Yeah, I know. * @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
ProjectDependencyGraphStubTest	TokenNameIdentifier	 Project Dependency Graph Stub Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testADependencies	TokenNameIdentifier	 test A Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
stub	TokenNameIdentifier	 stub
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
mavenProjects	TokenNameIdentifier	 maven Projects
=	TokenNameEQUAL	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mavenProjects	TokenNameIdentifier	 maven Projects
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBDepenencies	TokenNameIdentifier	 test B Depenencies
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
stub	TokenNameIdentifier	 stub
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
bProjects	TokenNameIdentifier	 b Projects
=	TokenNameEQUAL	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
B	TokenNameIdentifier	 B
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bProjects	TokenNameIdentifier	 b Projects
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
bProjects	TokenNameIdentifier	 b Projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCDepenencies	TokenNameIdentifier	 test C Depenencies
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
stub	TokenNameIdentifier	 stub
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
cProjects	TokenNameIdentifier	 c Projects
=	TokenNameEQUAL	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
C	TokenNameIdentifier	 C
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cProjects	TokenNameIdentifier	 c Projects
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
cProjects	TokenNameIdentifier	 c Projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
C	TokenNameIdentifier	 C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testXDepenencies	TokenNameIdentifier	 test X Depenencies
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
stub	TokenNameIdentifier	 stub
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
cProjects	TokenNameIdentifier	 c Projects
=	TokenNameEQUAL	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
X	TokenNameIdentifier	 X
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cProjects	TokenNameIdentifier	 c Projects
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
cProjects	TokenNameIdentifier	 c Projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
C	TokenNameIdentifier	 C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
cProjects	TokenNameIdentifier	 c Projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
B	TokenNameIdentifier	 B
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
