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
*	TokenNameMULTIPLY	
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
TimeUnit	TokenNameIdentifier	 Time Unit
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
Counter	TokenNameIdentifier	 Counter
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
Gauge	TokenNameIdentifier	 Gauge
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
Meter	TokenNameIdentifier	 Meter
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
MetricName	TokenNameIdentifier	 Metric Name
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
Schema	TokenNameIdentifier	 Schema
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
Table	TokenNameIdentifier	 Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
compaction	TokenNameIdentifier	 compaction
.	TokenNameDOT	
CompactionInfo	TokenNameIdentifier	 Compaction Info
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
compaction	TokenNameIdentifier	 compaction
.	TokenNameDOT	
CompactionManager	TokenNameIdentifier	 Compaction Manager
;	TokenNameSEMICOLON	
/** * Metrics for compaction. */	TokenNameCOMMENT_JAVADOC	 Metrics for compaction. 
public	TokenNamepublic	
class	TokenNameclass	
CompactionMetrics	TokenNameIdentifier	 Compaction Metrics
implements	TokenNameimplements	
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
CompactionExecutorStatsCollector	TokenNameIdentifier	 Compaction Executor Stats Collector
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
=	TokenNameEQUAL	
"org.apache.cassandra.metrics"	TokenNameStringLiteral	org.apache.cassandra.metrics
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
=	TokenNameEQUAL	
"Compaction"	TokenNameStringLiteral	Compaction
;	TokenNameSEMICOLON	
// a synchronized identity set of running tasks to their compaction info 	TokenNameCOMMENT_LINE	a synchronized identity set of running tasks to their compaction info 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
CompactionInfo	TokenNameIdentifier	 Compaction Info
.	TokenNameDOT	
Holder	TokenNameIdentifier	 Holder
>	TokenNameGREATER	
compactions	TokenNameIdentifier	 compactions
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
newSetFromMap	TokenNameIdentifier	 new Set From Map
(	TokenNameLPAREN	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
CompactionInfo	TokenNameIdentifier	 Compaction Info
.	TokenNameDOT	
Holder	TokenNameIdentifier	 Holder
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Estimated number of compactions remaining to perform */	TokenNameCOMMENT_JAVADOC	 Estimated number of compactions remaining to perform 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
pendingTasks	TokenNameIdentifier	 pending Tasks
;	TokenNameSEMICOLON	
/** Number of completed compactions since server [re]start */	TokenNameCOMMENT_JAVADOC	 Number of completed compactions since server [re]start 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
completedTasks	TokenNameIdentifier	 completed Tasks
;	TokenNameSEMICOLON	
/** Total number of compactions since server [re]start */	TokenNameCOMMENT_JAVADOC	 Total number of compactions since server [re]start 
public	TokenNamepublic	
final	TokenNamefinal	
Meter	TokenNameIdentifier	 Meter
totalCompactionsCompleted	TokenNameIdentifier	 total Compactions Completed
;	TokenNameSEMICOLON	
/** Total number of bytes compacted since server [re]start */	TokenNameCOMMENT_JAVADOC	 Total number of bytes compacted since server [re]start 
public	TokenNamepublic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
bytesCompacted	TokenNameIdentifier	 bytes Compacted
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompactionMetrics	TokenNameIdentifier	 Compaction Metrics
(	TokenNameLPAREN	
final	TokenNamefinal	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
...	TokenNameELLIPSIS	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pendingTasks	TokenNameIdentifier	 pending Tasks
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newGauge	TokenNameIdentifier	 new Gauge
(	TokenNameLPAREN	
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
,	TokenNameCOMMA	
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
,	TokenNameCOMMA	
"PendingTasks"	TokenNameStringLiteral	PendingTasks
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
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
:	TokenNameCOLON	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTables	TokenNameIdentifier	 get Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
:	TokenNameCOLON	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
tableName	TokenNameIdentifier	 table Name
)	TokenNameRPAREN	
.	TokenNameDOT	
getColumnFamilyStores	TokenNameIdentifier	 get Column Family Stores
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getCompactionStrategy	TokenNameIdentifier	 get Compaction Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEstimatedRemainingTasks	TokenNameIdentifier	 get Estimated Remaining Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
collector	TokenNameIdentifier	 collector
:	TokenNameCOLON	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
getTaskCount	TokenNameIdentifier	 get Task Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
getCompletedTaskCount	TokenNameIdentifier	 get Completed Task Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
completedTasks	TokenNameIdentifier	 completed Tasks
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newGauge	TokenNameIdentifier	 new Gauge
(	TokenNameLPAREN	
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
,	TokenNameCOMMA	
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
,	TokenNameCOMMA	
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
long	TokenNamelong	
completedTasks	TokenNameIdentifier	 completed Tasks
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ThreadPoolExecutor	TokenNameIdentifier	 Thread Pool Executor
collector	TokenNameIdentifier	 collector
:	TokenNameCOLON	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
completedTasks	TokenNameIdentifier	 completed Tasks
+=	TokenNamePLUS_EQUAL	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
getCompletedTaskCount	TokenNameIdentifier	 get Completed Task Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
completedTasks	TokenNameIdentifier	 completed Tasks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalCompactionsCompleted	TokenNameIdentifier	 total Compactions Completed
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newMeter	TokenNameIdentifier	 new Meter
(	TokenNameLPAREN	
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
,	TokenNameCOMMA	
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
,	TokenNameCOMMA	
"TotalCompactionsCompleted"	TokenNameStringLiteral	TotalCompactionsCompleted
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"compaction completed"	TokenNameStringLiteral	compaction completed
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesCompacted	TokenNameIdentifier	 bytes Compacted
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
,	TokenNameCOMMA	
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
,	TokenNameCOMMA	
"BytesCompacted"	TokenNameStringLiteral	BytesCompacted
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
beginCompaction	TokenNameIdentifier	 begin Compaction
(	TokenNameLPAREN	
CompactionInfo	TokenNameIdentifier	 Compaction Info
.	TokenNameDOT	
Holder	TokenNameIdentifier	 Holder
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// notify 	TokenNameCOMMENT_LINE	notify 
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
started	TokenNameIdentifier	 started
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compactions	TokenNameIdentifier	 compactions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
finishCompaction	TokenNameIdentifier	 finish Compaction
(	TokenNameLPAREN	
CompactionInfo	TokenNameIdentifier	 Compaction Info
.	TokenNameDOT	
Holder	TokenNameIdentifier	 Holder
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// notify 	TokenNameCOMMENT_LINE	notify 
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compactions	TokenNameIdentifier	 compactions
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesCompacted	TokenNameIdentifier	 bytes Compacted
.	TokenNameDOT	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
getCompactionInfo	TokenNameIdentifier	 get Compaction Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTotal	TokenNameIdentifier	 get Total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalCompactionsCompleted	TokenNameIdentifier	 total Compactions Completed
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CompactionInfo	TokenNameIdentifier	 Compaction Info
.	TokenNameDOT	
Holder	TokenNameIdentifier	 Holder
>	TokenNameGREATER	
getCompactions	TokenNameIdentifier	 get Compactions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CompactionInfo	TokenNameIdentifier	 Compaction Info
.	TokenNameDOT	
Holder	TokenNameIdentifier	 Holder
>	TokenNameGREATER	
(	TokenNameLPAREN	
compactions	TokenNameIdentifier	 compactions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
