/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
AbstractSerializationsTester	TokenNameIdentifier	 Abstract Serializations Tester
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SerializationsTest	TokenNameIdentifier	 Serializations Test
extends	TokenNameextends	
AbstractSerializationsTester	TokenNameIdentifier	 Abstract Serializations Tester
{	TokenNameLBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testEndpointStateWrite	TokenNameIdentifier	 test Endpoint State Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
"gms.EndpointState.bin"	TokenNameStringLiteral	gms.EndpointState.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
HeartbeatSt	TokenNameIdentifier	 Heartbeat St
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EndpointState	TokenNameIdentifier	 Endpoint State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
EndpointSt	TokenNameIdentifier	 Endpoint St
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
vv0	TokenNameIdentifier	 vv0
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
vv1	TokenNameIdentifier	 vv1
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test serializedSize 	TokenNameCOMMENT_LINE	test serializedSize 
testSerializedSize	TokenNameIdentifier	 test Serialized Size
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
HeartbeatSt	TokenNameIdentifier	 Heartbeat St
,	TokenNameCOMMA	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSerializedSize	TokenNameIdentifier	 test Serialized Size
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
EndpointSt	TokenNameIdentifier	 Endpoint St
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSerializedSize	TokenNameIdentifier	 test Serialized Size
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
vv0	TokenNameIdentifier	 vv0
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSerializedSize	TokenNameIdentifier	 test Serialized Size
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
vv1	TokenNameIdentifier	 vv1
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testEndpointStateRead	TokenNameIdentifier	 test Endpoint State Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
EXECUTE_WRITES	TokenNameIdentifier	 EXECUTE  WRITES
)	TokenNameRPAREN	
testEndpointStateWrite	TokenNameIdentifier	 test Endpoint State Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
"gms.EndpointState.bin"	TokenNameStringLiteral	gms.EndpointState.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
EndpointState	TokenNameIdentifier	 Endpoint State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testGossipDigestWrite	TokenNameIdentifier	 test Gossip Digest Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
states	TokenNameIdentifier	 states
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
states	TokenNameIdentifier	 states
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
EndpointSt	TokenNameIdentifier	 Endpoint St
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
states	TokenNameIdentifier	 states
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.2"	TokenNameStringLiteral	127.0.0.2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
EndpointSt	TokenNameIdentifier	 Endpoint St
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
ack	TokenNameIdentifier	 ack
=	TokenNameEQUAL	
new	TokenNamenew	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
Digests	TokenNameIdentifier	 Digests
,	TokenNameCOMMA	
states	TokenNameIdentifier	 states
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GossipDigestAck2	TokenNameIdentifier	 Gossip Digest Ack2
ack2	TokenNameIdentifier	 ack2
=	TokenNameEQUAL	
new	TokenNamenew	
GossipDigestAck2	TokenNameIdentifier	 Gossip Digest Ack2
(	TokenNameLPAREN	
states	TokenNameIdentifier	 states
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GossipDigestSyn	TokenNameIdentifier	 Gossip Digest Syn
syn	TokenNameIdentifier	 syn
=	TokenNameEQUAL	
new	TokenNamenew	
GossipDigestSyn	TokenNameIdentifier	 Gossip Digest Syn
(	TokenNameLPAREN	
"Not a real cluster name"	TokenNameStringLiteral	Not a real cluster name
,	TokenNameCOMMA	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
Digests	TokenNameIdentifier	 Digests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
"gms.Gossip.bin"	TokenNameStringLiteral	gms.Gossip.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GossipDigest	TokenNameIdentifier	 Gossip Digest
gd	TokenNameIdentifier	 gd
:	TokenNameCOLON	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
Digests	TokenNameIdentifier	 Digests
)	TokenNameRPAREN	
GossipDigest	TokenNameIdentifier	 Gossip Digest
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
gd	TokenNameIdentifier	 gd
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
ack	TokenNameIdentifier	 ack
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GossipDigestAck2	TokenNameIdentifier	 Gossip Digest Ack2
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
ack2	TokenNameIdentifier	 ack2
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GossipDigestSyn	TokenNameIdentifier	 Gossip Digest Syn
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
syn	TokenNameIdentifier	 syn
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test serializedSize 	TokenNameCOMMENT_LINE	test serializedSize 
for	TokenNamefor	
(	TokenNameLPAREN	
GossipDigest	TokenNameIdentifier	 Gossip Digest
gd	TokenNameIdentifier	 gd
:	TokenNameCOLON	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
Digests	TokenNameIdentifier	 Digests
)	TokenNameRPAREN	
testSerializedSize	TokenNameIdentifier	 test Serialized Size
(	TokenNameLPAREN	
gd	TokenNameIdentifier	 gd
,	TokenNameCOMMA	
GossipDigest	TokenNameIdentifier	 Gossip Digest
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSerializedSize	TokenNameIdentifier	 test Serialized Size
(	TokenNameLPAREN	
ack	TokenNameIdentifier	 ack
,	TokenNameCOMMA	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSerializedSize	TokenNameIdentifier	 test Serialized Size
(	TokenNameLPAREN	
ack2	TokenNameIdentifier	 ack2
,	TokenNameCOMMA	
GossipDigestAck2	TokenNameIdentifier	 Gossip Digest Ack2
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSerializedSize	TokenNameIdentifier	 test Serialized Size
(	TokenNameLPAREN	
syn	TokenNameIdentifier	 syn
,	TokenNameCOMMA	
GossipDigestSyn	TokenNameIdentifier	 Gossip Digest Syn
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testGossipDigestRead	TokenNameIdentifier	 test Gossip Digest Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
EXECUTE_WRITES	TokenNameIdentifier	 EXECUTE  WRITES
)	TokenNameRPAREN	
testGossipDigestWrite	TokenNameIdentifier	 test Gossip Digest Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
"gms.Gossip.bin"	TokenNameStringLiteral	gms.Gossip.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
Digests	TokenNameIdentifier	 Digests
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assert	TokenNameassert	
GossipDigestAck2	TokenNameIdentifier	 Gossip Digest Ack2
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
GossipDigestAck2	TokenNameIdentifier	 Gossip Digest Ack2
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
GossipDigestSyn	TokenNameIdentifier	 Gossip Digest Syn
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Statics	TokenNameIdentifier	 Statics
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
HeartbeatSt	TokenNameIdentifier	 Heartbeat St
=	TokenNameEQUAL	
new	TokenNamenew	
HeartBeatState	TokenNameIdentifier	 Heart Beat State
(	TokenNameLPAREN	
101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
201	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
EndpointState	TokenNameIdentifier	 Endpoint State
EndpointSt	TokenNameIdentifier	 Endpoint St
=	TokenNameEQUAL	
new	TokenNamenew	
EndpointState	TokenNameIdentifier	 Endpoint State
(	TokenNameLPAREN	
HeartbeatSt	TokenNameIdentifier	 Heartbeat St
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
VersionedValueFactory	TokenNameIdentifier	 Versioned Value Factory
vvFact	TokenNameIdentifier	 vv Fact
=	TokenNameEQUAL	
new	TokenNamenew	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
VersionedValueFactory	TokenNameIdentifier	 Versioned Value Factory
(	TokenNameLPAREN	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
VersionedValue	TokenNameIdentifier	 Versioned Value
vv0	TokenNameIdentifier	 vv0
=	TokenNameEQUAL	
vvFact	TokenNameIdentifier	 vv Fact
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
23d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
VersionedValue	TokenNameIdentifier	 Versioned Value
vv1	TokenNameIdentifier	 vv1
=	TokenNameEQUAL	
vvFact	TokenNameIdentifier	 vv Fact
.	TokenNameDOT	
bootstrapping	TokenNameIdentifier	 bootstrapping
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRandomToken	TokenNameIdentifier	 get Random Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
Digests	TokenNameIdentifier	 Digests
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
HeartbeatSt	TokenNameIdentifier	 Heartbeat St
.	TokenNameDOT	
updateHeartBeat	TokenNameIdentifier	 update Heart Beat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EndpointSt	TokenNameIdentifier	 Endpoint St
.	TokenNameDOT	
addApplicationState	TokenNameIdentifier	 add Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
LOAD	TokenNameIdentifier	 LOAD
,	TokenNameCOMMA	
vv0	TokenNameIdentifier	 vv0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EndpointSt	TokenNameIdentifier	 Endpoint St
.	TokenNameDOT	
addApplicationState	TokenNameIdentifier	 add Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
STATUS	TokenNameIdentifier	 STATUS
,	TokenNameCOMMA	
vv1	TokenNameIdentifier	 vv1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
Digests	TokenNameIdentifier	 Digests
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
GossipDigest	TokenNameIdentifier	 Gossip Digest
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
