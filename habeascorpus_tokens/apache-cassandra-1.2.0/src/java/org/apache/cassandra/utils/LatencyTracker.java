/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
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
public	TokenNamepublic	
class	TokenNameclass	
LatencyTracker	TokenNameIdentifier	 Latency Tracker
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
opCount	TokenNameIdentifier	 op Count
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
totalLatency	TokenNameIdentifier	 total Latency
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastLatency	TokenNameIdentifier	 last Latency
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastOpCount	TokenNameIdentifier	 last Op Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
totalHistogram	TokenNameIdentifier	 total Histogram
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
recentHistogram	TokenNameIdentifier	 recent Histogram
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
opCount	TokenNameIdentifier	 op Count
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalLatency	TokenNameIdentifier	 total Latency
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
micros	TokenNameIdentifier	 micros
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalHistogram	TokenNameIdentifier	 total Histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
micros	TokenNameIdentifier	 micros
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recentHistogram	TokenNameIdentifier	 recent Histogram
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
micros	TokenNameIdentifier	 micros
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getOpCount	TokenNameIdentifier	 get Op Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
opCount	TokenNameIdentifier	 op Count
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns microseconds */	TokenNameCOMMENT_JAVADOC	 returns microseconds 
public	TokenNamepublic	
long	TokenNamelong	
getTotalLatencyMicros	TokenNameIdentifier	 get Total Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
totalLatency	TokenNameIdentifier	 total Latency
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns microseconds */	TokenNameCOMMENT_JAVADOC	 returns microseconds 
public	TokenNamepublic	
double	TokenNamedouble	
getRecentLatencyMicros	TokenNameIdentifier	 get Recent Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
ops	TokenNameIdentifier	 ops
=	TokenNameEQUAL	
opCount	TokenNameIdentifier	 op Count
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
totalLatency	TokenNameIdentifier	 total Latency
.	TokenNameDOT	
get	TokenNameIdentifier	 get
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
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTotalLatencyHistogramMicros	TokenNameIdentifier	 get Total Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
totalHistogram	TokenNameIdentifier	 total Histogram
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
recentHistogram	TokenNameIdentifier	 recent Histogram
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
