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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
// TODO: maybe merge with BitVector? Problem is BitVector 	TokenNameCOMMENT_LINE	TODO: maybe merge with BitVector? Problem is BitVector 
// caches its cardinality... 	TokenNameCOMMENT_LINE	caches its cardinality... 
/** BitSet of fixed length (numBits), backed by accessible * ({@link #getBits}) long[], accessed with an int index, * implementing Bits and DocIdSet. Unlike {@link * OpenBitSet} this bit set does not auto-expand, cannot * handle long index, and does not have fastXX/XX variants * (just X). * * @lucene.internal **/	TokenNameCOMMENT_JAVADOC	 BitSet of fixed length (numBits), backed by accessible ({@link #getBits}) long[], accessed with an int index, implementing Bits and DocIdSet. Unlike {@link OpenBitSet} this bit set does not auto-expand, cannot handle long index, and does not have fastXX/XX variants (just X). * @lucene.internal *
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
extends	TokenNameextends	
DocIdSet	TokenNameIdentifier	 Doc Id Set
implements	TokenNameimplements	
Bits	TokenNameIdentifier	 Bits
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
/** returns the number of 64 bit words it would take to hold numBits */	TokenNameCOMMENT_JAVADOC	 returns the number of 64 bit words it would take to hold numBits 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
bits2words	TokenNameIdentifier	 bits2words
(	TokenNameLPAREN	
int	TokenNameint	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numLong	TokenNameIdentifier	 num Long
=	TokenNameEQUAL	
numBits	TokenNameIdentifier	 num Bits
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
&	TokenNameAND	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numLong	TokenNameIdentifier	 num Long
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
numLong	TokenNameIdentifier	 num Long
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
int	TokenNameint	
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
}	TokenNameRBRACE	
/** Makes full copy. */	TokenNameCOMMENT_JAVADOC	 Makes full copy. 
public	TokenNamepublic	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
numBits	TokenNameIdentifier	 num Bits
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
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
numBits	TokenNameIdentifier	 num Bits
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
/** Expert. */	TokenNameCOMMENT_JAVADOC	 Expert. 
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
/** Returns number of set bits. NOTE: this visits every * long in the backing bits array, and the result is not * internally cached! */	TokenNameCOMMENT_JAVADOC	 Returns number of set bits. NOTE: this visits every long in the backing bits array, and the result is not internally cached! 
public	TokenNamepublic	
int	TokenNameint	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
pop_array	TokenNameIdentifier	 pop array
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
get	TokenNameIdentifier	 get
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
:	TokenNameCOLON	
"index="	TokenNameStringLiteral	index=
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
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
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
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
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
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
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getAndClear	TokenNameIdentifier	 get And Clear
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
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
bitmask	TokenNameIdentifier	 bitmask
;	TokenNameSEMICOLON	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
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
final	TokenNamefinal	
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
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz	TokenNameIdentifier	 ntz
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
/** Returns the index of the last set bit before or on the index specified. * -1 is returned if there are no more set bits. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the last set bit before or on the index specified. -1 is returned if there are no more set bits. 
public	TokenNamepublic	
int	TokenNameint	
prevSetBit	TokenNameIdentifier	 prev Set Bit
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
:	TokenNameCOLON	
"index="	TokenNameStringLiteral	index=
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
" numBits="	TokenNameStringLiteral	 numBits=
+	TokenNamePLUS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
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
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// index within the word 	TokenNameCOMMENT_LINE	index within the word 
long	TokenNamelong	
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
/** Does in-place OR of the bits provided by the * iterator. */	TokenNameCOMMENT_JAVADOC	 Does in-place OR of the bits provided by the iterator. 
public	TokenNamepublic	
void	TokenNamevoid	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
instanceof	TokenNameinstanceof	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
&&	TokenNameAND_AND	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
obs	TokenNameIdentifier	 obs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
arr	TokenNameIdentifier	 arr
,	TokenNameCOMMA	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
words	TokenNameIdentifier	 words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// advance after last doc that would be accepted if standard 	TokenNameCOMMENT_LINE	advance after last doc that would be accepted if standard 
// iteration is used (to exhaust it): 	TokenNameCOMMENT_LINE	iteration is used (to exhaust it): 
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** this = this OR other */	TokenNameCOMMENT_JAVADOC	 this = this OR other 
public	TokenNamepublic	
void	TokenNamevoid	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherArr	TokenNameIdentifier	 other Arr
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
otherLen	TokenNameIdentifier	 other Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
thisArr	TokenNameIdentifier	 this Arr
=	TokenNameEQUAL	
this	TokenNamethis	
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
thisArr	TokenNameIdentifier	 this Arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
otherLen	TokenNameIdentifier	 other Len
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
}	TokenNameRBRACE	
/** Does in-place AND of the bits provided by the * iterator. */	TokenNameCOMMENT_JAVADOC	 Does in-place AND of the bits provided by the iterator. 
public	TokenNamepublic	
void	TokenNamevoid	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
instanceof	TokenNameinstanceof	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
&&	TokenNameAND_AND	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
obs	TokenNameIdentifier	 obs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
arr	TokenNameIdentifier	 arr
,	TokenNameCOMMA	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
words	TokenNameIdentifier	 words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// advance after last doc that would be accepted if standard 	TokenNameCOMMENT_LINE	advance after last doc that would be accepted if standard 
// iteration is used (to exhaust it): 	TokenNameCOMMENT_LINE	iteration is used (to exhaust it): 
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
disiDoc	TokenNameIdentifier	 disi Doc
,	TokenNameCOMMA	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
=	TokenNameEQUAL	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
disiDoc	TokenNameIdentifier	 disi Doc
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
,	TokenNameCOMMA	
disiDoc	TokenNameIdentifier	 disi Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
disiDoc	TokenNameIdentifier	 disi Doc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
disiDoc	TokenNameIdentifier	 disi Doc
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
?	TokenNameQUESTION	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
disiDoc	TokenNameIdentifier	 disi Doc
)	TokenNameRPAREN	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
,	TokenNameCOMMA	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** this = this AND other */	TokenNameCOMMENT_JAVADOC	 this = this AND other 
public	TokenNamepublic	
void	TokenNamevoid	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherArr	TokenNameIdentifier	 other Arr
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
otherLen	TokenNameIdentifier	 other Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
thisArr	TokenNameIdentifier	 this Arr
=	TokenNameEQUAL	
this	TokenNamethis	
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
thisArr	TokenNameIdentifier	 this Arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
otherLen	TokenNameIdentifier	 other Len
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
&=	TokenNameAND_EQUAL	
otherArr	TokenNameIdentifier	 other Arr
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thisArr	TokenNameIdentifier	 this Arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
otherLen	TokenNameIdentifier	 other Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
thisArr	TokenNameIdentifier	 this Arr
,	TokenNameCOMMA	
otherLen	TokenNameIdentifier	 other Len
,	TokenNameCOMMA	
thisArr	TokenNameIdentifier	 this Arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Does in-place AND NOT of the bits provided by the * iterator. */	TokenNameCOMMENT_JAVADOC	 Does in-place AND NOT of the bits provided by the iterator. 
public	TokenNamepublic	
void	TokenNamevoid	
andNot	TokenNameIdentifier	 and Not
(	TokenNameLPAREN	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
instanceof	TokenNameinstanceof	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
&&	TokenNameAND_AND	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
obs	TokenNameIdentifier	 obs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
andNot	TokenNameIdentifier	 and Not
(	TokenNameLPAREN	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
arr	TokenNameIdentifier	 arr
,	TokenNameCOMMA	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
words	TokenNameIdentifier	 words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// advance after last doc that would be accepted if standard 	TokenNameCOMMENT_LINE	advance after last doc that would be accepted if standard 
// iteration is used (to exhaust it): 	TokenNameCOMMENT_LINE	iteration is used (to exhaust it): 
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** this = this AND NOT other */	TokenNameCOMMENT_JAVADOC	 this = this AND NOT other 
public	TokenNamepublic	
void	TokenNamevoid	
andNot	TokenNameIdentifier	 and Not
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
andNot	TokenNameIdentifier	 and Not
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
andNot	TokenNameIdentifier	 and Not
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherArr	TokenNameIdentifier	 other Arr
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
otherLen	TokenNameIdentifier	 other Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
thisArr	TokenNameIdentifier	 this Arr
=	TokenNameEQUAL	
this	TokenNamethis	
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
thisArr	TokenNameIdentifier	 this Arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
otherLen	TokenNameIdentifier	 other Len
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
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
otherArr	TokenNameIdentifier	 other Arr
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// NOTE: no .isEmpty() here because that's trappy (ie, 	TokenNameCOMMENT_LINE	NOTE: no .isEmpty() here because that's trappy (ie, 
// typically isEmpty is low cost, but this one wouldn't 	TokenNameCOMMENT_LINE	typically isEmpty is low cost, but this one wouldn't 
// be) 	TokenNameCOMMENT_LINE	be) 
/** Flips a range of bits * * @param startIndex lower index * @param endIndex one-past the last bit to flip */	TokenNameCOMMENT_JAVADOC	 Flips a range of bits * @param startIndex lower index @param endIndex one-past the last bit to flip 
public	TokenNamepublic	
void	TokenNamevoid	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
startIndex	TokenNameIdentifier	 start Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
startIndex	TokenNameIdentifier	 start Index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
assert	TokenNameassert	
endIndex	TokenNameIdentifier	 end Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
endIndex	TokenNameIdentifier	 end Index
<=	TokenNameLESS_EQUAL	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
<=	TokenNameLESS_EQUAL	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
startWord	TokenNameIdentifier	 start Word
=	TokenNameEQUAL	
startIndex	TokenNameIdentifier	 start Index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
endWord	TokenNameIdentifier	 end Word
=	TokenNameEQUAL	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
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
/** Sets a range of bits * * @param startIndex lower index * @param endIndex one-past the last bit to set */	TokenNameCOMMENT_JAVADOC	 Sets a range of bits * @param startIndex lower index @param endIndex one-past the last bit to set 
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
startIndex	TokenNameIdentifier	 start Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
startIndex	TokenNameIdentifier	 start Index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
assert	TokenNameassert	
endIndex	TokenNameIdentifier	 end Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
endIndex	TokenNameIdentifier	 end Index
<=	TokenNameLESS_EQUAL	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
<=	TokenNameLESS_EQUAL	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
startWord	TokenNameIdentifier	 start Word
=	TokenNameEQUAL	
startIndex	TokenNameIdentifier	 start Index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
endWord	TokenNameIdentifier	 end Word
=	TokenNameEQUAL	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
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
/** Clears a range of bits. * * @param startIndex lower index * @param endIndex one-past the last bit to clear */	TokenNameCOMMENT_JAVADOC	 Clears a range of bits. * @param startIndex lower index @param endIndex one-past the last bit to clear 
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
assert	TokenNameassert	
startIndex	TokenNameIdentifier	 start Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
startIndex	TokenNameIdentifier	 start Index
<	TokenNameLESS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
assert	TokenNameassert	
endIndex	TokenNameIdentifier	 end Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
endIndex	TokenNameIdentifier	 end Index
<=	TokenNameLESS_EQUAL	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
<=	TokenNameLESS_EQUAL	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
startWord	TokenNameIdentifier	 start Word
=	TokenNameEQUAL	
startIndex	TokenNameIdentifier	 start Index
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
endWord	TokenNameIdentifier	 end Word
=	TokenNameEQUAL	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
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
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
endWord	TokenNameIdentifier	 end Word
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
endmask	TokenNameIdentifier	 endmask
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
return	TokenNamereturn	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
this	TokenNamethis	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
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
