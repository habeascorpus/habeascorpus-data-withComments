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
HashMap	TokenNameIdentifier	 Hash Map
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
Iterator	TokenNameIdentifier	 Iterator
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
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
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
/** * A list of project segments, ordered so that all ProjectSegments from first TaskSegment come before any * subsequent TaskSegments. * * @since 3.0 * @author Kristian Rosenvold * <p/> * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 A list of project segments, ordered so that all ProjectSegments from first TaskSegment come before any subsequent TaskSegments. * @since 3.0 @author Kristian Rosenvold <p/> NOTE: This class is not part of any public api and can be changed or deleted without prior notice. 
public	TokenNamepublic	
class	TokenNameclass	
ProjectBuildList	TokenNameIdentifier	 Project Build List
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
items	TokenNameIdentifier	 items
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ProjectBuildList	TokenNameIdentifier	 Project Build List
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
items	TokenNameIdentifier	 items
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
items	TokenNameIdentifier	 items
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: Optimize; or maybe just rewrite the whole way aggregating mojos are being run. 	TokenNameCOMMENT_LINE	TODO: Optimize; or maybe just rewrite the whole way aggregating mojos are being run. 
/** * Returns aProjectBuildList that contains only items for the specified taskSegment * @param taskSegment the requested tasksegment * @return a project build list for the supplied task segment */	TokenNameCOMMENT_JAVADOC	 Returns aProjectBuildList that contains only items for the specified taskSegment @param taskSegment the requested tasksegment @return a project build list for the supplied task segment 
public	TokenNamepublic	
ProjectBuildList	TokenNameIdentifier	 Project Build List
getByTaskSegment	TokenNameIdentifier	 get By Task Segment
(	TokenNameLPAREN	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment	TokenNameIdentifier	 task Segment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
currentSegment	TokenNameIdentifier	 current Segment
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
:	TokenNameCOLON	
items	TokenNameIdentifier	 items
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
taskSegment	TokenNameIdentifier	 task Segment
==	TokenNameEQUAL_EQUAL	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
getTaskSegment	TokenNameIdentifier	 get Task Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: There's no notion of taskSegment equality. 	TokenNameCOMMENT_LINE	NOTE: There's no notion of taskSegment equality. 
currentSegment	TokenNameIdentifier	 current Segment
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ProjectBuildList	TokenNameIdentifier	 Project Build List
(	TokenNameLPAREN	
currentSegment	TokenNameIdentifier	 current Segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
,	TokenNameCOMMA	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
selectSegment	TokenNameIdentifier	 select Segment
(	TokenNameLPAREN	
TaskSegment	TokenNameIdentifier	 Task Segment
taskSegment	TokenNameIdentifier	 task Segment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
,	TokenNameCOMMA	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
,	TokenNameCOMMA	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
:	TokenNameCOLON	
items	TokenNameIdentifier	 items
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
taskSegment	TokenNameIdentifier	 task Segment
==	TokenNameEQUAL_EQUAL	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
getTaskSegment	TokenNameIdentifier	 get Task Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: There's no notion of taskSegment equality. 	TokenNameCOMMENT_LINE	NOTE: There's no notion of taskSegment equality. 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds the first ProjectSegment matching the supplied project * @param mavenProject the requested project * @return The projectSegment or null. */	TokenNameCOMMENT_JAVADOC	 Finds the first ProjectSegment matching the supplied project @param mavenProject the requested project @return The projectSegment or null. 
public	TokenNamepublic	
ProjectSegment	TokenNameIdentifier	 Project Segment
findByMavenProject	TokenNameIdentifier	 find By Maven Project
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
:	TokenNameCOLON	
items	TokenNameIdentifier	 items
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectBuild	TokenNameIdentifier	 project Build
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
closeAll	TokenNameIdentifier	 close All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
item	TokenNameIdentifier	 item
:	TokenNameCOLON	
items	TokenNameIdentifier	 items
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MavenSession	TokenNameIdentifier	 Maven Session
sessionForThisModule	TokenNameIdentifier	 session For This Module
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getSession	TokenNameIdentifier	 get Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sessionForThisModule	TokenNameIdentifier	 session For This Module
.	TokenNameDOT	
setCurrentProject	TokenNameIdentifier	 set Current Project
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ProjectSegment	TokenNameIdentifier	 Project Segment
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getReactorProjectKeys	TokenNameIdentifier	 get Reactor Project Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
projectKeys	TokenNameIdentifier	 project Keys
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
:	TokenNameCOLON	
items	TokenNameIdentifier	 items
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projectKeys	TokenNameIdentifier	 project Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
projectKeys	TokenNameIdentifier	 project Keys
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
