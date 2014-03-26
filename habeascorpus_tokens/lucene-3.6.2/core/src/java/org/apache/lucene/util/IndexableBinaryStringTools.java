package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
CharBuffer	TokenNameIdentifier	 Char Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
/** * Provides support for converting byte sequences to Strings and back again. * The resulting Strings preserve the original byte sequences' sort order. * <p/> * The Strings are constructed using a Base 8000h encoding of the original * binary data - each char of an encoded String represents a 15-bit chunk * from the byte sequence. Base 8000h was chosen because it allows for all * lower 15 bits of char to be used without restriction; the surrogate range * [U+D8000-U+DFFF] does not represent valid chars, and would require * complicated handling to avoid them and allow use of char's high bit. * <p/> * Although unset bits are used as padding in the final char, the original * byte sequence could contain trailing bytes with no set bits (null bytes): * padding is indistinguishable from valid information. To overcome this * problem, a char is appended, indicating the number of encoded bytes in the * final content char. * <p/> * Some methods in this class are defined over CharBuffers and ByteBuffers, but * these are deprecated in favor of methods that operate directly on byte[] and * char[] arrays. Note that this class calls array() and arrayOffset() * on the CharBuffers and ByteBuffers it uses, so only wrapped arrays may be * used. This class interprets the arrayOffset() and limit() values returned * by its input buffers as beginning and end+1 positions on the wrapped array, * respectively; similarly, on the output buffer, arrayOffset() is the first * position written to, and limit() is set to one past the final output array * position. * <p/> * WARNING: This means that the deprecated Buffer-based methods * only work correctly with buffers that have an offset of 0. For example, they * will not correctly interpret buffers returned by {@link ByteBuffer#slice}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Provides support for converting byte sequences to Strings and back again. The resulting Strings preserve the original byte sequences' sort order. <p/> The Strings are constructed using a Base 8000h encoding of the original binary data - each char of an encoded String represents a 15-bit chunk from the byte sequence. Base 8000h was chosen because it allows for all lower 15 bits of char to be used without restriction; the surrogate range [U+D8000-U+DFFF] does not represent valid chars, and would require complicated handling to avoid them and allow use of char's high bit. <p/> Although unset bits are used as padding in the final char, the original byte sequence could contain trailing bytes with no set bits (null bytes): padding is indistinguishable from valid information. To overcome this problem, a char is appended, indicating the number of encoded bytes in the final content char. <p/> Some methods in this class are defined over CharBuffers and ByteBuffers, but these are deprecated in favor of methods that operate directly on byte[] and char[] arrays. Note that this class calls array() and arrayOffset() on the CharBuffers and ByteBuffers it uses, so only wrapped arrays may be used. This class interprets the arrayOffset() and limit() values returned by its input buffers as beginning and end+1 positions on the wrapped array, respectively; similarly, on the output buffer, arrayOffset() is the first position written to, and limit() is set to one past the final output array position. <p/> WARNING: This means that the deprecated Buffer-based methods only work correctly with buffers that have an offset of 0. For example, they will not correctly interpret buffers returned by {@link ByteBuffer#slice}. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CodingCase	TokenNameIdentifier	 Coding Case
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
CODING_CASES	TokenNameIdentifier	 CODING  CASES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// CodingCase(int initialShift, int finalShift) 	TokenNameCOMMENT_LINE	CodingCase(int initialShift, int finalShift) 
new	TokenNamenew	
CodingCase	TokenNameIdentifier	 Coding Case
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// CodingCase(int initialShift, int middleShift, int finalShift) 	TokenNameCOMMENT_LINE	CodingCase(int initialShift, int middleShift, int finalShift) 
new	TokenNamenew	
CodingCase	TokenNameIdentifier	 Coding Case
(	TokenNameLPAREN	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CodingCase	TokenNameIdentifier	 Coding Case
(	TokenNameLPAREN	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CodingCase	TokenNameIdentifier	 Coding Case
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CodingCase	TokenNameIdentifier	 Coding Case
(	TokenNameLPAREN	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CodingCase	TokenNameIdentifier	 Coding Case
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CodingCase	TokenNameIdentifier	 Coding Case
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CodingCase	TokenNameIdentifier	 Coding Case
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Export only static methods 	TokenNameCOMMENT_LINE	Export only static methods 
private	TokenNameprivate	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the number of chars required to encode the given byte sequence. * * @param original The byte sequence to be encoded. Must be backed by an * array. * @return The number of chars required to encode the given byte sequence * @throws IllegalArgumentException If the given ByteBuffer is not backed by * an array * @deprecated Use {@link #getEncodedLength(byte[], int, int)} instead. This * method will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Returns the number of chars required to encode the given byte sequence. * @param original The byte sequence to be encoded. Must be backed by an array. @return The number of chars required to encode the given byte sequence @throws IllegalArgumentException If the given ByteBuffer is not backed by an array @deprecated Use {@link #getEncodedLength(byte[], int, int)} instead. This method will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"original argument must have a backing array"	TokenNameStringLiteral	original argument must have a backing array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the number of chars required to encode the given bytes. * * @param inputArray byte sequence to be encoded * @param inputOffset initial offset into inputArray * @param inputLength number of bytes in inputArray * @return The number of chars required to encode the number of bytes. */	TokenNameCOMMENT_JAVADOC	 Returns the number of chars required to encode the given bytes. * @param inputArray byte sequence to be encoded @param inputOffset initial offset into inputArray @param inputLength number of bytes in inputArray @return The number of chars required to encode the number of bytes. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inputArray	TokenNameIdentifier	 input Array
,	TokenNameCOMMA	
int	TokenNameint	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
int	TokenNameint	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use long for intermediaries to protect against overflow 	TokenNameCOMMENT_LINE	Use long for intermediaries to protect against overflow 
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
8L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
inputLength	TokenNameIdentifier	 input Length
+	TokenNamePLUS	
14L	TokenNameLongLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
15L	TokenNameLongLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of bytes required to decode the given char sequence. * * @param encoded The char sequence to be decoded. Must be backed by an array. * @return The number of bytes required to decode the given char sequence * @throws IllegalArgumentException If the given CharBuffer is not backed by * an array * @deprecated Use {@link #getDecodedLength(char[], int, int)} instead. This * method will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Returns the number of bytes required to decode the given char sequence. * @param encoded The char sequence to be decoded. Must be backed by an array. @return The number of bytes required to decode the given char sequence @throws IllegalArgumentException If the given CharBuffer is not backed by an array @deprecated Use {@link #getDecodedLength(char[], int, int)} instead. This method will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getDecodedLength	TokenNameIdentifier	 get Decoded Length
(	TokenNameLPAREN	
CharBuffer	TokenNameIdentifier	 Char Buffer
encoded	TokenNameIdentifier	 encoded
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDecodedLength	TokenNameIdentifier	 get Decoded Length
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
encoded	TokenNameIdentifier	 encoded
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"encoded argument must have a backing array"	TokenNameStringLiteral	encoded argument must have a backing array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the number of bytes required to decode the given char sequence. * * @param encoded char sequence to be decoded * @param offset initial offset * @param length number of characters * @return The number of bytes required to decode the given char sequence */	TokenNameCOMMENT_JAVADOC	 Returns the number of bytes required to decode the given char sequence. * @param encoded char sequence to be decoded @param offset initial offset @param length number of characters @return The number of bytes required to decode the given char sequence 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getDecodedLength	TokenNameIdentifier	 get Decoded Length
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
numChars	TokenNameIdentifier	 num Chars
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numChars	TokenNameIdentifier	 num Chars
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Use long for intermediaries to protect against overflow 	TokenNameCOMMENT_LINE	Use long for intermediaries to protect against overflow 
final	TokenNamefinal	
long	TokenNamelong	
numFullBytesInFinalChar	TokenNameIdentifier	 num Full Bytes In Final Char
=	TokenNameEQUAL	
encoded	TokenNameIdentifier	 encoded
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
numEncodedChars	TokenNameIdentifier	 num Encoded Chars
=	TokenNameEQUAL	
numChars	TokenNameIdentifier	 num Chars
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
numEncodedChars	TokenNameIdentifier	 num Encoded Chars
*	TokenNameMULTIPLY	
15L	TokenNameLongLiteral	
+	TokenNamePLUS	
7L	TokenNameLongLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
8L	TokenNameLongLiteral	
+	TokenNamePLUS	
numFullBytesInFinalChar	TokenNameIdentifier	 num Full Bytes In Final Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Encodes the input byte sequence into the output char sequence. Before * calling this method, ensure that the output CharBuffer has sufficient * capacity by calling {@link #getEncodedLength(java.nio.ByteBuffer)}. * * @param input The byte sequence to encode * @param output Where the char sequence encoding result will go. The limit is * set to one past the position of the final char. * @throws IllegalArgumentException If either the input or the output buffer * is not backed by an array * @deprecated Use {@link #encode(byte[], int, int, char[], int, int)} * instead. This method will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Encodes the input byte sequence into the output char sequence. Before calling this method, ensure that the output CharBuffer has sufficient capacity by calling {@link #getEncodedLength(java.nio.ByteBuffer)}. * @param input The byte sequence to encode @param output Where the char sequence encoding result will go. The limit is set to one past the position of the final char. @throws IllegalArgumentException If either the input or the output buffer is not backed by an array @deprecated Use {@link #encode(byte[], int, int, char[], int, int)} instead. This method will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
CharBuffer	TokenNameIdentifier	 Char Buffer
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
inputOffset	TokenNameIdentifier	 input Offset
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
inputLength	TokenNameIdentifier	 input Length
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
inputOffset	TokenNameIdentifier	 input Offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
outputOffset	TokenNameIdentifier	 output Offset
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
outputLength	TokenNameIdentifier	 output Length
=	TokenNameEQUAL	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
outputLength	TokenNameIdentifier	 output Length
+	TokenNamePLUS	
outputOffset	TokenNameIdentifier	 output Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
inputLength	TokenNameIdentifier	 input Length
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
outputOffset	TokenNameIdentifier	 output Offset
,	TokenNameCOMMA	
outputLength	TokenNameIdentifier	 output Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Arguments must have backing arrays"	TokenNameStringLiteral	Arguments must have backing arrays
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Encodes the input byte sequence into the output char sequence. Before * calling this method, ensure that the output array has sufficient * capacity by calling {@link #getEncodedLength(byte[], int, int)}. * * @param inputArray byte sequence to be encoded * @param inputOffset initial offset into inputArray * @param inputLength number of bytes in inputArray * @param outputArray char sequence to store encoded result * @param outputOffset initial offset into outputArray * @param outputLength length of output, must be getEncodedLength */	TokenNameCOMMENT_JAVADOC	 Encodes the input byte sequence into the output char sequence. Before calling this method, ensure that the output array has sufficient capacity by calling {@link #getEncodedLength(byte[], int, int)}. * @param inputArray byte sequence to be encoded @param inputOffset initial offset into inputArray @param inputLength number of bytes in inputArray @param outputArray char sequence to store encoded result @param outputOffset initial offset into outputArray @param outputLength length of output, must be getEncodedLength 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inputArray	TokenNameIdentifier	 input Array
,	TokenNameCOMMA	
int	TokenNameint	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
int	TokenNameint	
inputLength	TokenNameIdentifier	 input Length
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outputArray	TokenNameIdentifier	 output Array
,	TokenNameCOMMA	
int	TokenNameint	
outputOffset	TokenNameIdentifier	 output Offset
,	TokenNameCOMMA	
int	TokenNameint	
outputLength	TokenNameIdentifier	 output Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
(	TokenNameLPAREN	
outputLength	TokenNameIdentifier	 output Length
==	TokenNameEQUAL_EQUAL	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
inputArray	TokenNameIdentifier	 input Array
,	TokenNameCOMMA	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputLength	TokenNameIdentifier	 input Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
inputByteNum	TokenNameIdentifier	 input Byte Num
=	TokenNameEQUAL	
inputOffset	TokenNameIdentifier	 input Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
caseNum	TokenNameIdentifier	 case Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
outputCharNum	TokenNameIdentifier	 output Char Num
=	TokenNameEQUAL	
outputOffset	TokenNameIdentifier	 output Offset
;	TokenNameSEMICOLON	
CodingCase	TokenNameIdentifier	 Coding Case
codingCase	TokenNameIdentifier	 coding Case
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
inputByteNum	TokenNameIdentifier	 input Byte Num
+	TokenNamePLUS	
CODING_CASES	TokenNameIdentifier	 CODING  CASES
[	TokenNameLBRACKET	
caseNum	TokenNameIdentifier	 case Num
]	TokenNameRBRACKET	
.	TokenNameDOT	
numBytes	TokenNameIdentifier	 num Bytes
<=	TokenNameLESS_EQUAL	
inputLength	TokenNameIdentifier	 input Length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
outputCharNum	TokenNameIdentifier	 output Char Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
codingCase	TokenNameIdentifier	 coding Case
=	TokenNameEQUAL	
CODING_CASES	TokenNameIdentifier	 CODING  CASES
[	TokenNameLBRACKET	
caseNum	TokenNameIdentifier	 case Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputCharNum	TokenNameIdentifier	 output Char Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputArray	TokenNameIdentifier	 input Array
[	TokenNameLBRACKET	
inputByteNum	TokenNameIdentifier	 input Byte Num
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
initialShift	TokenNameIdentifier	 initial Shift
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputArray	TokenNameIdentifier	 input Array
[	TokenNameLBRACKET	
inputByteNum	TokenNameIdentifier	 input Byte Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalShift	TokenNameIdentifier	 final Shift
)	TokenNameRPAREN	
&	TokenNameAND	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalMask	TokenNameIdentifier	 final Mask
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0x7FFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// numBytes is 3 	TokenNameCOMMENT_LINE	numBytes is 3 
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputCharNum	TokenNameIdentifier	 output Char Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputArray	TokenNameIdentifier	 input Array
[	TokenNameLBRACKET	
inputByteNum	TokenNameIdentifier	 input Byte Num
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
initialShift	TokenNameIdentifier	 initial Shift
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputArray	TokenNameIdentifier	 input Array
[	TokenNameLBRACKET	
inputByteNum	TokenNameIdentifier	 input Byte Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
middleShift	TokenNameIdentifier	 middle Shift
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputArray	TokenNameIdentifier	 input Array
[	TokenNameLBRACKET	
inputByteNum	TokenNameIdentifier	 input Byte Num
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalShift	TokenNameIdentifier	 final Shift
)	TokenNameRPAREN	
&	TokenNameAND	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalMask	TokenNameIdentifier	 final Mask
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0x7FFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
inputByteNum	TokenNameIdentifier	 input Byte Num
+=	TokenNamePLUS_EQUAL	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
advanceBytes	TokenNameIdentifier	 advance Bytes
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
caseNum	TokenNameIdentifier	 case Num
==	TokenNameEQUAL_EQUAL	
CODING_CASES	TokenNameIdentifier	 CODING  CASES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caseNum	TokenNameIdentifier	 case Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Produce final char (if any) and trailing count chars. 	TokenNameCOMMENT_LINE	Produce final char (if any) and trailing count chars. 
codingCase	TokenNameIdentifier	 coding Case
=	TokenNameEQUAL	
CODING_CASES	TokenNameIdentifier	 CODING  CASES
[	TokenNameLBRACKET	
caseNum	TokenNameIdentifier	 case Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputByteNum	TokenNameIdentifier	 input Byte Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// codingCase.numBytes must be 3 	TokenNameCOMMENT_LINE	codingCase.numBytes must be 3 
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputCharNum	TokenNameIdentifier	 output Char Num
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputArray	TokenNameIdentifier	 input Array
[	TokenNameLBRACKET	
inputByteNum	TokenNameIdentifier	 input Byte Num
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
initialShift	TokenNameIdentifier	 initial Shift
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputArray	TokenNameIdentifier	 input Array
[	TokenNameLBRACKET	
inputByteNum	TokenNameIdentifier	 input Byte Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
middleShift	TokenNameIdentifier	 middle Shift
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0x7FFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add trailing char containing the number of full bytes in final char 	TokenNameCOMMENT_LINE	Add trailing char containing the number of full bytes in final char 
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputCharNum	TokenNameIdentifier	 output Char Num
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
inputByteNum	TokenNameIdentifier	 input Byte Num
<	TokenNameLESS	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputCharNum	TokenNameIdentifier	 output Char Num
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputArray	TokenNameIdentifier	 input Array
[	TokenNameLBRACKET	
inputByteNum	TokenNameIdentifier	 input Byte Num
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
initialShift	TokenNameIdentifier	 initial Shift
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0x7FFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add trailing char containing the number of full bytes in final char 	TokenNameCOMMENT_LINE	Add trailing char containing the number of full bytes in final char 
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputCharNum	TokenNameIdentifier	 output Char Num
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
caseNum	TokenNameIdentifier	 case Num
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// No left over bits - last char is completely filled. 	TokenNameCOMMENT_LINE	No left over bits - last char is completely filled. 
// Add trailing char containing the number of full bytes in final char 	TokenNameCOMMENT_LINE	Add trailing char containing the number of full bytes in final char 
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputCharNum	TokenNameIdentifier	 output Char Num
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Decodes the input char sequence into the output byte sequence. Before * calling this method, ensure that the output ByteBuffer has sufficient * capacity by calling {@link #getDecodedLength(java.nio.CharBuffer)}. * * @param input The char sequence to decode * @param output Where the byte sequence decoding result will go. The limit is * set to one past the position of the final char. * @throws IllegalArgumentException If either the input or the output buffer * is not backed by an array * @deprecated Use {@link #decode(char[], int, int, byte[], int, int)} * instead. This method will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Decodes the input char sequence into the output byte sequence. Before calling this method, ensure that the output ByteBuffer has sufficient capacity by calling {@link #getDecodedLength(java.nio.CharBuffer)}. * @param input The char sequence to decode @param output Where the byte sequence decoding result will go. The limit is set to one past the position of the final char. @throws IllegalArgumentException If either the input or the output buffer is not backed by an array @deprecated Use {@link #decode(char[], int, int, byte[], int, int)} instead. This method will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
CharBuffer	TokenNameIdentifier	 Char Buffer
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
inputOffset	TokenNameIdentifier	 input Offset
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
inputLength	TokenNameIdentifier	 input Length
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
inputOffset	TokenNameIdentifier	 input Offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
outputOffset	TokenNameIdentifier	 output Offset
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
outputLength	TokenNameIdentifier	 output Length
=	TokenNameEQUAL	
getDecodedLength	TokenNameIdentifier	 get Decoded Length
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
outputLength	TokenNameIdentifier	 output Length
+	TokenNamePLUS	
outputOffset	TokenNameIdentifier	 output Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
inputLength	TokenNameIdentifier	 input Length
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
outputOffset	TokenNameIdentifier	 output Offset
,	TokenNameCOMMA	
outputLength	TokenNameIdentifier	 output Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Arguments must have backing arrays"	TokenNameStringLiteral	Arguments must have backing arrays
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Decodes the input char sequence into the output byte sequence. Before * calling this method, ensure that the output array has sufficient capacity * by calling {@link #getDecodedLength(char[], int, int)}. * * @param inputArray char sequence to be decoded * @param inputOffset initial offset into inputArray * @param inputLength number of chars in inputArray * @param outputArray byte sequence to store encoded result * @param outputOffset initial offset into outputArray * @param outputLength length of output, must be * getDecodedLength(inputArray, inputOffset, inputLength) */	TokenNameCOMMENT_JAVADOC	 Decodes the input char sequence into the output byte sequence. Before calling this method, ensure that the output array has sufficient capacity by calling {@link #getDecodedLength(char[], int, int)}. * @param inputArray char sequence to be decoded @param inputOffset initial offset into inputArray @param inputLength number of chars in inputArray @param outputArray byte sequence to store encoded result @param outputOffset initial offset into outputArray @param outputLength length of output, must be getDecodedLength(inputArray, inputOffset, inputLength) 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inputArray	TokenNameIdentifier	 input Array
,	TokenNameCOMMA	
int	TokenNameint	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
int	TokenNameint	
inputLength	TokenNameIdentifier	 input Length
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outputArray	TokenNameIdentifier	 output Array
,	TokenNameCOMMA	
int	TokenNameint	
outputOffset	TokenNameIdentifier	 output Offset
,	TokenNameCOMMA	
int	TokenNameint	
outputLength	TokenNameIdentifier	 output Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
(	TokenNameLPAREN	
outputLength	TokenNameIdentifier	 output Length
==	TokenNameEQUAL_EQUAL	
getDecodedLength	TokenNameIdentifier	 get Decoded Length
(	TokenNameLPAREN	
inputArray	TokenNameIdentifier	 input Array
,	TokenNameCOMMA	
inputOffset	TokenNameIdentifier	 input Offset
,	TokenNameCOMMA	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numInputChars	TokenNameIdentifier	 num Input Chars
=	TokenNameEQUAL	
inputLength	TokenNameIdentifier	 input Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numOutputBytes	TokenNameIdentifier	 num Output Bytes
=	TokenNameEQUAL	
outputLength	TokenNameIdentifier	 output Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numOutputBytes	TokenNameIdentifier	 num Output Bytes
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
caseNum	TokenNameIdentifier	 case Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
outputByteNum	TokenNameIdentifier	 output Byte Num
=	TokenNameEQUAL	
outputOffset	TokenNameIdentifier	 output Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
inputCharNum	TokenNameIdentifier	 input Char Num
=	TokenNameEQUAL	
inputOffset	TokenNameIdentifier	 input Offset
;	TokenNameSEMICOLON	
short	TokenNameshort	
inputChar	TokenNameIdentifier	 input Char
;	TokenNameSEMICOLON	
CodingCase	TokenNameIdentifier	 Coding Case
codingCase	TokenNameIdentifier	 coding Case
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
inputCharNum	TokenNameIdentifier	 input Char Num
<	TokenNameLESS	
numInputChars	TokenNameIdentifier	 num Input Chars
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
inputCharNum	TokenNameIdentifier	 input Char Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
codingCase	TokenNameIdentifier	 coding Case
=	TokenNameEQUAL	
CODING_CASES	TokenNameIdentifier	 CODING  CASES
[	TokenNameLBRACKET	
caseNum	TokenNameIdentifier	 case Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
inputChar	TokenNameIdentifier	 input Char
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
inputArray	TokenNameIdentifier	 input Array
[	TokenNameLBRACKET	
inputCharNum	TokenNameIdentifier	 input Char Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
caseNum	TokenNameIdentifier	 case Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
inputChar	TokenNameIdentifier	 input Char
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
initialShift	TokenNameIdentifier	 initial Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
inputChar	TokenNameIdentifier	 input Char
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
initialShift	TokenNameIdentifier	 initial Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputChar	TokenNameIdentifier	 input Char
&	TokenNameAND	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalMask	TokenNameIdentifier	 final Mask
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalShift	TokenNameIdentifier	 final Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// numBytes is 3 	TokenNameCOMMENT_LINE	numBytes is 3 
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
inputChar	TokenNameIdentifier	 input Char
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
initialShift	TokenNameIdentifier	 initial Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputChar	TokenNameIdentifier	 input Char
&	TokenNameAND	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
middleMask	TokenNameIdentifier	 middle Mask
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
middleShift	TokenNameIdentifier	 middle Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputChar	TokenNameIdentifier	 input Char
&	TokenNameAND	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalMask	TokenNameIdentifier	 final Mask
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalShift	TokenNameIdentifier	 final Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outputByteNum	TokenNameIdentifier	 output Byte Num
+=	TokenNamePLUS_EQUAL	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
advanceBytes	TokenNameIdentifier	 advance Bytes
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
caseNum	TokenNameIdentifier	 case Num
==	TokenNameEQUAL_EQUAL	
CODING_CASES	TokenNameIdentifier	 CODING  CASES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caseNum	TokenNameIdentifier	 case Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Handle final char 	TokenNameCOMMENT_LINE	Handle final char 
inputChar	TokenNameIdentifier	 input Char
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
inputArray	TokenNameIdentifier	 input Array
[	TokenNameLBRACKET	
inputCharNum	TokenNameIdentifier	 input Char Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
codingCase	TokenNameIdentifier	 coding Case
=	TokenNameEQUAL	
CODING_CASES	TokenNameIdentifier	 CODING  CASES
[	TokenNameLBRACKET	
caseNum	TokenNameIdentifier	 case Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
caseNum	TokenNameIdentifier	 case Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
inputChar	TokenNameIdentifier	 input Char
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
initialShift	TokenNameIdentifier	 initial Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
bytesLeft	TokenNameIdentifier	 bytes Left
=	TokenNameEQUAL	
numOutputBytes	TokenNameIdentifier	 num Output Bytes
-	TokenNameMINUS	
outputByteNum	TokenNameIdentifier	 output Byte Num
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytesLeft	TokenNameIdentifier	 bytes Left
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputChar	TokenNameIdentifier	 input Char
&	TokenNameAND	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalMask	TokenNameIdentifier	 final Mask
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalShift	TokenNameIdentifier	 final Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// numBytes is 3 	TokenNameCOMMENT_LINE	numBytes is 3 
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputChar	TokenNameIdentifier	 input Char
&	TokenNameAND	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
middleMask	TokenNameIdentifier	 middle Mask
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
middleShift	TokenNameIdentifier	 middle Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytesLeft	TokenNameIdentifier	 bytes Left
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputArray	TokenNameIdentifier	 output Array
[	TokenNameLBRACKET	
outputByteNum	TokenNameIdentifier	 output Byte Num
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputChar	TokenNameIdentifier	 input Char
&	TokenNameAND	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalMask	TokenNameIdentifier	 final Mask
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
codingCase	TokenNameIdentifier	 coding Case
.	TokenNameDOT	
finalShift	TokenNameIdentifier	 final Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Decodes the given char sequence, which must have been encoded by * {@link #encode(java.nio.ByteBuffer)} or * {@link #encode(java.nio.ByteBuffer, java.nio.CharBuffer)}. * * @param input The char sequence to decode * @return A byte sequence containing the decoding result. The limit is set to * one past the position of the final char. * @throws IllegalArgumentException If the input buffer is not backed by an * array * @deprecated Use {@link #decode(char[], int, int, byte[], int, int)} * instead. This method will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Decodes the given char sequence, which must have been encoded by {@link #encode(java.nio.ByteBuffer)} or {@link #encode(java.nio.ByteBuffer, java.nio.CharBuffer)}. * @param input The char sequence to decode @return A byte sequence containing the decoding result. The limit is set to one past the position of the final char. @throws IllegalArgumentException If the input buffer is not backed by an array @deprecated Use {@link #decode(char[], int, int, byte[], int, int)} instead. This method will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
CharBuffer	TokenNameIdentifier	 Char Buffer
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outputArray	TokenNameIdentifier	 output Array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
getDecodedLength	TokenNameIdentifier	 get Decoded Length
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
outputArray	TokenNameIdentifier	 output Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Encodes the input byte sequence. * * @param input The byte sequence to encode * @return A char sequence containing the encoding result. The limit is set to * one past the position of the final char. * @throws IllegalArgumentException If the input buffer is not backed by an * array * @deprecated Use {@link #encode(byte[], int, int, char[], int, int)} * instead. This method will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Encodes the input byte sequence. * @param input The byte sequence to encode @return A char sequence containing the encoding result. The limit is set to one past the position of the final char. @throws IllegalArgumentException If the input buffer is not backed by an array @deprecated Use {@link #encode(byte[], int, int, char[], int, int)} instead. This method will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
CharBuffer	TokenNameIdentifier	 Char Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outputArray	TokenNameIdentifier	 output Array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CharBuffer	TokenNameIdentifier	 Char Buffer
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
outputArray	TokenNameIdentifier	 output Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
CodingCase	TokenNameIdentifier	 Coding Case
{	TokenNameLBRACE	
int	TokenNameint	
numBytes	TokenNameIdentifier	 num Bytes
,	TokenNameCOMMA	
initialShift	TokenNameIdentifier	 initial Shift
,	TokenNameCOMMA	
middleShift	TokenNameIdentifier	 middle Shift
,	TokenNameCOMMA	
finalShift	TokenNameIdentifier	 final Shift
,	TokenNameCOMMA	
advanceBytes	TokenNameIdentifier	 advance Bytes
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
middleMask	TokenNameIdentifier	 middle Mask
,	TokenNameCOMMA	
finalMask	TokenNameIdentifier	 final Mask
;	TokenNameSEMICOLON	
CodingCase	TokenNameIdentifier	 Coding Case
(	TokenNameLPAREN	
int	TokenNameint	
initialShift	TokenNameIdentifier	 initial Shift
,	TokenNameCOMMA	
int	TokenNameint	
middleShift	TokenNameIdentifier	 middle Shift
,	TokenNameCOMMA	
int	TokenNameint	
finalShift	TokenNameIdentifier	 final Shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numBytes	TokenNameIdentifier	 num Bytes
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
initialShift	TokenNameIdentifier	 initial Shift
=	TokenNameEQUAL	
initialShift	TokenNameIdentifier	 initial Shift
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
middleShift	TokenNameIdentifier	 middle Shift
=	TokenNameEQUAL	
middleShift	TokenNameIdentifier	 middle Shift
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
finalShift	TokenNameIdentifier	 final Shift
=	TokenNameEQUAL	
finalShift	TokenNameIdentifier	 final Shift
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
finalMask	TokenNameIdentifier	 final Mask
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
finalShift	TokenNameIdentifier	 final Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
middleMask	TokenNameIdentifier	 middle Mask
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
middleShift	TokenNameIdentifier	 middle Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CodingCase	TokenNameIdentifier	 Coding Case
(	TokenNameLPAREN	
int	TokenNameint	
initialShift	TokenNameIdentifier	 initial Shift
,	TokenNameCOMMA	
int	TokenNameint	
finalShift	TokenNameIdentifier	 final Shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numBytes	TokenNameIdentifier	 num Bytes
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
initialShift	TokenNameIdentifier	 initial Shift
=	TokenNameEQUAL	
initialShift	TokenNameIdentifier	 initial Shift
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
finalShift	TokenNameIdentifier	 final Shift
=	TokenNameEQUAL	
finalShift	TokenNameIdentifier	 final Shift
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
finalMask	TokenNameIdentifier	 final Mask
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
finalShift	TokenNameIdentifier	 final Shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
finalShift	TokenNameIdentifier	 final Shift
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
advanceBytes	TokenNameIdentifier	 advance Bytes
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
