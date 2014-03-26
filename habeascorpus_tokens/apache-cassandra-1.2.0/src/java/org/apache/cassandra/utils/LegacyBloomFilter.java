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
BitSet	TokenNameIdentifier	 Bit Set
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
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
implements	TokenNameimplements	
IFilter	TokenNameIdentifier	 I Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXCESS	TokenNameIdentifier	 EXCESS
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LegacyBloomFilterSerializer	TokenNameIdentifier	 Legacy Bloom Filter Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
LegacyBloomFilterSerializer	TokenNameIdentifier	 Legacy Bloom Filter Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BitSet	TokenNameIdentifier	 Bit Set
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
hashCount	TokenNameIdentifier	 hash Count
;	TokenNameSEMICOLON	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
(	TokenNameLPAREN	
int	TokenNameint	
hashes	TokenNameIdentifier	 hashes
,	TokenNameCOMMA	
BitSet	TokenNameIdentifier	 Bit Set
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hashCount	TokenNameIdentifier	 hash Count
=	TokenNameEQUAL	
hashes	TokenNameIdentifier	 hashes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
BitSet	TokenNameIdentifier	 Bit Set
bucketsFor	TokenNameIdentifier	 buckets For
(	TokenNameLPAREN	
long	TokenNamelong	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
int	TokenNameint	
bucketsPer	TokenNameIdentifier	 buckets Per
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
numElements	TokenNameIdentifier	 num Elements
*	TokenNameMULTIPLY	
bucketsPer	TokenNameIdentifier	 buckets Per
+	TokenNamePLUS	
EXCESS	TokenNameIdentifier	 EXCESS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return A LegacyBloomFilter with the lowest practical false positive probability * for the given number of elements. */	TokenNameCOMMENT_JAVADOC	 @return A LegacyBloomFilter with the lowest practical false positive probability for the given number of elements. 
public	TokenNamepublic	
static	TokenNamestatic	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
long	TokenNamelong	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
int	TokenNameint	
targetBucketsPerElem	TokenNameIdentifier	 target Buckets Per Elem
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
"Cannot provide an optimal LegacyBloomFilter for %d elements (%d/%d buckets per element)."	TokenNameStringLiteral	Cannot provide an optimal LegacyBloomFilter for %d elements (%d/%d buckets per element).
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
new	TokenNamenew	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
bucketsFor	TokenNameIdentifier	 buckets For
(	TokenNameLPAREN	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The smallest LegacyBloomFilter that can provide the given false positive * probability rate for the given number of elements. * * Asserts that the given probability can be satisfied using this filter. */	TokenNameCOMMENT_JAVADOC	 @return The smallest LegacyBloomFilter that can provide the given false positive probability rate for the given number of elements. * Asserts that the given probability can be satisfied using this filter. 
public	TokenNamepublic	
static	TokenNamestatic	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
long	TokenNamelong	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
double	TokenNamedouble	
maxFalsePosProbability	TokenNameIdentifier	 max False Pos Probability
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
maxFalsePosProbability	TokenNameIdentifier	 max False Pos Probability
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
:	TokenNameCOLON	
"Invalid probability"	TokenNameStringLiteral	Invalid probability
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
new	TokenNamenew	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
bucketsFor	TokenNameIdentifier	 buckets For
(	TokenNameLPAREN	
numElements	TokenNameIdentifier	 num Elements
,	TokenNameCOMMA	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
buckets	TokenNameIdentifier	 buckets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPresent	TokenNameIdentifier	 is Present
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
bucketIndex	TokenNameIdentifier	 bucket Index
:	TokenNameCOLON	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
bucketIndex	TokenNameIdentifier	 bucket Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* @param key -- value whose hash is used to fill the filter. This is a general purpose API. */	TokenNameCOMMENT_BLOCK	 @param key -- value whose hash is used to fill the filter. This is a general purpose API. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
bucketIndex	TokenNameIdentifier	 bucket Index
:	TokenNameCOLON	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
bucketIndex	TokenNameIdentifier	 bucket Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
emptyBuckets	TokenNameIdentifier	 empty Buckets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
buckets	TokenNameIdentifier	 buckets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return a LegacyBloomFilter that always returns a positive match, for testing */	TokenNameCOMMENT_JAVADOC	 @return a LegacyBloomFilter that always returns a positive match, for testing 
public	TokenNamepublic	
static	TokenNamestatic	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
alwaysMatchingBloomFilter	TokenNameIdentifier	 always Matching Bloom Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BitSet	TokenNameIdentifier	 Bit Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
hashCount	TokenNameIdentifier	 hash Count
,	TokenNameCOMMA	
buckets	TokenNameIdentifier	 buckets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Murmur is faster than an SHA-based approach and provides as-good collision 	TokenNameCOMMENT_LINE	Murmur is faster than an SHA-based approach and provides as-good collision 
// resistance. The combinatorial generation approach described in 	TokenNameCOMMENT_LINE	resistance. The combinatorial generation approach described in 
// http://www.eecs.harvard.edu/~kirsch/pubs/bbbf/esa06.pdf 	TokenNameCOMMENT_LINE	http://www.eecs.harvard.edu/~kirsch/pubs/bbbf/esa06.pdf 
// does prove to work in actual tests, and is obviously faster 	TokenNameCOMMENT_LINE	does prove to work in actual tests, and is obviously faster 
// than performing further iterations of murmur. 	TokenNameCOMMENT_LINE	than performing further iterations of murmur. 
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
hashCount	TokenNameIdentifier	 hash Count
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
hashCount	TokenNameIdentifier	 hash Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash1	TokenNameIdentifier	 hash1
=	TokenNameEQUAL	
MurmurHash	TokenNameIdentifier	 Murmur Hash
.	TokenNameDOT	
hash32	TokenNameIdentifier	 hash32
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash2	TokenNameIdentifier	 hash2
=	TokenNameEQUAL	
MurmurHash	TokenNameIdentifier	 Murmur Hash
.	TokenNameDOT	
hash32	TokenNameIdentifier	 hash32
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
hash1	TokenNameIdentifier	 hash1
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
hashCount	TokenNameIdentifier	 hash Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hash1	TokenNameIdentifier	 hash1
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
hash2	TokenNameIdentifier	 hash2
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BitSet	TokenNameIdentifier	 Bit Set
getBitSet	TokenNameIdentifier	 get Bit Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Do nothing for this 	TokenNameCOMMENT_LINE	Do nothing for this 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
