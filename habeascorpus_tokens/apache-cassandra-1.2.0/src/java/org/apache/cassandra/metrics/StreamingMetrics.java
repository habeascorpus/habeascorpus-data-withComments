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
ConcurrentMap	TokenNameIdentifier	 Concurrent Map
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
cliffc	TokenNameIdentifier	 cliffc
.	TokenNameDOT	
high_scale_lib	TokenNameIdentifier	 high scale lib
.	TokenNameDOT	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
;	TokenNameSEMICOLON	
/** * Metrics for streaming. */	TokenNameCOMMENT_JAVADOC	 Metrics for streaming. 
public	TokenNamepublic	
class	TokenNameclass	
StreamingMetrics	TokenNameIdentifier	 Streaming Metrics
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
"Streaming"	TokenNameStringLiteral	Streaming
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ConcurrentMap	TokenNameIdentifier	 Concurrent Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
StreamingMetrics	TokenNameIdentifier	 Streaming Metrics
>	TokenNameGREATER	
instances	TokenNameIdentifier	 instances
=	TokenNameEQUAL	
new	TokenNamenew	
NonBlockingHashMap	TokenNameIdentifier	 Non Blocking Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
StreamingMetrics	TokenNameIdentifier	 Streaming Metrics
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
activeStreamsOutbound	TokenNameIdentifier	 active Streams Outbound
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
"ActiveOutboundStreams"	TokenNameStringLiteral	ActiveOutboundStreams
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
totalIncomingBytes	TokenNameIdentifier	 total Incoming Bytes
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
"TotalIncomingBytes"	TokenNameStringLiteral	TotalIncomingBytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
totalOutgoingBytes	TokenNameIdentifier	 total Outgoing Bytes
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
"TotalOutgoingBytes"	TokenNameStringLiteral	TotalOutgoingBytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
incomingBytes	TokenNameIdentifier	 incoming Bytes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
outgoingBytes	TokenNameIdentifier	 outgoing Bytes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
StreamingMetrics	TokenNameIdentifier	 Streaming Metrics
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
ip	TokenNameIdentifier	 ip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StreamingMetrics	TokenNameIdentifier	 Streaming Metrics
metrics	TokenNameIdentifier	 metrics
=	TokenNameEQUAL	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ip	TokenNameIdentifier	 ip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
metrics	TokenNameIdentifier	 metrics
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
metrics	TokenNameIdentifier	 metrics
=	TokenNameEQUAL	
new	TokenNamenew	
StreamingMetrics	TokenNameIdentifier	 Streaming Metrics
(	TokenNameLPAREN	
ip	TokenNameIdentifier	 ip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ip	TokenNameIdentifier	 ip
,	TokenNameCOMMA	
metrics	TokenNameIdentifier	 metrics
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
metrics	TokenNameIdentifier	 metrics
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StreamingMetrics	TokenNameIdentifier	 Streaming Metrics
(	TokenNameLPAREN	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
peer	TokenNameIdentifier	 peer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
incomingBytes	TokenNameIdentifier	 incoming Bytes
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
"IncomingBytes"	TokenNameStringLiteral	IncomingBytes
,	TokenNameCOMMA	
peer	TokenNameIdentifier	 peer
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outgoingBytes	TokenNameIdentifier	 outgoing Bytes
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
"OutgoingBytes"	TokenNameStringLiteral	OutgoingBytes
,	TokenNameCOMMA	
peer	TokenNameIdentifier	 peer
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
