/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Meter	TokenNameIdentifier	 Meter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ClientRequestMetrics	TokenNameIdentifier	 Client Request Metrics
extends	TokenNameextends	
LatencyMetrics	TokenNameIdentifier	 Latency Metrics
{	TokenNameLBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
readTimeouts	TokenNameIdentifier	 read Timeouts
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
ClientRequestMetrics	TokenNameIdentifier	 Client Request Metrics
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"ReadTimeouts"	TokenNameStringLiteral	ReadTimeouts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
writeTimeouts	TokenNameIdentifier	 write Timeouts
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
ClientRequestMetrics	TokenNameIdentifier	 Client Request Metrics
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"WriteTimeouts"	TokenNameStringLiteral	WriteTimeouts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
readUnavailables	TokenNameIdentifier	 read Unavailables
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
ClientRequestMetrics	TokenNameIdentifier	 Client Request Metrics
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"ReadUnavailables"	TokenNameStringLiteral	ReadUnavailables
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Counter	TokenNameIdentifier	 Counter
writeUnavailables	TokenNameIdentifier	 write Unavailables
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
ClientRequestMetrics	TokenNameIdentifier	 Client Request Metrics
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"WriteUnavailables"	TokenNameStringLiteral	WriteUnavailables
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Meter	TokenNameIdentifier	 Meter
timeouts	TokenNameIdentifier	 timeouts
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Meter	TokenNameIdentifier	 Meter
unavailables	TokenNameIdentifier	 unavailables
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClientRequestMetrics	TokenNameIdentifier	 Client Request Metrics
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"org.apache.cassandra.metrics"	TokenNameStringLiteral	org.apache.cassandra.metrics
,	TokenNameCOMMA	
"ClientRequest"	TokenNameStringLiteral	ClientRequest
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeouts	TokenNameIdentifier	 timeouts
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newMeter	TokenNameIdentifier	 new Meter
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"Timeouts"	TokenNameStringLiteral	Timeouts
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"timeouts"	TokenNameStringLiteral	timeouts
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unavailables	TokenNameIdentifier	 unavailables
=	TokenNameEQUAL	
Metrics	TokenNameIdentifier	 Metrics
.	TokenNameDOT	
newMeter	TokenNameIdentifier	 new Meter
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createMetricName	TokenNameIdentifier	 create Metric Name
(	TokenNameLPAREN	
"Unavailables"	TokenNameStringLiteral	Unavailables
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"unavailables"	TokenNameStringLiteral	unavailables
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
super	TokenNamesuper	
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
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
"Timeouts"	TokenNameStringLiteral	Timeouts
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
"Unavailables"	TokenNameStringLiteral	Unavailables
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
