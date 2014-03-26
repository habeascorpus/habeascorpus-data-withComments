package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
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
/** * Provides a sub view of another dependency graph. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Provides a sub view of another dependency graph. * @author Benjamin Bentmann 
class	TokenNameclass	
FilteredProjectDependencyGraph	TokenNameIdentifier	 Filtered Project Dependency Graph
implements	TokenNameimplements	
ProjectDependencyGraph	TokenNameIdentifier	 Project Dependency Graph
{	TokenNameLBRACE	
private	TokenNameprivate	
ProjectDependencyGraph	TokenNameIdentifier	 Project Dependency Graph
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
whiteList	TokenNameIdentifier	 white List
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
sortedProjects	TokenNameIdentifier	 sorted Projects
;	TokenNameSEMICOLON	
/** * Creates a new project dependency graph from the specified graph. * * @param projectDependencyGraph The project dependency graph to create a sub view from, must not be {@code null}. * @param whiteList The projects on which the dependency view should focus, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new project dependency graph from the specified graph. * @param projectDependencyGraph The project dependency graph to create a sub view from, must not be {@code null}. @param whiteList The projects on which the dependency view should focus, must not be {@code null}. 
public	TokenNamepublic	
FilteredProjectDependencyGraph	TokenNameIdentifier	 Filtered Project Dependency Graph
(	TokenNameLPAREN	
ProjectDependencyGraph	TokenNameIdentifier	 Project Dependency Graph
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
whiteList	TokenNameIdentifier	 white List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"project dependency graph missing"	TokenNameStringLiteral	project dependency graph missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
=	TokenNameEQUAL	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
whiteList	TokenNameIdentifier	 white List
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
:	TokenNameCOLON	
whiteList	TokenNameIdentifier	 white List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
whiteList	TokenNameIdentifier	 white List
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sortedProjects	TokenNameIdentifier	 sorted Projects
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortedProjects	TokenNameIdentifier	 sorted Projects
=	TokenNameEQUAL	
applyFilter	TokenNameIdentifier	 apply Filter
(	TokenNameLPAREN	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
.	TokenNameDOT	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
sortedProjects	TokenNameIdentifier	 sorted Projects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getDownstreamProjects	TokenNameIdentifier	 get Downstream Projects
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
boolean	TokenNameboolean	
transitive	TokenNameIdentifier	 transitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
applyFilter	TokenNameIdentifier	 apply Filter
(	TokenNameLPAREN	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
.	TokenNameDOT	
getDownstreamProjects	TokenNameIdentifier	 get Downstream Projects
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
transitive	TokenNameIdentifier	 transitive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
boolean	TokenNameboolean	
transitive	TokenNameIdentifier	 transitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
applyFilter	TokenNameIdentifier	 apply Filter
(	TokenNameLPAREN	
projectDependencyGraph	TokenNameIdentifier	 project Dependency Graph
.	TokenNameDOT	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
transitive	TokenNameIdentifier	 transitive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
applyFilter	TokenNameIdentifier	 apply Filter
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
filtered	TokenNameIdentifier	 filtered
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
:	TokenNameCOLON	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
whiteList	TokenNameIdentifier	 white List
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filtered	TokenNameIdentifier	 filtered
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
filtered	TokenNameIdentifier	 filtered
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
