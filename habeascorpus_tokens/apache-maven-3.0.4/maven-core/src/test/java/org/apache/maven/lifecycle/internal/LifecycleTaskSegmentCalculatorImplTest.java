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
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
LifecycleTaskSegmentCalculatorStub	TokenNameIdentifier	 Lifecycle Task Segment Calculator Stub
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
LifecycleTaskSegmentCalculatorImplTest	TokenNameIdentifier	 Lifecycle Task Segment Calculator Impl Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCalculateProjectBuilds	TokenNameIdentifier	 test Calculate Project Builds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
LifecycleTaskSegmentCalculator	TokenNameIdentifier	 Lifecycle Task Segment Calculator
lifecycleTaskSegmentCalculator	TokenNameIdentifier	 lifecycle Task Segment Calculator
=	TokenNameEQUAL	
getTaskSegmentCalculator	TokenNameIdentifier	 get Task Segment Calculator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BuildListCalculator	TokenNameIdentifier	 Build List Calculator
buildListCalculator	TokenNameIdentifier	 build List Calculator
=	TokenNameEQUAL	
new	TokenNamenew	
BuildListCalculator	TokenNameIdentifier	 Build List Calculator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
ProjectDependencyGraphStub	TokenNameIdentifier	 Project Dependency Graph Stub
.	TokenNameDOT	
getMavenSession	TokenNameIdentifier	 get Maven Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TaskSegment	TokenNameIdentifier	 Task Segment
>	TokenNameGREATER	
taskSegments	TokenNameIdentifier	 task Segments
=	TokenNameEQUAL	
lifecycleTaskSegmentCalculator	TokenNameIdentifier	 lifecycle Task Segment Calculator
.	TokenNameDOT	
calculateTaskSegments	TokenNameIdentifier	 calculate Task Segments
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ProjectBuildList	TokenNameIdentifier	 Project Build List
buildList	TokenNameIdentifier	 build List
=	TokenNameEQUAL	
buildListCalculator	TokenNameIdentifier	 build List Calculator
.	TokenNameDOT	
calculateProjectBuilds	TokenNameIdentifier	 calculate Project Builds
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
taskSegments	TokenNameIdentifier	 task Segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ProjectBuildList	TokenNameIdentifier	 Project Build List
segments	TokenNameIdentifier	 segments
=	TokenNameEQUAL	
buildList	TokenNameIdentifier	 build List
.	TokenNameDOT	
getByTaskSegment	TokenNameIdentifier	 get By Task Segment
(	TokenNameLPAREN	
taskSegments	TokenNameIdentifier	 task Segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Stub data contains 3 segments"	TokenNameStringLiteral	Stub data contains 3 segments
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
taskSegments	TokenNameIdentifier	 task Segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Stub data contains 6 items"	TokenNameStringLiteral	Stub data contains 6 items
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ProjectSegment	TokenNameIdentifier	 Project Segment
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
LifecycleTaskSegmentCalculator	TokenNameIdentifier	 Lifecycle Task Segment Calculator
getTaskSegmentCalculator	TokenNameIdentifier	 get Task Segment Calculator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LifecycleTaskSegmentCalculatorStub	TokenNameIdentifier	 Lifecycle Task Segment Calculator Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
