/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: WriterToUTF8Buffered.java 469356 2006-10-31 03:20:34Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: WriterToUTF8Buffered.java 469356 2006-10-31 03:20:34Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
/** * This class writes unicode characters to a byte stream (java.io.OutputStream) * as quickly as possible. It buffers the output in an internal * buffer which must be flushed to the OutputStream when done. This flushing * is done via the close() flush() or flushBuffer() method. * * This class is only used internally within Xalan. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class writes unicode characters to a byte stream (java.io.OutputStream) as quickly as possible. It buffers the output in an internal buffer which must be flushed to the OutputStream when done. This flushing is done via the close() flush() or flushBuffer() method. * This class is only used internally within Xalan. * @xsl.usage internal 
final	TokenNamefinal	
class	TokenNameclass	
WriterToUTF8Buffered	TokenNameIdentifier	 Writer To UT F8 Buffered
extends	TokenNameextends	
Writer	TokenNameIdentifier	 Writer
implements	TokenNameimplements	
WriterChain	TokenNameIdentifier	 Writer Chain
{	TokenNameLBRACE	
/** number of bytes that the byte buffer can hold. * This is a fixed constant is used rather than m_outputBytes.lenght for performance. */	TokenNameCOMMENT_JAVADOC	 number of bytes that the byte buffer can hold. This is a fixed constant is used rather than m_outputBytes.lenght for performance. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTES_MAX	TokenNameIdentifier	 BYTES  MAX
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** number of characters that the character buffer can hold. * This is 1/3 of the number of bytes because UTF-8 encoding * can expand one unicode character by up to 3 bytes. */	TokenNameCOMMENT_JAVADOC	 number of characters that the character buffer can hold. This is 1/3 of the number of bytes because UTF-8 encoding can expand one unicode character by up to 3 bytes. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHARS_MAX	TokenNameIdentifier	 CHARS  MAX
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BYTES_MAX	TokenNameIdentifier	 BYTES  MAX
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// private static final int 	TokenNameCOMMENT_LINE	private static final int 
/** The byte stream to write to. (sc & sb remove final to compile in JDK 1.1.8) */	TokenNameCOMMENT_JAVADOC	 The byte stream to write to. (sc & sb remove final to compile in JDK 1.1.8) 
private	TokenNameprivate	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
m_os	TokenNameIdentifier	 m os
;	TokenNameSEMICOLON	
/** * The internal buffer where data is stored. * (sc & sb remove final to compile in JDK 1.1.8) */	TokenNameCOMMENT_JAVADOC	 The internal buffer where data is stored. (sc & sb remove final to compile in JDK 1.1.8) 
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
m_inputChars	TokenNameIdentifier	 m input Chars
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * The number of valid bytes in the buffer. This value is always * in the range <tt>0</tt> through <tt>m_outputBytes.length</tt>; elements * <tt>m_outputBytes[0]</tt> through <tt>m_outputBytes[count-1]</tt> contain valid * byte data. */	TokenNameCOMMENT_JAVADOC	 The number of valid bytes in the buffer. This value is always in the range <tt>0</tt> through <tt>m_outputBytes.length</tt>; elements <tt>m_outputBytes[0]</tt> through <tt>m_outputBytes[count-1]</tt> contain valid byte data. 
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * Create an buffered UTF-8 writer. * * * @param out the underlying output stream. * * @throws UnsupportedEncodingException */	TokenNameCOMMENT_JAVADOC	 Create an buffered UTF-8 writer. * @param out the underlying output stream. * @throws UnsupportedEncodingException 
public	TokenNamepublic	
WriterToUTF8Buffered	TokenNameIdentifier	 Writer To UT F8 Buffered
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_os	TokenNameIdentifier	 m os
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
// get 3 extra bytes to make buffer overflow checking simpler and faster 	TokenNameCOMMENT_LINE	get 3 extra bytes to make buffer overflow checking simpler and faster 
// we won't have to keep checking for a few extra characters 	TokenNameCOMMENT_LINE	we won't have to keep checking for a few extra characters 
m_outputBytes	TokenNameIdentifier	 m output Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
BYTES_MAX	TokenNameIdentifier	 BYTES  MAX
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Big enough to hold the input chars that will be transformed 	TokenNameCOMMENT_LINE	Big enough to hold the input chars that will be transformed 
// into output bytes in m_ouputBytes. 	TokenNameCOMMENT_LINE	into output bytes in m_ouputBytes. 
m_inputChars	TokenNameIdentifier	 m input Chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
CHARS_MAX	TokenNameIdentifier	 CHARS  MAX
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// the old body of this constructor, before the buffersize was changed to a constant 	TokenNameCOMMENT_LINE	the old body of this constructor, before the buffersize was changed to a constant 
// this(out, 8*1024); 	TokenNameCOMMENT_LINE	this(out, 8*1024); 
}	TokenNameRBRACE	
/** * Create an buffered UTF-8 writer to write data to the * specified underlying output stream with the specified buffer * size. * * @param out the underlying output stream. * @param size the buffer size. * @exception IllegalArgumentException if size <= 0. */	TokenNameCOMMENT_JAVADOC	 Create an buffered UTF-8 writer to write data to the specified underlying output stream with the specified buffer size. * @param out the underlying output stream. @param size the buffer size. @exception IllegalArgumentException if size <= 0. 
// public WriterToUTF8Buffered(final OutputStream out, final int size) 	TokenNameCOMMENT_LINE	public WriterToUTF8Buffered(final OutputStream out, final int size) 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// m_os = out; 	TokenNameCOMMENT_LINE	m_os = out; 
// 	TokenNameCOMMENT_LINE	 
// if (size <= 0) 	TokenNameCOMMENT_LINE	if (size <= 0) 
// { 	TokenNameCOMMENT_LINE	{ 
// throw new IllegalArgumentException( 	TokenNameCOMMENT_LINE	throw new IllegalArgumentException( 
// SerializerMessages.createMessage(SerializerErrorResources.ER_BUFFER_SIZE_LESSTHAN_ZERO, null)); //"Buffer size <= 0"); 	TokenNameCOMMENT_LINE	SerializerMessages.createMessage(SerializerErrorResources.ER_BUFFER_SIZE_LESSTHAN_ZERO, null)); //"Buffer size <= 0"); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// m_outputBytes = new byte[size]; 	TokenNameCOMMENT_LINE	m_outputBytes = new byte[size]; 
// count = 0; 	TokenNameCOMMENT_LINE	count = 0; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Write a single character. The character to be written is contained in * the 16 low-order bits of the given integer value; the 16 high-order bits * are ignored. * * <p> Subclasses that intend to support efficient single-character output * should override this method. * * @param c int specifying a character to be written. * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Write a single character. The character to be written is contained in the 16 low-order bits of the given integer value; the 16 high-order bits are ignored. * <p> Subclasses that intend to support efficient single-character output should override this method. * @param c int specifying a character to be written. @exception IOException If an I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* If we are close to the end of the buffer then flush it. * Remember the buffer can hold a few more bytes than BYTES_MAX */	TokenNameCOMMENT_BLOCK	 If we are close to the end of the buffer then flush it. Remember the buffer can hold a few more bytes than BYTES_MAX 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>=	TokenNameGREATER_EQUAL	
BYTES_MAX	TokenNameIdentifier	 BYTES  MAX
)	TokenNameRPAREN	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xc0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xe0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xf0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputBytes	TokenNameIdentifier	 m output Bytes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write a portion of an array of characters. * * @param chars Array of characters * @param start Offset from which to start writing characters * @param length Number of characters to write * * @exception IOException If an I/O error occurs * * @throws java.io.IOException */	TokenNameCOMMENT_JAVADOC	 Write a portion of an array of characters. * @param chars Array of characters @param start Offset from which to start writing characters @param length Number of characters to write * @exception IOException If an I/O error occurs * @throws java.io.IOException 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// We multiply the length by three since this is the maximum length 	TokenNameCOMMENT_LINE	We multiply the length by three since this is the maximum length 
// of the characters that we can put into the buffer. It is possible 	TokenNameCOMMENT_LINE	of the characters that we can put into the buffer. It is possible 
// for each Unicode character to expand to three bytes. 	TokenNameCOMMENT_LINE	for each Unicode character to expand to three bytes. 
int	TokenNameint	
lengthx3	TokenNameIdentifier	 lengthx3
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lengthx3	TokenNameIdentifier	 lengthx3
>=	TokenNameGREATER_EQUAL	
BYTES_MAX	TokenNameIdentifier	 BYTES  MAX
-	TokenNameMINUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The requested length is greater than the unused part of the buffer 	TokenNameCOMMENT_LINE	The requested length is greater than the unused part of the buffer 
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lengthx3	TokenNameIdentifier	 lengthx3
>	TokenNameGREATER	
BYTES_MAX	TokenNameIdentifier	 BYTES  MAX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * The requested length exceeds the size of the buffer. * Cut the buffer up into chunks, each of which will * not cause an overflow to the output buffer m_outputBytes, * and make multiple recursive calls. * Be careful about integer overflows in multiplication. */	TokenNameCOMMENT_BLOCK	 The requested length exceeds the size of the buffer. Cut the buffer up into chunks, each of which will not cause an overflow to the output buffer m_outputBytes, and make multiple recursive calls. Be careful about integer overflows in multiplication. 
int	TokenNameint	
split	TokenNameIdentifier	 split
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
/	TokenNameDIVIDE	
CHARS_MAX	TokenNameIdentifier	 CHARS  MAX
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
chunks	TokenNameIdentifier	 chunks
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
%	TokenNameREMAINDER	
CHARS_MAX	TokenNameIdentifier	 CHARS  MAX
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
chunks	TokenNameIdentifier	 chunks
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
chunks	TokenNameIdentifier	 chunks
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
;	TokenNameSEMICOLON	
int	TokenNameint	
end_chunk	TokenNameIdentifier	 end chunk
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
<=	TokenNameLESS_EQUAL	
chunks	TokenNameIdentifier	 chunks
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start_chunk	TokenNameIdentifier	 start chunk
=	TokenNameEQUAL	
end_chunk	TokenNameIdentifier	 end chunk
;	TokenNameSEMICOLON	
end_chunk	TokenNameIdentifier	 end chunk
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
chunks	TokenNameIdentifier	 chunks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Adjust the end of the chunk if it ends on a high char 	TokenNameCOMMENT_LINE	Adjust the end of the chunk if it ends on a high char 
// of a Unicode surrogate pair and low char of the pair 	TokenNameCOMMENT_LINE	of a Unicode surrogate pair and low char of the pair 
// is not going to be in the same chunk 	TokenNameCOMMENT_LINE	is not going to be in the same chunk 
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
end_chunk	TokenNameIdentifier	 end chunk
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
ic	TokenNameIdentifier	 ic
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
end_chunk	TokenNameIdentifier	 end chunk
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0xD800	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0xDBFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The last Java char that we were going 	TokenNameCOMMENT_LINE	The last Java char that we were going 
// to process is the first of a 	TokenNameCOMMENT_LINE	to process is the first of a 
// Java surrogate char pair that 	TokenNameCOMMENT_LINE	Java surrogate char pair that 
// represent a Unicode character. 	TokenNameCOMMENT_LINE	represent a Unicode character. 
if	TokenNameif	
(	TokenNameLPAREN	
end_chunk	TokenNameIdentifier	 end chunk
<	TokenNameLESS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Avoid spanning by including the low 	TokenNameCOMMENT_LINE	Avoid spanning by including the low 
// char in the current chunk of chars. 	TokenNameCOMMENT_LINE	char in the current chunk of chars. 
end_chunk	TokenNameIdentifier	 end chunk
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* This is the last char of the last chunk, * and it is the high char of a high/low pair with * no low char provided. * TODO: error message needed. * The char array incorrectly ends in a high char * of a high/low surrogate pair, but there is * no corresponding low as the high is the last char */	TokenNameCOMMENT_BLOCK	 This is the last char of the last chunk, and it is the high char of a high/low pair with no low char provided. TODO: error message needed. The char array incorrectly ends in a high char of a high/low surrogate pair, but there is no corresponding low as the high is the last char 
end_chunk	TokenNameIdentifier	 end chunk
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
len_chunk	TokenNameIdentifier	 len chunk
=	TokenNameEQUAL	
(	TokenNameLPAREN	
end_chunk	TokenNameIdentifier	 end chunk
-	TokenNameMINUS	
start_chunk	TokenNameIdentifier	 start chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start_chunk	TokenNameIdentifier	 start chunk
,	TokenNameCOMMA	
len_chunk	TokenNameIdentifier	 len chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf_loc	TokenNameIdentifier	 buf loc
=	TokenNameEQUAL	
m_outputBytes	TokenNameIdentifier	 m output Bytes
;	TokenNameSEMICOLON	
// local reference for faster access 	TokenNameCOMMENT_LINE	local reference for faster access 
int	TokenNameint	
count_loc	TokenNameIdentifier	 count loc
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// local integer for faster access 	TokenNameCOMMENT_LINE	local integer for faster access 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
/* This block could be omitted and the code would produce * the same result. But this block exists to give the JIT * a better chance of optimizing a tight and common loop which * occurs when writing out ASCII characters. */	TokenNameCOMMENT_BLOCK	 This block could be omitted and the code would produce the same result. But this block exists to give the JIT a better chance of optimizing a tight and common loop which occurs when writing out ASCII characters. 
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xc0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The following else if condition is added to support XML 1.1 Characters for * UTF-8: [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]* * Unicode: [1101 10ww] [wwzz zzyy] (high surrogate) * [1101 11yy] [yyxx xxxx] (low surrogate) * * uuuuu = wwww + 1 */	TokenNameCOMMENT_JAVADOC	 The following else if condition is added to support XML 1.1 Characters for UTF-8: [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]* Unicode: [1101 10ww] [wwzz zzyy] (high surrogate) [1101 11yy] [yyxx xxxx] (low surrogate) * uuuuu = wwww + 1 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0xD800	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0xDBFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
;	TokenNameSEMICOLON	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xF0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
+	TokenNamePLUS	
0x40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xf0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
+	TokenNamePLUS	
0x40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xe0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Store the local integer back into the instance variable 	TokenNameCOMMENT_LINE	Store the local integer back into the instance variable 
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
count_loc	TokenNameIdentifier	 count loc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a string. * * @param s String to be written * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Write a string. * @param s String to be written * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// We multiply the length by three since this is the maximum length 	TokenNameCOMMENT_LINE	We multiply the length by three since this is the maximum length 
// of the characters that we can put into the buffer. It is possible 	TokenNameCOMMENT_LINE	of the characters that we can put into the buffer. It is possible 
// for each Unicode character to expand to three bytes. 	TokenNameCOMMENT_LINE	for each Unicode character to expand to three bytes. 
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lengthx3	TokenNameIdentifier	 lengthx3
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lengthx3	TokenNameIdentifier	 lengthx3
>=	TokenNameGREATER_EQUAL	
BYTES_MAX	TokenNameIdentifier	 BYTES  MAX
-	TokenNameMINUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The requested length is greater than the unused part of the buffer 	TokenNameCOMMENT_LINE	The requested length is greater than the unused part of the buffer 
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lengthx3	TokenNameIdentifier	 lengthx3
>	TokenNameGREATER	
BYTES_MAX	TokenNameIdentifier	 BYTES  MAX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * The requested length exceeds the size of the buffer, * so break it up in chunks that don't exceed the buffer size. */	TokenNameCOMMENT_BLOCK	 The requested length exceeds the size of the buffer, so break it up in chunks that don't exceed the buffer size. 
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
split	TokenNameIdentifier	 split
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
/	TokenNameDIVIDE	
CHARS_MAX	TokenNameIdentifier	 CHARS  MAX
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
chunks	TokenNameIdentifier	 chunks
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
%	TokenNameREMAINDER	
CHARS_MAX	TokenNameIdentifier	 CHARS  MAX
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
chunks	TokenNameIdentifier	 chunks
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
chunks	TokenNameIdentifier	 chunks
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
;	TokenNameSEMICOLON	
int	TokenNameint	
end_chunk	TokenNameIdentifier	 end chunk
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
<=	TokenNameLESS_EQUAL	
chunks	TokenNameIdentifier	 chunks
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start_chunk	TokenNameIdentifier	 start chunk
=	TokenNameEQUAL	
end_chunk	TokenNameIdentifier	 end chunk
;	TokenNameSEMICOLON	
end_chunk	TokenNameIdentifier	 end chunk
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
chunks	TokenNameIdentifier	 chunks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
start_chunk	TokenNameIdentifier	 start chunk
,	TokenNameCOMMA	
end_chunk	TokenNameIdentifier	 end chunk
,	TokenNameCOMMA	
m_inputChars	TokenNameIdentifier	 m input Chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len_chunk	TokenNameIdentifier	 len chunk
=	TokenNameEQUAL	
(	TokenNameLPAREN	
end_chunk	TokenNameIdentifier	 end chunk
-	TokenNameMINUS	
start_chunk	TokenNameIdentifier	 start chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Adjust the end of the chunk if it ends on a high char 	TokenNameCOMMENT_LINE	Adjust the end of the chunk if it ends on a high char 
// of a Unicode surrogate pair and low char of the pair 	TokenNameCOMMENT_LINE	of a Unicode surrogate pair and low char of the pair 
// is not going to be in the same chunk 	TokenNameCOMMENT_LINE	is not going to be in the same chunk 
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
m_inputChars	TokenNameIdentifier	 m input Chars
[	TokenNameLBRACKET	
len_chunk	TokenNameIdentifier	 len chunk
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0xD800	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0xDBFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Exclude char in this chunk, 	TokenNameCOMMENT_LINE	Exclude char in this chunk, 
// to avoid spanning a Unicode character 	TokenNameCOMMENT_LINE	to avoid spanning a Unicode character 
// that is in two Java chars as a high/low surrogate 	TokenNameCOMMENT_LINE	that is in two Java chars as a high/low surrogate 
end_chunk	TokenNameIdentifier	 end chunk
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
len_chunk	TokenNameIdentifier	 len chunk
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
==	TokenNameEQUAL_EQUAL	
chunks	TokenNameIdentifier	 chunks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* TODO: error message needed. * The String incorrectly ends in a high char * of a high/low surrogate pair, but there is * no corresponding low as the high is the last char * Recover by ignoring this last char. */	TokenNameCOMMENT_BLOCK	 TODO: error message needed. The String incorrectly ends in a high char of a high/low surrogate pair, but there is no corresponding low as the high is the last char Recover by ignoring this last char. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_inputChars	TokenNameIdentifier	 m input Chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len_chunk	TokenNameIdentifier	 len chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
m_inputChars	TokenNameIdentifier	 m input Chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
m_inputChars	TokenNameIdentifier	 m input Chars
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf_loc	TokenNameIdentifier	 buf loc
=	TokenNameEQUAL	
m_outputBytes	TokenNameIdentifier	 m output Bytes
;	TokenNameSEMICOLON	
// local reference for faster access 	TokenNameCOMMENT_LINE	local reference for faster access 
int	TokenNameint	
count_loc	TokenNameIdentifier	 count loc
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// local integer for faster access 	TokenNameCOMMENT_LINE	local integer for faster access 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
/* This block could be omitted and the code would produce * the same result. But this block exists to give the JIT * a better chance of optimizing a tight and common loop which * occurs when writing out ASCII characters. */	TokenNameCOMMENT_BLOCK	 This block could be omitted and the code would produce the same result. But this block exists to give the JIT a better chance of optimizing a tight and common loop which occurs when writing out ASCII characters. 
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xc0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The following else if condition is added to support XML 1.1 Characters for * UTF-8: [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]* * Unicode: [1101 10ww] [wwzz zzyy] (high surrogate) * [1101 11yy] [yyxx xxxx] (low surrogate) * * uuuuu = wwww + 1 */	TokenNameCOMMENT_JAVADOC	 The following else if condition is added to support XML 1.1 Characters for UTF-8: [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]* Unicode: [1101 10ww] [wwzz zzyy] (high surrogate) [1101 11yy] [yyxx xxxx] (low surrogate) * uuuuu = wwww + 1 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0xD800	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0xDBFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
;	TokenNameSEMICOLON	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xF0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
+	TokenNamePLUS	
0x40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xf0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
+	TokenNamePLUS	
0x40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xe0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf_loc	TokenNameIdentifier	 buf loc
[	TokenNameLBRACKET	
count_loc	TokenNameIdentifier	 count loc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Store the local integer back into the instance variable 	TokenNameCOMMENT_LINE	Store the local integer back into the instance variable 
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
count_loc	TokenNameIdentifier	 count loc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flush the internal buffer * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Flush the internal buffer * @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_os	TokenNameIdentifier	 m os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_outputBytes	TokenNameIdentifier	 m output Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Flush the stream. If the stream has saved any characters from the * various write() methods in a buffer, write them immediately to their * intended destination. Then, if that destination is another character or * byte stream, flush it. Thus one flush() invocation will flush all the * buffers in a chain of Writers and OutputStreams. * * @exception IOException If an I/O error occurs * * @throws java.io.IOException */	TokenNameCOMMENT_JAVADOC	 Flush the stream. If the stream has saved any characters from the various write() methods in a buffer, write them immediately to their intended destination. Then, if that destination is another character or byte stream, flush it. Thus one flush() invocation will flush all the buffers in a chain of Writers and OutputStreams. * @exception IOException If an I/O error occurs * @throws java.io.IOException 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_os	TokenNameIdentifier	 m os
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close the stream, flushing it first. Once a stream has been closed, * further write() or flush() invocations will cause an IOException to be * thrown. Closing a previously-closed stream, however, has no effect. * * @exception IOException If an I/O error occurs * * @throws java.io.IOException */	TokenNameCOMMENT_JAVADOC	 Close the stream, flushing it first. Once a stream has been closed, further write() or flush() invocations will cause an IOException to be thrown. Closing a previously-closed stream, however, has no effect. * @exception IOException If an I/O error occurs * @throws java.io.IOException 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_os	TokenNameIdentifier	 m os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the output stream where the events will be serialized to. * * @return reference to the result stream, or null of only a writer was * set. */	TokenNameCOMMENT_JAVADOC	 Get the output stream where the events will be serialized to. * @return reference to the result stream, or null of only a writer was set. 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_os	TokenNameIdentifier	 m os
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only one of getWriter() or getOutputStream() can return null 	TokenNameCOMMENT_LINE	Only one of getWriter() or getOutputStream() can return null 
// This type of writer wraps an OutputStream, not a Writer. 	TokenNameCOMMENT_LINE	This type of writer wraps an OutputStream, not a Writer. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
