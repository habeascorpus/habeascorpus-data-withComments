/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
;	TokenNameSEMICOLON	
/** * Logs content written by a thread and forwards the buffers onto the * project object which will forward the content to the appropriate * task. * * @since 1.4 */	TokenNameCOMMENT_JAVADOC	 Logs content written by a thread and forwards the buffers onto the project object which will forward the content to the appropriate task. * @since 1.4 
public	TokenNamepublic	
class	TokenNameclass	
DemuxOutputStream	TokenNameIdentifier	 Demux Output Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
/** * A data class to store information about a buffer. Such information * is stored on a per-thread basis. */	TokenNameCOMMENT_JAVADOC	 A data class to store information about a buffer. Such information is stored on a per-thread basis. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
BufferInfo	TokenNameIdentifier	 Buffer Info
{	TokenNameLBRACE	
/** * The per-thread output stream. */	TokenNameCOMMENT_JAVADOC	 The per-thread output stream. 
private	TokenNameprivate	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
/** * Indicates we have just seen a carriage return. It may be part of * a crlf pair or a single cr invoking processBuffer twice. */	TokenNameCOMMENT_JAVADOC	 Indicates we have just seen a carriage return. It may be part of a crlf pair or a single cr invoking processBuffer twice. 
private	TokenNameprivate	
boolean	TokenNameboolean	
crSeen	TokenNameIdentifier	 cr Seen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Maximum buffer size. */	TokenNameCOMMENT_JAVADOC	 Maximum buffer size. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_SIZE	TokenNameIdentifier	 MAX  SIZE
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Initial buffer size. */	TokenNameCOMMENT_JAVADOC	 Initial buffer size. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INTIAL_SIZE	TokenNameIdentifier	 INTIAL  SIZE
=	TokenNameEQUAL	
132	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Carriage return */	TokenNameCOMMENT_JAVADOC	 Carriage return 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CR	TokenNameIdentifier	 CR
=	TokenNameEQUAL	
0x0d	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Linefeed */	TokenNameCOMMENT_JAVADOC	 Linefeed 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LF	TokenNameIdentifier	 LF
=	TokenNameEQUAL	
0x0a	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Mapping from thread to buffer (Thread to BufferInfo). */	TokenNameCOMMENT_JAVADOC	 Mapping from thread to buffer (Thread to BufferInfo). 
private	TokenNameprivate	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
new	TokenNamenew	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The project to send output to. */	TokenNameCOMMENT_JAVADOC	 The project to send output to. 
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/** * Whether or not this stream represents an error stream. */	TokenNameCOMMENT_JAVADOC	 Whether or not this stream represents an error stream. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isErrorStream	TokenNameIdentifier	 is Error Stream
;	TokenNameSEMICOLON	
/** * Creates a new instance of this class. * * @param project The project instance for which output is being * demultiplexed. Must not be <code>null</code>. * @param isErrorStream <code>true</code> if this is the error string, * otherwise a normal output stream. This is * passed to the project so it knows * which stream it is receiving. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of this class. * @param project The project instance for which output is being demultiplexed. Must not be <code>null</code>. @param isErrorStream <code>true</code> if this is the error string, otherwise a normal output stream. This is passed to the project so it knows which stream it is receiving. 
public	TokenNamepublic	
DemuxOutputStream	TokenNameIdentifier	 Demux Output Stream
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isErrorStream	TokenNameIdentifier	 is Error Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isErrorStream	TokenNameIdentifier	 is Error Stream
=	TokenNameEQUAL	
isErrorStream	TokenNameIdentifier	 is Error Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the buffer associated with the current thread. * * @return a BufferInfo for the current thread to write data to */	TokenNameCOMMENT_JAVADOC	 Returns the buffer associated with the current thread. * @return a BufferInfo for the current thread to write data to 
private	TokenNameprivate	
BufferInfo	TokenNameIdentifier	 Buffer Info
getBufferInfo	TokenNameIdentifier	 get Buffer Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferInfo	TokenNameIdentifier	 Buffer Info
bufferInfo	TokenNameIdentifier	 buffer Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BufferInfo	TokenNameIdentifier	 Buffer Info
)	TokenNameRPAREN	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bufferInfo	TokenNameIdentifier	 buffer Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferInfo	TokenNameIdentifier	 buffer Info
=	TokenNameEQUAL	
new	TokenNamenew	
BufferInfo	TokenNameIdentifier	 Buffer Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
INTIAL_SIZE	TokenNameIdentifier	 INTIAL  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
crSeen	TokenNameIdentifier	 cr Seen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
bufferInfo	TokenNameIdentifier	 buffer Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bufferInfo	TokenNameIdentifier	 buffer Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the buffer for the current thread. */	TokenNameCOMMENT_JAVADOC	 Resets the buffer for the current thread. 
private	TokenNameprivate	
void	TokenNamevoid	
resetBufferInfo	TokenNameIdentifier	 reset Buffer Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferInfo	TokenNameIdentifier	 Buffer Info
bufferInfo	TokenNameIdentifier	 buffer Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BufferInfo	TokenNameIdentifier	 Buffer Info
)	TokenNameRPAREN	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
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
// Shouldn't happen 	TokenNameCOMMENT_LINE	Shouldn't happen 
}	TokenNameRBRACE	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
crSeen	TokenNameIdentifier	 cr Seen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the buffer for the current thread. */	TokenNameCOMMENT_JAVADOC	 Removes the buffer for the current thread. 
private	TokenNameprivate	
void	TokenNamevoid	
removeBuffer	TokenNameIdentifier	 remove Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the data to the buffer and flushes the buffer if a line * separator is detected or if the buffer has reached its maximum size. * * @param cc data to log (byte). * @exception IOException if the data cannot be written to the stream */	TokenNameCOMMENT_JAVADOC	 Writes the data to the buffer and flushes the buffer if a line separator is detected or if the buffer has reached its maximum size. * @param cc data to log (byte). @exception IOException if the data cannot be written to the stream 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
cc	TokenNameIdentifier	 cc
;	TokenNameSEMICOLON	
BufferInfo	TokenNameIdentifier	 Buffer Info
bufferInfo	TokenNameIdentifier	 buffer Info
=	TokenNameEQUAL	
getBufferInfo	TokenNameIdentifier	 get Buffer Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// LF is always end of line (i.e. CRLF or single LF) 	TokenNameCOMMENT_LINE	LF is always end of line (i.e. CRLF or single LF) 
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processBuffer	TokenNameIdentifier	 process Buffer
(	TokenNameLPAREN	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
crSeen	TokenNameIdentifier	 cr Seen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CR without LF - send buffer then add char 	TokenNameCOMMENT_LINE	CR without LF - send buffer then add char 
processBuffer	TokenNameIdentifier	 process Buffer
(	TokenNameLPAREN	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add into buffer 	TokenNameCOMMENT_LINE	add into buffer 
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
crSeen	TokenNameIdentifier	 cr Seen
=	TokenNameEQUAL	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
crSeen	TokenNameIdentifier	 cr Seen
&&	TokenNameAND_AND	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
MAX_SIZE	TokenNameIdentifier	 MAX  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processBuffer	TokenNameIdentifier	 process Buffer
(	TokenNameLPAREN	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts the buffer to a string and sends it to the project. * * @param buffer the ByteArrayOutputStream used to collect the output * until a line separator is seen. * * @see Project#demuxOutput(String,boolean) */	TokenNameCOMMENT_JAVADOC	 Converts the buffer to a string and sends it to the project. * @param buffer the ByteArrayOutputStream used to collect the output until a line separator is seen. * @see Project#demuxOutput(String,boolean) 
protected	TokenNameprotected	
void	TokenNamevoid	
processBuffer	TokenNameIdentifier	 process Buffer
(	TokenNameLPAREN	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
demuxOutput	TokenNameIdentifier	 demux Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
isErrorStream	TokenNameIdentifier	 is Error Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetBufferInfo	TokenNameIdentifier	 reset Buffer Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the buffer to a string and sends it to the project. * * @param buffer the ByteArrayOutputStream used to collect the output * until a line separator is seen. * * @see Project#demuxOutput(String,boolean) */	TokenNameCOMMENT_JAVADOC	 Converts the buffer to a string and sends it to the project. * @param buffer the ByteArrayOutputStream used to collect the output until a line separator is seen. * @see Project#demuxOutput(String,boolean) 
protected	TokenNameprotected	
void	TokenNamevoid	
processFlush	TokenNameIdentifier	 process Flush
(	TokenNameLPAREN	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
demuxFlush	TokenNameIdentifier	 demux Flush
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
isErrorStream	TokenNameIdentifier	 is Error Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetBufferInfo	TokenNameIdentifier	 reset Buffer Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Equivalent to flushing the stream. * * @exception IOException if there is a problem closing the stream. * * @see #flush */	TokenNameCOMMENT_JAVADOC	 Equivalent to flushing the stream. * @exception IOException if there is a problem closing the stream. * @see #flush 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeBuffer	TokenNameIdentifier	 remove Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes all remaining data in the buffer associated * with the current thread to the project. * * @exception IOException if there is a problem flushing the stream. */	TokenNameCOMMENT_JAVADOC	 Writes all remaining data in the buffer associated with the current thread to the project. * @exception IOException if there is a problem flushing the stream. 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferInfo	TokenNameIdentifier	 Buffer Info
bufferInfo	TokenNameIdentifier	 buffer Info
=	TokenNameEQUAL	
getBufferInfo	TokenNameIdentifier	 get Buffer Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processFlush	TokenNameIdentifier	 process Flush
(	TokenNameLPAREN	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write a block of characters to the output stream * * @param b the array containing the data * @param off the offset into the array where data starts * @param len the length of block * * @throws IOException if the data cannot be written into the stream. */	TokenNameCOMMENT_JAVADOC	 Write a block of characters to the output stream * @param b the array containing the data @param off the offset into the array where data starts @param len the length of block * @throws IOException if the data cannot be written into the stream. 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// find the line breaks and pass other chars through in blocks 	TokenNameCOMMENT_LINE	find the line breaks and pass other chars through in blocks 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
int	TokenNameint	
blockStartOffset	TokenNameIdentifier	 block Start Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
remaining	TokenNameIdentifier	 remaining
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
BufferInfo	TokenNameIdentifier	 Buffer Info
bufferInfo	TokenNameIdentifier	 buffer Info
=	TokenNameEQUAL	
getBufferInfo	TokenNameIdentifier	 get Buffer Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
LF	TokenNameIdentifier	 LF
&&	TokenNameAND_AND	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
CR	TokenNameIdentifier	 CR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
remaining	TokenNameIdentifier	 remaining
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// either end of buffer or a line separator char 	TokenNameCOMMENT_LINE	either end of buffer or a line separator char 
int	TokenNameint	
blockLength	TokenNameIdentifier	 block Length
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
blockStartOffset	TokenNameIdentifier	 block Start Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
blockLength	TokenNameIdentifier	 block Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferInfo	TokenNameIdentifier	 buffer Info
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
blockStartOffset	TokenNameIdentifier	 block Start Offset
,	TokenNameCOMMA	
blockLength	TokenNameIdentifier	 block Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
LF	TokenNameIdentifier	 LF
||	TokenNameOR_OR	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CR	TokenNameIdentifier	 CR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
remaining	TokenNameIdentifier	 remaining
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
blockStartOffset	TokenNameIdentifier	 block Start Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
