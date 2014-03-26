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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * @since 3.0 * @author Kristian Rosenvold * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 @since 3.0 @author Kristian Rosenvold NOTE: This class is not part of any public api and can be changed or deleted without prior notice. 
public	TokenNamepublic	
class	TokenNameclass	
BuildLogItem	TokenNameIdentifier	 Build Log Item
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
endTime	TokenNameIdentifier	 end Time
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
DependencyLogEntry	TokenNameIdentifier	 Dependency Log Entry
>	TokenNameGREATER	
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedList	TokenNameIdentifier	 synchronized List
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
DependencyLogEntry	TokenNameIdentifier	 Dependency Log Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BuildLogItem	TokenNameIdentifier	 Build Log Item
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
=	TokenNameEQUAL	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
void	TokenNamevoid	
setComplete	TokenNameIdentifier	 set Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endTime	TokenNameIdentifier	 end Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addWait	TokenNameIdentifier	 add Wait
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
upstreamProject	TokenNameIdentifier	 upstream Project
,	TokenNameCOMMA	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
inSchedule	TokenNameIdentifier	 in Schedule
,	TokenNameCOMMA	
long	TokenNamelong	
startWait	TokenNameIdentifier	 start Wait
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
DependencyLogEntry	TokenNameIdentifier	 Dependency Log Entry
(	TokenNameLPAREN	
upstreamProject	TokenNameIdentifier	 upstream Project
,	TokenNameCOMMA	
inSchedule	TokenNameIdentifier	 in Schedule
,	TokenNameCOMMA	
startWait	TokenNameIdentifier	 start Wait
,	TokenNameCOMMA	
now	TokenNameIdentifier	 now
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
upstreamProject	TokenNameIdentifier	 upstream Project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
DependencyLogEntry	TokenNameIdentifier	 Dependency Log Entry
(	TokenNameLPAREN	
upstreamProject	TokenNameIdentifier	 upstream Project
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
long	TokenNamelong	
rootStart	TokenNameIdentifier	 root Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%1d %2d "	TokenNameStringLiteral	%1d %2d 
,	TokenNameCOMMA	
startTime	TokenNameIdentifier	 start Time
-	TokenNameMINUS	
rootStart	TokenNameIdentifier	 root Start
,	TokenNameCOMMA	
endTime	TokenNameIdentifier	 end Time
-	TokenNameMINUS	
rootStart	TokenNameIdentifier	 root Start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getMojoExecutionDescription	TokenNameIdentifier	 get Mojo Execution Description
(	TokenNameLPAREN	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
DependencyLogEntry	TokenNameIdentifier	 Dependency Log Entry
waitLogEntry	TokenNameIdentifier	 wait Log Entry
:	TokenNameCOLON	
dependencies	TokenNameIdentifier	 dependencies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
waitLogEntry	TokenNameIdentifier	 wait Log Entry
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
toGraph	TokenNameIdentifier	 to Graph
(	TokenNameLPAREN	
long	TokenNamelong	
rootStart	TokenNameIdentifier	 root Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
DependencyLogEntry	TokenNameIdentifier	 Dependency Log Entry
waitLogEntry	TokenNameIdentifier	 wait Log Entry
:	TokenNameCOLON	
dependencies	TokenNameIdentifier	 dependencies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nodeKey	TokenNameIdentifier	 node Key
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" -> "	TokenNameStringLiteral	 -> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
waitLogEntry	TokenNameIdentifier	 wait Log Entry
.	TokenNameDOT	
toNodeKey	TokenNameIdentifier	 to Node Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
waitLogEntry	TokenNameIdentifier	 wait Log Entry
.	TokenNameDOT	
toNodeDescription	TokenNameIdentifier	 to Node Description
(	TokenNameLPAREN	
rootStart	TokenNameIdentifier	 root Start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nodeKey	TokenNameIdentifier	 node Key
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
nodeKey	TokenNameIdentifier	 node Key
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
,	TokenNameCOMMA	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
mavenProject	TokenNameIdentifier	 maven Project
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
+=	TokenNamePLUS_EQUAL	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
getMojoExecutionDescription	TokenNameIdentifier	 get Mojo Execution Description
(	TokenNameLPAREN	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
"_"	TokenNameStringLiteral	_
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
,	TokenNameCOMMA	
"_"	TokenNameStringLiteral	_
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getMojoExecutionDescription	TokenNameIdentifier	 get Mojo Execution Description
(	TokenNameLPAREN	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
.	TokenNameDOT	
getMojoExecution	TokenNameIdentifier	 get Mojo Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
.	TokenNameDOT	
getMojoExecution	TokenNameIdentifier	 get Mojo Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getLifeCyclePhase	TokenNameIdentifier	 get Life Cycle Phase
(	TokenNameLPAREN	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getLifeCyclePhase	TokenNameIdentifier	 get Life Cycle Phase
(	TokenNameLPAREN	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
.	TokenNameDOT	
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
.	TokenNameDOT	
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
DependencyLogEntry	TokenNameIdentifier	 Dependency Log Entry
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
MavenProject	TokenNameIdentifier	 Maven Project
upstreamProject	TokenNameIdentifier	 upstream Project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
DependencyLogEntry	TokenNameIdentifier	 Dependency Log Entry
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
upstreamProject	TokenNameIdentifier	 upstream Project
,	TokenNameCOMMA	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
executionPlanItem	TokenNameIdentifier	 execution Plan Item
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
stop	TokenNameIdentifier	 stop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
upstreamProject	TokenNameIdentifier	 upstream Project
=	TokenNameEQUAL	
upstreamProject	TokenNameIdentifier	 upstream Project
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
=	TokenNameEQUAL	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DependencyLogEntry	TokenNameIdentifier	 Dependency Log Entry
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
upstreamProject	TokenNameIdentifier	 upstream Project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
upstreamProject	TokenNameIdentifier	 upstream Project
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
upstreamProject	TokenNameIdentifier	 upstream Project
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
getExecutionPlanItem	TokenNameIdentifier	 get Execution Plan Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getElapsed	TokenNameIdentifier	 get Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toNodeKey	TokenNameIdentifier	 to Node Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeKey	TokenNameIdentifier	 node Key
(	TokenNameLPAREN	
upstreamProject	TokenNameIdentifier	 upstream Project
,	TokenNameCOMMA	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toNodeDescription	TokenNameIdentifier	 to Node Description
(	TokenNameLPAREN	
long	TokenNamelong	
rootStart	TokenNameIdentifier	 root Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
message	TokenNameIdentifier	 message
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getExecutionPlanItem	TokenNameIdentifier	 get Execution Plan Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getMojoExecutionDescription	TokenNameIdentifier	 get Mojo Execution Description
(	TokenNameLPAREN	
executionPlanItem	TokenNameIdentifier	 execution Plan Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getElapsed	TokenNameIdentifier	 get Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
stop	TokenNameIdentifier	 stop
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
elapsed	TokenNameIdentifier	 elapsed
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
return	TokenNamereturn	
elapsed	TokenNameIdentifier	 elapsed
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
", wait="	TokenNameStringLiteral	, wait=
+	TokenNamePLUS	
elapsed	TokenNameIdentifier	 elapsed
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
