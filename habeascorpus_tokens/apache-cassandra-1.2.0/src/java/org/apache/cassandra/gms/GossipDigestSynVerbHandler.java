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
*	TokenNameMULTIPLY	
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
GossipDigestSynVerbHandler	TokenNameIdentifier	 Gossip Digest Syn Verb Handler
implements	TokenNameimplements	
IVerbHandler	TokenNameIdentifier	 I Verb Handler
<	TokenNameLESS	
GossipDigestSyn	TokenNameIdentifier	 Gossip Digest Syn
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
GossipDigestSynVerbHandler	TokenNameIdentifier	 Gossip Digest Syn Verb Handler
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
GossipDigestSyn	TokenNameIdentifier	 Gossip Digest Syn
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
"Received a GossipDigestSynMessage from {}"	TokenNameStringLiteral	Received a GossipDigestSynMessage from {}
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
"Ignoring GossipDigestSynMessage because gossip is disabled"	TokenNameStringLiteral	Ignoring GossipDigestSynMessage because gossip is disabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GossipDigestSyn	TokenNameIdentifier	 Gossip Digest Syn
gDigestMessage	TokenNameIdentifier	 g Digest Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
/* If the message is from a different cluster throw it away. */	TokenNameCOMMENT_BLOCK	 If the message is from a different cluster throw it away. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
gDigestMessage	TokenNameIdentifier	 g Digest Message
.	TokenNameDOT	
clusterId	TokenNameIdentifier	 cluster Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getClusterName	TokenNameIdentifier	 get Cluster Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"ClusterName mismatch from "	TokenNameStringLiteral	ClusterName mismatch from 
+	TokenNamePLUS	
from	TokenNameIdentifier	 from
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
gDigestMessage	TokenNameIdentifier	 g Digest Message
.	TokenNameDOT	
clusterId	TokenNameIdentifier	 cluster Id
+	TokenNamePLUS	
"!="	TokenNameStringLiteral	!=
+	TokenNamePLUS	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getClusterName	TokenNameIdentifier	 get Cluster Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gDigestMessage	TokenNameIdentifier	 g Digest Message
.	TokenNameDOT	
partioner	TokenNameIdentifier	 partioner
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
gDigestMessage	TokenNameIdentifier	 g Digest Message
.	TokenNameDOT	
partioner	TokenNameIdentifier	 partioner
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getPartitionerName	TokenNameIdentifier	 get Partitioner Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Partitioner mismatch from "	TokenNameStringLiteral	Partitioner mismatch from 
+	TokenNamePLUS	
from	TokenNameIdentifier	 from
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
gDigestMessage	TokenNameIdentifier	 g Digest Message
.	TokenNameDOT	
partioner	TokenNameIdentifier	 partioner
+	TokenNamePLUS	
"!="	TokenNameStringLiteral	!=
+	TokenNamePLUS	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getPartitionerName	TokenNameIdentifier	 get Partitioner Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
gDigestList	TokenNameIdentifier	 g Digest List
=	TokenNameEQUAL	
gDigestMessage	TokenNameIdentifier	 g Digest Message
.	TokenNameDOT	
getGossipDigests	TokenNameIdentifier	 get Gossip Digests
(	TokenNameLPAREN	
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
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
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
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gDigest	TokenNameIdentifier	 g Digest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
"Gossip syn digests are : "	TokenNameStringLiteral	Gossip syn digests are : 
+	TokenNamePLUS	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Notify the Failure Detector */	TokenNameCOMMENT_BLOCK	 Notify the Failure Detector 
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
notifyFailureDetector	TokenNameIdentifier	 notify Failure Detector
(	TokenNameLPAREN	
gDigestList	TokenNameIdentifier	 g Digest List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doSort	TokenNameIdentifier	 do Sort
(	TokenNameLPAREN	
gDigestList	TokenNameIdentifier	 g Digest List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
deltaGossipDigestList	TokenNameIdentifier	 delta Gossip Digest List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
examineGossiper	TokenNameIdentifier	 examine Gossiper
(	TokenNameLPAREN	
gDigestList	TokenNameIdentifier	 g Digest List
,	TokenNameCOMMA	
deltaGossipDigestList	TokenNameIdentifier	 delta Gossip Digest List
,	TokenNameCOMMA	
deltaEpStateMap	TokenNameIdentifier	 delta Ep State Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
>	TokenNameGREATER	
gDigestAckMessage	TokenNameIdentifier	 g Digest Ack Message
=	TokenNameEQUAL	
new	TokenNamenew	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
>	TokenNameGREATER	
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
GOSSIP_DIGEST_ACK	TokenNameIdentifier	 GOSSIP  DIGEST  ACK
,	TokenNameCOMMA	
new	TokenNamenew	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
(	TokenNameLPAREN	
deltaGossipDigestList	TokenNameIdentifier	 delta Gossip Digest List
,	TokenNameCOMMA	
deltaEpStateMap	TokenNameIdentifier	 delta Ep State Map
)	TokenNameRPAREN	
,	TokenNameCOMMA	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
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
"Sending a GossipDigestAckMessage to {}"	TokenNameStringLiteral	Sending a GossipDigestAckMessage to {}
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
gDigestAckMessage	TokenNameIdentifier	 g Digest Ack Message
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * First construct a map whose key is the endpoint in the GossipDigest and the value is the * GossipDigest itself. Then build a list of version differences i.e difference between the * version in the GossipDigest and the version in the local state for a given InetAddress. * Sort this list. Now loop through the sorted list and retrieve the GossipDigest corresponding * to the endpoint from the map that was initially constructed. */	TokenNameCOMMENT_BLOCK	 First construct a map whose key is the endpoint in the GossipDigest and the value is the GossipDigest itself. Then build a list of version differences i.e difference between the version in the GossipDigest and the version in the local state for a given InetAddress. Sort this list. Now loop through the sorted list and retrieve the GossipDigest corresponding to the endpoint from the map that was initially constructed. 
private	TokenNameprivate	
void	TokenNamevoid	
doSort	TokenNameIdentifier	 do Sort
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
gDigestList	TokenNameIdentifier	 g Digest List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Construct a map of endpoint to GossipDigest. */	TokenNameCOMMENT_BLOCK	 Construct a map of endpoint to GossipDigest. 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
epToDigestMap	TokenNameIdentifier	 ep To Digest Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
GossipDigest	TokenNameIdentifier	 Gossip Digest
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
epToDigestMap	TokenNameIdentifier	 ep To Digest Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
gDigest	TokenNameIdentifier	 g Digest
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gDigest	TokenNameIdentifier	 g Digest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * These digests have their maxVersion set to the difference of the version * of the local EndpointState and the version found in the GossipDigest. */	TokenNameCOMMENT_BLOCK	 These digests have their maxVersion set to the difference of the version of the local EndpointState and the version found in the GossipDigest. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
diffDigests	TokenNameIdentifier	 diff Digests
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
(	TokenNameLPAREN	
gDigestList	TokenNameIdentifier	 g Digest List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
ep	TokenNameIdentifier	 ep
=	TokenNameEQUAL	
gDigest	TokenNameIdentifier	 g Digest
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EndpointState	TokenNameIdentifier	 Endpoint State
epState	TokenNameIdentifier	 ep State
=	TokenNameEQUAL	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getEndpointStateForEndpoint	TokenNameIdentifier	 get Endpoint State For Endpoint
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
(	TokenNameLPAREN	
epState	TokenNameIdentifier	 ep State
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getMaxEndpointStateVersion	TokenNameIdentifier	 get Max Endpoint State Version
(	TokenNameLPAREN	
epState	TokenNameIdentifier	 ep State
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
diffVersion	TokenNameIdentifier	 diff Version
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
-	TokenNameMINUS	
gDigest	TokenNameIdentifier	 g Digest
.	TokenNameDOT	
getMaxVersion	TokenNameIdentifier	 get Max Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
diffDigests	TokenNameIdentifier	 diff Digests
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
GossipDigest	TokenNameIdentifier	 Gossip Digest
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
,	TokenNameCOMMA	
gDigest	TokenNameIdentifier	 g Digest
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
diffVersion	TokenNameIdentifier	 diff Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gDigestList	TokenNameIdentifier	 g Digest List
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
diffDigests	TokenNameIdentifier	 diff Digests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
diffDigests	TokenNameIdentifier	 diff Digests
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Report the digests in descending order. This takes care of the endpoints * that are far behind w.r.t this local endpoint */	TokenNameCOMMENT_BLOCK	 Report the digests in descending order. This takes care of the endpoints that are far behind w.r.t this local endpoint 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gDigestList	TokenNameIdentifier	 g Digest List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
epToDigestMap	TokenNameIdentifier	 ep To Digest Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
diffDigests	TokenNameIdentifier	 diff Digests
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
