/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
io	TokenNameIdentifier	 io
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilterOutputStream	TokenNameIdentifier	 Filter Output Stream
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
/** * This output stream works in conjunction with the WrappedInputStream * to introduce a protocol for sending arbitrary length data in a * uniform way. This output stream allows variable length data to be * inserted into an existing output stream so that it can be read by * an input stream without reading too many bytes (in case of buffering * by the input stream). * <p> * This output stream is used like any normal output stream. The protocol * is introduced by the WrappedOutputStream and does not need to be known * by the user of this class. However, for those that are interested, the * method is described below. * <p> * The output stream writes the requested bytes as packets of binary * information. The packet consists of a header and payload. The header * is two bytes of a single unsigned short (written in network order) * that specifies the length of bytes in the payload. A header value of * 0 indicates that the stream is "closed". * <p> * <strong>Note:</strong> For this wrapped output stream to be used, * the application <strong>must</strong> call <code>close()</code> * to end the output. * * @see WrappedInputStream * * @author Andy Clark, IBM * * @version $Id: WrappedOutputStream.java 447688 2006-09-19 02:39:49Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This output stream works in conjunction with the WrappedInputStream to introduce a protocol for sending arbitrary length data in a uniform way. This output stream allows variable length data to be inserted into an existing output stream so that it can be read by an input stream without reading too many bytes (in case of buffering by the input stream). <p> This output stream is used like any normal output stream. The protocol is introduced by the WrappedOutputStream and does not need to be known by the user of this class. However, for those that are interested, the method is described below. <p> The output stream writes the requested bytes as packets of binary information. The packet consists of a header and payload. The header is two bytes of a single unsigned short (written in network order) that specifies the length of bytes in the payload. A header value of 0 indicates that the stream is "closed". <p> <strong>Note:</strong> For this wrapped output stream to be used, the application <strong>must</strong> call <code>close()</code> to end the output. * @see WrappedInputStream * @author Andy Clark, IBM * @version $Id: WrappedOutputStream.java 447688 2006-09-19 02:39:49Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
WrappedOutputStream	TokenNameIdentifier	 Wrapped Output Stream
extends	TokenNameextends	
FilterOutputStream	TokenNameIdentifier	 Filter Output Stream
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default buffer size (1024). */	TokenNameCOMMENT_JAVADOC	 Default buffer size (1024). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Buffer. */	TokenNameCOMMENT_JAVADOC	 Buffer. 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fBuffer	TokenNameIdentifier	 f Buffer
;	TokenNameSEMICOLON	
/** Buffer position. */	TokenNameCOMMENT_JAVADOC	 Buffer position. 
protected	TokenNameprotected	
int	TokenNameint	
fPosition	TokenNameIdentifier	 f Position
;	TokenNameSEMICOLON	
/** * Data output stream. This stream is used to output the block sizes * into the data stream that are read by the WrappedInputStream. * <p> * <strong>Note:</strong> The data output stream is only used for * writing the byte count for performance reasons. We avoid the * method indirection for writing the byte data. */	TokenNameCOMMENT_JAVADOC	 Data output stream. This stream is used to output the block sizes into the data stream that are read by the WrappedInputStream. <p> <strong>Note:</strong> The data output stream is only used for writing the byte count for performance reasons. We avoid the method indirection for writing the byte data. 
protected	TokenNameprotected	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
fDataOutputStream	TokenNameIdentifier	 f Data Output Stream
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a wrapper for the given output stream. */	TokenNameCOMMENT_JAVADOC	 Constructs a wrapper for the given output stream. 
public	TokenNamepublic	
WrappedOutputStream	TokenNameIdentifier	 Wrapped Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(OutputStream) 	TokenNameCOMMENT_LINE	<init>(OutputStream) 
/** * Constructs a wrapper for the given output stream with the * given buffer size. */	TokenNameCOMMENT_JAVADOC	 Constructs a wrapper for the given output stream with the given buffer size. 
public	TokenNamepublic	
WrappedOutputStream	TokenNameIdentifier	 Wrapped Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
bufferSize	TokenNameIdentifier	 buffer Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fDataOutputStream	TokenNameIdentifier	 f Data Output Stream
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(OutputStream) 	TokenNameCOMMENT_LINE	<init>(OutputStream) 
// 	TokenNameCOMMENT_LINE	 
// OutputStream methods 	TokenNameCOMMENT_LINE	OutputStream methods 
// 	TokenNameCOMMENT_LINE	 
/** * Writes a single byte to the output. * <p> * <strong>Note:</strong> Single bytes written to the output stream * will be buffered */	TokenNameCOMMENT_JAVADOC	 Writes a single byte to the output. <p> <strong>Note:</strong> Single bytes written to the output stream will be buffered 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
fPosition	TokenNameIdentifier	 f Position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fPosition	TokenNameIdentifier	 f Position
==	TokenNameEQUAL_EQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPosition	TokenNameIdentifier	 f Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fDataOutputStream	TokenNameIdentifier	 f Data Output Stream
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
fBuffer	TokenNameIdentifier	 f Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// write(int) 	TokenNameCOMMENT_LINE	write(int) 
/** Writes an array of bytes to the output. */	TokenNameCOMMENT_JAVADOC	 Writes an array of bytes to the output. 
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
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// flush existing buffer 	TokenNameCOMMENT_LINE	flush existing buffer 
if	TokenNameif	
(	TokenNameLPAREN	
fPosition	TokenNameIdentifier	 f Position
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush0	TokenNameIdentifier	 flush0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// write header followed by actual bytes 	TokenNameCOMMENT_LINE	write header followed by actual bytes 
fDataOutputStream	TokenNameIdentifier	 f Data Output Stream
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// write(byte[]) 	TokenNameCOMMENT_LINE	write(byte[]) 
/** * Flushes the output buffer, writing all bytes currently in * the buffer to the output. */	TokenNameCOMMENT_JAVADOC	 Flushes the output buffer, writing all bytes currently in the buffer to the output. 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
flush0	TokenNameIdentifier	 flush0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// flush() 	TokenNameCOMMENT_LINE	flush() 
/** * Closes the output stream. This method <strong>must</strong> be * called when done writing all data to the output stream. * <p> * <strong>Note:</strong> This method does <em>not</em> close the * actual output stream, only makes the input stream see the stream * closed. Do not write bytes after closing the output stream. */	TokenNameCOMMENT_JAVADOC	 Closes the output stream. This method <strong>must</strong> be called when done writing all data to the output stream. <p> <strong>Note:</strong> This method does <em>not</em> close the actual output stream, only makes the input stream see the stream closed. Do not write bytes after closing the output stream. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
flush0	TokenNameIdentifier	 flush0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDataOutputStream	TokenNameIdentifier	 f Data Output Stream
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// close() 	TokenNameCOMMENT_LINE	close() 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** * Flushes the output buffer, writing all bytes currently in * the buffer to the output. This method does not call the * flush() method of the output stream; it merely writes the * remaining bytes in the buffer. */	TokenNameCOMMENT_JAVADOC	 Flushes the output buffer, writing all bytes currently in the buffer to the output. This method does not call the flush() method of the output stream; it merely writes the remaining bytes in the buffer. 
public	TokenNamepublic	
void	TokenNamevoid	
flush0	TokenNameIdentifier	 flush0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fPosition	TokenNameIdentifier	 f Position
;	TokenNameSEMICOLON	
fPosition	TokenNameIdentifier	 f Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDataOutputStream	TokenNameIdentifier	 f Data Output Stream
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
fBuffer	TokenNameIdentifier	 f Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// flush0() 	TokenNameCOMMENT_LINE	flush0() 
}	TokenNameRBRACE	
// class WrappedOutputStream 	TokenNameCOMMENT_LINE	class WrappedOutputStream 
