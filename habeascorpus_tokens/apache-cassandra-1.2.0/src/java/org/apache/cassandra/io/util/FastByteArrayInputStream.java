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
/* * This file has been modified from Apache Harmony's ByteArrayInputStream * implementation. The synchronized methods of the original have been * replaced by non-synchronized methods. This makes this certain operations * FASTer, but also *not thread-safe*. * * This file remains formatted the same as the Apache Harmony original to * make patching easier if any bug fixes are made to the Harmony version. */	TokenNameCOMMENT_BLOCK	 This file has been modified from Apache Harmony's ByteArrayInputStream implementation. The synchronized methods of the original have been replaced by non-synchronized methods. This makes this certain operations FASTer, but also *not thread-safe*. * This file remains formatted the same as the Apache Harmony original to make patching easier if any bug fixes are made to the Harmony version. 
/** * A specialized {@link InputStream } for reading the contents of a byte array. * * @see ByteArrayInputStream */	TokenNameCOMMENT_JAVADOC	 A specialized {@link InputStream } for reading the contents of a byte array. * @see ByteArrayInputStream 
public	TokenNamepublic	
class	TokenNameclass	
FastByteArrayInputStream	TokenNameIdentifier	 Fast Byte Array Input Stream
extends	TokenNameextends	
InputStream	TokenNameIdentifier	 Input Stream
{	TokenNameLBRACE	
/** * The {@code byte} array containing the bytes to stream over. */	TokenNameCOMMENT_JAVADOC	 The {@code byte} array containing the bytes to stream over. 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
/** * The current position within the byte array. */	TokenNameCOMMENT_JAVADOC	 The current position within the byte array. 
protected	TokenNameprotected	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
/** * The current mark position. Initially set to 0 or the <code>offset</code> * parameter within the constructor. */	TokenNameCOMMENT_JAVADOC	 The current mark position. Initially set to 0 or the <code>offset</code> parameter within the constructor. 
protected	TokenNameprotected	
int	TokenNameint	
mark	TokenNameIdentifier	 mark
;	TokenNameSEMICOLON	
/** * The total number of bytes initially available in the byte array * {@code buf}. */	TokenNameCOMMENT_JAVADOC	 The total number of bytes initially available in the byte array {@code buf}. 
protected	TokenNameprotected	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * Constructs a new {@code ByteArrayInputStream} on the byte array * {@code buf}. * * @param buf * the byte array to stream over. */	TokenNameCOMMENT_JAVADOC	 Constructs a new {@code ByteArrayInputStream} on the byte array {@code buf}. * @param buf the byte array to stream over. 
public	TokenNamepublic	
FastByteArrayInputStream	TokenNameIdentifier	 Fast Byte Array Input Stream
(	TokenNameLPAREN	
byte	TokenNamebyte	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new {@code ByteArrayInputStream} on the byte array * {@code buf} with the initial position set to {@code offset} and the * number of bytes available set to {@code offset} + {@code length}. * * @param buf * the byte array to stream over. * @param offset * the initial position in {@code buf} to start streaming from. * @param length * the number of bytes available for streaming. */	TokenNameCOMMENT_JAVADOC	 Constructs a new {@code ByteArrayInputStream} on the byte array {@code buf} with the initial position set to {@code offset} and the number of bytes available set to {@code offset} + {@code length}. * @param buf the byte array to stream over. @param offset the initial position in {@code buf} to start streaming from. @param length the number of bytes available for streaming. 
public	TokenNamepublic	
FastByteArrayInputStream	TokenNameIdentifier	 Fast Byte Array Input Stream
(	TokenNameLPAREN	
byte	TokenNamebyte	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of bytes that are available before this stream will * block. This method returns the number of bytes yet to be read from the * source byte array. * * @return the number of bytes available before blocking. */	TokenNameCOMMENT_JAVADOC	 Returns the number of bytes that are available before this stream will block. This method returns the number of bytes yet to be read from the source byte array. * @return the number of bytes available before blocking. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes this stream and frees resources associated with this stream. * * @throws IOException * if an I/O error occurs while closing this stream. */	TokenNameCOMMENT_JAVADOC	 Closes this stream and frees resources associated with this stream. * @throws IOException if an I/O error occurs while closing this stream. 
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
// Do nothing on close, this matches JDK behaviour. 	TokenNameCOMMENT_LINE	Do nothing on close, this matches JDK behaviour. 
}	TokenNameRBRACE	
/** * Sets a mark position in this ByteArrayInputStream. The parameter * {@code readlimit} is ignored. Sending {@code reset()} will reposition the * stream back to the marked position. * * @param readlimit * ignored. * @see #markSupported() * @see #reset() */	TokenNameCOMMENT_JAVADOC	 Sets a mark position in this ByteArrayInputStream. The parameter {@code readlimit} is ignored. Sending {@code reset()} will reposition the stream back to the marked position. * @param readlimit ignored. @see #markSupported() @see #reset() 
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
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates whether this stream supports the {@code mark()} and * {@code reset()} methods. Returns {@code true} since this class supports * these methods. * * @return always {@code true}. * @see #mark(int) * @see #reset() */	TokenNameCOMMENT_JAVADOC	 Indicates whether this stream supports the {@code mark()} and {@code reset()} methods. Returns {@code true} since this class supports these methods. * @return always {@code true}. @see #mark(int) @see #reset() 
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
/** * Reads a single byte from the source byte array and returns it as an * integer in the range from 0 to 255. Returns -1 if the end of the source * array has been reached. * * @return the byte read or -1 if the end of this stream has been reached. */	TokenNameCOMMENT_JAVADOC	 Reads a single byte from the source byte array and returns it as an integer in the range from 0 to 255. Returns -1 if the end of the source array has been reached. * @return the byte read or -1 if the end of this stream has been reached. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
count	TokenNameIdentifier	 count
?	TokenNameQUESTION	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads at most {@code len} bytes from this stream and stores * them in byte array {@code b} starting at {@code offset}. This * implementation reads bytes from the source byte array. * * @param b * the byte array in which to store the bytes read. * @param offset * the initial position in {@code b} to store the bytes read from * this stream. * @param length * the maximum number of bytes to store in {@code b}. * @return the number of bytes actually read or -1 if no bytes were read and * the end of the stream was encountered. * @throws IndexOutOfBoundsException * if {@code offset < 0} or {@code length < 0}, or if * {@code offset + length} is greater than the size of * {@code b}. * @throws NullPointerException * if {@code b} is {@code null}. */	TokenNameCOMMENT_JAVADOC	 Reads at most {@code len} bytes from this stream and stores them in byte array {@code b} starting at {@code offset}. This implementation reads bytes from the source byte array. * @param b the byte array in which to store the bytes read. @param offset the initial position in {@code b} to store the bytes read from this stream. @param length the maximum number of bytes to store in {@code b}. @return the number of bytes actually read or -1 if no bytes were read and the end of the stream was encountered. @throws IndexOutOfBoundsException if {@code offset < 0} or {@code length < 0}, or if {@code offset + length} is greater than the size of {@code b}. @throws NullPointerException if {@code b} is {@code null}. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// avoid int overflow 	TokenNameCOMMENT_LINE	avoid int overflow 
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
||	TokenNameOR_OR	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
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
// Are there any bytes available? 	TokenNameCOMMENT_LINE	Are there any bytes available? 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
copylen	TokenNameIdentifier	 copylen
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
:	TokenNameCOLON	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
copylen	TokenNameIdentifier	 copylen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
copylen	TokenNameIdentifier	 copylen
;	TokenNameSEMICOLON	
return	TokenNamereturn	
copylen	TokenNameIdentifier	 copylen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets this stream to the last marked location. This implementation * resets the position to either the marked position, the start position * supplied in the constructor or 0 if neither has been provided. * * @see #mark(int) */	TokenNameCOMMENT_JAVADOC	 Resets this stream to the last marked location. This implementation resets the position to either the marked position, the start position supplied in the constructor or 0 if neither has been provided. * @see #mark(int) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
mark	TokenNameIdentifier	 mark
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skips {@code count} number of bytes in this InputStream. Subsequent * {@code read()}s will not return these bytes unless {@code reset()} is * used. This implementation skips {@code count} number of bytes in the * target stream. It does nothing and returns 0 if {@code n} is negative. * * @param n * the number of bytes to skip. * @return the number of bytes actually skipped. */	TokenNameCOMMENT_JAVADOC	 Skips {@code count} number of bytes in this InputStream. Subsequent {@code read()}s will not return these bytes unless {@code reset()} is used. This implementation skips {@code count} number of bytes in the target stream. It does nothing and returns 0 if {@code n} is negative. * @param n the number of bytes to skip. @return the number of bytes actually skipped. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
long	TokenNamelong	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
n	TokenNameIdentifier	 n
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
:	TokenNameCOLON	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
