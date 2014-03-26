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
DataOutput	TokenNameIdentifier	 Data Output
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
UTFDataFormatException	TokenNameIdentifier	 UTF Data Format Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractDataOutput	TokenNameIdentifier	 Abstract Data Output
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
implements	TokenNameimplements	
DataOutput	TokenNameIdentifier	 Data Output
{	TokenNameLBRACE	
/* !! DataOutput methods below are copied from the implementation in Apache Harmony RandomAccessFile. */	TokenNameCOMMENT_BLOCK	 !! DataOutput methods below are copied from the implementation in Apache Harmony RandomAccessFile. 
/** * Writes the entire contents of the byte array <code>buffer</code> to * this RandomAccessFile starting at the current file pointer. * * @param buffer * the buffer to be written. * * @throws IOException * If an error occurs trying to write to this RandomAccessFile. */	TokenNameCOMMENT_JAVADOC	 Writes the entire contents of the byte array <code>buffer</code> to this RandomAccessFile starting at the current file pointer. * @param buffer the buffer to be written. * @throws IOException If an error occurs trying to write to this RandomAccessFile. 
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
IOException	TokenNameIdentifier	 IO Exception
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
/** * Writes <code>count</code> bytes from the byte array <code>buffer</code> * starting at <code>offset</code> to this RandomAccessFile starting at * the current file pointer.. * * @param buffer * the bytes to be written * @param offset * offset in buffer to get bytes * @param count * number of bytes in buffer to write * * @throws IOException * If an error occurs attempting to write to this * RandomAccessFile. * @throws IndexOutOfBoundsException * If offset or count are outside of bounds. */	TokenNameCOMMENT_JAVADOC	 Writes <code>count</code> bytes from the byte array <code>buffer</code> starting at <code>offset</code> to this RandomAccessFile starting at the current file pointer.. * @param buffer the bytes to be written @param offset offset in buffer to get bytes @param count number of bytes in buffer to write * @throws IOException If an error occurs attempting to write to this RandomAccessFile. @throws IndexOutOfBoundsException If offset or count are outside of bounds. 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Writes the specified byte <code>oneByte</code> to this RandomAccessFile * starting at the current file pointer. Only the low order byte of * <code>oneByte</code> is written. * * @param oneByte * the byte to be written * * @throws IOException * If an error occurs attempting to write to this * RandomAccessFile. */	TokenNameCOMMENT_JAVADOC	 Writes the specified byte <code>oneByte</code> to this RandomAccessFile starting at the current file pointer. Only the low order byte of <code>oneByte</code> is written. * @param oneByte the byte to be written * @throws IOException If an error occurs attempting to write to this RandomAccessFile. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
oneByte	TokenNameIdentifier	 one Byte
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Writes a boolean to this output stream. * * @param val * the boolean value to write to the OutputStream * * @throws IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes a boolean to this output stream. * @param val the boolean value to write to the OutputStream * @throws IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writeBoolean	TokenNameIdentifier	 write Boolean
(	TokenNameLPAREN	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes a 8-bit byte to this output stream. * * @param val * the byte value to write to the OutputStream * * @throws java.io.IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes a 8-bit byte to this output stream. * @param val the byte value to write to the OutputStream * @throws java.io.IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the low order 8-bit bytes from a String to this output stream. * * @param str * the String containing the bytes to write to the OutputStream * * @throws IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes the low order 8-bit bytes from a String to this output stream. * @param str the String containing the bytes to write to the OutputStream * @throws IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the specified 16-bit character to the OutputStream. Only the lower * 2 bytes are written with the higher of the 2 bytes written first. This * represents the Unicode value of val. * * @param val * the character to be written * * @throws IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes the specified 16-bit character to the OutputStream. Only the lower 2 bytes are written with the higher of the 2 bytes written first. This represents the Unicode value of val. * @param val the character to be written * @throws IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writeChar	TokenNameIdentifier	 write Char
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
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
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
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
/** * Writes the specified 16-bit characters contained in str to the * OutputStream. Only the lower 2 bytes of each character are written with * the higher of the 2 bytes written first. This represents the Unicode * value of each character in str. * * @param str * the String whose characters are to be written. * * @throws IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes the specified 16-bit characters contained in str to the OutputStream. Only the lower 2 bytes of each character are written with the higher of the 2 bytes written first. This represents the Unicode value of each character in str. * @param str the String whose characters are to be written. * @throws IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writeChars	TokenNameIdentifier	 write Chars
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
newBytes	TokenNameIdentifier	 new Bytes
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newIndex	TokenNameIdentifier	 new Index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
index	TokenNameIdentifier	 index
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
newBytes	TokenNameIdentifier	 new Bytes
[	TokenNameLBRACKET	
newIndex	TokenNameIdentifier	 new Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newBytes	TokenNameIdentifier	 new Bytes
[	TokenNameLBRACKET	
newIndex	TokenNameIdentifier	 new Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
newBytes	TokenNameIdentifier	 new Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes a 64-bit double to this output stream. The resulting output is the * 8 bytes resulting from calling Double.doubleToLongBits(). * * @param val * the double to be written. * * @throws IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes a 64-bit double to this output stream. The resulting output is the 8 bytes resulting from calling Double.doubleToLongBits(). * @param val the double to be written. * @throws IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writeDouble	TokenNameIdentifier	 write Double
(	TokenNameLPAREN	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes a 32-bit float to this output stream. The resulting output is the * 4 bytes resulting from calling Float.floatToIntBits(). * * @param val * the float to be written. * * @throws IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes a 32-bit float to this output stream. The resulting output is the 4 bytes resulting from calling Float.floatToIntBits(). * @param val the float to be written. * @throws IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writeFloat	TokenNameIdentifier	 write Float
(	TokenNameLPAREN	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes a 32-bit int to this output stream. The resulting output is the 4 * bytes, highest order first, of val. * * @param val * the int to be written. * * @throws IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes a 32-bit int to this output stream. The resulting output is the 4 bytes, highest order first, of val. * @param val the int to be written. * @throws IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
void	TokenNamevoid	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
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
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
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
/** * Writes a 64-bit long to this output stream. The resulting output is the 8 * bytes, highest order first, of val. * * @param val * the long to be written. * * @throws IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes a 64-bit long to this output stream. The resulting output is the 8 bytes, highest order first, of val. * @param val the long to be written. * @throws IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
void	TokenNamevoid	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
long	TokenNamelong	
val	TokenNameIdentifier	 val
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
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
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
/** * Writes the specified 16-bit short to the OutputStream. Only the lower 2 * bytes are written with the higher of the 2 bytes written first. * * @param val * the short to be written * * @throws IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes the specified 16-bit short to the OutputStream. Only the lower 2 bytes are written with the higher of the 2 bytes written first. * @param val the short to be written * @throws IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
void	TokenNamevoid	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeChar	TokenNameIdentifier	 write Char
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the specified String out in UTF format. * * @param str * the String to be written in UTF format. * * @throws IOException * If an error occurs attempting to write to this * DataOutputStream. */	TokenNameCOMMENT_JAVADOC	 Writes the specified String out in UTF format. * @param str the String to be written in UTF format. * @throws IOException If an error occurs attempting to write to this DataOutputStream. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
utfCount	TokenNameIdentifier	 utf Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charValue	TokenNameIdentifier	 char Value
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charValue	TokenNameIdentifier	 char Value
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charValue	TokenNameIdentifier	 char Value
<=	TokenNameLESS_EQUAL	
127	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utfCount	TokenNameIdentifier	 utf Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
charValue	TokenNameIdentifier	 char Value
<=	TokenNameLESS_EQUAL	
2047	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utfCount	TokenNameIdentifier	 utf Count
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
utfCount	TokenNameIdentifier	 utf Count
+=	TokenNamePLUS_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
utfCount	TokenNameIdentifier	 utf Count
>	TokenNameGREATER	
65535	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UTFDataFormatException	TokenNameIdentifier	 UTF Data Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//$NON-NLS-1$ 	TokenNameCOMMENT_LINE	$NON-NLS-1$ 
}	TokenNameRBRACE	
byte	TokenNamebyte	
utfBytes	TokenNameIdentifier	 utf Bytes
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
utfCount	TokenNameIdentifier	 utf Count
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
utfIndex	TokenNameIdentifier	 utf Index
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charValue	TokenNameIdentifier	 char Value
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charValue	TokenNameIdentifier	 char Value
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charValue	TokenNameIdentifier	 char Value
<=	TokenNameLESS_EQUAL	
127	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utfBytes	TokenNameIdentifier	 utf Bytes
[	TokenNameLBRACKET	
utfIndex	TokenNameIdentifier	 utf Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
charValue	TokenNameIdentifier	 char Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
charValue	TokenNameIdentifier	 char Value
<=	TokenNameLESS_EQUAL	
2047	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utfBytes	TokenNameIdentifier	 utf Bytes
[	TokenNameLBRACKET	
utfIndex	TokenNameIdentifier	 utf Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xc0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
0x1f	TokenNameIntegerLiteral	
&	TokenNameAND	
(	TokenNameLPAREN	
charValue	TokenNameIdentifier	 char Value
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
utfBytes	TokenNameIdentifier	 utf Bytes
[	TokenNameLBRACKET	
utfIndex	TokenNameIdentifier	 utf Index
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
0x3f	TokenNameIntegerLiteral	
&	TokenNameAND	
charValue	TokenNameIdentifier	 char Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
utfBytes	TokenNameIdentifier	 utf Bytes
[	TokenNameLBRACKET	
utfIndex	TokenNameIdentifier	 utf Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xe0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
0x0f	TokenNameIntegerLiteral	
&	TokenNameAND	
(	TokenNameLPAREN	
charValue	TokenNameIdentifier	 char Value
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
utfBytes	TokenNameIdentifier	 utf Bytes
[	TokenNameLBRACKET	
utfIndex	TokenNameIdentifier	 utf Index
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
0x3f	TokenNameIntegerLiteral	
&	TokenNameAND	
(	TokenNameLPAREN	
charValue	TokenNameIdentifier	 char Value
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
utfBytes	TokenNameIdentifier	 utf Bytes
[	TokenNameLBRACKET	
utfIndex	TokenNameIdentifier	 utf Index
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
0x3f	TokenNameIntegerLiteral	
&	TokenNameAND	
charValue	TokenNameIdentifier	 char Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
utfBytes	TokenNameIdentifier	 utf Bytes
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
utfCount	TokenNameIdentifier	 utf Count
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
utfBytes	TokenNameIdentifier	 utf Bytes
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
utfCount	TokenNameIdentifier	 utf Count
;	TokenNameSEMICOLON	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
utfBytes	TokenNameIdentifier	 utf Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
