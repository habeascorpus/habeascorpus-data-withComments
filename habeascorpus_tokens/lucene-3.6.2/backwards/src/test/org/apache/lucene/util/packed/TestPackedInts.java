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
*	TokenNameMULTIPLY	
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestPackedInts	TokenNameIdentifier	 Test Packed Ints
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBitsRequired	TokenNameIdentifier	 test Bits Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
bitsRequired	TokenNameIdentifier	 bits Required
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
61	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
bitsRequired	TokenNameIdentifier	 bits Required
(	TokenNameLPAREN	
0x1FFFFFFFFFFFFFFFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
bitsRequired	TokenNameIdentifier	 bits Required
(	TokenNameLPAREN	
0x3FFFFFFFFFFFFFFFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
bitsRequired	TokenNameIdentifier	 bits Required
(	TokenNameLPAREN	
0x7FFFFFFFFFFFFFFFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMaxValues	TokenNameIdentifier	 test Max Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1 bit -> max == 1"	TokenNameStringLiteral	1 bit -> max == 1
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2 bit -> max == 3"	TokenNameStringLiteral	2 bit -> max == 3
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"8 bit -> max == 255"	TokenNameStringLiteral	8 bit -> max == 255
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"63 bit -> max == Long.MAX_VALUE"	TokenNameStringLiteral	63 bit -> max == Long.MAX_VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"64 bit -> max == Long.MAX_VALUE (same as for 63 bit)"	TokenNameStringLiteral	64 bit -> max == Long.MAX_VALUE (same as for 63 bit)
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPackedInts	TokenNameIdentifier	 test Packed Ints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
ceil	TokenNameIdentifier	 ceil
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nbits	TokenNameIdentifier	 nbits
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nbits	TokenNameIdentifier	 nbits
<	TokenNameLESS	
63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nbits	TokenNameIdentifier	 nbits
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
"out.bin"	TokenNameStringLiteral	out.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
nbits	TokenNameIdentifier	 nbits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
valueCount	TokenNameIdentifier	 value Count
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
valueCount	TokenNameIdentifier	 value Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
ceil	TokenNameIdentifier	 ceil
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
-	TokenNameMINUS	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
// test reader 	TokenNameCOMMENT_LINE	test reader 
IndexInput	TokenNameIdentifier	 Index Input
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"out.bin"	TokenNameStringLiteral	out.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
fp	TokenNameIdentifier	 fp
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
valueCount	TokenNameIdentifier	 value Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"index="	TokenNameStringLiteral	index=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" ceil="	TokenNameStringLiteral	 ceil=
+	TokenNamePLUS	
ceil	TokenNameIdentifier	 ceil
+	TokenNamePLUS	
" valueCount="	TokenNameStringLiteral	 valueCount=
+	TokenNamePLUS	
valueCount	TokenNameIdentifier	 value Count
+	TokenNamePLUS	
" nbits="	TokenNameStringLiteral	 nbits=
+	TokenNamePLUS	
nbits	TokenNameIdentifier	 nbits
+	TokenNamePLUS	
" for "	TokenNameStringLiteral	 for 
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ceil	TokenNameIdentifier	 ceil
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testControlledEquality	TokenNameIdentifier	 test Controlled Equality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
VALUE_COUNT	TokenNameIdentifier	 VALUE  COUNT
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
BITS_PER_VALUE	TokenNameIdentifier	 BITS  PER  VALUE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
>	TokenNameGREATER	
packedInts	TokenNameIdentifier	 packed Ints
=	TokenNameEQUAL	
createPackedInts	TokenNameIdentifier	 create Packed Ints
(	TokenNameLPAREN	
VALUE_COUNT	TokenNameIdentifier	 VALUE  COUNT
,	TokenNameCOMMA	
BITS_PER_VALUE	TokenNameIdentifier	 BITS  PER  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
packedInt	TokenNameIdentifier	 packed Int
:	TokenNameCOLON	
packedInts	TokenNameIdentifier	 packed Ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
packedInt	TokenNameIdentifier	 packed Int
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packedInt	TokenNameIdentifier	 packed Int
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertListEquality	TokenNameIdentifier	 assert List Equality
(	TokenNameLPAREN	
packedInts	TokenNameIdentifier	 packed Ints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRandomEquality	TokenNameIdentifier	 test Random Equality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALUE_COUNTS	TokenNameIdentifier	 VALUE  COUNTS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
500	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
MIN_BITS_PER_VALUE	TokenNameIdentifier	 MIN  BITS  PER  VALUE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
MAX_BITS_PER_VALUE	TokenNameIdentifier	 MAX  BITS  PER  VALUE
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
:	TokenNameCOLON	
VALUE_COUNTS	TokenNameIdentifier	 VALUE  COUNTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
=	TokenNameEQUAL	
MIN_BITS_PER_VALUE	TokenNameIdentifier	 MIN  BITS  PER  VALUE
;	TokenNameSEMICOLON	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
MAX_BITS_PER_VALUE	TokenNameIdentifier	 MAX  BITS  PER  VALUE
;	TokenNameSEMICOLON	
bitsPerValue	TokenNameIdentifier	 bits Per Value
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertRandomEquality	TokenNameIdentifier	 assert Random Equality
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertRandomEquality	TokenNameIdentifier	 assert Random Equality
(	TokenNameLPAREN	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
,	TokenNameCOMMA	
long	TokenNamelong	
randomSeed	TokenNameIdentifier	 random Seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
>	TokenNameGREATER	
packedInts	TokenNameIdentifier	 packed Ints
=	TokenNameEQUAL	
createPackedInts	TokenNameIdentifier	 create Packed Ints
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
packedInt	TokenNameIdentifier	 packed Int
:	TokenNameCOLON	
packedInts	TokenNameIdentifier	 packed Ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
packedInt	TokenNameIdentifier	 packed Int
,	TokenNameCOMMA	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
randomSeed	TokenNameIdentifier	 random Seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Exception while filling %s: valueCount=%d, bitsPerValue=%s"	TokenNameStringLiteral	Exception while filling %s: valueCount=%d, bitsPerValue=%s
,	TokenNameCOMMA	
packedInt	TokenNameIdentifier	 packed Int
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertListEquality	TokenNameIdentifier	 assert List Equality
(	TokenNameLPAREN	
packedInts	TokenNameIdentifier	 packed Ints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
>	TokenNameGREATER	
createPackedInts	TokenNameIdentifier	 create Packed Ints
(	TokenNameLPAREN	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
>	TokenNameGREATER	
packedInts	TokenNameIdentifier	 packed Ints
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Direct8	TokenNameIdentifier	 Direct8
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Direct16	TokenNameIdentifier	 Direct16
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Packed32	TokenNameIdentifier	 Packed32
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Direct32	TokenNameIdentifier	 Direct32
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Packed64	TokenNameIdentifier	 Packed64
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Direct64	TokenNameIdentifier	 Direct64
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
packedInts	TokenNameIdentifier	 packed Ints
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
packedInt	TokenNameIdentifier	 packed Int
,	TokenNameCOMMA	
long	TokenNamelong	
maxValue	TokenNameIdentifier	 max Value
,	TokenNameCOMMA	
long	TokenNamelong	
randomSeed	TokenNameIdentifier	 random Seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Random	TokenNameIdentifier	 Random
rnd2	TokenNameIdentifier	 rnd2
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
randomSeed	TokenNameIdentifier	 random Seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxValue	TokenNameIdentifier	 max Value
++	TokenNamePLUS_PLUS	
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
packedInt	TokenNameIdentifier	 packed Int
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
rnd2	TokenNameIdentifier	 rnd2
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
maxValue	TokenNameIdentifier	 max Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
packedInt	TokenNameIdentifier	 packed Int
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"The set/get of the value at index %d should match for %s"	TokenNameStringLiteral	The set/get of the value at index %d should match for %s
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
packedInt	TokenNameIdentifier	 packed Int
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
packedInt	TokenNameIdentifier	 packed Int
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertListEquality	TokenNameIdentifier	 assert List Equality
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
>	TokenNameGREATER	
packedInts	TokenNameIdentifier	 packed Ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertListEquality	TokenNameIdentifier	 assert List Equality
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
packedInts	TokenNameIdentifier	 packed Ints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertListEquality	TokenNameIdentifier	 assert List Equality
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
>	TokenNameGREATER	
packedInts	TokenNameIdentifier	 packed Ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
packedInt	TokenNameIdentifier	 packed Int
:	TokenNameCOLON	
packedInts	TokenNameIdentifier	 packed Ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
+	TokenNamePLUS	
". The number of values should be the same "	TokenNameStringLiteral	. The number of values should be the same 
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
packedInt	TokenNameIdentifier	 packed Int
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
valueCount	TokenNameIdentifier	 value Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s. The value at index %d should be the same for %s and %s"	TokenNameStringLiteral	%s. The value at index %d should be the same for %s and %s
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
packedInts	TokenNameIdentifier	 packed Ints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSingleValue	TokenNameIdentifier	 test Single Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
"out"	TokenNameStringLiteral	out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"out"	TokenNameStringLiteral	out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSecondaryBlockChange	TokenNameIdentifier	 test Secondary Block Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
mutable	TokenNameIdentifier	 mutable
=	TokenNameEQUAL	
new	TokenNamenew	
Packed64	TokenNameIdentifier	 Packed64
(	TokenNameLPAREN	
26	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mutable	TokenNameIdentifier	 mutable
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"The value #24 should be correct"	TokenNameStringLiteral	The value #24 should be correct
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mutable	TokenNameIdentifier	 mutable
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mutable	TokenNameIdentifier	 mutable
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"The value #24 should remain unchanged"	TokenNameStringLiteral	The value #24 should remain unchanged
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mutable	TokenNameIdentifier	 mutable
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Check if the structures properly handle the case where index * bitsPerValue > Integer.MAX_VALUE NOTE: this test allocates 256 MB */	TokenNameCOMMENT_BLOCK	 Check if the structures properly handle the case where index bitsPerValue > Integer.MAX_VALUE NOTE: this test allocates 256 MB 
public	TokenNamepublic	
void	TokenNamevoid	
testIntOverflow	TokenNameIdentifier	 test Int Overflow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
INDEX	TokenNameIdentifier	 INDEX
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
BITS	TokenNameIdentifier	 BITS
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Packed32	TokenNameIdentifier	 Packed32
p32	TokenNameIdentifier	 p32
=	TokenNameEQUAL	
new	TokenNamenew	
Packed32	TokenNameIdentifier	 Packed32
(	TokenNameLPAREN	
INDEX	TokenNameIdentifier	 INDEX
,	TokenNameCOMMA	
BITS	TokenNameIdentifier	 BITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p32	TokenNameIdentifier	 p32
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
INDEX	TokenNameIdentifier	 INDEX
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"The value at position "	TokenNameStringLiteral	The value at position 
+	TokenNamePLUS	
(	TokenNameLPAREN	
INDEX	TokenNameIdentifier	 INDEX
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" should be correct for Packed32"	TokenNameStringLiteral	 should be correct for Packed32
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p32	TokenNameIdentifier	 p32
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
INDEX	TokenNameIdentifier	 INDEX
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p32	TokenNameIdentifier	 p32
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// To free the 256MB used 	TokenNameCOMMENT_LINE	To free the 256MB used 
Packed64	TokenNameIdentifier	 Packed64
p64	TokenNameIdentifier	 p64
=	TokenNameEQUAL	
new	TokenNamenew	
Packed64	TokenNameIdentifier	 Packed64
(	TokenNameLPAREN	
INDEX	TokenNameIdentifier	 INDEX
,	TokenNameCOMMA	
BITS	TokenNameIdentifier	 BITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p64	TokenNameIdentifier	 p64
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
INDEX	TokenNameIdentifier	 INDEX
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"The value at position "	TokenNameStringLiteral	The value at position 
+	TokenNamePLUS	
(	TokenNameLPAREN	
INDEX	TokenNameIdentifier	 INDEX
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" should be correct for Packed64"	TokenNameStringLiteral	 should be correct for Packed64
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p64	TokenNameIdentifier	 p64
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
INDEX	TokenNameIdentifier	 INDEX
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
