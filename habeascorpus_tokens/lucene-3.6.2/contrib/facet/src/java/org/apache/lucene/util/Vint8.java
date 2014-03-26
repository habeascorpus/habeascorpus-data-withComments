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
EOFException	TokenNameIdentifier	 EOF Exception
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Variable-length encoding of 32-bit integers, into 8-bit bytes. A number is encoded as follows: * <ul> * <li>If it is less than 127 and non-negative (i.e., if the number uses only 7 bits), it is encoded as * as single byte: 0bbbbbbb. * <li>If its highest nonzero bit is greater than bit 6 (0x40), it is represented as a series of * bytes, each byte's * 7 LSB containing bits from the original value, with the MSB set for all but the last * byte. The first encoded byte contains the highest nonzero bits from the * original; the second byte contains the next 7 MSB; and so on, with the last byte * containing the 7 LSB of the original. * </ul> * Examples: * <ol> * <li>n = 117 = 1110101: This has fewer than 8 significant bits, and so is encoded as * 01110101 = 0x75. * <li>n = 100000 = (binary) 11000011010100000. This has 17 significant bits, and so needs * three Vint8 bytes. Left-zero-pad it to a multiple of 7 bits, then split it into chunks of 7 * and add an MSB, 0 for the last byte, 1 for the others: 1|0000110 1|0001101 0|0100000 * = 0x86 0x8D 0x20. * </ol> * This encoder/decoder will correctly handle any 32-bit integer, but for negative numbers, * and positive numbers with more than 28 significant bits, encoding requires 5 bytes; this * is not an efficient encoding scheme for large * positive numbers or any negative number. * <p> * <b>Compatibility:</b><br> * This class has been used in products that have shipped to customers, and is needed to * decode legacy data. Do not modify this class in ways that will break compatibility. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Variable-length encoding of 32-bit integers, into 8-bit bytes. A number is encoded as follows: <ul> <li>If it is less than 127 and non-negative (i.e., if the number uses only 7 bits), it is encoded as as single byte: 0bbbbbbb. <li>If its highest nonzero bit is greater than bit 6 (0x40), it is represented as a series of bytes, each byte's 7 LSB containing bits from the original value, with the MSB set for all but the last byte. The first encoded byte contains the highest nonzero bits from the original; the second byte contains the next 7 MSB; and so on, with the last byte containing the 7 LSB of the original. </ul> Examples: <ol> <li>n = 117 = 1110101: This has fewer than 8 significant bits, and so is encoded as 01110101 = 0x75. <li>n = 100000 = (binary) 11000011010100000. This has 17 significant bits, and so needs three Vint8 bytes. Left-zero-pad it to a multiple of 7 bits, then split it into chunks of 7 and add an MSB, 0 for the last byte, 1 for the others: 1|0000110 1|0001101 0|0100000 = 0x86 0x8D 0x20. </ol> This encoder/decoder will correctly handle any 32-bit integer, but for negative numbers, and positive numbers with more than 28 significant bits, encoding requires 5 bytes; this is not an efficient encoding scheme for large positive numbers or any negative number. <p> <b>Compatibility:</b><br> This class has been used in products that have shipped to customers, and is needed to decode legacy data. Do not modify this class in ways that will break compatibility. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
Vint8	TokenNameIdentifier	 Vint8
{	TokenNameLBRACE	
/** * Because Java lacks call-by-reference, this class boxes the decoding position, which * is initially set by the caller, and returned after decoding, incremented by the number * of bytes processed. */	TokenNameCOMMENT_JAVADOC	 Because Java lacks call-by-reference, this class boxes the decoding position, which is initially set by the caller, and returned after decoding, incremented by the number of bytes processed. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Position	TokenNameIdentifier	 Position
{	TokenNameLBRACE	
/** * Creates a position value set to zero. */	TokenNameCOMMENT_JAVADOC	 Creates a position value set to zero. 
public	TokenNamepublic	
Position	TokenNameIdentifier	 Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The initial position is zero by default. 	TokenNameCOMMENT_LINE	The initial position is zero by default. 
}	TokenNameRBRACE	
/** * Creates a position set to {@code initialPosition}. * @param initialPosition The starting decoding position in the source buffer. */	TokenNameCOMMENT_JAVADOC	 Creates a position set to {@code initialPosition}. @param initialPosition The starting decoding position in the source buffer. 
public	TokenNamepublic	
Position	TokenNameIdentifier	 Position
(	TokenNameLPAREN	
int	TokenNameint	
initialPosition	TokenNameIdentifier	 initial Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
initialPosition	TokenNameIdentifier	 initial Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value passed by reference. */	TokenNameCOMMENT_JAVADOC	 The value passed by reference. 
public	TokenNamepublic	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of bytes needed to encode {@code number}. * @param number The number whose encoded length is needed. * @return The number of bytes needed to encode {@code number}. */	TokenNameCOMMENT_JAVADOC	 Returns the number of bytes needed to encode {@code number}. @param number The number whose encoded length is needed. @return The number of bytes needed to encode {@code number}. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
bytesNeeded	TokenNameIdentifier	 bytes Needed
(	TokenNameLPAREN	
int	TokenNameint	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x3FFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x1FFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0xFFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The maximum number of bytes needed to encode a number using {@code Vint8}. */	TokenNameCOMMENT_JAVADOC	 The maximum number of bytes needed to encode a number using {@code Vint8}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAXIMUM_BYTES_NEEDED	TokenNameIdentifier	 MAXIMUM  BYTES  NEEDED
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Encodes {@code number} to {@code out}. * @param number The value to be written in encoded form, to {@code out}. * @param out The output stream receiving the encoded bytes. * @exception IOException If there is a problem writing to {@code out}. */	TokenNameCOMMENT_JAVADOC	 Encodes {@code number} to {@code out}. @param number The value to be written in encoded form, to {@code out}. @param out The output stream receiving the encoded bytes. @exception IOException If there is a problem writing to {@code out}. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
int	TokenNameint	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x3FFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x7F	TokenNameIntegerLiteral	
&	TokenNameAND	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x1FFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
>>	TokenNameRIGHT_SHIFT	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x7F	TokenNameIntegerLiteral	
&	TokenNameAND	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0xFFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
>>	TokenNameRIGHT_SHIFT	
21	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
>>	TokenNameRIGHT_SHIFT	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x7F	TokenNameIntegerLiteral	
&	TokenNameAND	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
>>	TokenNameRIGHT_SHIFT	
28	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
>>	TokenNameRIGHT_SHIFT	
21	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
>>	TokenNameRIGHT_SHIFT	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0x7F	TokenNameIntegerLiteral	
&	TokenNameAND	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Encodes {@code number} into {@code dest}, starting at offset {@code start} from * the beginning of the array. This method assumes {@code dest} is large enough to * hold the required number of bytes. * @param number The number to be encoded. * @param dest The destination array. * @param start The starting offset in the array. * @return The number of bytes used in the array. */	TokenNameCOMMENT_JAVADOC	 Encodes {@code number} into {@code dest}, starting at offset {@code start} from the beginning of the array. This method assumes {@code dest} is large enough to hold the required number of bytes. @param number The number to be encoded. @param dest The destination array. @param start The starting offset in the array. @return The number of bytes used in the array. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
int	TokenNameint	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x3FFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
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
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x3F80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x1FFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
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
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x1FC000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x3F80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
~	TokenNameTWIDDLE	
0xFFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
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
number	TokenNameIdentifier	 number
&	TokenNameAND	
0xFE00000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
21	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x1FC000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
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
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x3F80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
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
number	TokenNameIdentifier	 number
&	TokenNameAND	
0xF0000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
28	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
number	TokenNameIdentifier	 number
&	TokenNameAND	
0xFE00000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
21	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
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
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x1FC000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
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
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x3F80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Decodes a 32-bit integer from {@code bytes}, beginning at offset {@code pos.pos}. * The decoded value is returned, and {@code pos.pos} is incremented by the number of * bytes processed. * @param bytes The byte array containing an encoded value. * @param pos On entry, the starting position in the array; on return, one greater * than the position of the last byte decoded in the call. * @return The decoded value. */	TokenNameCOMMENT_JAVADOC	 Decodes a 32-bit integer from {@code bytes}, beginning at offset {@code pos.pos}. The decoded value is returned, and {@code pos.pos} is incremented by the number of bytes processed. @param bytes The byte array containing an encoded value. @param pos On entry, the starting position in the array; on return, one greater than the position of the last byte decoded in the call. @return The decoded value. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
Position	TokenNameIdentifier	 Position
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
|=	TokenNameOR_EQUAL	
first	TokenNameIdentifier	 first
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
&	TokenNameAND	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value	TokenNameIdentifier	 value
<<=	TokenNameLEFT_SHIFT_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Decodes a 32-bit integer from bytes read from {@code in}. Bytes are read, * one at a time, from {@code in}, and it is assumed they represent a 32-bit * integer encoded using this class's encoding scheme. The decoded value is * returned. * @param in The input stream containing the encoded bytes. * @return The decoded value. * @exception EOFException If the stream ends before a value has been decoded. */	TokenNameCOMMENT_JAVADOC	 Decodes a 32-bit integer from bytes read from {@code in}. Bytes are read, one at a time, from {@code in}, and it is assumed they represent a 32-bit integer encoded using this class's encoding scheme. The decoded value is returned. @param in The input stream containing the encoded bytes. @return The decoded value. @exception EOFException If the stream ends before a value has been decoded. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
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
value	TokenNameIdentifier	 value
|=	TokenNameOR_EQUAL	
first	TokenNameIdentifier	 first
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
&	TokenNameAND	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value	TokenNameIdentifier	 value
<<=	TokenNameLEFT_SHIFT_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The default ctor is made private because all methods of this class are static. */	TokenNameCOMMENT_JAVADOC	 The default ctor is made private because all methods of this class are static. 
private	TokenNameprivate	
Vint8	TokenNameIdentifier	 Vint8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Just making it impossible to instantiate. 	TokenNameCOMMENT_LINE	Just making it impossible to instantiate. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
