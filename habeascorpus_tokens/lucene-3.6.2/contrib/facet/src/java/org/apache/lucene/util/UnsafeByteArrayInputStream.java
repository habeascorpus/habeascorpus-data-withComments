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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * This class, much like {@link ByteArrayInputStream} uses a given buffer as a * source of an InputStream. Unlike ByteArrayInputStream, this class does not * "waste" memory by creating a local copy of the given buffer, but rather uses * the given buffer as is. Hence the name Unsafe. While using this class one * should remember that the byte[] buffer memory is shared and might be changed * from outside. * * For reuse-ability, a call for {@link #reInit(byte[])} can be called, and * initialize the stream with a new buffer. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This class, much like {@link ByteArrayInputStream} uses a given buffer as a source of an InputStream. Unlike ByteArrayInputStream, this class does not "waste" memory by creating a local copy of the given buffer, but rather uses the given buffer as is. Hence the name Unsafe. While using this class one should remember that the byte[] buffer memory is shared and might be changed from outside. * For reuse-ability, a call for {@link #reInit(byte[])} can be called, and initialize the stream with a new buffer. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
UnsafeByteArrayInputStream	TokenNameIdentifier	 Unsafe Byte Array Input Stream
extends	TokenNameextends	
InputStream	TokenNameIdentifier	 Input Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
markIndex	TokenNameIdentifier	 mark Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
upperLimit	TokenNameIdentifier	 upper Limit
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Creates a new instance by not using any byte[] up front. If you use this * constructor, you MUST call either of the {@link #reInit(byte[]) reInit} * methods before you consume any byte from this instance.<br> * This constructor is for convenience purposes only, so that if one does not * have the byte[] at the moment of creation, one is not forced to pass a * <code>new byte[0]</code> or something. Obviously in that case, one will * call either {@link #reInit(byte[]) reInit} methods before using the class. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance by not using any byte[] up front. If you use this constructor, you MUST call either of the {@link #reInit(byte[]) reInit} methods before you consume any byte from this instance.<br> This constructor is for convenience purposes only, so that if one does not have the byte[] at the moment of creation, one is not forced to pass a <code>new byte[0]</code> or something. Obviously in that case, one will call either {@link #reInit(byte[]) reInit} methods before using the class. 
public	TokenNamepublic	
UnsafeByteArrayInputStream	TokenNameIdentifier	 Unsafe Byte Array Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
markIndex	TokenNameIdentifier	 mark Index
=	TokenNameEQUAL	
upperLimit	TokenNameIdentifier	 upper Limit
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an UnsafeByteArrayInputStream which uses a given byte array as * the source of the stream. Default range is [0 , buffer.length) * * @param buffer * byte array used as the source of this stream */	TokenNameCOMMENT_JAVADOC	 Creates an UnsafeByteArrayInputStream which uses a given byte array as the source of the stream. Default range is [0 , buffer.length) * @param buffer byte array used as the source of this stream 
public	TokenNamepublic	
UnsafeByteArrayInputStream	TokenNameIdentifier	 Unsafe Byte Array Input Stream
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reInit	TokenNameIdentifier	 re Init
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
/** * Creates an UnsafeByteArrayInputStream which uses a given byte array as * the source of the stream, at the specific range: [startPos, endPos) * * @param buffer * byte array used as the source of this stream * @param startPos * first index (inclusive) to the data lying in the given buffer * @param endPos * an index (exclusive) where the data ends. data @ * buffer[endPos] will never be read */	TokenNameCOMMENT_JAVADOC	 Creates an UnsafeByteArrayInputStream which uses a given byte array as the source of the stream, at the specific range: [startPos, endPos) * @param buffer byte array used as the source of this stream @param startPos first index (inclusive) to the data lying in the given buffer @param endPos an index (exclusive) where the data ends. data @ buffer[endPos] will never be read 
public	TokenNamepublic	
UnsafeByteArrayInputStream	TokenNameIdentifier	 Unsafe Byte Array Input Stream
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
,	TokenNameCOMMA	
int	TokenNameint	
endPos	TokenNameIdentifier	 end Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
startPos	TokenNameIdentifier	 start Pos
,	TokenNameCOMMA	
endPos	TokenNameIdentifier	 end Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
int	TokenNameint	
readlimit	TokenNameIdentifier	 readlimit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
markIndex	TokenNameIdentifier	 mark Index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the stream with a given buffer, using the default limits of * [0, buffer.length) * * @param buffer * byte array used as the source of this stream */	TokenNameCOMMENT_JAVADOC	 Initialize the stream with a given buffer, using the default limits of [0, buffer.length) * @param buffer byte array used as the source of this stream 
public	TokenNamepublic	
void	TokenNamevoid	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reInit	TokenNameIdentifier	 re Init
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
/** * Initialize the stream with a given byte array as the source of the * stream, at the specific range: [startPos, endPos) * * @param buffer * byte array used as the source of this stream * @param startPos * first index (inclusive) to the data lying in the given buffer * @param endPos * an index (exclusive) where the data ends. data @ * buffer[endPos] will never be read */	TokenNameCOMMENT_JAVADOC	 Initialize the stream with a given byte array as the source of the stream, at the specific range: [startPos, endPos) * @param buffer byte array used as the source of this stream @param startPos first index (inclusive) to the data lying in the given buffer @param endPos an index (exclusive) where the data ends. data @ buffer[endPos] will never be read 
public	TokenNamepublic	
void	TokenNamevoid	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
,	TokenNameCOMMA	
int	TokenNameint	
endPos	TokenNameIdentifier	 end Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
markIndex	TokenNameIdentifier	 mark Index
=	TokenNameEQUAL	
startPos	TokenNameIdentifier	 start Pos
;	TokenNameSEMICOLON	
upperLimit	TokenNameIdentifier	 upper Limit
=	TokenNameEQUAL	
endPos	TokenNameIdentifier	 end Pos
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
markIndex	TokenNameIdentifier	 mark Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
upperLimit	TokenNameIdentifier	 upper Limit
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read a byte. Data returned as an integer [0,255] If end of stream * reached, returns -1 */	TokenNameCOMMENT_JAVADOC	 Read a byte. Data returned as an integer [0,255] If end of stream reached, returns -1 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
upperLimit	TokenNameIdentifier	 upper Limit
?	TokenNameQUESTION	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the stream back to its original state. Basically - moving the * index back to start position. */	TokenNameCOMMENT_JAVADOC	 Resets the stream back to its original state. Basically - moving the index back to start position. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
markIndex	TokenNameIdentifier	 mark Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
