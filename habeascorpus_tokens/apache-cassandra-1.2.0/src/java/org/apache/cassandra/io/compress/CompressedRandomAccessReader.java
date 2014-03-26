/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
FileChannel	TokenNameIdentifier	 File Channel
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
FSReadError	TokenNameIdentifier	 FS Read Error
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
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
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
// TODO refactor this to separate concept of "buffer to avoid lots of read() syscalls" and "compression buffer" 	TokenNameCOMMENT_LINE	TODO refactor this to separate concept of "buffer to avoid lots of read() syscalls" and "compression buffer" 
public	TokenNamepublic	
class	TokenNameclass	
CompressedRandomAccessReader	TokenNameIdentifier	 Compressed Random Access Reader
extends	TokenNameextends	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dataFilePath	TokenNameIdentifier	 data File Path
,	TokenNameCOMMA	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dataFilePath	TokenNameIdentifier	 data File Path
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dataFilePath	TokenNameIdentifier	 data File Path
,	TokenNameCOMMA	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
boolean	TokenNameboolean	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompressedRandomAccessReader	TokenNameIdentifier	 Compressed Random Access Reader
(	TokenNameLPAREN	
dataFilePath	TokenNameIdentifier	 data File Path
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
// used by reBuffer() to escape creating lots of temporary buffers 	TokenNameCOMMENT_LINE	used by reBuffer() to escape creating lots of temporary buffers 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compressed	TokenNameIdentifier	 compressed
;	TokenNameSEMICOLON	
// re-use single crc object 	TokenNameCOMMENT_LINE	re-use single crc object 
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
final	TokenNamefinal	
FileInputStream	TokenNameIdentifier	 File Input Stream
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FileChannel	TokenNameIdentifier	 File Channel
channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompressedRandomAccessReader	TokenNameIdentifier	 Compressed Random Access Reader
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dataFilePath	TokenNameIdentifier	 data File Path
,	TokenNameCOMMA	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
boolean	TokenNameboolean	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
throws	TokenNamethrows	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dataFilePath	TokenNameIdentifier	 data File Path
)	TokenNameRPAREN	
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
chunkLength	TokenNameIdentifier	 chunk Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
=	TokenNameEQUAL	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
compressed	TokenNameIdentifier	 compressed
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
compressor	TokenNameIdentifier	 compressor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
initialCompressedBufferLength	TokenNameIdentifier	 initial Compressed Buffer Length
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
chunkLength	TokenNameIdentifier	 chunk Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// can't use super.read(...) methods 	TokenNameCOMMENT_LINE	can't use super.read(...) methods 
// that is why we are allocating special InputStream to read data from disk 	TokenNameCOMMENT_LINE	that is why we are allocating special InputStream to read data from disk 
// from already open file descriptor 	TokenNameCOMMENT_LINE	from already open file descriptor 
try	TokenNametry	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
getFD	TokenNameIdentifier	 get FD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fd == null, Not Supposed To Happen 	TokenNameCOMMENT_LINE	fd == null, Not Supposed To Happen 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for position manipulation 	TokenNameCOMMENT_LINE	for position manipulation 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
reBuffer	TokenNameIdentifier	 re Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
decompressChunk	TokenNameIdentifier	 decompress Chunk
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
chunkFor	TokenNameIdentifier	 chunk For
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CorruptBlockException	TokenNameIdentifier	 Corrupt Block Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
FSReadError	TokenNameIdentifier	 FS Read Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
decompressChunk	TokenNameIdentifier	 decompress Chunk
(	TokenNameLPAREN	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
compressed	TokenNameIdentifier	 compressed
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptBlockException	TokenNameIdentifier	 Corrupt Block Exception
(	TokenNameLPAREN	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
compressor	TokenNameIdentifier	 compressor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
uncompress	TokenNameIdentifier	 uncompress
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptBlockException	TokenNameIdentifier	 Corrupt Block Exception
(	TokenNameLPAREN	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
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
if	TokenNameif	
(	TokenNameLPAREN	
checksum	TokenNameIdentifier	 checksum
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
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
CorruptBlockException	TokenNameIdentifier	 Corrupt Block Exception
(	TokenNameLPAREN	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
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
private	TokenNameprivate	
int	TokenNameint	
checksum	TokenNameIdentifier	 checksum
(	TokenNameLPAREN	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
checksumBytes	TokenNameIdentifier	 checksum Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
checksumBytes	TokenNameIdentifier	 checksum Bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
checksumBytes	TokenNameIdentifier	 checksum Bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptBlockException	TokenNameIdentifier	 Corrupt Block Exception
(	TokenNameLPAREN	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Ints	TokenNameIdentifier	 Ints
.	TokenNameDOT	
fromByteArray	TokenNameIdentifier	 from Byte Array
(	TokenNameLPAREN	
checksumBytes	TokenNameIdentifier	 checksum Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
dataLength	TokenNameIdentifier	 data Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
FSReadError	TokenNameIdentifier	 FS Read Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s - chunk length %d, data length %d."	TokenNameStringLiteral	%s - chunk length %d, data length %d.
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
chunkLength	TokenNameIdentifier	 chunk Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
dataLength	TokenNameIdentifier	 data Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
