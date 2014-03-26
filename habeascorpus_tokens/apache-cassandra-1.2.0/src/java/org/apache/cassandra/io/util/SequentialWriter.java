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
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
ClosedChannelException	TokenNameIdentifier	 Closed Channel Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
MessageDigest	TokenNameIdentifier	 Message Digest
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
NoSuchAlgorithmException	TokenNameIdentifier	 No Such Algorithm Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
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
FSWriteError	TokenNameIdentifier	 FS Write Error
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
SequentialWriter	TokenNameIdentifier	 Sequential Writer
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
// isDirty - true if this.buffer contains any un-synced bytes 	TokenNameCOMMENT_LINE	isDirty - true if this.buffer contains any un-synced bytes 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isDirty	TokenNameIdentifier	 is Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
,	TokenNameCOMMA	
syncNeeded	TokenNameIdentifier	 sync Needed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// absolute path to the given file 	TokenNameCOMMENT_LINE	absolute path to the given file 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
filePath	TokenNameIdentifier	 file Path
;	TokenNameSEMICOLON	
// so we can use the write(int) path w/o tons of new byte[] allocations 	TokenNameCOMMENT_LINE	so we can use the write(int) path w/o tons of new byte[] allocations 
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
singleByteBuffer	TokenNameIdentifier	 single Byte Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
skipIOCache	TokenNameIdentifier	 skip IO Cache
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
directoryFD	TokenNameIdentifier	 directory FD
;	TokenNameSEMICOLON	
// directory should be synced only after first file sync, in other words, only once per file 	TokenNameCOMMENT_LINE	directory should be synced only after first file sync, in other words, only once per file 
private	TokenNameprivate	
boolean	TokenNameboolean	
directorySynced	TokenNameIdentifier	 directory Synced
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bufferOffset	TokenNameIdentifier	 buffer Offset
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
RandomAccessFile	TokenNameIdentifier	 Random Access File
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
// used if skip I/O cache was enabled 	TokenNameCOMMENT_LINE	used if skip I/O cache was enabled 
private	TokenNameprivate	
long	TokenNamelong	
ioCacheStartOffset	TokenNameIdentifier	 io Cache Start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytesSinceCacheFlush	TokenNameIdentifier	 bytes Since Cache Flush
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// whether to do trickling fsync() to avoid sudden bursts of dirty buffer flushing by kernel causing read 	TokenNameCOMMENT_LINE	whether to do trickling fsync() to avoid sudden bursts of dirty buffer flushing by kernel causing read 
// latency spikes 	TokenNameCOMMENT_LINE	latency spikes 
private	TokenNameprivate	
boolean	TokenNameboolean	
trickleFsync	TokenNameIdentifier	 trickle Fsync
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
trickleFsyncByteInterval	TokenNameIdentifier	 trickle Fsync Byte Interval
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bytesSinceTrickleFsync	TokenNameIdentifier	 bytes Since Trickle Fsync
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
stream	TokenNameIdentifier	 stream
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MessageDigest	TokenNameIdentifier	 Message Digest
digest	TokenNameIdentifier	 digest
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
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
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
"rw"	TokenNameStringLiteral	rw
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
filePath	TokenNameIdentifier	 file Path
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
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
this	TokenNamethis	
.	TokenNameDOT	
trickleFsync	TokenNameIdentifier	 trickle Fsync
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getTrickleFsync	TokenNameIdentifier	 get Trickle Fsync
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
trickleFsyncByteInterval	TokenNameIdentifier	 trickle Fsync Byte Interval
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getTrickleFsyncIntervalInKb	TokenNameIdentifier	 get Trickle Fsync Interval In Kb
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fd	TokenNameIdentifier	 fd
=	TokenNameEQUAL	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
getfd	TokenNameIdentifier	 getfd
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
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
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// shouldn't happen 	TokenNameCOMMENT_LINE	shouldn't happen 
}	TokenNameRBRACE	
directoryFD	TokenNameIdentifier	 directory FD
=	TokenNameEQUAL	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
tryOpenDirectory	TokenNameIdentifier	 try Open Directory
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
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
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
.	TokenNameDOT	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
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
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
.	TokenNameDOT	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
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
return	TokenNamereturn	
new	TokenNamenew	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClosedChannelException	TokenNameIdentifier	 Closed Channel Exception
{	TokenNameLBRACE	
singleByteBuffer	TokenNameIdentifier	 single Byte Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
singleByteBuffer	TokenNameIdentifier	 single Byte Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClosedChannelException	TokenNameIdentifier	 Closed Channel Exception
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
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
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClosedChannelException	TokenNameIdentifier	 Closed Channel Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ClosedChannelException	TokenNameIdentifier	 Closed Channel Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
writeAtMost	TokenNameIdentifier	 write At Most
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
-=	TokenNameMINUS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
isDirty	TokenNameIdentifier	 is Dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
syncNeeded	TokenNameIdentifier	 sync Needed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Write at most "length" bytes from "b" starting at position "offset", and * return the number of bytes written. caller is responsible for setting * isDirty. */	TokenNameCOMMENT_BLOCK	 Write at most "length" bytes from "b" starting at position "offset", and return the number of bytes written. caller is responsible for setting isDirty. 
private	TokenNameprivate	
int	TokenNameint	
writeAtMost	TokenNameIdentifier	 write At Most
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
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
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
bufferOffset	TokenNameIdentifier	 buffer Offset
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
reBuffer	TokenNameIdentifier	 re Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
current	TokenNameIdentifier	 current
<	TokenNameLESS	
bufferOffset	TokenNameIdentifier	 buffer Offset
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"File (%s) offset %d, buffer offset %d."	TokenNameStringLiteral	File (%s) offset %d, buffer offset %d.
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
bufferOffset	TokenNameIdentifier	 buffer Offset
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
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
bufferCursor	TokenNameIdentifier	 buffer Cursor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// copy bytes from external buffer 	TokenNameCOMMENT_LINE	copy bytes from external buffer 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
bufferCursor	TokenNameIdentifier	 buffer Cursor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
current	TokenNameIdentifier	 current
<=	TokenNameLESS_EQUAL	
bufferOffset	TokenNameIdentifier	 buffer Offset
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"File (%s) offset %d, buffer offset %d."	TokenNameStringLiteral	File (%s) offset %d, buffer offset %d.
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
bufferOffset	TokenNameIdentifier	 buffer Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
,	TokenNameCOMMA	
bufferCursor	TokenNameIdentifier	 buffer Cursor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
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
/** * Synchronize file contents with disk. */	TokenNameCOMMENT_JAVADOC	 Synchronize file contents with disk. 
public	TokenNamepublic	
void	TokenNamevoid	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
syncInternal	TokenNameIdentifier	 sync Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
syncDataOnlyInternal	TokenNameIdentifier	 sync Data Only Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
getFD	TokenNameIdentifier	 get FD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sync	TokenNameIdentifier	 sync
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
FSWriteError	TokenNameIdentifier	 FS Write Error
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
protected	TokenNameprotected	
void	TokenNamevoid	
syncInternal	TokenNameIdentifier	 sync Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
syncNeeded	TokenNameIdentifier	 sync Needed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushInternal	TokenNameIdentifier	 flush Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syncDataOnlyInternal	TokenNameIdentifier	 sync Data Only Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
directorySynced	TokenNameIdentifier	 directory Synced
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
trySync	TokenNameIdentifier	 try Sync
(	TokenNameLPAREN	
directoryFD	TokenNameIdentifier	 directory FD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directorySynced	TokenNameIdentifier	 directory Synced
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
syncNeeded	TokenNameIdentifier	 sync Needed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If buffer is dirty, flush it's contents to the operating system. Does not imply fsync(). * * Currently, for implementation reasons, this also invalidates the buffer. */	TokenNameCOMMENT_JAVADOC	 If buffer is dirty, flush it's contents to the operating system. Does not imply fsync(). * Currently, for implementation reasons, this also invalidates the buffer. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushInternal	TokenNameIdentifier	 flush Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
flushInternal	TokenNameIdentifier	 flush Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isDirty	TokenNameIdentifier	 is Dirty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushData	TokenNameIdentifier	 flush Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trickleFsync	TokenNameIdentifier	 trickle Fsync
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesSinceTrickleFsync	TokenNameIdentifier	 bytes Since Trickle Fsync
+=	TokenNamePLUS_EQUAL	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytesSinceTrickleFsync	TokenNameIdentifier	 bytes Since Trickle Fsync
>=	TokenNameGREATER_EQUAL	
trickleFsyncByteInterval	TokenNameIdentifier	 trickle Fsync Byte Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
syncDataOnlyInternal	TokenNameIdentifier	 sync Data Only Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesSinceTrickleFsync	TokenNameIdentifier	 bytes Since Trickle Fsync
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we don't know when the data reaches disk since we aren't 	TokenNameCOMMENT_LINE	we don't know when the data reaches disk since we aren't 
// calling flush 	TokenNameCOMMENT_LINE	calling flush 
// so we continue to clear pages we don't need from the first 	TokenNameCOMMENT_LINE	so we continue to clear pages we don't need from the first 
// offset we see 	TokenNameCOMMENT_LINE	offset we see 
// periodically we update this starting offset 	TokenNameCOMMENT_LINE	periodically we update this starting offset 
bytesSinceCacheFlush	TokenNameIdentifier	 bytes Since Cache Flush
+=	TokenNamePLUS_EQUAL	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytesSinceCacheFlush	TokenNameIdentifier	 bytes Since Cache Flush
>=	TokenNameGREATER_EQUAL	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
.	TokenNameDOT	
CACHE_FLUSH_INTERVAL_IN_BYTES	TokenNameIdentifier	 CACHE  FLUSH  INTERVAL  IN  BYTES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
trySkipCache	TokenNameIdentifier	 try Skip Cache
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
ioCacheStartOffset	TokenNameIdentifier	 io Cache Start Offset
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ioCacheStartOffset	TokenNameIdentifier	 io Cache Start Offset
=	TokenNameEQUAL	
bufferOffset	TokenNameIdentifier	 buffer Offset
;	TokenNameSEMICOLON	
bytesSinceCacheFlush	TokenNameIdentifier	 bytes Since Cache Flush
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Remember that we wrote, so we don't write it again on next flush(). 	TokenNameCOMMENT_LINE	Remember that we wrote, so we don't write it again on next flush(). 
resetBuffer	TokenNameIdentifier	 reset Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isDirty	TokenNameIdentifier	 is Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Override this method instead of overriding flush() * @throws FSWriteError on any I/O error. */	TokenNameCOMMENT_JAVADOC	 Override this method instead of overriding flush() @throws FSWriteError on any I/O error. 
protected	TokenNameprotected	
void	TokenNamevoid	
flushData	TokenNameIdentifier	 flush Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
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
FSWriteError	TokenNameIdentifier	 FS Write Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
digest	TokenNameIdentifier	 digest
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
digest	TokenNameIdentifier	 digest
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
}	TokenNameRBRACE	
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
/** * Return the current file pointer of the underlying on-disk file. * Note that since write works by buffering data, the value of this will increase by buffer * size and not every write to the writer will modify this value. * Furthermore, for compressed files, this value refers to compressed data, while the * writer getFilePointer() refers to uncompressedFile */	TokenNameCOMMENT_JAVADOC	 Return the current file pointer of the underlying on-disk file. Note that since write works by buffering data, the value of this will increase by buffer size and not every write to the writer will modify this value. Furthermore, for compressed files, this value refers to compressed data, while the writer getFilePointer() refers to uncompressedFile 
public	TokenNamepublic	
long	TokenNamelong	
getOnDiskFilePointer	TokenNameIdentifier	 get On Disk File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bufferOffset	TokenNameIdentifier	 buffer Offset
+	TokenNamePLUS	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
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
protected	TokenNameprotected	
void	TokenNamevoid	
reBuffer	TokenNameIdentifier	 re Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushInternal	TokenNameIdentifier	 flush Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetBuffer	TokenNameIdentifier	 reset Buffer
(	TokenNameLPAREN	
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
private	TokenNameprivate	
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
public	TokenNamepublic	
FileMark	TokenNameIdentifier	 File Mark
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BufferedFileWriterMark	TokenNameIdentifier	 Buffered File Writer Mark
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
resetAndTruncate	TokenNameIdentifier	 reset And Truncate
(	TokenNameLPAREN	
FileMark	TokenNameIdentifier	 File Mark
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
mark	TokenNameIdentifier	 mark
instanceof	TokenNameinstanceof	
BufferedFileWriterMark	TokenNameIdentifier	 Buffered File Writer Mark
;	TokenNameSEMICOLON	
long	TokenNamelong	
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BufferedFileWriterMark	TokenNameIdentifier	 Buffered File Writer Mark
)	TokenNameRPAREN	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
.	TokenNameDOT	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
-	TokenNameMINUS	
current	TokenNameIdentifier	 current
<=	TokenNameLESS_EQUAL	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
)	TokenNameRPAREN	
// current buffer 	TokenNameCOMMENT_LINE	current buffer 
{	TokenNameLBRACE	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
-	TokenNameMINUS	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronize current buffer with disk 	TokenNameCOMMENT_LINE	synchronize current buffer with disk 
// because we don't want any data loss 	TokenNameCOMMENT_LINE	because we don't want any data loss 
syncInternal	TokenNameIdentifier	 sync Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// truncate file to given position 	TokenNameCOMMENT_LINE	truncate file to given position 
truncate	TokenNameIdentifier	 truncate
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reset channel position 	TokenNameCOMMENT_LINE	reset channel position 
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
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
resetBuffer	TokenNameIdentifier	 reset Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
truncate	TokenNameIdentifier	 truncate
(	TokenNameLPAREN	
long	TokenNamelong	
toSize	TokenNameIdentifier	 to Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
truncate	TokenNameIdentifier	 truncate
(	TokenNameLPAREN	
toSize	TokenNameIdentifier	 to Size
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
FSWriteError	TokenNameIdentifier	 FS Write Error
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
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// already closed 	TokenNameCOMMENT_LINE	already closed 
syncInternal	TokenNameIdentifier	 sync Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
out	TokenNameIdentifier	 out
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
FSWriteError	TokenNameIdentifier	 FS Write Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
tryCloseFD	TokenNameIdentifier	 try Close FD
(	TokenNameLPAREN	
directoryFD	TokenNameIdentifier	 directory FD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turn on digest computation on this writer. * This can only be called before any data is written to this write, * otherwise an IllegalStateException is thrown. */	TokenNameCOMMENT_JAVADOC	 Turn on digest computation on this writer. This can only be called before any data is written to this write, otherwise an IllegalStateException is thrown. 
public	TokenNamepublic	
void	TokenNamevoid	
setComputeDigest	TokenNameIdentifier	 set Compute Digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
digest	TokenNameIdentifier	 digest
=	TokenNameEQUAL	
MessageDigest	TokenNameIdentifier	 Message Digest
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"SHA-1"	TokenNameStringLiteral	SHA-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchAlgorithmException	TokenNameIdentifier	 No Such Algorithm Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// SHA-1 is standard in java 6 	TokenNameCOMMENT_LINE	SHA-1 is standard in java 6 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the digest associated to this file or null if no digest was * created. * This can only be called once the file is fully created, i.e. after * close() has been called. Otherwise an IllegalStateException is thrown. */	TokenNameCOMMENT_JAVADOC	 Return the digest associated to this file or null if no digest was created. This can only be called once the file is fully created, i.e. after close() has been called. Otherwise an IllegalStateException is thrown. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
digest	TokenNameIdentifier	 digest
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
digest	TokenNameIdentifier	 digest
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Class to hold a mark to the position of the file */	TokenNameCOMMENT_JAVADOC	 Class to hold a mark to the position of the file 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
BufferedFileWriterMark	TokenNameIdentifier	 Buffered File Writer Mark
implements	TokenNameimplements	
FileMark	TokenNameIdentifier	 File Mark
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BufferedFileWriterMark	TokenNameIdentifier	 Buffered File Writer Mark
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
}	TokenNameRBRACE	
