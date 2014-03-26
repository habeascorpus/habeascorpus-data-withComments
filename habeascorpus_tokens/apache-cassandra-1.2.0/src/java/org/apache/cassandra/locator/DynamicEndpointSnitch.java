/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
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
TimeUnit	TokenNameIdentifier	 Time Unit
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
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
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
yammer	TokenNameIdentifier	 yammer
.	TokenNameDOT	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
ExponentiallyDecayingSample	TokenNameIdentifier	 Exponentially Decaying Sample
;	TokenNameSEMICOLON	
/** * A dynamic snitch that sorts endpoints by latency with an adapted phi failure detector */	TokenNameCOMMENT_JAVADOC	 A dynamic snitch that sorts endpoints by latency with an adapted phi failure detector 
public	TokenNamepublic	
class	TokenNameclass	
DynamicEndpointSnitch	TokenNameIdentifier	 Dynamic Endpoint Snitch
extends	TokenNameextends	
AbstractEndpointSnitch	TokenNameIdentifier	 Abstract Endpoint Snitch
implements	TokenNameimplements	
ILatencySubscriber	TokenNameIdentifier	 I Latency Subscriber
,	TokenNameCOMMA	
DynamicEndpointSnitchMBean	TokenNameIdentifier	 Dynamic Endpoint Snitch M Bean
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
ALPHA	TokenNameIdentifier	 ALPHA
=	TokenNameEQUAL	
0.75	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// set to 0.75 to make EDS more biased to towards the newer values 	TokenNameCOMMENT_LINE	set to 0.75 to make EDS more biased to towards the newer values 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WINDOW_SIZE	TokenNameIdentifier	 WINDOW  SIZE
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier	 UPDATE  INTERVAL  IN  MS
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getDynamicUpdateInterval	TokenNameIdentifier	 get Dynamic Update Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
RESET_INTERVAL_IN_MS	TokenNameIdentifier	 RESET  INTERVAL  IN  MS
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getDynamicResetInterval	TokenNameIdentifier	 get Dynamic Reset Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
BADNESS_THRESHOLD	TokenNameIdentifier	 BADNESS  THRESHOLD
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getDynamicBadnessThreshold	TokenNameIdentifier	 get Dynamic Badness Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mbeanName	TokenNameIdentifier	 mbean Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
registered	TokenNameIdentifier	 registered
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
scores	TokenNameIdentifier	 scores
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
lastReceived	TokenNameIdentifier	 last Received
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
ExponentiallyDecayingSample	TokenNameIdentifier	 Exponentially Decaying Sample
>	TokenNameGREATER	
samples	TokenNameIdentifier	 samples
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
ExponentiallyDecayingSample	TokenNameIdentifier	 Exponentially Decaying Sample
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
subsnitch	TokenNameIdentifier	 subsnitch
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DynamicEndpointSnitch	TokenNameIdentifier	 Dynamic Endpoint Snitch
(	TokenNameLPAREN	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
snitch	TokenNameIdentifier	 snitch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DynamicEndpointSnitch	TokenNameIdentifier	 Dynamic Endpoint Snitch
(	TokenNameLPAREN	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
snitch	TokenNameIdentifier	 snitch
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mbeanName	TokenNameIdentifier	 mbean Name
=	TokenNameEQUAL	
"org.apache.cassandra.db:type=DynamicEndpointSnitch"	TokenNameStringLiteral	org.apache.cassandra.db:type=DynamicEndpointSnitch
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
mbeanName	TokenNameIdentifier	 mbean Name
+=	TokenNamePLUS_EQUAL	
",instance="	TokenNameStringLiteral	,instance=
+	TokenNamePLUS	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
subsnitch	TokenNameIdentifier	 subsnitch
=	TokenNameEQUAL	
snitch	TokenNameIdentifier	 snitch
;	TokenNameSEMICOLON	
Runnable	TokenNameIdentifier	 Runnable
update	TokenNameIdentifier	 update
=	TokenNameEQUAL	
new	TokenNamenew	
Runnable	TokenNameIdentifier	 Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updateScores	TokenNameIdentifier	 update Scores
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Runnable	TokenNameIdentifier	 Runnable
reset	TokenNameIdentifier	 reset
=	TokenNameEQUAL	
new	TokenNamenew	
Runnable	TokenNameIdentifier	 Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we do this so that a host considered bad has a chance to recover, otherwise would we never try 	TokenNameCOMMENT_LINE	we do this so that a host considered bad has a chance to recover, otherwise would we never try 
// to read from it, which would cause its score to never change 	TokenNameCOMMENT_LINE	to read from it, which would cause its score to never change 
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
scheduledTasks	TokenNameIdentifier	 scheduled Tasks
.	TokenNameDOT	
scheduleWithFixedDelay	TokenNameIdentifier	 schedule With Fixed Delay
(	TokenNameLPAREN	
update	TokenNameIdentifier	 update
,	TokenNameCOMMA	
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier	 UPDATE  INTERVAL  IN  MS
,	TokenNameCOMMA	
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier	 UPDATE  INTERVAL  IN  MS
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
scheduledTasks	TokenNameIdentifier	 scheduled Tasks
.	TokenNameDOT	
scheduleWithFixedDelay	TokenNameIdentifier	 schedule With Fixed Delay
(	TokenNameLPAREN	
reset	TokenNameIdentifier	 reset
,	TokenNameCOMMA	
RESET_INTERVAL_IN_MS	TokenNameIdentifier	 RESET  INTERVAL  IN  MS
,	TokenNameCOMMA	
RESET_INTERVAL_IN_MS	TokenNameIdentifier	 RESET  INTERVAL  IN  MS
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerMBean	TokenNameIdentifier	 register M Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
registerMBean	TokenNameIdentifier	 register M Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
mbeanName	TokenNameIdentifier	 mbean Name
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
unregisterMBean	TokenNameIdentifier	 unregister M Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
unregisterMBean	TokenNameIdentifier	 unregister M Bean
(	TokenNameLPAREN	
new	TokenNamenew	
ObjectName	TokenNameIdentifier	 Object Name
(	TokenNameLPAREN	
mbeanName	TokenNameIdentifier	 mbean Name
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
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
gossiperStarting	TokenNameIdentifier	 gossiper Starting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subsnitch	TokenNameIdentifier	 subsnitch
.	TokenNameDOT	
gossiperStarting	TokenNameIdentifier	 gossiper Starting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subsnitch	TokenNameIdentifier	 subsnitch
.	TokenNameDOT	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subsnitch	TokenNameIdentifier	 subsnitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
getSortedListByProximity	TokenNameIdentifier	 get Sorted List By Proximity
(	TokenNameLPAREN	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortByProximity	TokenNameIdentifier	 sort By Proximity
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
sortByProximity	TokenNameIdentifier	 sort By Proximity
(	TokenNameLPAREN	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we only know about ourself 	TokenNameCOMMENT_LINE	we only know about ourself 
if	TokenNameif	
(	TokenNameLPAREN	
BADNESS_THRESHOLD	TokenNameIdentifier	 BADNESS  THRESHOLD
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortByProximityWithScore	TokenNameIdentifier	 sort By Proximity With Score
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sortByProximityWithBadness	TokenNameIdentifier	 sort By Proximity With Badness
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sortByProximityWithScore	TokenNameIdentifier	 sort By Proximity With Score
(	TokenNameLPAREN	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
sortByProximity	TokenNameIdentifier	 sort By Proximity
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sortByProximityWithBadness	TokenNameIdentifier	 sort By Proximity With Badness
(	TokenNameLPAREN	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addresses	TokenNameIdentifier	 addresses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
subsnitch	TokenNameIdentifier	 subsnitch
.	TokenNameDOT	
sortByProximity	TokenNameIdentifier	 sort By Proximity
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
addresses	TokenNameIdentifier	 addresses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
addr	TokenNameIdentifier	 addr
:	TokenNameCOLON	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Double	TokenNameIdentifier	 Double
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
addr	TokenNameIdentifier	 addr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
-	TokenNameMINUS	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
first	TokenNameIdentifier	 first
>	TokenNameGREATER	
BADNESS_THRESHOLD	TokenNameIdentifier	 BADNESS  THRESHOLD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortByProximityWithScore	TokenNameIdentifier	 sort By Proximity With Score
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareEndpoints	TokenNameIdentifier	 compare Endpoints
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Double	TokenNameIdentifier	 Double
scored1	TokenNameIdentifier	 scored1
=	TokenNameEQUAL	
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
scored2	TokenNameIdentifier	 scored2
=	TokenNameEQUAL	
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scored1	TokenNameIdentifier	 scored1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scored1	TokenNameIdentifier	 scored1
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scored2	TokenNameIdentifier	 scored2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scored2	TokenNameIdentifier	 scored2
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scored1	TokenNameIdentifier	 scored1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scored2	TokenNameIdentifier	 scored2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
subsnitch	TokenNameIdentifier	 subsnitch
.	TokenNameDOT	
compareEndpoints	TokenNameIdentifier	 compare Endpoints
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scored1	TokenNameIdentifier	 scored1
<	TokenNameLESS	
scored2	TokenNameIdentifier	 scored2
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
long	TokenNamelong	
latency	TokenNameIdentifier	 latency
)	TokenNameRPAREN	
// this is cheap 	TokenNameCOMMENT_LINE	this is cheap 
{	TokenNameLBRACE	
lastReceived	TokenNameIdentifier	 last Received
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExponentiallyDecayingSample	TokenNameIdentifier	 Exponentially Decaying Sample
sample	TokenNameIdentifier	 sample
=	TokenNameEQUAL	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sample	TokenNameIdentifier	 sample
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExponentiallyDecayingSample	TokenNameIdentifier	 Exponentially Decaying Sample
maybeNewSample	TokenNameIdentifier	 maybe New Sample
=	TokenNameEQUAL	
new	TokenNamenew	
ExponentiallyDecayingSample	TokenNameIdentifier	 Exponentially Decaying Sample
(	TokenNameLPAREN	
WINDOW_SIZE	TokenNameIdentifier	 WINDOW  SIZE
,	TokenNameCOMMA	
ALPHA	TokenNameIdentifier	 ALPHA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sample	TokenNameIdentifier	 sample
=	TokenNameEQUAL	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
putIfAbsent	TokenNameIdentifier	 put If Absent
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
maybeNewSample	TokenNameIdentifier	 maybe New Sample
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sample	TokenNameIdentifier	 sample
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
sample	TokenNameIdentifier	 sample
=	TokenNameEQUAL	
maybeNewSample	TokenNameIdentifier	 maybe New Sample
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sample	TokenNameIdentifier	 sample
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
latency	TokenNameIdentifier	 latency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
updateScores	TokenNameIdentifier	 update Scores
(	TokenNameLPAREN	
)	TokenNameRPAREN	
// this is expensive 	TokenNameCOMMENT_LINE	this is expensive 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
isInitialized	TokenNameIdentifier	 is Initialized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
registered	TokenNameIdentifier	 registered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registered	TokenNameIdentifier	 registered
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
maxLatency	TokenNameIdentifier	 max Latency
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
maxPenalty	TokenNameIdentifier	 max Penalty
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
penalties	TokenNameIdentifier	 penalties
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
ExponentiallyDecayingSample	TokenNameIdentifier	 Exponentially Decaying Sample
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSnapshot	TokenNameIdentifier	 get Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMedian	TokenNameIdentifier	 get Median
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mean	TokenNameIdentifier	 mean
>	TokenNameGREATER	
maxLatency	TokenNameIdentifier	 max Latency
)	TokenNameRPAREN	
maxLatency	TokenNameIdentifier	 max Latency
=	TokenNameEQUAL	
mean	TokenNameIdentifier	 mean
;	TokenNameSEMICOLON	
long	TokenNamelong	
timePenalty	TokenNameIdentifier	 time Penalty
=	TokenNameEQUAL	
lastReceived	TokenNameIdentifier	 last Received
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
lastReceived	TokenNameIdentifier	 last Received
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timePenalty	TokenNameIdentifier	 time Penalty
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
timePenalty	TokenNameIdentifier	 time Penalty
;	TokenNameSEMICOLON	
timePenalty	TokenNameIdentifier	 time Penalty
=	TokenNameEQUAL	
timePenalty	TokenNameIdentifier	 time Penalty
>	TokenNameGREATER	
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier	 UPDATE  INTERVAL  IN  MS
?	TokenNameQUESTION	
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier	 UPDATE  INTERVAL  IN  MS
:	TokenNameCOLON	
timePenalty	TokenNameIdentifier	 time Penalty
;	TokenNameSEMICOLON	
penalties	TokenNameIdentifier	 penalties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timePenalty	TokenNameIdentifier	 time Penalty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timePenalty	TokenNameIdentifier	 time Penalty
>	TokenNameGREATER	
maxPenalty	TokenNameIdentifier	 max Penalty
)	TokenNameRPAREN	
maxPenalty	TokenNameIdentifier	 max Penalty
=	TokenNameEQUAL	
timePenalty	TokenNameIdentifier	 time Penalty
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
ExponentiallyDecayingSample	TokenNameIdentifier	 Exponentially Decaying Sample
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSnapshot	TokenNameIdentifier	 get Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMedian	TokenNameIdentifier	 get Median
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
maxLatency	TokenNameIdentifier	 max Latency
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
penalties	TokenNameIdentifier	 penalties
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
penalties	TokenNameIdentifier	 penalties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
maxPenalty	TokenNameIdentifier	 max Penalty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// maxPenalty / maxPenalty 	TokenNameCOMMENT_LINE	maxPenalty / maxPenalty 
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSeverity	TokenNameIdentifier	 get Severity
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ExponentiallyDecayingSample	TokenNameIdentifier	 Exponentially Decaying Sample
sample	TokenNameIdentifier	 sample
:	TokenNameCOLON	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
sample	TokenNameIdentifier	 sample
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
getScores	TokenNameIdentifier	 get Scores
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scores	TokenNameIdentifier	 scores
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getUpdateInterval	TokenNameIdentifier	 get Update Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier	 UPDATE  INTERVAL  IN  MS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getResetInterval	TokenNameIdentifier	 get Reset Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RESET_INTERVAL_IN_MS	TokenNameIdentifier	 RESET  INTERVAL  IN  MS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getBadnessThreshold	TokenNameIdentifier	 get Badness Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BADNESS_THRESHOLD	TokenNameIdentifier	 BADNESS  THRESHOLD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSubsnitchClassName	TokenNameIdentifier	 get Subsnitch Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subsnitch	TokenNameIdentifier	 subsnitch
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
dumpTimings	TokenNameIdentifier	 dump Timings
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
hostname	TokenNameIdentifier	 hostname
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
hostname	TokenNameIdentifier	 hostname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
timings	TokenNameIdentifier	 timings
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExponentiallyDecayingSample	TokenNameIdentifier	 Exponentially Decaying Sample
sample	TokenNameIdentifier	 sample
=	TokenNameEQUAL	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sample	TokenNameIdentifier	 sample
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
double	TokenNamedouble	
time	TokenNameIdentifier	 time
:	TokenNameCOLON	
sample	TokenNameIdentifier	 sample
.	TokenNameDOT	
getSnapshot	TokenNameIdentifier	 get Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
timings	TokenNameIdentifier	 timings
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
timings	TokenNameIdentifier	 timings
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSeverity	TokenNameIdentifier	 set Severity
(	TokenNameLPAREN	
double	TokenNamedouble	
severity	TokenNameIdentifier	 severity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
reportSeverity	TokenNameIdentifier	 report Severity
(	TokenNameLPAREN	
severity	TokenNameIdentifier	 severity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getSeverity	TokenNameIdentifier	 get Severity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSeverity	TokenNameIdentifier	 get Severity
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
