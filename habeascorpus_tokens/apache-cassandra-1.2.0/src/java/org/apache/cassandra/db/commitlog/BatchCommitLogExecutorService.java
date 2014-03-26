/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
commitlog	TokenNameIdentifier	 commitlog
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
;	TokenNameSEMICOLON	
class	TokenNameclass	
BatchCommitLogExecutorService	TokenNameIdentifier	 Batch Commit Log Executor Service
extends	TokenNameextends	
AbstractCommitLogExecutorService	TokenNameIdentifier	 Abstract Commit Log Executor Service
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
CheaterFutureTask	TokenNameIdentifier	 Cheater Future Task
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Thread	TokenNameIdentifier	 Thread
appendingThread	TokenNameIdentifier	 appending Thread
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
run	TokenNameIdentifier	 run
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BatchCommitLogExecutorService	TokenNameIdentifier	 Batch Commit Log Executor Service
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getConcurrentWriters	TokenNameIdentifier	 get Concurrent Writers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BatchCommitLogExecutorService	TokenNameIdentifier	 Batch Commit Log Executor Service
(	TokenNameLPAREN	
int	TokenNameint	
queueSize	TokenNameIdentifier	 queue Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
<	TokenNameLESS	
CheaterFutureTask	TokenNameIdentifier	 Cheater Future Task
>	TokenNameGREATER	
(	TokenNameLPAREN	
queueSize	TokenNameIdentifier	 queue Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
=	TokenNameEQUAL	
new	TokenNamenew	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
runMayThrow	TokenNameIdentifier	 run May Throw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
run	TokenNameIdentifier	 run
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
processWithSyncBatch	TokenNameIdentifier	 process With Sync Batch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
completedTaskCount	TokenNameIdentifier	 completed Task Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
appendingThread	TokenNameIdentifier	 appending Thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
"COMMIT-LOG-WRITER"	TokenNameStringLiteral	COMMIT-LOG-WRITER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendingThread	TokenNameIdentifier	 appending Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getPendingTasks	TokenNameIdentifier	 get Pending Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CheaterFutureTask	TokenNameIdentifier	 Cheater Future Task
>	TokenNameGREATER	
incompleteTasks	TokenNameIdentifier	 incomplete Tasks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CheaterFutureTask	TokenNameIdentifier	 Cheater Future Task
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
taskValues	TokenNameIdentifier	 task Values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO not sure how to generify this 	TokenNameCOMMENT_LINE	TODO not sure how to generify this 
private	TokenNameprivate	
boolean	TokenNameboolean	
processWithSyncBatch	TokenNameIdentifier	 process With Sync Batch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CheaterFutureTask	TokenNameIdentifier	 Cheater Future Task
firstTask	TokenNameIdentifier	 first Task
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstTask	TokenNameIdentifier	 first Task
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
firstTask	TokenNameIdentifier	 first Task
.	TokenNameDOT	
getRawCallable	TokenNameIdentifier	 get Raw Callable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
LogRecordAdder	TokenNameIdentifier	 Log Record Adder
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstTask	TokenNameIdentifier	 first Task
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// attempt to do a bunch of LogRecordAdder ops before syncing 	TokenNameCOMMENT_LINE	attempt to do a bunch of LogRecordAdder ops before syncing 
// (this is a little clunky since there is no blocking peek method, 	TokenNameCOMMENT_LINE	(this is a little clunky since there is no blocking peek method, 
// so we have to break it into firstTask / extra tasks) 	TokenNameCOMMENT_LINE	so we have to break it into firstTask / extra tasks) 
incompleteTasks	TokenNameIdentifier	 incomplete Tasks
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
taskValues	TokenNameIdentifier	 task Values
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1000000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getCommitLogSyncBatchWindow	TokenNameIdentifier	 get Commit Log Sync Batch Window
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// it doesn't seem worth bothering future-izing the exception 	TokenNameCOMMENT_LINE	it doesn't seem worth bothering future-izing the exception 
// since if a commitlog op throws, we're probably screwed anyway 	TokenNameCOMMENT_LINE	since if a commitlog op throws, we're probably screwed anyway 
incompleteTasks	TokenNameIdentifier	 incomplete Tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
firstTask	TokenNameIdentifier	 first Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
taskValues	TokenNameIdentifier	 task Values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
firstTask	TokenNameIdentifier	 first Task
.	TokenNameDOT	
getRawCallable	TokenNameIdentifier	 get Raw Callable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRawCallable	TokenNameIdentifier	 get Raw Callable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
LogRecordAdder	TokenNameIdentifier	 Log Record Adder
&&	TokenNameAND_AND	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CheaterFutureTask	TokenNameIdentifier	 Cheater Future Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incompleteTasks	TokenNameIdentifier	 incomplete Tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
taskValues	TokenNameIdentifier	 task Values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getRawCallable	TokenNameIdentifier	 get Raw Callable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// now sync and set the tasks' values (which allows thread calling get() to proceed) 	TokenNameCOMMENT_LINE	now sync and set the tasks' values (which allows thread calling get() to proceed) 
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
sync	TokenNameIdentifier	 sync
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
incompleteTasks	TokenNameIdentifier	 incomplete Tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
incompleteTasks	TokenNameIdentifier	 incomplete Tasks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
taskValues	TokenNameIdentifier	 task Values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
RunnableFuture	TokenNameIdentifier	 Runnable Future
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
newTaskFor	TokenNameIdentifier	 new Task For
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newTaskFor	TokenNameIdentifier	 new Task For
(	TokenNameLPAREN	
Executors	TokenNameIdentifier	 Executors
.	TokenNameDOT	
callable	TokenNameIdentifier	 callable
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
RunnableFuture	TokenNameIdentifier	 Runnable Future
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
newTaskFor	TokenNameIdentifier	 new Task For
(	TokenNameLPAREN	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
callable	TokenNameIdentifier	 callable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CheaterFutureTask	TokenNameIdentifier	 Cheater Future Task
(	TokenNameLPAREN	
callable	TokenNameIdentifier	 callable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CheaterFutureTask	TokenNameIdentifier	 Cheater Future Task
)	TokenNameRPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
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
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
LogRecordAdder	TokenNameIdentifier	 Log Record Adder
adder	TokenNameIdentifier	 adder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Callable	TokenNameIdentifier	 Callable
)	TokenNameRPAREN	
adder	TokenNameIdentifier	 adder
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
ExecutionException	TokenNameIdentifier	 Execution Exception
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
public	TokenNamepublic	
void	TokenNamevoid	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
new	TokenNamenew	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
runMayThrow	TokenNameIdentifier	 run May Throw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
run	TokenNameIdentifier	 run
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
appendingThread	TokenNameIdentifier	 appending Thread
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
"Commitlog Shutdown"	TokenNameStringLiteral	Commitlog Shutdown
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
awaitTermination	TokenNameIdentifier	 await Termination
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
appendingThread	TokenNameIdentifier	 appending Thread
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CheaterFutureTask	TokenNameIdentifier	 Cheater Future Task
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
extends	TokenNameextends	
FutureTask	TokenNameIdentifier	 Future Task
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Callable	TokenNameIdentifier	 Callable
rawCallable	TokenNameIdentifier	 raw Callable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CheaterFutureTask	TokenNameIdentifier	 Cheater Future Task
(	TokenNameLPAREN	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
callable	TokenNameIdentifier	 callable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
callable	TokenNameIdentifier	 callable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rawCallable	TokenNameIdentifier	 raw Callable
=	TokenNameEQUAL	
callable	TokenNameIdentifier	 callable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Callable	TokenNameIdentifier	 Callable
getRawCallable	TokenNameIdentifier	 get Raw Callable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rawCallable	TokenNameIdentifier	 raw Callable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
