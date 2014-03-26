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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
OutboundTcpConnectionPool	TokenNameIdentifier	 Outbound Tcp Connection Pool
;	TokenNameSEMICOLON	
/** * Metrics for {@link OutboundTcpConnectionPool}. */	TokenNameCOMMENT_JAVADOC	 Metrics for {@link OutboundTcpConnectionPool}. 
public	TokenNamepublic	
class	TokenNameclass	
ConnectionMetrics	TokenNameIdentifier	 Connection Metrics
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
"Connection"	TokenNameStringLiteral	Connection
;	TokenNameSEMICOLON	
/** Total number of timeouts happened on this node */	TokenNameCOMMENT_JAVADOC	 Total number of timeouts happened on this node 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Meter	TokenNameIdentifier	 Meter
totalTimeouts	TokenNameIdentifier	 total Timeouts
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
"TotalTimeouts"	TokenNameStringLiteral	TotalTimeouts
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"total timeouts"	TokenNameStringLiteral	total timeouts
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
recentTimeouts	TokenNameIdentifier	 recent Timeouts
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
/** Pending tasks for Command(Mutations, Read etc) TCP Connections */	TokenNameCOMMENT_JAVADOC	 Pending tasks for Command(Mutations, Read etc) TCP Connections 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
commandPendingTasks	TokenNameIdentifier	 command Pending Tasks
;	TokenNameSEMICOLON	
/** Completed tasks for Command(Mutations, Read etc) TCP Connections */	TokenNameCOMMENT_JAVADOC	 Completed tasks for Command(Mutations, Read etc) TCP Connections 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
commandCompletedTasks	TokenNameIdentifier	 command Completed Tasks
;	TokenNameSEMICOLON	
/** Dropped tasks for Command(Mutations, Read etc) TCP Connections */	TokenNameCOMMENT_JAVADOC	 Dropped tasks for Command(Mutations, Read etc) TCP Connections 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
commandDroppedTasks	TokenNameIdentifier	 command Dropped Tasks
;	TokenNameSEMICOLON	
/** Pending tasks for Response(GOSSIP & RESPONSE) TCP Connections */	TokenNameCOMMENT_JAVADOC	 Pending tasks for Response(GOSSIP & RESPONSE) TCP Connections 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
responsePendingTasks	TokenNameIdentifier	 response Pending Tasks
;	TokenNameSEMICOLON	
/** Completed tasks for Response(GOSSIP & RESPONSE) TCP Connections */	TokenNameCOMMENT_JAVADOC	 Completed tasks for Response(GOSSIP & RESPONSE) TCP Connections 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
responseCompletedTasks	TokenNameIdentifier	 response Completed Tasks
;	TokenNameSEMICOLON	
/** Number of timeouts for specific IP */	TokenNameCOMMENT_JAVADOC	 Number of timeouts for specific IP 
public	TokenNamepublic	
final	TokenNamefinal	
Meter	TokenNameIdentifier	 Meter
timeouts	TokenNameIdentifier	 timeouts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
recentTimeoutCount	TokenNameIdentifier	 recent Timeout Count
;	TokenNameSEMICOLON	
/** * Create metrics for given connection pool. * * @param ip IP address to use for metrics label * @param connectionPool Connection pool */	TokenNameCOMMENT_JAVADOC	 Create metrics for given connection pool. * @param ip IP address to use for metrics label @param connectionPool Connection pool 
public	TokenNamepublic	
ConnectionMetrics	TokenNameIdentifier	 Connection Metrics
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
ip	TokenNameIdentifier	 ip
,	TokenNameCOMMA	
final	TokenNamefinal	
OutboundTcpConnectionPool	TokenNameIdentifier	 Outbound Tcp Connection Pool
connectionPool	TokenNameIdentifier	 connection Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
ip	TokenNameIdentifier	 ip
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandPendingTasks	TokenNameIdentifier	 command Pending Tasks
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
"CommandPendingTasks"	TokenNameStringLiteral	CommandPendingTasks
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
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
connectionPool	TokenNameIdentifier	 connection Pool
.	TokenNameDOT	
cmdCon	TokenNameIdentifier	 cmd Con
.	TokenNameDOT	
getPendingMessages	TokenNameIdentifier	 get Pending Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandCompletedTasks	TokenNameIdentifier	 command Completed Tasks
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
"CommandCompletedTasks"	TokenNameStringLiteral	CommandCompletedTasks
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
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
connectionPool	TokenNameIdentifier	 connection Pool
.	TokenNameDOT	
cmdCon	TokenNameIdentifier	 cmd Con
.	TokenNameDOT	
getCompletedMesssages	TokenNameIdentifier	 get Completed Messsages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandDroppedTasks	TokenNameIdentifier	 command Dropped Tasks
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
"CommandDroppedTasks"	TokenNameStringLiteral	CommandDroppedTasks
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
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
connectionPool	TokenNameIdentifier	 connection Pool
.	TokenNameDOT	
cmdCon	TokenNameIdentifier	 cmd Con
.	TokenNameDOT	
getDroppedMessages	TokenNameIdentifier	 get Dropped Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
responsePendingTasks	TokenNameIdentifier	 response Pending Tasks
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
"ResponsePendingTasks"	TokenNameStringLiteral	ResponsePendingTasks
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
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
connectionPool	TokenNameIdentifier	 connection Pool
.	TokenNameDOT	
ackCon	TokenNameIdentifier	 ack Con
.	TokenNameDOT	
getPendingMessages	TokenNameIdentifier	 get Pending Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
responseCompletedTasks	TokenNameIdentifier	 response Completed Tasks
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
"ResponseCompletedTasks"	TokenNameStringLiteral	ResponseCompletedTasks
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
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
connectionPool	TokenNameIdentifier	 connection Pool
.	TokenNameDOT	
ackCon	TokenNameIdentifier	 ack Con
.	TokenNameDOT	
getCompletedMesssages	TokenNameIdentifier	 get Completed Messsages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeouts	TokenNameIdentifier	 timeouts
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
"Timeouts"	TokenNameStringLiteral	Timeouts
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"timeouts"	TokenNameStringLiteral	timeouts
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
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
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
,	TokenNameCOMMA	
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
,	TokenNameCOMMA	
"CommandPendingTasks"	TokenNameStringLiteral	CommandPendingTasks
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
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
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
,	TokenNameCOMMA	
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
,	TokenNameCOMMA	
"CommandCompletedTasks"	TokenNameStringLiteral	CommandCompletedTasks
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
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
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
,	TokenNameCOMMA	
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
,	TokenNameCOMMA	
"CommandDroppedTasks"	TokenNameStringLiteral	CommandDroppedTasks
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
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
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
,	TokenNameCOMMA	
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
,	TokenNameCOMMA	
"ResponsePendingTasks"	TokenNameStringLiteral	ResponsePendingTasks
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
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
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
,	TokenNameCOMMA	
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
,	TokenNameCOMMA	
"ResponseCompletedTasks"	TokenNameStringLiteral	ResponseCompletedTasks
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
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
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
GROUP_NAME	TokenNameIdentifier	 GROUP  NAME
,	TokenNameCOMMA	
TYPE_NAME	TokenNameIdentifier	 TYPE  NAME
,	TokenNameCOMMA	
"Timeouts"	TokenNameStringLiteral	Timeouts
,	TokenNameCOMMA	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
getRecentTotalTimeout	TokenNameIdentifier	 get Recent Total Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
totalTimeouts	TokenNameIdentifier	 total Timeouts
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
recent	TokenNameIdentifier	 recent
=	TokenNameEQUAL	
total	TokenNameIdentifier	 total
-	TokenNameMINUS	
recentTimeouts	TokenNameIdentifier	 recent Timeouts
;	TokenNameSEMICOLON	
recentTimeouts	TokenNameIdentifier	 recent Timeouts
=	TokenNameEQUAL	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
return	TokenNamereturn	
recent	TokenNameIdentifier	 recent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getRecentTimeout	TokenNameIdentifier	 get Recent Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
timeoutCount	TokenNameIdentifier	 timeout Count
=	TokenNameEQUAL	
timeouts	TokenNameIdentifier	 timeouts
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
recent	TokenNameIdentifier	 recent
=	TokenNameEQUAL	
timeoutCount	TokenNameIdentifier	 timeout Count
-	TokenNameMINUS	
recentTimeoutCount	TokenNameIdentifier	 recent Timeout Count
;	TokenNameSEMICOLON	
recentTimeoutCount	TokenNameIdentifier	 recent Timeout Count
=	TokenNameEQUAL	
timeoutCount	TokenNameIdentifier	 timeout Count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
recent	TokenNameIdentifier	 recent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
