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
MetricName	TokenNameIdentifier	 Metric Name
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
commitlog	TokenNameIdentifier	 commitlog
.	TokenNameDOT	
CommitLogAllocator	TokenNameIdentifier	 Commit Log Allocator
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
commitlog	TokenNameIdentifier	 commitlog
.	TokenNameDOT	
ICommitLogExecutorService	TokenNameIdentifier	 I Commit Log Executor Service
;	TokenNameSEMICOLON	
/** * Metrics for commit log */	TokenNameCOMMENT_JAVADOC	 Metrics for commit log 
public	TokenNamepublic	
class	TokenNameclass	
CommitLogMetrics	TokenNameIdentifier	 Commit Log Metrics
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
"CommitLog"	TokenNameStringLiteral	CommitLog
;	TokenNameSEMICOLON	
/** Number of completed tasks */	TokenNameCOMMENT_JAVADOC	 Number of completed tasks 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
completedTasks	TokenNameIdentifier	 completed Tasks
;	TokenNameSEMICOLON	
/** Number of pending tasks */	TokenNameCOMMENT_JAVADOC	 Number of pending tasks 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
pendingTasks	TokenNameIdentifier	 pending Tasks
;	TokenNameSEMICOLON	
/** Current size used by all the commit log segments */	TokenNameCOMMENT_JAVADOC	 Current size used by all the commit log segments 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
totalCommitLogSize	TokenNameIdentifier	 total Commit Log Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CommitLogMetrics	TokenNameIdentifier	 Commit Log Metrics
(	TokenNameLPAREN	
final	TokenNamefinal	
ICommitLogExecutorService	TokenNameIdentifier	 I Commit Log Executor Service
executor	TokenNameIdentifier	 executor
,	TokenNameCOMMA	
final	TokenNamefinal	
CommitLogAllocator	TokenNameIdentifier	 Commit Log Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
return	TokenNamereturn	
executor	TokenNameIdentifier	 executor
.	TokenNameDOT	
getCompletedTasks	TokenNameIdentifier	 get Completed Tasks
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
getPendingTasks	TokenNameIdentifier	 get Pending Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalCommitLogSize	TokenNameIdentifier	 total Commit Log Size
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
"TotalCommitLogSize"	TokenNameStringLiteral	TotalCommitLogSize
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
allocator	TokenNameIdentifier	 allocator
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
