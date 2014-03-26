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
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
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
IOException	TokenNameIdentifier	 IO Exception
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DataOutputBuffer	TokenNameIdentifier	 Data Output Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
GossipDigestTest	TokenNameIdentifier	 Gossip Digest Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
generation	TokenNameIdentifier	 generation
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxVersion	TokenNameIdentifier	 max Version
=	TokenNameEQUAL	
123	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
GossipDigest	TokenNameIdentifier	 Gossip Digest
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
new	TokenNamenew	
GossipDigest	TokenNameIdentifier	 Gossip Digest
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//make sure we get the same values out 	TokenNameCOMMENT_LINE	make sure we get the same values out 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
maxVersion	TokenNameIdentifier	 max Version
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
getMaxVersion	TokenNameIdentifier	 get Max Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//test the serialization and equals 	TokenNameCOMMENT_LINE	test the serialization and equals 
DataOutputBuffer	TokenNameIdentifier	 Data Output Buffer
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputBuffer	TokenNameIdentifier	 Data Output Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GossipDigest	TokenNameIdentifier	 Gossip Digest
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GossipDigest	TokenNameIdentifier	 Gossip Digest
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
GossipDigest	TokenNameIdentifier	 Gossip Digest
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
