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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
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
/** * Class that Posting and PostingVector use to write byte * streams into shared fixed-size byte[] arrays. The idea * is to allocate slices of increasing lengths For * example, the first slice is 5 bytes, the next slice is * 14, etc. We start by writing our bytes into the first * 5 bytes. When we hit the end of the slice, we allocate * the next slice and then write the address of the new * slice into the last 4 bytes of the previous slice (the * "forwarding address"). * * Each slice is filled with 0's initially, and we mark * the end with a non-zero byte. This way the methods * that are writing into the slice don't need to record * its length and instead allocate a new slice once they * hit a non-zero byte. * * @lucene.internal **/	TokenNameCOMMENT_JAVADOC	 Class that Posting and PostingVector use to write byte streams into shared fixed-size byte[] arrays. The idea is to allocate slices of increasing lengths For example, the first slice is 5 bytes, the next slice is 14, etc. We start by writing our bytes into the first 5 bytes. When we hit the end of the slice, we allocate the next slice and then write the address of the new slice into the last 4 bytes of the previous slice (the "forwarding address"). * Each slice is filled with 0's initially, and we mark the end with a non-zero byte. This way the methods that are writing into the slice don't need to record its length and instead allocate a new slice once they hit a non-zero byte. * @lucene.internal *
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
BYTE_BLOCK_SHIFT	TokenNameIdentifier	 BYTE  BLOCK  SHIFT
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
BYTE_BLOCK_SHIFT	TokenNameIdentifier	 BYTE  BLOCK  SHIFT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
BYTE_BLOCK_MASK	TokenNameIdentifier	 BYTE  BLOCK  MASK
=	TokenNameEQUAL	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Abstract class for allocating and freeing byte * blocks. */	TokenNameCOMMENT_JAVADOC	 Abstract class for allocating and freeing byte blocks. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
Allocator	TokenNameIdentifier	 Allocator
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Allocator	TokenNameIdentifier	 Allocator
(	TokenNameLPAREN	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
public	TokenNamepublic	
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
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recycleByteBlocks	TokenNameIdentifier	 recycle Byte Blocks
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getByteBlock	TokenNameIdentifier	 get Byte Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** A simple {@link Allocator} that never recycles. */	TokenNameCOMMENT_JAVADOC	 A simple {@link Allocator} that never recycles. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
DirectAllocator	TokenNameIdentifier	 Direct Allocator
extends	TokenNameextends	
Allocator	TokenNameIdentifier	 Allocator
{	TokenNameLBRACE	
public	TokenNamepublic	
DirectAllocator	TokenNameIdentifier	 Direct Allocator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DirectAllocator	TokenNameIdentifier	 Direct Allocator
(	TokenNameLPAREN	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** A simple {@link Allocator} that never recycles, but * tracks how much total RAM is in use. */	TokenNameCOMMENT_JAVADOC	 A simple {@link Allocator} that never recycles, but tracks how much total RAM is in use. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DirectTrackingAllocator	TokenNameIdentifier	 Direct Tracking Allocator
extends	TokenNameextends	
Allocator	TokenNameIdentifier	 Allocator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DirectTrackingAllocator	TokenNameIdentifier	 Direct Tracking Allocator
(	TokenNameLPAREN	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
,	TokenNameCOMMA	
bytesUsed	TokenNameIdentifier	 bytes Used
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DirectTrackingAllocator	TokenNameIdentifier	 Direct Tracking Allocator
(	TokenNameLPAREN	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
=	TokenNameEQUAL	
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getByteBlock	TokenNameIdentifier	 get Byte Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
{	TokenNameLBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
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
dropBuffersAndReset	TokenNameIdentifier	 drop Buffers And Reset
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
// Recycle all but the first buffer 	TokenNameCOMMENT_LINE	Recycle all but the first buffer 
allocator	TokenNameIdentifier	 allocator
.	TokenNameDOT	
recycleByteBlocks	TokenNameIdentifier	 recycle Byte Blocks
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bufferUpto	TokenNameIdentifier	 buffer Upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Re-use the first buffer 	TokenNameCOMMENT_LINE	Re-use the first buffer 
bufferUpto	TokenNameIdentifier	 buffer Upto
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byteUpto	TokenNameIdentifier	 byte Upto
=	TokenNameEQUAL	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
byteOffset	TokenNameIdentifier	 byte Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
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
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
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
public	TokenNamepublic	
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
public	TokenNamepublic	
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
// Fill in a BytesRef from term's length & bytes encoded in 	TokenNameCOMMENT_LINE	Fill in a BytesRef from term's length & bytes encoded in 
// byte block 	TokenNameCOMMENT_LINE	byte block 
public	TokenNamepublic	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
setBytesRef	TokenNameIdentifier	 set Bytes Ref
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
textStart	TokenNameIdentifier	 text Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
textStart	TokenNameIdentifier	 text Start
>>	TokenNameRIGHT_SHIFT	
BYTE_BLOCK_SHIFT	TokenNameIdentifier	 BYTE  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
textStart	TokenNameIdentifier	 text Start
&	TokenNameAND	
BYTE_BLOCK_MASK	TokenNameIdentifier	 BYTE  BLOCK  MASK
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
&	TokenNameAND	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// length is 1 byte 	TokenNameCOMMENT_LINE	length is 1 byte 
term	TokenNameIdentifier	 term
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// length is 2 bytes 	TokenNameCOMMENT_LINE	length is 2 bytes 
term	TokenNameIdentifier	 term
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
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
term	TokenNameIdentifier	 term
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies the given {@link BytesRef} at the current positions ( * {@link #byteUpto} across buffer boundaries */	TokenNameCOMMENT_JAVADOC	 Copies the given {@link BytesRef} at the current positions ( {@link #byteUpto} across buffer boundaries 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
overflow	TokenNameIdentifier	 overflow
=	TokenNameEQUAL	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
byteUpto	TokenNameIdentifier	 byte Upto
)	TokenNameRPAREN	
-	TokenNameMINUS	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
overflow	TokenNameIdentifier	 overflow
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
byteUpto	TokenNameIdentifier	 byte Upto
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byteUpto	TokenNameIdentifier	 byte Upto
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
overflow	TokenNameIdentifier	 overflow
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
byteUpto	TokenNameIdentifier	 byte Upto
,	TokenNameCOMMA	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
-=	TokenNameMINUS_EQUAL	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
;	TokenNameSEMICOLON	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
overflow	TokenNameIdentifier	 overflow
=	TokenNameEQUAL	
overflow	TokenNameIdentifier	 overflow
-	TokenNameMINUS	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bufferIndex	TokenNameIdentifier	 buffer Index
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
>>	TokenNameRIGHT_SHIFT	
BYTE_BLOCK_SHIFT	TokenNameIdentifier	 BYTE  BLOCK  SHIFT
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
bufferIndex	TokenNameIdentifier	 buffer Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
&	TokenNameAND	
BYTE_BLOCK_MASK	TokenNameIdentifier	 BYTE  BLOCK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
overflow	TokenNameIdentifier	 overflow
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
-	TokenNameMINUS	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
overflow	TokenNameIdentifier	 overflow
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
overflow	TokenNameIdentifier	 overflow
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-=	TokenNameMINUS_EQUAL	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
bufferIndex	TokenNameIdentifier	 buffer Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
overflow	TokenNameIdentifier	 overflow
=	TokenNameEQUAL	
overflow	TokenNameIdentifier	 overflow
-	TokenNameMINUS	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the pools content to the given {@link DataOutput} */	TokenNameCOMMENT_JAVADOC	 Writes the pools content to the given {@link DataOutput} 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writePool	TokenNameIdentifier	 write Pool
(	TokenNameLPAREN	
final	TokenNamefinal	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
bytesOffset	TokenNameIdentifier	 bytes Offset
=	TokenNameEQUAL	
byteOffset	TokenNameIdentifier	 byte Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bytesOffset	TokenNameIdentifier	 bytes Offset
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
block	TokenNameIdentifier	 block
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesOffset	TokenNameIdentifier	 bytes Offset
-=	TokenNameMINUS_EQUAL	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
block	TokenNameIdentifier	 block
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
byteUpto	TokenNameIdentifier	 byte Upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
