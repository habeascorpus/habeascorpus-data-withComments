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
MetricName	TokenNameIdentifier	 Metric Name
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
Timer	TokenNameIdentifier	 Timer
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
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
;	TokenNameSEMICOLON	
/** * Metrics about latencies */	TokenNameCOMMENT_JAVADOC	 Metrics about latencies 
public	TokenNamepublic	
class	TokenNameclass	
LatencyMetrics	TokenNameIdentifier	 Latency Metrics
{	TokenNameLBRACE	
/** Latency */	TokenNameCOMMENT_JAVADOC	 Latency 
public	TokenNamepublic	
final	TokenNamefinal	
Timer	TokenNameIdentifier	 Timer
latency	TokenNameIdentifier	 latency
;	TokenNameSEMICOLON	
/** Total latency in micro sec */	TokenNameCOMMENT_JAVADOC	 Total latency in micro sec 
public	TokenNamepublic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
totalLatency	TokenNameIdentifier	 total Latency
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
MetricNameFactory	TokenNameIdentifier	 Metric Name Factory
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
namePrefix	TokenNameIdentifier	 name Prefix
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
totalLatencyHistogram	TokenNameIdentifier	 total Latency Histogram
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
recentLatencyHistogram	TokenNameIdentifier	 recent Latency Histogram
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
lastLatency	TokenNameIdentifier	 last Latency
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
lastOpCount	TokenNameIdentifier	 last Op Count
;	TokenNameSEMICOLON	
/** * Create LatencyMetrics with given group, type, and scope. Name prefix for each metric will be empty. * * @param group Group name * @param type Type name * @param scope Scope */	TokenNameCOMMENT_JAVADOC	 Create LatencyMetrics with given group, type, and scope. Name prefix for each metric will be empty. * @param group Group name @param type Type name @param scope Scope 
public	TokenNamepublic	
LatencyMetrics	TokenNameIdentifier	 Latency Metrics
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create LatencyMetrics with given group, type, prefix to append to each metric name, and scope. * * @param group Group name * @param type Type name * @param namePrefix Prefix to append to each metric name * @param scope Scope of metrics */	TokenNameCOMMENT_JAVADOC	 Create LatencyMetrics with given group, type, prefix to append to each metric name, and scope. * @param group Group name @param type Type name @param namePrefix Prefix to append to each metric name @param scope Scope of metrics 
public	TokenNamepublic	
LatencyMetrics	TokenNameIdentifier	 Latency Metrics
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namePrefix	TokenNameIdentifier	 name Prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
LatencyMetricNameFactory	TokenNameIdentifier	 Latency Metric Name Factory
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
,	TokenNameCOMMA	
namePrefix	TokenNameIdentifier	 name Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create LatencyMetrics with given group, type, prefix to append to each metric name, and scope. * * @param factory MetricName factory to use * @param namePrefix Prefix to append to each metric name */	TokenNameCOMMENT_JAVADOC	 Create LatencyMetrics with given group, type, prefix to append to each metric name, and scope. * @param factory MetricName factory to use @param namePrefix Prefix to append to each metric name 
public	TokenNamepublic	
LatencyMetrics	TokenNameIdentifier	 Latency Metrics
(	TokenNameLPAREN	
MetricNameFactory	TokenNameIdentifier	 Metric Name Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namePrefix	TokenNameIdentifier	 name Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namePrefix	TokenNameIdentifier	 name Prefix
=	TokenNameEQUAL	
namePrefix	TokenNameIdentifier	 name Prefix
;	TokenNameSEMICOLON	
latency	TokenNameIdentifier	 latency
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newTimer	TokenNameIdentifier	 new Timer
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
namePrefix	TokenNameIdentifier	 name Prefix
+	TokenNamePLUS	
"Latency"	TokenNameStringLiteral	Latency
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MICROSECONDS	TokenNameIdentifier	 MICROSECONDS
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalLatency	TokenNameIdentifier	 total Latency
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
namePrefix	TokenNameIdentifier	 name Prefix
+	TokenNamePLUS	
"TotalLatency"	TokenNameStringLiteral	TotalLatency
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** takes nanoseconds **/	TokenNameCOMMENT_JAVADOC	 takes nanoseconds *
public	TokenNamepublic	
void	TokenNamevoid	
addNano	TokenNameIdentifier	 add Nano
(	TokenNameLPAREN	
long	TokenNamelong	
nanos	TokenNameIdentifier	 nanos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// convert to microseconds. 1 millionth 	TokenNameCOMMENT_LINE	convert to microseconds. 1 millionth 
addMicro	TokenNameIdentifier	 add Micro
(	TokenNameLPAREN	
nanos	TokenNameIdentifier	 nanos
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addMicro	TokenNameIdentifier	 add Micro
(	TokenNameLPAREN	
long	TokenNamelong	
micros	TokenNameIdentifier	 micros
)	TokenNameRPAREN	
{	TokenNameLBRACE	
latency	TokenNameIdentifier	 latency
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
micros	TokenNameIdentifier	 micros
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MICROSECONDS	TokenNameIdentifier	 MICROSECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalLatency	TokenNameIdentifier	 total Latency
.	TokenNameDOT	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
micros	TokenNameIdentifier	 micros
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalLatencyHistogram	TokenNameIdentifier	 total Latency Histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
micros	TokenNameIdentifier	 micros
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recentLatencyHistogram	TokenNameIdentifier	 recent Latency Histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
micros	TokenNameIdentifier	 micros
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
namePrefix	TokenNameIdentifier	 name Prefix
+	TokenNamePLUS	
"Latency"	TokenNameStringLiteral	Latency
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
namePrefix	TokenNameIdentifier	 name Prefix
+	TokenNamePLUS	
"TotalLatency"	TokenNameStringLiteral	TotalLatency
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getRecentLatency	TokenNameIdentifier	 get Recent Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
ops	TokenNameIdentifier	 ops
=	TokenNameEQUAL	
latency	TokenNameIdentifier	 latency
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
totalLatency	TokenNameIdentifier	 total Latency
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
lastLatency	TokenNameIdentifier	 last Latency
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
ops	TokenNameIdentifier	 ops
-	TokenNameMINUS	
lastOpCount	TokenNameIdentifier	 last Op Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lastLatency	TokenNameIdentifier	 last Latency
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
lastOpCount	TokenNameIdentifier	 last Op Count
=	TokenNameEQUAL	
ops	TokenNameIdentifier	 ops
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
LatencyMetricNameFactory	TokenNameIdentifier	 Latency Metric Name Factory
implements	TokenNameimplements	
MetricNameFactory	TokenNameIdentifier	 Metric Name Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
group	TokenNameIdentifier	 group
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
LatencyMetricNameFactory	TokenNameIdentifier	 Latency Metric Name Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
scope	TokenNameIdentifier	 scope
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
return	TokenNamereturn	
new	TokenNamenew	
MetricName	TokenNameIdentifier	 Metric Name
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
metricName	TokenNameIdentifier	 metric Name
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
