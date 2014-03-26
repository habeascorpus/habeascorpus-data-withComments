/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
obs	TokenNameIdentifier	 obs
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
/** * An "open" BitSet implementation that allows direct access to the arrays of words * storing the bits. Derived from Lucene's OpenBitSet, but with a paged backing array * (see bits delaration, below). * <p/> * Unlike java.util.bitset, the fact that bits are packed into an array of longs * is part of the interface. This allows efficient implementation of other algorithms * by someone other than the author. It also allows one to efficiently implement * alternate serialization or interchange formats. * <p/> * <code>OpenBitSet</code> is faster than <code>java.util.BitSet</code> in most operations * and *much* faster at calculating cardinality of sets and results of set operations. * It can also handle sets of larger cardinality (up to 64 * 2**32-1) * <p/> * The goals of <code>OpenBitSet</code> are the fastest implementation possible, and * maximum code reuse. Extra safety and encapsulation * may always be built on top, but if that's built in, the cost can never be removed (and * hence people re-implement their own version in order to get better performance). * If you want a "safe", totally encapsulated (and slower and limited) BitSet * class, use <code>java.util.BitSet</code>. */	TokenNameCOMMENT_JAVADOC	 An "open" BitSet implementation that allows direct access to the arrays of words storing the bits. Derived from Lucene's OpenBitSet, but with a paged backing array (see bits delaration, below). <p/> Unlike java.util.bitset, the fact that bits are packed into an array of longs is part of the interface. This allows efficient implementation of other algorithms by someone other than the author. It also allows one to efficiently implement alternate serialization or interchange formats. <p/> <code>OpenBitSet</code> is faster than <code>java.util.BitSet</code> in most operations and *much* faster at calculating cardinality of sets and results of set operations. It can also handle sets of larger cardinality (up to 64 2**32-1) <p/> The goals of <code>OpenBitSet</code> are the fastest implementation possible, and maximum code reuse. Extra safety and encapsulation may always be built on top, but if that's built in, the cost can never be removed (and hence people re-implement their own version in order to get better performance). If you want a "safe", totally encapsulated (and slower and limited) BitSet class, use <code>java.util.BitSet</code>. 
public	TokenNamepublic	
class	TokenNameclass	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
implements	TokenNameimplements	
IBitSet	TokenNameIdentifier	 I Bit Set
{	TokenNameLBRACE	
/** * We break the bitset up into multiple arrays to avoid promotion failure caused by attempting to allocate * large, contiguous arrays (CASSANDRA-2466). All sub-arrays but the last are uniformly PAGE_SIZE words; * to avoid waste in small bloom filters (of which Cassandra has many: one per row) the last sub-array * is sized to exactly the remaining number of words required to achieve the desired set size (CASSANDRA-3618). */	TokenNameCOMMENT_JAVADOC	 We break the bitset up into multiple arrays to avoid promotion failure caused by attempting to allocate large, contiguous arrays (CASSANDRA-2466). All sub-arrays but the last are uniformly PAGE_SIZE words; to avoid waste in small bloom filters (of which Cassandra has many: one per row) the last sub-array is sized to exactly the remaining number of words required to achieve the desired set size (CASSANDRA-3618). 
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
wlen	TokenNameIdentifier	 wlen
;	TokenNameSEMICOLON	
// number of words (elements) used in the array 	TokenNameCOMMENT_LINE	number of words (elements) used in the array 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
pageCount	TokenNameIdentifier	 page Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
=	TokenNameEQUAL	
4096	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructs an OpenBitSet large enough to hold numBits. * @param numBits */	TokenNameCOMMENT_JAVADOC	 Constructs an OpenBitSet large enough to hold numBits. @param numBits 
public	TokenNamepublic	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
long	TokenNamelong	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wlen	TokenNameIdentifier	 wlen
=	TokenNameEQUAL	
bits2words	TokenNameIdentifier	 bits2words
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastPageSize	TokenNameIdentifier	 last Page Size
=	TokenNameEQUAL	
wlen	TokenNameIdentifier	 wlen
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
;	TokenNameSEMICOLON	
int	TokenNameint	
fullPageCount	TokenNameIdentifier	 full Page Count
=	TokenNameEQUAL	
wlen	TokenNameIdentifier	 wlen
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
;	TokenNameSEMICOLON	
pageCount	TokenNameIdentifier	 page Count
=	TokenNameEQUAL	
fullPageCount	TokenNameIdentifier	 full Page Count
+	TokenNamePLUS	
(	TokenNameLPAREN	
lastPageSize	TokenNameIdentifier	 last Page Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
pageCount	TokenNameIdentifier	 page Count
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
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
fullPageCount	TokenNameIdentifier	 full Page Count
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastPageSize	TokenNameIdentifier	 last Page Size
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
lastPageSize	TokenNameIdentifier	 last Page Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the pageSize */	TokenNameCOMMENT_JAVADOC	 @return the pageSize 
public	TokenNamepublic	
int	TokenNameint	
getPageSize	TokenNameIdentifier	 get Page Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPageCount	TokenNameIdentifier	 get Page Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pageCount	TokenNameIdentifier	 page Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPage	TokenNameIdentifier	 get Page
(	TokenNameLPAREN	
int	TokenNameint	
pageIdx	TokenNameIdentifier	 page Idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
pageIdx	TokenNameIdentifier	 page Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current capacity in bits (1 greater than the index of the last bit) */	TokenNameCOMMENT_JAVADOC	 Returns the current capacity in bits (1 greater than the index of the last bit) 
public	TokenNamepublic	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current capacity of this set. Included for * compatibility. This is *not* equal to {@link #cardinality} */	TokenNameCOMMENT_JAVADOC	 Returns the current capacity of this set. Included for compatibility. This is *not* equal to {@link #cardinality} 
public	TokenNamepublic	
long	TokenNamelong	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// @Override -- not until Java 1.6 	TokenNameCOMMENT_LINE	@Override -- not until Java 1.6 
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if there are no set bits */	TokenNameCOMMENT_JAVADOC	 Returns true if there are no set bits 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: gets the number of longs in the array that are in use */	TokenNameCOMMENT_JAVADOC	 Expert: gets the number of longs in the array that are in use 
public	TokenNamepublic	
int	TokenNameint	
getNumWords	TokenNameIdentifier	 get Num Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wlen	TokenNameIdentifier	 wlen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true or false for the specified bit index. * The index should be less than the OpenBitSet size */	TokenNameCOMMENT_JAVADOC	 Returns true or false for the specified bit index. The index should be less than the OpenBitSet size 
public	TokenNamepublic	
boolean	TokenNameboolean	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// div 64 	TokenNameCOMMENT_LINE	div 64 
// signed shift will keep a negative index and force an 	TokenNameCOMMENT_LINE	signed shift will keep a negative index and force an 
// array-index-out-of-bounds-exception, removing the need for an explicit check. 	TokenNameCOMMENT_LINE	array-index-out-of-bounds-exception, removing the need for an explicit check. 
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// mod 64 	TokenNameCOMMENT_LINE	mod 64 
long	TokenNamelong	
bitmask	TokenNameIdentifier	 bitmask
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
// TODO perfectionist one can implement this using bit operations 	TokenNameCOMMENT_LINE	TODO perfectionist one can implement this using bit operations 
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
&	TokenNameAND	
bitmask	TokenNameIdentifier	 bitmask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true or false for the specified bit index. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 Returns true or false for the specified bit index. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
boolean	TokenNameboolean	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// div 64 	TokenNameCOMMENT_LINE	div 64 
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// mod 64 	TokenNameCOMMENT_LINE	mod 64 
long	TokenNamelong	
bitmask	TokenNameIdentifier	 bitmask
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
// TODO perfectionist one can implement this using bit operations 	TokenNameCOMMENT_LINE	TODO perfectionist one can implement this using bit operations 
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
&	TokenNameAND	
bitmask	TokenNameIdentifier	 bitmask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the bit at the specified index. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 Sets the bit at the specified index. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
wordNum	TokenNameIdentifier	 word Num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
bitmask	TokenNameIdentifier	 bitmask
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the bit at the specified index. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 Sets the bit at the specified index. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
wordNum	TokenNameIdentifier	 word Num
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// div 64 	TokenNameCOMMENT_LINE	div 64 
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// mod 64 	TokenNameCOMMENT_LINE	mod 64 
long	TokenNamelong	
bitmask	TokenNameIdentifier	 bitmask
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * clears a bit. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 clears a bit. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
wordNum	TokenNameIdentifier	 word Num
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x03f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
bitmask	TokenNameIdentifier	 bitmask
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
// hmmm, it takes one more instruction to clear than it does to set... any 	TokenNameCOMMENT_LINE	hmmm, it takes one more instruction to clear than it does to set... any 
// way to work around this? If there were only 63 bits per word, we could 	TokenNameCOMMENT_LINE	way to work around this? If there were only 63 bits per word, we could 
// use a right shift of 10111111...111 in binary to position the 0 in the 	TokenNameCOMMENT_LINE	use a right shift of 10111111...111 in binary to position the 0 in the 
// correct place (using sign extension). 	TokenNameCOMMENT_LINE	correct place (using sign extension). 
// Could also use Long.rotateRight() or rotateLeft() *if* they were converted 	TokenNameCOMMENT_LINE	Could also use Long.rotateRight() or rotateLeft() *if* they were converted 
// by the JVM into a native instruction. 	TokenNameCOMMENT_LINE	by the JVM into a native instruction. 
// bits[word] &= Long.rotateLeft(0xfffffffe,bit); 	TokenNameCOMMENT_LINE	bits[word] &= Long.rotateLeft(0xfffffffe,bit); 
}	TokenNameRBRACE	
/** * clears a bit. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 clears a bit. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
wordNum	TokenNameIdentifier	 word Num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// div 64 	TokenNameCOMMENT_LINE	div 64 
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// mod 64 	TokenNameCOMMENT_LINE	mod 64 
long	TokenNamelong	
bitmask	TokenNameIdentifier	 bitmask
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears a range of bits. Clearing past the end does not change the size of the set. * * @param startIndex lower index * @param endIndex one-past the last bit to clear */	TokenNameCOMMENT_JAVADOC	 Clears a range of bits. Clearing past the end does not change the size of the set. * @param startIndex lower index @param endIndex one-past the last bit to clear 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
<=	TokenNameLESS_EQUAL	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
startWord	TokenNameIdentifier	 start Word
=	TokenNameEQUAL	
(	TokenNameLPAREN	
startIndex	TokenNameIdentifier	 start Index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startWord	TokenNameIdentifier	 start Word
>=	TokenNameGREATER_EQUAL	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// since endIndex is one past the end, this is index of the last 	TokenNameCOMMENT_LINE	since endIndex is one past the end, this is index of the last 
// word to be changed. 	TokenNameCOMMENT_LINE	word to be changed. 
int	TokenNameint	
endWord	TokenNameIdentifier	 end Word
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
startmask	TokenNameIdentifier	 startmask
=	TokenNameEQUAL	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
long	TokenNamelong	
endmask	TokenNameIdentifier	 endmask
=	TokenNameEQUAL	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
-	TokenNameMINUS	
endIndex	TokenNameIdentifier	 end Index
;	TokenNameSEMICOLON	
// 64-(endIndex&0x3f) is the same as -endIndex due to wrap 	TokenNameCOMMENT_LINE	64-(endIndex&0x3f) is the same as -endIndex due to wrap 
// invert masks since we are clearing 	TokenNameCOMMENT_LINE	invert masks since we are clearing 
startmask	TokenNameIdentifier	 startmask
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
startmask	TokenNameIdentifier	 startmask
;	TokenNameSEMICOLON	
endmask	TokenNameIdentifier	 endmask
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
endmask	TokenNameIdentifier	 endmask
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startWord	TokenNameIdentifier	 start Word
==	TokenNameEQUAL_EQUAL	
endWord	TokenNameIdentifier	 end Word
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
(	TokenNameLPAREN	
startmask	TokenNameIdentifier	 startmask
|	TokenNameOR	
endmask	TokenNameIdentifier	 endmask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
startmask	TokenNameIdentifier	 startmask
;	TokenNameSEMICOLON	
int	TokenNameint	
middle	TokenNameIdentifier	 middle
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
endWord	TokenNameIdentifier	 end Word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startWord	TokenNameIdentifier	 start Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
==	TokenNameEQUAL_EQUAL	
middle	TokenNameIdentifier	 middle
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
startWord	TokenNameIdentifier	 start Word
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
,	TokenNameCOMMA	
middle	TokenNameIdentifier	 middle
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
startWord	TokenNameIdentifier	 start Word
<	TokenNameLESS	
middle	TokenNameIdentifier	 middle
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endWord	TokenNameIdentifier	 end Word
<	TokenNameLESS	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
endWord	TokenNameIdentifier	 end Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
endWord	TokenNameIdentifier	 end Word
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
endmask	TokenNameIdentifier	 endmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Clears a range of bits. Clearing past the end does not change the size of the set. * * @param startIndex lower index * @param endIndex one-past the last bit to clear */	TokenNameCOMMENT_JAVADOC	 Clears a range of bits. Clearing past the end does not change the size of the set. * @param startIndex lower index @param endIndex one-past the last bit to clear 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
long	TokenNamelong	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
long	TokenNamelong	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
<=	TokenNameLESS_EQUAL	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
startWord	TokenNameIdentifier	 start Word
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
startIndex	TokenNameIdentifier	 start Index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startWord	TokenNameIdentifier	 start Word
>=	TokenNameGREATER_EQUAL	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// since endIndex is one past the end, this is index of the last 	TokenNameCOMMENT_LINE	since endIndex is one past the end, this is index of the last 
// word to be changed. 	TokenNameCOMMENT_LINE	word to be changed. 
int	TokenNameint	
endWord	TokenNameIdentifier	 end Word
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
startmask	TokenNameIdentifier	 startmask
=	TokenNameEQUAL	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
long	TokenNamelong	
endmask	TokenNameIdentifier	 endmask
=	TokenNameEQUAL	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
-	TokenNameMINUS	
endIndex	TokenNameIdentifier	 end Index
;	TokenNameSEMICOLON	
// 64-(endIndex&0x3f) is the same as -endIndex due to wrap 	TokenNameCOMMENT_LINE	64-(endIndex&0x3f) is the same as -endIndex due to wrap 
// invert masks since we are clearing 	TokenNameCOMMENT_LINE	invert masks since we are clearing 
startmask	TokenNameIdentifier	 startmask
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
startmask	TokenNameIdentifier	 startmask
;	TokenNameSEMICOLON	
endmask	TokenNameIdentifier	 endmask
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
endmask	TokenNameIdentifier	 endmask
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startWord	TokenNameIdentifier	 start Word
==	TokenNameEQUAL_EQUAL	
endWord	TokenNameIdentifier	 end Word
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
(	TokenNameLPAREN	
startmask	TokenNameIdentifier	 startmask
|	TokenNameOR	
endmask	TokenNameIdentifier	 endmask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
startmask	TokenNameIdentifier	 startmask
;	TokenNameSEMICOLON	
int	TokenNameint	
middle	TokenNameIdentifier	 middle
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
endWord	TokenNameIdentifier	 end Word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startWord	TokenNameIdentifier	 start Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
==	TokenNameEQUAL_EQUAL	
middle	TokenNameIdentifier	 middle
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
startWord	TokenNameIdentifier	 start Word
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
,	TokenNameCOMMA	
middle	TokenNameIdentifier	 middle
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
startWord	TokenNameIdentifier	 start Word
<	TokenNameLESS	
middle	TokenNameIdentifier	 middle
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endWord	TokenNameIdentifier	 end Word
<	TokenNameLESS	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
endWord	TokenNameIdentifier	 end Word
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
endWord	TokenNameIdentifier	 end Word
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
endmask	TokenNameIdentifier	 endmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** @return the number of set bits */	TokenNameCOMMENT_JAVADOC	 @return the number of set bits 
public	TokenNamepublic	
long	TokenNamelong	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
bitCount	TokenNameIdentifier	 bit Count
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
getPageCount	TokenNameIdentifier	 get Page Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
bitCount	TokenNameIdentifier	 bit Count
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_array	TokenNameIdentifier	 pop array
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bitCount	TokenNameIdentifier	 bit Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** this = this AND other */	TokenNameCOMMENT_JAVADOC	 this = this AND other 
public	TokenNamepublic	
void	TokenNamevoid	
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newLen	TokenNameIdentifier	 new Len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
thisArr	TokenNameIdentifier	 this Arr
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherArr	TokenNameIdentifier	 other Arr
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
int	TokenNameint	
thisPageSize	TokenNameIdentifier	 this Page Size
=	TokenNameEQUAL	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
;	TokenNameSEMICOLON	
int	TokenNameint	
otherPageSize	TokenNameIdentifier	 other Page Size
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
;	TokenNameSEMICOLON	
// testing against zero can be more efficient 	TokenNameCOMMENT_LINE	testing against zero can be more efficient 
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
newLen	TokenNameIdentifier	 new Len
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisArr	TokenNameIdentifier	 this Arr
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
/	TokenNameDIVIDE	
thisPageSize	TokenNameIdentifier	 this Page Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
%	TokenNameREMAINDER	
thisPageSize	TokenNameIdentifier	 this Page Size
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
otherArr	TokenNameIdentifier	 other Arr
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
/	TokenNameDIVIDE	
otherPageSize	TokenNameIdentifier	 other Page Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
%	TokenNameREMAINDER	
otherPageSize	TokenNameIdentifier	 other Page Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
>	TokenNameGREATER	
newLen	TokenNameIdentifier	 new Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fill zeros from the new shorter length to the old length 	TokenNameCOMMENT_LINE	fill zeros from the new shorter length to the old length 
for	TokenNamefor	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
wlen	TokenNameIdentifier	 wlen
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
newLen	TokenNameIdentifier	 new Len
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
thisArr	TokenNameIdentifier	 this Arr
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
/	TokenNameDIVIDE	
thisPageSize	TokenNameIdentifier	 this Page Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
%	TokenNameREMAINDER	
thisPageSize	TokenNameIdentifier	 this Page Size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
=	TokenNameEQUAL	
newLen	TokenNameIdentifier	 new Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// some BitSet compatability methods 	TokenNameCOMMENT_LINE	some BitSet compatability methods 
//** see {@link intersect} */ 	TokenNameCOMMENT_LINE	** see {@link intersect} */ 
public	TokenNamepublic	
void	TokenNamevoid	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Lowers numWords, the number of words in use, * by checking for trailing zero words. */	TokenNameCOMMENT_JAVADOC	 Lowers numWords, the number of words in use, by checking for trailing zero words. 
public	TokenNamepublic	
void	TokenNamevoid	
trimTrailingZeros	TokenNameIdentifier	 trim Trailing Zeros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
wlen	TokenNameIdentifier	 wlen
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
wlen	TokenNameIdentifier	 wlen
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns the number of 64 bit words it would take to hold numBits */	TokenNameCOMMENT_JAVADOC	 returns the number of 64 bit words it would take to hold numBits 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
bits2words	TokenNameIdentifier	 bits2words
(	TokenNameLPAREN	
long	TokenNamelong	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns true if both sets have the same bits set */	TokenNameCOMMENT_JAVADOC	 returns true if both sets have the same bits set 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
// make a the larger set. 	TokenNameCOMMENT_LINE	make a the larger set. 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
aPageSize	TokenNameIdentifier	 a Page Size
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
;	TokenNameSEMICOLON	
int	TokenNameint	
bPageSize	TokenNameIdentifier	 b Page Size
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
;	TokenNameSEMICOLON	
// check for any set bits out of the range of b 	TokenNameCOMMENT_LINE	check for any set bits out of the range of b 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
aPageSize	TokenNameIdentifier	 a Page Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
aPageSize	TokenNameIdentifier	 a Page Size
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
aPageSize	TokenNameIdentifier	 a Page Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
aPageSize	TokenNameIdentifier	 a Page Size
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
bPageSize	TokenNameIdentifier	 b Page Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
bPageSize	TokenNameIdentifier	 b Page Size
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Start with a zero hash and use a mix that results in zero if the input is zero. 	TokenNameCOMMENT_LINE	Start with a zero hash and use a mix that results in zero if the input is zero. 
// This effectively truncates trailing zeros without an explicit check. 	TokenNameCOMMENT_LINE	This effectively truncates trailing zeros without an explicit check. 
long	TokenNamelong	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
wlen	TokenNameIdentifier	 wlen
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
PAGE_SIZE	TokenNameIdentifier	 PAGE  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// rotate left 	TokenNameCOMMENT_LINE	rotate left 
}	TokenNameRBRACE	
// fold leftmost bits into right and add a constant to prevent 	TokenNameCOMMENT_LINE	fold leftmost bits into right and add a constant to prevent 
// empty sets from returning 0, which is too common. 	TokenNameCOMMENT_LINE	empty sets from returning 0, which is too common. 
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
>>	TokenNameRIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x98761234	TokenNameIntegerLiteral	
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
// noop, let GC do the cleanup. 	TokenNameCOMMENT_LINE	noop, let GC do the cleanup. 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
bitLength	TokenNameIdentifier	 bit Length
=	TokenNameEQUAL	
getNumWords	TokenNameIdentifier	 get Num Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pageSize	TokenNameIdentifier	 page Size
=	TokenNameEQUAL	
getPageSize	TokenNameIdentifier	 get Page Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pageCount	TokenNameIdentifier	 page Count
=	TokenNameEQUAL	
getPageCount	TokenNameIdentifier	 get Page Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
bitLength	TokenNameIdentifier	 bit Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
<	TokenNameLESS	
pageCount	TokenNameIdentifier	 page Count
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
getPage	TokenNameIdentifier	 get Page
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
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
pageSize	TokenNameIdentifier	 page Size
&&	TokenNameAND_AND	
bitLength	TokenNameIdentifier	 bit Length
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
TypeSizes	TokenNameIdentifier	 Type Sizes
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bitLength	TokenNameIdentifier	 bit Length
=	TokenNameEQUAL	
getNumWords	TokenNameIdentifier	 get Num Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pageSize	TokenNameIdentifier	 page Size
=	TokenNameEQUAL	
getPageSize	TokenNameIdentifier	 get Page Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pageCount	TokenNameIdentifier	 page Count
=	TokenNameEQUAL	
getPageCount	TokenNameIdentifier	 get Page Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
bitLength	TokenNameIdentifier	 bit Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// length 	TokenNameCOMMENT_LINE	length 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
<	TokenNameLESS	
pageCount	TokenNameIdentifier	 page Count
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
getPage	TokenNameIdentifier	 get Page
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
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
pageSize	TokenNameIdentifier	 page Size
&&	TokenNameAND_AND	
bitLength	TokenNameIdentifier	 bit Length
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// bucket 	TokenNameCOMMENT_LINE	bucket 
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
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
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
bitLength	TokenNameIdentifier	 bit Length
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
bs	TokenNameIdentifier	 bs
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
bitLength	TokenNameIdentifier	 bit Length
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pageSize	TokenNameIdentifier	 page Size
=	TokenNameEQUAL	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
getPageSize	TokenNameIdentifier	 get Page Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pageCount	TokenNameIdentifier	 page Count
=	TokenNameEQUAL	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
getPageCount	TokenNameIdentifier	 get Page Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
<	TokenNameLESS	
pageCount	TokenNameIdentifier	 page Count
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
getPage	TokenNameIdentifier	 get Page
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
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
pageSize	TokenNameIdentifier	 page Size
&&	TokenNameAND_AND	
bitLength	TokenNameIdentifier	 bit Length
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bs	TokenNameIdentifier	 bs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
