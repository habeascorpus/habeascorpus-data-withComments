/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSet	TokenNameIdentifier	 Doc Id Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
;	TokenNameSEMICOLON	
/** An "open" BitSet implementation that allows direct access to the array of words * storing the bits. * <p/> * Unlike java.util.bitset, the fact that bits are packed into an array of longs * is part of the interface. This allows efficient implementation of other algorithms * by someone other than the author. It also allows one to efficiently implement * alternate serialization or interchange formats. * <p/> * <code>OpenBitSet</code> is faster than <code>java.util.BitSet</code> in most operations * and *much* faster at calculating cardinality of sets and results of set operations. * It can also handle sets of larger cardinality (up to 64 * 2**32-1) * <p/> * The goals of <code>OpenBitSet</code> are the fastest implementation possible, and * maximum code reuse. Extra safety and encapsulation * may always be built on top, but if that's built in, the cost can never be removed (and * hence people re-implement their own version in order to get better performance). * If you want a "safe", totally encapsulated (and slower and limited) BitSet * class, use <code>java.util.BitSet</code>. * <p/> * <h3>Performance Results</h3> * Test system: Pentium 4, Sun Java 1.5_06 -server -Xbatch -Xmx64M <br/>BitSet size = 1,000,000 <br/>Results are java.util.BitSet time divided by OpenBitSet time. <table border="1"> <tr> <th></th> <th>cardinality</th> <th>intersect_count</th> <th>union</th> <th>nextSetBit</th> <th>get</th> <th>iterator</th> </tr> <tr> <th>50% full</th> <td>3.36</td> <td>3.96</td> <td>1.44</td> <td>1.46</td> <td>1.99</td> <td>1.58</td> </tr> <tr> <th>1% full</th> <td>3.31</td> <td>3.90</td> <td>&nbsp;</td> <td>1.04</td> <td>&nbsp;</td> <td>0.99</td> </tr> </table> <br/> Test system: AMD Opteron, 64 bit linux, Sun Java 1.5_06 -server -Xbatch -Xmx64M <br/>BitSet size = 1,000,000 <br/>Results are java.util.BitSet time divided by OpenBitSet time. <table border="1"> <tr> <th></th> <th>cardinality</th> <th>intersect_count</th> <th>union</th> <th>nextSetBit</th> <th>get</th> <th>iterator</th> </tr> <tr> <th>50% full</th> <td>2.50</td> <td>3.50</td> <td>1.00</td> <td>1.03</td> <td>1.12</td> <td>1.25</td> </tr> <tr> <th>1% full</th> <td>2.51</td> <td>3.49</td> <td>&nbsp;</td> <td>1.00</td> <td>&nbsp;</td> <td>1.02</td> </tr> </table> */	TokenNameCOMMENT_JAVADOC	 An "open" BitSet implementation that allows direct access to the array of words storing the bits. <p/> Unlike java.util.bitset, the fact that bits are packed into an array of longs is part of the interface. This allows efficient implementation of other algorithms by someone other than the author. It also allows one to efficiently implement alternate serialization or interchange formats. <p/> <code>OpenBitSet</code> is faster than <code>java.util.BitSet</code> in most operations and *much* faster at calculating cardinality of sets and results of set operations. It can also handle sets of larger cardinality (up to 64 2**32-1) <p/> The goals of <code>OpenBitSet</code> are the fastest implementation possible, and maximum code reuse. Extra safety and encapsulation may always be built on top, but if that's built in, the cost can never be removed (and hence people re-implement their own version in order to get better performance). If you want a "safe", totally encapsulated (and slower and limited) BitSet class, use <code>java.util.BitSet</code>. <p/> <h3>Performance Results</h3> Test system: Pentium 4, Sun Java 1.5_06 -server -Xbatch -Xmx64M <br/>BitSet size = 1,000,000 <br/>Results are java.util.BitSet time divided by OpenBitSet time. <table border="1"> <tr> <th></th> <th>cardinality</th> <th>intersect_count</th> <th>union</th> <th>nextSetBit</th> <th>get</th> <th>iterator</th> </tr> <tr> <th>50% full</th> <td>3.36</td> <td>3.96</td> <td>1.44</td> <td>1.46</td> <td>1.99</td> <td>1.58</td> </tr> <tr> <th>1% full</th> <td>3.31</td> <td>3.90</td> <td>&nbsp;</td> <td>1.04</td> <td>&nbsp;</td> <td>0.99</td> </tr> </table> <br/> Test system: AMD Opteron, 64 bit linux, Sun Java 1.5_06 -server -Xbatch -Xmx64M <br/>BitSet size = 1,000,000 <br/>Results are java.util.BitSet time divided by OpenBitSet time. <table border="1"> <tr> <th></th> <th>cardinality</th> <th>intersect_count</th> <th>union</th> <th>nextSetBit</th> <th>get</th> <th>iterator</th> </tr> <tr> <th>50% full</th> <td>2.50</td> <td>3.50</td> <td>1.00</td> <td>1.03</td> <td>1.12</td> <td>1.25</td> </tr> <tr> <th>1% full</th> <td>2.51</td> <td>3.49</td> <td>&nbsp;</td> <td>1.00</td> <td>&nbsp;</td> <td>1.02</td> </tr> </table> 
public	TokenNamepublic	
class	TokenNameclass	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
extends	TokenNameextends	
DocIdSet	TokenNameIdentifier	 Doc Id Set
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Bits	TokenNameIdentifier	 Bits
{	TokenNameLBRACE	
protected	TokenNameprotected	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
wlen	TokenNameIdentifier	 wlen
;	TokenNameSEMICOLON	
// number of words (elements) used in the array 	TokenNameCOMMENT_LINE	number of words (elements) used in the array 
// Used only for assert: 	TokenNameCOMMENT_LINE	Used only for assert: 
private	TokenNameprivate	
long	TokenNamelong	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
/** Constructs an OpenBitSet large enough to hold numBits. * * @param numBits */	TokenNameCOMMENT_JAVADOC	 Constructs an OpenBitSet large enough to hold numBits. * @param numBits 
public	TokenNamepublic	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
long	TokenNamelong	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
bits2words	TokenNameIdentifier	 bits2words
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wlen	TokenNameIdentifier	 wlen
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
/** Constructs an OpenBitSet from an existing long[]. * <br/> * The first 64 bits are in long[0], * with bit index 0 at the least significant bit, and bit index 63 at the most significant. * Given a bit index, * the word containing it is long[index/64], and it is at bit number index%64 within that word. * <p> * numWords are the number of elements in the array that contain * set bits (non-zero longs). * numWords should be &lt= bits.length, and * any existing words in the array at position &gt= numWords should be zero. * */	TokenNameCOMMENT_JAVADOC	 Constructs an OpenBitSet from an existing long[]. <br/> The first 64 bits are in long[0], with bit index 0 at the least significant bit, and bit index 63 at the most significant. Given a bit index, the word containing it is long[index/64], and it is at bit number index%64 within that word. <p> numWords are the number of elements in the array that contain set bits (non-zero longs). numWords should be &lt= bits.length, and any existing words in the array at position &gt= numWords should be zero. 
public	TokenNamepublic	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
int	TokenNameint	
numWords	TokenNameIdentifier	 num Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
=	TokenNameEQUAL	
numWords	TokenNameIdentifier	 num Words
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
wlen	TokenNameIdentifier	 wlen
*	TokenNameMULTIPLY	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This DocIdSet implementation is cacheable. */	TokenNameCOMMENT_JAVADOC	 This DocIdSet implementation is cacheable. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
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
/** Expert: returns the long[] storing the bits */	TokenNameCOMMENT_JAVADOC	 Expert: returns the long[] storing the bits 
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBits	TokenNameIdentifier	 get Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: sets a new long[] to use as the bit storage */	TokenNameCOMMENT_JAVADOC	 Expert: sets a new long[] to use as the bit storage 
public	TokenNamepublic	
void	TokenNamevoid	
setBits	TokenNameIdentifier	 set Bits
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
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
/** Expert: sets the number of longs in the array that are in use */	TokenNameCOMMENT_JAVADOC	 Expert: sets the number of longs in the array that are in use 
public	TokenNamepublic	
void	TokenNamevoid	
setNumWords	TokenNameIdentifier	 set Num Words
(	TokenNameLPAREN	
int	TokenNameint	
nWords	TokenNameIdentifier	 n Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
=	TokenNameEQUAL	
nWords	TokenNameIdentifier	 n Words
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true or false for the specified bit index. */	TokenNameCOMMENT_JAVADOC	 Returns true or false for the specified bit index. 
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
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
bitmask	TokenNameIdentifier	 bitmask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true or false for the specified bit index. * The index should be less than the OpenBitSet size */	TokenNameCOMMENT_JAVADOC	 Returns true or false for the specified bit index. The index should be less than the OpenBitSet size 
public	TokenNamepublic	
boolean	TokenNameboolean	
fastGet	TokenNameIdentifier	 fast Get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
bitmask	TokenNameIdentifier	 bitmask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true or false for the specified bit index */	TokenNameCOMMENT_JAVADOC	 Returns true or false for the specified bit index 
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
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
// mod 64 	TokenNameCOMMENT_LINE	mod 64 
long	TokenNamelong	
bitmask	TokenNameIdentifier	 bitmask
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
bitmask	TokenNameIdentifier	 bitmask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true or false for the specified bit index. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 Returns true or false for the specified bit index. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
boolean	TokenNameboolean	
fastGet	TokenNameIdentifier	 fast Get
(	TokenNameLPAREN	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
bitmask	TokenNameIdentifier	 bitmask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* // alternate implementation of get() public boolean get1(int index) { int i = index >> 6; // div 64 int bit = index & 0x3f; // mod 64 return ((bits[i]>>>bit) & 0x01) != 0; // this does a long shift and a bittest (on x86) vs // a long shift, and a long AND, (the test for zero is prob a no-op) // testing on a P4 indicates this is slower than (bits[i] & bitmask) != 0; } */	TokenNameCOMMENT_BLOCK	 // alternate implementation of get() public boolean get1(int index) { int i = index >> 6; // div 64 int bit = index & 0x3f; // mod 64 return ((bits[i]>>>bit) & 0x01) != 0; // this does a long shift and a bittest (on x86) vs // a long shift, and a long AND, (the test for zero is prob a no-op) // testing on a P4 indicates this is slower than (bits[i] & bitmask) != 0; } 
/** returns 1 if the bit is set, 0 if not. * The index should be less than the OpenBitSet size */	TokenNameCOMMENT_JAVADOC	 returns 1 if the bit is set, 0 if not. The index should be less than the OpenBitSet size 
public	TokenNamepublic	
int	TokenNameint	
getBit	TokenNameIdentifier	 get Bit
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
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
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
bit	TokenNameIdentifier	 bit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public boolean get2(int index) { int word = index >> 6; // div 64 int bit = index & 0x0000003f; // mod 64 return (bits[word] << bit) < 0; // hmmm, this would work if bit order were reversed // we could right shift and check for parity bit, if it was available to us. } */	TokenNameCOMMENT_BLOCK	 public boolean get2(int index) { int word = index >> 6; // div 64 int bit = index & 0x0000003f; // mod 64 return (bits[word] << bit) < 0; // hmmm, this would work if bit order were reversed // we could right shift and check for parity bit, if it was available to us. } 
/** sets a bit, expanding the set size if necessary */	TokenNameCOMMENT_JAVADOC	 sets a bit, expanding the set size if necessary 
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
expandingWordNum	TokenNameIdentifier	 expanding Word Num
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
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
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the bit at the specified index. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 Sets the bit at the specified index. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
void	TokenNamevoid	
fastSet	TokenNameIdentifier	 fast Set
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the bit at the specified index. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 Sets the bit at the specified index. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
void	TokenNamevoid	
fastSet	TokenNameIdentifier	 fast Set
(	TokenNameLPAREN	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets a range of bits, expanding the set size if necessary * * @param startIndex lower index * @param endIndex one-past the last bit to set */	TokenNameCOMMENT_JAVADOC	 Sets a range of bits, expanding the set size if necessary * @param startIndex lower index @param endIndex one-past the last bit to set 
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
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
// since endIndex is one past the end, this is index of the last 	TokenNameCOMMENT_LINE	since endIndex is one past the end, this is index of the last 
// word to be changed. 	TokenNameCOMMENT_LINE	word to be changed. 
int	TokenNameint	
endWord	TokenNameIdentifier	 end Word
=	TokenNameEQUAL	
expandingWordNum	TokenNameIdentifier	 expanding Word Num
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
startmask	TokenNameIdentifier	 startmask
&	TokenNameAND	
endmask	TokenNameIdentifier	 endmask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
startmask	TokenNameIdentifier	 startmask
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
startWord	TokenNameIdentifier	 start Word
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
endWord	TokenNameIdentifier	 end Word
,	TokenNameCOMMA	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
endWord	TokenNameIdentifier	 end Word
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
endmask	TokenNameIdentifier	 endmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
expandingWordNum	TokenNameIdentifier	 expanding Word Num
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
if	TokenNameif	
(	TokenNameLPAREN	
wordNum	TokenNameIdentifier	 word Num
>=	TokenNameGREATER_EQUAL	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wlen	TokenNameIdentifier	 wlen
=	TokenNameEQUAL	
wordNum	TokenNameIdentifier	 word Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wordNum	TokenNameIdentifier	 word Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** clears a bit. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 clears a bit. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
void	TokenNamevoid	
fastClear	TokenNameIdentifier	 fast Clear
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
/** clears a bit. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 clears a bit. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
void	TokenNamevoid	
fastClear	TokenNameIdentifier	 fast Clear
(	TokenNameLPAREN	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** clears a bit, allowing access beyond the current set size without changing the size.*/	TokenNameCOMMENT_JAVADOC	 clears a bit, allowing access beyond the current set size without changing the size.
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
if	TokenNameif	
(	TokenNameLPAREN	
wordNum	TokenNameIdentifier	 word Num
>=	TokenNameGREATER_EQUAL	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
return	TokenNamereturn	
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
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Clears a range of bits. Clearing past the end does not change the size of the set. * * @param startIndex lower index * @param endIndex one-past the last bit to clear */	TokenNameCOMMENT_JAVADOC	 Clears a range of bits. Clearing past the end does not change the size of the set. * @param startIndex lower index @param endIndex one-past the last bit to clear 
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
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
startWord	TokenNameIdentifier	 start Word
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
middle	TokenNameIdentifier	 middle
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
startWord	TokenNameIdentifier	 start Word
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
middle	TokenNameIdentifier	 middle
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
endmask	TokenNameIdentifier	 endmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sets a bit and returns the previous value. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 Sets a bit and returns the previous value. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAndSet	TokenNameIdentifier	 get And Set
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
]	TokenNameRBRACKET	
&	TokenNameAND	
bitmask	TokenNameIdentifier	 bitmask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets a bit and returns the previous value. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 Sets a bit and returns the previous value. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAndSet	TokenNameIdentifier	 get And Set
(	TokenNameLPAREN	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
]	TokenNameRBRACKET	
&	TokenNameAND	
bitmask	TokenNameIdentifier	 bitmask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** flips a bit. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 flips a bit. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
void	TokenNamevoid	
fastFlip	TokenNameIdentifier	 fast Flip
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
]	TokenNameRBRACKET	
^=	TokenNameXOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** flips a bit. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 flips a bit. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
void	TokenNamevoid	
fastFlip	TokenNameIdentifier	 fast Flip
(	TokenNameLPAREN	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
]	TokenNameRBRACKET	
^=	TokenNameXOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** flips a bit, expanding the set size if necessary */	TokenNameCOMMENT_JAVADOC	 flips a bit, expanding the set size if necessary 
public	TokenNamepublic	
void	TokenNamevoid	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
wordNum	TokenNameIdentifier	 word Num
=	TokenNameEQUAL	
expandingWordNum	TokenNameIdentifier	 expanding Word Num
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
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
]	TokenNameRBRACKET	
^=	TokenNameXOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** flips a bit and returns the resulting bit value. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 flips a bit and returns the resulting bit value. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
boolean	TokenNameboolean	
flipAndGet	TokenNameIdentifier	 flip And Get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
]	TokenNameRBRACKET	
^=	TokenNameXOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
]	TokenNameRBRACKET	
&	TokenNameAND	
bitmask	TokenNameIdentifier	 bitmask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** flips a bit and returns the resulting bit value. * The index should be less than the OpenBitSet size. */	TokenNameCOMMENT_JAVADOC	 flips a bit and returns the resulting bit value. The index should be less than the OpenBitSet size. 
public	TokenNamepublic	
boolean	TokenNameboolean	
flipAndGet	TokenNameIdentifier	 flip And Get
(	TokenNameLPAREN	
long	TokenNamelong	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
]	TokenNameRBRACKET	
^=	TokenNameXOR_EQUAL	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
wordNum	TokenNameIdentifier	 word Num
]	TokenNameRBRACKET	
&	TokenNameAND	
bitmask	TokenNameIdentifier	 bitmask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Flips a range of bits, expanding the set size if necessary * * @param startIndex lower index * @param endIndex one-past the last bit to flip */	TokenNameCOMMENT_JAVADOC	 Flips a range of bits, expanding the set size if necessary * @param startIndex lower index @param endIndex one-past the last bit to flip 
public	TokenNamepublic	
void	TokenNamevoid	
flip	TokenNameIdentifier	 flip
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
// since endIndex is one past the end, this is index of the last 	TokenNameCOMMENT_LINE	since endIndex is one past the end, this is index of the last 
// word to be changed. 	TokenNameCOMMENT_LINE	word to be changed. 
int	TokenNameint	
endWord	TokenNameIdentifier	 end Word
=	TokenNameEQUAL	
expandingWordNum	TokenNameIdentifier	 expanding Word Num
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*** Grrr, java shifting wraps around so -1L>>>64 == -1 * for that reason, make sure not to use endmask if the bits to flip will * be zero in the last word (redefine endWord to be the last changed...) long startmask = -1L << (startIndex & 0x3f); // example: 11111...111000 long endmask = -1L >>> (64-(endIndex & 0x3f)); // example: 00111...111111 ***/	TokenNameCOMMENT_JAVADOC	* Grrr, java shifting wraps around so -1L>>>64 == -1 for that reason, make sure not to use endmask if the bits to flip will be zero in the last word (redefine endWord to be the last changed...) long startmask = -1L << (startIndex & 0x3f); // example: 11111...111000 long endmask = -1L >>> (64-(endIndex & 0x3f)); // example: 00111...111111 **
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
]	TokenNameRBRACKET	
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
startmask	TokenNameIdentifier	 startmask
&	TokenNameAND	
endmask	TokenNameIdentifier	 endmask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
startWord	TokenNameIdentifier	 start Word
]	TokenNameRBRACKET	
^=	TokenNameXOR_EQUAL	
startmask	TokenNameIdentifier	 startmask
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startWord	TokenNameIdentifier	 start Word
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
endWord	TokenNameIdentifier	 end Word
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
endWord	TokenNameIdentifier	 end Word
]	TokenNameRBRACKET	
^=	TokenNameXOR_EQUAL	
endmask	TokenNameIdentifier	 endmask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public static int pop(long v0, long v1, long v2, long v3) { // derived from pop_array by setting last four elems to 0. // exchanges one pop() call for 10 elementary operations // saving about 7 instructions... is there a better way? long twosA=v0 & v1; long ones=v0^v1; long u2=ones^v2; long twosB =(ones&v2)|(u2&v3); ones=u2^v3; long fours=(twosA&twosB); long twos=twosA^twosB; return (pop(fours)<<2) + (pop(twos)<<1) + pop(ones); } */	TokenNameCOMMENT_BLOCK	 public static int pop(long v0, long v1, long v2, long v3) { // derived from pop_array by setting last four elems to 0. // exchanges one pop() call for 10 elementary operations // saving about 7 instructions... is there a better way? long twosA=v0 & v1; long ones=v0^v1; long u2=ones^v2; long twosB =(ones&v2)|(u2&v3); ones=u2^v3; long fours=(twosA&twosB); long twos=twosA^twosB; return (pop(fours)<<2) + (pop(twos)<<1) + pop(ones); } 
/** @return the number of set bits */	TokenNameCOMMENT_JAVADOC	 @return the number of set bits 
public	TokenNamepublic	
long	TokenNamelong	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_array	TokenNameIdentifier	 pop array
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the popcount or cardinality of the intersection of the two sets. * Neither set is modified. */	TokenNameCOMMENT_JAVADOC	 Returns the popcount or cardinality of the intersection of the two sets. Neither set is modified. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
intersectionCount	TokenNameIdentifier	 intersection Count
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_intersect	TokenNameIdentifier	 pop intersect
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the popcount or cardinality of the union of the two sets. * Neither set is modified. */	TokenNameCOMMENT_JAVADOC	 Returns the popcount or cardinality of the union of the two sets. Neither set is modified. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
unionCount	TokenNameIdentifier	 union Count
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
tot	TokenNameIdentifier	 tot
=	TokenNameEQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_union	TokenNameIdentifier	 pop union
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
<	TokenNameLESS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_array	TokenNameIdentifier	 pop array
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
-	TokenNameMINUS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_array	TokenNameIdentifier	 pop array
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the popcount or cardinality of "a and not b" * or "intersection(a, not(b))". * Neither set is modified. */	TokenNameCOMMENT_JAVADOC	 Returns the popcount or cardinality of "a and not b" or "intersection(a, not(b))". Neither set is modified. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
andNotCount	TokenNameIdentifier	 and Not Count
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
tot	TokenNameIdentifier	 tot
=	TokenNameEQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_andnot	TokenNameIdentifier	 pop andnot
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_array	TokenNameIdentifier	 pop array
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the popcount or cardinality of the exclusive-or of the two sets. * Neither set is modified. */	TokenNameCOMMENT_JAVADOC	 Returns the popcount or cardinality of the exclusive-or of the two sets. Neither set is modified. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
xorCount	TokenNameIdentifier	 xor Count
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
tot	TokenNameIdentifier	 tot
=	TokenNameEQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_xor	TokenNameIdentifier	 pop xor
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
<	TokenNameLESS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_array	TokenNameIdentifier	 pop array
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
-	TokenNameMINUS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_array	TokenNameIdentifier	 pop array
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the index of the first set bit starting at the index specified. * -1 is returned if there are no more set bits. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the first set bit starting at the index specified. -1 is returned if there are no more set bits. 
public	TokenNamepublic	
int	TokenNameint	
nextSetBit	TokenNameIdentifier	 next Set Bit
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
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
subIndex	TokenNameIdentifier	 sub Index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// index within the word 	TokenNameCOMMENT_LINE	index within the word 
long	TokenNamelong	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>>	TokenNameRIGHT_SHIFT	
subIndex	TokenNameIdentifier	 sub Index
;	TokenNameSEMICOLON	
// skip all the bits to the right of index 	TokenNameCOMMENT_LINE	skip all the bits to the right of index 
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
subIndex	TokenNameIdentifier	 sub Index
+	TokenNamePLUS	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz	TokenNameIdentifier	 ntz
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz	TokenNameIdentifier	 ntz
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the index of the first set bit starting at the index specified. * -1 is returned if there are no more set bits. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the first set bit starting at the index specified. -1 is returned if there are no more set bits. 
public	TokenNamepublic	
long	TokenNamelong	
nextSetBit	TokenNameIdentifier	 next Set Bit
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
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
subIndex	TokenNameIdentifier	 sub Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// index within the word 	TokenNameCOMMENT_LINE	index within the word 
long	TokenNamelong	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
subIndex	TokenNameIdentifier	 sub Index
;	TokenNameSEMICOLON	
// skip all the bits to the right of index 	TokenNameCOMMENT_LINE	skip all the bits to the right of index 
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
subIndex	TokenNameIdentifier	 sub Index
+	TokenNamePLUS	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz	TokenNameIdentifier	 ntz
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz	TokenNameIdentifier	 ntz
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the index of the first set bit starting downwards at * the index specified. * -1 is returned if there are no more set bits. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the first set bit starting downwards at the index specified. -1 is returned if there are no more set bits. 
public	TokenNamepublic	
int	TokenNameint	
prevSetBit	TokenNameIdentifier	 prev Set Bit
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
final	TokenNamefinal	
int	TokenNameint	
subIndex	TokenNameIdentifier	 sub Index
;	TokenNameSEMICOLON	
long	TokenNamelong	
word	TokenNameIdentifier	 word
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
wlen	TokenNameIdentifier	 wlen
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
subIndex	TokenNameIdentifier	 sub Index
=	TokenNameEQUAL	
63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// last possible bit 	TokenNameCOMMENT_LINE	last possible bit 
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
subIndex	TokenNameIdentifier	 sub Index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// index within the word 	TokenNameCOMMENT_LINE	index within the word 
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
subIndex	TokenNameIdentifier	 sub Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skip all the bits to the left of index 	TokenNameCOMMENT_LINE	skip all the bits to the left of index 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
subIndex	TokenNameIdentifier	 sub Index
-	TokenNameMINUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// See LUCENE-3197 	TokenNameCOMMENT_LINE	See LUCENE-3197 
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the index of the first set bit starting downwards at * the index specified. * -1 is returned if there are no more set bits. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the first set bit starting downwards at the index specified. -1 is returned if there are no more set bits. 
public	TokenNamepublic	
long	TokenNamelong	
prevSetBit	TokenNameIdentifier	 prev Set Bit
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
final	TokenNamefinal	
int	TokenNameint	
subIndex	TokenNameIdentifier	 sub Index
;	TokenNameSEMICOLON	
long	TokenNamelong	
word	TokenNameIdentifier	 word
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
wlen	TokenNameIdentifier	 wlen
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
subIndex	TokenNameIdentifier	 sub Index
=	TokenNameEQUAL	
63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// last possible bit 	TokenNameCOMMENT_LINE	last possible bit 
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
subIndex	TokenNameIdentifier	 sub Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// index within the word 	TokenNameCOMMENT_LINE	index within the word 
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
subIndex	TokenNameIdentifier	 sub Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skip all the bits to the left of index 	TokenNameCOMMENT_LINE	skip all the bits to the left of index 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
subIndex	TokenNameIdentifier	 sub Index
-	TokenNameMINUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// See LUCENE-3197 	TokenNameCOMMENT_LINE	See LUCENE-3197 
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
obs	TokenNameIdentifier	 obs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hopefully an array clone is as fast(er) than arraycopy 	TokenNameCOMMENT_LINE	hopefully an array clone is as fast(er) than arraycopy 
return	TokenNamereturn	
obs	TokenNameIdentifier	 obs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
thisArr	TokenNameIdentifier	 this Arr
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherArr	TokenNameIdentifier	 other Arr
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
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
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
otherArr	TokenNameIdentifier	 other Arr
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
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
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
newLen	TokenNameIdentifier	 new Len
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
=	TokenNameEQUAL	
newLen	TokenNameIdentifier	 new Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** this = this OR other */	TokenNameCOMMENT_JAVADOC	 this = this OR other 
public	TokenNamepublic	
void	TokenNamevoid	
union	TokenNameIdentifier	 union
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
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ensureCapacityWords	TokenNameIdentifier	 ensure Capacity Words
(	TokenNameLPAREN	
newLen	TokenNameIdentifier	 new Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
numBits	TokenNameIdentifier	 num Bits
,	TokenNameCOMMA	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
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
otherArr	TokenNameIdentifier	 other Arr
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
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
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
otherArr	TokenNameIdentifier	 other Arr
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
<	TokenNameLESS	
newLen	TokenNameIdentifier	 new Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
otherArr	TokenNameIdentifier	 other Arr
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
thisArr	TokenNameIdentifier	 this Arr
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
newLen	TokenNameIdentifier	 new Len
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
=	TokenNameEQUAL	
newLen	TokenNameIdentifier	 new Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Remove all elements set in other. this = this AND_NOT other */	TokenNameCOMMENT_JAVADOC	 Remove all elements set in other. this = this AND_NOT other 
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
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
thisArr	TokenNameIdentifier	 this Arr
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherArr	TokenNameIdentifier	 other Arr
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisArr	TokenNameIdentifier	 this Arr
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
otherArr	TokenNameIdentifier	 other Arr
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** this = this XOR other */	TokenNameCOMMENT_JAVADOC	 this = this XOR other 
public	TokenNamepublic	
void	TokenNamevoid	
xor	TokenNameIdentifier	 xor
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
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ensureCapacityWords	TokenNameIdentifier	 ensure Capacity Words
(	TokenNameLPAREN	
newLen	TokenNameIdentifier	 new Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
numBits	TokenNameIdentifier	 num Bits
,	TokenNameCOMMA	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
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
otherArr	TokenNameIdentifier	 other Arr
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
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
]	TokenNameRBRACKET	
^=	TokenNameXOR_EQUAL	
otherArr	TokenNameIdentifier	 other Arr
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
<	TokenNameLESS	
newLen	TokenNameIdentifier	 new Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
otherArr	TokenNameIdentifier	 other Arr
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
thisArr	TokenNameIdentifier	 this Arr
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
,	TokenNameCOMMA	
newLen	TokenNameIdentifier	 new Len
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
wlen	TokenNameIdentifier	 wlen
)	TokenNameRPAREN	
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
//** see {@link union} */ 	TokenNameCOMMENT_LINE	** see {@link union} */ 
public	TokenNamepublic	
void	TokenNamevoid	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//** see {@link andNot} */ 	TokenNameCOMMENT_LINE	** see {@link andNot} */ 
public	TokenNamepublic	
void	TokenNamevoid	
andNot	TokenNameIdentifier	 and Not
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns true if the sets have any elements in common */	TokenNameCOMMENT_JAVADOC	 returns true if the sets have any elements in common 
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
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
thisArr	TokenNameIdentifier	 this Arr
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherArr	TokenNameIdentifier	 other Arr
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
thisArr	TokenNameIdentifier	 this Arr
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
&	TokenNameAND	
otherArr	TokenNameIdentifier	 other Arr
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expand the long[] with the size given as a number of words (64 bit longs). * getNumWords() is unchanged by this call. */	TokenNameCOMMENT_JAVADOC	 Expand the long[] with the size given as a number of words (64 bit longs). getNumWords() is unchanged by this call. 
public	TokenNamepublic	
void	TokenNamevoid	
ensureCapacityWords	TokenNameIdentifier	 ensure Capacity Words
(	TokenNameLPAREN	
int	TokenNameint	
numWords	TokenNameIdentifier	 num Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
numWords	TokenNameIdentifier	 num Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
numWords	TokenNameIdentifier	 num Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Ensure that the long[] is big enough to hold numBits, expanding it if necessary. * getNumWords() is unchanged by this call. */	TokenNameCOMMENT_JAVADOC	 Ensure that the long[] is big enough to hold numBits, expanding it if necessary. getNumWords() is unchanged by this call. 
public	TokenNamepublic	
void	TokenNamevoid	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
long	TokenNamelong	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureCapacityWords	TokenNameIdentifier	 ensure Capacity Words
(	TokenNameLPAREN	
bits2words	TokenNameIdentifier	 bits2words
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
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
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
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
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
}	TokenNameRBRACE	
