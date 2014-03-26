/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
scheduler	TokenNameIdentifier	 scheduler
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Semaphore	TokenNameIdentifier	 Semaphore
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
TimeoutException	TokenNameIdentifier	 Timeout Exception
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
config	TokenNameIdentifier	 config
.	TokenNameDOT	
RequestSchedulerOptions	TokenNameIdentifier	 Request Scheduler Options
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
cliffc	TokenNameIdentifier	 cliffc
.	TokenNameDOT	
high_scale_lib	TokenNameIdentifier	 high scale lib
.	TokenNameDOT	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
;	TokenNameSEMICOLON	
/** * A very basic Round Robin implementation of the RequestScheduler. It handles * request groups identified on user/keyspace by placing them in separate * queues and servicing a request from each queue in a RoundRobin fashion. * It optionally adds weights for each round. */	TokenNameCOMMENT_JAVADOC	 A very basic Round Robin implementation of the RequestScheduler. It handles request groups identified on user/keyspace by placing them in separate queues and servicing a request from each queue in a RoundRobin fashion. It optionally adds weights for each round. 
public	TokenNamepublic	
class	TokenNameclass	
RoundRobinScheduler	TokenNameIdentifier	 Round Robin Scheduler
implements	TokenNameimplements	
IRequestScheduler	TokenNameIdentifier	 I Request Scheduler
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
RoundRobinScheduler	TokenNameIdentifier	 Round Robin Scheduler
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Map of queue id to weighted queue 	TokenNameCOMMENT_LINE	Map of queue id to weighted queue 
private	TokenNameprivate	
final	TokenNamefinal	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
>	TokenNameGREATER	
queues	TokenNameIdentifier	 queues
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Semaphore	TokenNameIdentifier	 Semaphore
taskCount	TokenNameIdentifier	 task Count
;	TokenNameSEMICOLON	
// Tracks the count of threads available in all queues 	TokenNameCOMMENT_LINE	Tracks the count of threads available in all queues 
// Used by the the scheduler thread so we don't need to busy-wait until there is a request to process 	TokenNameCOMMENT_LINE	Used by the the scheduler thread so we don't need to busy-wait until there is a request to process 
private	TokenNameprivate	
final	TokenNamefinal	
Semaphore	TokenNameIdentifier	 Semaphore
queueSize	TokenNameIdentifier	 queue Size
=	TokenNameEQUAL	
new	TokenNamenew	
Semaphore	TokenNameIdentifier	 Semaphore
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
defaultWeight	TokenNameIdentifier	 default Weight
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
weights	TokenNameIdentifier	 weights
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RoundRobinScheduler	TokenNameIdentifier	 Round Robin Scheduler
(	TokenNameLPAREN	
RequestSchedulerOptions	TokenNameIdentifier	 Request Scheduler Options
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultWeight	TokenNameIdentifier	 default Weight
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
default_weight	TokenNameIdentifier	 default weight
;	TokenNameSEMICOLON	
weights	TokenNameIdentifier	 weights
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
weights	TokenNameIdentifier	 weights
;	TokenNameSEMICOLON	
// the task count is acquired for the first time _after_ releasing a thread, so we pre-decrement 	TokenNameCOMMENT_LINE	the task count is acquired for the first time _after_ releasing a thread, so we pre-decrement 
taskCount	TokenNameIdentifier	 task Count
=	TokenNameEQUAL	
new	TokenNamenew	
Semaphore	TokenNameIdentifier	 Semaphore
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
throttle_limit	TokenNameIdentifier	 throttle limit
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queues	TokenNameIdentifier	 queues
=	TokenNameEQUAL	
new	TokenNamenew	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
=	TokenNameEQUAL	
new	TokenNamenew	
Runnable	TokenNameIdentifier	 Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schedule	TokenNameIdentifier	 schedule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
scheduler	TokenNameIdentifier	 scheduler
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
"REQUEST-SCHEDULER"	TokenNameStringLiteral	REQUEST-SCHEDULER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scheduler	TokenNameIdentifier	 scheduler
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Started the RoundRobin Request Scheduler"	TokenNameStringLiteral	Started the RoundRobin Request Scheduler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
queue	TokenNameIdentifier	 queue
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
timeoutMS	TokenNameIdentifier	 timeout MS
)	TokenNameRPAREN	
throws	TokenNamethrows	
TimeoutException	TokenNameIdentifier	 Timeout Exception
{	TokenNameLBRACE	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
weightedQueue	TokenNameIdentifier	 weighted Queue
=	TokenNameEQUAL	
getWeightedQueue	TokenNameIdentifier	 get Weighted Queue
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
queueSize	TokenNameIdentifier	 queue Size
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
weightedQueue	TokenNameIdentifier	 weighted Queue
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
timeoutMS	TokenNameIdentifier	 timeout MS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the scheduler will release us when a slot is available 	TokenNameCOMMENT_LINE	the scheduler will release us when a slot is available 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TimeoutException	TokenNameIdentifier	 Timeout Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queueSize	TokenNameIdentifier	 queue Size
.	TokenNameDOT	
acquireUninterruptibly	TokenNameIdentifier	 acquire Uninterruptibly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queueSize	TokenNameIdentifier	 queue Size
.	TokenNameDOT	
acquireUninterruptibly	TokenNameIdentifier	 acquire Uninterruptibly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
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
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Interrupted while queueing requests"	TokenNameStringLiteral	Interrupted while queueing requests
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
taskCount	TokenNameIdentifier	 task Count
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
schedule	TokenNameIdentifier	 schedule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queueSize	TokenNameIdentifier	 queue Size
.	TokenNameDOT	
acquireUninterruptibly	TokenNameIdentifier	 acquire Uninterruptibly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
>	TokenNameGREATER	
request	TokenNameIdentifier	 request
:	TokenNameCOLON	
queues	TokenNameIdentifier	 queues
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Using the weight, process that many requests at a time (for that scheduler id) 	TokenNameCOMMENT_LINE	Using the weight, process that many requests at a time (for that scheduler id) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
taskCount	TokenNameIdentifier	 task Count
.	TokenNameDOT	
acquireUninterruptibly	TokenNameIdentifier	 acquire Uninterruptibly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queueSize	TokenNameIdentifier	 queue Size
.	TokenNameDOT	
acquireUninterruptibly	TokenNameIdentifier	 acquire Uninterruptibly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
queueSize	TokenNameIdentifier	 queue Size
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Get the Queue for the respective id, if one is not available * create a new queue for that corresponding id and return it */	TokenNameCOMMENT_BLOCK	 Get the Queue for the respective id, if one is not available create a new queue for that corresponding id and return it 
private	TokenNameprivate	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
getWeightedQueue	TokenNameIdentifier	 get Weighted Queue
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
weightedQueue	TokenNameIdentifier	 weighted Queue
=	TokenNameEQUAL	
queues	TokenNameIdentifier	 queues
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
weightedQueue	TokenNameIdentifier	 weighted Queue
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// queue existed 	TokenNameCOMMENT_LINE	queue existed 
return	TokenNamereturn	
weightedQueue	TokenNameIdentifier	 weighted Queue
;	TokenNameSEMICOLON	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
maybenew	TokenNameIdentifier	 maybenew
=	TokenNameEQUAL	
new	TokenNamenew	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
weightedQueue	TokenNameIdentifier	 weighted Queue
=	TokenNameEQUAL	
queues	TokenNameIdentifier	 queues
.	TokenNameDOT	
putIfAbsent	TokenNameIdentifier	 put If Absent
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
maybenew	TokenNameIdentifier	 maybenew
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
weightedQueue	TokenNameIdentifier	 weighted Queue
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// created new queue: register for monitoring 	TokenNameCOMMENT_LINE	created new queue: register for monitoring 
maybenew	TokenNameIdentifier	 maybenew
.	TokenNameDOT	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
maybenew	TokenNameIdentifier	 maybenew
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// another thread created the queue 	TokenNameCOMMENT_LINE	another thread created the queue 
return	TokenNamereturn	
weightedQueue	TokenNameIdentifier	 weighted Queue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Semaphore	TokenNameIdentifier	 Semaphore
getTaskCount	TokenNameIdentifier	 get Task Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
taskCount	TokenNameIdentifier	 task Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
weightingVar	TokenNameIdentifier	 weighting Var
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
weights	TokenNameIdentifier	 weights
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
weights	TokenNameIdentifier	 weights
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
weightingVar	TokenNameIdentifier	 weighting Var
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
weights	TokenNameIdentifier	 weights
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
weightingVar	TokenNameIdentifier	 weighting Var
)	TokenNameRPAREN	
:	TokenNameCOLON	
defaultWeight	TokenNameIdentifier	 default Weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
