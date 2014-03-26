/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Location	TokenNameIdentifier	 Location
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
TaskContainer	TokenNameIdentifier	 Task Container
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
property	TokenNameIdentifier	 property
.	TokenNameDOT	
LocalProperties	TokenNameIdentifier	 Local Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * Executes the contained tasks in separate threads, continuing * once all are completed. * <p> * New behavior allows for the ant script to specify a maximum number of * threads that will be executed in parallel. One should be very careful about * using the <code>waitFor</code> task when specifying <code>threadCount</code> * as it can cause deadlocks if the number of threads is too small or if one of * the nested tasks fails to execute completely. The task selection algorithm * will insure that the tasks listed before a task have started before that * task is started, but it will not insure a successful completion of those * tasks or that those tasks will finish first (i.e. it's a classic race * condition). * </p> * @since Ant 1.4 * * @ant.task category="control" */	TokenNameCOMMENT_JAVADOC	 Executes the contained tasks in separate threads, continuing once all are completed. <p> New behavior allows for the ant script to specify a maximum number of threads that will be executed in parallel. One should be very careful about using the <code>waitFor</code> task when specifying <code>threadCount</code> as it can cause deadlocks if the number of threads is too small or if one of the nested tasks fails to execute completely. The task selection algorithm will insure that the tasks listed before a task have started before that task is started, but it will not insure a successful completion of those tasks or that those tasks will finish first (i.e. it's a classic race condition). </p> @since Ant 1.4 * @ant.task category="control" 
public	TokenNamepublic	
class	TokenNameclass	
Parallel	TokenNameIdentifier	 Parallel
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
TaskContainer	TokenNameIdentifier	 Task Container
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUMBER_TRIES	TokenNameIdentifier	 NUMBER  TRIES
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Class which holds a list of tasks to execute */	TokenNameCOMMENT_JAVADOC	 Class which holds a list of tasks to execute 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TaskList	TokenNameIdentifier	 Task List
implements	TokenNameimplements	
TaskContainer	TokenNameIdentifier	 Task Container
{	TokenNameLBRACE	
/** Collection holding the nested tasks */	TokenNameCOMMENT_JAVADOC	 Collection holding the nested tasks 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
tasks	TokenNameIdentifier	 tasks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a nested task to execute parallel (asynchron). * <p> * @param nestedTask Nested task to be executed in parallel. * must not be null. */	TokenNameCOMMENT_JAVADOC	 Add a nested task to execute parallel (asynchron). <p> @param nestedTask Nested task to be executed in parallel. must not be null. 
public	TokenNamepublic	
void	TokenNamevoid	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Collection holding the nested tasks */	TokenNameCOMMENT_JAVADOC	 Collection holding the nested tasks 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
nestedTasks	TokenNameIdentifier	 nested Tasks
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Semaphore to notify of completed threads */	TokenNameCOMMENT_JAVADOC	 Semaphore to notify of completed threads 
private	TokenNameprivate	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
semaphore	TokenNameIdentifier	 semaphore
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Total number of threads to run */	TokenNameCOMMENT_JAVADOC	 Total number of threads to run 
private	TokenNameprivate	
int	TokenNameint	
numThreads	TokenNameIdentifier	 num Threads
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Total number of threads per processor to run. */	TokenNameCOMMENT_JAVADOC	 Total number of threads per processor to run. 
private	TokenNameprivate	
int	TokenNameint	
numThreadsPerProcessor	TokenNameIdentifier	 num Threads Per Processor
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The timeout period in milliseconds */	TokenNameCOMMENT_JAVADOC	 The timeout period in milliseconds 
private	TokenNameprivate	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
;	TokenNameSEMICOLON	
/** Indicates threads are still running and new threads can be issued */	TokenNameCOMMENT_JAVADOC	 Indicates threads are still running and new threads can be issued 
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
stillRunning	TokenNameIdentifier	 still Running
;	TokenNameSEMICOLON	
/** Indicates that the execution timedout */	TokenNameCOMMENT_JAVADOC	 Indicates that the execution timedout 
private	TokenNameprivate	
boolean	TokenNameboolean	
timedOut	TokenNameIdentifier	 timed Out
;	TokenNameSEMICOLON	
/** * Indicates whether failure of any of the nested tasks should end * execution */	TokenNameCOMMENT_JAVADOC	 Indicates whether failure of any of the nested tasks should end execution 
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnAny	TokenNameIdentifier	 fail On Any
;	TokenNameSEMICOLON	
/** The dameon task list if any */	TokenNameCOMMENT_JAVADOC	 The dameon task list if any 
private	TokenNameprivate	
TaskList	TokenNameIdentifier	 Task List
daemonTasks	TokenNameIdentifier	 daemon Tasks
;	TokenNameSEMICOLON	
/** Accumulation of exceptions messages from all nested tasks */	TokenNameCOMMENT_JAVADOC	 Accumulation of exceptions messages from all nested tasks 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
exceptionMessage	TokenNameIdentifier	 exception Message
;	TokenNameSEMICOLON	
/** Number of exceptions from nested tasks */	TokenNameCOMMENT_JAVADOC	 Number of exceptions from nested tasks 
private	TokenNameprivate	
int	TokenNameint	
numExceptions	TokenNameIdentifier	 num Exceptions
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The first exception encountered */	TokenNameCOMMENT_JAVADOC	 The first exception encountered 
private	TokenNameprivate	
Throwable	TokenNameIdentifier	 Throwable
firstException	TokenNameIdentifier	 first Exception
;	TokenNameSEMICOLON	
/** The location of the first exception */	TokenNameCOMMENT_JAVADOC	 The location of the first exception 
private	TokenNameprivate	
Location	TokenNameIdentifier	 Location
firstLocation	TokenNameIdentifier	 first Location
;	TokenNameSEMICOLON	
/** * Add a group of daemon threads * @param daemonTasks The tasks to be executed as daemon. */	TokenNameCOMMENT_JAVADOC	 Add a group of daemon threads @param daemonTasks The tasks to be executed as daemon. 
public	TokenNamepublic	
void	TokenNamevoid	
addDaemons	TokenNameIdentifier	 add Daemons
(	TokenNameLPAREN	
TaskList	TokenNameIdentifier	 Task List
daemonTasks	TokenNameIdentifier	 daemon Tasks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
daemonTasks	TokenNameIdentifier	 daemon Tasks
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one daemon group is supported"	TokenNameStringLiteral	Only one daemon group is supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
daemonTasks	TokenNameIdentifier	 daemon Tasks
=	TokenNameEQUAL	
daemonTasks	TokenNameIdentifier	 daemon Tasks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Interval to poll for completed threads when threadCount or * threadsPerProcessor is specified. Integer in milliseconds.; optional * * @param pollInterval New value of property pollInterval. */	TokenNameCOMMENT_JAVADOC	 Interval to poll for completed threads when threadCount or threadsPerProcessor is specified. Integer in milliseconds.; optional * @param pollInterval New value of property pollInterval. 
public	TokenNamepublic	
void	TokenNamevoid	
setPollInterval	TokenNameIdentifier	 set Poll Interval
(	TokenNameLPAREN	
int	TokenNameint	
pollInterval	TokenNameIdentifier	 poll Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Control whether a failure in a nested task halts execution. Note that * the task will complete but existing threads will continue to run - they * are not stopped * * @param failOnAny if true any nested task failure causes parallel to * complete. */	TokenNameCOMMENT_JAVADOC	 Control whether a failure in a nested task halts execution. Note that the task will complete but existing threads will continue to run - they are not stopped * @param failOnAny if true any nested task failure causes parallel to complete. 
public	TokenNamepublic	
void	TokenNamevoid	
setFailOnAny	TokenNameIdentifier	 set Fail On Any
(	TokenNameLPAREN	
boolean	TokenNameboolean	
failOnAny	TokenNameIdentifier	 fail On Any
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failOnAny	TokenNameIdentifier	 fail On Any
=	TokenNameEQUAL	
failOnAny	TokenNameIdentifier	 fail On Any
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a nested task to execute in parallel. * @param nestedTask Nested task to be executed in parallel */	TokenNameCOMMENT_JAVADOC	 Add a nested task to execute in parallel. @param nestedTask Nested task to be executed in parallel 
public	TokenNamepublic	
void	TokenNamevoid	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nestedTasks	TokenNameIdentifier	 nested Tasks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dynamically generates the number of threads to execute based on the * number of available processors (via * <code>java.lang.Runtime.availableProcessors()</code>). * Will overwrite the value set in threadCount; optional * @param numThreadsPerProcessor Number of threads to create per available * processor. * */	TokenNameCOMMENT_JAVADOC	 Dynamically generates the number of threads to execute based on the number of available processors (via <code>java.lang.Runtime.availableProcessors()</code>). Will overwrite the value set in threadCount; optional @param numThreadsPerProcessor Number of threads to create per available processor. 
public	TokenNamepublic	
void	TokenNamevoid	
setThreadsPerProcessor	TokenNameIdentifier	 set Threads Per Processor
(	TokenNameLPAREN	
int	TokenNameint	
numThreadsPerProcessor	TokenNameIdentifier	 num Threads Per Processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numThreadsPerProcessor	TokenNameIdentifier	 num Threads Per Processor
=	TokenNameEQUAL	
numThreadsPerProcessor	TokenNameIdentifier	 num Threads Per Processor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Statically determine the maximum number of tasks to execute * simultaneously. If there are less tasks than threads then all will be * executed at once, if there are more then only <code>threadCount</code> * tasks will be executed at one time. If <code>threadsPerProcessor</code> * is set then this value is * ignored.; optional * * @param numThreads total number of threads. * */	TokenNameCOMMENT_JAVADOC	 Statically determine the maximum number of tasks to execute simultaneously. If there are less tasks than threads then all will be executed at once, if there are more then only <code>threadCount</code> tasks will be executed at one time. If <code>threadsPerProcessor</code> is set then this value is ignored.; optional * @param numThreads total number of threads. 
public	TokenNamepublic	
void	TokenNamevoid	
setThreadCount	TokenNameIdentifier	 set Thread Count
(	TokenNameLPAREN	
int	TokenNameint	
numThreads	TokenNameIdentifier	 num Threads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numThreads	TokenNameIdentifier	 num Threads
=	TokenNameEQUAL	
numThreads	TokenNameIdentifier	 num Threads
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the timeout on this set of tasks. If the timeout is reached * before the other threads complete, the execution of this * task completes with an exception. * * Note that existing threads continue to run. * * @param timeout timeout in milliseconds. */	TokenNameCOMMENT_JAVADOC	 Sets the timeout on this set of tasks. If the timeout is reached before the other threads complete, the execution of this task completes with an exception. * Note that existing threads continue to run. * @param timeout timeout in milliseconds. 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
timeout	TokenNameIdentifier	 timeout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the parallel tasks * * @exception BuildException if any of the threads failed. */	TokenNameCOMMENT_JAVADOC	 Execute the parallel tasks * @exception BuildException if any of the threads failed. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
updateThreadCounts	TokenNameIdentifier	 update Thread Counts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numThreads	TokenNameIdentifier	 num Threads
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numThreads	TokenNameIdentifier	 num Threads
=	TokenNameEQUAL	
nestedTasks	TokenNameIdentifier	 nested Tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
spinThreads	TokenNameIdentifier	 spin Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine the number of threads based on the number of processors */	TokenNameCOMMENT_JAVADOC	 Determine the number of threads based on the number of processors 
private	TokenNameprivate	
void	TokenNamevoid	
updateThreadCounts	TokenNameIdentifier	 update Thread Counts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numThreadsPerProcessor	TokenNameIdentifier	 num Threads Per Processor
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numThreads	TokenNameIdentifier	 num Threads
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
availableProcessors	TokenNameIdentifier	 available Processors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
numThreadsPerProcessor	TokenNameIdentifier	 num Threads Per Processor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
processExceptions	TokenNameIdentifier	 process Exceptions
(	TokenNameLPAREN	
TaskRunnable	TokenNameIdentifier	 Task Runnable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
runnables	TokenNameIdentifier	 runnables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runnables	TokenNameIdentifier	 runnables
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
runnables	TokenNameIdentifier	 runnables
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
runnables	TokenNameIdentifier	 runnables
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numExceptions	TokenNameIdentifier	 num Exceptions
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstException	TokenNameIdentifier	 first Exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstException	TokenNameIdentifier	 first Exception
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
&&	TokenNameAND_AND	
firstLocation	TokenNameIdentifier	 first Location
==	TokenNameEQUAL_EQUAL	
Location	TokenNameIdentifier	 Location
.	TokenNameDOT	
UNKNOWN_LOCATION	TokenNameIdentifier	 UNKNOWN  LOCATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstLocation	TokenNameIdentifier	 first Location
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
exceptionMessage	TokenNameIdentifier	 exception Message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptionMessage	TokenNameIdentifier	 exception Message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Spin up required threads with a maximum number active at any given time. * * @exception BuildException if any of the threads failed. */	TokenNameCOMMENT_JAVADOC	 Spin up required threads with a maximum number active at any given time. * @exception BuildException if any of the threads failed. 
private	TokenNameprivate	
void	TokenNamevoid	
spinThreads	TokenNameIdentifier	 spin Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
numTasks	TokenNameIdentifier	 num Tasks
=	TokenNameEQUAL	
nestedTasks	TokenNameIdentifier	 nested Tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TaskRunnable	TokenNameIdentifier	 Task Runnable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
runnables	TokenNameIdentifier	 runnables
=	TokenNameEQUAL	
new	TokenNamenew	
TaskRunnable	TokenNameIdentifier	 Task Runnable
[	TokenNameLBRACKET	
numTasks	TokenNameIdentifier	 num Tasks
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
stillRunning	TokenNameIdentifier	 still Running
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
timedOut	TokenNameIdentifier	 timed Out
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
interrupted	TokenNameIdentifier	 interrupted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
threadNumber	TokenNameIdentifier	 thread Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
nestedTasks	TokenNameIdentifier	 nested Tasks
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
threadNumber	TokenNameIdentifier	 thread Number
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Task	TokenNameIdentifier	 Task
nestedTask	TokenNameIdentifier	 nested Task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runnables	TokenNameIdentifier	 runnables
[	TokenNameLBRACKET	
threadNumber	TokenNameIdentifier	 thread Number
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TaskRunnable	TokenNameIdentifier	 Task Runnable
(	TokenNameLPAREN	
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
maxRunning	TokenNameIdentifier	 max Running
=	TokenNameEQUAL	
numTasks	TokenNameIdentifier	 num Tasks
<	TokenNameLESS	
numThreads	TokenNameIdentifier	 num Threads
?	TokenNameQUESTION	
numTasks	TokenNameIdentifier	 num Tasks
:	TokenNameCOLON	
numThreads	TokenNameIdentifier	 num Threads
;	TokenNameSEMICOLON	
TaskRunnable	TokenNameIdentifier	 Task Runnable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
running	TokenNameIdentifier	 running
=	TokenNameEQUAL	
new	TokenNamenew	
TaskRunnable	TokenNameIdentifier	 Task Runnable
[	TokenNameLBRACKET	
maxRunning	TokenNameIdentifier	 max Running
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
threadNumber	TokenNameIdentifier	 thread Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ThreadGroup	TokenNameIdentifier	 Thread Group
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadGroup	TokenNameIdentifier	 Thread Group
(	TokenNameLPAREN	
"parallel"	TokenNameStringLiteral	parallel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TaskRunnable	TokenNameIdentifier	 Task Runnable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
daemons	TokenNameIdentifier	 daemons
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
daemonTasks	TokenNameIdentifier	 daemon Tasks
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
daemonTasks	TokenNameIdentifier	 daemon Tasks
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
daemons	TokenNameIdentifier	 daemons
=	TokenNameEQUAL	
new	TokenNamenew	
TaskRunnable	TokenNameIdentifier	 Task Runnable
[	TokenNameLBRACKET	
daemonTasks	TokenNameIdentifier	 daemon Tasks
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
semaphore	TokenNameIdentifier	 semaphore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// When we leave this block we can be sure all data is really 	TokenNameCOMMENT_LINE	When we leave this block we can be sure all data is really 
// stored in main memory before the new threads start, the new 	TokenNameCOMMENT_LINE	stored in main memory before the new threads start, the new 
// threads will for sure load the data from main memory. 	TokenNameCOMMENT_LINE	threads will for sure load the data from main memory. 
// 	TokenNameCOMMENT_LINE	 
// This probably is slightly paranoid. 	TokenNameCOMMENT_LINE	This probably is slightly paranoid. 
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
semaphore	TokenNameIdentifier	 semaphore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// start any daemon threads 	TokenNameCOMMENT_LINE	start any daemon threads 
if	TokenNameif	
(	TokenNameLPAREN	
daemons	TokenNameIdentifier	 daemons
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
daemons	TokenNameIdentifier	 daemons
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
daemons	TokenNameIdentifier	 daemons
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TaskRunnable	TokenNameIdentifier	 Task Runnable
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
daemonTasks	TokenNameIdentifier	 daemon Tasks
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
daemonThread	TokenNameIdentifier	 daemon Thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
daemons	TokenNameIdentifier	 daemons
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
daemonThread	TokenNameIdentifier	 daemon Thread
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
daemonThread	TokenNameIdentifier	 daemon Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now run main threads in limited numbers... 	TokenNameCOMMENT_LINE	now run main threads in limited numbers... 
// start initial batch of threads 	TokenNameCOMMENT_LINE	start initial batch of threads 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
maxRunning	TokenNameIdentifier	 max Running
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
runnables	TokenNameIdentifier	 runnables
[	TokenNameLBRACKET	
threadNumber	TokenNameIdentifier	 thread Number
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// start the timeout thread 	TokenNameCOMMENT_LINE	start the timeout thread 
Thread	TokenNameIdentifier	 Thread
timeoutThread	TokenNameIdentifier	 timeout Thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
semaphore	TokenNameIdentifier	 semaphore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stillRunning	TokenNameIdentifier	 still Running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
timedOut	TokenNameIdentifier	 timed Out
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
semaphore	TokenNameIdentifier	 semaphore
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
timeoutThread	TokenNameIdentifier	 timeout Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// now find available running slots for the remaining threads 	TokenNameCOMMENT_LINE	now find available running slots for the remaining threads 
outer	TokenNameIdentifier	 outer
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
threadNumber	TokenNameIdentifier	 thread Number
<	TokenNameLESS	
numTasks	TokenNameIdentifier	 num Tasks
&&	TokenNameAND_AND	
stillRunning	TokenNameIdentifier	 still Running
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
maxRunning	TokenNameIdentifier	 max Running
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isFinished	TokenNameIdentifier	 is Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
runnables	TokenNameIdentifier	 runnables
[	TokenNameLBRACKET	
threadNumber	TokenNameIdentifier	 thread Number
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// continue on outer while loop to get another 	TokenNameCOMMENT_LINE	continue on outer while loop to get another 
// available slot 	TokenNameCOMMENT_LINE	available slot 
continue	TokenNamecontinue	
outer	TokenNameIdentifier	 outer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if we got here all slots in use, so sleep until 	TokenNameCOMMENT_LINE	if we got here all slots in use, so sleep until 
// something happens 	TokenNameCOMMENT_LINE	something happens 
semaphore	TokenNameIdentifier	 semaphore
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// are all threads finished 	TokenNameCOMMENT_LINE	are all threads finished 
outer2	TokenNameIdentifier	 outer2
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
stillRunning	TokenNameIdentifier	 still Running
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
maxRunning	TokenNameIdentifier	 max Running
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isFinished	TokenNameIdentifier	 is Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Thread " + i + " is still 	TokenNameCOMMENT_LINE	System.out.println("Thread " + i + " is still 
// alive "); 	TokenNameCOMMENT_LINE	alive "); 
// still running - wait for it 	TokenNameCOMMENT_LINE	still running - wait for it 
semaphore	TokenNameIdentifier	 semaphore
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
outer2	TokenNameIdentifier	 outer2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
stillRunning	TokenNameIdentifier	 still Running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interrupted	TokenNameIdentifier	 interrupted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
timedOut	TokenNameIdentifier	 timed Out
&&	TokenNameAND_AND	
!	TokenNameNOT	
failOnAny	TokenNameIdentifier	 fail On Any
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// https://issues.apache.org/bugzilla/show_bug.cgi?id=49527 	TokenNameCOMMENT_LINE	https://issues.apache.org/bugzilla/show_bug.cgi?id=49527 
killAll	TokenNameIdentifier	 kill All
(	TokenNameLPAREN	
running	TokenNameIdentifier	 running
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
interrupted	TokenNameIdentifier	 interrupted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Parallel execution interrupted."	TokenNameStringLiteral	Parallel execution interrupted.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
timedOut	TokenNameIdentifier	 timed Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Parallel execution timed out"	TokenNameStringLiteral	Parallel execution timed out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// now did any of the threads throw an exception 	TokenNameCOMMENT_LINE	now did any of the threads throw an exception 
exceptionMessage	TokenNameIdentifier	 exception Message
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numExceptions	TokenNameIdentifier	 num Exceptions
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
firstException	TokenNameIdentifier	 first Exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
firstLocation	TokenNameIdentifier	 first Location
=	TokenNameEQUAL	
Location	TokenNameIdentifier	 Location
.	TokenNameDOT	
UNKNOWN_LOCATION	TokenNameIdentifier	 UNKNOWN  LOCATION
;	TokenNameSEMICOLON	
processExceptions	TokenNameIdentifier	 process Exceptions
(	TokenNameLPAREN	
daemons	TokenNameIdentifier	 daemons
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processExceptions	TokenNameIdentifier	 process Exceptions
(	TokenNameLPAREN	
runnables	TokenNameIdentifier	 runnables
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numExceptions	TokenNameIdentifier	 num Exceptions
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstException	TokenNameIdentifier	 first Exception
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
firstException	TokenNameIdentifier	 first Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
firstException	TokenNameIdentifier	 first Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
numExceptions	TokenNameIdentifier	 num Exceptions
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
exceptionMessage	TokenNameIdentifier	 exception Message
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
firstLocation	TokenNameIdentifier	 first Location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Doesn't do anything if all threads where already gone, * else it tries to interrupt the threads 100 times. * @param running The list of tasks that may currently be running. */	TokenNameCOMMENT_JAVADOC	 Doesn't do anything if all threads where already gone, else it tries to interrupt the threads 100 times. @param running The list of tasks that may currently be running. 
private	TokenNameprivate	
void	TokenNamevoid	
killAll	TokenNameIdentifier	 kill All
(	TokenNameLPAREN	
TaskRunnable	TokenNameIdentifier	 Task Runnable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
running	TokenNameIdentifier	 running
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
oneAlive	TokenNameIdentifier	 one Alive
;	TokenNameSEMICOLON	
int	TokenNameint	
tries	TokenNameIdentifier	 tries
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
oneAlive	TokenNameIdentifier	 one Alive
=	TokenNameEQUAL	
false	TokenNamefalse	
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
running	TokenNameIdentifier	 running
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isFinished	TokenNameIdentifier	 is Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
running	TokenNameIdentifier	 running
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
yield	TokenNameIdentifier	 yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oneAlive	TokenNameIdentifier	 one Alive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oneAlive	TokenNameIdentifier	 one Alive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tries	TokenNameIdentifier	 tries
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
yield	TokenNameIdentifier	 yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
oneAlive	TokenNameIdentifier	 one Alive
&&	TokenNameAND_AND	
tries	TokenNameIdentifier	 tries
<	TokenNameLESS	
NUMBER_TRIES	TokenNameIdentifier	 NUMBER  TRIES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * thread that execs a task */	TokenNameCOMMENT_JAVADOC	 thread that execs a task 
private	TokenNameprivate	
class	TokenNameclass	
TaskRunnable	TokenNameIdentifier	 Task Runnable
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
finished	TokenNameIdentifier	 finished
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
;	TokenNameSEMICOLON	
/** * Construct a new TaskRunnable.<p> * * @param task the Task to be executed in a separate thread */	TokenNameCOMMENT_JAVADOC	 Construct a new TaskRunnable.<p> * @param task the Task to be executed in a separate thread 
TaskRunnable	TokenNameIdentifier	 Task Runnable
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
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
/** * Executes the task within a thread and takes care about * Exceptions raised within the task. */	TokenNameCOMMENT_JAVADOC	 Executes the task within a thread and takes care about Exceptions raised within the task. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
LocalProperties	TokenNameIdentifier	 Local Properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
perform	TokenNameIdentifier	 perform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnAny	TokenNameIdentifier	 fail On Any
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stillRunning	TokenNameIdentifier	 still Running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
semaphore	TokenNameIdentifier	 semaphore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
semaphore	TokenNameIdentifier	 semaphore
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * get any exception that got thrown during execution; * @return an exception or null for no exception/not yet finished */	TokenNameCOMMENT_JAVADOC	 get any exception that got thrown during execution; @return an exception or null for no exception/not yet finished 
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Provides the indicator that the task has been finished. * @return Returns true when the task is finished. */	TokenNameCOMMENT_JAVADOC	 Provides the indicator that the task has been finished. @return Returns true when the task is finished. 
boolean	TokenNameboolean	
isFinished	TokenNameIdentifier	 is Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
finished	TokenNameIdentifier	 finished
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
