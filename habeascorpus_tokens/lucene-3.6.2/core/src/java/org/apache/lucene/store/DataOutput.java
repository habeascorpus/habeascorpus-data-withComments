package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BytesRef	TokenNameIdentifier	 Bytes Ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
;	TokenNameSEMICOLON	
/** * Abstract base class for performing write operations of Lucene's low-level * data types. */	TokenNameCOMMENT_JAVADOC	 Abstract base class for performing write operations of Lucene's low-level data types. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DataOutput	TokenNameIdentifier	 Data Output
{	TokenNameLBRACE	
/** Writes a single byte. * @see IndexInput#readByte() */	TokenNameCOMMENT_JAVADOC	 Writes a single byte. @see IndexInput#readByte() 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Writes an array of bytes. * @param b the bytes to write * @param length the number of bytes to write * @see DataInput#readBytes(byte[],int,int) */	TokenNameCOMMENT_JAVADOC	 Writes an array of bytes. @param b the bytes to write @param length the number of bytes to write @see DataInput#readBytes(byte[],int,int) 
public	TokenNamepublic	
void	TokenNamevoid	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Writes an array of bytes. * @param b the bytes to write * @param offset the offset in the byte array * @param length the number of bytes to write * @see DataInput#readBytes(byte[],int,int) */	TokenNameCOMMENT_JAVADOC	 Writes an array of bytes. @param b the bytes to write @param offset the offset in the byte array @param length the number of bytes to write @see DataInput#readBytes(byte[],int,int) 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
writeBytes	TokenNameIdentifier	 write Bytes
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
;	TokenNameSEMICOLON	
/** Writes an int as four bytes. * @see DataInput#readInt() */	TokenNameCOMMENT_JAVADOC	 Writes an int as four bytes. @see DataInput#readInt() 
public	TokenNamepublic	
void	TokenNamevoid	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Writes a short as two bytes. * @see DataInput#readShort() */	TokenNameCOMMENT_JAVADOC	 Writes a short as two bytes. @see DataInput#readShort() 
public	TokenNamepublic	
void	TokenNamevoid	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
short	TokenNameshort	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Writes an int in a variable-length format. Writes between one and * five bytes. Smaller values take fewer bytes. Negative numbers are * supported, but should be avoided. * @see DataInput#readVInt() */	TokenNameCOMMENT_JAVADOC	 Writes an int in a variable-length format. Writes between one and five bytes. Smaller values take fewer bytes. Negative numbers are supported, but should be avoided. @see DataInput#readVInt() 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Writes a long as eight bytes. * @see DataInput#readLong() */	TokenNameCOMMENT_JAVADOC	 Writes a long as eight bytes. @see DataInput#readLong() 
public	TokenNamepublic	
void	TokenNamevoid	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Writes an long in a variable-length format. Writes between one and nine * bytes. Smaller values take fewer bytes. Negative numbers are not * supported. * @see DataInput#readVLong() */	TokenNameCOMMENT_JAVADOC	 Writes an long in a variable-length format. Writes between one and nine bytes. Smaller values take fewer bytes. Negative numbers are not supported. @see DataInput#readVLong() 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x7FL	TokenNameLongLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x7FL	TokenNameLongLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
0x80L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Writes a string. * @see DataInput#readString() */	TokenNameCOMMENT_JAVADOC	 Writes a string. @see DataInput#readString() 
public	TokenNamepublic	
void	TokenNamevoid	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
utf8Result	TokenNameIdentifier	 utf8 Result
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
utf8Result	TokenNameIdentifier	 utf8 Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
utf8Result	TokenNameIdentifier	 utf8 Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
utf8Result	TokenNameIdentifier	 utf8 Result
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf8Result	TokenNameIdentifier	 utf8 Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
COPY_BUFFER_SIZE	TokenNameIdentifier	 COPY  BUFFER  SIZE
=	TokenNameEQUAL	
16384	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
copyBuffer	TokenNameIdentifier	 copy Buffer
;	TokenNameSEMICOLON	
/** Copy numBytes bytes from input to ourself. */	TokenNameCOMMENT_JAVADOC	 Copy numBytes bytes from input to ourself. 
public	TokenNamepublic	
void	TokenNamevoid	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
long	TokenNamelong	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
numBytes	TokenNameIdentifier	 num Bytes
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"numBytes="	TokenNameStringLiteral	numBytes=
+	TokenNamePLUS	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
long	TokenNamelong	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
copyBuffer	TokenNameIdentifier	 copy Buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
copyBuffer	TokenNameIdentifier	 copy Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
COPY_BUFFER_SIZE	TokenNameIdentifier	 COPY  BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
>	TokenNameGREATER	
COPY_BUFFER_SIZE	TokenNameIdentifier	 COPY  BUFFER  SIZE
)	TokenNameRPAREN	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
COPY_BUFFER_SIZE	TokenNameIdentifier	 COPY  BUFFER  SIZE
;	TokenNameSEMICOLON	
else	TokenNameelse	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
copyBuffer	TokenNameIdentifier	 copy Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
copyBuffer	TokenNameIdentifier	 copy Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
-=	TokenNameMINUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Writes a sub sequence of characters from s as the old * format (modified UTF-8 encoded bytes). * @param s the source of the characters * @param start the first character in the sequence * @param length the number of characters in the sequence * @deprecated -- please pre-convert to utf8 bytes * instead or use {@link #writeString} */	TokenNameCOMMENT_JAVADOC	 Writes a sub sequence of characters from s as the old format (modified UTF-8 encoded bytes). @param s the source of the characters @param start the first character in the sequence @param length the number of characters in the sequence @deprecated -- please pre-convert to utf8 bytes instead or use {@link #writeString} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
writeChars	TokenNameIdentifier	 write Chars
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>=	TokenNameGREATER_EQUAL	
0x01	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
code	TokenNameIdentifier	 code
<=	TokenNameLESS_EQUAL	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>=	TokenNameGREATER_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<=	TokenNameLESS_EQUAL	
0x7FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xC0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xE0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Writes a sub sequence of characters from char[] as * the old format (modified UTF-8 encoded bytes). * @param s the source of the characters * @param start the first character in the sequence * @param length the number of characters in the sequence * @deprecated -- please pre-convert to utf8 bytes instead or use {@link #writeString} */	TokenNameCOMMENT_JAVADOC	 Writes a sub sequence of characters from char[] as the old format (modified UTF-8 encoded bytes). @param s the source of the characters @param start the first character in the sequence @param length the number of characters in the sequence @deprecated -- please pre-convert to utf8 bytes instead or use {@link #writeString} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
writeChars	TokenNameIdentifier	 write Chars
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>=	TokenNameGREATER_EQUAL	
0x01	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
code	TokenNameIdentifier	 code
<=	TokenNameLESS_EQUAL	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>=	TokenNameGREATER_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<=	TokenNameLESS_EQUAL	
0x7FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xC0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0xE0	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x3F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
writeStringStringMap	TokenNameIdentifier	 write String String Map
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
