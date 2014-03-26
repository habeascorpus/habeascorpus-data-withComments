/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
IBitSet	TokenNameIdentifier	 I Bit Set
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
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
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
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
public	TokenNamepublic	
class	TokenNameclass	
FilterFactory	TokenNameIdentifier	 Filter Factory
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
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
TypeSizes	TokenNameIdentifier	 Type Sizes
TYPE_SIZES	TokenNameIdentifier	 TYPE  SIZES
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
BITSET_EXCESS	TokenNameIdentifier	 BITSET  EXCESS
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
enum	TokenNameenum	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
SHA	TokenNameIdentifier	 SHA
,	TokenNameCOMMA	
MURMUR2	TokenNameIdentifier	 MURMU R2
,	TokenNameCOMMA	
MURMUR3	TokenNameIdentifier	 MURMU R3
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
IFilter	TokenNameIdentifier	 I Filter
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
IFilter	TokenNameIdentifier	 I Filter
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SHA	TokenNameIdentifier	 SHA
:	TokenNameCOLON	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
)	TokenNameRPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MURMUR2	TokenNameIdentifier	 MURMU R2
:	TokenNameCOLON	
Murmur2BloomFilter	TokenNameIdentifier	 Murmur2 Bloom Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Murmur2BloomFilter	TokenNameIdentifier	 Murmur2 Bloom Filter
)	TokenNameRPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
Murmur3BloomFilter	TokenNameIdentifier	 Murmur3 Bloom Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Murmur3BloomFilter	TokenNameIdentifier	 Murmur3 Bloom Filter
)	TokenNameRPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
IFilter	TokenNameIdentifier	 I Filter
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SHA	TokenNameIdentifier	 SHA
:	TokenNameCOLON	
return	TokenNamereturn	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MURMUR2	TokenNameIdentifier	 MURMU R2
:	TokenNameCOLON	
return	TokenNamereturn	
Murmur2BloomFilter	TokenNameIdentifier	 Murmur2 Bloom Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
Murmur3BloomFilter	TokenNameIdentifier	 Murmur3 Bloom Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
IFilter	TokenNameIdentifier	 I Filter
bf	TokenNameIdentifier	 bf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
IFilter	TokenNameIdentifier	 I Filter
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SHA	TokenNameIdentifier	 SHA
:	TokenNameCOLON	
return	TokenNamereturn	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
)	TokenNameRPAREN	
bf	TokenNameIdentifier	 bf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MURMUR2	TokenNameIdentifier	 MURMU R2
:	TokenNameCOLON	
return	TokenNamereturn	
Murmur2BloomFilter	TokenNameIdentifier	 Murmur2 Bloom Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Murmur2BloomFilter	TokenNameIdentifier	 Murmur2 Bloom Filter
)	TokenNameRPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
TYPE_SIZES	TokenNameIdentifier	 TYPE  SIZES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
Murmur3BloomFilter	TokenNameIdentifier	 Murmur3 Bloom Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Murmur3BloomFilter	TokenNameIdentifier	 Murmur3 Bloom Filter
)	TokenNameRPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
TYPE_SIZES	TokenNameIdentifier	 TYPE  SIZES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @return A BloomFilter with the lowest practical false positive * probability for the given number of elements. */	TokenNameCOMMENT_JAVADOC	 @return A BloomFilter with the lowest practical false positive probability for the given number of elements. 
public	TokenNamepublic	
static	TokenNamestatic	
IFilter	TokenNameIdentifier	 I Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
long	TokenNamelong	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
int	TokenNameint	
targetBucketsPerElem	TokenNameIdentifier	 target Buckets Per Elem
,	TokenNameCOMMA	
boolean	TokenNameboolean	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
targetBucketsPerElem	TokenNameIdentifier	 target Buckets Per Elem
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
,	TokenNameCOMMA	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// helper method for test. 	TokenNameCOMMENT_LINE	helper method for test. 
static	TokenNamestatic	
IFilter	TokenNameIdentifier	 I Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
long	TokenNamelong	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
int	TokenNameint	
targetBucketsPerElem	TokenNameIdentifier	 target Buckets Per Elem
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
(	TokenNameLPAREN	
numElements	TokenNameIdentifier	 num Elements
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
targetBucketsPerElem	TokenNameIdentifier	 target Buckets Per Elem
,	TokenNameCOMMA	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
<	TokenNameLESS	
targetBucketsPerElem	TokenNameIdentifier	 target Buckets Per Elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Cannot provide an optimal BloomFilter for %d elements (%d/%d buckets per element)."	TokenNameStringLiteral	Cannot provide an optimal BloomFilter for %d elements (%d/%d buckets per element).
,	TokenNameCOMMA	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
,	TokenNameCOMMA	
targetBucketsPerElem	TokenNameIdentifier	 target Buckets Per Elem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
BloomSpecification	TokenNameIdentifier	 Bloom Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
computeBloomSpec	TokenNameIdentifier	 compute Bloom Spec
(	TokenNameLPAREN	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
createFilter	TokenNameIdentifier	 create Filter
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The smallest BloomFilter that can provide the given false * positive probability rate for the given number of elements. * * Asserts that the given probability can be satisfied using this * filter. */	TokenNameCOMMENT_JAVADOC	 @return The smallest BloomFilter that can provide the given false positive probability rate for the given number of elements. * Asserts that the given probability can be satisfied using this filter. 
public	TokenNamepublic	
static	TokenNamestatic	
IFilter	TokenNameIdentifier	 I Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
long	TokenNamelong	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
double	TokenNamedouble	
maxFalsePosProbability	TokenNameIdentifier	 max False Pos Probability
,	TokenNameCOMMA	
boolean	TokenNameboolean	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
maxFalsePosProbability	TokenNameIdentifier	 max False Pos Probability
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
,	TokenNameCOMMA	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// helper method for test. 	TokenNameCOMMENT_LINE	helper method for test. 
static	TokenNamestatic	
IFilter	TokenNameIdentifier	 I Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
long	TokenNamelong	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
double	TokenNamedouble	
maxFalsePosProbability	TokenNameIdentifier	 max False Pos Probability
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
maxFalsePosProbability	TokenNameIdentifier	 max False Pos Probability
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
:	TokenNameCOLON	
"Invalid probability"	TokenNameStringLiteral	Invalid probability
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxFalsePosProbability	TokenNameIdentifier	 max False Pos Probability
==	TokenNameEQUAL_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
AlwaysPresentFilter	TokenNameIdentifier	 Always Present Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
=	TokenNameEQUAL	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
maxBucketsPerElement	TokenNameIdentifier	 max Buckets Per Element
(	TokenNameLPAREN	
numElements	TokenNameIdentifier	 num Elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
BloomSpecification	TokenNameIdentifier	 Bloom Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
computeBloomSpec	TokenNameIdentifier	 compute Bloom Spec
(	TokenNameLPAREN	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
,	TokenNameCOMMA	
maxFalsePosProbability	TokenNameIdentifier	 max False Pos Probability
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
createFilter	TokenNameIdentifier	 create Filter
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
IFilter	TokenNameIdentifier	 I Filter
createFilter	TokenNameIdentifier	 create Filter
(	TokenNameLPAREN	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
long	TokenNamelong	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
int	TokenNameint	
bucketsPer	TokenNameIdentifier	 buckets Per
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
offheap	TokenNameIdentifier	 offheap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
numElements	TokenNameIdentifier	 num Elements
*	TokenNameMULTIPLY	
bucketsPer	TokenNameIdentifier	 buckets Per
)	TokenNameRPAREN	
+	TokenNamePLUS	
BITSET_EXCESS	TokenNameIdentifier	 BITSET  EXCESS
;	TokenNameSEMICOLON	
IBitSet	TokenNameIdentifier	 I Bit Set
bitset	TokenNameIdentifier	 bitset
=	TokenNameEQUAL	
offheap	TokenNameIdentifier	 offheap
?	TokenNameQUESTION	
new	TokenNamenew	
OffHeapBitSet	TokenNameIdentifier	 Off Heap Bit Set
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
MURMUR2	TokenNameIdentifier	 MURMU R2
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Murmur2BloomFilter	TokenNameIdentifier	 Murmur2 Bloom Filter
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
bitset	TokenNameIdentifier	 bitset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Murmur3BloomFilter	TokenNameIdentifier	 Murmur3 Bloom Filter
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
bitset	TokenNameIdentifier	 bitset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
