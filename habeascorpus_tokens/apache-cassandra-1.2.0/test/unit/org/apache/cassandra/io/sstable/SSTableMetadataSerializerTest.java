/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
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
DataOutputStream	TokenNameIdentifier	 Data Output Stream
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
File	TokenNameIdentifier	 File
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
commitlog	TokenNameIdentifier	 commitlog
.	TokenNameDOT	
ReplayPosition	TokenNameIdentifier	 Replay Position
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SSTableMetadataSerializerTest	TokenNameIdentifier	 SS Table Metadata Serializer Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSerialization	TokenNameIdentifier	 test Serialization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
rowSizes	TokenNameIdentifier	 row Sizes
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
4L	TokenNameLongLiteral	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
columnCounts	TokenNameIdentifier	 column Counts
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
6L	TokenNameLongLiteral	
,	TokenNameCOMMA	
7L	TokenNameLongLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
8L	TokenNameLongLiteral	
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
10L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ReplayPosition	TokenNameIdentifier	 Replay Position
rp	TokenNameIdentifier	 rp
=	TokenNameEQUAL	
new	TokenNamenew	
ReplayPosition	TokenNameIdentifier	 Replay Position
(	TokenNameLPAREN	
11L	TokenNameLongLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
maxTimestamp	TokenNameIdentifier	 max Timestamp
=	TokenNameEQUAL	
4162517136L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
.	TokenNameDOT	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
=	TokenNameEQUAL	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
.	TokenNameDOT	
createCollector	TokenNameIdentifier	 create Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
(	TokenNameLPAREN	
rowSizes	TokenNameIdentifier	 row Sizes
)	TokenNameRPAREN	
.	TokenNameDOT	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
(	TokenNameLPAREN	
columnCounts	TokenNameIdentifier	 column Counts
)	TokenNameRPAREN	
.	TokenNameDOT	
replayPosition	TokenNameIdentifier	 replay Position
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
updateMaxTimestamp	TokenNameIdentifier	 update Max Timestamp
(	TokenNameLPAREN	
maxTimestamp	TokenNameIdentifier	 max Timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
originalMetadata	TokenNameIdentifier	 original Metadata
=	TokenNameEQUAL	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
finalizeMetadata	TokenNameIdentifier	 finalize Metadata
(	TokenNameLPAREN	
RandomPartitioner	TokenNameIdentifier	 Random Partitioner
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
byteOutput	TokenNameIdentifier	 byte Output
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
dos	TokenNameIdentifier	 dos
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
byteOutput	TokenNameIdentifier	 byte Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
originalMetadata	TokenNameIdentifier	 original Metadata
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
byteInput	TokenNameIdentifier	 byte Input
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
byteOutput	TokenNameIdentifier	 byte Output
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
dis	TokenNameIdentifier	 dis
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
byteInput	TokenNameIdentifier	 byte Input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
new	TokenNamenew	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
CURRENT	TokenNameIdentifier	 CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
stats	TokenNameIdentifier	 stats
=	TokenNameEQUAL	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
originalMetadata	TokenNameIdentifier	 original Metadata
.	TokenNameDOT	
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rowSizes	TokenNameIdentifier	 row Sizes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
originalMetadata	TokenNameIdentifier	 original Metadata
.	TokenNameDOT	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
columnCounts	TokenNameIdentifier	 column Counts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
replayPosition	TokenNameIdentifier	 replay Position
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
originalMetadata	TokenNameIdentifier	 original Metadata
.	TokenNameDOT	
replayPosition	TokenNameIdentifier	 replay Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
replayPosition	TokenNameIdentifier	 replay Position
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
maxTimestamp	TokenNameIdentifier	 max Timestamp
==	TokenNameEQUAL_EQUAL	
maxTimestamp	TokenNameIdentifier	 max Timestamp
;	TokenNameSEMICOLON	
assert	TokenNameassert	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
maxTimestamp	TokenNameIdentifier	 max Timestamp
==	TokenNameEQUAL_EQUAL	
originalMetadata	TokenNameIdentifier	 original Metadata
.	TokenNameDOT	
maxTimestamp	TokenNameIdentifier	 max Timestamp
;	TokenNameSEMICOLON	
assert	TokenNameassert	
RandomPartitioner	TokenNameIdentifier	 Random Partitioner
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
