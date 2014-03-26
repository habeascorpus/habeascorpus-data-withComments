/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
PBSPredictionResult	TokenNameIdentifier	 PBS Prediction Result
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
timeSinceWrite	TokenNameIdentifier	 time Since Write
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numberVersionsStale	TokenNameIdentifier	 number Versions Stale
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
consistencyProbability	TokenNameIdentifier	 consistency Probability
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
averageReadLatency	TokenNameIdentifier	 average Read Latency
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
averageWriteLatency	TokenNameIdentifier	 average Write Latency
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
percentileReadLatencyValue	TokenNameIdentifier	 percentile Read Latency Value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
percentileReadLatencyPercentile	TokenNameIdentifier	 percentile Read Latency Percentile
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
percentileWriteLatencyValue	TokenNameIdentifier	 percentile Write Latency Value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
percentileWriteLatencyPercentile	TokenNameIdentifier	 percentile Write Latency Percentile
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PBSPredictionResult	TokenNameIdentifier	 PBS Prediction Result
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
float	TokenNamefloat	
timeSinceWrite	TokenNameIdentifier	 time Since Write
,	TokenNameCOMMA	
int	TokenNameint	
numberVersionsStale	TokenNameIdentifier	 number Versions Stale
,	TokenNameCOMMA	
float	TokenNamefloat	
consistencyProbability	TokenNameIdentifier	 consistency Probability
,	TokenNameCOMMA	
float	TokenNamefloat	
averageReadLatency	TokenNameIdentifier	 average Read Latency
,	TokenNameCOMMA	
float	TokenNamefloat	
averageWriteLatency	TokenNameIdentifier	 average Write Latency
,	TokenNameCOMMA	
long	TokenNamelong	
percentileReadLatencyValue	TokenNameIdentifier	 percentile Read Latency Value
,	TokenNameCOMMA	
float	TokenNamefloat	
percentileReadLatencyPercentile	TokenNameIdentifier	 percentile Read Latency Percentile
,	TokenNameCOMMA	
long	TokenNamelong	
percentileWriteLatencyValue	TokenNameIdentifier	 percentile Write Latency Value
,	TokenNameCOMMA	
float	TokenNamefloat	
percentileWriteLatencyPercentile	TokenNameIdentifier	 percentile Write Latency Percentile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timeSinceWrite	TokenNameIdentifier	 time Since Write
=	TokenNameEQUAL	
timeSinceWrite	TokenNameIdentifier	 time Since Write
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numberVersionsStale	TokenNameIdentifier	 number Versions Stale
=	TokenNameEQUAL	
numberVersionsStale	TokenNameIdentifier	 number Versions Stale
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
consistencyProbability	TokenNameIdentifier	 consistency Probability
=	TokenNameEQUAL	
consistencyProbability	TokenNameIdentifier	 consistency Probability
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
averageReadLatency	TokenNameIdentifier	 average Read Latency
=	TokenNameEQUAL	
averageReadLatency	TokenNameIdentifier	 average Read Latency
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
averageWriteLatency	TokenNameIdentifier	 average Write Latency
=	TokenNameEQUAL	
averageWriteLatency	TokenNameIdentifier	 average Write Latency
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
percentileReadLatencyValue	TokenNameIdentifier	 percentile Read Latency Value
=	TokenNameEQUAL	
percentileReadLatencyValue	TokenNameIdentifier	 percentile Read Latency Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
percentileReadLatencyPercentile	TokenNameIdentifier	 percentile Read Latency Percentile
=	TokenNameEQUAL	
percentileReadLatencyPercentile	TokenNameIdentifier	 percentile Read Latency Percentile
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
percentileWriteLatencyValue	TokenNameIdentifier	 percentile Write Latency Value
=	TokenNameEQUAL	
percentileWriteLatencyValue	TokenNameIdentifier	 percentile Write Latency Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
percentileWriteLatencyPercentile	TokenNameIdentifier	 percentile Write Latency Percentile
=	TokenNameEQUAL	
percentileWriteLatencyPercentile	TokenNameIdentifier	 percentile Write Latency Percentile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getN	TokenNameIdentifier	 get N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getR	TokenNameIdentifier	 get R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getW	TokenNameIdentifier	 get W
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getTimeSinceWrite	TokenNameIdentifier	 get Time Since Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeSinceWrite	TokenNameIdentifier	 time Since Write
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumberVersionsStale	TokenNameIdentifier	 get Number Versions Stale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numberVersionsStale	TokenNameIdentifier	 number Versions Stale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getConsistencyProbability	TokenNameIdentifier	 get Consistency Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
consistencyProbability	TokenNameIdentifier	 consistency Probability
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getAverageReadLatency	TokenNameIdentifier	 get Average Read Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
averageReadLatency	TokenNameIdentifier	 average Read Latency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getAverageWriteLatency	TokenNameIdentifier	 get Average Write Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
averageWriteLatency	TokenNameIdentifier	 average Write Latency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getPercentileReadLatencyValue	TokenNameIdentifier	 get Percentile Read Latency Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
percentileReadLatencyValue	TokenNameIdentifier	 percentile Read Latency Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getPercentileReadLatencyPercentile	TokenNameIdentifier	 get Percentile Read Latency Percentile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
percentileReadLatencyPercentile	TokenNameIdentifier	 percentile Read Latency Percentile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getPercentileWriteLatencyValue	TokenNameIdentifier	 get Percentile Write Latency Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
percentileWriteLatencyValue	TokenNameIdentifier	 percentile Write Latency Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getPercentileWriteLatencyPercentile	TokenNameIdentifier	 get Percentile Write Latency Percentile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
percentileWriteLatencyPercentile	TokenNameIdentifier	 percentile Write Latency Percentile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
