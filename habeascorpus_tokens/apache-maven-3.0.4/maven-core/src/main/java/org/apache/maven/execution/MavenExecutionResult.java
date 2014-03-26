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
List	TokenNameIdentifier	 List
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
/** * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
public	TokenNamepublic	
interface	TokenNameinterface	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
{	TokenNameLBRACE	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
setTopologicallySortedProjects	TokenNameIdentifier	 set Topologically Sorted Projects
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the sorted list, or an empty list if there are no projects. */	TokenNameCOMMENT_JAVADOC	 @return the sorted list, or an empty list if there are no projects. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getTopologicallySortedProjects	TokenNameIdentifier	 get Topologically Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
setDependencyResolutionResult	TokenNameIdentifier	 set Dependency Resolution Result
(	TokenNameLPAREN	
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
getDependencyResolutionResult	TokenNameIdentifier	 get Dependency Resolution Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for each exception 	TokenNameCOMMENT_LINE	for each exception 
// - knowing what artifacts are missing 	TokenNameCOMMENT_LINE	- knowing what artifacts are missing 
// - project building exception 	TokenNameCOMMENT_LINE	- project building exception 
// - invalid project model exception: list of markers 	TokenNameCOMMENT_LINE	- invalid project model exception: list of markers 
// - xmlpull parser exception 	TokenNameCOMMENT_LINE	- xmlpull parser exception 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Throwable	TokenNameIdentifier	 Throwable
>	TokenNameGREATER	
getExceptions	TokenNameIdentifier	 get Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
addException	TokenNameIdentifier	 add Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasExceptions	TokenNameIdentifier	 has Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the build summary for the specified project. * * @param project The project to get the build summary for, must not be {@code null}. * @return The build summary for the project or {@code null} if the project has not been built (yet). */	TokenNameCOMMENT_JAVADOC	 Gets the build summary for the specified project. * @param project The project to get the build summary for, must not be {@code null}. @return The build summary for the project or {@code null} if the project has not been built (yet). 
BuildSummary	TokenNameIdentifier	 Build Summary
getBuildSummary	TokenNameIdentifier	 get Build Summary
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add the specified build summary. * * @param summary The build summary to add, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Add the specified build summary. * @param summary The build summary to add, must not be {@code null}. 
void	TokenNamevoid	
addBuildSummary	TokenNameIdentifier	 add Build Summary
(	TokenNameLPAREN	
BuildSummary	TokenNameIdentifier	 Build Summary
summary	TokenNameIdentifier	 summary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
