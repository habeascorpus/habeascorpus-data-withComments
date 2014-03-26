/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
/** * This class represents an object which queues Runnable objects for * invocation in a single thread. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: RunnableQueue.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents an object which queues Runnable objects for invocation in a single thread. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: RunnableQueue.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
/** * Type-safe enumeration of queue states. */	TokenNameCOMMENT_JAVADOC	 Type-safe enumeration of queue states. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
RunnableQueueState	TokenNameIdentifier	 Runnable Queue State
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RunnableQueueState	TokenNameIdentifier	 Runnable Queue State
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[RunnableQueueState: "	TokenNameStringLiteral	[RunnableQueueState: 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
']'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The queue is in the process of running tasks. */	TokenNameCOMMENT_JAVADOC	 The queue is in the process of running tasks. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RunnableQueueState	TokenNameIdentifier	 Runnable Queue State
RUNNING	TokenNameIdentifier	 RUNNING
=	TokenNameEQUAL	
new	TokenNamenew	
RunnableQueueState	TokenNameIdentifier	 Runnable Queue State
(	TokenNameLPAREN	
"Running"	TokenNameStringLiteral	Running
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The queue may still be running tasks but as soon as possible * will go to SUSPENDED state. */	TokenNameCOMMENT_JAVADOC	 The queue may still be running tasks but as soon as possible will go to SUSPENDED state. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RunnableQueueState	TokenNameIdentifier	 Runnable Queue State
SUSPENDING	TokenNameIdentifier	 SUSPENDING
=	TokenNameEQUAL	
new	TokenNamenew	
RunnableQueueState	TokenNameIdentifier	 Runnable Queue State
(	TokenNameLPAREN	
"Suspending"	TokenNameStringLiteral	Suspending
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The queue is no longer running any tasks and will not * run any tasks until resumeExecution is called. */	TokenNameCOMMENT_JAVADOC	 The queue is no longer running any tasks and will not run any tasks until resumeExecution is called. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RunnableQueueState	TokenNameIdentifier	 Runnable Queue State
SUSPENDED	TokenNameIdentifier	 SUSPENDED
=	TokenNameEQUAL	
new	TokenNamenew	
RunnableQueueState	TokenNameIdentifier	 Runnable Queue State
(	TokenNameLPAREN	
"Suspended"	TokenNameStringLiteral	Suspended
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The Suspension state of this thread. */	TokenNameCOMMENT_JAVADOC	 The Suspension state of this thread. 
protected	TokenNameprotected	
volatile	TokenNamevolatile	
RunnableQueueState	TokenNameIdentifier	 Runnable Queue State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
/** * Object to synchronize/wait/notify for suspension * issues. */	TokenNameCOMMENT_JAVADOC	 Object to synchronize/wait/notify for suspension issues. 
protected	TokenNameprotected	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
stateLock	TokenNameIdentifier	 state Lock
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to indicate if the queue was resumed while * still running, so a 'resumed' event can be sent. */	TokenNameCOMMENT_JAVADOC	 Used to indicate if the queue was resumed while still running, so a 'resumed' event can be sent. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
wasResumed	TokenNameIdentifier	 was Resumed
;	TokenNameSEMICOLON	
/** * The Runnable objects list, also used as synchronization point * for pushing/poping runables. */	TokenNameCOMMENT_JAVADOC	 The Runnable objects list, also used as synchronization point for pushing/poping runables. 
private	TokenNameprivate	
final	TokenNamefinal	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Count of preempt entries in queue, so preempt entries * can be kept properly ordered. */	TokenNameCOMMENT_JAVADOC	 Count of preempt entries in queue, so preempt entries can be kept properly ordered. 
protected	TokenNameprotected	
int	TokenNameint	
preemptCount	TokenNameIdentifier	 preempt Count
;	TokenNameSEMICOLON	
/** * The object which handle run events. */	TokenNameCOMMENT_JAVADOC	 The object which handle run events. 
protected	TokenNameprotected	
RunHandler	TokenNameIdentifier	 Run Handler
runHandler	TokenNameIdentifier	 run Handler
;	TokenNameSEMICOLON	
/** * The current thread. */	TokenNameCOMMENT_JAVADOC	 The current thread. 
protected	TokenNameprotected	
volatile	TokenNamevolatile	
HaltingThread	TokenNameIdentifier	 Halting Thread
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
;	TokenNameSEMICOLON	
/** * The {@link IdleRunnable} to run if the queue is empty. */	TokenNameCOMMENT_JAVADOC	 The {@link IdleRunnable} to run if the queue is empty. 
private	TokenNameprivate	
IdleRunnable	TokenNameIdentifier	 Idle Runnable
idleRunnable	TokenNameIdentifier	 idle Runnable
;	TokenNameSEMICOLON	
/** * The time (in milliseconds) that the idle runnable should be run next. */	TokenNameCOMMENT_JAVADOC	 The time (in milliseconds) that the idle runnable should be run next. 
private	TokenNameprivate	
long	TokenNamelong	
idleRunnableWaitTime	TokenNameIdentifier	 idle Runnable Wait Time
;	TokenNameSEMICOLON	
/** * Creates a new RunnableQueue started in a new thread. * @return a RunnableQueue which is guaranteed to have entered its * <tt>run()</tt> method. */	TokenNameCOMMENT_JAVADOC	 Creates a new RunnableQueue started in a new thread. @return a RunnableQueue which is guaranteed to have entered its <tt>run()</tt> method. 
public	TokenNamepublic	
static	TokenNamestatic	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
createRunnableQueue	TokenNameIdentifier	 create Runnable Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// todo ?? sync on local object has no meaning ?? 	TokenNameCOMMENT_LINE	todo ?? sync on local object has no meaning ?? 
HaltingThread	TokenNameIdentifier	 Halting Thread
ht	TokenNameIdentifier	 ht
=	TokenNameEQUAL	
new	TokenNamenew	
HaltingThread	TokenNameIdentifier	 Halting Thread
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
"RunnableQueue-"	TokenNameStringLiteral	RunnableQueue-
+	TokenNamePLUS	
threadCount	TokenNameIdentifier	 thread Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getThread	TokenNameIdentifier	 get Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
volatile	TokenNamevolatile	
int	TokenNameint	
threadCount	TokenNameIdentifier	 thread Count
;	TokenNameSEMICOLON	
/** * Runs this queue. */	TokenNameCOMMENT_JAVADOC	 Runs this queue. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
)	TokenNameRPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Wake the create method so it knows we are in 	TokenNameCOMMENT_LINE	Wake the create method so it knows we are in 
// our run and ready to go. 	TokenNameCOMMENT_LINE	our run and ready to go. 
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Link	TokenNameIdentifier	 Link
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
Runnable	TokenNameIdentifier	 Runnable
rable	TokenNameIdentifier	 rable
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
callSuspended	TokenNameIdentifier	 call Suspended
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
callResumed	TokenNameIdentifier	 call Resumed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Mutex for suspension work. 	TokenNameCOMMENT_LINE	Mutex for suspension work. 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
stateLock	TokenNameIdentifier	 state Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
RUNNING	TokenNameIdentifier	 RUNNING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
SUSPENDED	TokenNameIdentifier	 SUSPENDED
;	TokenNameSEMICOLON	
callSuspended	TokenNameIdentifier	 call Suspended
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callSuspended	TokenNameIdentifier	 call Suspended
)	TokenNameRPAREN	
executionSuspended	TokenNameIdentifier	 execution Suspended
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
stateLock	TokenNameIdentifier	 state Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
RUNNING	TokenNameIdentifier	 RUNNING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
SUSPENDED	TokenNameIdentifier	 SUSPENDED
;	TokenNameSEMICOLON	
// notify suspendExecution in case it is 	TokenNameCOMMENT_LINE	notify suspendExecution in case it is 
// waiting til we shut down. 	TokenNameCOMMENT_LINE	waiting til we shut down. 
stateLock	TokenNameIdentifier	 state Lock
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Wait until resumeExecution called. 	TokenNameCOMMENT_LINE	Wait until resumeExecution called. 
try	TokenNametry	
{	TokenNameLBRACE	
stateLock	TokenNameIdentifier	 state Lock
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wasResumed	TokenNameIdentifier	 was Resumed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wasResumed	TokenNameIdentifier	 was Resumed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
callResumed	TokenNameIdentifier	 call Resumed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callResumed	TokenNameIdentifier	 call Resumed
)	TokenNameRPAREN	
executionResumed	TokenNameIdentifier	 execution Resumed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The following seriously stress tests the class 	TokenNameCOMMENT_LINE	The following seriously stress tests the class 
// for stuff happening between the two sync blocks. 	TokenNameCOMMENT_LINE	for stuff happening between the two sync blocks. 
// 	TokenNameCOMMENT_LINE	 
// try { 	TokenNameCOMMENT_LINE	try { 
// Thread.sleep(1); 	TokenNameCOMMENT_LINE	Thread.sleep(1); 
// } catch (InterruptedException ie) { } 	TokenNameCOMMENT_LINE	} catch (InterruptedException ie) { } 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
SUSPENDING	TokenNameIdentifier	 SUSPENDING
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Link	TokenNameIdentifier	 Link
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preemptCount	TokenNameIdentifier	 preempt Count
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
preemptCount	TokenNameIdentifier	 preempt Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No item to run, see if there is an idle runnable 	TokenNameCOMMENT_LINE	No item to run, see if there is an idle runnable 
// to run instead. 	TokenNameCOMMENT_LINE	to run instead. 
if	TokenNameif	
(	TokenNameLPAREN	
idleRunnable	TokenNameIdentifier	 idle Runnable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
idleRunnableWaitTime	TokenNameIdentifier	 idle Runnable Wait Time
=	TokenNameEQUAL	
idleRunnable	TokenNameIdentifier	 idle Runnable
.	TokenNameDOT	
getWaitTime	TokenNameIdentifier	 get Wait Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rable	TokenNameIdentifier	 rable
=	TokenNameEQUAL	
idleRunnable	TokenNameIdentifier	 idle Runnable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Wait for a runnable. 	TokenNameCOMMENT_LINE	Wait for a runnable. 
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idleRunnable	TokenNameIdentifier	 idle Runnable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
idleRunnableWaitTime	TokenNameIdentifier	 idle Runnable Wait Time
!=	TokenNameNOT_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
idleRunnableWaitTime	TokenNameIdentifier	 idle Runnable Wait Time
-	TokenNameMINUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// just loop again. 	TokenNameCOMMENT_LINE	just loop again. 
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// start loop over again... 	TokenNameCOMMENT_LINE	start loop over again... 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rable	TokenNameIdentifier	 rable
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
runnable	TokenNameIdentifier	 runnable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
runnableStart	TokenNameIdentifier	 runnable Start
(	TokenNameLPAREN	
rable	TokenNameIdentifier	 rable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
rable	TokenNameIdentifier	 rable
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ThreadDeath	TokenNameIdentifier	 Thread Death
td	TokenNameIdentifier	 td
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Let it kill us... 	TokenNameCOMMENT_LINE	Let it kill us... 
throw	TokenNamethrow	
td	TokenNameIdentifier	 td
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Might be nice to notify someone directly. 	TokenNameCOMMENT_LINE	Might be nice to notify someone directly. 
// But this is more or less what Swing does. 	TokenNameCOMMENT_LINE	But this is more or less what Swing does. 
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Notify something waiting on the runnable just completed, 	TokenNameCOMMENT_LINE	Notify something waiting on the runnable just completed, 
// if we just ran one from the queue. 	TokenNameCOMMENT_LINE	if we just ran one from the queue. 
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
unlock	TokenNameIdentifier	 unlock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
runnableInvoked	TokenNameIdentifier	 runnable Invoked
(	TokenNameLPAREN	
rable	TokenNameIdentifier	 rable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the thread in which the RunnableQueue is currently running. * @return null if the RunnableQueue has not entered his * <tt>run()</tt> method. */	TokenNameCOMMENT_JAVADOC	 Returns the thread in which the RunnableQueue is currently running. @return null if the RunnableQueue has not entered his <tt>run()</tt> method. 
public	TokenNamepublic	
HaltingThread	TokenNameIdentifier	 Halting Thread
getThread	TokenNameIdentifier	 get Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Schedules the given Runnable object for a later invocation, and * returns. * An exception is thrown if the RunnableQueue was not started. * @throws IllegalStateException if getThread() is null. */	TokenNameCOMMENT_JAVADOC	 Schedules the given Runnable object for a later invocation, and returns. An exception is thrown if the RunnableQueue was not started. @throws IllegalStateException if getThread() is null. 
public	TokenNamepublic	
void	TokenNamevoid	
invokeLater	TokenNameIdentifier	 invoke Later
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"RunnableQueue not started or has exited"	TokenNameStringLiteral	RunnableQueue not started or has exited
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
new	TokenNamenew	
Link	TokenNameIdentifier	 Link
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Waits until the given Runnable's <tt>run()</tt> has returned. * <em>Note: <tt>invokeAndWait()</tt> must not be called from the * current thread (for example from the <tt>run()</tt> method of the * argument).</em> * @throws IllegalStateException if getThread() is null or if the * thread returned by getThread() is the current one. */	TokenNameCOMMENT_JAVADOC	 Waits until the given Runnable's <tt>run()</tt> has returned. <em>Note: <tt>invokeAndWait()</tt> must not be called from the current thread (for example from the <tt>run()</tt> method of the argument).</em> @throws IllegalStateException if getThread() is null or if the thread returned by getThread() is the current one. 
public	TokenNamepublic	
void	TokenNamevoid	
invokeAndWait	TokenNameIdentifier	 invoke And Wait
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"RunnableQueue not started or has exited"	TokenNameStringLiteral	RunnableQueue not started or has exited
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
==	TokenNameEQUAL_EQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Cannot be called from the RunnableQueue thread"	TokenNameStringLiteral	Cannot be called from the RunnableQueue thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LockableLink	TokenNameIdentifier	 Lockable Link
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
LockableLink	TokenNameIdentifier	 Lockable Link
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
lock	TokenNameIdentifier	 lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Schedules the given Runnable object for a later invocation, and * returns. The given runnable preempts any runnable that is not * currently executing (ie the next runnable started will be the * one given). An exception is thrown if the RunnableQueue was * not started. * @throws IllegalStateException if getThread() is null. */	TokenNameCOMMENT_JAVADOC	 Schedules the given Runnable object for a later invocation, and returns. The given runnable preempts any runnable that is not currently executing (ie the next runnable started will be the one given). An exception is thrown if the RunnableQueue was not started. @throws IllegalStateException if getThread() is null. 
public	TokenNamepublic	
void	TokenNamevoid	
preemptLater	TokenNameIdentifier	 preempt Later
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"RunnableQueue not started or has exited"	TokenNameStringLiteral	RunnableQueue not started or has exited
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
preemptCount	TokenNameIdentifier	 preempt Count
,	TokenNameCOMMA	
new	TokenNamenew	
Link	TokenNameIdentifier	 Link
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preemptCount	TokenNameIdentifier	 preempt Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Waits until the given Runnable's <tt>run()</tt> has returned. * The given runnable preempts any runnable that is not currently * executing (ie the next runnable started will be the one given). * <em>Note: <tt>preemptAndWait()</tt> must not be called from the * current thread (for example from the <tt>run()</tt> method of the * argument). * @throws IllegalStateException if getThread() is null or if the * thread returned by getThread() is the current one. */	TokenNameCOMMENT_JAVADOC	 Waits until the given Runnable's <tt>run()</tt> has returned. The given runnable preempts any runnable that is not currently executing (ie the next runnable started will be the one given). <em>Note: <tt>preemptAndWait()</tt> must not be called from the current thread (for example from the <tt>run()</tt> method of the argument). @throws IllegalStateException if getThread() is null or if the thread returned by getThread() is the current one. 
public	TokenNamepublic	
void	TokenNamevoid	
preemptAndWait	TokenNameIdentifier	 preempt And Wait
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"RunnableQueue not started or has exited"	TokenNameStringLiteral	RunnableQueue not started or has exited
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
==	TokenNameEQUAL_EQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Cannot be called from the RunnableQueue thread"	TokenNameStringLiteral	Cannot be called from the RunnableQueue thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LockableLink	TokenNameIdentifier	 Lockable Link
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
LockableLink	TokenNameIdentifier	 Lockable Link
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
preemptCount	TokenNameIdentifier	 preempt Count
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preemptCount	TokenNameIdentifier	 preempt Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
lock	TokenNameIdentifier	 lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RunnableQueueState	TokenNameIdentifier	 Runnable Queue State
getQueueState	TokenNameIdentifier	 get Queue State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
stateLock	TokenNameIdentifier	 state Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Suspends the execution of this queue after the current runnable * completes. * @param waitTillSuspended if true this method will not return * until the queue has suspended (no runnable in progress * or about to be in progress). If resumeExecution is * called while waiting will simply return (this really * indicates a race condition in your code). This may * return before an associated RunHandler is notified. * @throws IllegalStateException if getThread() is null. */	TokenNameCOMMENT_JAVADOC	 Suspends the execution of this queue after the current runnable completes. @param waitTillSuspended if true this method will not return until the queue has suspended (no runnable in progress or about to be in progress). If resumeExecution is called while waiting will simply return (this really indicates a race condition in your code). This may return before an associated RunHandler is notified. @throws IllegalStateException if getThread() is null. 
public	TokenNamepublic	
void	TokenNamevoid	
suspendExecution	TokenNameIdentifier	 suspend Execution
(	TokenNameLPAREN	
boolean	TokenNameboolean	
waitTillSuspended	TokenNameIdentifier	 wait Till Suspended
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"RunnableQueue not started or has exited"	TokenNameStringLiteral	RunnableQueue not started or has exited
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.err.println("Suspend Called"); 	TokenNameCOMMENT_LINE	System.err.println("Suspend Called"); 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
stateLock	TokenNameIdentifier	 state Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wasResumed	TokenNameIdentifier	 was Resumed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
SUSPENDED	TokenNameIdentifier	 SUSPENDED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// already suspended, notify stateLock so an event is 	TokenNameCOMMENT_LINE	already suspended, notify stateLock so an event is 
// generated. 	TokenNameCOMMENT_LINE	generated. 
stateLock	TokenNameIdentifier	 state Lock
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
RUNNING	TokenNameIdentifier	 RUNNING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
SUSPENDING	TokenNameIdentifier	 SUSPENDING
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Wake up run thread if it is waiting for jobs, 	TokenNameCOMMENT_LINE	Wake up run thread if it is waiting for jobs, 
// so we go into the suspended case (notifying 	TokenNameCOMMENT_LINE	so we go into the suspended case (notifying 
// run-handler etc...) 	TokenNameCOMMENT_LINE	run-handler etc...) 
list	TokenNameIdentifier	 list
.	TokenNameDOT	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
waitTillSuspended	TokenNameIdentifier	 wait Till Suspended
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
SUSPENDING	TokenNameIdentifier	 SUSPENDING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
stateLock	TokenNameIdentifier	 state Lock
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Resumes the execution of this queue. * @throws IllegalStateException if getThread() is null. */	TokenNameCOMMENT_JAVADOC	 Resumes the execution of this queue. @throws IllegalStateException if getThread() is null. 
public	TokenNamepublic	
void	TokenNamevoid	
resumeExecution	TokenNameIdentifier	 resume Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.err.println("Resume Called"); 	TokenNameCOMMENT_LINE	System.err.println("Resume Called"); 
if	TokenNameif	
(	TokenNameLPAREN	
runnableQueueThread	TokenNameIdentifier	 runnable Queue Thread
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"RunnableQueue not started or has exited"	TokenNameStringLiteral	RunnableQueue not started or has exited
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
stateLock	TokenNameIdentifier	 state Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wasResumed	TokenNameIdentifier	 was Resumed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
RUNNING	TokenNameIdentifier	 RUNNING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
RUNNING	TokenNameIdentifier	 RUNNING
;	TokenNameSEMICOLON	
stateLock	TokenNameIdentifier	 state Lock
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wake it up. 	TokenNameCOMMENT_LINE	wake it up. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns iterator lock to use to work with the iterator * returned by iterator(). */	TokenNameCOMMENT_JAVADOC	 Returns iterator lock to use to work with the iterator returned by iterator(). 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getIteratorLock	TokenNameIdentifier	 get Iterator Lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an iterator over the runnables. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator over the runnables. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Link	TokenNameIdentifier	 Link
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Link	TokenNameIdentifier	 Link
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
getHead	TokenNameIdentifier	 get Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Link	TokenNameIdentifier	 Link
link	TokenNameIdentifier	 link
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
link	TokenNameIdentifier	 link
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
link	TokenNameIdentifier	 link
!=	TokenNameNOT_EQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
head	TokenNameIdentifier	 head
==	TokenNameEQUAL_EQUAL	
link	TokenNameIdentifier	 link
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
link	TokenNameIdentifier	 link
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
link	TokenNameIdentifier	 link
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Link	TokenNameIdentifier	 Link
)	TokenNameRPAREN	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
runnable	TokenNameIdentifier	 runnable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
link	TokenNameIdentifier	 link
.	TokenNameDOT	
runnable	TokenNameIdentifier	 runnable
;	TokenNameSEMICOLON	
link	TokenNameIdentifier	 link
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Link	TokenNameIdentifier	 Link
)	TokenNameRPAREN	
link	TokenNameIdentifier	 link
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the RunHandler for this queue. */	TokenNameCOMMENT_JAVADOC	 Sets the RunHandler for this queue. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setRunHandler	TokenNameIdentifier	 set Run Handler
(	TokenNameLPAREN	
RunHandler	TokenNameIdentifier	 Run Handler
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runHandler	TokenNameIdentifier	 run Handler
=	TokenNameEQUAL	
rh	TokenNameIdentifier	 rh
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the RunHandler or null. */	TokenNameCOMMENT_JAVADOC	 Returns the RunHandler or null. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
RunHandler	TokenNameIdentifier	 Run Handler
getRunHandler	TokenNameIdentifier	 get Run Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runHandler	TokenNameIdentifier	 run Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a Runnable to be run whenever the queue is empty. */	TokenNameCOMMENT_JAVADOC	 Sets a Runnable to be run whenever the queue is empty. 
public	TokenNamepublic	
void	TokenNamevoid	
setIdleRunnable	TokenNameIdentifier	 set Idle Runnable
(	TokenNameLPAREN	
IdleRunnable	TokenNameIdentifier	 Idle Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idleRunnable	TokenNameIdentifier	 idle Runnable
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
idleRunnableWaitTime	TokenNameIdentifier	 idle Runnable Wait Time
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when execution is being suspended. * Currently just notifies runHandler */	TokenNameCOMMENT_JAVADOC	 Called when execution is being suspended. Currently just notifies runHandler 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
executionSuspended	TokenNameIdentifier	 execution Suspended
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.err.println("Suspend Sent"); 	TokenNameCOMMENT_LINE	System.err.println("Suspend Sent"); 
if	TokenNameif	
(	TokenNameLPAREN	
runHandler	TokenNameIdentifier	 run Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runHandler	TokenNameIdentifier	 run Handler
.	TokenNameDOT	
executionSuspended	TokenNameIdentifier	 execution Suspended
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when execution is being resumed. * Currently just notifies runHandler */	TokenNameCOMMENT_JAVADOC	 Called when execution is being resumed. Currently just notifies runHandler 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
executionResumed	TokenNameIdentifier	 execution Resumed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.err.println("Resumed Sent"); 	TokenNameCOMMENT_LINE	System.err.println("Resumed Sent"); 
if	TokenNameif	
(	TokenNameLPAREN	
runHandler	TokenNameIdentifier	 run Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runHandler	TokenNameIdentifier	 run Handler
.	TokenNameDOT	
executionResumed	TokenNameIdentifier	 execution Resumed
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called just prior to executing a Runnable. * Currently just notifies runHandler * @param rable The runnable that is about to start */	TokenNameCOMMENT_JAVADOC	 Called just prior to executing a Runnable. Currently just notifies runHandler @param rable The runnable that is about to start 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
runnableStart	TokenNameIdentifier	 runnable Start
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
rable	TokenNameIdentifier	 rable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runHandler	TokenNameIdentifier	 run Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runHandler	TokenNameIdentifier	 run Handler
.	TokenNameDOT	
runnableStart	TokenNameIdentifier	 runnable Start
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
rable	TokenNameIdentifier	 rable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when a Runnable completes. * Currently just notifies runHandler * @param rable The runnable that just completed. */	TokenNameCOMMENT_JAVADOC	 Called when a Runnable completes. Currently just notifies runHandler @param rable The runnable that just completed. 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
runnableInvoked	TokenNameIdentifier	 runnable Invoked
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
rable	TokenNameIdentifier	 rable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runHandler	TokenNameIdentifier	 run Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runHandler	TokenNameIdentifier	 run Handler
.	TokenNameDOT	
runnableInvoked	TokenNameIdentifier	 runnable Invoked
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
rable	TokenNameIdentifier	 rable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A {@link Runnable} that can also inform the caller how long it should * be until it is run again. */	TokenNameCOMMENT_JAVADOC	 A {@link Runnable} that can also inform the caller how long it should be until it is run again. 
public	TokenNamepublic	
interface	TokenNameinterface	
IdleRunnable	TokenNameIdentifier	 Idle Runnable
extends	TokenNameextends	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
/** * Returns the system time that can be safely waited until before this * {@link Runnable} is run again. * * @return time to wait until, <code>0</code> if no waiting can * be done, or {@link Long#MAX_VALUE} if the {@link Runnable} * should not be run again at this time */	TokenNameCOMMENT_JAVADOC	 Returns the system time that can be safely waited until before this {@link Runnable} is run again. * @return time to wait until, <code>0</code> if no waiting can be done, or {@link Long#MAX_VALUE} if the {@link Runnable} should not be run again at this time 
long	TokenNamelong	
getWaitTime	TokenNameIdentifier	 get Wait Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This interface must be implemented by an object which wants to * be notified of run events. */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented by an object which wants to be notified of run events. 
public	TokenNamepublic	
interface	TokenNameinterface	
RunHandler	TokenNameIdentifier	 Run Handler
{	TokenNameLBRACE	
/** * Called just prior to invoking the runnable */	TokenNameCOMMENT_JAVADOC	 Called just prior to invoking the runnable 
void	TokenNamevoid	
runnableStart	TokenNameIdentifier	 runnable Start
(	TokenNameLPAREN	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
rq	TokenNameIdentifier	 rq
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when the given Runnable has just been invoked and * has returned. */	TokenNameCOMMENT_JAVADOC	 Called when the given Runnable has just been invoked and has returned. 
void	TokenNamevoid	
runnableInvoked	TokenNameIdentifier	 runnable Invoked
(	TokenNameLPAREN	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
rq	TokenNameIdentifier	 rq
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when the execution of the queue has been suspended. */	TokenNameCOMMENT_JAVADOC	 Called when the execution of the queue has been suspended. 
void	TokenNamevoid	
executionSuspended	TokenNameIdentifier	 execution Suspended
(	TokenNameLPAREN	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
rq	TokenNameIdentifier	 rq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when the execution of the queue has been resumed. */	TokenNameCOMMENT_JAVADOC	 Called when the execution of the queue has been resumed. 
void	TokenNamevoid	
executionResumed	TokenNameIdentifier	 execution Resumed
(	TokenNameLPAREN	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
rq	TokenNameIdentifier	 rq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is an adapter class that implements the RunHandler interface. * It simply does nothing in response to the calls. */	TokenNameCOMMENT_JAVADOC	 This is an adapter class that implements the RunHandler interface. It simply does nothing in response to the calls. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
RunHandlerAdapter	TokenNameIdentifier	 Run Handler Adapter
implements	TokenNameimplements	
RunHandler	TokenNameIdentifier	 Run Handler
{	TokenNameLBRACE	
/** * Called just prior to invoking the runnable */	TokenNameCOMMENT_JAVADOC	 Called just prior to invoking the runnable 
public	TokenNamepublic	
void	TokenNamevoid	
runnableStart	TokenNameIdentifier	 runnable Start
(	TokenNameLPAREN	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
rq	TokenNameIdentifier	 rq
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when the given Runnable has just been invoked and * has returned. */	TokenNameCOMMENT_JAVADOC	 Called when the given Runnable has just been invoked and has returned. 
public	TokenNamepublic	
void	TokenNamevoid	
runnableInvoked	TokenNameIdentifier	 runnable Invoked
(	TokenNameLPAREN	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
rq	TokenNameIdentifier	 rq
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when the execution of the queue has been suspended. */	TokenNameCOMMENT_JAVADOC	 Called when the execution of the queue has been suspended. 
public	TokenNamepublic	
void	TokenNamevoid	
executionSuspended	TokenNameIdentifier	 execution Suspended
(	TokenNameLPAREN	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
rq	TokenNameIdentifier	 rq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when the execution of the queue has been resumed. */	TokenNameCOMMENT_JAVADOC	 Called when the execution of the queue has been resumed. 
public	TokenNamepublic	
void	TokenNamevoid	
executionResumed	TokenNameIdentifier	 execution Resumed
(	TokenNameLPAREN	
RunnableQueue	TokenNameIdentifier	 Runnable Queue
rq	TokenNameIdentifier	 rq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To store a Runnable. */	TokenNameCOMMENT_JAVADOC	 To store a Runnable. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
Link	TokenNameIdentifier	 Link
extends	TokenNameextends	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
{	TokenNameLBRACE	
/** * The Runnable. */	TokenNameCOMMENT_JAVADOC	 The Runnable. 
private	TokenNameprivate	
final	TokenNamefinal	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
;	TokenNameSEMICOLON	
/** * Creates a new link. */	TokenNameCOMMENT_JAVADOC	 Creates a new link. 
public	TokenNamepublic	
Link	TokenNameIdentifier	 Link
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runnable	TokenNameIdentifier	 runnable
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * unlock link and notify locker. * Basic implementation does nothing. */	TokenNameCOMMENT_JAVADOC	 unlock link and notify locker. Basic implementation does nothing. 
public	TokenNamepublic	
void	TokenNamevoid	
unlock	TokenNameIdentifier	 unlock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To store a Runnable with an object waiting for him to be executed. */	TokenNameCOMMENT_JAVADOC	 To store a Runnable with an object waiting for him to be executed. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
LockableLink	TokenNameIdentifier	 Lockable Link
extends	TokenNameextends	
Link	TokenNameIdentifier	 Link
{	TokenNameLBRACE	
/** * Whether this link is actually locked. */	TokenNameCOMMENT_JAVADOC	 Whether this link is actually locked. 
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
locked	TokenNameIdentifier	 locked
;	TokenNameSEMICOLON	
/** * Creates a new link. */	TokenNameCOMMENT_JAVADOC	 Creates a new link. 
public	TokenNamepublic	
LockableLink	TokenNameIdentifier	 Lockable Link
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether the link is actually locked. */	TokenNameCOMMENT_JAVADOC	 Whether the link is actually locked. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLocked	TokenNameIdentifier	 is Locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locked	TokenNameIdentifier	 locked
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Locks this link. */	TokenNameCOMMENT_JAVADOC	 Locks this link. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
lock	TokenNameIdentifier	 lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
locked	TokenNameIdentifier	 locked
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * unlocks this link. */	TokenNameCOMMENT_JAVADOC	 unlocks this link. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
unlock	TokenNameIdentifier	 unlock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
locked	TokenNameIdentifier	 locked
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Wait until lock is called... 	TokenNameCOMMENT_LINE	Wait until lock is called... 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Loop again... 	TokenNameCOMMENT_LINE	Loop again... 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
locked	TokenNameIdentifier	 locked
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Wake the locking thread... 	TokenNameCOMMENT_LINE	Wake the locking thread... 
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
