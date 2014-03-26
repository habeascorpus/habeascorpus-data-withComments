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
tasks	TokenNameIdentifier	 tasks
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
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
PerfRunData	TokenNameIdentifier	 Perf Run Data
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
feeds	TokenNameIdentifier	 feeds
.	TokenNameDOT	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
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
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
TaskStats	TokenNameIdentifier	 Task Stats
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayUtil	TokenNameIdentifier	 Array Util
;	TokenNameSEMICOLON	
/** * Sequence of parallel or sequential tasks. */	TokenNameCOMMENT_JAVADOC	 Sequence of parallel or sequential tasks. 
public	TokenNamepublic	
class	TokenNameclass	
TaskSequence	TokenNameIdentifier	 Task Sequence
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
REPEAT_EXHAUST	TokenNameIdentifier	 REPEAT  EXHAUST
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
tasks	TokenNameIdentifier	 tasks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
repetitions	TokenNameIdentifier	 repetitions
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
parallel	TokenNameIdentifier	 parallel
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TaskSequence	TokenNameIdentifier	 Task Sequence
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
letChildReport	TokenNameIdentifier	 let Child Report
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
rate	TokenNameIdentifier	 rate
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
perMin	TokenNameIdentifier	 per Min
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// rate, if set, is, by default, be sec. 	TokenNameCOMMENT_LINE	rate, if set, is, by default, be sec. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
seqName	TokenNameIdentifier	 seq Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
resetExhausted	TokenNameIdentifier	 reset Exhausted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PerfTask	TokenNameIdentifier	 Perf Task
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tasksArray	TokenNameIdentifier	 tasks Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
anyExhaustibleTasks	TokenNameIdentifier	 any Exhaustible Tasks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
collapsable	TokenNameIdentifier	 collapsable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// to not collapse external sequence named in alg. 	TokenNameCOMMENT_LINE	to not collapse external sequence named in alg. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fixedTime	TokenNameIdentifier	 fixed Time
;	TokenNameSEMICOLON	
// true if we run for fixed time 	TokenNameCOMMENT_LINE	true if we run for fixed time 
private	TokenNameprivate	
double	TokenNamedouble	
runTimeSec	TokenNameIdentifier	 run Time Sec
;	TokenNameSEMICOLON	
// how long to run for 	TokenNameCOMMENT_LINE	how long to run for 
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
logByTimeMsec	TokenNameIdentifier	 log By Time Msec
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TaskSequence	TokenNameIdentifier	 Task Sequence
(	TokenNameLPAREN	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
TaskSequence	TokenNameIdentifier	 Task Sequence
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
boolean	TokenNameboolean	
parallel	TokenNameIdentifier	 parallel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collapsable	TokenNameIdentifier	 collapsable
=	TokenNameEQUAL	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
(	TokenNameLPAREN	
parallel	TokenNameIdentifier	 parallel
?	TokenNameQUESTION	
"Par"	TokenNameStringLiteral	Par
:	TokenNameCOLON	
"Seq"	TokenNameStringLiteral	Seq
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSequenceName	TokenNameIdentifier	 set Sequence Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parallel	TokenNameIdentifier	 parallel
=	TokenNameEQUAL	
parallel	TokenNameIdentifier	 parallel
;	TokenNameSEMICOLON	
tasks	TokenNameIdentifier	 tasks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logByTimeMsec	TokenNameIdentifier	 log By Time Msec
=	TokenNameEQUAL	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"report.time.step.msec"	TokenNameStringLiteral	report.time.step.msec
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
initTasksArray	TokenNameIdentifier	 init Tasks Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
tasksArray	TokenNameIdentifier	 tasks Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tasksArray	TokenNameIdentifier	 tasks Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocMaker	TokenNameIdentifier	 get Doc Maker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initTasksArray	TokenNameIdentifier	 init Tasks Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tasksArray	TokenNameIdentifier	 tasks Array
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
numTasks	TokenNameIdentifier	 num Tasks
=	TokenNameEQUAL	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tasksArray	TokenNameIdentifier	 tasks Array
=	TokenNameEQUAL	
new	TokenNamenew	
PerfTask	TokenNameIdentifier	 Perf Task
[	TokenNameLBRACKET	
numTasks	TokenNameIdentifier	 num Tasks
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
numTasks	TokenNameIdentifier	 num Tasks
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tasksArray	TokenNameIdentifier	 tasks Array
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
anyExhaustibleTasks	TokenNameIdentifier	 any Exhaustible Tasks
|=	TokenNameOR_EQUAL	
tasksArray	TokenNameIdentifier	 tasks Array
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
ResetInputsTask	TokenNameIdentifier	 Reset Inputs Task
;	TokenNameSEMICOLON	
anyExhaustibleTasks	TokenNameIdentifier	 any Exhaustible Tasks
|=	TokenNameOR_EQUAL	
tasksArray	TokenNameIdentifier	 tasks Array
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
TaskSequence	TokenNameIdentifier	 Task Sequence
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
parallel	TokenNameIdentifier	 parallel
&&	TokenNameAND_AND	
logByTimeMsec	TokenNameIdentifier	 log By Time Msec
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
letChildReport	TokenNameIdentifier	 let Child Report
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countsByTime	TokenNameIdentifier	 counts By Time
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @return Returns the parallel. */	TokenNameCOMMENT_JAVADOC	 @return Returns the parallel. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isParallel	TokenNameIdentifier	 is Parallel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parallel	TokenNameIdentifier	 parallel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the repetitions. */	TokenNameCOMMENT_JAVADOC	 @return Returns the repetitions. 
public	TokenNamepublic	
int	TokenNameint	
getRepetitions	TokenNameIdentifier	 get Repetitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
repetitions	TokenNameIdentifier	 repetitions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
countsByTime	TokenNameIdentifier	 counts By Time
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setRunTime	TokenNameIdentifier	 set Run Time
(	TokenNameLPAREN	
double	TokenNamedouble	
sec	TokenNameIdentifier	 sec
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
runTimeSec	TokenNameIdentifier	 run Time Sec
=	TokenNameEQUAL	
sec	TokenNameIdentifier	 sec
;	TokenNameSEMICOLON	
fixedTime	TokenNameIdentifier	 fixed Time
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param repetitions The repetitions to set. * @throws Exception */	TokenNameCOMMENT_JAVADOC	 @param repetitions The repetitions to set. @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
setRepetitions	TokenNameIdentifier	 set Repetitions
(	TokenNameLPAREN	
int	TokenNameint	
repetitions	TokenNameIdentifier	 repetitions
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
fixedTime	TokenNameIdentifier	 fixed Time
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repetitions	TokenNameIdentifier	 repetitions
=	TokenNameEQUAL	
repetitions	TokenNameIdentifier	 repetitions
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
repetitions	TokenNameIdentifier	 repetitions
==	TokenNameEQUAL_EQUAL	
REPEAT_EXHAUST	TokenNameIdentifier	 REPEAT  EXHAUST
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isParallel	TokenNameIdentifier	 is Parallel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"REPEAT_EXHAUST is not allowed for parallel tasks"	TokenNameStringLiteral	REPEAT_EXHAUST is not allowed for parallel tasks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setSequenceName	TokenNameIdentifier	 set Sequence Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the parent. */	TokenNameCOMMENT_JAVADOC	 @return Returns the parent. 
public	TokenNamepublic	
TaskSequence	TokenNameIdentifier	 Task Sequence
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * @see org.apache.lucene.benchmark.byTask.tasks.PerfTask#doLogic() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.benchmark.byTask.tasks.PerfTask#doLogic() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
resetExhausted	TokenNameIdentifier	 reset Exhausted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
parallel	TokenNameIdentifier	 parallel
?	TokenNameQUESTION	
doParallelTasks	TokenNameIdentifier	 do Parallel Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
doSerialTasks	TokenNameIdentifier	 do Serial Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
RunBackgroundTask	TokenNameIdentifier	 Run Background Task
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
letChildReport	TokenNameIdentifier	 let Child Report
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RunBackgroundTask	TokenNameIdentifier	 Run Background Task
(	TokenNameLPAREN	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
boolean	TokenNameboolean	
letChildReport	TokenNameIdentifier	 let Child Report
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
letChildReport	TokenNameIdentifier	 let Child Report
=	TokenNameEQUAL	
letChildReport	TokenNameIdentifier	 let Child Report
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
stopNow	TokenNameIdentifier	 stop Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
stopNow	TokenNameIdentifier	 stop Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
runAndMaybeStats	TokenNameIdentifier	 run And Maybe Stats
(	TokenNameLPAREN	
letChildReport	TokenNameIdentifier	 let Child Report
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
doSerialTasks	TokenNameIdentifier	 do Serial Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rate	TokenNameIdentifier	 rate
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doSerialTasksWithRate	TokenNameIdentifier	 do Serial Tasks With Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initTasksArray	TokenNameIdentifier	 init Tasks Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
runTime	TokenNameIdentifier	 run Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
runTimeSec	TokenNameIdentifier	 run Time Sec
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RunBackgroundTask	TokenNameIdentifier	 Run Background Task
>	TokenNameGREATER	
bgTasks	TokenNameIdentifier	 bg Tasks
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
t0	TokenNameIdentifier	 t0
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fixedTime	TokenNameIdentifier	 fixed Time
||	TokenNameOR_OR	
(	TokenNameLPAREN	
repetitions	TokenNameIdentifier	 repetitions
==	TokenNameEQUAL_EQUAL	
REPEAT_EXHAUST	TokenNameIdentifier	 REPEAT  EXHAUST
&&	TokenNameAND_AND	
!	TokenNameNOT	
exhausted	TokenNameIdentifier	 exhausted
)	TokenNameRPAREN	
||	TokenNameOR_OR	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
repetitions	TokenNameIdentifier	 repetitions
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stopNow	TokenNameIdentifier	 stop Now
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
<	TokenNameLESS	
tasksArray	TokenNameIdentifier	 tasks Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
tasksArray	TokenNameIdentifier	 tasks Array
[	TokenNameLBRACKET	
l	TokenNameIdentifier	 l
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getRunInBackground	TokenNameIdentifier	 get Run In Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bgTasks	TokenNameIdentifier	 bg Tasks
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bgTasks	TokenNameIdentifier	 bg Tasks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
RunBackgroundTask	TokenNameIdentifier	 Run Background Task
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RunBackgroundTask	TokenNameIdentifier	 Run Background Task
bgTask	TokenNameIdentifier	 bg Task
=	TokenNameEQUAL	
new	TokenNamenew	
RunBackgroundTask	TokenNameIdentifier	 Run Background Task
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
letChildReport	TokenNameIdentifier	 let Child Report
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bgTask	TokenNameIdentifier	 bg Task
.	TokenNameDOT	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getBackgroundDeltaPriority	TokenNameIdentifier	 get Background Delta Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bgTask	TokenNameIdentifier	 bg Task
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bgTasks	TokenNameIdentifier	 bg Tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bgTask	TokenNameIdentifier	 bg Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
runAndMaybeStats	TokenNameIdentifier	 run And Maybe Stats
(	TokenNameLPAREN	
letChildReport	TokenNameIdentifier	 let Child Report
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t0	TokenNameIdentifier	 t0
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
logByTimeMsec	TokenNameIdentifier	 log By Time Msec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
>=	TokenNameGREATER_EQUAL	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countsByTime	TokenNameIdentifier	 counts By Time
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
countsByTime	TokenNameIdentifier	 counts By Time
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anyExhaustibleTasks	TokenNameIdentifier	 any Exhaustible Tasks
)	TokenNameRPAREN	
updateExhausted	TokenNameIdentifier	 update Exhausted
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fixedTime	TokenNameIdentifier	 fixed Time
&&	TokenNameAND_AND	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t0	TokenNameIdentifier	 t0
>	TokenNameGREATER	
runTime	TokenNameIdentifier	 run Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repetitions	TokenNameIdentifier	 repetitions
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bgTasks	TokenNameIdentifier	 bg Tasks
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
RunBackgroundTask	TokenNameIdentifier	 Run Background Task
bgTask	TokenNameIdentifier	 bg Task
:	TokenNameCOLON	
bgTasks	TokenNameIdentifier	 bg Tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bgTask	TokenNameIdentifier	 bg Task
.	TokenNameDOT	
stopNow	TokenNameIdentifier	 stop Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
RunBackgroundTask	TokenNameIdentifier	 Run Background Task
bgTask	TokenNameIdentifier	 bg Task
:	TokenNameCOLON	
bgTasks	TokenNameIdentifier	 bg Tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bgTask	TokenNameIdentifier	 bg Task
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
bgTask	TokenNameIdentifier	 bg Task
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPoints	TokenNameIdentifier	 get Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCurrentStats	TokenNameIdentifier	 get Current Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setCountsByTime	TokenNameIdentifier	 set Counts By Time
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
,	TokenNameCOMMA	
logByTimeMsec	TokenNameIdentifier	 log By Time Msec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stopNow	TokenNameIdentifier	 stop Now
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
doSerialTasksWithRate	TokenNameIdentifier	 do Serial Tasks With Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
initTasksArray	TokenNameIdentifier	 init Tasks Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
delayStep	TokenNameIdentifier	 delay Step
=	TokenNameEQUAL	
(	TokenNameLPAREN	
perMin	TokenNameIdentifier	 per Min
?	TokenNameQUESTION	
60000	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
rate	TokenNameIdentifier	 rate
;	TokenNameSEMICOLON	
long	TokenNamelong	
nextStartTime	TokenNameIdentifier	 next Start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
t0	TokenNameIdentifier	 t0
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
repetitions	TokenNameIdentifier	 repetitions
==	TokenNameEQUAL_EQUAL	
REPEAT_EXHAUST	TokenNameIdentifier	 REPEAT  EXHAUST
&&	TokenNameAND_AND	
!	TokenNameNOT	
exhausted	TokenNameIdentifier	 exhausted
)	TokenNameRPAREN	
||	TokenNameOR_OR	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
repetitions	TokenNameIdentifier	 repetitions
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stopNow	TokenNameIdentifier	 stop Now
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
<	TokenNameLESS	
tasksArray	TokenNameIdentifier	 tasks Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
tasksArray	TokenNameIdentifier	 tasks Array
[	TokenNameLBRACKET	
l	TokenNameIdentifier	 l
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
stopNow	TokenNameIdentifier	 stop Now
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
waitMore	TokenNameIdentifier	 wait More
=	TokenNameEQUAL	
nextStartTime	TokenNameIdentifier	 next Start Time
-	TokenNameMINUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
waitMore	TokenNameIdentifier	 wait More
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: better to use condition to notify 	TokenNameCOMMENT_LINE	TODO: better to use condition to notify 
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stopNow	TokenNameIdentifier	 stop Now
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextStartTime	TokenNameIdentifier	 next Start Time
+=	TokenNamePLUS_EQUAL	
delayStep	TokenNameIdentifier	 delay Step
;	TokenNameSEMICOLON	
// this aims at avarage rate. 	TokenNameCOMMENT_LINE	this aims at avarage rate. 
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
runAndMaybeStats	TokenNameIdentifier	 run And Maybe Stats
(	TokenNameLPAREN	
letChildReport	TokenNameIdentifier	 let Child Report
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t0	TokenNameIdentifier	 t0
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
logByTimeMsec	TokenNameIdentifier	 log By Time Msec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
>=	TokenNameGREATER_EQUAL	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countsByTime	TokenNameIdentifier	 counts By Time
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
countsByTime	TokenNameIdentifier	 counts By Time
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anyExhaustibleTasks	TokenNameIdentifier	 any Exhaustible Tasks
)	TokenNameRPAREN	
updateExhausted	TokenNameIdentifier	 update Exhausted
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
stopNow	TokenNameIdentifier	 stop Now
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// update state regarding exhaustion. 	TokenNameCOMMENT_LINE	update state regarding exhaustion. 
private	TokenNameprivate	
void	TokenNamevoid	
updateExhausted	TokenNameIdentifier	 update Exhausted
(	TokenNameLPAREN	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
instanceof	TokenNameinstanceof	
ResetInputsTask	TokenNameIdentifier	 Reset Inputs Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
resetExhausted	TokenNameIdentifier	 reset Exhausted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
instanceof	TokenNameinstanceof	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TaskSequence	TokenNameIdentifier	 Task Sequence
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
resetExhausted	TokenNameIdentifier	 reset Exhausted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
resetExhausted	TokenNameIdentifier	 reset Exhausted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
resetExhausted	TokenNameIdentifier	 reset Exhausted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
exhausted	TokenNameIdentifier	 exhausted
|=	TokenNameOR_EQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
exhausted	TokenNameIdentifier	 exhausted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
ParallelTask	TokenNameIdentifier	 Parallel Task
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ParallelTask	TokenNameIdentifier	 Parallel Task
(	TokenNameLPAREN	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"synthetic-access"	TokenNameStringLiteral	synthetic-access
)	TokenNameRPAREN	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
runAndMaybeStats	TokenNameIdentifier	 run And Maybe Stats
(	TokenNameLPAREN	
letChildReport	TokenNameIdentifier	 let Child Report
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
anyExhaustibleTasks	TokenNameIdentifier	 any Exhaustible Tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updateExhausted	TokenNameIdentifier	 update Exhausted
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
stopNow	TokenNameIdentifier	 stop Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
stopNow	TokenNameIdentifier	 stop Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Forwards top request to children 	TokenNameCOMMENT_LINE	Forwards top request to children 
if	TokenNameif	
(	TokenNameLPAREN	
runningParallelTasks	TokenNameIdentifier	 running Parallel Tasks
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ParallelTask	TokenNameIdentifier	 Parallel Task
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
runningParallelTasks	TokenNameIdentifier	 running Parallel Tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
stopNow	TokenNameIdentifier	 stop Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ParallelTask	TokenNameIdentifier	 Parallel Task
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
runningParallelTasks	TokenNameIdentifier	 running Parallel Tasks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
doParallelTasks	TokenNameIdentifier	 do Parallel Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
TaskStats	TokenNameIdentifier	 Task Stats
stats	TokenNameIdentifier	 stats
=	TokenNameEQUAL	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPoints	TokenNameIdentifier	 get Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCurrentStats	TokenNameIdentifier	 get Current Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initTasksArray	TokenNameIdentifier	 init Tasks Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParallelTask	TokenNameIdentifier	 Parallel Task
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
runningParallelTasks	TokenNameIdentifier	 running Parallel Tasks
=	TokenNameEQUAL	
new	TokenNamenew	
ParallelTask	TokenNameIdentifier	 Parallel Task
[	TokenNameLBRACKET	
repetitions	TokenNameIdentifier	 repetitions
*	TokenNameMULTIPLY	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// prepare threads 	TokenNameCOMMENT_LINE	prepare threads 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
repetitions	TokenNameIdentifier	 repetitions
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
tasksArray	TokenNameIdentifier	 tasks Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PerfTask	TokenNameIdentifier	 Perf Task
)	TokenNameRPAREN	
tasksArray	TokenNameIdentifier	 tasks Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ParallelTask	TokenNameIdentifier	 Parallel Task
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// run threads 	TokenNameCOMMENT_LINE	run threads 
startThreads	TokenNameIdentifier	 start Threads
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wait for all threads to complete 	TokenNameCOMMENT_LINE	wait for all threads to complete 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
instanceof	TokenNameinstanceof	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TaskSequence	TokenNameIdentifier	 Task Sequence
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countsByTime	TokenNameIdentifier	 counts By Time
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countsByTime	TokenNameIdentifier	 counts By Time
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
,	TokenNameCOMMA	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countsByTime	TokenNameIdentifier	 counts By Time
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
countsByTime	TokenNameIdentifier	 counts By Time
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
setCountsByTime	TokenNameIdentifier	 set Counts By Time
(	TokenNameLPAREN	
countsByTime	TokenNameIdentifier	 counts By Time
,	TokenNameCOMMA	
logByTimeMsec	TokenNameIdentifier	 log By Time Msec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return total count 	TokenNameCOMMENT_LINE	return total count 
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// run threads 	TokenNameCOMMENT_LINE	run threads 
private	TokenNameprivate	
void	TokenNamevoid	
startThreads	TokenNameIdentifier	 start Threads
(	TokenNameLPAREN	
ParallelTask	TokenNameIdentifier	 Parallel Task
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rate	TokenNameIdentifier	 rate
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startlThreadsWithRate	TokenNameIdentifier	 startl Threads With Rate
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// run threads with rate 	TokenNameCOMMENT_LINE	run threads with rate 
private	TokenNameprivate	
void	TokenNamevoid	
startlThreadsWithRate	TokenNameIdentifier	 startl Threads With Rate
(	TokenNameLPAREN	
ParallelTask	TokenNameIdentifier	 Parallel Task
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
long	TokenNamelong	
delayStep	TokenNameIdentifier	 delay Step
=	TokenNameEQUAL	
(	TokenNameLPAREN	
perMin	TokenNameIdentifier	 per Min
?	TokenNameQUESTION	
60000	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
rate	TokenNameIdentifier	 rate
;	TokenNameSEMICOLON	
long	TokenNamelong	
nextStartTime	TokenNameIdentifier	 next Start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
waitMore	TokenNameIdentifier	 wait More
=	TokenNameEQUAL	
nextStartTime	TokenNameIdentifier	 next Start Time
-	TokenNameMINUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
waitMore	TokenNameIdentifier	 wait More
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
waitMore	TokenNameIdentifier	 wait More
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextStartTime	TokenNameIdentifier	 next Start Time
+=	TokenNamePLUS_EQUAL	
delayStep	TokenNameIdentifier	 delay Step
;	TokenNameSEMICOLON	
// this aims at average rate of starting threads. 	TokenNameCOMMENT_LINE	this aims at average rate of starting threads. 
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
setDepth	TokenNameIdentifier	 set Depth
(	TokenNameLPAREN	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
padd	TokenNameIdentifier	 padd
=	TokenNameEQUAL	
getPadding	TokenNameIdentifier	 get Padding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
parallel	TokenNameIdentifier	 parallel
?	TokenNameQUESTION	
" ["	TokenNameStringLiteral	 [
:	TokenNameCOLON	
" {"	TokenNameStringLiteral	 {
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NEW_LINE	TokenNameIdentifier	 NEW  LINE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
:	TokenNameCOLON	
tasks	TokenNameIdentifier	 tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NEW_LINE	TokenNameIdentifier	 NEW  LINE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
padd	TokenNameIdentifier	 padd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
!	TokenNameNOT	
letChildReport	TokenNameIdentifier	 let Child Report
?	TokenNameQUESTION	
">"	TokenNameStringLiteral	>
:	TokenNameCOLON	
(	TokenNameLPAREN	
parallel	TokenNameIdentifier	 parallel
?	TokenNameQUESTION	
"]"	TokenNameStringLiteral	]
:	TokenNameCOLON	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fixedTime	TokenNameIdentifier	 fixed Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getNumberInstance	TokenNameIdentifier	 get Number Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
runTimeSec	TokenNameIdentifier	 run Time Sec
)	TokenNameRPAREN	
+	TokenNamePLUS	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
repetitions	TokenNameIdentifier	 repetitions
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" * "	TokenNameStringLiteral	 * 
+	TokenNamePLUS	
repetitions	TokenNameIdentifier	 repetitions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
repetitions	TokenNameIdentifier	 repetitions
==	TokenNameEQUAL_EQUAL	
REPEAT_EXHAUST	TokenNameIdentifier	 REPEAT  EXHAUST
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" * EXHAUST"	TokenNameStringLiteral	 * EXHAUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rate	TokenNameIdentifier	 rate
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", rate: "	TokenNameStringLiteral	, rate: 
+	TokenNamePLUS	
rate	TokenNameIdentifier	 rate
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
(	TokenNameLPAREN	
perMin	TokenNameIdentifier	 per Min
?	TokenNameQUESTION	
"min"	TokenNameStringLiteral	min
:	TokenNameCOLON	
"sec"	TokenNameStringLiteral	sec
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getRunInBackground	TokenNameIdentifier	 get Run In Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" &"	TokenNameStringLiteral	 &
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
getBackgroundDeltaPriority	TokenNameIdentifier	 get Background Delta Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute child tasks in a way that they do not report their time separately. */	TokenNameCOMMENT_JAVADOC	 Execute child tasks in a way that they do not report their time separately. 
public	TokenNamepublic	
void	TokenNamevoid	
setNoChildReport	TokenNameIdentifier	 set No Child Report
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
letChildReport	TokenNameIdentifier	 let Child Report
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
:	TokenNameCOLON	
tasks	TokenNameIdentifier	 tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
instanceof	TokenNameinstanceof	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
.	TokenNameDOT	
setNoChildReport	TokenNameIdentifier	 set No Child Report
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the rate per minute: how many operations should be performed in a minute. * If 0 this has no effect. * @return the rate per min: how many operations should be performed in a minute. */	TokenNameCOMMENT_JAVADOC	 Returns the rate per minute: how many operations should be performed in a minute. If 0 this has no effect. @return the rate per min: how many operations should be performed in a minute. 
public	TokenNamepublic	
int	TokenNameint	
getRate	TokenNameIdentifier	 get Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
perMin	TokenNameIdentifier	 per Min
?	TokenNameQUESTION	
rate	TokenNameIdentifier	 rate
:	TokenNameCOLON	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
rate	TokenNameIdentifier	 rate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param rate The rate to set. */	TokenNameCOMMENT_JAVADOC	 @param rate The rate to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setRate	TokenNameIdentifier	 set Rate
(	TokenNameLPAREN	
int	TokenNameint	
rate	TokenNameIdentifier	 rate
,	TokenNameCOMMA	
boolean	TokenNameboolean	
perMin	TokenNameIdentifier	 per Min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rate	TokenNameIdentifier	 rate
=	TokenNameEQUAL	
rate	TokenNameIdentifier	 rate
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
perMin	TokenNameIdentifier	 per Min
=	TokenNameEQUAL	
perMin	TokenNameIdentifier	 per Min
;	TokenNameSEMICOLON	
setSequenceName	TokenNameIdentifier	 set Sequence Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setSequenceName	TokenNameIdentifier	 set Sequence Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seqName	TokenNameIdentifier	 seq Name
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
repetitions	TokenNameIdentifier	 repetitions
==	TokenNameEQUAL_EQUAL	
REPEAT_EXHAUST	TokenNameIdentifier	 REPEAT  EXHAUST
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seqName	TokenNameIdentifier	 seq Name
+=	TokenNamePLUS_EQUAL	
"_Exhaust"	TokenNameStringLiteral	_Exhaust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
repetitions	TokenNameIdentifier	 repetitions
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seqName	TokenNameIdentifier	 seq Name
+=	TokenNamePLUS_EQUAL	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
repetitions	TokenNameIdentifier	 repetitions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rate	TokenNameIdentifier	 rate
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seqName	TokenNameIdentifier	 seq Name
+=	TokenNamePLUS_EQUAL	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
rate	TokenNameIdentifier	 rate
+	TokenNamePLUS	
(	TokenNameLPAREN	
perMin	TokenNameIdentifier	 per Min
?	TokenNameQUESTION	
"/min"	TokenNameStringLiteral	/min
:	TokenNameCOLON	
"/sec"	TokenNameStringLiteral	/sec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parallel	TokenNameIdentifier	 parallel
&&	TokenNameAND_AND	
seqName	TokenNameIdentifier	 seq Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"par"	TokenNameStringLiteral	par
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seqName	TokenNameIdentifier	 seq Name
+=	TokenNamePLUS_EQUAL	
"_Par"	TokenNameStringLiteral	_Par
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
seqName	TokenNameIdentifier	 seq Name
;	TokenNameSEMICOLON	
// override to include more info 	TokenNameCOMMENT_LINE	override to include more info 
}	TokenNameRBRACE	
/** * @return Returns the tasks. */	TokenNameCOMMENT_JAVADOC	 @return Returns the tasks. 
public	TokenNamepublic	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
getTasks	TokenNameIdentifier	 get Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tasks	TokenNameIdentifier	 tasks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see java.lang.Object#clone() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see java.lang.Object#clone() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
TaskSequence	TokenNameIdentifier	 Task Sequence
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PerfTask	TokenNameIdentifier	 Perf Task
)	TokenNameRPAREN	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if can be collapsed in case it is outermost sequence */	TokenNameCOMMENT_JAVADOC	 Return true if can be collapsed in case it is outermost sequence 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCollapsable	TokenNameIdentifier	 is Collapsable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
collapsable	TokenNameIdentifier	 collapsable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
