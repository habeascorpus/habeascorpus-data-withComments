package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* Class that Posting and PostingVector use to write byte * streams into shared fixed-size byte[] arrays. The idea * is to allocate slices of increasing lengths For * example, the first slice is 5 bytes, the next slice is * 14, etc. We start by writing our bytes into the first * 5 bytes. When we hit the end of the slice, we allocate * the next slice and then write the address of the new * slice into the last 4 bytes of the previous slice (the * "forwarding address"). * * Each slice is filled with 0's initially, and we mark * the end with a non-zero byte. This way the methods * that are writing into the slice don't need to record * its length and instead allocate a new slice once they * hit a non-zero byte. */	TokenNameCOMMENT_BLOCK	 Class that Posting and PostingVector use to write byte streams into shared fixed-size byte[] arrays. The idea is to allocate slices of increasing lengths For example, the first slice is 5 bytes, the next slice is 14, etc. We start by writing our bytes into the first 5 bytes. When we hit the end of the slice, we allocate the next slice and then write the address of the new slice into the last 4 bytes of the previous slice (the "forwarding address"). * Each slice is filled with 0's initially, and we mark the end with a non-zero byte. This way the methods that are writing into the slice don't need to record its length and instead allocate a new slice once they hit a non-zero byte. 
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
List	TokenNameIdentifier	 List
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
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
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
ArrayUtil	TokenNameIdentifier	 Array Util
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
{	TokenNameLBRACE	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
Allocator	TokenNameIdentifier	 Allocator
{	TokenNameLBRACE	
abstract	TokenNameabstract	
void	TokenNamevoid	
recycleByteBlocks	TokenNameIdentifier	 recycle Byte Blocks
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blocks	TokenNameIdentifier	 blocks
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
void	TokenNamevoid	
recycleByteBlocks	TokenNameIdentifier	 recycle Byte Blocks
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
blocks	TokenNameIdentifier	 blocks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getByteBlock	TokenNameIdentifier	 get Byte Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
bufferUpto	TokenNameIdentifier	 buffer Upto
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Which buffer we are upto 	TokenNameCOMMENT_LINE	Which buffer we are upto 
public	TokenNamepublic	
int	TokenNameint	
byteUpto	TokenNameIdentifier	 byte Upto
=	TokenNameEQUAL	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
// Where we are in head buffer 	TokenNameCOMMENT_LINE	Where we are in head buffer 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
// Current head buffer 	TokenNameCOMMENT_LINE	Current head buffer 
public	TokenNamepublic	
int	TokenNameint	
byteOffset	TokenNameIdentifier	 byte Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
// Current head offset 	TokenNameCOMMENT_LINE	Current head offset 
private	TokenNameprivate	
final	TokenNamefinal	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
(	TokenNameLPAREN	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
allocator	TokenNameIdentifier	 allocator
=	TokenNameEQUAL	
allocator	TokenNameIdentifier	 allocator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferUpto	TokenNameIdentifier	 buffer Upto
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We allocated at least one buffer 	TokenNameCOMMENT_LINE	We allocated at least one buffer 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
bufferUpto	TokenNameIdentifier	 buffer Upto
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
// Fully zero fill buffers that we fully used 	TokenNameCOMMENT_LINE	Fully zero fill buffers that we fully used 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Partial zero fill the final buffer 	TokenNameCOMMENT_LINE	Partial zero fill the final buffer 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
bufferUpto	TokenNameIdentifier	 buffer Upto
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
byteUpto	TokenNameIdentifier	 byte Upto
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bufferUpto	TokenNameIdentifier	 buffer Upto
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// Recycle all but the first buffer 	TokenNameCOMMENT_LINE	Recycle all but the first buffer 
allocator	TokenNameIdentifier	 allocator
.	TokenNameDOT	
recycleByteBlocks	TokenNameIdentifier	 recycle Byte Blocks
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bufferUpto	TokenNameIdentifier	 buffer Upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Re-use the first buffer 	TokenNameCOMMENT_LINE	Re-use the first buffer 
bufferUpto	TokenNameIdentifier	 buffer Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteUpto	TokenNameIdentifier	 byte Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteOffset	TokenNameIdentifier	 byte Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bufferUpto	TokenNameIdentifier	 buffer Upto
==	TokenNameEQUAL_EQUAL	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffers	TokenNameIdentifier	 new Buffers
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBuffers	TokenNameIdentifier	 new Buffers
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
newBuffers	TokenNameIdentifier	 new Buffers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bufferUpto	TokenNameIdentifier	 buffer Upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
allocator	TokenNameIdentifier	 allocator
.	TokenNameDOT	
getByteBlock	TokenNameIdentifier	 get Byte Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferUpto	TokenNameIdentifier	 buffer Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
byteUpto	TokenNameIdentifier	 byte Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteOffset	TokenNameIdentifier	 byte Offset
+=	TokenNamePLUS_EQUAL	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
newSlice	TokenNameIdentifier	 new Slice
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
byteUpto	TokenNameIdentifier	 byte Upto
>	TokenNameGREATER	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
-	TokenNameMINUS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
byteUpto	TokenNameIdentifier	 byte Upto
;	TokenNameSEMICOLON	
byteUpto	TokenNameIdentifier	 byte Upto
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
byteUpto	TokenNameIdentifier	 byte Upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Size of each slice. These arrays should be at most 16 	TokenNameCOMMENT_LINE	Size of each slice. These arrays should be at most 16 
// elements (index is encoded with 4 bits). First array 	TokenNameCOMMENT_LINE	elements (index is encoded with 4 bits). First array 
// is just a compact way to encode X+1 with a max. Second 	TokenNameCOMMENT_LINE	is just a compact way to encode X+1 with a max. Second 
// array is the length of each slice, ie first slice is 5 	TokenNameCOMMENT_LINE	array is the length of each slice, ie first slice is 5 
// bytes, next slice is 14 bytes, etc. 	TokenNameCOMMENT_LINE	bytes, next slice is 14 bytes, etc. 
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nextLevelArray	TokenNameIdentifier	 next Level Array
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
levelSizeArray	TokenNameIdentifier	 level Size Array
=	TokenNameEQUAL	
{	TokenNameLBRACE	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
120	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
FIRST_LEVEL_SIZE	TokenNameIdentifier	 FIRST  LEVEL  SIZE
=	TokenNameEQUAL	
levelSizeArray	TokenNameIdentifier	 level Size Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
allocSlice	TokenNameIdentifier	 alloc Slice
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slice	TokenNameIdentifier	 slice
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
&	TokenNameAND	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newLevel	TokenNameIdentifier	 new Level
=	TokenNameEQUAL	
nextLevelArray	TokenNameIdentifier	 next Level Array
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
levelSizeArray	TokenNameIdentifier	 level Size Array
[	TokenNameLBRACKET	
newLevel	TokenNameIdentifier	 new Level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Maybe allocate another block 	TokenNameCOMMENT_LINE	Maybe allocate another block 
if	TokenNameif	
(	TokenNameLPAREN	
byteUpto	TokenNameIdentifier	 byte Upto
>	TokenNameGREATER	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
-	TokenNameMINUS	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newUpto	TokenNameIdentifier	 new Upto
=	TokenNameEQUAL	
byteUpto	TokenNameIdentifier	 byte Upto
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
newUpto	TokenNameIdentifier	 new Upto
+	TokenNamePLUS	
byteOffset	TokenNameIdentifier	 byte Offset
;	TokenNameSEMICOLON	
byteUpto	TokenNameIdentifier	 byte Upto
+=	TokenNamePLUS_EQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
// Copy forward the past 3 bytes (which we are about 	TokenNameCOMMENT_LINE	Copy forward the past 3 bytes (which we are about 
// to overwrite with the forwarding address): 	TokenNameCOMMENT_LINE	to overwrite with the forwarding address): 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
newUpto	TokenNameIdentifier	 new Upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
newUpto	TokenNameIdentifier	 new Upto
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
newUpto	TokenNameIdentifier	 new Upto
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Write forwarding address at end of last slice: 	TokenNameCOMMENT_LINE	Write forwarding address at end of last slice: 
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
// Write new level: 	TokenNameCOMMENT_LINE	Write new level: 
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
byteUpto	TokenNameIdentifier	 byte Upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
|	TokenNameOR	
newLevel	TokenNameIdentifier	 new Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newUpto	TokenNameIdentifier	 new Upto
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
