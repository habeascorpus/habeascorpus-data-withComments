/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
IPartitioner	TokenNameIdentifier	 I Partitioner
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
RandomPartitioner	TokenNameIdentifier	 Random Partitioner
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
Range	TokenNameIdentifier	 Range
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
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
MerkleTree	TokenNameIdentifier	 Merkle Tree
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SerializationsTest	TokenNameIdentifier	 Serializations Test
extends	TokenNameextends	
AbstractSerializationsTester	TokenNameIdentifier	 Abstract Serializations Tester
{	TokenNameLBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"cassandra.partitioner"	TokenNameStringLiteral	cassandra.partitioner
,	TokenNameCOMMA	
"RandomPartitioner"	TokenNameStringLiteral	RandomPartitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
FULL_RANGE	TokenNameIdentifier	 FULL  RANGE
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMinimumToken	TokenNameIdentifier	 get Minimum Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMinimumToken	TokenNameIdentifier	 get Minimum Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
testTreeRequestWrite	TokenNameIdentifier	 test Tree Request Write
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
"service.TreeRequest.bin"	TokenNameStringLiteral	service.TreeRequest.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
TreeRequest	TokenNameIdentifier	 Tree Request
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
req	TokenNameIdentifier	 req
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
req	TokenNameIdentifier	 req
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
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
req	TokenNameIdentifier	 req
,	TokenNameCOMMA	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
TreeRequest	TokenNameIdentifier	 Tree Request
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTreeRequestRead	TokenNameIdentifier	 test Tree Request Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
EXECUTE_WRITES	TokenNameIdentifier	 EXECUTE  WRITES
)	TokenNameRPAREN	
testTreeRequestWrite	TokenNameIdentifier	 test Tree Request Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
"service.TreeRequest.bin"	TokenNameStringLiteral	service.TreeRequest.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
TreeRequest	TokenNameIdentifier	 Tree Request
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
MessageIn	TokenNameIdentifier	 Message In
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"id"	TokenNameStringLiteral	id
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
testTreeResponseWrite	TokenNameIdentifier	 test Tree Response Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// empty validation 	TokenNameCOMMENT_LINE	empty validation 
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
v0	TokenNameIdentifier	 v0
=	TokenNameEQUAL	
new	TokenNamenew	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
req	TokenNameIdentifier	 req
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// validation with a tree 	TokenNameCOMMENT_LINE	validation with a tree 
IPartitioner	TokenNameIdentifier	 I Partitioner
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
RandomPartitioner	TokenNameIdentifier	 Random Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MerkleTree	TokenNameIdentifier	 Merkle Tree
mt	TokenNameIdentifier	 mt
=	TokenNameEQUAL	
new	TokenNamenew	
MerkleTree	TokenNameIdentifier	 Merkle Tree
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
FULL_RANGE	TokenNameIdentifier	 FULL  RANGE
,	TokenNameCOMMA	
MerkleTree	TokenNameIdentifier	 Merkle Tree
.	TokenNameDOT	
RECOMMENDED_DEPTH	TokenNameIdentifier	 RECOMMENDED  DEPTH
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getRandomToken	TokenNameIdentifier	 get Random Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
(	TokenNameLPAREN	
Statics	TokenNameIdentifier	 Statics
.	TokenNameDOT	
req	TokenNameIdentifier	 req
,	TokenNameCOMMA	
mt	TokenNameIdentifier	 mt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
"service.TreeResponse.bin"	TokenNameStringLiteral	service.TreeResponse.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
v0	TokenNameIdentifier	 v0
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v0	TokenNameIdentifier	 v0
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
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
v0	TokenNameIdentifier	 v0
,	TokenNameCOMMA	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSerializedSize	TokenNameIdentifier	 test Serialized Size
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTreeResponseRead	TokenNameIdentifier	 test Tree Response Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
EXECUTE_WRITES	TokenNameIdentifier	 EXECUTE  WRITES
)	TokenNameRPAREN	
testTreeResponseWrite	TokenNameIdentifier	 test Tree Response Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
"service.TreeResponse.bin"	TokenNameStringLiteral	service.TreeResponse.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
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
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
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
MessageIn	TokenNameIdentifier	 Message In
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
MessageIn	TokenNameIdentifier	 Message In
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"id"	TokenNameStringLiteral	id
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
final	TokenNamefinal	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
CFPair	TokenNameIdentifier	 CF Pair
pair	TokenNameIdentifier	 pair
=	TokenNameEQUAL	
new	TokenNamenew	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
CFPair	TokenNameIdentifier	 CF Pair
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
TreeRequest	TokenNameIdentifier	 Tree Request
req	TokenNameIdentifier	 req
=	TokenNameEQUAL	
new	TokenNamenew	
AntiEntropyService	TokenNameIdentifier	 Anti Entropy Service
.	TokenNameDOT	
TreeRequest	TokenNameIdentifier	 Tree Request
(	TokenNameLPAREN	
"sessionId"	TokenNameStringLiteral	sessionId
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FULL_RANGE	TokenNameIdentifier	 FULL  RANGE
,	TokenNameCOMMA	
pair	TokenNameIdentifier	 pair
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
