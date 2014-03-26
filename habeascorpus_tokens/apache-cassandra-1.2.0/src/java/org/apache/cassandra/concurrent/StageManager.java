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
EnumMap	TokenNameIdentifier	 Enum Map
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
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
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * This class manages executor services for Messages recieved: each Message requests * running on a specific "stage" for concurrency control; hence the Map approach, * even though stages (executors) are not created dynamically. */	TokenNameCOMMENT_JAVADOC	 This class manages executor services for Messages recieved: each Message requests running on a specific "stage" for concurrency control; hence the Map approach, even though stages (executors) are not created dynamically. 
public	TokenNamepublic	
class	TokenNameclass	
StageManager	TokenNameIdentifier	 Stage Manager
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
StageManager	TokenNameIdentifier	 Stage Manager
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
EnumMap	TokenNameIdentifier	 Enum Map
<	TokenNameLESS	
Stage	TokenNameIdentifier	 Stage
,	TokenNameCOMMA	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
>	TokenNameGREATER	
stages	TokenNameIdentifier	 stages
=	TokenNameEQUAL	
new	TokenNamenew	
EnumMap	TokenNameIdentifier	 Enum Map
<	TokenNameLESS	
Stage	TokenNameIdentifier	 Stage
,	TokenNameCOMMA	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
>	TokenNameGREATER	
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
KEEPALIVE	TokenNameIdentifier	 KEEPALIVE
=	TokenNameEQUAL	
60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// seconds to keep "extra" threads alive for when idle 	TokenNameCOMMENT_LINE	seconds to keep "extra" threads alive for when idle 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_REPLICATE_ON_WRITE_TASKS	TokenNameIdentifier	 MAX  REPLICATE  ON  WRITE  TASKS
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getAvailableProcessors	TokenNameIdentifier	 get Available Processors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
MUTATION	TokenNameIdentifier	 MUTATION
,	TokenNameCOMMA	
multiThreadedConfigurableStage	TokenNameIdentifier	 multi Threaded Configurable Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
MUTATION	TokenNameIdentifier	 MUTATION
,	TokenNameCOMMA	
getConcurrentWriters	TokenNameIdentifier	 get Concurrent Writers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
READ	TokenNameIdentifier	 READ
,	TokenNameCOMMA	
multiThreadedConfigurableStage	TokenNameIdentifier	 multi Threaded Configurable Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
READ	TokenNameIdentifier	 READ
,	TokenNameCOMMA	
getConcurrentReaders	TokenNameIdentifier	 get Concurrent Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
REQUEST_RESPONSE	TokenNameIdentifier	 REQUEST  RESPONSE
,	TokenNameCOMMA	
multiThreadedStage	TokenNameIdentifier	 multi Threaded Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
REQUEST_RESPONSE	TokenNameIdentifier	 REQUEST  RESPONSE
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getAvailableProcessors	TokenNameIdentifier	 get Available Processors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
INTERNAL_RESPONSE	TokenNameIdentifier	 INTERNAL  RESPONSE
,	TokenNameCOMMA	
multiThreadedStage	TokenNameIdentifier	 multi Threaded Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
INTERNAL_RESPONSE	TokenNameIdentifier	 INTERNAL  RESPONSE
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getAvailableProcessors	TokenNameIdentifier	 get Available Processors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
REPLICATE_ON_WRITE	TokenNameIdentifier	 REPLICATE  ON  WRITE
,	TokenNameCOMMA	
multiThreadedConfigurableStage	TokenNameIdentifier	 multi Threaded Configurable Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
REPLICATE_ON_WRITE	TokenNameIdentifier	 REPLICATE  ON  WRITE
,	TokenNameCOMMA	
getConcurrentReplicators	TokenNameIdentifier	 get Concurrent Replicators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MAX_REPLICATE_ON_WRITE_TASKS	TokenNameIdentifier	 MAX  REPLICATE  ON  WRITE  TASKS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the rest are all single-threaded 	TokenNameCOMMENT_LINE	the rest are all single-threaded 
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
GOSSIP	TokenNameIdentifier	 GOSSIP
,	TokenNameCOMMA	
new	TokenNamenew	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
GOSSIP	TokenNameIdentifier	 GOSSIP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
ANTI_ENTROPY	TokenNameIdentifier	 ANTI  ENTROPY
,	TokenNameCOMMA	
new	TokenNamenew	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
ANTI_ENTROPY	TokenNameIdentifier	 ANTI  ENTROPY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
MIGRATION	TokenNameIdentifier	 MIGRATION
,	TokenNameCOMMA	
new	TokenNamenew	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
MIGRATION	TokenNameIdentifier	 MIGRATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
MISC	TokenNameIdentifier	 MISC
,	TokenNameCOMMA	
new	TokenNamenew	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
MISC	TokenNameIdentifier	 MISC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
READ_REPAIR	TokenNameIdentifier	 READ  REPAIR
,	TokenNameCOMMA	
multiThreadedStage	TokenNameIdentifier	 multi Threaded Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
READ_REPAIR	TokenNameIdentifier	 READ  REPAIR
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getAvailableProcessors	TokenNameIdentifier	 get Available Processors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
TRACING	TokenNameIdentifier	 TRACING
,	TokenNameCOMMA	
tracingExecutor	TokenNameIdentifier	 tracing Executor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
tracingExecutor	TokenNameIdentifier	 tracing Executor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RejectedExecutionHandler	TokenNameIdentifier	 Rejected Execution Handler
reh	TokenNameIdentifier	 reh
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
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
executor	TokenNameIdentifier	 executor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
incrementDroppedMessages	TokenNameIdentifier	 increment Dropped Messages
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
_TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ExecuteOnlyExecutor	TokenNameIdentifier	 Execute Only Executor
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
KEEPALIVE	TokenNameIdentifier	 KEEPALIVE
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
,	TokenNameCOMMA	
new	TokenNamenew	
ArrayBlockingQueue	TokenNameIdentifier	 Array Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
TRACING	TokenNameIdentifier	 TRACING
.	TokenNameDOT	
getJmxName	TokenNameIdentifier	 get Jmx Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reh	TokenNameIdentifier	 reh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
multiThreadedStage	TokenNameIdentifier	 multi Threaded Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
stage	TokenNameIdentifier	 stage
,	TokenNameCOMMA	
int	TokenNameint	
numThreads	TokenNameIdentifier	 num Threads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
numThreads	TokenNameIdentifier	 num Threads
,	TokenNameCOMMA	
KEEPALIVE	TokenNameIdentifier	 KEEPALIVE
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
stage	TokenNameIdentifier	 stage
.	TokenNameDOT	
getJmxName	TokenNameIdentifier	 get Jmx Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stage	TokenNameIdentifier	 stage
.	TokenNameDOT	
getJmxType	TokenNameIdentifier	 get Jmx Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
multiThreadedConfigurableStage	TokenNameIdentifier	 multi Threaded Configurable Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
stage	TokenNameIdentifier	 stage
,	TokenNameCOMMA	
int	TokenNameint	
numThreads	TokenNameIdentifier	 num Threads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
JMXConfigurableThreadPoolExecutor	TokenNameIdentifier	 JMX Configurable Thread Pool Executor
(	TokenNameLPAREN	
numThreads	TokenNameIdentifier	 num Threads
,	TokenNameCOMMA	
KEEPALIVE	TokenNameIdentifier	 KEEPALIVE
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
stage	TokenNameIdentifier	 stage
.	TokenNameDOT	
getJmxName	TokenNameIdentifier	 get Jmx Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stage	TokenNameIdentifier	 stage
.	TokenNameDOT	
getJmxType	TokenNameIdentifier	 get Jmx Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
multiThreadedConfigurableStage	TokenNameIdentifier	 multi Threaded Configurable Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
stage	TokenNameIdentifier	 stage
,	TokenNameCOMMA	
int	TokenNameint	
numThreads	TokenNameIdentifier	 num Threads
,	TokenNameCOMMA	
int	TokenNameint	
maxTasksBeforeBlock	TokenNameIdentifier	 max Tasks Before Block
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
JMXConfigurableThreadPoolExecutor	TokenNameIdentifier	 JMX Configurable Thread Pool Executor
(	TokenNameLPAREN	
numThreads	TokenNameIdentifier	 num Threads
,	TokenNameCOMMA	
KEEPALIVE	TokenNameIdentifier	 KEEPALIVE
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
maxTasksBeforeBlock	TokenNameIdentifier	 max Tasks Before Block
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
(	TokenNameLPAREN	
stage	TokenNameIdentifier	 stage
.	TokenNameDOT	
getJmxName	TokenNameIdentifier	 get Jmx Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stage	TokenNameIdentifier	 stage
.	TokenNameDOT	
getJmxType	TokenNameIdentifier	 get Jmx Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve a stage from the StageManager * @param stage name of the stage to be retrieved. */	TokenNameCOMMENT_JAVADOC	 Retrieve a stage from the StageManager @param stage name of the stage to be retrieved. 
public	TokenNamepublic	
static	TokenNamestatic	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
getStage	TokenNameIdentifier	 get Stage
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
stage	TokenNameIdentifier	 stage
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
stage	TokenNameIdentifier	 stage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method shuts down all registered stages. */	TokenNameCOMMENT_JAVADOC	 This method shuts down all registered stages. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
shutdownNow	TokenNameIdentifier	 shutdown Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
stage	TokenNameIdentifier	 stage
:	TokenNameCOLON	
Stage	TokenNameIdentifier	 Stage
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StageManager	TokenNameIdentifier	 Stage Manager
.	TokenNameDOT	
stages	TokenNameIdentifier	 stages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
stage	TokenNameIdentifier	 stage
)	TokenNameRPAREN	
.	TokenNameDOT	
shutdownNow	TokenNameIdentifier	 shutdown Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A TPE that disallows submit so that we don't need to worry about unwrapping exceptions on the * tracing stage. See CASSANDRA-1123 for background. */	TokenNameCOMMENT_JAVADOC	 A TPE that disallows submit so that we don't need to worry about unwrapping exceptions on the tracing stage. See CASSANDRA-1123 for background. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ExecuteOnlyExecutor	TokenNameIdentifier	 Execute Only Executor
extends	TokenNameextends	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
{	TokenNameLBRACE	
public	TokenNamepublic	
ExecuteOnlyExecutor	TokenNameIdentifier	 Execute Only Executor
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
,	TokenNameCOMMA	
RejectedExecutionHandler	TokenNameIdentifier	 Rejected Execution Handler
handler	TokenNameIdentifier	 handler
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
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
