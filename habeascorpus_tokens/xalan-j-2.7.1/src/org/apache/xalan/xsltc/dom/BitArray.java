/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: BitArray.java 478667 2006-11-23 20:50:36Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: BitArray.java 478667 2006-11-23 20:50:36Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Externalizable	TokenNameIdentifier	 Externalizable
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInput	TokenNameIdentifier	 Object Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutput	TokenNameIdentifier	 Object Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
;	TokenNameSEMICOLON	
/** * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen 
public	TokenNamepublic	
class	TokenNameclass	
BitArray	TokenNameIdentifier	 Bit Array
implements	TokenNameimplements	
Externalizable	TokenNameIdentifier	 Externalizable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4876019880708377663L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_bitSize	TokenNameIdentifier	 bit Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_intSize	TokenNameIdentifier	 int Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
// This table is used to prevent expensive shift operations 	TokenNameCOMMENT_LINE	This table is used to prevent expensive shift operations 
// (These operations are inexpensive on CPUs but very expensive on JVMs.) 	TokenNameCOMMENT_LINE	(These operations are inexpensive on CPUs but very expensive on JVMs.) 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_masks	TokenNameIdentifier	 masks
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x80000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x40000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x08000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00800000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00400000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00200000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00100000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00080000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00040000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00020000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00010000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00008000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00004000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00002000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00001000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000400	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000080	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000040	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000010	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000004	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000002	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00000001	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
boolean	TokenNameboolean	
DEBUG_ASSERTIONS	TokenNameIdentifier	 DEBUG  ASSERTIONS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructor. Defines the initial size of the bit array (in bits). */	TokenNameCOMMENT_JAVADOC	 Constructor. Defines the initial size of the bit array (in bits). 
public	TokenNamepublic	
BitArray	TokenNameIdentifier	 Bit Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BitArray	TokenNameIdentifier	 Bit Array
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_bitSize	TokenNameIdentifier	 bit Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
_intSize	TokenNameIdentifier	 int Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_bitSize	TokenNameIdentifier	 bit Size
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
_intSize	TokenNameIdentifier	 int Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BitArray	TokenNameIdentifier	 Bit Array
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_bitSize	TokenNameIdentifier	 bit Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
_intSize	TokenNameIdentifier	 int Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_bitSize	TokenNameIdentifier	 bit Size
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the mask for this bit array. The upper 8 bits of this mask * indicate the DOM in which the nodes in this array belong. */	TokenNameCOMMENT_JAVADOC	 Set the mask for this bit array. The upper 8 bits of this mask indicate the DOM in which the nodes in this array belong. 
public	TokenNamepublic	
void	TokenNamevoid	
setMask	TokenNameIdentifier	 set Mask
(	TokenNameLPAREN	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See setMask() */	TokenNameCOMMENT_JAVADOC	 See setMask() 
public	TokenNamepublic	
int	TokenNameint	
getMask	TokenNameIdentifier	 get Mask
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the size of this bit array (in bits). */	TokenNameCOMMENT_JAVADOC	 Returns the size of this bit array (in bits). 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_bitSize	TokenNameIdentifier	 bit Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the given bit is set */	TokenNameCOMMENT_JAVADOC	 Returns true if the given bit is set 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
getBit	TokenNameIdentifier	 get Bit
(	TokenNameLPAREN	
int	TokenNameint	
bit	TokenNameIdentifier	 bit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ASSERTIONS	TokenNameIdentifier	 DEBUG  ASSERTIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bit	TokenNameIdentifier	 bit
>=	TokenNameGREATER_EQUAL	
_bitSize	TokenNameIdentifier	 bit Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Programmer's assertion in BitArray.getBit"	TokenNameStringLiteral	Programmer's assertion in BitArray.getBit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
bit	TokenNameIdentifier	 bit
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
_masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
bit	TokenNameIdentifier	 bit
%	TokenNameREMAINDER	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next set bit from a given position */	TokenNameCOMMENT_JAVADOC	 Returns the next set bit from a given position 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getNextBit	TokenNameIdentifier	 get Next Bit
(	TokenNameLPAREN	
int	TokenNameint	
startBit	TokenNameIdentifier	 start Bit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
startBit	TokenNameIdentifier	 start Bit
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
_intSize	TokenNameIdentifier	 int Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
_bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
startBit	TokenNameIdentifier	 start Bit
%	TokenNameREMAINDER	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
_masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
startBit	TokenNameIdentifier	 start Bit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method returns the Nth bit that is set in the bit array. The * current position is cached in the following 4 variables and will * help speed up a sequence of next() call in an index iterator. This * method is a mess, but it is fast and it works, so don't change it. */	TokenNameCOMMENT_JAVADOC	 This method returns the Nth bit that is set in the bit array. The current position is cached in the following 4 variables and will help speed up a sequence of next() call in an index iterator. This method is a mess, but it is fast and it works, so don't change it. 
private	TokenNameprivate	
int	TokenNameint	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_int	TokenNameIdentifier	 int
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getBitNumber	TokenNameIdentifier	 get Bit Number
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Return last node if position we're looking for is the same 	TokenNameCOMMENT_LINE	Return last node if position we're looking for is the same 
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
_pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
_node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Start from beginning of position we're looking for is before 	TokenNameCOMMENT_LINE	Start from beginning of position we're looking for is before 
// the point where we left off the last time. 	TokenNameCOMMENT_LINE	the point where we left off the last time. 
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
_pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_int	TokenNameIdentifier	 int
=	TokenNameEQUAL	
_bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Scan through the bit array - skip integers that have no bits set 	TokenNameCOMMENT_LINE	Scan through the bit array - skip integers that have no bits set 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
_int	TokenNameIdentifier	 int
<=	TokenNameLESS_EQUAL	
_intSize	TokenNameIdentifier	 int Size
;	TokenNameSEMICOLON	
_int	TokenNameIdentifier	 int
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
_bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
_int	TokenNameIdentifier	 int
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Any bits set? 	TokenNameCOMMENT_LINE	Any bits set? 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
_bit	TokenNameIdentifier	 bit
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_bit	TokenNameIdentifier	 bit
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
_masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
_bit	TokenNameIdentifier	 bit
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
_pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_int	TokenNameIdentifier	 int
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
_bit	TokenNameIdentifier	 bit
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
_node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the integer array in which the bit array is contained */	TokenNameCOMMENT_JAVADOC	 Returns the integer array in which the bit array is contained 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
_first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
// The index where first set bit is 	TokenNameCOMMENT_LINE	The index where first set bit is 
int	TokenNameint	
_last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
// The _INTEGER INDEX_ where last set bit is 	TokenNameCOMMENT_LINE	The _INTEGER INDEX_ where last set bit is 
/** * Sets a given bit */	TokenNameCOMMENT_JAVADOC	 Sets a given bit 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setBit	TokenNameIdentifier	 set Bit
(	TokenNameLPAREN	
int	TokenNameint	
bit	TokenNameIdentifier	 bit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ASSERTIONS	TokenNameIdentifier	 DEBUG  ASSERTIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bit	TokenNameIdentifier	 bit
>=	TokenNameGREATER_EQUAL	
_bitSize	TokenNameIdentifier	 bit Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Programmer's assertion in BitArray.getBit"	TokenNameStringLiteral	Programmer's assertion in BitArray.getBit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bit	TokenNameIdentifier	 bit
>=	TokenNameGREATER_EQUAL	
_bitSize	TokenNameIdentifier	 bit Size
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bit	TokenNameIdentifier	 bit
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
_first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
_last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
_last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
_bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
_masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
bit	TokenNameIdentifier	 bit
%	TokenNameREMAINDER	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merge two bit arrays. This currently only works for nodes from * a single DOM (because there is only one _mask per array). */	TokenNameCOMMENT_JAVADOC	 Merge two bit arrays. This currently only works for nodes from a single DOM (because there is only one _mask per array). 
public	TokenNamepublic	
final	TokenNamefinal	
BitArray	TokenNameIdentifier	 Bit Array
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
BitArray	TokenNameIdentifier	 Bit Array
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Take other array's bits if we have node set 	TokenNameCOMMENT_LINE	Take other array's bits if we have node set 
if	TokenNameif	
(	TokenNameLPAREN	
_last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Only merge if other array has any bits set 	TokenNameCOMMENT_LINE	Only merge if other array has any bits set 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_last	TokenNameIdentifier	 last
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_first	TokenNameIdentifier	 first
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
?	TokenNameQUESTION	
_first	TokenNameIdentifier	 first
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
int	TokenNameint	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_last	TokenNameIdentifier	 last
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
?	TokenNameQUESTION	
_last	TokenNameIdentifier	 last
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
// Merge these bits into other array if other array is larger 	TokenNameCOMMENT_LINE	Merge these bits into other array if other array is larger 
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_intSize	TokenNameIdentifier	 int Size
>	TokenNameGREATER	
_intSize	TokenNameIdentifier	 int Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
>	TokenNameGREATER	
_intSize	TokenNameIdentifier	 int Size
)	TokenNameRPAREN	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
_intSize	TokenNameIdentifier	 int Size
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
_bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Merge other bits into this array if this arrai is large/equal. 	TokenNameCOMMENT_LINE	Merge other bits into this array if this arrai is large/equal. 
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_intSize	TokenNameIdentifier	 int Size
)	TokenNameRPAREN	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_intSize	TokenNameIdentifier	 int Size
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
_bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_bits	TokenNameIdentifier	 bits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resizes the bit array - try to avoid using this method!!! */	TokenNameCOMMENT_JAVADOC	 Resizes the bit array - try to avoid using this method!!! 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
>	TokenNameGREATER	
_bitSize	TokenNameIdentifier	 bit Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_intSize	TokenNameIdentifier	 int Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBits	TokenNameIdentifier	 new Bits
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
_intSize	TokenNameIdentifier	 int Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
_bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBits	TokenNameIdentifier	 new Bits
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
_bitSize	TokenNameIdentifier	 bit Size
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
newBits	TokenNameIdentifier	 new Bits
;	TokenNameSEMICOLON	
_bitSize	TokenNameIdentifier	 bit Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
BitArray	TokenNameIdentifier	 Bit Array
cloneArray	TokenNameIdentifier	 clone Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
BitArray	TokenNameIdentifier	 Bit Array
(	TokenNameLPAREN	
_intSize	TokenNameIdentifier	 int Size
,	TokenNameCOMMA	
_bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
writeExternal	TokenNameIdentifier	 write External
(	TokenNameLPAREN	
ObjectOutput	TokenNameIdentifier	 Object Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
_bitSize	TokenNameIdentifier	 bit Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
_mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
_bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read the whole tree from a file (serialized) */	TokenNameCOMMENT_JAVADOC	 Read the whole tree from a file (serialized) 
public	TokenNamepublic	
void	TokenNamevoid	
readExternal	TokenNameIdentifier	 read External
(	TokenNameLPAREN	
ObjectInput	TokenNameIdentifier	 Object Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
_bitSize	TokenNameIdentifier	 bit Size
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_intSize	TokenNameIdentifier	 int Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_bitSize	TokenNameIdentifier	 bit Size
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
