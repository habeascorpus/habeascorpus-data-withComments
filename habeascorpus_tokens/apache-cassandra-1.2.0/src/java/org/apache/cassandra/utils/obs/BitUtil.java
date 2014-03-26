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
/** A variety of high efficiency bit twiddling routines. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A variety of high efficiency bit twiddling routines. @lucene.internal 
final	TokenNamefinal	
class	TokenNameclass	
BitUtil	TokenNameIdentifier	 Bit Util
{	TokenNameLBRACE	
/** Returns the number of bits set in the long */	TokenNameCOMMENT_JAVADOC	 Returns the number of bits set in the long 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
long	TokenNamelong	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Hacker's Delight 32 bit pop function: * http://www.hackersdelight.org/HDcode/newCode/pop_arrayHS.cc * int pop(unsigned x) { x = x - ((x >> 1) & 0x55555555); x = (x & 0x33333333) + ((x >> 2) & 0x33333333); x = (x + (x >> 4)) & 0x0F0F0F0F; x = x + (x >> 8); x = x + (x >> 16); return x & 0x0000003F; } ***/	TokenNameCOMMENT_BLOCK	 Hacker's Delight 32 bit pop function: http://www.hackersdelight.org/HDcode/newCode/pop_arrayHS.cc int pop(unsigned x) { x = x - ((x >> 1) & 0x55555555); x = (x & 0x33333333) + ((x >> 2) & 0x33333333); x = (x + (x >> 4)) & 0x0F0F0F0F; x = x + (x >> 8); x = x + (x >> 16); return x & 0x0000003F; } **
// 64 bit java version of the C function from above 	TokenNameCOMMENT_LINE	64 bit java version of the C function from above 
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x5555555555555555L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
&	TokenNameAND	
0x3333333333333333L	TokenNameLongLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3333333333333333L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0F0F0F0F0F0F0F0FL	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** Returns the number of set bits in an array of longs. */	TokenNameCOMMENT_JAVADOC	* Returns the number of set bits in an array of longs. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
pop_array	TokenNameIdentifier	 pop array
(	TokenNameLPAREN	
long	TokenNamelong	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
wordOffset	TokenNameIdentifier	 word Offset
,	TokenNameCOMMA	
int	TokenNameint	
numWords	TokenNameIdentifier	 num Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Robert Harley and David Seal's bit counting algorithm, as documented * in the revisions of Hacker's Delight * http://www.hackersdelight.org/revisions.pdf * http://www.hackersdelight.org/HDcode/newCode/pop_arrayHS.cc * * This function was adapted to Java, and extended to use 64 bit words. * if only we had access to wider registers like SSE from java... * * This function can be transformed to compute the popcount of other functions * on bitsets via something like this: * sed 's/A\[\([^]]*\)\]/\(A[\1] \& B[\1]\)/g' * */	TokenNameCOMMENT_BLOCK	 Robert Harley and David Seal's bit counting algorithm, as documented in the revisions of Hacker's Delight http://www.hackersdelight.org/revisions.pdf http://www.hackersdelight.org/HDcode/newCode/pop_arrayHS.cc * This function was adapted to Java, and extended to use 64 bit words. if only we had access to wider registers like SSE from java... * This function can be transformed to compute the popcount of other functions on bitsets via something like this: sed 's/A\[\([^]]*\)\]/\(A[\1] \& B[\1]\)/g' 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
wordOffset	TokenNameIdentifier	 word Offset
+	TokenNamePLUS	
numWords	TokenNameIdentifier	 num Words
;	TokenNameSEMICOLON	
long	TokenNamelong	
tot	TokenNameIdentifier	 tot
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tot8	TokenNameIdentifier	 tot8
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
wordOffset	TokenNameIdentifier	 word Offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*** C macro from Hacker's Delight #define CSA(h,l, a,b,c) \ {unsigned u = a ^ b; unsigned v = c; \ h = (a & b) | (u & v); l = u ^ v;} ***/	TokenNameCOMMENT_JAVADOC	* C macro from Hacker's Delight #define CSA(h,l, a,b,c) \ {unsigned u = a ^ b; unsigned v = c; \ h = (a & b) | (u & v); l = u ^ v;} **
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
,	TokenNameCOMMA	
twosB	TokenNameIdentifier	 twos B
,	TokenNameCOMMA	
foursA	TokenNameIdentifier	 fours A
,	TokenNameCOMMA	
foursB	TokenNameIdentifier	 fours B
,	TokenNameCOMMA	
eights	TokenNameIdentifier	 eights
;	TokenNameSEMICOLON	
// CSA(twosA, ones, ones, A[i], A[i+1]) 	TokenNameCOMMENT_LINE	CSA(twosA, ones, ones, A[i], A[i+1]) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSA(twosB, ones, ones, A[i+2], A[i+3]) 	TokenNameCOMMENT_LINE	CSA(twosB, ones, ones, A[i+2], A[i+3]) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(foursA, twos, twos, twosA, twosB) 	TokenNameCOMMENT_LINE	CSA(foursA, twos, twos, twosA, twosB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(twosA, ones, ones, A[i+4], A[i+5]) 	TokenNameCOMMENT_LINE	CSA(twosA, ones, ones, A[i+4], A[i+5]) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSA(twosB, ones, ones, A[i+6], A[i+7]) 	TokenNameCOMMENT_LINE	CSA(twosB, ones, ones, A[i+6], A[i+7]) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(foursB, twos, twos, twosA, twosB) 	TokenNameCOMMENT_LINE	CSA(foursB, twos, twos, twosA, twosB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursB	TokenNameIdentifier	 fours B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(eights, fours, fours, foursA, foursB) 	TokenNameCOMMENT_LINE	CSA(eights, fours, fours, foursA, foursB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
foursB	TokenNameIdentifier	 fours B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
foursB	TokenNameIdentifier	 fours B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// handle trailing words in a binary-search manner... 	TokenNameCOMMENT_LINE	handle trailing words in a binary-search manner... 
// derived from the loop above by setting specific elements to 0. 	TokenNameCOMMENT_LINE	derived from the loop above by setting specific elements to 0. 
// the original method in Hackers Delight used a simple for loop: 	TokenNameCOMMENT_LINE	the original method in Hackers Delight used a simple for loop: 
// for (i = i; i < n; i++) // Add in the last elements 	TokenNameCOMMENT_LINE	for (i = i; i < n; i++) // Add in the last elements 
// tot = tot + pop(A[i]); 	TokenNameCOMMENT_LINE	tot = tot + pop(A[i]); 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
,	TokenNameCOMMA	
twosB	TokenNameIdentifier	 twos B
,	TokenNameCOMMA	
foursA	TokenNameIdentifier	 fours A
,	TokenNameCOMMA	
eights	TokenNameIdentifier	 eights
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
long	TokenNamelong	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
long	TokenNamelong	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
fours	TokenNameIdentifier	 fours
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
tot8	TokenNameIdentifier	 tot8
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the popcount or cardinality of the two sets after an intersection. * Neither array is modified. */	TokenNameCOMMENT_JAVADOC	 Returns the popcount or cardinality of the two sets after an intersection. Neither array is modified. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
pop_intersect	TokenNameIdentifier	 pop intersect
(	TokenNameLPAREN	
long	TokenNamelong	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
long	TokenNamelong	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
wordOffset	TokenNameIdentifier	 word Offset
,	TokenNameCOMMA	
int	TokenNameint	
numWords	TokenNameIdentifier	 num Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// generated from pop_array via sed 's/A\[\([^]]*\)\]/\(A[\1] \& B[\1]\)/g' 	TokenNameCOMMENT_LINE	generated from pop_array via sed 's/A\[\([^]]*\)\]/\(A[\1] \& B[\1]\)/g' 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
wordOffset	TokenNameIdentifier	 word Offset
+	TokenNamePLUS	
numWords	TokenNameIdentifier	 num Words
;	TokenNameSEMICOLON	
long	TokenNamelong	
tot	TokenNameIdentifier	 tot
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tot8	TokenNameIdentifier	 tot8
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
wordOffset	TokenNameIdentifier	 word Offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
,	TokenNameCOMMA	
twosB	TokenNameIdentifier	 twos B
,	TokenNameCOMMA	
foursA	TokenNameIdentifier	 fours A
,	TokenNameCOMMA	
foursB	TokenNameIdentifier	 fours B
,	TokenNameCOMMA	
eights	TokenNameIdentifier	 eights
;	TokenNameSEMICOLON	
// CSA(twosA, ones, ones, (A[i] & B[i]), (A[i+1] & B[i+1])) 	TokenNameCOMMENT_LINE	CSA(twosA, ones, ones, (A[i] & B[i]), (A[i+1] & B[i+1])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSA(twosB, ones, ones, (A[i+2] & B[i+2]), (A[i+3] & B[i+3])) 	TokenNameCOMMENT_LINE	CSA(twosB, ones, ones, (A[i+2] & B[i+2]), (A[i+3] & B[i+3])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(foursA, twos, twos, twosA, twosB) 	TokenNameCOMMENT_LINE	CSA(foursA, twos, twos, twosA, twosB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(twosA, ones, ones, (A[i+4] & B[i+4]), (A[i+5] & B[i+5])) 	TokenNameCOMMENT_LINE	CSA(twosA, ones, ones, (A[i+4] & B[i+4]), (A[i+5] & B[i+5])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSA(twosB, ones, ones, (A[i+6] & B[i+6]), (A[i+7] & B[i+7])) 	TokenNameCOMMENT_LINE	CSA(twosB, ones, ones, (A[i+6] & B[i+6]), (A[i+7] & B[i+7])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(foursB, twos, twos, twosA, twosB) 	TokenNameCOMMENT_LINE	CSA(foursB, twos, twos, twosA, twosB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursB	TokenNameIdentifier	 fours B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(eights, fours, fours, foursA, foursB) 	TokenNameCOMMENT_LINE	CSA(eights, fours, fours, foursA, foursB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
foursB	TokenNameIdentifier	 fours B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
foursB	TokenNameIdentifier	 fours B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
,	TokenNameCOMMA	
twosB	TokenNameIdentifier	 twos B
,	TokenNameCOMMA	
foursA	TokenNameIdentifier	 fours A
,	TokenNameCOMMA	
eights	TokenNameIdentifier	 eights
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
long	TokenNamelong	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
long	TokenNamelong	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
fours	TokenNameIdentifier	 fours
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
tot8	TokenNameIdentifier	 tot8
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the popcount or cardinality of the union of two sets. * Neither array is modified. */	TokenNameCOMMENT_JAVADOC	 Returns the popcount or cardinality of the union of two sets. Neither array is modified. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
pop_union	TokenNameIdentifier	 pop union
(	TokenNameLPAREN	
long	TokenNamelong	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
long	TokenNamelong	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
wordOffset	TokenNameIdentifier	 word Offset
,	TokenNameCOMMA	
int	TokenNameint	
numWords	TokenNameIdentifier	 num Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// generated from pop_array via sed 's/A\[\([^]]*\)\]/\(A[\1] \| B[\1]\)/g' 	TokenNameCOMMENT_LINE	generated from pop_array via sed 's/A\[\([^]]*\)\]/\(A[\1] \| B[\1]\)/g' 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
wordOffset	TokenNameIdentifier	 word Offset
+	TokenNamePLUS	
numWords	TokenNameIdentifier	 num Words
;	TokenNameSEMICOLON	
long	TokenNamelong	
tot	TokenNameIdentifier	 tot
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tot8	TokenNameIdentifier	 tot8
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
wordOffset	TokenNameIdentifier	 word Offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*** C macro from Hacker's Delight #define CSA(h,l, a,b,c) \ {unsigned u = a ^ b; unsigned v = c; \ h = (a & b) | (u & v); l = u ^ v;} ***/	TokenNameCOMMENT_JAVADOC	* C macro from Hacker's Delight #define CSA(h,l, a,b,c) \ {unsigned u = a ^ b; unsigned v = c; \ h = (a & b) | (u & v); l = u ^ v;} **
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
,	TokenNameCOMMA	
twosB	TokenNameIdentifier	 twos B
,	TokenNameCOMMA	
foursA	TokenNameIdentifier	 fours A
,	TokenNameCOMMA	
foursB	TokenNameIdentifier	 fours B
,	TokenNameCOMMA	
eights	TokenNameIdentifier	 eights
;	TokenNameSEMICOLON	
// CSA(twosA, ones, ones, (A[i] | B[i]), (A[i+1] | B[i+1])) 	TokenNameCOMMENT_LINE	CSA(twosA, ones, ones, (A[i] | B[i]), (A[i+1] | B[i+1])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSA(twosB, ones, ones, (A[i+2] | B[i+2]), (A[i+3] | B[i+3])) 	TokenNameCOMMENT_LINE	CSA(twosB, ones, ones, (A[i+2] | B[i+2]), (A[i+3] | B[i+3])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(foursA, twos, twos, twosA, twosB) 	TokenNameCOMMENT_LINE	CSA(foursA, twos, twos, twosA, twosB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(twosA, ones, ones, (A[i+4] | B[i+4]), (A[i+5] | B[i+5])) 	TokenNameCOMMENT_LINE	CSA(twosA, ones, ones, (A[i+4] | B[i+4]), (A[i+5] | B[i+5])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSA(twosB, ones, ones, (A[i+6] | B[i+6]), (A[i+7] | B[i+7])) 	TokenNameCOMMENT_LINE	CSA(twosB, ones, ones, (A[i+6] | B[i+6]), (A[i+7] | B[i+7])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(foursB, twos, twos, twosA, twosB) 	TokenNameCOMMENT_LINE	CSA(foursB, twos, twos, twosA, twosB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursB	TokenNameIdentifier	 fours B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(eights, fours, fours, foursA, foursB) 	TokenNameCOMMENT_LINE	CSA(eights, fours, fours, foursA, foursB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
foursB	TokenNameIdentifier	 fours B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
foursB	TokenNameIdentifier	 fours B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
,	TokenNameCOMMA	
twosB	TokenNameIdentifier	 twos B
,	TokenNameCOMMA	
foursA	TokenNameIdentifier	 fours A
,	TokenNameCOMMA	
eights	TokenNameIdentifier	 eights
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
long	TokenNamelong	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
long	TokenNamelong	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|	TokenNameOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
fours	TokenNameIdentifier	 fours
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
tot8	TokenNameIdentifier	 tot8
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the popcount or cardinality of A & ~B * Neither array is modified. */	TokenNameCOMMENT_JAVADOC	 Returns the popcount or cardinality of A & ~B Neither array is modified. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
pop_andnot	TokenNameIdentifier	 pop andnot
(	TokenNameLPAREN	
long	TokenNamelong	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
long	TokenNamelong	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
wordOffset	TokenNameIdentifier	 word Offset
,	TokenNameCOMMA	
int	TokenNameint	
numWords	TokenNameIdentifier	 num Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// generated from pop_array via sed 's/A\[\([^]]*\)\]/\(A[\1] \& ~B[\1]\)/g' 	TokenNameCOMMENT_LINE	generated from pop_array via sed 's/A\[\([^]]*\)\]/\(A[\1] \& ~B[\1]\)/g' 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
wordOffset	TokenNameIdentifier	 word Offset
+	TokenNamePLUS	
numWords	TokenNameIdentifier	 num Words
;	TokenNameSEMICOLON	
long	TokenNamelong	
tot	TokenNameIdentifier	 tot
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tot8	TokenNameIdentifier	 tot8
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
wordOffset	TokenNameIdentifier	 word Offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*** C macro from Hacker's Delight #define CSA(h,l, a,b,c) \ {unsigned u = a ^ b; unsigned v = c; \ h = (a & b) | (u & v); l = u ^ v;} ***/	TokenNameCOMMENT_JAVADOC	* C macro from Hacker's Delight #define CSA(h,l, a,b,c) \ {unsigned u = a ^ b; unsigned v = c; \ h = (a & b) | (u & v); l = u ^ v;} **
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
,	TokenNameCOMMA	
twosB	TokenNameIdentifier	 twos B
,	TokenNameCOMMA	
foursA	TokenNameIdentifier	 fours A
,	TokenNameCOMMA	
foursB	TokenNameIdentifier	 fours B
,	TokenNameCOMMA	
eights	TokenNameIdentifier	 eights
;	TokenNameSEMICOLON	
// CSA(twosA, ones, ones, (A[i] & ~B[i]), (A[i+1] & ~B[i+1])) 	TokenNameCOMMENT_LINE	CSA(twosA, ones, ones, (A[i] & ~B[i]), (A[i+1] & ~B[i+1])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSA(twosB, ones, ones, (A[i+2] & ~B[i+2]), (A[i+3] & ~B[i+3])) 	TokenNameCOMMENT_LINE	CSA(twosB, ones, ones, (A[i+2] & ~B[i+2]), (A[i+3] & ~B[i+3])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(foursA, twos, twos, twosA, twosB) 	TokenNameCOMMENT_LINE	CSA(foursA, twos, twos, twosA, twosB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(twosA, ones, ones, (A[i+4] & ~B[i+4]), (A[i+5] & ~B[i+5])) 	TokenNameCOMMENT_LINE	CSA(twosA, ones, ones, (A[i+4] & ~B[i+4]), (A[i+5] & ~B[i+5])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSA(twosB, ones, ones, (A[i+6] & ~B[i+6]), (A[i+7] & ~B[i+7])) 	TokenNameCOMMENT_LINE	CSA(twosB, ones, ones, (A[i+6] & ~B[i+6]), (A[i+7] & ~B[i+7])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(foursB, twos, twos, twosA, twosB) 	TokenNameCOMMENT_LINE	CSA(foursB, twos, twos, twosA, twosB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursB	TokenNameIdentifier	 fours B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(eights, fours, fours, foursA, foursB) 	TokenNameCOMMENT_LINE	CSA(eights, fours, fours, foursA, foursB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
foursB	TokenNameIdentifier	 fours B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
foursB	TokenNameIdentifier	 fours B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
,	TokenNameCOMMA	
twosB	TokenNameIdentifier	 twos B
,	TokenNameCOMMA	
foursA	TokenNameIdentifier	 fours A
,	TokenNameCOMMA	
eights	TokenNameIdentifier	 eights
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
long	TokenNamelong	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
long	TokenNamelong	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
~	TokenNameTWIDDLE	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
fours	TokenNameIdentifier	 fours
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
tot8	TokenNameIdentifier	 tot8
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
pop_xor	TokenNameIdentifier	 pop xor
(	TokenNameLPAREN	
long	TokenNamelong	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
long	TokenNamelong	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
wordOffset	TokenNameIdentifier	 word Offset
,	TokenNameCOMMA	
int	TokenNameint	
numWords	TokenNameIdentifier	 num Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
wordOffset	TokenNameIdentifier	 word Offset
+	TokenNamePLUS	
numWords	TokenNameIdentifier	 num Words
;	TokenNameSEMICOLON	
long	TokenNamelong	
tot	TokenNameIdentifier	 tot
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tot8	TokenNameIdentifier	 tot8
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
wordOffset	TokenNameIdentifier	 word Offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*** C macro from Hacker's Delight #define CSA(h,l, a,b,c) \ {unsigned u = a ^ b; unsigned v = c; \ h = (a & b) | (u & v); l = u ^ v;} ***/	TokenNameCOMMENT_JAVADOC	* C macro from Hacker's Delight #define CSA(h,l, a,b,c) \ {unsigned u = a ^ b; unsigned v = c; \ h = (a & b) | (u & v); l = u ^ v;} **
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
,	TokenNameCOMMA	
twosB	TokenNameIdentifier	 twos B
,	TokenNameCOMMA	
foursA	TokenNameIdentifier	 fours A
,	TokenNameCOMMA	
foursB	TokenNameIdentifier	 fours B
,	TokenNameCOMMA	
eights	TokenNameIdentifier	 eights
;	TokenNameSEMICOLON	
// CSA(twosA, ones, ones, (A[i] ^ B[i]), (A[i+1] ^ B[i+1])) 	TokenNameCOMMENT_LINE	CSA(twosA, ones, ones, (A[i] ^ B[i]), (A[i+1] ^ B[i+1])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSA(twosB, ones, ones, (A[i+2] ^ B[i+2]), (A[i+3] ^ B[i+3])) 	TokenNameCOMMENT_LINE	CSA(twosB, ones, ones, (A[i+2] ^ B[i+2]), (A[i+3] ^ B[i+3])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(foursA, twos, twos, twosA, twosB) 	TokenNameCOMMENT_LINE	CSA(foursA, twos, twos, twosA, twosB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(twosA, ones, ones, (A[i+4] ^ B[i+4]), (A[i+5] ^ B[i+5])) 	TokenNameCOMMENT_LINE	CSA(twosA, ones, ones, (A[i+4] ^ B[i+4]), (A[i+5] ^ B[i+5])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSA(twosB, ones, ones, (A[i+6] ^ B[i+6]), (A[i+7] ^ B[i+7])) 	TokenNameCOMMENT_LINE	CSA(twosB, ones, ones, (A[i+6] ^ B[i+6]), (A[i+7] ^ B[i+7])) 
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(foursB, twos, twos, twosA, twosB) 	TokenNameCOMMENT_LINE	CSA(foursB, twos, twos, twosA, twosB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursB	TokenNameIdentifier	 fours B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//CSA(eights, fours, fours, foursA, foursB) 	TokenNameCOMMENT_LINE	CSA(eights, fours, fours, foursA, foursB) 
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
foursB	TokenNameIdentifier	 fours B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
foursB	TokenNameIdentifier	 fours B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
,	TokenNameCOMMA	
twosB	TokenNameIdentifier	 twos B
,	TokenNameCOMMA	
foursA	TokenNameIdentifier	 fours A
,	TokenNameCOMMA	
eights	TokenNameIdentifier	 eights
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
twosB	TokenNameIdentifier	 twos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
twosB	TokenNameIdentifier	 twos B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
twosB	TokenNameIdentifier	 twos B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ones	TokenNameIdentifier	 ones
^	TokenNameXOR	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
long	TokenNamelong	
twosA	TokenNameIdentifier	 twos A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
&	TokenNameAND	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
&	TokenNameAND	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ones	TokenNameIdentifier	 ones
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
^	TokenNameXOR	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
long	TokenNamelong	
foursA	TokenNameIdentifier	 fours A
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
&	TokenNameAND	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
twos	TokenNameIdentifier	 twos
=	TokenNameEQUAL	
twos	TokenNameIdentifier	 twos
^	TokenNameXOR	
twosA	TokenNameIdentifier	 twos A
;	TokenNameSEMICOLON	
long	TokenNamelong	
eights	TokenNameIdentifier	 eights
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
&	TokenNameAND	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
fours	TokenNameIdentifier	 fours
=	TokenNameEQUAL	
fours	TokenNameIdentifier	 fours
^	TokenNameXOR	
foursA	TokenNameIdentifier	 fours A
;	TokenNameSEMICOLON	
tot8	TokenNameIdentifier	 tot8
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
eights	TokenNameIdentifier	 eights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
^	TokenNameXOR	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
fours	TokenNameIdentifier	 fours
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
twos	TokenNameIdentifier	 twos
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
ones	TokenNameIdentifier	 ones
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
tot8	TokenNameIdentifier	 tot8
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* python code to generate ntzTable def ntz(val): if val==0: return 8 i=0 while (val&0x01)==0: i = i+1 val >>= 1 return i print ','.join([ str(ntz(i)) for i in range(256) ]) ***/	TokenNameCOMMENT_BLOCK	 python code to generate ntzTable def ntz(val): if val==0: return 8 i=0 while (val&0x01)==0: i = i+1 val >>= 1 return i print ','.join([ str(ntz(i)) for i in range(256) ]) **
/** table of number of trailing zeros in a byte */	TokenNameCOMMENT_JAVADOC	 table of number of trailing zeros in a byte 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ntzTable	TokenNameIdentifier	 ntz Table
=	TokenNameEQUAL	
{	TokenNameLBRACE	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Returns number of trailing zeros in a 64 bit long value. */	TokenNameCOMMENT_JAVADOC	 Returns number of trailing zeros in a 64 bit long value. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
ntz	TokenNameIdentifier	 ntz
(	TokenNameLPAREN	
long	TokenNamelong	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A full binary search to determine the low byte was slower than 	TokenNameCOMMENT_LINE	A full binary search to determine the low byte was slower than 
// a linear search for nextSetBit(). This is most likely because 	TokenNameCOMMENT_LINE	a linear search for nextSetBit(). This is most likely because 
// the implementation of nextSetBit() shifts bits to the right, increasing 	TokenNameCOMMENT_LINE	the implementation of nextSetBit() shifts bits to the right, increasing 
// the probability that the first non-zero byte is in the rhs. 	TokenNameCOMMENT_LINE	the probability that the first non-zero byte is in the rhs. 
// 	TokenNameCOMMENT_LINE	 
// This implementation does a single binary search at the top level only 	TokenNameCOMMENT_LINE	This implementation does a single binary search at the top level only 
// so that all other bit shifting can be done on ints instead of longs to 	TokenNameCOMMENT_LINE	so that all other bit shifting can be done on ints instead of longs to 
// remain friendly to 32 bit architectures. In addition, the case of a 	TokenNameCOMMENT_LINE	remain friendly to 32 bit architectures. In addition, the case of a 
// non-zero first byte is checked for first because it is the most common 	TokenNameCOMMENT_LINE	non-zero first byte is checked for first because it is the most common 
// in dense bit arrays. 	TokenNameCOMMENT_LINE	in dense bit arrays. 
int	TokenNameint	
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
int	TokenNameint	
lowByte	TokenNameIdentifier	 low Byte
=	TokenNameEQUAL	
lower	TokenNameIdentifier	 lower
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowByte	TokenNameIdentifier	 low Byte
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
lowByte	TokenNameIdentifier	 low Byte
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lowByte	TokenNameIdentifier	 low Byte
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowByte	TokenNameIdentifier	 low Byte
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
lowByte	TokenNameIdentifier	 low Byte
]	TokenNameRBRACKET	
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lowByte	TokenNameIdentifier	 low Byte
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowByte	TokenNameIdentifier	 low Byte
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
lowByte	TokenNameIdentifier	 low Byte
]	TokenNameRBRACKET	
+	TokenNamePLUS	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// no need to mask off low byte for the last byte in the 32 bit word 	TokenNameCOMMENT_LINE	no need to mask off low byte for the last byte in the 32 bit word 
// no need to check for zero on the last byte either. 	TokenNameCOMMENT_LINE	no need to check for zero on the last byte either. 
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
lower	TokenNameIdentifier	 lower
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// grab upper 32 bits 	TokenNameCOMMENT_LINE	grab upper 32 bits 
int	TokenNameint	
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowByte	TokenNameIdentifier	 low Byte
=	TokenNameEQUAL	
upper	TokenNameIdentifier	 upper
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowByte	TokenNameIdentifier	 low Byte
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
lowByte	TokenNameIdentifier	 low Byte
]	TokenNameRBRACKET	
+	TokenNamePLUS	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lowByte	TokenNameIdentifier	 low Byte
=	TokenNameEQUAL	
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowByte	TokenNameIdentifier	 low Byte
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
lowByte	TokenNameIdentifier	 low Byte
]	TokenNameRBRACKET	
+	TokenNamePLUS	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lowByte	TokenNameIdentifier	 low Byte
=	TokenNameEQUAL	
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowByte	TokenNameIdentifier	 low Byte
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
lowByte	TokenNameIdentifier	 low Byte
]	TokenNameRBRACKET	
+	TokenNamePLUS	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// no need to mask off low byte for the last byte in the 32 bit word 	TokenNameCOMMENT_LINE	no need to mask off low byte for the last byte in the 32 bit word 
// no need to check for zero on the last byte either. 	TokenNameCOMMENT_LINE	no need to check for zero on the last byte either. 
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
upper	TokenNameIdentifier	 upper
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
56	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns number of trailing zeros in a 32 bit int value. */	TokenNameCOMMENT_JAVADOC	 Returns number of trailing zeros in a 32 bit int value. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
ntz	TokenNameIdentifier	 ntz
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This implementation does a single binary search at the top level only. 	TokenNameCOMMENT_LINE	This implementation does a single binary search at the top level only. 
// In addition, the case of a non-zero first byte is checked for first 	TokenNameCOMMENT_LINE	In addition, the case of a non-zero first byte is checked for first 
// because it is the most common in dense bit arrays. 	TokenNameCOMMENT_LINE	because it is the most common in dense bit arrays. 
int	TokenNameint	
lowByte	TokenNameIdentifier	 low Byte
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowByte	TokenNameIdentifier	 low Byte
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
lowByte	TokenNameIdentifier	 low Byte
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lowByte	TokenNameIdentifier	 low Byte
=	TokenNameEQUAL	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowByte	TokenNameIdentifier	 low Byte
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
lowByte	TokenNameIdentifier	 low Byte
]	TokenNameRBRACKET	
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lowByte	TokenNameIdentifier	 low Byte
=	TokenNameEQUAL	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowByte	TokenNameIdentifier	 low Byte
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
lowByte	TokenNameIdentifier	 low Byte
]	TokenNameRBRACKET	
+	TokenNamePLUS	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// no need to mask off low byte for the last byte. 	TokenNameCOMMENT_LINE	no need to mask off low byte for the last byte. 
// no need to check for zero on the last byte either. 	TokenNameCOMMENT_LINE	no need to check for zero on the last byte either. 
return	TokenNamereturn	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
val	TokenNameIdentifier	 val
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns 0 based index of first set bit * (only works for x!=0) * <br/> This is an alternate implementation of ntz() */	TokenNameCOMMENT_JAVADOC	 returns 0 based index of first set bit (only works for x!=0) <br/> This is an alternate implementation of ntz() 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
ntz2	TokenNameIdentifier	 ntz2
(	TokenNameLPAREN	
long	TokenNamelong	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// the only 64 bit shift necessary 	TokenNameCOMMENT_LINE	the only 64 bit shift necessary 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
&	TokenNameAND	
0x0000FFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
&	TokenNameAND	
0x000000FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ntzTable	TokenNameIdentifier	 ntz Table
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns 0 based index of first set bit * <br/> This is an alternate implementation of ntz() */	TokenNameCOMMENT_JAVADOC	 returns 0 based index of first set bit <br/> This is an alternate implementation of ntz() 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
ntz3	TokenNameIdentifier	 ntz3
(	TokenNameLPAREN	
long	TokenNamelong	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// another implementation taken from Hackers Delight, extended to 64 bits 	TokenNameCOMMENT_LINE	another implementation taken from Hackers Delight, extended to 64 bits 
// and converted to Java. 	TokenNameCOMMENT_LINE	and converted to Java. 
// Many 32 bit ntz algorithms are at http://www.hackersdelight.org/HDcode/ntz.cc 	TokenNameCOMMENT_LINE	Many 32 bit ntz algorithms are at http://www.hackersdelight.org/HDcode/ntz.cc 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// do the first step as a long, all others as ints. 	TokenNameCOMMENT_LINE	do the first step as a long, all others as ints. 
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
&	TokenNameAND	
0x0000FFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
&	TokenNameAND	
0x000000FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
&	TokenNameAND	
0x0000000F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
&	TokenNameAND	
0x00000003	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns true if v is a power of two or zero*/	TokenNameCOMMENT_JAVADOC	 returns true if v is a power of two or zero
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isPowerOfTwo	TokenNameIdentifier	 is Power Of Two
(	TokenNameLPAREN	
int	TokenNameint	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
&	TokenNameAND	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns true if v is a power of two or zero*/	TokenNameCOMMENT_JAVADOC	 returns true if v is a power of two or zero
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isPowerOfTwo	TokenNameIdentifier	 is Power Of Two
(	TokenNameLPAREN	
long	TokenNamelong	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
&	TokenNameAND	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns the next highest power of two, or the current value if it's already a power of two or zero*/	TokenNameCOMMENT_JAVADOC	 returns the next highest power of two, or the current value if it's already a power of two or zero
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
nextHighestPowerOfTwo	TokenNameIdentifier	 next Highest Power Of Two
(	TokenNameLPAREN	
int	TokenNameint	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns the next highest power of two, or the current value if it's already a power of two or zero*/	TokenNameCOMMENT_JAVADOC	 returns the next highest power of two, or the current value if it's already a power of two or zero
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
nextHighestPowerOfTwo	TokenNameIdentifier	 next Highest Power Of Two
(	TokenNameLPAREN	
long	TokenNamelong	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
