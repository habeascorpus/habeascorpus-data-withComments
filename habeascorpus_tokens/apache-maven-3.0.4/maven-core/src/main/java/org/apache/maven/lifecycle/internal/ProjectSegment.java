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
MavenSession	TokenNameIdentifier	 Maven Session
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * A build context that matches a mavenproject to a given tasksegment, and the session to be used. * <p/> * A note to the reader; * <p/> * There are several issues/discussions regarding how "aggregator" plugins should be handled. * Read for instance http://docs.codehaus.org/display/MAVEN/Deterministic+Lifecycle+Planning * <p/> * In their current implementation they are "bolted" onto the lifecycle by separating them * into TaskSegments. This class represents the execution context of one such task segment. * <p/> * Wise voices have suggested that maybe aggregators shouldn't be bound to the ordinary * lifecycle at all, in which case we wouldn't be needing this class at all ( and * ProjectBuildList.getByTaskSegments). Or maybe they should be introduced in the calculation * of the execution plan instead, which seems much nicer. * <p/> * Additionally this class contains a clone of the MavenSession, which is *only* needed * because it has as notion of a "current" project. * * @since 3.0 * @author Jason van Zyl * @author Benjamin Bentmann * @author Kristian Rosenvold * <p/> * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 A build context that matches a mavenproject to a given tasksegment, and the session to be used. <p/> A note to the reader; <p/> There are several issues/discussions regarding how "aggregator" plugins should be handled. Read for instance http://docs.codehaus.org/display/MAVEN/Deterministic+Lifecycle+Planning <p/> In their current implementation they are "bolted" onto the lifecycle by separating them into TaskSegments. This class represents the execution context of one such task segment. <p/> Wise voices have suggested that maybe aggregators shouldn't be bound to the ordinary lifecycle at all, in which case we wouldn't be needing this class at all ( and ProjectBuildList.getByTaskSegments). Or maybe they should be introduced in the calculation of the execution plan instead, which seems much nicer. <p/> Additionally this class contains a clone of the MavenSession, which is *only* needed because it has as notion of a "current" project. * @since 3.0 @author Jason van Zyl @author Benjamin Bentmann @author Kristian Rosenvold <p/> NOTE: This class is not part of any public api and can be changed or deleted without prior notice. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ProjectSegment	TokenNameIdentifier	 Project Segment
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment	TokenNameIdentifier	 task Segment
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
nonTransitiveUpstreamProjects	TokenNameIdentifier	 non Transitive Upstream Projects
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
transitiveUpstreamProjects	TokenNameIdentifier	 transitive Upstream Projects
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ProjectSegment	TokenNameIdentifier	 Project Segment
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment	TokenNameIdentifier	 task Segment
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
copiedSession	TokenNameIdentifier	 copied Session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
taskSegment	TokenNameIdentifier	 task Segment
=	TokenNameEQUAL	
taskSegment	TokenNameIdentifier	 task Segment
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
copiedSession	TokenNameIdentifier	 copied Session
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ProjectDependencyGraph	TokenNameIdentifier	 Project Dependency Graph
dependencyGraph	TokenNameIdentifier	 dependency Graph
=	TokenNameEQUAL	
getSession	TokenNameIdentifier	 get Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProjectDependencyGraph	TokenNameIdentifier	 get Project Dependency Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nonTransitiveUpstreamProjects	TokenNameIdentifier	 non Transitive Upstream Projects
=	TokenNameEQUAL	
dependencyGraph	TokenNameIdentifier	 dependency Graph
.	TokenNameDOT	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transitiveUpstreamProjects	TokenNameIdentifier	 transitive Upstream Projects
=	TokenNameEQUAL	
dependencyGraph	TokenNameIdentifier	 dependency Graph
.	TokenNameDOT	
getUpstreamProjects	TokenNameIdentifier	 get Upstream Projects
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenSession	TokenNameIdentifier	 Maven Session
getSession	TokenNameIdentifier	 get Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
session	TokenNameIdentifier	 session
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
TaskSegment	TokenNameIdentifier	 Task Segment
getTaskSegment	TokenNameIdentifier	 get Task Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
taskSegment	TokenNameIdentifier	 task Segment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getImmediateUpstreamProjects	TokenNameIdentifier	 get Immediate Upstream Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nonTransitiveUpstreamProjects	TokenNameIdentifier	 non Transitive Upstream Projects
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
getTransitiveUpstreamProjects	TokenNameIdentifier	 get Transitive Upstream Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transitiveUpstreamProjects	TokenNameIdentifier	 transitive Upstream Projects
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
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
getTaskSegment	TokenNameIdentifier	 get Task Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
