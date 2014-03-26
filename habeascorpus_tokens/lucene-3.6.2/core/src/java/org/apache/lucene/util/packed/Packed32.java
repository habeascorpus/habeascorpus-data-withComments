package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
packed	TokenNameIdentifier	 packed
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
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
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
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
/** * Space optimized random access capable array of values with a fixed number of * bits. The maximum number of bits/value is 31. Use {@link Packed64} for higher * numbers. * </p><p> * The implementation strives to avoid conditionals and expensive operations, * sacrificing code clarity to achieve better performance. */	TokenNameCOMMENT_JAVADOC	 Space optimized random access capable array of values with a fixed number of bits. The maximum number of bits/value is 31. Use {@link Packed64} for higher numbers. </p><p> The implementation strives to avoid conditionals and expensive operations, sacrificing code clarity to achieve better performance. 
class	TokenNameclass	
Packed32	TokenNameIdentifier	 Packed32
extends	TokenNameextends	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
ReaderImpl	TokenNameIdentifier	 Reader Impl
implements	TokenNameimplements	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 32 = int, 64 = long 	TokenNameCOMMENT_LINE	32 = int, 64 = long 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BLOCK_BITS	TokenNameIdentifier	 BLOCK  BITS
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The #bits representing BLOCK_SIZE 	TokenNameCOMMENT_LINE	The #bits representing BLOCK_SIZE 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOD_MASK	TokenNameIdentifier	 MOD  MASK
=	TokenNameEQUAL	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// x % BLOCK_SIZE 	TokenNameCOMMENT_LINE	x % BLOCK_SIZE 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENTRY_SIZE	TokenNameIdentifier	 ENTRY  SIZE
=	TokenNameEQUAL	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FAC_BITPOS	TokenNameIdentifier	 FAC  BITPOS
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * In order to make an efficient value-getter, conditionals should be * avoided. A value can be positioned inside of a block, requiring shifting * left or right or it can span two blocks, requiring a left-shift on the * first block and a right-shift on the right block. * </p><p> * By always shifting the first block both left and right, we get exactly * the right bits. By always shifting the second block right and applying * a mask, we get the right bits there. After that, we | the two bitsets. */	TokenNameCOMMENT_BLOCK	 In order to make an efficient value-getter, conditionals should be avoided. A value can be positioned inside of a block, requiring shifting left or right or it can span two blocks, requiring a left-shift on the first block and a right-shift on the right block. </p><p> By always shifting the first block both left and right, we get exactly the right bits. By always shifting the second block right and applying a mask, we get the right bits there. After that, we | the two bitsets. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SHIFTS	TokenNameIdentifier	 SHIFTS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
ENTRY_SIZE	TokenNameIdentifier	 ENTRY  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ENTRY_SIZE	TokenNameIdentifier	 ENTRY  SIZE
*	TokenNameMULTIPLY	
FAC_BITPOS	TokenNameIdentifier	 FAC  BITPOS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
MASKS	TokenNameIdentifier	 MASKS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
ENTRY_SIZE	TokenNameIdentifier	 ENTRY  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ENTRY_SIZE	TokenNameIdentifier	 ENTRY  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// Generate shifts 	TokenNameCOMMENT_LINE	Generate shifts 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
elementBits	TokenNameIdentifier	 element Bits
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
elementBits	TokenNameIdentifier	 element Bits
<=	TokenNameLESS_EQUAL	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
;	TokenNameSEMICOLON	
elementBits	TokenNameIdentifier	 element Bits
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
bitPos	TokenNameIdentifier	 bit Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bitPos	TokenNameIdentifier	 bit Pos
<	TokenNameLESS	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
;	TokenNameSEMICOLON	
bitPos	TokenNameIdentifier	 bit Pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentShifts	TokenNameIdentifier	 current Shifts
=	TokenNameEQUAL	
SHIFTS	TokenNameIdentifier	 SHIFTS
[	TokenNameLBRACKET	
elementBits	TokenNameIdentifier	 element Bits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
bitPos	TokenNameIdentifier	 bit Pos
*	TokenNameMULTIPLY	
FAC_BITPOS	TokenNameIdentifier	 FAC  BITPOS
;	TokenNameSEMICOLON	
currentShifts	TokenNameIdentifier	 current Shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitPos	TokenNameIdentifier	 bit Pos
;	TokenNameSEMICOLON	
currentShifts	TokenNameIdentifier	 current Shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
-	TokenNameMINUS	
elementBits	TokenNameIdentifier	 element Bits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bitPos	TokenNameIdentifier	 bit Pos
<=	TokenNameLESS_EQUAL	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
-	TokenNameMINUS	
elementBits	TokenNameIdentifier	 element Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Single block 	TokenNameCOMMENT_LINE	Single block 
currentShifts	TokenNameIdentifier	 current Shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
MASKS	TokenNameIdentifier	 MASKS
[	TokenNameLBRACKET	
elementBits	TokenNameIdentifier	 element Bits
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
bitPos	TokenNameIdentifier	 bit Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Two blocks 	TokenNameCOMMENT_LINE	Two blocks 
int	TokenNameint	
rBits	TokenNameIdentifier	 r Bits
=	TokenNameEQUAL	
elementBits	TokenNameIdentifier	 element Bits
-	TokenNameMINUS	
(	TokenNameLPAREN	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
-	TokenNameMINUS	
bitPos	TokenNameIdentifier	 bit Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentShifts	TokenNameIdentifier	 current Shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
-	TokenNameMINUS	
rBits	TokenNameIdentifier	 r Bits
;	TokenNameSEMICOLON	
MASKS	TokenNameIdentifier	 MASKS
[	TokenNameLBRACKET	
elementBits	TokenNameIdentifier	 element Bits
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
bitPos	TokenNameIdentifier	 bit Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
(	TokenNameLPAREN	
~	TokenNameTWIDDLE	
0	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
rBits	TokenNameIdentifier	 r Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * The setter requires more masking than the getter. */	TokenNameCOMMENT_BLOCK	 The setter requires more masking than the getter. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
WRITE_MASKS	TokenNameIdentifier	 WRITE  MASKS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
ENTRY_SIZE	TokenNameIdentifier	 ENTRY  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ENTRY_SIZE	TokenNameIdentifier	 ENTRY  SIZE
*	TokenNameMULTIPLY	
FAC_BITPOS	TokenNameIdentifier	 FAC  BITPOS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
elementBits	TokenNameIdentifier	 element Bits
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
elementBits	TokenNameIdentifier	 element Bits
<=	TokenNameLESS_EQUAL	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
;	TokenNameSEMICOLON	
elementBits	TokenNameIdentifier	 element Bits
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
elementPosMask	TokenNameIdentifier	 element Pos Mask
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
(	TokenNameLPAREN	
~	TokenNameTWIDDLE	
0	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
elementBits	TokenNameIdentifier	 element Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentShifts	TokenNameIdentifier	 current Shifts
=	TokenNameEQUAL	
SHIFTS	TokenNameIdentifier	 SHIFTS
[	TokenNameLBRACKET	
elementBits	TokenNameIdentifier	 element Bits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentMasks	TokenNameIdentifier	 current Masks
=	TokenNameEQUAL	
WRITE_MASKS	TokenNameIdentifier	 WRITE  MASKS
[	TokenNameLBRACKET	
elementBits	TokenNameIdentifier	 element Bits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
bitPos	TokenNameIdentifier	 bit Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bitPos	TokenNameIdentifier	 bit Pos
<	TokenNameLESS	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
;	TokenNameSEMICOLON	
bitPos	TokenNameIdentifier	 bit Pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
bitPos	TokenNameIdentifier	 bit Pos
*	TokenNameMULTIPLY	
FAC_BITPOS	TokenNameIdentifier	 FAC  BITPOS
;	TokenNameSEMICOLON	
currentMasks	TokenNameIdentifier	 current Masks
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
elementPosMask	TokenNameIdentifier	 element Pos Mask
<<	TokenNameLEFT_SHIFT	
currentShifts	TokenNameIdentifier	 current Shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
currentShifts	TokenNameIdentifier	 current Shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bitPos	TokenNameIdentifier	 bit Pos
<=	TokenNameLESS_EQUAL	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
-	TokenNameMINUS	
elementBits	TokenNameIdentifier	 element Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Second block not used 	TokenNameCOMMENT_LINE	Second block not used 
currentMasks	TokenNameIdentifier	 current Masks
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Keep all bits 	TokenNameCOMMENT_LINE	Keep all bits 
currentMasks	TokenNameIdentifier	 current Masks
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Or with 0 	TokenNameCOMMENT_LINE	Or with 0 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentMasks	TokenNameIdentifier	 current Masks
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
(	TokenNameLPAREN	
elementPosMask	TokenNameIdentifier	 element Pos Mask
<<	TokenNameLEFT_SHIFT	
currentShifts	TokenNameIdentifier	 current Shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentMasks	TokenNameIdentifier	 current Masks
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentShifts	TokenNameIdentifier	 current Shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
~	TokenNameTWIDDLE	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* The bits */	TokenNameCOMMENT_BLOCK	 The bits 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blocks	TokenNameIdentifier	 blocks
;	TokenNameSEMICOLON	
// Cached calculations 	TokenNameCOMMENT_LINE	Cached calculations 
private	TokenNameprivate	
int	TokenNameint	
maxPos	TokenNameIdentifier	 max Pos
;	TokenNameSEMICOLON	
// blocks.length * BLOCK_SIZE / bitsPerValue - 1 	TokenNameCOMMENT_LINE	blocks.length * BLOCK_SIZE / bitsPerValue - 1 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shifts	TokenNameIdentifier	 shifts
;	TokenNameSEMICOLON	
// The shifts for the current bitsPerValue 	TokenNameCOMMENT_LINE	The shifts for the current bitsPerValue 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readMasks	TokenNameIdentifier	 read Masks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
writeMasks	TokenNameIdentifier	 write Masks
;	TokenNameSEMICOLON	
/** * Creates an array with the internal structures adjusted for the given * limits and initialized to 0. * @param valueCount the number of elements. * @param bitsPerValue the number of bits available for any given value. * Note: bitsPerValue >32 is not supported by this implementation. */	TokenNameCOMMENT_JAVADOC	 Creates an array with the internal structures adjusted for the given limits and initialized to 0. @param valueCount the number of elements. @param bitsPerValue the number of bits available for any given value. Note: bitsPerValue >32 is not supported by this implementation. 
public	TokenNamepublic	
Packed32	TokenNameIdentifier	 Packed32
(	TokenNameLPAREN	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
bitsPerValue	TokenNameIdentifier	 bits Per Value
/	TokenNameDIVIDE	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an array with content retrieved from the given DataInput. * @param in a DataInput, positioned at the start of Packed64-content. * @param valueCount the number of elements. * @param bitsPerValue the number of bits available for any given value. * @throws java.io.IOException if the values for the backing array could not * be retrieved. */	TokenNameCOMMENT_JAVADOC	 Creates an array with content retrieved from the given DataInput. @param in a DataInput, positioned at the start of Packed64-content. @param valueCount the number of elements. @param bitsPerValue the number of bits available for any given value. @throws java.io.IOException if the values for the backing array could not be retrieved. 
public	TokenNamepublic	
Packed32	TokenNameIdentifier	 Packed32
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blocks	TokenNameIdentifier	 blocks
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// +1 due to non-conditional tricks 	TokenNameCOMMENT_LINE	+1 due to non-conditional tricks 
// TODO: find a faster way to bulk-read ints... 	TokenNameCOMMENT_LINE	TODO: find a faster way to bulk-read ints... 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Align to long 	TokenNameCOMMENT_LINE	Align to long 
}	TokenNameRBRACE	
updateCached	TokenNameIdentifier	 update Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
,	TokenNameCOMMA	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
totBitCount	TokenNameIdentifier	 tot Bit Count
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
valueCount	TokenNameIdentifier	 value Count
*	TokenNameMULTIPLY	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
totBitCount	TokenNameIdentifier	 tot Bit Count
/	TokenNameDIVIDE	
32	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
totBitCount	TokenNameIdentifier	 tot Bit Count
%	TokenNameREMAINDER	
32	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an array backed by the given blocks. * </p><p> * Note: The blocks are used directly, so changes to the given block will * affect the Packed32-structure. * @param blocks used as the internal backing array. * @param valueCount the number of values. * @param bitsPerValue the number of bits available for any given value. * Note: bitsPerValue >32 is not supported by this implementation. */	TokenNameCOMMENT_JAVADOC	 Creates an array backed by the given blocks. </p><p> Note: The blocks are used directly, so changes to the given block will affect the Packed32-structure. @param blocks used as the internal backing array. @param valueCount the number of values. @param bitsPerValue the number of bits available for any given value. Note: bitsPerValue >32 is not supported by this implementation. 
public	TokenNamepublic	
Packed32	TokenNameIdentifier	 Packed32
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blocks	TokenNameIdentifier	 blocks
,	TokenNameCOMMA	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: Check that blocks.length is sufficient for holding length values 	TokenNameCOMMENT_LINE	TODO: Check that blocks.length is sufficient for holding length values 
super	TokenNamesuper	
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
>	TokenNameGREATER	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"This array only supports values of 31 bits or less. The "	TokenNameStringLiteral	This array only supports values of 31 bits or less. The 
+	TokenNamePLUS	
"required number of bits was %d. The Packed64 "	TokenNameStringLiteral	required number of bits was %d. The Packed64 
+	TokenNamePLUS	
"implementation allows values with more than 31 bits"	TokenNameStringLiteral	implementation allows values with more than 31 bits
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
blocks	TokenNameIdentifier	 blocks
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
;	TokenNameSEMICOLON	
updateCached	TokenNameIdentifier	 update Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
updateCached	TokenNameIdentifier	 update Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readMasks	TokenNameIdentifier	 read Masks
=	TokenNameEQUAL	
MASKS	TokenNameIdentifier	 MASKS
[	TokenNameLBRACKET	
bitsPerValue	TokenNameIdentifier	 bits Per Value
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
maxPos	TokenNameIdentifier	 max Pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
/	TokenNameDIVIDE	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shifts	TokenNameIdentifier	 shifts
=	TokenNameEQUAL	
SHIFTS	TokenNameIdentifier	 SHIFTS
[	TokenNameLBRACKET	
bitsPerValue	TokenNameIdentifier	 bits Per Value
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
writeMasks	TokenNameIdentifier	 write Masks
=	TokenNameEQUAL	
WRITE_MASKS	TokenNameIdentifier	 WRITE  MASKS
[	TokenNameLBRACKET	
bitsPerValue	TokenNameIdentifier	 bits Per Value
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param index the position of the value. * @return the value at the given index. */	TokenNameCOMMENT_JAVADOC	 @param index the position of the value. @return the value at the given index. 
public	TokenNamepublic	
long	TokenNamelong	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
final	TokenNamefinal	
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
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
majorBitPos	TokenNameIdentifier	 major Bit Pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
*	TokenNameMULTIPLY	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
elementPos	TokenNameIdentifier	 element Pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
majorBitPos	TokenNameIdentifier	 major Bit Pos
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
BLOCK_BITS	TokenNameIdentifier	 BLOCK  BITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// / BLOCK_SIZE 	TokenNameCOMMENT_LINE	/ BLOCK_SIZE 
final	TokenNamefinal	
int	TokenNameint	
bitPos	TokenNameIdentifier	 bit Pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
majorBitPos	TokenNameIdentifier	 major Bit Pos
&	TokenNameAND	
MOD_MASK	TokenNameIdentifier	 MOD  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// % BLOCK_SIZE); 	TokenNameCOMMENT_LINE	% BLOCK_SIZE); 
final	TokenNamefinal	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
bitPos	TokenNameIdentifier	 bit Pos
*	TokenNameMULTIPLY	
FAC_BITPOS	TokenNameIdentifier	 FAC  BITPOS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
elementPos	TokenNameIdentifier	 element Pos
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
shifts	TokenNameIdentifier	 shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
shifts	TokenNameIdentifier	 shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
elementPos	TokenNameIdentifier	 element Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
shifts	TokenNameIdentifier	 shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
readMasks	TokenNameIdentifier	 read Masks
[	TokenNameLBRACKET	
bitPos	TokenNameIdentifier	 bit Pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
intValue	TokenNameIdentifier	 int Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
majorBitPos	TokenNameIdentifier	 major Bit Pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
*	TokenNameMULTIPLY	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
elementPos	TokenNameIdentifier	 element Pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
majorBitPos	TokenNameIdentifier	 major Bit Pos
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
BLOCK_BITS	TokenNameIdentifier	 BLOCK  BITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// / BLOCK_SIZE 	TokenNameCOMMENT_LINE	/ BLOCK_SIZE 
final	TokenNamefinal	
int	TokenNameint	
bitPos	TokenNameIdentifier	 bit Pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
majorBitPos	TokenNameIdentifier	 major Bit Pos
&	TokenNameAND	
MOD_MASK	TokenNameIdentifier	 MOD  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// % BLOCK_SIZE); 	TokenNameCOMMENT_LINE	% BLOCK_SIZE); 
final	TokenNamefinal	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
bitPos	TokenNameIdentifier	 bit Pos
*	TokenNameMULTIPLY	
FAC_BITPOS	TokenNameIdentifier	 FAC  BITPOS
;	TokenNameSEMICOLON	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
elementPos	TokenNameIdentifier	 element Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
elementPos	TokenNameIdentifier	 element Pos
]	TokenNameRBRACKET	
&	TokenNameAND	
writeMasks	TokenNameIdentifier	 write Masks
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
intValue	TokenNameIdentifier	 int Value
<<	TokenNameLEFT_SHIFT	
shifts	TokenNameIdentifier	 shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
shifts	TokenNameIdentifier	 shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
elementPos	TokenNameIdentifier	 element Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
elementPos	TokenNameIdentifier	 element Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
writeMasks	TokenNameIdentifier	 write Masks
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
intValue	TokenNameIdentifier	 int Value
<<	TokenNameLEFT_SHIFT	
shifts	TokenNameIdentifier	 shifts
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
writeMasks	TokenNameIdentifier	 write Masks
[	TokenNameLBRACKET	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Packed32(bitsPerValue="	TokenNameStringLiteral	Packed32(bitsPerValue=
+	TokenNamePLUS	
bitsPerValue	TokenNameIdentifier	 bits Per Value
+	TokenNamePLUS	
", maxPos="	TokenNameStringLiteral	, maxPos=
+	TokenNamePLUS	
maxPos	TokenNameIdentifier	 max Pos
+	TokenNamePLUS	
", elements.length="	TokenNameStringLiteral	, elements.length=
+	TokenNamePLUS	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
ramBytesUsed	TokenNameIdentifier	 ram Bytes Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
