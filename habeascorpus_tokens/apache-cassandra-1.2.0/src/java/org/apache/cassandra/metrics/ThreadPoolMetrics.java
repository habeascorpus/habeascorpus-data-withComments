/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
metrics	TokenNameIdentifier	 metrics
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
yammer	TokenNameIdentifier	 yammer
.	TokenNameDOT	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
Metrics	TokenNameIdentifier	 Metrics
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
yammer	TokenNameIdentifier	 yammer
.	TokenNameDOT	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Metrics for {@link ThreadPoolExecutor}. */	TokenNameCOMMENT_JAVADOC	 Metrics for {@link ThreadPoolExecutor}. 
public	TokenNamepublic	
class	TokenNameclass	
ThreadPoolMetrics	TokenNameIdentifier	 Thread Pool Metrics
{	TokenNameLBRACE	
/** Number of active tasks. */	TokenNameCOMMENT_JAVADOC	 Number of active tasks. 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
activeTasks	TokenNameIdentifier	 active Tasks
;	TokenNameSEMICOLON	
/** Number of tasks that had blocked before being accepted (or rejected). */	TokenNameCOMMENT_JAVADOC	 Number of tasks that had blocked before being accepted (or rejected). 
public	TokenNamepublic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
totalBlocked	TokenNameIdentifier	 total Blocked
;	TokenNameSEMICOLON	
/** * Number of tasks currently blocked, waiting to be accepted by * the executor (because all threads are busy and the backing queue is full). */	TokenNameCOMMENT_JAVADOC	 Number of tasks currently blocked, waiting to be accepted by the executor (because all threads are busy and the backing queue is full). 
public	TokenNamepublic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
currentBlocked	TokenNameIdentifier	 current Blocked
;	TokenNameSEMICOLON	
/** Number of completed tasks. */	TokenNameCOMMENT_JAVADOC	 Number of completed tasks. 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
completedTasks	TokenNameIdentifier	 completed Tasks
;	TokenNameSEMICOLON	
/** Number of tasks waiting to be executed. */	TokenNameCOMMENT_JAVADOC	 Number of tasks waiting to be executed. 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
pendingTasks	TokenNameIdentifier	 pending Tasks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MetricNameFactory	TokenNameIdentifier	 Metric Name Factory
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
/** * Create metrics for given ThreadPoolExecutor. * * @param executor Thread pool * @param path Type of thread pool * @param poolName Name of thread pool to identify metrics */	TokenNameCOMMENT_JAVADOC	 Create metrics for given ThreadPoolExecutor. * @param executor Thread pool @param path Type of thread pool @param poolName Name of thread pool to identify metrics 
public	TokenNamepublic	
ThreadPoolMetrics	TokenNameIdentifier	 Thread Pool Metrics
(	TokenNameLPAREN	
final	TokenNamefinal	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
executor	TokenNameIdentifier	 executor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
poolName	TokenNameIdentifier	 pool Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadPoolMetricNameFactory	TokenNameIdentifier	 Thread Pool Metric Name Factory
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
poolName	TokenNameIdentifier	 pool Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activeTasks	TokenNameIdentifier	 active Tasks
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newGauge	TokenNameIdentifier	 new Gauge
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"ActiveTasks"	TokenNameStringLiteral	ActiveTasks
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executor	TokenNameIdentifier	 executor
.	TokenNameDOT	
getActiveCount	TokenNameIdentifier	 get Active Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalBlocked	TokenNameIdentifier	 total Blocked
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"TotalBlockedTasks"	TokenNameStringLiteral	TotalBlockedTasks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentBlocked	TokenNameIdentifier	 current Blocked
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"CurrentlyBlockedTasks"	TokenNameStringLiteral	CurrentlyBlockedTasks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
completedTasks	TokenNameIdentifier	 completed Tasks
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newGauge	TokenNameIdentifier	 new Gauge
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"CompletedTasks"	TokenNameStringLiteral	CompletedTasks
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executor	TokenNameIdentifier	 executor
.	TokenNameDOT	
getCompletedTaskCount	TokenNameIdentifier	 get Completed Task Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pendingTasks	TokenNameIdentifier	 pending Tasks
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newGauge	TokenNameIdentifier	 new Gauge
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"PendingTasks"	TokenNameStringLiteral	PendingTasks
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executor	TokenNameIdentifier	 executor
.	TokenNameDOT	
getTaskCount	TokenNameIdentifier	 get Task Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
executor	TokenNameIdentifier	 executor
.	TokenNameDOT	
getCompletedTaskCount	TokenNameIdentifier	 get Completed Task Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
defaultRegistry	TokenNameIdentifier	 default Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeMetric	TokenNameIdentifier	 remove Metric
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"ActiveTasks"	TokenNameStringLiteral	ActiveTasks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
defaultRegistry	TokenNameIdentifier	 default Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeMetric	TokenNameIdentifier	 remove Metric
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"PendingTasks"	TokenNameStringLiteral	PendingTasks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
defaultRegistry	TokenNameIdentifier	 default Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeMetric	TokenNameIdentifier	 remove Metric
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"CompletedTasks"	TokenNameStringLiteral	CompletedTasks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
defaultRegistry	TokenNameIdentifier	 default Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeMetric	TokenNameIdentifier	 remove Metric
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"TotalBlockedTasks"	TokenNameStringLiteral	TotalBlockedTasks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
defaultRegistry	TokenNameIdentifier	 default Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeMetric	TokenNameIdentifier	 remove Metric
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"CurrentlyBlockedTasks"	TokenNameStringLiteral	CurrentlyBlockedTasks
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
ThreadPoolMetricNameFactory	TokenNameIdentifier	 Thread Pool Metric Name Factory
implements	TokenNameimplements	
MetricNameFactory	TokenNameIdentifier	 Metric Name Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
poolName	TokenNameIdentifier	 pool Name
;	TokenNameSEMICOLON	
ThreadPoolMetricNameFactory	TokenNameIdentifier	 Thread Pool Metric Name Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
poolName	TokenNameIdentifier	 pool Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
poolName	TokenNameIdentifier	 pool Name
=	TokenNameEQUAL	
poolName	TokenNameIdentifier	 pool Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetricName	TokenNameIdentifier	 Metric Name
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
metricName	TokenNameIdentifier	 metric Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
groupName	TokenNameIdentifier	 group Name
=	TokenNameEQUAL	
ThreadPoolMetrics	TokenNameIdentifier	 Thread Pool Metrics
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getPackage	TokenNameIdentifier	 get Package
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
"ThreadPools"	TokenNameStringLiteral	ThreadPools
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
mbeanName	TokenNameIdentifier	 mbean Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbeanName	TokenNameIdentifier	 mbean Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
groupName	TokenNameIdentifier	 group Name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbeanName	TokenNameIdentifier	 mbean Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"type="	TokenNameStringLiteral	type=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbeanName	TokenNameIdentifier	 mbean Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
",path="	TokenNameStringLiteral	,path=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbeanName	TokenNameIdentifier	 mbean Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
",scope="	TokenNameStringLiteral	,scope=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
poolName	TokenNameIdentifier	 pool Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbeanName	TokenNameIdentifier	 mbean Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
",name="	TokenNameStringLiteral	,name=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
metricName	TokenNameIdentifier	 metric Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
groupName	TokenNameIdentifier	 group Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
metricName	TokenNameIdentifier	 metric Name
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
poolName	TokenNameIdentifier	 pool Name
,	TokenNameCOMMA	
mbeanName	TokenNameIdentifier	 mbean Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
