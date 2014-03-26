/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
StorageProxyMBean	TokenNameIdentifier	 Storage Proxy M Bean
{	TokenNameLBRACE	
/** * @see org.apache.cassandra.metrics.LatencyMetrics#lastOpCount */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.LatencyMetrics#lastOpCount 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getReadOperations	TokenNameIdentifier	 get Read Operations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.LatencyMetrics#totalLatencyHistogram */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.LatencyMetrics#totalLatencyHistogram 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getTotalReadLatencyMicros	TokenNameIdentifier	 get Total Read Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.LatencyMetrics#recentLatencyHistogram */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.LatencyMetrics#recentLatencyHistogram 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getRecentReadLatencyMicros	TokenNameIdentifier	 get Recent Read Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.LatencyMetrics#totalLatencyHistogram */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.LatencyMetrics#totalLatencyHistogram 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTotalReadLatencyHistogramMicros	TokenNameIdentifier	 get Total Read Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.LatencyMetrics#recentLatencyHistogram */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.LatencyMetrics#recentLatencyHistogram 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecentReadLatencyHistogramMicros	TokenNameIdentifier	 get Recent Read Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getRangeOperations	TokenNameIdentifier	 get Range Operations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getTotalRangeLatencyMicros	TokenNameIdentifier	 get Total Range Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getRecentRangeLatencyMicros	TokenNameIdentifier	 get Recent Range Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTotalRangeLatencyHistogramMicros	TokenNameIdentifier	 get Total Range Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecentRangeLatencyHistogramMicros	TokenNameIdentifier	 get Recent Range Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getWriteOperations	TokenNameIdentifier	 get Write Operations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getTotalWriteLatencyMicros	TokenNameIdentifier	 get Total Write Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getRecentWriteLatencyMicros	TokenNameIdentifier	 get Recent Write Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTotalWriteLatencyHistogramMicros	TokenNameIdentifier	 get Total Write Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecentWriteLatencyHistogramMicros	TokenNameIdentifier	 get Recent Write Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
getTotalHints	TokenNameIdentifier	 get Total Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
getHintedHandoffEnabled	TokenNameIdentifier	 get Hinted Handoff Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setHintedHandoffEnabled	TokenNameIdentifier	 set Hinted Handoff Enabled
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getMaxHintWindow	TokenNameIdentifier	 get Max Hint Window
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxHintWindow	TokenNameIdentifier	 set Max Hint Window
(	TokenNameLPAREN	
int	TokenNameint	
ms	TokenNameIdentifier	 ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getMaxHintsInProgress	TokenNameIdentifier	 get Max Hints In Progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxHintsInProgress	TokenNameIdentifier	 set Max Hints In Progress
(	TokenNameLPAREN	
int	TokenNameint	
qs	TokenNameIdentifier	 qs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getHintsInProgress	TokenNameIdentifier	 get Hints In Progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
getRpcTimeout	TokenNameIdentifier	 get Rpc Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setRpcTimeout	TokenNameIdentifier	 set Rpc Timeout
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
timeoutInMillis	TokenNameIdentifier	 timeout In Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
getReadRpcTimeout	TokenNameIdentifier	 get Read Rpc Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setReadRpcTimeout	TokenNameIdentifier	 set Read Rpc Timeout
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
timeoutInMillis	TokenNameIdentifier	 timeout In Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
getWriteRpcTimeout	TokenNameIdentifier	 get Write Rpc Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setWriteRpcTimeout	TokenNameIdentifier	 set Write Rpc Timeout
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
timeoutInMillis	TokenNameIdentifier	 timeout In Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
getRangeRpcTimeout	TokenNameIdentifier	 get Range Rpc Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setRangeRpcTimeout	TokenNameIdentifier	 set Range Rpc Timeout
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
timeoutInMillis	TokenNameIdentifier	 timeout In Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
getTruncateRpcTimeout	TokenNameIdentifier	 get Truncate Rpc Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setTruncateRpcTimeout	TokenNameIdentifier	 set Truncate Rpc Timeout
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
timeoutInMillis	TokenNameIdentifier	 timeout In Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
