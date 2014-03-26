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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
/** * Contains status information that is global to an entire reactor build. * * @since 3.0 * @author <a href="mailto:kristian.rosenvold@gmail.com">Kristian Rosenvold</a> */	TokenNameCOMMENT_JAVADOC	 Contains status information that is global to an entire reactor build. * @since 3.0 @author <a href="mailto:kristian.rosenvold@gmail.com">Kristian Rosenvold</a> 
public	TokenNamepublic	
class	TokenNameclass	
ReactorBuildStatus	TokenNameIdentifier	 Reactor Build Status
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ProjectDependencyGraph	TokenNameIdentifier	 Project Dependency Graph
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
blackListedProjects	TokenNameIdentifier	 black Listed Projects
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
halted	TokenNameIdentifier	 halted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ReactorBuildStatus	TokenNameIdentifier	 Reactor Build Status
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isBlackListed	TokenNameIdentifier	 is Black Listed
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
blackListedProjects	TokenNameIdentifier	 black Listed Projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
BuilderCommon	TokenNameIdentifier	 Builder Common
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
blackList	TokenNameIdentifier	 black List
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
blackListedProjects	TokenNameIdentifier	 black Listed Projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BuilderCommon	TokenNameIdentifier	 Builder Common
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
downstreamProject	TokenNameIdentifier	 downstream Project
:	TokenNameCOLON	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
.	TokenNameDOT	
getDownstreamProjects	TokenNameIdentifier	 get Downstream Projects
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blackListedProjects	TokenNameIdentifier	 black Listed Projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BuilderCommon	TokenNameIdentifier	 Builder Common
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
downstreamProject	TokenNameIdentifier	 downstream Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
halt	TokenNameIdentifier	 halt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
halted	TokenNameIdentifier	 halted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isHalted	TokenNameIdentifier	 is Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
halted	TokenNameIdentifier	 halted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isHaltedOrBlacklisted	TokenNameIdentifier	 is Halted Or Blacklisted
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isBlackListed	TokenNameIdentifier	 is Black Listed
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isHalted	TokenNameIdentifier	 is Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
