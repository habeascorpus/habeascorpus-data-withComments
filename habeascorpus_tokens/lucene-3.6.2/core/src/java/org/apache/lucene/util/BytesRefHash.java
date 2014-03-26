package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
BYTE_BLOCK_MASK	TokenNameIdentifier	 BYTE  BLOCK  MASK
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
BYTE_BLOCK_SHIFT	TokenNameIdentifier	 BYTE  BLOCK  SHIFT
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicLong	TokenNameIdentifier	 Atomic Long
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
DirectAllocator	TokenNameIdentifier	 Direct Allocator
;	TokenNameSEMICOLON	
/** * {@link BytesRefHash} is a special purpose hash-map like data-structure * optimized for {@link BytesRef} instances. BytesRefHash maintains mappings of * byte arrays to ordinal (Map<BytesRef,int>) storing the hashed bytes * efficiently in continuous storage. The mapping to the ordinal is * encapsulated inside {@link BytesRefHash} and is guaranteed to be increased * for each added {@link BytesRef}. * * <p> * Note: The maximum capacity {@link BytesRef} instance passed to * {@link #add(BytesRef)} must not be longer than {@link ByteBlockPool#BYTE_BLOCK_SIZE}-2. * The internal storage is limited to 2GB total byte storage. * </p> * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 {@link BytesRefHash} is a special purpose hash-map like data-structure optimized for {@link BytesRef} instances. BytesRefHash maintains mappings of byte arrays to ordinal (Map<BytesRef,int>) storing the hashed bytes efficiently in continuous storage. The mapping to the ordinal is encapsulated inside {@link BytesRefHash} and is guaranteed to be increased for each added {@link BytesRef}. * <p> Note: The maximum capacity {@link BytesRef} instance passed to {@link #add(BytesRef)} must not be longer than {@link ByteBlockPool#BYTE_BLOCK_SIZE}-2. The internal storage is limited to 2GB total byte storage. </p> * @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
BytesRefHash	TokenNameIdentifier	 Bytes Ref Hash
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_CAPACITY	TokenNameIdentifier	 DEFAULT  CAPACITY
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// the following fields are needed by comparator, 	TokenNameCOMMENT_LINE	the following fields are needed by comparator, 
// so package private to prevent access$-methods: 	TokenNameCOMMENT_LINE	so package private to prevent access$-methods: 
final	TokenNamefinal	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
pool	TokenNameIdentifier	 pool
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytesStart	TokenNameIdentifier	 bytes Start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
scratch1	TokenNameIdentifier	 scratch1
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
hashSize	TokenNameIdentifier	 hash Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
hashHalfSize	TokenNameIdentifier	 hash Half Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
hashMask	TokenNameIdentifier	 hash Mask
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastCount	TokenNameIdentifier	 last Count
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ords	TokenNameIdentifier	 ords
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
BytesStartArray	TokenNameIdentifier	 Bytes Start Array
bytesStartArray	TokenNameIdentifier	 bytes Start Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
/** * Creates a new {@link BytesRefHash} with a {@link ByteBlockPool} using a * {@link DirectAllocator}. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link BytesRefHash} with a {@link ByteBlockPool} using a {@link DirectAllocator}. 
public	TokenNamepublic	
BytesRefHash	TokenNameIdentifier	 Bytes Ref Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
(	TokenNameLPAREN	
new	TokenNamenew	
DirectAllocator	TokenNameIdentifier	 Direct Allocator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link BytesRefHash} */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link BytesRefHash} 
public	TokenNamepublic	
BytesRefHash	TokenNameIdentifier	 Bytes Ref Hash
(	TokenNameLPAREN	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
pool	TokenNameIdentifier	 pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
pool	TokenNameIdentifier	 pool
,	TokenNameCOMMA	
DEFAULT_CAPACITY	TokenNameIdentifier	 DEFAULT  CAPACITY
,	TokenNameCOMMA	
new	TokenNamenew	
DirectBytesStartArray	TokenNameIdentifier	 Direct Bytes Start Array
(	TokenNameLPAREN	
DEFAULT_CAPACITY	TokenNameIdentifier	 DEFAULT  CAPACITY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link BytesRefHash} */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link BytesRefHash} 
public	TokenNamepublic	
BytesRefHash	TokenNameIdentifier	 Bytes Ref Hash
(	TokenNameLPAREN	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
pool	TokenNameIdentifier	 pool
,	TokenNameCOMMA	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
,	TokenNameCOMMA	
BytesStartArray	TokenNameIdentifier	 Bytes Start Array
bytesStartArray	TokenNameIdentifier	 bytes Start Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hashSize	TokenNameIdentifier	 hash Size
=	TokenNameEQUAL	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
hashHalfSize	TokenNameIdentifier	 hash Half Size
=	TokenNameEQUAL	
hashSize	TokenNameIdentifier	 hash Size
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hashMask	TokenNameIdentifier	 hash Mask
=	TokenNameEQUAL	
hashSize	TokenNameIdentifier	 hash Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pool	TokenNameIdentifier	 pool
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
;	TokenNameSEMICOLON	
ords	TokenNameIdentifier	 ords
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
hashSize	TokenNameIdentifier	 hash Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
ords	TokenNameIdentifier	 ords
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bytesStartArray	TokenNameIdentifier	 bytes Start Array
=	TokenNameEQUAL	
bytesStartArray	TokenNameIdentifier	 bytes Start Array
;	TokenNameSEMICOLON	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
bytesStartArray	TokenNameIdentifier	 bytes Start Array
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
=	TokenNameEQUAL	
bytesStartArray	TokenNameIdentifier	 bytes Start Array
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
bytesStartArray	TokenNameIdentifier	 bytes Start Array
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
hashSize	TokenNameIdentifier	 hash Size
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of {@link BytesRef} values in this {@link BytesRefHash}. * * @return the number of {@link BytesRef} values in this {@link BytesRefHash}. */	TokenNameCOMMENT_JAVADOC	 Returns the number of {@link BytesRef} values in this {@link BytesRefHash}. * @return the number of {@link BytesRef} values in this {@link BytesRefHash}. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Populates and returns a {@link BytesRef} with the bytes for the given ord. * <p> * Note: the given ord must be a positive integer less that the current size ( * {@link #size()}) * </p> * * @param ord the ord * @param ref the {@link BytesRef} to populate * * @return the given BytesRef instance populated with the bytes for the given ord */	TokenNameCOMMENT_JAVADOC	 Populates and returns a {@link BytesRef} with the bytes for the given ord. <p> Note: the given ord must be a positive integer less that the current size ( {@link #size()}) </p> * @param ord the ord @param ref the {@link BytesRef} to populate * @return the given BytesRef instance populated with the bytes for the given ord 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesStart	TokenNameIdentifier	 bytes Start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"bytesStart is null - not initialized"	TokenNameStringLiteral	bytesStart is null - not initialized
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ord	TokenNameIdentifier	 ord
<	TokenNameLESS	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
"ord exceeds byteStart len: "	TokenNameStringLiteral	ord exceeds byteStart len: 
+	TokenNamePLUS	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
setBytesRef	TokenNameIdentifier	 set Bytes Ref
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the ords array in arbitrary order. Valid ords start at offset of 0 * and end at a limit of {@link #size()} - 1 * <p> * Note: This is a destructive operation. {@link #clear()} must be called in * order to reuse this {@link BytesRefHash} instance. * </p> */	TokenNameCOMMENT_JAVADOC	 Returns the ords array in arbitrary order. Valid ords start at offset of 0 and end at a limit of {@link #size()} - 1 <p> Note: This is a destructive operation. {@link #clear()} must be called in order to reuse this {@link BytesRefHash} instance. </p> 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compact	TokenNameIdentifier	 compact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesStart	TokenNameIdentifier	 bytes Start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"Bytesstart is null - not initialized"	TokenNameStringLiteral	Bytesstart is null - not initialized
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
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
hashSize	TokenNameIdentifier	 hash Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
lastCount	TokenNameIdentifier	 last Count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ords	TokenNameIdentifier	 ords
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the values array sorted by the referenced byte values. * <p> * Note: This is a destructive operation. {@link #clear()} must be called in * order to reuse this {@link BytesRefHash} instance. * </p> * * @param comp * the {@link Comparator} used for sorting */	TokenNameCOMMENT_JAVADOC	 Returns the values array sorted by the referenced byte values. <p> Note: This is a destructive operation. {@link #clear()} must be called in order to reuse this {@link BytesRefHash} instance. </p> * @param comp the {@link Comparator} used for sorting 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compact	TokenNameIdentifier	 compact
=	TokenNameEQUAL	
compact	TokenNameIdentifier	 compact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
SorterTemplate	TokenNameIdentifier	 Sorter Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
compact	TokenNameIdentifier	 compact
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
compact	TokenNameIdentifier	 compact
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
compact	TokenNameIdentifier	 compact
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
compact	TokenNameIdentifier	 compact
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ord1	TokenNameIdentifier	 ord1
=	TokenNameEQUAL	
compact	TokenNameIdentifier	 compact
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ord2	TokenNameIdentifier	 ord2
=	TokenNameEQUAL	
compact	TokenNameIdentifier	 compact
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
ord1	TokenNameIdentifier	 ord1
&&	TokenNameAND_AND	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
ord2	TokenNameIdentifier	 ord2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
setBytesRef	TokenNameIdentifier	 set Bytes Ref
(	TokenNameLPAREN	
scratch1	TokenNameIdentifier	 scratch1
,	TokenNameCOMMA	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
ord1	TokenNameIdentifier	 ord1
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
setBytesRef	TokenNameIdentifier	 set Bytes Ref
(	TokenNameLPAREN	
scratch2	TokenNameIdentifier	 scratch2
,	TokenNameCOMMA	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
ord2	TokenNameIdentifier	 ord2
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setPivot	TokenNameIdentifier	 set Pivot
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
compact	TokenNameIdentifier	 compact
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
setBytesRef	TokenNameIdentifier	 set Bytes Ref
(	TokenNameLPAREN	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
comparePivot	TokenNameIdentifier	 compare Pivot
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
compact	TokenNameIdentifier	 compact
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
setBytesRef	TokenNameIdentifier	 set Bytes Ref
(	TokenNameLPAREN	
scratch2	TokenNameIdentifier	 scratch2
,	TokenNameCOMMA	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
pivot	TokenNameIdentifier	 pivot
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scratch1	TokenNameIdentifier	 scratch1
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scratch2	TokenNameIdentifier	 scratch2
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
.	TokenNameDOT	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compact	TokenNameIdentifier	 compact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
setBytesRef	TokenNameIdentifier	 set Bytes Ref
(	TokenNameLPAREN	
scratch1	TokenNameIdentifier	 scratch1
,	TokenNameCOMMA	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
bytesEquals	TokenNameIdentifier	 bytes Equals
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Cannot use ArrayUtil.shrink because we require power 	TokenNameCOMMENT_LINE	Cannot use ArrayUtil.shrink because we require power 
// of 2: 	TokenNameCOMMENT_LINE	of 2: 
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
hashSize	TokenNameIdentifier	 hash Size
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
newSize	TokenNameIdentifier	 new Size
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
>	TokenNameGREATER	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newSize	TokenNameIdentifier	 new Size
/=	TokenNameDIVIDE_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
hashSize	TokenNameIdentifier	 hash Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
*	TokenNameMULTIPLY	
-	TokenNameMINUS	
(	TokenNameLPAREN	
hashSize	TokenNameIdentifier	 hash Size
-	TokenNameMINUS	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashSize	TokenNameIdentifier	 hash Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
ords	TokenNameIdentifier	 ords
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
hashSize	TokenNameIdentifier	 hash Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
ords	TokenNameIdentifier	 ords
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashHalfSize	TokenNameIdentifier	 hash Half Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hashMask	TokenNameIdentifier	 hash Mask
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Clears the {@link BytesRef} which maps to the given {@link BytesRef} */	TokenNameCOMMENT_JAVADOC	 Clears the {@link BytesRef} which maps to the given {@link BytesRef} 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
boolean	TokenNameboolean	
resetPool	TokenNameIdentifier	 reset Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastCount	TokenNameIdentifier	 last Count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resetPool	TokenNameIdentifier	 reset Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
dropBuffersAndReset	TokenNameIdentifier	 drop Buffers And Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
bytesStartArray	TokenNameIdentifier	 bytes Start Array
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastCount	TokenNameIdentifier	 last Count
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
lastCount	TokenNameIdentifier	 last Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// shrink clears the hash entries 	TokenNameCOMMENT_LINE	shrink clears the hash entries 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
ords	TokenNameIdentifier	 ords
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes the BytesRefHash and releases all internally used memory */	TokenNameCOMMENT_JAVADOC	 Closes the BytesRefHash and releases all internally used memory 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ords	TokenNameIdentifier	 ords
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
*	TokenNameMULTIPLY	
-	TokenNameMINUS	
hashSize	TokenNameIdentifier	 hash Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a new {@link BytesRef} * * @param bytes * the bytes to hash * @return the ord the given bytes are hashed if there was no mapping for the * given bytes, otherwise <code>(-(ord)-1)</code>. This guarantees * that the return value will always be &gt;= 0 if the given bytes * haven't been hashed before. * * @throws MaxBytesLengthExceededException * if the given bytes are > 2 + * {@link ByteBlockPool#BYTE_BLOCK_SIZE} */	TokenNameCOMMENT_JAVADOC	 Adds a new {@link BytesRef} * @param bytes the bytes to hash @return the ord the given bytes are hashed if there was no mapping for the given bytes, otherwise <code>(-(ord)-1)</code>. This guarantees that the return value will always be &gt;= 0 if the given bytes haven't been hashed before. * @throws MaxBytesLengthExceededException if the given bytes are > 2 + {@link ByteBlockPool#BYTE_BLOCK_SIZE} 
public	TokenNamepublic	
int	TokenNameint	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a new {@link BytesRef} with a pre-calculated hash code. * * @param bytes * the bytes to hash * @param code * the bytes hash code * * <p> * Hashcode is defined as: * * <pre> * int hash = 0; * for (int i = offset; i &lt; offset + length; i++) { * hash = 31 * hash + bytes[i]; * } * </pre> * * @return the ord the given bytes are hashed if there was no mapping for the * given bytes, otherwise <code>(-(ord)-1)</code>. This guarantees * that the return value will always be &gt;= 0 if the given bytes * haven't been hashed before. * * @throws MaxBytesLengthExceededException * if the given bytes are > * {@link ByteBlockPool#BYTE_BLOCK_SIZE} - 2 */	TokenNameCOMMENT_JAVADOC	 Adds a new {@link BytesRef} with a pre-calculated hash code. * @param bytes the bytes to hash @param code the bytes hash code * <p> Hashcode is defined as: * <pre> int hash = 0; for (int i = offset; i &lt; offset + length; i++) { hash = 31 hash + bytes[i]; } </pre> * @return the ord the given bytes are hashed if there was no mapping for the given bytes, otherwise <code>(-(ord)-1)</code>. This guarantees that the return value will always be &gt;= 0 if the given bytes haven't been hashed before. * @throws MaxBytesLengthExceededException if the given bytes are > {@link ByteBlockPool#BYTE_BLOCK_SIZE} - 2 
public	TokenNamepublic	
int	TokenNameint	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
int	TokenNameint	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesStart	TokenNameIdentifier	 bytes Start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"Bytesstart is null - not initialized"	TokenNameStringLiteral	Bytesstart is null - not initialized
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// final position 	TokenNameCOMMENT_LINE	final position 
int	TokenNameint	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
hashMask	TokenNameIdentifier	 hash Mask
;	TokenNameSEMICOLON	
int	TokenNameint	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Conflict: keep searching different locations in 	TokenNameCOMMENT_LINE	Conflict: keep searching different locations in 
// the hash table. 	TokenNameCOMMENT_LINE	the hash table. 
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
hashMask	TokenNameIdentifier	 hash Mask
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// new entry 	TokenNameCOMMENT_LINE	new entry 
final	TokenNamefinal	
int	TokenNameint	
len2	TokenNameIdentifier	 len2
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len2	TokenNameIdentifier	 len2
+	TokenNamePLUS	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
byteUpto	TokenNameIdentifier	 byte Upto
>	TokenNameGREATER	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len2	TokenNameIdentifier	 len2
>	TokenNameGREATER	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MaxBytesLengthExceededException	TokenNameIdentifier	 Max Bytes Length Exceeded Exception
(	TokenNameLPAREN	
"bytes can be at most "	TokenNameStringLiteral	bytes can be at most 
+	TokenNamePLUS	
(	TokenNameLPAREN	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" in length; got "	TokenNameStringLiteral	 in length; got 
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
bufferUpto	TokenNameIdentifier	 buffer Upto
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
byteUpto	TokenNameIdentifier	 byte Upto
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>=	TokenNameGREATER_EQUAL	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
bytesStartArray	TokenNameIdentifier	 bytes Start Array
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"count: "	TokenNameStringLiteral	count: 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
" len: "	TokenNameStringLiteral	 len: 
+	TokenNamePLUS	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
e	TokenNameIdentifier	 e
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bufferUpto	TokenNameIdentifier	 buffer Upto
+	TokenNamePLUS	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
byteOffset	TokenNameIdentifier	 byte Offset
;	TokenNameSEMICOLON	
// We first encode the length, followed by the 	TokenNameCOMMENT_LINE	We first encode the length, followed by the 
// bytes. Length is encoded as vInt, but will consume 	TokenNameCOMMENT_LINE	bytes. Length is encoded as vInt, but will consume 
// 1 or 2 bytes at most (we reject too-long terms, 	TokenNameCOMMENT_LINE	1 or 2 bytes at most (we reject too-long terms, 
// above). 	TokenNameCOMMENT_LINE	above). 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 1 byte to store length 	TokenNameCOMMENT_LINE	1 byte to store length 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
bufferUpto	TokenNameIdentifier	 buffer Upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
byteUpto	TokenNameIdentifier	 byte Upto
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Length must be positive: "	TokenNameStringLiteral	Length must be positive: 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
bufferUpto	TokenNameIdentifier	 buffer Upto
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// 2 byte to store length 	TokenNameCOMMENT_LINE	2 byte to store length 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
bufferUpto	TokenNameIdentifier	 buffer Upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
bufferUpto	TokenNameIdentifier	 buffer Upto
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
byteUpto	TokenNameIdentifier	 byte Upto
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
bufferUpto	TokenNameIdentifier	 buffer Upto
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
hashHalfSize	TokenNameIdentifier	 hash Half Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hashSize	TokenNameIdentifier	 hash Size
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
addByPoolOffset	TokenNameIdentifier	 add By Pool Offset
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesStart	TokenNameIdentifier	 bytes Start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"Bytesstart is null - not initialized"	TokenNameStringLiteral	Bytesstart is null - not initialized
;	TokenNameSEMICOLON	
// final position 	TokenNameCOMMENT_LINE	final position 
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
&	TokenNameAND	
hashMask	TokenNameIdentifier	 hash Mask
;	TokenNameSEMICOLON	
int	TokenNameint	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
e	TokenNameIdentifier	 e
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Conflict: keep searching different locations in 	TokenNameCOMMENT_LINE	Conflict: keep searching different locations in 
// the hash table. 	TokenNameCOMMENT_LINE	the hash table. 
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
hashMask	TokenNameIdentifier	 hash Mask
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
e	TokenNameIdentifier	 e
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// new entry 	TokenNameCOMMENT_LINE	new entry 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>=	TokenNameGREATER_EQUAL	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
bytesStartArray	TokenNameIdentifier	 bytes Start Array
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"count: "	TokenNameStringLiteral	count: 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
" len: "	TokenNameStringLiteral	 len: 
+	TokenNamePLUS	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
e	TokenNameIdentifier	 e
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
hashHalfSize	TokenNameIdentifier	 hash Half Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hashSize	TokenNameIdentifier	 hash Size
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when hash is too small (> 50% occupied) or too large (< 20% * occupied). */	TokenNameCOMMENT_JAVADOC	 Called when hash is too small (> 50% occupied) or too large (< 20% occupied). 
private	TokenNameprivate	
void	TokenNamevoid	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hashOnData	TokenNameIdentifier	 hash On Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
newMask	TokenNameIdentifier	 new Mask
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newHash	TokenNameIdentifier	 new Hash
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
newHash	TokenNameIdentifier	 new Hash
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
hashSize	TokenNameIdentifier	 hash Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
e0	TokenNameIdentifier	 e0
=	TokenNameEQUAL	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e0	TokenNameIdentifier	 e0
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hashOnData	TokenNameIdentifier	 hash On Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
e0	TokenNameIdentifier	 e0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
&	TokenNameAND	
BYTE_BLOCK_MASK	TokenNameIdentifier	 BYTE  BLOCK  MASK
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
>>	TokenNameRIGHT_SHIFT	
BYTE_BLOCK_SHIFT	TokenNameIdentifier	 BYTE  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// length is 1 byte 	TokenNameCOMMENT_LINE	length is 1 byte 
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
endPos	TokenNameIdentifier	 end Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
endPos	TokenNameIdentifier	 end Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
code	TokenNameIdentifier	 code
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
e0	TokenNameIdentifier	 e0
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
newMask	TokenNameIdentifier	 new Mask
;	TokenNameSEMICOLON	
assert	TokenNameassert	
hashPos	TokenNameIdentifier	 hash Pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newHash	TokenNameIdentifier	 new Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
newMask	TokenNameIdentifier	 new Mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
newHash	TokenNameIdentifier	 new Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newHash	TokenNameIdentifier	 new Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e0	TokenNameIdentifier	 e0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
hashMask	TokenNameIdentifier	 hash Mask
=	TokenNameEQUAL	
newMask	TokenNameIdentifier	 new Mask
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
-	TokenNameMINUS	
ords	TokenNameIdentifier	 ords
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ords	TokenNameIdentifier	 ords
=	TokenNameEQUAL	
newHash	TokenNameIdentifier	 new Hash
;	TokenNameSEMICOLON	
hashSize	TokenNameIdentifier	 hash Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
hashHalfSize	TokenNameIdentifier	 hash Half Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * reinitializes the {@link BytesRefHash} after a previous {@link #clear()} * call. If {@link #clear()} has not been called previously this method has no * effect. */	TokenNameCOMMENT_JAVADOC	 reinitializes the {@link BytesRefHash} after a previous {@link #clear()} call. If {@link #clear()} has not been called previously this method has no effect. 
public	TokenNamepublic	
void	TokenNamevoid	
reinit	TokenNameIdentifier	 reinit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytesStart	TokenNameIdentifier	 bytes Start
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
bytesStartArray	TokenNameIdentifier	 bytes Start Array
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ords	TokenNameIdentifier	 ords
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ords	TokenNameIdentifier	 ords
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
hashSize	TokenNameIdentifier	 hash Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
*	TokenNameMULTIPLY	
hashSize	TokenNameIdentifier	 hash Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the bytesStart offset into the internally used * {@link ByteBlockPool} for the given ord * * @param ord * the ord to look up * @return the bytesStart offset into the internally used * {@link ByteBlockPool} for the given ord */	TokenNameCOMMENT_JAVADOC	 Returns the bytesStart offset into the internally used {@link ByteBlockPool} for the given ord * @param ord the ord to look up @return the bytesStart offset into the internally used {@link ByteBlockPool} for the given ord 
public	TokenNamepublic	
int	TokenNameint	
byteStart	TokenNameIdentifier	 byte Start
(	TokenNameLPAREN	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesStart	TokenNameIdentifier	 bytes Start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"Bytesstart is null - not initialized"	TokenNameStringLiteral	Bytesstart is null - not initialized
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ord	TokenNameIdentifier	 ord
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ord	TokenNameIdentifier	 ord
<	TokenNameLESS	
count	TokenNameIdentifier	 count
:	TokenNameCOLON	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bytesStart	TokenNameIdentifier	 bytes Start
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Thrown if a {@link BytesRef} exceeds the {@link BytesRefHash} limit of * {@link ByteBlockPool#BYTE_BLOCK_SIZE}-2. */	TokenNameCOMMENT_JAVADOC	 Thrown if a {@link BytesRef} exceeds the {@link BytesRefHash} limit of {@link ByteBlockPool#BYTE_BLOCK_SIZE}-2. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"serial"	TokenNameStringLiteral	serial
)	TokenNameRPAREN	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MaxBytesLengthExceededException	TokenNameIdentifier	 Max Bytes Length Exceeded Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
MaxBytesLengthExceededException	TokenNameIdentifier	 Max Bytes Length Exceeded Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Manages allocation of the per-term addresses. */	TokenNameCOMMENT_JAVADOC	 Manages allocation of the per-term addresses. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
BytesStartArray	TokenNameIdentifier	 Bytes Start Array
{	TokenNameLBRACE	
/** * Initializes the BytesStartArray. This call will allocate memory * * @return the initialized bytes start array */	TokenNameCOMMENT_JAVADOC	 Initializes the BytesStartArray. This call will allocate memory * @return the initialized bytes start array 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Grows the {@link BytesStartArray} * * @return the grown array */	TokenNameCOMMENT_JAVADOC	 Grows the {@link BytesStartArray} * @return the grown array 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * clears the {@link BytesStartArray} and returns the cleared instance. * * @return the cleared instance, this might be <code>null</code> */	TokenNameCOMMENT_JAVADOC	 clears the {@link BytesStartArray} and returns the cleared instance. * @return the cleared instance, this might be <code>null</code> 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A {@link AtomicLong} reference holding the number of bytes used by this * {@link BytesStartArray}. The {@link BytesRefHash} uses this reference to * track it memory usage * * @return a {@link AtomicLong} reference holding the number of bytes used * by this {@link BytesStartArray}. */	TokenNameCOMMENT_JAVADOC	 A {@link AtomicLong} reference holding the number of bytes used by this {@link BytesStartArray}. The {@link BytesRefHash} uses this reference to track it memory usage * @return a {@link AtomicLong} reference holding the number of bytes used by this {@link BytesStartArray}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A simple {@link BytesStartArray} that tracks all * memory allocation using a shared {@link AtomicLong} * instance. */	TokenNameCOMMENT_JAVADOC	 A simple {@link BytesStartArray} that tracks all memory allocation using a shared {@link AtomicLong} instance. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TrackingDirectBytesStartArray	TokenNameIdentifier	 Tracking Direct Bytes Start Array
extends	TokenNameextends	
BytesStartArray	TokenNameIdentifier	 Bytes Start Array
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
initSize	TokenNameIdentifier	 init Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytesStart	TokenNameIdentifier	 bytes Start
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TrackingDirectBytesStartArray	TokenNameIdentifier	 Tracking Direct Bytes Start Array
(	TokenNameLPAREN	
int	TokenNameint	
initSize	TokenNameIdentifier	 init Size
,	TokenNameCOMMA	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
initSize	TokenNameIdentifier	 init Size
=	TokenNameEQUAL	
initSize	TokenNameIdentifier	 init Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
=	TokenNameEQUAL	
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytesStart	TokenNameIdentifier	 bytes Start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
-	TokenNameMINUS	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesStart	TokenNameIdentifier	 bytes Start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
oldSize	TokenNameIdentifier	 old Size
=	TokenNameEQUAL	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
bytesStart	TokenNameIdentifier	 bytes Start
,	TokenNameCOMMA	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
oldSize	TokenNameIdentifier	 old Size
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bytesStart	TokenNameIdentifier	 bytes Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
initSize	TokenNameIdentifier	 init Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bytesStart	TokenNameIdentifier	 bytes Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** A simple {@link BytesStartArray} that tracks * memory allocation using a private {@link AtomicLong} * instance. */	TokenNameCOMMENT_JAVADOC	 A simple {@link BytesStartArray} that tracks memory allocation using a private {@link AtomicLong} instance. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DirectBytesStartArray	TokenNameIdentifier	 Direct Bytes Start Array
extends	TokenNameextends	
BytesStartArray	TokenNameIdentifier	 Bytes Start Array
{	TokenNameLBRACE	
// TODO: can't we just merge this w/ 	TokenNameCOMMENT_LINE	TODO: can't we just merge this w/ 
// TrackingDirectBytesStartArray...? Just add a ctor 	TokenNameCOMMENT_LINE	TrackingDirectBytesStartArray...? Just add a ctor 
// that makes a private bytesUsed? 	TokenNameCOMMENT_LINE	that makes a private bytesUsed? 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
initSize	TokenNameIdentifier	 init Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytesStart	TokenNameIdentifier	 bytes Start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DirectBytesStartArray	TokenNameIdentifier	 Direct Bytes Start Array
(	TokenNameLPAREN	
int	TokenNameint	
initSize	TokenNameIdentifier	 init Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
initSize	TokenNameIdentifier	 init Size
=	TokenNameEQUAL	
initSize	TokenNameIdentifier	 init Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesStart	TokenNameIdentifier	 bytes Start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
bytesStart	TokenNameIdentifier	 bytes Start
,	TokenNameCOMMA	
bytesStart	TokenNameIdentifier	 bytes Start
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytesStart	TokenNameIdentifier	 bytes Start
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
initSize	TokenNameIdentifier	 init Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
