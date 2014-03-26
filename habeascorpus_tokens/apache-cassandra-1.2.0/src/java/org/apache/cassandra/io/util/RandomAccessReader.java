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
util	TokenNameIdentifier	 util
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
CLibrary	TokenNameIdentifier	 C Library
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
extends	TokenNameextends	
RandomAccessFile	TokenNameIdentifier	 Random Access File
implements	TokenNameimplements	
FileDataInput	TokenNameIdentifier	 File Data Input
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
CACHE_FLUSH_INTERVAL_IN_BYTES	TokenNameIdentifier	 CACHE  FLUSH  INTERVAL  IN  BYTES
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 128mb 	TokenNameCOMMENT_LINE	128mb 
// default buffer size, 64Kb 	TokenNameCOMMENT_LINE	default buffer size, 64Kb 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
=	TokenNameEQUAL	
65536	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// absolute filesystem path to the file 	TokenNameCOMMENT_LINE	absolute filesystem path to the file 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
filePath	TokenNameIdentifier	 file Path
;	TokenNameSEMICOLON	
// buffer which will cache file blocks 	TokenNameCOMMENT_LINE	buffer which will cache file blocks 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
// `current` as current position in file 	TokenNameCOMMENT_LINE	`current` as current position in file 
// `bufferOffset` is the offset of the beginning of the buffer 	TokenNameCOMMENT_LINE	`bufferOffset` is the offset of the beginning of the buffer 
// `markedPointer` folds the offset of the last file mark 	TokenNameCOMMENT_LINE	`markedPointer` folds the offset of the last file mark 
protected	TokenNameprotected	
long	TokenNamelong	
bufferOffset	TokenNameIdentifier	 buffer Offset
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
markedPointer	TokenNameIdentifier	 marked Pointer
;	TokenNameSEMICOLON	
// `validBufferBytes` is the number of bytes in the buffer that are actually valid; 	TokenNameCOMMENT_LINE	`validBufferBytes` is the number of bytes in the buffer that are actually valid; 
// this will be LESS than buffer capacity if buffer is not full! 	TokenNameCOMMENT_LINE	this will be LESS than buffer capacity if buffer is not full! 
protected	TokenNameprotected	
int	TokenNameint	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// channel liked with the file, used to retrieve data and force updates. 	TokenNameCOMMENT_LINE	channel liked with the file, used to retrieve data and force updates. 
protected	TokenNameprotected	
final	TokenNamefinal	
FileChannel	TokenNameIdentifier	 File Channel
channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
skipIOCache	TokenNameIdentifier	 skip IO Cache
;	TokenNameSEMICOLON	
// file descriptor 	TokenNameCOMMENT_LINE	file descriptor 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
;	TokenNameSEMICOLON	
// used if skip I/O cache was enabled 	TokenNameCOMMENT_LINE	used if skip I/O cache was enabled 
private	TokenNameprivate	
long	TokenNamelong	
bytesSinceCacheFlush	TokenNameIdentifier	 bytes Since Cache Flush
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
fileLength	TokenNameIdentifier	 file Length
;	TokenNameSEMICOLON	
// used in tests 	TokenNameCOMMENT_LINE	used in tests 
public	TokenNamepublic	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
throws	TokenNamethrows	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
"r"	TokenNameStringLiteral	r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filePath	TokenNameIdentifier	 file Path
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// allocating required size of the buffer 	TokenNameCOMMENT_LINE	allocating required size of the buffer 
if	TokenNameif	
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"bufferSize must be positive"	TokenNameStringLiteral	bufferSize must be positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
bufferSize	TokenNameIdentifier	 buffer Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
skipIOCache	TokenNameIdentifier	 skip IO Cache
=	TokenNameEQUAL	
skipIOCache	TokenNameIdentifier	 skip IO Cache
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fd	TokenNameIdentifier	 fd
=	TokenNameEQUAL	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
getfd	TokenNameIdentifier	 getfd
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
// we can cache file length in read-only mode 	TokenNameCOMMENT_LINE	we can cache file length in read-only mode 
try	TokenNametry	
{	TokenNameLBRACE	
fileLength	TokenNameIdentifier	 file Length
=	TokenNameEQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
filePath	TokenNameIdentifier	 file Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// that will trigger reBuffer() on demand by read/seek operations 	TokenNameCOMMENT_LINE	that will trigger reBuffer() on demand by read/seek operations 
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
boolean	TokenNameboolean	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
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
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
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
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
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
// convert open into open 	TokenNameCOMMENT_LINE	convert open into open 
public	TokenNamepublic	
static	TokenNamestatic	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read data from file starting from current currentOffset to populate buffer. */	TokenNameCOMMENT_JAVADOC	 Read data from file starting from current currentOffset to populate buffer. 
protected	TokenNameprotected	
void	TokenNamevoid	
reBuffer	TokenNameIdentifier	 re Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resetBuffer	TokenNameIdentifier	 reset Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferOffset	TokenNameIdentifier	 buffer Offset
>=	TokenNameGREATER_EQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
bufferOffset	TokenNameIdentifier	 buffer Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// setting channel position 	TokenNameCOMMENT_LINE	setting channel position 
int	TokenNameint	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
<	TokenNameLESS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
read	TokenNameIdentifier	 read
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
read	TokenNameIdentifier	 read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
read	TokenNameIdentifier	 read
+=	TokenNamePLUS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
;	TokenNameSEMICOLON	
bytesSinceCacheFlush	TokenNameIdentifier	 bytes Since Cache Flush
+=	TokenNamePLUS_EQUAL	
read	TokenNameIdentifier	 read
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
filePath	TokenNameIdentifier	 file Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
skipIOCache	TokenNameIdentifier	 skip IO Cache
&&	TokenNameAND_AND	
bytesSinceCacheFlush	TokenNameIdentifier	 bytes Since Cache Flush
>=	TokenNameGREATER_EQUAL	
CACHE_FLUSH_INTERVAL_IN_BYTES	TokenNameIdentifier	 CACHE  FLUSH  INTERVAL  IN  BYTES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// with random I/O we can't control what we are skipping so 	TokenNameCOMMENT_LINE	with random I/O we can't control what we are skipping so 
// it will be more appropriate to just skip a whole file after 	TokenNameCOMMENT_LINE	it will be more appropriate to just skip a whole file after 
// we reach threshold 	TokenNameCOMMENT_LINE	we reach threshold 
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
trySkipCache	TokenNameIdentifier	 try Skip Cache
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesSinceCacheFlush	TokenNameIdentifier	 bytes Since Cache Flush
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filePath	TokenNameIdentifier	 file Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
markedPointer	TokenNameIdentifier	 marked Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
bytesPastMark	TokenNameIdentifier	 bytes Past Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
markedPointer	TokenNameIdentifier	 marked Pointer
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytes	TokenNameIdentifier	 bytes
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FileMark	TokenNameIdentifier	 File Mark
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
markedPointer	TokenNameIdentifier	 marked Pointer
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BufferedRandomAccessFileMark	TokenNameIdentifier	 Buffered Random Access File Mark
(	TokenNameLPAREN	
markedPointer	TokenNameIdentifier	 marked Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
FileMark	TokenNameIdentifier	 File Mark
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
mark	TokenNameIdentifier	 mark
instanceof	TokenNameinstanceof	
BufferedRandomAccessFileMark	TokenNameIdentifier	 Buffered Random Access File Mark
;	TokenNameSEMICOLON	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BufferedRandomAccessFileMark	TokenNameIdentifier	 Buffered Random Access File Mark
)	TokenNameRPAREN	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
.	TokenNameDOT	
pointer	TokenNameIdentifier	 pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
bytesPastMark	TokenNameIdentifier	 bytes Past Mark
(	TokenNameLPAREN	
FileMark	TokenNameIdentifier	 File Mark
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
mark	TokenNameIdentifier	 mark
instanceof	TokenNameinstanceof	
BufferedRandomAccessFileMark	TokenNameIdentifier	 Buffered Random Access File Mark
;	TokenNameSEMICOLON	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BufferedRandomAccessFileMark	TokenNameIdentifier	 Buffered Random Access File Mark
)	TokenNameRPAREN	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
.	TokenNameDOT	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytes	TokenNameIdentifier	 bytes
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if there is no more data to read */	TokenNameCOMMENT_JAVADOC	 @return true if there is no more data to read 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEOF	TokenNameIdentifier	 is EOF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
bytesRemaining	TokenNameIdentifier	 bytes Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
bufferCursor	TokenNameIdentifier	 buffer Cursor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
bufferOffset	TokenNameIdentifier	 buffer Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
resetBuffer	TokenNameIdentifier	 reset Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferOffset	TokenNameIdentifier	 buffer Offset
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skipIOCache	TokenNameIdentifier	 skip IO Cache
&&	TokenNameAND_AND	
bytesSinceCacheFlush	TokenNameIdentifier	 bytes Since Cache Flush
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
trySkipCache	TokenNameIdentifier	 try Skip Cache
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
super	TokenNamesuper	
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
filePath	TokenNameIdentifier	 file Path
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
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
"filePath='"	TokenNameStringLiteral	filePath='
+	TokenNamePLUS	
filePath	TokenNameIdentifier	 file Path
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
", skipIOCache="	TokenNameStringLiteral	, skipIOCache=
+	TokenNamePLUS	
skipIOCache	TokenNameIdentifier	 skip IO Cache
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Class to hold a mark to the position of the file */	TokenNameCOMMENT_JAVADOC	 Class to hold a mark to the position of the file 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
BufferedRandomAccessFileMark	TokenNameIdentifier	 Buffered Random Access File Mark
implements	TokenNameimplements	
FileMark	TokenNameIdentifier	 File Mark
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BufferedRandomAccessFileMark	TokenNameIdentifier	 Buffered Random Access File Mark
(	TokenNameLPAREN	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
newPosition	TokenNameIdentifier	 new Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newPosition	TokenNameIdentifier	 new Position
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"new position should not be negative"	TokenNameStringLiteral	new position should not be negative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newPosition	TokenNameIdentifier	 new Position
>	TokenNameGREATER	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// it is save to call length() in read-only mode 	TokenNameCOMMENT_LINE	it is save to call length() in read-only mode 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"unable to seek to position %d in %s (%d bytes) in read-only mode"	TokenNameStringLiteral	unable to seek to position %d in %s (%d bytes) in read-only mode
,	TokenNameCOMMA	
newPosition	TokenNameIdentifier	 new Position
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
newPosition	TokenNameIdentifier	 new Position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newPosition	TokenNameIdentifier	 new Position
>	TokenNameGREATER	
(	TokenNameLPAREN	
bufferOffset	TokenNameIdentifier	 buffer Offset
+	TokenNamePLUS	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
)	TokenNameRPAREN	
||	TokenNameOR_OR	
newPosition	TokenNameIdentifier	 new Position
<	TokenNameLESS	
bufferOffset	TokenNameIdentifier	 buffer Offset
)	TokenNameRPAREN	
reBuffer	TokenNameIdentifier	 re Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
// -1 will be returned if there is nothing to read; higher-level methods like readInt 	TokenNameCOMMENT_LINE	-1 will be returned if there is nothing to read; higher-level methods like readInt 
// or readFully (from RandomAccessFile) will throw EOFException but this should not 	TokenNameCOMMENT_LINE	or readFully (from RandomAccessFile) will throw EOFException but this should not 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
"Attempted to read from closed RAR"	TokenNameStringLiteral	Attempted to read from closed RAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEOF	TokenNameIdentifier	 is EOF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// required by RandomAccessFile 	TokenNameCOMMENT_LINE	required by RandomAccessFile 
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
reBuffer	TokenNameIdentifier	 re Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
// -1 will be returned if there is nothing to read; higher-level methods like readInt 	TokenNameCOMMENT_LINE	-1 will be returned if there is nothing to read; higher-level methods like readInt 
// or readFully (from RandomAccessFile) will throw EOFException but this should not 	TokenNameCOMMENT_LINE	or readFully (from RandomAccessFile) will throw EOFException but this should not 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buff	TokenNameIdentifier	 buff
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
"Attempted to read from closed RAR"	TokenNameStringLiteral	Attempted to read from closed RAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEOF	TokenNameIdentifier	 is EOF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
reBuffer	TokenNameIdentifier	 re Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"File (%s), current offset %d, buffer offset %d, buffer limit %d"	TokenNameStringLiteral	File (%s), current offset %d, buffer offset %d, buffer limit %d
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
bufferOffset	TokenNameIdentifier	 buffer Offset
,	TokenNameCOMMA	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
-	TokenNameMINUS	
bufferCursor	TokenNameIdentifier	 buffer Cursor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
bufferCursor	TokenNameIdentifier	 buffer Cursor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buff	TokenNameIdentifier	 buff
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
+=	TokenNamePLUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
EOFException	TokenNameIdentifier	 EOF Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"buffer length should not be negative: "	TokenNameStringLiteral	buffer length should not be negative: 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
buff	TokenNameIdentifier	 buff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reading data buffer 	TokenNameCOMMENT_LINE	reading data buffer 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
EOFException	TokenNameIdentifier	 EOF Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
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
filePath	TokenNameIdentifier	 file Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
buff	TokenNameIdentifier	 buff
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
fileLength	TokenNameIdentifier	 file Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
