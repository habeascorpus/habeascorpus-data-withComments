/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
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
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SerializationsTest	TokenNameIdentifier	 Serializations Test
extends	TokenNameextends	
AbstractSerializationsTester	TokenNameIdentifier	 Abstract Serializations Tester
{	TokenNameLBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testBloomFilterWrite	TokenNameIdentifier	 test Bloom Filter Write
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
murmur	TokenNameIdentifier	 murmur
,	TokenNameCOMMA	
boolean	TokenNameboolean	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IFilter	TokenNameIdentifier	 I Filter
bf	TokenNameIdentifier	 bf
=	TokenNameEQUAL	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
1000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.0001	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
murmur	TokenNameIdentifier	 murmur
,	TokenNameCOMMA	
offheap	TokenNameIdentifier	 offheap
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
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTokenFactory	TokenNameIdentifier	 get Token Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
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
DataOutputStream	TokenNameIdentifier	 Data Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
"utils.BloomFilter.bin"	TokenNameStringLiteral	utils.BloomFilter.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
murmur	TokenNameIdentifier	 murmur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBloomFilterReadMURMUR2	TokenNameIdentifier	 test Bloom Filter Read MURMU R2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
EXECUTE_WRITES	TokenNameIdentifier	 EXECUTE  WRITES
)	TokenNameRPAREN	
testBloomFilterWrite	TokenNameIdentifier	 test Bloom Filter Write
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR2	TokenNameIdentifier	 MURMU R2
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
"utils.BloomFilter.bin"	TokenNameStringLiteral	utils.BloomFilter.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR2	TokenNameIdentifier	 MURMU R2
,	TokenNameCOMMA	
false	TokenNamefalse	
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
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBloomFilterReadMURMUR3	TokenNameIdentifier	 test Bloom Filter Read MURMU R3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
EXECUTE_WRITES	TokenNameIdentifier	 EXECUTE  WRITES
)	TokenNameRPAREN	
testBloomFilterWrite	TokenNameIdentifier	 test Bloom Filter Write
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
"utils.BloomFilter.bin"	TokenNameStringLiteral	utils.BloomFilter.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
,	TokenNameCOMMA	
true	TokenNametrue	
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
testLegacyBloomFilterWrite	TokenNameIdentifier	 test Legacy Bloom Filter Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
1000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
1000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.0001	TokenNameDoubleLiteral	
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
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTokenFactory	TokenNameIdentifier	 get Token Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
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
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
"utils.LegacyBloomFilter.bin"	TokenNameStringLiteral	utils.LegacyBloomFilter.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHA	TokenNameIdentifier	 SHA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHA	TokenNameIdentifier	 SHA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testLegacyBloomFilterRead	TokenNameIdentifier	 test Legacy Bloom Filter Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// We never write out a new LBF. Copy the data file from 0.7 instead. 	TokenNameCOMMENT_LINE	We never write out a new LBF. Copy the data file from 0.7 instead. 
// if (EXECUTE_WRITES) 	TokenNameCOMMENT_LINE	if (EXECUTE_WRITES) 
// testLegacyBloomFilterWrite(); 	TokenNameCOMMENT_LINE	testLegacyBloomFilterWrite(); 
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
"utils.LegacyBloomFilter.bin"	TokenNameStringLiteral	utils.LegacyBloomFilter.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHA	TokenNameIdentifier	 SHA
,	TokenNameCOMMA	
false	TokenNamefalse	
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
testEstimatedHistogramWrite	TokenNameIdentifier	 test Estimated Histogram Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
hist0	TokenNameIdentifier	 hist0
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
hist1	TokenNameIdentifier	 hist1
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
5000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
1000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
100000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
hist2	TokenNameIdentifier	 hist2
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
"utils.EstimatedHistogram.bin"	TokenNameStringLiteral	utils.EstimatedHistogram.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
hist0	TokenNameIdentifier	 hist0
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
hist1	TokenNameIdentifier	 hist1
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
hist2	TokenNameIdentifier	 hist2
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testEstimatedHistogramRead	TokenNameIdentifier	 test Estimated Histogram Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
EXECUTE_WRITES	TokenNameIdentifier	 EXECUTE  WRITES
)	TokenNameRPAREN	
testEstimatedHistogramWrite	TokenNameIdentifier	 test Estimated Histogram Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
"utils.EstimatedHistogram.bin"	TokenNameStringLiteral	utils.EstimatedHistogram.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
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
}	TokenNameRBRACE	
