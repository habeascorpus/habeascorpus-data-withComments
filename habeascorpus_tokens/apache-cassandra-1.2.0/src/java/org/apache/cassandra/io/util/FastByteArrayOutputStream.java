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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
/* * This file has been modified from Apache Harmony's ByteArrayOutputStream * implementation. The synchronized methods of the original have been * replaced by non-synchronized methods. This makes certain operations * much FASTer, but also *not thread-safe*. * * This file remains formatted the same as the Apache Harmony original to * make patching easier if any bug fixes are made to the Harmony version. */	TokenNameCOMMENT_BLOCK	 This file has been modified from Apache Harmony's ByteArrayOutputStream implementation. The synchronized methods of the original have been replaced by non-synchronized methods. This makes certain operations much FASTer, but also *not thread-safe*. * This file remains formatted the same as the Apache Harmony original to make patching easier if any bug fixes are made to the Harmony version. 
/** * A specialized {@link OutputStream} for class for writing content to an * (internal) byte array. As bytes are written to this stream, the byte array * may be expanded to hold more bytes. When the writing is considered to be * finished, a copy of the byte array can be requested from the class. * * @see ByteArrayOutputStream */	TokenNameCOMMENT_JAVADOC	 A specialized {@link OutputStream} for class for writing content to an (internal) byte array. As bytes are written to this stream, the byte array may be expanded to hold more bytes. When the writing is considered to be finished, a copy of the byte array can be requested from the class. * @see ByteArrayOutputStream 
public	TokenNamepublic	
class	TokenNameclass	
FastByteArrayOutputStream	TokenNameIdentifier	 Fast Byte Array Output Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
/** * The byte array containing the bytes written. */	TokenNameCOMMENT_JAVADOC	 The byte array containing the bytes written. 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
/** * The number of bytes written. */	TokenNameCOMMENT_JAVADOC	 The number of bytes written. 
protected	TokenNameprotected	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * Constructs a new ByteArrayOutputStream with a default size of 32 bytes. * If more than 32 bytes are written to this instance, the underlying byte * array will expand. */	TokenNameCOMMENT_JAVADOC	 Constructs a new ByteArrayOutputStream with a default size of 32 bytes. If more than 32 bytes are written to this instance, the underlying byte array will expand. 
public	TokenNamepublic	
FastByteArrayOutputStream	TokenNameIdentifier	 Fast Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new {@code ByteArrayOutputStream} with a default size of * {@code size} bytes. If more than {@code size} bytes are written to this * instance, the underlying byte array will expand. * * @param size * initial size for the underlying byte array, must be * non-negative. * @throws IllegalArgumentException * if {@code size} < 0. */	TokenNameCOMMENT_JAVADOC	 Constructs a new {@code ByteArrayOutputStream} with a default size of {@code size} bytes. If more than {@code size} bytes are written to this instance, the underlying byte array will expand. * @param size initial size for the underlying byte array, must be non-negative. @throws IllegalArgumentException if {@code size} < 0. 
public	TokenNamepublic	
FastByteArrayOutputStream	TokenNameIdentifier	 Fast Byte Array Output Stream
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Closes this stream. This releases system resources used for this stream. * * @throws IOException * if an error occurs while attempting to close this stream. */	TokenNameCOMMENT_JAVADOC	 Closes this stream. This releases system resources used for this stream. * @throws IOException if an error occurs while attempting to close this stream. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/** * Although the spec claims "A closed stream cannot perform output * operations and cannot be reopened.", this implementation must do * nothing. */	TokenNameCOMMENT_JAVADOC	 Although the spec claims "A closed stream cannot perform output operations and cannot be reopened.", this implementation must do nothing. 
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
expand	TokenNameIdentifier	 expand
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Can the buffer handle @i more bytes, if not expand it */	TokenNameCOMMENT_BLOCK	 Can the buffer handle @i more bytes, if not expand it 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newbuf	TokenNameIdentifier	 newbuf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newbuf	TokenNameIdentifier	 newbuf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
newbuf	TokenNameIdentifier	 newbuf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets this stream to the beginning of the underlying byte array. All * subsequent writes will overwrite any bytes previously stored in this * stream. */	TokenNameCOMMENT_JAVADOC	 Resets this stream to the beginning of the underlying byte array. All subsequent writes will overwrite any bytes previously stored in this stream. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the total number of bytes written to this stream so far. * * @return the number of bytes written to this stream. */	TokenNameCOMMENT_JAVADOC	 Returns the total number of bytes written to this stream so far. * @return the number of bytes written to this stream. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the contents of this ByteArrayOutputStream as a byte array. Any * changes made to the receiver after returning will not be reflected in the * byte array returned to the caller. * * @return this stream's current contents as a byte array. */	TokenNameCOMMENT_JAVADOC	 Returns the contents of this ByteArrayOutputStream as a byte array. Any changes made to the receiver after returning will not be reflected in the byte array returned to the caller. * @return this stream's current contents as a byte array. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the contents of this ByteArrayOutputStream as a string. Any * changes made to the receiver after returning will not be reflected in the * string returned to the caller. * * @return this stream's current contents as a string. */	TokenNameCOMMENT_JAVADOC	 Returns the contents of this ByteArrayOutputStream as a string. Any changes made to the receiver after returning will not be reflected in the string returned to the caller. * @return this stream's current contents as a string. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the contents of this ByteArrayOutputStream as a string. Each byte * {@code b} in this stream is converted to a character {@code c} using the * following function: * {@code c == (char)(((hibyte & 0xff) << 8) | (b & 0xff))}. This method is * deprecated and either {@link #toString()} or {@link #toString(String)} * should be used. * * @param hibyte * the high byte of each resulting Unicode character. * @return this stream's current contents as a string with the high byte set * to {@code hibyte}. * @deprecated Use {@link #toString()}. */	TokenNameCOMMENT_JAVADOC	 Returns the contents of this ByteArrayOutputStream as a string. Each byte {@code b} in this stream is converted to a character {@code c} using the following function: {@code c == (char)(((hibyte & 0xff) << 8) | (b & 0xff))}. This method is deprecated and either {@link #toString()} or {@link #toString(String)} should be used. * @param hibyte the high byte of each resulting Unicode character. @return this stream's current contents as a string with the high byte set to {@code hibyte}. @deprecated Use {@link #toString()}. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
hibyte	TokenNameIdentifier	 hibyte
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuf	TokenNameIdentifier	 new Buf
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
newBuf	TokenNameIdentifier	 new Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newBuf	TokenNameIdentifier	 new Buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hibyte	TokenNameIdentifier	 hibyte
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
newBuf	TokenNameIdentifier	 new Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the contents of this ByteArrayOutputStream as a string converted * according to the encoding declared in {@code enc}. * * @param enc * a string representing the encoding to use when translating * this stream to a string. * @return this stream's current contents as an encoded string. * @throws UnsupportedEncodingException * if the provided encoding is not supported. */	TokenNameCOMMENT_JAVADOC	 Returns the contents of this ByteArrayOutputStream as a string converted according to the encoding declared in {@code enc}. * @param enc a string representing the encoding to use when translating this stream to a string. @return this stream's current contents as an encoded string. @throws UnsupportedEncodingException if the provided encoding is not supported. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes {@code count} bytes from the byte array {@code buffer} starting at * offset {@code index} to this stream. * * @param buffer * the buffer to be written. * @param offset * the initial position in {@code buffer} to retrieve bytes. * @param len * the number of bytes of {@code buffer} to write. * @throws NullPointerException * if {@code buffer} is {@code null}. * @throws IndexOutOfBoundsException * if {@code offset < 0} or {@code len < 0}, or if * {@code offset + len} is greater than the length of * {@code buffer}. */	TokenNameCOMMENT_JAVADOC	 Writes {@code count} bytes from the byte array {@code buffer} starting at offset {@code index} to this stream. * @param buffer the buffer to be written. @param offset the initial position in {@code buffer} to retrieve bytes. @param len the number of bytes of {@code buffer} to write. @throws NullPointerException if {@code buffer} is {@code null}. @throws IndexOutOfBoundsException if {@code offset < 0} or {@code len < 0}, or if {@code offset + len} is greater than the length of {@code buffer}. 
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
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// avoid int overflow 	TokenNameCOMMENT_LINE	avoid int overflow 
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
||	TokenNameOR_OR	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Expand if necessary */	TokenNameCOMMENT_BLOCK	 Expand if necessary 
expand	TokenNameIdentifier	 expand
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the specified byte {@code oneByte} to the OutputStream. Only the * low order byte of {@code oneByte} is written. * * @param oneByte * the byte to be written. */	TokenNameCOMMENT_JAVADOC	 Writes the specified byte {@code oneByte} to the OutputStream. Only the low order byte of {@code oneByte} is written. * @param oneByte the byte to be written. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
oneByte	TokenNameIdentifier	 one Byte
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expand	TokenNameIdentifier	 expand
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
oneByte	TokenNameIdentifier	 one Byte
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Takes the contents of this stream and writes it to the output stream * {@code out}. * * @param out * an OutputStream on which to write the contents of this stream. * @throws IOException * if an error occurs while writing to {@code out}. */	TokenNameCOMMENT_JAVADOC	 Takes the contents of this stream and writes it to the output stream {@code out}. * @param out an OutputStream on which to write the contents of this stream. @throws IOException if an error occurs while writing to {@code out}. 
public	TokenNamepublic	
void	TokenNamevoid	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
