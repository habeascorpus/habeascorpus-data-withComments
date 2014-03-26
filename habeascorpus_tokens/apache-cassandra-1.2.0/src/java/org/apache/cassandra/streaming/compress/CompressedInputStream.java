/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
CRC32	TokenNameIdentifier	 CR C32
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Checksum	TokenNameIdentifier	 Checksum
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Iterators	TokenNameIdentifier	 Iterators
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
primitives	TokenNameIdentifier	 primitives
.	TokenNameDOT	
Ints	TokenNameIdentifier	 Ints
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
.	TokenNameDOT	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
;	TokenNameSEMICOLON	
/** * InputStream which reads data from underlining source with given {@link CompressionInfo}. */	TokenNameCOMMENT_JAVADOC	 InputStream which reads data from underlining source with given {@link CompressionInfo}. 
public	TokenNamepublic	
class	TokenNameclass	
CompressedInputStream	TokenNameIdentifier	 Compressed Input Stream
extends	TokenNameextends	
InputStream	TokenNameIdentifier	 Input Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CompressionInfo	TokenNameIdentifier	 Compression Info
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
// chunk buffer 	TokenNameCOMMENT_LINE	chunk buffer 
private	TokenNameprivate	
final	TokenNamefinal	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
dataBuffer	TokenNameIdentifier	 data Buffer
;	TokenNameSEMICOLON	
// uncompressed bytes 	TokenNameCOMMENT_LINE	uncompressed bytes 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
// offset from the beginning of the buffer 	TokenNameCOMMENT_LINE	offset from the beginning of the buffer 
protected	TokenNameprotected	
long	TokenNamelong	
bufferOffset	TokenNameIdentifier	 buffer Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// current position in stream 	TokenNameCOMMENT_LINE	current position in stream 
private	TokenNameprivate	
long	TokenNamelong	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// number of bytes in the buffer that are actually valid 	TokenNameCOMMENT_LINE	number of bytes in the buffer that are actually valid 
protected	TokenNameprotected	
int	TokenNameint	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Checksum	TokenNameIdentifier	 Checksum
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// raw checksum bytes 	TokenNameCOMMENT_LINE	raw checksum bytes 
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
checksumBytes	TokenNameIdentifier	 checksum Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
uncompressedBytes	TokenNameIdentifier	 uncompressed Bytes
;	TokenNameSEMICOLON	
/** * @param source Input source to read compressed data from * @param info Compression info */	TokenNameCOMMENT_JAVADOC	 @param source Input source to read compressed data from @param info Compression info 
public	TokenNamepublic	
CompressedInputStream	TokenNameIdentifier	 Compressed Input Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
CompressionInfo	TokenNameIdentifier	 Compression Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
chunkLength	TokenNameIdentifier	 chunk Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// buffer is limited to store up to 1024 chunks 	TokenNameCOMMENT_LINE	buffer is limited to store up to 1024 chunks 
this	TokenNamethis	
.	TokenNameDOT	
dataBuffer	TokenNameIdentifier	 data Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayBlockingQueue	TokenNameIdentifier	 Array Blocking Queue
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
new	TokenNamenew	
Reader	TokenNameIdentifier	 Reader
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
dataBuffer	TokenNameIdentifier	 data Buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
bufferOffset	TokenNameIdentifier	 buffer Offset
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
||	TokenNameOR_OR	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
decompress	TokenNameIdentifier	 decompress
(	TokenNameLPAREN	
dataBuffer	TokenNameIdentifier	 data Buffer
.	TokenNameDOT	
take	TokenNameIdentifier	 take
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
"No chunk available"	TokenNameStringLiteral	No chunk available
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
bufferOffset	TokenNameIdentifier	 buffer Offset
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
<	TokenNameLESS	
bufferOffset	TokenNameIdentifier	 buffer Offset
+	TokenNamePLUS	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
-	TokenNameMINUS	
bufferOffset	TokenNameIdentifier	 buffer Offset
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
long	TokenNamelong	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
position	TokenNameIdentifier	 position
>=	TokenNameGREATER_EQUAL	
current	TokenNameIdentifier	 current
:	TokenNameCOLON	
"stream can only read forward."	TokenNameStringLiteral	stream can only read forward.
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
decompress	TokenNameIdentifier	 decompress
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compressed	TokenNameIdentifier	 compressed
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// uncompress 	TokenNameCOMMENT_LINE	uncompress 
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
sstableCompressor	TokenNameIdentifier	 sstable Compressor
.	TokenNameDOT	
uncompress	TokenNameIdentifier	 uncompress
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
compressed	TokenNameIdentifier	 compressed
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
checksumBytes	TokenNameIdentifier	 checksum Bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uncompressedBytes	TokenNameIdentifier	 uncompressed Bytes
+=	TokenNamePLUS_EQUAL	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
;	TokenNameSEMICOLON	
// validate crc randomly 	TokenNameCOMMENT_LINE	validate crc randomly 
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
getCrcCheckChance	TokenNameIdentifier	 get Crc Check Chance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
threadLocalRandom	TokenNameIdentifier	 thread Local Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
,	TokenNameCOMMA	
compressed	TokenNameIdentifier	 compressed
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
checksumBytes	TokenNameIdentifier	 checksum Bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
checksumBytes	TokenNameIdentifier	 checksum Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
checksumBytes	TokenNameIdentifier	 checksum Bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Ints	TokenNameIdentifier	 Ints
.	TokenNameDOT	
fromByteArray	TokenNameIdentifier	 from Byte Array
(	TokenNameLPAREN	
checksumBytes	TokenNameIdentifier	 checksum Bytes
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"CRC unmatched"	TokenNameStringLiteral	CRC unmatched
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reset checksum object back to the original (blank) state 	TokenNameCOMMENT_LINE	reset checksum object back to the original (blank) state 
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// buffer offset is always aligned 	TokenNameCOMMENT_LINE	buffer offset is always aligned 
bufferOffset	TokenNameIdentifier	 buffer Offset
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
&	TokenNameAND	
~	TokenNameTWIDDLE	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
uncompressedBytes	TokenNameIdentifier	 uncompressed Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uncompressedBytes	TokenNameIdentifier	 uncompressed Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
Reader	TokenNameIdentifier	 Reader
extends	TokenNameextends	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
>	TokenNameGREATER	
chunks	TokenNameIdentifier	 chunks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
dataBuffer	TokenNameIdentifier	 data Buffer
;	TokenNameSEMICOLON	
Reader	TokenNameIdentifier	 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
CompressionInfo	TokenNameIdentifier	 Compression Info
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
dataBuffer	TokenNameIdentifier	 data Buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chunks	TokenNameIdentifier	 chunks
=	TokenNameEQUAL	
Iterators	TokenNameIdentifier	 Iterators
.	TokenNameDOT	
forArray	TokenNameIdentifier	 for Array
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
chunks	TokenNameIdentifier	 chunks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dataBuffer	TokenNameIdentifier	 data Buffer
=	TokenNameEQUAL	
dataBuffer	TokenNameIdentifier	 data Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
runMayThrow	TokenNameIdentifier	 run May Throw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compressedWithCRC	TokenNameIdentifier	 compressed With CRC
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
readLength	TokenNameIdentifier	 read Length
=	TokenNameEQUAL	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// read with CRC 	TokenNameCOMMENT_LINE	read with CRC 
compressedWithCRC	TokenNameIdentifier	 compressed With CRC
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
readLength	TokenNameIdentifier	 read Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
bufferRead	TokenNameIdentifier	 buffer Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bufferRead	TokenNameIdentifier	 buffer Read
<	TokenNameLESS	
readLength	TokenNameIdentifier	 read Length
)	TokenNameRPAREN	
bufferRead	TokenNameIdentifier	 buffer Read
+=	TokenNamePLUS_EQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
compressedWithCRC	TokenNameIdentifier	 compressed With CRC
,	TokenNameCOMMA	
bufferRead	TokenNameIdentifier	 buffer Read
,	TokenNameCOMMA	
readLength	TokenNameIdentifier	 read Length
-	TokenNameMINUS	
bufferRead	TokenNameIdentifier	 buffer Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataBuffer	TokenNameIdentifier	 data Buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
compressedWithCRC	TokenNameIdentifier	 compressed With CRC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
