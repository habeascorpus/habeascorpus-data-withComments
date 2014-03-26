/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
io	TokenNameIdentifier	 io
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
/** * <p>Reader for the ISO-8859-1 encoding.</p> * * @xerces.internal * * @author Michael Glavassevich, IBM * * @version $Id: Latin1Reader.java 718095 2008-11-16 20:00:14Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Reader for the ISO-8859-1 encoding.</p> * @xerces.internal * @author Michael Glavassevich, IBM * @version $Id: Latin1Reader.java 718095 2008-11-16 20:00:14Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Latin1Reader	TokenNameIdentifier	 Latin1 Reader
extends	TokenNameextends	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default byte buffer size (2048). */	TokenNameCOMMENT_JAVADOC	 Default byte buffer size (2048). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
=	TokenNameEQUAL	
2048	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Input stream. */	TokenNameCOMMENT_JAVADOC	 Input stream. 
protected	TokenNameprotected	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
fInputStream	TokenNameIdentifier	 f Input Stream
;	TokenNameSEMICOLON	
/** Byte buffer. */	TokenNameCOMMENT_JAVADOC	 Byte buffer. 
protected	TokenNameprotected	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fBuffer	TokenNameIdentifier	 f Buffer
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs an ISO-8859-1 reader from the specified input stream * using the default buffer size. * * @param inputStream The input stream. */	TokenNameCOMMENT_JAVADOC	 Constructs an ISO-8859-1 reader from the specified input stream using the default buffer size. * @param inputStream The input stream. 
public	TokenNamepublic	
Latin1Reader	TokenNameIdentifier	 Latin1 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream) 	TokenNameCOMMENT_LINE	<init>(InputStream) 
/** * Constructs an ISO-8859-1 reader from the specified input stream * and buffer size. * * @param inputStream The input stream. * @param size The initial buffer size. */	TokenNameCOMMENT_JAVADOC	 Constructs an ISO-8859-1 reader from the specified input stream and buffer size. * @param inputStream The input stream. @param size The initial buffer size. 
public	TokenNamepublic	
Latin1Reader	TokenNameIdentifier	 Latin1 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream, int) 	TokenNameCOMMENT_LINE	<init>(InputStream, int) 
/** * Constructs an ISO-8859-1 reader from the specified input stream and buffer. * * @param inputStream The input stream. * @param buffer The byte buffer. */	TokenNameCOMMENT_JAVADOC	 Constructs an ISO-8859-1 reader from the specified input stream and buffer. * @param inputStream The input stream. @param buffer The byte buffer. 
public	TokenNamepublic	
Latin1Reader	TokenNameIdentifier	 Latin1 Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fInputStream	TokenNameIdentifier	 f Input Stream
=	TokenNameEQUAL	
inputStream	TokenNameIdentifier	 input Stream
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream, byte[]) 	TokenNameCOMMENT_LINE	<init>(InputStream, byte[]) 
// 	TokenNameCOMMENT_LINE	 
// Reader methods 	TokenNameCOMMENT_LINE	Reader methods 
// 	TokenNameCOMMENT_LINE	 
/** * Read a single character. This method will block until a character is * available, an I/O error occurs, or the end of the stream is reached. * * <p> Subclasses that intend to support efficient single-character input * should override this method. * * @return The character read, as an integer in the range 0 to 255 * (<tt>0x00-0xff</tt>), or -1 if the end of the stream has * been reached * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Read a single character. This method will block until a character is available, an I/O error occurs, or the end of the stream is reached. * <p> Subclasses that intend to support efficient single-character input should override this method. * @return The character read, as an integer in the range 0 to 255 (<tt>0x00-0xff</tt>), or -1 if the end of the stream has been reached * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read():int 	TokenNameCOMMENT_LINE	read():int 
/** * Read characters into a portion of an array. This method will block * until some input is available, an I/O error occurs, or the end of the * stream is reached. * * @param ch Destination buffer * @param offset Offset at which to start storing characters * @param length Maximum number of characters to read * * @return The number of characters read, or -1 if the end of the * stream has been reached * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Read characters into a portion of an array. This method will block until some input is available, an I/O error occurs, or the end of the stream is reached. * @param ch Destination buffer @param offset Offset at which to start storing characters @param length Maximum number of characters to read * @return The number of characters read, or -1 if the end of the stream has been reached * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
fBuffer	TokenNameIdentifier	 f Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fBuffer	TokenNameIdentifier	 f Buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read(char[],int,int) 	TokenNameCOMMENT_LINE	read(char[],int,int) 
/** * Skip characters. This method will block until some characters are * available, an I/O error occurs, or the end of the stream is reached. * * @param n The number of characters to skip * * @return The number of characters actually skipped * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Skip characters. This method will block until some characters are available, an I/O error occurs, or the end of the stream is reached. * @param n The number of characters to skip * @return The number of characters actually skipped * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
long	TokenNamelong	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip(long):long 	TokenNameCOMMENT_LINE	skip(long):long 
/** * Tell whether this stream is ready to be read. * * @return True if the next read() is guaranteed not to block for input, * false otherwise. Note that returning false does not guarantee that the * next read will block. * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Tell whether this stream is ready to be read. * @return True if the next read() is guaranteed not to block for input, false otherwise. Note that returning false does not guarantee that the next read will block. * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
boolean	TokenNameboolean	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ready() 	TokenNameCOMMENT_LINE	ready() 
/** * Tell whether this stream supports the mark() operation. */	TokenNameCOMMENT_JAVADOC	 Tell whether this stream supports the mark() operation. 
public	TokenNamepublic	
boolean	TokenNameboolean	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// markSupported() 	TokenNameCOMMENT_LINE	markSupported() 
/** * Mark the present position in the stream. Subsequent calls to reset() * will attempt to reposition the stream to this point. Not all * character-input streams support the mark() operation. * * @param readAheadLimit Limit on the number of characters that may be * read while still preserving the mark. After * reading this many characters, attempting to * reset the stream may fail. * * @exception IOException If the stream does not support mark(), * or if some other I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Mark the present position in the stream. Subsequent calls to reset() will attempt to reposition the stream to this point. Not all character-input streams support the mark() operation. * @param readAheadLimit Limit on the number of characters that may be read while still preserving the mark. After reading this many characters, attempting to reset the stream may fail. * @exception IOException If the stream does not support mark(), or if some other I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
int	TokenNameint	
readAheadLimit	TokenNameIdentifier	 read Ahead Limit
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
readAheadLimit	TokenNameIdentifier	 read Ahead Limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// mark(int) 	TokenNameCOMMENT_LINE	mark(int) 
/** * Reset the stream. If the stream has been marked, then attempt to * reposition it at the mark. If the stream has not been marked, then * attempt to reset it in some way appropriate to the particular stream, * for example by repositioning it to its starting point. Not all * character-input streams support the reset() operation, and some support * reset() without supporting mark(). * * @exception IOException If the stream has not been marked, * or if the mark has been invalidated, * or if the stream does not support reset(), * or if some other I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Reset the stream. If the stream has been marked, then attempt to reposition it at the mark. If the stream has not been marked, then attempt to reset it in some way appropriate to the particular stream, for example by repositioning it to its starting point. Not all character-input streams support the reset() operation, and some support reset() without supporting mark(). * @exception IOException If the stream has not been marked, or if the mark has been invalidated, or if the stream does not support reset(), or if some other I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset() 	TokenNameCOMMENT_LINE	reset() 
/** * Close the stream. Once a stream has been closed, further read(), * ready(), mark(), or reset() invocations will throw an IOException. * Closing a previously-closed stream, however, has no effect. * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Close the stream. Once a stream has been closed, further read(), ready(), mark(), or reset() invocations will throw an IOException. Closing a previously-closed stream, however, has no effect. * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fInputStream	TokenNameIdentifier	 f Input Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// close() 	TokenNameCOMMENT_LINE	close() 
}	TokenNameRBRACE	
// class Latin1Reader 	TokenNameCOMMENT_LINE	class Latin1Reader 
