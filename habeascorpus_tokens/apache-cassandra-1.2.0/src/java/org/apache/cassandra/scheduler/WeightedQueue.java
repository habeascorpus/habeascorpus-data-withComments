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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
SynchronousQueue	TokenNameIdentifier	 Synchronous Queue
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
TimeUnit	TokenNameIdentifier	 Time Unit
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ManagementFactory	TokenNameIdentifier	 Management Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MBeanServer	TokenNameIdentifier	 M Bean Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ObjectName	TokenNameIdentifier	 Object Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
LatencyMetrics	TokenNameIdentifier	 Latency Metrics
;	TokenNameSEMICOLON	
class	TokenNameclass	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
implements	TokenNameimplements	
WeightedQueueMBean	TokenNameIdentifier	 Weighted Queue M Bean
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
LatencyMetrics	TokenNameIdentifier	 Latency Metrics
metric	TokenNameIdentifier	 metric
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SynchronousQueue	TokenNameIdentifier	 Synchronous Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
SynchronousQueue	TokenNameIdentifier	 Synchronous Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
metric	TokenNameIdentifier	 metric
=	TokenNameEQUAL	
new	TokenNamenew	
LatencyMetrics	TokenNameIdentifier	 Latency Metrics
(	TokenNameLPAREN	
"org.apache.cassandra.metrics"	TokenNameStringLiteral	org.apache.cassandra.metrics
,	TokenNameCOMMA	
"scheduler"	TokenNameStringLiteral	scheduler
,	TokenNameCOMMA	
"WeightedQueue"	TokenNameStringLiteral	WeightedQueue
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expose monitoring data 	TokenNameCOMMENT_LINE	expose monitoring data 
MBeanServer	TokenNameIdentifier	 M Bean Server
mbs	TokenNameIdentifier	 mbs
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getPlatformMBeanServer	TokenNameIdentifier	 get Platform M Bean Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
mbs	TokenNameIdentifier	 mbs
.	TokenNameDOT	
registerMBean	TokenNameIdentifier	 register M Bean
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
ObjectName	TokenNameIdentifier	 Object Name
(	TokenNameLPAREN	
"org.apache.cassandra.scheduler:type=WeightedQueue,queue="	TokenNameStringLiteral	org.apache.cassandra.scheduler:type=WeightedQueue,queue=
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
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
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
long	TokenNamelong	
timeoutMS	TokenNameIdentifier	 timeout MS
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
,	TokenNameCOMMA	
TimeoutException	TokenNameIdentifier	 Timeout Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
offer	TokenNameIdentifier	 offer
(	TokenNameLPAREN	
new	TokenNamenew	
WeightedQueue	TokenNameIdentifier	 Weighted Queue
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timeoutMS	TokenNameIdentifier	 timeout MS
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TimeoutException	TokenNameIdentifier	 Timeout Exception
(	TokenNameLPAREN	
"Failed to acquire request scheduler slot for '"	TokenNameStringLiteral	Failed to acquire request scheduler slot for '
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Thread	TokenNameIdentifier	 Thread
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
metric	TokenNameIdentifier	 metric
.	TokenNameDOT	
addNano	TokenNameIdentifier	 add Nano
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
creationTime	TokenNameIdentifier	 creation Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
thread	TokenNameIdentifier	 thread
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"RoundRobinScheduler.WeightedQueue(key="	TokenNameStringLiteral	RoundRobinScheduler.WeightedQueue(key=
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
" weight="	TokenNameStringLiteral	 weight=
+	TokenNamePLUS	
weight	TokenNameIdentifier	 weight
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
creationTime	TokenNameIdentifier	 creation Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
nanoTime	TokenNameIdentifier	 nano Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
thread	TokenNameIdentifier	 thread
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** MBean related methods */	TokenNameCOMMENT_JAVADOC	 MBean related methods 
public	TokenNamepublic	
long	TokenNamelong	
getOperations	TokenNameIdentifier	 get Operations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metric	TokenNameIdentifier	 metric
.	TokenNameDOT	
latency	TokenNameIdentifier	 latency
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTotalLatencyMicros	TokenNameIdentifier	 get Total Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metric	TokenNameIdentifier	 metric
.	TokenNameDOT	
totalLatency	TokenNameIdentifier	 total Latency
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getRecentLatencyMicros	TokenNameIdentifier	 get Recent Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metric	TokenNameIdentifier	 metric
.	TokenNameDOT	
getRecentLatency	TokenNameIdentifier	 get Recent Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTotalLatencyHistogramMicros	TokenNameIdentifier	 get Total Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metric	TokenNameIdentifier	 metric
.	TokenNameDOT	
totalLatencyHistogram	TokenNameIdentifier	 total Latency Histogram
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecentLatencyHistogramMicros	TokenNameIdentifier	 get Recent Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metric	TokenNameIdentifier	 metric
.	TokenNameDOT	
recentLatencyHistogram	TokenNameIdentifier	 recent Latency Histogram
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
