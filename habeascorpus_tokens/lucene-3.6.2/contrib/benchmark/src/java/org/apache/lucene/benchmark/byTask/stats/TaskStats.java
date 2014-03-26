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
/** * Statistics for a task run. * <br>The same task can run more than once, but, if that task records statistics, * each run would create its own TaskStats. */	TokenNameCOMMENT_JAVADOC	 Statistics for a task run. <br>The same task can run more than once, but, if that task records statistics, each run would create its own TaskStats. 
public	TokenNamepublic	
class	TokenNameclass	
TaskStats	TokenNameIdentifier	 Task Stats
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** task for which data was collected */	TokenNameCOMMENT_JAVADOC	 task for which data was collected 
private	TokenNameprivate	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
/** round in which task run started */	TokenNameCOMMENT_JAVADOC	 round in which task run started 
private	TokenNameprivate	
int	TokenNameint	
round	TokenNameIdentifier	 round
;	TokenNameSEMICOLON	
/** task start time */	TokenNameCOMMENT_JAVADOC	 task start time 
private	TokenNameprivate	
long	TokenNamelong	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
/** task elapsed time. elapsed >= 0 indicates run completion! */	TokenNameCOMMENT_JAVADOC	 task elapsed time. elapsed >= 0 indicates run completion! 
private	TokenNameprivate	
long	TokenNamelong	
elapsed	TokenNameIdentifier	 elapsed
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** max tot mem during task */	TokenNameCOMMENT_JAVADOC	 max tot mem during task 
private	TokenNameprivate	
long	TokenNamelong	
maxTotMem	TokenNameIdentifier	 max Tot Mem
;	TokenNameSEMICOLON	
/** max used mem during task */	TokenNameCOMMENT_JAVADOC	 max used mem during task 
private	TokenNameprivate	
long	TokenNamelong	
maxUsedMem	TokenNameIdentifier	 max Used Mem
;	TokenNameSEMICOLON	
/** serial run number of this task run in the perf run */	TokenNameCOMMENT_JAVADOC	 serial run number of this task run in the perf run 
private	TokenNameprivate	
int	TokenNameint	
taskRunNum	TokenNameIdentifier	 task Run Num
;	TokenNameSEMICOLON	
/** number of other tasks that started to run while this task was still running */	TokenNameCOMMENT_JAVADOC	 number of other tasks that started to run while this task was still running 
private	TokenNameprivate	
int	TokenNameint	
numParallelTasks	TokenNameIdentifier	 num Parallel Tasks
;	TokenNameSEMICOLON	
/** number of work items done by this task. * For indexing that can be number of docs added. * For warming that can be number of scanned items, etc. * For repeating tasks, this is a sum over repetitions. */	TokenNameCOMMENT_JAVADOC	 number of work items done by this task. For indexing that can be number of docs added. For warming that can be number of scanned items, etc. For repeating tasks, this is a sum over repetitions. 
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** Number of similar tasks aggregated into this record. * Used when summing up on few runs/instances of similar tasks. */	TokenNameCOMMENT_JAVADOC	 Number of similar tasks aggregated into this record. Used when summing up on few runs/instances of similar tasks. 
private	TokenNameprivate	
int	TokenNameint	
numRuns	TokenNameIdentifier	 num Runs
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Create a run data for a task that is starting now. * To be called from Points. */	TokenNameCOMMENT_JAVADOC	 Create a run data for a task that is starting now. To be called from Points. 
TaskStats	TokenNameIdentifier	 Task Stats
(	TokenNameLPAREN	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
int	TokenNameint	
taskRunNum	TokenNameIdentifier	 task Run Num
,	TokenNameCOMMA	
int	TokenNameint	
round	TokenNameIdentifier	 round
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
taskRunNum	TokenNameIdentifier	 task Run Num
=	TokenNameEQUAL	
taskRunNum	TokenNameIdentifier	 task Run Num
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
round	TokenNameIdentifier	 round
=	TokenNameEQUAL	
round	TokenNameIdentifier	 round
;	TokenNameSEMICOLON	
maxTotMem	TokenNameIdentifier	 max Tot Mem
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalMemory	TokenNameIdentifier	 total Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxUsedMem	TokenNameIdentifier	 max Used Mem
=	TokenNameEQUAL	
maxTotMem	TokenNameIdentifier	 max Tot Mem
-	TokenNameMINUS	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
freeMemory	TokenNameIdentifier	 free Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * mark the end of a task */	TokenNameCOMMENT_JAVADOC	 mark the end of a task 
void	TokenNamevoid	
markEnd	TokenNameIdentifier	 mark End
(	TokenNameLPAREN	
int	TokenNameint	
numParallelTasks	TokenNameIdentifier	 num Parallel Tasks
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elapsed	TokenNameIdentifier	 elapsed
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
long	TokenNamelong	
totMem	TokenNameIdentifier	 tot Mem
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalMemory	TokenNameIdentifier	 total Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
totMem	TokenNameIdentifier	 tot Mem
>	TokenNameGREATER	
maxTotMem	TokenNameIdentifier	 max Tot Mem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxTotMem	TokenNameIdentifier	 max Tot Mem
=	TokenNameEQUAL	
totMem	TokenNameIdentifier	 tot Mem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
usedMem	TokenNameIdentifier	 used Mem
=	TokenNameEQUAL	
totMem	TokenNameIdentifier	 tot Mem
-	TokenNameMINUS	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
freeMemory	TokenNameIdentifier	 free Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
usedMem	TokenNameIdentifier	 used Mem
>	TokenNameGREATER	
maxUsedMem	TokenNameIdentifier	 max Used Mem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxUsedMem	TokenNameIdentifier	 max Used Mem
=	TokenNameEQUAL	
usedMem	TokenNameIdentifier	 used Mem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numParallelTasks	TokenNameIdentifier	 num Parallel Tasks
=	TokenNameEQUAL	
numParallelTasks	TokenNameIdentifier	 num Parallel Tasks
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
countsByTime	TokenNameIdentifier	 counts By Time
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
countsByTimeStepMSec	TokenNameIdentifier	 counts By Time Step M Sec
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setCountsByTime	TokenNameIdentifier	 set Counts By Time
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counts	TokenNameIdentifier	 counts
,	TokenNameCOMMA	
long	TokenNamelong	
msecStep	TokenNameIdentifier	 msec Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countsByTime	TokenNameIdentifier	 counts By Time
=	TokenNameEQUAL	
counts	TokenNameIdentifier	 counts
;	TokenNameSEMICOLON	
countsByTimeStepMSec	TokenNameIdentifier	 counts By Time Step M Sec
=	TokenNameEQUAL	
msecStep	TokenNameIdentifier	 msec Step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCountsByTime	TokenNameIdentifier	 get Counts By Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
countsByTime	TokenNameIdentifier	 counts By Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getCountsByTimeStepMSec	TokenNameIdentifier	 get Counts By Time Step M Sec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
countsByTimeStepMSec	TokenNameIdentifier	 counts By Time Step M Sec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the taskRunNum. */	TokenNameCOMMENT_JAVADOC	 @return the taskRunNum. 
public	TokenNamepublic	
int	TokenNameint	
getTaskRunNum	TokenNameIdentifier	 get Task Run Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
taskRunNum	TokenNameIdentifier	 task Run Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see java.lang.Object#toString() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see java.lang.Object#toString() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
elapsed	TokenNameIdentifier	 elapsed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the count. */	TokenNameCOMMENT_JAVADOC	 @return Returns the count. 
public	TokenNamepublic	
int	TokenNameint	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return elapsed time. */	TokenNameCOMMENT_JAVADOC	 @return elapsed time. 
public	TokenNamepublic	
long	TokenNamelong	
getElapsed	TokenNameIdentifier	 get Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elapsed	TokenNameIdentifier	 elapsed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the maxTotMem. */	TokenNameCOMMENT_JAVADOC	 @return Returns the maxTotMem. 
public	TokenNamepublic	
long	TokenNamelong	
getMaxTotMem	TokenNameIdentifier	 get Max Tot Mem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxTotMem	TokenNameIdentifier	 max Tot Mem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the maxUsedMem. */	TokenNameCOMMENT_JAVADOC	 @return Returns the maxUsedMem. 
public	TokenNamepublic	
long	TokenNamelong	
getMaxUsedMem	TokenNameIdentifier	 get Max Used Mem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxUsedMem	TokenNameIdentifier	 max Used Mem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the numParallelTasks. */	TokenNameCOMMENT_JAVADOC	 @return Returns the numParallelTasks. 
public	TokenNamepublic	
int	TokenNameint	
getNumParallelTasks	TokenNameIdentifier	 get Num Parallel Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numParallelTasks	TokenNameIdentifier	 num Parallel Tasks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the task. */	TokenNameCOMMENT_JAVADOC	 @return Returns the task. 
public	TokenNamepublic	
PerfTask	TokenNameIdentifier	 Perf Task
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the numRuns. */	TokenNameCOMMENT_JAVADOC	 @return Returns the numRuns. 
public	TokenNamepublic	
int	TokenNameint	
getNumRuns	TokenNameIdentifier	 get Num Runs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numRuns	TokenNameIdentifier	 num Runs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add data from another stat, for aggregation * @param stat2 the added stat data. */	TokenNameCOMMENT_JAVADOC	 Add data from another stat, for aggregation @param stat2 the added stat data. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
TaskStats	TokenNameIdentifier	 Task Stats
stat2	TokenNameIdentifier	 stat2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numRuns	TokenNameIdentifier	 num Runs
+=	TokenNamePLUS_EQUAL	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
getNumRuns	TokenNameIdentifier	 get Num Runs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elapsed	TokenNameIdentifier	 elapsed
+=	TokenNamePLUS_EQUAL	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
getElapsed	TokenNameIdentifier	 get Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxTotMem	TokenNameIdentifier	 max Tot Mem
+=	TokenNamePLUS_EQUAL	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
getMaxTotMem	TokenNameIdentifier	 get Max Tot Mem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxUsedMem	TokenNameIdentifier	 max Used Mem
+=	TokenNamePLUS_EQUAL	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
getMaxUsedMem	TokenNameIdentifier	 get Max Used Mem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
round	TokenNameIdentifier	 round
!=	TokenNameNOT_EQUAL	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
round	TokenNameIdentifier	 round
)	TokenNameRPAREN	
{	TokenNameLBRACE	
round	TokenNameIdentifier	 round
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// no meaning if aggregating tasks of different round. 	TokenNameCOMMENT_LINE	no meaning if aggregating tasks of different round. 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countsByTimeStepMSec	TokenNameIdentifier	 counts By Time Step M Sec
!=	TokenNameNOT_EQUAL	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
countsByTimeStepMSec	TokenNameIdentifier	 counts By Time Step M Sec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"different by-time msec step"	TokenNameStringLiteral	different by-time msec step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"different by-time msec count"	TokenNameStringLiteral	different by-time msec count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countsByTime	TokenNameIdentifier	 counts By Time
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
stat2	TokenNameIdentifier	 stat2
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see java.lang.Object#clone() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see java.lang.Object#clone() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
TaskStats	TokenNameIdentifier	 Task Stats
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TaskStats	TokenNameIdentifier	 Task Stats
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the round number. */	TokenNameCOMMENT_JAVADOC	 @return the round number. 
public	TokenNamepublic	
int	TokenNameint	
getRound	TokenNameIdentifier	 get Round
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
round	TokenNameIdentifier	 round
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
