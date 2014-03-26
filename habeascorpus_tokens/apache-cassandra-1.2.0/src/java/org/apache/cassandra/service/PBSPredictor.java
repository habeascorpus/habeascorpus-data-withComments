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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ManagementFactory	TokenNameIdentifier	 Management Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ConcurrentLinkedQueue	TokenNameIdentifier	 Concurrent Linked Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MBeanServer	TokenNameIdentifier	 M Bean Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ObjectName	TokenNameIdentifier	 Object Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
;	TokenNameSEMICOLON	
/** * Performs latency and consistency predictions as described in * <a href="http://arxiv.org/pdf/1204.6082.pdf"> * "Probabilistically Bounded Staleness for Practical Partial Quorums"</a> * by Bailis et al. in VLDB 2012. The predictions are of the form: * <p/> * <i>With ReplicationFactor <tt>N</tt>, read consistency level of * <tt>R</tt>, and write consistency level <tt>W</tt>, after * <tt>t</tt> seconds, <tt>p</tt>% of reads will return a version * within <tt>k</tt> versions of the last written; this should result * in a latency of <tt>L</tt> ms.</i> * <p/> * <p/> * These predictions should be used as a rough guideline for system * operators. This interface is exposed through nodetool. * <p/> * <p/> * The class accomplishes this by measuring latencies for reads and * writes, then using Monte Carlo simulation to predict behavior under * a given N,R, and W based on those latencies. * <p/> * <p/> * We capture four distributions: * <p/> * <ul> * <li> * <tt>W</tt>: time from when the coordinator sends a mutation to the time * that a replica begins to serve the new value(s) * </li> * <p/> * <li> * <tt>A</tt>: time from when a replica accepting a mutation sends an * acknowledgment to the time the coordinator hears of it * </li> * <p/> * <li> * <tt>R</tt>: time from when the coordinator sends a read request to the time * that the replica performs the read * </li> * <p/> * <li> * <tt>S</tt>: time from when the replica sends a read response to the time * when the coordinator receives it * </li> * </ul> * <p/> * <tt>A</tt> and <tt>S</tt> are mostly network-bound, while W and R * depend on both the network and local processing time. * <p/> * <p/> * <b>Caveats:</b> * Prediction is only as good as the latencies collected. Accurate * prediction requires synchronizing clocks between replicas. We * collect a running sample of latencies, but, if latencies change * dramatically, predictions will be off. * <p/> * <p/> * The predictions are conservative, or worst-case, meaning we may * predict more staleness than in practice in the following ways: * <ul> * <li> * We do not account for read repair. * </li> * <li> * We do not account for Merkle tree exchange. * </li> * <li> * Multi-version staleness is particularly conservative. * </li> * <li> * We simulate non-local reads and writes. We assume that the * coordinating Cassandra node is not itself a replica for a given key. * </li> * </ul> * <p/> * <p/> * The predictions are optimistic in the following ways: * <ul> * <li> * We do not predict the impact of node failure. * </li> * <li> * We do not model hinted handoff. * </li> * </ul> * * @see org.apache.cassandra.thrift.ConsistencyLevel * @see org.apache.cassandra.locator.AbstractReplicationStrategy */	TokenNameCOMMENT_JAVADOC	 Performs latency and consistency predictions as described in <a href="http://arxiv.org/pdf/1204.6082.pdf"> "Probabilistically Bounded Staleness for Practical Partial Quorums"</a> by Bailis et al. in VLDB 2012. The predictions are of the form: <p/> <i>With ReplicationFactor <tt>N</tt>, read consistency level of <tt>R</tt>, and write consistency level <tt>W</tt>, after <tt>t</tt> seconds, <tt>p</tt>% of reads will return a version within <tt>k</tt> versions of the last written; this should result in a latency of <tt>L</tt> ms.</i> <p/> <p/> These predictions should be used as a rough guideline for system operators. This interface is exposed through nodetool. <p/> <p/> The class accomplishes this by measuring latencies for reads and writes, then using Monte Carlo simulation to predict behavior under a given N,R, and W based on those latencies. <p/> <p/> We capture four distributions: <p/> <ul> <li> <tt>W</tt>: time from when the coordinator sends a mutation to the time that a replica begins to serve the new value(s) </li> <p/> <li> <tt>A</tt>: time from when a replica accepting a mutation sends an acknowledgment to the time the coordinator hears of it </li> <p/> <li> <tt>R</tt>: time from when the coordinator sends a read request to the time that the replica performs the read </li> <p/> <li> <tt>S</tt>: time from when the replica sends a read response to the time when the coordinator receives it </li> </ul> <p/> <tt>A</tt> and <tt>S</tt> are mostly network-bound, while W and R depend on both the network and local processing time. <p/> <p/> <b>Caveats:</b> Prediction is only as good as the latencies collected. Accurate prediction requires synchronizing clocks between replicas. We collect a running sample of latencies, but, if latencies change dramatically, predictions will be off. <p/> <p/> The predictions are conservative, or worst-case, meaning we may predict more staleness than in practice in the following ways: <ul> <li> We do not account for read repair. </li> <li> We do not account for Merkle tree exchange. </li> <li> Multi-version staleness is particularly conservative. </li> <li> We simulate non-local reads and writes. We assume that the coordinating Cassandra node is not itself a replica for a given key. </li> </ul> <p/> <p/> The predictions are optimistic in the following ways: <ul> <li> We do not predict the impact of node failure. </li> <li> We do not model hinted handoff. </li> </ul> * @see org.apache.cassandra.thrift.ConsistencyLevel @see org.apache.cassandra.locator.AbstractReplicationStrategy 
public	TokenNamepublic	
class	TokenNameclass	
PBSPredictor	TokenNameIdentifier	 PBS Predictor
implements	TokenNameimplements	
PBSPredictorMBean	TokenNameIdentifier	 PBS Predictor M Bean
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
PBSPredictor	TokenNameIdentifier	 PBS Predictor
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MBEAN_NAME	TokenNameIdentifier	 MBEAN  NAME
=	TokenNameEQUAL	
"org.apache.cassandra.service:type=PBSPredictor"	TokenNameStringLiteral	org.apache.cassandra.service:type=PBSPredictor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_DO_LOG_LATENCIES	TokenNameIdentifier	 DEFAULT  DO  LOG  LATENCIES
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_LOGGED_LATENCIES	TokenNameIdentifier	 DEFAULT  MAX  LOGGED  LATENCIES
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_NUMBER_TRIALS_PREDICTION	TokenNameIdentifier	 DEFAULT  NUMBER  TRIALS  PREDICTION
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * We record a fixed size set of WARS latencies for read and * mutation operations. We store the order in which each * operation arrived, and use an LRU policy to evict old * messages. * * This information is stored as a mapping from messageIDs to * latencies. */	TokenNameCOMMENT_BLOCK	 We record a fixed size set of WARS latencies for read and mutation operations. We store the order in which each operation arrived, and use an LRU policy to evict old messages. * This information is stored as a mapping from messageIDs to latencies. 
/* * Helper class which minimizes the number of HashMaps we maintain. * For a given messageId, this class maintains the startTime of the message, * and a queue for send times and reply times. * * sendLats corresponds to W and R, while replyLats is used for A and S. */	TokenNameCOMMENT_BLOCK	 Helper class which minimizes the number of HashMaps we maintain. For a given messageId, this class maintains the startTime of the message, and a queue for send times and reply times. * sendLats corresponds to W and R, while replyLats is used for A and S. 
private	TokenNameprivate	
class	TokenNameclass	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
{	TokenNameLBRACE	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
startTime	TokenNameIdentifier	 start Time
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sendLats	TokenNameIdentifier	 send Lats
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentLinkedQueue	TokenNameIdentifier	 Concurrent Linked Queue
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
replyLats	TokenNameIdentifier	 reply Lats
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentLinkedQueue	TokenNameIdentifier	 Concurrent Linked Queue
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addSendLat	TokenNameIdentifier	 add Send Lat
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
sendLat	TokenNameIdentifier	 send Lat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sendLats	TokenNameIdentifier	 send Lats
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sendLat	TokenNameIdentifier	 send Lat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addReplyLat	TokenNameIdentifier	 add Reply Lat
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
replyLat	TokenNameIdentifier	 reply Lat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
replyLats	TokenNameIdentifier	 reply Lats
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
replyLat	TokenNameIdentifier	 reply Lat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getSendLats	TokenNameIdentifier	 get Send Lats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sendLats	TokenNameIdentifier	 send Lats
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getReplyLats	TokenNameIdentifier	 get Reply Lats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
replyLats	TokenNameIdentifier	 reply Lats
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Long	TokenNameIdentifier	 Long
getStartTime	TokenNameIdentifier	 get Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startTime	TokenNameIdentifier	 start Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Long	TokenNameIdentifier	 Long
startTime	TokenNameIdentifier	 start Time
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
sendLats	TokenNameIdentifier	 send Lats
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
replyLats	TokenNameIdentifier	 reply Lats
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// used for LRU replacement 	TokenNameCOMMENT_LINE	used for LRU replacement 
private	TokenNameprivate	
final	TokenNamefinal	
Queue	TokenNameIdentifier	 Queue
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
writeMessageIds	TokenNameIdentifier	 write Message Ids
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Queue	TokenNameIdentifier	 Queue
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
readMessageIds	TokenNameIdentifier	 read Message Ids
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
>	TokenNameGREATER	
messageIdToWriteLats	TokenNameIdentifier	 message Id To Write Lats
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
>	TokenNameGREATER	
messageIdToReadLats	TokenNameIdentifier	 message Id To Read Lats
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
initialized	TokenNameIdentifier	 initialized
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
logLatencies	TokenNameIdentifier	 log Latencies
=	TokenNameEQUAL	
DEFAULT_DO_LOG_LATENCIES	TokenNameIdentifier	 DEFAULT  DO  LOG  LATENCIES
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxLoggedLatencies	TokenNameIdentifier	 max Logged Latencies
=	TokenNameEQUAL	
DEFAULT_MAX_LOGGED_LATENCIES	TokenNameIdentifier	 DEFAULT  MAX  LOGGED  LATENCIES
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numberTrialsPrediction	TokenNameIdentifier	 number Trials Prediction
=	TokenNameEQUAL	
DEFAULT_NUMBER_TRIALS_PREDICTION	TokenNameIdentifier	 DEFAULT  NUMBER  TRIALS  PREDICTION
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
PBSPredictor	TokenNameIdentifier	 PBS Predictor
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
PBSPredictor	TokenNameIdentifier	 PBS Predictor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
PBSPredictor	TokenNameIdentifier	 PBS Predictor
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
PBSPredictor	TokenNameIdentifier	 PBS Predictor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
enableConsistencyPredictionLogging	TokenNameIdentifier	 enable Consistency Prediction Logging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logLatencies	TokenNameIdentifier	 log Latencies
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
disableConsistencyPredictionLogging	TokenNameIdentifier	 disable Consistency Prediction Logging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logLatencies	TokenNameIdentifier	 log Latencies
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isLoggingEnabled	TokenNameIdentifier	 is Logging Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
logLatencies	TokenNameIdentifier	 log Latencies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxLoggedLatenciesForConsistencyPrediction	TokenNameIdentifier	 set Max Logged Latencies For Consistency Prediction
(	TokenNameLPAREN	
int	TokenNameint	
maxLogged	TokenNameIdentifier	 max Logged
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxLoggedLatencies	TokenNameIdentifier	 max Logged Latencies
=	TokenNameEQUAL	
maxLogged	TokenNameIdentifier	 max Logged
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNumberTrialsForConsistencyPrediction	TokenNameIdentifier	 set Number Trials For Consistency Prediction
(	TokenNameLPAREN	
int	TokenNameint	
numTrials	TokenNameIdentifier	 num Trials
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberTrialsPrediction	TokenNameIdentifier	 number Trials Prediction
=	TokenNameEQUAL	
numTrials	TokenNameIdentifier	 num Trials
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initialized	TokenNameIdentifier	 initialized
)	TokenNameRPAREN	
{	TokenNameLBRACE	
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MBeanServer	TokenNameIdentifier	 M Bean Server
mbs	TokenNameIdentifier	 mbs
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getPlatformMBeanServer	TokenNameIdentifier	 get Platform M Bean Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
mbs	TokenNameIdentifier	 mbs
.	TokenNameDOT	
registerMBean	TokenNameIdentifier	 register M Bean
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
ObjectName	TokenNameIdentifier	 Object Name
(	TokenNameLPAREN	
PBSPredictor	TokenNameIdentifier	 PBS Predictor
.	TokenNameDOT	
MBEAN_NAME	TokenNameIdentifier	 MBEAN  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initialized	TokenNameIdentifier	 initialized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// used for random sampling from the latencies 	TokenNameCOMMENT_LINE	used for random sampling from the latencies 
private	TokenNameprivate	
long	TokenNamelong	
getRandomElement	TokenNameIdentifier	 get Random Element
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Not enough data for prediction"	TokenNameStringLiteral	Not enough data for prediction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// used for calculating the average latency of a read or write operation 	TokenNameCOMMENT_LINE	used for calculating the average latency of a read or write operation 
// given a set of simulated latencies 	TokenNameCOMMENT_LINE	given a set of simulated latencies 
private	TokenNameprivate	
float	TokenNamefloat	
listAverage	TokenNameIdentifier	 list Average
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
accum	TokenNameIdentifier	 accum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
accum	TokenNameIdentifier	 accum
+=	TokenNamePLUS_EQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
accum	TokenNameIdentifier	 accum
/	TokenNameDIVIDE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// calculate the percentile entry of a list 	TokenNameCOMMENT_LINE	calculate the percentile entry of a list 
private	TokenNameprivate	
long	TokenNamelong	
getPercentile	TokenNameIdentifier	 get Percentile
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
float	TokenNamefloat	
percentile	TokenNameIdentifier	 percentile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
percentile	TokenNameIdentifier	 percentile
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * For our trials, sample the latency for the (replicaNumber)th * reply for one of WARS * if replicaNumber > the number of replicas we have data for * (say we have data for ReplicationFactor 2 but ask for N=3) * then we randomly sample from all response times */	TokenNameCOMMENT_BLOCK	 For our trials, sample the latency for the (replicaNumber)th reply for one of WARS if replicaNumber > the number of replicas we have data for (say we have data for ReplicationFactor 2 but ask for N=3) then we randomly sample from all response times 
private	TokenNameprivate	
long	TokenNamelong	
getRandomLatencySample	TokenNameIdentifier	 get Random Latency Sample
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
samples	TokenNameIdentifier	 samples
,	TokenNameCOMMA	
int	TokenNameint	
replicaNumber	TokenNameIdentifier	 replica Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
replicaNumber	TokenNameIdentifier	 replica Number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRandomElement	TokenNameIdentifier	 get Random Element
(	TokenNameLPAREN	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
replicaNumber	TokenNameIdentifier	 replica Number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getRandomElement	TokenNameIdentifier	 get Random Element
(	TokenNameLPAREN	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * To perform the prediction, we randomly sample from the * collected WARS latencies, simulating writes followed by reads * exactly t milliseconds afterwards. We count the number of * reordered reads and writes to calculate the probability of * staleness along with recording operation latencies. */	TokenNameCOMMENT_BLOCK	 To perform the prediction, we randomly sample from the collected WARS latencies, simulating writes followed by reads exactly t milliseconds afterwards. We count the number of reordered reads and writes to calculate the probability of staleness along with recording operation latencies. 
public	TokenNamepublic	
PBSPredictionResult	TokenNameIdentifier	 PBS Prediction Result
doPrediction	TokenNameIdentifier	 do Prediction
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
percentileLatency	TokenNameIdentifier	 percentile Latency
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
>	TokenNameGREATER	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"r must be less than n"	TokenNameStringLiteral	r must be less than n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"r must be positive"	TokenNameStringLiteral	r must be positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>	TokenNameGREATER	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"w must be less than n"	TokenNameStringLiteral	w must be less than n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"w must be positive"	TokenNameStringLiteral	w must be positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
percentileLatency	TokenNameIdentifier	 percentile Latency
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
percentileLatency	TokenNameIdentifier	 percentile Latency
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"percentileLatency must be between 0 and 1 inclusive"	TokenNameStringLiteral	percentileLatency must be between 0 and 1 inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numberVersionsStale	TokenNameIdentifier	 number Versions Stale
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"numberVersionsStale must be positive"	TokenNameStringLiteral	numberVersionsStale must be positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logLatencies	TokenNameIdentifier	 log Latencies
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Latency logging is not enabled"	TokenNameStringLiteral	Latency logging is not enabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get a mapping of {replica number : latency} for each of WARS 	TokenNameCOMMENT_LINE	get a mapping of {replica number : latency} for each of WARS 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
wLatencies	TokenNameIdentifier	 w Latencies
=	TokenNameEQUAL	
getOrderedWLatencies	TokenNameIdentifier	 get Ordered W Latencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
aLatencies	TokenNameIdentifier	 a Latencies
=	TokenNameEQUAL	
getOrderedALatencies	TokenNameIdentifier	 get Ordered A Latencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
rLatencies	TokenNameIdentifier	 r Latencies
=	TokenNameEQUAL	
getOrderedRLatencies	TokenNameIdentifier	 get Ordered R Latencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
sLatencies	TokenNameIdentifier	 s Latencies
=	TokenNameEQUAL	
getOrderedSLatencies	TokenNameIdentifier	 get Ordered S Latencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wLatencies	TokenNameIdentifier	 w Latencies
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
aLatencies	TokenNameIdentifier	 a Latencies
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"No write latencies have been recorded so far. Run some (non-local) inserts."	TokenNameStringLiteral	No write latencies have been recorded so far. Run some (non-local) inserts.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rLatencies	TokenNameIdentifier	 r Latencies
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
sLatencies	TokenNameIdentifier	 s Latencies
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"No read latencies have been recorded so far. Run some (non-local) reads."	TokenNameStringLiteral	No read latencies have been recorded so far. Run some (non-local) reads.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// storage for simulated read and write latencies 	TokenNameCOMMENT_LINE	storage for simulated read and write latencies 
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
readLatencies	TokenNameIdentifier	 read Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
writeLatencies	TokenNameIdentifier	 write Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
consistentReads	TokenNameIdentifier	 consistent Reads
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// storage for latencies for each replica for a given Monte Carlo trial 	TokenNameCOMMENT_LINE	storage for latencies for each replica for a given Monte Carlo trial 
// arr[i] will hold the ith replica's latency for one of WARS 	TokenNameCOMMENT_LINE	arr[i] will hold the ith replica's latency for one of WARS 
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
trialWLatencies	TokenNameIdentifier	 trial W Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
trialRLatencies	TokenNameIdentifier	 trial R Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
replicaWriteLatencies	TokenNameIdentifier	 replica Write Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
replicaReadLatencies	TokenNameIdentifier	 replica Read Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//run repeated trials and observe staleness 	TokenNameCOMMENT_LINE	run repeated trials and observe staleness 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numberTrialsPrediction	TokenNameIdentifier	 number Trials Prediction
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//simulate sending a write to N replicas then sending a 	TokenNameCOMMENT_LINE	simulate sending a write to N replicas then sending a 
//read to N replicas and record the latencies by randomly 	TokenNameCOMMENT_LINE	read to N replicas and record the latencies by randomly 
//sampling from gathered latencies 	TokenNameCOMMENT_LINE	sampling from gathered latencies 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
replicaNo	TokenNameIdentifier	 replica No
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
replicaNo	TokenNameIdentifier	 replica No
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
replicaNo	TokenNameIdentifier	 replica No
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
trialWLatency	TokenNameIdentifier	 trial W Latency
=	TokenNameEQUAL	
getRandomLatencySample	TokenNameIdentifier	 get Random Latency Sample
(	TokenNameLPAREN	
wLatencies	TokenNameIdentifier	 w Latencies
,	TokenNameCOMMA	
replicaNo	TokenNameIdentifier	 replica No
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
trialALatency	TokenNameIdentifier	 trial A Latency
=	TokenNameEQUAL	
getRandomLatencySample	TokenNameIdentifier	 get Random Latency Sample
(	TokenNameLPAREN	
aLatencies	TokenNameIdentifier	 a Latencies
,	TokenNameCOMMA	
replicaNo	TokenNameIdentifier	 replica No
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trialWLatencies	TokenNameIdentifier	 trial W Latencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
trialWLatency	TokenNameIdentifier	 trial W Latency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replicaWriteLatencies	TokenNameIdentifier	 replica Write Latencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
trialWLatency	TokenNameIdentifier	 trial W Latency
+	TokenNamePLUS	
trialALatency	TokenNameIdentifier	 trial A Latency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reads are only sent to R replicas - so pick R random read and 	TokenNameCOMMENT_LINE	reads are only sent to R replicas - so pick R random read and 
// response latencies 	TokenNameCOMMENT_LINE	response latencies 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
replicaNo	TokenNameIdentifier	 replica No
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
replicaNo	TokenNameIdentifier	 replica No
<	TokenNameLESS	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
replicaNo	TokenNameIdentifier	 replica No
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
trialRLatency	TokenNameIdentifier	 trial R Latency
=	TokenNameEQUAL	
getRandomLatencySample	TokenNameIdentifier	 get Random Latency Sample
(	TokenNameLPAREN	
rLatencies	TokenNameIdentifier	 r Latencies
,	TokenNameCOMMA	
replicaNo	TokenNameIdentifier	 replica No
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
trialSLatency	TokenNameIdentifier	 trial S Latency
=	TokenNameEQUAL	
getRandomLatencySample	TokenNameIdentifier	 get Random Latency Sample
(	TokenNameLPAREN	
sLatencies	TokenNameIdentifier	 s Latencies
,	TokenNameCOMMA	
replicaNo	TokenNameIdentifier	 replica No
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trialRLatencies	TokenNameIdentifier	 trial R Latencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
trialRLatency	TokenNameIdentifier	 trial R Latency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replicaReadLatencies	TokenNameIdentifier	 replica Read Latencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
trialRLatency	TokenNameIdentifier	 trial R Latency
+	TokenNamePLUS	
trialSLatency	TokenNameIdentifier	 trial S Latency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// the write latency for this trial is the time it takes 	TokenNameCOMMENT_LINE	the write latency for this trial is the time it takes 
// for the wth replica to respond (W+A) 	TokenNameCOMMENT_LINE	for the wth replica to respond (W+A) 
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
replicaWriteLatencies	TokenNameIdentifier	 replica Write Latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
writeLatency	TokenNameIdentifier	 write Latency
=	TokenNameEQUAL	
replicaWriteLatencies	TokenNameIdentifier	 replica Write Latencies
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeLatencies	TokenNameIdentifier	 write Latencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
writeLatency	TokenNameIdentifier	 write Latency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
sortedReplicaReadLatencies	TokenNameIdentifier	 sorted Replica Read Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
replicaReadLatencies	TokenNameIdentifier	 replica Read Latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
sortedReplicaReadLatencies	TokenNameIdentifier	 sorted Replica Read Latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the read latency for this trial is the time it takes 	TokenNameCOMMENT_LINE	the read latency for this trial is the time it takes 
// for the rth replica to respond (R+S) 	TokenNameCOMMENT_LINE	for the rth replica to respond (R+S) 
readLatencies	TokenNameIdentifier	 read Latencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sortedReplicaReadLatencies	TokenNameIdentifier	 sorted Replica Read Latencies
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// were all of the read responses reordered? 	TokenNameCOMMENT_LINE	were all of the read responses reordered? 
// for each of the first r messages (the ones the 	TokenNameCOMMENT_LINE	for each of the first r messages (the ones the 
// coordinator will pick from): 	TokenNameCOMMENT_LINE	coordinator will pick from): 
//--if the read message came in after this replica saw the 	TokenNameCOMMENT_LINE	--if the read message came in after this replica saw the 
// write, it will be consistent 	TokenNameCOMMENT_LINE	write, it will be consistent 
//--each read request is sent at time 	TokenNameCOMMENT_LINE	--each read request is sent at time 
// writeLatency+timeSinceWrite 	TokenNameCOMMENT_LINE	writeLatency+timeSinceWrite 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
responseNumber	TokenNameIdentifier	 response Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
responseNumber	TokenNameIdentifier	 response Number
<	TokenNameLESS	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
responseNumber	TokenNameIdentifier	 response Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
replicaNumber	TokenNameIdentifier	 replica Number
=	TokenNameEQUAL	
replicaReadLatencies	TokenNameIdentifier	 replica Read Latencies
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
sortedReplicaReadLatencies	TokenNameIdentifier	 sorted Replica Read Latencies
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
responseNumber	TokenNameIdentifier	 response Number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
writeLatency	TokenNameIdentifier	 write Latency
+	TokenNamePLUS	
timeSinceWrite	TokenNameIdentifier	 time Since Write
+	TokenNamePLUS	
trialRLatencies	TokenNameIdentifier	 trial R Latencies
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
replicaNumber	TokenNameIdentifier	 replica Number
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
trialWLatencies	TokenNameIdentifier	 trial W Latencies
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
replicaNumber	TokenNameIdentifier	 replica Number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
consistentReads	TokenNameIdentifier	 consistent Reads
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// tombstone this replica in the case that we have 	TokenNameCOMMENT_LINE	tombstone this replica in the case that we have 
// duplicate read latencies 	TokenNameCOMMENT_LINE	duplicate read latencies 
replicaReadLatencies	TokenNameIdentifier	 replica Read Latencies
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
replicaNumber	TokenNameIdentifier	 replica Number
,	TokenNameCOMMA	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear storage for the next trial 	TokenNameCOMMENT_LINE	clear storage for the next trial 
trialWLatencies	TokenNameIdentifier	 trial W Latencies
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trialRLatencies	TokenNameIdentifier	 trial R Latencies
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replicaReadLatencies	TokenNameIdentifier	 replica Read Latencies
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replicaWriteLatencies	TokenNameIdentifier	 replica Write Latencies
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
oneVersionConsistencyProbability	TokenNameIdentifier	 one Version Consistency Probability
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
consistentReads	TokenNameIdentifier	 consistent Reads
/	TokenNameDIVIDE	
numberTrialsPrediction	TokenNameIdentifier	 number Trials Prediction
;	TokenNameSEMICOLON	
// to calculate multi-version staleness, we exponentiate the staleness probability by the number of versions 	TokenNameCOMMENT_LINE	to calculate multi-version staleness, we exponentiate the staleness probability by the number of versions 
float	TokenNamefloat	
consistencyProbability	TokenNameIdentifier	 consistency Probability
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
oneVersionConsistencyProbability	TokenNameIdentifier	 one Version Consistency Probability
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numberVersionsStale	TokenNameIdentifier	 number Versions Stale
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
averageWriteLatency	TokenNameIdentifier	 average Write Latency
=	TokenNameEQUAL	
listAverage	TokenNameIdentifier	 list Average
(	TokenNameLPAREN	
writeLatencies	TokenNameIdentifier	 write Latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
averageReadLatency	TokenNameIdentifier	 average Read Latency
=	TokenNameEQUAL	
listAverage	TokenNameIdentifier	 list Average
(	TokenNameLPAREN	
readLatencies	TokenNameIdentifier	 read Latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
percentileWriteLatency	TokenNameIdentifier	 percentile Write Latency
=	TokenNameEQUAL	
getPercentile	TokenNameIdentifier	 get Percentile
(	TokenNameLPAREN	
writeLatencies	TokenNameIdentifier	 write Latencies
,	TokenNameCOMMA	
percentileLatency	TokenNameIdentifier	 percentile Latency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
percentileReadLatency	TokenNameIdentifier	 percentile Read Latency
=	TokenNameEQUAL	
getPercentile	TokenNameIdentifier	 get Percentile
(	TokenNameLPAREN	
readLatencies	TokenNameIdentifier	 read Latencies
,	TokenNameCOMMA	
percentileLatency	TokenNameIdentifier	 percentile Latency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
PBSPredictionResult	TokenNameIdentifier	 PBS Prediction Result
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
timeSinceWrite	TokenNameIdentifier	 time Since Write
,	TokenNameCOMMA	
numberVersionsStale	TokenNameIdentifier	 number Versions Stale
,	TokenNameCOMMA	
consistencyProbability	TokenNameIdentifier	 consistency Probability
,	TokenNameCOMMA	
averageReadLatency	TokenNameIdentifier	 average Read Latency
,	TokenNameCOMMA	
averageWriteLatency	TokenNameIdentifier	 average Write Latency
,	TokenNameCOMMA	
percentileReadLatency	TokenNameIdentifier	 percentile Read Latency
,	TokenNameCOMMA	
percentileLatency	TokenNameIdentifier	 percentile Latency
,	TokenNameCOMMA	
percentileWriteLatency	TokenNameIdentifier	 percentile Write Latency
,	TokenNameCOMMA	
percentileLatency	TokenNameIdentifier	 percentile Latency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startWriteOperation	TokenNameIdentifier	 start Write Operation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logLatencies	TokenNameIdentifier	 log Latencies
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
startWriteOperation	TokenNameIdentifier	 start Write Operation
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startWriteOperation	TokenNameIdentifier	 start Write Operation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logLatencies	TokenNameIdentifier	 log Latencies
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
!	TokenNameNOT	
messageIdToWriteLats	TokenNameIdentifier	 message Id To Write Lats
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeMessageIds	TokenNameIdentifier	 write Message Ids
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// LRU replacement of latencies 	TokenNameCOMMENT_LINE	LRU replacement of latencies 
// the maximum number of entries is sloppy, but that's acceptable for our purposes 	TokenNameCOMMENT_LINE	the maximum number of entries is sloppy, but that's acceptable for our purposes 
if	TokenNameif	
(	TokenNameLPAREN	
writeMessageIds	TokenNameIdentifier	 write Message Ids
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxLoggedLatencies	TokenNameIdentifier	 max Logged Latencies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
toEvict	TokenNameIdentifier	 to Evict
=	TokenNameEQUAL	
writeMessageIds	TokenNameIdentifier	 write Message Ids
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
messageIdToWriteLats	TokenNameIdentifier	 message Id To Write Lats
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
toEvict	TokenNameIdentifier	 to Evict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
messageIdToWriteLats	TokenNameIdentifier	 message Id To Write Lats
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
new	TokenNamenew	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
(	TokenNameLPAREN	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startReadOperation	TokenNameIdentifier	 start Read Operation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logLatencies	TokenNameIdentifier	 log Latencies
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
startReadOperation	TokenNameIdentifier	 start Read Operation
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startReadOperation	TokenNameIdentifier	 start Read Operation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logLatencies	TokenNameIdentifier	 log Latencies
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
!	TokenNameNOT	
messageIdToReadLats	TokenNameIdentifier	 message Id To Read Lats
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readMessageIds	TokenNameIdentifier	 read Message Ids
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// LRU replacement of latencies 	TokenNameCOMMENT_LINE	LRU replacement of latencies 
// the maximum number of entries is sloppy, but that's acceptable for our purposes 	TokenNameCOMMENT_LINE	the maximum number of entries is sloppy, but that's acceptable for our purposes 
if	TokenNameif	
(	TokenNameLPAREN	
readMessageIds	TokenNameIdentifier	 read Message Ids
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxLoggedLatencies	TokenNameIdentifier	 max Logged Latencies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
toEvict	TokenNameIdentifier	 to Evict
=	TokenNameEQUAL	
readMessageIds	TokenNameIdentifier	 read Message Ids
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
messageIdToReadLats	TokenNameIdentifier	 message Id To Read Lats
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
toEvict	TokenNameIdentifier	 to Evict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
messageIdToReadLats	TokenNameIdentifier	 message Id To Read Lats
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
new	TokenNamenew	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
(	TokenNameLPAREN	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
logWriteResponse	TokenNameIdentifier	 log Write Response
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
constructionTime	TokenNameIdentifier	 construction Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logLatencies	TokenNameIdentifier	 log Latencies
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
logWriteResponse	TokenNameIdentifier	 log Write Response
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
constructionTime	TokenNameIdentifier	 construction Time
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
logWriteResponse	TokenNameIdentifier	 log Write Response
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
responseCreationTime	TokenNameIdentifier	 response Creation Time
,	TokenNameCOMMA	
long	TokenNamelong	
receivedTime	TokenNameIdentifier	 received Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logLatencies	TokenNameIdentifier	 log Latencies
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
writeLatsCollection	TokenNameIdentifier	 write Lats Collection
=	TokenNameEQUAL	
messageIdToWriteLats	TokenNameIdentifier	 message Id To Write Lats
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
writeLatsCollection	TokenNameIdentifier	 write Lats Collection
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Long	TokenNameIdentifier	 Long
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
writeLatsCollection	TokenNameIdentifier	 write Lats Collection
.	TokenNameDOT	
getStartTime	TokenNameIdentifier	 get Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeLatsCollection	TokenNameIdentifier	 write Lats Collection
.	TokenNameDOT	
addSendLat	TokenNameIdentifier	 add Send Lat
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
responseCreationTime	TokenNameIdentifier	 response Creation Time
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeLatsCollection	TokenNameIdentifier	 write Lats Collection
.	TokenNameDOT	
addReplyLat	TokenNameIdentifier	 add Reply Lat
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
receivedTime	TokenNameIdentifier	 received Time
-	TokenNameMINUS	
responseCreationTime	TokenNameIdentifier	 response Creation Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
logReadResponse	TokenNameIdentifier	 log Read Response
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
constructionTime	TokenNameIdentifier	 construction Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logLatencies	TokenNameIdentifier	 log Latencies
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
logReadResponse	TokenNameIdentifier	 log Read Response
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
constructionTime	TokenNameIdentifier	 construction Time
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
logReadResponse	TokenNameIdentifier	 log Read Response
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
responseCreationTime	TokenNameIdentifier	 response Creation Time
,	TokenNameCOMMA	
long	TokenNamelong	
receivedTime	TokenNameIdentifier	 received Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logLatencies	TokenNameIdentifier	 log Latencies
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
readLatsCollection	TokenNameIdentifier	 read Lats Collection
=	TokenNameEQUAL	
messageIdToReadLats	TokenNameIdentifier	 message Id To Read Lats
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
readLatsCollection	TokenNameIdentifier	 read Lats Collection
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Long	TokenNameIdentifier	 Long
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
readLatsCollection	TokenNameIdentifier	 read Lats Collection
.	TokenNameDOT	
getStartTime	TokenNameIdentifier	 get Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readLatsCollection	TokenNameIdentifier	 read Lats Collection
.	TokenNameDOT	
addSendLat	TokenNameIdentifier	 add Send Lat
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
responseCreationTime	TokenNameIdentifier	 response Creation Time
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readLatsCollection	TokenNameIdentifier	 read Lats Collection
.	TokenNameDOT	
addReplyLat	TokenNameIdentifier	 add Reply Lat
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
receivedTime	TokenNameIdentifier	 received Time
-	TokenNameMINUS	
responseCreationTime	TokenNameIdentifier	 response Creation Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
getOrderedWLatencies	TokenNameIdentifier	 get Ordered W Latencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
allWLatencies	TokenNameIdentifier	 all W Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
wlc	TokenNameIdentifier	 wlc
:	TokenNameCOLON	
messageIdToWriteLats	TokenNameIdentifier	 message Id To Write Lats
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allWLatencies	TokenNameIdentifier	 all W Latencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
wlc	TokenNameIdentifier	 wlc
.	TokenNameDOT	
getSendLats	TokenNameIdentifier	 get Send Lats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getOrderedLatencies	TokenNameIdentifier	 get Ordered Latencies
(	TokenNameLPAREN	
allWLatencies	TokenNameIdentifier	 all W Latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
getOrderedALatencies	TokenNameIdentifier	 get Ordered A Latencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
allALatencies	TokenNameIdentifier	 all A Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
wlc	TokenNameIdentifier	 wlc
:	TokenNameCOLON	
messageIdToWriteLats	TokenNameIdentifier	 message Id To Write Lats
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
allALatencies	TokenNameIdentifier	 all A Latencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
wlc	TokenNameIdentifier	 wlc
.	TokenNameDOT	
getReplyLats	TokenNameIdentifier	 get Reply Lats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getOrderedLatencies	TokenNameIdentifier	 get Ordered Latencies
(	TokenNameLPAREN	
allALatencies	TokenNameIdentifier	 all A Latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
getOrderedRLatencies	TokenNameIdentifier	 get Ordered R Latencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
allRLatencies	TokenNameIdentifier	 all R Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
rlc	TokenNameIdentifier	 rlc
:	TokenNameCOLON	
messageIdToReadLats	TokenNameIdentifier	 message Id To Read Lats
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allRLatencies	TokenNameIdentifier	 all R Latencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rlc	TokenNameIdentifier	 rlc
.	TokenNameDOT	
getSendLats	TokenNameIdentifier	 get Send Lats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getOrderedLatencies	TokenNameIdentifier	 get Ordered Latencies
(	TokenNameLPAREN	
allRLatencies	TokenNameIdentifier	 all R Latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
getOrderedSLatencies	TokenNameIdentifier	 get Ordered S Latencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
allSLatencies	TokenNameIdentifier	 all S Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MessageLatencyCollection	TokenNameIdentifier	 Message Latency Collection
rlc	TokenNameIdentifier	 rlc
:	TokenNameCOLON	
messageIdToReadLats	TokenNameIdentifier	 message Id To Read Lats
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
allSLatencies	TokenNameIdentifier	 all S Latencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rlc	TokenNameIdentifier	 rlc
.	TokenNameDOT	
getReplyLats	TokenNameIdentifier	 get Reply Lats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getOrderedLatencies	TokenNameIdentifier	 get Ordered Latencies
(	TokenNameLPAREN	
allSLatencies	TokenNameIdentifier	 all S Latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return the collected latencies indexed by response number instead of by messageID 	TokenNameCOMMENT_LINE	Return the collected latencies indexed by response number instead of by messageID 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
getOrderedLatencies	TokenNameIdentifier	 get Ordered Latencies
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
latencyLists	TokenNameIdentifier	 latency Lists
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// N may vary 	TokenNameCOMMENT_LINE	N may vary 
int	TokenNameint	
maxResponses	TokenNameIdentifier	 max Responses
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
latencies	TokenNameIdentifier	 latencies
:	TokenNameCOLON	
latencyLists	TokenNameIdentifier	 latency Lists
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
sortedLatencies	TokenNameIdentifier	 sorted Latencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
latencies	TokenNameIdentifier	 latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
sortedLatencies	TokenNameIdentifier	 sorted Latencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sortedLatencies	TokenNameIdentifier	 sorted Latencies
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxResponses	TokenNameIdentifier	 max Responses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
maxResponses	TokenNameIdentifier	 max Responses
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
sortedLatencies	TokenNameIdentifier	 sorted Latencies
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxResponses	TokenNameIdentifier	 max Responses
=	TokenNameEQUAL	
sortedLatencies	TokenNameIdentifier	 sorted Latencies
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// indexing by 0 is awkward since we're talking about the ith response 	TokenNameCOMMENT_LINE	indexing by 0 is awkward since we're talking about the ith response 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
sortedLatencies	TokenNameIdentifier	 sorted Latencies
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sortedLatencies	TokenNameIdentifier	 sorted Latencies
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
