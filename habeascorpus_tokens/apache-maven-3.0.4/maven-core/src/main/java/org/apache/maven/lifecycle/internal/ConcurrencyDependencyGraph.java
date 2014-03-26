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
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
ProjectDependencyGraph	TokenNameIdentifier	 Project Dependency Graph
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Presents a view of the Dependency Graph that is suited for concurrent building. * * @since 3.0 * @author Kristian Rosenvold * <p/> * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 Presents a view of the Dependency Graph that is suited for concurrent building. * @since 3.0 @author Kristian Rosenvold <p/> NOTE: This class is not part of any public api and can be changed or deleted without prior notice. 
public	TokenNamepublic	
class	TokenNameclass	
ConcurrencyDependencyGraph	TokenNameIdentifier	 Concurrency Dependency Graph
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ProjectBuildList	TokenNameIdentifier	 Project Build List
projectBuilds	TokenNameIdentifier	 project Builds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ProjectDependencyGraph	TokenNameIdentifier	 Project Dependency Graph
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
finishedProjects	TokenNameIdentifier	 finished Projects
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ConcurrencyDependencyGraph	TokenNameIdentifier	 Concurrency Dependency Graph
(	TokenNameLPAREN	
ProjectBuildList	TokenNameIdentifier	 Project Build List
projectBuilds	TokenNameIdentifier	 project Builds
,	TokenNameCOMMA	
ProjectDependencyGraph	TokenNameIdentifier	 Project Dependency Graph
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
=	TokenNameEQUAL	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
projectBuilds	TokenNameIdentifier	 project Builds
=	TokenNameEQUAL	
projectBuilds	TokenNameIdentifier	 project Builds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumberOfBuilds	TokenNameIdentifier	 get Number Of Builds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectBuilds	TokenNameIdentifier	 project Builds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets all the builds that have no reactor-dependencies * * @return A list of all the initial builds */	TokenNameCOMMENT_JAVADOC	 Gets all the builds that have no reactor-dependencies * @return A list of all the initial builds 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getRootSchedulableBuilds	TokenNameIdentifier	 get Root Schedulable Builds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
:	TokenNameCOLON	
projectBuilds	TokenNameIdentifier	 project Builds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
.	TokenNameDOT	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Marks the provided project as finished. Returns a list of * * @param mavenProject The project * @return The list of builds that are eligible for starting now that the provided project is done */	TokenNameCOMMENT_JAVADOC	 Marks the provided project as finished. Returns a list of * @param mavenProject The project @return The list of builds that are eligible for starting now that the provided project is done 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
markAsFinished	TokenNameIdentifier	 mark As Finished
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finishedProjects	TokenNameIdentifier	 finished Projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getSchedulableNewProcesses	TokenNameIdentifier	 get Schedulable New Processes
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getSchedulableNewProcesses	TokenNameIdentifier	 get Schedulable New Processes
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
finishedProject	TokenNameIdentifier	 finished Project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// schedule dependent projects, if all of their requirements are met 	TokenNameCOMMENT_LINE	schedule dependent projects, if all of their requirements are met 
for	TokenNamefor	
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
dependentProject	TokenNameIdentifier	 dependent Project
:	TokenNameCOLON	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
.	TokenNameDOT	
getDownstreamProjects	TokenNameIdentifier	 get Downstream Projects
(	TokenNameLPAREN	
finishedProject	TokenNameIdentifier	 finished Project
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
upstreamProjects	TokenNameIdentifier	 upstream Projects
=	TokenNameEQUAL	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
.	TokenNameDOT	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
dependentProject	TokenNameIdentifier	 dependent Project
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
finishedProjects	TokenNameIdentifier	 finished Projects
.	TokenNameDOT	
containsAll	TokenNameIdentifier	 contains All
(	TokenNameLPAREN	
upstreamProjects	TokenNameIdentifier	 upstream Projects
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dependentProject	TokenNameIdentifier	 dependent Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProjectBuildList	TokenNameIdentifier	 Project Build List
getProjectBuilds	TokenNameIdentifier	 get Project Builds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectBuilds	TokenNameIdentifier	 project Builds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
