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
MessagingService	TokenNameIdentifier	 Messaging Service
;	TokenNameSEMICOLON	
/** * Metrics for dropped messages by verb. */	TokenNameCOMMENT_JAVADOC	 Metrics for dropped messages by verb. 
public	TokenNamepublic	
class	TokenNameclass	
DroppedMessageMetrics	TokenNameIdentifier	 Dropped Message Metrics
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
"DroppedMessage"	TokenNameStringLiteral	DroppedMessage
;	TokenNameSEMICOLON	
/** Number of dropped messages */	TokenNameCOMMENT_JAVADOC	 Number of dropped messages 
public	TokenNamepublic	
final	TokenNamefinal	
Meter	TokenNameIdentifier	 Meter
dropped	TokenNameIdentifier	 dropped
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastDropped	TokenNameIdentifier	 last Dropped
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DroppedMessageMetrics	TokenNameIdentifier	 Dropped Message Metrics
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
verb	TokenNameIdentifier	 verb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dropped	TokenNameIdentifier	 dropped
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
"Dropped"	TokenNameStringLiteral	Dropped
,	TokenNameCOMMA	
verb	TokenNameIdentifier	 verb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"dropped"	TokenNameStringLiteral	dropped
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
getRecentlyDropped	TokenNameIdentifier	 get Recently Dropped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
currentDropped	TokenNameIdentifier	 current Dropped
=	TokenNameEQUAL	
dropped	TokenNameIdentifier	 dropped
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
recentlyDropped	TokenNameIdentifier	 recently Dropped
=	TokenNameEQUAL	
currentDropped	TokenNameIdentifier	 current Dropped
-	TokenNameMINUS	
lastDropped	TokenNameIdentifier	 last Dropped
;	TokenNameSEMICOLON	
lastDropped	TokenNameIdentifier	 last Dropped
=	TokenNameEQUAL	
currentDropped	TokenNameIdentifier	 current Dropped
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
recentlyDropped	TokenNameIdentifier	 recently Dropped
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
