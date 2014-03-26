/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
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
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
tracing	TokenNameIdentifier	 tracing
.	TokenNameDOT	
TraceState	TokenNameIdentifier	 Trace State
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
tracing	TokenNameIdentifier	 tracing
.	TokenNameDOT	
Tracing	TokenNameIdentifier	 Tracing
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
tracing	TokenNameIdentifier	 tracing
.	TokenNameDOT	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
isTracing	TokenNameIdentifier	 is Tracing
;	TokenNameSEMICOLON	
/** * This class encorporates some Executor best practices for Cassandra. Most of the executors in the system * should use or extend this. There are two main improvements over a vanilla TPE: * * - If a task throws an exception, the default uncaught exception handler will be invoked; if there is * no such handler, the exception will be logged. * - MaximumPoolSize is not supported. Here is what that means (quoting TPE javadoc): * * If fewer than corePoolSize threads are running, the Executor always prefers adding a new thread rather than queuing. * If corePoolSize or more threads are running, the Executor always prefers queuing a request rather than adding a new thread. * If a request cannot be queued, a new thread is created unless this would exceed maximumPoolSize, in which case, the task will be rejected. * * We don't want this last stage of creating new threads if the queue is full; it makes it needlessly difficult to * reason about the system's behavior. In other words, if DebuggableTPE has allocated our maximum number of (core) * threads and the queue is full, we want the enqueuer to block. But to allow the number of threads to drop if a * stage is less busy, core thread timeout is enabled. */	TokenNameCOMMENT_JAVADOC	 This class encorporates some Executor best practices for Cassandra. Most of the executors in the system should use or extend this. There are two main improvements over a vanilla TPE: * - If a task throws an exception, the default uncaught exception handler will be invoked; if there is no such handler, the exception will be logged. - MaximumPoolSize is not supported. Here is what that means (quoting TPE javadoc): * If fewer than corePoolSize threads are running, the Executor always prefers adding a new thread rather than queuing. If corePoolSize or more threads are running, the Executor always prefers queuing a request rather than adding a new thread. If a request cannot be queued, a new thread is created unless this would exceed maximumPoolSize, in which case, the task will be rejected. * We don't want this last stage of creating new threads if the queue is full; it makes it needlessly difficult to reason about the system's behavior. In other words, if DebuggableTPE has allocated our maximum number of (core) threads and the queue is full, we want the enqueuer to block. But to allow the number of threads to drop if a stage is less busy, core thread timeout is enabled. 
public	TokenNamepublic	
class	TokenNameclass	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
extends	TokenNameextends	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RejectedExecutionHandler	TokenNameIdentifier	 Rejected Execution Handler
blockingExecutionHandler	TokenNameIdentifier	 blocking Execution Handler
=	TokenNameEQUAL	
new	TokenNamenew	
RejectedExecutionHandler	TokenNameIdentifier	 Rejected Execution Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
rejectedExecution	TokenNameIdentifier	 rejected Execution
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
executor	TokenNameIdentifier	 executor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
)	TokenNameRPAREN	
executor	TokenNameIdentifier	 executor
)	TokenNameRPAREN	
.	TokenNameDOT	
onInitialRejection	TokenNameIdentifier	 on Initial Rejection
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
executor	TokenNameIdentifier	 executor
.	TokenNameDOT	
getQueue	TokenNameIdentifier	 get Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
executor	TokenNameIdentifier	 executor
.	TokenNameDOT	
isShutdown	TokenNameIdentifier	 is Shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
)	TokenNameRPAREN	
executor	TokenNameIdentifier	 executor
)	TokenNameRPAREN	
.	TokenNameDOT	
onFinalRejection	TokenNameIdentifier	 on Final Rejection
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RejectedExecutionException	TokenNameIdentifier	 Rejected Execution Exception
(	TokenNameLPAREN	
"ThreadPoolExecutor has shut down"	TokenNameStringLiteral	ThreadPoolExecutor has shut down
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
offer	TokenNameIdentifier	 offer
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
)	TokenNameRPAREN	
executor	TokenNameIdentifier	 executor
)	TokenNameRPAREN	
.	TokenNameDOT	
onFinalAccept	TokenNameIdentifier	 on Final Accept
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
,	TokenNameCOMMA	
new	TokenNamenew	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
(	TokenNameLPAREN	
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
(	TokenNameLPAREN	
int	TokenNameint	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
long	TokenNamelong	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
ThreadFactory	TokenNameIdentifier	 Thread Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
(	TokenNameLPAREN	
int	TokenNameint	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
int	TokenNameint	
maximumPoolSize	TokenNameIdentifier	 maximum Pool Size
,	TokenNameCOMMA	
long	TokenNamelong	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
workQueue	TokenNameIdentifier	 work Queue
,	TokenNameCOMMA	
ThreadFactory	TokenNameIdentifier	 Thread Factory
threadFactory	TokenNameIdentifier	 thread Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
maximumPoolSize	TokenNameIdentifier	 maximum Pool Size
,	TokenNameCOMMA	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
workQueue	TokenNameIdentifier	 work Queue
,	TokenNameCOMMA	
threadFactory	TokenNameIdentifier	 thread Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
allowCoreThreadTimeOut	TokenNameIdentifier	 allow Core Thread Time Out
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// block task submissions until queue has room. 	TokenNameCOMMENT_LINE	block task submissions until queue has room. 
// this is fighting TPE's design a bit because TPE rejects if queue.offer reports a full queue. 	TokenNameCOMMENT_LINE	this is fighting TPE's design a bit because TPE rejects if queue.offer reports a full queue. 
// we'll just override this with a handler that retries until it gets in. ugly, but effective. 	TokenNameCOMMENT_LINE	we'll just override this with a handler that retries until it gets in. ugly, but effective. 
// (there is an extensive analysis of the options here at 	TokenNameCOMMENT_LINE	(there is an extensive analysis of the options here at 
// http://today.java.net/pub/a/today/2008/10/23/creating-a-notifying-blocking-thread-pool-executor.html) 	TokenNameCOMMENT_LINE	http://today.java.net/pub/a/today/2008/10/23/creating-a-notifying-blocking-thread-pool-executor.html) 
this	TokenNamethis	
.	TokenNameDOT	
setRejectedExecutionHandler	TokenNameIdentifier	 set Rejected Execution Handler
(	TokenNameLPAREN	
blockingExecutionHandler	TokenNameIdentifier	 blocking Execution Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a ThreadPoolExecutor with a fixed number of threads. * When all threads are actively executing tasks, new tasks are queued. * If (most) threads are expected to be idle most of the time, prefer createWithMaxSize() instead. * @param threadPoolName the name of the threads created by this executor * @param size the fixed number of threads for this executor * @return the new DebuggableThreadPoolExecutor */	TokenNameCOMMENT_JAVADOC	 Returns a ThreadPoolExecutor with a fixed number of threads. When all threads are actively executing tasks, new tasks are queued. If (most) threads are expected to be idle most of the time, prefer createWithMaxSize() instead. @param threadPoolName the name of the threads created by this executor @param size the fixed number of threads for this executor @return the new DebuggableThreadPoolExecutor 
public	TokenNamepublic	
static	TokenNamestatic	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
createWithFixedPoolSize	TokenNameIdentifier	 create With Fixed Pool Size
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createWithMaximumPoolSize	TokenNameIdentifier	 create With Maximum Pool Size
(	TokenNameLPAREN	
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a ThreadPoolExecutor with a fixed maximum number of threads, but whose * threads are terminated when idle for too long. * When all threads are actively executing tasks, new tasks are queued. * @param threadPoolName the name of the threads created by this executor * @param size the maximum number of threads for this executor * @param keepAliveTime the time an idle thread is kept alive before being terminated * @param unit tht time unit for {@code keepAliveTime} * @return the new DebuggableThreadPoolExecutor */	TokenNameCOMMENT_JAVADOC	 Returns a ThreadPoolExecutor with a fixed maximum number of threads, but whose threads are terminated when idle for too long. When all threads are actively executing tasks, new tasks are queued. @param threadPoolName the name of the threads created by this executor @param size the maximum number of threads for this executor @param keepAliveTime the time an idle thread is kept alive before being terminated @param unit tht time unit for {@code keepAliveTime} @return the new DebuggableThreadPoolExecutor 
public	TokenNamepublic	
static	TokenNamestatic	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
createWithMaximumPoolSize	TokenNameIdentifier	 create With Maximum Pool Size
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
int	TokenNameint	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
new	TokenNamenew	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
(	TokenNameLPAREN	
threadPoolName	TokenNameIdentifier	 thread Pool Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
onInitialRejection	TokenNameIdentifier	 on Initial Rejection
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
onFinalAccept	TokenNameIdentifier	 on Final Accept
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
onFinalRejection	TokenNameIdentifier	 on Final Rejection
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// execute does not call newTaskFor 	TokenNameCOMMENT_LINE	execute does not call newTaskFor 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
isTracing	TokenNameIdentifier	 is Tracing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
instanceof	TokenNameinstanceof	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
:	TokenNameCOLON	
command	TokenNameIdentifier	 command
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
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTracing	TokenNameIdentifier	 is Tracing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
instanceof	TokenNameinstanceof	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
newTaskFor	TokenNameIdentifier	 new Task For
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
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
if	TokenNameif	
(	TokenNameLPAREN	
isTracing	TokenNameIdentifier	 is Tracing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
callable	TokenNameIdentifier	 callable
instanceof	TokenNameinstanceof	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
callable	TokenNameIdentifier	 callable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
newTaskFor	TokenNameIdentifier	 new Task For
(	TokenNameLPAREN	
callable	TokenNameIdentifier	 callable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
afterExecute	TokenNameIdentifier	 after Execute
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
afterExecute	TokenNameIdentifier	 after Execute
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
instanceof	TokenNameinstanceof	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
tsw	TokenNameIdentifier	 tsw
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
// we have to reset trace state as its presence is what denotes the current thread is tracing 	TokenNameCOMMENT_LINE	we have to reset trace state as its presence is what denotes the current thread is tracing 
// and if left this thread might start tracing unrelated tasks 	TokenNameCOMMENT_LINE	and if left this thread might start tracing unrelated tasks 
tsw	TokenNameIdentifier	 tsw
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logExceptionsAfterExecute	TokenNameIdentifier	 log Exceptions After Execute
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
beforeExecute	TokenNameIdentifier	 before Execute
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
instanceof	TokenNameinstanceof	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
.	TokenNameDOT	
setupContext	TokenNameIdentifier	 setup Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
beforeExecute	TokenNameIdentifier	 before Execute
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Send @param t and any exception wrapped by @param r to the default uncaught exception handler, * or log them if none such is set up */	TokenNameCOMMENT_JAVADOC	 Send @param t and any exception wrapped by @param r to the default uncaught exception handler, or log them if none such is set up 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logExceptionsAfterExecute	TokenNameIdentifier	 log Exceptions After Execute
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
hiddenThrowable	TokenNameIdentifier	 hidden Throwable
=	TokenNameEQUAL	
extractThrowable	TokenNameIdentifier	 extract Throwable
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hiddenThrowable	TokenNameIdentifier	 hidden Throwable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
handleOrLog	TokenNameIdentifier	 handle Or Log
(	TokenNameLPAREN	
hiddenThrowable	TokenNameIdentifier	 hidden Throwable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ThreadPoolExecutor will re-throw exceptions thrown by its Task (which will be seen by 	TokenNameCOMMENT_LINE	ThreadPoolExecutor will re-throw exceptions thrown by its Task (which will be seen by 
// the default uncaught exception handler) so we only need to do anything if that handler 	TokenNameCOMMENT_LINE	the default uncaught exception handler) so we only need to do anything if that handler 
// isn't set up yet. 	TokenNameCOMMENT_LINE	isn't set up yet. 
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
getDefaultUncaughtExceptionHandler	TokenNameIdentifier	 get Default Uncaught Exception Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
handleOrLog	TokenNameIdentifier	 handle Or Log
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Send @param t to the default uncaught exception handler, or log it if none such is set up */	TokenNameCOMMENT_JAVADOC	 Send @param t to the default uncaught exception handler, or log it if none such is set up 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
handleOrLog	TokenNameIdentifier	 handle Or Log
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
getDefaultUncaughtExceptionHandler	TokenNameIdentifier	 get Default Uncaught Exception Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error in ThreadPoolExecutor"	TokenNameStringLiteral	Error in ThreadPoolExecutor
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
getDefaultUncaughtExceptionHandler	TokenNameIdentifier	 get Default Uncaught Exception Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
uncaughtException	TokenNameIdentifier	 uncaught Exception
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return any exception wrapped by @param runnable, i.e., if it is a FutureTask */	TokenNameCOMMENT_JAVADOC	 @return any exception wrapped by @param runnable, i.e., if it is a FutureTask 
public	TokenNamepublic	
static	TokenNamestatic	
Throwable	TokenNameIdentifier	 Throwable
extractThrowable	TokenNameIdentifier	 extract Throwable
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check for exceptions wrapped by FutureTask. We do this by calling get(), which will 	TokenNameCOMMENT_LINE	Check for exceptions wrapped by FutureTask. We do this by calling get(), which will 
// cause it to throw any saved exception. 	TokenNameCOMMENT_LINE	cause it to throw any saved exception. 
// 	TokenNameCOMMENT_LINE	 
// Complicating things, calling get() on a ScheduledFutureTask will block until the task 	TokenNameCOMMENT_LINE	Complicating things, calling get() on a ScheduledFutureTask will block until the task 
// is cancelled. Hence, the extra isDone check beforehand. 	TokenNameCOMMENT_LINE	is cancelled. Hence, the extra isDone check beforehand. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
instanceof	TokenNameinstanceof	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
runnable	TokenNameIdentifier	 runnable
)	TokenNameRPAREN	
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
runnable	TokenNameIdentifier	 runnable
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
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CancellationException	TokenNameIdentifier	 Cancellation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Task cancelled"	TokenNameStringLiteral	Task cancelled
,	TokenNameCOMMA	
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
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used to wrap a Runnable or Callable passed to submit or execute so we can clone the TraceSessionContext and move * it into the worker thread. * * @param <T> */	TokenNameCOMMENT_JAVADOC	 Used to wrap a Runnable or Callable passed to submit or execute so we can clone the TraceSessionContext and move it into the worker thread. * @param <T> 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
extends	TokenNameextends	
FutureTask	TokenNameIdentifier	 Future Task
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
TraceState	TokenNameIdentifier	 Trace State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TraceSessionWrapper	TokenNameIdentifier	 Trace Session Wrapper
(	TokenNameLPAREN	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
callable	TokenNameIdentifier	 callable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
callable	TokenNameIdentifier	 callable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupContext	TokenNameIdentifier	 setup Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
