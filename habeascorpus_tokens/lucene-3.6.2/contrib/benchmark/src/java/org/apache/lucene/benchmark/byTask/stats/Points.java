package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
stats	TokenNameIdentifier	 stats
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
PerfTask	TokenNameIdentifier	 Perf Task
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
;	TokenNameSEMICOLON	
/** * Test run data points collected as the test proceeds. */	TokenNameCOMMENT_JAVADOC	 Test run data points collected as the test proceeds. 
public	TokenNamepublic	
class	TokenNameclass	
Points	TokenNameIdentifier	 Points
{	TokenNameLBRACE	
// stat points ordered by their start time. 	TokenNameCOMMENT_LINE	stat points ordered by their start time. 
// for now we collect points as TaskStats objects. 	TokenNameCOMMENT_LINE	for now we collect points as TaskStats objects. 
// later might optimize to collect only native data. 	TokenNameCOMMENT_LINE	later might optimize to collect only native data. 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TaskStats	TokenNameIdentifier	 Task Stats
>	TokenNameGREATER	
points	TokenNameIdentifier	 points
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TaskStats	TokenNameIdentifier	 Task Stats
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nextTaskRunNum	TokenNameIdentifier	 next Task Run Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TaskStats	TokenNameIdentifier	 Task Stats
currentStats	TokenNameIdentifier	 current Stats
;	TokenNameSEMICOLON	
/** * Create a Points statistics object. */	TokenNameCOMMENT_JAVADOC	 Create a Points statistics object. 
public	TokenNamepublic	
Points	TokenNameIdentifier	 Points
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Return the current task stats. * the actual task stats are returned, so caller should not modify this task stats. * @return current {@link TaskStats}. */	TokenNameCOMMENT_JAVADOC	 Return the current task stats. the actual task stats are returned, so caller should not modify this task stats. @return current {@link TaskStats}. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TaskStats	TokenNameIdentifier	 Task Stats
>	TokenNameGREATER	
taskStats	TokenNameIdentifier	 task Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
points	TokenNameIdentifier	 points
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Mark that a task is starting. * Create a task stats for it and store it as a point. * @param task the starting task. * @return the new task stats created for the starting task. */	TokenNameCOMMENT_JAVADOC	 Mark that a task is starting. Create a task stats for it and store it as a point. @param task the starting task. @return the new task stats created for the starting task. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
TaskStats	TokenNameIdentifier	 Task Stats
markTaskStart	TokenNameIdentifier	 mark Task Start
(	TokenNameLPAREN	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
int	TokenNameint	
round	TokenNameIdentifier	 round
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TaskStats	TokenNameIdentifier	 Task Stats
stats	TokenNameIdentifier	 stats
=	TokenNameEQUAL	
new	TokenNamenew	
TaskStats	TokenNameIdentifier	 Task Stats
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
nextTaskRunNum	TokenNameIdentifier	 next Task Run Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
round	TokenNameIdentifier	 round
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentStats	TokenNameIdentifier	 current Stats
=	TokenNameEQUAL	
stats	TokenNameIdentifier	 stats
;	TokenNameSEMICOLON	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
stats	TokenNameIdentifier	 stats
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stats	TokenNameIdentifier	 stats
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TaskStats	TokenNameIdentifier	 Task Stats
getCurrentStats	TokenNameIdentifier	 get Current Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentStats	TokenNameIdentifier	 current Stats
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return next task num 	TokenNameCOMMENT_LINE	return next task num 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
int	TokenNameint	
nextTaskRunNum	TokenNameIdentifier	 next Task Run Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextTaskRunNum	TokenNameIdentifier	 next Task Run Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * mark the end of a task */	TokenNameCOMMENT_JAVADOC	 mark the end of a task 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
markTaskEnd	TokenNameIdentifier	 mark Task End
(	TokenNameLPAREN	
TaskStats	TokenNameIdentifier	 Task Stats
stats	TokenNameIdentifier	 stats
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numParallelTasks	TokenNameIdentifier	 num Parallel Tasks
=	TokenNameEQUAL	
nextTaskRunNum	TokenNameIdentifier	 next Task Run Num
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
getTaskRunNum	TokenNameIdentifier	 get Task Run Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// note: if the stats were cleared, might be that this stats object is 	TokenNameCOMMENT_LINE	note: if the stats were cleared, might be that this stats object is 
// no longer in points, but this is just ok. 	TokenNameCOMMENT_LINE	no longer in points, but this is just ok. 
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
markEnd	TokenNameIdentifier	 mark End
(	TokenNameLPAREN	
numParallelTasks	TokenNameIdentifier	 num Parallel Tasks
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clear all data, prepare for more tests. */	TokenNameCOMMENT_JAVADOC	 Clear all data, prepare for more tests. 
public	TokenNamepublic	
void	TokenNamevoid	
clearData	TokenNameIdentifier	 clear Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
