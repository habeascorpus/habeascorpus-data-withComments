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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
TypeSizes	TokenNameIdentifier	 Type Sizes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
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
CompactEndpointSerializationHelper	TokenNameIdentifier	 Compact Endpoint Serialization Helper
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
/** * This ack gets sent out as a result of the receipt of a GossipDigestSynMessage by an * endpoint. This is the 2 stage of the 3 way messaging in the Gossip protocol. */	TokenNameCOMMENT_JAVADOC	 This ack gets sent out as a result of the receipt of a GossipDigestSynMessage by an endpoint. This is the 2 stage of the 3 way messaging in the Gossip protocol. 
public	TokenNamepublic	
class	TokenNameclass	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
GossipDigestAckSerializer	TokenNameIdentifier	 Gossip Digest Ack Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
gDigestList	TokenNameIdentifier	 g Digest List
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
epStateMap	TokenNameIdentifier	 ep State Map
;	TokenNameSEMICOLON	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
gDigestList	TokenNameIdentifier	 g Digest List
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
epStateMap	TokenNameIdentifier	 ep State Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
gDigestList	TokenNameIdentifier	 g Digest List
=	TokenNameEQUAL	
gDigestList	TokenNameIdentifier	 g Digest List
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
epStateMap	TokenNameIdentifier	 ep State Map
=	TokenNameEQUAL	
epStateMap	TokenNameIdentifier	 ep State Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
getGossipDigestList	TokenNameIdentifier	 get Gossip Digest List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gDigestList	TokenNameIdentifier	 g Digest List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
getEndpointStateMap	TokenNameIdentifier	 get Endpoint State Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
epStateMap	TokenNameIdentifier	 ep State Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
GossipDigestAckSerializer	TokenNameIdentifier	 Gossip Digest Ack Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
gDigestAckMessage	TokenNameIdentifier	 g Digest Ack Message
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
GossipDigestSerializationHelper	TokenNameIdentifier	 Gossip Digest Serialization Helper
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
gDigestAckMessage	TokenNameIdentifier	 g Digest Ack Message
.	TokenNameDOT	
gDigestList	TokenNameIdentifier	 g Digest List
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<=	TokenNameLESS_EQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_11	TokenNameIdentifier	 VERSION 11
)	TokenNameRPAREN	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeBoolean	TokenNameIdentifier	 write Boolean
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 0.6 compatibility 	TokenNameCOMMENT_LINE	0.6 compatibility 
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
gDigestAckMessage	TokenNameIdentifier	 g Digest Ack Message
.	TokenNameDOT	
epStateMap	TokenNameIdentifier	 ep State Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
gDigestAckMessage	TokenNameIdentifier	 g Digest Ack Message
.	TokenNameDOT	
epStateMap	TokenNameIdentifier	 ep State Map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
ep	TokenNameIdentifier	 ep
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompactEndpointSerializationHelper	TokenNameIdentifier	 Compact Endpoint Serialization Helper
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EndpointState	TokenNameIdentifier	 Endpoint State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GossipDigest	TokenNameIdentifier	 Gossip Digest
>	TokenNameGREATER	
gDigestList	TokenNameIdentifier	 g Digest List
=	TokenNameEQUAL	
GossipDigestSerializationHelper	TokenNameIdentifier	 Gossip Digest Serialization Helper
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<=	TokenNameLESS_EQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_11	TokenNameIdentifier	 VERSION 11
)	TokenNameRPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readBoolean	TokenNameIdentifier	 read Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 0.6 compatibility 	TokenNameCOMMENT_LINE	0.6 compatibility 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
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
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
ep	TokenNameIdentifier	 ep
=	TokenNameEQUAL	
CompactEndpointSerializationHelper	TokenNameIdentifier	 Compact Endpoint Serialization Helper
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EndpointState	TokenNameIdentifier	 Endpoint State
epState	TokenNameIdentifier	 ep State
=	TokenNameEQUAL	
EndpointState	TokenNameIdentifier	 Endpoint State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
epStateMap	TokenNameIdentifier	 ep State Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
,	TokenNameCOMMA	
epState	TokenNameIdentifier	 ep State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
(	TokenNameLPAREN	
gDigestList	TokenNameIdentifier	 g Digest List
,	TokenNameCOMMA	
epStateMap	TokenNameIdentifier	 ep State Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
GossipDigestAck	TokenNameIdentifier	 Gossip Digest Ack
ack	TokenNameIdentifier	 ack
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
GossipDigestSerializationHelper	TokenNameIdentifier	 Gossip Digest Serialization Helper
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
ack	TokenNameIdentifier	 ack
.	TokenNameDOT	
gDigestList	TokenNameIdentifier	 g Digest List
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<=	TokenNameLESS_EQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_11	TokenNameIdentifier	 VERSION 11
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
ack	TokenNameIdentifier	 ack
.	TokenNameDOT	
epStateMap	TokenNameIdentifier	 ep State Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
EndpointState	TokenNameIdentifier	 Endpoint State
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
ack	TokenNameIdentifier	 ack
.	TokenNameDOT	
epStateMap	TokenNameIdentifier	 ep State Map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
CompactEndpointSerializationHelper	TokenNameIdentifier	 Compact Endpoint Serialization Helper
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
EndpointState	TokenNameIdentifier	 Endpoint State
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
