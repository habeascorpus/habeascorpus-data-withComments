package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
public	TokenNamepublic	
class	TokenNameclass	
TestByteSlices	TokenNameIdentifier	 Test Byte Slices
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ByteBlockAllocator	TokenNameIdentifier	 Byte Block Allocator
extends	TokenNameextends	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
Allocator	TokenNameIdentifier	 Allocator
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Allocate another byte[] from the shared pool */	TokenNameCOMMENT_BLOCK	 Allocate another byte[] from the shared pool 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
synchronized	TokenNamesynchronized	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getByteBlock	TokenNameIdentifier	 get Byte Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Return a byte[] to the pool */	TokenNameCOMMENT_BLOCK	 Return a byte[] to the pool 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
synchronized	TokenNamesynchronized	
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
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
freeByteBlocks	TokenNameIdentifier	 free Byte Blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasic	TokenNameIdentifier	 test Basic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
pool	TokenNameIdentifier	 pool
=	TokenNameEQUAL	
new	TokenNamenew	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
(	TokenNameLPAREN	
new	TokenNamenew	
ByteBlockAllocator	TokenNameIdentifier	 Byte Block Allocator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
NUM_STREAM	TokenNameIdentifier	 NUM  STREAM
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteSliceWriter	TokenNameIdentifier	 Byte Slice Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSliceWriter	TokenNameIdentifier	 Byte Slice Writer
(	TokenNameLPAREN	
pool	TokenNameIdentifier	 pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
NUM_STREAM	TokenNameIdentifier	 NUM  STREAM
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
uptos	TokenNameIdentifier	 uptos
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
NUM_STREAM	TokenNameIdentifier	 NUM  STREAM
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counters	TokenNameIdentifier	 counters
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
NUM_STREAM	TokenNameIdentifier	 NUM  STREAM
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ti	TokenNameIdentifier	 ti
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ti	TokenNameIdentifier	 ti
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
<	TokenNameLESS	
NUM_STREAM	TokenNameIdentifier	 NUM  STREAM
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
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
int	TokenNameint	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
NUM_STREAM	TokenNameIdentifier	 NUM  STREAM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"write stream="	TokenNameStringLiteral	write stream=
+	TokenNamePLUS	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
spot	TokenNameIdentifier	 spot
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
newSlice	TokenNameIdentifier	 new Slice
(	TokenNameLPAREN	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
FIRST_LEVEL_SIZE	TokenNameIdentifier	 FIRST  LEVEL  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
spot	TokenNameIdentifier	 spot
+	TokenNamePLUS	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
byteOffset	TokenNameIdentifier	 byte Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" init to "	TokenNameStringLiteral	 init to 
+	TokenNamePLUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numValue	TokenNameIdentifier	 num Value
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numValue	TokenNameIdentifier	 num Value
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" write "	TokenNameStringLiteral	 write 
+	TokenNamePLUS	
(	TokenNameLPAREN	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write some large (incl. negative) ints: 	TokenNameCOMMENT_LINE	write some large (incl. negative) ints: 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
numValue	TokenNameIdentifier	 num Value
;	TokenNameSEMICOLON	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" addr now "	TokenNameStringLiteral	 addr now 
+	TokenNamePLUS	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
<	TokenNameLESS	
NUM_STREAM	TokenNameIdentifier	 NUM  STREAM
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" stream="	TokenNameStringLiteral	 stream=
+	TokenNamePLUS	
stream	TokenNameIdentifier	 stream
+	TokenNamePLUS	
" count="	TokenNameStringLiteral	 count=
+	TokenNamePLUS	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
pool	TokenNameIdentifier	 pool
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
uptos	TokenNameIdentifier	 uptos
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
counters	TokenNameIdentifier	 counters
[	TokenNameLBRACKET	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
