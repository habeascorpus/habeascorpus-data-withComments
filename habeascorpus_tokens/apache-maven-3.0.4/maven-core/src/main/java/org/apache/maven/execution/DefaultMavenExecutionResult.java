package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
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
Collections	TokenNameIdentifier	 Collections
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
CopyOnWriteArrayList	TokenNameIdentifier	 Copy On Write Array List
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
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
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
/** @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
public	TokenNamepublic	
class	TokenNameclass	
DefaultMavenExecutionResult	TokenNameIdentifier	 Default Maven Execution Result
implements	TokenNameimplements	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
{	TokenNameLBRACE	
private	TokenNameprivate	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
topologicallySortedProjects	TokenNameIdentifier	 topologically Sorted Projects
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
dependencyResolutionResult	TokenNameIdentifier	 dependency Resolution Result
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Throwable	TokenNameIdentifier	 Throwable
>	TokenNameGREATER	
exceptions	TokenNameIdentifier	 exceptions
=	TokenNameEQUAL	
new	TokenNamenew	
CopyOnWriteArrayList	TokenNameIdentifier	 Copy On Write Array List
<	TokenNameLESS	
Throwable	TokenNameIdentifier	 Throwable
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
,	TokenNameCOMMA	
BuildSummary	TokenNameIdentifier	 Build Summary
>	TokenNameGREATER	
buildSummaries	TokenNameIdentifier	 build Summaries
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
setTopologicallySortedProjects	TokenNameIdentifier	 set Topologically Sorted Projects
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
topologicallySortedProjects	TokenNameIdentifier	 topologically Sorted Projects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
topologicallySortedProjects	TokenNameIdentifier	 topologically Sorted Projects
=	TokenNameEQUAL	
topologicallySortedProjects	TokenNameIdentifier	 topologically Sorted Projects
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getTopologicallySortedProjects	TokenNameIdentifier	 get Topologically Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
topologicallySortedProjects	TokenNameIdentifier	 topologically Sorted Projects
?	TokenNameQUESTION	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
topologicallySortedProjects	TokenNameIdentifier	 topologically Sorted Projects
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
getDependencyResolutionResult	TokenNameIdentifier	 get Dependency Resolution Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dependencyResolutionResult	TokenNameIdentifier	 dependency Resolution Result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
setDependencyResolutionResult	TokenNameIdentifier	 set Dependency Resolution Result
(	TokenNameLPAREN	
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
dependencyResolutionResult	TokenNameIdentifier	 dependency Resolution Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dependencyResolutionResult	TokenNameIdentifier	 dependency Resolution Result
=	TokenNameEQUAL	
dependencyResolutionResult	TokenNameIdentifier	 dependency Resolution Result
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Throwable	TokenNameIdentifier	 Throwable
>	TokenNameGREATER	
getExceptions	TokenNameIdentifier	 get Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exceptions	TokenNameIdentifier	 exceptions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Throwable	TokenNameIdentifier	 Throwable
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
exceptions	TokenNameIdentifier	 exceptions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
addException	TokenNameIdentifier	 add Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasExceptions	TokenNameIdentifier	 has Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
getExceptions	TokenNameIdentifier	 get Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BuildSummary	TokenNameIdentifier	 Build Summary
getBuildSummary	TokenNameIdentifier	 get Build Summary
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
buildSummaries	TokenNameIdentifier	 build Summaries
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
buildSummaries	TokenNameIdentifier	 build Summaries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addBuildSummary	TokenNameIdentifier	 add Build Summary
(	TokenNameLPAREN	
BuildSummary	TokenNameIdentifier	 Build Summary
summary	TokenNameIdentifier	 summary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buildSummaries	TokenNameIdentifier	 build Summaries
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildSummaries	TokenNameIdentifier	 build Summaries
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
,	TokenNameCOMMA	
BuildSummary	TokenNameIdentifier	 Build Summary
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buildSummaries	TokenNameIdentifier	 build Summaries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
summary	TokenNameIdentifier	 summary
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
summary	TokenNameIdentifier	 summary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
