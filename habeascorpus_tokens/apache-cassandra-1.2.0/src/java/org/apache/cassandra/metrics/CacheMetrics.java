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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicLong	TokenNameIdentifier	 Atomic Long
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
yammer	TokenNameIdentifier	 yammer
.	TokenNameDOT	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RatioGauge	TokenNameIdentifier	 Ratio Gauge
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
ICache	TokenNameIdentifier	 I Cache
;	TokenNameSEMICOLON	
/** * Metrics for {@code ICache}. */	TokenNameCOMMENT_JAVADOC	 Metrics for {@code ICache}. 
public	TokenNamepublic	
class	TokenNameclass	
CacheMetrics	TokenNameIdentifier	 Cache Metrics
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
"Cache"	TokenNameStringLiteral	Cache
;	TokenNameSEMICOLON	
/** Cache capacity in bytes */	TokenNameCOMMENT_JAVADOC	 Cache capacity in bytes 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
/** Total number of cache hits */	TokenNameCOMMENT_JAVADOC	 Total number of cache hits 
public	TokenNamepublic	
final	TokenNamefinal	
Meter	TokenNameIdentifier	 Meter
hits	TokenNameIdentifier	 hits
;	TokenNameSEMICOLON	
/** Total number of cache requests */	TokenNameCOMMENT_JAVADOC	 Total number of cache requests 
public	TokenNamepublic	
final	TokenNamefinal	
Meter	TokenNameIdentifier	 Meter
requests	TokenNameIdentifier	 requests
;	TokenNameSEMICOLON	
/** cache hit rate */	TokenNameCOMMENT_JAVADOC	 cache hit rate 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
hitRate	TokenNameIdentifier	 hit Rate
;	TokenNameSEMICOLON	
/** Total size of cache, in bytes */	TokenNameCOMMENT_JAVADOC	 Total size of cache, in bytes 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
/** Total number of cache entries */	TokenNameCOMMENT_JAVADOC	 Total number of cache entries 
public	TokenNamepublic	
final	TokenNamefinal	
Gauge	TokenNameIdentifier	 Gauge
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
lastRequests	TokenNameIdentifier	 last Requests
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
lastHits	TokenNameIdentifier	 last Hits
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create metrics for given cache. * * @param type Type of Cache to identify metrics. * @param cache Cache to measure metrics */	TokenNameCOMMENT_JAVADOC	 Create metrics for given cache. * @param type Type of Cache to identify metrics. @param cache Cache to measure metrics 
public	TokenNamepublic	
CacheMetrics	TokenNameIdentifier	 Cache Metrics
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
final	TokenNamefinal	
ICache	TokenNameIdentifier	 I Cache
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
capacity	TokenNameIdentifier	 capacity
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
"Capacity"	TokenNameStringLiteral	Capacity
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
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
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hits	TokenNameIdentifier	 hits
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
"Hits"	TokenNameStringLiteral	Hits
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"hits"	TokenNameStringLiteral	hits
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
requests	TokenNameIdentifier	 requests
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
"Requests"	TokenNameStringLiteral	Requests
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"requests"	TokenNameStringLiteral	requests
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hitRate	TokenNameIdentifier	 hit Rate
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
"HitRate"	TokenNameStringLiteral	HitRate
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
RatioGauge	TokenNameIdentifier	 Ratio Gauge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
double	TokenNamedouble	
getNumerator	TokenNameIdentifier	 get Numerator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
double	TokenNamedouble	
getDenominator	TokenNameIdentifier	 get Denominator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
requests	TokenNameIdentifier	 requests
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
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
"Size"	TokenNameStringLiteral	Size
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
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
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
weightedSize	TokenNameIdentifier	 weighted Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
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
"Entries"	TokenNameStringLiteral	Entries
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
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
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for backward compatibility 	TokenNameCOMMENT_LINE	for backward compatibility 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getRecentHitRate	TokenNameIdentifier	 get Recent Hit Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
requests	TokenNameIdentifier	 requests
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
hits	TokenNameIdentifier	 hits
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
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
lastHits	TokenNameIdentifier	 last Hits
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
-	TokenNameMINUS	
lastRequests	TokenNameIdentifier	 last Requests
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lastRequests	TokenNameIdentifier	 last Requests
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastHits	TokenNameIdentifier	 last Hits
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
