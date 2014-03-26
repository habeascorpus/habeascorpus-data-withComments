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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Before	TokenNameIdentifier	 Before
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
LegacyBloomFilterTest	TokenNameIdentifier	 Legacy Bloom Filter Test
{	TokenNameLBRACE	
public	TokenNamepublic	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
bf	TokenNameIdentifier	 bf
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LegacyBloomFilterTest	TokenNameIdentifier	 Legacy Bloom Filter Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bf	TokenNameIdentifier	 bf
=	TokenNameEQUAL	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
ELEMENTS	TokenNameIdentifier	 ELEMENTS
,	TokenNameCOMMA	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
MAX_FAILURE_RATE	TokenNameIdentifier	 MAX  FAILURE  RATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
IFilter	TokenNameIdentifier	 I Filter
testSerialize	TokenNameIdentifier	 test Serialize
(	TokenNameLPAREN	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputBuffer	TokenNameIdentifier	 Data Output Buffer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputBuffer	TokenNameIdentifier	 Data Output Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
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
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
f2	TokenNameIdentifier	 f2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
)	TokenNameRPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHA	TokenNameIdentifier	 SHA
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
f2	TokenNameIdentifier	 f2
.	TokenNameDOT	
isPresent	TokenNameIdentifier	 is Present
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
f2	TokenNameIdentifier	 f2
.	TokenNameDOT	
isPresent	TokenNameIdentifier	 is Present
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f2	TokenNameIdentifier	 f2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Before	TokenNameIdentifier	 Before
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testBloomLimits1	TokenNameIdentifier	 test Bloom Limits1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maxBuckets	TokenNameIdentifier	 max Buckets
=	TokenNameEQUAL	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
probs	TokenNameIdentifier	 probs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxK	TokenNameIdentifier	 max K
=	TokenNameEQUAL	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
maxBuckets	TokenNameIdentifier	 max Buckets
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// possible 	TokenNameCOMMENT_LINE	possible 
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
computeBloomSpec	TokenNameIdentifier	 compute Bloom Spec
(	TokenNameLPAREN	
maxBuckets	TokenNameIdentifier	 max Buckets
,	TokenNameCOMMA	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
maxBuckets	TokenNameIdentifier	 max Buckets
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
maxK	TokenNameIdentifier	 max K
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// impossible, throws 	TokenNameCOMMENT_LINE	impossible, throws 
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
computeBloomSpec	TokenNameIdentifier	 compute Bloom Spec
(	TokenNameLPAREN	
maxBuckets	TokenNameIdentifier	 max Buckets
,	TokenNameCOMMA	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
maxBuckets	TokenNameIdentifier	 max Buckets
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
maxK	TokenNameIdentifier	 max K
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testOne	TokenNameIdentifier	 test One
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
isPresent	TokenNameIdentifier	 is Present
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
isPresent	TokenNameIdentifier	 is Present
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFalsePositivesInt	TokenNameIdentifier	 test False Positives Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
testFalsePositives	TokenNameIdentifier	 test False Positives
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
intKeys	TokenNameIdentifier	 int Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
randomKeys2	TokenNameIdentifier	 random Keys2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFalsePositivesRandom	TokenNameIdentifier	 test False Positives Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
testFalsePositives	TokenNameIdentifier	 test False Positives
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
randomKeys	TokenNameIdentifier	 random Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
randomKeys2	TokenNameIdentifier	 random Keys2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testWords	TokenNameIdentifier	 test Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
WordGenerator	TokenNameIdentifier	 Word Generator
.	TokenNameDOT	
WORDS	TokenNameIdentifier	 WORDS
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
bf2	TokenNameIdentifier	 bf2
=	TokenNameEQUAL	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
WordGenerator	TokenNameIdentifier	 Word Generator
.	TokenNameDOT	
WORDS	TokenNameIdentifier	 WORDS
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
MAX_FAILURE_RATE	TokenNameIdentifier	 MAX  FAILURE  RATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
skipEven	TokenNameIdentifier	 skip Even
=	TokenNameEQUAL	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
WordGenerator	TokenNameIdentifier	 Word Generator
.	TokenNameDOT	
WORDS	TokenNameIdentifier	 WORDS
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
testFalsePositives	TokenNameIdentifier	 test False Positives
(	TokenNameLPAREN	
bf2	TokenNameIdentifier	 bf2
,	TokenNameCOMMA	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
WordGenerator	TokenNameIdentifier	 Word Generator
(	TokenNameLPAREN	
skipEven	TokenNameIdentifier	 skip Even
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
WordGenerator	TokenNameIdentifier	 Word Generator
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testManyHashes	TokenNameIdentifier	 test Many Hashes
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
MAX_HASH_COUNT	TokenNameIdentifier	 MAX  HASH  COUNT
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
hashes	TokenNameIdentifier	 hashes
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
collisions	TokenNameIdentifier	 collisions
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hashes	TokenNameIdentifier	 hashes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
hashIndex	TokenNameIdentifier	 hash Index
:	TokenNameCOLON	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MAX_HASH_COUNT	TokenNameIdentifier	 MAX  HASH  COUNT
,	TokenNameCOMMA	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hashes	TokenNameIdentifier	 hashes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
hashIndex	TokenNameIdentifier	 hash Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
collisions	TokenNameIdentifier	 collisions
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
MAX_HASH_COUNT	TokenNameIdentifier	 MAX  HASH  COUNT
-	TokenNameMINUS	
hashes	TokenNameIdentifier	 hashes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
collisions	TokenNameIdentifier	 collisions
<=	TokenNameLESS_EQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testManyRandom	TokenNameIdentifier	 test Many Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testManyHashes	TokenNameIdentifier	 test Many Hashes
(	TokenNameLPAREN	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
randomKeys	TokenNameIdentifier	 random Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
