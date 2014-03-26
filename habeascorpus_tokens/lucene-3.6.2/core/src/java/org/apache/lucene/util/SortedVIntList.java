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
BitSet	TokenNameIdentifier	 Bit Set
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
/** * Stores and iterate on sorted integers in compressed form in RAM. <br> * The code for compressing the differences between ascending integers was * borrowed from {@link org.apache.lucene.store.IndexInput} and * {@link org.apache.lucene.store.IndexOutput}. * <p> * <b>NOTE:</b> this class assumes the stored integers are doc Ids (hence why it * extends {@link DocIdSet}). Therefore its {@link #iterator()} assumes {@link * DocIdSetIterator#NO_MORE_DOCS} can be used as sentinel. If you intent to use * this value, then make sure it's not used during search * flow. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Stores and iterate on sorted integers in compressed form in RAM. <br> The code for compressing the differences between ascending integers was borrowed from {@link org.apache.lucene.store.IndexInput} and {@link org.apache.lucene.store.IndexOutput}. <p> <b>NOTE:</b> this class assumes the stored integers are doc Ids (hence why it extends {@link DocIdSet}). Therefore its {@link #iterator()} assumes {@link DocIdSetIterator#NO_MORE_DOCS} can be used as sentinel. If you intent to use this value, then make sure it's not used during search flow. * @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
extends	TokenNameextends	
DocIdSet	TokenNameIdentifier	 Doc Id Set
{	TokenNameLBRACE	
/** When a BitSet has fewer than 1 in BITS2VINTLIST_SIZE bits set, * a SortedVIntList representing the index numbers of the set bits * will be smaller than that BitSet. */	TokenNameCOMMENT_JAVADOC	 When a BitSet has fewer than 1 in BITS2VINTLIST_SIZE bits set, a SortedVIntList representing the index numbers of the set bits will be smaller than that BitSet. 
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
BITS2VINTLIST_SIZE	TokenNameIdentifier	 BIT S2 VINTLIST  SIZE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastBytePos	TokenNameIdentifier	 last Byte Pos
;	TokenNameSEMICOLON	
/** * Create a SortedVIntList from all elements of an array of integers. * * @param sortedInts A sorted array of non negative integers. */	TokenNameCOMMENT_JAVADOC	 Create a SortedVIntList from all elements of an array of integers. * @param sortedInts A sorted array of non negative integers. 
public	TokenNamepublic	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
(	TokenNameLPAREN	
int	TokenNameint	
...	TokenNameELLIPSIS	
sortedInts	TokenNameIdentifier	 sorted Ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
sortedInts	TokenNameIdentifier	 sorted Ints
,	TokenNameCOMMA	
sortedInts	TokenNameIdentifier	 sorted Ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a SortedVIntList from an array of integers. * @param sortedInts An array of sorted non negative integers. * @param inputSize The number of integers to be used from the array. */	TokenNameCOMMENT_JAVADOC	 Create a SortedVIntList from an array of integers. @param sortedInts An array of sorted non negative integers. @param inputSize The number of integers to be used from the array. 
public	TokenNamepublic	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortedInts	TokenNameIdentifier	 sorted Ints
,	TokenNameCOMMA	
int	TokenNameint	
inputSize	TokenNameIdentifier	 input Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedVIntListBuilder	TokenNameIdentifier	 Sorted V Int List Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
SortedVIntListBuilder	TokenNameIdentifier	 Sorted V Int List Builder
(	TokenNameLPAREN	
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
inputSize	TokenNameIdentifier	 input Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
addInt	TokenNameIdentifier	 add Int
(	TokenNameLPAREN	
sortedInts	TokenNameIdentifier	 sorted Ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
done	TokenNameIdentifier	 done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a SortedVIntList from a BitSet. * @param bits A bit set representing a set of integers. */	TokenNameCOMMENT_JAVADOC	 Create a SortedVIntList from a BitSet. @param bits A bit set representing a set of integers. 
public	TokenNamepublic	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedVIntListBuilder	TokenNameIdentifier	 Sorted V Int List Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
SortedVIntListBuilder	TokenNameIdentifier	 Sorted V Int List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextInt	TokenNameIdentifier	 next Int
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nextInt	TokenNameIdentifier	 next Int
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
addInt	TokenNameIdentifier	 add Int
(	TokenNameLPAREN	
nextInt	TokenNameIdentifier	 next Int
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextInt	TokenNameIdentifier	 next Int
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
nextInt	TokenNameIdentifier	 next Int
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
done	TokenNameIdentifier	 done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a SortedVIntList. * @param docIdSetIterator An iterator providing document numbers as a set of integers. * This DocIdSetIterator is iterated completely when this constructor * is called and it must provide the integers in non * decreasing order. */	TokenNameCOMMENT_JAVADOC	 Create a SortedVIntList. @param docIdSetIterator An iterator providing document numbers as a set of integers. This DocIdSetIterator is iterated completely when this constructor is called and it must provide the integers in non decreasing order. 
public	TokenNamepublic	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
(	TokenNameLPAREN	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
docIdSetIterator	TokenNameIdentifier	 doc Id Set Iterator
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SortedVIntListBuilder	TokenNameIdentifier	 Sorted V Int List Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
SortedVIntListBuilder	TokenNameIdentifier	 Sorted V Int List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docIdSetIterator	TokenNameIdentifier	 doc Id Set Iterator
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
addInt	TokenNameIdentifier	 add Int
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
done	TokenNameIdentifier	 done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
SortedVIntListBuilder	TokenNameIdentifier	 Sorted V Int List Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
lastInt	TokenNameIdentifier	 last Int
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
SortedVIntListBuilder	TokenNameIdentifier	 Sorted V Int List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initBytes	TokenNameIdentifier	 init Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastInt	TokenNameIdentifier	 last Int
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addInt	TokenNameIdentifier	 add Int
(	TokenNameLPAREN	
int	TokenNameint	
nextInt	TokenNameIdentifier	 next Int
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
nextInt	TokenNameIdentifier	 next Int
-	TokenNameMINUS	
lastInt	TokenNameIdentifier	 last Int
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Input not sorted or first element negative."	TokenNameStringLiteral	Input not sorted or first element negative.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lastBytePos	TokenNameIdentifier	 last Byte Pos
+	TokenNamePLUS	
MAX_BYTES_PER_INT	TokenNameIdentifier	 MAX  BYTES  PER  INT
)	TokenNameRPAREN	
>	TokenNameGREATER	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Biggest possible int does not fit. 	TokenNameCOMMENT_LINE	Biggest possible int does not fit. 
resizeBytes	TokenNameIdentifier	 resize Bytes
(	TokenNameLPAREN	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
lastBytePos	TokenNameIdentifier	 last Byte Pos
+	TokenNamePLUS	
MAX_BYTES_PER_INT	TokenNameIdentifier	 MAX  BYTES  PER  INT
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// See org.apache.lucene.store.IndexOutput.writeVInt() 	TokenNameCOMMENT_LINE	See org.apache.lucene.store.IndexOutput.writeVInt() 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
&	TokenNameAND	
~	TokenNameTWIDDLE	
VB1	TokenNameIdentifier	 V B1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The high bit of the next byte needs to be set. 	TokenNameCOMMENT_LINE	The high bit of the next byte needs to be set. 
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
lastBytePos	TokenNameIdentifier	 last Byte Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
&	TokenNameAND	
VB1	TokenNameIdentifier	 V B1
)	TokenNameRPAREN	
|	TokenNameOR	
~	TokenNameTWIDDLE	
VB1	TokenNameIdentifier	 V B1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
diff	TokenNameIdentifier	 diff
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
BIT_SHIFT	TokenNameIdentifier	 BIT  SHIFT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
lastBytePos	TokenNameIdentifier	 last Byte Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
// Last byte, high bit not set. 	TokenNameCOMMENT_LINE	Last byte, high bit not set. 
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
lastInt	TokenNameIdentifier	 last Int
=	TokenNameEQUAL	
nextInt	TokenNameIdentifier	 next Int
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
done	TokenNameIdentifier	 done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resizeBytes	TokenNameIdentifier	 resize Bytes
(	TokenNameLPAREN	
lastBytePos	TokenNameIdentifier	 last Byte Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initBytes	TokenNameIdentifier	 init Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// initial byte size 	TokenNameCOMMENT_LINE	initial byte size 
lastBytePos	TokenNameIdentifier	 last Byte Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
resizeBytes	TokenNameIdentifier	 resize Bytes
(	TokenNameLPAREN	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBytes	TokenNameIdentifier	 new Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBytes	TokenNameIdentifier	 new Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastBytePos	TokenNameIdentifier	 last Byte Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
newBytes	TokenNameIdentifier	 new Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VB1	TokenNameIdentifier	 V B1
=	TokenNameEQUAL	
0x7F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BIT_SHIFT	TokenNameIdentifier	 BIT  SHIFT
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
MAX_BYTES_PER_INT	TokenNameIdentifier	 MAX  BYTES  PER  INT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
31	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
BIT_SHIFT	TokenNameIdentifier	 BIT  SHIFT
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * @return The total number of sorted integers. */	TokenNameCOMMENT_JAVADOC	 @return The total number of sorted integers. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The size of the byte array storing the compressed sorted integers. */	TokenNameCOMMENT_JAVADOC	 @return The size of the byte array storing the compressed sorted integers. 
public	TokenNamepublic	
int	TokenNameint	
getByteSize	TokenNameIdentifier	 get Byte Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
/** * @return An iterator over the sorted integers. */	TokenNameCOMMENT_JAVADOC	 @return An iterator over the sorted integers. 
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
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bytePos	TokenNameIdentifier	 byte Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastInt	TokenNameIdentifier	 last Int
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See org.apache.lucene.store.IndexInput.readVInt() 	TokenNameCOMMENT_LINE	See org.apache.lucene.store.IndexInput.readVInt() 
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
bytePos	TokenNameIdentifier	 byte Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastInt	TokenNameIdentifier	 last Int
+=	TokenNamePLUS_EQUAL	
b	TokenNameIdentifier	 b
&	TokenNameAND	
VB1	TokenNameIdentifier	 V B1
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
BIT_SHIFT	TokenNameIdentifier	 BIT  SHIFT
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
~	TokenNameTWIDDLE	
VB1	TokenNameIdentifier	 V B1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
BIT_SHIFT	TokenNameIdentifier	 BIT  SHIFT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
bytePos	TokenNameIdentifier	 byte Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastInt	TokenNameIdentifier	 last Int
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
VB1	TokenNameIdentifier	 V B1
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytePos	TokenNameIdentifier	 byte Pos
>=	TokenNameGREATER_EQUAL	
lastBytePos	TokenNameIdentifier	 last Byte Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
lastInt	TokenNameIdentifier	 last Int
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
bytePos	TokenNameIdentifier	 byte Pos
<	TokenNameLESS	
lastBytePos	TokenNameIdentifier	 last Byte Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastInt	TokenNameIdentifier	 last Int
>=	TokenNameGREATER_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
lastInt	TokenNameIdentifier	 last Int
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
