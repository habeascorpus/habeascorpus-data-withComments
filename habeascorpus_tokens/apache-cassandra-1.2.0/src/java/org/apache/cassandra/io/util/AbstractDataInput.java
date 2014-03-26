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
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractDataInput	TokenNameIdentifier	 Abstract Data Input
extends	TokenNameextends	
InputStream	TokenNameIdentifier	 Input Stream
implements	TokenNameimplements	
DataInput	TokenNameIdentifier	 Data Input
{	TokenNameLBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
seekInternal	TokenNameIdentifier	 seek Internal
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* !! DataInput methods below are copied from the implementation in Apache Harmony RandomAccessFile. */	TokenNameCOMMENT_BLOCK	 !! DataInput methods below are copied from the implementation in Apache Harmony RandomAccessFile. 
/** * Reads a boolean from the current position in this file. Blocks until one * byte has been read, the end of the file is reached or an exception is * thrown. * * @return the next boolean value from this file. * @throws java.io.EOFException * if the end of this file is detected. * @throws java.io.IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads a boolean from the current position in this file. Blocks until one byte has been read, the end of the file is reached or an exception is thrown. * @return the next boolean value from this file. @throws java.io.EOFException if the end of this file is detected. @throws java.io.IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
readBoolean	TokenNameIdentifier	 read Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
temp	TokenNameIdentifier	 temp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads an 8-bit byte from the current position in this file. Blocks until * one byte has been read, the end of the file is reached or an exception is * thrown. * * @return the next signed 8-bit byte value from this file. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads an 8-bit byte from the current position in this file. Blocks until one byte has been read, the end of the file is reached or an exception is thrown. * @return the next signed 8-bit byte value from this file. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
final	TokenNamefinal	
byte	TokenNamebyte	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a 16-bit character from the current position in this file. Blocks until * two bytes have been read, the end of the file is reached or an exception is * thrown. * * @return the next char value from this file. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads a 16-bit character from the current position in this file. Blocks until two bytes have been read, the end of the file is reached or an exception is thrown. * @return the next char value from this file. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
final	TokenNamefinal	
char	TokenNamechar	
readChar	TokenNameIdentifier	 read Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
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
!=	TokenNameNOT_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a 64-bit double from the current position in this file. Blocks * until eight bytes have been read, the end of the file is reached or an * exception is thrown. * * @return the next double value from this file. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads a 64-bit double from the current position in this file. Blocks until eight bytes have been read, the end of the file is reached or an exception is thrown. * @return the next double value from this file. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
readDouble	TokenNameIdentifier	 read Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
longBitsToDouble	TokenNameIdentifier	 long Bits To Double
(	TokenNameLPAREN	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a 32-bit float from the current position in this file. Blocks * until four bytes have been read, the end of the file is reached or an * exception is thrown. * * @return the next float value from this file. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads a 32-bit float from the current position in this file. Blocks until four bytes have been read, the end of the file is reached or an exception is thrown. * @return the next float value from this file. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
final	TokenNamefinal	
float	TokenNamefloat	
readFloat	TokenNameIdentifier	 read Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads bytes from this file into {@code buffer}. Blocks until {@code * buffer.length} number of bytes have been read, the end of the file is * reached or an exception is thrown. * * @param buffer * the buffer to read bytes into. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. * @throws NullPointerException * if {@code buffer} is {@code null}. */	TokenNameCOMMENT_JAVADOC	 Reads bytes from this file into {@code buffer}. Blocks until {@code buffer.length} number of bytes have been read, the end of the file is reached or an exception is thrown. * @param buffer the buffer to read bytes into. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. @throws NullPointerException if {@code buffer} is {@code null}. 
public	TokenNamepublic	
void	TokenNamevoid	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
readFully	TokenNameIdentifier	 read Fully
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
/** * Read bytes from this file into {@code buffer} starting at offset {@code * offset}. This method blocks until {@code count} number of bytes have been * read. * * @param buffer * the buffer to read bytes into. * @param offset * the initial position in {@code buffer} to store the bytes read * from this file. * @param count * the maximum number of bytes to store in {@code buffer}. * @throws EOFException * if the end of this file is detected. * @throws IndexOutOfBoundsException * if {@code offset < 0} or {@code count < 0}, or if {@code * offset + count} is greater than the length of {@code buffer}. * @throws IOException * if this file is closed or another I/O error occurs. * @throws NullPointerException * if {@code buffer} is {@code null}. */	TokenNameCOMMENT_JAVADOC	 Read bytes from this file into {@code buffer} starting at offset {@code offset}. This method blocks until {@code count} number of bytes have been read. * @param buffer the buffer to read bytes into. @param offset the initial position in {@code buffer} to store the bytes read from this file. @param count the maximum number of bytes to store in {@code buffer}. @throws EOFException if the end of this file is detected. @throws IndexOutOfBoundsException if {@code offset < 0} or {@code count < 0}, or if {@code offset + count} is greater than the length of {@code buffer}. @throws IOException if this file is closed or another I/O error occurs. @throws NullPointerException if {@code buffer} is {@code null}. 
public	TokenNamepublic	
void	TokenNamevoid	
readFully	TokenNameIdentifier	 read Fully
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
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
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
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
||	TokenNameOR_OR	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
count	TokenNameIdentifier	 count
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
while	TokenNamewhile	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
-=	TokenNameMINUS_EQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reads a 32-bit integer from the current position in this file. Blocks * until four bytes have been read, the end of the file is reached or an * exception is thrown. * * @return the next int value from this file. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads a 32-bit integer from the current position in this file. Blocks until four bytes have been read, the end of the file is reached or an exception is thrown. * @return the next int value from this file. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
int	TokenNameint	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
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
!=	TokenNameNOT_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a line of text form the current position in this file. A line is * represented by zero or more characters followed by {@code '\n'}, {@code * '\r'}, {@code "\r\n"} or the end of file marker. The string does not * include the line terminating sequence. * <p> * Blocks until a line terminating sequence has been read, the end of the * file is reached or an exception is thrown. * * @return the contents of the line or {@code null} if no characters have * been read before the end of the file has been reached. * @throws IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads a line of text form the current position in this file. A line is represented by zero or more characters followed by {@code '\n'}, {@code '\r'}, {@code "\r\n"} or the end of file marker. The string does not include the line terminating sequence. <p> Blocks until a line terminating sequence has been read, the end of the file is reached or an exception is thrown. * @return the contents of the line or {@code null} if no characters have been read before the end of the file has been reached. @throws IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Typical line length 	TokenNameCOMMENT_LINE	Typical line length 
boolean	TokenNameboolean	
foundTerminator	TokenNameIdentifier	 found Terminator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
unreadPosition	TokenNameIdentifier	 unread Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nextByte	TokenNameIdentifier	 next Byte
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextByte	TokenNameIdentifier	 next Byte
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
case	TokenNamecase	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
foundTerminator	TokenNameIdentifier	 found Terminator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seekInternal	TokenNameIdentifier	 seek Internal
(	TokenNameLPAREN	
unreadPosition	TokenNameIdentifier	 unread Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
foundTerminator	TokenNameIdentifier	 found Terminator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/* Have to be able to peek ahead one byte */	TokenNameCOMMENT_BLOCK	 Have to be able to peek ahead one byte 
unreadPosition	TokenNameIdentifier	 unread Position
=	TokenNameEQUAL	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
foundTerminator	TokenNameIdentifier	 found Terminator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seekInternal	TokenNameIdentifier	 seek Internal
(	TokenNameLPAREN	
unreadPosition	TokenNameIdentifier	 unread Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextByte	TokenNameIdentifier	 next Byte
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reads a 64-bit long from the current position in this file. Blocks until * eight bytes have been read, the end of the file is reached or an * exception is thrown. * * @return the next long value from this file. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads a 64-bit long from the current position in this file. Blocks until eight bytes have been read, the end of the file is reached or an exception is thrown. * @return the next long value from this file. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
long	TokenNamelong	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
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
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
"expected 8 bytes; read "	TokenNameStringLiteral	expected 8 bytes; read 
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
" at final position "	TokenNameStringLiteral	 at final position 
+	TokenNamePLUS	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a 16-bit short from the current position in this file. Blocks until * two bytes have been read, the end of the file is reached or an exception * is thrown. * * @return the next short value from this file. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads a 16-bit short from the current position in this file. Blocks until two bytes have been read, the end of the file is reached or an exception is thrown. * @return the next short value from this file. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
short	TokenNameshort	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
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
!=	TokenNameNOT_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads an unsigned 8-bit byte from the current position in this file and * returns it as an integer. Blocks until one byte has been read, the end of * the file is reached or an exception is thrown. * * @return the next unsigned byte value from this file as an int. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads an unsigned 8-bit byte from the current position in this file and returns it as an integer. Blocks until one byte has been read, the end of the file is reached or an exception is thrown. * @return the next unsigned byte value from this file as an int. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
readUnsignedByte	TokenNameIdentifier	 read Unsigned Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads an unsigned 16-bit short from the current position in this file and * returns it as an integer. Blocks until two bytes have been read, the end of * the file is reached or an exception is thrown. * * @return the next unsigned short value from this file as an int. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. */	TokenNameCOMMENT_JAVADOC	 Reads an unsigned 16-bit short from the current position in this file and returns it as an integer. Blocks until two bytes have been read, the end of the file is reached or an exception is thrown. * @return the next unsigned short value from this file as an int. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. 
public	TokenNamepublic	
int	TokenNameint	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
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
!=	TokenNameNOT_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a string that is encoded in {@link java.io.DataInput modified UTF-8} from * this file. The number of bytes that must be read for the complete string * is determined by the first two bytes read from the file. Blocks until all * required bytes have been read, the end of the file is reached or an * exception is thrown. * * @return the next string encoded in {@link java.io.DataInput modified UTF-8} from * this file. * @throws EOFException * if the end of this file is detected. * @throws IOException * if this file is closed or another I/O error occurs. * @throws java.io.UTFDataFormatException * if the bytes read cannot be decoded into a character string. */	TokenNameCOMMENT_JAVADOC	 Reads a string that is encoded in {@link java.io.DataInput modified UTF-8} from this file. The number of bytes that must be read for the complete string is determined by the first two bytes read from the file. Blocks until all required bytes have been read, the end of the file is reached or an exception is thrown. * @return the next string encoded in {@link java.io.DataInput modified UTF-8} from this file. @throws EOFException if the end of this file is detected. @throws IOException if this file is closed or another I/O error occurs. @throws java.io.UTFDataFormatException if the bytes read cannot be decoded into a character string. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DataInputStream	TokenNameIdentifier	 Data Input Stream
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
