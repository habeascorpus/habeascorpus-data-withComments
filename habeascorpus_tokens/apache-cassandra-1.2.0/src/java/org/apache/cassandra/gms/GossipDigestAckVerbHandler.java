/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
IVerbHandler	TokenNameIdentifier	 I Verb Handler
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
MessageIn	TokenNameIdentifier	 Message In
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
MessageOut	TokenNameIdentifier	 Message Out
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
public	TokenNamepublic	
class	TokenNameclass	
GossipDigestAckVerbHandler	TokenNameIdentifier	 Gossip Digest Ack Verb Handler
implements	TokenNameimplements	
IVerbHandler	TokenNameIdentifier	 I Verb Handler
<	TokenNameLESS	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
>	TokenNameGREATER	
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
GossipDigestAckVerbHandler	TokenNameIdentifier	 Gossip Digest Ack Verb Handler
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
doVerb	TokenNameIdentifier	 do Verb
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
>	TokenNameGREATER	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isTraceEnabled	TokenNameIdentifier	 is Trace Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Received a GossipDigestAckMessage from {}"	TokenNameStringLiteral	Received a GossipDigestAckMessage from {}
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isTraceEnabled	TokenNameIdentifier	 is Trace Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Ignoring GossipDigestAckMessage because gossip is disabled"	TokenNameStringLiteral	Ignoring GossipDigestAckMessage because gossip is disabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
gDigestAckMessage	TokenNameIdentifier	 g Digest Ack Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
gDigestList	TokenNameIdentifier	 g Digest List
=	TokenNameEQUAL	
gDigestAckMessage	TokenNameIdentifier	 g Digest Ack Message
.	TokenNameDOT	
getGossipDigestList	TokenNameIdentifier	 get Gossip Digest List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
epStateMap	TokenNameIdentifier	 ep State Map
=	TokenNameEQUAL	
gDigestAckMessage	TokenNameIdentifier	 g Digest Ack Message
.	TokenNameDOT	
getEndpointStateMap	TokenNameIdentifier	 get Endpoint State Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
epStateMap	TokenNameIdentifier	 ep State Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Notify the Failure Detector */	TokenNameCOMMENT_BLOCK	 Notify the Failure Detector 
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
notifyFailureDetector	TokenNameIdentifier	 notify Failure Detector
(	TokenNameLPAREN	
epStateMap	TokenNameIdentifier	 ep State Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
applyStateLocally	TokenNameIdentifier	 apply State Locally
(	TokenNameLPAREN	
epStateMap	TokenNameIdentifier	 ep State Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Get the state required to send to this gossipee - construct GossipDigestAck2Message */	TokenNameCOMMENT_BLOCK	 Get the state required to send to this gossipee - construct GossipDigestAck2Message 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
deltaEpStateMap	TokenNameIdentifier	 delta Ep State Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GossipDigest	TokenNameIdentifier	 Gossip Digest
gDigest	TokenNameIdentifier	 g Digest
:	TokenNameCOLON	
gDigestList	TokenNameIdentifier	 g Digest List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
addr	TokenNameIdentifier	 addr
=	TokenNameEQUAL	
gDigest	TokenNameIdentifier	 g Digest
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EndpointState	TokenNameIdentifier	 Endpoint State
localEpStatePtr	TokenNameIdentifier	 local Ep State Ptr
=	TokenNameEQUAL	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getStateForVersionBiggerThan	TokenNameIdentifier	 get State For Version Bigger Than
(	TokenNameLPAREN	
addr	TokenNameIdentifier	 addr
,	TokenNameCOMMA	
gDigest	TokenNameIdentifier	 g Digest
.	TokenNameDOT	
getMaxVersion	TokenNameIdentifier	 get Max Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localEpStatePtr	TokenNameIdentifier	 local Ep State Ptr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
deltaEpStateMap	TokenNameIdentifier	 delta Ep State Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
addr	TokenNameIdentifier	 addr
,	TokenNameCOMMA	
localEpStatePtr	TokenNameIdentifier	 local Ep State Ptr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
GossipDigestAck2	TokenNameIdentifier	 Gossip Digest Ack2
>	TokenNameGREATER	
gDigestAck2Message	TokenNameIdentifier	 g Digest Ack2 Message
=	TokenNameEQUAL	
new	TokenNamenew	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
GossipDigestAck2	TokenNameIdentifier	 Gossip Digest Ack2
>	TokenNameGREATER	
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
GOSSIP_DIGEST_ACK2	TokenNameIdentifier	 GOSSIP  DIGEST  AC K2
,	TokenNameCOMMA	
new	TokenNamenew	
GossipDigestAck2	TokenNameIdentifier	 Gossip Digest Ack2
(	TokenNameLPAREN	
deltaEpStateMap	TokenNameIdentifier	 delta Ep State Map
)	TokenNameRPAREN	
,	TokenNameCOMMA	
GossipDigestAck2	TokenNameIdentifier	 Gossip Digest Ack2
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isTraceEnabled	TokenNameIdentifier	 is Trace Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Sending a GossipDigestAck2Message to {}"	TokenNameStringLiteral	Sending a GossipDigestAck2Message to {}
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sendOneWay	TokenNameIdentifier	 send One Way
(	TokenNameLPAREN	
gDigestAck2Message	TokenNameIdentifier	 g Digest Ack2 Message
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
