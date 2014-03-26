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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
Allocator	TokenNameIdentifier	 Allocator
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A {@link ByteBlockPool.Allocator} implementation that recycles unused byte * blocks in a buffer and reuses them in subsequent calls to * {@link #getByteBlock()}. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A {@link ByteBlockPool.Allocator} implementation that recycles unused byte blocks in a buffer and reuses them in subsequent calls to {@link #getByteBlock()}. * @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
RecyclingByteBlockAllocator	TokenNameIdentifier	 Recycling Byte Block Allocator
extends	TokenNameextends	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
Allocator	TokenNameIdentifier	 Allocator
{	TokenNameLBRACE	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxBufferedBlocks	TokenNameIdentifier	 max Buffered Blocks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
freeBlocks	TokenNameIdentifier	 free Blocks
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFERED_BLOCKS	TokenNameIdentifier	 DEFAULT  BUFFERED  BLOCKS
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Creates a new {@link RecyclingByteBlockAllocator} * * @param blockSize * the block size in bytes * @param maxBufferedBlocks * maximum number of buffered byte block * @param bytesUsed * {@link AtomicLong} reference counting internally allocated bytes * * @see DummyConcurrentLock */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link RecyclingByteBlockAllocator} * @param blockSize the block size in bytes @param maxBufferedBlocks maximum number of buffered byte block @param bytesUsed {@link AtomicLong} reference counting internally allocated bytes * @see DummyConcurrentLock 
public	TokenNamepublic	
RecyclingByteBlockAllocator	TokenNameIdentifier	 Recycling Byte Block Allocator
(	TokenNameLPAREN	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
int	TokenNameint	
maxBufferedBlocks	TokenNameIdentifier	 max Buffered Blocks
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
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxBufferedBlocks	TokenNameIdentifier	 max Buffered Blocks
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxBufferedBlocks	TokenNameIdentifier	 max Buffered Blocks
=	TokenNameEQUAL	
maxBufferedBlocks	TokenNameIdentifier	 max Buffered Blocks
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
=	TokenNameEQUAL	
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link RecyclingByteBlockAllocator} with a * {@link DummyConcurrentLock} instance. * * @param blockSize * the block size in bytes * @param maxBufferedBlocks * maximum number of buffered byte block */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link RecyclingByteBlockAllocator} with a {@link DummyConcurrentLock} instance. * @param blockSize the block size in bytes @param maxBufferedBlocks maximum number of buffered byte block 
public	TokenNamepublic	
RecyclingByteBlockAllocator	TokenNameIdentifier	 Recycling Byte Block Allocator
(	TokenNameLPAREN	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
int	TokenNameint	
maxBufferedBlocks	TokenNameIdentifier	 max Buffered Blocks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
maxBufferedBlocks	TokenNameIdentifier	 max Buffered Blocks
,	TokenNameCOMMA	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link RecyclingByteBlockAllocator} with a block size of * {@link ByteBlockPool#BYTE_BLOCK_SIZE}, upper buffered docs limit of * {@link #DEFAULT_BUFFERED_BLOCKS} ({@value #DEFAULT_BUFFERED_BLOCKS}) and a * {@link DummyConcurrentLock} instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link RecyclingByteBlockAllocator} with a block size of {@link ByteBlockPool#BYTE_BLOCK_SIZE}, upper buffered docs limit of {@link #DEFAULT_BUFFERED_BLOCKS} ({@value #DEFAULT_BUFFERED_BLOCKS}) and a {@link DummyConcurrentLock} instance. 
public	TokenNamepublic	
RecyclingByteBlockAllocator	TokenNameIdentifier	 Recycling Byte Block Allocator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getByteBlock	TokenNameIdentifier	 get Byte Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
freeBlocks	TokenNameIdentifier	 free Blocks
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
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
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
freeBlocks	TokenNameIdentifier	 free Blocks
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
[	TokenNameLBRACKET	
freeBlocks	TokenNameIdentifier	 free Blocks
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
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
final	TokenNamefinal	
int	TokenNameint	
numBlocks	TokenNameIdentifier	 num Blocks
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
maxBufferedBlocks	TokenNameIdentifier	 max Buffered Blocks
-	TokenNameMINUS	
freeBlocks	TokenNameIdentifier	 free Blocks
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
freeBlocks	TokenNameIdentifier	 free Blocks
+	TokenNamePLUS	
numBlocks	TokenNameIdentifier	 num Blocks
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>=	TokenNameGREATER_EQUAL	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBlocks	TokenNameIdentifier	 new Blocks
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
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
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBlocks	TokenNameIdentifier	 new Blocks
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
freeBlocks	TokenNameIdentifier	 free Blocks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
=	TokenNameEQUAL	
newBlocks	TokenNameIdentifier	 new Blocks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
numBlocks	TokenNameIdentifier	 num Blocks
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
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
[	TokenNameLBRACKET	
freeBlocks	TokenNameIdentifier	 free Blocks
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
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
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the number of currently buffered blocks */	TokenNameCOMMENT_JAVADOC	 @return the number of currently buffered blocks 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
numBufferedBlocks	TokenNameIdentifier	 num Buffered Blocks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
freeBlocks	TokenNameIdentifier	 free Blocks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the number of bytes currently allocated by this {@link Allocator} */	TokenNameCOMMENT_JAVADOC	 @return the number of bytes currently allocated by this {@link Allocator} 
public	TokenNamepublic	
long	TokenNamelong	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the maximum number of buffered byte blocks */	TokenNameCOMMENT_JAVADOC	 @return the maximum number of buffered byte blocks 
public	TokenNamepublic	
int	TokenNameint	
maxBufferedBlocks	TokenNameIdentifier	 max Buffered Blocks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxBufferedBlocks	TokenNameIdentifier	 max Buffered Blocks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the given number of byte blocks from the buffer if possible. * * @param num * the number of byte blocks to remove * @return the number of actually removed buffers */	TokenNameCOMMENT_JAVADOC	 Removes the given number of byte blocks from the buffer if possible. * @param num the number of byte blocks to remove @return the number of actually removed buffers 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
freeBlocks	TokenNameIdentifier	 free Blocks
(	TokenNameLPAREN	
int	TokenNameint	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
num	TokenNameIdentifier	 num
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
>	TokenNameGREATER	
freeBlocks	TokenNameIdentifier	 free Blocks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
freeBlocks	TokenNameIdentifier	 free Blocks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
freeBlocks	TokenNameIdentifier	 free Blocks
-	TokenNameMINUS	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
freeBlocks	TokenNameIdentifier	 free Blocks
>	TokenNameGREATER	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
freeBlocks	TokenNameIdentifier	 free Blocks
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
-	TokenNameMINUS	
count	TokenNameIdentifier	 count
*	TokenNameMULTIPLY	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
