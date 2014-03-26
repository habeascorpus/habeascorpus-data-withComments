/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
stress	TokenNameIdentifier	 stress
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
SynchronousQueue	TokenNameIdentifier	 Synchronous Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
stress	TokenNameIdentifier	 stress
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
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
stress	TokenNameIdentifier	 stress
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CassandraClient	TokenNameIdentifier	 Cassandra Client
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
stress	TokenNameIdentifier	 stress
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Operation	TokenNameIdentifier	 Operation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
StressAction	TokenNameIdentifier	 Stress Action
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
/** * Producer-Consumer model: 1 producer, N consumers */	TokenNameCOMMENT_JAVADOC	 Producer-Consumer model: 1 producer, N consumers 
private	TokenNameprivate	
final	TokenNamefinal	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
Operation	TokenNameIdentifier	 Operation
>	TokenNameGREATER	
operations	TokenNameIdentifier	 operations
=	TokenNameEQUAL	
new	TokenNamenew	
SynchronousQueue	TokenNameIdentifier	 Synchronous Queue
<	TokenNameLESS	
Operation	TokenNameIdentifier	 Operation
>	TokenNameGREATER	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Session	TokenNameIdentifier	 Session
client	TokenNameIdentifier	 client
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SUCCESS	TokenNameIdentifier	 SUCCESS
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FAILURE	TokenNameIdentifier	 FAILURE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
returnCode	TokenNameIdentifier	 return Code
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StressAction	TokenNameIdentifier	 Stress Action
(	TokenNameLPAREN	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
latency	TokenNameIdentifier	 latency
,	TokenNameCOMMA	
oldLatency	TokenNameIdentifier	 old Latency
;	TokenNameSEMICOLON	
int	TokenNameint	
epoch	TokenNameIdentifier	 epoch
,	TokenNameCOMMA	
total	TokenNameIdentifier	 total
,	TokenNameCOMMA	
oldTotal	TokenNameIdentifier	 old Total
,	TokenNameCOMMA	
keyCount	TokenNameIdentifier	 key Count
,	TokenNameCOMMA	
oldKeyCount	TokenNameIdentifier	 old Key Count
;	TokenNameSEMICOLON	
// creating keyspace and column families 	TokenNameCOMMENT_LINE	creating keyspace and column families 
if	TokenNameif	
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getOperation	TokenNameIdentifier	 get Operation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Stress	TokenNameIdentifier	 Stress
.	TokenNameDOT	
Operations	TokenNameIdentifier	 Operations
.	TokenNameDOT	
INSERT	TokenNameIdentifier	 INSERT
||	TokenNameOR_OR	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getOperation	TokenNameIdentifier	 get Operation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Stress	TokenNameIdentifier	 Stress
.	TokenNameDOT	
Operations	TokenNameIdentifier	 Operations
.	TokenNameDOT	
COUNTER_ADD	TokenNameIdentifier	 COUNTER  ADD
)	TokenNameRPAREN	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
createKeySpaces	TokenNameIdentifier	 create Key Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
threadCount	TokenNameIdentifier	 thread Count
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getThreads	TokenNameIdentifier	 get Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Consumer	TokenNameIdentifier	 Consumer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
consumers	TokenNameIdentifier	 consumers
=	TokenNameEQUAL	
new	TokenNamenew	
Consumer	TokenNameIdentifier	 Consumer
[	TokenNameLBRACKET	
threadCount	TokenNameIdentifier	 thread Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"total,interval_op_rate,interval_key_rate,avg_latency,elapsed_time"	TokenNameStringLiteral	total,interval_op_rate,interval_key_rate,avg_latency,elapsed_time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
itemsPerThread	TokenNameIdentifier	 items Per Thread
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getKeysPerThread	TokenNameIdentifier	 get Keys Per Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
modulo	TokenNameIdentifier	 modulo
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getNumKeys	TokenNameIdentifier	 get Num Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
threadCount	TokenNameIdentifier	 thread Count
;	TokenNameSEMICOLON	
// creating required type of the threads for the test 	TokenNameCOMMENT_LINE	creating required type of the threads for the test 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
threadCount	TokenNameIdentifier	 thread Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
threadCount	TokenNameIdentifier	 thread Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
itemsPerThread	TokenNameIdentifier	 items Per Thread
+=	TokenNamePLUS_EQUAL	
modulo	TokenNameIdentifier	 modulo
;	TokenNameSEMICOLON	
// last one is going to handle N + modulo items 	TokenNameCOMMENT_LINE	last one is going to handle N + modulo items 
consumers	TokenNameIdentifier	 consumers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Consumer	TokenNameIdentifier	 Consumer
(	TokenNameLPAREN	
itemsPerThread	TokenNameIdentifier	 items Per Thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Producer	TokenNameIdentifier	 Producer
producer	TokenNameIdentifier	 producer
=	TokenNameEQUAL	
new	TokenNamenew	
Producer	TokenNameIdentifier	 Producer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
producer	TokenNameIdentifier	 producer
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// starting worker threads 	TokenNameCOMMENT_LINE	starting worker threads 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
threadCount	TokenNameIdentifier	 thread Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
consumers	TokenNameIdentifier	 consumers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// initialization of the values 	TokenNameCOMMENT_LINE	initialization of the values 
boolean	TokenNameboolean	
terminate	TokenNameIdentifier	 terminate
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
latency	TokenNameIdentifier	 latency
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
epoch	TokenNameIdentifier	 epoch
=	TokenNameEQUAL	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
keyCount	TokenNameIdentifier	 key Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
interval	TokenNameIdentifier	 interval
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getProgressInterval	TokenNameIdentifier	 get Progress Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
epochIntervals	TokenNameIdentifier	 epoch Intervals
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getProgressInterval	TokenNameIdentifier	 get Progress Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
testStartTime	TokenNameIdentifier	 test Start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
terminate	TokenNameIdentifier	 terminate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
producer	TokenNameIdentifier	 producer
.	TokenNameDOT	
stopProducer	TokenNameIdentifier	 stop Producer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Consumer	TokenNameIdentifier	 Consumer
consumer	TokenNameIdentifier	 consumer
:	TokenNameCOLON	
consumers	TokenNameIdentifier	 consumers
)	TokenNameRPAREN	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
stopConsume	TokenNameIdentifier	 stop Consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
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
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
alive	TokenNameIdentifier	 alive
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
:	TokenNameCOLON	
consumers	TokenNameIdentifier	 consumers
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
alive	TokenNameIdentifier	 alive
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
alive	TokenNameIdentifier	 alive
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
terminate	TokenNameIdentifier	 terminate
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
epoch	TokenNameIdentifier	 epoch
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
terminate	TokenNameIdentifier	 terminate
||	TokenNameOR_OR	
epoch	TokenNameIdentifier	 epoch
>	TokenNameGREATER	
epochIntervals	TokenNameIdentifier	 epoch Intervals
)	TokenNameRPAREN	
{	TokenNameLBRACE	
epoch	TokenNameIdentifier	 epoch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
oldTotal	TokenNameIdentifier	 old Total
=	TokenNameEQUAL	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
oldLatency	TokenNameIdentifier	 old Latency
=	TokenNameEQUAL	
latency	TokenNameIdentifier	 latency
;	TokenNameSEMICOLON	
oldKeyCount	TokenNameIdentifier	 old Key Count
=	TokenNameEQUAL	
keyCount	TokenNameIdentifier	 key Count
;	TokenNameSEMICOLON	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keyCount	TokenNameIdentifier	 key Count
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
latency	TokenNameIdentifier	 latency
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
latency	TokenNameIdentifier	 latency
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opDelta	TokenNameIdentifier	 op Delta
=	TokenNameEQUAL	
total	TokenNameIdentifier	 total
-	TokenNameMINUS	
oldTotal	TokenNameIdentifier	 old Total
;	TokenNameSEMICOLON	
int	TokenNameint	
keyDelta	TokenNameIdentifier	 key Delta
=	TokenNameEQUAL	
keyCount	TokenNameIdentifier	 key Count
-	TokenNameMINUS	
oldKeyCount	TokenNameIdentifier	 old Key Count
;	TokenNameSEMICOLON	
double	TokenNamedouble	
latencyDelta	TokenNameIdentifier	 latency Delta
=	TokenNameEQUAL	
latency	TokenNameIdentifier	 latency
-	TokenNameMINUS	
oldLatency	TokenNameIdentifier	 old Latency
;	TokenNameSEMICOLON	
long	TokenNamelong	
currentTimeInSeconds	TokenNameIdentifier	 current Time In Seconds
=	TokenNameEQUAL	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
testStartTime	TokenNameIdentifier	 test Start Time
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formattedDelta	TokenNameIdentifier	 formatted Delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
opDelta	TokenNameIdentifier	 op Delta
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
latencyDelta	TokenNameIdentifier	 latency Delta
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
opDelta	TokenNameIdentifier	 op Delta
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"NaN"	TokenNameStringLiteral	NaN
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%d,%d,%d,%s,%d"	TokenNameStringLiteral	%d,%d,%d,%s,%d
,	TokenNameCOMMA	
total	TokenNameIdentifier	 total
,	TokenNameCOMMA	
opDelta	TokenNameIdentifier	 op Delta
/	TokenNameDIVIDE	
interval	TokenNameIdentifier	 interval
,	TokenNameCOMMA	
keyDelta	TokenNameIdentifier	 key Delta
/	TokenNameDIVIDE	
interval	TokenNameIdentifier	 interval
,	TokenNameCOMMA	
formattedDelta	TokenNameIdentifier	 formatted Delta
,	TokenNameCOMMA	
currentTimeInSeconds	TokenNameIdentifier	 current Time In Seconds
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if any consumer failed, set the return code to failure. 	TokenNameCOMMENT_LINE	if any consumer failed, set the return code to failure. 
returnCode	TokenNameIdentifier	 return Code
=	TokenNameEQUAL	
SUCCESS	TokenNameIdentifier	 SUCCESS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
producer	TokenNameIdentifier	 producer
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
producer	TokenNameIdentifier	 producer
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if producer is still alive it means that we had errors in the consumers 	TokenNameCOMMENT_LINE	if producer is still alive it means that we had errors in the consumers 
returnCode	TokenNameIdentifier	 return Code
=	TokenNameEQUAL	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Consumer	TokenNameIdentifier	 Consumer
consumer	TokenNameIdentifier	 consumer
:	TokenNameCOLON	
consumers	TokenNameIdentifier	 consumers
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
getReturnCode	TokenNameIdentifier	 get Return Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
FAILURE	TokenNameIdentifier	 FAILURE
)	TokenNameRPAREN	
returnCode	TokenNameIdentifier	 return Code
=	TokenNameEQUAL	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
returnCode	TokenNameIdentifier	 return Code
==	TokenNameEQUAL_EQUAL	
SUCCESS	TokenNameIdentifier	 SUCCESS
)	TokenNameRPAREN	
// marking an end of the output to the client 	TokenNameCOMMENT_LINE	marking an end of the output to the client 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"END"	TokenNameStringLiteral	END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"FAILURE"	TokenNameStringLiteral	FAILURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getReturnCode	TokenNameIdentifier	 get Return Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnCode	TokenNameIdentifier	 return Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Produces exactly N items (awaits each to be consumed) */	TokenNameCOMMENT_JAVADOC	 Produces exactly N items (awaits each to be consumed) 
private	TokenNameprivate	
class	TokenNameclass	
Producer	TokenNameIdentifier	 Producer
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
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
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getNumKeys	TokenNameIdentifier	 get Num Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
createOperation	TokenNameIdentifier	 create Operation
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getNumDifferentKeys	TokenNameIdentifier	 get Num Different Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Producer error - "	TokenNameStringLiteral	Producer error - 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
stopProducer	TokenNameIdentifier	 stop Producer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Each consumes exactly N items from queue */	TokenNameCOMMENT_JAVADOC	 Each consumes exactly N items from queue 
private	TokenNameprivate	
class	TokenNameclass	
Consumer	TokenNameIdentifier	 Consumer
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
items	TokenNameIdentifier	 items
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
returnCode	TokenNameIdentifier	 return Code
=	TokenNameEQUAL	
StressAction	TokenNameIdentifier	 Stress Action
.	TokenNameDOT	
SUCCESS	TokenNameIdentifier	 SUCCESS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Consumer	TokenNameIdentifier	 Consumer
(	TokenNameLPAREN	
int	TokenNameint	
toConsume	TokenNameIdentifier	 to Consume
)	TokenNameRPAREN	
{	TokenNameLBRACE	
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
toConsume	TokenNameIdentifier	 to Consume
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CassandraClient	TokenNameIdentifier	 Cassandra Client
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getClient	TokenNameIdentifier	 get Client
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
items	TokenNameIdentifier	 items
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
take	TokenNameIdentifier	 take
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
connection	TokenNameIdentifier	 connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// running job 	TokenNameCOMMENT_LINE	running job 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
returnCode	TokenNameIdentifier	 return Code
=	TokenNameEQUAL	
StressAction	TokenNameIdentifier	 Stress Action
.	TokenNameDOT	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
returnCode	TokenNameIdentifier	 return Code
=	TokenNameEQUAL	
StressAction	TokenNameIdentifier	 Stress Action
.	TokenNameDOT	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
stopConsume	TokenNameIdentifier	 stop Consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getReturnCode	TokenNameIdentifier	 get Return Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnCode	TokenNameIdentifier	 return Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Operation	TokenNameIdentifier	 Operation
createOperation	TokenNameIdentifier	 create Operation
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getOperation	TokenNameIdentifier	 get Operation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
READ	TokenNameIdentifier	 READ
:	TokenNameCOLON	
return	TokenNamereturn	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
isCQL	TokenNameIdentifier	 is CQL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
CqlReader	TokenNameIdentifier	 Cql Reader
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
Reader	TokenNameIdentifier	 Reader
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
COUNTER_GET	TokenNameIdentifier	 COUNTER  GET
:	TokenNameCOLON	
return	TokenNamereturn	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
isCQL	TokenNameIdentifier	 is CQL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
CqlCounterGetter	TokenNameIdentifier	 Cql Counter Getter
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
CounterGetter	TokenNameIdentifier	 Counter Getter
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INSERT	TokenNameIdentifier	 INSERT
:	TokenNameCOLON	
return	TokenNamereturn	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
isCQL	TokenNameIdentifier	 is CQL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
CqlInserter	TokenNameIdentifier	 Cql Inserter
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
Inserter	TokenNameIdentifier	 Inserter
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
COUNTER_ADD	TokenNameIdentifier	 COUNTER  ADD
:	TokenNameCOLON	
return	TokenNamereturn	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
isCQL	TokenNameIdentifier	 is CQL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
CqlCounterAdder	TokenNameIdentifier	 Cql Counter Adder
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
CounterAdder	TokenNameIdentifier	 Counter Adder
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RANGE_SLICE	TokenNameIdentifier	 RANGE  SLICE
:	TokenNameCOLON	
return	TokenNamereturn	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
isCQL	TokenNameIdentifier	 is CQL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
CqlRangeSlicer	TokenNameIdentifier	 Cql Range Slicer
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
RangeSlicer	TokenNameIdentifier	 Range Slicer
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INDEXED_RANGE_SLICE	TokenNameIdentifier	 INDEXED  RANGE  SLICE
:	TokenNameCOLON	
return	TokenNamereturn	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
isCQL	TokenNameIdentifier	 is CQL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
CqlIndexedRangeSlicer	TokenNameIdentifier	 Cql Indexed Range Slicer
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
IndexedRangeSlicer	TokenNameIdentifier	 Indexed Range Slicer
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MULTI_GET	TokenNameIdentifier	 MULTI  GET
:	TokenNameCOLON	
return	TokenNamereturn	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
isCQL	TokenNameIdentifier	 is CQL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
CqlMultiGetter	TokenNameIdentifier	 Cql Multi Getter
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
MultiGetter	TokenNameIdentifier	 Multi Getter
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
stopAction	TokenNameIdentifier	 stop Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
