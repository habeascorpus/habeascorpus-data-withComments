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
*	TokenNameMULTIPLY	
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
LoadBroadcaster	TokenNameIdentifier	 Load Broadcaster
implements	TokenNameimplements	
IEndpointStateChangeSubscriber	TokenNameIdentifier	 I Endpoint State Change Subscriber
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BROADCAST_INTERVAL	TokenNameIdentifier	 BROADCAST  INTERVAL
=	TokenNameEQUAL	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LoadBroadcaster	TokenNameIdentifier	 Load Broadcaster
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
LoadBroadcaster	TokenNameIdentifier	 Load Broadcaster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
LoadBroadcaster	TokenNameIdentifier	 Load Broadcaster
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
loadInfo	TokenNameIdentifier	 load Info
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LoadBroadcaster	TokenNameIdentifier	 Load Broadcaster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onChange	TokenNameIdentifier	 on Change
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
ApplicationState	TokenNameIdentifier	 Application State
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
LOAD	TokenNameIdentifier	 LOAD
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
loadInfo	TokenNameIdentifier	 load Info
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onJoin	TokenNameIdentifier	 on Join
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
epState	TokenNameIdentifier	 ep State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VersionedValue	TokenNameIdentifier	 Versioned Value
localValue	TokenNameIdentifier	 local Value
=	TokenNameEQUAL	
epState	TokenNameIdentifier	 ep State
.	TokenNameDOT	
getApplicationState	TokenNameIdentifier	 get Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
LOAD	TokenNameIdentifier	 LOAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localValue	TokenNameIdentifier	 local Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
onChange	TokenNameIdentifier	 on Change
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
LOAD	TokenNameIdentifier	 LOAD
,	TokenNameCOMMA	
localValue	TokenNameIdentifier	 local Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onAlive	TokenNameIdentifier	 on Alive
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onDead	TokenNameIdentifier	 on Dead
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onRestart	TokenNameIdentifier	 on Restart
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onRemove	TokenNameIdentifier	 on Remove
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loadInfo	TokenNameIdentifier	 load Info
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
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
getLoadInfo	TokenNameIdentifier	 get Load Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
loadInfo	TokenNameIdentifier	 load Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startBroadcasting	TokenNameIdentifier	 start Broadcasting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// send the first broadcast "right away" (i.e., in 2 gossip heartbeats, when we should have someone to talk to); 	TokenNameCOMMENT_LINE	send the first broadcast "right away" (i.e., in 2 gossip heartbeats, when we should have someone to talk to); 
// after that send every BROADCAST_INTERVAL. 	TokenNameCOMMENT_LINE	after that send every BROADCAST_INTERVAL. 
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
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
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Disseminating load info ..."	TokenNameStringLiteral	Disseminating load info ...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addLocalApplicationState	TokenNameIdentifier	 add Local Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
LOAD	TokenNameIdentifier	 LOAD
,	TokenNameCOMMA	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
valueFactory	TokenNameIdentifier	 value Factory
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getLoad	TokenNameIdentifier	 get Load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
intervalInMillis	TokenNameIdentifier	 interval In Millis
,	TokenNameCOMMA	
BROADCAST_INTERVAL	TokenNameIdentifier	 BROADCAST  INTERVAL
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
MILLISECONDS	TokenNameIdentifier	 MILLISECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
